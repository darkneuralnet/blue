package p000;

import android.database.Cursor;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.model.persistence.FleetReportSection;
import co.bird.android.model.persistence.FleetTargetScoreboard;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Ap1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31749Ap1 extends AbstractC53022zp1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f1177a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetReport> f1178b;

    /* renamed from: c */
    public final AbstractC41861gz5 f1179c;

    /* renamed from: Ap1$a */
    /* loaded from: classes4.dex */
    public class C0252a extends AbstractC39268cf1<FleetReport> {
        public C0252a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `fleet_reports` (`period`,`subheading`,`scoreboards`,`sections`,`fleet_id`,`page`) VALUES (?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetReport fleetReport) {
            C52429yp1 c52429yp1 = C52429yp1.f120226a;
            String m2523j = C52429yp1.m2523j(fleetReport.getPeriod());
            if (m2523j == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, m2523j);
            }
            if (fleetReport.getSubheading() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, fleetReport.getSubheading());
            }
            String m2526g = C52429yp1.m2526g(fleetReport.getScoreboards());
            if (m2526g == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m2526g);
            }
            String m2528e = C52429yp1.m2528e(fleetReport.getSections());
            if (m2528e == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m2528e);
            }
            if (fleetReport.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, fleetReport.getFleetId());
            }
            String m2524i = C52429yp1.m2524i(fleetReport.getPage());
            if (m2524i == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m2524i);
            }
        }
    }

    /* renamed from: Ap1$b */
    /* loaded from: classes4.dex */
    public class C0253b extends AbstractC41861gz5 {
        public C0253b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_reports";
        }
    }

    /* renamed from: Ap1$c */
    /* loaded from: classes4.dex */
    public class CallableC0254c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ FleetReport[] f1182b;

        public CallableC0254c(FleetReport[] fleetReportArr) {
            this.f1182b = fleetReportArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C31749Ap1.this.f1177a.m108730c();
            try {
                C31749Ap1.this.f1178b.m61087l(this.f1182b);
                C31749Ap1.this.f1177a.m108734A();
                C31749Ap1.this.f1177a.m108728g();
                return null;
            } catch (Throwable th) {
                C31749Ap1.this.f1177a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Ap1$d */
    /* loaded from: classes4.dex */
    public class CallableC0255d implements Callable<Void> {
        public CallableC0255d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C31749Ap1.this.f1179c.m37254b();
            C31749Ap1.this.f1177a.m108730c();
            try {
                m37254b.mo17482M();
                C31749Ap1.this.f1177a.m108734A();
                C31749Ap1.this.f1177a.m108728g();
                C31749Ap1.this.f1179c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C31749Ap1.this.f1177a.m108728g();
                C31749Ap1.this.f1179c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Ap1$e */
    /* loaded from: classes4.dex */
    public class CallableC0256e implements Callable<FleetReport> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f1185b;

        public CallableC0256e(C33265Hb5 c33265Hb5) {
            this.f1185b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public FleetReport call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            FleetReport fleetReport = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C31749Ap1.this.f1177a, this.f1185b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "period");
                int m41645e2 = C40824fF0.m41645e(m102673c, "subheading");
                int m41645e3 = C40824fF0.m41645e(m102673c, "scoreboards");
                int m41645e4 = C40824fF0.m41645e(m102673c, "sections");
                int m41645e5 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e6 = C40824fF0.m41645e(m102673c, "page");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    FleetReportPeriod m2529d = C52429yp1.m2529d(string);
                    if (m102673c.isNull(m41645e2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e2);
                    }
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    List<FleetTargetScoreboard> m2525h = C52429yp1.m2525h(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    List<FleetReportSection> m2527f = C52429yp1.m2527f(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    if (!m102673c.isNull(m41645e6)) {
                        string6 = m102673c.getString(m41645e6);
                    }
                    fleetReport = new FleetReport(m2529d, string2, m2525h, m2527f, string5, C52429yp1.m2530c(string6));
                }
                return fleetReport;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f1185b.release();
        }
    }

    public C31749Ap1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f1177a = abstractC32563Eb5;
        this.f1178b = new C0252a(abstractC32563Eb5);
        this.f1179c = new C0253b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m115135g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC53022zp1
    /* renamed from: a */
    public AbstractC23461c mo402a() {
        return AbstractC23461c.m33078H(new CallableC0255d());
    }

    @Override // p000.AbstractC53022zp1
    /* renamed from: b */
    public Observable<FleetReport> mo401b(String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM fleet_reports WHERE fleet_id = ? AND period = ? AND page = ?", 3);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        String m2523j = C52429yp1.m2523j(fleetReportPeriod);
        if (m2523j == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, m2523j);
        }
        String m2524i = C52429yp1.m2524i(fleetReportPage);
        if (m2524i == null) {
            m103680c.mo20954m1(3);
        } else {
            m103680c.mo20958G0(3, m2524i);
        }
        return C37504Ze5.m72808c(this.f1177a, false, new String[]{"fleet_reports"}, new CallableC0256e(m103680c));
    }

    @Override // p000.AbstractC53022zp1
    /* renamed from: c */
    public AbstractC23461c mo400c(FleetReport... fleetReportArr) {
        return AbstractC23461c.m33078H(new CallableC0254c(fleetReportArr));
    }
}
