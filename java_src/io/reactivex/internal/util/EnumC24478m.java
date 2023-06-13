package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.util.m */
/* loaded from: classes8.dex */
public enum EnumC24478m implements Callable<Map<Object, Object>> {
    INSTANCE;

    /* renamed from: a */
    public static <K, V> Callable<Map<K, V>> m32249a() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
