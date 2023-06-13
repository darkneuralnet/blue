package p000;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.InterfaceC11197f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import p000.C43385ja0;
import p000.C47885r90;
import p000.O80;
/* renamed from: c90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38973c90 {

    /* renamed from: c */
    public final C47885r90 f60189c;

    /* renamed from: d */
    public final Executor f60190d;

    /* renamed from: g */
    public O80.C5832a<Void> f60193g;

    /* renamed from: a */
    public boolean f60187a = false;

    /* renamed from: b */
    public boolean f60188b = false;

    /* renamed from: e */
    public final Object f60191e = new Object();

    /* renamed from: f */
    public C43385ja0.C24930a f60192f = new C43385ja0.C24930a();

    /* renamed from: h */
    public final C47885r90.InterfaceC27858c f60194h = new C47885r90.InterfaceC27858c() { // from class: Z80
        @Override // p000.C47885r90.InterfaceC27858c
        /* renamed from: a */
        public final boolean mo16353a(TotalCaptureResult totalCaptureResult) {
            boolean m61890q;
            m61890q = C38973c90.this.m61890q(totalCaptureResult);
            return m61890q;
        }
    };

    public C38973c90(C47885r90 c47885r90, Executor executor) {
        this.f60189c = c47885r90;
        this.f60190d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m61893n(final O80.C5832a c5832a) throws Exception {
        this.f60190d.execute(new Runnable() { // from class: a90
            @Override // java.lang.Runnable
            public final void run() {
                C38973c90.this.m61894m(c5832a);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m61891p(final O80.C5832a c5832a) throws Exception {
        this.f60190d.execute(new Runnable() { // from class: b90
            @Override // java.lang.Runnable
            public final void run() {
                C38973c90.this.m61892o(c5832a);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ boolean m61890q(TotalCaptureResult totalCaptureResult) {
        O80.C5832a<Void> c5832a;
        Integer num;
        if (this.f60193g != null) {
            Object tag = totalCaptureResult.getRequest().getTag();
            if ((tag instanceof C51672xY5) && (num = (Integer) ((C51672xY5) tag).m5016c("Camera2CameraControl")) != null && num.equals(Integer.valueOf(this.f60193g.hashCode()))) {
                c5832a = this.f60193g;
                this.f60193g = null;
                if (c5832a == null) {
                    c5832a.m92861c(null);
                    return false;
                }
                return false;
            }
        }
        c5832a = null;
        if (c5832a == null) {
        }
    }

    /* renamed from: g */
    public ListenableFuture<Void> m61900g(C45807nf0 c45807nf0) {
        m61899h(c45807nf0);
        return IA1.m102834j(O80.m92864a(new O80.InterfaceC5834c() { // from class: Y80
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m61893n;
                m61893n = C38973c90.this.m61893n(c5832a);
                return m61893n;
            }
        }));
    }

    /* renamed from: h */
    public final void m61899h(C45807nf0 c45807nf0) {
        synchronized (this.f60191e) {
            for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : c45807nf0.mo69357g()) {
                this.f60192f.mo1343b().mo69373C(abstractC11198a, c45807nf0.mo69363a(abstractC11198a));
            }
        }
    }

    /* renamed from: i */
    public ListenableFuture<Void> m61898i() {
        m61897j();
        return IA1.m102834j(O80.m92864a(new O80.InterfaceC5834c() { // from class: X80
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m61891p;
                m61891p = C38973c90.this.m61891p(c5832a);
                return m61891p;
            }
        }));
    }

    /* renamed from: j */
    public final void m61897j() {
        synchronized (this.f60191e) {
            this.f60192f = new C43385ja0.C24930a();
        }
    }

    /* renamed from: k */
    public C43385ja0 m61896k() {
        C43385ja0 m30300a;
        synchronized (this.f60191e) {
            if (this.f60193g != null) {
                this.f60192f.mo1343b().mo69373C(C43385ja0.f92943L, Integer.valueOf(this.f60193g.hashCode()));
            }
            m30300a = this.f60192f.m30300a();
        }
        return m30300a;
    }

    /* renamed from: l */
    public C47885r90.InterfaceC27858c m61895l() {
        return this.f60194h;
    }

    /* renamed from: s */
    public void m61888s(final boolean z) {
        this.f60190d.execute(new Runnable() { // from class: W80
            @Override // java.lang.Runnable
            public final void run() {
                C38973c90.this.m61889r(z);
            }
        });
    }

    /* renamed from: t */
    public final void m61889r(boolean z) {
        if (this.f60187a == z) {
            return;
        }
        this.f60187a = z;
        if (z) {
            if (this.f60188b) {
                m61885v();
                return;
            }
            return;
        }
        O80.C5832a<Void> c5832a = this.f60193g;
        if (c5832a != null) {
            c5832a.m92858f(new CameraControl.OperationCanceledException("The camera control has became inactive."));
            this.f60193g = null;
        }
    }

    /* renamed from: u */
    public final void m61892o(O80.C5832a<Void> c5832a) {
        this.f60188b = true;
        O80.C5832a<Void> c5832a2 = this.f60193g;
        if (c5832a2 == null) {
            c5832a2 = null;
        }
        this.f60193g = c5832a;
        if (this.f60187a) {
            m61885v();
        }
        if (c5832a2 != null) {
            c5832a2.m92858f(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: v */
    public final void m61885v() {
        this.f60189c.m16385l0();
        this.f60188b = false;
    }
}
