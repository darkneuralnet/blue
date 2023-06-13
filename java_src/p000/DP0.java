package p000;

import co.bird.android.feature.ridepass.p019v4.details.RidePassV4DetailsActivity;
import co.bird.android.feature.ridepass.p019v4.list.RidePassV4Activity;
import p000.BW4;
/* renamed from: DP0 */
/* loaded from: classes3.dex */
public final class DP0 {

    /* renamed from: DP0$a */
    /* loaded from: classes3.dex */
    public static final class C1455a implements BW4.InterfaceC0630a {
        @Override // p000.BW4.InterfaceC0630a
        /* renamed from: a */
        public BW4 mo110541a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C1456b(interfaceC44393lG2);
        }

        private C1455a() {
        }
    }

    /* renamed from: DP0$b */
    /* loaded from: classes3.dex */
    public static final class C1456b implements BW4 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f5597a;

        /* renamed from: b */
        public final C1456b f5598b;

        @Override // p000.BW4
        /* renamed from: a */
        public void mo110540a(RidePassV4DetailsActivity ridePassV4DetailsActivity) {
            m110537d(ridePassV4DetailsActivity);
        }

        @Override // p000.BW4
        /* renamed from: b */
        public void mo110539b(RidePassV4Activity ridePassV4Activity) {
            m110538c(ridePassV4Activity);
        }

        /* renamed from: c */
        public final RidePassV4Activity m110538c(RidePassV4Activity ridePassV4Activity) {
            C4650Ky.m98043b(ridePassV4Activity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f5597a.mo27461w2()));
            C4650Ky.m98042c(ridePassV4Activity, (C22454gl) C51679xZ3.m5003d(this.f5597a.mo27479r()));
            C4650Ky.m98041d(ridePassV4Activity, (C36207Tq4) C51679xZ3.m5003d(this.f5597a.mo27595B1()));
            C52839zW4.m1273b(ridePassV4Activity, m110535f());
            return ridePassV4Activity;
        }

        /* renamed from: d */
        public final RidePassV4DetailsActivity m110537d(RidePassV4DetailsActivity ridePassV4DetailsActivity) {
            C4650Ky.m98043b(ridePassV4DetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f5597a.mo27461w2()));
            C4650Ky.m98042c(ridePassV4DetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f5597a.mo27479r()));
            C4650Ky.m98041d(ridePassV4DetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f5597a.mo27595B1()));
            JW4.m100311b(ridePassV4DetailsActivity, m110536e());
            return ridePassV4DetailsActivity;
        }

        /* renamed from: e */
        public final C38601bX4 m110536e() {
            return new C38601bX4((WU4) C51679xZ3.m5003d(this.f5597a.mo27457y1()), (AM3) C51679xZ3.m5003d(this.f5597a.mo27471t()), (InterfaceC42586iD1) C51679xZ3.m5003d(this.f5597a.mo27539W2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f5597a.mo27519d0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f5597a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f5597a.mo27595B1()));
        }

        /* renamed from: f */
        public final C51662xX4 m110535f() {
            return new C51662xX4((WU4) C51679xZ3.m5003d(this.f5597a.mo27457y1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f5597a.mo27461w2()));
        }

        public C1456b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f5598b = this;
            this.f5597a = interfaceC44393lG2;
        }
    }

    private DP0() {
    }

    /* renamed from: a */
    public static BW4.InterfaceC0630a m110542a() {
        return new C1455a();
    }
}
