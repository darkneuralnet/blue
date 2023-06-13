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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aÿ\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001aõ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%\u001a\u0083\u0001\u0010-\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.\u001aE\u00106\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\u0006\u00105\u001a\u000204H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a]\u0010?\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u00105\u001a\u0002042\u0006\u0010>\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001at\u0010L\u001a\u00020\u0003*\u00020A2\u0006\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00192\u0006\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010D2\b\u0010H\u001a\u0004\u0018\u00010D2\b\u0010I\u001a\u0004\u0018\u00010D2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020)H\u0002\u001aZ\u0010N\u001a\u00020\u0003*\u00020A2\u0006\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00192\u0006\u0010M\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010D2\b\u0010H\u001a\u0004\u0018\u00010D2\b\u0010I\u001a\u0004\u0018\u00010D2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010>\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002\u001a\u0014\u0010Q\u001a\u00020\u0005*\u00020\u00052\u0006\u0010P\u001a\u00020OH\u0000\"\u001d\u0010V\u001a\u00020R8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010S\u001a\u0004\bT\u0010U\"\u001d\u0010X\u001a\u00020R8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010S\u001a\u0004\bW\u0010U\"\u001d\u0010Z\u001a\u00020R8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010S\u001a\u0004\bY\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006["}, m28432d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "LgV2;", "modifier", "", "enabled", "readOnly", "LG26;", "textStyle", "Lkotlin/Function0;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "LEu6;", "visualTransformation", "Lbl2;", "keyboardOptions", "LZk2;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "LrX2;", "interactionSource", "Lhy5;", "shape", "Ld16;", "colors", C17296a.f69688o, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZIILrX2;Lhy5;Ld16;LEt0;III)V", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZILrX2;Lhy5;Ld16;LEt0;III)V", "textField", "leading", "trailing", "", "animationProgress", "LPD3;", "paddingValues", "c", "(LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLPD3;LEt0;I)V", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lkz0;", "constraints", "i", "(IIIIIJ)I", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "h", "(IZIIIIJFLPD3;)I", "LOU3$a;", "width", "height", "LOU3;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "n", "textPlaceable", "o", "LeZ;", "indicatorBorder", "j", "Lk61;", "F", "k", "()F", "FirstBaselineOffset", "l", "TextFieldBottomPadding", "m", "TextFieldTopPadding", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,929:1\n76#2:930\n76#2:940\n76#2:948\n76#2:958\n76#2:976\n76#2:978\n76#2:1007\n76#2:1044\n76#2:1088\n76#2:1126\n25#3:931\n25#3:941\n25#3:949\n25#3:959\n67#3,3:966\n66#3:969\n456#3,11:990\n460#3,13:1019\n473#3,3:1033\n460#3,13:1056\n473#3,3:1070\n460#3,13:1100\n473#3,3:1114\n460#3,13:1138\n473#3,3:1152\n467#3,3:1157\n1114#4,6:932\n1114#4,6:942\n1114#4,6:950\n1114#4,6:960\n1114#4,6:970\n658#5:938\n646#5:939\n658#5:956\n646#5:957\n74#6:977\n75#6,11:979\n75#6:1006\n76#6,11:1008\n89#6:1036\n75#6:1043\n76#6,11:1045\n89#6:1073\n75#6:1087\n76#6,11:1089\n89#6:1117\n75#6:1125\n76#6,11:1127\n89#6:1155\n88#6:1160\n68#7,5:1001\n73#7:1032\n77#7:1037\n68#7,5:1038\n73#7:1069\n77#7:1074\n67#7,6:1081\n73#7:1113\n77#7:1118\n67#7,6:1119\n73#7:1151\n77#7:1156\n58#8:1075\n58#8:1078\n154#9:1076\n211#9:1077\n154#9:1079\n211#9:1080\n154#9:1161\n154#9:1162\n154#9:1163\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n165#1:930\n241#1:940\n354#1:948\n429#1:958\n487#1:976\n488#1:978\n492#1:1007\n500#1:1044\n528#1:1088\n530#1:1126\n177#1:931\n252#1:941\n366#1:949\n440#1:959\n484#1:966,3\n484#1:969\n488#1:990,11\n492#1:1019,13\n492#1:1033,3\n500#1:1056,13\n500#1:1070,3\n528#1:1100,13\n528#1:1114,3\n530#1:1138,13\n530#1:1152,3\n488#1:1157,3\n177#1:932,6\n252#1:942,6\n366#1:950,6\n440#1:960,6\n484#1:970,6\n183#1:938\n183#1:939\n371#1:956\n371#1:957\n488#1:977\n488#1:979,11\n492#1:1006\n492#1:1008,11\n492#1:1036\n500#1:1043\n500#1:1045,11\n500#1:1073\n528#1:1087\n528#1:1089,11\n528#1:1117\n530#1:1125\n530#1:1127,11\n530#1:1155\n488#1:1160\n492#1:1001,5\n492#1:1032\n492#1:1037\n500#1:1038,5\n500#1:1069\n500#1:1074\n528#1:1081,6\n528#1:1113\n528#1:1118\n530#1:1119,6\n530#1:1151\n530#1:1156\n512#1:1075\n519#1:1078\n513#1:1076\n512#1:1077\n519#1:1079\n519#1:1080\n922#1:1161\n925#1:1162\n929#1:1163\n*E\n"})
/* renamed from: q16 */
/* loaded from: classes.dex */
public final class C47218q16 {

