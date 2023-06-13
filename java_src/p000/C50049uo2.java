package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C25777lo;
import p000.C37582Zn2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aø\u0001\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'\u0012\u0004\u0012\u00020(0#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001aL\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002\u001aS\u00102\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a\u008c\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020<0-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u00106\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m28432d2 = {"", "itemsCount", "Lpo2;", "itemProvider", "LGo2;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "LKS0;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Lkz0;", "constraints", "", "isVertical", "", "headerIndexes", "Llo$l;", "verticalArrangement", "Llo$d;", "horizontalArrangement", "reverseLayout", "Lg01;", "density", "Lno2;", "placementAnimator", "Lho2;", "beyondBoundsInfo", "beyondBoundsItemCount", "LZn2;", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "LOU3$a;", "", "Lkotlin/ExtensionFunctionType;", "LyO2;", "layout", "Lvo2;", "i", "(ILpo2;LGo2;IIIIIIFJZLjava/util/List;Llo$l;Llo$d;ZLg01;Lno2;Lho2;ILZn2;Lkotlin/jvm/functions/Function3;)Lvo2;", "", "LEo2;", "visibleItems", "c", "currentFirstItemIndex", "f", "(Lho2;ILGo2;Lpo2;IILZn2;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "Lxo2;", C17296a.f69688o, "Lkotlin/Pair;", "Lkotlin/Pair;", "EmptyRange", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 DataIndex.kt\nandroidx/compose/foundation/lazy/DataIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,515:1\n30#2:516\n25#2:521\n27#2:523\n25#2:524\n30#2:525\n33#3,4:517\n38#3:522\n33#3,6:526\n33#3,6:532\n33#3,4:541\n38#3:547\n33#3,6:549\n33#3,6:555\n33#3,6:561\n33#3,6:567\n33#3,6:573\n36#4,3:538\n39#4,2:545\n41#4:548\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n127#1:516\n152#1:521\n169#1:523\n176#1:524\n186#1:525\n151#1:517,4\n151#1:522\n248#1:526,6\n264#1:532,6\n330#1:541,4\n330#1:547\n376#1:549,6\n419#1:555,6\n494#1:561,6\n500#1:567,6\n505#1:573,6\n330#1:538,3\n330#1:545,2\n330#1:548\n*E\n"})
/* renamed from: uo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50049uo2 {

    /* renamed from: a */
    public static final Pair<Integer, Integer> f113002a = TuplesKt.m28425to(Integer.MIN_VALUE, Integer.MIN_VALUE);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uo2$a */
    /* loaded from: classes.dex */
    public static final class C29308a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public static final C29308a f113003g = new C29308a();

        public C29308a() {
            super(1);
        }

        /* renamed from: a */
        public final void m9719a(OU3.AbstractC6015a invoke) {
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m9719a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,515:1\n33#2,6:516\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n*L\n320#1:516,6\n*E\n"})
    /* renamed from: uo2$b */
    /* loaded from: classes.dex */
    public static final class C29309b extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<C51827xo2> f113004g;

        /* renamed from: h */
        public final /* synthetic */ C51827xo2 f113005h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29309b(List<C51827xo2> list, C51827xo2 c51827xo2) {
            super(1);
            this.f113004g = list;
            this.f113005h = c51827xo2;
        }

        /* renamed from: a */
        public final void m9718a(OU3.AbstractC6015a invoke) {
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            List<C51827xo2> list = this.f113004g;
            C51827xo2 c51827xo2 = this.f113005h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C51827xo2 c51827xo22 = list.get(i);
                if (c51827xo22 != c51827xo2) {
                    c51827xo22.m4631j(invoke);
                }
            }
            C51827xo2 c51827xo23 = this.f113005h;
            if (c51827xo23 != null) {
                c51827xo23.m4631j(invoke);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m9718a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final List<C51827xo2> m9728a(List<C32677Eo2> list, List<C32677Eo2> list2, List<C32677Eo2> list3, int i, int i2, int i3, int i4, int i5, boolean z, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, boolean z2, InterfaceC41273g01 interfaceC41273g01) {
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
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if ((list2.isEmpty() && list3.isEmpty()) ? false : false) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr[i7] = list.get(m9727b(i7, z2, size)).m108350d();
                }
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = 0;
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
                        int i9 = iArr2[first];
                        C32677Eo2 c32677Eo2 = list.get(m9727b(first, z2, size));
                        if (z2) {
                            i9 = (i6 - i9) - c32677Eo2.m108350d();
                        }
                        arrayList.add(c32677Eo2.m108348f(i9, i, i2));
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
            int size2 = list2.size();
            int i10 = i5;
            for (int i11 = 0; i11 < size2; i11++) {
                C32677Eo2 c32677Eo22 = list2.get(i11);
                i10 -= c32677Eo22.m108349e();
                arrayList.add(c32677Eo22.m108348f(i10, i, i2));
            }
            int size3 = list.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                C32677Eo2 c32677Eo23 = list.get(i13);
                arrayList.add(c32677Eo23.m108348f(i12, i, i2));
                i12 += c32677Eo23.m108349e();
            }
            int size4 = list3.size();
            for (int i14 = 0; i14 < size4; i14++) {
                C32677Eo2 c32677Eo24 = list3.get(i14);
                arrayList.add(c32677Eo24.m108348f(i12, i, i2));
                i12 += c32677Eo24.m108349e();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m9727b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: c */
    public static final List<C32677Eo2> m9726c(C42341ho2 c42341ho2, List<C32677Eo2> list, C33145Go2 c33145Go2, InterfaceC47085po2 interfaceC47085po2, int i, int i2, C37582Zn2 c37582Zn2) {
        Object last;
        Object last2;
        List<C32677Eo2> emptyList;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
        int m108352b = ((C32677Eo2) last).m108352b();
        if (c42341ho2.m35850d()) {
            m108352b = Math.max(m9724e(c42341ho2, i), m108352b);
        }
        int min = Math.min(m108352b + i2, i - 1);
        last2 = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
        int m108352b2 = ((C32677Eo2) last2).m108352b() + 1;
        if (m108352b2 <= min) {
            while (true) {
                m9725d(objectRef, c33145Go2, m108352b2);
                if (m108352b2 == min) {
                    break;
                }
                m108352b2++;
            }
        }
        int size = c37582Zn2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C37582Zn2.InterfaceC10378a interfaceC10378a = c37582Zn2.get(i3);
            int m84827c = C35944Sn2.m84827c(interfaceC47085po2, interfaceC10378a.getKey(), interfaceC10378a.getIndex());
            if (m84827c > min && m84827c < i) {
                m9725d(objectRef, c33145Go2, m84827c);
            }
        }
        List<C32677Eo2> list2 = (List) objectRef.element;
        if (list2 == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* renamed from: d */
    public static final void m9725d(Ref.ObjectRef<List<C32677Eo2>> objectRef, C33145Go2 c33145Go2, int i) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        List<C32677Eo2> list = objectRef.element;
        if (list != null) {
            list.add(c33145Go2.m104711a(KS0.m98880b(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: e */
    public static final int m9724e(C42341ho2 c42341ho2, int i) {
        return Math.min(c42341ho2.m35852b(), i - 1);
    }

    /* renamed from: f */
    public static final List<C32677Eo2> m9723f(C42341ho2 c42341ho2, int i, C33145Go2 c33145Go2, InterfaceC47085po2 interfaceC47085po2, int i2, int i3, C37582Zn2 c37582Zn2) {
        int i4;
        List<C32677Eo2> emptyList;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (c42341ho2.m35850d()) {
            i4 = Math.min(m9721h(c42341ho2, i2), i);
        } else {
            i4 = i;
        }
        int max = Math.max(0, i4 - i3);
        int i5 = i - 1;
        if (max <= i5) {
            while (true) {
                m9722g(objectRef, c33145Go2, i5);
                if (i5 == max) {
                    break;
                }
                i5--;
            }
        }
        int size = c37582Zn2.size();
        for (int i6 = 0; i6 < size; i6++) {
            C37582Zn2.InterfaceC10378a interfaceC10378a = c37582Zn2.get(i6);
            int m84827c = C35944Sn2.m84827c(interfaceC47085po2, interfaceC10378a.getKey(), interfaceC10378a.getIndex());
            if (m84827c < max) {
                m9722g(objectRef, c33145Go2, m84827c);
            }
        }
        List<C32677Eo2> list = (List) objectRef.element;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* renamed from: g */
    public static final void m9722g(Ref.ObjectRef<List<C32677Eo2>> objectRef, C33145Go2 c33145Go2, int i) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        List<C32677Eo2> list = objectRef.element;
        if (list != null) {
            list.add(c33145Go2.m104711a(KS0.m98880b(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: h */
    public static final int m9721h(C42341ho2 c42341ho2, int i) {
        return Math.min(c42341ho2.m35851c(), i - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x036c, code lost:
        if (r12 > ((p000.C32677Eo2) r13).m108352b()) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C50641vo2 m9720i(int i, InterfaceC47085po2 itemProvider, C33145Go2 measuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, List<Integer> headerIndexes, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, boolean z2, InterfaceC41273g01 density, C45899no2 placementAnimator, C42341ho2 beyondBoundsInfo, int i8, C37582Zn2 pinnedItems, Function3<? super Integer, ? super Integer, ? super Function1<? super OU3.AbstractC6015a, Unit>, ? extends InterfaceC52172yO2> layout) {
        int i9;
        int roundToInt;
        int i10;
        int i11;
        int coerceAtLeast;
        int i12;
        int i13;
        int i14;
        int roundToInt2;
        int sign;
        int sign2;
        float f2;
        Object first;
        C32677Eo2 c32677Eo2;
        int i15;
        C32677Eo2 c32677Eo22;
        int lastIndex;
        Object first2;
        float f3;
        boolean z3;
        ArrayList arrayList;
        Object first3;
        boolean z4;
        Object last;
        int roundToInt3;
        int i16;
        List emptyList;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i <= 0) {
            InterfaceC52172yO2 invoke = layout.invoke(Integer.valueOf(C44228kz0.m28061p(j)), Integer.valueOf(C44228kz0.m28062o(j)), C29308a.f113003g);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new C50641vo2(null, 0, false, 0.0f, invoke, emptyList, -i3, i2 + i4, 0, z2, z ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal, i4, i5);
        }
        int i17 = i6;
        if (i17 >= i) {
            i17 = KS0.m98880b(i - 1);
            i9 = 0;
        } else {
            i9 = i7;
        }
        roundToInt = MathKt__MathJVMKt.roundToInt(f);
        int i18 = i9 - roundToInt;
        if (KS0.m98878d(i17, KS0.m98880b(0)) && i18 < 0) {
            roundToInt += i18;
            i18 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int i19 = -i3;
        if (i5 < 0) {
            i11 = i5;
            i10 = i17;
        } else {
            i10 = i17;
            i11 = 0;
        }
        int i20 = i19 + i11;
        int i21 = 0;
        int i22 = i18 + i20;
        while (i22 < 0 && i10 - KS0.m98880b(0) > 0) {
            int m98880b = KS0.m98880b(i10 - 1);
            C32677Eo2 m104711a = measuredItemProvider.m104711a(m98880b);
            arrayList2.add(0, m104711a);
            i21 = Math.max(i21, m104711a.m108353a());
            i22 += m104711a.m108349e();
            i10 = m98880b;
        }
        if (i22 < i20) {
            roundToInt += i22;
            i22 = i20;
        }
        int i23 = i22 - i20;
        int i24 = i2 + i4;
        int i25 = i21;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i24, 0);
        int i26 = -i23;
        int size = arrayList2.size();
        int i27 = i26;
        int i28 = i10;
        for (int i29 = 0; i29 < size; i29++) {
            i28 = KS0.m98880b(i28 + 1);
            i27 += ((C32677Eo2) arrayList2.get(i29)).m108349e();
        }
        int i30 = i23;
        int i31 = i25;
        int i32 = i27;
        int i33 = i28;
        while (i33 < i && (i32 < coerceAtLeast || i32 <= 0 || arrayList2.isEmpty())) {
            int i34 = coerceAtLeast;
            C32677Eo2 m104711a2 = measuredItemProvider.m104711a(i33);
            i32 += m104711a2.m108349e();
            if (i32 <= i20) {
                i16 = i20;
                if (i33 != i - 1) {
                    int m98880b2 = KS0.m98880b(i33 + 1);
                    i30 -= m104711a2.m108349e();
                    i10 = m98880b2;
                    i33 = KS0.m98880b(i33 + 1);
                    coerceAtLeast = i34;
                    i20 = i16;
                }
            } else {
                i16 = i20;
            }
            int max = Math.max(i31, m104711a2.m108353a());
            arrayList2.add(m104711a2);
            i31 = max;
            i33 = KS0.m98880b(i33 + 1);
            coerceAtLeast = i34;
            i20 = i16;
        }
        if (i32 < i2) {
            int i35 = i2 - i32;
            i30 -= i35;
            i32 += i35;
            while (i30 < i3 && i10 - KS0.m98880b(0) > 0) {
                int m98880b3 = KS0.m98880b(i10 - 1);
                C32677Eo2 m104711a3 = measuredItemProvider.m104711a(m98880b3);
                arrayList2.add(0, m104711a3);
                i31 = Math.max(i31, m104711a3.m108353a());
                i30 += m104711a3.m108349e();
                i10 = m98880b3;
            }
            roundToInt += i35;
            if (i30 < 0) {
                i12 = i31;
                i13 = i32 + i30;
                i14 = roundToInt + i30;
                i30 = 0;
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f);
                sign = MathKt__MathJVMKt.getSign(roundToInt2);
                sign2 = MathKt__MathJVMKt.getSign(i14);
                if (sign == sign2) {
                    roundToInt3 = MathKt__MathJVMKt.roundToInt(f);
                    if (Math.abs(roundToInt3) >= Math.abs(i14)) {
                        f2 = i14;
                        if (i30 >= 0) {
                            int i36 = -i30;
                            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList2);
                            C32677Eo2 c32677Eo23 = (C32677Eo2) first;
                            if (i3 > 0 || i5 < 0) {
                                int size2 = arrayList2.size();
                                int i37 = i30;
                                C32677Eo2 c32677Eo24 = c32677Eo23;
                                int i38 = 0;
                                while (i38 < size2) {
                                    int i39 = size2;
                                    int m108349e = ((C32677Eo2) arrayList2.get(i38)).m108349e();
                                    if (i37 == 0 || m108349e > i37) {
                                        break;
                                    }
                                    c32677Eo2 = c32677Eo24;
                                    lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                    if (i38 == lastIndex) {
                                        break;
                                    }
                                    i37 -= m108349e;
                                    i38++;
                                    c32677Eo24 = (C32677Eo2) arrayList2.get(i38);
                                    size2 = i39;
                                }
                                c32677Eo2 = c32677Eo24;
                                i15 = i37;
                                c32677Eo22 = c32677Eo2;
                            } else {
                                c32677Eo22 = c32677Eo23;
                                i15 = i30;
                            }
                            C32677Eo2 c32677Eo25 = c32677Eo22;
                            float f4 = f2;
                            List<C32677Eo2> m9723f = m9723f(beyondBoundsInfo, i10, measuredItemProvider, itemProvider, i, i8, pinnedItems);
                            int size3 = m9723f.size();
                            for (int i40 = 0; i40 < size3; i40++) {
                                i12 = Math.max(i12, m9723f.get(i40).m108353a());
                            }
                            List<C32677Eo2> m9726c = m9726c(beyondBoundsInfo, arrayList2, measuredItemProvider, itemProvider, i, i8, pinnedItems);
                            int size4 = m9726c.size();
                            for (int i41 = 0; i41 < size4; i41++) {
                                i12 = Math.max(i12, m9726c.get(i41).m108353a());
                            }
                            first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList2);
                            boolean z5 = Intrinsics.areEqual(c32677Eo25, first2) && m9723f.isEmpty() && m9726c.isEmpty();
                            int m22037g = C46007nz0.m22037g(j, z ? i12 : i13);
                            if (z) {
                                i12 = i13;
                            }
                            int m22038f = C46007nz0.m22038f(j, i12);
                            int i42 = i13;
                            int i43 = i33;
                            List<C51827xo2> m9728a = m9728a(arrayList2, m9723f, m9726c, m22037g, m22038f, i42, i2, i36, z, interfaceC25789l, interfaceC25781d, z2, density);
                            placementAnimator.m22350g((int) f4, m22037g, m22038f, m9728a, measuredItemProvider);
                            C51827xo2 m28437a = headerIndexes.isEmpty() ^ true ? C44120ko2.m28437a(m9728a, measuredItemProvider, headerIndexes, i3, m22037g, m22038f) : null;
                            if (i43 >= i) {
                                f3 = f4;
                                if (i42 <= i2) {
                                    z3 = false;
                                    InterfaceC52172yO2 invoke2 = layout.invoke(Integer.valueOf(m22037g), Integer.valueOf(m22038f), new C29309b(m9728a, m28437a));
                                    if (z5) {
                                        ArrayList arrayList3 = new ArrayList(m9728a.size());
                                        int size5 = m9728a.size();
                                        for (int i44 = 0; i44 < size5; i44++) {
                                            C51827xo2 c51827xo2 = m9728a.get(i44);
                                            C51827xo2 c51827xo22 = c51827xo2;
                                            int index = c51827xo22.getIndex();
                                            first3 = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList2);
                                            if (index >= ((C32677Eo2) first3).m108352b()) {
                                                int index2 = c51827xo22.getIndex();
                                                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList2);
                                            }
                                            if (c51827xo22 != m28437a) {
                                                z4 = false;
                                                if (!z4) {
                                                    arrayList3.add(c51827xo2);
                                                }
                                            }
                                            z4 = true;
                                            if (!z4) {
                                            }
                                        }
                                        arrayList = arrayList3;
                                    } else {
                                        arrayList = m9728a;
                                    }
                                    return new C50641vo2(c32677Eo25, i15, z3, f3, invoke2, arrayList, i19, i24, i, z2, !z ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal, i4, i5);
                                }
                            } else {
                                f3 = f4;
                            }
                            z3 = true;
                            InterfaceC52172yO2 invoke22 = layout.invoke(Integer.valueOf(m22037g), Integer.valueOf(m22038f), new C29309b(m9728a, m28437a));
                            if (z5) {
                            }
                            return new C50641vo2(c32677Eo25, i15, z3, f3, invoke22, arrayList, i19, i24, i, z2, !z ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal, i4, i5);
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                f2 = f;
                if (i30 >= 0) {
                }
            }
        }
        i12 = i31;
        i13 = i32;
        i14 = roundToInt;
        roundToInt2 = MathKt__MathJVMKt.roundToInt(f);
        sign = MathKt__MathJVMKt.getSign(roundToInt2);
        sign2 = MathKt__MathJVMKt.getSign(i14);
        if (sign == sign2) {
        }
        f2 = f;
        if (i30 >= 0) {
        }
    }
}
