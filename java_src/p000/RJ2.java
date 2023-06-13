package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.AbstractC18254z;
import com.google.crypto.tink.shaded.protobuf.C18152H;
import com.google.crypto.tink.shaded.protobuf.C18153I;
import com.google.crypto.tink.shaded.protobuf.C18158N;
import com.google.crypto.tink.shaded.protobuf.C18229s;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18157M;
/* renamed from: RJ2 */
/* loaded from: classes6.dex */
public final class RJ2 implements InterfaceC34300Lm5 {

    /* renamed from: b */
    public static final InterfaceC49253tT2 f31827b = new C7108a();

    /* renamed from: a */
    public final InterfaceC49253tT2 f31828a;

    /* renamed from: RJ2$a */
    /* loaded from: classes6.dex */
    public class C7108a implements InterfaceC49253tT2 {
        @Override // p000.InterfaceC49253tT2
        /* renamed from: a */
        public InterfaceC48068rT2 mo12305a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p000.InterfaceC49253tT2
        /* renamed from: b */
        public boolean mo12304b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: RJ2$b */
    /* loaded from: classes6.dex */
    public static class C7109b implements InterfaceC49253tT2 {

        /* renamed from: a */
        public InterfaceC49253tT2[] f31829a;

        public C7109b(InterfaceC49253tT2... interfaceC49253tT2Arr) {
            this.f31829a = interfaceC49253tT2Arr;
        }

        @Override // p000.InterfaceC49253tT2
        /* renamed from: a */
        public InterfaceC48068rT2 mo12305a(Class<?> cls) {
            InterfaceC49253tT2[] interfaceC49253tT2Arr;
            for (InterfaceC49253tT2 interfaceC49253tT2 : this.f31829a) {
                if (interfaceC49253tT2.mo12304b(cls)) {
                    return interfaceC49253tT2.mo12305a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p000.InterfaceC49253tT2
        /* renamed from: b */
        public boolean mo12304b(Class<?> cls) {
            for (InterfaceC49253tT2 interfaceC49253tT2 : this.f31829a) {
                if (interfaceC49253tT2.mo12304b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public RJ2() {
        this(m86969b());
    }

    /* renamed from: b */
    public static InterfaceC49253tT2 m86969b() {
        return new C7109b(C18229s.m47481c(), m86968c());
    }

    /* renamed from: c */
    public static InterfaceC49253tT2 m86968c() {
        try {
            return (InterfaceC49253tT2) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f31827b;
        }
    }

    /* renamed from: d */
    public static boolean m86967d(InterfaceC48068rT2 interfaceC48068rT2) {
        return interfaceC48068rT2.mo13674c() == J94.PROTO2;
    }

    /* renamed from: e */
    public static <T> InterfaceC18157M<T> m86966e(Class<T> cls, InterfaceC48068rT2 interfaceC48068rT2) {
        if (AbstractC18230t.class.isAssignableFrom(cls)) {
            if (m86967d(interfaceC48068rT2)) {
                return C18152H.m48066Q(cls, interfaceC48068rT2, C38966c83.m61911b(), AbstractC18254z.m47394b(), C18158N.m47972M(), C33558Ii1.m101759b(), C48579sK2.m14394b());
            }
            return C18152H.m48066Q(cls, interfaceC48068rT2, C38966c83.m61911b(), AbstractC18254z.m47394b(), C18158N.m47972M(), null, C48579sK2.m14394b());
        } else if (m86967d(interfaceC48068rT2)) {
            return C18152H.m48066Q(cls, interfaceC48068rT2, C38966c83.m61912a(), AbstractC18254z.m47395a(), C18158N.m47977H(), C33558Ii1.m101760a(), C48579sK2.m14395a());
        } else {
            return C18152H.m48066Q(cls, interfaceC48068rT2, C38966c83.m61912a(), AbstractC18254z.m47395a(), C18158N.m47976I(), null, C48579sK2.m14395a());
        }
    }

    @Override // p000.InterfaceC34300Lm5
    /* renamed from: a */
    public <T> InterfaceC18157M<T> mo86970a(Class<T> cls) {
        C18158N.m47975J(cls);
        InterfaceC48068rT2 mo12305a = this.f31828a.mo12305a(cls);
        if (mo12305a.mo13676a()) {
            if (AbstractC18230t.class.isAssignableFrom(cls)) {
                return C18153I.m48014m(C18158N.m47972M(), C33558Ii1.m101759b(), mo12305a.mo13675b());
            }
            return C18153I.m48014m(C18158N.m47977H(), C33558Ii1.m101760a(), mo12305a.mo13675b());
        }
        return m86966e(cls, mo12305a);
    }

    public RJ2(InterfaceC49253tT2 interfaceC49253tT2) {
        this.f31828a = (InterfaceC49253tT2) C18238v.m47422b(interfaceC49253tT2, "messageInfoFactory");
    }
}
