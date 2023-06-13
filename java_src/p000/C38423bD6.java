package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: bD6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38423bD6 implements InterfaceC45160mZ5 {

    /* renamed from: a */
    public final C35992Ss5 f57094a;

    /* renamed from: b */
    public final Handler f57095b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f57096c = new ExecutorC12324a();

    /* renamed from: bD6$a */
    /* loaded from: classes.dex */
    public class ExecutorC12324a implements Executor {
        public ExecutorC12324a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C38423bD6.this.f57095b.post(runnable);
        }
    }

    public C38423bD6(Executor executor) {
        this.f57094a = new C35992Ss5(executor);
    }

    @Override // p000.InterfaceC45160mZ5
    /* renamed from: b */
    public Executor mo25426b() {
        return this.f57096c;
    }

    @Override // p000.InterfaceC45160mZ5
    /* renamed from: d */
    public C35992Ss5 mo25425c() {
        return this.f57094a;
    }
}
