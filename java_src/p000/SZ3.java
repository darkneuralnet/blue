package p000;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;
/* renamed from: SZ3 */
/* loaded from: classes.dex */
public final class SZ3 implements RZ3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f33890a;

    /* renamed from: b */
    public final AbstractC39268cf1<QZ3> f33891b;

    /* renamed from: SZ3$a */
    /* loaded from: classes.dex */
    public class C7476a extends AbstractC39268cf1<QZ3> {
        public C7476a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, QZ3 qz3) {
            if (qz3.m88396a() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, qz3.m88396a());
            }
            if (qz3.m88395b() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20956S0(2, qz3.m88395b().longValue());
            }
        }
    }

    public SZ3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f33890a = abstractC32563Eb5;
        this.f33891b = new C7476a(abstractC32563Eb5);
    }

    /* renamed from: c */
    public static List<Class<?>> m85286c() {
        return Collections.emptyList();
    }

    @Override // p000.RZ3
    /* renamed from: a */
    public void mo85288a(QZ3 qz3) {
        this.f33890a.m108731b();
        this.f33890a.m108730c();
        try {
            this.f33891b.m61088k(qz3);
            this.f33890a.m108734A();
        } finally {
            this.f33890a.m108728g();
        }
    }

    @Override // p000.RZ3
    /* renamed from: b */
    public Long mo85287b(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f33890a.m108731b();
        Long l = null;
        Cursor m102673c = IF0.m102673c(this.f33890a, m103680c, false, null);
        try {
            if (m102673c.moveToFirst() && !m102673c.isNull(0)) {
                l = Long.valueOf(m102673c.getLong(0));
            }
            return l;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }
}
