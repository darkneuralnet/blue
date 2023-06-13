package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.PendingScanEntity;
import co.bird.android.model.persistence.UnidentifiedScanEntity;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: jF1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43197jF1 extends AbstractC42604iF1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f92348a;

    /* renamed from: b */
    public final AbstractC39268cf1<PendingScanEntity> f92349b;

    /* renamed from: c */
    public final AbstractC39268cf1<UnidentifiedScanEntity> f92350c;

    /* renamed from: d */
    public final AbstractC41861gz5 f92351d;

    /* renamed from: e */
    public final AbstractC41861gz5 f92352e;

    /* renamed from: jF1$a */
    /* loaded from: classes4.dex */
    public class CallableC24751a implements Callable<List<PendingScanEntity>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f92353b;

        public CallableC24751a(C33265Hb5 c33265Hb5) {
            this.f92353b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<PendingScanEntity> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(C43197jF1.this.f92348a, this.f92353b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "hard_count_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e4 = C40824fF0.m41645e(m102673c, "previous_identifier");
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
                    arrayList.add(new PendingScanEntity(i, string, string2, string3));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f92353b.release();
        }
    }

    /* renamed from: jF1$b */
    /* loaded from: classes4.dex */
    public class CallableC24752b implements Callable<List<UnidentifiedScanEntity>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f92355b;

        public CallableC24752b(C33265Hb5 c33265Hb5) {
            this.f92355b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<UnidentifiedScanEntity> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(C43197jF1.this.f92348a, this.f92355b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "hard_count_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e4 = C40824fF0.m41645e(m102673c, "scan_error_code");
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
                    arrayList.add(new UnidentifiedScanEntity(i, string, string2, C42011hF1.m36578a(string3)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f92355b.release();
        }
    }

    /* renamed from: jF1$c */
    /* loaded from: classes4.dex */
    public class CallableC24753c implements Callable<List<UnidentifiedScanEntity>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f92357b;

        public CallableC24753c(C33265Hb5 c33265Hb5) {
            this.f92357b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<UnidentifiedScanEntity> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(C43197jF1.this.f92348a, this.f92357b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "hard_count_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e4 = C40824fF0.m41645e(m102673c, "scan_error_code");
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
                    arrayList.add(new UnidentifiedScanEntity(i, string, string2, C42011hF1.m36578a(string3)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f92357b.release();
        }
    }

    /* renamed from: jF1$d */
    /* loaded from: classes4.dex */
    public class C24754d extends AbstractC39268cf1<PendingScanEntity> {
        public C24754d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `pending_scan_hard_count` (`id`,`hard_count_id`,`scan_identifier`,`previous_identifier`) VALUES (nullif(?, 0),?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, PendingScanEntity pendingScanEntity) {
            interfaceC47496qV5.mo20956S0(1, pendingScanEntity.getId());
            if (pendingScanEntity.getHardCountId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, pendingScanEntity.getHardCountId());
            }
            if (pendingScanEntity.getScanIdentifier() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, pendingScanEntity.getScanIdentifier());
            }
            if (pendingScanEntity.getPreviousScanIdentifier() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, pendingScanEntity.getPreviousScanIdentifier());
            }
        }
    }

    /* renamed from: jF1$e */
    /* loaded from: classes4.dex */
    public class C24755e extends AbstractC39268cf1<UnidentifiedScanEntity> {
        public C24755e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `unidentified_scan_hard_count` (`id`,`hard_count_id`,`scan_identifier`,`scan_error_code`) VALUES (nullif(?, 0),?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, UnidentifiedScanEntity unidentifiedScanEntity) {
            interfaceC47496qV5.mo20956S0(1, unidentifiedScanEntity.getId());
            if (unidentifiedScanEntity.getHardCountId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, unidentifiedScanEntity.getHardCountId());
            }
            if (unidentifiedScanEntity.getScanIdentifier() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, unidentifiedScanEntity.getScanIdentifier());
            }
            C42011hF1 c42011hF1 = C42011hF1.f84913a;
            String m36577b = C42011hF1.m36577b(unidentifiedScanEntity.getScanErrorCode());
            if (m36577b == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m36577b);
            }
        }
    }

    /* renamed from: jF1$f */
    /* loaded from: classes4.dex */
    public class C24756f extends AbstractC41861gz5 {
        public C24756f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM pending_scan_hard_count WHERE scan_identifier = ?";
        }
    }

    /* renamed from: jF1$g */
    /* loaded from: classes4.dex */
    public class C24757g extends AbstractC41861gz5 {
        public C24757g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM unidentified_scan_hard_count WHERE scan_identifier = ?";
        }
    }

    /* renamed from: jF1$h */
    /* loaded from: classes4.dex */
    public class CallableC24758h implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ PendingScanEntity[] f92363b;

        public CallableC24758h(PendingScanEntity[] pendingScanEntityArr) {
            this.f92363b = pendingScanEntityArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C43197jF1.this.f92348a.m108730c();
            try {
                C43197jF1.this.f92349b.m61087l(this.f92363b);
                C43197jF1.this.f92348a.m108734A();
                C43197jF1.this.f92348a.m108728g();
                return null;
            } catch (Throwable th) {
                C43197jF1.this.f92348a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: jF1$i */
    /* loaded from: classes4.dex */
    public class CallableC24759i implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ UnidentifiedScanEntity[] f92365b;

        public CallableC24759i(UnidentifiedScanEntity[] unidentifiedScanEntityArr) {
            this.f92365b = unidentifiedScanEntityArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C43197jF1.this.f92348a.m108730c();
            try {
                C43197jF1.this.f92350c.m61087l(this.f92365b);
                C43197jF1.this.f92348a.m108734A();
                C43197jF1.this.f92348a.m108728g();
                return null;
            } catch (Throwable th) {
                C43197jF1.this.f92348a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: jF1$j */
    /* loaded from: classes4.dex */
    public class CallableC24760j implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f92367b;

        public CallableC24760j(String str) {
            this.f92367b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C43197jF1.this.f92351d.m37254b();
            String str = this.f92367b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            C43197jF1.this.f92348a.m108730c();
            try {
                m37254b.mo17482M();
                C43197jF1.this.f92348a.m108734A();
                C43197jF1.this.f92348a.m108728g();
                C43197jF1.this.f92351d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C43197jF1.this.f92348a.m108728g();
                C43197jF1.this.f92351d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: jF1$k */
    /* loaded from: classes4.dex */
    public class CallableC24761k implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f92369b;

        public CallableC24761k(String str) {
            this.f92369b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C43197jF1.this.f92352e.m37254b();
            String str = this.f92369b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            C43197jF1.this.f92348a.m108730c();
            try {
                m37254b.mo17482M();
                C43197jF1.this.f92348a.m108734A();
                C43197jF1.this.f92348a.m108728g();
                C43197jF1.this.f92352e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C43197jF1.this.f92348a.m108728g();
                C43197jF1.this.f92352e.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: jF1$l */
    /* loaded from: classes4.dex */
    public class CallableC24762l implements Callable<List<PendingScanEntity>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f92371b;

        public CallableC24762l(C33265Hb5 c33265Hb5) {
            this.f92371b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<PendingScanEntity> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(C43197jF1.this.f92348a, this.f92371b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "hard_count_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "scan_identifier");
                int m41645e4 = C40824fF0.m41645e(m102673c, "previous_identifier");
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
                    arrayList.add(new PendingScanEntity(i, string, string2, string3));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f92371b.release();
        }
    }

    public C43197jF1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f92348a = abstractC32563Eb5;
        this.f92349b = new C24754d(abstractC32563Eb5);
        this.f92350c = new C24755e(abstractC32563Eb5);
        this.f92351d = new C24756f(abstractC32563Eb5);
        this.f92352e = new C24757g(abstractC32563Eb5);
    }

    /* renamed from: n */
    public static List<Class<?>> m30929n() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: a */
    public AbstractC23461c mo30942a(String str) {
        return AbstractC23461c.m33078H(new CallableC24760j(str));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: b */
    public AbstractC23461c mo30941b(String str) {
        return AbstractC23461c.m33078H(new CallableC24761k(str));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: c */
    public AbstractC23442F<List<PendingScanEntity>> mo30940c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM pending_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72806e(new CallableC24762l(m103680c));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: d */
    public AbstractC23442F<List<UnidentifiedScanEntity>> mo30939d(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM unidentified_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72806e(new CallableC24752b(m103680c));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: e */
    public AbstractC23461c mo30938e(PendingScanEntity... pendingScanEntityArr) {
        return AbstractC23461c.m33078H(new CallableC24758h(pendingScanEntityArr));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: f */
    public AbstractC23461c mo30937f(UnidentifiedScanEntity... unidentifiedScanEntityArr) {
        return AbstractC23461c.m33078H(new CallableC24759i(unidentifiedScanEntityArr));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: g */
    public Observable<List<PendingScanEntity>> mo30936g(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM pending_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f92348a, false, new String[]{"pending_scan_hard_count"}, new CallableC24751a(m103680c));
    }

    @Override // p000.AbstractC42604iF1
    /* renamed from: h */
    public Observable<List<UnidentifiedScanEntity>> mo30935h(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM unidentified_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f92348a, false, new String[]{"unidentified_scan_hard_count"}, new CallableC24753c(m103680c));
    }
}
