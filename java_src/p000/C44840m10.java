package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.BrainSwapRecord;
import co.bird.android.model.persistence.nestedstructures.Part;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: m10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44840m10 extends AbstractC44247l10 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f97077a;

    /* renamed from: b */
    public final AbstractC39268cf1<BrainSwapRecord> f97078b;

    /* renamed from: c */
    public final AbstractC41861gz5 f97079c;

    /* renamed from: d */
    public final AbstractC41861gz5 f97080d;

    /* renamed from: e */
    public final AbstractC41861gz5 f97081e;

    /* renamed from: m10$a */
    /* loaded from: classes4.dex */
    public class CallableC25847a implements Callable<BrainSwapRecord> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97082b;

        public CallableC25847a(C33265Hb5 c33265Hb5) {
            this.f97082b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BrainSwapRecord call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf;
            Boolean valueOf2;
            boolean z = false;
            BrainSwapRecord brainSwapRecord = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C44840m10.this.f97077a, this.f97082b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "part_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "imei");
                int m41645e4 = C40824fF0.m41645e(m102673c, "bird_code");
                int m41645e5 = C40824fF0.m41645e(m102673c, "brain_part");
                int m41645e6 = C40824fF0.m41645e(m102673c, "status");
                int m41645e7 = C40824fF0.m41645e(m102673c, "created_at");
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
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    Part m29456b = C43654k10.m29456b(string5);
                    if (m102673c.isNull(m41645e6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(m41645e6));
                    }
                    if (valueOf == null) {
                        valueOf2 = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        }
                        valueOf2 = Boolean.valueOf(z);
                    }
                    if (!m102673c.isNull(m41645e7)) {
                        string6 = m102673c.getString(m41645e7);
                    }
                    brainSwapRecord = new BrainSwapRecord(string, string2, string3, string4, m29456b, valueOf2, Converters.m55278f(string6));
                }
                return brainSwapRecord;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97082b.release();
        }
    }

    /* renamed from: m10$b */
    /* loaded from: classes4.dex */
    public class CallableC25848b implements Callable<BrainSwapRecord> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97084b;

        public CallableC25848b(C33265Hb5 c33265Hb5) {
            this.f97084b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BrainSwapRecord call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf;
            Boolean valueOf2;
            boolean z = false;
            BrainSwapRecord brainSwapRecord = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C44840m10.this.f97077a, this.f97084b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "part_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "imei");
                int m41645e4 = C40824fF0.m41645e(m102673c, "bird_code");
                int m41645e5 = C40824fF0.m41645e(m102673c, "brain_part");
                int m41645e6 = C40824fF0.m41645e(m102673c, "status");
                int m41645e7 = C40824fF0.m41645e(m102673c, "created_at");
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
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    Part m29456b = C43654k10.m29456b(string5);
                    if (m102673c.isNull(m41645e6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(m41645e6));
                    }
                    if (valueOf == null) {
                        valueOf2 = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        }
                        valueOf2 = Boolean.valueOf(z);
                    }
                    if (!m102673c.isNull(m41645e7)) {
                        string6 = m102673c.getString(m41645e7);
                    }
                    brainSwapRecord = new BrainSwapRecord(string, string2, string3, string4, m29456b, valueOf2, Converters.m55278f(string6));
                }
                return brainSwapRecord;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97084b.release();
        }
    }

    /* renamed from: m10$c */
    /* loaded from: classes4.dex */
    public class C25849c extends AbstractC39268cf1<BrainSwapRecord> {
        public C25849c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `brain_swaps` (`bird_id`,`part_id`,`imei`,`bird_code`,`brain_part`,`status`,`created_at`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BrainSwapRecord brainSwapRecord) {
            Integer valueOf;
            if (brainSwapRecord.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, brainSwapRecord.getBirdId());
            }
            if (brainSwapRecord.getPartId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, brainSwapRecord.getPartId());
            }
            if (brainSwapRecord.getImei() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, brainSwapRecord.getImei());
            }
            if (brainSwapRecord.getBirdCode() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, brainSwapRecord.getBirdCode());
            }
            C43654k10 c43654k10 = C43654k10.f93770a;
            String m29457a = C43654k10.m29457a(brainSwapRecord.getBrainPart());
            if (m29457a == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m29457a);
            }
            if (brainSwapRecord.getStatus() == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(brainSwapRecord.getStatus().booleanValue() ? 1 : 0);
            }
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20956S0(6, valueOf.intValue());
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(brainSwapRecord.getCreatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55279e);
            }
        }
    }

    /* renamed from: m10$d */
    /* loaded from: classes4.dex */
    public class C25850d extends AbstractC41861gz5 {
        public C25850d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE brain_swaps SET status = ? WHERE imei = ?";
        }
    }

    /* renamed from: m10$e */
    /* loaded from: classes4.dex */
    public class C25851e extends AbstractC41861gz5 {
        public C25851e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM brain_swaps WHERE bird_id = ?";
        }
    }

    /* renamed from: m10$f */
    /* loaded from: classes4.dex */
    public class C25852f extends AbstractC41861gz5 {
        public C25852f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM brain_swaps";
        }
    }

    /* renamed from: m10$g */
    /* loaded from: classes4.dex */
    public class CallableC25853g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ BrainSwapRecord[] f97090b;

        public CallableC25853g(BrainSwapRecord[] brainSwapRecordArr) {
            this.f97090b = brainSwapRecordArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C44840m10.this.f97077a.m108730c();
            try {
                C44840m10.this.f97078b.m61087l(this.f97090b);
                C44840m10.this.f97077a.m108734A();
                C44840m10.this.f97077a.m108728g();
                return null;
            } catch (Throwable th) {
                C44840m10.this.f97077a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: m10$h */
    /* loaded from: classes4.dex */
    public class CallableC25854h implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Boolean f97092b;

        /* renamed from: c */
        public final /* synthetic */ String f97093c;

        public CallableC25854h(Boolean bool, String str) {
            this.f97092b = bool;
            this.f97093c = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Integer valueOf;
            InterfaceC47496qV5 m37254b = C44840m10.this.f97079c.m37254b();
            Boolean bool = this.f97092b;
            if (bool == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            if (valueOf == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20956S0(1, valueOf.intValue());
            }
            String str = this.f97093c;
            if (str == null) {
                m37254b.mo20954m1(2);
            } else {
                m37254b.mo20958G0(2, str);
            }
            C44840m10.this.f97077a.m108730c();
            try {
                m37254b.mo17482M();
                C44840m10.this.f97077a.m108734A();
                return null;
            } finally {
                C44840m10.this.f97077a.m108728g();
                C44840m10.this.f97079c.m37249h(m37254b);
            }
        }
    }

    /* renamed from: m10$i */
    /* loaded from: classes4.dex */
    public class CallableC25855i implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f97095b;

        public CallableC25855i(String str) {
            this.f97095b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C44840m10.this.f97080d.m37254b();
            String str = this.f97095b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            C44840m10.this.f97077a.m108730c();
            try {
                m37254b.mo17482M();
                C44840m10.this.f97077a.m108734A();
                C44840m10.this.f97077a.m108728g();
                C44840m10.this.f97080d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C44840m10.this.f97077a.m108728g();
                C44840m10.this.f97080d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: m10$j */
    /* loaded from: classes4.dex */
    public class CallableC25856j implements Callable<Void> {
        public CallableC25856j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C44840m10.this.f97081e.m37254b();
            C44840m10.this.f97077a.m108730c();
            try {
                m37254b.mo17482M();
                C44840m10.this.f97077a.m108734A();
                C44840m10.this.f97077a.m108728g();
                C44840m10.this.f97081e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C44840m10.this.f97077a.m108728g();
                C44840m10.this.f97081e.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: m10$k */
    /* loaded from: classes4.dex */
    public class CallableC25857k implements Callable<List<BrainSwapRecord>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97098b;

        public CallableC25857k(C33265Hb5 c33265Hb5) {
            this.f97098b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<BrainSwapRecord> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf;
            Boolean valueOf2;
            String string6;
            Cursor m102673c = IF0.m102673c(C44840m10.this.f97077a, this.f97098b, false, null);
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
                    Part m29456b = C43654k10.m29456b(string5);
                    if (m102673c.isNull(5)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(5));
                    }
                    if (valueOf == null) {
                        valueOf2 = null;
                    } else {
                        if (valueOf.intValue() == 0) {
                            z = false;
                        }
                        valueOf2 = Boolean.valueOf(z);
                    }
                    if (m102673c.isNull(6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(6);
                    }
                    arrayList.add(new BrainSwapRecord(string, string2, string3, string4, m29456b, valueOf2, Converters.m55278f(string6)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97098b.release();
        }
    }

    public C44840m10(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f97077a = abstractC32563Eb5;
        this.f97078b = new C25849c(abstractC32563Eb5);
        this.f97079c = new C25850d(abstractC32563Eb5);
        this.f97080d = new C25851e(abstractC32563Eb5);
        this.f97081e = new C25852f(abstractC32563Eb5);
    }

    /* renamed from: m */
    public static List<Class<?>> m26527m() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: a */
    public AbstractC23461c mo26539a() {
        return AbstractC23461c.m33078H(new CallableC25856j());
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: b */
    public AbstractC23461c mo26538b(BrainSwapRecord... brainSwapRecordArr) {
        return AbstractC23461c.m33078H(new CallableC25853g(brainSwapRecordArr));
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: c */
    public AbstractC23461c mo26537c(String str) {
        return AbstractC23461c.m33078H(new CallableC25855i(str));
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: d */
    public Observable<BrainSwapRecord> mo26536d(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM brain_swaps WHERE bird_id = ? LIMIT 1", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f97077a, false, new String[]{"brain_swaps"}, new CallableC25848b(m103680c));
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: e */
    public Observable<BrainSwapRecord> mo26535e(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM brain_swaps swaps WHERE imei = ? LIMIT 1", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f97077a, false, new String[]{"brain_swaps"}, new CallableC25847a(m103680c));
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: f */
    public Observable<List<BrainSwapRecord>> mo26534f() {
        return C37504Ze5.m72808c(this.f97077a, false, new String[]{"brain_swaps"}, new CallableC25857k(C33265Hb5.m103680c("SELECT `brain_swaps`.`bird_id` AS `bird_id`, `brain_swaps`.`part_id` AS `part_id`, `brain_swaps`.`imei` AS `imei`, `brain_swaps`.`bird_code` AS `bird_code`, `brain_swaps`.`brain_part` AS `brain_part`, `brain_swaps`.`status` AS `status`, `brain_swaps`.`created_at` AS `created_at` FROM brain_swaps", 0)));
    }

    @Override // p000.AbstractC44247l10
    /* renamed from: g */
    public AbstractC23461c mo26533g(String str, Boolean bool) {
        return AbstractC23461c.m33078H(new CallableC25854h(bool, str));
    }
}
