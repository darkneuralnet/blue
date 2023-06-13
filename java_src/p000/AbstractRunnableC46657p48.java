package p000;

import android.os.RemoteException;
/* renamed from: p48  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC46657p48 implements Runnable {

    /* renamed from: b */
    public final long f103108b;

    /* renamed from: c */
    public final long f103109c;

    /* renamed from: d */
    public final boolean f103110d;

    /* renamed from: e */
    public final /* synthetic */ C52032y88 f103111e;

    public AbstractRunnableC46657p48(C52032y88 c52032y88, boolean z) {
        this.f103111e = c52032y88;
        this.f103108b = c52032y88.f118812b.currentTimeMillis();
        this.f103109c = c52032y88.f118812b.elapsedRealtime();
        this.f103110d = z;
    }

    /* renamed from: a */
    public abstract void mo4150a() throws RemoteException;

    /* renamed from: b */
    public void mo13996b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f103111e.f118817g;
        if (z) {
            mo13996b();
            return;
        }
        try {
            mo4150a();
        } catch (Exception e) {
            this.f103111e.m4056k(e, false, this.f103110d);
            mo13996b();
        }
    }
}
