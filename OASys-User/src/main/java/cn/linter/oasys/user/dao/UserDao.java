package cn.linter.oasys.user.dao;

import cn.linter.oasys.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户数据库访问层
 *
 * @author wangxiaoyang
 * @since 2020/11/01
 */
@Mapper
public interface UserDao {

    /**
     * 通过ID查询单个用户
     *
     * @param id 用户ID
     * @return 单个用户
     */
    User select(Long id);

    /**
     * 查询所有用户
     *
     * @return 用户列表
     */
    List<User> list();

    /**
     * 通过用户实体查询所有用户
     *
     * @param user 用户
     * @return 用户列表
     */
    List<User> selectAllByEntity(User user);

    /**
     * 新增用户
     *
     * @param user 用户
     * @return 用户
     */
    int insert(User user);

    /**
     * 更新用户
     *
     * @param user 用户
     * @return 用户
     */
    int update(User user);

    /**
     * 通过用户ID删除用户
     *
     * @param id 用户ID
     * @return 是否成功
     */
    int delete(Long id);

}