package p000;

import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.AbstractC18560x;
import com.google.protobuf.C18465F;
import com.google.protobuf.C18466G;
import com.google.protobuf.C18469J;
import com.google.protobuf.C18535q;
import com.google.protobuf.C18544t;
/* renamed from: SJ2 */
/* loaded from: classes6.dex */
public final class SJ2 implements InterfaceC34066Km5 {

    /* renamed from: b */
    public static final InterfaceC48660sT2 f33464b = new C7375a();

    /* renamed from: a */
    public final InterfaceC48660sT2 f33465a;

    /* renamed from: SJ2$a */
    /* loaded from: classes6.dex */
    public class C7375a implements InterfaceC48660sT2 {
        @Override // p000.InterfaceC48660sT2
        /* renamed from: a */
        public InterfaceC47475qT2 mo14168a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p000.InterfaceC48660sT2
        /* renamed from: b */
        public boolean mo14167b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: SJ2$b */
    /* loaded from: classes6.dex */
    public static class C7376b implements InterfaceC48660sT2 {

        /* renamed from: a */
        public InterfaceC48660sT2[] f33466a;

        public C7376b(InterfaceC48660sT2... interfaceC48660sT2Arr) {
            this.f33466a = interfaceC48660sT2Arr;
        }

        @Override // p000.InterfaceC48660sT2
        /* renamed from: a */
        public InterfaceC47475qT2 mo14168a(Class<?> cls) {
            InterfaceC48660sT2[] interfaceC48660sT2Arr;
            for (InterfaceC48660sT2 interfaceC48660sT2 : this.f33466a) {
                if (interfaceC48660sT2.mo14167b(cls)) {
                    return interfaceC48660sT2.mo14168a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p000.InterfaceC48660sT2
        /* renamed from: b */
        public boolean mo14167b(Class<?> cls) {
            for (InterfaceC48660sT2 interfaceC48660sT2 : this.f33466a) {
                if (interfaceC48660sT2.mo14167b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SJ2() {
        this(m85743b());
    }

    /* renamed from: b */
    public static InterfaceC48660sT2 m85743b() {
        return new C7376b(C18535q.m46070c(), m85742c());
    }

    /* renamed from: c */
    public static InterfaceC48660sT2 m85742c() {
        try {
            return (InterfaceC48660sT2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f33464b;
        }
    }

    /* renamed from: d */
    public static boolean m85741d(InterfaceC47475qT2 interfaceC47475qT2) {
        return interfaceC47475qT2.mo15389c() == I94.PROTO2;
    }

    /* renamed from: e */
    public static <T> InterfaceC33832Jm5<T> m85740e(Class<T> cls, InterfaceC47475qT2 interfaceC47475qT2) {
        if (AbstractC18536r.class.isAssignableFrom(cls)) {
            if (m85741d(interfaceC47475qT2)) {
                return C18465F.m46604R(cls, interfaceC47475qT2, C38373b83.m64932b(), AbstractC18560x.m45972b(), C18469J.m46515M(), C33324Hi1.m103516b(), C47987rK2.m16053b());
            }
            return C18465F.m46604R(cls, interfaceC47475qT2, C38373b83.m64932b(), AbstractC18560x.m45972b(), C18469J.m46515M(), null, C47987rK2.m16053b());
        } else if (m85741d(interfaceC47475qT2)) {
            return C18465F.m46604R(cls, interfaceC47475qT2, C38373b83.m64933a(), AbstractC18560x.m45973a(), C18469J.m46520H(), C33324Hi1.m103517a(), C47987rK2.m16054a());
        } else {
            return C18465F.m46604R(cls, interfaceC47475qT2, C38373b83.m64933a(), AbstractC18560x.m45973a(), C18469J.m46519I(), null, C47987rK2.m16054a());
        }
    }

    @Override // p000.InterfaceC34066Km5
    /* renamed from: a */
    public <T> InterfaceC33832Jm5<T> mo85744a(Class<T> cls) {
        C18469J.m46518J(cls);
        InterfaceC47475qT2 mo14168a = this.f33465a.mo14168a(cls);
        if (mo14168a.mo15391a()) {
            if (AbstractC18536r.class.isAssignableFrom(cls)) {
                return C18466G.m46546l(C18469J.m46515M(), C33324Hi1.m103516b(), mo14168a.mo15390b());
            }
            return C18466G.m46546l(C18469J.m46520H(), C33324Hi1.m103517a(), mo14168a.mo15390b());
        }
        return m85740e(cls, mo14168a);
    }

    public SJ2(InterfaceC48660sT2 interfaceC48660sT2) {
        this.f33465a = (InterfaceC48660sT2) C18544t.m45999b(interfaceC48660sT2, "messageInfoFactory");
    }
}
