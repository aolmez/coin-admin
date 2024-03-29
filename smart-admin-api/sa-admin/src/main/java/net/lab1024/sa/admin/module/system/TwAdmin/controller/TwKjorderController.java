package net.lab1024.sa.admin.module.system.TwAdmin.controller;;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TwKjorderService;

import javax.annotation.Resource;

/**
 * 矿机订单表(TwKjorder)表控制层
 *
 * @author makejava
 * @since 2023-12-23 18:24:16
 */
@RestController
@RequestMapping("twKjorder")
public class TwKjorderController {
    /**
     * 服务对象
     */
    @Resource
    private TwKjorderService twKjorderService;


}

