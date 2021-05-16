package com.southwind.controller;


import com.southwind.entity.Boy;
import com.southwind.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 * @author admin
 * @since 2021-04-03
 */
@RestController
@RequestMapping("//boy")
public class BoyController {
    @Autowired
    private BoyService boyService;

    @GetMapping("/list")
    public List<Boy> list(){
       return this.boyService.list();
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.boyService.removeById(id);
    }
    @GetMapping("/find/{id}")
    public Boy find(@PathVariable("id") Integer id){

        return this.boyService.getById(id);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Boy boy){

        return this.boyService.updateById(boy);
    }
}

