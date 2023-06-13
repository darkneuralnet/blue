package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.FleetStatusSummary;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: wr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51263wr1 extends AbstractC50670vr1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f116625a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetStatusSummary> f116626b;

    /* renamed from: c */
    public final AbstractC41861gz5 f116627c;

    /* renamed from: wr1$a */
    /* loaded from: classes4.dex */
    public class C29968a extends AbstractC39268cf1<FleetStatusSummary> {
        public C29968a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `fleet_summary` (`fleet_id`,`title`,`description`,`chart`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetStatusSummary fleetStatusSummary) {
            if (fleetStatusSummary.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, fleetStatusSummary.getFleetId());
            }
            if (fleetStatusSummary.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, fleetStatusSummary.getTitle());
            }
            if (fleetStatusSummary.getDescription() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, fleetStatusSummary.getDescription());
            }
            C50660vq1 c50660vq1 = C50660vq1.f114779a;
            String m7938m = C50660vq1.m7938m(fleetStatusSummary.getChart());
            if (m7938m == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m7938m);
            }
        }
    }

    /* renamed from: wr1$b */
    /* loaded from: classes4.dex */
    public class C29969b extends AbstractC41861gz5 {
        public C29969b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_summary";
        }
    }

    /* renamed from: wr1$c */
    /* loaded from: classes4.dex */
    public class CallableC29970c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f116630b;

        public CallableC29970c(List list) {
            this.f116630b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C51263wr1.this.f116625a.m108730c();
            try {
                C51263wr1.this.f116626b.m61089j(this.f116630b);
                C51263wr1.this.f116625a.m108734A();
                C51263wr1.this.f116625a.m108728g();
                return null;
            } catch (Throwable th) {
                C51263wr1.this.f116625a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: wr1$d */
    /* loaded from: classes4.dex */
    public class CallableC29971d implements Callable<Void> {
        public CallableC29971d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51263wr1.this.f116627c.m37254b();
            C51263wr1.this.f116625a.m108730c();
            try {
                m37254b.mo17482M();
                C51263wr1.this.f116625a.m108734A();
                C51263wr1.this.f116625a.m108728g();
                C51263wr1.this.f116627c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51263wr1.this.f116625a.m108728g();
                C51263wr1.this.f116627c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: wr1$e */
    /* loaded from: classes4.dex */
    public class CallableC29972e implements Callable<List<FleetStatusSummary>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f116633b;

        public CallableC29972e(C33265Hb5 c33265Hb5) {
            this.f116633b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetStatusSummary> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            Cursor m102673c = IF0.m102673c(C51263wr1.this.f116625a, this.f116633b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    if (m102673c.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(1);
                    }
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    if (m102673c.isNull(3)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(3);
                    }
                    arrayList.add(new FleetStatusSummary(string, string2, string3, C50660vq1.m7943h(string4)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f116633b.release();
        }
    }

    /* renamed from: wr1$f */
    /* loaded from: classes4.dex */
    public class CallableC29973f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f116635b;

        public CallableC29973f(List list) {
            this.f116635b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM fleet_summary WHERE fleet_id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f116635b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C51263wr1.this.f116625a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f116635b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C51263wr1.this.f116625a.m108730c();
            try {
                m108729d.mo17482M();
                C51263wr1.this.f116625a.m108734A();
                C51263wr1.this.f116625a.m108728g();
                return null;
            } catch (Throwable th) {
                C51263wr1.this.f116625a.m108728g();
                throw th;
            }
        }
    }

    public C51263wr1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f116625a = abstractC32563Eb5;
        this.f116626b = new C29968a(abstractC32563Eb5);
        this.f116627c = new C29969b(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m6228h() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC50670vr1
    /* renamed from: a */
    public AbstractC23461c mo6235a() {
        return AbstractC23461c.m33078H(new CallableC29971d());
    }

    @Override // p000.AbstractC50670vr1
    /* renamed from: b */
    public Observable<List<FleetStatusSummary>> mo6234b() {
        return C37504Ze5.m72808c(this.f116625a, false, new String[]{"fleet_summary"}, new CallableC29972e(C33265Hb5.m103680c("SELECT `fleet_summary`.`fleet_id` AS `fleet_id`, `fleet_summary`.`title` AS `title`, `fleet_summary`.`description` AS `description`, `fleet_summary`.`chart` AS `chart` FROM fleet_summary", 0)));
    }

    @Override // p000.AbstractC50670vr1
    /* renamed from: c */
    public AbstractC23461c mo6233c(List<FleetStatusSummary> list) {
        return AbstractC23461c.m33078H(new CallableC29970c(list));
    }

    @Override // p000.AbstractC50670vr1
    /* renamed from: d */
    public AbstractC23461c mo6232d(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC29973f(list));
    }
}
