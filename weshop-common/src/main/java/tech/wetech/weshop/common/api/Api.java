package tech.wetech.weshop.common.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.wetech.weshop.common.query.PageQueryWrapper;
import tech.wetech.weshop.common.utils.Result;

import java.util.List;

public interface Api<T> {

    @GetMapping("/queryAll")
    Result<List<T>> queryAll();

    @PostMapping(value = "/queryList")
    Result<List<T>> queryList(@RequestBody T entity);

    @PostMapping(value = "/queryPageList")
    Result<List<T>> queryPageList(@RequestBody PageQueryWrapper<T> pageQueryWrapper);

    @PostMapping("/queryOne")
    Result<T> queryOne(@RequestBody T entity);

    @GetMapping("/queryById")
    Result<T> queryById(@RequestParam("id") Object id);

    @PostMapping("/create")
    Result<Integer> create(@RequestBody T entity);

    @PostMapping("/updateAll")
    Result<Integer> updateAll(@RequestBody T entity);

    @PostMapping("/updateNotNull")
    Result<Integer> updateNotNull(@RequestBody T entity);

    @PostMapping("/delete")
    Result<Integer> delete(@RequestBody T entity);

    @PostMapping("/deleteById")
    Result<Integer> deleteById(@RequestBody Object id);

    @PostMapping("/count")
    Result<Integer> count(@RequestBody T entity);

    @GetMapping("/sayHello")
    Result<String> sayHello(@RequestParam("name") String name);

}
