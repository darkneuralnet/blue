package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.persistence.nestedstructures.OrderItemViewDetail;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: ip5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42947ip5 extends AbstractC42354hp5 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f91357a;

    /* renamed from: b */
    public final AbstractC39268cf1<ScrapOrderView> f91358b;

    /* renamed from: c */
    public final AbstractC41861gz5 f91359c;

    /* renamed from: ip5$a */
    /* loaded from: classes4.dex */
    public class C24595a extends AbstractC39268cf1<ScrapOrderView> {
        public C24595a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `scrap_order` (`order_id`,`container_order_id`,`details`,`quantity`,`bol_uploaded`,`bol_status_text`,`bol_status_color`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ScrapOrderView scrapOrderView) {
            Integer valueOf;
            if (scrapOrderView.getOrderId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, scrapOrderView.getOrderId());
            }
            if (scrapOrderView.getContainerOrderId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, scrapOrderView.getContainerOrderId());
            }
            C41761gp5 c41761gp5 = C41761gp5.f84332a;
            String m37441b = C41761gp5.m37441b(scrapOrderView.getDetails());
            if (m37441b == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m37441b);
            }
            interfaceC47496qV5.mo20956S0(4, scrapOrderView.getQuantity());
            if (scrapOrderView.getBolUploaded() == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(scrapOrderView.getBolUploaded().booleanValue() ? 1 : 0);
            }
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20956S0(5, valueOf.intValue());
            }
            if (scrapOrderView.getBolStatusText() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, scrapOrderView.getBolStatusText());
            }
            Converters converters = Converters.f66822a;
            String m55270n = Converters.m55270n(scrapOrderView.getBolStatusColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55270n);
            }
        }
    }

    /* renamed from: ip5$b */
    /* loaded from: classes4.dex */
    public class C24596b extends AbstractC41861gz5 {
        public C24596b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `scrap_order`";
        }
    }

    /* renamed from: ip5$c */
    /* loaded from: classes4.dex */
    public class CallableC24597c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f91362b;

        public CallableC24597c(List list) {
            this.f91362b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C42947ip5.this.f91357a.m108730c();
            try {
                C42947ip5.this.f91358b.m61089j(this.f91362b);
                C42947ip5.this.f91357a.m108734A();
                C42947ip5.this.f91357a.m108728g();
                return null;
            } catch (Throwable th) {
                C42947ip5.this.f91357a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: ip5$d */
    /* loaded from: classes4.dex */
    public class CallableC24598d implements Callable<Void> {
        public CallableC24598d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C42947ip5.this.f91359c.m37254b();
            C42947ip5.this.f91357a.m108730c();
            try {
                m37254b.mo17482M();
                C42947ip5.this.f91357a.m108734A();
                C42947ip5.this.f91357a.m108728g();
                C42947ip5.this.f91359c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C42947ip5.this.f91357a.m108728g();
                C42947ip5.this.f91359c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: ip5$e */
    /* loaded from: classes4.dex */
    public class CallableC24599e implements Callable<List<ScrapOrderView>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f91365b;

        public CallableC24599e(C33265Hb5 c33265Hb5) {
            this.f91365b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<ScrapOrderView> call() throws Exception {
            String string;
            String string2;
            String string3;
            Integer valueOf;
            Boolean valueOf2;
            String string4;
            String string5;
            Cursor m102673c = IF0.m102673c(C42947ip5.this.f91357a, this.f91365b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    boolean z = true;
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
                    List<OrderItemViewDetail> m37440c = C41761gp5.m37440c(string3);
                    int i = m102673c.getInt(3);
                    if (m102673c.isNull(4)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(4));
                    }
                    if (valueOf == null) {
                        valueOf2 = null;
                    } else {
                        if (valueOf.intValue() == 0) {
                            z = false;
                        }
                        valueOf2 = Boolean.valueOf(z);
                    }
                    if (m102673c.isNull(5)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(5);
                    }
                    if (m102673c.isNull(6)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(6);
                    }
                    arrayList.add(new ScrapOrderView(string, string2, m37440c, i, valueOf2, string4, Converters.m55266r(string5)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f91365b.release();
        }
    }

    /* renamed from: ip5$f */
    /* loaded from: classes4.dex */
    public class CallableC24600f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f91367b;

        public CallableC24600f(List list) {
            this.f91367b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM `scrap_order` where order_id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f91367b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C42947ip5.this.f91357a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f91367b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C42947ip5.this.f91357a.m108730c();
            try {
                m108729d.mo17482M();
                C42947ip5.this.f91357a.m108734A();
                C42947ip5.this.f91357a.m108728g();
                return null;
            } catch (Throwable th) {
                C42947ip5.this.f91357a.m108728g();
                throw th;
            }
        }
    }

    public C42947ip5(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f91357a = abstractC32563Eb5;
        this.f91358b = new C24595a(abstractC32563Eb5);
        this.f91359c = new C24596b(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m31771h() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC42354hp5
    /* renamed from: a */
    public AbstractC23461c mo31778a() {
        return AbstractC23461c.m33078H(new CallableC24598d());
    }

    @Override // p000.AbstractC42354hp5
    /* renamed from: b */
    public AbstractC23461c mo31777b(List<ScrapOrderView> list) {
        return AbstractC23461c.m33078H(new CallableC24597c(list));
    }

    @Override // p000.AbstractC42354hp5
    /* renamed from: c */
    public Observable<List<ScrapOrderView>> mo31776c() {
        return C37504Ze5.m72808c(this.f91357a, false, new String[]{"scrap_order"}, new CallableC24599e(C33265Hb5.m103680c("SELECT `scrap_order`.`order_id` AS `order_id`, `scrap_order`.`container_order_id` AS `container_order_id`, `scrap_order`.`details` AS `details`, `scrap_order`.`quantity` AS `quantity`, `scrap_order`.`bol_uploaded` AS `bol_uploaded`, `scrap_order`.`bol_status_text` AS `bol_status_text`, `scrap_order`.`bol_status_color` AS `bol_status_color` FROM `scrap_order`", 0)));
    }

    @Override // p000.AbstractC42354hp5
    /* renamed from: d */
    public AbstractC23461c mo31775d(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC24600f(list));
    }
}
