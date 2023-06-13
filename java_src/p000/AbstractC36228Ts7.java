package p000;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: Ts7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36228Ts7 {

    /* renamed from: d */
    public static volatile Handler f36384d;

    /* renamed from: a */
    public final InterfaceC35527Qs8 f36385a;

    /* renamed from: b */
    public final Runnable f36386b;

    /* renamed from: c */
    public volatile long f36387c;

    public AbstractC36228Ts7(InterfaceC35527Qs8 interfaceC35527Qs8) {
        Preconditions.checkNotNull(interfaceC35527Qs8);
        this.f36385a = interfaceC35527Qs8;
        this.f36386b = new RunnableC38811bs7(this, interfaceC35527Qs8);
    }

    /* renamed from: b */
    public final void m82320b() {
        this.f36387c = 0L;
        m82317f().removeCallbacks(this.f36386b);
    }

    /* renamed from: c */
    public abstract void mo6826c();

    /* renamed from: d */
    public final void m82319d(long j) {
        m82320b();
        if (j >= 0) {
            this.f36387c = this.f36385a.mo22260A().currentTimeMillis();
            if (!m82317f().postDelayed(this.f36386b, j)) {
                this.f36385a.mo22258a().m106893o().m42707b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean m82318e() {
        return this.f36387c != 0;
    }

    /* renamed from: f */
    public final Handler m82317f() {
        Handler handler;
        if (f36384d != null) {
            return f36384d;
        }
        synchronized (AbstractC36228Ts7.class) {
            if (f36384d == null) {
                f36384d = new UO7(this.f36385a.mo22255z().getMainLooper());
            }
            handler = f36384d;
        }
        return handler;
    }
}
