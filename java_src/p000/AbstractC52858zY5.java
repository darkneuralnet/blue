package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import p000.InterfaceC36464Ut0;
import p000.InterfaceC48140rb1;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\be\u0010fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b3\u00104J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0004J\b\u00107\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u000fH\u0016J\u000e\u00109\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010:\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0017J\u000e\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001dJ\u000e\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020 J\u000e\u0010?\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020#J\u000e\u0010@\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020(J\u000e\u0010A\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020+J\u0016\u0010B\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010C\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0004H\u0016J\u000e\u0010D\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0004J\u0010\u0010E\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0004H\u0014J\u001e\u0010F\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u001e\u0010G\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017J\u001e\u0010H\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aJ\u001e\u0010I\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u001e\u0010J\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dJ\u001e\u0010K\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 J\u001e\u0010L\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#J\u001e\u0010M\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020(J\u001e\u0010N\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020+J\u0016\u0010O\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J;\u0010R\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u00142\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010P2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\bR\u0010SJA\u0010T\u001a\u00020\u000f\"\b\b\u0001\u0010\u0014*\u00020\r2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010P2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bT\u0010SJ\u0017\u0010V\u001a\u00020\u000f2\u0006\u0010U\u001a\u00028\u0000H\u0004¢\u0006\u0004\bV\u0010\u0013J\u000f\u0010W\u001a\u00028\u0000H\u0004¢\u0006\u0004\bW\u0010XR$\u0010\\\u001a\u0012\u0012\u0004\u0012\u00028\u00000Yj\b\u0012\u0004\u0012\u00028\u0000`Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010[R\u0014\u0010`\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\ba\u0010XR\u0016\u0010d\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bc\u0010X¨\u0006g"}, m28432d2 = {"LzY5;", "Tag", "Lrb1;", "LUt0;", "LMs5;", "desc", "", "index", "", "H", "a0", "(LMs5;I)Ljava/lang/Object;", "tag", "", "value", "", "W", "(Ljava/lang/Object;Ljava/lang/Object;)V", "S", "(Ljava/lang/Object;)V", "T", "Q", "(Ljava/lang/Object;I)V", "", "K", "(Ljava/lang/Object;B)V", "", "U", "(Ljava/lang/Object;S)V", "", "R", "(Ljava/lang/Object;J)V", "", "O", "(Ljava/lang/Object;F)V", "", "M", "(Ljava/lang/Object;D)V", "J", "(Ljava/lang/Object;Z)V", "", "L", "(Ljava/lang/Object;C)V", "", "V", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "N", "(Ljava/lang/Object;LMs5;I)V", "inlineDescriptor", "P", "(Ljava/lang/Object;LMs5;)Lrb1;", "descriptor", "u", "D", "A", "l", "g", "k", "p", "x", "n", "t", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "q", "i", "b", C17296a.f69688o, "X", "v", "G", "j", "e", "f", "r", "h", "o", "w", "F", "Let5;", "serializer", "y", "(LMs5;ILet5;Ljava/lang/Object;)V", "E", "name", "c0", "b0", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "tagStack", "Lkt5;", "c", "()Lkt5;", "serializersModule", "Y", "currentTag", "Z", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* renamed from: zY5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC52858zY5<Tag> implements InterfaceC48140rb1, InterfaceC36464Ut0 {

    /* renamed from: a */
    public final ArrayList<Tag> f121521a = new ArrayList<>();

    /* renamed from: H */
    private final boolean m1170H(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        m1146c0(mo1150a0(interfaceC34588Ms5, i));
        return true;
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: A */
    public void mo1177A() {
        mo1158T(m1148b0());
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: B */
    public <T> void mo1176B(InterfaceC40615et5<? super T> interfaceC40615et5, T t) {
        InterfaceC48140rb1.C27952a.m15722d(this, interfaceC40615et5, t);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: C */
    public final void mo1175C(char c) {
        mo1166L(m1148b0(), c);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: D */
    public void mo1174D() {
        m1159S(m1153Y());
    }

    /* renamed from: E */
    public <T> void mo1173E(InterfaceC34588Ms5 descriptor, int i, InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m1170H(descriptor, i)) {
            m1169I(serializer, t);
        }
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: F */
    public final InterfaceC48140rb1 mo1172F(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo1162P(mo1150a0(descriptor, i), descriptor.mo10460d(i));
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: G */
    public final void mo1171G(InterfaceC34588Ms5 descriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1167K(mo1150a0(descriptor, i), b);
    }

    /* renamed from: I */
    public <T> void m1169I(InterfaceC40615et5<? super T> interfaceC40615et5, T t) {
        InterfaceC48140rb1.C27952a.m15723c(this, interfaceC40615et5, t);
    }

    /* renamed from: J */
    public void mo1168J(Tag tag, boolean z) {
        mo1155W(tag, Boolean.valueOf(z));
    }

    /* renamed from: K */
    public void mo1167K(Tag tag, byte b) {
        mo1155W(tag, Byte.valueOf(b));
    }

    /* renamed from: L */
    public void mo1166L(Tag tag, char c) {
        mo1155W(tag, Character.valueOf(c));
    }

    /* renamed from: M */
    public void mo1165M(Tag tag, double d) {
        mo1155W(tag, Double.valueOf(d));
    }

    /* renamed from: N */
    public void mo1164N(Tag tag, InterfaceC34588Ms5 enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo1155W(tag, Integer.valueOf(i));
    }

    /* renamed from: O */
    public void mo1163O(Tag tag, float f) {
        mo1155W(tag, Float.valueOf(f));
    }

    /* renamed from: P */
    public InterfaceC48140rb1 mo1162P(Tag tag, InterfaceC34588Ms5 inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        m1146c0(tag);
        return this;
    }

    /* renamed from: Q */
    public void mo1161Q(Tag tag, int i) {
        mo1155W(tag, Integer.valueOf(i));
    }

    /* renamed from: R */
    public void mo1160R(Tag tag, long j) {
        mo1155W(tag, Long.valueOf(j));
    }

    /* renamed from: S */
    public void m1159S(Tag tag) {
    }

    /* renamed from: T */
    public void mo1158T(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    /* renamed from: U */
    public void mo1157U(Tag tag, short s) {
        mo1155W(tag, Short.valueOf(s));
    }

    /* renamed from: V */
    public void mo1156V(Tag tag, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo1155W(tag, value);
    }

    /* renamed from: W */
    public void mo1155W(Tag tag, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    /* renamed from: X */
    public void mo1154X(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    /* renamed from: Y */
    public final Tag m1153Y() {
        Object last;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f121521a);
        return (Tag) last;
    }

    /* renamed from: Z */
    public final Tag m1152Z() {
        Object lastOrNull;
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f121521a);
        return (Tag) lastOrNull;
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: a */
    public final void mo1151a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f121521a.isEmpty()) {
            m1148b0();
        }
        mo1154X(descriptor);
    }

    /* renamed from: a0 */
    public abstract Tag mo1150a0(InterfaceC34588Ms5 interfaceC34588Ms5, int i);

    @Override // p000.InterfaceC48140rb1
    /* renamed from: b */
    public InterfaceC36464Ut0 mo1149b(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    /* renamed from: b0 */
    public final Tag m1148b0() {
        int lastIndex;
        if (!this.f121521a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f121521a;
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            return arrayList.remove(lastIndex);
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: c */
    public AbstractC44173kt5 mo1147c() {
        return C44766lt5.m26702a();
    }

    /* renamed from: c0 */
    public final void m1146c0(Tag tag) {
        this.f121521a.add(tag);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: e */
    public final void mo1145e(InterfaceC34588Ms5 descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1161Q(mo1150a0(descriptor, i), i2);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: f */
    public final void mo1144f(InterfaceC34588Ms5 descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1160R(mo1150a0(descriptor, i), j);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: g */
    public final void mo1143g(byte b) {
        mo1167K(m1148b0(), b);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: h */
    public final void mo1142h(InterfaceC34588Ms5 descriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1165M(mo1150a0(descriptor, i), d);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: i */
    public final void mo1141i(InterfaceC34588Ms5 enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo1164N(m1148b0(), enumDescriptor, i);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: j */
    public final void mo1140j(InterfaceC34588Ms5 descriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1157U(mo1150a0(descriptor, i), s);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: k */
    public final void mo1139k(short s) {
        mo1157U(m1148b0(), s);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: l */
    public final void mo1138l(boolean z) {
        mo1168J(m1148b0(), z);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: n */
    public final void mo1137n(float f) {
        mo1163O(m1148b0(), f);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: o */
    public final void mo1136o(InterfaceC34588Ms5 descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1166L(mo1150a0(descriptor, i), c);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: p */
    public final void mo1135p(int i) {
        mo1161Q(m1148b0(), i);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: q */
    public final void mo1134q(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo1156V(m1148b0(), value);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: r */
    public final void mo1133r(InterfaceC34588Ms5 descriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1163O(mo1150a0(descriptor, i), f);
    }

    /* renamed from: s */
    public boolean mo1132s(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        return InterfaceC36464Ut0.C8491a.m80660a(this, interfaceC34588Ms5, i);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: t */
    public final void mo1131t(double d) {
        mo1165M(m1148b0(), d);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: u */
    public final InterfaceC48140rb1 mo1130u(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo1162P(m1148b0(), descriptor);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: v */
    public final void mo1129v(InterfaceC34588Ms5 descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo1168J(mo1150a0(descriptor, i), z);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: w */
    public final void mo1128w(InterfaceC34588Ms5 descriptor, int i, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        mo1156V(mo1150a0(descriptor, i), value);
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: x */
    public final void mo1127x(long j) {
        mo1160R(m1148b0(), j);
    }

    @Override // p000.InterfaceC36464Ut0
    /* renamed from: y */
    public <T> void mo1126y(InterfaceC34588Ms5 descriptor, int i, InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m1170H(descriptor, i)) {
            mo1176B(serializer, t);
        }
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: z */
    public InterfaceC36464Ut0 mo1125z(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        return InterfaceC48140rb1.C27952a.m15725a(this, interfaceC34588Ms5, i);
    }
}
