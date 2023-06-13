package com.braintreepayments.api.exceptions;
/* loaded from: classes2.dex */
public class GoogleApiClientException extends Exception {

    /* renamed from: b */
    public EnumC16971a f68676b;

    /* renamed from: c */
    public int f68677c;

    /* renamed from: com.braintreepayments.api.exceptions.GoogleApiClientException$a */
    /* loaded from: classes2.dex */
    public enum EnumC16971a {
        NotAttachedToActivity,
        ConnectionSuspended,
        ConnectionFailed
    }

    /* renamed from: a */
    public int m53407a() {
        return this.f68677c;
    }

    /* renamed from: b */
    public EnumC16971a m53406b() {
        return this.f68676b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return m53406b().name() + ": " + m53407a();
    }
}
