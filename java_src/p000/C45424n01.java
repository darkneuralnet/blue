package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: n01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45424n01 implements InterfaceC44831m01 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f99199a;

    /* renamed from: b */
    public final AbstractC39268cf1<C43052j01> f99200b;

    /* renamed from: n01$a */
    /* loaded from: classes.dex */
    public class C26333a extends AbstractC39268cf1<C43052j01> {
        public C26333a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, C43052j01 c43052j01) {
            if (c43052j01.m31273b() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, c43052j01.m31273b());
            }
            if (c43052j01.m31274a() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, c43052j01.m31274a());
            }
        }
    }

    public C45424n01(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f99199a = abstractC32563Eb5;
        this.f99200b = new C26333a(abstractC32563Eb5);
    }

    /* renamed from: e */
    public static List<Class<?>> m24591e() {
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC44831m01
    /* renamed from: a */
    public List<String> mo24595a(String str) {
        String string;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f99199a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f99199a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.InterfaceC44831m01
    /* renamed from: b */
    public boolean mo24594b(String str) {
        boolean z = true;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f99199a.m108731b();
        boolean z2 = false;
        Cursor m102673c = IF0.m102673c(this.f99199a, m103680c, false, null);
        try {
            if (m102673c.moveToFirst()) {
                if (m102673c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.InterfaceC44831m01
    /* renamed from: c */
    public void mo24593c(C43052j01 c43052j01) {
        this.f99199a.m108731b();
        this.f99199a.m108730c();
        try {
            this.f99200b.m61088k(c43052j01);
            this.f99199a.m108734A();
        } finally {
            this.f99199a.m108728g();
        }
    }

    @Override // p000.InterfaceC44831m01
    /* renamed from: d */
    public boolean mo24592d(String str) {
        boolean z = true;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f99199a.m108731b();
        boolean z2 = false;
        Cursor m102673c = IF0.m102673c(this.f99199a, m103680c, false, null);
        try {
            if (m102673c.moveToFirst()) {
                if (m102673c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }
}
