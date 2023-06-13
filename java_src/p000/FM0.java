package p000;

import android.content.Context;
import android.view.View;
import co.bird.android.feature.notificationcenter.NotificationCenterActivity;
import co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity;
import p000.InterfaceC46946pa3;
import p000.InterfaceC52874za3;
/* renamed from: FM0 */
/* loaded from: classes3.dex */
public final class FM0 {

    /* renamed from: FM0$a */
    /* loaded from: classes3.dex */
    public static final class C2226a implements InterfaceC46946pa3.InterfaceC27318a {
        @Override // p000.InterfaceC46946pa3.InterfaceC27318a
        /* renamed from: a */
        public InterfaceC46946pa3 mo19098a(InterfaceC44393lG2 interfaceC44393lG2, C38657bd3 c38657bd3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c38657bd3);
            return new C2227b(c38657bd3, interfaceC44393lG2);
        }

        private C2226a() {
        }
    }

    /* renamed from: FM0$b */
    /* loaded from: classes3.dex */
    public static final class C2227b implements InterfaceC46946pa3 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f9229a;

        /* renamed from: b */
        public final C2227b f9230b;

        /* renamed from: c */
        public Y94<C31616Aa3> f9231c;

        @Override // p000.InterfaceC46946pa3
        /* renamed from: a */
        public void mo19102a(NotificationCenterActivity notificationCenterActivity) {
            m107297h(notificationCenterActivity);
        }

        @Override // p000.InterfaceC46946pa3
        /* renamed from: b */
        public C31616Aa3 mo19101b() {
            return this.f9231c.get();
        }

        @Override // p000.InterfaceC46946pa3
        /* renamed from: c */
        public void mo19100c(NotificationDetailsActivity notificationDetailsActivity) {
            m107296i(notificationDetailsActivity);
        }

        @Override // p000.InterfaceC46946pa3
        /* renamed from: d */
        public InterfaceC52874za3.InterfaceC31046a mo19099d() {
            return new C2228c(this.f9230b);
        }

        /* renamed from: g */
        public final void m107298g(C38657bd3 c38657bd3, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f9231c = V51.m80429b(C39250cd3.m61160a(c38657bd3));
        }

        /* renamed from: h */
        public final NotificationCenterActivity m107297h(NotificationCenterActivity notificationCenterActivity) {
            C4650Ky.m98043b(notificationCenterActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f9229a.mo27461w2()));
            C4650Ky.m98042c(notificationCenterActivity, (C22454gl) C51679xZ3.m5003d(this.f9229a.mo27479r()));
            C4650Ky.m98041d(notificationCenterActivity, (C36207Tq4) C51679xZ3.m5003d(this.f9229a.mo27595B1()));
            C44574la3.m27134a(notificationCenterActivity, this.f9231c.get());
            return notificationCenterActivity;
        }

        /* renamed from: i */
        public final NotificationDetailsActivity m107296i(NotificationDetailsActivity notificationDetailsActivity) {
            C4650Ky.m98043b(notificationDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f9229a.mo27461w2()));
            C4650Ky.m98042c(notificationDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f9229a.mo27479r()));
            C4650Ky.m98041d(notificationDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f9229a.mo27595B1()));
            C32570Ec3.m108641b(notificationDetailsActivity, m107295j());
            return notificationDetailsActivity;
        }

        /* renamed from: j */
        public final C33974Kc3 m107295j() {
            return new C33974Kc3((InterfaceC32318Da3) C51679xZ3.m5003d(this.f9229a.mo27559O0()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f9229a.mo27519d0()), (NV0) C51679xZ3.m5003d(this.f9229a.mo27491m3()));
        }

        public C2227b(C38657bd3 c38657bd3, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f9230b = this;
            this.f9229a = interfaceC44393lG2;
            m107298g(c38657bd3, interfaceC44393lG2);
        }
    }

    /* renamed from: FM0$c */
    /* loaded from: classes3.dex */
    public static final class C2228c implements InterfaceC52874za3.InterfaceC31046a {

        /* renamed from: a */
        public final C2227b f9232a;

        @Override // p000.InterfaceC52874za3.InterfaceC31046a
        /* renamed from: a */
        public InterfaceC52874za3 mo1082a(View view) {
            C51679xZ3.m5005b(view);
            return new C2229d(this.f9232a, view);
        }

        public C2228c(C2227b c2227b) {
            this.f9232a = c2227b;
        }
    }

    /* renamed from: FM0$d */
    /* loaded from: classes3.dex */
    public static final class C2229d implements InterfaceC52874za3 {

        /* renamed from: a */
        public final View f9233a;

        /* renamed from: b */
        public final C2227b f9234b;

        /* renamed from: c */
        public final C2229d f9235c;

        @Override // p000.InterfaceC52874za3
        /* renamed from: a */
        public void mo1083a(C52281ya3 c52281ya3) {
            m107292d(c52281ya3);
        }

        /* renamed from: b */
        public final C32415Dl1 m107294b() {
            return new C32415Dl1(this.f9233a);
        }

        /* renamed from: c */
        public final C34989Ol1 m107293c() {
            return new C34989Ol1((Context) C51679xZ3.m5003d(this.f9234b.f9229a.mo27552R1()));
        }

        /* renamed from: d */
        public final C52281ya3 m107292d(C52281ya3 c52281ya3) {
            C31850Ba3.m113843e(c52281ya3, m107290f());
            C31850Ba3.m113847a(c52281ya3, m107291e());
            C31850Ba3.m113845c(c52281ya3, m107293c());
            C31850Ba3.m113846b(c52281ya3, m107294b());
            return c52281ya3;
        }

        /* renamed from: e */
        public final C48724sa3 m107291e() {
            return new C48724sa3((Context) C51679xZ3.m5003d(this.f9234b.f9229a.mo27552R1()));
        }

        /* renamed from: f */
        public final C38044ab3 m107290f() {
            return new C38044ab3((InterfaceC32318Da3) C51679xZ3.m5003d(this.f9234b.f9229a.mo27559O0()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f9234b.f9229a.mo27519d0()), (C36207Tq4) C51679xZ3.m5003d(this.f9234b.f9229a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f9234b.f9229a.mo27461w2()), (C31616Aa3) this.f9234b.f9231c.get());
        }

        public C2229d(C2227b c2227b, View view) {
            this.f9235c = this;
            this.f9234b = c2227b;
            this.f9233a = view;
        }
    }

    private FM0() {
    }

    /* renamed from: a */
    public static InterfaceC46946pa3.InterfaceC27318a m107301a() {
        return new C2226a();
    }
}
