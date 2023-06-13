package io.reactivex.internal.util;

import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.util.b */
/* loaded from: classes8.dex */
public enum EnumC24466b implements Callable<List<Object>>, InterfaceC23492o<Object, List<Object>> {
    INSTANCE;

    /* renamed from: b */
    public static <T> Callable<List<T>> m32279b() {
        return INSTANCE;
    }

    /* renamed from: c */
    public static <T, O> InterfaceC23492o<O, List<T>> m32278c() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.InterfaceC23492o
    /* renamed from: a */
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: d */
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
