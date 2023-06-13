package co.bird.android.feature.ridepass.p018v2.list;

import android.app.Activity;
import co.bird.android.feature.ridepass.p018v2.list.InterfaceC15325b;
/* renamed from: co.bird.android.feature.ridepass.v2.list.a */
/* loaded from: classes3.dex */
public final class C15322a {

    /* renamed from: co.bird.android.feature.ridepass.v2.list.a$a */
    /* loaded from: classes3.dex */
    public static final class C15323a implements InterfaceC15325b.InterfaceC15326a {
        @Override // co.bird.android.feature.ridepass.p018v2.list.InterfaceC15325b.InterfaceC15326a
        /* renamed from: a */
        public InterfaceC15325b mo57390a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, String str, int i) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(Integer.valueOf(i));
            return new C15324b(interfaceC44393lG2, activity, str, Integer.valueOf(i));
        }

        private C15323a() {
        }
    }

    /* renamed from: co.bird.android.feature.ridepass.v2.list.a$b */
    /* loaded from: classes3.dex */
    public static final class C15324b implements InterfaceC15325b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64845a;

        /* renamed from: b */
        public final String f64846b;

        /* renamed from: c */
        public final Integer f64847c;

        /* renamed from: d */
        public final C15324b f64848d;

        @Override // co.bird.android.feature.ridepass.p018v2.list.InterfaceC15325b
        /* renamed from: a */
        public void mo57391a(RidePassV2Activity ridePassV2Activity) {
            m57393b(ridePassV2Activity);
        }

        /* renamed from: b */
        public final RidePassV2Activity m57393b(RidePassV2Activity ridePassV2Activity) {
            C4650Ky.m98043b(ridePassV2Activity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64845a.mo27461w2()));
            C4650Ky.m98042c(ridePassV2Activity, (C22454gl) C51679xZ3.m5003d(this.f64845a.mo27479r()));
            C4650Ky.m98041d(ridePassV2Activity, (C36207Tq4) C51679xZ3.m5003d(this.f64845a.mo27595B1()));
            OV4.m92127c(ridePassV2Activity, m57392c());
            OV4.m92129a(ridePassV2Activity, new PV4());
            return ridePassV2Activity;
        }

        /* renamed from: c */
        public final C49282tW4 m57392c() {
            return new C49282tW4((WU4) C51679xZ3.m5003d(this.f64845a.mo27457y1()), (AM3) C51679xZ3.m5003d(this.f64845a.mo27471t()), (InterfaceC42586iD1) C51679xZ3.m5003d(this.f64845a.mo27539W2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64845a.mo27519d0()), (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f64845a.mo27500k1()), new RV4(), this.f64846b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64845a.mo27461w2()), this.f64847c.intValue());
        }

        public C15324b(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, String str, Integer num) {
            this.f64848d = this;
            this.f64845a = interfaceC44393lG2;
            this.f64846b = str;
            this.f64847c = num;
        }
    }

    private C15322a() {
    }

    /* renamed from: a */
    public static InterfaceC15325b.InterfaceC15326a m57394a() {
        return new C15323a();
    }
}
