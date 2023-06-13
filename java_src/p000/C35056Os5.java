package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC34588Ms5;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R \u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b\u0014\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u001b\u0010=\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b9\u0010!¨\u0006C"}, m28432d2 = {"LOs5;", "LMs5;", "Lj80;", "", "index", "", "f", "name", "c", "", "", "g", DateTokenConverter.CONVERTER_KEY, "", "i", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "toString", C17296a.f69688o, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "LTs5;", "b", "LTs5;", "getKind", "()LTs5;", "kind", "I", "e", "()I", "elementsCount", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[LMs5;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "j", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "Lkotlin/Lazy;", "_hashCode", "typeParameters", "LLj0;", "builder", "<init>", "(Ljava/lang/String;LTs5;ILjava/util/List;LLj0;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,345:1\n37#2,2:346\n37#2,2:348\n1549#3:350\n1620#3,3:351\n13#4:354\n13#4:355\n13#4:356\n18#4:357\n111#5,10:358\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n315#1:346,2\n317#1:348,2\n319#1:350\n319#1:351,3\n323#1:354\n325#1:355\n326#1:356\n327#1:357\n330#1:358,10\n*E\n"})
/* renamed from: Os5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35056Os5 implements InterfaceC34588Ms5, InterfaceC43131j80 {

    /* renamed from: a */
    public final String f27487a;

    /* renamed from: b */
    public final AbstractC36226Ts5 f27488b;

    /* renamed from: c */
    public final int f27489c;

    /* renamed from: d */
    public final List<Annotation> f27490d;

    /* renamed from: e */
    public final Set<String> f27491e;

    /* renamed from: f */
    public final String[] f27492f;

    /* renamed from: g */
    public final InterfaceC34588Ms5[] f27493g;

    /* renamed from: h */
    public final List<Annotation>[] f27494h;

    /* renamed from: i */
    public final boolean[] f27495i;

    /* renamed from: j */
    public final Map<String, Integer> f27496j;

    /* renamed from: k */
    public final InterfaceC34588Ms5[] f27497k;

    /* renamed from: l */
    public final Lazy f27498l;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Os5$a */
    /* loaded from: classes8.dex */
    public static final class C6195a extends Lambda implements Function0<Integer> {
        public C6195a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C35056Os5 c35056Os5 = C35056Os5.this;
            return Integer.valueOf(BW3.m113909a(c35056Os5, c35056Os5.f27497k));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", "b", "(I)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Os5$b */
    /* loaded from: classes8.dex */
    public static final class C6196b extends Lambda implements Function1<Integer, CharSequence> {
        public C6196b() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence m91244b(int i) {
            return C35056Os5.this.mo10458f(i) + ": " + C35056Os5.this.mo10460d(i).mo10456h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m91244b(num.intValue());
        }
    }

    public C35056Os5(String serialName, AbstractC36226Ts5 kind, int i, List<? extends InterfaceC34588Ms5> typeParameters, C34268Lj0 builder) {
        HashSet hashSet;
        boolean[] booleanArray;
        Iterable<IndexedValue> withIndex;
        int collectionSizeOrDefault;
        Map<String, Integer> map;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f27487a = serialName;
        this.f27488b = kind;
        this.f27489c = i;
        this.f27490d = builder.m96405c();
        hashSet = CollectionsKt___CollectionsKt.toHashSet(builder.m96402f());
        this.f27491e = hashSet;
        String[] strArr = (String[]) builder.m96402f().toArray(new String[0]);
        this.f27492f = strArr;
        this.f27493g = C47503qW3.m17474b(builder.m96403e());
        this.f27494h = (List[]) builder.m96404d().toArray(new List[0]);
        booleanArray = CollectionsKt___CollectionsKt.toBooleanArray(builder.m96401g());
        this.f27495i = booleanArray;
        withIndex = ArraysKt___ArraysKt.withIndex(strArr);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IndexedValue indexedValue : withIndex) {
            arrayList.add(TuplesKt.m28425to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        map = MapsKt__MapsKt.toMap(arrayList);
        this.f27496j = map;
        this.f27497k = C47503qW3.m17474b(typeParameters);
        lazy = LazyKt__LazyJVMKt.lazy(new C6195a());
        this.f27498l = lazy;
    }

    @Override // p000.InterfaceC43131j80
    /* renamed from: a */
    public Set<String> mo31065a() {
        return this.f27491e;
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
        Integer num = this.f27496j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        return this.f27493g[i];
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public int mo10459e() {
        return this.f27489c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35056Os5) {
            InterfaceC34588Ms5 interfaceC34588Ms5 = (InterfaceC34588Ms5) obj;
            if (Intrinsics.areEqual(mo10456h(), interfaceC34588Ms5.mo10456h()) && Arrays.equals(this.f27497k, ((C35056Os5) obj).f27497k) && mo10459e() == interfaceC34588Ms5.mo10459e()) {
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
        return this.f27492f[i];
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        return this.f27494h[i];
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        return this.f27490d;
    }

    @Override // p000.InterfaceC34588Ms5
    public AbstractC36226Ts5 getKind() {
        return this.f27488b;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return this.f27487a;
    }

    public int hashCode() {
        return m91245k();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        return this.f27495i[i];
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return InterfaceC34588Ms5.C5406a.m94639b(this);
    }

    /* renamed from: k */
    public final int m91245k() {
        return ((Number) this.f27498l.getValue()).intValue();
    }

    public String toString() {
        IntRange until;
        String joinToString$default;
        until = RangesKt___RangesKt.until(0, mo10459e());
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(until, ", ", mo10456h() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, new C6196b(), 24, null);
        return joinToString$default;
    }
}
