package com.scdl.lock;

/**
 * Created by daixn on 2019/6/26 21:15
 */
public interface AquiredLockWorker<T> {
    T invokeAfterLockAquire() throws Exception;
}