    /* renamed from: a */
    public static final float f104492a = C43705k61.m29303g(20);

    /* renamed from: b */
    public static final float f104493b = C43705k61.m29303g(10);

    /* renamed from: c */
    public static final float f104494c = C43705k61.m29303g(4);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q16$a */
    /* loaded from: classes.dex */
    public static final class C27451a extends Lambda implements Function3<Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f104495g;

        /* renamed from: h */
        public final /* synthetic */ boolean f104496h;

        /* renamed from: i */
        public final /* synthetic */ boolean f104497i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32735Eu6 f104498j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48104rX2 f104499k;

        /* renamed from: l */
        public final /* synthetic */ boolean f104500l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104501m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104502n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104503o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104504p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC39510d16 f104505q;

        /* renamed from: r */
        public final /* synthetic */ int f104506r;

        /* renamed from: s */
        public final /* synthetic */ int f104507s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27451a(String str, boolean z, boolean z2, InterfaceC32735Eu6 interfaceC32735Eu6, InterfaceC48104rX2 interfaceC48104rX2, boolean z3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, InterfaceC39510d16 interfaceC39510d16, int i, int i2) {
            super(3);
            this.f104495g = str;
            this.f104496h = z;
            this.f104497i = z2;
            this.f104498j = interfaceC32735Eu6;
            this.f104499k = interfaceC48104rX2;
            this.f104500l = z3;
            this.f104501m = function2;
            this.f104502n = function22;
            this.f104503o = function23;
            this.f104504p = function24;
            this.f104505q = interfaceC39510d16;
            this.f104506r = i;
            this.f104507s = i2;
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
                C35528Qt0.m87816Z(989834338, i2, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:209)");
            }
            C41288g16 c41288g16 = C41288g16.f81350a;
            String str = this.f104495g;
            boolean z = this.f104496h;
            boolean z2 = this.f104497i;
            InterfaceC32735Eu6 interfaceC32735Eu6 = this.f104498j;
            InterfaceC48104rX2 interfaceC48104rX2 = this.f104499k;
            boolean z3 = this.f104500l;
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f104501m;
            Function2<InterfaceC32720Et0, Integer, Unit> function22 = this.f104502n;
            Function2<InterfaceC32720Et0, Integer, Unit> function23 = this.f104503o;
            Function2<InterfaceC32720Et0, Integer, Unit> function24 = this.f104504p;
            InterfaceC39510d16 interfaceC39510d16 = this.f104505q;
            int i3 = i2;
            int i4 = this.f104506r;
            int i5 = this.f104507s;
            c41288g16.m40297c(str, innerTextField, z, z2, interfaceC32735Eu6, interfaceC48104rX2, z3, function2, function22, function23, function24, interfaceC39510d16, null, interfaceC32720Et0, ((i5 >> 3) & 7168) | (i4 & 14) | ((i3 << 3) & 112) | ((i4 >> 3) & 896) | ((i5 << 9) & 57344) | ((i5 >> 6) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i5 << 18) & 3670016) | ((i4 << 3) & 29360128) | ((i4 << 3) & 234881024) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | 3072 | ((i5 >> 24) & 112), 4096);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q16$b */
    /* loaded from: classes.dex */
    public static final class C27452b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: A */
        public final /* synthetic */ int f104508A;

        /* renamed from: B */
        public final /* synthetic */ int f104509B;

        /* renamed from: C */
        public final /* synthetic */ int f104510C;

        /* renamed from: g */
        public final /* synthetic */ String f104511g;

        /* renamed from: h */
        public final /* synthetic */ Function1<String, Unit> f104512h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f104513i;

        /* renamed from: j */
        public final /* synthetic */ boolean f104514j;

        /* renamed from: k */
        public final /* synthetic */ boolean f104515k;

        /* renamed from: l */
        public final /* synthetic */ G26 f104516l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104517m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104518n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104519o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104520p;

        /* renamed from: q */
        public final /* synthetic */ boolean f104521q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC32735Eu6 f104522r;

        /* renamed from: s */
        public final /* synthetic */ C38736bl2 f104523s;

        /* renamed from: t */
        public final /* synthetic */ C37555Zk2 f104524t;

        /* renamed from: u */
        public final /* synthetic */ boolean f104525u;

        /* renamed from: v */
        public final /* synthetic */ int f104526v;

        /* renamed from: w */
        public final /* synthetic */ int f104527w;

        /* renamed from: x */
        public final /* synthetic */ InterfaceC48104rX2 f104528x;

        /* renamed from: y */
        public final /* synthetic */ InterfaceC42444hy5 f104529y;

        /* renamed from: z */
        public final /* synthetic */ InterfaceC39510d16 f104530z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27452b(String str, Function1<? super String, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, int i2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, int i3, int i4, int i5) {
            super(2);
            this.f104511g = str;
            this.f104512h = function1;
            this.f104513i = interfaceC41563gV2;
            this.f104514j = z;
            this.f104515k = z2;
            this.f104516l = g26;
            this.f104517m = function2;
            this.f104518n = function22;
            this.f104519o = function23;
            this.f104520p = function24;
            this.f104521q = z3;
            this.f104522r = interfaceC32735Eu6;
            this.f104523s = c38736bl2;
            this.f104524t = c37555Zk2;
            this.f104525u = z4;
            this.f104526v = i;
            this.f104527w = i2;
            this.f104528x = interfaceC48104rX2;
            this.f104529y = interfaceC42444hy5;
            this.f104530z = interfaceC39510d16;
            this.f104508A = i3;
            this.f104509B = i4;
            this.f104510C = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47218q16.m18304a(this.f104511g, this.f104512h, this.f104513i, this.f104514j, this.f104515k, this.f104516l, this.f104517m, this.f104518n, this.f104519o, this.f104520p, this.f104521q, this.f104522r, this.f104523s, this.f104524t, this.f104525u, this.f104526v, this.f104527w, this.f104528x, this.f104529y, this.f104530z, interfaceC32720Et0, C47127ps4.m18626a(this.f104508A | 1), C47127ps4.m18626a(this.f104509B), this.f104510C);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q16$c */
    /* loaded from: classes.dex */
    public static final class C27453c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: A */
        public final /* synthetic */ int f104531A;

        /* renamed from: B */
        public final /* synthetic */ int f104532B;

        /* renamed from: g */
        public final /* synthetic */ String f104533g;

        /* renamed from: h */
        public final /* synthetic */ Function1<String, Unit> f104534h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f104535i;

        /* renamed from: j */
        public final /* synthetic */ boolean f104536j;

        /* renamed from: k */
        public final /* synthetic */ boolean f104537k;

        /* renamed from: l */
        public final /* synthetic */ G26 f104538l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104539m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104540n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104541o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104542p;

        /* renamed from: q */
        public final /* synthetic */ boolean f104543q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC32735Eu6 f104544r;

        /* renamed from: s */
        public final /* synthetic */ C38736bl2 f104545s;

        /* renamed from: t */
        public final /* synthetic */ C37555Zk2 f104546t;

        /* renamed from: u */
        public final /* synthetic */ boolean f104547u;

        /* renamed from: v */
        public final /* synthetic */ int f104548v;

        /* renamed from: w */
        public final /* synthetic */ InterfaceC48104rX2 f104549w;

        /* renamed from: x */
        public final /* synthetic */ InterfaceC42444hy5 f104550x;

        /* renamed from: y */
        public final /* synthetic */ InterfaceC39510d16 f104551y;

        /* renamed from: z */
        public final /* synthetic */ int f104552z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27453c(String str, Function1<? super String, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, int i2, int i3, int i4) {
            super(2);
            this.f104533g = str;
            this.f104534h = function1;
            this.f104535i = interfaceC41563gV2;
            this.f104536j = z;
            this.f104537k = z2;
            this.f104538l = g26;
            this.f104539m = function2;
            this.f104540n = function22;
            this.f104541o = function23;
            this.f104542p = function24;
            this.f104543q = z3;
            this.f104544r = interfaceC32735Eu6;
            this.f104545s = c38736bl2;
            this.f104546t = c37555Zk2;
            this.f104547u = z4;
            this.f104548v = i;
            this.f104549w = interfaceC48104rX2;
            this.f104550x = interfaceC42444hy5;
            this.f104551y = interfaceC39510d16;
            this.f104552z = i2;
            this.f104531A = i3;
            this.f104532B = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47218q16.m18303b(this.f104533g, this.f104534h, this.f104535i, this.f104536j, this.f104537k, this.f104538l, this.f104539m, this.f104540n, this.f104541o, this.f104542p, this.f104543q, this.f104544r, this.f104545s, this.f104546t, this.f104547u, this.f104548v, this.f104549w, this.f104550x, this.f104551y, interfaceC32720Et0, C47127ps4.m18626a(this.f104552z | 1), C47127ps4.m18626a(this.f104531A), this.f104532B);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q16$d */
    /* loaded from: classes.dex */
    public static final class C27454d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f104553g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104554h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104555i;

        /* renamed from: j */
        public final /* synthetic */ Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> f104556j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104557k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f104558l;

        /* renamed from: m */
        public final /* synthetic */ boolean f104559m;

        /* renamed from: n */
        public final /* synthetic */ float f104560n;

        /* renamed from: o */
        public final /* synthetic */ PD3 f104561o;

        /* renamed from: p */
        public final /* synthetic */ int f104562p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27454d(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z, float f, PD3 pd3, int i) {
            super(2);
            this.f104553g = interfaceC41563gV2;
            this.f104554h = function2;
            this.f104555i = function22;
            this.f104556j = function3;
            this.f104557k = function23;
            this.f104558l = function24;
            this.f104559m = z;
            this.f104560n = f;
            this.f104561o = pd3;
            this.f104562p = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47218q16.m18302c(this.f104553g, this.f104554h, this.f104555i, this.f104556j, this.f104557k, this.f104558l, this.f104559m, this.f104560n, this.f104561o, interfaceC32720Et0, C47127ps4.m18626a(this.f104562p | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: q16$e */
    /* loaded from: classes.dex */
    public static final class C27455e extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f104563g;

        /* renamed from: h */
        public final /* synthetic */ C20064eZ f104564h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27455e(float f, C20064eZ c20064eZ) {
            super(1);
            this.f104563g = f;
            this.f104564h = c20064eZ;
        }

        /* renamed from: a */
        public final void m18289a(InterfaceC42558iA0 drawWithContent) {
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            drawWithContent.mo34387n0();
            if (C43705k61.m29301i(this.f104563g, C43705k61.f93903c.m29297a())) {
                return;
            }
            float mo3408b = this.f104563g * drawWithContent.mo3408b();
            float m5732g = C51465xB5.m5732g(drawWithContent.mo96360h()) - (mo3408b / 2);
            I61.m102946f0(drawWithContent, this.f104564h.m42792a(), C33056Ge3.m104938a(0.0f, m5732g), C33056Ge3.m104938a(C51465xB5.m5730i(drawWithContent.mo96360h()), m5732g), mo3408b, 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m18289a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:463:0x01b1, code lost:
        if (r7.mo89539n(r87) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:357:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:641:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18304a(String value, Function1<? super String, Unit> onValueChange, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, int i2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4, int i5) {
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
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z7;
        int i26;
        boolean z8;
        InterfaceC39510d16 interfaceC39510d162;
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
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1504264404);
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
                                interfaceC42444hy52 = KC0.m99105c(TM2.f35372a.m83730b(mo89518u, 6).m109564e(), null, null, PC0.m90594d(), PC0.m90594d(), 3, null);
                                i24 = (-234881025) & i21;
                            } else {
                                g263 = g262;
                                interfaceC42444hy52 = interfaceC42444hy5;
                                i24 = i21;
                            }
                            if ((i5 & 524288) == 0) {
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
                                interfaceC42444hy53 = interfaceC42444hy52;
                                interfaceC41563gV22 = interfaceC41563gV24;
                                z7 = z13;
                                i26 = i24 & (-1879048193);
                                z8 = z14;
                                interfaceC39510d162 = C41288g16.f81350a.m40288l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mo89518u, 0, 0, 48, 2097151);
                            } else {
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
                                interfaceC42444hy53 = interfaceC42444hy52;
                                interfaceC41563gV22 = interfaceC41563gV24;
                                z7 = z13;
                                i26 = i24;
                                z8 = z14;
                                interfaceC39510d162 = interfaceC39510d16;
                            }
                        }
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-1504264404, i25, i26, "androidx.compose.material.TextField (TextField.kt:158)");
                        }
                        mo89518u.mo89638F(-833027253);
                        m105915j = g264.m105915j();
                        if (!(m105915j != C47063pm0.f104050b.m18726g())) {
                            m105915j = interfaceC39510d162.mo44709j(z7, mo89518u, ((i25 >> 9) & 14) | ((i26 >> 24) & 112)).getValue().m18733w();
                        }
                        mo89518u.mo89605Q();
                        G26 m105927J = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
                        C41288g16 c41288g16 = C41288g16.f81350a;
                        int i32 = (i26 >> 24) & 112;
                        int i33 = i25;
                        boolean z16 = z7;
                        InterfaceC41563gV2 interfaceC41563gV25 = interfaceC41563gV22;
                        int i34 = i26 << 12;
                        InterfaceC39510d16 interfaceC39510d164 = interfaceC39510d162;
                        InterfaceC42444hy5 interfaceC42444hy55 = interfaceC42444hy53;
                        interfaceC32720Et02 = mo89518u;
                        boolean z17 = z8;
                        G26 g266 = g264;
                        boolean z18 = z7;
                        C7683TE.m84175c(value, onValueChange, BB5.m114262g(C41288g16.m40292h(c41288g16, C13342bw.m62125c(interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i32).getValue().m18733w(), interfaceC42444hy53), z16, z8, interfaceC48104rX23, interfaceC39510d162, 0.0f, 0.0f, 48, null), c41288g16.m40295e(), c41288g16.m40296d()), z7, z5, m105927J, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, (i26 & 14) | i32).getValue().m18733w(), null), C43575jt0.m29791b(mo89518u, 989834338, true, new C27451a(value, z16, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i33, i26)), interfaceC32720Et02, (i33 & 14) | (i33 & 112) | (i33 & 7168) | (i33 & 57344) | (i34 & 3670016) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
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
                        interfaceC42444hy54 = interfaceC42444hy55;
                        z10 = z17;
                        g265 = g266;
                        z11 = z18;
                        z12 = z5;
                        function212 = function25;
                        i27 = i22;
                        i28 = i23;
                    }
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new C27452b(value, onValueChange, interfaceC41563gV23, z11, z12, g265, function212, function29, function210, function211, z10, interfaceC32735Eu63, c38736bl23, c37555Zk24, z9, i27, i28, interfaceC48104rX24, interfaceC42444hy54, interfaceC39510d163, i3, i4, i5));
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
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(-833027253);
                m105915j = g264.m105915j();
                if (!(m105915j != C47063pm0.f104050b.m18726g())) {
                }
                mo89518u.mo89605Q();
                G26 m105927J2 = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
                C41288g16 c41288g162 = C41288g16.f81350a;
                int i322 = (i26 >> 24) & 112;
                int i332 = i25;
                boolean z162 = z7;
                InterfaceC41563gV2 interfaceC41563gV252 = interfaceC41563gV22;
                int i342 = i26 << 12;
                InterfaceC39510d16 interfaceC39510d1642 = interfaceC39510d162;
                InterfaceC42444hy5 interfaceC42444hy552 = interfaceC42444hy53;
                interfaceC32720Et02 = mo89518u;
                boolean z172 = z8;
                G26 g2662 = g264;
                boolean z182 = z7;
                C7683TE.m84175c(value, onValueChange, BB5.m114262g(C41288g16.m40292h(c41288g162, C13342bw.m62125c(interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i322).getValue().m18733w(), interfaceC42444hy53), z162, z8, interfaceC48104rX23, interfaceC39510d162, 0.0f, 0.0f, 48, null), c41288g162.m40295e(), c41288g162.m40296d()), z7, z5, m105927J2, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, (i26 & 14) | i322).getValue().m18733w(), null), C43575jt0.m29791b(mo89518u, 989834338, true, new C27451a(value, z162, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i332, i26)), interfaceC32720Et02, (i332 & 14) | (i332 & 112) | (i332 & 7168) | (i332 & 57344) | (i342 & 3670016) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
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
                interfaceC42444hy54 = interfaceC42444hy552;
                z10 = z172;
                g265 = g2662;
                z11 = z182;
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
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(-833027253);
            m105915j = g264.m105915j();
            if (!(m105915j != C47063pm0.f104050b.m18726g())) {
            }
            mo89518u.mo89605Q();
            G26 m105927J22 = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
            C41288g16 c41288g1622 = C41288g16.f81350a;
            int i3222 = (i26 >> 24) & 112;
            int i3322 = i25;
            boolean z1622 = z7;
            InterfaceC41563gV2 interfaceC41563gV2522 = interfaceC41563gV22;
            int i3422 = i26 << 12;
            InterfaceC39510d16 interfaceC39510d16422 = interfaceC39510d162;
            InterfaceC42444hy5 interfaceC42444hy5522 = interfaceC42444hy53;
            interfaceC32720Et02 = mo89518u;
            boolean z1722 = z8;
            G26 g26622 = g264;
            boolean z1822 = z7;
            C7683TE.m84175c(value, onValueChange, BB5.m114262g(C41288g16.m40292h(c41288g1622, C13342bw.m62125c(interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i3222).getValue().m18733w(), interfaceC42444hy53), z1622, z8, interfaceC48104rX23, interfaceC39510d162, 0.0f, 0.0f, 48, null), c41288g1622.m40295e(), c41288g1622.m40296d()), z7, z5, m105927J22, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, (i26 & 14) | i3222).getValue().m18733w(), null), C43575jt0.m29791b(mo89518u, 989834338, true, new C27451a(value, z1622, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i3322, i26)), interfaceC32720Et02, (i3322 & 14) | (i3322 & 112) | (i3322 & 7168) | (i3322 & 57344) | (i3422 & 3670016) | (29360128 & i3422) | (234881024 & i3422) | (i3422 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
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
            interfaceC42444hy54 = interfaceC42444hy5522;
            z10 = z1722;
            g265 = g26622;
            z11 = z1822;
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
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-833027253);
        m105915j = g264.m105915j();
        if (!(m105915j != C47063pm0.f104050b.m18726g())) {
        }
        mo89518u.mo89605Q();
        G26 m105927J222 = g264.m105927J(new G26(m105915j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
        C41288g16 c41288g16222 = C41288g16.f81350a;
        int i32222 = (i26 >> 24) & 112;
        int i33222 = i25;
        boolean z16222 = z7;
        InterfaceC41563gV2 interfaceC41563gV25222 = interfaceC41563gV22;
        int i34222 = i26 << 12;
        InterfaceC39510d16 interfaceC39510d164222 = interfaceC39510d162;
        InterfaceC42444hy5 interfaceC42444hy55222 = interfaceC42444hy53;
        interfaceC32720Et02 = mo89518u;
        boolean z17222 = z8;
        G26 g266222 = g264;
        boolean z18222 = z7;
        C7683TE.m84175c(value, onValueChange, BB5.m114262g(C41288g16.m40292h(c41288g16222, C13342bw.m62125c(interfaceC41563gV22, interfaceC39510d162.mo44716a(z7, mo89518u, ((i25 >> 9) & 14) | i32222).getValue().m18733w(), interfaceC42444hy53), z16222, z8, interfaceC48104rX23, interfaceC39510d162, 0.0f, 0.0f, 48, null), c41288g16222.m40295e(), c41288g16222.m40296d()), z7, z5, m105927J222, c38736bl22, c37555Zk23, z6, i22, i23, interfaceC32735Eu62, null, interfaceC48104rX23, new C46831pN5(interfaceC39510d162.mo44712g(z8, mo89518u, (i26 & 14) | i32222).getValue().m18733w(), null), C43575jt0.m29791b(mo89518u, 989834338, true, new C27451a(value, z16222, z6, interfaceC32735Eu62, interfaceC48104rX23, z8, function25, function28, function26, function27, interfaceC39510d162, i33222, i26)), interfaceC32720Et02, (i33222 & 14) | (i33222 & 112) | (i33222 & 7168) | (i33222 & 57344) | (i34222 & 3670016) | (29360128 & i34222) | (234881024 & i34222) | (i34222 & 1879048192), ((i26 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
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
        interfaceC42444hy54 = interfaceC42444hy55222;
        z10 = z17222;
        g265 = g266222;
        z11 = z18222;
        z12 = z5;
        function212 = function25;
        i27 = i22;
        i28 = i23;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:440:0x01af, code lost:
        if (r10.mo89539n(r85) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:334:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:595:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m18303b(String value, Function1 onValueChange, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, G26 g26, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, InterfaceC32735Eu6 interfaceC32735Eu6, C38736bl2 c38736bl2, C37555Zk2 c37555Zk2, boolean z4, int i, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC39510d16 interfaceC39510d16, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3, int i4) {
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
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1690895095);
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
                                interfaceC42444hy52 = KC0.m99105c(TM2.f35372a.m83730b(mo89518u, 6).m109564e(), null, null, PC0.m90594d(), PC0.m90594d(), 3, null);
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
                                interfaceC39510d162 = C41288g16.f81350a.m40288l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mo89518u, 0, 0, 48, 2097151);
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
                            C35528Qt0.m87816Z(-1690895095, i5, i23, "androidx.compose.material.TextField (TextField.kt:234)");
                        }
                        int i25 = i23 << 3;
                        interfaceC32720Et02 = mo89518u;
                        m18304a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & ImageMetadata.JPEG_GPS_COORDINATES) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), 0);
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
                    mo89512w.mo20405a(new C27453c(value, onValueChange, interfaceC41563gV23, z9, z10, g264, function213, function210, function211, function212, z11, interfaceC32735Eu63, c38736bl23, c37555Zk24, z12, i20, interfaceC48104rX25, interfaceC42444hy54, interfaceC39510d163, i2, i3, i4));
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
                m18304a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & ImageMetadata.JPEG_GPS_COORDINATES) | (i252 & 29360128) | (i252 & 234881024) | (i252 & 1879048192), 0);
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
            m18304a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i232 & 14) | (i232 & 112) | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & ImageMetadata.JPEG_GPS_COORDINATES) | (i2522 & 29360128) | (i2522 & 234881024) | (i2522 & 1879048192), 0);
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
        m18304a(value, onValueChange, interfaceC41563gV22, z6, z7, g263, function25, function29, function27, function28, z5, interfaceC32735Eu62, c38736bl22, c37555Zk23, z8, i19, 1, interfaceC48104rX24, interfaceC42444hy53, interfaceC39510d162, interfaceC32720Et02, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i2322 & 14) | (i2322 & 112) | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & ImageMetadata.JPEG_GPS_COORDINATES) | (i25222 & 29360128) | (i25222 & 234881024) | (i25222 & 1879048192), 0);
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
    public static final void m18302c(InterfaceC41563gV2 modifier, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> textField, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, boolean z, float f, PD3 paddingValues, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float coerceAtLeast;
        float coerceAtLeast2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2112507061);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89539n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo89518u.mo89629I(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo89518u.mo89629I(function2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= mo89518u.mo89629I(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= mo89518u.mo89629I(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= mo89518u.mo89629I(function23) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= mo89518u.mo89536o(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= mo89518u.mo89533p(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= mo89518u.mo89539n(paddingValues) ? 67108864 : 33554432;
        }
        if ((191739611 & i2) == 38347922 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:472)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            mo89518u.mo89638F(1618982084);
            boolean mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(valueOf2) | mo89518u.mo89539n(paddingValues);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C47811r16(z, f, paddingValues);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C47811r16 c47811r16 = (C47811r16) mo89635G;
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(modifier);
            int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
            C38680bf6.m64191b(m64192a, c47811r16, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i3 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(254819681);
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
                function22.invoke(mo89518u, Integer.valueOf((i2 >> 12) & 14));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            }
            mo89518u.mo89605Q();
            mo89518u.mo89638F(254819966);
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
                function23.invoke(mo89518u, Integer.valueOf((i2 >> 15) & 14));
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
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(C43705k61.m29303g(m94186g - C44846m16.m26479c()), C43705k61.m29303g(0));
                m94186g = C43705k61.m29303g(coerceAtLeast2);
            }
            float f2 = m94186g;
            if (function23 != null) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(C43705k61.m29303g(m94187f - C44846m16.m26479c()), C43705k61.m29303g(0));
                m94187f = C43705k61.m29303g(coerceAtLeast);
            }
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, f2, 0.0f, m94187f, 0.0f, 10, null);
            mo89518u.mo89638F(254820977);
            if (function3 != null) {
                function3.invoke(C11335a.m68614b(c20912a, "Hint").mo39266t0(m94180m), mo89518u, Integer.valueOf((i2 >> 6) & 112));
            }
            mo89518u.mo89605Q();
            mo89518u.mo89638F(254821106);
            if (function2 != null) {
                InterfaceC41563gV2 mo39266t03 = C11335a.m68614b(c20912a, "Label").mo39266t0(m94180m);
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h3 = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, 0);
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
                function2.invoke(mo89518u, Integer.valueOf((i2 >> 6) & 14));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 mo39266t04 = C11335a.m68614b(c20912a, "TextField").mo39266t0(m94180m);
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h4 = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), true, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g015 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm26 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq65 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a5 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a5 = C31723Am2.m115273a(mo39266t04);
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
            C40689f10 c40689f104 = C40689f10.f79291a;
            textField.invoke(mo89518u, Integer.valueOf((i2 >> 3) & 14));
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
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new C27454d(modifier, textField, function2, function3, function22, function23, z, f, paddingValues, i));
    }

    /* renamed from: h */
    public static final int m18297h(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PD3 pd3) {
        float f2;
        int roundToInt;
        float f3 = f104494c * f;
        float mo88732d = pd3.mo88732d() * f;
        float mo88735a = pd3.mo88735a() * f;
        int max = Math.max(i, i5);
        if (z) {
            f2 = i2 + f3 + max + mo88735a;
        } else {
            f2 = mo88732d + max + mo88735a;
        }
        roundToInt = MathKt__MathJVMKt.roundToInt(f2);
        return Math.max(roundToInt, Math.max(Math.max(i3, i4), C44228kz0.m28062o(j)));
    }

    /* renamed from: i */
    public static final int m18296i(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, C44228kz0.m28061p(j));
    }

    /* renamed from: j */
    public static final InterfaceC41563gV2 m18295j(InterfaceC41563gV2 interfaceC41563gV2, C20064eZ indicatorBorder) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        return C11289a.m68865c(interfaceC41563gV2, new C27455e(indicatorBorder.m42791b(), indicatorBorder));
    }

    /* renamed from: k */
    public static final float m18294k() {
        return f104492a;
    }

    /* renamed from: l */
    public static final float m18293l() {
        return f104493b;
    }

    /* renamed from: m */
    public static final float m18292m() {
        return f104494c;
    }

    /* renamed from: n */
    public static final void m18291n(OU3.AbstractC6015a abstractC6015a, int i, int i2, OU3 ou3, OU3 ou32, OU3 ou33, OU3 ou34, OU3 ou35, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        int roundToInt2;
        if (ou34 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou34, 0, InterfaceC4360K9.f19170a.m99138h().mo99130a(ou34.m92229d1(), i2), 0.0f, 4, null);
        }
        if (ou35 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou35, i - ou35.m92226i1(), InterfaceC4360K9.f19170a.m99138h().mo99130a(ou35.m92229d1(), i2), 0.0f, 4, null);
        }
        if (ou32 != null) {
            if (!z) {
                roundToInt = MathKt__MathJVMKt.roundToInt(C44846m16.m26476f() * f2);
            } else {
                roundToInt = InterfaceC4360K9.f19170a.m99138h().mo99130a(ou32.m92229d1(), i2);
            }
            roundToInt2 = MathKt__MathJVMKt.roundToInt((roundToInt - i3) * f);
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou32, C44846m16.m26473i(ou34), roundToInt - roundToInt2, 0.0f, 4, null);
        }
        OU3.AbstractC6015a.m92205r(abstractC6015a, ou3, C44846m16.m26473i(ou34), i4, 0.0f, 4, null);
        if (ou33 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou33, C44846m16.m26473i(ou34), i4, 0.0f, 4, null);
        }
    }

    /* renamed from: o */
    public static final void m18290o(OU3.AbstractC6015a abstractC6015a, int i, int i2, OU3 ou3, OU3 ou32, OU3 ou33, OU3 ou34, boolean z, float f, PD3 pd3) {
        int roundToInt;
        int i3;
        roundToInt = MathKt__MathJVMKt.roundToInt(pd3.mo88732d() * f);
        if (ou33 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou33, 0, InterfaceC4360K9.f19170a.m99138h().mo99130a(ou33.m92229d1(), i2), 0.0f, 4, null);
        }
        if (ou34 != null) {
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou34, i - ou34.m92226i1(), InterfaceC4360K9.f19170a.m99138h().mo99130a(ou34.m92229d1(), i2), 0.0f, 4, null);
        }
        if (z) {
            i3 = InterfaceC4360K9.f19170a.m99138h().mo99130a(ou3.m92229d1(), i2);
        } else {
            i3 = roundToInt;
        }
        OU3.AbstractC6015a.m92205r(abstractC6015a, ou3, C44846m16.m26473i(ou33), i3, 0.0f, 4, null);
        if (ou32 != null) {
            if (z) {
                roundToInt = InterfaceC4360K9.f19170a.m99138h().mo99130a(ou32.m92229d1(), i2);
            }
            OU3.AbstractC6015a.m92205r(abstractC6015a, ou32, C44846m16.m26473i(ou33), roundToInt, 0.0f, 4, null);
        }
    }
}
