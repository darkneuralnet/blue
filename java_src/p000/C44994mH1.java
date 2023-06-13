package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.HardCountScan;
import co.bird.android.persistence.common.impl.Converters;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: mH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44994mH1 extends AbstractC44401lH1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f97747a;

    /* renamed from: b */
    public final AbstractC39268cf1<HardCountScan> f97748b;

    /* renamed from: c */
    public final AbstractC41861gz5 f97749c;

    /* renamed from: d */
    public final AbstractC41861gz5 f97750d;

    /* renamed from: mH1$a */
    /* loaded from: classes4.dex */
    public class CallableC26027a implements Callable<HardCountScan> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97751b;

        public CallableC26027a(C33265Hb5 c33265Hb5) {
            this.f97751b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public HardCountScan call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            boolean z = false;
            HardCountScan hardCountScan = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C44994mH1.this.f97747a, this.f97751b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, AnalyticsFields.SESSION_ID);
                int m41645e4 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e5 = C40824fF0.m41645e(m102673c, RequestHeadersFactory.MODEL);
                int m41645e6 = C40824fF0.m41645e(m102673c, "model_version_title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "scanned_at");
                int m41645e8 = C40824fF0.m41645e(m102673c, "lap_id");
                int m41645e9 = C40824fF0.m41645e(m102673c, "completed");
                if (m102673c.moveToFirst()) {
                    int i = m102673c.getInt(m41645e);
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
                    if (m102673c.isNull(m41645e6)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e6);
                    }
                    if (!m102673c.isNull(m41645e7)) {
                        string6 = m102673c.getString(m41645e7);
                    }
                    DateTime m55278f = Converters.m55278f(string6);
                    long j = m102673c.getLong(m41645e8);
                    if (m102673c.getInt(m41645e9) != 0) {
                        z = true;
                    }
                    hardCountScan = new HardCountScan(i, string, string2, string3, string4, string5, m55278f, j, z);
                }
                return hardCountScan;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97751b.release();
        }
    }

    /* renamed from: mH1$b */
    /* loaded from: classes4.dex */
    public class C26028b extends AbstractC39268cf1<HardCountScan> {
        public C26028b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `hard_count_scan` (`id`,`bird_id`,`session_id`,`scan_identifier`,`model`,`model_version_title`,`scanned_at`,`lap_id`,`completed`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, HardCountScan hardCountScan) {
            interfaceC47496qV5.mo20956S0(1, hardCountScan.getId());
            if (hardCountScan.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, hardCountScan.getBirdId());
            }
            if (hardCountScan.getSessionId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, hardCountScan.getSessionId());
            }
            if (hardCountScan.getScanIdentifier() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, hardCountScan.getScanIdentifier());
            }
            if (hardCountScan.getModel() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, hardCountScan.getModel());
            }
            if (hardCountScan.getModelVersionTitle() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, hardCountScan.getModelVersionTitle());
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(hardCountScan.getScannedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55279e);
            }
            interfaceC47496qV5.mo20956S0(8, hardCountScan.getLapId());
            interfaceC47496qV5.mo20956S0(9, hardCountScan.getCompleted() ? 1L : 0L);
        }
    }

    /* renamed from: mH1$c */
    /* loaded from: classes4.dex */
    public class C26029c extends AbstractC41861gz5 {
        public C26029c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM hard_count_scan WHERE session_id != ?";
        }
    }

    /* renamed from: mH1$d */
    /* loaded from: classes4.dex */
    public class C26030d extends AbstractC41861gz5 {
        public C26030d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM hard_count_scan WHERE session_id = ?";
        }
    }

    /* renamed from: mH1$e */
    /* loaded from: classes4.dex */
    public class CallableC26031e implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ HardCountScan f97756b;

        public CallableC26031e(HardCountScan hardCountScan) {
            this.f97756b = hardCountScan;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C44994mH1.this.f97747a.m108730c();
            try {
                C44994mH1.this.f97748b.m61088k(this.f97756b);
                C44994mH1.this.f97747a.m108734A();
                C44994mH1.this.f97747a.m108728g();
                return null;
            } catch (Throwable th) {
                C44994mH1.this.f97747a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: mH1$f */
    /* loaded from: classes4.dex */
    public class CallableC26032f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f97758b;

        public CallableC26032f(String str) {
            this.f97758b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C44994mH1.this.f97749c.m37254b();
            String str = this.f97758b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            C44994mH1.this.f97747a.m108730c();
            try {
                m37254b.mo17482M();
                C44994mH1.this.f97747a.m108734A();
                C44994mH1.this.f97747a.m108728g();
                C44994mH1.this.f97749c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C44994mH1.this.f97747a.m108728g();
                C44994mH1.this.f97749c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: mH1$g */
    /* loaded from: classes4.dex */
    public class CallableC26033g implements Callable<HardCountScan> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97760b;

        public CallableC26033g(C33265Hb5 c33265Hb5) {
            this.f97760b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public HardCountScan call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            boolean z = false;
            HardCountScan hardCountScan = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C44994mH1.this.f97747a, this.f97760b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, AnalyticsFields.SESSION_ID);
                int m41645e4 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e5 = C40824fF0.m41645e(m102673c, RequestHeadersFactory.MODEL);
                int m41645e6 = C40824fF0.m41645e(m102673c, "model_version_title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "scanned_at");
                int m41645e8 = C40824fF0.m41645e(m102673c, "lap_id");
                int m41645e9 = C40824fF0.m41645e(m102673c, "completed");
                if (m102673c.moveToFirst()) {
                    int i = m102673c.getInt(m41645e);
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
                    if (m102673c.isNull(m41645e6)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e6);
                    }
                    if (!m102673c.isNull(m41645e7)) {
                        string6 = m102673c.getString(m41645e7);
                    }
                    DateTime m55278f = Converters.m55278f(string6);
                    long j = m102673c.getLong(m41645e8);
                    if (m102673c.getInt(m41645e9) != 0) {
                        z = true;
                    }
                    hardCountScan = new HardCountScan(i, string, string2, string3, string4, string5, m55278f, j, z);
                }
                return hardCountScan;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97760b.release();
        }
    }

    /* renamed from: mH1$h */
    /* loaded from: classes4.dex */
    public class CallableC26034h implements Callable<HardCountScan> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97762b;

        public CallableC26034h(C33265Hb5 c33265Hb5) {
            this.f97762b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public HardCountScan call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            boolean z = false;
            HardCountScan hardCountScan = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C44994mH1.this.f97747a, this.f97762b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, AnalyticsFields.SESSION_ID);
                int m41645e4 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e5 = C40824fF0.m41645e(m102673c, RequestHeadersFactory.MODEL);
                int m41645e6 = C40824fF0.m41645e(m102673c, "model_version_title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "scanned_at");
                int m41645e8 = C40824fF0.m41645e(m102673c, "lap_id");
                int m41645e9 = C40824fF0.m41645e(m102673c, "completed");
                if (m102673c.moveToFirst()) {
                    int i = m102673c.getInt(m41645e);
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
                    if (m102673c.isNull(m41645e6)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e6);
                    }
                    if (!m102673c.isNull(m41645e7)) {
                        string6 = m102673c.getString(m41645e7);
                    }
                    DateTime m55278f = Converters.m55278f(string6);
                    long j = m102673c.getLong(m41645e8);
                    if (m102673c.getInt(m41645e9) != 0) {
                        z = true;
                    }
                    hardCountScan = new HardCountScan(i, string, string2, string3, string4, string5, m55278f, j, z);
                }
                return hardCountScan;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97762b.release();
        }
    }

    /* renamed from: mH1$i */
    /* loaded from: classes4.dex */
    public class CallableC26035i implements Callable<List<HardCountScan>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97764b;

        public CallableC26035i(C33265Hb5 c33265Hb5) {
            this.f97764b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<HardCountScan> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            boolean z;
            Cursor m102673c = IF0.m102673c(C44994mH1.this.f97747a, this.f97764b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, AnalyticsFields.SESSION_ID);
                int m41645e4 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e5 = C40824fF0.m41645e(m102673c, RequestHeadersFactory.MODEL);
                int m41645e6 = C40824fF0.m41645e(m102673c, "model_version_title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "scanned_at");
                int m41645e8 = C40824fF0.m41645e(m102673c, "lap_id");
                int m41645e9 = C40824fF0.m41645e(m102673c, "completed");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    int i = m102673c.getInt(m41645e);
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
                    DateTime m55278f = Converters.m55278f(string6);
                    long j = m102673c.getLong(m41645e8);
                    if (m102673c.getInt(m41645e9) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new HardCountScan(i, string, string2, string3, string4, string5, m55278f, j, z));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97764b.release();
        }
    }

    public C44994mH1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f97747a = abstractC32563Eb5;
        this.f97748b = new C26028b(abstractC32563Eb5);
        this.f97749c = new C26029c(abstractC32563Eb5);
        this.f97750d = new C26030d(abstractC32563Eb5);
    }

    /* renamed from: j */
    public static List<Class<?>> m25848j() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC44401lH1
    /* renamed from: a */
    public AbstractC23461c mo25857a(String str) {
        return AbstractC23461c.m33078H(new CallableC26032f(str));
    }

    @Override // p000.AbstractC44401lH1
    /* renamed from: b */
    public AbstractC24490k<List<HardCountScan>> mo25856b(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM hard_count_scan WHERE session_id  = ? AND completed = 1", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72810a(this.f97747a, false, new String[]{"hard_count_scan"}, new CallableC26035i(m103680c));
    }

    @Override // p000.AbstractC44401lH1
    /* renamed from: c */
    public AbstractC24507p<HardCountScan> mo25855c(String str, String str2) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM hard_count_scan WHERE session_id  = ? AND bird_id = ?", 2);
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
        return AbstractC24507p.m32071D(new CallableC26033g(m103680c));
    }

    @Override // p000.AbstractC44401lH1
    /* renamed from: d */
    public AbstractC24507p<HardCountScan> mo25854d(String str, String str2) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM hard_count_scan WHERE session_id  = ? AND scan_identifier = ?", 2);
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
        return AbstractC24507p.m32071D(new CallableC26034h(m103680c));
    }

    @Override // p000.AbstractC44401lH1
    /* renamed from: e */
    public AbstractC23461c mo25853e(HardCountScan hardCountScan) {
        return AbstractC23461c.m33078H(new CallableC26031e(hardCountScan));
    }

    @Override // p000.AbstractC44401lH1
    /* renamed from: f */
    public Observable<HardCountScan> mo25852f(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM hard_count_scan WHERE session_id  = ? AND completed = 1 ORDER BY scanned_at DESC LIMIT 1", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f97747a, false, new String[]{"hard_count_scan"}, new CallableC26027a(m103680c));
    }
}
