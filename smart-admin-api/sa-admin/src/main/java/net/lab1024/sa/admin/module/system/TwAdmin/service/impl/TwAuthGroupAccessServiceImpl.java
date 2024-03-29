package net.lab1024.sa.admin.module.system.TwAdmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lab1024.sa.admin.module.system.TwAdmin.dao.TwAuthExtendDao;
import net.lab1024.sa.admin.module.system.TwAdmin.dao.TwAuthGroupAccessDao;
import net.lab1024.sa.admin.module.system.TwAdmin.entity.TwAuthExtend;
import net.lab1024.sa.admin.module.system.TwAdmin.entity.TwAuthGroupAccess;
import net.lab1024.sa.admin.module.system.TwAdmin.service.TwAuthExtendService;
import net.lab1024.sa.admin.module.system.TwAdmin.service.TwAuthGroupAccessService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TwAuthGroupAccess)表服务实现类
 *
 * @author makejava
 * @since 2023-12-23 18:19:21
 */
@Service("twAuthGroupAccessService")
public class TwAuthGroupAccessServiceImpl extends ServiceImpl<TwAuthGroupAccessDao, TwAuthGroupAccess> implements TwAuthGroupAccessService {
    @Resource
    private TwAuthGroupAccessDao twAuthGroupAccessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TwAuthGroupAccess queryById(String id) {
        return this.twAuthGroupAccessDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param twAuthGroupAccess 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TwAuthGroupAccess> queryByPage(TwAuthGroupAccess twAuthGroupAccess, PageRequest pageRequest) {
        long total = this.twAuthGroupAccessDao.count(twAuthGroupAccess);
        return new PageImpl<>(this.twAuthGroupAccessDao.queryAllByLimit(twAuthGroupAccess, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param twAuthGroupAccess 实例对象
     * @return 实例对象
     */
    @Override
    public TwAuthGroupAccess insert(TwAuthGroupAccess twAuthGroupAccess) {
        this.twAuthGroupAccessDao.insert(twAuthGroupAccess);
        return twAuthGroupAccess;
    }

    /**
     * 修改数据
     *
     * @param twAuthGroupAccess 实例对象
     * @return 实例对象
     */
    @Override
    public TwAuthGroupAccess update(TwAuthGroupAccess twAuthGroupAccess) {
        this.twAuthGroupAccessDao.update(twAuthGroupAccess);
        return this.queryById(twAuthGroupAccess.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.twAuthGroupAccessDao.deleteById(id) > 0;
    }
}
