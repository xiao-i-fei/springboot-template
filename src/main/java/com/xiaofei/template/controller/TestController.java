package com.xiaofei.template.controller;

import com.xiaofei.template.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * User: 李飞
 * Date: 2022/4/20
 * Time: 14:21
 *
 * @author 李飞
 */
@Api(tags = "测试接口")
@RequestMapping("test")
@RestController
public class TestController {

    @ApiOperation(value = "POST测试接口", httpMethod = "POST", response = ResponseResult.class, produces = "application/json")
    @PostMapping
    public ResponseResult<String> postTest() {
        return new ResponseResult<String>().success("post测试");
    }

    @ApiOperation(value = "DELETE测试接口", httpMethod = "DELETE", response = ResponseResult.class, produces = "application/json")
    @DeleteMapping
    public ResponseResult<String> deleteTest() {
        return new ResponseResult<String>().success("delete测试");
    }

    @ApiOperation(value = "PUT测试接口", httpMethod = "PUT", response = ResponseResult.class, produces = "application/json")
    @PutMapping
    public ResponseResult<String> putTest() {
        return new ResponseResult<String>().success("put测试");
    }

    @ApiOperation(value = "GET测试接口", httpMethod = "GET", response = ResponseResult.class, produces = "application/json")
    @GetMapping
    public ResponseResult<String> getTest() {
        return new ResponseResult<String>().success("get测试");
    }
}
