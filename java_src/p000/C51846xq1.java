package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.nestedstructures.FleetStatusContent;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: xq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51846xq1 extends AbstractC51253wq1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f118206a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetStatus> f118207b;

    /* renamed from: c */
    public final AbstractC41861gz5 f118208c;

    /* renamed from: d */
    public final AbstractC41861gz5 f118209d;

    /* renamed from: xq1$a */
    /* loaded from: classes4.dex */
    public class C30321a extends AbstractC39268cf1<FleetStatus> {
        public C30321a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `fleet_status` (`id`,`fleet_id`,`title`,`prediction_id`,`label`,`show_back_button`,`back_button_label`,`content`,`created_at`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetStatus fleetStatus) {
            interfaceC47496qV5.mo20956S0(1, fleetStatus.getId());
            if (fleetStatus.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, fleetStatus.getFleetId());
            }
            if (fleetStatus.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, fleetStatus.getTitle());
            }
            if (fleetStatus.getPredictionId() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, fleetStatus.getPredictionId());
            }
            if (fleetStatus.getLabel() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, fleetStatus.getLabel());
            }
            interfaceC47496qV5.mo20956S0(6, fleetStatus.getShowBackButton() ? 1L : 0L);
            if (fleetStatus.getBackButtonLabel() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, fleetStatus.getBackButtonLabel());
            }
            C50660vq1 c50660vq1 = C50660vq1.f114779a;
            String m7937n = C50660vq1.m7937n(fleetStatus.getContent());
            if (m7937n == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m7937n);
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(fleetStatus.getCreatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m55279e);
            }
        }
    }

    /* renamed from: xq1$b */
    /* loaded from: classes4.dex */
    public class C30322b extends AbstractC41861gz5 {
        public C30322b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_status WHERE fleet_id = ? AND created_at < ?";
        }
    }

    /* renamed from: xq1$c */
    /* loaded from: classes4.dex */
    public class C30323c extends AbstractC41861gz5 {
        public C30323c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_status";
        }
    }

    /* renamed from: xq1$d */
    /* loaded from: classes4.dex */
    public class CallableC30324d implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ FleetStatus[] f118213b;

        public CallableC30324d(FleetStatus[] fleetStatusArr) {
            this.f118213b = fleetStatusArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C51846xq1.this.f118206a.m108730c();
            try {
                C51846xq1.this.f118207b.m61087l(this.f118213b);
                C51846xq1.this.f118206a.m108734A();
                C51846xq1.this.f118206a.m108728g();
                return null;
            } catch (Throwable th) {
                C51846xq1.this.f118206a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: xq1$e */
    /* loaded from: classes4.dex */
    public class CallableC30325e implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f118215b;

        /* renamed from: c */
        public final /* synthetic */ DateTime f118216c;

        public CallableC30325e(String str, DateTime dateTime) {
            this.f118215b = str;
            this.f118216c = dateTime;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51846xq1.this.f118208c.m37254b();
            String str = this.f118215b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(this.f118216c);
            if (m55279e == null) {
                m37254b.mo20954m1(2);
            } else {
                m37254b.mo20958G0(2, m55279e);
            }
            C51846xq1.this.f118206a.m108730c();
            try {
                m37254b.mo17482M();
                C51846xq1.this.f118206a.m108734A();
                C51846xq1.this.f118206a.m108728g();
                C51846xq1.this.f118208c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51846xq1.this.f118206a.m108728g();
                C51846xq1.this.f118208c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: xq1$f */
    /* loaded from: classes4.dex */
    public class CallableC30326f implements Callable<Void> {
        public CallableC30326f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51846xq1.this.f118209d.m37254b();
            C51846xq1.this.f118206a.m108730c();
            try {
                m37254b.mo17482M();
                C51846xq1.this.f118206a.m108734A();
                C51846xq1.this.f118206a.m108728g();
                C51846xq1.this.f118209d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51846xq1.this.f118206a.m108728g();
                C51846xq1.this.f118209d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: xq1$g */
    /* loaded from: classes4.dex */
    public class CallableC30327g implements Callable<List<FleetStatus>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118219b;

        public CallableC30327g(C33265Hb5 c33265Hb5) {
            this.f118219b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetStatus> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            boolean z;
            String string5;
            String string6;
            String string7;
            Cursor m102673c = IF0.m102673c(C51846xq1.this.f118206a, this.f118219b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "title");
                int m41645e4 = C40824fF0.m41645e(m102673c, "prediction_id");
                int m41645e5 = C40824fF0.m41645e(m102673c, "label");
                int m41645e6 = C40824fF0.m41645e(m102673c, "show_back_button");
                int m41645e7 = C40824fF0.m41645e(m102673c, "back_button_label");
                int m41645e8 = C40824fF0.m41645e(m102673c, "content");
                int m41645e9 = C40824fF0.m41645e(m102673c, "created_at");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    long j = m102673c.getLong(m41645e);
                    if (m102673c.isNull(m41645e2)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e2);
                    }
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
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
                    if (m102673c.getInt(m41645e6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e7);
                    }
                    if (m102673c.isNull(m41645e8)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e8);
                    }
                    FleetStatusContent m7942i = C50660vq1.m7942i(string6);
                    if (m102673c.isNull(m41645e9)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e9);
                    }
                    arrayList.add(new FleetStatus(j, string, string2, string3, string4, z, string5, m7942i, Converters.m55278f(string7)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118219b.release();
        }
    }

    /* renamed from: xq1$h */
    /* loaded from: classes4.dex */
    public class CallableC30328h implements Callable<List<FleetStatus>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118221b;

        public CallableC30328h(C33265Hb5 c33265Hb5) {
            this.f118221b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetStatus> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            boolean z;
            String string5;
            String string6;
            String string7;
            Cursor m102673c = IF0.m102673c(C51846xq1.this.f118206a, this.f118221b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "title");
                int m41645e4 = C40824fF0.m41645e(m102673c, "prediction_id");
                int m41645e5 = C40824fF0.m41645e(m102673c, "label");
                int m41645e6 = C40824fF0.m41645e(m102673c, "show_back_button");
                int m41645e7 = C40824fF0.m41645e(m102673c, "back_button_label");
                int m41645e8 = C40824fF0.m41645e(m102673c, "content");
                int m41645e9 = C40824fF0.m41645e(m102673c, "created_at");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    long j = m102673c.getLong(m41645e);
                    if (m102673c.isNull(m41645e2)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e2);
                    }
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
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
                    if (m102673c.getInt(m41645e6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e7);
                    }
                    if (m102673c.isNull(m41645e8)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e8);
                    }
                    FleetStatusContent m7942i = C50660vq1.m7942i(string6);
                    if (m102673c.isNull(m41645e9)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e9);
                    }
                    arrayList.add(new FleetStatus(j, string, string2, string3, string4, z, string5, m7942i, Converters.m55278f(string7)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118221b.release();
        }
    }

    public C51846xq1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f118206a = abstractC32563Eb5;
        this.f118207b = new C30321a(abstractC32563Eb5);
        this.f118208c = new C30322b(abstractC32563Eb5);
        this.f118209d = new C30323c(abstractC32563Eb5);
    }

    /* renamed from: j */
    public static List<Class<?>> m4574j() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC51253wq1
    /* renamed from: a */
    public AbstractC23461c mo4583a() {
        return AbstractC23461c.m33078H(new CallableC30326f());
    }

    @Override // p000.AbstractC51253wq1
    /* renamed from: b */
    public Observable<List<FleetStatus>> mo4582b(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM fleet_status WHERE fleet_id = ? AND prediction_id = 'NONE'", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f118206a, false, new String[]{"fleet_status"}, new CallableC30327g(m103680c));
    }

    @Override // p000.AbstractC51253wq1
    /* renamed from: c */
    public Observable<List<FleetStatus>> mo4581c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM fleet_status WHERE fleet_id = ? AND prediction_id != 'NONE' ORDER BY id", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f118206a, false, new String[]{"fleet_status"}, new CallableC30328h(m103680c));
    }

    @Override // p000.AbstractC51253wq1
    /* renamed from: d */
    public AbstractC23461c mo4580d(FleetStatus... fleetStatusArr) {
        return AbstractC23461c.m33078H(new CallableC30324d(fleetStatusArr));
    }

    @Override // p000.AbstractC51253wq1
    /* renamed from: e */
    public AbstractC23461c mo4579e(String str, DateTime dateTime) {
        return AbstractC23461c.m33078H(new CallableC30325e(str, dateTime));
    }
}
