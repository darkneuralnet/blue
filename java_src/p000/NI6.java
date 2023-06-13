package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: NI6 */
/* loaded from: classes4.dex */
public final class NI6 extends MI6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f24420a;

    /* renamed from: b */
    public final AbstractC39268cf1<ZoneFlightSheetDetails> f24421b;

    /* renamed from: c */
    public final AbstractC41861gz5 f24422c;

    /* renamed from: NI6$a */
    /* loaded from: classes4.dex */
    public class C5541a extends AbstractC39268cf1<ZoneFlightSheetDetails> {
        public C5541a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `zone_flight_sheet` (`zone_id`,`zone_summary`,`zone_status`,`detail_sections`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ZoneFlightSheetDetails zoneFlightSheetDetails) {
            if (zoneFlightSheetDetails.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, zoneFlightSheetDetails.getZoneId());
            }
            LI6 li6 = LI6.f21085a;
            String m97352c = LI6.m97352c(zoneFlightSheetDetails.getZoneSummary());
            if (m97352c == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m97352c);
            }
            String m97353b = LI6.m97353b(zoneFlightSheetDetails.getZoneStatus());
            if (m97353b == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m97353b);
            }
            String m97351d = LI6.m97351d(zoneFlightSheetDetails.getDetailSections());
            if (m97351d == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m97351d);
            }
        }
    }

    /* renamed from: NI6$b */
    /* loaded from: classes4.dex */
    public class C5542b extends AbstractC41861gz5 {
        public C5542b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM zone_flight_sheet";
        }
    }

    /* renamed from: NI6$c */
    /* loaded from: classes4.dex */
    public class CallableC5543c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ ZoneFlightSheetDetails f24425b;

        public CallableC5543c(ZoneFlightSheetDetails zoneFlightSheetDetails) {
            this.f24425b = zoneFlightSheetDetails;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            NI6.this.f24420a.m108730c();
            try {
                NI6.this.f24421b.m61088k(this.f24425b);
                NI6.this.f24420a.m108734A();
                NI6.this.f24420a.m108728g();
                return null;
            } catch (Throwable th) {
                NI6.this.f24420a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: NI6$d */
    /* loaded from: classes4.dex */
    public class CallableC5544d implements Callable<ZoneFlightSheetDetails> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f24427b;

        public CallableC5544d(C33265Hb5 c33265Hb5) {
            this.f24427b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ZoneFlightSheetDetails call() throws Exception {
            String string;
            String string2;
            String string3;
            ZoneFlightSheetDetails zoneFlightSheetDetails = null;
            String string4 = null;
            Cursor m102673c = IF0.m102673c(NI6.this.f24420a, this.f24427b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "zone_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "zone_summary");
                int m41645e3 = C40824fF0.m41645e(m102673c, "zone_status");
                int m41645e4 = C40824fF0.m41645e(m102673c, "detail_sections");
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
                    ZoneSummary m97348g = LI6.m97348g(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    ZoneStatus m97349f = LI6.m97349f(string3);
                    if (!m102673c.isNull(m41645e4)) {
                        string4 = m102673c.getString(m41645e4);
                    }
                    zoneFlightSheetDetails = new ZoneFlightSheetDetails(string, m97348g, m97349f, LI6.m97350e(string4));
                }
                return zoneFlightSheetDetails;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f24427b.release();
        }
    }

    public NI6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f24420a = abstractC32563Eb5;
        this.f24421b = new C5541a(abstractC32563Eb5);
        this.f24422c = new C5542b(abstractC32563Eb5);
    }

    /* renamed from: e */
    public static List<Class<?>> m94067e() {
        return Collections.emptyList();
    }

    @Override // p000.MI6
    /* renamed from: a */
    public AbstractC23461c mo94071a(ZoneFlightSheetDetails zoneFlightSheetDetails) {
        return AbstractC23461c.m33078H(new CallableC5543c(zoneFlightSheetDetails));
    }

    @Override // p000.MI6
    /* renamed from: b */
    public Observable<ZoneFlightSheetDetails> mo94070b(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM zone_flight_sheet WHERE zone_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f24420a, false, new String[]{"zone_flight_sheet"}, new CallableC5544d(m103680c));
    }
}
