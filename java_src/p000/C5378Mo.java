package p000;

import android.database.Cursor;
import co.bird.android.model.constant.AssetManagerType;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: Mo */
/* loaded from: classes4.dex */
public final class C5378Mo extends AbstractC5089Lo {

    /* renamed from: a */
    public final AbstractC32563Eb5 f23598a;

    /* renamed from: b */
    public final AbstractC39268cf1<C5698No> f23599b;

    /* renamed from: c */
    public final AbstractC38675bf1<C5698No> f23600c;

    /* renamed from: Mo$a */
    /* loaded from: classes4.dex */
    public class C5379a extends AbstractC39268cf1<C5698No> {
        public C5379a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `local_assets` (`id`,`manager`,`file_size`,`media_type`,`file_path`,`created_by`,`downloaded_at`,`manifest_date`,`download_url`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, C5698No c5698No) {
            if (c5698No.m93390g() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, c5698No.m93390g());
            }
            String m5748a = C51460xB0.m5748a(c5698No.m93389h());
            if (m5748a == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m5748a);
            }
            if (c5698No.m93391f() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20956S0(3, c5698No.m93391f().longValue());
            }
            if (c5698No.m93387j() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, c5698No.m93387j());
            }
            if (c5698No.m93392e() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, c5698No.m93392e());
            }
            if (c5698No.m93395b() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, c5698No.m93395b());
            }
            String m5747b = C51460xB0.m5747b(c5698No.m93393d());
            if (m5747b == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m5747b);
            }
            String m5747b2 = C51460xB0.m5747b(c5698No.m93388i());
            if (m5747b2 == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m5747b2);
            }
            if (c5698No.m93394c() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, c5698No.m93394c());
            }
        }
    }

    /* renamed from: Mo$b */
    /* loaded from: classes4.dex */
    public class C5380b extends AbstractC38675bf1<C5698No> {
        public C5380b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `local_assets` WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, C5698No c5698No) {
            if (c5698No.m93390g() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, c5698No.m93390g());
            }
        }
    }

    /* renamed from: Mo$c */
    /* loaded from: classes4.dex */
    public class CallableC5381c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ C5698No[] f23603b;

        public CallableC5381c(C5698No[] c5698NoArr) {
            this.f23603b = c5698NoArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C5378Mo.this.f23598a.m108730c();
            try {
                C5378Mo.this.f23599b.m61087l(this.f23603b);
                C5378Mo.this.f23598a.m108734A();
                C5378Mo.this.f23598a.m108728g();
                return null;
            } catch (Throwable th) {
                C5378Mo.this.f23598a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Mo$d */
    /* loaded from: classes4.dex */
    public class CallableC5382d implements Callable<C5698No> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f23605b;

        public CallableC5382d(C33265Hb5 c33265Hb5) {
            this.f23605b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C5698No call() throws Exception {
            String string;
            String string2;
            Long valueOf;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            C5698No c5698No = null;
            String string8 = null;
            Cursor m102673c = IF0.m102673c(C5378Mo.this.f23598a, this.f23605b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "manager");
                int m41645e3 = C40824fF0.m41645e(m102673c, "file_size");
                int m41645e4 = C40824fF0.m41645e(m102673c, "media_type");
                int m41645e5 = C40824fF0.m41645e(m102673c, "file_path");
                int m41645e6 = C40824fF0.m41645e(m102673c, "created_by");
                int m41645e7 = C40824fF0.m41645e(m102673c, "downloaded_at");
                int m41645e8 = C40824fF0.m41645e(m102673c, "manifest_date");
                int m41645e9 = C40824fF0.m41645e(m102673c, "download_url");
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
                    AssetManagerType m5746c = C51460xB0.m5746c(string2);
                    if (m102673c.isNull(m41645e3)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(m41645e3));
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
                    DateTime m5745d = C51460xB0.m5745d(string6);
                    if (m102673c.isNull(m41645e8)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e8);
                    }
                    DateTime m5745d2 = C51460xB0.m5745d(string7);
                    if (!m102673c.isNull(m41645e9)) {
                        string8 = m102673c.getString(m41645e9);
                    }
                    c5698No = new C5698No(string, m5746c, valueOf, string3, string4, string5, m5745d, m5745d2, string8);
                }
                return c5698No;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f23605b.release();
        }
    }

    /* renamed from: Mo$e */
    /* loaded from: classes4.dex */
    public class CallableC5383e implements Callable<DateTime> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f23607b;

        public CallableC5383e(C33265Hb5 c33265Hb5) {
            this.f23607b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public DateTime call() throws Exception {
            DateTime dateTime = null;
            String string = null;
            Cursor m102673c = IF0.m102673c(C5378Mo.this.f23598a, this.f23607b, false, null);
            try {
                if (m102673c.moveToFirst()) {
                    if (!m102673c.isNull(0)) {
                        string = m102673c.getString(0);
                    }
                    dateTime = C51460xB0.m5745d(string);
                }
                return dateTime;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f23607b.release();
        }
    }

    public C5378Mo(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f23598a = abstractC32563Eb5;
        this.f23599b = new C5379a(abstractC32563Eb5);
        this.f23600c = new C5380b(abstractC32563Eb5);
    }

    /* renamed from: f */
    public static List<Class<?>> m94792f() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC5089Lo
    /* renamed from: a */
    public AbstractC24507p<C5698No> mo94797a(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM local_assets WHERE id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return AbstractC24507p.m32071D(new CallableC5382d(m103680c));
    }

    @Override // p000.AbstractC5089Lo
    /* renamed from: b */
    public AbstractC24507p<DateTime> mo94796b(AssetManagerType assetManagerType) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT downloaded_at FROM local_assets WHERE manager = ? ORDER BY dateTime(downloaded_at) DESC LIMIT 1", 1);
        String m5748a = C51460xB0.m5748a(assetManagerType);
        if (m5748a == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m5748a);
        }
        return AbstractC24507p.m32071D(new CallableC5383e(m103680c));
    }

    @Override // p000.AbstractC5089Lo
    /* renamed from: c */
    public AbstractC23461c mo94795c(C5698No... c5698NoArr) {
        return AbstractC23461c.m33078H(new CallableC5381c(c5698NoArr));
    }
}
