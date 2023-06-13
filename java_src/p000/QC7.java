package p000;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
@VisibleForTesting
/* renamed from: QC7 */
/* loaded from: classes5.dex */
public final class QC7 extends Thread {

    /* renamed from: b */
    public final WeakReference<C25919m8> f30031b;

    /* renamed from: c */
    public final long f30032c;

    /* renamed from: d */
    public final CountDownLatch f30033d = new CountDownLatch(1);

    /* renamed from: e */
    public boolean f30034e = false;

    public QC7(C25919m8 c25919m8, long j) {
        this.f30031b = new WeakReference<>(c25919m8);
        this.f30032c = j;
        start();
    }

    /* renamed from: a */
    public final void m88750a() {
        C25919m8 c25919m8 = this.f30031b.get();
        if (c25919m8 != null) {
            c25919m8.m26305c();
            this.f30034e = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f30033d.await(this.f30032c, TimeUnit.MILLISECONDS)) {
                m88750a();
            }
        } catch (InterruptedException unused) {
            m88750a();
        }
    }
}
