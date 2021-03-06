package tech.wetech.weshop.common.fallback;

import tech.wetech.weshop.common.api.Api;
import tech.wetech.weshop.common.enums.ResultCodeEnum;
import tech.wetech.weshop.common.query.PageQueryWrapper;
import tech.wetech.weshop.common.utils.Result;

import java.util.List;

public abstract class ApiFallback<T> implements Api<T> {

    @Override
    public Result<List<T>> queryAll() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<T>> queryList(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<T>> queryPageList(PageQueryWrapper<T> pageQueryWrapper) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<T> queryOne(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<T> queryById(Object id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> create(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> updateAll(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> updateNotNull(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> delete(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> deleteById(Object id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> count(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<String> sayHello(String name) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
