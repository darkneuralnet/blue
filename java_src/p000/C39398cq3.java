package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: cq3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39398cq3 extends AbstractC38787bq3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f75697a;

    /* renamed from: b */
    public final AbstractC39268cf1<OperatorOrderViewSection> f75698b;

    /* renamed from: c */
    public final AbstractC41861gz5 f75699c;

    /* renamed from: cq3$a */
    /* loaded from: classes4.dex */
    public class C19616a extends AbstractC39268cf1<OperatorOrderViewSection> {
        public C19616a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `operator_order_section` (`title`,`idx`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorOrderViewSection operatorOrderViewSection) {
            if (operatorOrderViewSection.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorOrderViewSection.getTitle());
            }
            interfaceC47496qV5.mo20956S0(2, operatorOrderViewSection.getIdx());
        }
    }

    /* renamed from: cq3$b */
    /* loaded from: classes4.dex */
    public class C19617b extends AbstractC41861gz5 {
        public C19617b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `operator_order_section`";
        }
    }

    /* renamed from: cq3$c */
    /* loaded from: classes4.dex */
    public class CallableC19618c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f75702b;

        public CallableC19618c(List list) {
            this.f75702b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C39398cq3.this.f75697a.m108730c();
            try {
                C39398cq3.this.f75698b.m61089j(this.f75702b);
                C39398cq3.this.f75697a.m108734A();
                C39398cq3.this.f75697a.m108728g();
                return null;
            } catch (Throwable th) {
                C39398cq3.this.f75697a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: cq3$d */
    /* loaded from: classes4.dex */
    public class CallableC19619d implements Callable<Void> {
        public CallableC19619d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C39398cq3.this.f75699c.m37254b();
            C39398cq3.this.f75697a.m108730c();
            try {
                m37254b.mo17482M();
                C39398cq3.this.f75697a.m108734A();
                C39398cq3.this.f75697a.m108728g();
                C39398cq3.this.f75699c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C39398cq3.this.f75697a.m108728g();
                C39398cq3.this.f75699c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: cq3$e */
    /* loaded from: classes4.dex */
    public class CallableC19620e implements Callable<List<OperatorOrderViewSection>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f75705b;

        public CallableC19620e(C33265Hb5 c33265Hb5) {
            this.f75705b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorOrderViewSection> call() throws Exception {
            String string;
            Cursor m102673c = IF0.m102673c(C39398cq3.this.f75697a, this.f75705b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    arrayList.add(new OperatorOrderViewSection(string, m102673c.getInt(1)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f75705b.release();
        }
    }

    /* renamed from: cq3$f */
    /* loaded from: classes4.dex */
    public class CallableC19621f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f75707b;

        public CallableC19621f(List list) {
            this.f75707b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM `operator_order_section` WHERE title NOT IN (");
            C42725iS5.m33906a(m33905b, this.f75707b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C39398cq3.this.f75697a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f75707b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C39398cq3.this.f75697a.m108730c();
            try {
                m108729d.mo17482M();
                C39398cq3.this.f75697a.m108734A();
                C39398cq3.this.f75697a.m108728g();
                return null;
            } catch (Throwable th) {
                C39398cq3.this.f75697a.m108728g();
                throw th;
            }
        }
    }

    public C39398cq3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f75697a = abstractC32563Eb5;
        this.f75698b = new C19616a(abstractC32563Eb5);
        this.f75699c = new C19617b(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m44983h() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC38787bq3
    /* renamed from: a */
    public AbstractC23461c mo44990a() {
        return AbstractC23461c.m33078H(new CallableC19619d());
    }

    @Override // p000.AbstractC38787bq3
    /* renamed from: b */
    public AbstractC23461c mo44989b(List<OperatorOrderViewSection> list) {
        return AbstractC23461c.m33078H(new CallableC19618c(list));
    }

    @Override // p000.AbstractC38787bq3
    /* renamed from: c */
    public Observable<List<OperatorOrderViewSection>> mo44988c() {
        return C37504Ze5.m72808c(this.f75697a, false, new String[]{"operator_order_section"}, new CallableC19620e(C33265Hb5.m103680c("SELECT `operator_order_section`.`title` AS `title`, `operator_order_section`.`idx` AS `idx` FROM `operator_order_section`", 0)));
    }

    @Override // p000.AbstractC38787bq3
    /* renamed from: d */
    public AbstractC23461c mo44987d(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC19621f(list));
    }
}
