package com.project.demo.controller;

import com.project.demo.entity.KnowledgePromotion;
import com.project.demo.service.KnowledgePromotionService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 知识宣传：(KnowledgePromotion)表控制层
 *
 */
@RestController
@RequestMapping("/knowledge_promotion")
public class KnowledgePromotionController extends BaseController<KnowledgePromotion, KnowledgePromotionService> {

    /**
     * 知识宣传对象
     */
    @Autowired
    public KnowledgePromotionController(KnowledgePromotionService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
