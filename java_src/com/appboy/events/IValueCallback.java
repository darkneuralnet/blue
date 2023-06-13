package com.appboy.events;
/* loaded from: classes.dex */
public interface IValueCallback<T> {
    void onError();

    void onSuccess(T t);
}
