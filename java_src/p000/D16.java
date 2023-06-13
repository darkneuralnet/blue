package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.F96;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J«\u0001\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\n\u001a\u00020\t2`\u0010\u0014\u001a\\\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LD16;", "", "Lo32;", "inputState", "Lpm0;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "", "content", C17296a.f69688o, "(Lo32;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;LEt0;I)V", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,374:1\n934#2:375\n852#2,5:376\n934#2:381\n852#2,5:382\n852#2,5:398\n852#2,5:414\n69#3,2:387\n71#3:393\n74#3:397\n69#3,2:403\n71#3:409\n74#3:413\n36#4:389\n36#4:405\n1057#5,3:390\n1060#5,3:394\n1057#5,3:406\n1060#5,3:410\n76#6:419\n76#6:420\n76#6:421\n76#6:422\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n279#1:375\n279#1:376,5\n290#1:381\n290#1:382,5\n318#1:398,5\n328#1:414,5\n318#1:387,2\n318#1:393\n318#1:397\n328#1:403,2\n328#1:409\n328#1:413\n318#1:389\n328#1:405\n318#1:390,3\n318#1:394,3\n328#1:406,3\n328#1:410,3\n279#1:419\n290#1:420\n318#1:421\n328#1:422\n*E\n"})
/* renamed from: D16 */
/* loaded from: classes.dex */
public final class D16 {

    /* renamed from: a */
    public static final D16 f5084a = new D16();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D16$a */
    /* loaded from: classes.dex */
    public static final class C1328a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ EnumC46048o32 f5086h;

        /* renamed from: i */
        public final /* synthetic */ long f5087i;

        /* renamed from: j */
        public final /* synthetic */ long f5088j;

        /* renamed from: k */
        public final /* synthetic */ Function3<EnumC46048o32, InterfaceC32720Et0, Integer, C47063pm0> f5089k;

        /* renamed from: l */
        public final /* synthetic */ boolean f5090l;

        /* renamed from: m */
        public final /* synthetic */ Function6<Float, C47063pm0, C47063pm0, Float, InterfaceC32720Et0, Integer, Unit> f5091m;

        /* renamed from: n */
        public final /* synthetic */ int f5092n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1328a(EnumC46048o32 enumC46048o32, long j, long j2, Function3<? super EnumC46048o32, ? super InterfaceC32720Et0, ? super Integer, C47063pm0> function3, boolean z, Function6<? super Float, ? super C47063pm0, ? super C47063pm0, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> function6, int i) {
            super(2);
            this.f5086h = enumC46048o32;
            this.f5087i = j;
            this.f5088j = j2;
            this.f5089k = function3;
            this.f5090l = z;
            this.f5091m = function6;
            this.f5092n = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            D16.this.m111038a(this.f5086h, this.f5087i, this.f5088j, this.f5089k, this.f5090l, this.f5091m, interfaceC32720Et0, C47127ps4.m18626a(this.f5092n | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D16$b */
    /* loaded from: classes.dex */
    public static final class C1329b extends Lambda implements Function3<F96.InterfaceC2189b<EnumC46048o32>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<C47063pm0>> {

        /* renamed from: g */
        public static final C1329b f5093g = new C1329b();

        public C1329b() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<C47063pm0> invoke(F96.InterfaceC2189b<EnumC46048o32> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<C47063pm0> invoke(F96.InterfaceC2189b<EnumC46048o32> animateColor, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
            interfaceC32720Et0.mo89638F(-32667848);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-32667848, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:328)");
            }
            C49330tb6 m25219k = C26160mf.m25219k(150, 0, null, 6, null);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25219k;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D16$c */
    /* loaded from: classes.dex */
    public static final class C1330c extends Lambda implements Function3<F96.InterfaceC2189b<EnumC46048o32>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public static final C1330c f5094g = new C1330c();

        public C1330c() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC46048o32> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC46048o32> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(-611722692);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-611722692, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:280)");
            }
            C49330tb6 m25219k = C26160mf.m25219k(150, 0, null, 6, null);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25219k;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D16$d */
    /* loaded from: classes.dex */
    public static final class C1331d extends Lambda implements Function3<F96.InterfaceC2189b<EnumC46048o32>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<C47063pm0>> {

        /* renamed from: g */
        public static final C1331d f5095g = new C1331d();

        public C1331d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<C47063pm0> invoke(F96.InterfaceC2189b<EnumC46048o32> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<C47063pm0> invoke(F96.InterfaceC2189b<EnumC46048o32> animateColor, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
            interfaceC32720Et0.mo89638F(-130058045);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-130058045, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:318)");
            }
            C49330tb6 m25219k = C26160mf.m25219k(150, 0, null, 6, null);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25219k;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D16$e */
    /* loaded from: classes.dex */
    public static final class C1332e extends Lambda implements Function3<F96.InterfaceC2189b<EnumC46048o32>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public static final C1332e f5096g = new C1332e();

        public C1332e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC46048o32> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC46048o32> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC49435tm1<Float> m25220j;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(-1079955085);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1079955085, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:291)");
            }
            EnumC46048o32 enumC46048o32 = EnumC46048o32.Focused;
            EnumC46048o32 enumC46048o322 = EnumC46048o32.UnfocusedEmpty;
            if (animateFloat.m107505a(enumC46048o32, enumC46048o322)) {
                m25220j = C26160mf.m25219k(67, 0, C42549i91.m34394c(), 2, null);
            } else if (!animateFloat.m107505a(enumC46048o322, enumC46048o32) && !animateFloat.m107505a(EnumC46048o32.UnfocusedNotEmpty, enumC46048o322)) {
                m25220j = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
            } else {
                m25220j = C26160mf.m25220j(83, 67, C42549i91.m34394c());
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25220j;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D16$f */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1333f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC46048o32.values().length];
            try {
                iArr[EnumC46048o32.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC46048o32.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC46048o32.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private D16() {
    }

    /* renamed from: b */
    public static final float m111037b(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: c */
    public static final float m111036c(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: d */
    public static final long m111035d(InterfaceC48627sP5<C47063pm0> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m18733w();
    }

    /* renamed from: e */
    public static final long m111034e(InterfaceC48627sP5<C47063pm0> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m18733w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c2, code lost:
        if (r32 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ff, code lost:
        if (r32 != false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m111038a(EnumC46048o32 inputState, long j, long j2, Function3<? super EnumC46048o32, ? super InterfaceC32720Et0, ? super Integer, C47063pm0> contentColor, boolean z, Function6<? super Float, ? super C47063pm0, ? super C47063pm0, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        float f2;
        int i5;
        float f3;
        int i6;
        EnumC46048o32 enumC46048o32;
        long j3;
        boolean mo89539n;
        InterfaceC51108wb6<C47063pm0, C29275uf> mo89635G;
        EnumC46048o32 enumC46048o322;
        long j4;
        EnumC46048o32 enumC46048o323;
        long j5;
        boolean mo89539n2;
        InterfaceC51108wb6<C47063pm0, C29275uf> mo89635G2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1988729962);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(inputState)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89524s(j)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89524s(j2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89629I(contentColor)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 57344) == 0) {
            if (mo89518u.mo89536o(z)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            if (mo89518u.mo89629I(content)) {
                i7 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((374491 & i2) == 74898 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1988729962, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:260)");
            }
            F96 m101071e = J96.m101071e(inputState, "TextFieldInputState", mo89518u, (i2 & 14) | 48, 0);
            C1330c c1330c = C1330c.f5094g;
            mo89518u.mo89638F(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            InterfaceC51108wb6<Float, C28366sf> m76516i = C37082Xj6.m76516i(floatCompanionObject);
            mo89518u.mo89638F(-142660079);
            EnumC46048o32 enumC46048o324 = (EnumC46048o32) m101071e.m107535g();
            mo89518u.mo89638F(-1158004136);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:281)");
            }
            int[] iArr = C1333f.$EnumSwitchMapping$0;
            int i13 = iArr[enumC46048o324.ordinal()];
            float f4 = 0.0f;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    f = 0.0f;
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    mo89518u.mo89605Q();
                    Float valueOf = Float.valueOf(f);
                    EnumC46048o32 enumC46048o325 = (EnumC46048o32) m101071e.m107529m();
                    mo89518u.mo89638F(-1158004136);
                    if (!C35528Qt0.m87827O()) {
                        i3 = -1;
                        C35528Qt0.m87816Z(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:281)");
                    } else {
                        i3 = -1;
                    }
                    i4 = iArr[enumC46048o325.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            f2 = 0.0f;
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            mo89518u.mo89605Q();
                            InterfaceC48627sP5 m101073c = J96.m101073c(m101071e, valueOf, Float.valueOf(f2), c1330c.invoke((C1330c) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "LabelProgress", mo89518u, ImageMetadata.EDGE_MODE);
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            C1332e c1332e = C1332e.f5096g;
                            mo89518u.mo89638F(-1338768149);
                            InterfaceC51108wb6<Float, C28366sf> m76516i2 = C37082Xj6.m76516i(floatCompanionObject);
                            mo89518u.mo89638F(-142660079);
                            EnumC46048o32 enumC46048o326 = (EnumC46048o32) m101071e.m107535g();
                            mo89518u.mo89638F(-1376159017);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-1376159017, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:309)");
                            }
                            i5 = iArr[enumC46048o326.ordinal()];
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                mo89518u.mo89605Q();
                                Float valueOf2 = Float.valueOf(f3);
                                EnumC46048o32 enumC46048o327 = (EnumC46048o32) m101071e.m107529m();
                                mo89518u.mo89638F(-1376159017);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-1376159017, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:309)");
                                }
                                i6 = iArr[enumC46048o327.ordinal()];
                                if (i6 != 1) {
                                    if (i6 != 2) {
                                        if (i6 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    mo89518u.mo89605Q();
                                    InterfaceC48627sP5 m101073c2 = J96.m101073c(m101071e, valueOf2, Float.valueOf(f4), c1332e.invoke((C1332e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i2, "PlaceholderOpacity", mo89518u, ImageMetadata.EDGE_MODE);
                                    mo89518u.mo89605Q();
                                    mo89518u.mo89605Q();
                                    C1331d c1331d = C1331d.f5095g;
                                    mo89518u.mo89638F(-1939694975);
                                    enumC46048o32 = (EnumC46048o32) m101071e.m107529m();
                                    mo89518u.mo89638F(-1490209928);
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87816Z(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)");
                                    }
                                    if (iArr[enumC46048o32.ordinal()] == 1) {
                                        j3 = j;
                                    } else {
                                        j3 = j2;
                                    }
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    mo89518u.mo89605Q();
                                    AbstractC31955Bm0 m18738r = C47063pm0.m18738r(j3);
                                    mo89518u.mo89638F(1157296644);
                                    mo89539n = mo89518u.mo89539n(m18738r);
                                    mo89635G = mo89518u.mo89635G();
                                    if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r);
                                        mo89518u.mo89503z(mo89635G);
                                    }
                                    mo89518u.mo89605Q();
                                    InterfaceC51108wb6 interfaceC51108wb6 = (InterfaceC51108wb6) mo89635G;
                                    mo89518u.mo89638F(-142660079);
                                    enumC46048o322 = (EnumC46048o32) m101071e.m107535g();
                                    mo89518u.mo89638F(-1490209928);
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87816Z(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)");
                                    }
                                    if (iArr[enumC46048o322.ordinal()] == 1) {
                                        j4 = j;
                                    } else {
                                        j4 = j2;
                                    }
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    mo89518u.mo89605Q();
                                    C47063pm0 m18747i = C47063pm0.m18747i(j4);
                                    enumC46048o323 = (EnumC46048o32) m101071e.m107529m();
                                    mo89518u.mo89638F(-1490209928);
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87816Z(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)");
                                    }
                                    if (iArr[enumC46048o323.ordinal()] == 1) {
                                        j5 = j;
                                    } else {
                                        j5 = j2;
                                    }
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    mo89518u.mo89605Q();
                                    InterfaceC48627sP5 m101073c3 = J96.m101073c(m101071e, m18747i, C47063pm0.m18747i(j5), c1331d.invoke((C1331d) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), interfaceC51108wb6, "LabelTextStyleColor", mo89518u, 229376);
                                    mo89518u.mo89605Q();
                                    mo89518u.mo89605Q();
                                    C1329b c1329b = C1329b.f5093g;
                                    int i14 = (i2 & 7168) | 384;
                                    mo89518u.mo89638F(-1939694975);
                                    AbstractC31955Bm0 m18738r2 = C47063pm0.m18738r(contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf((i14 >> 6) & 112)).m18733w());
                                    mo89518u.mo89638F(1157296644);
                                    mo89539n2 = mo89518u.mo89539n(m18738r2);
                                    mo89635G2 = mo89518u.mo89635G();
                                    if (!mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G2 = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r2);
                                        mo89518u.mo89503z(mo89635G2);
                                    }
                                    mo89518u.mo89605Q();
                                    int i15 = i14 << 3;
                                    int i16 = (i15 & 57344) | (i14 & 14) | 64 | (i15 & 896) | (i15 & 7168);
                                    mo89518u.mo89638F(-142660079);
                                    int i17 = (i16 >> 9) & 112;
                                    InterfaceC48627sP5 m101073c4 = J96.m101073c(m101071e, contentColor.invoke(m101071e.m107535g(), mo89518u, Integer.valueOf(i17)), contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf(i17)), c1329b.invoke((C1329b) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf((i16 >> 3) & 112)), (InterfaceC51108wb6) mo89635G2, "LabelContentColor", mo89518u, (i16 & 14) | ((i16 << 9) & 57344) | ((i16 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                                    mo89518u.mo89605Q();
                                    mo89518u.mo89605Q();
                                    content.invoke(Float.valueOf(m111037b(m101073c)), C47063pm0.m18747i(m111035d(m101073c3)), C47063pm0.m18747i(m111034e(m101073c4)), Float.valueOf(m111036c(m101073c2)), mo89518u, Integer.valueOf((i2 >> 3) & 57344));
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                }
                                f4 = 1.0f;
                                if (C35528Qt0.m87827O()) {
                                }
                                mo89518u.mo89605Q();
                                InterfaceC48627sP5 m101073c22 = J96.m101073c(m101071e, valueOf2, Float.valueOf(f4), c1332e.invoke((C1332e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i2, "PlaceholderOpacity", mo89518u, ImageMetadata.EDGE_MODE);
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                C1331d c1331d2 = C1331d.f5095g;
                                mo89518u.mo89638F(-1939694975);
                                enumC46048o32 = (EnumC46048o32) m101071e.m107529m();
                                mo89518u.mo89638F(-1490209928);
                                if (C35528Qt0.m87827O()) {
                                }
                                if (iArr[enumC46048o32.ordinal()] == 1) {
                                }
                                if (C35528Qt0.m87827O()) {
                                }
                                mo89518u.mo89605Q();
                                AbstractC31955Bm0 m18738r3 = C47063pm0.m18738r(j3);
                                mo89518u.mo89638F(1157296644);
                                mo89539n = mo89518u.mo89539n(m18738r3);
                                mo89635G = mo89518u.mo89635G();
                                if (!mo89539n) {
                                }
                                mo89635G = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r3);
                                mo89518u.mo89503z(mo89635G);
                                mo89518u.mo89605Q();
                                InterfaceC51108wb6 interfaceC51108wb62 = (InterfaceC51108wb6) mo89635G;
                                mo89518u.mo89638F(-142660079);
                                enumC46048o322 = (EnumC46048o32) m101071e.m107535g();
                                mo89518u.mo89638F(-1490209928);
                                if (C35528Qt0.m87827O()) {
                                }
                                if (iArr[enumC46048o322.ordinal()] == 1) {
                                }
                                if (C35528Qt0.m87827O()) {
                                }
                                mo89518u.mo89605Q();
                                C47063pm0 m18747i2 = C47063pm0.m18747i(j4);
                                enumC46048o323 = (EnumC46048o32) m101071e.m107529m();
                                mo89518u.mo89638F(-1490209928);
                                if (C35528Qt0.m87827O()) {
                                }
                                if (iArr[enumC46048o323.ordinal()] == 1) {
                                }
                                if (C35528Qt0.m87827O()) {
                                }
                                mo89518u.mo89605Q();
                                InterfaceC48627sP5 m101073c32 = J96.m101073c(m101071e, m18747i2, C47063pm0.m18747i(j5), c1331d2.invoke((C1331d) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), interfaceC51108wb62, "LabelTextStyleColor", mo89518u, 229376);
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                C1329b c1329b2 = C1329b.f5093g;
                                int i142 = (i2 & 7168) | 384;
                                mo89518u.mo89638F(-1939694975);
                                AbstractC31955Bm0 m18738r22 = C47063pm0.m18738r(contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf((i142 >> 6) & 112)).m18733w());
                                mo89518u.mo89638F(1157296644);
                                mo89539n2 = mo89518u.mo89539n(m18738r22);
                                mo89635G2 = mo89518u.mo89635G();
                                if (!mo89539n2) {
                                }
                                mo89635G2 = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r22);
                                mo89518u.mo89503z(mo89635G2);
                                mo89518u.mo89605Q();
                                int i152 = i142 << 3;
                                int i162 = (i152 & 57344) | (i142 & 14) | 64 | (i152 & 896) | (i152 & 7168);
                                mo89518u.mo89638F(-142660079);
                                int i172 = (i162 >> 9) & 112;
                                InterfaceC48627sP5 m101073c42 = J96.m101073c(m101071e, contentColor.invoke(m101071e.m107535g(), mo89518u, Integer.valueOf(i172)), contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf(i172)), c1329b2.invoke((C1329b) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf((i162 >> 3) & 112)), (InterfaceC51108wb6) mo89635G2, "LabelContentColor", mo89518u, (i162 & 14) | ((i162 << 9) & 57344) | ((i162 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                content.invoke(Float.valueOf(m111037b(m101073c)), C47063pm0.m18747i(m111035d(m101073c32)), C47063pm0.m18747i(m111034e(m101073c42)), Float.valueOf(m111036c(m101073c22)), mo89518u, Integer.valueOf((i2 >> 3) & 57344));
                                if (C35528Qt0.m87827O()) {
                                }
                            }
                            f3 = 1.0f;
                            if (C35528Qt0.m87827O()) {
                            }
                            mo89518u.mo89605Q();
                            Float valueOf22 = Float.valueOf(f3);
                            EnumC46048o32 enumC46048o3272 = (EnumC46048o32) m101071e.m107529m();
                            mo89518u.mo89638F(-1376159017);
                            if (C35528Qt0.m87827O()) {
                            }
                            i6 = iArr[enumC46048o3272.ordinal()];
                            if (i6 != 1) {
                            }
                            f4 = 1.0f;
                            if (C35528Qt0.m87827O()) {
                            }
                            mo89518u.mo89605Q();
                            InterfaceC48627sP5 m101073c222 = J96.m101073c(m101071e, valueOf22, Float.valueOf(f4), c1332e.invoke((C1332e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i2, "PlaceholderOpacity", mo89518u, ImageMetadata.EDGE_MODE);
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            C1331d c1331d22 = C1331d.f5095g;
                            mo89518u.mo89638F(-1939694975);
                            enumC46048o32 = (EnumC46048o32) m101071e.m107529m();
                            mo89518u.mo89638F(-1490209928);
                            if (C35528Qt0.m87827O()) {
                            }
                            if (iArr[enumC46048o32.ordinal()] == 1) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            mo89518u.mo89605Q();
                            AbstractC31955Bm0 m18738r32 = C47063pm0.m18738r(j3);
                            mo89518u.mo89638F(1157296644);
                            mo89539n = mo89518u.mo89539n(m18738r32);
                            mo89635G = mo89518u.mo89635G();
                            if (!mo89539n) {
                            }
                            mo89635G = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r32);
                            mo89518u.mo89503z(mo89635G);
                            mo89518u.mo89605Q();
                            InterfaceC51108wb6 interfaceC51108wb622 = (InterfaceC51108wb6) mo89635G;
                            mo89518u.mo89638F(-142660079);
                            enumC46048o322 = (EnumC46048o32) m101071e.m107535g();
                            mo89518u.mo89638F(-1490209928);
                            if (C35528Qt0.m87827O()) {
                            }
                            if (iArr[enumC46048o322.ordinal()] == 1) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            mo89518u.mo89605Q();
                            C47063pm0 m18747i22 = C47063pm0.m18747i(j4);
                            enumC46048o323 = (EnumC46048o32) m101071e.m107529m();
                            mo89518u.mo89638F(-1490209928);
                            if (C35528Qt0.m87827O()) {
                            }
                            if (iArr[enumC46048o323.ordinal()] == 1) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            mo89518u.mo89605Q();
                            InterfaceC48627sP5 m101073c322 = J96.m101073c(m101071e, m18747i22, C47063pm0.m18747i(j5), c1331d22.invoke((C1331d) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), interfaceC51108wb622, "LabelTextStyleColor", mo89518u, 229376);
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            C1329b c1329b22 = C1329b.f5093g;
                            int i1422 = (i2 & 7168) | 384;
                            mo89518u.mo89638F(-1939694975);
                            AbstractC31955Bm0 m18738r222 = C47063pm0.m18738r(contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf((i1422 >> 6) & 112)).m18733w());
                            mo89518u.mo89638F(1157296644);
                            mo89539n2 = mo89518u.mo89539n(m18738r222);
                            mo89635G2 = mo89518u.mo89635G();
                            if (!mo89539n2) {
                            }
                            mo89635G2 = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r222);
                            mo89518u.mo89503z(mo89635G2);
                            mo89518u.mo89605Q();
                            int i1522 = i1422 << 3;
                            int i1622 = (i1522 & 57344) | (i1422 & 14) | 64 | (i1522 & 896) | (i1522 & 7168);
                            mo89518u.mo89638F(-142660079);
                            int i1722 = (i1622 >> 9) & 112;
                            InterfaceC48627sP5 m101073c422 = J96.m101073c(m101071e, contentColor.invoke(m101071e.m107535g(), mo89518u, Integer.valueOf(i1722)), contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf(i1722)), c1329b22.invoke((C1329b) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf((i1622 >> 3) & 112)), (InterfaceC51108wb6) mo89635G2, "LabelContentColor", mo89518u, (i1622 & 14) | ((i1622 << 9) & 57344) | ((i1622 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            content.invoke(Float.valueOf(m111037b(m101073c)), C47063pm0.m18747i(m111035d(m101073c322)), C47063pm0.m18747i(m111034e(m101073c422)), Float.valueOf(m111036c(m101073c222)), mo89518u, Integer.valueOf((i2 >> 3) & 57344));
                            if (C35528Qt0.m87827O()) {
                            }
                        }
                    }
                    f2 = 1.0f;
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    InterfaceC48627sP5 m101073c5 = J96.m101073c(m101071e, valueOf, Float.valueOf(f2), c1330c.invoke((C1330c) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "LabelProgress", mo89518u, ImageMetadata.EDGE_MODE);
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    C1332e c1332e2 = C1332e.f5096g;
                    mo89518u.mo89638F(-1338768149);
                    InterfaceC51108wb6<Float, C28366sf> m76516i22 = C37082Xj6.m76516i(floatCompanionObject);
                    mo89518u.mo89638F(-142660079);
                    EnumC46048o32 enumC46048o3262 = (EnumC46048o32) m101071e.m107535g();
                    mo89518u.mo89638F(-1376159017);
                    if (C35528Qt0.m87827O()) {
                    }
                    i5 = iArr[enumC46048o3262.ordinal()];
                    if (i5 != 1) {
                    }
                    f3 = 1.0f;
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    Float valueOf222 = Float.valueOf(f3);
                    EnumC46048o32 enumC46048o32722 = (EnumC46048o32) m101071e.m107529m();
                    mo89518u.mo89638F(-1376159017);
                    if (C35528Qt0.m87827O()) {
                    }
                    i6 = iArr[enumC46048o32722.ordinal()];
                    if (i6 != 1) {
                    }
                    f4 = 1.0f;
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    InterfaceC48627sP5 m101073c2222 = J96.m101073c(m101071e, valueOf222, Float.valueOf(f4), c1332e2.invoke((C1332e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i22, "PlaceholderOpacity", mo89518u, ImageMetadata.EDGE_MODE);
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    C1331d c1331d222 = C1331d.f5095g;
                    mo89518u.mo89638F(-1939694975);
                    enumC46048o32 = (EnumC46048o32) m101071e.m107529m();
                    mo89518u.mo89638F(-1490209928);
                    if (C35528Qt0.m87827O()) {
                    }
                    if (iArr[enumC46048o32.ordinal()] == 1) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    AbstractC31955Bm0 m18738r322 = C47063pm0.m18738r(j3);
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(m18738r322);
                    mo89635G = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r322);
                    mo89518u.mo89503z(mo89635G);
                    mo89518u.mo89605Q();
                    InterfaceC51108wb6 interfaceC51108wb6222 = (InterfaceC51108wb6) mo89635G;
                    mo89518u.mo89638F(-142660079);
                    enumC46048o322 = (EnumC46048o32) m101071e.m107535g();
                    mo89518u.mo89638F(-1490209928);
                    if (C35528Qt0.m87827O()) {
                    }
                    if (iArr[enumC46048o322.ordinal()] == 1) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    C47063pm0 m18747i222 = C47063pm0.m18747i(j4);
                    enumC46048o323 = (EnumC46048o32) m101071e.m107529m();
                    mo89518u.mo89638F(-1490209928);
                    if (C35528Qt0.m87827O()) {
                    }
                    if (iArr[enumC46048o323.ordinal()] == 1) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89605Q();
                    InterfaceC48627sP5 m101073c3222 = J96.m101073c(m101071e, m18747i222, C47063pm0.m18747i(j5), c1331d222.invoke((C1331d) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), interfaceC51108wb6222, "LabelTextStyleColor", mo89518u, 229376);
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    C1329b c1329b222 = C1329b.f5093g;
                    int i14222 = (i2 & 7168) | 384;
                    mo89518u.mo89638F(-1939694975);
                    AbstractC31955Bm0 m18738r2222 = C47063pm0.m18738r(contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf((i14222 >> 6) & 112)).m18733w());
                    mo89518u.mo89638F(1157296644);
                    mo89539n2 = mo89518u.mo89539n(m18738r2222);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n2) {
                    }
                    mo89635G2 = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r2222);
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    int i15222 = i14222 << 3;
                    int i16222 = (i15222 & 57344) | (i14222 & 14) | 64 | (i15222 & 896) | (i15222 & 7168);
                    mo89518u.mo89638F(-142660079);
                    int i17222 = (i16222 >> 9) & 112;
                    InterfaceC48627sP5 m101073c4222 = J96.m101073c(m101071e, contentColor.invoke(m101071e.m107535g(), mo89518u, Integer.valueOf(i17222)), contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf(i17222)), c1329b222.invoke((C1329b) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf((i16222 >> 3) & 112)), (InterfaceC51108wb6) mo89635G2, "LabelContentColor", mo89518u, (i16222 & 14) | ((i16222 << 9) & 57344) | ((i16222 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    content.invoke(Float.valueOf(m111037b(m101073c5)), C47063pm0.m18747i(m111035d(m101073c3222)), C47063pm0.m18747i(m111034e(m101073c4222)), Float.valueOf(m111036c(m101073c2222)), mo89518u, Integer.valueOf((i2 >> 3) & 57344));
                    if (C35528Qt0.m87827O()) {
                    }
                }
            }
            f = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            Float valueOf3 = Float.valueOf(f);
            EnumC46048o32 enumC46048o3252 = (EnumC46048o32) m101071e.m107529m();
            mo89518u.mo89638F(-1158004136);
            if (!C35528Qt0.m87827O()) {
            }
            i4 = iArr[enumC46048o3252.ordinal()];
            if (i4 != 1) {
            }
            f2 = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            InterfaceC48627sP5 m101073c52 = J96.m101073c(m101071e, valueOf3, Float.valueOf(f2), c1330c.invoke((C1330c) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "LabelProgress", mo89518u, ImageMetadata.EDGE_MODE);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            C1332e c1332e22 = C1332e.f5096g;
            mo89518u.mo89638F(-1338768149);
            InterfaceC51108wb6<Float, C28366sf> m76516i222 = C37082Xj6.m76516i(floatCompanionObject);
            mo89518u.mo89638F(-142660079);
            EnumC46048o32 enumC46048o32622 = (EnumC46048o32) m101071e.m107535g();
            mo89518u.mo89638F(-1376159017);
            if (C35528Qt0.m87827O()) {
            }
            i5 = iArr[enumC46048o32622.ordinal()];
            if (i5 != 1) {
            }
            f3 = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            Float valueOf2222 = Float.valueOf(f3);
            EnumC46048o32 enumC46048o327222 = (EnumC46048o32) m101071e.m107529m();
            mo89518u.mo89638F(-1376159017);
            if (C35528Qt0.m87827O()) {
            }
            i6 = iArr[enumC46048o327222.ordinal()];
            if (i6 != 1) {
            }
            f4 = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            InterfaceC48627sP5 m101073c22222 = J96.m101073c(m101071e, valueOf2222, Float.valueOf(f4), c1332e22.invoke((C1332e) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i222, "PlaceholderOpacity", mo89518u, ImageMetadata.EDGE_MODE);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            C1331d c1331d2222 = C1331d.f5095g;
            mo89518u.mo89638F(-1939694975);
            enumC46048o32 = (EnumC46048o32) m101071e.m107529m();
            mo89518u.mo89638F(-1490209928);
            if (C35528Qt0.m87827O()) {
            }
            if (iArr[enumC46048o32.ordinal()] == 1) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            AbstractC31955Bm0 m18738r3222 = C47063pm0.m18738r(j3);
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(m18738r3222);
            mo89635G = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r3222);
            mo89518u.mo89503z(mo89635G);
            mo89518u.mo89605Q();
            InterfaceC51108wb6 interfaceC51108wb62222 = (InterfaceC51108wb6) mo89635G;
            mo89518u.mo89638F(-142660079);
            enumC46048o322 = (EnumC46048o32) m101071e.m107535g();
            mo89518u.mo89638F(-1490209928);
            if (C35528Qt0.m87827O()) {
            }
            if (iArr[enumC46048o322.ordinal()] == 1) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            C47063pm0 m18747i2222 = C47063pm0.m18747i(j4);
            enumC46048o323 = (EnumC46048o32) m101071e.m107529m();
            mo89518u.mo89638F(-1490209928);
            if (C35528Qt0.m87827O()) {
            }
            if (iArr[enumC46048o323.ordinal()] == 1) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89605Q();
            InterfaceC48627sP5 m101073c32222 = J96.m101073c(m101071e, m18747i2222, C47063pm0.m18747i(j5), c1331d2222.invoke((C1331d) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), interfaceC51108wb62222, "LabelTextStyleColor", mo89518u, 229376);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            C1329b c1329b2222 = C1329b.f5093g;
            int i142222 = (i2 & 7168) | 384;
            mo89518u.mo89638F(-1939694975);
            AbstractC31955Bm0 m18738r22222 = C47063pm0.m18738r(contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf((i142222 >> 6) & 112)).m18733w());
            mo89518u.mo89638F(1157296644);
            mo89539n2 = mo89518u.mo89539n(m18738r22222);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n2) {
            }
            mo89635G2 = C34061Km0.m98303d(C47063pm0.f104050b).invoke(m18738r22222);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            int i152222 = i142222 << 3;
            int i162222 = (i152222 & 57344) | (i142222 & 14) | 64 | (i152222 & 896) | (i152222 & 7168);
            mo89518u.mo89638F(-142660079);
            int i172222 = (i162222 >> 9) & 112;
            InterfaceC48627sP5 m101073c42222 = J96.m101073c(m101071e, contentColor.invoke(m101071e.m107535g(), mo89518u, Integer.valueOf(i172222)), contentColor.invoke(m101071e.m107529m(), mo89518u, Integer.valueOf(i172222)), c1329b2222.invoke((C1329b) m101071e.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf((i162222 >> 3) & 112)), (InterfaceC51108wb6) mo89635G2, "LabelContentColor", mo89518u, (i162222 & 14) | ((i162222 << 9) & 57344) | ((i162222 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            content.invoke(Float.valueOf(m111037b(m101073c52)), C47063pm0.m18747i(m111035d(m101073c32222)), C47063pm0.m18747i(m111034e(m101073c42222)), Float.valueOf(m111036c(m101073c22222)), mo89518u, Integer.valueOf((i2 >> 3) & 57344));
            if (C35528Qt0.m87827O()) {
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C1328a(inputState, j, j2, contentColor, z, content, i));
        }
    }
}
