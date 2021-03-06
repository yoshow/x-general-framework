package com.x3platform.membership.services;

import com.x3platform.AuthorizationObject;
import com.x3platform.data.DataQuery;
import com.x3platform.membership.AccountOrganizationUnitRelation;
import com.x3platform.membership.models.OrganizationUnitInfo;
import java.util.Date;
import java.util.List;

/**
 * @author ruanyu
 */
public interface OrganizationUnitService {
  // -------------------------------------------------------
  // 保存 删除
  // -------------------------------------------------------

  /**
   * 保存记录
   *
   * @param param OrganizationUnitInfo 实例详细信息
   * @return OrganizationUnitInfo 实例详细信息
   */
  int save(OrganizationUnitInfo param);

  /**
   * 删除记录
   *
   * @param id 标识
   */
  void delete(String id);

  /**
   * 根据父级查询最大的编码
   */
  OrganizationUnitInfo findMaxCode();

  // -------------------------------------------------------
  // 查询
  // -------------------------------------------------------

  /**
   * 查询某条记录
   *
   * @param id 组织单位标识
   * @return 返回一个 OrganizationUnit 实例的详细信息
   */
  OrganizationUnitInfo findOne(String id);

  /**
   * 查询某条记录
   *
   * @param globalName 组织的全局名称
   * @return 返回一个<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  OrganizationUnitInfo findOneByGlobalName(String globalName);

  /**
   * 查询某个角色所属的组织信息
   *
   * @param roleId 角色标识
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  OrganizationUnitInfo findOneByRoleId(String roleId);

  /**
   * 查询某个角色所属的某一级次的组织信息
   *
   * @param roleId 角色标识
   * @param level 层次
   * @return 返回所有<see                                                                                                                                                                                                                                                               cref                                                                                                                               =                                                                                                                               "                                                                                                                               OrganizationUnit                                                                                                                               "                                                                                                                               />实例的详细信息
   */
  OrganizationUnitInfo findOneByRoleId(String roleId, int level);

  /**
   * 查询某个组织所属的公司信息
   *
   * @param organizationId 组织标识
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  OrganizationUnitInfo findCorporationByOrganizationUnitId(String organizationId);

  /**
   * 查询某个组织的所属某个上级部门信息
   *
   * @param organizationId 组织标识
   * @param level 层次
   * @return 返回所有<see                                                                                                                                                                                                                                                               cref                                                                                                                               =                                                                                                                               "                                                                                                                               OrganizationUnit                                                                                                                               "                                                                                                                               />实例的详细信息
   */
  OrganizationUnitInfo findDepartmentByOrganizationUnitId(String organizationId, int level);

  /**
   * 查询所有相关记录
   *
   * @param query 数据查询参数
   * @return 返回所有 Application 实例的详细信息
   */
  List<OrganizationUnitInfo> findAll(DataQuery query);

  /**
   * 查询所有相关记录
   *
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                                                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findAll();

  /**
   * 查询所有相关记录
   *
   * @param whereClause SQL 查询条件
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                                                                                               />实例的详细信息
   */
  // List<OrganizationUnit> findAll(String whereClause);

  /**
   * 查询所有相关记录
   *
   * @param whereClause SQL 查询条件
   * @param length      条数
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                                                                                               />实例的详细信息
   */
  // List<OrganizationUnit> findAll(String whereClause, int length);

  /**
   * 查询某个父节点下的所有组织单位
   *
   * @param parentId 父节标识
   * @return 返回一个<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findAllByParentId(String parentId);
  ///#endregion

  ///#region 函数:FindAllByParentId(string parentId, int depth)

  /**
   * 查询某个父节点下的所有组织单位
   *
   * @param parentId 父节标识
   * @param depth 深入获取的层次，0表示只获取本层次，-1表示全部获取
   * @return 返回所有实例<see                                                                                                                                                                                                                                                               cref                                                                                                                               =                                                                                                                               "                                                                                                                               OrganizationUnit                                                                                                                               "                                                                                                                               />的详细信息
   */
  List<OrganizationUnitInfo> findAllByParentId(String parentId, int depth);

  ///#endregion

  ///#region 函数:FindAllByAccountId(string accountId)

  /**
   * 查询某个用户所在的所有组织单位
   *
   * @param accountId 帐号标识
   * @return 返回一个 OrganizationUnit 实例的详细信息
   */
  List<OrganizationUnitInfo> findAllByAccountId(String accountId);
  ///#endregion

  ///#region 函数:FindAllByRoleIds(string roleIds)

  /**
   * 查询某个角色的所属相关组织
   *
   * @param roleIds 角色标识
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findAllByRoleIds(String roleIds);
  ///#endregion

  ///#region 函数:FindAllByRoleIds(string roleIds, int level)

  /**
   * 查询某个角色的所属相关组织
   *
   * @param roleIds 角色标识
   * @param level 层次
   * @return 返回所有<see                                                                                                                                                                                                                                                               cref                                                                                                                               =                                                                                                                               "                                                                                                                               OrganizationUnit                                                                                                                               "                                                                                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findAllByRoleIds(String roleIds, int level);
  ///#endregion

  ///#region 函数:FindAllByCorporationId(string corporationId)

  /**
   * 递归查询某个公司下面所有的组织
   *
   * @param corporationId 公司标识
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findAllByCorporationId(String corporationId);
  ///#endregion

  ///#region 函数:FindAllByProjectId(string projectId)

  /**
   * 递归查询某个项目下面所有的组织
   *
   * @param projectId 项目标识
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findAllByProjectId(String projectId);

  /**
   * 查询某个帐户所属的所有公司信息
   *
   * @param accountId 帐号标识
   * @return 返回所有<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />实例的详细信息
   */
  List<OrganizationUnitInfo> findCorporationsByAccountId(String accountId);

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
   * @return 返回一个列表<see                                                                                                                               cref                                                               =                                                               "                                                               OrganizationUnit                                                               "                                                               />
   */
  // List<OrganizationUnit> getPaging(int startIndex, int pageSize, DataQuery query, tangible.RefObject<Integer> rowCount);

