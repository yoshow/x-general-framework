package com.x3platform.membership.mappers;

import com.x3platform.membership.IAccountOrganizationUnitRelationInfo;
import com.x3platform.membership.IOrganizationUnitInfo;

import java.util.*;

/**
 */
public interface OrganizationUnitMapper {

  // -------------------------------------------------------
  // 保存 添加 修改 删除
  // -------------------------------------------------------

  /**
   * 保存记录
   *
   * @param param IOrganizationUnitInfo 实例详细信息
   * @return IOrganizationUnitInfo 实例详细信息
   */
  IOrganizationUnitInfo save(IOrganizationUnitInfo param);

  /**
   * 添加记录
   *
   * @param param IOrganizationUnitInfo 实例的详细信息
   */
  void insert(IOrganizationUnitInfo param);

  /**
   * 修改记录
   *
   * @param param IOrganizationUnitInfo 实例的详细信息
   */
  void update(IOrganizationUnitInfo param);

  /**
   * 删除记录
   *
   * @param id 标识
   */
  void delete(String id);

  // -------------------------------------------------------
  // 查询
  // -------------------------------------------------------

  /**
   * 查询某条记录
   *
   * @param id IOrganizationUnitInfo id号
   * @return 返回一个<see cref="IOrganizationUnitInfo" />实例的详细信息
   */
  IOrganizationUnitInfo findOne(String id);

  /**
   * 查询某条记录
   *
   * @param globalName 组织的全局名称
   * @return 返回一个<see cref="IOrganizationUnitInfo"/>实例的详细信息
   */
  IOrganizationUnitInfo findOneByGlobalName(String globalName);

  /**
   * 查询角色所属的组织信息
   *
   * @param roleId 角色标识
   * @return 返回一个<see cref="IOrganizationUnitInfo" />实例的详细信息
   */
  IOrganizationUnitInfo findOneByRoleId(String roleId);

  /**
   * 查询某个角色所属的某一级次的组织信息
   *
   * @param roleId 角色标识
   * @param level  层次
   * @return 返回所有<see cref="IOrganizationUnitInfo"/>实例的详细信息
   */
  IOrganizationUnitInfo findOneByRoleId(String roleId, int level);

  /**
   * 查询某个组织所属的公司信息
   *
   * @param id 组织标识
   * @return 返回所有<see cref="IOrganizationUnitInfo"/>实例的详细信息
   */
  IOrganizationUnitInfo findCorporationByOrganizationUnitId(String id);

  /**
   * 查询某个组织的所属某个上级部门信息
   *
   * @param organizationId 组织标识
   * @param level          层次
   * @return 返回所有<see cref="IOrganizationUnitInfo"/>实例的详细信息
   */
  IOrganizationUnitInfo findDepartmentByOrganizationUnitId(String organizationId, int level);

  /**
   * 查询所有相关记录
   *
   * @param whereClause SQL 查询条件
   * @param length      条数
   * @return 返回所有 IOrganizationUnitInfo 实例的详细信息
   */
  List<IOrganizationUnitInfo> findAll(String whereClause, int length);

  /**
   * 查询某个父节点下的所有组织单位
   *
   * @param parentId 父节标识
   * @return 返回所有实例<see cref="IOrganizationUnitInfo"/>实例的详细信息
   */
  List<IOrganizationUnitInfo> findAllByParentId(String parentId);

  /**
   * 查询某条记录
   *
   * @param accountId 帐号标识
   * @return 返回一个 IOrganizationUnitInfo 实例的详细信息
   */
  List<IOrganizationUnitInfo> findAllByAccountId(String accountId);

  /**
   * 查询某个帐户所属的所有公司信息
   *
   * @param accountId 帐号标识
   * @return 返回所有<see cref="IOrganizationUnitInfo"/>实例的详细信息
   */
  List<IOrganizationUnitInfo> findCorporationsByAccountId(String accountId);

  // -------------------------------------------------------
  // 自定义功能
  // -------------------------------------------------------

  /**
   * 分页函数
   *
   * @param startIndex 开始行索引数,由0开始统计
   * @param pageSize   页面大小
   * @param query      数据查询参数
   * @param rowCount   记录行数
   * @return 返回一个列表
   */
  // List<IOrganizationUnitInfo> GetPaging(int startIndex, int pageSize, DataQuery query, tangible.RefObject<Integer> rowCount);

