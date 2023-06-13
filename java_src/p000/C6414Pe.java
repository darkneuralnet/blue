package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LPe;", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "b", DateTokenConverter.CONVERTER_KEY, "LUe;", "LUe;", "getScope", "()LUe;", Action.SCOPE_ATTRIBUTE, "<init>", "(LUe;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,863:1\n1549#2:864\n1620#2,3:865\n145#3,13:868\n145#3,13:881\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n795#1:864\n795#1:865,3\n796#1:868,13\n797#1:881,13\n*E\n"})
/* renamed from: Pe */
/* loaded from: classes.dex */
public final class C6414Pe implements InterfaceC51579xO2 {

    /* renamed from: a */
    public final C8338Ue f28779a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pe$a */
    /* loaded from: classes.dex */
    public static final class C6415a extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f28780g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6415a(int i) {
            super(1);
            this.f28780g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77402B(this.f28780g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pe$b */
    /* loaded from: classes.dex */
    public static final class C6416b extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f28781g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6416b(int i) {
            super(1);
            this.f28781g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77398t0(this.f28781g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,863:1\n32#2,6:864\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n*L\n801#1:864,6\n*E\n"})
    /* renamed from: Pe$c */
    /* loaded from: classes.dex */
    public static final class C6417c extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<OU3> f28782g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6417c(List<? extends OU3> list) {
            super(1);
            this.f28782g = list;
        }

        /* renamed from: a */
        public final void m90048a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<OU3> list = this.f28782g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OU3.AbstractC6015a.m92209n(layout, list.get(i), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m90048a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pe$d */
    /* loaded from: classes.dex */
    public static final class C6418d extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f28783g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6418d(int i) {
            super(1);
            this.f28783g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77400g0(this.f28783g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pe$e */
    /* loaded from: classes.dex */
    public static final class C6419e extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f28784g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6419e(int i) {
            super(1);
            this.f28784g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77399p0(this.f28784g));
        }
    }

    public C6414Pe(C8338Ue scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f28779a = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // p000.InterfaceC51579xO2
    /* renamed from: a */
    public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
        int collectionSizeOrDefault;
        Object obj;
        int lastIndex;
        int i;
        int lastIndex2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends InterfaceC50393vO2> list = measurables;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InterfaceC50393vO2 interfaceC50393vO2 : list) {
            arrayList.add(interfaceC50393vO2.mo8763P0(j));
        }
        OU3 ou3 = null;
        int i2 = 1;
        int i3 = 0;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int m92226i1 = ((OU3) obj).m92226i1();
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i4 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i4);
                    int m92226i12 = ((OU3) obj2).m92226i1();
                    if (m92226i1 < m92226i12) {
                        obj = obj2;
                        m92226i1 = m92226i12;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
        }
        OU3 ou32 = (OU3) obj;
        if (ou32 != null) {
            i = ou32.m92226i1();
        } else {
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int m92229d1 = ((OU3) obj3).m92229d1();
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            Object obj4 = obj3;
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i2);
                    int m92229d12 = ((OU3) obj5).m92229d1();
                    obj3 = obj4;
                    if (m92229d1 < m92229d12) {
                        obj3 = obj5;
                        m92229d1 = m92229d12;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                    obj4 = obj3;
                }
            }
            ou3 = obj3;
        }
        OU3 ou33 = ou3;
        if (ou33 != null) {
            i3 = ou33.m92229d1();
        }
        int i5 = i3;
        this.f28779a.m81217a().setValue(G52.m105834b(H52.m104430a(i, i5)));
        return InterfaceC52765zO2.m1430Y(measure, i, i5, null, new C6417c(arrayList), 4, null);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: b */
    public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new C6416b(i));
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: c */
    public int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new C6419e(i));
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: d */
    public int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new C6415a(i));
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: e */
    public int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new C6418d(i));
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
