package net.lab1024.sa.admin.module.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.TwUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 用户信息表(TwUser)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-23 18:28:46
 */
@Mapper
public interface TwUserDao extends BaseMapper<TwUser> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TwUser queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param twUser 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TwUser> queryAllByLimit(TwUser twUser, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param twUser 查询条件
     * @return 总行数
     */
    long count(TwUser twUser);

    /**
     * 新增数据
     *
     * @param twUser 实例对象
     * @return 影响行数
     */
    int insert(TwUser twUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TwUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TwUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TwUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TwUser> entities);

    /**
     * 修改数据
     *
     * @param twUser 实例对象
     * @return 影响行数
     */
    int update(TwUser twUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

