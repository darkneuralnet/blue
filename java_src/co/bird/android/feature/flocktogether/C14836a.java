package co.bird.android.feature.flocktogether;

import android.app.Activity;
import co.bird.android.feature.flocktogether.InterfaceC14839b;
/* renamed from: co.bird.android.feature.flocktogether.a */
/* loaded from: classes3.dex */
public final class C14836a {

    /* renamed from: co.bird.android.feature.flocktogether.a$a */
    /* loaded from: classes3.dex */
    public static final class C14837a implements InterfaceC14839b.InterfaceC14840a {
        @Override // co.bird.android.feature.flocktogether.InterfaceC14839b.InterfaceC14840a
        /* renamed from: a */
        public InterfaceC14839b mo58154a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            return new C14838b(interfaceC44393lG2, activity);
        }

        private C14837a() {
        }
    }

    /* renamed from: co.bird.android.feature.flocktogether.a$b */
    /* loaded from: classes3.dex */
    public static final class C14838b implements InterfaceC14839b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64013a;

        /* renamed from: b */
        public final C14838b f64014b;

        @Override // co.bird.android.feature.flocktogether.InterfaceC14839b
        /* renamed from: a */
        public void mo58155a(FlockTogetherActivity flockTogetherActivity) {
            m58156c(flockTogetherActivity);
        }

        /* renamed from: b */
        public final C31794Au1 m58157b() {
            return new C31794Au1((InterfaceC40099e13) C51679xZ3.m5003d(this.f64013a.mo27461w2()));
        }

        /* renamed from: c */
        public final FlockTogetherActivity m58156c(FlockTogetherActivity flockTogetherActivity) {
            C4650Ky.m98043b(flockTogetherActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64013a.mo27461w2()));
            C4650Ky.m98042c(flockTogetherActivity, (C22454gl) C51679xZ3.m5003d(this.f64013a.mo27479r()));
            C4650Ky.m98041d(flockTogetherActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64013a.mo27595B1()));
            C52479yu1.m2308b(flockTogetherActivity, m58157b());
            return flockTogetherActivity;
        }

        public C14838b(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            this.f64014b = this;
            this.f64013a = interfaceC44393lG2;
        }
    }

    private C14836a() {
    }

    /* renamed from: a */
    public static InterfaceC14839b.InterfaceC14840a m58158a() {
        return new C14837a();
    }
}
