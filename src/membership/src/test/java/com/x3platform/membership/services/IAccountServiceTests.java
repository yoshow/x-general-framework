package com.x3platform.membership.services;

import com.x3platform.data.DataQuery;
import com.x3platform.membership.IAccountInfo;
import com.x3platform.membership.MembershipManagement;
import com.x3platform.membership.models.AccountInfo;
import com.x3platform.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class IAccountServiceTests {

  @Test
  public void testFindOne() {
    IAccountService service = MembershipManagement.getInstance().getAccountService();

    IAccountInfo entity = service.findOne("00000000-0000-0000-0000-000000000000");

    assertNotNull("result is not null.", entity);
    assertEquals("result.name is \"匿名用户\".", "匿名用户", entity.getName());
  }

  @Test
  public void testFindAll() {
    IAccountService service = MembershipManagement.getInstance().getAccountService();

    List<IAccountInfo> list = service.findAll();

    assertNotNull("result is not null.", list);

    assertTrue("result is not null.", list.size() > 0);
  }

  /**
   * 测试 保存
   */
  @Test
  public void testSave() {
    IAccountService service = MembershipManagement.getInstance().getAccountService();

    String id = "test_" + DateUtil.getTimestamp();

    IAccountInfo param = new AccountInfo();

    param.setId(id);

    service.save(param);

    // 更新数据

    param.setName(id);

    service.save(param);

    // 删除数据
    service.delete(id);
  }
}
