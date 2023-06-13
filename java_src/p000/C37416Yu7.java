package p000;

import java.io.IOException;
/* renamed from: Yu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37416Yu7 {

    /* renamed from: a */
    public final C37182Xu7 f47618a;

    /* renamed from: b */
    public final Object f47619b;

    /* renamed from: c */
    public final Object f47620c;

    public C37416Yu7(EnumC33690Iw7 enumC33690Iw7, Object obj, EnumC33690Iw7 enumC33690Iw72, Object obj2) {
        this.f47618a = new C37182Xu7(enumC33690Iw7, obj, enumC33690Iw72, obj2);
        this.f47619b = obj;
        this.f47620c = obj2;
    }

    /* renamed from: b */
    public static int m74016b(C37182Xu7 c37182Xu7, Object obj, Object obj2) {
        return C32727Et7.m108249a(c37182Xu7.f44206a, 1, obj) + C32727Et7.m108249a(c37182Xu7.f44208c, 2, obj2);
    }

    /* renamed from: d */
    public static C37416Yu7 m74014d(EnumC33690Iw7 enumC33690Iw7, Object obj, EnumC33690Iw7 enumC33690Iw72, Object obj2) {
        return new C37416Yu7(enumC33690Iw7, obj, enumC33690Iw72, obj2);
    }

    /* renamed from: e */
    public static void m74013e(AbstractC50104ut7 abstractC50104ut7, C37182Xu7 c37182Xu7, Object obj, Object obj2) throws IOException {
        C32727Et7.m108238l(abstractC50104ut7, c37182Xu7.f44206a, 1, obj);
        C32727Et7.m108238l(abstractC50104ut7, c37182Xu7.f44208c, 2, obj2);
    }

    /* renamed from: a */
    public final int m74017a(int i, Object obj, Object obj2) {
        int m9559l = AbstractC50104ut7.m9559l(i);
        int m74016b = m74016b(this.f47618a, obj, obj2);
        return m9559l + AbstractC50104ut7.m9558m(m74016b) + m74016b;
    }

    /* renamed from: c */
    public final C37182Xu7 m74015c() {
        return this.f47618a;
    }
}
