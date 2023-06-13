package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: N00 */
/* loaded from: classes4.dex */
public final class N00 extends M00 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f23930a;

    /* renamed from: b */
    public final AbstractC39268cf1<BountyMapMarker> f23931b;

    /* renamed from: c */
    public final AbstractC38675bf1<BountyMapMarker> f23932c;

    /* renamed from: d */
    public final AbstractC41861gz5 f23933d;

    /* renamed from: N00$a */
    /* loaded from: classes4.dex */
    public class C5451a extends AbstractC39268cf1<BountyMapMarker> {
        public C5451a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `bounty_map_markers` (`id`,`location`,`marker`,`updated_at`,`countdown_until`) VALUES (?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BountyMapMarker bountyMapMarker) {
            if (bountyMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bountyMapMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(bountyMapMarker.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55271m);
            }
            String m55273k = Converters.m55273k(bountyMapMarker.getMarker());
            if (m55273k == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55273k);
            }
            String m55279e = Converters.m55279e(bountyMapMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m55279e);
            }
            String m55279e2 = Converters.m55279e(bountyMapMarker.getCountdownUntil());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55279e2);
            }
        }
    }

    /* renamed from: N00$b */
    /* loaded from: classes4.dex */
    public class C5452b extends AbstractC38675bf1<BountyMapMarker> {
        public C5452b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR ABORT `bounty_map_markers` SET `id` = ?,`location` = ?,`marker` = ?,`updated_at` = ?,`countdown_until` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, BountyMapMarker bountyMapMarker) {
            if (bountyMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bountyMapMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(bountyMapMarker.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55271m);
            }
            String m55273k = Converters.m55273k(bountyMapMarker.getMarker());
            if (m55273k == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55273k);
            }
            String m55279e = Converters.m55279e(bountyMapMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m55279e);
            }
            String m55279e2 = Converters.m55279e(bountyMapMarker.getCountdownUntil());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55279e2);
            }
            if (bountyMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, bountyMapMarker.getId());
            }
        }
    }

    /* renamed from: N00$c */
    /* loaded from: classes4.dex */
    public class C5453c extends AbstractC41861gz5 {
        public C5453c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bounty_map_markers";
        }
    }

    /* renamed from: N00$d */
    /* loaded from: classes4.dex */
    public class CallableC5454d implements Callable<Void> {
        public CallableC5454d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = N00.this.f23933d.m37254b();
            N00.this.f23930a.m108730c();
            try {
                m37254b.mo17482M();
                N00.this.f23930a.m108734A();
                N00.this.f23930a.m108728g();
                N00.this.f23933d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                N00.this.f23930a.m108728g();
                N00.this.f23933d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: N00$e */
    /* loaded from: classes4.dex */
    public class CallableC5455e implements Callable<List<BountyMapMarker>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f23938b;

        public CallableC5455e(C33265Hb5 c33265Hb5) {
            this.f23938b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<BountyMapMarker> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Cursor m102673c = IF0.m102673c(N00.this.f23930a, this.f23938b, false, null);
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
                    Geolocation m55276h = Converters.m55276h(string2);
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    FleetMarker m55277g = Converters.m55277g(string3);
                    if (m102673c.isNull(3)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(3);
                    }
                    DateTime m55278f = Converters.m55278f(string4);
                    if (m102673c.isNull(4)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(4);
                    }
                    arrayList.add(new BountyMapMarker(string, m55276h, m55277g, m55278f, Converters.m55278f(string5)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f23938b.release();
        }
    }

    /* renamed from: N00$f */
    /* loaded from: classes4.dex */
    public class CallableC5456f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f23940b;

        public CallableC5456f(List list) {
            this.f23940b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM bounty_map_markers WHERE id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f23940b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = N00.this.f23930a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f23940b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            N00.this.f23930a.m108730c();
            try {
                m108729d.mo17482M();
                N00.this.f23930a.m108734A();
                N00.this.f23930a.m108728g();
                return null;
            } catch (Throwable th) {
                N00.this.f23930a.m108728g();
                throw th;
            }
        }
    }

    public N00(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f23930a = abstractC32563Eb5;
        this.f23931b = new C5451a(abstractC32563Eb5);
        this.f23932c = new C5452b(abstractC32563Eb5);
        this.f23933d = new C5453c(abstractC32563Eb5);
    }

    /* renamed from: k */
    public static List<Class<?>> m94496k() {
        return Collections.emptyList();
    }

    @Override // p000.M00
    /* renamed from: a */
    public Observable<List<BountyMapMarker>> mo94506a() {
        return C37504Ze5.m72808c(this.f23930a, false, new String[]{"bounty_map_markers"}, new CallableC5455e(C33265Hb5.m103680c("SELECT `bounty_map_markers`.`id` AS `id`, `bounty_map_markers`.`location` AS `location`, `bounty_map_markers`.`marker` AS `marker`, `bounty_map_markers`.`updated_at` AS `updated_at`, `bounty_map_markers`.`countdown_until` AS `countdown_until` FROM bounty_map_markers", 0)));
    }

    @Override // p000.M00
    /* renamed from: b */
    public AbstractC23461c mo94505b() {
        return AbstractC23461c.m33078H(new CallableC5454d());
    }

    @Override // p000.M00
    /* renamed from: c */
    public List<String> mo94504c(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `id` from bounty_map_markers WHERE rowid in (");
        int size = list.size();
        C42725iS5.m33906a(m33905b, size);
        m33905b.append(")");
        C33265Hb5 m103680c = C33265Hb5.m103680c(m33905b.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                m103680c.mo20954m1(i);
            } else {
                m103680c.mo20956S0(i, l.longValue());
            }
            i++;
        }
        this.f23930a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f23930a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.M00
    /* renamed from: d */
    public List<Long> mo94503d(BountyMapMarker... bountyMapMarkerArr) {
        this.f23930a.m108731b();
        this.f23930a.m108730c();
        try {
            List<Long> m61084o = this.f23931b.m61084o(bountyMapMarkerArr);
            this.f23930a.m108734A();
            return m61084o;
        } finally {
            this.f23930a.m108728g();
        }
    }

    @Override // p000.M00
    /* renamed from: e */
    public AbstractC23461c mo94502e(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC5456f(list));
    }

    @Override // p000.M00
    /* renamed from: f */
    public void mo94501f(BountyMapMarker... bountyMapMarkerArr) {
        this.f23930a.m108731b();
        this.f23930a.m108730c();
        try {
            this.f23932c.m64205l(bountyMapMarkerArr);
            this.f23930a.m108734A();
        } finally {
            this.f23930a.m108728g();
        }
    }

    @Override // p000.M00
    /* renamed from: g */
    public void mo94500g(BountyMapMarker... bountyMapMarkerArr) {
        this.f23930a.m108730c();
        try {
            super.mo94500g(bountyMapMarkerArr);
            this.f23930a.m108734A();
        } finally {
            this.f23930a.m108728g();
        }
    }
}
