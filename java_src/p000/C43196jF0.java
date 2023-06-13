package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
/* renamed from: jF0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43196jF0 implements InterfaceC52907zd6 {

    /* renamed from: a */
    public C39011cD1 f92342a;

    /* renamed from: b */
    public HashMap<MX3, InterfaceC42010hF0> f92343b;

    /* renamed from: c */
    public InterfaceC45810nf3 f92344c;

    /* renamed from: d */
    public RG6 f92345d;

    /* renamed from: e */
    public HandlerC24750a f92346e;

    /* renamed from: jF0$a */
    /* loaded from: classes6.dex */
    public class HandlerC24750a extends Handler {
        public HandlerC24750a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 2) {
                MX3 m61683e = C43196jF0.this.f92342a.m61683e(((C43789kF0) message.obj).m29144h());
                BZ0 bz0 = new BZ0(m61683e, C43196jF0.this);
                C43196jF0.this.f92343b.put(m61683e, bz0);
                if (C43196jF0.this.f92344c != null) {
                    C43196jF0.this.f92344c.mo23343a(bz0);
                }
            }
        }
    }

    public C43196jF0(C39011cD1 c39011cD1) {
        RG6 rg6 = new RG6("HandlerThread");
        this.f92345d = rg6;
        rg6.start();
        this.f92345d.m86997d(this);
        this.f92346e = new HandlerC24750a(Looper.getMainLooper());
        this.f92342a = c39011cD1;
        this.f92343b = new HashMap<>();
    }

    @Override // p000.InterfaceC52907zd6
    /* renamed from: a */
    public void mo954a(Message message) {
        HandlerC24750a handlerC24750a = this.f92346e;
        if (handlerC24750a != null) {
            handlerC24750a.sendMessage(message);
        }
    }

    /* renamed from: e */
    public final void m30947e(C43789kF0 c43789kF0) {
        if (!c43789kF0.m29145g().isEmpty() && c43789kF0.m29145g().size() > 1) {
            this.f92345d.m87000a(Message.obtain(null, 1, new C52217yT2(c43789kF0, this.f92342a.m61677k())));
            return;
        }
        throw new IllegalArgumentException("Requires at least two LatLng points");
    }

    /* renamed from: f */
    public void m30946f(C43789kF0 c43789kF0) {
        m30947e(c43789kF0);
    }

    /* renamed from: g */
    public final void m30945g(MX3 mx3) {
        this.f92343b.remove(mx3);
    }

    /* renamed from: h */
    public void m30944h(InterfaceC45810nf3 interfaceC45810nf3) {
        this.f92344c = interfaceC45810nf3;
    }

    /* renamed from: i */
    public void m30943i() {
        HandlerC24750a handlerC24750a = this.f92346e;
        if (handlerC24750a != null) {
            handlerC24750a.removeMessages(2, null);
            this.f92346e = null;
        }
        HashMap<MX3, InterfaceC42010hF0> hashMap = this.f92343b;
        if (hashMap != null) {
            hashMap.clear();
            this.f92343b = null;
        }
        if (this.f92344c != null) {
            this.f92344c = null;
        }
        C39011cD1 c39011cD1 = this.f92342a;
        if (c39011cD1 != null) {
            c39011cD1.m61689E(null);
            this.f92342a = null;
        }
        RG6 rg6 = this.f92345d;
        if (rg6 != null) {
            rg6.quit();
            this.f92345d.m86997d(null);
            this.f92345d = null;
        }
    }
}
