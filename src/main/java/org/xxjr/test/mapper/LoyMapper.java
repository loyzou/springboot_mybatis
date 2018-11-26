package org.xxjr.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.xxjr.test.entity.Loy;

@Mapper
public interface LoyMapper {
  Loy queryName(String id);

  /***
   * 通过id查询用户信息
   * @param id
   * @return
   */
  String queryNameById(int id);
}
