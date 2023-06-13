package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001aa\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0015\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001at\u0010\"\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001d\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0002\u001aE\u0010$\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001ad\u0010&\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\"\u001a\u0010*\u001a\u0004\u0018\u00010'*\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u001a\u0010.\u001a\u00020+*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020/*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\"\u001a\u00106\u001a\u00020/*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"LRm2;", "orientation", "Lkotlin/Function5;", "", "", "Lpm2;", "Lg01;", "", "arrangement", "Lk61;", "arrangementSpacing", "LDB5;", "crossAxisSize", "LQE0;", "crossAxisAlignment", "LxO2;", "r", "(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;)LxO2;", "Lkotlin/Function3;", "", "LX62;", DateTokenConverter.CONVERTER_KEY, "c", "b", C17296a.f69688o, "children", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "p", "mainAxisSize", "o", "mainAxisAvailable", "n", "LXc5;", "l", "(LX62;)LXc5;", "rowColumnParentData", "", "m", "(LXc5;)F", "weight", "", "k", "(LXc5;)Z", "fill", "j", "(LXc5;)LQE0;", "q", "isRelative", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,769:1\n32#2,6:770\n32#2,6:776\n32#2,6:782\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n532#1:770,6\n556#1:776,6\n582#1:782,6\n*E\n"})
/* renamed from: Uc5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36316Uc5 {

    @Metadata(m28433d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Uc5$a", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "b", DateTokenConverter.CONVERTER_KEY, "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Uc5$a */
    /* loaded from: classes.dex */
    public static final class C8335a implements InterfaceC51579xO2 {

        /* renamed from: a */
        public final /* synthetic */ EnumC35701Rm2 f37681a;

        /* renamed from: b */
        public final /* synthetic */ Function5<Integer, int[], EnumC47065pm2, InterfaceC41273g01, int[], Unit> f37682b;

        /* renamed from: c */
        public final /* synthetic */ float f37683c;

        /* renamed from: d */
        public final /* synthetic */ DB5 f37684d;

        /* renamed from: e */
        public final /* synthetic */ QE0 f37685e;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Uc5$a$a */
        /* loaded from: classes.dex */
        public static final class C8336a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36784Wc5 f37686g;

            /* renamed from: h */
            public final /* synthetic */ C36550Vc5 f37687h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC52765zO2 f37688i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8336a(C36784Wc5 c36784Wc5, C36550Vc5 c36550Vc5, InterfaceC52765zO2 interfaceC52765zO2) {
                super(1);
                this.f37686g = c36784Wc5;
                this.f37687h = c36550Vc5;
                this.f37688i = interfaceC52765zO2;
            }

            /* renamed from: a */
            public final void m81234a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                this.f37686g.m78124f(layout, this.f37687h, 0, this.f37688i.getLayoutDirection());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m81234a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C8335a(EnumC35701Rm2 enumC35701Rm2, Function5<? super Integer, ? super int[], ? super EnumC47065pm2, ? super InterfaceC41273g01, ? super int[], Unit> function5, float f, DB5 db5, QE0 qe0) {
            this.f37681a = enumC35701Rm2;
            this.f37682b = function5;
            this.f37683c = f;
            this.f37684d = db5;
            this.f37685e = qe0;
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
            int m79649b;
            int m79646e;
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            C36784Wc5 c36784Wc5 = new C36784Wc5(this.f37681a, this.f37682b, this.f37683c, this.f37684d, this.f37685e, measurables, new OU3[measurables.size()], null);
            C36550Vc5 m78125e = c36784Wc5.m78125e(measure, j, 0, measurables.size());
            if (this.f37681a == EnumC35701Rm2.Horizontal) {
                m79649b = m78125e.m79646e();
                m79646e = m78125e.m79649b();
            } else {
                m79649b = m78125e.m79649b();
                m79646e = m78125e.m79646e();
            }
            return InterfaceC52765zO2.m1430Y(measure, m79649b, m79646e, null, new C8336a(c36784Wc5, m78125e, measure), 4, null);
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: b */
        public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return ((Number) C36316Uc5.m81251b(this.f37681a).invoke(measurables, Integer.valueOf(i), Integer.valueOf(z62.mo3416F0(this.f37683c)))).intValue();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: c */
        public int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return ((Number) C36316Uc5.m81249d(this.f37681a).invoke(measurables, Integer.valueOf(i), Integer.valueOf(z62.mo3416F0(this.f37683c)))).intValue();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: d */
        public int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return ((Number) C36316Uc5.m81252a(this.f37681a).invoke(measurables, Integer.valueOf(i), Integer.valueOf(z62.mo3416F0(this.f37683c)))).intValue();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: e */
        public int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return ((Number) C36316Uc5.m81250c(this.f37681a).invoke(measurables, Integer.valueOf(i), Integer.valueOf(z62.mo3416F0(this.f37683c)))).intValue();
        }
    }

    /* renamed from: a */
    public static final Function3<List<? extends X62>, Integer, Integer, Integer> m81252a(EnumC35701Rm2 enumC35701Rm2) {
        if (enumC35701Rm2 == EnumC35701Rm2.Horizontal) {
            return Y62.f44522a.m75735a();
        }
        return Y62.f44522a.m75731e();
    }

    /* renamed from: b */
    public static final Function3<List<? extends X62>, Integer, Integer, Integer> m81251b(EnumC35701Rm2 enumC35701Rm2) {
        if (enumC35701Rm2 == EnumC35701Rm2.Horizontal) {
            return Y62.f44522a.m75734b();
        }
        return Y62.f44522a.m75730f();
    }

    /* renamed from: c */
    public static final Function3<List<? extends X62>, Integer, Integer, Integer> m81250c(EnumC35701Rm2 enumC35701Rm2) {
        if (enumC35701Rm2 == EnumC35701Rm2.Horizontal) {
            return Y62.f44522a.m75733c();
        }
        return Y62.f44522a.m75729g();
    }

    /* renamed from: d */
    public static final Function3<List<? extends X62>, Integer, Integer, Integer> m81249d(EnumC35701Rm2 enumC35701Rm2) {
        if (enumC35701Rm2 == EnumC35701Rm2.Horizontal) {
            return Y62.f44522a.m75732d();
        }
        return Y62.f44522a.m75728h();
    }

    /* renamed from: j */
    public static final QE0 m81243j(C37018Xc5 c37018Xc5) {
        if (c37018Xc5 != null) {
            return c37018Xc5.m76759a();
        }
        return null;
    }

    /* renamed from: k */
    public static final boolean m81242k(C37018Xc5 c37018Xc5) {
        if (c37018Xc5 != null) {
            return c37018Xc5.m76758b();
        }
        return true;
    }

    /* renamed from: l */
    public static final C37018Xc5 m81241l(X62 x62) {
        Intrinsics.checkNotNullParameter(x62, "<this>");
        Object mo77401c = x62.mo77401c();
        if (mo77401c instanceof C37018Xc5) {
            return (C37018Xc5) mo77401c;
        }
        return null;
    }

    /* renamed from: m */
    public static final float m81240m(C37018Xc5 c37018Xc5) {
        if (c37018Xc5 != null) {
            return c37018Xc5.m76757c();
        }
        return 0.0f;
    }

    /* renamed from: n */
    public static final int m81239n(List<? extends X62> list, Function2<? super X62, ? super Integer, Integer> function2, Function2<? super X62, ? super Integer, Integer> function22, int i, int i2) {
        int roundToInt;
        int i3;
        boolean z;
        boolean z2 = true;
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            X62 x62 = list.get(i5);
            float m81240m = m81240m(m81241l(x62));
            if (m81240m == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int min2 = Math.min(function2.invoke(x62, Integer.MAX_VALUE).intValue(), i - min);
                min += min2;
                i4 = Math.max(i4, function22.invoke(x62, Integer.valueOf(min2)).intValue());
            } else if (m81240m > 0.0f) {
                f += m81240m;
            }
        }
        if (f != 0.0f) {
            z2 = false;
        }
        if (z2) {
            roundToInt = 0;
        } else if (i != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(Math.max(i - min, 0) / f);
        } else {
            roundToInt = Integer.MAX_VALUE;
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            X62 x622 = list.get(i6);
            float m81240m2 = m81240m(m81241l(x622));
            if (m81240m2 > 0.0f) {
                if (roundToInt != Integer.MAX_VALUE) {
                    i3 = MathKt__MathJVMKt.roundToInt(roundToInt * m81240m2);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, function22.invoke(x622, Integer.valueOf(i3)).intValue());
            }
        }
        return i4;
    }

    /* renamed from: o */
    public static final int m81238o(List<? extends X62> list, Function2<? super X62, ? super Integer, Integer> function2, int i, int i2) {
        int roundToInt;
        int roundToInt2;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f = 0.0f;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                roundToInt = MathKt__MathJVMKt.roundToInt(i4 * f);
                return roundToInt + i5 + ((list.size() - 1) * i2);
            }
            X62 x62 = list.get(i3);
            float m81240m = m81240m(m81241l(x62));
            int intValue = function2.invoke(x62, Integer.valueOf(i)).intValue();
            if (m81240m != 0.0f) {
                z = false;
            }
            if (z) {
                i5 += intValue;
            } else if (m81240m > 0.0f) {
                f += m81240m;
                roundToInt2 = MathKt__MathJVMKt.roundToInt(intValue / m81240m);
                i4 = Math.max(i4, roundToInt2);
            }
            i3++;
        }
    }

    /* renamed from: p */
    public static final int m81237p(List<? extends X62> list, Function2<? super X62, ? super Integer, Integer> function2, Function2<? super X62, ? super Integer, Integer> function22, int i, int i2, EnumC35701Rm2 enumC35701Rm2, EnumC35701Rm2 enumC35701Rm22) {
        if (enumC35701Rm2 == enumC35701Rm22) {
            return m81238o(list, function2, i, i2);
        }
        return m81239n(list, function22, function2, i, i2);
    }

    /* renamed from: q */
    public static final boolean m81236q(C37018Xc5 c37018Xc5) {
        QE0 m81243j = m81243j(c37018Xc5);
        if (m81243j != null) {
            return m81243j.m88713c();
        }
        return false;
    }

    /* renamed from: r */
    public static final InterfaceC51579xO2 m81235r(EnumC35701Rm2 orientation, Function5<? super Integer, ? super int[], ? super EnumC47065pm2, ? super InterfaceC41273g01, ? super int[], Unit> arrangement, float f, DB5 crossAxisSize, QE0 crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new C8335a(orientation, arrangement, f, crossAxisSize, crossAxisAlignment);
    }
}
