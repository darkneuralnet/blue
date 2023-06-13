package p000;

import androidx.work.C12124b;
import java.util.Collections;
import java.util.List;
/* renamed from: AG6 */
/* loaded from: classes.dex */
public final class AG6 implements InterfaceC52697zG6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f342a;

    /* renamed from: b */
    public final AbstractC39268cf1<C52104yG6> f343b;

    /* renamed from: c */
    public final AbstractC41861gz5 f344c;

    /* renamed from: d */
    public final AbstractC41861gz5 f345d;

    /* renamed from: AG6$a */
    /* loaded from: classes.dex */
    public class C0060a extends AbstractC39268cf1<C52104yG6> {
        public C0060a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, C52104yG6 c52104yG6) {
            if (c52104yG6.m3734b() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, c52104yG6.m3734b());
            }
            byte[] m65582l = C12124b.m65582l(c52104yG6.m3735a());
            if (m65582l == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20955X0(2, m65582l);
            }
        }
    }

    /* renamed from: AG6$b */
    /* loaded from: classes.dex */
    public class C0061b extends AbstractC41861gz5 {
        public C0061b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: AG6$c */
    /* loaded from: classes.dex */
    public class C0062c extends AbstractC41861gz5 {
        public C0062c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public AG6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f342a = abstractC32563Eb5;
        this.f343b = new C0060a(abstractC32563Eb5);
        this.f344c = new C0061b(abstractC32563Eb5);
        this.f345d = new C0062c(abstractC32563Eb5);
    }

    /* renamed from: b */
    public static List<Class<?>> m115940b() {
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC52697zG6
    /* renamed from: a */
    public void mo1576a() {
        this.f342a.m108731b();
        InterfaceC47496qV5 m37254b = this.f345d.m37254b();
        this.f342a.m108730c();
        try {
            m37254b.mo17482M();
            this.f342a.m108734A();
        } finally {
            this.f342a.m108728g();
            this.f345d.m37249h(m37254b);
        }
    }

    @Override // p000.InterfaceC52697zG6
    public void delete(String str) {
        this.f342a.m108731b();
        InterfaceC47496qV5 m37254b = this.f344c.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f342a.m108730c();
        try {
            m37254b.mo17482M();
            this.f342a.m108734A();
        } finally {
            this.f342a.m108728g();
            this.f344c.m37249h(m37254b);
        }
    }
}
