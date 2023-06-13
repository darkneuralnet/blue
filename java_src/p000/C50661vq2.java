package p000;

import android.content.Context;
/* renamed from: vq2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50661vq2 {

    /* renamed from: vq2$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC29666a<T> {
        String extract(T t);
    }

    private C50661vq2() {
    }

    /* renamed from: b */
    public static C32711Es0<?> m7933b(String str, String str2) {
        return C32711Es0.m108302l(AbstractC49476tq2.m11691a(str, str2), AbstractC49476tq2.class);
    }

    /* renamed from: c */
    public static C32711Es0<?> m7932c(final String str, final InterfaceC29666a<Context> interfaceC29666a) {
        return C32711Es0.m108301m(AbstractC49476tq2.class).m108292b(C43645k01.m29483k(Context.class)).m108288f(new InterfaceC36455Us0() { // from class: uq2
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                AbstractC49476tq2 m7931d;
                m7931d = C50661vq2.m7931d(str, interfaceC29666a, interfaceC35051Os0);
                return m7931d;
            }
        }).m108290d();
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC49476tq2 m7931d(String str, InterfaceC29666a interfaceC29666a, InterfaceC35051Os0 interfaceC35051Os0) {
        return AbstractC49476tq2.m11691a(str, interfaceC29666a.extract((Context) interfaceC35051Os0.get(Context.class)));
    }
}
