package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC34588Ms5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 \u0012\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\bL\u0010MJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0019H\u0002R\u001a\u0010\u001f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010,0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00104R%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R!\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010&R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010J¨\u0006N"}, m28432d2 = {"LAW3;", "LMs5;", "Lj80;", "", "name", "", "isOptional", "", "k", "", "annotation", "q", "", "index", DateTokenConverter.CONVERTER_KEY, "i", "", "g", "f", "c", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "toString", "", "m", C17296a.f69688o, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "LmB1;", "b", "LmB1;", "generatedSerializer", "I", "e", "()I", "elementsCount", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "LKj2;", "j", "Lkotlin/Lazy;", "n", "()[LKj2;", "childSerializers", "o", "()[LMs5;", "typeParameterDescriptors", "l", "p", "_hashCode", "LTs5;", "getKind", "()LTs5;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "<init>", "(Ljava/lang/String;LmB1;I)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,134:1\n13#2:135\n18#2:136\n13#2:137\n13#2:138\n111#3,10:139\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n*E\n"})
/* renamed from: AW3 */
/* loaded from: classes8.dex */
public class AW3 implements InterfaceC34588Ms5, InterfaceC43131j80 {

    /* renamed from: a */
    public final String f653a;

    /* renamed from: b */
    public final InterfaceC44940mB1<?> f654b;

    /* renamed from: c */
    public final int f655c;

    /* renamed from: d */
    public int f656d;

    /* renamed from: e */
    public final String[] f657e;

    /* renamed from: f */
    public final List<Annotation>[] f658f;

    /* renamed from: g */
    public List<Annotation> f659g;

    /* renamed from: h */
    public final boolean[] f660h;

    /* renamed from: i */
    public Map<String, Integer> f661i;

    /* renamed from: j */
    public final Lazy f662j;

    /* renamed from: k */
    public final Lazy f663k;

