package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p000.MG6;
/* renamed from: NG6 */
/* loaded from: classes.dex */
public final class NG6 implements MG6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f24381a;

    /* renamed from: b */
    public final AbstractC39268cf1<LG6> f24382b;

    /* renamed from: c */
    public final AbstractC41861gz5 f24383c;

    /* renamed from: NG6$a */
    /* loaded from: classes.dex */
    public class C5535a extends AbstractC39268cf1<LG6> {
        public C5535a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, LG6 lg6) {
            if (lg6.m97428a() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, lg6.m97428a());
            }
            if (lg6.m97427b() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, lg6.m97427b());
            }
        }
    }

    /* renamed from: NG6$b */
    /* loaded from: classes.dex */
    public class C5536b extends AbstractC41861gz5 {
        public C5536b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public NG6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f24381a = abstractC32563Eb5;
        this.f24382b = new C5535a(abstractC32563Eb5);
        this.f24383c = new C5536b(abstractC32563Eb5);
    }

    /* renamed from: e */
    public static List<Class<?>> m94112e() {
        return Collections.emptyList();
    }

    @Override // p000.MG6
    /* renamed from: a */
    public void mo94116a(String str) {
        this.f24381a.m108731b();
        InterfaceC47496qV5 m37254b = this.f24383c.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f24381a.m108730c();
        try {
            m37254b.mo17482M();
            this.f24381a.m108734A();
        } finally {
            this.f24381a.m108728g();
            this.f24383c.m37249h(m37254b);
        }
    }

    @Override // p000.MG6
    /* renamed from: b */
    public void mo94115b(LG6 lg6) {
        this.f24381a.m108731b();
        this.f24381a.m108730c();
        try {
            this.f24382b.m61088k(lg6);
            this.f24381a.m108734A();
        } finally {
            this.f24381a.m108728g();
        }
    }

    @Override // p000.MG6
    /* renamed from: c */
    public void mo94114c(String str, Set<String> set) {
        MG6.C5264a.m95458a(this, str, set);
    }

    @Override // p000.MG6
    /* renamed from: d */
    public List<String> mo94113d(String str) {
        String string;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f24381a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f24381a, m103680c, false, null);
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
}
