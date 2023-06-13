package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: vY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50481vY0 implements InterfaceC41048fd5 {

    /* renamed from: a */
    public final Handler f114249a = PE1.m90563a(Looper.getMainLooper());

    @Override // p000.InterfaceC41048fd5
    /* renamed from: a */
    public void mo8500a(Runnable runnable) {
        this.f114249a.removeCallbacks(runnable);
    }

    @Override // p000.InterfaceC41048fd5
    /* renamed from: b */
    public void mo8499b(long j, Runnable runnable) {
        this.f114249a.postDelayed(runnable, j);
    }
}
