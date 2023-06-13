package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: fD6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40812fD6 implements InterfaceC40219eD6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f79700a;

    /* renamed from: b */
    public final AbstractC39268cf1<C39627dD6> f79701b;

    /* renamed from: fD6$a */
    /* loaded from: classes.dex */
    public class C20323a extends AbstractC39268cf1<C39627dD6> {
        public C20323a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, C39627dD6 c39627dD6) {
            if (c39627dD6.m44521a() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, c39627dD6.m44521a());
            }
            if (c39627dD6.m44520b() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, c39627dD6.m44520b());
            }
        }
    }

    public C40812fD6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f79700a = abstractC32563Eb5;
        this.f79701b = new C20323a(abstractC32563Eb5);
    }

    /* renamed from: c */
    public static List<Class<?>> m41711c() {
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC40219eD6
    /* renamed from: a */
    public List<String> mo41713a(String str) {
        String string;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f79700a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f79700a, m103680c, false, null);
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

    @Override // p000.InterfaceC40219eD6
    /* renamed from: b */
    public void mo41712b(C39627dD6 c39627dD6) {
        this.f79700a.m108731b();
        this.f79700a.m108730c();
        try {
            this.f79701b.m61088k(c39627dD6);
            this.f79700a.m108734A();
        } finally {
            this.f79700a.m108728g();
        }
    }
}
