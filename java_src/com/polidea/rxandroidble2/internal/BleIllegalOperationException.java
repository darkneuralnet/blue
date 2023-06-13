package com.polidea.rxandroidble2.internal;

import java.util.UUID;
/* loaded from: classes6.dex */
public class BleIllegalOperationException extends RuntimeException {

    /* renamed from: b */
    public final UUID f75016b;

    /* renamed from: c */
    public final int f75017c;

    /* renamed from: d */
    public final int f75018d;

    public BleIllegalOperationException(String str, UUID uuid, int i, int i2) {
        super(str);
        this.f75016b = uuid;
        this.f75017c = i;
        this.f75018d = i2;
    }
}
