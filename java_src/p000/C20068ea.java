package p000;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import co.bird.android.model.persistence.AnalyticsEntity;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: ea */
/* loaded from: classes4.dex */
public final class C20068ea extends AbstractC19796da {

    /* renamed from: a */
    public final AbstractC32563Eb5 f78557a;

    /* renamed from: b */
    public final AbstractC39268cf1<AnalyticsEntity> f78558b;

    /* renamed from: c */
    public final AbstractC38675bf1<AnalyticsEntity> f78559c;

    /* renamed from: ea$a */
    /* loaded from: classes4.dex */
    public class C20069a extends AbstractC39268cf1<AnalyticsEntity> {
        public C20069a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `analytics` (`id`,`name`,`properties`) VALUES (nullif(?, 0),?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, AnalyticsEntity analyticsEntity) {
            interfaceC47496qV5.mo20956S0(1, analyticsEntity.getId());
            if (analyticsEntity.getName() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, analyticsEntity.getName());
            }
            String m7314a = C50867wB0.m7314a(analyticsEntity.getProperties());
            if (m7314a == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m7314a);
            }
        }
    }

    /* renamed from: ea$b */
    /* loaded from: classes4.dex */
    public class C20070b extends AbstractC38675bf1<AnalyticsEntity> {
        public C20070b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `analytics` WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, AnalyticsEntity analyticsEntity) {
            interfaceC47496qV5.mo20956S0(1, analyticsEntity.getId());
        }
    }

    /* renamed from: ea$c */
    /* loaded from: classes4.dex */
    public class CallableC20071c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ AnalyticsEntity f78562b;

        public CallableC20071c(AnalyticsEntity analyticsEntity) {
            this.f78562b = analyticsEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C20068ea.this.f78557a.m108730c();
            try {
                C20068ea.this.f78558b.m61088k(this.f78562b);
                C20068ea.this.f78557a.m108734A();
                C20068ea.this.f78557a.m108728g();
                return null;
            } catch (Throwable th) {
                C20068ea.this.f78557a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: ea$d */
    /* loaded from: classes4.dex */
    public class CallableC20072d implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ List f78564b;

        public CallableC20072d(List list) {
            this.f78564b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            C20068ea.this.f78557a.m108730c();
            try {
                C20068ea.this.f78557a.m108734A();
                return Integer.valueOf(C20068ea.this.f78559c.m64206k(this.f78564b) + 0);
            } finally {
                C20068ea.this.f78557a.m108728g();
            }
        }
    }

    /* renamed from: ea$e */
    /* loaded from: classes4.dex */
    public class CallableC20073e implements Callable<List<AnalyticsEntity>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f78566b;

        public CallableC20073e(C33265Hb5 c33265Hb5) {
            this.f78566b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<AnalyticsEntity> call() throws Exception {
            String string;
            String string2;
            Cursor m102673c = IF0.m102673c(C20068ea.this.f78557a, this.f78566b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    int i = m102673c.getInt(0);
                    if (m102673c.isNull(1)) {
                        string = null;
                    } else {
                        string = m102673c.getString(1);
                    }
                    if (m102673c.isNull(2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(2);
                    }
                    arrayList.add(new AnalyticsEntity(i, string, C50867wB0.m7313b(string2)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f78566b.release();
        }
    }

    /* renamed from: ea$f */
    /* loaded from: classes4.dex */
    public class CallableC20074f implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f78568b;

        public CallableC20074f(C33265Hb5 c33265Hb5) {
            this.f78568b = c33265Hb5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
            return r3;
         */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Integer call() throws Exception {
            Integer num = null;
            Cursor m102673c = IF0.m102673c(C20068ea.this.f78557a, this.f78568b, false, null);
            try {
                if (m102673c.moveToFirst() && !m102673c.isNull(0)) {
                    num = Integer.valueOf(m102673c.getInt(0));
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.f78568b.mo19174a());
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f78568b.release();
        }
    }

    public C20068ea(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f78557a = abstractC32563Eb5;
        this.f78558b = new C20069a(abstractC32563Eb5);
        this.f78559c = new C20070b(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m42749h() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC19796da
    /* renamed from: a */
    public AbstractC23442F<Integer> mo42756a(List<AnalyticsEntity> list) {
        return AbstractC23442F.m33161E(new CallableC20072d(list));
    }

    @Override // p000.AbstractC19796da
    /* renamed from: b */
    public AbstractC23442F<Integer> mo42755b() {
        return C37504Ze5.m72806e(new CallableC20074f(C33265Hb5.m103680c("SELECT COUNT(id) FROM analytics", 0)));
    }

    @Override // p000.AbstractC19796da
    /* renamed from: c */
    public AbstractC23442F<List<AnalyticsEntity>> mo42754c() {
        return C37504Ze5.m72806e(new CallableC20073e(C33265Hb5.m103680c("SELECT `analytics`.`id` AS `id`, `analytics`.`name` AS `name`, `analytics`.`properties` AS `properties` FROM analytics", 0)));
    }

    @Override // p000.AbstractC19796da
    /* renamed from: d */
    public AbstractC23461c mo42753d(AnalyticsEntity analyticsEntity) {
        return AbstractC23461c.m33078H(new CallableC20071c(analyticsEntity));
    }
}
