package p000;

import java.nio.charset.Charset;
/* renamed from: Kb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33969Kb7 implements InterfaceC43412jc7 {

    /* renamed from: b */
    public static final InterfaceC35607Rb7 f19907b = new C33501Ib7();

    /* renamed from: a */
    public final InterfaceC35607Rb7 f19908a;

    public C33969Kb7() {
        InterfaceC35607Rb7 interfaceC35607Rb7;
        InterfaceC35607Rb7[] interfaceC35607Rb7Arr = new InterfaceC35607Rb7[2];
        interfaceC35607Rb7Arr[0] = C37470Za7.m72910c();
        try {
            interfaceC35607Rb7 = (InterfaceC35607Rb7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC35607Rb7 = f19907b;
        }
        interfaceC35607Rb7Arr[1] = interfaceC35607Rb7;
        C33735Jb7 c33735Jb7 = new C33735Jb7(interfaceC35607Rb7Arr);
        Charset charset = C46960pb7.f103839a;
        this.f19908a = c33735Jb7;
    }

    /* renamed from: b */
    public static boolean m98699b(InterfaceC35373Qb7 interfaceC35373Qb7) {
        return interfaceC35373Qb7.zbc() == 1;
    }

    @Override // p000.InterfaceC43412jc7
    /* renamed from: a */
    public final InterfaceC42819ic7 mo30198a(Class cls) {
        C44005kc7.m28761e(cls);
        InterfaceC35373Qb7 mo72912a = this.f19908a.mo72912a(cls);
        if (mo72912a.zbb()) {
            if (AbstractC41030fb7.class.isAssignableFrom(cls)) {
                return C38058ac7.m71012i(C44005kc7.m28765a(), C35598Ra7.m86594b(), mo72912a.mo6590y());
            }
            return C38058ac7.m71012i(C44005kc7.m28767X(), C35598Ra7.m86595a(), mo72912a.mo6590y());
        } else if (AbstractC41030fb7.class.isAssignableFrom(cls)) {
            if (m98699b(mo72912a)) {
                return C37479Zb7.m72890I(cls, mo72912a, C39855dc7.m44017b(), AbstractC33033Gb7.m104975d(), C44005kc7.m28765a(), C35598Ra7.m86594b(), C35139Pb7.m90070b());
            }
            return C37479Zb7.m72890I(cls, mo72912a, C39855dc7.m44017b(), AbstractC33033Gb7.m104975d(), C44005kc7.m28765a(), null, C35139Pb7.m90070b());
        } else if (m98699b(mo72912a)) {
            return C37479Zb7.m72890I(cls, mo72912a, C39855dc7.m44018a(), AbstractC33033Gb7.m104976c(), C44005kc7.m28767X(), C35598Ra7.m86595a(), C35139Pb7.m90071a());
        } else {
            return C37479Zb7.m72890I(cls, mo72912a, C39855dc7.m44018a(), AbstractC33033Gb7.m104976c(), C44005kc7.m28766Y(), null, C35139Pb7.m90071a());
        }
    }
}
