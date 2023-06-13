package p000;

import android.database.Cursor;
import ch.qos.logback.classic.spi.CallerData;
import co.bird.android.model.persistence.FleetListSection;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Yo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37356Yo1 extends AbstractC37122Xo1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f46646a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetListSection> f46647b;

    /* renamed from: c */
    public final AbstractC41861gz5 f46648c;

    /* renamed from: Yo1$a */
    /* loaded from: classes4.dex */
    public class C9996a extends AbstractC39268cf1<FleetListSection> {
        public C9996a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `fleet_list_section` (`title`,`fleet_id`,`list`,`facets`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetListSection fleetListSection) {
            if (fleetListSection.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, fleetListSection.getTitle());
            }
            if (fleetListSection.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, fleetListSection.getFleetId());
            }
            if (fleetListSection.getList() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, fleetListSection.getList());
            }
            C50660vq1 c50660vq1 = C50660vq1.f114779a;
            String m7936o = C50660vq1.m7936o(fleetListSection.getFacets());
            if (m7936o == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m7936o);
            }
        }
    }

    /* renamed from: Yo1$b */
    /* loaded from: classes4.dex */
    public class C9997b extends AbstractC41861gz5 {
        public C9997b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `fleet_list_section`";
        }
    }

    /* renamed from: Yo1$c */
    /* loaded from: classes4.dex */
    public class CallableC9998c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f46651b;

        public CallableC9998c(List list) {
            this.f46651b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C37356Yo1.this.f46646a.m108730c();
            try {
                C37356Yo1.this.f46647b.m61089j(this.f46651b);
                C37356Yo1.this.f46646a.m108734A();
                C37356Yo1.this.f46646a.m108728g();
                return null;
            } catch (Throwable th) {
                C37356Yo1.this.f46646a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Yo1$d */
    /* loaded from: classes4.dex */
    public class CallableC9999d implements Callable<Void> {
        public CallableC9999d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C37356Yo1.this.f46648c.m37254b();
            C37356Yo1.this.f46646a.m108730c();
            try {
                m37254b.mo17482M();
                C37356Yo1.this.f46646a.m108734A();
                C37356Yo1.this.f46646a.m108728g();
                C37356Yo1.this.f46648c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C37356Yo1.this.f46646a.m108728g();
                C37356Yo1.this.f46648c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Yo1$e */
    /* loaded from: classes4.dex */
    public class CallableC10000e implements Callable<List<FleetListSection>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f46654b;

        public CallableC10000e(C33265Hb5 c33265Hb5) {
            this.f46654b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetListSection> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            Cursor m102673c = IF0.m102673c(C37356Yo1.this.f46646a, this.f46654b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "title");
                int m41645e2 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "list");
                int m41645e4 = C40824fF0.m41645e(m102673c, "facets");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
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
                    arrayList.add(new FleetListSection(string, string2, string3, C50660vq1.m7948c(string4)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f46654b.release();
        }
    }

    /* renamed from: Yo1$f */
    /* loaded from: classes4.dex */
    public class CallableC10001f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f46656b;

        /* renamed from: c */
        public final /* synthetic */ String f46657c;

        /* renamed from: d */
        public final /* synthetic */ String f46658d;

        public CallableC10001f(List list, String str, String str2) {
            this.f46656b = list;
            this.f46657c = str;
            this.f46658d = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM `fleet_list_section` WHERE `fleet_id` = ");
            m33905b.append(CallerData.f61059NA);
            m33905b.append(" AND `list` = ");
            m33905b.append(CallerData.f61059NA);
            m33905b.append(" AND `title` NOT IN (");
            C42725iS5.m33906a(m33905b, this.f46656b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C37356Yo1.this.f46646a.m108729d(m33905b.toString());
            String str = this.f46657c;
            if (str == null) {
                m108729d.mo20954m1(1);
            } else {
                m108729d.mo20958G0(1, str);
            }
            String str2 = this.f46658d;
            if (str2 == null) {
                m108729d.mo20954m1(2);
            } else {
                m108729d.mo20958G0(2, str2);
            }
            int i = 3;
            for (String str3 : this.f46656b) {
                if (str3 == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str3);
                }
                i++;
            }
            C37356Yo1.this.f46646a.m108730c();
            try {
                m108729d.mo17482M();
                C37356Yo1.this.f46646a.m108734A();
                C37356Yo1.this.f46646a.m108728g();
                return null;
            } catch (Throwable th) {
                C37356Yo1.this.f46646a.m108728g();
                throw th;
            }
        }
    }

    public C37356Yo1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f46646a = abstractC32563Eb5;
        this.f46647b = new C9996a(abstractC32563Eb5);
        this.f46648c = new C9997b(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m74216h() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC37122Xo1
    /* renamed from: a */
    public AbstractC23461c mo74223a() {
        return AbstractC23461c.m33078H(new CallableC9999d());
    }

    @Override // p000.AbstractC37122Xo1
    /* renamed from: b */
    public Observable<List<FleetListSection>> mo74222b(String str, String str2) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM `fleet_list_section` WHERE `fleet_id` = ? AND `list` = ?", 2);
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
        return C37504Ze5.m72808c(this.f46646a, false, new String[]{"fleet_list_section"}, new CallableC10000e(m103680c));
    }

    @Override // p000.AbstractC37122Xo1
    /* renamed from: c */
    public AbstractC23461c mo74221c(List<FleetListSection> list) {
        return AbstractC23461c.m33078H(new CallableC9998c(list));
    }

    @Override // p000.AbstractC37122Xo1
    /* renamed from: d */
    public AbstractC23461c mo74220d(String str, String str2, List<String> list) {
        return AbstractC23461c.m33078H(new CallableC10001f(list, str, str2));
    }
}
