package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C25777lo;
import p000.C37582Zn2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aê\u0001\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2/\u0010(\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#¢\u0006\u0002\b&\u0012\u0004\u0012\u00020'0\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a\u008c\u0001\u00109\u001a\b\u0012\u0004\u0012\u000208072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0,2\f\u00101\u001a\b\u0012\u0004\u0012\u00020/0,2\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a$\u0010;\u001a\u000208*\u00020/2\u0006\u0010:\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, m28432d2 = {"", "itemsCount", "Lon2;", "itemProvider", "LHo2;", "measuredLineProvider", "LFo2;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "Lrr2;", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Lkz0;", "constraints", "", "isVertical", "Llo$l;", "verticalArrangement", "Llo$d;", "horizontalArrangement", "reverseLayout", "Lg01;", "density", "Lmn2;", "placementAnimator", "LFn2;", "spanLayoutProvider", "LZn2;", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "LOU3$a;", "", "Lkotlin/ExtensionFunctionType;", "LyO2;", "layout", "Lxn2;", "c", "(ILon2;LHo2;LFo2;IIIIIIFJZLlo$l;Llo$d;ZLg01;Lmn2;LFn2;LZn2;Lkotlin/jvm/functions/Function3;)Lxn2;", "", "Lzn2;", "lines", "Lyn2;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "LAn2;", C17296a.f69688o, "mainAxisOffset", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/LineIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,435:1\n315#1,3:446\n318#1,14:453\n333#1:468\n315#1,3:469\n318#1,14:476\n333#1:491\n30#2:436\n25#2:441\n27#2:443\n25#2:444\n30#2:445\n33#3,4:437\n38#3:442\n33#3,4:449\n38#3:467\n33#3,4:472\n38#3:490\n33#3,4:495\n38#3:501\n33#3,6:503\n132#3,3:509\n33#3,4:512\n135#3,2:516\n38#3:518\n137#3:519\n33#3,6:520\n33#3,6:526\n33#3,6:532\n36#4,3:492\n39#4,2:499\n41#4:502\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n213#1:446,3\n213#1:453,14\n213#1:468\n221#1:469,3\n221#1:476,14\n221#1:491\n118#1:436\n142#1:441\n163#1:443\n168#1:444\n178#1:445\n141#1:437,4\n141#1:442\n213#1:449,4\n213#1:467\n221#1:472,4\n221#1:490\n294#1:495,4\n294#1:501\n317#1:503,6\n360#1:509,3\n360#1:512,4\n360#1:516,2\n360#1:518\n360#1:519\n403#1:520,6\n409#1:526,6\n414#1:532,6\n294#1:492,3\n294#1:499,2\n294#1:502\n*E\n"})
/* renamed from: wn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51224wn2 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wn2$a */
    /* loaded from: classes.dex */
    public static final class C29960a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public static final C29960a f116532g = new C29960a();

        public C29960a() {
            super(1);
        }

        /* renamed from: a */
        public final void m6322a(OU3.AbstractC6015a invoke) {
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m6322a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n33#2,6:436\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3\n*L\n287#1:436,6\n*E\n"})
    /* renamed from: wn2$b */
    /* loaded from: classes.dex */
    public static final class C29961b extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<C31732An2> f116533g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29961b(List<C31732An2> list) {
            super(1);
            this.f116533g = list;
        }

        /* renamed from: a */
        public final void m6321a(OU3.AbstractC6015a invoke) {
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            List<C31732An2> list = this.f116533g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m115255n(invoke);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m6321a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final List<C31732An2> m6326a(List<C53003zn2> list, List<C52410yn2> list2, List<C52410yn2> list3, int i, int i2, int i3, int i4, int i5, boolean z, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, boolean z2, InterfaceC41273g01 interfaceC41273g01) {
        int i6;
        boolean z3;
        IntProgression indices;
        boolean z4;
        if (z) {
            i6 = i2;
        } else {
            i6 = i;
        }
        boolean z5 = true;
        if (i3 < Math.min(i6, i4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i5 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).m443b().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z3) {
            if ((list2.isEmpty() && list3.isEmpty()) ? false : false) {
                int size2 = list.size();
                int[] iArr = new int[size2];
                for (int i9 = 0; i9 < size2; i9++) {
                    iArr[i9] = list.get(m6325b(i9, z2, size2)).m442c();
                }
                int[] iArr2 = new int[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    iArr2[i10] = 0;
                }
                if (z) {
                    if (interfaceC25789l != null) {
                        interfaceC25789l.mo26792c(interfaceC41273g01, i6, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (interfaceC25781d != null) {
                    interfaceC25781d.mo26794b(interfaceC41273g01, i6, iArr, EnumC47065pm2.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                indices = ArraysKt___ArraysKt.getIndices(iArr2);
                if (z2) {
                    indices = RangesKt___RangesKt.reversed(indices);
                }
                int first = indices.getFirst();
                int last = indices.getLast();
                int step = indices.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        int i11 = iArr2[first];
                        C53003zn2 c53003zn2 = list.get(m6325b(first, z2, size2));
                        if (z2) {
                            i11 = (i6 - i11) - c53003zn2.m442c();
                        }
                        arrayList.addAll(c53003zn2.m439f(i11, i, i2));
                        if (first == last) {
                            break;
                        }
                        first += step;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size3 = list2.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                C52410yn2 c52410yn2 = list2.get(i13);
                i12 -= c52410yn2.m2583e();
                arrayList.add(m6323d(c52410yn2, i12, i, i2));
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                C53003zn2 c53003zn22 = list.get(i15);
                arrayList.addAll(c53003zn22.m439f(i14, i, i2));
                i14 += c53003zn22.m441d();
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                C52410yn2 c52410yn22 = list3.get(i16);
                arrayList.add(m6323d(c52410yn22, i14, i, i2));
                i14 += c52410yn22.m2583e();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m6325b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C51817xn2 m6324c(int i, InterfaceC46482on2 itemProvider, C33379Ho2 measuredLineProvider, C32911Fo2 measuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, boolean z2, InterfaceC41273g01 density, C45296mn2 placementAnimator, C32902Fn2 spanLayoutProvider, C37582Zn2 pinnedItems, Function3<? super Integer, ? super Integer, ? super Function1<? super OU3.AbstractC6015a, Unit>, ? extends InterfaceC52172yO2> layout) {
        int roundToInt;
        int coerceAtLeast;
        int i8;
        int i9;
        int roundToInt2;
        int sign;
        int sign2;
        float f2;
        Object first;
        Object firstOrNull;
        Object lastOrNull;
        int i10;
        int size;
        List list;
        int i11;
        List list2;
        int i12;
        int i13;
        List list3;
        int size2;
        int i14;
        int size3;
        int i15;
        int i16;
        C53003zn2 c53003zn2;
        int lastIndex;
        int i17;
        int m22037g;
        int m28064m;
        List<C31732An2> m6326a;
        int size4;
        int i18;
        ArrayList arrayList;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float f3;
        int i27;
        int i28;
        int i29;
        int i30;
        C52410yn2[] m443b;
        Object lastOrNull2;
        int roundToInt3;
        int i31;
        int i32;
        Object last;
        List emptyList;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i <= 0) {
            InterfaceC52172yO2 invoke = layout.invoke(Integer.valueOf(C44228kz0.m28061p(j)), Integer.valueOf(C44228kz0.m28062o(j)), C29960a.f116532g);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new C51817xn2(null, 0, false, 0.0f, invoke, emptyList, -i3, i2 + i4, 0, z2, z ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal, i4, i5);
        }
        roundToInt = MathKt__MathJVMKt.roundToInt(f);
        int i33 = i7 - roundToInt;
        if (C48301rr2.m15179d(i6, C48301rr2.m15181b(0)) && i33 < 0) {
            roundToInt += i33;
            i33 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int i34 = -i3;
        int i35 = i34 + (i5 < 0 ? i5 : 0);
        int i36 = i33 + i35;
        int i37 = i6;
        while (i36 < 0 && i37 - C48301rr2.m15181b(0) > 0) {
            int m15181b = C48301rr2.m15181b(i37 - 1);
            C53003zn2 m103424b = measuredLineProvider.m103424b(m15181b);
            arrayList2.add(0, m103424b);
            i36 += m103424b.m441d();
            i37 = m15181b;
        }
        if (i36 < i35) {
            roundToInt += i36;
            i36 = i35;
        }
        int i38 = i36 - i35;
        int i39 = i2 + i4;
        int i40 = i34;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i39, 0);
        int i41 = -i38;
        int size5 = arrayList2.size();
        int i42 = i41;
        int i43 = i37;
        for (int i44 = 0; i44 < size5; i44++) {
            i43 = C48301rr2.m15181b(i43 + 1);
            i42 += ((C53003zn2) arrayList2.get(i44)).m441d();
        }
        int i45 = i38;
        int i46 = i39;
        int i47 = i42;
        int i48 = i43;
        while (i48 < i && (i47 < coerceAtLeast || i47 <= 0 || arrayList2.isEmpty())) {
            int i49 = coerceAtLeast;
            C53003zn2 m103424b2 = measuredLineProvider.m103424b(i48);
            if (m103424b2.m440e()) {
                break;
            }
            int m441d = i47 + m103424b2.m441d();
            if (m441d <= i35) {
                last = ArraysKt___ArraysKt.last(m103424b2.m443b());
                i31 = i35;
                int m2586b = ((C52410yn2) last).m2586b();
                i32 = m441d;
                if (m2586b != i - 1) {
                    int m15181b2 = C48301rr2.m15181b(i48 + 1);
                    i45 -= m103424b2.m441d();
                    i37 = m15181b2;
                    i48 = C48301rr2.m15181b(i48 + 1);
                    coerceAtLeast = i49;
                    i47 = i32;
                    i35 = i31;
                }
            } else {
                i31 = i35;
                i32 = m441d;
            }
            arrayList2.add(m103424b2);
            i48 = C48301rr2.m15181b(i48 + 1);
            coerceAtLeast = i49;
            i47 = i32;
            i35 = i31;
        }
        if (i47 < i2) {
            int i50 = i2 - i47;
            i45 -= i50;
            i47 += i50;
            while (true) {
                i8 = 0;
                if (i45 >= i3 || i37 - C48301rr2.m15181b(0) <= 0) {
                    break;
                }
                int m15181b3 = C48301rr2.m15181b(i37 - 1);
                C53003zn2 m103424b3 = measuredLineProvider.m103424b(m15181b3);
                arrayList2.add(0, m103424b3);
                i45 += m103424b3.m441d();
                i37 = m15181b3;
            }
            roundToInt += i50;
            if (i45 < 0) {
                roundToInt += i45;
                i47 += i45;
                i9 = 0;
                int i51 = i47;
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f);
                sign = MathKt__MathJVMKt.getSign(roundToInt2);
                sign2 = MathKt__MathJVMKt.getSign(roundToInt);
                if (sign == sign2) {
                    roundToInt3 = MathKt__MathJVMKt.roundToInt(f);
                    if (Math.abs(roundToInt3) >= Math.abs(roundToInt)) {
                        f2 = roundToInt;
                        if ((i9 >= 0 ? 1 : i8) != 0) {
                            int i52 = -i9;
                            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList2);
                            C53003zn2 c53003zn22 = (C53003zn2) first;
                            firstOrNull = ArraysKt___ArraysKt.firstOrNull(c53003zn22.m443b());
                            C52410yn2 c52410yn2 = (C52410yn2) firstOrNull;
                            int m2586b2 = c52410yn2 != null ? c52410yn2.m2586b() : i8;
                            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) arrayList2);
                            C53003zn2 c53003zn23 = (C53003zn2) lastOrNull;
                            if (c53003zn23 != null && (m443b = c53003zn23.m443b()) != null) {
                                lastOrNull2 = ArraysKt___ArraysKt.lastOrNull(m443b);
                                C52410yn2 c52410yn22 = (C52410yn2) lastOrNull2;
                                if (c52410yn22 != null) {
                                    i10 = c52410yn22.m2586b();
                                    int i53 = i51;
                                    size = pinnedItems.size();
                                    list = null;
                                    int i54 = i52;
                                    i11 = i8;
                                    list2 = null;
                                    while (i11 < size) {
                                        C37582Zn2.InterfaceC10378a interfaceC10378a = pinnedItems.get(i11);
                                        int i55 = i9;
                                        int m84827c = C35944Sn2.m84827c(itemProvider, interfaceC10378a.getKey(), interfaceC10378a.getIndex());
                                        if (m84827c >= 0 && m84827c < m2586b2) {
                                            int m9974b = C49929uc2.m9974b(m84827c);
                                            long m103423c = measuredLineProvider.m103423c(m9974b);
                                            i24 = i10;
                                            i25 = m2586b2;
                                            i29 = 0;
                                            i26 = i11;
                                            i27 = i54;
                                            i22 = i46;
                                            f3 = f2;
                                            i23 = i53;
                                            i28 = i40;
                                            i30 = size;
                                            C52410yn2 m106442b = C32911Fo2.m106442b(measuredItemProvider, m9974b, 0, m103423c, 2, null);
                                            List arrayList3 = list2 == null ? new ArrayList() : list2;
                                            arrayList3.add(m106442b);
                                            list2 = arrayList3;
                                        } else {
                                            i22 = i46;
                                            i23 = i53;
                                            i24 = i10;
                                            i25 = m2586b2;
                                            i26 = i11;
                                            f3 = f2;
                                            i27 = i54;
                                            i28 = i40;
                                            i29 = 0;
                                            i30 = size;
                                        }
                                        i11 = i26 + 1;
                                        i54 = i27;
                                        size = i30;
                                        i9 = i55;
                                        i40 = i28;
                                        i10 = i24;
                                        i8 = i29;
                                        m2586b2 = i25;
                                        i46 = i22;
                                        f2 = f3;
                                        i53 = i23;
                                    }
                                    int i56 = i46;
                                    int i57 = i53;
                                    i12 = i9;
                                    int i58 = i10;
                                    int i59 = m2586b2;
                                    i13 = i8;
                                    float f4 = f2;
                                    int i60 = i54;
                                    int i61 = i40;
                                    if (list2 == null) {
                                        list2 = CollectionsKt__CollectionsKt.emptyList();
                                    }
                                    list3 = list2;
                                    size2 = pinnedItems.size();
                                    i14 = i13;
                                    while (i14 < size2) {
                                        C37582Zn2.InterfaceC10378a interfaceC10378a2 = pinnedItems.get(i14);
                                        int m84827c2 = C35944Sn2.m84827c(itemProvider, interfaceC10378a2.getKey(), interfaceC10378a2.getIndex());
                                        int i62 = i58;
                                        if (((i62 + 1 > m84827c2 || m84827c2 >= i) ? i13 : 1) != 0) {
                                            int m9974b2 = C49929uc2.m9974b(m84827c2);
                                            i19 = i14;
                                            i20 = i62;
                                            i21 = size2;
                                            C52410yn2 m106442b2 = C32911Fo2.m106442b(measuredItemProvider, m9974b2, 0, measuredLineProvider.m103423c(m9974b2), 2, null);
                                            if (list == null) {
                                                list = new ArrayList();
                                            }
                                            List list4 = list;
                                            list4.add(m106442b2);
                                            list = list4;
                                        } else {
                                            i19 = i14;
                                            i20 = i62;
                                            i21 = size2;
                                        }
                                        i14 = i19 + 1;
                                        size2 = i21;
                                        i58 = i20;
                                    }
                                    int i63 = i58;
                                    if (list == null) {
                                        list = CollectionsKt__CollectionsKt.emptyList();
                                    }
                                    List list5 = list;
                                    if (i3 <= 0 || i5 < 0) {
                                        size3 = arrayList2.size();
                                        i15 = i12;
                                        i16 = i13;
                                        while (i16 < size3) {
                                            int m441d2 = ((C53003zn2) arrayList2.get(i16)).m441d();
                                            if (i15 == 0 || m441d2 > i15) {
                                                break;
                                            }
                                            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                            if (i16 == lastIndex) {
                                                break;
                                            }
                                            i15 -= m441d2;
                                            i16++;
                                            c53003zn22 = (C53003zn2) arrayList2.get(i16);
                                        }
                                        c53003zn2 = c53003zn22;
                                    } else {
                                        c53003zn2 = c53003zn22;
                                        i15 = i12;
                                    }
                                    if (!z) {
                                        m22037g = C44228kz0.m28063n(j);
                                        i17 = i57;
                                    } else {
                                        i17 = i57;
                                        m22037g = C46007nz0.m22037g(j, i17);
                                    }
                                    if (!z) {
                                        m28064m = C46007nz0.m22038f(j, i17);
                                    } else {
                                        m28064m = C44228kz0.m28064m(j);
                                    }
                                    m6326a = m6326a(arrayList2, list3, list5, m22037g, m28064m, i17, i2, i60, z, interfaceC25789l, interfaceC25781d, z2, density);
                                    placementAnimator.m24999h((int) f4, m22037g, m28064m, m6326a, measuredItemProvider, spanLayoutProvider);
                                    int i64 = (i63 == i + (-1) || i17 > i2) ? 1 : i13;
                                    InterfaceC52172yO2 invoke2 = layout.invoke(Integer.valueOf(m22037g), Integer.valueOf(m28064m), new C29961b(m6326a));
                                    if (list3.isEmpty() || !list5.isEmpty()) {
                                        ArrayList arrayList4 = new ArrayList(m6326a.size());
                                        size4 = m6326a.size();
                                        i18 = i13;
                                        while (i18 < size4) {
                                            C31732An2 c31732An2 = m6326a.get(i18);
                                            int index = c31732An2.getIndex();
                                            int i65 = i59;
                                            if (((i65 > index || index > i63) ? i13 : 1) != 0) {
                                                arrayList4.add(c31732An2);
                                            }
                                            i18++;
                                            i59 = i65;
                                        }
                                        arrayList = arrayList4;
                                    } else {
                                        arrayList = m6326a;
                                    }
                                    return new C51817xn2(c53003zn2, i15, i64, f4, invoke2, arrayList, i61, i56, i, z2, !z ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal, i4, i5);
                                }
                            }
                            i10 = i8;
                            int i532 = i51;
                            size = pinnedItems.size();
                            list = null;
                            int i542 = i52;
                            i11 = i8;
                            list2 = null;
                            while (i11 < size) {
                            }
                            int i562 = i46;
                            int i572 = i532;
                            i12 = i9;
                            int i582 = i10;
                            int i592 = m2586b2;
                            i13 = i8;
                            float f42 = f2;
                            int i602 = i542;
                            int i612 = i40;
                            if (list2 == null) {
                            }
                            list3 = list2;
                            size2 = pinnedItems.size();
                            i14 = i13;
                            while (i14 < size2) {
                            }
                            int i632 = i582;
                            if (list == null) {
                            }
                            List list52 = list;
                            if (i3 <= 0) {
                            }
                            size3 = arrayList2.size();
                            i15 = i12;
                            i16 = i13;
                            while (i16 < size3) {
                            }
                            c53003zn2 = c53003zn22;
                            if (!z) {
                            }
                            if (!z) {
                            }
                            m6326a = m6326a(arrayList2, list3, list52, m22037g, m28064m, i17, i2, i602, z, interfaceC25789l, interfaceC25781d, z2, density);
                            placementAnimator.m24999h((int) f42, m22037g, m28064m, m6326a, measuredItemProvider, spanLayoutProvider);
                            if (i632 == i + (-1)) {
                            }
                            InterfaceC52172yO2 invoke22 = layout.invoke(Integer.valueOf(m22037g), Integer.valueOf(m28064m), new C29961b(m6326a));
                            if (list3.isEmpty()) {
                            }
                            ArrayList arrayList42 = new ArrayList(m6326a.size());
                            size4 = m6326a.size();
                            i18 = i13;
                            while (i18 < size4) {
                            }
                            arrayList = arrayList42;
                            return new C51817xn2(c53003zn2, i15, i64, f42, invoke22, arrayList, i612, i562, i, z2, !z ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal, i4, i5);
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                f2 = f;
                if ((i9 >= 0 ? 1 : i8) != 0) {
                }
            }
        } else {
            i8 = 0;
        }
        i9 = i45;
        int i512 = i47;
        roundToInt2 = MathKt__MathJVMKt.roundToInt(f);
        sign = MathKt__MathJVMKt.getSign(roundToInt2);
        sign2 = MathKt__MathJVMKt.getSign(roundToInt);
        if (sign == sign2) {
        }
        f2 = f;
        if ((i9 >= 0 ? 1 : i8) != 0) {
        }
    }

    /* renamed from: d */
    public static final C31732An2 m6323d(C52410yn2 c52410yn2, int i, int i2, int i3) {
        return c52410yn2.m2582f(i, 0, i2, i3, 0, 0);
    }
}
