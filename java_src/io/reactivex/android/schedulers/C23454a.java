package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.AbstractC23437E;
import io.reactivex.android.plugins.C23453a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.android.schedulers.a */
/* loaded from: classes6.dex */
public final class C23454a {

    /* renamed from: a */
    public static final AbstractC23437E f88214a = C23453a.m33089d(new CallableC23455a());

    /* renamed from: io.reactivex.android.schedulers.a$a */
    /* loaded from: classes6.dex */
    public static class CallableC23455a implements Callable<AbstractC23437E> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC23437E call() throws Exception {
            return C23456b.f88215a;
        }
    }

    /* renamed from: io.reactivex.android.schedulers.a$b */
    /* loaded from: classes6.dex */
    public static final class C23456b {

        /* renamed from: a */
        public static final AbstractC23437E f88215a = new C23457b(new Handler(Looper.getMainLooper()), false);

        private C23456b() {
        }
    }

    private C23454a() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static AbstractC23437E m33087a() {
        return C23453a.m33088e(f88214a);
    }
}
