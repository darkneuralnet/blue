package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.persistence.common.impl.Converters;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: KM */
/* loaded from: classes4.dex */
public final class C4398KM extends AbstractC4030JM {

    /* renamed from: a */
    public final AbstractC32563Eb5 f19463a;

    /* renamed from: b */
    public final AbstractC39268cf1<BirdMapMarker> f19464b;

    /* renamed from: c */
    public final AbstractC38675bf1<BirdMapMarker> f19465c;

    /* renamed from: d */
    public final AbstractC38675bf1<BirdMapMarker> f19466d;

    /* renamed from: e */
    public final AbstractC41861gz5 f19467e;

    /* renamed from: f */
    public final AbstractC41861gz5 f19468f;

    /* renamed from: KM$a */
    /* loaded from: classes4.dex */
    public class CallableC4399a implements Callable<List<BirdMapMarker>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f19469b;

        public CallableC4399a(C33265Hb5 c33265Hb5) {
            this.f19469b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<BirdMapMarker> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            Cursor m102673c = IF0.m102673c(C4398KM.this.f19463a, this.f19469b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "battery_level");
                int m41645e3 = C40824fF0.m41645e(m102673c, "location");
                int m41645e4 = C40824fF0.m41645e(m102673c, PaymentMethodOptionsParams.Blik.PARAM_CODE);
                int m41645e5 = C40824fF0.m41645e(m102673c, "fleet_marker");
                int m41645e6 = C40824fF0.m41645e(m102673c, "filter_hash");
                int m41645e7 = C40824fF0.m41645e(m102673c, "updated_at");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    int i = m102673c.getInt(m41645e2);
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    Geolocation m55276h = Converters.m55276h(string2);
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e5);
                    }
                    FleetMarker m55277g = Converters.m55277g(string4);
                    if (m102673c.isNull(m41645e6)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e7);
                    }
                    arrayList.add(new BirdMapMarker(string, i, m55276h, string3, m55277g, string5, Converters.m55278f(string6)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f19469b.release();
        }
    }

    /* renamed from: KM$b */
    /* loaded from: classes4.dex */
    public class C4400b extends AbstractC39268cf1<BirdMapMarker> {
        public C4400b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `bird_map_markers` (`id`,`battery_level`,`location`,`code`,`fleet_marker`,`filter_hash`,`updated_at`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BirdMapMarker birdMapMarker) {
            if (birdMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, birdMapMarker.getId());
            }
            interfaceC47496qV5.mo20956S0(2, birdMapMarker.getBatteryLevel());
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(birdMapMarker.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55271m);
            }
            if (birdMapMarker.getCode() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, birdMapMarker.getCode());
            }
            String m55273k = Converters.m55273k(birdMapMarker.getFleetMarker());
            if (m55273k == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55273k);
            }
            if (birdMapMarker.getFilterHash() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, birdMapMarker.getFilterHash());
            }
            String m55279e = Converters.m55279e(birdMapMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55279e);
            }
        }
    }

    /* renamed from: KM$c */
    /* loaded from: classes4.dex */
    public class C4401c extends AbstractC38675bf1<BirdMapMarker> {
        public C4401c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `bird_map_markers` WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, BirdMapMarker birdMapMarker) {
            if (birdMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, birdMapMarker.getId());
            }
        }
    }

    /* renamed from: KM$d */
    /* loaded from: classes4.dex */
    public class C4402d extends AbstractC38675bf1<BirdMapMarker> {
        public C4402d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `bird_map_markers` SET `id` = ?,`battery_level` = ?,`location` = ?,`code` = ?,`fleet_marker` = ?,`filter_hash` = ?,`updated_at` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, BirdMapMarker birdMapMarker) {
            if (birdMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, birdMapMarker.getId());
            }
            interfaceC47496qV5.mo20956S0(2, birdMapMarker.getBatteryLevel());
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(birdMapMarker.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55271m);
            }
            if (birdMapMarker.getCode() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, birdMapMarker.getCode());
            }
            String m55273k = Converters.m55273k(birdMapMarker.getFleetMarker());
            if (m55273k == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55273k);
            }
            if (birdMapMarker.getFilterHash() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, birdMapMarker.getFilterHash());
            }
            String m55279e = Converters.m55279e(birdMapMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55279e);
            }
            if (birdMapMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, birdMapMarker.getId());
            }
        }
    }

    /* renamed from: KM$e */
    /* loaded from: classes4.dex */
    public class C4403e extends AbstractC41861gz5 {
        public C4403e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bird_map_markers WHERE updated_at < ?";
        }
    }

    /* renamed from: KM$f */
    /* loaded from: classes4.dex */
    public class C4404f extends AbstractC41861gz5 {
        public C4404f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bird_map_markers";
        }
    }

    /* renamed from: KM$g */
    /* loaded from: classes4.dex */
    public class CallableC4405g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ DateTime f19476b;

        public CallableC4405g(DateTime dateTime) {
            this.f19476b = dateTime;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C4398KM.this.f19467e.m37254b();
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(this.f19476b);
            if (m55279e == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, m55279e);
            }
            C4398KM.this.f19463a.m108730c();
            try {
                m37254b.mo17482M();
                C4398KM.this.f19463a.m108734A();
                C4398KM.this.f19463a.m108728g();
                C4398KM.this.f19467e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C4398KM.this.f19463a.m108728g();
                C4398KM.this.f19467e.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: KM$h */
    /* loaded from: classes4.dex */
    public class CallableC4406h implements Callable<Void> {
        public CallableC4406h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C4398KM.this.f19468f.m37254b();
            C4398KM.this.f19463a.m108730c();
            try {
                m37254b.mo17482M();
                C4398KM.this.f19463a.m108734A();
                C4398KM.this.f19463a.m108728g();
                C4398KM.this.f19468f.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C4398KM.this.f19463a.m108728g();
                C4398KM.this.f19468f.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: KM$i */
    /* loaded from: classes4.dex */
    public class CallableC4407i implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f19479b;

        public CallableC4407i(C33265Hb5 c33265Hb5) {
            this.f19479b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            Integer num = null;
            Cursor m102673c = IF0.m102673c(C4398KM.this.f19463a, this.f19479b, false, null);
            try {
                if (m102673c.moveToFirst() && !m102673c.isNull(0)) {
                    num = Integer.valueOf(m102673c.getInt(0));
                }
                return num;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f19479b.release();
        }
    }

    public C4398KM(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f19463a = abstractC32563Eb5;
        this.f19464b = new C4400b(abstractC32563Eb5);
        this.f19465c = new C4401c(abstractC32563Eb5);
        this.f19466d = new C4402d(abstractC32563Eb5);
        this.f19467e = new C4403e(abstractC32563Eb5);
        this.f19468f = new C4404f(abstractC32563Eb5);
    }

    /* renamed from: r */
    public static List<Class<?>> m98984r() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: a */
    public AbstractC24490k<List<BirdMapMarker>> mo99001a(String str, int i) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bird_map_markers WHERE filter_hash = ? LIMIT 100 OFFSET ?", 2);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        m103680c.mo20956S0(2, i);
        return C37504Ze5.m72810a(this.f19463a, false, new String[]{"bird_map_markers"}, new CallableC4399a(m103680c));
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: b */
    public AbstractC23461c mo99000b() {
        return AbstractC23461c.m33078H(new CallableC4406h());
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: c */
    public AbstractC24490k<Integer> mo98999c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT COUNT(*) FROM bird_map_markers WHERE filter_hash = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72810a(this.f19463a, false, new String[]{"bird_map_markers"}, new CallableC4407i(m103680c));
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: d */
    public List<String> mo98998d(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `id` from bird_map_markers WHERE rowid in (");
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
        this.f19463a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f19463a, m103680c, false, null);
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

    @Override // p000.AbstractC4030JM
    /* renamed from: e */
    public List<Long> mo98997e(BirdMapMarker... birdMapMarkerArr) {
        this.f19463a.m108731b();
        this.f19463a.m108730c();
        try {
            List<Long> m61084o = this.f19464b.m61084o(birdMapMarkerArr);
            this.f19463a.m108734A();
            return m61084o;
        } finally {
            this.f19463a.m108728g();
        }
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: f */
    public List<BirdMapMarker> mo98996f() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT `bird_map_markers`.`id` AS `id`, `bird_map_markers`.`battery_level` AS `battery_level`, `bird_map_markers`.`location` AS `location`, `bird_map_markers`.`code` AS `code`, `bird_map_markers`.`fleet_marker` AS `fleet_marker`, `bird_map_markers`.`filter_hash` AS `filter_hash`, `bird_map_markers`.`updated_at` AS `updated_at` FROM bird_map_markers", 0);
        this.f19463a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f19463a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                int i = m102673c.getInt(1);
                if (m102673c.isNull(2)) {
                    string2 = null;
                } else {
                    string2 = m102673c.getString(2);
                }
                Geolocation m55276h = Converters.m55276h(string2);
                if (m102673c.isNull(3)) {
                    string3 = null;
                } else {
                    string3 = m102673c.getString(3);
                }
                if (m102673c.isNull(4)) {
                    string4 = null;
                } else {
                    string4 = m102673c.getString(4);
                }
                FleetMarker m55277g = Converters.m55277g(string4);
                if (m102673c.isNull(5)) {
                    string5 = null;
                } else {
                    string5 = m102673c.getString(5);
                }
                if (m102673c.isNull(6)) {
                    string6 = null;
                } else {
                    string6 = m102673c.getString(6);
                }
                arrayList.add(new BirdMapMarker(string, i, m55276h, string3, m55277g, string5, Converters.m55278f(string6)));
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: g */
    public void mo98995g(List<BirdMapMarker> list) {
        this.f19463a.m108731b();
        this.f19463a.m108730c();
        try {
            this.f19465c.m64206k(list);
            this.f19463a.m108734A();
        } finally {
            this.f19463a.m108728g();
        }
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: h */
    public void mo98994h(List<String> list) {
        this.f19463a.m108731b();
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("DELETE FROM bird_map_markers WHERE id NOT in (");
        C42725iS5.m33906a(m33905b, list.size());
        m33905b.append(")");
        InterfaceC47496qV5 m108729d = this.f19463a.m108729d(m33905b.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                m108729d.mo20954m1(i);
            } else {
                m108729d.mo20958G0(i, str);
            }
            i++;
        }
        this.f19463a.m108730c();
        try {
            m108729d.mo17482M();
            this.f19463a.m108734A();
        } finally {
            this.f19463a.m108728g();
        }
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: i */
    public AbstractC23461c mo98993i(DateTime dateTime) {
        return AbstractC23461c.m33078H(new CallableC4405g(dateTime));
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: j */
    public void mo98992j(List<String> list) {
        this.f19463a.m108730c();
        try {
            super.mo98992j(list);
            this.f19463a.m108734A();
        } finally {
            this.f19463a.m108728g();
        }
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: k */
    public void mo98991k(BirdMapMarker... birdMapMarkerArr) {
        this.f19463a.m108731b();
        this.f19463a.m108730c();
        try {
            this.f19466d.m64205l(birdMapMarkerArr);
            this.f19463a.m108734A();
        } finally {
            this.f19463a.m108728g();
        }
    }

    @Override // p000.AbstractC4030JM
    /* renamed from: l */
    public void mo98990l(BirdMapMarker... birdMapMarkerArr) {
        this.f19463a.m108730c();
        try {
            super.mo98990l(birdMapMarkerArr);
            this.f19463a.m108734A();
        } finally {
            this.f19463a.m108728g();
        }
    }
}