  /**
   * 检测是否存在相关的记录.
   *
   * @param id 帐号标识
   * @return 布尔值
   */
  boolean isExist(String id);

  /**
   * 检测是否存在相关的记录.
   *
   * @param name 名称
   * @return 布尔值
   */
  boolean isExistName(String name);

  /**
   * 检测是否存在相关的记录
   *
   * @param globalName 组织单位全局名称
   * @return 布尔值
   */
  boolean isExistGlobalName(String globalName);

  /**
   * 检测是否存在相关的记录
   *
   * @param id   组织标识
   * @param name 组织名称
   * @return 0:代表成功 1:代表已存在相同名称
   */
  int rename(String id, String name);

  /**
   * 设置全局名称
   *
   * @param id         组织标识
   * @param globalName 全局名称
   * @return 修改成功, 返回 0, 修改失败, 返回 1.
   */
  int setGlobalName(String id, String globalName);

  /**
   * 检测是否存在相关的记录
   *
   * @param id       组织标识
   * @param parentId 父级组织标识
   * @return 修改成功, 返回 0, 修改失败, 返回 1.
   */
  int setParentId(String id, String parentId);

  /**
   * 设置企业邮箱状态
   *
   * @param accountId 帐户标识
   * @param status    状态标识, 1:启用, 0:禁用
   * @return 0 设置成功, 1 设置失败.
   */
  int setEmailStatus(String accountId, int status);

  /**
   * 同步信息
   *
   * @param param 组织信息
   */
  // int SyncFromPackPage(IOrganizationUnitInfo param);

  // -------------------------------------------------------
  // 设置帐号和组织关系
  // -------------------------------------------------------

  /**
   * 根据帐号查询相关组织的关系
   *
   * @param accountId 帐号标识
   * @return Table Columns：AccountId, OrganizationUnitId, isDefault, BeginDate, EndDate
   */
  List<IAccountOrganizationUnitRelationInfo> findAllRelationByAccountId(String accountId);

  /**
   * 根据组织查询相关帐号的关系
   *
   * @param organizationId 组织标识
   * @return Table Columns：AccountId, OrganizationUnitId, isDefault, BeginDate, EndDate
   */
  List<IAccountOrganizationUnitRelationInfo> findAllRelationByRoleId(String organizationId);

  /**
   * 添加帐号与相关组织的关系
   *
   * @param accountId      帐号标识
   * @param organizationId 组织标识
   * @param isDefault      是否是默认组织
   * @param beginDate      启用时间
   * @param endDate        停用时间
   */
  int addRelation(String accountId, String organizationId, boolean isDefault, java.time.LocalDateTime beginDate, java.time.LocalDateTime endDate);

  /**
   * 续约帐号与相关组织的关系
   *
   * @param accountId      帐号标识
   * @param organizationId 组织标识
   * @param endDate        新的截止时间
   */
  int extendRelation(String accountId, String organizationId, java.time.LocalDateTime endDate);

  /**
   * 移除帐号与相关组织的关系
   *
   * @param accountId      帐号标识
   * @param organizationId 组织标识
   */
  int removeRelation(String accountId, String organizationId);

  /**
   * 移除帐号相关组织的默认关系
   *
   * @param accountId 帐号标识
   */
  int removeDefaultRelation(String accountId);

  /**
   * 移除帐号相关组织的非默认关系
   *
   * @param accountId 帐号标识
   */
  int removeNondefaultRelation(String accountId);

  /**
   * 移除帐号已过期的组织关系
   *
   * @param accountId 帐号标识
   */
  int removeExpiredRelation(String accountId);

  /**
   * 移除帐号相关组织的所有关系
   *
   * @param accountId 帐号标识
   */
  int removeAllRelation(String accountId);

  /**
   * 检测帐号是否有默认组织
   *
   * @param accountId 帐号标识
   */
  boolean hasDefaultRelation(String accountId);

  /**
   * 设置帐号的默认岗位
   *
   * @param accountId      帐号标识
   * @param organizationId 组织标识
   */
  int setDefaultRelation(String accountId, String organizationId);

  /**
   * 清理组织与帐号的关系
   *
   * @param organizationId 组织标识
   */
  int clearupRelation(String organizationId);
}
