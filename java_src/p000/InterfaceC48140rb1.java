package p000;

import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H&J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H&J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0018H&J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000eH\u0016J+\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m28432d2 = {"Lrb1;", "", "", "D", "A", "", "value", "l", "", "g", "", "k", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "p", "", "x", "", "n", "", "t", "", "q", "LMs5;", "enumDescriptor", "index", "i", "descriptor", "u", "LUt0;", "b", "collectionSize", "z", "T", "Let5;", "serializer", "B", "(Let5;Ljava/lang/Object;)V", "Lkt5;", "c", "()Lkt5;", "serializersModule", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rb1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC48140rb1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rb1$a */
    /* loaded from: classes8.dex */
    public static final class C27952a {
        /* renamed from: a */
        public static InterfaceC36464Ut0 m15725a(InterfaceC48140rb1 interfaceC48140rb1, InterfaceC34588Ms5 descriptor, int i) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return interfaceC48140rb1.mo1149b(descriptor);
        }

        /* renamed from: b */
        public static void m15724b(InterfaceC48140rb1 interfaceC48140rb1) {
        }

        /* renamed from: c */
        public static <T> void m15723c(InterfaceC48140rb1 interfaceC48140rb1, InterfaceC40615et5<? super T> serializer, T t) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().mo10462b()) {
                interfaceC48140rb1.mo1176B(serializer, t);
            } else if (t == null) {
                interfaceC48140rb1.mo1177A();
            } else {
                interfaceC48140rb1.mo1174D();
                interfaceC48140rb1.mo1176B(serializer, t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static <T> void m15722d(InterfaceC48140rb1 interfaceC48140rb1, InterfaceC40615et5<? super T> serializer, T t) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(interfaceC48140rb1, t);
        }
    }

    /* renamed from: A */
    void mo1177A();

    /* renamed from: B */
    <T> void mo1176B(InterfaceC40615et5<? super T> interfaceC40615et5, T t);

    /* renamed from: C */
    void mo1175C(char c);

    /* renamed from: D */
    void mo1174D();

    /* renamed from: b */
    InterfaceC36464Ut0 mo1149b(InterfaceC34588Ms5 interfaceC34588Ms5);

    /* renamed from: c */
    AbstractC44173kt5 mo1147c();

    /* renamed from: g */
    void mo1143g(byte b);

    /* renamed from: i */
    void mo1141i(InterfaceC34588Ms5 interfaceC34588Ms5, int i);

    /* renamed from: k */
    void mo1139k(short s);

    /* renamed from: l */
    void mo1138l(boolean z);

    /* renamed from: n */
    void mo1137n(float f);

    /* renamed from: p */
    void mo1135p(int i);

    /* renamed from: q */
    void mo1134q(String str);

    /* renamed from: t */
    void mo1131t(double d);

    /* renamed from: u */
    InterfaceC48140rb1 mo1130u(InterfaceC34588Ms5 interfaceC34588Ms5);

    /* renamed from: x */
    void mo1127x(long j);

    /* renamed from: z */
    InterfaceC36464Ut0 mo1125z(InterfaceC34588Ms5 interfaceC34588Ms5, int i);
}
