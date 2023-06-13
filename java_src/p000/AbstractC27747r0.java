package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;
import p000.GV0;
import p000.InterfaceC36230Tt0;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J/\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0016\u0010)\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010*\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010+\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010,\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010-\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010.\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010/\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u00100\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u00101\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0018\u00102\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eH\u0016J=\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b3\u00104JC\u00105\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b5\u00104¨\u00068"}, m28432d2 = {"Lr0;", "LGV0;", "LTt0;", "", "J", "", "D", "", "f", "z", "", "F", "", "l", "", "w", "", "j", "", "x", "", "n", "", "o", "", "t", "LMs5;", "enumDescriptor", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "descriptor", "g", "T", "LE01;", "deserializer", "previousValue", "I", "(LE01;Ljava/lang/Object;)Ljava/lang/Object;", "b", "", C17296a.f69688o, "index", "E", "A", "H", "h", "m", "p", "G", "u", "e", "r", "s", "(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;", "i", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r0 */
/* loaded from: classes8.dex */
public abstract class AbstractC27747r0 implements GV0, InterfaceC36230Tt0 {
    @Override // p000.InterfaceC36230Tt0
    /* renamed from: A */
    public final byte mo3326A(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3321F();
    }

    @Override // p000.GV0
    /* renamed from: B */
    public <T> T mo3325B(E01<? extends T> e01) {
        return (T) GV0.C2864a.m105050a(this, e01);
    }

    @Override // p000.GV0
    /* renamed from: C */
    public int mo3324C(InterfaceC34588Ms5 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) m16702J).intValue();
    }

    @Override // p000.GV0
    /* renamed from: D */
    public boolean mo3323D() {
        return true;
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: E */
    public final boolean mo3322E(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3277z();
    }

    @Override // p000.GV0
    /* renamed from: F */
    public byte mo3321F() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) m16702J).byteValue();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: G */
    public final double mo3320G(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3287n();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: H */
    public final short mo3319H(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3289l();
    }

    /* renamed from: I */
    public <T> T m16703I(E01<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) mo3325B(deserializer);
    }

    /* renamed from: J */
    public Object m16702J() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    /* renamed from: a */
    public void mo3300a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // p000.GV0
    /* renamed from: b */
    public InterfaceC36230Tt0 mo3298b(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: e */
    public final String mo3296e(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3282t();
    }

    @Override // p000.GV0
    /* renamed from: f */
    public Void mo3295f() {
        return null;
    }

    @Override // p000.GV0
    /* renamed from: g */
    public GV0 mo3294g(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: h */
    public final int mo3293h(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3280w();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: i */
    public final <T> T mo3292i(InterfaceC34588Ms5 descriptor, int i, E01<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.getDescriptor().mo10462b() && !mo3323D()) {
            return (T) mo3295f();
        }
        return (T) m16703I(deserializer, t);
    }

    @Override // p000.GV0
    /* renamed from: j */
    public long mo3291j() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) m16702J).longValue();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: k */
    public boolean mo3290k() {
        return InterfaceC36230Tt0.C8139a.m82315b(this);
    }

    @Override // p000.GV0
    /* renamed from: l */
    public short mo3289l() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) m16702J).shortValue();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: m */
    public final long mo3288m(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3291j();
    }

    @Override // p000.GV0
    /* renamed from: n */
    public double mo3287n() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) m16702J).doubleValue();
    }

    @Override // p000.GV0
    /* renamed from: o */
    public char mo3286o() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) m16702J).charValue();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: p */
    public final float mo3285p(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3279x();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: r */
    public GV0 mo3284r(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3294g(descriptor.mo10460d(i));
    }

    /* renamed from: s */
    public <T> T mo3283s(InterfaceC34588Ms5 descriptor, int i, E01<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m16703I(deserializer, t);
    }

    @Override // p000.GV0
    /* renamed from: t */
    public String mo3282t() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.String");
        return (String) m16702J;
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: u */
    public final char mo3281u(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3286o();
    }

    @Override // p000.GV0
    /* renamed from: w */
    public int mo3280w() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) m16702J).intValue();
    }

    @Override // p000.GV0
    /* renamed from: x */
    public float mo3279x() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) m16702J).floatValue();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: y */
    public int mo3278y(InterfaceC34588Ms5 interfaceC34588Ms5) {
        return InterfaceC36230Tt0.C8139a.m82316a(this, interfaceC34588Ms5);
    }

    @Override // p000.GV0
    /* renamed from: z */
    public boolean mo3277z() {
        Object m16702J = m16702J();
        Intrinsics.checkNotNull(m16702J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) m16702J).booleanValue();
    }
}
