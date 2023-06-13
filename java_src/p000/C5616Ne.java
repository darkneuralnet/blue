package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.C6080Oe;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u001b\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LNe;", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "b", DateTokenConverter.CONVERTER_KEY, "LOe;", "LOe;", "f", "()LOe;", "rootScope", "<init>", "(LOe;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,780:1\n49#2,6:781\n49#2,6:787\n14166#3,14:793\n14166#3,14:807\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n730#1:781,6\n737#1:787,6\n743#1:793,14\n744#1:807,14\n*E\n"})
/* renamed from: Ne */
/* loaded from: classes.dex */
public final class C5616Ne implements InterfaceC51579xO2 {

    /* renamed from: a */
    public final C6080Oe<?> f24893a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne$a */
    /* loaded from: classes.dex */
    public static final class C5617a extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f24894g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5617a(int i) {
            super(1);
            this.f24894g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77402B(this.f24894g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne$b */
    /* loaded from: classes.dex */
    public static final class C5618b extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f24895g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5618b(int i) {
            super(1);
            this.f24895g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77398t0(this.f24895g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,780:1\n13579#2,2:781\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n748#1:781,2\n*E\n"})
    /* renamed from: Ne$c */
    /* loaded from: classes.dex */
    public static final class C5619c extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3[] f24896g;

        /* renamed from: h */
        public final /* synthetic */ C5616Ne f24897h;

        /* renamed from: i */
        public final /* synthetic */ int f24898i;

        /* renamed from: j */
        public final /* synthetic */ int f24899j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5619c(OU3[] ou3Arr, C5616Ne c5616Ne, int i, int i2) {
            super(1);
            this.f24896g = ou3Arr;
            this.f24897h = c5616Ne;
            this.f24898i = i;
            this.f24899j = i2;
        }

        /* renamed from: a */
        public final void m93677a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3[] ou3Arr = this.f24896g;
            C5616Ne c5616Ne = this.f24897h;
            int i = this.f24898i;
            int i2 = this.f24899j;
            for (OU3 ou3 : ou3Arr) {
                if (ou3 != null) {
                    long mo99146a = c5616Ne.m93680f().m91776f().mo99146a(H52.m104430a(ou3.m92226i1(), ou3.m92229d1()), H52.m104430a(i, i2), EnumC47065pm2.Ltr);
                    OU3.AbstractC6015a.m92209n(layout, ou3, A52.m116111j(mo99146a), A52.m116110k(mo99146a), 0.0f, 4, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m93677a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne$d */
    /* loaded from: classes.dex */
    public static final class C5620d extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f24900g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5620d(int i) {
            super(1);
            this.f24900g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77400g0(this.f24900g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX62;", "it", "", C17296a.f69688o, "(LX62;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne$e */
    /* loaded from: classes.dex */
    public static final class C5621e extends Lambda implements Function1<X62, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f24901g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5621e(int i) {
            super(1);
            this.f24901g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(X62 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.mo77399p0(this.f24901g));
        }
    }

    public C5616Ne(C6080Oe<?> rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.f24893a = rootScope;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @Override // p000.InterfaceC51579xO2
    /* renamed from: a */
    public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
        OU3 ou3;
        Object[] objArr;
        OU3 ou32;
        int lastIndex;
        int i;
        int i2;
        int i3;
        Object[] objArr2;
        int i4;
        int lastIndex2;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        OU3[] ou3Arr = new OU3[size];
        int size2 = measurables.size();
        int i7 = 0;
        while (true) {
            ou3 = null;
            C6080Oe.C6081a c6081a = null;
            boolean z = true;
            if (i7 >= size2) {
                break;
            }
            InterfaceC50393vO2 interfaceC50393vO2 = measurables.get(i7);
            Object mo77401c = interfaceC50393vO2.mo77401c();
            if (mo77401c instanceof C6080Oe.C6081a) {
                c6081a = (C6080Oe.C6081a) mo77401c;
            }
            if ((c6081a == null || !c6081a.m91770a()) ? false : false) {
                ou3Arr[i7] = interfaceC50393vO2.mo8763P0(j);
            }
            i7++;
        }
        int size3 = measurables.size();
        for (int i8 = 0; i8 < size3; i8++) {
            InterfaceC50393vO2 interfaceC50393vO22 = measurables.get(i8);
            if (ou3Arr[i8] == null) {
                ou3Arr[i8] = interfaceC50393vO22.mo8763P0(j);
            }
        }
        if (size == 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr != null) {
            ou32 = null;
        } else {
            ou32 = ou3Arr[0];
            lastIndex = ArraysKt___ArraysKt.getLastIndex(ou3Arr);
            if (lastIndex != 0) {
                if (ou32 != null) {
                    i = ou32.m92226i1();
                } else {
                    i = 0;
                }
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    OU3 ou33 = ou3Arr[it.nextInt()];
                    if (ou33 != null) {
                        i2 = ou33.m92226i1();
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        ou32 = ou33;
                        i = i2;
                    }
                }
            }
        }
        if (ou32 != null) {
            i3 = ou32.m92226i1();
        } else {
            i3 = 0;
        }
        if (size == 0) {
            objArr2 = 1;
        } else {
            objArr2 = null;
        }
        if (objArr2 == null) {
            ou3 = ou3Arr[0];
            lastIndex2 = ArraysKt___ArraysKt.getLastIndex(ou3Arr);
            if (lastIndex2 != 0) {
                if (ou3 != null) {
                    i5 = ou3.m92229d1();
                } else {
                    i5 = 0;
                }
                ?? it2 = new IntRange(1, lastIndex2).iterator();
                while (it2.hasNext()) {
                    OU3 ou34 = ou3Arr[it2.nextInt()];
                    if (ou34 != null) {
                        i6 = ou34.m92229d1();
                    } else {
                        i6 = 0;
                    }
                    if (i5 < i6) {
                        ou3 = ou34;
                        i5 = i6;
                    }
                }
            }
        }
        if (ou3 != null) {
            i4 = ou3.m92229d1();
        } else {
            i4 = 0;
        }
        this.f24893a.m91771k(H52.m104430a(i3, i4));
        return InterfaceC52765zO2.m1430Y(measure, i3, i4, null, new C5619c(ou3Arr, this, i3, i4), 4, null);
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
        map = SequencesKt___SequencesKt.map(asSequence, new C5618b(i));
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
        map = SequencesKt___SequencesKt.map(asSequence, new C5621e(i));
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
        map = SequencesKt___SequencesKt.map(asSequence, new C5617a(i));
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
        map = SequencesKt___SequencesKt.map(asSequence, new C5620d(i));
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: f */
    public final C6080Oe<?> m93680f() {
        return this.f24893a;
    }
}
