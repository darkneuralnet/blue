package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.ClaimDetails;
import co.bird.android.model.persistence.nestedstructures.NestAllowedVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.NestBirdle;
import co.bird.android.model.persistence.nestedstructures.NestButtons;
import co.bird.android.model.persistence.nestedstructures.NestCapacity;
import co.bird.android.model.persistence.nestedstructures.NestDetails;
import co.bird.android.model.persistence.nestedstructures.NestImages;
import co.bird.android.model.persistence.nestedstructures.NestStatus;
import co.bird.android.model.persistence.nestedstructures.NestSummary;
import co.bird.android.model.persistence.nestedstructures.NestVehicleDetails;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: K33 */
/* loaded from: classes4.dex */
public final class K33 extends J33 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f18992a;

    /* renamed from: b */
    public final AbstractC39268cf1<NestFlightSheetDetails> f18993b;

    /* renamed from: c */
    public final AbstractC41861gz5 f18994c;

    /* renamed from: K33$a */
    /* loaded from: classes4.dex */
    public class C4321a extends AbstractC39268cf1<NestFlightSheetDetails> {
        public C4321a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `nest_flight_sheet` (`nest_id`,`nest_summary`,`nest_birdle`,`nest_status`,`nest_images`,`nest_capacity`,`nest_details`,`vehicle_details`,`nest_buttons`,`claim_details`,`nest_allowed_vehicles`,`new_claim_error_message`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, NestFlightSheetDetails nestFlightSheetDetails) {
            if (nestFlightSheetDetails.getNestId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, nestFlightSheetDetails.getNestId());
            }
            I33 i33 = I33.f14385a;
            String m103021j = I33.m103021j(nestFlightSheetDetails.getNestSummary());
            if (m103021j == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m103021j);
            }
            String m103027d = I33.m103027d(nestFlightSheetDetails.getNestBirdle());
            if (m103027d == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m103027d);
            }
            String m103022i = I33.m103022i(nestFlightSheetDetails.getNestStatus());
            if (m103022i == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m103022i);
            }
            String m103023h = I33.m103023h(nestFlightSheetDetails.getNestImages());
            if (m103023h == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m103023h);
            }
            String m103025f = I33.m103025f(nestFlightSheetDetails.getNestCapacity());
            if (m103025f == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m103025f);
            }
            String m103024g = I33.m103024g(nestFlightSheetDetails.getNestDetails());
            if (m103024g == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m103024g);
            }
            String m103020k = I33.m103020k(nestFlightSheetDetails.getVehicleDetails());
            if (m103020k == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m103020k);
            }
            String m103026e = I33.m103026e(nestFlightSheetDetails.getNestButtons());
            if (m103026e == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m103026e);
            }
            String m103029b = I33.m103029b(nestFlightSheetDetails.getClaimDetails());
            if (m103029b == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m103029b);
            }
            String m103028c = I33.m103028c(nestFlightSheetDetails.getNestAllowedVehicles());
            if (m103028c == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m103028c);
            }
            if (nestFlightSheetDetails.getNewClaimErrorMessage() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, nestFlightSheetDetails.getNewClaimErrorMessage());
            }
        }
    }

    /* renamed from: K33$b */
    /* loaded from: classes4.dex */
    public class C4322b extends AbstractC41861gz5 {
        public C4322b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM nest_flight_sheet";
        }
    }

    /* renamed from: K33$c */
    /* loaded from: classes4.dex */
    public class CallableC4323c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ NestFlightSheetDetails f18997b;

        public CallableC4323c(NestFlightSheetDetails nestFlightSheetDetails) {
            this.f18997b = nestFlightSheetDetails;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            K33.this.f18992a.m108730c();
            try {
                K33.this.f18993b.m61088k(this.f18997b);
                K33.this.f18992a.m108734A();
                K33.this.f18992a.m108728g();
                return null;
            } catch (Throwable th) {
                K33.this.f18992a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: K33$d */
    /* loaded from: classes4.dex */
    public class CallableC4324d implements Callable<Void> {
        public CallableC4324d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = K33.this.f18994c.m37254b();
            K33.this.f18992a.m108730c();
            try {
                m37254b.mo17482M();
                K33.this.f18992a.m108734A();
                K33.this.f18992a.m108728g();
                K33.this.f18994c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                K33.this.f18992a.m108728g();
                K33.this.f18994c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: K33$e */
    /* loaded from: classes4.dex */
    public class CallableC4325e implements Callable<NestFlightSheetDetails> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f19000b;

        public CallableC4325e(C33265Hb5 c33265Hb5) {
            this.f19000b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public NestFlightSheetDetails call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            NestFlightSheetDetails nestFlightSheetDetails = null;
            String string12 = null;
            Cursor m102673c = IF0.m102673c(K33.this.f18992a, this.f19000b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "nest_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "nest_summary");
                int m41645e3 = C40824fF0.m41645e(m102673c, "nest_birdle");
                int m41645e4 = C40824fF0.m41645e(m102673c, "nest_status");
                int m41645e5 = C40824fF0.m41645e(m102673c, "nest_images");
                int m41645e6 = C40824fF0.m41645e(m102673c, "nest_capacity");
                int m41645e7 = C40824fF0.m41645e(m102673c, "nest_details");
                int m41645e8 = C40824fF0.m41645e(m102673c, "vehicle_details");
                int m41645e9 = C40824fF0.m41645e(m102673c, "nest_buttons");
                int m41645e10 = C40824fF0.m41645e(m102673c, "claim_details");
                int m41645e11 = C40824fF0.m41645e(m102673c, "nest_allowed_vehicles");
                int m41645e12 = C40824fF0.m41645e(m102673c, "new_claim_error_message");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    if (m102673c.isNull(m41645e2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e2);
                    }
                    NestSummary m103012s = I33.m103012s(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    NestBirdle m103018m = I33.m103018m(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    NestStatus m103013r = I33.m103013r(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    NestImages m103014q = I33.m103014q(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    NestCapacity m103016o = I33.m103016o(string6);
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    NestDetails m103015p = I33.m103015p(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    NestVehicleDetails m103011t = I33.m103011t(string8);
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    NestButtons m103017n = I33.m103017n(string9);
                    if (m102673c.isNull(m41645e10)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e10);
                    }
                    ClaimDetails m103030a = I33.m103030a(string10);
                    if (m102673c.isNull(m41645e11)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e11);
                    }
                    NestAllowedVehicleDetails m103019l = I33.m103019l(string11);
                    if (!m102673c.isNull(m41645e12)) {
                        string12 = m102673c.getString(m41645e12);
                    }
                    nestFlightSheetDetails = new NestFlightSheetDetails(string, m103012s, m103018m, m103013r, m103014q, m103016o, m103015p, m103011t, m103017n, m103030a, m103019l, string12);
                }
                return nestFlightSheetDetails;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f19000b.release();
        }
    }

    public K33(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f18992a = abstractC32563Eb5;
        this.f18993b = new C4321a(abstractC32563Eb5);
        this.f18994c = new C4322b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m99293g() {
        return Collections.emptyList();
    }

    @Override // p000.J33
    /* renamed from: a */
    public AbstractC23461c mo99299a() {
        return AbstractC23461c.m33078H(new CallableC4324d());
    }

    @Override // p000.J33
    /* renamed from: b */
    public AbstractC23461c mo99298b(NestFlightSheetDetails nestFlightSheetDetails) {
        return AbstractC23461c.m33078H(new CallableC4323c(nestFlightSheetDetails));
    }

    @Override // p000.J33
    /* renamed from: c */
    public Observable<NestFlightSheetDetails> mo99297c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM nest_flight_sheet WHERE nest_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f18992a, false, new String[]{"nest_flight_sheet"}, new CallableC4325e(m103680c));
    }
}
