package p000;

import co.bird.android.feature.configurabletutorial.viewer.ConfigurableTutorialViewerActivity;
import p000.InterfaceC34853Nw0;
/* renamed from: fI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40851fI0 {

    /* renamed from: fI0$a */
    /* loaded from: classes3.dex */
    public static final class C20349a implements InterfaceC34853Nw0 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f79805a;

        /* renamed from: b */
        public final C20349a f79806b;

        @Override // p000.InterfaceC34853Nw0
        /* renamed from: a */
        public void mo41611a(ConfigurableTutorialViewerActivity configurableTutorialViewerActivity) {
            m41609c(configurableTutorialViewerActivity);
        }

        /* renamed from: b */
        public final C36491Uw0 m41610b() {
            return new C36491Uw0((InterfaceC44791lw0) C51679xZ3.m5003d(this.f79805a.mo27487o2()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f79805a.mo27461w2()));
        }

        /* renamed from: c */
        public final ConfigurableTutorialViewerActivity m41609c(ConfigurableTutorialViewerActivity configurableTutorialViewerActivity) {
            C4650Ky.m98043b(configurableTutorialViewerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f79805a.mo27461w2()));
            C4650Ky.m98042c(configurableTutorialViewerActivity, (C22454gl) C51679xZ3.m5003d(this.f79805a.mo27479r()));
            C4650Ky.m98041d(configurableTutorialViewerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f79805a.mo27595B1()));
            C34385Lw0.m96118b(configurableTutorialViewerActivity, m41610b());
            return configurableTutorialViewerActivity;
        }

        public C20349a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f79806b = this;
            this.f79805a = interfaceC44393lG2;
        }
    }

    /* renamed from: fI0$b */
    /* loaded from: classes3.dex */
    public static final class C20350b implements InterfaceC34853Nw0.InterfaceC5743a {
        @Override // p000.InterfaceC34853Nw0.InterfaceC5743a
        /* renamed from: a */
        public InterfaceC34853Nw0 mo41608a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C20349a(interfaceC44393lG2);
        }

        private C20350b() {
        }
    }

    private C40851fI0() {
    }

    /* renamed from: a */
    public static InterfaceC34853Nw0.InterfaceC5743a m41612a() {
        return new C20350b();
    }
}