  /**
   * 检测是否存在相关的记录
   *
   * @param id 组织单位标识
   * @return 布尔值
   */
  boolean isExist(String id);

  /**
   * 检测是否存在相关的记录
   *
   * @param name 组织单位名称
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
   * @param id 组织标识
   * @param name 组织名称
   * @return 0:代表成功 1:代表已存在相同名称
   */
  int rename(String id, String name);

  /**
   * 组合全路径
   *
   * @param name 组织名称
   * @param parentId 父级对象标识
   */
  String combineFullPath(String name, String parentId);

  /**
   * 根据组织标识计算组织的全路径
   *
   * @param organizationId 组织标识
   */
  String getOrganizationPathByOrganizationUnitId(String organizationId);

  /**
   * 组合唯一名称
   *
   * @param globalName 组织全局名称
   * @param id 对象标识
   */
  String combineDistinguishedName(String globalName, String id);

  /**
   * 根据组织标识计算 Active Directory OU 路径
   *
   * @param organizationId 组织标识
   */
  String getLDAPOUPathByOrganizationUnitId(String organizationId);

  /**
   * 设置全局名称
   *
   * @param id 组织标识
   * @param globalName 全局名称
   * @return 修改成功, 返回 0, 修改失败, 返回 1.
   */
  int setGlobalName(String id, String globalName);

  /**
   * 检测是否存在相关的记录
   *
   * @param id 组织标识
   * @param parentId 父级组织标识
   * @return 修改成功, 返回 0, 修改失败, 返回 1.
   */
  int setParentId(String id, String parentId);

  /**
   * 设置企业邮箱状态
   *
   * @param accountId 帐户标识
   * @param status 状态标识, 1:启用, 0:禁用
   * @return 0 设置成功, 1 设置失败.
   */
  int setEmailStatus(String accountId, int status);

  /**
   * 获取组织的子成员
   *
   * @param organizationId 组织单位标识
   */
  List<AuthorizationObject> getChildNodes(String organizationId);

  /**
   * 查询当前组织下， 及 一级所有的组织机构
   */
  List<OrganizationUnitInfo> getChildOrganizationByOrganizationUnitId(String organizationUnitId);

  /**
   * 创建数据包
   *
   * @param beginDate 开始时间
   * @param endDate   结束时间
   */
  // String CreatePackage(Date beginDate, Date endDate);

  /**
   * 同步信息至 Active Directory
   *
   * @param param 组织信息
   */
  int syncToLDAP(OrganizationUnitInfo param);
  ///#endregion

  ///#region 函数:SyncFromPackPage(OrganizationUnit param)

  /**
   * 同步信息
   *
   * @param param 组织单位信息
   */
  // int SyncFromPackPage(OrganizationUnit param);

  // -------------------------------------------------------
  // 设置帐号和组织关系
  // -------------------------------------------------------

  /**
   * 根据帐号查询相关组织的关系
   *
   * @param accountId 帐号标识
   * @return Table Columns：AccountId, OrganizationUnitId, IsDefault, BeginDate, EndDate
   */
  List<AccountOrganizationUnitRelation> findAllRelationByAccountId(String accountId);

  /**
   * 根据组织查询相关帐号的关系
   *
   * @param organizationId 组织标识
   * @return Table Columns：AccountId, OrganizationUnitId, IsDefault, BeginDate, EndDate
   */
  List<AccountOrganizationUnitRelation> findAllRelationByRoleId(String organizationId);

  /**
   * 添加帐号与相关组织的关系
   *
   * @param accountId 帐号标识
   * @param organizationId 组织标识
   */
  int addRelation(String accountId, String organizationId);

  /**
   * 添加帐号与相关组织的关系
   *
   * @param accountId 帐号标识
   * @param organizationId 组织标识
   * @param isDefault 是否是默认组织
   * @param beginDate 启用时间
   * @param endDate 停用时间
   */
  int addRelation(String accountId, String organizationId, boolean isDefault, Date beginDate, Date endDate);

  /**
   * 添加帐号与相关组织的关系
   *
   * @param accountIds 帐号标识，多个以逗号隔开
   * @param organizationId 组织标识
   */
  int addRelationRange(String accountIds, String organizationId);

  /**
   * 添加帐号与相关组织的父级组织关系(递归)
   *
   * @param accountId 帐号标识
   * @param organizationId 组织标识
   */
  int addParentRelations(String accountId, String organizationId);

  /**
   * 续约帐号与相关组织的关系
   *
   * @param accountId 帐号标识
   * @param organizationId 组织标识
   * @param endDate 新的截止时间
   */
  int extendRelation(String accountId, String organizationId, Date endDate);

  /**
   * 移除帐号与相关组织的关系
   *
   * @param accountId 帐号标识
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
   * @param accountId 帐号标识
   * @param organizationUnitId 组织单元标识
   */
  int setDefaultRelation(String accountId, String organizationUnitId);

  /**
   * 清理组织与帐号的关系
   *
   * @param organizationUnitId 组织单元标识
   */
  int clearupRelation(String organizationUnitId);
}
