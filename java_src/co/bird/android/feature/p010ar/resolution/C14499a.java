package co.bird.android.feature.p010ar.resolution;

import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Handler;
import co.bird.android.feature.p010ar.resolution.InterfaceC14502b;
import co.bird.android.model.wire.WireBird;
/* renamed from: co.bird.android.feature.ar.resolution.a */
/* loaded from: classes3.dex */
public final class C14499a {

    /* renamed from: co.bird.android.feature.ar.resolution.a$a */
    /* loaded from: classes3.dex */
    public static final class C14500a implements InterfaceC14502b.InterfaceC14503a {
        @Override // co.bird.android.feature.p010ar.resolution.InterfaceC14502b.InterfaceC14503a
        /* renamed from: a */
        public InterfaceC14502b mo58889a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, DQ3 dq3, WireBird wireBird, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(dq3);
            C51679xZ3.m5005b(wireBird);
            C51679xZ3.m5005b(str);
            return new C14501b(interfaceC44393lG2, activity, dq3, wireBird, str);
        }

        private C14500a() {
        }
    }

    /* renamed from: co.bird.android.feature.ar.resolution.a$b */
    /* loaded from: classes3.dex */
    public static final class C14501b implements InterfaceC14502b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63225a;

        /* renamed from: b */
        public final WireBird f63226b;

        /* renamed from: c */
        public final String f63227c;

        /* renamed from: d */
        public final C14501b f63228d;

        @Override // co.bird.android.feature.p010ar.resolution.InterfaceC14502b
        /* renamed from: a */
        public void mo58890a(VpsResolveActivity vpsResolveActivity) {
            m58892b(vpsResolveActivity);
        }

        /* renamed from: b */
        public final VpsResolveActivity m58892b(VpsResolveActivity vpsResolveActivity) {
            C4650Ky.m98043b(vpsResolveActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63225a.mo27461w2()));
            C4650Ky.m98042c(vpsResolveActivity, (C22454gl) C51679xZ3.m5003d(this.f63225a.mo27479r()));
            C4650Ky.m98041d(vpsResolveActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63225a.mo27595B1()));
            C51308wv6.m6093d(vpsResolveActivity, m58891c());
            C51308wv6.m6092e(vpsResolveActivity, (SensorManager) C51679xZ3.m5003d(this.f63225a.mo27499k2()));
            C51308wv6.m6091f(vpsResolveActivity, (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f63225a.mo27500k1()));
            C51308wv6.m6096a(vpsResolveActivity, (InterfaceC6097Oh) C51679xZ3.m5003d(this.f63225a.mo27470t0()));
            C51308wv6.m6095b(vpsResolveActivity, (C22454gl) C51679xZ3.m5003d(this.f63225a.mo27479r()));
            return vpsResolveActivity;
        }

        /* renamed from: c */
        public final C36956Wv6 m58891c() {
            return new C36956Wv6((C36207Tq4) C51679xZ3.m5003d(this.f63225a.mo27595B1()), (InterfaceC12495bn) C51679xZ3.m5003d(this.f63225a.mo27516e0()), (InterfaceC28816tm) C51679xZ3.m5003d(this.f63225a.mo27599A()), (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63225a.mo27482q()), (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f63225a.mo27500k1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63225a.mo27461w2()), this.f63226b, this.f63227c, (Handler) C51679xZ3.m5003d(this.f63225a.mo27535X2()), (C22454gl) C51679xZ3.m5003d(this.f63225a.mo27479r()), (InterfaceC6097Oh) C51679xZ3.m5003d(this.f63225a.mo27470t0()));
        }

        public C14501b(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, DQ3 dq3, WireBird wireBird, String str) {
            this.f63228d = this;
            this.f63225a = interfaceC44393lG2;
            this.f63226b = wireBird;
            this.f63227c = str;
        }
    }

    private C14499a() {
    }

    /* renamed from: a */
    public static InterfaceC14502b.InterfaceC14503a m58893a() {
        return new C14500a();
    }
}
