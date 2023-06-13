package p000;

import android.database.Cursor;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.FlightSheetActions;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBanner;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCommands;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSection;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetVehicleSummary;
import co.bird.android.model.persistence.nestedstructures.TaskOrderInfo;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Cs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32244Cs1 extends AbstractC32010Bs1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f4823a;

    /* renamed from: b */
    public final AbstractC39268cf1<FlightSheetDetails> f4824b;

    /* renamed from: c */
    public final AbstractC41861gz5 f4825c;

    /* renamed from: Cs1$a */
    /* loaded from: classes4.dex */
    public class C1220a extends AbstractC39268cf1<FlightSheetDetails> {
        public C1220a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `flight_sheet` (`vehicle_id`,`context`,`banner`,`vehicle_summary`,`commands`,`action_sections`,`info_sections`,`ride_history`,`task_order_info`,`ride_ratings`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FlightSheetDetails flightSheetDetails) {
            if (flightSheetDetails.getVehicleId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, flightSheetDetails.getVehicleId());
            }
            C52459ys1 c52459ys1 = C52459ys1.f120351a;
            String m2366m = C52459ys1.m2366m(flightSheetDetails.getContext());
            if (m2366m == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m2366m);
            }
            String m2365n = C52459ys1.m2365n(flightSheetDetails.getBanner());
            if (m2365n == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m2365n);
            }
            String m2361r = C52459ys1.m2361r(flightSheetDetails.getVehicleSummary());
            if (m2361r == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m2361r);
            }
            String m2364o = C52459ys1.m2364o(flightSheetDetails.getCommands());
            if (m2364o == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m2364o);
            }
            String m2375d = C52459ys1.m2375d(flightSheetDetails.getActionSections());
            if (m2375d == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m2375d);
            }
            String m2371h = C52459ys1.m2371h(flightSheetDetails.getInfoSections());
            if (m2371h == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m2371h);
            }
            String m2363p = C52459ys1.m2363p(flightSheetDetails.getRideHistory());
            if (m2363p == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m2363p);
            }
            String m2360s = C52459ys1.m2360s(flightSheetDetails.getTaskOrderInfo());
            if (m2360s == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m2360s);
            }
            String m2362q = C52459ys1.m2362q(flightSheetDetails.getRideRatings());
            if (m2362q == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m2362q);
            }
        }
    }

    /* renamed from: Cs1$b */
    /* loaded from: classes4.dex */
    public class C1221b extends AbstractC41861gz5 {
        public C1221b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM flight_sheet";
        }
    }

    /* renamed from: Cs1$c */
    /* loaded from: classes4.dex */
    public class CallableC1222c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ FlightSheetDetails f4828b;

        public CallableC1222c(FlightSheetDetails flightSheetDetails) {
            this.f4828b = flightSheetDetails;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C32244Cs1.this.f4823a.m108730c();
            try {
                C32244Cs1.this.f4824b.m61088k(this.f4828b);
                C32244Cs1.this.f4823a.m108734A();
                C32244Cs1.this.f4823a.m108728g();
                return null;
            } catch (Throwable th) {
                C32244Cs1.this.f4823a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Cs1$d */
    /* loaded from: classes4.dex */
    public class CallableC1223d implements Callable<Void> {
        public CallableC1223d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C32244Cs1.this.f4825c.m37254b();
            C32244Cs1.this.f4823a.m108730c();
            try {
                m37254b.mo17482M();
                C32244Cs1.this.f4823a.m108734A();
                C32244Cs1.this.f4823a.m108728g();
                C32244Cs1.this.f4825c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C32244Cs1.this.f4823a.m108728g();
                C32244Cs1.this.f4825c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Cs1$e */
    /* loaded from: classes4.dex */
    public class CallableC1224e implements Callable<FlightSheetDetails> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f4831b;

        public CallableC1224e(C33265Hb5 c33265Hb5) {
            this.f4831b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public FlightSheetDetails call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            FlightSheetDetails flightSheetDetails = null;
            String string10 = null;
            Cursor m102673c = IF0.m102673c(C32244Cs1.this.f4823a, this.f4831b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "vehicle_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "banner");
                int m41645e4 = C40824fF0.m41645e(m102673c, "vehicle_summary");
                int m41645e5 = C40824fF0.m41645e(m102673c, "commands");
                int m41645e6 = C40824fF0.m41645e(m102673c, "action_sections");
                int m41645e7 = C40824fF0.m41645e(m102673c, "info_sections");
                int m41645e8 = C40824fF0.m41645e(m102673c, "ride_history");
                int m41645e9 = C40824fF0.m41645e(m102673c, "task_order_info");
                int m41645e10 = C40824fF0.m41645e(m102673c, "ride_ratings");
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
                    FlightSheetContext m2372g = C52459ys1.m2372g(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    FlightSheetBanner m2374e = C52459ys1.m2374e(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    FlightSheetVehicleSummary m2367l = C52459ys1.m2367l(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    FlightSheetCommands m2373f = C52459ys1.m2373f(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    List<FlightSheetActions> m2376c = C52459ys1.m2376c(string6);
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    List<FlightSheetInfoSection> m2370i = C52459ys1.m2370i(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    FlightSheetRideHistory m2369j = C52459ys1.m2369j(string8);
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    TaskOrderInfo m2359t = C52459ys1.m2359t(string9);
                    if (!m102673c.isNull(m41645e10)) {
                        string10 = m102673c.getString(m41645e10);
                    }
                    flightSheetDetails = new FlightSheetDetails(string, m2372g, m2374e, m2367l, m2373f, m2376c, m2370i, m2369j, m2359t, C52459ys1.m2368k(string10));
                }
                return flightSheetDetails;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f4831b.release();
        }
    }

    public C32244Cs1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f4823a = abstractC32563Eb5;
        this.f4824b = new C1220a(abstractC32563Eb5);
        this.f4825c = new C1221b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m111394g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC32010Bs1
    /* renamed from: a */
    public AbstractC23461c mo111400a() {
        return AbstractC23461c.m33078H(new CallableC1223d());
    }

    @Override // p000.AbstractC32010Bs1
    /* renamed from: b */
    public Observable<FlightSheetDetails> mo111399b(String str, String str2) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM flight_sheet WHERE vehicle_id = ? AND context = ?", 2);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        if (str2 == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, str2);
        }
        return C37504Ze5.m72808c(this.f4823a, false, new String[]{"flight_sheet"}, new CallableC1224e(m103680c));
    }

    @Override // p000.AbstractC32010Bs1
    /* renamed from: c */
    public AbstractC23461c mo111398c(FlightSheetDetails flightSheetDetails) {
        return AbstractC23461c.m33078H(new CallableC1222c(flightSheetDetails));
    }
}
