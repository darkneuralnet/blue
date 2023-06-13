package co.bird.android.feature.repair.p015v2.overview;

import android.os.Handler;
import androidx.viewpager2.widget.ViewPager2;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p015v2.overview.RepairV2Activity;
import com.google.android.material.tabs.TabLayout;
/* renamed from: co.bird.android.feature.repair.v2.overview.a */
/* loaded from: classes3.dex */
public final class C15217a {

    /* renamed from: co.bird.android.feature.repair.v2.overview.a$a */
    /* loaded from: classes3.dex */
    public static final class C15218a implements RepairV2Activity.InterfaceC15213a.InterfaceC15214a {
        @Override // co.bird.android.feature.repair.p015v2.overview.RepairV2Activity.InterfaceC15213a.InterfaceC15214a
        /* renamed from: a */
        public RepairV2Activity.InterfaceC15213a mo57542a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, TabLayout tabLayout, ViewPager2 viewPager2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(tabLayout);
            C51679xZ3.m5005b(viewPager2);
            return new C15219b(interfaceC44393lG2, baseActivity, tabLayout, viewPager2);
        }

        private C15218a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v2.overview.a$b */
    /* loaded from: classes3.dex */
    public static final class C15219b implements RepairV2Activity.InterfaceC15213a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64640a;

        /* renamed from: b */
        public final BaseActivity f64641b;

        /* renamed from: c */
        public final TabLayout f64642c;

        /* renamed from: d */
        public final ViewPager2 f64643d;

        /* renamed from: e */
        public final C15219b f64644e;

        @Override // co.bird.android.feature.repair.p015v2.overview.RepairV2Activity.InterfaceC15213a
        /* renamed from: a */
        public void mo57541a(RepairV2Activity repairV2Activity) {
            m57540b(repairV2Activity);
        }

        /* renamed from: b */
        public final RepairV2Activity m57540b(RepairV2Activity repairV2Activity) {
            C5135Ly.m96068n(repairV2Activity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64640a.mo27461w2()));
            C5135Ly.m96066p(repairV2Activity, (C36207Tq4) C51679xZ3.m5003d(this.f64640a.mo27595B1()));
            C5135Ly.m96071k(repairV2Activity, (Handler) C51679xZ3.m5003d(this.f64640a.mo27535X2()));
            C5135Ly.m96067o(repairV2Activity, (C22454gl) C51679xZ3.m5003d(this.f64640a.mo27479r()));
            C5135Ly.m96080b(repairV2Activity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64640a.mo27519d0()));
            C5135Ly.m96075g(repairV2Activity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64640a.mo27453z2()));
            C5135Ly.m96064r(repairV2Activity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64640a.mo27459x1()));
            C5135Ly.m96081a(repairV2Activity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64640a.mo27474s()));
            C5135Ly.m96073i(repairV2Activity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64640a.mo27558P0()));
            C5135Ly.m96074h(repairV2Activity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64640a.mo27598A0()));
            C5135Ly.m96077e(repairV2Activity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64640a.mo27507i0()));
            C5135Ly.m96070l(repairV2Activity, (FO2) C51679xZ3.m5003d(this.f64640a.mo27456y2()));
            C5135Ly.m96065q(repairV2Activity, (YR4) C51679xZ3.m5003d(this.f64640a.mo27525b0()));
            C5135Ly.m96079c(repairV2Activity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64640a.mo27460x()));
            C5135Ly.m96078d(repairV2Activity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64640a.mo27517d3()));
            C5135Ly.m96072j(repairV2Activity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64640a.mo27482q()));
            C5135Ly.m96076f(repairV2Activity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64640a.mo27483p3()));
            UD4.m81806b(repairV2Activity, m57539c());
            return repairV2Activity;
        }

        /* renamed from: c */
        public final XD4 m57539c() {
            return new XD4(m57538d());
        }

        /* renamed from: d */
        public final C37837aE4 m57538d() {
            return new C37837aE4(this.f64641b, this.f64642c, this.f64643d);
        }

        public C15219b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, TabLayout tabLayout, ViewPager2 viewPager2) {
            this.f64644e = this;
            this.f64640a = interfaceC44393lG2;
            this.f64641b = baseActivity;
            this.f64642c = tabLayout;
            this.f64643d = viewPager2;
        }
    }

    private C15217a() {
    }

    /* renamed from: a */
    public static RepairV2Activity.InterfaceC15213a.InterfaceC15214a m57543a() {
        return new C15218a();
    }
}
