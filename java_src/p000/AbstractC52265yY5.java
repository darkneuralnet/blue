package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import p000.GV0;
import p000.InterfaceC36230Tt0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bf\u0010gJ+\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00028\u0000*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u00100\u001a\u00020\nH\u0014¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b6\u00107J\u000e\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u00020\nJ\b\u0010:\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u0004\u0018\u00010;J\u0006\u0010=\u001a\u00020\u0012J\u0006\u0010>\u001a\u00020\u0016J\u0006\u0010?\u001a\u00020\u0019J\u0006\u0010@\u001a\u00020\u000bJ\u0006\u0010A\u001a\u00020\u001eJ\u0006\u0010B\u001a\u00020!J\u0006\u0010C\u001a\u00020$J\u0006\u0010D\u001a\u00020'J\u0006\u0010E\u001a\u00020*J\u000e\u0010F\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\nJ\u0010\u0010G\u001a\u00020\u00032\u0006\u00108\u001a\u00020\nH\u0016J\u0010\u0010I\u001a\u00020H2\u0006\u00108\u001a\u00020\nH\u0016J\u0016\u0010\u0004\u001a\u00020\u00122\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010J\u001a\u00020\u00162\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010K\u001a\u00020\u00192\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010L\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010M\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010N\u001a\u00020!2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010O\u001a\u00020$2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010P\u001a\u00020'2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010Q\u001a\u00020*2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010R\u001a\u00020\u00022\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ;\u0010S\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bS\u0010TJC\u0010U\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u001a*\u00020\u000f2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bU\u0010TJ\u0017\u0010W\u001a\u00020H2\u0006\u0010V\u001a\u00028\u0000H\u0004¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00028\u0000H\u0004¢\u0006\u0004\bY\u0010ZR$\u0010^\u001a\u0012\u0012\u0004\u0012\u00028\u00000[j\b\u0012\u0004\u0012\u00028\u0000`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010]R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010WR\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010e\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bd\u0010Z¨\u0006h"}, m28432d2 = {"LyY5;", "Tag", "LGV0;", "LTt0;", "E", "tag", "Lkotlin/Function0;", "block", "a0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LMs5;", "", "index", "X", "(LMs5;I)Ljava/lang/Object;", "", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "S", "(Ljava/lang/Object;)Z", "J", "", "K", "(Ljava/lang/Object;)B", "", "T", "(Ljava/lang/Object;)S", "Q", "(Ljava/lang/Object;)I", "", "R", "(Ljava/lang/Object;)J", "", "O", "(Ljava/lang/Object;)F", "", "M", "(Ljava/lang/Object;)D", "", "L", "(Ljava/lang/Object;)C", "", "U", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "N", "(Ljava/lang/Object;LMs5;)I", "inlineDescriptor", "P", "(Ljava/lang/Object;LMs5;)LGV0;", "LE01;", "deserializer", "previousValue", "I", "(LE01;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "g", "D", "", "f", "z", "F", "l", "w", "j", "x", "n", "o", "t", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "b", "", C17296a.f69688o, "A", "H", "h", "m", "p", "G", "u", "e", "r", "s", "(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;", "i", "name", "Z", "(Ljava/lang/Object;)V", "Y", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "tagStack", "flag", "Lkt5;", "c", "()Lkt5;", "serializersModule", "W", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* renamed from: yY5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC52265yY5<Tag> implements GV0, InterfaceC36230Tt0 {

    /* renamed from: a */
    public final ArrayList<Tag> f119712a = new ArrayList<>();

    /* renamed from: b */
    public boolean f119713b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "T", "", "Tag", "invoke", "()Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yY5$a */
    /* loaded from: classes8.dex */
    public static final class C30617a extends Lambda implements Function0<T> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC52265yY5<Tag> f119714g;

        /* renamed from: h */
        public final /* synthetic */ E01<T> f119715h;

        /* renamed from: i */
        public final /* synthetic */ T f119716i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30617a(AbstractC52265yY5<Tag> abstractC52265yY5, E01<? extends T> e01, T t) {
            super(0);
            this.f119714g = abstractC52265yY5;
            this.f119715h = e01;
            this.f119716i = t;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Void, T] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            if (this.f119714g.mo3323D()) {
                return this.f119714g.m3318I(this.f119715h, this.f119716i);
            }
            return this.f119714g.mo3295f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yY5$b */
    /* loaded from: classes8.dex */
    public static final class C30618b extends Lambda implements Function0<T> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC52265yY5<Tag> f119717g;

        /* renamed from: h */
        public final /* synthetic */ E01<T> f119718h;

        /* renamed from: i */
        public final /* synthetic */ T f119719i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30618b(AbstractC52265yY5<Tag> abstractC52265yY5, E01<? extends T> e01, T t) {
            super(0);
            this.f119717g = abstractC52265yY5;
            this.f119718h = e01;
            this.f119719i = t;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f119717g.m3318I(this.f119718h, this.f119719i);
        }
    }

    public AbstractC52265yY5() {
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: A */
    public final byte mo3326A(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3316K(mo3303X(descriptor, i));
    }

    @Override // p000.GV0
    /* renamed from: B */
    public <T> T mo3325B(E01<? extends T> e01) {
        return (T) GV0.C2864a.m105050a(this, e01);
    }

    @Override // p000.GV0
    /* renamed from: C */
    public final int mo3324C(InterfaceC34588Ms5 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return mo3313N(m3302Y(), enumDescriptor);
    }

    @Override // p000.GV0
    /* renamed from: D */
    public boolean mo3323D() {
        Tag m3304W = m3304W();
        if (m3304W == null) {
            return false;
        }
        return mo3308S(m3304W);
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: E */
    public final boolean mo3322E(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3317J(mo3303X(descriptor, i));
    }

    @Override // p000.GV0
    /* renamed from: F */
    public final byte mo3321F() {
        return mo3316K(m3302Y());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: G */
    public final double mo3320G(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3314M(mo3303X(descriptor, i));
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: H */
    public final short mo3319H(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3307T(mo3303X(descriptor, i));
    }

    /* renamed from: I */
    public <T> T m3318I(E01<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) mo3325B(deserializer);
    }

    /* renamed from: J */
    public boolean mo3317J(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) m3305V).booleanValue();
    }

    /* renamed from: K */
    public byte mo3316K(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) m3305V).byteValue();
    }

    /* renamed from: L */
    public char mo3315L(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) m3305V).charValue();
    }

    /* renamed from: M */
    public double mo3314M(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) m3305V).doubleValue();
    }

    /* renamed from: N */
    public int mo3313N(Tag tag, InterfaceC34588Ms5 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) m3305V).intValue();
    }

    /* renamed from: O */
    public float mo3312O(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) m3305V).floatValue();
    }

    /* renamed from: P */
    public GV0 mo3311P(Tag tag, InterfaceC34588Ms5 inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        m3301Z(tag);
        return this;
    }

    /* renamed from: Q */
    public int mo3310Q(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) m3305V).intValue();
    }

    /* renamed from: R */
    public long mo3309R(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) m3305V).longValue();
    }

    /* renamed from: S */
    public boolean mo3308S(Tag tag) {
        return true;
    }

    /* renamed from: T */
    public short mo3307T(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) m3305V).shortValue();
    }

    /* renamed from: U */
    public String mo3306U(Tag tag) {
        Object m3305V = m3305V(tag);
        Intrinsics.checkNotNull(m3305V, "null cannot be cast to non-null type kotlin.String");
        return (String) m3305V;
    }

    /* renamed from: V */
    public Object m3305V(Tag tag) {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    /* renamed from: W */
    public final Tag m3304W() {
        Object lastOrNull;
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f119712a);
        return (Tag) lastOrNull;
    }

    /* renamed from: X */
    public abstract Tag mo3303X(InterfaceC34588Ms5 interfaceC34588Ms5, int i);

    /* renamed from: Y */
    public final Tag m3302Y() {
        int lastIndex;
        ArrayList<Tag> arrayList = this.f119712a;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
        Tag remove = arrayList.remove(lastIndex);
        this.f119713b = true;
        return remove;
    }

    /* renamed from: Z */
    public final void m3301Z(Tag tag) {
        this.f119712a.add(tag);
    }

    /* renamed from: a */
    public void mo3300a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    /* renamed from: a0 */
    public final <E> E m3299a0(Tag tag, Function0<? extends E> function0) {
        m3301Z(tag);
        E invoke = function0.invoke();
        if (!this.f119713b) {
            m3302Y();
        }
        this.f119713b = false;
        return invoke;
    }

    @Override // p000.GV0
    /* renamed from: b */
    public InterfaceC36230Tt0 mo3298b(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    /* renamed from: c */
    public AbstractC44173kt5 mo3297c() {
        return C44766lt5.m26702a();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: e */
    public final String mo3296e(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3306U(mo3303X(descriptor, i));
    }

    @Override // p000.GV0
    /* renamed from: f */
    public final Void mo3295f() {
        return null;
    }

    @Override // p000.GV0
    /* renamed from: g */
    public final GV0 mo3294g(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3311P(m3302Y(), descriptor);
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: h */
    public final int mo3293h(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3310Q(mo3303X(descriptor, i));
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: i */
    public final <T> T mo3292i(InterfaceC34588Ms5 descriptor, int i, E01<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m3299a0(mo3303X(descriptor, i), new C30617a(this, deserializer, t));
    }

    @Override // p000.GV0
    /* renamed from: j */
    public final long mo3291j() {
        return mo3309R(m3302Y());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: k */
    public boolean mo3290k() {
        return InterfaceC36230Tt0.C8139a.m82315b(this);
    }

    @Override // p000.GV0
    /* renamed from: l */
    public final short mo3289l() {
        return mo3307T(m3302Y());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: m */
    public final long mo3288m(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3309R(mo3303X(descriptor, i));
    }

    @Override // p000.GV0
    /* renamed from: n */
    public final double mo3287n() {
        return mo3314M(m3302Y());
    }

    @Override // p000.GV0
    /* renamed from: o */
    public final char mo3286o() {
        return mo3315L(m3302Y());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: p */
    public final float mo3285p(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3312O(mo3303X(descriptor, i));
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: r */
    public final GV0 mo3284r(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3311P(mo3303X(descriptor, i), descriptor.mo10460d(i));
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: s */
    public final <T> T mo3283s(InterfaceC34588Ms5 descriptor, int i, E01<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m3299a0(mo3303X(descriptor, i), new C30618b(this, deserializer, t));
    }

    @Override // p000.GV0
    /* renamed from: t */
    public final String mo3282t() {
        return mo3306U(m3302Y());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: u */
    public final char mo3281u(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo3315L(mo3303X(descriptor, i));
    }

    @Override // p000.GV0
    /* renamed from: w */
    public final int mo3280w() {
        return mo3310Q(m3302Y());
    }

    @Override // p000.GV0
    /* renamed from: x */
    public final float mo3279x() {
        return mo3312O(m3302Y());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: y */
    public int mo3278y(InterfaceC34588Ms5 interfaceC34588Ms5) {
        return InterfaceC36230Tt0.C8139a.m82316a(this, interfaceC34588Ms5);
    }

    @Override // p000.GV0
    /* renamed from: z */
    public final boolean mo3277z() {
        return mo3317J(m3302Y());
    }
}
