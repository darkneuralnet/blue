package com.bumptech.glide.load;

import java.io.IOException;
/* loaded from: classes5.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final int f69148b;

    public HttpException(int i) {
        this("Http request failed", i);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    public HttpException(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
        this.f69148b = i;
    }
}
