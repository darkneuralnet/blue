package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC48600sM5;
import p000.C25777lo;
import p000.C32902Fn2;
import p000.InterfaceC32720Et0;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0096\u0001\u0010%\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0002\b\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020!H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m28432d2 = {"LgV2;", "modifier", "LGn2;", TransferTable.COLUMN_STATE, "Lkotlin/Function2;", "Lg01;", "Lkz0;", "", "", "Lkotlin/ExtensionFunctionType;", "slotSizesSums", "LPD3;", "contentPadding", "", "reverseLayout", "isVertical", "Lcu1;", "flingBehavior", "userScrollEnabled", "Llo$l;", "verticalArrangement", "Llo$d;", "horizontalArrangement", "Lkotlin/Function1;", "LBn2;", "", "content", C17296a.f69688o, "(LgV2;LGn2;Lkotlin/jvm/functions/Function2;LPD3;ZZLcu1;ZLlo$l;Llo$d;Lkotlin/jvm/functions/Function1;LEt0;III)V", "Lon2;", "itemProvider", "b", "(Lon2;LGn2;LEt0;I)V", "Lmn2;", "placementAnimator", "LVn2;", "LyO2;", DateTokenConverter.CONVERTER_KEY, "(Lon2;LGn2;Lkotlin/jvm/functions/Function2;LPD3;ZZLlo$d;Llo$l;Lmn2;LEt0;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,364:1\n154#2:365\n474#3,4:366\n478#3,2:374\n482#3:380\n25#4:370\n50#4:381\n49#4:382\n83#4,3:390\n1114#5,3:371\n1117#5,3:377\n1114#5,6:383\n1114#5,6:393\n474#6:376\n76#7:389\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n60#1:365\n82#1:366,4\n82#1:374,2\n82#1:380\n82#1:370\n83#1:381\n83#1:382\n170#1:390,3\n82#1:371,3\n82#1:377,3\n83#1:383,6\n170#1:393,6\n82#1:376\n121#1:389\n*E\n"})
/* renamed from: un2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50039un2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: un2$a */
    /* loaded from: classes.dex */
    public static final class C29299a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f112912g;

        /* renamed from: h */
        public final /* synthetic */ C33136Gn2 f112913h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC41273g01, C44228kz0, List<Integer>> f112914i;

        /* renamed from: j */
        public final /* synthetic */ PD3 f112915j;

        /* renamed from: k */
        public final /* synthetic */ boolean f112916k;

        /* renamed from: l */
        public final /* synthetic */ boolean f112917l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC39436cu1 f112918m;

        /* renamed from: n */
        public final /* synthetic */ boolean f112919n;

        /* renamed from: o */
        public final /* synthetic */ C25777lo.InterfaceC25789l f112920o;

        /* renamed from: p */
        public final /* synthetic */ C25777lo.InterfaceC25781d f112921p;

        /* renamed from: q */
        public final /* synthetic */ Function1<InterfaceC31966Bn2, Unit> f112922q;

        /* renamed from: r */
        public final /* synthetic */ int f112923r;

        /* renamed from: s */
        public final /* synthetic */ int f112924s;

        /* renamed from: t */
        public final /* synthetic */ int f112925t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29299a(InterfaceC41563gV2 interfaceC41563gV2, C33136Gn2 c33136Gn2, Function2<? super InterfaceC41273g01, ? super C44228kz0, ? extends List<Integer>> function2, PD3 pd3, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, boolean z3, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, Function1<? super InterfaceC31966Bn2, Unit> function1, int i, int i2, int i3) {
            super(2);
            this.f112912g = interfaceC41563gV2;
            this.f112913h = c33136Gn2;
            this.f112914i = function2;
            this.f112915j = pd3;
            this.f112916k = z;
            this.f112917l = z2;
            this.f112918m = interfaceC39436cu1;
            this.f112919n = z3;
            this.f112920o = interfaceC25789l;
            this.f112921p = interfaceC25781d;
            this.f112922q = function1;
            this.f112923r = i;
            this.f112924s = i2;
            this.f112925t = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C50039un2.m9777a(this.f112912g, this.f112913h, this.f112914i, this.f112915j, this.f112916k, this.f112917l, this.f112918m, this.f112919n, this.f112920o, this.f112921p, this.f112922q, interfaceC32720Et0, C47127ps4.m18626a(this.f112923r | 1), C47127ps4.m18626a(this.f112924s), this.f112925t);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: un2$b */
    /* loaded from: classes.dex */
    public static final class C29300b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC46482on2 f112926g;

        /* renamed from: h */
        public final /* synthetic */ C33136Gn2 f112927h;

        /* renamed from: i */
        public final /* synthetic */ int f112928i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29300b(InterfaceC46482on2 interfaceC46482on2, C33136Gn2 c33136Gn2, int i) {
            super(2);
            this.f112926g = interfaceC46482on2;
            this.f112927h = c33136Gn2;
            this.f112928i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C50039un2.m9776b(this.f112926g, this.f112927h, interfaceC32720Et0, C47127ps4.m18626a(this.f112928i | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,364:1\n154#2:365\n154#2:366\n480#3,4:367\n485#3:376\n122#4,5:371\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n234#1:365\n236#1:366\n317#1:367,4\n317#1:376\n317#1:371,5\n*E\n"})
    /* renamed from: un2$c */
    /* loaded from: classes.dex */
    public static final class C29301c extends Lambda implements Function2<InterfaceC36646Vn2, C44228kz0, C51817xn2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f112929g;

        /* renamed from: h */
        public final /* synthetic */ PD3 f112930h;

        /* renamed from: i */
        public final /* synthetic */ boolean f112931i;

        /* renamed from: j */
        public final /* synthetic */ C33136Gn2 f112932j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC46482on2 f112933k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC41273g01, C44228kz0, List<Integer>> f112934l;

        /* renamed from: m */
        public final /* synthetic */ C25777lo.InterfaceC25789l f112935m;

        /* renamed from: n */
        public final /* synthetic */ C25777lo.InterfaceC25781d f112936n;

        /* renamed from: o */
        public final /* synthetic */ C45296mn2 f112937o;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/ItemIndex\n*L\n1#1,364:1\n33#2,4:365\n38#2:370\n39#3:369\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n*L\n305#1:365,4\n305#1:370\n308#1:369\n*E\n"})
        /* renamed from: un2$c$a */
        /* loaded from: classes.dex */
        public static final class C29302a extends Lambda implements Function1<C48301rr2, ArrayList<Pair<? extends Integer, ? extends C44228kz0>>> {

            /* renamed from: g */
            public final /* synthetic */ C32902Fn2 f112938g;

            /* renamed from: h */
            public final /* synthetic */ C33379Ho2 f112939h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29302a(C32902Fn2 c32902Fn2, C33379Ho2 c33379Ho2) {
                super(1);
                this.f112938g = c32902Fn2;
                this.f112939h = c33379Ho2;
            }

            /* renamed from: b */
            public final ArrayList<Pair<Integer, C44228kz0>> m9772b(int i) {
                C32902Fn2.C2478c m106468c = this.f112938g.m106468c(i);
                int m9974b = C49929uc2.m9974b(m106468c.m106457a());
                ArrayList<Pair<Integer, C44228kz0>> arrayList = new ArrayList<>(m106468c.m106456b().size());
                List<C39631dE1> m106456b = m106468c.m106456b();
                C33379Ho2 c33379Ho2 = this.f112939h;
                int size = m106456b.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int m44515d = C39631dE1.m44515d(m106456b.get(i3).m44512g());
                    arrayList.add(TuplesKt.m28425to(Integer.valueOf(m9974b), C44228kz0.m28075b(c33379Ho2.m103425a(i2, m44515d))));
                    m9974b = C49929uc2.m9974b(m9974b + 1);
                    i2 += m44515d;
                }
                return arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends C44228kz0>> invoke(C48301rr2 c48301rr2) {
                return m9772b(c48301rr2.m15176g());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: un2$c$b */
        /* loaded from: classes.dex */
        public static final class C29303b extends Lambda implements Function3<Integer, Integer, Function1<? super OU3.AbstractC6015a, ? extends Unit>, InterfaceC52172yO2> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC36646Vn2 f112940g;

            /* renamed from: h */
            public final /* synthetic */ long f112941h;

            /* renamed from: i */
            public final /* synthetic */ int f112942i;

            /* renamed from: j */
            public final /* synthetic */ int f112943j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29303b(InterfaceC36646Vn2 interfaceC36646Vn2, long j, int i, int i2) {
                super(3);
                this.f112940g = interfaceC36646Vn2;
                this.f112941h = j;
                this.f112942i = i;
                this.f112943j = i2;
            }

            /* renamed from: a */
            public final InterfaceC52172yO2 m9771a(int i, int i2, Function1<? super OU3.AbstractC6015a, Unit> placement) {
                Map<AbstractC4750L9, Integer> emptyMap;
                Intrinsics.checkNotNullParameter(placement, "placement");
                InterfaceC36646Vn2 interfaceC36646Vn2 = this.f112940g;
                int m22037g = C46007nz0.m22037g(this.f112941h, i + this.f112942i);
                int m22038f = C46007nz0.m22038f(this.f112941h, i2 + this.f112943j);
                emptyMap = MapsKt__MapsKt.emptyMap();
                return interfaceC36646Vn2.mo1431O0(m22037g, m22038f, emptyMap, placement);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(Integer num, Integer num2, Function1<? super OU3.AbstractC6015a, ? extends Unit> function1) {
                return m9771a(num.intValue(), num2.intValue(), function1);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: un2$c$c */
        /* loaded from: classes.dex */
        public static final class C29304c implements BO2 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC36646Vn2 f112944a;

            /* renamed from: b */
            public final /* synthetic */ boolean f112945b;

            /* renamed from: c */
            public final /* synthetic */ boolean f112946c;

            /* renamed from: d */
            public final /* synthetic */ int f112947d;

            /* renamed from: e */
            public final /* synthetic */ int f112948e;

            /* renamed from: f */
            public final /* synthetic */ C45296mn2 f112949f;

            /* renamed from: g */
            public final /* synthetic */ long f112950g;

            public C29304c(InterfaceC36646Vn2 interfaceC36646Vn2, boolean z, boolean z2, int i, int i2, C45296mn2 c45296mn2, long j) {
                this.f112944a = interfaceC36646Vn2;
                this.f112945b = z;
                this.f112946c = z2;
                this.f112947d = i;
                this.f112948e = i2;
                this.f112949f = c45296mn2;
                this.f112950g = j;
            }

            @Override // p000.BO2
            /* renamed from: a */
            public final C52410yn2 mo9770a(int i, Object key, int i2, int i3, List<? extends OU3> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new C52410yn2(i, key, this.f112945b, i2, i3, this.f112946c, this.f112944a.getLayoutDirection(), this.f112947d, this.f112948e, placeables, this.f112949f, this.f112950g, null);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: un2$c$d */
        /* loaded from: classes.dex */
        public static final class C29305d implements DO2 {

            /* renamed from: a */
            public final /* synthetic */ boolean f112951a;

            /* renamed from: b */
            public final /* synthetic */ List<Integer> f112952b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC36646Vn2 f112953c;

            /* renamed from: d */
            public final /* synthetic */ int f112954d;

            public C29305d(boolean z, List<Integer> list, InterfaceC36646Vn2 interfaceC36646Vn2, int i) {
                this.f112951a = z;
                this.f112952b = list;
                this.f112953c = interfaceC36646Vn2;
                this.f112954d = i;
            }

            @Override // p000.DO2
            /* renamed from: a */
            public final C53003zn2 mo9769a(int i, C52410yn2[] items, List<C39631dE1> spans, int i2) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(spans, "spans");
                return new C53003zn2(i, items, spans, this.f112951a, this.f112952b.size(), this.f112953c.getLayoutDirection(), i2, this.f112954d, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29301c(boolean z, PD3 pd3, boolean z2, C33136Gn2 c33136Gn2, InterfaceC46482on2 interfaceC46482on2, Function2<? super InterfaceC41273g01, ? super C44228kz0, ? extends List<Integer>> function2, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, C45296mn2 c45296mn2) {
            super(2);
            this.f112929g = z;
            this.f112930h = pd3;
            this.f112931i = z2;
            this.f112932j = c33136Gn2;
            this.f112933k = interfaceC46482on2;
            this.f112934l = function2;
            this.f112935m = interfaceC25789l;
            this.f112936n = interfaceC25781d;
            this.f112937o = c45296mn2;
        }

        /* renamed from: a */
        public final C51817xn2 m9773a(InterfaceC36646Vn2 interfaceC36646Vn2, long j) {
            EnumC32768Ey3 enumC32768Ey3;
            int mo3416F0;
            int mo3416F02;
            int i;
            int i2;
            float mo26793a;
            float m29303g;
            int m28063n;
            long m114704a;
            int m104737n;
            int i3;
            Intrinsics.checkNotNullParameter(interfaceC36646Vn2, "$this$null");
            if (this.f112929g) {
                enumC32768Ey3 = EnumC32768Ey3.Vertical;
            } else {
                enumC32768Ey3 = EnumC32768Ey3.Horizontal;
            }
            C46430oi0.m20590a(j, enumC32768Ey3);
            if (this.f112929g) {
                mo3416F0 = interfaceC36646Vn2.mo3416F0(this.f112930h.mo88734b(interfaceC36646Vn2.getLayoutDirection()));
            } else {
                mo3416F0 = interfaceC36646Vn2.mo3416F0(ND3.m94186g(this.f112930h, interfaceC36646Vn2.getLayoutDirection()));
            }
            if (this.f112929g) {
                mo3416F02 = interfaceC36646Vn2.mo3416F0(this.f112930h.mo88733c(interfaceC36646Vn2.getLayoutDirection()));
            } else {
                mo3416F02 = interfaceC36646Vn2.mo3416F0(ND3.m94187f(this.f112930h, interfaceC36646Vn2.getLayoutDirection()));
            }
            int mo3416F03 = interfaceC36646Vn2.mo3416F0(this.f112930h.mo88732d());
            int mo3416F04 = interfaceC36646Vn2.mo3416F0(this.f112930h.mo88735a());
            int i4 = mo3416F03 + mo3416F04;
            int i5 = mo3416F0 + mo3416F02;
            boolean z = this.f112929g;
            if (z) {
                i = i4;
            } else {
                i = i5;
            }
            if (z && !this.f112931i) {
                i2 = mo3416F03;
            } else if (z && this.f112931i) {
                i2 = mo3416F04;
            } else if (!z && !this.f112931i) {
                i2 = mo3416F0;
            } else {
                i2 = mo3416F02;
            }
            int i6 = i - i2;
            long m22036h = C46007nz0.m22036h(j, -i5, -i4);
            this.f112932j.m104745M(this.f112933k);
            C32902Fn2 mo17074i = this.f112933k.mo17074i();
            List<Integer> invoke = this.f112934l.invoke(interfaceC36646Vn2, C44228kz0.m28075b(j));
            mo17074i.m106463h(invoke.size());
            this.f112932j.m104752F(interfaceC36646Vn2);
            this.f112932j.m104748J(invoke.size());
            if (this.f112929g) {
                C25777lo.InterfaceC25789l interfaceC25789l = this.f112935m;
                if (interfaceC25789l != null) {
                    mo26793a = interfaceC25789l.mo26793a();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                C25777lo.InterfaceC25781d interfaceC25781d = this.f112936n;
                if (interfaceC25781d != null) {
                    mo26793a = interfaceC25781d.mo26793a();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            int mo3416F05 = interfaceC36646Vn2.mo3416F0(mo26793a);
            if (this.f112929g) {
                C25777lo.InterfaceC25781d interfaceC25781d2 = this.f112936n;
                if (interfaceC25781d2 != null) {
                    m29303g = interfaceC25781d2.mo26793a();
                } else {
                    m29303g = C43705k61.m29303g(0);
                }
            } else {
                C25777lo.InterfaceC25789l interfaceC25789l2 = this.f112935m;
                if (interfaceC25789l2 != null) {
                    m29303g = interfaceC25789l2.mo26793a();
                } else {
                    m29303g = C43705k61.m29303g(0);
                }
            }
            int mo3416F06 = interfaceC36646Vn2.mo3416F0(m29303g);
            int itemCount = this.f112933k.getItemCount();
            if (this.f112929g) {
                m28063n = C44228kz0.m28064m(j) - i4;
            } else {
                m28063n = C44228kz0.m28063n(j) - i5;
            }
            int i7 = m28063n;
            if (this.f112931i && i7 <= 0) {
                boolean z2 = this.f112929g;
                if (!z2) {
                    mo3416F0 += i7;
                }
                if (z2) {
                    mo3416F03 += i7;
                }
                m114704a = B52.m114704a(mo3416F0, mo3416F03);
            } else {
                m114704a = B52.m114704a(mo3416F0, mo3416F03);
            }
            int i8 = i2;
            C32911Fo2 c32911Fo2 = new C32911Fo2(this.f112933k, interfaceC36646Vn2, mo3416F05, new C29304c(interfaceC36646Vn2, this.f112929g, this.f112931i, i2, i6, this.f112937o, m114704a));
            boolean z3 = this.f112929g;
            C33379Ho2 c33379Ho2 = new C33379Ho2(z3, invoke, mo3416F06, itemCount, mo3416F05, c32911Fo2, mo17074i, new C29305d(z3, invoke, interfaceC36646Vn2, mo3416F06));
            this.f112932j.m104750H(new C29302a(mo17074i, c33379Ho2));
            AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
            C33136Gn2 c33136Gn2 = this.f112932j;
            AbstractC48600sM5 m14281a = c28290a.m14281a();
            try {
                AbstractC48600sM5 m14295k = m14281a.m14295k();
                if (c33136Gn2.m104738m() >= itemCount && itemCount > 0) {
                    i3 = mo17074i.m106467d(itemCount - 1);
                    m104737n = 0;
                    Unit unit = Unit.INSTANCE;
                    m14281a.m14288r(m14295k);
                    m14281a.mo1848d();
                    C51817xn2 m6324c = C51224wn2.m6324c(itemCount, this.f112933k, c33379Ho2, c32911Fo2, i7, i8, i6, mo3416F05, i3, m104737n, this.f112932j.m104728w(), m22036h, this.f112929g, this.f112935m, this.f112936n, this.f112931i, interfaceC36646Vn2, this.f112937o, mo17074i, this.f112932j.m104734q(), new C29303b(interfaceC36646Vn2, j, i5, i4));
                    this.f112932j.m104742i(m6324c);
                    return m6324c;
                }
                int m106467d = mo17074i.m106467d(c33136Gn2.m104738m());
                m104737n = c33136Gn2.m104737n();
                i3 = m106467d;
                Unit unit2 = Unit.INSTANCE;
                m14281a.m14288r(m14295k);
                m14281a.mo1848d();
                C51817xn2 m6324c2 = C51224wn2.m6324c(itemCount, this.f112933k, c33379Ho2, c32911Fo2, i7, i8, i6, mo3416F05, i3, m104737n, this.f112932j.m104728w(), m22036h, this.f112929g, this.f112935m, this.f112936n, this.f112931i, interfaceC36646Vn2, this.f112937o, mo17074i, this.f112932j.m104734q(), new C29303b(interfaceC36646Vn2, j, i5, i4));
                this.f112932j.m104742i(m6324c2);
                return m6324c2;
            } catch (Throwable th) {
                m14281a.mo1848d();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C51817xn2 invoke(InterfaceC36646Vn2 interfaceC36646Vn2, C44228kz0 c44228kz0) {
            return m9773a(interfaceC36646Vn2, c44228kz0.m28058s());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9777a(InterfaceC41563gV2 interfaceC41563gV2, C33136Gn2 state, Function2<? super InterfaceC41273g01, ? super C44228kz0, ? extends List<Integer>> slotSizesSums, PD3 pd3, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, boolean z3, C25777lo.InterfaceC25789l verticalArrangement, C25777lo.InterfaceC25781d horizontalArrangement, Function1<? super InterfaceC31966Bn2, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3) {
        Object obj;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC39436cu1 interfaceC39436cu12;
        Object obj2;
        PD3 pd32;
        int i10;
        boolean z4;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        boolean mo89539n;
        Object mo89635G2;
        InterfaceC32720Et0 interfaceC32720Et02;
        boolean z5;
        PD3 pd33;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC39436cu1 interfaceC39436cu13;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(152645664);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i | 6;
            obj = interfaceC41563gV2;
        } else if ((i & 14) == 0) {
            obj = interfaceC41563gV2;
            i4 = (mo89518u.mo89539n(obj) ? 4 : 2) | i;
        } else {
            obj = interfaceC41563gV2;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= mo89518u.mo89539n(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= mo89518u.mo89629I(slotSizesSums) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= mo89518u.mo89539n(pd3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= mo89518u.mo89536o(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i6 = ImageMetadata.EDGE_MODE;
            } else {
                if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i6 = mo89518u.mo89536o(z2) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                }
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && mo89518u.mo89539n(interfaceC39436cu1)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= mo89518u.mo89536o(z3) ? 8388608 : 4194304;
                    if ((i3 & 256) == 0) {
                        i7 = 100663296;
                    } else {
                        if ((234881024 & i) == 0) {
                            i7 = mo89518u.mo89539n(verticalArrangement) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i8 = mo89518u.mo89539n(horizontalArrangement) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i9 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i9 = i2 | (mo89518u.mo89629I(content) ? 4 : 2);
                            } else {
                                i9 = i2;
                            }
                            if ((i4 & 1533916891) != 306783378 && (i9 & 11) == 2 && mo89518u.mo89575b()) {
                                mo89518u.mo89548k();
                                z5 = z;
                                interfaceC41563gV22 = obj;
                                interfaceC32720Et02 = mo89518u;
                                pd33 = pd3;
                                interfaceC39436cu13 = interfaceC39436cu1;
                            } else {
                                mo89518u.mo89626J();
                                if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                                    mo89518u.mo89548k();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    pd32 = pd3;
                                    interfaceC39436cu12 = interfaceC39436cu1;
                                    obj2 = obj;
                                    i10 = i4;
                                    z4 = z;
                                } else {
                                    Object obj3 = i11 == 0 ? InterfaceC41563gV2.f82354b0 : obj;
                                    PD3 m94192a = i12 == 0 ? ND3.m94192a(C43705k61.m29303g(0)) : pd3;
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) == 0) {
                                        pd32 = m94192a;
                                        i10 = i4 & (-3670017);
                                        interfaceC39436cu12 = C37369Yp5.f47422a.m74177a(mo89518u, 6);
                                        obj2 = obj3;
                                    } else {
                                        interfaceC39436cu12 = interfaceC39436cu1;
                                        obj2 = obj3;
                                        pd32 = m94192a;
                                        i10 = i4;
                                    }
                                    z4 = z6;
                                }
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(152645664, i10, i9, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:51)");
                                }
                                C37369Yp5 c37369Yp5 = C37369Yp5.f47422a;
                                DA3 m74176b = c37369Yp5.m74176b(mo89518u, 6);
                                int i13 = i10 >> 3;
                                int i14 = i13 & 14;
                                InterfaceC46482on2 m17077a = C47668qn2.m17077a(state, content, mo89518u, i14 | ((i9 << 3) & 112));
                                int i15 = i10 >> 9;
                                InterfaceC39969do2 m96331a = C34315Lo2.m96331a(state, z4, mo89518u, i14 | (i15 & 112));
                                mo89518u.mo89638F(773894976);
                                mo89518u.mo89638F(-492369756);
                                mo89635G = mo89518u.mo89635G();
                                c2012a = InterfaceC32720Et0.f8257a;
                                if (mo89635G == c2012a.m108267a()) {
                                    C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                                    mo89518u.mo89503z(c42992iu0);
                                    mo89635G = c42992iu0;
                                }
                                mo89518u.mo89605Q();
                                ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
                                mo89518u.mo89605Q();
                                Boolean valueOf = Boolean.valueOf(z2);
                                mo89518u.mo89638F(511388516);
                                mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(state);
                                mo89635G2 = mo89518u.mo89635G();
                                if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                                    mo89635G2 = new C45296mn2(m31665a, z2);
                                    mo89518u.mo89503z(mo89635G2);
                                }
                                mo89518u.mo89605Q();
                                C45296mn2 c45296mn2 = (C45296mn2) mo89635G2;
                                state.m104751G(c45296mn2);
                                int i16 = i10 & 112;
                                int i17 = i10;
                                boolean z7 = z4;
                                InterfaceC41563gV2 interfaceC41563gV23 = obj2;
                                Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d = m9774d(m17077a, state, slotSizesSums, pd32, z4, z2, horizontalArrangement, verticalArrangement, c45296mn2, mo89518u, 134217728 | i16 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES) | (i15 & 3670016) | (i13 & 29360128), 0);
                                state.m104747K(z2);
                                interfaceC32720Et02 = mo89518u;
                                m9776b(m17077a, state, interfaceC32720Et02, i16);
                                EnumC32768Ey3 enumC32768Ey3 = !z2 ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal;
                                C36412Un2.m80871a(m17077a, C37603Zp5.m72420j(EA3.m109331a(C35915Sk0.m84932a(C41155fo2.m40806a(interfaceC41563gV23.mo39266t0(state.m104729v()).mo39266t0(state.m104740k()), m17077a, m96331a, enumC32768Ey3, z3, z7, interfaceC32720Et02, (i15 & 57344) | ((i17 << 3) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), m74176b), state, enumC32768Ey3, m74176b, z3, c37369Yp5.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z7), interfaceC39436cu12, state.m104736o()), state.m104731t(), m9774d, interfaceC32720Et02, 0, 0);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                z5 = z7;
                                pd33 = pd32;
                                interfaceC41563gV22 = interfaceC41563gV23;
                                interfaceC39436cu13 = interfaceC39436cu12;
                            }
                            mo89512w = interfaceC32720Et02.mo89512w();
                            if (mo89512w != null) {
                                return;
                            }
                            mo89512w.mo20405a(new C29299a(interfaceC41563gV22, state, slotSizesSums, pd33, z5, z2, interfaceC39436cu13, z3, verticalArrangement, horizontalArrangement, content, i, i2, i3));
                            return;
                        }
                        i8 = 805306368;
                        i4 |= i8;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) != 306783378) {
                        }
                        mo89518u.mo89626J();
                        if ((i & 1) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        z4 = z6;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        C37369Yp5 c37369Yp52 = C37369Yp5.f47422a;
                        DA3 m74176b2 = c37369Yp52.m74176b(mo89518u, 6);
                        int i132 = i10 >> 3;
                        int i142 = i132 & 14;
                        InterfaceC46482on2 m17077a2 = C47668qn2.m17077a(state, content, mo89518u, i142 | ((i9 << 3) & 112));
                        int i152 = i10 >> 9;
                        InterfaceC39969do2 m96331a2 = C34315Lo2.m96331a(state, z4, mo89518u, i142 | (i152 & 112));
                        mo89518u.mo89638F(773894976);
                        mo89518u.mo89638F(-492369756);
                        mo89635G = mo89518u.mo89635G();
                        c2012a = InterfaceC32720Et0.f8257a;
                        if (mo89635G == c2012a.m108267a()) {
                        }
                        mo89518u.mo89605Q();
                        ZC0 m31665a2 = ((C42992iu0) mo89635G).m31665a();
                        mo89518u.mo89605Q();
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        mo89518u.mo89638F(511388516);
                        mo89539n = mo89518u.mo89539n(valueOf2) | mo89518u.mo89539n(state);
                        mo89635G2 = mo89518u.mo89635G();
                        if (!mo89539n) {
                        }
                        mo89635G2 = new C45296mn2(m31665a2, z2);
                        mo89518u.mo89503z(mo89635G2);
                        mo89518u.mo89605Q();
                        C45296mn2 c45296mn22 = (C45296mn2) mo89635G2;
                        state.m104751G(c45296mn22);
                        int i162 = i10 & 112;
                        int i172 = i10;
                        boolean z72 = z4;
                        InterfaceC41563gV2 interfaceC41563gV232 = obj2;
                        Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d2 = m9774d(m17077a2, state, slotSizesSums, pd32, z4, z2, horizontalArrangement, verticalArrangement, c45296mn22, mo89518u, 134217728 | i162 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES) | (i152 & 3670016) | (i132 & 29360128), 0);
                        state.m104747K(z2);
                        interfaceC32720Et02 = mo89518u;
                        m9776b(m17077a2, state, interfaceC32720Et02, i162);
                        if (!z2) {
                        }
                        C36412Un2.m80871a(m17077a2, C37603Zp5.m72420j(EA3.m109331a(C35915Sk0.m84932a(C41155fo2.m40806a(interfaceC41563gV232.mo39266t0(state.m104729v()).mo39266t0(state.m104740k()), m17077a2, m96331a2, enumC32768Ey3, z3, z72, interfaceC32720Et02, (i152 & 57344) | ((i172 << 3) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), m74176b2), state, enumC32768Ey3, m74176b2, z3, c37369Yp52.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z72), interfaceC39436cu12, state.m104736o()), state.m104731t(), m9774d2, interfaceC32720Et02, 0, 0);
                        if (C35528Qt0.m87827O()) {
                        }
                        z5 = z72;
                        pd33 = pd32;
                        interfaceC41563gV22 = interfaceC41563gV232;
                        interfaceC39436cu13 = interfaceC39436cu12;
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w != null) {
                        }
                    }
                    i4 |= i7;
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i8;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    z4 = z6;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    C37369Yp5 c37369Yp522 = C37369Yp5.f47422a;
                    DA3 m74176b22 = c37369Yp522.m74176b(mo89518u, 6);
                    int i1322 = i10 >> 3;
                    int i1422 = i1322 & 14;
                    InterfaceC46482on2 m17077a22 = C47668qn2.m17077a(state, content, mo89518u, i1422 | ((i9 << 3) & 112));
                    int i1522 = i10 >> 9;
                    InterfaceC39969do2 m96331a22 = C34315Lo2.m96331a(state, z4, mo89518u, i1422 | (i1522 & 112));
                    mo89518u.mo89638F(773894976);
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    ZC0 m31665a22 = ((C42992iu0) mo89635G).m31665a();
                    mo89518u.mo89605Q();
                    Boolean valueOf22 = Boolean.valueOf(z2);
                    mo89518u.mo89638F(511388516);
                    mo89539n = mo89518u.mo89539n(valueOf22) | mo89518u.mo89539n(state);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G2 = new C45296mn2(m31665a22, z2);
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    C45296mn2 c45296mn222 = (C45296mn2) mo89635G2;
                    state.m104751G(c45296mn222);
                    int i1622 = i10 & 112;
                    int i1722 = i10;
                    boolean z722 = z4;
                    InterfaceC41563gV2 interfaceC41563gV2322 = obj2;
                    Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d22 = m9774d(m17077a22, state, slotSizesSums, pd32, z4, z2, horizontalArrangement, verticalArrangement, c45296mn222, mo89518u, 134217728 | i1622 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES) | (i1522 & 3670016) | (i1322 & 29360128), 0);
                    state.m104747K(z2);
                    interfaceC32720Et02 = mo89518u;
                    m9776b(m17077a22, state, interfaceC32720Et02, i1622);
                    if (!z2) {
                    }
                    C36412Un2.m80871a(m17077a22, C37603Zp5.m72420j(EA3.m109331a(C35915Sk0.m84932a(C41155fo2.m40806a(interfaceC41563gV2322.mo39266t0(state.m104729v()).mo39266t0(state.m104740k()), m17077a22, m96331a22, enumC32768Ey3, z3, z722, interfaceC32720Et02, (i1522 & 57344) | ((i1722 << 3) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), m74176b22), state, enumC32768Ey3, m74176b22, z3, c37369Yp522.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z722), interfaceC39436cu12, state.m104736o()), state.m104731t(), m9774d22, interfaceC32720Et02, 0, 0);
                    if (C35528Qt0.m87827O()) {
                    }
                    z5 = z722;
                    pd33 = pd32;
                    interfaceC41563gV22 = interfaceC41563gV2322;
                    interfaceC39436cu13 = interfaceC39436cu12;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                if ((i3 & 256) == 0) {
                }
                i4 |= i7;
                if ((i3 & 512) == 0) {
                }
                i4 |= i8;
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                z4 = z6;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                C37369Yp5 c37369Yp5222 = C37369Yp5.f47422a;
                DA3 m74176b222 = c37369Yp5222.m74176b(mo89518u, 6);
                int i13222 = i10 >> 3;
                int i14222 = i13222 & 14;
                InterfaceC46482on2 m17077a222 = C47668qn2.m17077a(state, content, mo89518u, i14222 | ((i9 << 3) & 112));
                int i15222 = i10 >> 9;
                InterfaceC39969do2 m96331a222 = C34315Lo2.m96331a(state, z4, mo89518u, i14222 | (i15222 & 112));
                mo89518u.mo89638F(773894976);
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                ZC0 m31665a222 = ((C42992iu0) mo89635G).m31665a();
                mo89518u.mo89605Q();
                Boolean valueOf222 = Boolean.valueOf(z2);
                mo89518u.mo89638F(511388516);
                mo89539n = mo89518u.mo89539n(valueOf222) | mo89518u.mo89539n(state);
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G2 = new C45296mn2(m31665a222, z2);
                mo89518u.mo89503z(mo89635G2);
                mo89518u.mo89605Q();
                C45296mn2 c45296mn2222 = (C45296mn2) mo89635G2;
                state.m104751G(c45296mn2222);
                int i16222 = i10 & 112;
                int i17222 = i10;
                boolean z7222 = z4;
                InterfaceC41563gV2 interfaceC41563gV23222 = obj2;
                Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d222 = m9774d(m17077a222, state, slotSizesSums, pd32, z4, z2, horizontalArrangement, verticalArrangement, c45296mn2222, mo89518u, 134217728 | i16222 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES) | (i15222 & 3670016) | (i13222 & 29360128), 0);
                state.m104747K(z2);
                interfaceC32720Et02 = mo89518u;
                m9776b(m17077a222, state, interfaceC32720Et02, i16222);
                if (!z2) {
                }
                C36412Un2.m80871a(m17077a222, C37603Zp5.m72420j(EA3.m109331a(C35915Sk0.m84932a(C41155fo2.m40806a(interfaceC41563gV23222.mo39266t0(state.m104729v()).mo39266t0(state.m104740k()), m17077a222, m96331a222, enumC32768Ey3, z3, z7222, interfaceC32720Et02, (i15222 & 57344) | ((i17222 << 3) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), m74176b222), state, enumC32768Ey3, m74176b222, z3, c37369Yp5222.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z7222), interfaceC39436cu12, state.m104736o()), state.m104731t(), m9774d222, interfaceC32720Et02, 0, 0);
                if (C35528Qt0.m87827O()) {
                }
                z5 = z7222;
                pd33 = pd32;
                interfaceC41563gV22 = interfaceC41563gV23222;
                interfaceC39436cu13 = interfaceC39436cu12;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                }
            }
            i4 |= i6;
            if ((i & 3670016) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i4 |= i7;
            if ((i3 & 512) == 0) {
            }
            i4 |= i8;
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            z4 = z6;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            C37369Yp5 c37369Yp52222 = C37369Yp5.f47422a;
            DA3 m74176b2222 = c37369Yp52222.m74176b(mo89518u, 6);
            int i132222 = i10 >> 3;
            int i142222 = i132222 & 14;
            InterfaceC46482on2 m17077a2222 = C47668qn2.m17077a(state, content, mo89518u, i142222 | ((i9 << 3) & 112));
            int i152222 = i10 >> 9;
            InterfaceC39969do2 m96331a2222 = C34315Lo2.m96331a(state, z4, mo89518u, i142222 | (i152222 & 112));
            mo89518u.mo89638F(773894976);
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            ZC0 m31665a2222 = ((C42992iu0) mo89635G).m31665a();
            mo89518u.mo89605Q();
            Boolean valueOf2222 = Boolean.valueOf(z2);
            mo89518u.mo89638F(511388516);
            mo89539n = mo89518u.mo89539n(valueOf2222) | mo89518u.mo89539n(state);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G2 = new C45296mn2(m31665a2222, z2);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            C45296mn2 c45296mn22222 = (C45296mn2) mo89635G2;
            state.m104751G(c45296mn22222);
            int i162222 = i10 & 112;
            int i172222 = i10;
            boolean z72222 = z4;
            InterfaceC41563gV2 interfaceC41563gV232222 = obj2;
            Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d2222 = m9774d(m17077a2222, state, slotSizesSums, pd32, z4, z2, horizontalArrangement, verticalArrangement, c45296mn22222, mo89518u, 134217728 | i162222 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES) | (i152222 & 3670016) | (i132222 & 29360128), 0);
            state.m104747K(z2);
            interfaceC32720Et02 = mo89518u;
            m9776b(m17077a2222, state, interfaceC32720Et02, i162222);
            if (!z2) {
            }
            C36412Un2.m80871a(m17077a2222, C37603Zp5.m72420j(EA3.m109331a(C35915Sk0.m84932a(C41155fo2.m40806a(interfaceC41563gV232222.mo39266t0(state.m104729v()).mo39266t0(state.m104740k()), m17077a2222, m96331a2222, enumC32768Ey3, z3, z72222, interfaceC32720Et02, (i152222 & 57344) | ((i172222 << 3) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), m74176b2222), state, enumC32768Ey3, m74176b2222, z3, c37369Yp52222.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z72222), interfaceC39436cu12, state.m104736o()), state.m104731t(), m9774d2222, interfaceC32720Et02, 0, 0);
            if (C35528Qt0.m87827O()) {
            }
            z5 = z72222;
            pd33 = pd32;
            interfaceC41563gV22 = interfaceC41563gV232222;
            interfaceC39436cu13 = interfaceC39436cu12;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i6;
        if ((i & 3670016) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i4 |= i7;
        if ((i3 & 512) == 0) {
        }
        i4 |= i8;
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        z4 = z6;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        C37369Yp5 c37369Yp522222 = C37369Yp5.f47422a;
        DA3 m74176b22222 = c37369Yp522222.m74176b(mo89518u, 6);
        int i1322222 = i10 >> 3;
        int i1422222 = i1322222 & 14;
        InterfaceC46482on2 m17077a22222 = C47668qn2.m17077a(state, content, mo89518u, i1422222 | ((i9 << 3) & 112));
        int i1522222 = i10 >> 9;
        InterfaceC39969do2 m96331a22222 = C34315Lo2.m96331a(state, z4, mo89518u, i1422222 | (i1522222 & 112));
        mo89518u.mo89638F(773894976);
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        ZC0 m31665a22222 = ((C42992iu0) mo89635G).m31665a();
        mo89518u.mo89605Q();
        Boolean valueOf22222 = Boolean.valueOf(z2);
        mo89518u.mo89638F(511388516);
        mo89539n = mo89518u.mo89539n(valueOf22222) | mo89518u.mo89539n(state);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G2 = new C45296mn2(m31665a22222, z2);
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        C45296mn2 c45296mn222222 = (C45296mn2) mo89635G2;
        state.m104751G(c45296mn222222);
        int i1622222 = i10 & 112;
        int i1722222 = i10;
        boolean z722222 = z4;
        InterfaceC41563gV2 interfaceC41563gV2322222 = obj2;
        Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d22222 = m9774d(m17077a22222, state, slotSizesSums, pd32, z4, z2, horizontalArrangement, verticalArrangement, c45296mn222222, mo89518u, 134217728 | i1622222 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES) | (i1522222 & 3670016) | (i1322222 & 29360128), 0);
        state.m104747K(z2);
        interfaceC32720Et02 = mo89518u;
        m9776b(m17077a22222, state, interfaceC32720Et02, i1622222);
        if (!z2) {
        }
        C36412Un2.m80871a(m17077a22222, C37603Zp5.m72420j(EA3.m109331a(C35915Sk0.m84932a(C41155fo2.m40806a(interfaceC41563gV2322222.mo39266t0(state.m104729v()).mo39266t0(state.m104740k()), m17077a22222, m96331a22222, enumC32768Ey3, z3, z722222, interfaceC32720Et02, (i1522222 & 57344) | ((i1722222 << 3) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), m74176b22222), state, enumC32768Ey3, m74176b22222, z3, c37369Yp522222.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z722222), interfaceC39436cu12, state.m104736o()), state.m104731t(), m9774d22222, interfaceC32720Et02, 0, 0);
        if (C35528Qt0.m87827O()) {
        }
        z5 = z722222;
        pd33 = pd32;
        interfaceC41563gV22 = interfaceC41563gV2322222;
        interfaceC39436cu13 = interfaceC39436cu12;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: b */
    public static final void m9776b(InterfaceC46482on2 interfaceC46482on2, C33136Gn2 c33136Gn2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(950944068);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC46482on2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(c33136Gn2)) {
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
                C35528Qt0.m87816Z(950944068, i, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:139)");
            }
            if (interfaceC46482on2.getItemCount() > 0) {
                c33136Gn2.m104745M(interfaceC46482on2);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C29300b(interfaceC46482on2, c33136Gn2, i));
        }
    }

    /* renamed from: d */
    public static final Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m9774d(InterfaceC46482on2 interfaceC46482on2, C33136Gn2 c33136Gn2, Function2<? super InterfaceC41273g01, ? super C44228kz0, ? extends List<Integer>> function2, PD3 pd3, boolean z, boolean z2, C25777lo.InterfaceC25781d interfaceC25781d, C25777lo.InterfaceC25789l interfaceC25789l, C45296mn2 c45296mn2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        C25777lo.InterfaceC25781d interfaceC25781d2;
        C25777lo.InterfaceC25789l interfaceC25789l2;
        interfaceC32720Et0.mo89638F(237903564);
        if ((i2 & 64) != 0) {
            interfaceC25781d2 = null;
        } else {
            interfaceC25781d2 = interfaceC25781d;
        }
        if ((i2 & 128) != 0) {
            interfaceC25789l2 = null;
        } else {
            interfaceC25789l2 = interfaceC25789l;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(237903564, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:150)");
        }
        Object[] objArr = {c33136Gn2, function2, pd3, Boolean.valueOf(z), Boolean.valueOf(z2), interfaceC25781d2, interfaceC25789l2, c45296mn2};
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z3 = false;
        for (int i3 = 0; i3 < 8; i3++) {
            z3 |= interfaceC32720Et0.mo89539n(objArr[i3]);
        }
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (z3 || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C29301c(z2, pd3, z, c33136Gn2, interfaceC46482on2, function2, interfaceC25789l2, interfaceC25781d2, c45296mn2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> function22 = (Function2) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return function22;
    }
}
