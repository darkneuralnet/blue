package p000;

import android.database.Cursor;
import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: TL1 */
/* loaded from: classes4.dex */
public final class TL1 extends SL1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f35335a;

    /* renamed from: b */
    public final AbstractC39268cf1<HibernationSessionVehicle> f35336b;

    /* renamed from: c */
    public final AbstractC38675bf1<HibernationSessionVehicle> f35337c;

    /* renamed from: d */
    public final AbstractC41861gz5 f35338d;

    /* renamed from: e */
    public final AbstractC41861gz5 f35339e;

    /* renamed from: TL1$a */
    /* loaded from: classes4.dex */
    public class C7808a extends AbstractC39268cf1<HibernationSessionVehicle> {
        public C7808a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `hibernation` (`bird_id`,`category`,`title`,`retry_message`,`info_message`) VALUES (?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, HibernationSessionVehicle hibernationSessionVehicle) {
            if (hibernationSessionVehicle.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, hibernationSessionVehicle.getBirdId());
            }
            RL1 rl1 = RL1.f31913a;
            String m86837b = RL1.m86837b(hibernationSessionVehicle.getCategory());
            if (m86837b == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m86837b);
            }
            if (hibernationSessionVehicle.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, hibernationSessionVehicle.getTitle());
            }
            if (hibernationSessionVehicle.getRetryMessage() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, hibernationSessionVehicle.getRetryMessage());
            }
            String m86836c = RL1.m86836c(hibernationSessionVehicle.getInfoMessage());
            if (m86836c == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m86836c);
            }
        }
    }

    /* renamed from: TL1$b */
    /* loaded from: classes4.dex */
    public class C7809b extends AbstractC38675bf1<HibernationSessionVehicle> {
        public C7809b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `hibernation` SET `bird_id` = ?,`category` = ?,`title` = ?,`retry_message` = ?,`info_message` = ? WHERE `bird_id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, HibernationSessionVehicle hibernationSessionVehicle) {
            if (hibernationSessionVehicle.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, hibernationSessionVehicle.getBirdId());
            }
            RL1 rl1 = RL1.f31913a;
            String m86837b = RL1.m86837b(hibernationSessionVehicle.getCategory());
            if (m86837b == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m86837b);
            }
            if (hibernationSessionVehicle.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, hibernationSessionVehicle.getTitle());
            }
            if (hibernationSessionVehicle.getRetryMessage() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, hibernationSessionVehicle.getRetryMessage());
            }
            String m86836c = RL1.m86836c(hibernationSessionVehicle.getInfoMessage());
            if (m86836c == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m86836c);
            }
            if (hibernationSessionVehicle.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, hibernationSessionVehicle.getBirdId());
            }
        }
    }

    /* renamed from: TL1$c */
    /* loaded from: classes4.dex */
    public class C7810c extends AbstractC41861gz5 {
        public C7810c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `hibernation`";
        }
    }

    /* renamed from: TL1$d */
    /* loaded from: classes4.dex */
    public class C7811d extends AbstractC41861gz5 {
        public C7811d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM hibernation";
        }
    }

    /* renamed from: TL1$e */
    /* loaded from: classes4.dex */
    public class CallableC7812e implements Callable<Void> {
        public CallableC7812e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = TL1.this.f35338d.m37254b();
            TL1.this.f35335a.m108730c();
            try {
                m37254b.mo17482M();
                TL1.this.f35335a.m108734A();
                TL1.this.f35335a.m108728g();
                TL1.this.f35338d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                TL1.this.f35335a.m108728g();
                TL1.this.f35338d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: TL1$f */
    /* loaded from: classes4.dex */
    public class CallableC7813f implements Callable<Void> {
        public CallableC7813f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = TL1.this.f35339e.m37254b();
            TL1.this.f35335a.m108730c();
            try {
                m37254b.mo17482M();
                TL1.this.f35335a.m108734A();
                TL1.this.f35335a.m108728g();
                TL1.this.f35339e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                TL1.this.f35335a.m108728g();
                TL1.this.f35339e.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: TL1$g */
    /* loaded from: classes4.dex */
    public class CallableC7814g implements Callable<List<HibernationSessionVehicle>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f35346b;

        public CallableC7814g(C33265Hb5 c33265Hb5) {
            this.f35346b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<HibernationSessionVehicle> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Cursor m102673c = IF0.m102673c(TL1.this.f35335a, this.f35346b, false, null);
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
                    VehicleHibernationCategory m86835d = RL1.m86835d(string2);
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
                    if (m102673c.isNull(4)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(4);
                    }
                    arrayList.add(new HibernationSessionVehicle(string, m86835d, string3, string4, RL1.m86838a(string5)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f35346b.release();
        }
    }

    public TL1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f35335a = abstractC32563Eb5;
        this.f35336b = new C7808a(abstractC32563Eb5);
        this.f35337c = new C7809b(abstractC32563Eb5);
        this.f35338d = new C7810c(abstractC32563Eb5);
        this.f35339e = new C7811d(abstractC32563Eb5);
    }

    /* renamed from: l */
    public static List<Class<?>> m83758l() {
        return Collections.emptyList();
    }

    @Override // p000.SL1
    /* renamed from: a */
    public AbstractC23461c mo83769a() {
        return AbstractC23461c.m33078H(new CallableC7813f());
    }

    @Override // p000.SL1
    /* renamed from: b */
    public AbstractC23461c mo83768b() {
        return AbstractC23461c.m33078H(new CallableC7812e());
    }

    @Override // p000.SL1
    /* renamed from: c */
    public Observable<List<HibernationSessionVehicle>> mo83767c() {
        return C37504Ze5.m72808c(this.f35335a, false, new String[]{"hibernation"}, new CallableC7814g(C33265Hb5.m103680c("SELECT `hibernation`.`bird_id` AS `bird_id`, `hibernation`.`category` AS `category`, `hibernation`.`title` AS `title`, `hibernation`.`retry_message` AS `retry_message`, `hibernation`.`info_message` AS `info_message` FROM `hibernation`", 0)));
    }

    @Override // p000.SL1
    /* renamed from: d */
    public List<String> mo83766d(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `bird_id` FROM `hibernation` WHERE rowid in (");
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
        this.f35335a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f35335a, m103680c, false, null);
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

    @Override // p000.SL1
    /* renamed from: e */
    public List<Long> mo83765e(List<HibernationSessionVehicle> list) {
        this.f35335a.m108731b();
        this.f35335a.m108730c();
        try {
            List<Long> m61085n = this.f35336b.m61085n(list);
            this.f35335a.m108734A();
            return m61085n;
        } finally {
            this.f35335a.m108728g();
        }
    }

    @Override // p000.SL1
    /* renamed from: f */
    public void mo83764f(List<HibernationSessionVehicle> list) {
        this.f35335a.m108731b();
        this.f35335a.m108730c();
        try {
            this.f35337c.m64206k(list);
            this.f35335a.m108734A();
        } finally {
            this.f35335a.m108728g();
        }
    }

    @Override // p000.SL1
    /* renamed from: g */
    public void mo83763g(List<HibernationSessionVehicle> list) {
        this.f35335a.m108730c();
        try {
            super.mo83763g(list);
            this.f35335a.m108734A();
        } finally {
            this.f35335a.m108728g();
        }
    }
}
