package com.x3platform.digitalnumber.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.x3platform.data.*;

import com.x3platform.digitalnumber.models.DigitalNumber;
import org.springframework.stereotype.Component;

@Mapper
public interface DigitalNumberMapper {
  // -------------------------------------------------------
  // 保存 添加 修改 删除
  // -------------------------------------------------------

  /**
   * 保存记录
   *
   * @param param 实例<see cref="DigitalNumber"/>详细信息
   * @return <see cref="DigitalNumber"/> 实例详细信息
   */
  // DigitalNumber save(DigitalNumber param);

  /**
   * 添加记录
   *
   * @param param <see cref="DigitalNumber"/> 实例的详细信息
   */
  int insert(DigitalNumber param);

  /**
   * 修改记录
   *
   * @param param <see cref="DigitalNumber"/> 实例的详细信息
   */
  int update(DigitalNumber param);

  /**
   * 删除记录
   *
   * @param name 名称
   */
  int delete(String name);

  // -------------------------------------------------------
  // 查询
  // -------------------------------------------------------

  /**
   * 查询某条记录
   *
   * @param name 名称
   * @return 返回一个<see       cref   =   "   DigitalNumber   "   /> 实例的详细信息
   */
  DigitalNumber findOne(String name);

  /**
   * 查询所有相关记录
   *
   * @return 返回所有实例的详细信息
   */
  List<DigitalNumber> findAll();

  /**
   * 查询所有相关记录
   *
   * @param query 数据查询参数
   * @return 返回所有实例的详细信息
   */
  List<DigitalNumber> findAll(DataQuery query);

  List<DigitalNumber> findAll(@Param("whereClause") String whereClause, @Param("orderBy") String orderBy, @Param("length") int length);

  // -------------------------------------------------------
  // 自定义功能
  // -------------------------------------------------------

  /**
   * 分页函数
   *
   * @return 返回一个列表
   */
  // List<DigitalNumber> GetPaging(int startIndex, int pageSize, DataQuery query, tangible.RefObject<Integer> rowCount);

  /**
   * 查询是否存在相关的记录.
   *
   * @param name 名称
   * @return 布尔值
   */
  boolean isExistName(String name);

  /**
   * 根据前缀生成数字编码
   *
   * @param entityTableName 实体数据表
   * @param prefixCode      前缀编号
   * @param expression      规则表达式
   * @return 数字编码
   */
  String generateCodeByPrefixCode(String entityTableName, String prefixCode, String expression);

  /**
   * 根据前缀生成数字编码
   *
   * @param command         通用SQL命令对象
   * @param entityTableName 实体数据表
   * @param prefixCode      前缀编号
   * @param expression      规则表达式
   * @return 数字编码
   */
  // String generateCodeByPrefixCode(GenericSqlCommand command, String entityTableName, String prefixCode, String expression);

  /**
   * 根据类别标识成数字编码
   *
   * @param entityTableName         实体数据表
   * @param entityCategoryTableName 实体类别数据表
   * @param entityCategoryId        实体类别标识
   * @param expression              规则表达式
   * @return 数字编码
   */
  String generateCodeByCategoryId(String entityTableName, String entityCategoryTableName, String entityCategoryId, String expression);

  /**
   * 根据类别标识成数字编码
   *
   * @param command                 通用SQL命令对象
   * @param entityTableName         实体数据表
   * @param entityCategoryTableName 实体类别数据表
   * @param entityCategoryId        实体类别标识
   * @param expression              规则表达式
   * @return 数字编码
   */
  // String generateCodeByCategoryId(GenericSqlCommand command, String entityTableName, String entityCategoryTableName, String entityCategoryId, String expression);
}
