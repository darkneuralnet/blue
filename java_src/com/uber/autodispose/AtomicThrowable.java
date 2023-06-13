package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    /* renamed from: a */
    public boolean m45242a(Throwable th) {
        return ExceptionHelper.m45216a(this, th);
    }

    /* renamed from: b */
    public Throwable m45241b() {
        return ExceptionHelper.m45215b(this);
    }
}
