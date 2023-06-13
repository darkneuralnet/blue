package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.F96;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aA\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\u0017\u0010*\u001a\u00020(8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0017\u0010+\u001a\u00020(8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0017\u0010-\u001a\u00020(8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010)\"\u0017\u0010/\u001a\u00020(8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010)\"\u0017\u00101\u001a\u00020(8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, m28432d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "LgV2;", "modifier", "enabled", "LrX2;", "interactionSource", "Lri0;", "colors", C17296a.f69688o, "(ZLkotlin/jvm/functions/Function1;LgV2;ZLrX2;Lri0;LEt0;II)V", "Ln56;", TransferTable.COLUMN_STATE, "Lkotlin/Function0;", "onClick", "h", "(Ln56;Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lri0;LEt0;II)V", "value", "b", "(ZLn56;LgV2;Lri0;LEt0;I)V", "LI61;", "Lpm0;", "boxColor", "borderColor", "", "radius", "strokeWidth", "s", "(LI61;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Lmi0;", "drawingCache", "t", "(LI61;JFFFLmi0;)V", "Lk61;", "F", "CheckboxRippleRadius", "CheckboxDefaultPadding", "c", "CheckboxSize", DateTokenConverter.CONVERTER_KEY, "StrokeWidth", "e", "RadiusSize", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n50#2:493\n49#2:494\n25#2:501\n25#2:526\n83#2,3:533\n1114#3,6:487\n1114#3,6:495\n1114#3,6:502\n1114#3,6:527\n1114#3,6:536\n931#4,4:508\n852#4,5:512\n931#4,4:517\n852#4,5:521\n76#5:542\n76#5:543\n76#5:544\n76#5:545\n76#5:546\n154#6:547\n154#6:548\n154#6:549\n154#6:550\n154#6:551\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n96#1:493\n96#1:494\n137#1:501\n297#1:526\n301#1:533,3\n91#1:487,6\n96#1:495,6\n137#1:502,6\n297#1:527,6\n301#1:536,6\n266#1:508,4\n266#1:512,5\n282#1:517,4\n282#1:521,5\n266#1:542\n282#1:543\n298#1:544\n299#1:545\n300#1:546\n480#1:547\n481#1:548\n482#1:549\n483#1:550\n484#1:551\n*E\n"})
/* renamed from: ti0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49394ti0 {

    /* renamed from: b */
    public static final float f110889b;

    /* renamed from: d */
    public static final float f110891d;

    /* renamed from: e */
    public static final float f110892e;

    /* renamed from: a */
    public static final float f110888a = C43705k61.m29303g(24);

    /* renamed from: c */
    public static final float f110890c = C43705k61.m29303g(20);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$a */
    /* loaded from: classes.dex */
    public static final class C28804a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Boolean, Unit> f110893g;

        /* renamed from: h */
        public final /* synthetic */ boolean f110894h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28804a(Function1<? super Boolean, Unit> function1, boolean z) {
            super(0);
            this.f110893g = function1;
            this.f110894h = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f110893g.invoke(Boolean.valueOf(!this.f110894h));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$b */
    /* loaded from: classes.dex */
    public static final class C28805b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f110895g;

        /* renamed from: h */
        public final /* synthetic */ Function1<Boolean, Unit> f110896h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f110897i;

        /* renamed from: j */
        public final /* synthetic */ boolean f110898j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48104rX2 f110899k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC48209ri0 f110900l;

        /* renamed from: m */
        public final /* synthetic */ int f110901m;

        /* renamed from: n */
        public final /* synthetic */ int f110902n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28805b(boolean z, Function1<? super Boolean, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC48209ri0 interfaceC48209ri0, int i, int i2) {
            super(2);
            this.f110895g = z;
            this.f110896h = function1;
            this.f110897i = interfaceC41563gV2;
            this.f110898j = z2;
            this.f110899k = interfaceC48104rX2;
            this.f110900l = interfaceC48209ri0;
            this.f110901m = i;
            this.f110902n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C49394ti0.m11902a(this.f110895g, this.f110896h, this.f110897i, this.f110898j, this.f110899k, this.f110900l, interfaceC32720Et0, C47127ps4.m18626a(this.f110901m | 1), this.f110902n);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$c */
    /* loaded from: classes.dex */
    public static final class C28806c extends Lambda implements Function1<I61, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45244mi0 f110903g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<C47063pm0> f110904h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<C47063pm0> f110905i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC48627sP5<C47063pm0> f110906j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48627sP5<Float> f110907k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC48627sP5<Float> f110908l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28806c(C45244mi0 c45244mi0, InterfaceC48627sP5<C47063pm0> interfaceC48627sP5, InterfaceC48627sP5<C47063pm0> interfaceC48627sP52, InterfaceC48627sP5<C47063pm0> interfaceC48627sP53, InterfaceC48627sP5<Float> interfaceC48627sP54, InterfaceC48627sP5<Float> interfaceC48627sP55) {
            super(1);
            this.f110903g = c45244mi0;
            this.f110904h = interfaceC48627sP5;
            this.f110905i = interfaceC48627sP52;
            this.f110906j = interfaceC48627sP53;
            this.f110907k = interfaceC48627sP54;
            this.f110908l = interfaceC48627sP55;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float floor = (float) Math.floor(Canvas.mo3411T0(C49394ti0.f110891d));
            C49394ti0.m11884s(Canvas, C49394ti0.m11896g(this.f110904h), C49394ti0.m11900c(this.f110905i), Canvas.mo3411T0(C49394ti0.f110892e), floor);
            C49394ti0.m11883t(Canvas, C49394ti0.m11897f(this.f110906j), C49394ti0.m11899d(this.f110907k), C49394ti0.m11898e(this.f110908l), floor, this.f110903g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$d */
    /* loaded from: classes.dex */
    public static final class C28807d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f110909g;

        /* renamed from: h */
        public final /* synthetic */ EnumC45479n56 f110910h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f110911i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC48209ri0 f110912j;

        /* renamed from: k */
        public final /* synthetic */ int f110913k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28807d(boolean z, EnumC45479n56 enumC45479n56, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48209ri0 interfaceC48209ri0, int i) {
            super(2);
            this.f110909g = z;
            this.f110910h = enumC45479n56;
            this.f110911i = interfaceC41563gV2;
            this.f110912j = interfaceC48209ri0;
            this.f110913k = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C49394ti0.m11901b(this.f110909g, this.f110910h, this.f110911i, this.f110912j, interfaceC32720Et0, C47127ps4.m18626a(this.f110913k | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$e */
    /* loaded from: classes.dex */
    public static final class C28808e extends Lambda implements Function3<F96.InterfaceC2189b<EnumC45479n56>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public static final C28808e f110914g = new C28808e();

        public C28808e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC45479n56> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC45479n56> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC49435tm1<Float> m25224f;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(1075283605);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1075283605, i, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)");
            }
            EnumC45479n56 initialState = animateFloat.getInitialState();
            EnumC45479n56 enumC45479n56 = EnumC45479n56.Off;
            if (initialState == enumC45479n56) {
                m25224f = C26160mf.m25223g(0, 1, null);
            } else {
                m25224f = animateFloat.mo91780b() == enumC45479n56 ? C26160mf.m25224f(100) : C26160mf.m25219k(100, 0, null, 6, null);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25224f;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$f */
    /* loaded from: classes.dex */
    public static final class C28809f extends Lambda implements Function3<F96.InterfaceC2189b<EnumC45479n56>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public static final C28809f f110915g = new C28809f();

        public C28809f() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC45479n56> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC45479n56> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC49435tm1<Float> m25224f;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(-1707702900);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1707702900, i, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:266)");
            }
            EnumC45479n56 initialState = animateFloat.getInitialState();
            EnumC45479n56 enumC45479n56 = EnumC45479n56.Off;
            if (initialState == enumC45479n56) {
                m25224f = C26160mf.m25219k(100, 0, null, 6, null);
            } else {
                m25224f = animateFloat.mo91780b() == enumC45479n56 ? C26160mf.m25224f(100) : C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25224f;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$g */
    /* loaded from: classes.dex */
    public static final class C28810g extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC45479n56 f110916g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f110917h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f110918i;

        /* renamed from: j */
        public final /* synthetic */ boolean f110919j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48104rX2 f110920k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC48209ri0 f110921l;

        /* renamed from: m */
        public final /* synthetic */ int f110922m;

        /* renamed from: n */
        public final /* synthetic */ int f110923n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28810g(EnumC45479n56 enumC45479n56, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC48209ri0 interfaceC48209ri0, int i, int i2) {
            super(2);
            this.f110916g = enumC45479n56;
            this.f110917h = function0;
            this.f110918i = interfaceC41563gV2;
            this.f110919j = z;
            this.f110920k = interfaceC48104rX2;
            this.f110921l = interfaceC48209ri0;
            this.f110922m = i;
            this.f110923n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C49394ti0.m11895h(this.f110916g, this.f110917h, this.f110918i, this.f110919j, this.f110920k, this.f110921l, interfaceC32720Et0, C47127ps4.m18626a(this.f110922m | 1), this.f110923n);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ti0$h */
    /* loaded from: classes.dex */
    public /* synthetic */ class C28811h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC45479n56.values().length];
            try {
                iArr[EnumC45479n56.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC45479n56.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC45479n56.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 2;
        f110889b = C43705k61.m29303g(f);
        f110891d = C43705k61.m29303g(f);
        f110892e = C43705k61.m29303g(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11902a(boolean z, Function1<? super Boolean, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC48209ri0 interfaceC48209ri0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        Object obj2;
        int i10;
        Object obj3;
        Object obj4;
        boolean z4;
        InterfaceC48104rX2 interfaceC48104rX22;
        int i11;
        InterfaceC48209ri0 m13807a;
        Function0 function0;
        InterfaceC48209ri0 interfaceC48209ri02;
        boolean z5;
        int i12;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2118660998);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            i7 = i2 & 8;
            if (i7 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                if (mo89518u.mo89536o(z3)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                i9 = i2 & 16;
                if (i9 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj2 = interfaceC48104rX2;
                    if (mo89518u.mo89539n(obj2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                    if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = interfaceC48209ri0;
                            if (mo89518u.mo89539n(obj3)) {
                                i12 = DateUtils.FORMAT_NUMERIC_DATE;
                                i3 |= i12;
                            }
                        } else {
                            obj3 = interfaceC48209ri0;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        obj3 = interfaceC48209ri0;
                    }
                    if ((374491 & i3) != 74898 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        obj4 = obj;
                        z5 = z3;
                        interfaceC48104rX22 = obj2;
                        interfaceC48209ri02 = obj3;
                    } else {
                        mo89518u.mo89626J();
                        if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i11 = i3;
                            obj4 = obj;
                            z4 = z3;
                            interfaceC48104rX22 = obj2;
                        } else {
                            if (i13 == 0) {
                                obj4 = InterfaceC41563gV2.f82354b0;
                            } else {
                                obj4 = obj;
                            }
                            if (i7 == 0) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            if (i9 == 0) {
                                mo89518u.mo89638F(-492369756);
                                Object mo89635G = mo89518u.mo89635G();
                                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G = C40741f62.m42091a();
                                    mo89518u.mo89503z(mo89635G);
                                }
                                mo89518u.mo89605Q();
                                interfaceC48104rX22 = (InterfaceC48104rX2) mo89635G;
                            } else {
                                interfaceC48104rX22 = obj2;
                            }
                            if ((i2 & 32) == 0) {
                                i11 = i3 & (-458753);
                                m13807a = C48801si0.f109138a.m13807a(0L, 0L, 0L, 0L, 0L, mo89518u, ImageMetadata.EDGE_MODE, 31);
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-2118660998, i11, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                                }
                                EnumC45479n56 m21801a = C46072o56.m21801a(z);
                                mo89518u.mo89638F(1433125990);
                                if (function1 == null) {
                                    Boolean valueOf = Boolean.valueOf(z);
                                    mo89518u.mo89638F(511388516);
                                    boolean mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(function1);
                                    Object mo89635G2 = mo89518u.mo89635G();
                                    if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G2 = new C28804a(function1, z);
                                        mo89518u.mo89503z(mo89635G2);
                                    }
                                    mo89518u.mo89605Q();
                                    function0 = (Function0) mo89635G2;
                                } else {
                                    function0 = null;
                                }
                                mo89518u.mo89605Q();
                                m11895h(m21801a, function0, obj4, z4, interfaceC48104rX22, m13807a, mo89518u, (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                boolean z6 = z4;
                                interfaceC48209ri02 = m13807a;
                                z5 = z6;
                            } else {
                                i11 = i3;
                            }
                        }
                        m13807a = obj3;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        EnumC45479n56 m21801a2 = C46072o56.m21801a(z);
                        mo89518u.mo89638F(1433125990);
                        if (function1 == null) {
                        }
                        mo89518u.mo89605Q();
                        m11895h(m21801a2, function0, obj4, z4, interfaceC48104rX22, m13807a, mo89518u, (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                        if (C35528Qt0.m87827O()) {
                        }
                        boolean z62 = z4;
                        interfaceC48209ri02 = m13807a;
                        z5 = z62;
                    }
                    InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                        mo89512w.mo20405a(new C28805b(z, function1, obj4, z5, interfaceC48104rX22, interfaceC48209ri02, i, i2));
                        return;
                    }
                    return;
                }
                obj2 = interfaceC48104rX2;
                if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
                }
                if ((374491 & i3) != 74898) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i13 == 0) {
                }
                if (i7 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
            z3 = z2;
            i9 = i2 & 16;
            if (i9 != 0) {
            }
            obj2 = interfaceC48104rX2;
            if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
            }
            if ((374491 & i3) != 74898) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i13 == 0) {
            }
            if (i7 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
        }
        obj = interfaceC41563gV2;
        i7 = i2 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i9 = i2 & 16;
        if (i9 != 0) {
        }
        obj2 = interfaceC48104rX2;
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
        }
        if ((374491 & i3) != 74898) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i13 == 0) {
        }
        if (i7 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0270 A[LOOP:0: B:111:0x026e->B:112:0x0270, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c0  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11901b(boolean z, EnumC45479n56 enumC45479n56, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48209ri0 interfaceC48209ri0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        Object mo89635G;
        boolean z2;
        int i8;
        Object mo89635G2;
        int i9;
        int i10;
        int i11;
        int i12;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2118895727);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(enumC45479n56)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(interfaceC48209ri0)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        int i13 = i2;
        if ((i13 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2118895727, i13, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)");
            }
            int i14 = i13 >> 3;
            int i15 = i14 & 14;
            F96 m101071e = J96.m101071e(enumC45479n56, null, mo89518u, i15, 2);
            C28809f c28809f = C28809f.f110915g;
            mo89518u.mo89638F(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            InterfaceC51108wb6<Float, C28366sf> m76516i = C37082Xj6.m76516i(floatCompanionObject);
            mo89518u.mo89638F(-142660079);
            EnumC45479n56 enumC45479n562 = (EnumC45479n56) m101071e.m107535g();
            mo89518u.mo89638F(-1798345588);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int[] iArr = C28811h.$EnumSwitchMapping$0;
            int i16 = iArr[enumC45479n562.ordinal()];
            float f4 = 0.0f;
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    f = 0.0f;
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    mo89518u.mo89605Q();
                    Float valueOf = Float.valueOf(f);
                    EnumC45479n56 enumC45479n563 = (EnumC45479n56) m101071e.m107529m();
                    mo89518u.mo89638F(-1798345588);
                    if (!C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
                    }
                    i3 = iArr[enumC45479n563.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            f2 = 0.0f;
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            mo89518u.mo89605Q();
                            InterfaceC48627sP5 m101073c = J96.m101073c(m101071e, valueOf, Float.valueOf(f2), c28809f.invoke((C28809f) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "FloatAnimation", mo89518u, 0);
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            C28808e c28808e = C28808e.f110914g;
                            mo89518u.mo89638F(-1338768149);
                            InterfaceC51108wb6<Float, C28366sf> m76516i2 = C37082Xj6.m76516i(floatCompanionObject);
                            mo89518u.mo89638F(-142660079);
                            EnumC45479n56 enumC45479n564 = (EnumC45479n56) m101071e.m107535g();
                            mo89518u.mo89638F(-2098942571);
                            if (C35528Qt0.m87827O()) {
                                i4 = -1;
                                C35528Qt0.m87816Z(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                            } else {
                                i4 = -1;
                            }
                            i5 = iArr[enumC45479n564.ordinal()];
                            if (i5 == 1 && i5 != 2) {
                                if (i5 == 3) {
                                    f3 = 1.0f;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                f3 = 0.0f;
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            mo89518u.mo89605Q();
                            Float valueOf2 = Float.valueOf(f3);
                            EnumC45479n56 enumC45479n565 = (EnumC45479n56) m101071e.m107529m();
                            mo89518u.mo89638F(-2098942571);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-2098942571, 0, i4, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                            }
                            i6 = iArr[enumC45479n565.ordinal()];
                            if (i6 != 1) {
                                i7 = 2;
                                if (i6 != 2) {
                                    if (i6 == 3) {
                                        f4 = 1.0f;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else {
                                i7 = 2;
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            mo89518u.mo89605Q();
                            int i17 = i7;
                            InterfaceC48627sP5 m101073c2 = J96.m101073c(m101071e, valueOf2, Float.valueOf(f4), c28808e.invoke((C28808e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i2, "FloatAnimation", mo89518u, 0);
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                mo89635G = new C45244mi0(null, null, null, 7, null);
                                mo89518u.mo89503z(mo89635G);
                            }
                            mo89518u.mo89605Q();
                            C45244mi0 c45244mi0 = (C45244mi0) mo89635G;
                            InterfaceC48627sP5<C47063pm0> mo15559a = interfaceC48209ri0.mo15559a(enumC45479n56, mo89518u, i15 | ((i13 >> 6) & 112));
                            int i18 = (i14 & 896) | (i13 & 14) | (i13 & 112);
                            InterfaceC48627sP5<C47063pm0> mo15557c = interfaceC48209ri0.mo15557c(z, enumC45479n56, mo89518u, i18);
                            InterfaceC48627sP5<C47063pm0> mo15558b = interfaceC48209ri0.mo15558b(z, enumC45479n56, mo89518u, i18);
                            InterfaceC41563gV2 m114250s = BB5.m114250s(BB5.m114269E(interfaceC41563gV2, InterfaceC4360K9.f19170a.m99141e(), false, i17, null), f110890c);
                            Object[] objArr = new Object[6];
                            objArr[0] = mo15557c;
                            objArr[1] = mo15558b;
                            objArr[i17] = mo15559a;
                            objArr[3] = m101073c;
                            objArr[4] = m101073c2;
                            objArr[5] = c45244mi0;
                            mo89518u.mo89638F(-568225417);
                            z2 = false;
                            for (i8 = 0; i8 < 6; i8++) {
                                z2 |= mo89518u.mo89539n(objArr[i8]);
                            }
                            mo89635G2 = mo89518u.mo89635G();
                            if (!z2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                                mo89635G2 = new C28806c(c45244mi0, mo15557c, mo15558b, mo15559a, m101073c, m101073c2);
                                mo89518u.mo89503z(mo89635G2);
                            }
                            mo89518u.mo89605Q();
                            C48169re0.m15656a(m114250s, (Function1) mo89635G2, mo89518u, 0);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                        }
                    }
                    f2 = 1.0f;
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    InterfaceC48627sP5 m101073c3 = J96.m101073c(m101071e, valueOf, Float.valueOf(f2), c28809f.invoke((C28809f) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "FloatAnimation", mo89518u, 0);
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    C28808e c28808e2 = C28808e.f110914g;
                    mo89518u.mo89638F(-1338768149);
                    InterfaceC51108wb6<Float, C28366sf> m76516i22 = C37082Xj6.m76516i(floatCompanionObject);
                    mo89518u.mo89638F(-142660079);
                    EnumC45479n56 enumC45479n5642 = (EnumC45479n56) m101071e.m107535g();
                    mo89518u.mo89638F(-2098942571);
                    if (C35528Qt0.m87827O()) {
                    }
                    i5 = iArr[enumC45479n5642.ordinal()];
                    if (i5 == 1) {
                    }
                    f3 = 0.0f;
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    Float valueOf22 = Float.valueOf(f3);
                    EnumC45479n56 enumC45479n5652 = (EnumC45479n56) m101071e.m107529m();
                    mo89518u.mo89638F(-2098942571);
                    if (C35528Qt0.m87827O()) {
                    }
                    i6 = iArr[enumC45479n5652.ordinal()];
                    if (i6 != 1) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    int i172 = i7;
                    InterfaceC48627sP5 m101073c22 = J96.m101073c(m101071e, valueOf22, Float.valueOf(f4), c28808e2.invoke((C28808e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i22, "FloatAnimation", mo89518u, 0);
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    C45244mi0 c45244mi02 = (C45244mi0) mo89635G;
                    InterfaceC48627sP5<C47063pm0> mo15559a2 = interfaceC48209ri0.mo15559a(enumC45479n56, mo89518u, i15 | ((i13 >> 6) & 112));
                    int i182 = (i14 & 896) | (i13 & 14) | (i13 & 112);
                    InterfaceC48627sP5<C47063pm0> mo15557c2 = interfaceC48209ri0.mo15557c(z, enumC45479n56, mo89518u, i182);
                    InterfaceC48627sP5<C47063pm0> mo15558b2 = interfaceC48209ri0.mo15558b(z, enumC45479n56, mo89518u, i182);
                    InterfaceC41563gV2 m114250s2 = BB5.m114250s(BB5.m114269E(interfaceC41563gV2, InterfaceC4360K9.f19170a.m99141e(), false, i172, null), f110890c);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = mo15557c2;
                    objArr2[1] = mo15558b2;
                    objArr2[i172] = mo15559a2;
                    objArr2[3] = m101073c3;
                    objArr2[4] = m101073c22;
                    objArr2[5] = c45244mi02;
                    mo89518u.mo89638F(-568225417);
                    z2 = false;
                    while (i8 < 6) {
                    }
                    mo89635G2 = mo89518u.mo89635G();
                    if (!z2) {
                    }
                    mo89635G2 = new C28806c(c45244mi02, mo15557c2, mo15558b2, mo15559a2, m101073c3, m101073c22);
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    C48169re0.m15656a(m114250s2, (Function1) mo89635G2, mo89518u, 0);
                    if (C35528Qt0.m87827O()) {
                    }
                }
            }
            f = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            Float valueOf3 = Float.valueOf(f);
            EnumC45479n56 enumC45479n5632 = (EnumC45479n56) m101071e.m107529m();
            mo89518u.mo89638F(-1798345588);
            if (!C35528Qt0.m87827O()) {
            }
            i3 = iArr[enumC45479n5632.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            InterfaceC48627sP5 m101073c32 = J96.m101073c(m101071e, valueOf3, Float.valueOf(f2), c28809f.invoke((C28809f) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "FloatAnimation", mo89518u, 0);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            C28808e c28808e22 = C28808e.f110914g;
            mo89518u.mo89638F(-1338768149);
            InterfaceC51108wb6<Float, C28366sf> m76516i222 = C37082Xj6.m76516i(floatCompanionObject);
            mo89518u.mo89638F(-142660079);
            EnumC45479n56 enumC45479n56422 = (EnumC45479n56) m101071e.m107535g();
            mo89518u.mo89638F(-2098942571);
            if (C35528Qt0.m87827O()) {
            }
            i5 = iArr[enumC45479n56422.ordinal()];
            if (i5 == 1) {
            }
            f3 = 0.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            Float valueOf222 = Float.valueOf(f3);
            EnumC45479n56 enumC45479n56522 = (EnumC45479n56) m101071e.m107529m();
            mo89518u.mo89638F(-2098942571);
            if (C35528Qt0.m87827O()) {
            }
            i6 = iArr[enumC45479n56522.ordinal()];
            if (i6 != 1) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            int i1722 = i7;
            InterfaceC48627sP5 m101073c222 = J96.m101073c(m101071e, valueOf222, Float.valueOf(f4), c28808e22.invoke((C28808e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i222, "FloatAnimation", mo89518u, 0);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C45244mi0 c45244mi022 = (C45244mi0) mo89635G;
            InterfaceC48627sP5<C47063pm0> mo15559a22 = interfaceC48209ri0.mo15559a(enumC45479n56, mo89518u, i15 | ((i13 >> 6) & 112));
            int i1822 = (i14 & 896) | (i13 & 14) | (i13 & 112);
            InterfaceC48627sP5<C47063pm0> mo15557c22 = interfaceC48209ri0.mo15557c(z, enumC45479n56, mo89518u, i1822);
            InterfaceC48627sP5<C47063pm0> mo15558b22 = interfaceC48209ri0.mo15558b(z, enumC45479n56, mo89518u, i1822);
            InterfaceC41563gV2 m114250s22 = BB5.m114250s(BB5.m114269E(interfaceC41563gV2, InterfaceC4360K9.f19170a.m99141e(), false, i1722, null), f110890c);
            Object[] objArr22 = new Object[6];
            objArr22[0] = mo15557c22;
            objArr22[1] = mo15558b22;
            objArr22[i1722] = mo15559a22;
            objArr22[3] = m101073c32;
            objArr22[4] = m101073c222;
            objArr22[5] = c45244mi022;
            mo89518u.mo89638F(-568225417);
            z2 = false;
            while (i8 < 6) {
            }
            mo89635G2 = mo89518u.mo89635G();
            if (!z2) {
            }
            mo89635G2 = new C28806c(c45244mi022, mo15557c22, mo15558b22, mo15559a22, m101073c32, m101073c222);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            C48169re0.m15656a(m114250s22, (Function1) mo89635G2, mo89518u, 0);
            if (C35528Qt0.m87827O()) {
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C28807d(z, enumC45479n56, interfaceC41563gV2, interfaceC48209ri0, i));
        }
    }

    /* renamed from: c */
    public static final long m11900c(InterfaceC48627sP5<C47063pm0> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m18733w();
    }

    /* renamed from: d */
    public static final float m11899d(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: e */
    public static final float m11898e(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: f */
    public static final long m11897f(InterfaceC48627sP5<C47063pm0> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m18733w();
    }

    /* renamed from: g */
    public static final long m11896g(InterfaceC48627sP5<C47063pm0> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m18733w();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11895h(EnumC45479n56 state, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC48209ri0 interfaceC48209ri0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        Object obj2;
        int i10;
        Object obj3;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z3;
        InterfaceC48104rX2 interfaceC48104rX22;
        InterfaceC41563gV2 interfaceC41563gV23;
        boolean z4;
        Object obj4;
        InterfaceC48209ri0 interfaceC48209ri02;
        int i11;
        int i12;
        InterfaceC41563gV2 interfaceC41563gV24;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV25;
        InterfaceC41563gV2 interfaceC41563gV26;
        boolean z5;
        InterfaceC48104rX2 interfaceC48104rX23;
        InterfaceC48209ri0 interfaceC48209ri03;
        InterfaceC36874Wm5 mo89512w;
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2031255194);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(state)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            i7 = i2 & 8;
            if (i7 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                if (mo89518u.mo89536o(z2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                i9 = i2 & 16;
                if (i9 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = interfaceC48104rX2;
                    if (mo89518u.mo89539n(obj2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = interfaceC48209ri0;
                            if (mo89518u.mo89539n(obj3)) {
                                i13 = DateUtils.FORMAT_NUMERIC_DATE;
                                i3 |= i13;
                            }
                        } else {
                            obj3 = interfaceC48209ri0;
                        }
                        i13 = 65536;
                        i3 |= i13;
                    } else {
                        obj3 = interfaceC48209ri0;
                    }
                    if ((374491 & i3) != 74898 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        z5 = z2;
                        interfaceC32720Et02 = mo89518u;
                        interfaceC48104rX23 = obj2;
                        interfaceC48209ri03 = obj3;
                    } else {
                        mo89518u.mo89626J();
                        if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i11 = i3;
                            z4 = z2;
                            obj4 = obj2;
                            interfaceC48209ri02 = obj3;
                            interfaceC41563gV23 = obj;
                        } else {
                            if (i14 == 0) {
                                interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                            } else {
                                interfaceC41563gV22 = obj;
                            }
                            if (i7 == 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i9 == 0) {
                                mo89518u.mo89638F(-492369756);
                                Object mo89635G = mo89518u.mo89635G();
                                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G = C40741f62.m42091a();
                                    mo89518u.mo89503z(mo89635G);
                                }
                                mo89518u.mo89605Q();
                                interfaceC48104rX22 = (InterfaceC48104rX2) mo89635G;
                            } else {
                                interfaceC48104rX22 = obj2;
                            }
                            if ((i2 & 32) == 0) {
                                z4 = z3;
                                obj4 = interfaceC48104rX22;
                                interfaceC48209ri02 = C48801si0.f109138a.m13807a(0L, 0L, 0L, 0L, 0L, mo89518u, ImageMetadata.EDGE_MODE, 31);
                                i11 = i3 & (-458753);
                                interfaceC41563gV23 = interfaceC41563gV22;
                            } else {
                                interfaceC41563gV23 = interfaceC41563gV22;
                                z4 = z3;
                                obj4 = interfaceC48104rX22;
                                interfaceC48209ri02 = obj3;
                                i11 = i3;
                            }
                        }
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(2031255194, i11, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                        }
                        mo89518u.mo89638F(-1517549514);
                        if (function0 == null) {
                            InterfaceC48104rX2 interfaceC48104rX24 = obj4;
                            i12 = i11;
                            boolean z6 = z4;
                            interfaceC41563gV24 = interfaceC41563gV23;
                            interfaceC32720Et02 = mo89518u;
                            interfaceC41563gV25 = C44886m56.m26355c(InterfaceC41563gV2.f82354b0, state, interfaceC48104rX24, C51107wb5.m6605e(false, f110888a, 0L, mo89518u, 54, 4), z6, C32095Cb5.m112073h(C32095Cb5.f4306b.m112065b()), function0);
                        } else {
                            i12 = i11;
                            interfaceC41563gV24 = interfaceC41563gV23;
                            interfaceC32720Et02 = mo89518u;
                            interfaceC41563gV25 = InterfaceC41563gV2.f82354b0;
                        }
                        interfaceC32720Et02.mo89605Q();
                        if (function0 == null) {
                            interfaceC41563gV26 = C41334g62.m40069c(InterfaceC41563gV2.f82354b0);
                        } else {
                            interfaceC41563gV26 = InterfaceC41563gV2.f82354b0;
                        }
                        m11901b(z4, state, ND3.m94184i(interfaceC41563gV24.mo39266t0(interfaceC41563gV26).mo39266t0(interfaceC41563gV25), f110889b), interfaceC48209ri02, interfaceC32720Et02, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & 7168));
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        obj = interfaceC41563gV24;
                        z5 = z4;
                        interfaceC48104rX23 = obj4;
                        interfaceC48209ri03 = interfaceC48209ri02;
                    }
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new C28810g(state, function0, obj, z5, interfaceC48104rX23, interfaceC48209ri03, i, i2));
                        return;
                    }
                    return;
                }
                obj2 = interfaceC48104rX2;
                if ((458752 & i) != 0) {
                }
                if ((374491 & i3) != 74898) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i14 == 0) {
                }
                if (i7 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(-1517549514);
                if (function0 == null) {
                }
                interfaceC32720Et02.mo89605Q();
                if (function0 == null) {
                }
                m11901b(z4, state, ND3.m94184i(interfaceC41563gV24.mo39266t0(interfaceC41563gV26).mo39266t0(interfaceC41563gV25), f110889b), interfaceC48209ri02, interfaceC32720Et02, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & 7168));
                if (C35528Qt0.m87827O()) {
                }
                obj = interfaceC41563gV24;
                z5 = z4;
                interfaceC48104rX23 = obj4;
                interfaceC48209ri03 = interfaceC48209ri02;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            z2 = z;
            i9 = i2 & 16;
            if (i9 != 0) {
            }
            obj2 = interfaceC48104rX2;
            if ((458752 & i) != 0) {
            }
            if ((374491 & i3) != 74898) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i14 == 0) {
            }
            if (i7 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(-1517549514);
            if (function0 == null) {
            }
            interfaceC32720Et02.mo89605Q();
            if (function0 == null) {
            }
            m11901b(z4, state, ND3.m94184i(interfaceC41563gV24.mo39266t0(interfaceC41563gV26).mo39266t0(interfaceC41563gV25), f110889b), interfaceC48209ri02, interfaceC32720Et02, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & 7168));
            if (C35528Qt0.m87827O()) {
            }
            obj = interfaceC41563gV24;
            z5 = z4;
            interfaceC48104rX23 = obj4;
            interfaceC48209ri03 = interfaceC48209ri02;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        i7 = i2 & 8;
        if (i7 == 0) {
        }
        z2 = z;
        i9 = i2 & 16;
        if (i9 != 0) {
        }
        obj2 = interfaceC48104rX2;
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) != 74898) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if (i7 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-1517549514);
        if (function0 == null) {
        }
        interfaceC32720Et02.mo89605Q();
        if (function0 == null) {
        }
        m11901b(z4, state, ND3.m94184i(interfaceC41563gV24.mo39266t0(interfaceC41563gV26).mo39266t0(interfaceC41563gV25), f110889b), interfaceC48209ri02, interfaceC32720Et02, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & 7168));
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV24;
        z5 = z4;
        interfaceC48104rX23 = obj4;
        interfaceC48209ri03 = interfaceC48209ri02;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: s */
    public static final void m11884s(I61 i61, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        KS5 ks5 = new KS5(f2, 0.0f, 0, 0, null, 30, null);
        float m5730i = C51465xB5.m5730i(i61.mo96360h());
        if (C47063pm0.m18741o(j, j2)) {
            I61.m102947e0(i61, j, 0L, CB5.m112663a(m5730i, m5730i), MC0.m95598b(f, 0.0f, 2, null), C52982zl1.f122162a, 0.0f, null, 0, 226, null);
            return;
        }
        float f4 = m5730i - (2 * f2);
        I61.m102947e0(i61, j, C33056Ge3.m104938a(f2, f2), CB5.m112663a(f4, f4), MC0.m95598b(Math.max(0.0f, f - f2), 0.0f, 2, null), C52982zl1.f122162a, 0.0f, null, 0, 224, null);
        float f5 = m5730i - f2;
        I61.m102947e0(i61, j2, C33056Ge3.m104938a(f3, f3), CB5.m112663a(f5, f5), MC0.m95598b(f - f3, 0.0f, 2, null), ks5, 0.0f, null, 0, 224, null);
    }

    /* renamed from: t */
    public static final void m11883t(I61 i61, long j, float f, float f2, float f3, C45244mi0 c45244mi0) {
        KS5 ks5 = new KS5(f3, 0.0f, LS5.f21441b.m96918c(), 0, null, 26, null);
        float m5730i = C51465xB5.m5730i(i61.mo96360h());
        float m75146a = YM2.m75146a(0.4f, 0.5f, f2);
        float m75146a2 = YM2.m75146a(0.7f, 0.5f, f2);
        float m75146a3 = YM2.m75146a(0.5f, 0.5f, f2);
        float m75146a4 = YM2.m75146a(0.3f, 0.5f, f2);
        c45244mi0.m25158a().reset();
        c45244mi0.m25158a().mo20781j(0.2f * m5730i, m75146a3 * m5730i);
        c45244mi0.m25158a().mo20780k(m75146a * m5730i, m75146a2 * m5730i);
        c45244mi0.m25158a().mo20780k(0.8f * m5730i, m5730i * m75146a4);
        c45244mi0.m25157b().mo15694b(c45244mi0.m25158a(), false);
        c45244mi0.m25156c().reset();
        c45244mi0.m25157b().mo15693c(0.0f, c45244mi0.m25157b().mo15695a() * f, c45244mi0.m25156c(), true);
        I61.m102956E0(i61, c45244mi0.m25156c(), j, 0.0f, ks5, null, 0, 52, null);
    }
}
