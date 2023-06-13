package p000;

import androidx.compose.p003ui.draw.C11289a;
import androidx.compose.p003ui.layout.C11335a;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÿ\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001aõ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%\u001a¨\u0001\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010/\u001a\u00020.H\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a]\u0010;\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020)2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001aU\u0010B\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u00192\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020)2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a|\u0010P\u001a\u00020\u0003*\u00020D2\u0006\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u00192\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010I\u001a\u0004\u0018\u00010G2\u0006\u0010J\u001a\u00020G2\b\u0010K\u001a\u0004\u0018\u00010G2\b\u0010L\u001a\u0004\u0018\u00010G2\u0006\u0010M\u001a\u00020G2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010:\u001a\u00020)2\u0006\u0010O\u001a\u00020N2\u0006\u0010/\u001a\u00020.H\u0002\u001a)\u0010R\u001a\u00020\u0005*\u00020\u00052\u0006\u0010Q\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010S\"\u0017\u0010V\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010U\"\u001d\u0010Y\u001a\u00020T8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010U\u001a\u0004\bW\u0010X\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, m28432d2 = {"LF16;", "value", "Lkotlin/Function1;", "", "onValueChange", "LgV2;", "modifier", "", "enabled", "readOnly", "LG26;", "textStyle", "Lkotlin/Function0;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "LEu6;", "visualTransformation", "Lbl2;", "keyboardOptions", "LZk2;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "LrX2;", "interactionSource", "Lhy5;", "shape", "Ld16;", "colors", C17296a.f69688o, "(LF16;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZIILrX2;Lhy5;Ld16;LEt0;III)V", "b", "(LF16;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZILrX2;Lhy5;Ld16;LEt0;III)V", "textField", "leading", "trailing", "", "animationProgress", "LxB5;", "onLabelMeasured", "border", "LPD3;", "paddingValues", "c", "(LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LPD3;LEt0;II)V", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "isLabelInMiddleSection", "Lkz0;", "constraints", "density", "i", "(IIIIIZJFLPD3;)I", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "h", "(IIIIIJFLPD3;)I", "LOU3$a;", "height", "width", "LOU3;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Lpm2;", "layoutDirection", "k", "labelSize", "j", "(LgV2;JLPD3;)LgV2;", "Lk61;", "F", "OutlinedTextFieldInnerPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextFieldTopPadding", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,981:1\n76#2:982\n76#2:992\n76#2:1000\n76#2:1010\n76#2:1027\n76#2:1029\n76#2:1058\n76#2:1095\n76#2:1139\n76#2:1177\n25#3:983\n25#3:993\n25#3:1001\n25#3:1011\n83#3,3:1018\n456#3,11:1041\n460#3,13:1070\n473#3,3:1084\n460#3,13:1107\n473#3,3:1121\n460#3,13:1151\n473#3,3:1165\n460#3,13:1189\n473#3,3:1203\n467#3,3:1208\n1114#4,6:984\n1114#4,6:994\n1114#4,6:1002\n1114#4,6:1012\n1114#4,6:1021\n658#5:990\n646#5:991\n658#5:1008\n646#5:1009\n74#6:1028\n75#6,11:1030\n75#6:1057\n76#6,11:1059\n89#6:1087\n75#6:1094\n76#6,11:1096\n89#6:1124\n75#6:1138\n76#6,11:1140\n89#6:1168\n75#6:1176\n76#6,11:1178\n89#6:1206\n88#6:1211\n68#7,5:1052\n73#7:1083\n77#7:1088\n68#7,5:1089\n73#7:1120\n77#7:1125\n67#7,6:1132\n73#7:1164\n77#7:1169\n67#7,6:1170\n73#7:1202\n77#7:1207\n58#8:1126\n58#8:1129\n51#8:1212\n154#9:1127\n211#9:1128\n154#9:1130\n211#9:1131\n154#9:1213\n154#9:1214\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n*L\n140#1:982\n230#1:992\n341#1:1000\n431#1:1010\n498#1:1027\n499#1:1029\n510#1:1058\n518#1:1095\n546#1:1139\n554#1:1177\n152#1:983\n241#1:993\n353#1:1001\n442#1:1011\n490#1:1018,3\n499#1:1041,11\n510#1:1070,13\n510#1:1084,3\n518#1:1107,13\n518#1:1121,3\n546#1:1151,13\n546#1:1165,3\n554#1:1189,13\n554#1:1203,3\n499#1:1208,3\n152#1:984,6\n241#1:994,6\n353#1:1002,6\n442#1:1012,6\n490#1:1021,6\n157#1:990\n157#1:991\n358#1:1008\n358#1:1009\n499#1:1028\n499#1:1030,11\n510#1:1057\n510#1:1059,11\n510#1:1087\n518#1:1094\n518#1:1096,11\n518#1:1124\n546#1:1138\n546#1:1140,11\n546#1:1168\n554#1:1176\n554#1:1178,11\n554#1:1206\n499#1:1211\n510#1:1052,5\n510#1:1083\n510#1:1088\n518#1:1089,5\n518#1:1120\n518#1:1125\n546#1:1132,6\n546#1:1164\n546#1:1169\n554#1:1170,6\n554#1:1202\n554#1:1207\n530#1:1126\n537#1:1129\n805#1:1212\n531#1:1127\n530#1:1128\n537#1:1130\n537#1:1131\n971#1:1213\n979#1:1214\n*E\n"})
/* renamed from: Pz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35351Pz3 {

    /* renamed from: a */
    public static final float f29520a = C43705k61.m29303g(4);

    /* renamed from: b */
    public static final float f29521b = C43705k61.m29303g(8);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pz3$a */
    /* loaded from: classes.dex */
    public static final class C6604a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: A */
        public final /* synthetic */ int f29522A;

        /* renamed from: B */
        public final /* synthetic */ int f29523B;

        /* renamed from: C */
        public final /* synthetic */ int f29524C;

        /* renamed from: g */
        public final /* synthetic */ F16 f29525g;

        /* renamed from: h */
        public final /* synthetic */ Function1<F16, Unit> f29526h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f29527i;

        /* renamed from: j */
        public final /* synthetic */ boolean f29528j;

        /* renamed from: k */
        public final /* synthetic */ boolean f29529k;

        /* renamed from: l */
        public final /* synthetic */ G26 f29530l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29531m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29532n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29533o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29534p;

        /* renamed from: q */
        public final /* synthetic */ boolean f29535q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC32735Eu6 f29536r;

        /* renamed from: s */
        public final /* synthetic */ C38736bl2 f29537s;

        /* renamed from: t */
        public final /* synthetic */ C37555Zk2 f29538t;

        /* renamed from: u */
        public final /* synthetic */ boolean f29539u;

        /* renamed from: v */
        public final /* synthetic */ int f29540v;

        /* renamed from: w */
        public final /* synthetic */ int f29541w;

        /* renamed from: x */
        public final /* synthetic */ InterfaceC48104rX2 f29542x;

        /* renamed from: y */
        public final /* synthetic */ InterfaceC42444hy5 f29543y;

        /* renamed from: z */
        public final /* synthetic */ InterfaceC39510d16 f29544z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6604a(F16 f16, Function1<? super F16, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, int i2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, int i3, int i4, int i5) {
            super(2);
            this.f29525g = f16;
            this.f29526h = function1;
            this.f29527i = interfaceC41563gV2;
            this.f29528j = z;
            this.f29529k = z2;
            this.f29530l = g26;
            this.f29531m = function2;
            this.f29532n = function22;
            this.f29533o = function23;
            this.f29534p = function24;
            this.f29535q = z3;
            this.f29536r = interfaceC32735Eu6;
            this.f29537s = c38736bl2;
            this.f29538t = c37555Zk2;
            this.f29539u = z4;
            this.f29540v = i;
            this.f29541w = i2;
            this.f29542x = interfaceC48104rX2;
            this.f29543y = interfaceC42444hy5;
            this.f29544z = interfaceC39510d16;
            this.f29522A = i3;
            this.f29523B = i4;
            this.f29524C = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C35351Pz3.m89193a(this.f29525g, this.f29526h, this.f29527i, this.f29528j, this.f29529k, this.f29530l, this.f29531m, this.f29532n, this.f29533o, this.f29534p, this.f29535q, this.f29536r, this.f29537s, this.f29538t, this.f29539u, this.f29540v, this.f29541w, this.f29542x, this.f29543y, this.f29544z, interfaceC32720Et0, C47127ps4.m18626a(this.f29522A | 1), C47127ps4.m18626a(this.f29523B), this.f29524C);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pz3$b */
    /* loaded from: classes.dex */
    public static final class C6605b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: A */
        public final /* synthetic */ int f29545A;

        /* renamed from: B */
        public final /* synthetic */ int f29546B;

        /* renamed from: g */
        public final /* synthetic */ F16 f29547g;

        /* renamed from: h */
        public final /* synthetic */ Function1<F16, Unit> f29548h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f29549i;

        /* renamed from: j */
        public final /* synthetic */ boolean f29550j;

        /* renamed from: k */
        public final /* synthetic */ boolean f29551k;

        /* renamed from: l */
        public final /* synthetic */ G26 f29552l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29553m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29554n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29555o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29556p;

        /* renamed from: q */
        public final /* synthetic */ boolean f29557q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC32735Eu6 f29558r;

        /* renamed from: s */
        public final /* synthetic */ C38736bl2 f29559s;

        /* renamed from: t */
        public final /* synthetic */ C37555Zk2 f29560t;

        /* renamed from: u */
        public final /* synthetic */ boolean f29561u;

        /* renamed from: v */
        public final /* synthetic */ int f29562v;

        /* renamed from: w */
        public final /* synthetic */ InterfaceC48104rX2 f29563w;

        /* renamed from: x */
        public final /* synthetic */ InterfaceC42444hy5 f29564x;

        /* renamed from: y */
        public final /* synthetic */ InterfaceC39510d16 f29565y;

        /* renamed from: z */
        public final /* synthetic */ int f29566z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6605b(F16 f16, Function1<? super F16, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, int i2, int i3, int i4) {
            super(2);
            this.f29547g = f16;
            this.f29548h = function1;
            this.f29549i = interfaceC41563gV2;
            this.f29550j = z;
            this.f29551k = z2;
            this.f29552l = g26;
            this.f29553m = function2;
            this.f29554n = function22;
            this.f29555o = function23;
            this.f29556p = function24;
            this.f29557q = z3;
            this.f29558r = interfaceC32735Eu6;
            this.f29559s = c38736bl2;
            this.f29560t = c37555Zk2;
            this.f29561u = z4;
            this.f29562v = i;
            this.f29563w = interfaceC48104rX2;
            this.f29564x = interfaceC42444hy5;
            this.f29565y = interfaceC39510d16;
            this.f29566z = i2;
            this.f29545A = i3;
            this.f29546B = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C35351Pz3.m89192b(this.f29547g, this.f29548h, this.f29549i, this.f29550j, this.f29551k, this.f29552l, this.f29553m, this.f29554n, this.f29555o, this.f29556p, this.f29557q, this.f29558r, this.f29559s, this.f29560t, this.f29561u, this.f29562v, this.f29563w, this.f29564x, this.f29565y, interfaceC32720Et0, C47127ps4.m18626a(this.f29566z | 1), C47127ps4.m18626a(this.f29545A), this.f29546B);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pz3$c */
    /* loaded from: classes.dex */
    public static final class C6606c extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public static final C6606c f29567g = new C6606c();

        public C6606c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pz3$d */
    /* loaded from: classes.dex */
    public static final class C6607d extends Lambda implements Function3<Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F16 f29568g;

        /* renamed from: h */
        public final /* synthetic */ boolean f29569h;

        /* renamed from: i */
        public final /* synthetic */ boolean f29570i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32735Eu6 f29571j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48104rX2 f29572k;

        /* renamed from: l */
        public final /* synthetic */ boolean f29573l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29574m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29575n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29576o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29577p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC39510d16 f29578q;

        /* renamed from: r */
        public final /* synthetic */ int f29579r;

        /* renamed from: s */
        public final /* synthetic */ int f29580s;

        /* renamed from: t */
        public final /* synthetic */ InterfaceC42444hy5 f29581t;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Pz3$d$a */
        /* loaded from: classes.dex */
        public static final class C6608a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f29582g;

            /* renamed from: h */
            public final /* synthetic */ boolean f29583h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC48104rX2 f29584i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC39510d16 f29585j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC42444hy5 f29586k;

            /* renamed from: l */
            public final /* synthetic */ int f29587l;

            /* renamed from: m */
            public final /* synthetic */ int f29588m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6608a(boolean z, boolean z2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC39510d16 interfaceC39510d16, InterfaceC42444hy5 interfaceC42444hy5, int i, int i2) {
                super(2);
                this.f29582g = z;
                this.f29583h = z2;
                this.f29584i = interfaceC48104rX2;
                this.f29585j = interfaceC39510d16;
                this.f29586k = interfaceC42444hy5;
                this.f29587l = i;
                this.f29588m = i2;
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
                    C35528Qt0.m87816Z(-753611134, i, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:405)");
                }
                C41288g16 c41288g16 = C41288g16.f81350a;
                boolean z = this.f29582g;
                boolean z2 = this.f29583h;
                InterfaceC48104rX2 interfaceC48104rX2 = this.f29584i;
                InterfaceC39510d16 interfaceC39510d16 = this.f29585j;
                InterfaceC42444hy5 interfaceC42444hy5 = this.f29586k;
                int i2 = this.f29588m;
                c41288g16.m40299a(z, z2, interfaceC48104rX2, interfaceC39510d16, interfaceC42444hy5, 0.0f, 0.0f, interfaceC32720Et0, ((this.f29587l >> 9) & 14) | 12582912 | ((i2 << 3) & 112) | ((i2 >> 15) & 896) | ((i2 >> 18) & 7168) | ((i2 >> 12) & 57344), 96);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6607d(F16 f16, boolean z, boolean z2, InterfaceC32735Eu6 interfaceC32735Eu6, InterfaceC48104rX2 interfaceC48104rX2, boolean z3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, InterfaceC39510d16 interfaceC39510d16, int i, int i2, InterfaceC42444hy5 interfaceC42444hy5) {
            super(3);
            this.f29568g = f16;
            this.f29569h = z;
            this.f29570i = z2;
            this.f29571j = interfaceC32735Eu6;
            this.f29572k = interfaceC48104rX2;
            this.f29573l = z3;
            this.f29574m = function2;
            this.f29575n = function22;
            this.f29576o = function23;
            this.f29577p = function24;
            this.f29578q = interfaceC39510d16;
            this.f29579r = i;
            this.f29580s = i2;
            this.f29581t = interfaceC42444hy5;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke((Function2<? super InterfaceC32720Et0, ? super Integer, Unit>) function2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> innerTextField, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC32720Et0.mo89629I(innerTextField) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1001528775, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:391)");
            }
            C41288g16 c41288g16 = C41288g16.f81350a;
            String m108102h = this.f29568g.m108102h();
            boolean z = this.f29569h;
            boolean z2 = this.f29570i;
            InterfaceC32735Eu6 interfaceC32735Eu6 = this.f29571j;
            InterfaceC48104rX2 interfaceC48104rX2 = this.f29572k;
            boolean z3 = this.f29573l;
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f29574m;
            Function2<InterfaceC32720Et0, Integer, Unit> function22 = this.f29575n;
            Function2<InterfaceC32720Et0, Integer, Unit> function23 = this.f29576o;
            Function2<InterfaceC32720Et0, Integer, Unit> function24 = this.f29577p;
            InterfaceC39510d16 interfaceC39510d16 = this.f29578q;
            InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, -753611134, true, new C6608a(z, z3, interfaceC48104rX2, interfaceC39510d16, this.f29581t, this.f29579r, this.f29580s));
            int i3 = this.f29579r;
            int i4 = this.f29580s;
            c41288g16.m40298b(m108102h, innerTextField, z, z2, interfaceC32735Eu6, interfaceC48104rX2, z3, function2, function22, function23, function24, interfaceC39510d16, null, m29791b, interfaceC32720Et0, ((i2 << 3) & 112) | ((i3 >> 3) & 896) | ((i4 >> 3) & 7168) | ((i4 << 9) & 57344) | ((i4 >> 6) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i4 << 18) & 3670016) | ((i3 << 3) & 29360128) | ((i3 << 3) & 234881024) | ((i3 << 3) & 1879048192), ((i3 >> 27) & 14) | 27648 | ((i4 >> 24) & 112), 4096);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pz3$e */
    /* loaded from: classes.dex */
    public static final class C6609e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f29589g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29590h;

        /* renamed from: i */
        public final /* synthetic */ Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> f29591i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29592j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29593k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29594l;

        /* renamed from: m */
        public final /* synthetic */ boolean f29595m;

        /* renamed from: n */
        public final /* synthetic */ float f29596n;

        /* renamed from: o */
        public final /* synthetic */ Function1<C51465xB5, Unit> f29597o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29598p;

        /* renamed from: q */
        public final /* synthetic */ PD3 f29599q;

        /* renamed from: r */
        public final /* synthetic */ int f29600r;

        /* renamed from: s */
        public final /* synthetic */ int f29601s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6609e(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z, float f, Function1<? super C51465xB5, Unit> function1, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, PD3 pd3, int i, int i2) {
            super(2);
            this.f29589g = interfaceC41563gV2;
            this.f29590h = function2;
            this.f29591i = function3;
            this.f29592j = function22;
            this.f29593k = function23;
            this.f29594l = function24;
            this.f29595m = z;
            this.f29596n = f;
            this.f29597o = function1;
            this.f29598p = function25;
            this.f29599q = pd3;
            this.f29600r = i;
            this.f29601s = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C35351Pz3.m89191c(this.f29589g, this.f29590h, this.f29591i, this.f29592j, this.f29593k, this.f29594l, this.f29595m, this.f29596n, this.f29597o, this.f29598p, this.f29599q, interfaceC32720Et0, C47127ps4.m18626a(this.f29600r | 1), C47127ps4.m18626a(this.f29601s));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,981:1\n221#2:982\n261#2,11:983\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n*L\n963#1:982\n963#1:983,11\n*E\n"})
    /* renamed from: Pz3$f */
    /* loaded from: classes.dex */
    public static final class C6610f extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f29602g;

        /* renamed from: h */
        public final /* synthetic */ PD3 f29603h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Pz3$f$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C6611a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC47065pm2.values().length];
                try {
                    iArr[EnumC47065pm2.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6610f(long j, PD3 pd3) {
            super(1);
            this.f29602g = j;
            this.f29603h = pd3;
        }

        /* renamed from: a */
        public final void m89182a(InterfaceC42558iA0 drawWithContent) {
            float coerceAtLeast;
            float coerceAtLeast2;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            float m5730i = C51465xB5.m5730i(this.f29602g);
            if (m5730i > 0.0f) {
                float mo3411T0 = drawWithContent.mo3411T0(C35351Pz3.f29520a);
                float mo3411T02 = drawWithContent.mo3411T0(this.f29603h.mo88734b(drawWithContent.getLayoutDirection())) - mo3411T0;
                float f = 2;
                float f2 = m5730i + mo3411T02 + (mo3411T0 * f);
                EnumC47065pm2 layoutDirection = drawWithContent.getLayoutDirection();
                int[] iArr = C6611a.$EnumSwitchMapping$0;
                if (iArr[layoutDirection.ordinal()] != 1) {
                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mo3411T02, 0.0f);
                } else {
                    coerceAtLeast = C51465xB5.m5730i(drawWithContent.mo96360h()) - f2;
                }
                float f3 = coerceAtLeast;
                if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                    float m5730i2 = C51465xB5.m5730i(drawWithContent.mo96360h());
                    coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(mo3411T02, 0.0f);
                    f2 = m5730i2 - coerceAtLeast2;
                }
                float f4 = f2;
                float m5732g = C51465xB5.m5732g(this.f29602g);
                float f5 = (-m5732g) / f;
                float f6 = m5732g / f;
                int m86405a = C35681Rk0.f32493a.m86405a();
                C61 mo20750d0 = drawWithContent.mo20750d0();
                long mo20721h = mo20750d0.mo20721h();
                mo20750d0.mo20724a().mo25245v();
                mo20750d0.mo20722c().mo19028a(f3, f5, f4, f6, m86405a);
                drawWithContent.mo34387n0();
                mo20750d0.mo20724a().mo25251p();
                mo20750d0.mo20723b(mo20721h);
                return;
            }
            drawWithContent.mo34387n0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m89182a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b1, code lost:
        if (r7.mo89539n(r87) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m89193a(F16 value, Function1<? super F16, Unit> onValueChange, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, int i2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z5;
        int i20;
        G26 g262;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25;
        int i21;
        C37555Zk2 c37555Zk22;
        int i22;
        int i23;
        InterfaceC48104rX2 interfaceC48104rX22;
        G26 g263;
        InterfaceC42444hy5 interfaceC42444hy52;
        int i24;
        DefaultConstructorMarker defaultConstructorMarker;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27;
        InterfaceC32735Eu6 interfaceC32735Eu62;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function28;
        InterfaceC48104rX2 interfaceC48104rX23;
        C37555Zk2 c37555Zk23;
        C38736bl2 c38736bl22;
        boolean z6;
        int i25;
        G26 g264;
        InterfaceC42444hy5 interfaceC42444hy53;
        InterfaceC39510d16 interfaceC39510d162;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z7;
        int i26;
        boolean z8;
        long m105915j;
        InterfaceC32720Et0 interfaceC32720Et02;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function29;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function210;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function211;
        InterfaceC32735Eu6 interfaceC32735Eu63;
        C38736bl2 c38736bl23;
        C37555Zk2 c37555Zk24;
        boolean z9;
        InterfaceC48104rX2 interfaceC48104rX24;
        InterfaceC41563gV2 interfaceC41563gV23;
        InterfaceC39510d16 interfaceC39510d163;
        InterfaceC42444hy5 interfaceC42444hy54;
        boolean z10;
        G26 g265;
        boolean z11;
        boolean z12;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function212;
        int i27;
        int i28;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(237745923);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (mo89518u.mo89539n(value) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= mo89518u.mo89629I(onValueChange) ? 32 : 16;
        }
        int i29 = i5 & 4;
        if (i29 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= mo89518u.mo89539n(interfaceC41563gV2) ? 256 : 128;
            i7 = i5 & 8;
            int i30 = 2048;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= mo89518u.mo89536o(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= mo89518u.mo89536o(z2) ? 16384 : 8192;
                }
                if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i6 |= ((i5 & 32) == 0 && mo89518u.mo89539n(g26)) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= mo89518u.mo89629I(function2) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= mo89518u.mo89629I(function22) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= mo89518u.mo89629I(function23) ? 67108864 : 33554432;
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= mo89518u.mo89629I(function24) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (mo89518u.mo89536o(z3) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= mo89518u.mo89539n(interfaceC32735Eu6) ? 32 : 16;
                }
                int i31 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i31 |= 384;
                } else if ((i4 & 896) == 0) {
                    i31 |= mo89518u.mo89539n(c38736bl2) ? 256 : 128;
                    if ((i4 & 7168) == 0) {
                        if ((i5 & 8192) != 0) {
                        }
                        i30 = 1024;
                        i31 |= i30;
                    }
                    i17 = i5 & 16384;
                    if (i17 == 0) {
                        i31 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i31 |= mo89518u.mo89536o(z4) ? 16384 : 8192;
                    }
                    if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                        i31 |= ((i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0 && mo89518u.mo89527r(i)) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                    }
                    i18 = i5 & 65536;
                    if (i18 == 0) {
                        i31 |= 1572864;
                    } else if ((i4 & 3670016) == 0) {
                        i31 |= mo89518u.mo89527r(i2) ? 1048576 : 524288;
                    }
                    i19 = i5 & DateUtils.FORMAT_NUMERIC_DATE;
                    if (i19 == 0) {
                        i31 |= 12582912;
                    } else if ((i4 & 29360128) == 0) {
                        i31 |= mo89518u.mo89539n(interfaceC48104rX2) ? 8388608 : 4194304;
                    }
                    if ((i4 & 234881024) == 0) {
                        i31 |= ((i5 & DateUtils.FORMAT_ABBREV_RELATIVE) == 0 && mo89518u.mo89539n(interfaceC42444hy5)) ? 67108864 : 33554432;
                    }
                    if ((i4 & 1879048192) == 0) {
                        i31 |= ((i5 & 524288) == 0 && mo89518u.mo89539n(interfaceC39510d16)) ? 536870912 : 268435456;
                    }
                    if ((i6 & 1533916891) != 306783378 && (1533916891 & i31) == 306783378 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV23 = interfaceC41563gV2;
                        z11 = z;
                        z12 = z2;
                        g265 = g26;
                        function29 = function22;
                        function210 = function23;
                        function211 = function24;
                        z10 = z3;
                        interfaceC32735Eu63 = interfaceC32735Eu6;
                        c38736bl23 = c38736bl2;
                        c37555Zk24 = c37555Zk2;
                        z9 = z4;
                        i27 = i;
                        i28 = i2;
                        interfaceC48104rX24 = interfaceC48104rX2;
                        interfaceC42444hy54 = interfaceC42444hy5;
                        interfaceC39510d163 = interfaceC39510d16;
                        interfaceC32720Et02 = mo89518u;
                        function212 = function2;
                    } else {
                        mo89518u.mo89626J();
                        if ((i3 & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i5 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i5 & 8192) != 0) {
                                i31 &= -7169;
                            }
                            if ((32768 & i5) != 0) {
                                i31 &= -458753;
                            }
                            if ((262144 & i5) != 0) {
                                i31 &= -234881025;
                            }
                            if ((i5 & 524288) != 0) {
                                i31 &= -1879048193;
                            }
                            interfaceC41563gV22 = interfaceC41563gV2;
                            z5 = z2;
                            g264 = g26;
                            function25 = function2;
                            function28 = function22;
                            function26 = function23;
                            function27 = function24;
                            z8 = z3;
                            interfaceC32735Eu62 = interfaceC32735Eu6;
                            c38736bl22 = c38736bl2;
                            c37555Zk23 = c37555Zk2;
                            z6 = z4;
                            i22 = i;
                            i23 = i2;
                            interfaceC48104rX23 = interfaceC48104rX2;
                            interfaceC42444hy53 = interfaceC42444hy5;
                            interfaceC39510d162 = interfaceC39510d16;
                            i25 = i6;
                            i26 = i31;
                            defaultConstructorMarker = null;
                            z7 = z;
                        } else {
                            InterfaceC41563gV2 interfaceC41563gV24 = i29 == 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            boolean z13 = i7 == 0 ? true : z;
                            z5 = i8 == 0 ? false : z2;
                            if ((i5 & 32) == 0) {
                                i20 = i6 & (-458753);
                                g262 = (G26) mo89518u.mo89572c(C38909c26.m61999f());
                            } else {
                                i20 = i6;
                                g262 = g26;
                            }
                            function25 = i9 == 0 ? null : function2;
                            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function213 = i10 == 0 ? null : function22;
                            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function214 = i11 == 0 ? null : function23;
                            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function215 = i12 == 0 ? null : function24;
                            boolean z14 = i13 == 0 ? false : z3;
                            InterfaceC32735Eu6 m108216a = i15 == 0 ? InterfaceC32735Eu6.f8291a.m108216a() : interfaceC32735Eu6;
                            C38736bl2 m64037a = i16 == 0 ? C38736bl2.f58036e.m64037a() : c38736bl2;
                            if ((i5 & 8192) == 0) {
                                i21 = i31 & (-7169);
                                c37555Zk22 = new C37555Zk2(null, null, null, null, null, null, 63, null);
                            } else {
                                i21 = i31;
                                c37555Zk22 = c37555Zk2;
                            }
                            boolean z15 = i17 == 0 ? false : z4;
                            if ((i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0) {
                                i21 &= -458753;
                                i22 = z15 ? 1 : Integer.MAX_VALUE;
                            } else {
                                i22 = i;
                            }
                            i23 = i18 == 0 ? 1 : i2;
                            if (i19 == 0) {
                                mo89518u.mo89638F(-492369756);
                                Object mo89635G = mo89518u.mo89635G();
                                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G = C40741f62.m42091a();
                                    mo89518u.mo89503z(mo89635G);
                                }
                                mo89518u.mo89605Q();
                                interfaceC48104rX22 = (InterfaceC48104rX2) mo89635G;
                            } else {
                                interfaceC48104rX22 = interfaceC48104rX2;
                            }
                            if ((262144 & i5) == 0) {
                                g263 = g262;
                                interfaceC42444hy52 = C41288g16.f81350a.m40294f(mo89518u, 6);
                                i24 = (-234881025) & i21;
                            } else {
                                g263 = g262;
                                interfaceC42444hy52 = interfaceC42444hy5;
                                i24 = i21;
                            }
                            if ((i5 & 524288) == 0) {
                                InterfaceC42444hy5 interfaceC42444hy55 = interfaceC42444hy52;
                                defaultConstructorMarker = null;
                                function26 = function214;
                                function27 = function215;
                                interfaceC32735Eu62 = m108216a;
                                function28 = function213;
                                interfaceC48104rX23 = interfaceC48104rX22;
                                c37555Zk23 = c37555Zk22;
                                c38736bl22 = m64037a;
                                z6 = z15;
                                interfaceC39510d162 = C41288g16.f81350a.m40291i(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mo89518u, 0, 0, 48, 2097151);
                                i25 = i20;
                                g264 = g263;
                                interfaceC42444hy53 = interfaceC42444hy55;
                                interfaceC41563gV22 = interfaceC41563gV24;
                                z7 = z13;
                                i26 = i24 & (-1879048193);
                            } else {
                                InterfaceC42444hy5 interfaceC42444hy56 = interfaceC42444hy52;
                                defaultConstructorMarker = null;
                                function26 = function214;
                                function27 = function215;
                                interfaceC32735Eu62 = m108216a;
                                function28 = function213;
                                interfaceC48104rX23 = interfaceC48104rX22;
                                c37555Zk23 = c37555Zk22;
                                c38736bl22 = m64037a;
                                z6 = z15;
                                i25 = i20;
                                g264 = g263;
                                interfaceC42444hy53 = interfaceC42444hy56;
                                interfaceC39510d162 = interfaceC39510d16;
                                interfaceC41563gV22 = interfaceC41563gV24;
                                z7 = z13;
                                i26 = i24;
                            }
                            z8 = z14;
                        }
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(237745923, i25, i26, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:334)");
                        }
                        mo89518u.mo89638F(1961404773);
                        m105915j = g264.m105915j();
                        if (!(m105915j != C47063pm0.f104050b.m18726g())) {
                            m105915j = interfaceC39510d162.mo44709j(z7, mo89518u, ((i25 >> 9) & 14) | ((i26 >> 24) & 112)).getValue().m18733w();
                        }
                        mo89518u.mo89605Q();
                        G26 m105927J = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
                        int i32 = (i26 >> 24) & 112;
                        InterfaceC41563gV2 m62125c = C13342bw.m62125c(function25 == null ? ND3.m94180m(C41198fs5.m40621a(interfaceC41563gV22, true, C6606c.f29567g), 0.0f, f29521b, 0.0f, 0.0f, 13, null) : interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i32).getValue().m18733w(), interfaceC42444hy53);
                        C41288g16 c41288g16 = C41288g16.f81350a;
                        InterfaceC41563gV2 m114262g = BB5.m114262g(m62125c, c41288g16.m40295e(), c41288g16.m40296d());
                        InterfaceC41563gV2 interfaceC41563gV25 = interfaceC41563gV22;
                        C46831pN5 c46831pN5 = new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, i32 | (i26 & 14)).getValue().m18733w(), defaultConstructorMarker);
                        InterfaceC42389ht0 m29791b = C43575jt0.m29791b(mo89518u, -1001528775, true, new C6607d(value, z7, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i25, i26, interfaceC42444hy53));
                        int i33 = (i25 & 14) | (i25 & 112) | (i25 & 7168) | (i25 & 57344);
                        int i34 = i26 << 12;
                        InterfaceC39510d16 interfaceC39510d164 = interfaceC39510d162;
                        InterfaceC42444hy5 interfaceC42444hy57 = interfaceC42444hy53;
                        interfaceC32720Et02 = mo89518u;
                        boolean z16 = z8;
                        G26 g266 = g264;
                        boolean z17 = z7;
                        C7683TE.m84177a(value, onValueChange, m114262g, z7, z5, m105927J, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, c46831pN5, m29791b, interfaceC32720Et02, i33 | (i34 & 3670016) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        function29 = function28;
                        function210 = function26;
                        function211 = function27;
                        interfaceC32735Eu63 = interfaceC32735Eu62;
                        c38736bl23 = c38736bl22;
                        c37555Zk24 = c37555Zk23;
                        z9 = z6;
                        interfaceC48104rX24 = interfaceC48104rX23;
                        interfaceC41563gV23 = interfaceC41563gV25;
                        interfaceC39510d163 = interfaceC39510d164;
                        interfaceC42444hy54 = interfaceC42444hy57;
                        z10 = z16;
                        g265 = g266;
                        z11 = z17;
                        z12 = z5;
                        function212 = function25;
                        i27 = i22;
                        i28 = i23;
                    }
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new C6604a(value, onValueChange, interfaceC41563gV23, z11, z12, g265, function212, function29, function210, function211, z10, interfaceC32735Eu63, c38736bl23, c37555Zk24, z9, i27, i28, interfaceC48104rX24, interfaceC42444hy54, interfaceC39510d163, i3, i4, i5));
                    return;
                }
                if ((i4 & 7168) == 0) {
                }
                i17 = i5 & 16384;
                if (i17 == 0) {
                }
                if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                }
                i18 = i5 & 65536;
                if (i18 == 0) {
                }
                i19 = i5 & DateUtils.FORMAT_NUMERIC_DATE;
                if (i19 == 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i3 & 1) == 0) {
                }
                if (i29 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i5 & 32) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if ((i5 & 8192) == 0) {
                }
                if (i17 == 0) {
                }
                if ((i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if ((262144 & i5) == 0) {
                }
                if ((i5 & 524288) == 0) {
                }
                z8 = z14;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(1961404773);
                m105915j = g264.m105915j();
                if (!(m105915j != C47063pm0.f104050b.m18726g())) {
                }
                mo89518u.mo89605Q();
                G26 m105927J2 = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
                int i322 = (i26 >> 24) & 112;
                InterfaceC41563gV2 m62125c2 = C13342bw.m62125c(function25 == null ? ND3.m94180m(C41198fs5.m40621a(interfaceC41563gV22, true, C6606c.f29567g), 0.0f, f29521b, 0.0f, 0.0f, 13, null) : interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i322).getValue().m18733w(), interfaceC42444hy53);
                C41288g16 c41288g162 = C41288g16.f81350a;
                InterfaceC41563gV2 m114262g2 = BB5.m114262g(m62125c2, c41288g162.m40295e(), c41288g162.m40296d());
                InterfaceC41563gV2 interfaceC41563gV252 = interfaceC41563gV22;
                C46831pN5 c46831pN52 = new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, i322 | (i26 & 14)).getValue().m18733w(), defaultConstructorMarker);
                InterfaceC42389ht0 m29791b2 = C43575jt0.m29791b(mo89518u, -1001528775, true, new C6607d(value, z7, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i25, i26, interfaceC42444hy53));
                int i332 = (i25 & 14) | (i25 & 112) | (i25 & 7168) | (i25 & 57344);
                int i342 = i26 << 12;
                InterfaceC39510d16 interfaceC39510d1642 = interfaceC39510d162;
                InterfaceC42444hy5 interfaceC42444hy572 = interfaceC42444hy53;
                interfaceC32720Et02 = mo89518u;
                boolean z162 = z8;
                G26 g2662 = g264;
                boolean z172 = z7;
                C7683TE.m84177a(value, onValueChange, m114262g2, z7, z5, m105927J2, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, c46831pN52, m29791b2, interfaceC32720Et02, i332 | (i342 & 3670016) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
                if (C35528Qt0.m87827O()) {
                }
                function29 = function28;
                function210 = function26;
                function211 = function27;
                interfaceC32735Eu63 = interfaceC32735Eu62;
                c38736bl23 = c38736bl22;
                c37555Zk24 = c37555Zk23;
                z9 = z6;
                interfaceC48104rX24 = interfaceC48104rX23;
                interfaceC41563gV23 = interfaceC41563gV252;
                interfaceC39510d163 = interfaceC39510d1642;
                interfaceC42444hy54 = interfaceC42444hy572;
                z10 = z162;
                g265 = g2662;
                z11 = z172;
                z12 = z5;
                function212 = function25;
                i27 = i22;
                i28 = i23;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i312 = i14;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            if ((i4 & 7168) == 0) {
            }
            i17 = i5 & 16384;
            if (i17 == 0) {
            }
            if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            }
            i18 = i5 & 65536;
            if (i18 == 0) {
            }
            i19 = i5 & DateUtils.FORMAT_NUMERIC_DATE;
            if (i19 == 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i3 & 1) == 0) {
            }
            if (i29 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i5 & 32) == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if ((i5 & 8192) == 0) {
            }
            if (i17 == 0) {
            }
            if ((i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if ((262144 & i5) == 0) {
            }
            if ((i5 & 524288) == 0) {
            }
            z8 = z14;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(1961404773);
            m105915j = g264.m105915j();
            if (!(m105915j != C47063pm0.f104050b.m18726g())) {
            }
            mo89518u.mo89605Q();
            G26 m105927J22 = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
            int i3222 = (i26 >> 24) & 112;
            InterfaceC41563gV2 m62125c22 = C13342bw.m62125c(function25 == null ? ND3.m94180m(C41198fs5.m40621a(interfaceC41563gV22, true, C6606c.f29567g), 0.0f, f29521b, 0.0f, 0.0f, 13, null) : interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i3222).getValue().m18733w(), interfaceC42444hy53);
            C41288g16 c41288g1622 = C41288g16.f81350a;
            InterfaceC41563gV2 m114262g22 = BB5.m114262g(m62125c22, c41288g1622.m40295e(), c41288g1622.m40296d());
            InterfaceC41563gV2 interfaceC41563gV2522 = interfaceC41563gV22;
            C46831pN5 c46831pN522 = new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, i3222 | (i26 & 14)).getValue().m18733w(), defaultConstructorMarker);
            InterfaceC42389ht0 m29791b22 = C43575jt0.m29791b(mo89518u, -1001528775, true, new C6607d(value, z7, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i25, i26, interfaceC42444hy53));
            int i3322 = (i25 & 14) | (i25 & 112) | (i25 & 7168) | (i25 & 57344);
            int i3422 = i26 << 12;
            InterfaceC39510d16 interfaceC39510d16422 = interfaceC39510d162;
            InterfaceC42444hy5 interfaceC42444hy5722 = interfaceC42444hy53;
            interfaceC32720Et02 = mo89518u;
            boolean z1622 = z8;
            G26 g26622 = g264;
            boolean z1722 = z7;
            C7683TE.m84177a(value, onValueChange, m114262g22, z7, z5, m105927J22, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, c46831pN522, m29791b22, interfaceC32720Et02, i3322 | (i3422 & 3670016) | (29360128 & i3422) | (234881024 & i3422) | (i3422 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
            if (C35528Qt0.m87827O()) {
            }
            function29 = function28;
            function210 = function26;
            function211 = function27;
            interfaceC32735Eu63 = interfaceC32735Eu62;
            c38736bl23 = c38736bl22;
            c37555Zk24 = c37555Zk23;
            z9 = z6;
            interfaceC48104rX24 = interfaceC48104rX23;
            interfaceC41563gV23 = interfaceC41563gV2522;
            interfaceC39510d163 = interfaceC39510d16422;
            interfaceC42444hy54 = interfaceC42444hy5722;
            z10 = z1622;
            g265 = g26622;
            z11 = z1722;
            z12 = z5;
            function212 = function25;
            i27 = i22;
            i28 = i23;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        i7 = i5 & 8;
        int i302 = 2048;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i3122 = i14;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        if ((i4 & 7168) == 0) {
        }
        i17 = i5 & 16384;
        if (i17 == 0) {
        }
        if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
        }
        i18 = i5 & 65536;
        if (i18 == 0) {
        }
        i19 = i5 & DateUtils.FORMAT_NUMERIC_DATE;
        if (i19 == 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i3 & 1) == 0) {
        }
        if (i29 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if ((i5 & 8192) == 0) {
        }
        if (i17 == 0) {
        }
        if ((i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if ((262144 & i5) == 0) {
        }
        if ((i5 & 524288) == 0) {
        }
        z8 = z14;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(1961404773);
        m105915j = g264.m105915j();
        if (!(m105915j != C47063pm0.f104050b.m18726g())) {
        }
        mo89518u.mo89605Q();
        G26 m105927J222 = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
        int i32222 = (i26 >> 24) & 112;
        InterfaceC41563gV2 m62125c222 = C13342bw.m62125c(function25 == null ? ND3.m94180m(C41198fs5.m40621a(interfaceC41563gV22, true, C6606c.f29567g), 0.0f, f29521b, 0.0f, 0.0f, 13, null) : interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i32222).getValue().m18733w(), interfaceC42444hy53);
        C41288g16 c41288g16222 = C41288g16.f81350a;
        InterfaceC41563gV2 m114262g222 = BB5.m114262g(m62125c222, c41288g16222.m40295e(), c41288g16222.m40296d());
        InterfaceC41563gV2 interfaceC41563gV25222 = interfaceC41563gV22;
        C46831pN5 c46831pN5222 = new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, i32222 | (i26 & 14)).getValue().m18733w(), defaultConstructorMarker);
        InterfaceC42389ht0 m29791b222 = C43575jt0.m29791b(mo89518u, -1001528775, true, new C6607d(value, z7, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i25, i26, interfaceC42444hy53));
        int i33222 = (i25 & 14) | (i25 & 112) | (i25 & 7168) | (i25 & 57344);
        int i34222 = i26 << 12;
        InterfaceC39510d16 interfaceC39510d164222 = interfaceC39510d162;
        InterfaceC42444hy5 interfaceC42444hy57222 = interfaceC42444hy53;
        interfaceC32720Et02 = mo89518u;
        boolean z16222 = z8;
        G26 g266222 = g264;
        boolean z17222 = z7;
        C7683TE.m84177a(value, onValueChange, m114262g222, z7, z5, m105927J222, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, c46831pN5222, m29791b222, interfaceC32720Et02, i33222 | (i34222 & 3670016) | (29360128 & i34222) | (234881024 & i34222) | (i34222 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
        if (C35528Qt0.m87827O()) {
        }
        function29 = function28;
        function210 = function26;
        function211 = function27;
        interfaceC32735Eu63 = interfaceC32735Eu62;
        c38736bl23 = c38736bl22;
        c37555Zk24 = c37555Zk23;
        z9 = z6;
        interfaceC48104rX24 = interfaceC48104rX23;
        interfaceC41563gV23 = interfaceC41563gV25222;
        interfaceC39510d163 = interfaceC39510d164222;
        interfaceC42444hy54 = interfaceC42444hy57222;
        z10 = z16222;
        g265 = g266222;
        z11 = z17222;
        z12 = z5;
        function212 = function25;
        i27 = i22;
        i28 = i23;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01af, code lost:
        if (r10.mo89539n(r85) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m89192b(F16 value, Function1 onValueChange, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        G26 g262;
        Function2 function25;
        C37555Zk2 c37555Zk22;
        int i19;
        Function2 function26;
        InterfaceC48104rX2 interfaceC48104rX22;
        InterfaceC48104rX2 interfaceC48104rX23;
        InterfaceC42444hy5 interfaceC42444hy52;
        C37555Zk2 c37555Zk23;
        Function2 function27;
        InterfaceC48104rX2 interfaceC48104rX24;
        InterfaceC39510d16 interfaceC39510d162;
        InterfaceC42444hy5 interfaceC42444hy53;
        Function2 function28;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z5;
        InterfaceC32735Eu6 interfaceC32735Eu62;
        Function2 function29;
        C38736bl2 c38736bl22;
        boolean z6;
        boolean z7;
        boolean z8;
        G26 g263;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV23;
        boolean z9;
        boolean z10;
        G26 g264;
        Function2 function210;
        Function2 function211;
        Function2 function212;
        boolean z11;
        InterfaceC32735Eu6 interfaceC32735Eu63;
        C38736bl2 c38736bl23;
        C37555Zk2 c37555Zk24;
        boolean z12;
        InterfaceC48104rX2 interfaceC48104rX25;
        InterfaceC42444hy5 interfaceC42444hy54;
        InterfaceC39510d16 interfaceC39510d163;
        Function2 function213;
        int i20;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-288998816);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (mo89518u.mo89539n(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= mo89518u.mo89629I(onValueChange) ? 32 : 16;
        }
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= mo89518u.mo89539n(interfaceC41563gV2) ? 256 : 128;
            i6 = i4 & 8;
            int i22 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= mo89518u.mo89536o(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= mo89518u.mo89536o(z2) ? 16384 : 8192;
                }
                if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i5 |= ((i4 & 32) == 0 && mo89518u.mo89539n(g26)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= mo89518u.mo89629I(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= mo89518u.mo89629I(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= mo89518u.mo89629I(function23) ? 67108864 : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= mo89518u.mo89629I(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (mo89518u.mo89536o(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= mo89518u.mo89539n(interfaceC32735Eu6) ? 32 : 16;
                }
                int i23 = i13;
                i15 = i4 & 4096;
                if (i15 != 0) {
                    i23 |= 384;
                } else if ((i3 & 896) == 0) {
                    i23 |= mo89518u.mo89539n(c38736bl2) ? 256 : 128;
                    if ((i3 & 7168) == 0) {
                        if ((i4 & 8192) != 0) {
                        }
                        i22 = 1024;
                        i23 |= i22;
                    }
                    i16 = i4 & 16384;
                    if (i16 == 0) {
                        i23 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i23 |= mo89518u.mo89536o(z4) ? 16384 : 8192;
                    }
                    i17 = i4 & DateUtils.FORMAT_ABBREV_WEEKDAY;
                    if (i17 == 0) {
                        i23 |= ImageMetadata.EDGE_MODE;
                    } else if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                        i23 |= mo89518u.mo89527r(i) ? 131072 : 65536;
                    }
                    i18 = i4 & 65536;
                    if (i18 == 0) {
                        i23 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i23 |= mo89518u.mo89539n(interfaceC48104rX2) ? 1048576 : 524288;
                    }
                    if ((i3 & 29360128) == 0) {
                        i23 |= ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0 && mo89518u.mo89539n(interfaceC42444hy5)) ? 8388608 : 4194304;
                    }
                    if ((i3 & 234881024) == 0) {
                        i23 |= ((i4 & DateUtils.FORMAT_ABBREV_RELATIVE) == 0 && mo89518u.mo89539n(interfaceC39510d16)) ? 67108864 : 33554432;
                    }
                    if ((i5 & 1533916891) != 306783378 && (191739611 & i23) == 38347922 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV23 = interfaceC41563gV2;
                        z9 = z;
                        z10 = z2;
                        g264 = g26;
                        function213 = function2;
                        function210 = function22;
                        function211 = function23;
                        z11 = z3;
                        interfaceC32735Eu63 = interfaceC32735Eu6;
                        c38736bl23 = c38736bl2;
                        c37555Zk24 = c37555Zk2;
                        z12 = z4;
                        i20 = i;
                        interfaceC48104rX25 = interfaceC48104rX2;
                        interfaceC42444hy54 = interfaceC42444hy5;
                        interfaceC39510d163 = interfaceC39510d16;
                        interfaceC32720Et02 = mo89518u;
                        function212 = function24;
                    } else {
                        mo89518u.mo89626J();
                        if ((i2 & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 8192) != 0) {
                                i23 &= -7169;
                            }
                            if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
                                i23 &= -29360129;
                            }
                            if ((262144 & i4) != 0) {
                                i23 &= -234881025;
                            }
                            interfaceC41563gV22 = interfaceC41563gV2;
                            z6 = z;
                            z7 = z2;
                            g263 = g26;
                            function25 = function2;
                            function29 = function22;
                            function27 = function23;
                            function28 = function24;
                            z5 = z3;
                            interfaceC32735Eu62 = interfaceC32735Eu6;
                            c38736bl22 = c38736bl2;
                            c37555Zk23 = c37555Zk2;
                            z8 = z4;
                            i19 = i;
                            interfaceC48104rX24 = interfaceC48104rX2;
                            interfaceC42444hy53 = interfaceC42444hy5;
                            interfaceC39510d162 = interfaceC39510d16;
                        } else {
                            InterfaceC41563gV2 interfaceC41563gV24 = i21 == 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            boolean z13 = i6 == 0 ? true : z;
                            boolean z14 = i7 == 0 ? false : z2;
                            if ((i4 & 32) == 0) {
                                g262 = (G26) mo89518u.mo89572c(C38909c26.m61999f());
                                i5 &= -458753;
                            } else {
                                g262 = g26;
                            }
                            function25 = i8 == 0 ? null : function2;
                            Function2 function214 = i9 == 0 ? null : function22;
                            Function2 function215 = i10 == 0 ? null : function23;
                            Function2 function216 = i11 == 0 ? null : function24;
                            boolean z15 = i12 == 0 ? false : z3;
                            InterfaceC32735Eu6 m108216a = i14 == 0 ? InterfaceC32735Eu6.f8291a.m108216a() : interfaceC32735Eu6;
                            C38736bl2 m64037a = i15 == 0 ? C38736bl2.f58036e.m64037a() : c38736bl2;
                            int i24 = i5;
                            if ((i4 & 8192) == 0) {
                                c37555Zk22 = new C37555Zk2(null, null, null, null, null, null, 63, null);
                                i23 &= -7169;
                            } else {
                                c37555Zk22 = c37555Zk2;
                            }
                            boolean z16 = i16 == 0 ? false : z4;
                            i19 = i17 == 0 ? Integer.MAX_VALUE : i;
                            C37555Zk2 c37555Zk25 = c37555Zk22;
                            if (i18 == 0) {
                                mo89518u.mo89638F(-492369756);
                                Object mo89635G = mo89518u.mo89635G();
                                function26 = function215;
                                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G = C40741f62.m42091a();
                                    mo89518u.mo89503z(mo89635G);
                                }
                                mo89518u.mo89605Q();
                                interfaceC48104rX22 = (InterfaceC48104rX2) mo89635G;
                            } else {
                                function26 = function215;
                                interfaceC48104rX22 = interfaceC48104rX2;
                            }
                            if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
                                interfaceC48104rX23 = interfaceC48104rX22;
                                interfaceC42444hy52 = C41288g16.f81350a.m40294f(mo89518u, 6);
                                i23 = (-29360129) & i23;
                            } else {
                                interfaceC48104rX23 = interfaceC48104rX22;
                                interfaceC42444hy52 = interfaceC42444hy5;
                            }
                            if ((262144 & i4) == 0) {
                                i23 &= -234881025;
                                c37555Zk23 = c37555Zk25;
                                function27 = function26;
                                interfaceC48104rX24 = interfaceC48104rX23;
                                interfaceC42444hy53 = interfaceC42444hy52;
                                interfaceC39510d162 = C41288g16.f81350a.m40291i(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mo89518u, 0, 0, 48, 2097151);
                            } else {
                                c37555Zk23 = c37555Zk25;
                                function27 = function26;
                                interfaceC48104rX24 = interfaceC48104rX23;
                                interfaceC39510d162 = interfaceC39510d16;
                                interfaceC42444hy53 = interfaceC42444hy52;
                            }
                            function28 = function216;
                            interfaceC41563gV22 = interfaceC41563gV24;
                            z5 = z15;
                            interfaceC32735Eu62 = m108216a;
                            function29 = function214;
                            c38736bl22 = m64037a;
                            z6 = z13;
                            z7 = z14;
                            z8 = z16;
                            g263 = g262;
                            i5 = i24;
                        }
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-288998816, i5, i23, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:424)");
                        }
                        int i25 = i23 << 3;
                        interfaceC32720Et02 = mo89518u;
                        m89193a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & ImageMetadata.JPEG_GPS_COORDINATES) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), 0);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV23 = interfaceC41563gV22;
                        z9 = z6;
                        z10 = z7;
                        g264 = g263;
                        function210 = function29;
                        function211 = function27;
                        function212 = function28;
                        z11 = z5;
                        interfaceC32735Eu63 = interfaceC32735Eu62;
                        c38736bl23 = c38736bl22;
                        c37555Zk24 = c37555Zk23;
                        z12 = z8;
                        interfaceC48104rX25 = interfaceC48104rX24;
                        interfaceC42444hy54 = interfaceC42444hy53;
                        interfaceC39510d163 = interfaceC39510d162;
                        function213 = function25;
                        i20 = i19;
                    }
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new C6605b(value, onValueChange, interfaceC41563gV23, z9, z10, g264, function213, function210, function211, function212, z11, interfaceC32735Eu63, c38736bl23, c37555Zk24, z12, i20, interfaceC48104rX25, interfaceC42444hy54, interfaceC39510d163, i2, i3, i4));
                    return;
                }
                if ((i3 & 7168) == 0) {
                }
                i16 = i4 & 16384;
                if (i16 == 0) {
                }
                i17 = i4 & DateUtils.FORMAT_ABBREV_WEEKDAY;
                if (i17 == 0) {
                }
                i18 = i4 & 65536;
                if (i18 == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i2 & 1) == 0) {
                }
                if (i21 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 32) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                int i242 = i5;
                if ((i4 & 8192) == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                C37555Zk2 c37555Zk252 = c37555Zk22;
                if (i18 == 0) {
                }
                if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
                }
                if ((262144 & i4) == 0) {
                }
                function28 = function216;
                interfaceC41563gV22 = interfaceC41563gV24;
                z5 = z15;
                interfaceC32735Eu62 = m108216a;
                function29 = function214;
                c38736bl22 = m64037a;
                z6 = z13;
                z7 = z14;
                z8 = z16;
                g263 = g262;
                i5 = i242;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i252 = i23 << 3;
                interfaceC32720Et02 = mo89518u;
                m89193a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & ImageMetadata.JPEG_GPS_COORDINATES) | (i252 & 29360128) | (i252 & 234881024) | (i252 & 1879048192), 0);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV23 = interfaceC41563gV22;
                z9 = z6;
                z10 = z7;
                g264 = g263;
                function210 = function29;
                function211 = function27;
                function212 = function28;
                z11 = z5;
                interfaceC32735Eu63 = interfaceC32735Eu62;
                c38736bl23 = c38736bl22;
                c37555Zk24 = c37555Zk23;
                z12 = z8;
                interfaceC48104rX25 = interfaceC48104rX24;
                interfaceC42444hy54 = interfaceC42444hy53;
                interfaceC39510d163 = interfaceC39510d162;
                function213 = function25;
                i20 = i19;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            int i232 = i13;
            i15 = i4 & 4096;
            if (i15 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i16 = i4 & 16384;
            if (i16 == 0) {
            }
            i17 = i4 & DateUtils.FORMAT_ABBREV_WEEKDAY;
            if (i17 == 0) {
            }
            i18 = i4 & 65536;
            if (i18 == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i2 & 1) == 0) {
            }
            if (i21 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            int i2422 = i5;
            if ((i4 & 8192) == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            C37555Zk2 c37555Zk2522 = c37555Zk22;
            if (i18 == 0) {
            }
            if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
            }
            if ((262144 & i4) == 0) {
            }
            function28 = function216;
            interfaceC41563gV22 = interfaceC41563gV24;
            z5 = z15;
            interfaceC32735Eu62 = m108216a;
            function29 = function214;
            c38736bl22 = m64037a;
            z6 = z13;
            z7 = z14;
            z8 = z16;
            g263 = g262;
            i5 = i2422;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            int i2522 = i232 << 3;
            interfaceC32720Et02 = mo89518u;
            m89193a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i232 & 14) | (i232 & 112) | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & ImageMetadata.JPEG_GPS_COORDINATES) | (i2522 & 29360128) | (i2522 & 234881024) | (i2522 & 1879048192), 0);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV22;
            z9 = z6;
            z10 = z7;
            g264 = g263;
            function210 = function29;
            function211 = function27;
            function212 = function28;
            z11 = z5;
            interfaceC32735Eu63 = interfaceC32735Eu62;
            c38736bl23 = c38736bl22;
            c37555Zk24 = c37555Zk23;
            z12 = z8;
            interfaceC48104rX25 = interfaceC48104rX24;
            interfaceC42444hy54 = interfaceC42444hy53;
            interfaceC39510d163 = interfaceC39510d162;
            function213 = function25;
            i20 = i19;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        i6 = i4 & 8;
        int i222 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        int i2322 = i13;
        i15 = i4 & 4096;
        if (i15 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i16 = i4 & 16384;
        if (i16 == 0) {
        }
        i17 = i4 & DateUtils.FORMAT_ABBREV_WEEKDAY;
        if (i17 == 0) {
        }
        i18 = i4 & 65536;
        if (i18 == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i2 & 1) == 0) {
        }
        if (i21 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        int i24222 = i5;
        if ((i4 & 8192) == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        C37555Zk2 c37555Zk25222 = c37555Zk22;
        if (i18 == 0) {
        }
        if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
        }
        if ((262144 & i4) == 0) {
        }
        function28 = function216;
        interfaceC41563gV22 = interfaceC41563gV24;
        z5 = z15;
        interfaceC32735Eu62 = m108216a;
        function29 = function214;
        c38736bl22 = m64037a;
        z6 = z13;
        z7 = z14;
        z8 = z16;
        g263 = g262;
        i5 = i24222;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i25222 = i2322 << 3;
        interfaceC32720Et02 = mo89518u;
        m89193a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i2322 & 14) | (i2322 & 112) | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & ImageMetadata.JPEG_GPS_COORDINATES) | (i25222 & 29360128) | (i25222 & 234881024) | (i25222 & 1879048192), 0);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV22;
        z9 = z6;
        z10 = z7;
        g264 = g263;
        function210 = function29;
        function211 = function27;
        function212 = function28;
        z11 = z5;
        interfaceC32735Eu63 = interfaceC32735Eu62;
        c38736bl23 = c38736bl22;
        c37555Zk24 = c37555Zk23;
        z12 = z8;
        interfaceC48104rX25 = interfaceC48104rX24;
        interfaceC42444hy54 = interfaceC42444hy53;
        interfaceC39510d163 = interfaceC39510d162;
        function213 = function25;
        i20 = i19;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: c */
    public static final void m89191c(InterfaceC41563gV2 modifier, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> textField, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, boolean z, float f, Function1<? super C51465xB5, Unit> onLabelMeasured, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> border, PD3 paddingValues, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        float coerceAtLeast;
        float coerceAtLeast2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2049536174);
        int i4 = (i & 14) == 0 ? (mo89518u.mo89539n(modifier) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i4 |= mo89518u.mo89629I(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= mo89518u.mo89629I(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= mo89518u.mo89629I(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= mo89518u.mo89629I(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= mo89518u.mo89629I(function23) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= mo89518u.mo89536o(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= mo89518u.mo89533p(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= mo89518u.mo89629I(onLabelMeasured) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= mo89518u.mo89629I(border) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 14) == 0 ? i2 | (mo89518u.mo89539n(paddingValues) ? 4 : 2) : i2;
        if ((i4 & 1533916891) == 306783378 && (i5 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2049536174, i4, i5, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:476)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            mo89518u.mo89638F(-568225417);
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 4; i6 < i7; i7 = 4) {
                z2 |= mo89518u.mo89539n(objArr[i6]);
                i6++;
            }
            Object mo89635G = mo89518u.mo89635G();
            if (z2 || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C35585Qz3(onLabelMeasured, z, f, paddingValues);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C35585Qz3 c35585Qz3 = (C35585Qz3) mo89635G;
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(modifier);
            int i8 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
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
            C38680bf6.m64191b(m64192a, c35585Qz3, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i8 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            border.invoke(mo89518u, Integer.valueOf((i4 >> 27) & 14));
            mo89518u.mo89638F(1169918076);
            if (function22 != null) {
                InterfaceC41563gV2 mo39266t0 = C11335a.m68614b(InterfaceC41563gV2.f82354b0, "Leading").mo39266t0(C44846m16.m26478d());
                InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(mo39266t0);
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
                C38680bf6.m64191b(m64192a2, enumC47065pm23, c0757a.m113413c());
                C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                C40689f10 c40689f10 = C40689f10.f79291a;
                function22.invoke(mo89518u, Integer.valueOf((i4 >> 12) & 14));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            }
            mo89518u.mo89605Q();
            mo89518u.mo89638F(1169918361);
            if (function23 != null) {
                InterfaceC41563gV2 mo39266t02 = C11335a.m68614b(InterfaceC41563gV2.f82354b0, "Trailing").mo39266t0(C44846m16.m26478d());
                InterfaceC4360K9 m99141e2 = InterfaceC4360K9.f19170a.m99141e();
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(m99141e2, false, mo89518u, 6);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(mo39266t02);
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
                C38680bf6.m64191b(m64192a3, enumC47065pm24, c0757a.m113413c());
                C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                C40689f10 c40689f102 = C40689f10.f79291a;
                function23.invoke(mo89518u, Integer.valueOf((i4 >> 15) & 14));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            }
            mo89518u.mo89605Q();
            float m94186g = ND3.m94186g(paddingValues, enumC47065pm2);
            float m94187f = ND3.m94187f(paddingValues, enumC47065pm2);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            if (function22 != null) {
                i3 = 0;
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(C43705k61.m29303g(m94186g - C44846m16.m26479c()), C43705k61.m29303g(0));
                m94186g = C43705k61.m29303g(coerceAtLeast2);
            } else {
                i3 = 0;
            }
            float f2 = m94186g;
            if (function23 != null) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(C43705k61.m29303g(m94187f - C44846m16.m26479c()), C43705k61.m29303g(i3));
                m94187f = C43705k61.m29303g(coerceAtLeast);
            }
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, f2, 0.0f, m94187f, 0.0f, 10, null);
            mo89518u.mo89638F(1169919372);
            if (function3 != null) {
                function3.invoke(C11335a.m68614b(c20912a, "Hint").mo39266t0(m94180m), mo89518u, Integer.valueOf((i4 >> 3) & 112));
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 mo39266t03 = C11335a.m68614b(c20912a, "TextField").mo39266t0(m94180m);
            mo89518u.mo89638F(733328855);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m44729h3 = C39504d10.m44729h(c4361a.m99132n(), true, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm25 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a4 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(mo39266t03);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a4);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a4 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a4, m44729h3, c0757a.m113412d());
            C38680bf6.m64191b(m64192a4, interfaceC41273g014, c0757a.m113414b());
            C38680bf6.m64191b(m64192a4, enumC47065pm25, c0757a.m113413c());
            C38680bf6.m64191b(m64192a4, interfaceC33869Jq64, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a4.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            C40689f10 c40689f103 = C40689f10.f79291a;
            textField.invoke(mo89518u, Integer.valueOf((i4 >> 3) & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89638F(-614207951);
            if (function2 != null) {
                InterfaceC41563gV2 m68614b = C11335a.m68614b(c20912a, "Label");
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h4 = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g015 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm26 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq65 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a5 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a5 = C31723Am2.m115273a(m68614b);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a5);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a5 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a5, m44729h4, c0757a.m113412d());
                C38680bf6.m64191b(m64192a5, interfaceC41273g015, c0757a.m113414b());
                C38680bf6.m64191b(m64192a5, enumC47065pm26, c0757a.m113413c());
                C38680bf6.m64191b(m64192a5, interfaceC33869Jq65, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a5.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                function2.invoke(mo89518u, Integer.valueOf((i4 >> 9) & 14));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            }
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new C6609e(modifier, textField, function3, function2, function22, function23, z, f, onLabelMeasured, border, paddingValues, i, i2));
    }

    /* renamed from: h */
    public static final int m89186h(int i, int i2, int i3, int i4, int i5, long j, float f, PD3 pd3) {
        int roundToInt;
        float max = Math.max(i3, i5) + (pd3.mo88735a() * f) + Math.max(pd3.mo88732d() * f, i4 / 2.0f);
        int m28062o = C44228kz0.m28062o(j);
        roundToInt = MathKt__MathJVMKt.roundToInt(max);
        return Math.max(m28062o, Math.max(i, Math.max(i2, roundToInt)));
    }

    /* renamed from: i */
    public static final int m89185i(int i, int i2, int i3, int i4, int i5, boolean z, long j, float f, PD3 pd3) {
        int i6;
        int roundToInt;
        int i7 = 0;
        if (z) {
            i6 = i4;
        } else {
            i6 = 0;
        }
        int max = i + Math.max(i3, Math.max(i6, i5)) + i2;
        if (!z) {
            EnumC47065pm2 enumC47065pm2 = EnumC47065pm2.Ltr;
            roundToInt = MathKt__MathJVMKt.roundToInt(C43705k61.m29303g(pd3.mo88734b(enumC47065pm2) + pd3.mo88733c(enumC47065pm2)) * f);
            i7 = i4 + roundToInt;
        }
        return Math.max(max, Math.max(i7, C44228kz0.m28061p(j)));
    }

    /* renamed from: j */
    public static final InterfaceC41563gV2 m89184j(InterfaceC41563gV2 outlineCutout, long j, PD3 paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return C11289a.m68865c(outlineCutout, new C6610f(j, paddingValues));
    }

    /* renamed from: k */
    public static final void m89183k(OU3.AbstractC6015a abstractC6015a, int i, int i2, OU3 ou3, OU3 ou32, OU3 ou33, OU3 ou34, OU3 ou35, OU3 ou36, float f, boolean z, float f2, EnumC47065pm2 enumC47065pm2, PD3 pd3) {
        int roundToInt;
        int roundToInt2;
        Integer num;
        int intValue;
        int roundToInt3;
        roundToInt = MathKt__MathJVMKt.roundToInt(pd3.mo88732d() * f2);
        roundToInt2 = MathKt__MathJVMKt.roundToInt(ND3.m94186g(pd3, enumC47065pm2) * f2);
        float m26479c = C44846m16.m26479c() * f2;
        if (ou3 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou3, 0, InterfaceC4360K9.f19170a.m99138h().mo99130a(ou3.m92229d1(), i), 0.0f, 4, null);
        }
        if (ou32 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou32, i2 - ou32.m92226i1(), InterfaceC4360K9.f19170a.m99138h().mo99130a(ou32.m92229d1(), i), 0.0f, 4, null);
        }
        if (ou34 != null) {
            int m75145b = YM2.m75145b(z ? InterfaceC4360K9.f19170a.m99138h().mo99130a(ou34.m92229d1(), i) : roundToInt, -(ou34.m92229d1() / 2), f);
            num = Integer.valueOf(m75145b);
            roundToInt3 = MathKt__MathJVMKt.roundToInt(ou3 == null ? 0.0f : (C44846m16.m26473i(ou3) - m26479c) * (1 - f));
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou34, roundToInt3 + roundToInt2, m75145b, 0.0f, 4, null);
        } else {
            num = null;
        }
        OU3.AbstractC6015a.m92205r(abstractC6015a, ou33, C44846m16.m26473i(ou3), Math.max(z ? InterfaceC4360K9.f19170a.m99138h().mo99130a(ou33.m92229d1(), i) : roundToInt, C44846m16.m26474h(ou34) / 2), 0.0f, 4, null);
        if (ou35 != null) {
            if (z) {
                roundToInt = InterfaceC4360K9.f19170a.m99138h().mo99130a(ou35.m92229d1(), i);
            }
            int max = Math.max(roundToInt, C44846m16.m26474h(ou34) / 2);
            if (num != null && max <= (intValue = num.intValue())) {
                max = intValue + 1;
            }
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou35, C44846m16.m26473i(ou3), max, 0.0f, 4, null);
        }
        OU3.AbstractC6015a.m92207p(abstractC6015a, ou36, A52.f130b.m116106a(), 0.0f, 2, null);
    }
}