    /* renamed from: l */
    public final Lazy f664l;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AW3$a */
    /* loaded from: classes8.dex */
    public static final class C0113a extends Lambda implements Function0<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0113a() {
            super(0);
            AW3.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            AW3 aw3 = AW3.this;
            return Integer.valueOf(BW3.m113909a(aw3, aw3.m115693o()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "LKj2;", "b", "()[LKj2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AW3$b */
    /* loaded from: classes8.dex */
    public static final class C0114b extends Lambda implements Function0<InterfaceC34036Kj2<?>[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0114b() {
            super(0);
            AW3.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC34036Kj2<?>[] invoke() {
            InterfaceC34036Kj2<?>[] childSerializers;
            InterfaceC44940mB1 interfaceC44940mB1 = AW3.this.f654b;
            return (interfaceC44940mB1 == null || (childSerializers = interfaceC44940mB1.childSerializers()) == null) ? CW3.f4158a : childSerializers;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "i", "", "b", "(I)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AW3$c */
    /* loaded from: classes8.dex */
    public static final class C0115c extends Lambda implements Function1<Integer, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0115c() {
            super(1);
            AW3.this = r1;
        }

        /* renamed from: b */
        public final CharSequence m115689b(int i) {
            return AW3.this.mo10458f(i) + ": " + AW3.this.mo10460d(i).mo10456h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m115689b(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "LMs5;", "b", "()[LMs5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor$typeParameterDescriptors$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n11335#2:135\n11670#2,3:136\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor$typeParameterDescriptors$2\n*L\n40#1:135\n40#1:136,3\n*E\n"})
    /* renamed from: AW3$d */
    /* loaded from: classes8.dex */
    public static final class C0116d extends Lambda implements Function0<InterfaceC34588Ms5[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0116d() {
            super(0);
            AW3.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC34588Ms5[] invoke() {
            ArrayList arrayList;
            InterfaceC34036Kj2<?>[] typeParametersSerializers;
            InterfaceC44940mB1 interfaceC44940mB1 = AW3.this.f654b;
            if (interfaceC44940mB1 != null && (typeParametersSerializers = interfaceC44940mB1.typeParametersSerializers()) != null) {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (InterfaceC34036Kj2<?> interfaceC34036Kj2 : typeParametersSerializers) {
                    arrayList.add(interfaceC34036Kj2.getDescriptor());
                }
            } else {
                arrayList = null;
            }
            return C47503qW3.m17474b(arrayList);
        }
    }

    public AW3(String serialName, InterfaceC44940mB1<?> interfaceC44940mB1, int i) {
        Map<String, Integer> emptyMap;
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f653a = serialName;
        this.f654b = interfaceC44940mB1;
        this.f655c = i;
        this.f656d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f657e = strArr;
        int i3 = this.f655c;
        this.f658f = new List[i3];
        this.f660h = new boolean[i3];
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f661i = emptyMap;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C0114b());
        this.f662j = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C0116d());
        this.f663k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C0113a());
        this.f664l = lazy3;
    }

    /* renamed from: l */
    public static /* synthetic */ void m115696l(AW3 aw3, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        aw3.m115697k(str, z);
    }

    @Override // p000.InterfaceC43131j80
    /* renamed from: a */
    public Set<String> mo31065a() {
        return this.f661i.keySet();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: b */
    public boolean mo10462b() {
        return InterfaceC34588Ms5.C5406a.m94638c(this);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: c */
    public int mo10461c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f661i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        return m115694n()[i].getDescriptor();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public final int mo10459e() {
        return this.f655c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AW3) {
            InterfaceC34588Ms5 interfaceC34588Ms5 = (InterfaceC34588Ms5) obj;
            if (Intrinsics.areEqual(mo10456h(), interfaceC34588Ms5.mo10456h()) && Arrays.equals(m115693o(), ((AW3) obj).m115693o()) && mo10459e() == interfaceC34588Ms5.mo10459e()) {
                int mo10459e = mo10459e();
                for (int i = 0; i < mo10459e; i++) {
                    if (Intrinsics.areEqual(mo10460d(i).mo10456h(), interfaceC34588Ms5.mo10460d(i).mo10456h()) && Intrinsics.areEqual(mo10460d(i).getKind(), interfaceC34588Ms5.mo10460d(i).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: f */
    public String mo10458f(int i) {
        return this.f657e[i];
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        List<Annotation> emptyList;
        List<Annotation> list = this.f658f[i];
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        List<Annotation> emptyList;
        List<Annotation> list = this.f659g;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    @Override // p000.InterfaceC34588Ms5
    public AbstractC36226Ts5 getKind() {
        return RS5.C7171a.f32056a;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return this.f653a;
    }

    public int hashCode() {
        return m115692p();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        return this.f660h[i];
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return InterfaceC34588Ms5.C5406a.m94639b(this);
    }

    /* renamed from: k */
    public final void m115697k(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f657e;
        int i = this.f656d + 1;
        this.f656d = i;
        strArr[i] = name;
        this.f660h[i] = z;
        this.f658f[i] = null;
        if (i == this.f655c - 1) {
            this.f661i = m115695m();
        }
    }

    /* renamed from: m */
    public final Map<String, Integer> m115695m() {
        HashMap hashMap = new HashMap();
        int length = this.f657e.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.f657e[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: n */
    public final InterfaceC34036Kj2<?>[] m115694n() {
        return (InterfaceC34036Kj2[]) this.f662j.getValue();
    }

    /* renamed from: o */
    public final InterfaceC34588Ms5[] m115693o() {
        return (InterfaceC34588Ms5[]) this.f663k.getValue();
    }

    /* renamed from: p */
    public final int m115692p() {
        return ((Number) this.f664l.getValue()).intValue();
    }

    /* renamed from: q */
    public final void m115691q(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> list = this.f658f[this.f656d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.f658f[this.f656d] = list;
        }
        list.add(annotation);
    }

    public String toString() {
        IntRange until;
        String joinToString$default;
        until = RangesKt___RangesKt.until(0, this.f655c);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(until, ", ", mo10456h() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, new C0115c(), 24, null);
        return joinToString$default;
    }

    public /* synthetic */ AW3(String str, InterfaceC44940mB1 interfaceC44940mB1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : interfaceC44940mB1, i);
    }
}
