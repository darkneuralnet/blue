package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.FleetList;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: xo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51826xo1 extends AbstractC51233wo1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f118143a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetList> f118144b;

    /* renamed from: c */
    public final AbstractC41861gz5 f118145c;

    /* renamed from: xo1$a */
    /* loaded from: classes4.dex */
    public class C30305a extends AbstractC39268cf1<FleetList> {
        public C30305a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `fleet_list` (`title`,`message`,`list`,`fleet_id`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetList fleetList) {
            if (fleetList.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, fleetList.getTitle());
            }
            C50660vq1 c50660vq1 = C50660vq1.f114779a;
            String m7939l = C50660vq1.m7939l(fleetList.getMessage());
            if (m7939l == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m7939l);
            }
            if (fleetList.getList() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, fleetList.getList());
            }
            if (fleetList.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, fleetList.getFleetId());
            }
        }
    }

    /* renamed from: xo1$b */
    /* loaded from: classes4.dex */
    public class C30306b extends AbstractC41861gz5 {
        public C30306b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_list";
        }
    }

    /* renamed from: xo1$c */
    /* loaded from: classes4.dex */
    public class CallableC30307c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ FleetList f118148b;

        public CallableC30307c(FleetList fleetList) {
            this.f118148b = fleetList;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C51826xo1.this.f118143a.m108730c();
            try {
                C51826xo1.this.f118144b.m61088k(this.f118148b);
                C51826xo1.this.f118143a.m108734A();
                C51826xo1.this.f118143a.m108728g();
                return null;
            } catch (Throwable th) {
                C51826xo1.this.f118143a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: xo1$d */
    /* loaded from: classes4.dex */
    public class CallableC30308d implements Callable<Void> {
        public CallableC30308d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51826xo1.this.f118145c.m37254b();
            C51826xo1.this.f118143a.m108730c();
            try {
                m37254b.mo17482M();
                C51826xo1.this.f118143a.m108734A();
                C51826xo1.this.f118143a.m108728g();
                C51826xo1.this.f118145c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51826xo1.this.f118143a.m108728g();
                C51826xo1.this.f118145c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: xo1$e */
    /* loaded from: classes4.dex */
    public class CallableC30309e implements Callable<FleetList> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118151b;

        public CallableC30309e(C33265Hb5 c33265Hb5) {
            this.f118151b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public FleetList call() throws Exception {
            String string;
            String string2;
            String string3;
            FleetList fleetList = null;
            String string4 = null;
            Cursor m102673c = IF0.m102673c(C51826xo1.this.f118143a, this.f118151b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "title");
                int m41645e2 = C40824fF0.m41645e(m102673c, "message");
                int m41645e3 = C40824fF0.m41645e(m102673c, "list");
                int m41645e4 = C40824fF0.m41645e(m102673c, "fleet_id");
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
                    FleetListMessage m7944g = C50660vq1.m7944g(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (!m102673c.isNull(m41645e4)) {
                        string4 = m102673c.getString(m41645e4);
                    }
                    fleetList = new FleetList(string, m7944g, string3, string4);
                }
                return fleetList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118151b.release();
        }
    }

    public C51826xo1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f118143a = abstractC32563Eb5;
        this.f118144b = new C30305a(abstractC32563Eb5);
        this.f118145c = new C30306b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m4645g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC51233wo1
    /* renamed from: a */
    public AbstractC23461c mo4651a() {
        return AbstractC23461c.m33078H(new CallableC30308d());
    }

    @Override // p000.AbstractC51233wo1
    /* renamed from: b */
    public Observable<FleetList> mo4650b(String str, String str2) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM fleet_list WHERE list = ? AND fleet_id = ?", 2);
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
        return C37504Ze5.m72808c(this.f118143a, false, new String[]{"fleet_list"}, new CallableC30309e(m103680c));
    }

    @Override // p000.AbstractC51233wo1
    /* renamed from: c */
    public AbstractC23461c mo4649c(FleetList fleetList) {
        return AbstractC23461c.m33078H(new CallableC30307c(fleetList));
    }
}
