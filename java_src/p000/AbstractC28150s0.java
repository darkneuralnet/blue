package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;
import p000.InterfaceC36464Ut0;
import p000.InterfaceC48140rb1;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001eH\u0016J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010#\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nJ\u001e\u0010$\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011J\u001e\u0010%\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0013J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010'\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0016J\u001e\u0010(\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0018J\u001e\u0010)\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001aJ\u001e\u0010*\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001cJ\u001e\u0010+\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001eJ\u0016\u0010,\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ;\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010-2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101JA\u00102\u001a\u00020\u0006\"\b\b\u0000\u0010-*\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00101¨\u00065"}, m28432d2 = {"Ls0;", "Lrb1;", "LUt0;", "LMs5;", "descriptor", "b", "", C17296a.f69688o, "", "index", "", "H", "", "value", "J", "A", "l", "", "g", "", "k", "p", "", "x", "", "n", "", "t", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "q", "enumDescriptor", "i", "u", "v", "G", "j", "e", "f", "r", "h", "o", "w", "F", "T", "Let5;", "serializer", "y", "(LMs5;ILet5;Ljava/lang/Object;)V", "E", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s0 */
/* loaded from: classes8.dex */
public abstract class AbstractC28150s0 implements InterfaceC48140rb1, InterfaceC36464Ut0 {
    @Override // p000.InterfaceC48140rb1
    /* renamed from: A */
    public void mo1177A() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: B */
    public <T> void mo1176B(InterfaceC40615et5<? super T> interfaceC40615et5, T t) {
        InterfaceC48140rb1.C27952a.m15722d(this, interfaceC40615et5, t);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: C */
    public void mo1175C(char c) {
        mo13013J(Character.valueOf(c));
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: D */
    public void mo1174D() {
        InterfaceC48140rb1.C27952a.m15724b(this);
    }

    /* renamed from: E */
    public <T> void mo1173E(InterfaceC34588Ms5 descriptor, int i, InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (mo14902H(descriptor, i)) {
            m14901I(serializer, t);
        }
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: F */
    public final InterfaceC48140rb1 mo1172F(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            return mo1130u(descriptor.mo10460d(i));
        }
        return C49063t83.f109916a;
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: G */
    public final void mo1171G(InterfaceC34588Ms5 descriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1143g(b);
        }
    }

    /* renamed from: H */
    public boolean mo14902H(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    /* renamed from: I */
    public <T> void m14901I(InterfaceC40615et5<? super T> interfaceC40615et5, T t) {
        InterfaceC48140rb1.C27952a.m15723c(this, interfaceC40615et5, t);
    }

    /* renamed from: J */
    public void mo13013J(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    /* renamed from: a */
    public void mo1151a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: b */
    public InterfaceC36464Ut0 mo1149b(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: e */
    public final void mo1145e(InterfaceC34588Ms5 descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1135p(i2);
        }
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: f */
    public final void mo1144f(InterfaceC34588Ms5 descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1127x(j);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: g */
    public void mo1143g(byte b) {
        mo13013J(Byte.valueOf(b));
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: h */
    public final void mo1142h(InterfaceC34588Ms5 descriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1131t(d);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: i */
    public void mo1141i(InterfaceC34588Ms5 enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo13013J(Integer.valueOf(i));
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: j */
    public final void mo1140j(InterfaceC34588Ms5 descriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1139k(s);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: k */
    public void mo1139k(short s) {
        mo13013J(Short.valueOf(s));
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: l */
    public void mo1138l(boolean z) {
        mo13013J(Boolean.valueOf(z));
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: n */
    public void mo1137n(float f) {
        mo13013J(Float.valueOf(f));
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: o */
    public final void mo1136o(InterfaceC34588Ms5 descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1175C(c);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: p */
    public void mo1135p(int i) {
        mo13013J(Integer.valueOf(i));
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: q */
    public void mo1134q(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo13013J(value);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: r */
    public final void mo1133r(InterfaceC34588Ms5 descriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1137n(f);
        }
    }

    /* renamed from: s */
    public boolean mo1132s(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        return InterfaceC36464Ut0.C8491a.m80660a(this, interfaceC34588Ms5, i);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: t */
    public void mo1131t(double d) {
        mo13013J(Double.valueOf(d));
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: u */
    public InterfaceC48140rb1 mo1130u(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: v */
    public final void mo1129v(InterfaceC34588Ms5 descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo14902H(descriptor, i)) {
            mo1138l(z);
        }
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: w */
    public final void mo1128w(InterfaceC34588Ms5 descriptor, int i, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (mo14902H(descriptor, i)) {
            mo1134q(value);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: x */
    public void mo1127x(long j) {
        mo13013J(Long.valueOf(j));
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: y */
    public <T> void mo1126y(InterfaceC34588Ms5 descriptor, int i, InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (mo14902H(descriptor, i)) {
            mo1176B(serializer, t);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: z */
    public InterfaceC36464Ut0 mo1125z(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        return InterfaceC48140rb1.C27952a.m15725a(this, interfaceC34588Ms5, i);
    }
}
