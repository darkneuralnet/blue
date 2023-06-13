package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;
/* renamed from: UE1 */
/* loaded from: classes8.dex */
public class UE1 extends Handler implements JY3 {

    /* renamed from: b */
    public final C40926fQ3 f37098b;

    /* renamed from: c */
    public final int f37099c;

    /* renamed from: d */
    public final C31902Bg1 f37100d;

    /* renamed from: e */
    public boolean f37101e;

    public UE1(C31902Bg1 c31902Bg1, Looper looper, int i) {
        super(looper);
        this.f37100d = c31902Bg1;
        this.f37099c = i;
        this.f37098b = new C40926fQ3();
    }

    @Override // p000.JY3
    /* renamed from: a */
    public void mo29884a(C46885pT5 c46885pT5, Object obj) {
        C40333eQ3 m42887a = C40333eQ3.m42887a(c46885pT5, obj);
        synchronized (this) {
            this.f37098b.m41410a(m42887a);
            if (!this.f37101e) {
                this.f37101e = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C40333eQ3 m41409b = this.f37098b.m41409b();
                if (m41409b == null) {
                    synchronized (this) {
                        m41409b = this.f37098b.m41409b();
                        if (m41409b == null) {
                            return;
                        }
                    }
                }
                this.f37100d.m113704g(m41409b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f37099c);
            if (sendMessage(obtainMessage())) {
                this.f37101e = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f37101e = false;
        }
    }
}
