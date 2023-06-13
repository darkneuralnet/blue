package p000;

import androidx.compose.p003ui.layout.C11335a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
import p000.OU3;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001aq\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\"\u0017\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c\"\u0017\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c\"\u0017\u0010 \u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0017\u0010!\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0017\u0010#\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0017\u0010%\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0017\u0010'\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0017\u0010)\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"LgV2;", "modifier", "Lkotlin/Function0;", "", "action", "", "actionOnNewLine", "Lhy5;", "shape", "Lpm0;", "backgroundColor", "contentColor", "Lk61;", "elevation", "content", "c", "(LgV2;Lkotlin/jvm/functions/Function2;ZLhy5;JJFLkotlin/jvm/functions/Function2;LEt0;II)V", "LcM5;", "snackbarData", "actionColor", DateTokenConverter.CONVERTER_KEY, "(LcM5;LgV2;ZLhy5;JJJFLEt0;II)V", "e", "(Lkotlin/jvm/functions/Function2;LEt0;I)V", Entry.TYPE_TEXT, C17296a.f69688o, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;I)V", "b", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "f", "TextEndExtraSpacing", "g", "LongButtonVerticalOffset", "h", "SnackbarMinHeightOneLine", "i", "SnackbarMinHeightTwoLines", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,364:1\n154#2:365\n154#2:366\n154#2:367\n154#2:655\n154#2:656\n154#2:657\n154#2:658\n154#2:659\n154#2:660\n154#2:661\n154#2:662\n154#2:663\n71#3,4:368\n75#3,11:373\n75#3:401\n76#3,11:403\n89#3:431\n88#3:436\n75#3:443\n76#3,11:445\n75#3:476\n76#3,11:478\n89#3:506\n75#3:514\n76#3,11:516\n89#3:544\n89#3:549\n74#3:551\n75#3,11:553\n75#3:581\n76#3,11:583\n89#3:611\n75#3:619\n76#3,11:621\n89#3:649\n88#3:654\n76#4:372\n76#4:402\n76#4:444\n76#4:477\n76#4:515\n76#4:552\n76#4:582\n76#4:620\n456#5,11:384\n460#5,13:414\n473#5,3:428\n467#5,3:433\n460#5,13:456\n460#5,13:489\n473#5,3:503\n460#5,13:527\n473#5,3:541\n473#5,3:546\n456#5,11:564\n460#5,13:594\n473#5,3:608\n460#5,13:632\n473#5,3:646\n467#5,3:651\n67#6,6:395\n73#6:427\n77#6:432\n67#6,6:470\n73#6:502\n77#6:507\n67#6,6:508\n73#6:540\n77#6:545\n67#6,6:575\n73#6:607\n77#6:612\n67#6,6:613\n73#6:645\n77#6:650\n74#7,6:437\n80#7:469\n84#7:550\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n88#1:365\n160#1:366\n175#1:367\n355#1:655\n356#1:656\n357#1:657\n358#1:658\n359#1:659\n360#1:660\n361#1:661\n362#1:662\n363#1:663\n237#1:368,4\n237#1:373,11\n238#1:401\n238#1:403,11\n238#1:431\n237#1:436\n275#1:443\n275#1:445,11\n283#1:476\n283#1:478,11\n283#1:506\n287#1:514\n287#1:516,11\n287#1:544\n275#1:549\n298#1:551\n298#1:553,11\n300#1:581\n300#1:583,11\n300#1:611\n301#1:619\n301#1:621,11\n301#1:649\n298#1:654\n237#1:372\n238#1:402\n275#1:444\n283#1:477\n287#1:515\n298#1:552\n300#1:582\n301#1:620\n237#1:384,11\n238#1:414,13\n238#1:428,3\n237#1:433,3\n275#1:456,13\n283#1:489,13\n283#1:503,3\n287#1:527,13\n287#1:541,3\n275#1:546,3\n298#1:564,11\n300#1:594,13\n300#1:608,3\n301#1:632,13\n301#1:646,3\n298#1:651,3\n238#1:395,6\n238#1:427\n238#1:432\n283#1:470,6\n283#1:502\n283#1:507\n287#1:508,6\n287#1:540\n287#1:545\n300#1:575,6\n300#1:607\n300#1:612\n301#1:613,6\n301#1:645\n301#1:650\n275#1:437,6\n275#1:469\n275#1:550\n*E\n"})
/* renamed from: hM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42078hM5 {

    /* renamed from: c */
    public static final float f85040c;

    /* renamed from: f */
    public static final float f85043f;

    /* renamed from: a */
    public static final float f85038a = C43705k61.m29303g(30);

    /* renamed from: b */
    public static final float f85039b = C43705k61.m29303g(16);

    /* renamed from: d */
    public static final float f85041d = C43705k61.m29303g(2);

    /* renamed from: e */
    public static final float f85042e = C43705k61.m29303g(6);

    /* renamed from: g */
    public static final float f85044g = C43705k61.m29303g(12);

    /* renamed from: h */
    public static final float f85045h = C43705k61.m29303g(48);

    /* renamed from: i */
    public static final float f85046i = C43705k61.m29303g(68);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$a */
    /* loaded from: classes.dex */
    public static final class C22616a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85047g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85048h;

        /* renamed from: i */
        public final /* synthetic */ int f85049i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22616a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i) {
            super(2);
            this.f85047g = function2;
            this.f85048h = function22;
            this.f85049i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C42078hM5.m36522a(this.f85047g, this.f85048h, interfaceC32720Et0, C47127ps4.m18626a(this.f85049i | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n223#2,2:365\n223#2,2:367\n1#3:369\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n*L\n308#1:365,2\n312#1:367,2\n*E\n"})
    /* renamed from: hM5$b */
    /* loaded from: classes.dex */
    public static final class C22617b implements InterfaceC51579xO2 {

        /* renamed from: a */
        public final /* synthetic */ String f85050a;

        /* renamed from: b */
        public final /* synthetic */ String f85051b;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hM5$b$a */
        /* loaded from: classes.dex */
        public static final class C22618a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ OU3 f85052g;

            /* renamed from: h */
            public final /* synthetic */ int f85053h;

            /* renamed from: i */
            public final /* synthetic */ OU3 f85054i;

            /* renamed from: j */
            public final /* synthetic */ int f85055j;

            /* renamed from: k */
            public final /* synthetic */ int f85056k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22618a(OU3 ou3, int i, OU3 ou32, int i2, int i3) {
                super(1);
                this.f85052g = ou3;
                this.f85053h = i;
                this.f85054i = ou32;
                this.f85055j = i2;
                this.f85056k = i3;
            }

            /* renamed from: a */
            public final void m36510a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                OU3.AbstractC6015a.m92205r(layout, this.f85052g, 0, this.f85053h, 0.0f, 4, null);
                OU3.AbstractC6015a.m92205r(layout, this.f85054i, this.f85055j, this.f85056k, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m36510a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        public C22617b(String str, String str2) {
            this.f85050a = str;
            this.f85051b = str2;
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> measurables, long j) {
            int coerceAtLeast;
            boolean z;
            boolean z2;
            int i;
            int m92229d1;
            int i2;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<? extends InterfaceC50393vO2> list = measurables;
            String str = this.f85050a;
            for (InterfaceC50393vO2 interfaceC50393vO2 : list) {
                if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO2), str)) {
                    OU3 mo8763P0 = interfaceC50393vO2.mo8763P0(j);
                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast((C44228kz0.m28063n(j) - mo8763P0.m92226i1()) - Layout.mo3416F0(C42078hM5.f85043f), C44228kz0.m28061p(j));
                    String str2 = this.f85051b;
                    for (InterfaceC50393vO2 interfaceC50393vO22 : list) {
                        if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO22), str2)) {
                            OU3 mo8763P02 = interfaceC50393vO22.mo8763P0(C44228kz0.m28072e(j, 0, coerceAtLeast, 0, 0, 9, null));
                            int mo35854v = mo8763P02.mo35854v(C5482N9.m94314a());
                            boolean z3 = true;
                            int i3 = 0;
                            if (mo35854v != Integer.MIN_VALUE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int mo35854v2 = mo8763P02.mo35854v(C5482N9.m94313b());
                                if (mo35854v2 != Integer.MIN_VALUE) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (mo35854v != mo35854v2) {
                                        z3 = false;
                                    }
                                    int m28063n = C44228kz0.m28063n(j) - mo8763P0.m92226i1();
                                    if (z3) {
                                        i2 = Math.max(Layout.mo3416F0(C42078hM5.f85045h), mo8763P0.m92229d1());
                                        int m92229d12 = (i2 - mo8763P02.m92229d1()) / 2;
                                        int mo35854v3 = mo8763P0.mo35854v(C5482N9.m94314a());
                                        if (mo35854v3 != Integer.MIN_VALUE) {
                                            i3 = (mo35854v + m92229d12) - mo35854v3;
                                        }
                                        m92229d1 = i3;
                                        i = m92229d12;
                                    } else {
                                        int mo3416F0 = Layout.mo3416F0(C42078hM5.f85038a) - mo35854v;
                                        int max = Math.max(Layout.mo3416F0(C42078hM5.f85046i), mo8763P02.m92229d1() + mo3416F0);
                                        i = mo3416F0;
                                        m92229d1 = (max - mo8763P0.m92229d1()) / 2;
                                        i2 = max;
                                    }
                                    return InterfaceC52765zO2.m1430Y(Layout, C44228kz0.m28063n(j), i2, null, new C22618a(mo8763P02, i, mo8763P0, m28063n, m92229d1), 4, null);
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$c */
    /* loaded from: classes.dex */
    public static final class C22619c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85057g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85058h;

        /* renamed from: i */
        public final /* synthetic */ int f85059i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22619c(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i) {
            super(2);
            this.f85057g = function2;
            this.f85058h = function22;
            this.f85059i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C42078hM5.m36521b(this.f85057g, this.f85058h, interfaceC32720Et0, C47127ps4.m18626a(this.f85059i | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$d */
    /* loaded from: classes.dex */
    public static final class C22620d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85060g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85061h;

        /* renamed from: i */
        public final /* synthetic */ int f85062i;

        /* renamed from: j */
        public final /* synthetic */ boolean f85063j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hM5$d$a */
        /* loaded from: classes.dex */
        public static final class C22621a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85064g;

            /* renamed from: h */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85065h;

            /* renamed from: i */
            public final /* synthetic */ int f85066i;

            /* renamed from: j */
            public final /* synthetic */ boolean f85067j;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: hM5$d$a$a */
            /* loaded from: classes.dex */
            public static final class C22622a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85068g;

                /* renamed from: h */
                public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85069h;

                /* renamed from: i */
                public final /* synthetic */ int f85070i;

                /* renamed from: j */
                public final /* synthetic */ boolean f85071j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C22622a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i, boolean z) {
                    super(2);
                    this.f85068g = function2;
                    this.f85069h = function22;
                    this.f85070i = i;
                    this.f85071j = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                    invoke(interfaceC32720Et0, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                    if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                        interfaceC32720Et0.mo89548k();
                        return;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(225114541, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                    }
                    if (this.f85068g == null) {
                        interfaceC32720Et0.mo89638F(59708346);
                        C42078hM5.m36518e(this.f85069h, interfaceC32720Et0, (this.f85070i >> 21) & 14);
                        interfaceC32720Et0.mo89605Q();
                    } else if (this.f85071j) {
                        interfaceC32720Et0.mo89638F(59708411);
                        Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f85069h;
                        Function2<InterfaceC32720Et0, Integer, Unit> function22 = this.f85068g;
                        int i2 = this.f85070i;
                        C42078hM5.m36522a(function2, function22, interfaceC32720Et0, (i2 & 112) | ((i2 >> 21) & 14));
                        interfaceC32720Et0.mo89605Q();
                    } else {
                        interfaceC32720Et0.mo89638F(59708478);
                        Function2<InterfaceC32720Et0, Integer, Unit> function23 = this.f85069h;
                        Function2<InterfaceC32720Et0, Integer, Unit> function24 = this.f85068g;
                        int i3 = this.f85070i;
                        C42078hM5.m36521b(function23, function24, interfaceC32720Et0, (i3 & 112) | ((i3 >> 21) & 14));
                        interfaceC32720Et0.mo89605Q();
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C22621a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i, boolean z) {
                super(2);
                this.f85064g = function2;
                this.f85065h = function22;
                this.f85066i = i;
                this.f85067j = z;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1939362236, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                }
                C38909c26.m62004a(TM2.f35372a.m83729c(interfaceC32720Et0, 6).m104964d(), C43575jt0.m29791b(interfaceC32720Et0, 225114541, true, new C22622a(this.f85064g, this.f85065h, this.f85066i, this.f85067j)), interfaceC32720Et0, 48);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22620d(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i, boolean z) {
            super(2);
            this.f85060g = function2;
            this.f85061h = function22;
            this.f85062i = i;
            this.f85063j = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2084221700, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
            }
            C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6)))}, C43575jt0.m29791b(interfaceC32720Et0, 1939362236, true, new C22621a(this.f85060g, this.f85061h, this.f85062i, this.f85063j)), interfaceC32720Et0, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$e */
    /* loaded from: classes.dex */
    public static final class C22623e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f85072g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85073h;

        /* renamed from: i */
        public final /* synthetic */ boolean f85074i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC42444hy5 f85075j;

        /* renamed from: k */
        public final /* synthetic */ long f85076k;

        /* renamed from: l */
        public final /* synthetic */ long f85077l;

        /* renamed from: m */
        public final /* synthetic */ float f85078m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85079n;

        /* renamed from: o */
        public final /* synthetic */ int f85080o;

        /* renamed from: p */
        public final /* synthetic */ int f85081p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22623e(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, boolean z, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i, int i2) {
            super(2);
            this.f85072g = interfaceC41563gV2;
            this.f85073h = function2;
            this.f85074i = z;
            this.f85075j = interfaceC42444hy5;
            this.f85076k = j;
            this.f85077l = j2;
            this.f85078m = f;
            this.f85079n = function22;
            this.f85080o = i;
            this.f85081p = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C42078hM5.m36520c(this.f85072g, this.f85073h, this.f85074i, this.f85075j, this.f85076k, this.f85077l, this.f85078m, this.f85079n, interfaceC32720Et0, C47127ps4.m18626a(this.f85080o | 1), this.f85081p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$f */
    /* loaded from: classes.dex */
    public static final class C22624f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39096cM5 f85082g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22624f(InterfaceC39096cM5 interfaceC39096cM5) {
            super(2);
            this.f85082g = interfaceC39096cM5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-261845785, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
            }
            C38909c26.m62002c(this.f85082g.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC32720Et0, 0, 0, 131070);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$g */
    /* loaded from: classes.dex */
    public static final class C22625g extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39096cM5 f85083g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f85084h;

        /* renamed from: i */
        public final /* synthetic */ boolean f85085i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC42444hy5 f85086j;

        /* renamed from: k */
        public final /* synthetic */ long f85087k;

        /* renamed from: l */
        public final /* synthetic */ long f85088l;

        /* renamed from: m */
        public final /* synthetic */ long f85089m;

        /* renamed from: n */
        public final /* synthetic */ float f85090n;

        /* renamed from: o */
        public final /* synthetic */ int f85091o;

        /* renamed from: p */
        public final /* synthetic */ int f85092p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22625g(InterfaceC39096cM5 interfaceC39096cM5, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, long j3, float f, int i, int i2) {
            super(2);
            this.f85083g = interfaceC39096cM5;
            this.f85084h = interfaceC41563gV2;
            this.f85085i = z;
            this.f85086j = interfaceC42444hy5;
            this.f85087k = j;
            this.f85088l = j2;
            this.f85089m = j3;
            this.f85090n = f;
            this.f85091o = i;
            this.f85092p = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C42078hM5.m36519d(this.f85083g, this.f85084h, this.f85085i, this.f85086j, this.f85087k, this.f85088l, this.f85089m, this.f85090n, interfaceC32720Et0, C47127ps4.m18626a(this.f85091o | 1), this.f85092p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$h */
    /* loaded from: classes.dex */
    public static final class C22626h extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f85093g;

        /* renamed from: h */
        public final /* synthetic */ int f85094h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC39096cM5 f85095i;

        /* renamed from: j */
        public final /* synthetic */ String f85096j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hM5$h$a */
        /* loaded from: classes.dex */
        public static final class C22627a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC39096cM5 f85097g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22627a(InterfaceC39096cM5 interfaceC39096cM5) {
                super(0);
                this.f85097g = interfaceC39096cM5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f85097g.m61524a();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hM5$h$b */
        /* loaded from: classes.dex */
        public static final class C22628b extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ String f85098g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22628b(String str) {
                super(3);
                this.f85098g = str;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC37486Zc5 TextButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-929149933, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                }
                C38909c26.m62002c(this.f85098g, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC32720Et0, 0, 0, 131070);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22626h(long j, int i, InterfaceC39096cM5 interfaceC39096cM5, String str) {
            super(2);
            this.f85093g = j;
            this.f85094h = i;
            this.f85095i = interfaceC39096cM5;
            this.f85096j = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1843479216, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
            }
            C43714k70.m29276c(new C22627a(this.f85095i), null, false, null, null, null, null, C42528i70.f86761a.m34433g(0L, this.f85093g, 0L, interfaceC32720Et0, ((this.f85094h >> 15) & 112) | 3072, 5), null, C43575jt0.m29791b(interfaceC32720Et0, -929149933, true, new C22628b(this.f85096j)), interfaceC32720Et0, 805306368, 382);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$TextOnlySnackbar$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
    /* renamed from: hM5$i */
    /* loaded from: classes.dex */
    public static final class C22629i implements InterfaceC51579xO2 {

        /* renamed from: a */
        public static final C22629i f85099a = new C22629i();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hM5$i$a */
        /* loaded from: classes.dex */
        public static final class C22630a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ int f85100g;

            /* renamed from: h */
            public final /* synthetic */ OU3 f85101h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22630a(int i, OU3 ou3) {
                super(1);
                this.f85100g = i;
                this.f85101h = ou3;
            }

            /* renamed from: a */
            public final void m36509a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                OU3.AbstractC6015a.m92205r(layout, this.f85101h, 0, (this.f85100g - this.f85101h.m92229d1()) / 2, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m36509a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> measurables, long j) {
            boolean z;
            Object first;
            boolean z2;
            float f;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            boolean z3 = false;
            if (measurables.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) measurables);
                OU3 mo8763P0 = ((InterfaceC50393vO2) first).mo8763P0(j);
                int mo35854v = mo8763P0.mo35854v(C5482N9.m94314a());
                int mo35854v2 = mo8763P0.mo35854v(C5482N9.m94313b());
                if (mo35854v != Integer.MIN_VALUE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (mo35854v2 != Integer.MIN_VALUE) {
                        z3 = true;
                    }
                    if (z3) {
                        if (mo35854v == mo35854v2) {
                            f = C42078hM5.f85045h;
                        } else {
                            f = C42078hM5.f85046i;
                        }
                        int max = Math.max(Layout.mo3416F0(f), mo8763P0.m92229d1());
                        return InterfaceC52765zO2.m1430Y(Layout, C44228kz0.m28063n(j), max, null, new C22630a(max, mo8763P0), 4, null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM5$j */
    /* loaded from: classes.dex */
    public static final class C22631j extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f85102g;

        /* renamed from: h */
        public final /* synthetic */ int f85103h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22631j(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f85102g = function2;
            this.f85103h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C42078hM5.m36518e(this.f85102g, interfaceC32720Et0, C47127ps4.m18626a(this.f85103h | 1));
        }
    }

    static {
        float f = 8;
        f85040c = C43705k61.m29303g(f);
        f85043f = C43705k61.m29303g(f);
    }

    /* renamed from: a */
    public static final void m36522a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1229075900);
        if ((i & 14) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1229075900, i2, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:270)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
            float f = f85039b;
            float f2 = f85040c;
            InterfaceC41563gV2 m94180m = ND3.m94180m(m114255n, f, 0.0f, f2, f85041d, 2, null);
            mo89518u.mo89638F(-483455358);
            C25777lo.InterfaceC25789l m26802g = C25777lo.f96729a.m26802g();
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            InterfaceC41563gV2 m94180m2 = ND3.m94180m(C5211M9.m95680g(c20912a, f85038a, f85044g), 0.0f, 0.0f, f2, 0.0f, 11, null);
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94180m2);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a2);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            C40689f10 c40689f10 = C40689f10.f79291a;
            function2.invoke(mo89518u, Integer.valueOf(i2 & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            InterfaceC41563gV2 mo87991c = c35465Qm0.mo87991c(c20912a, c4361a.m99137i());
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(mo87991c);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a3);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a3, m44729h2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
            C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
            C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            function22.invoke(mo89518u, Integer.valueOf((i2 >> 3) & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C22616a(function2, function22, i));
        }
    }

    /* renamed from: b */
    public static final void m36521b(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-534813202);
        if ((i & 14) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-534813202, i2, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:291)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, f85039b, 0.0f, f85040c, 0.0f, 10, null);
            C22617b c22617b = new C22617b("action", Entry.TYPE_TEXT);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, c22617b, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            InterfaceC41563gV2 m94182k = ND3.m94182k(C11335a.m68614b(c20912a, Entry.TYPE_TEXT), 0.0f, f85042e, 1, null);
            mo89518u.mo89638F(733328855);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94182k);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a2);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            C40689f10 c40689f10 = C40689f10.f79291a;
            function2.invoke(mo89518u, Integer.valueOf(i2 & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            InterfaceC41563gV2 m68614b = C11335a.m68614b(c20912a, "action");
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m68614b);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a3);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a3, m44729h2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
            C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
            C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            function22.invoke(mo89518u, Integer.valueOf((i2 >> 3) & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C22619c(function2, function22, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m36520c(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, boolean z, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z2;
        KC0 kc0;
        float m29303g;
        InterfaceC42444hy5 interfaceC42444hy52;
        boolean z3;
        InterfaceC41563gV2 interfaceC41563gV23;
        float f3;
        long j5;
        InterfaceC36874Wm5 mo89512w;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-558258760);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(interfaceC41563gV2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = function2;
            i3 |= mo89518u.mo89629I(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= mo89518u.mo89536o(z) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0 && mo89518u.mo89539n(interfaceC42444hy5)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                    i8 = 1024;
                    i3 |= i8;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (mo89518u.mo89524s(j3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 32) == 0 && mo89518u.mo89524s(j4)) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        i3 |= mo89518u.mo89533p(f2) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i6 = mo89518u.mo89629I(content) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i3) != 4793490 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV23 = interfaceC41563gV2;
                        z3 = z;
                        interfaceC42444hy52 = interfaceC42444hy5;
                        j5 = j4;
                        f3 = f2;
                    } else {
                        mo89518u.mo89626J();
                        if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            interfaceC41563gV22 = interfaceC41563gV2;
                            z2 = z;
                            kc0 = interfaceC42444hy5;
                        } else {
                            interfaceC41563gV22 = i9 == 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            if (i10 != 0) {
                                obj = null;
                            }
                            z2 = i4 == 0 ? false : z;
                            if ((i2 & 8) == 0) {
                                kc0 = TM2.f35372a.m83730b(mo89518u, 6).m109564e();
                                i3 &= -7169;
                            } else {
                                kc0 = interfaceC42444hy5;
                            }
                            if ((i2 & 16) != 0) {
                                j3 = C39707dM5.f76502a.m44348a(mo89518u, 6);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                                i3 = (-458753) & i3;
                            }
                            if (i5 != 0) {
                                m29303g = C43705k61.m29303g(6);
                                long j6 = j3;
                                int i11 = i3;
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-558258760, i11, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                                }
                                int i12 = i11 >> 6;
                                NV5.m93838a(interfaceC41563gV22, kc0, j6, j4, null, m29303g, C43575jt0.m29791b(mo89518u, -2084221700, true, new C22620d(obj, content, i11, z2)), mo89518u, (i11 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i11 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                j3 = j6;
                                interfaceC42444hy52 = kc0;
                                z3 = z2;
                                interfaceC41563gV23 = interfaceC41563gV22;
                                f3 = m29303g;
                                j5 = j4;
                            }
                        }
                        m29303g = f2;
                        long j62 = j3;
                        int i112 = i3;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        int i122 = i112 >> 6;
                        NV5.m93838a(interfaceC41563gV22, kc0, j62, j4, null, m29303g, C43575jt0.m29791b(mo89518u, -2084221700, true, new C22620d(obj, content, i112, z2)), mo89518u, (i112 & 14) | 1572864 | (i122 & 112) | (i122 & 896) | (i122 & 7168) | ((i112 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
                        if (C35528Qt0.m87827O()) {
                        }
                        j3 = j62;
                        interfaceC42444hy52 = kc0;
                        z3 = z2;
                        interfaceC41563gV23 = interfaceC41563gV22;
                        f3 = m29303g;
                        j5 = j4;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new C22623e(interfaceC41563gV23, obj, z3, interfaceC42444hy52, j3, j5, f3, content, i, i2));
                    return;
                }
                i6 = 12582912;
                i3 |= i6;
                if ((23967451 & i3) != 4793490) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                m29303g = f2;
                long j622 = j3;
                int i1122 = i3;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i1222 = i1122 >> 6;
                NV5.m93838a(interfaceC41563gV22, kc0, j622, j4, null, m29303g, C43575jt0.m29791b(mo89518u, -2084221700, true, new C22620d(obj, content, i1122, z2)), mo89518u, (i1122 & 14) | 1572864 | (i1222 & 112) | (i1222 & 896) | (i1222 & 7168) | ((i1122 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
                if (C35528Qt0.m87827O()) {
                }
                j3 = j622;
                interfaceC42444hy52 = kc0;
                z3 = z2;
                interfaceC41563gV23 = interfaceC41563gV22;
                f3 = m29303g;
                j5 = j4;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            if ((23967451 & i3) != 4793490) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            m29303g = f2;
            long j6222 = j3;
            int i11222 = i3;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            int i12222 = i11222 >> 6;
            NV5.m93838a(interfaceC41563gV22, kc0, j6222, j4, null, m29303g, C43575jt0.m29791b(mo89518u, -2084221700, true, new C22620d(obj, content, i11222, z2)), mo89518u, (i11222 & 14) | 1572864 | (i12222 & 112) | (i12222 & 896) | (i12222 & 7168) | ((i11222 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
            if (C35528Qt0.m87827O()) {
            }
            j3 = j6222;
            interfaceC42444hy52 = kc0;
            z3 = z2;
            interfaceC41563gV23 = interfaceC41563gV22;
            f3 = m29303g;
            j5 = j4;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i6;
        if ((23967451 & i3) != 4793490) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        m29303g = f2;
        long j62222 = j3;
        int i112222 = i3;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i122222 = i112222 >> 6;
        NV5.m93838a(interfaceC41563gV22, kc0, j62222, j4, null, m29303g, C43575jt0.m29791b(mo89518u, -2084221700, true, new C22620d(obj, content, i112222, z2)), mo89518u, (i112222 & 14) | 1572864 | (i122222 & 112) | (i122222 & 896) | (i122222 & 7168) | ((i112222 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
        if (C35528Qt0.m87827O()) {
        }
        j3 = j62222;
        interfaceC42444hy52 = kc0;
        z3 = z2;
        interfaceC41563gV23 = interfaceC41563gV22;
        f3 = m29303g;
        j5 = j4;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m36519d(InterfaceC39096cM5 snackbarData, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, long j3, float f, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Object obj;
        long j4;
        long j5;
        int i5;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z3;
        KC0 kc0;
        long j6;
        long j7;
        float m29303g;
        long j8;
        long j9;
        long j10;
        InterfaceC41563gV2 interfaceC41563gV23;
        float f2;
        InterfaceC36874Wm5 mo89512w;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(258660814);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89539n(interfaceC41563gV2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= mo89518u.mo89536o(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj = interfaceC42444hy5;
                        if (mo89518u.mo89539n(obj)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        obj = interfaceC42444hy5;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    obj = interfaceC42444hy5;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0 && mo89518u.mo89524s(j)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                    i7 = 8192;
                    i3 |= i7;
                }
                if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (mo89518u.mo89524s(j4)) {
                            i6 = DateUtils.FORMAT_NUMERIC_DATE;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j2;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    j4 = j2;
                }
                if ((i & 3670016) == 0) {
                    j5 = j3;
                    i3 |= ((i2 & 64) == 0 && mo89518u.mo89524s(j5)) ? 1048576 : 524288;
                } else {
                    j5 = j3;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= mo89518u.mo89533p(f) ? 8388608 : 4194304;
                }
                if ((i3 & 23967451) != 4793490 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    interfaceC41563gV23 = interfaceC41563gV2;
                    f2 = f;
                    z3 = z2;
                    kc0 = obj;
                    j8 = j5;
                    j9 = j4;
                    j10 = j;
                } else {
                    mo89518u.mo89626J();
                    if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                        mo89518u.mo89548k();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        interfaceC41563gV22 = interfaceC41563gV2;
                        m29303g = f;
                        z3 = z2;
                        kc0 = obj;
                        j8 = j5;
                        j9 = j4;
                        j10 = j;
                    } else {
                        interfaceC41563gV22 = i9 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                        z3 = i4 != 0 ? false : z2;
                        if ((i2 & 8) != 0) {
                            kc0 = TM2.f35372a.m83730b(mo89518u, 6).m109564e();
                            i3 &= -7169;
                        } else {
                            kc0 = obj;
                        }
                        if ((i2 & 16) != 0) {
                            j6 = C39707dM5.f76502a.m44348a(mo89518u, 6);
                            i3 &= -57345;
                        } else {
                            j6 = j;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j7 = C39707dM5.f76502a.m44347b(mo89518u, 6);
                            i3 &= -3670017;
                        } else {
                            j7 = j5;
                        }
                        m29303g = i5 != 0 ? C43705k61.m29303g(6) : f;
                        j8 = j7;
                        j9 = j4;
                        j10 = j6;
                    }
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                    }
                    String m61523b = snackbarData.m61523b();
                    InterfaceC41563gV2 interfaceC41563gV24 = interfaceC41563gV22;
                    m36520c(ND3.m94184i(interfaceC41563gV22, C43705k61.m29303g(12)), m61523b != null ? C43575jt0.m29791b(mo89518u, 1843479216, true, new C22626h(j8, i3, snackbarData, m61523b)) : null, z3, kc0, j10, j9, m29303g, C43575jt0.m29791b(mo89518u, -261845785, true, new C22624f(snackbarData)), mo89518u, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    interfaceC41563gV23 = interfaceC41563gV24;
                    f2 = m29303g;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                    return;
                }
                mo89512w.mo20405a(new C22625g(snackbarData, interfaceC41563gV23, z3, kc0, j10, j9, j8, f2, i, i2));
                return;
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i3 & 23967451) != 4793490) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i5 != 0) {
            }
            j8 = j7;
            j9 = j4;
            j10 = j6;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            String m61523b2 = snackbarData.m61523b();
            InterfaceC41563gV2 interfaceC41563gV242 = interfaceC41563gV22;
            m36520c(ND3.m94184i(interfaceC41563gV22, C43705k61.m29303g(12)), m61523b2 != null ? C43575jt0.m29791b(mo89518u, 1843479216, true, new C22626h(j8, i3, snackbarData, m61523b2)) : null, z3, kc0, j10, j9, m29303g, C43575jt0.m29791b(mo89518u, -261845785, true, new C22624f(snackbarData)), mo89518u, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV242;
            f2 = m29303g;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i3 & 23967451) != 4793490) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i5 != 0) {
        }
        j8 = j7;
        j9 = j4;
        j10 = j6;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        String m61523b22 = snackbarData.m61523b();
        InterfaceC41563gV2 interfaceC41563gV2422 = interfaceC41563gV22;
        m36520c(ND3.m94184i(interfaceC41563gV22, C43705k61.m29303g(12)), m61523b22 != null ? C43575jt0.m29791b(mo89518u, 1843479216, true, new C22626h(j8, i3, snackbarData, m61523b22)) : null, z3, kc0, j10, j9, m29303g, C43575jt0.m29791b(mo89518u, -261845785, true, new C22624f(snackbarData)), mo89518u, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV2422;
        f2 = m29303g;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: e */
    public static final void m36518e(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(917397959);
        if ((i & 14) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(917397959, i2, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            C22629i c22629i = C22629i.f85099a;
            mo89518u.mo89638F(-1323940314);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, c22629i, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            InterfaceC41563gV2 m94183j = ND3.m94183j(c20912a, f85039b, f85042e);
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94183j);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a2);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            C40689f10 c40689f10 = C40689f10.f79291a;
            function2.invoke(mo89518u, Integer.valueOf(i2 & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C22631j(function2, i));
        }
    }
}
