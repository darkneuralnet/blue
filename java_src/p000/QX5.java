package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.DX5;
/* renamed from: QX5 */
/* loaded from: classes.dex */
public final class QX5 extends DX5.AbstractC1519a {

    /* renamed from: a */
    public final List<DX5.AbstractC1519a> f30495a;

    public QX5(List<DX5.AbstractC1519a> list) {
        ArrayList arrayList = new ArrayList();
        this.f30495a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: u */
    public static DX5.AbstractC1519a m88423u(DX5.AbstractC1519a... abstractC1519aArr) {
        return new QX5(Arrays.asList(abstractC1519aArr));
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: m */
    public void mo88422m(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo88422m(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: n */
    public void mo88421n(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo88421n(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: o */
    public void mo88420o(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo88420o(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: p */
    public void mo15594p(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo15594p(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: q */
    public void mo15593q(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo15593q(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: r */
    public void mo15592r(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo15592r(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: s */
    public void mo15591s(DX5 dx5) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo15591s(dx5);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: t */
    public void mo88419t(DX5 dx5, Surface surface) {
        for (DX5.AbstractC1519a abstractC1519a : this.f30495a) {
            abstractC1519a.mo88419t(dx5, surface);
        }
    }

    /* renamed from: QX5$a */
    /* loaded from: classes.dex */
    public static class C6795a extends DX5.AbstractC1519a {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f30496a;

        public C6795a(CameraCaptureSession.StateCallback stateCallback) {
            this.f30496a = stateCallback;
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: m */
        public void mo88422m(DX5 dx5) {
            this.f30496a.onActive(dx5.mo100281f().m115538c());
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: n */
        public void mo88421n(DX5 dx5) {
            C29278uh.m9877b(this.f30496a, dx5.mo100281f().m115538c());
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: o */
        public void mo88420o(DX5 dx5) {
            this.f30496a.onClosed(dx5.mo100281f().m115538c());
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: p */
        public void mo15594p(DX5 dx5) {
            this.f30496a.onConfigureFailed(dx5.mo100281f().m115538c());
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: q */
        public void mo15593q(DX5 dx5) {
            this.f30496a.onConfigured(dx5.mo100281f().m115538c());
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: r */
        public void mo15592r(DX5 dx5) {
            this.f30496a.onReady(dx5.mo100281f().m115538c());
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: s */
        public void mo15591s(DX5 dx5) {
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: t */
        public void mo88419t(DX5 dx5, Surface surface) {
            C27327ph.m18994a(this.f30496a, dx5.mo100281f().m115538c(), surface);
        }

        public C6795a(List<CameraCaptureSession.StateCallback> list) {
            this(C36059Ta0.m83386a(list));
        }
    }
}
