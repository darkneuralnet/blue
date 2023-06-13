package p000;

import java.io.IOException;
import java.util.logging.Logger;
/* renamed from: Mb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34437Mb7 {

    /* renamed from: a */
    public final C34203Lb7 f23275a;

    /* renamed from: b */
    public final Object f23276b;

    /* renamed from: c */
    public final Object f23277c;

    public C34437Mb7(EnumC35616Rc7 enumC35616Rc7, Object obj, EnumC35616Rc7 enumC35616Rc72, Object obj2) {
        this.f23275a = new C34203Lb7(enumC35616Rc7, obj, enumC35616Rc72, obj2);
        this.f23276b = obj;
        this.f23277c = obj2;
    }

    /* renamed from: b */
    public static int m95141b(C34203Lb7 c34203Lb7, Object obj, Object obj2) {
        return C36066Ta7.m83382a(c34203Lb7.f21751a, 1, obj) + C36066Ta7.m83382a(c34203Lb7.f21753c, 2, obj2);
    }

    /* renamed from: d */
    public static C34437Mb7 m95139d(EnumC35616Rc7 enumC35616Rc7, Object obj, EnumC35616Rc7 enumC35616Rc72, Object obj2) {
        return new C34437Mb7(enumC35616Rc7, obj, enumC35616Rc72, obj2);
    }

    /* renamed from: e */
    public static void m95138e(AbstractC33726Ja7 abstractC33726Ja7, C34203Lb7 c34203Lb7, Object obj, Object obj2) throws IOException {
        C36066Ta7.m83372k(abstractC33726Ja7, c34203Lb7.f21751a, 1, obj);
        C36066Ta7.m83372k(abstractC33726Ja7, c34203Lb7.f21753c, 2, obj2);
    }

    /* renamed from: a */
    public final int m95142a(int i, Object obj, Object obj2) {
        Logger logger = AbstractC33726Ja7.f17883b;
        int m95141b = m95141b(this.f23275a, obj, obj2);
        return AbstractC33726Ja7.m100166a(i << 3) + AbstractC33726Ja7.m100166a(m95141b) + m95141b;
    }

    /* renamed from: c */
    public final C34203Lb7 m95140c() {
        return this.f23275a;
    }
}
