package net.lab1024.sa.admin.module.system.TwAdmin.controller;;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TwHyorderService;

import javax.annotation.Resource;

/**
 * 合约订单表(TwHyorder)表控制层
 *
 * @author makejava
 * @since 2023-12-23 18:23:17
 */
@RestController
@RequestMapping("twHyorder")
public class TwHyorderController {
    /**
     * 服务对象
     */
    @Resource
    private TwHyorderService twHyorderService;


}

