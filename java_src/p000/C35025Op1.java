package p000;

import android.database.Cursor;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: Op1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35025Op1 extends AbstractC34791Np1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f27396a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetReportPeriod> f27397b;

    /* renamed from: c */
    public final AbstractC41861gz5 f27398c;

    /* renamed from: Op1$a */
    /* loaded from: classes4.dex */
    public class C6182a extends AbstractC39268cf1<FleetReportPeriod> {
        public C6182a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `fleet_report_period` (`start_date`,`end_date`,`granularity`,`fleet_id`,`page`) VALUES (?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetReportPeriod fleetReportPeriod) {
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(fleetReportPeriod.getStartDate());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, m55279e);
            }
            String m55279e2 = Converters.m55279e(fleetReportPeriod.getEndDate());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55279e2);
            }
            if (fleetReportPeriod.getGranularity() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, fleetReportPeriod.getGranularity());
            }
            if (fleetReportPeriod.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, fleetReportPeriod.getFleetId());
            }
            C52429yp1 c52429yp1 = C52429yp1.f120226a;
            String m2524i = C52429yp1.m2524i(fleetReportPeriod.getPage());
            if (m2524i == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m2524i);
            }
        }
    }

    /* renamed from: Op1$b */
    /* loaded from: classes4.dex */
    public class C6183b extends AbstractC41861gz5 {
        public C6183b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_report_period";
        }
    }

    /* renamed from: Op1$c */
    /* loaded from: classes4.dex */
    public class CallableC6184c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ FleetReportPeriod[] f27401b;

        public CallableC6184c(FleetReportPeriod[] fleetReportPeriodArr) {
            this.f27401b = fleetReportPeriodArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C35025Op1.this.f27396a.m108730c();
            try {
                C35025Op1.this.f27397b.m61087l(this.f27401b);
                C35025Op1.this.f27396a.m108734A();
                C35025Op1.this.f27396a.m108728g();
                return null;
            } catch (Throwable th) {
                C35025Op1.this.f27396a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Op1$d */
    /* loaded from: classes4.dex */
    public class CallableC6185d implements Callable<Void> {
        public CallableC6185d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C35025Op1.this.f27398c.m37254b();
            C35025Op1.this.f27396a.m108730c();
            try {
                m37254b.mo17482M();
                C35025Op1.this.f27396a.m108734A();
                C35025Op1.this.f27396a.m108728g();
                C35025Op1.this.f27398c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C35025Op1.this.f27396a.m108728g();
                C35025Op1.this.f27398c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Op1$e */
    /* loaded from: classes4.dex */
    public class CallableC6186e implements Callable<List<FleetReportPeriod>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f27404b;

        public CallableC6186e(C33265Hb5 c33265Hb5) {
            this.f27404b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetReportPeriod> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Cursor m102673c = IF0.m102673c(C35025Op1.this.f27396a, this.f27404b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "start_date");
                int m41645e2 = C40824fF0.m41645e(m102673c, "end_date");
                int m41645e3 = C40824fF0.m41645e(m102673c, "granularity");
                int m41645e4 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e5 = C40824fF0.m41645e(m102673c, "page");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    DateTime m55278f = Converters.m55278f(string);
                    if (m102673c.isNull(m41645e2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e2);
                    }
                    DateTime m55278f2 = Converters.m55278f(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    arrayList.add(new FleetReportPeriod(m55278f, m55278f2, string3, string4, C52429yp1.m2530c(string5)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f27404b.release();
        }
    }

    public C35025Op1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f27396a = abstractC32563Eb5;
        this.f27397b = new C6182a(abstractC32563Eb5);
        this.f27398c = new C6183b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m91317g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC34791Np1
    /* renamed from: a */
    public AbstractC23461c mo91323a() {
        return AbstractC23461c.m33078H(new CallableC6185d());
    }

    @Override // p000.AbstractC34791Np1
    /* renamed from: b */
    public AbstractC23461c mo91322b(FleetReportPeriod... fleetReportPeriodArr) {
        return AbstractC23461c.m33078H(new CallableC6184c(fleetReportPeriodArr));
    }

    @Override // p000.AbstractC34791Np1
    /* renamed from: c */
    public Observable<List<FleetReportPeriod>> mo91321c(String str, FleetReportPage fleetReportPage) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM fleet_report_period WHERE fleet_id = ? AND page = ? ORDER BY start_date DESC", 2);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        String m2524i = C52429yp1.m2524i(fleetReportPage);
        if (m2524i == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, m2524i);
        }
        return C37504Ze5.m72808c(this.f27396a, false, new String[]{"fleet_report_period"}, new CallableC6186e(m103680c));
    }
}
