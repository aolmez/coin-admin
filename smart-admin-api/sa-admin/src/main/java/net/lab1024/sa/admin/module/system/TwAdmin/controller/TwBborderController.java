package net.lab1024.sa.admin.module.system.TwAdmin.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TwBborderService;

import javax.annotation.Resource;

/**
 * 币币交易记录(TwBborder)表控制层
 *
 * @author makejava
 * @since 2023-12-23 18:19:54
 */
@RestController
@RequestMapping("twBborder")
public class TwBborderController {
    /**
     * 服务对象
     */
    @Resource
    private TwBborderService twBborderService;



}

