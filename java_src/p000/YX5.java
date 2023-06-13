package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.XX5;
/* renamed from: YX5 */
/* loaded from: classes.dex */
public final class YX5 implements XX5 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f45983a;

    /* renamed from: b */
    public final AbstractC39268cf1<WX5> f45984b;

    /* renamed from: c */
    public final AbstractC41861gz5 f45985c;

    /* renamed from: d */
    public final AbstractC41861gz5 f45986d;

    /* renamed from: YX5$a */
    /* loaded from: classes.dex */
    public class C9801a extends AbstractC39268cf1<WX5> {
        public C9801a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, WX5 wx5) {
            String str = wx5.f41252a;
            if (str == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, str);
            }
            interfaceC47496qV5.mo20956S0(2, wx5.m78245a());
            interfaceC47496qV5.mo20956S0(3, wx5.f41254c);
        }
    }

    /* renamed from: YX5$b */
    /* loaded from: classes.dex */
    public class C9802b extends AbstractC41861gz5 {
        public C9802b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: YX5$c */
    /* loaded from: classes.dex */
    public class C9803c extends AbstractC41861gz5 {
        public C9803c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public YX5(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f45983a = abstractC32563Eb5;
        this.f45984b = new C9801a(abstractC32563Eb5);
        this.f45985c = new C9802b(abstractC32563Eb5);
        this.f45986d = new C9803c(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m74921h() {
        return Collections.emptyList();
    }

    @Override // p000.XX5
    /* renamed from: a */
    public void mo74928a(TC6 tc6) {
        XX5.C9424a.m76894b(this, tc6);
    }

    @Override // p000.XX5
    /* renamed from: b */
    public WX5 mo74927b(String str, int i) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        m103680c.mo20956S0(2, i);
        this.f45983a.m108731b();
        WX5 wx5 = null;
        String string = null;
        Cursor m102673c = IF0.m102673c(this.f45983a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "work_spec_id");
            int m41645e2 = C40824fF0.m41645e(m102673c, "generation");
            int m41645e3 = C40824fF0.m41645e(m102673c, "system_id");
            if (m102673c.moveToFirst()) {
                if (!m102673c.isNull(m41645e)) {
                    string = m102673c.getString(m41645e);
                }
                wx5 = new WX5(string, m102673c.getInt(m41645e2), m102673c.getInt(m41645e3));
            }
            return wx5;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.XX5
    /* renamed from: c */
    public List<String> mo74926c() {
        String string;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f45983a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f45983a, m103680c, false, null);
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

    @Override // p000.XX5
    /* renamed from: d */
    public WX5 mo74925d(TC6 tc6) {
        return XX5.C9424a.m76895a(this, tc6);
    }

    @Override // p000.XX5
    /* renamed from: e */
    public void mo74924e(WX5 wx5) {
        this.f45983a.m108731b();
        this.f45983a.m108730c();
        try {
            this.f45984b.m61088k(wx5);
            this.f45983a.m108734A();
        } finally {
            this.f45983a.m108728g();
        }
    }

    @Override // p000.XX5
    /* renamed from: f */
    public void mo74923f(String str, int i) {
        this.f45983a.m108731b();
        InterfaceC47496qV5 m37254b = this.f45985c.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        m37254b.mo20956S0(2, i);
        this.f45983a.m108730c();
        try {
            m37254b.mo17482M();
            this.f45983a.m108734A();
        } finally {
            this.f45983a.m108728g();
            this.f45985c.m37249h(m37254b);
        }
    }

    @Override // p000.XX5
    /* renamed from: g */
    public void mo74922g(String str) {
        this.f45983a.m108731b();
        InterfaceC47496qV5 m37254b = this.f45986d.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f45983a.m108730c();
        try {
            m37254b.mo17482M();
            this.f45983a.m108734A();
        } finally {
            this.f45983a.m108728g();
            this.f45986d.m37249h(m37254b);
        }
    }
}
