package p000;

import java.util.Collections;
import java.util.List;
/* renamed from: WU2 */
/* loaded from: classes5.dex */
public interface WU2<Model, Data> {

    /* renamed from: WU2$a */
    /* loaded from: classes5.dex */
    public static class C9060a<Data> {

        /* renamed from: a */
        public final InterfaceC38133ak2 f41158a;

        /* renamed from: b */
        public final List<InterfaceC38133ak2> f41159b;

        /* renamed from: c */
        public final IS0<Data> f41160c;

        public C9060a(InterfaceC38133ak2 interfaceC38133ak2, IS0<Data> is0) {
            this(interfaceC38133ak2, Collections.emptyList(), is0);
        }

        public C9060a(InterfaceC38133ak2 interfaceC38133ak2, List<InterfaceC38133ak2> list, IS0<Data> is0) {
            this.f41158a = (InterfaceC38133ak2) C52865zZ3.m1111d(interfaceC38133ak2);
            this.f41159b = (List) C52865zZ3.m1111d(list);
            this.f41160c = (IS0) C52865zZ3.m1111d(is0);
        }
    }

    /* renamed from: a */
    boolean mo19952a(Model model);

    /* renamed from: b */
    C9060a<Data> mo19951b(Model model, int i, int i2, C48964sy3 c48964sy3);
}
