package com.amazonaws.services.p026s3.internal;

import com.amazonaws.http.HttpResponse;
/* renamed from: com.amazonaws.services.s3.internal.HeaderHandler */
/* loaded from: classes3.dex */
public interface HeaderHandler<T> {
    void handle(T t, HttpResponse httpResponse);
}
