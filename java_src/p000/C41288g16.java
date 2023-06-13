package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bZ\u0010[JM\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJS\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ=\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001cJç\u0001\u00105\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\u001f2\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010(\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020\u001f2\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u001f2\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010.\u001a\u00020\u001f2\b\b\u0002\u0010/\u001a\u00020\u001f2\b\b\u0002\u00100\u001a\u00020\u001f2\b\b\u0002\u00101\u001a\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\u001f2\b\b\u0002\u00103\u001a\u00020\u001f2\b\b\u0002\u00104\u001a\u00020\u001fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106Jç\u0001\u0010;\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u00107\u001a\u00020\u001f2\b\b\u0002\u00108\u001a\u00020\u001f2\b\b\u0002\u00109\u001a\u00020\u001f2\b\b\u0002\u0010:\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020\u001f2\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u001f2\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010.\u001a\u00020\u001f2\b\b\u0002\u0010/\u001a\u00020\u001f2\b\b\u0002\u00100\u001a\u00020\u001f2\b\b\u0002\u00101\u001a\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\u001f2\b\b\u0002\u00103\u001a\u00020\u001f2\b\b\u0002\u00104\u001a\u00020\u001fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u00106J«\u0001\u0010H\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130>2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010G\u001a\u00020\u001aH\u0007¢\u0006\u0004\bH\u0010IJ»\u0001\u0010K\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130>2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010G\u001a\u00020\u001a2\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130>H\u0007¢\u0006\u0004\bK\u0010LR \u0010P\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010M\u001a\u0004\bN\u0010OR \u0010R\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bH\u0010M\u001a\u0004\bQ\u0010OR \u0010T\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010M\u001a\u0004\bS\u0010OR \u0010V\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bU\u0010OR\u0011\u0010Y\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\\"}, m28432d2 = {"Lg16;", "", "LgV2;", "", "enabled", "isError", "Le62;", "interactionSource", "Ld16;", "colors", "Lk61;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "g", "(LgV2;ZZLe62;Ld16;FF)LgV2;", "Lhy5;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "", C17296a.f69688o, "(ZZLe62;Ld16;Lhy5;FFLEt0;II)V", "start", "end", "top", "bottom", "LPD3;", "m", "(FFFF)LPD3;", "o", "j", "Lpm0;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "l", "(JJJJJJJJJJJJJJJJJJJJJLEt0;IIII)Ld16;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "i", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "LEu6;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLEu6;Le62;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;LPD3;LEt0;III)V", "border", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLEu6;Le62;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;LPD3;Lkotlin/jvm/functions/Function2;LEt0;III)V", "F", DateTokenConverter.CONVERTER_KEY, "()F", "MinHeight", "e", "MinWidth", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "f", "(LEt0;I)Lhy5;", "OutlinedTextFieldShape", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,855:1\n135#2:856\n76#3:857\n76#3:858\n154#4:859\n154#4:860\n154#4:861\n154#4:862\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n273#1:856\n378#1:857\n436#1:858\n196#1:859\n202#1:860\n231#1:861\n237#1:862\n*E\n"})
/* renamed from: g16 */
/* loaded from: classes.dex */
public final class C41288g16 {

    /* renamed from: a */
    public static final C41288g16 f81350a = new C41288g16();

    /* renamed from: b */
    public static final float f81351b = C43705k61.m29303g(56);

    /* renamed from: c */
    public static final float f81352c = C43705k61.m29303g(280);

    /* renamed from: d */
    public static final float f81353d = C43705k61.m29303g(1);

    /* renamed from: e */
    public static final float f81354e = C43705k61.m29303g(2);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g16$a */
    /* loaded from: classes.dex */
    public static final class C20688a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f81356h;

        /* renamed from: i */
        public final /* synthetic */ boolean f81357i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC40148e62 f81358j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC39510d16 f81359k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC42444hy5 f81360l;

        /* renamed from: m */
        public final /* synthetic */ float f81361m;

        /* renamed from: n */
        public final /* synthetic */ float f81362n;

        /* renamed from: o */
        public final /* synthetic */ int f81363o;

        /* renamed from: p */
        public final /* synthetic */ int f81364p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20688a(boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, InterfaceC42444hy5 interfaceC42444hy5, float f, float f2, int i, int i2) {
            super(2);
            C41288g16.this = r1;
            this.f81356h = z;
            this.f81357i = z2;
            this.f81358j = interfaceC40148e62;
            this.f81359k = interfaceC39510d16;
            this.f81360l = interfaceC42444hy5;
            this.f81361m = f;
            this.f81362n = f2;
            this.f81363o = i;
            this.f81364p = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C41288g16.this.m40299a(this.f81356h, this.f81357i, this.f81358j, this.f81359k, this.f81360l, this.f81361m, this.f81362n, interfaceC32720Et0, C47127ps4.m18626a(this.f81363o | 1), this.f81364p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g16$b */
    /* loaded from: classes.dex */
    public static final class C20689b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f81365g;

        /* renamed from: h */
        public final /* synthetic */ boolean f81366h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40148e62 f81367i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC39510d16 f81368j;

        /* renamed from: k */
        public final /* synthetic */ int f81369k;

        /* renamed from: l */
        public final /* synthetic */ int f81370l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20689b(boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, int i, int i2) {
            super(2);
            this.f81365g = z;
            this.f81366h = z2;
            this.f81367i = interfaceC40148e62;
            this.f81368j = interfaceC39510d16;
            this.f81369k = i;
            this.f81370l = i2;
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
                C35528Qt0.m87816Z(1261916269, i, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:648)");
            }
            C41288g16 c41288g16 = C41288g16.f81350a;
            boolean z = this.f81365g;
            boolean z2 = this.f81366h;
            InterfaceC40148e62 interfaceC40148e62 = this.f81367i;
            InterfaceC39510d16 interfaceC39510d16 = this.f81368j;
            int i2 = this.f81369k;
            c41288g16.m40299a(z, z2, interfaceC40148e62, interfaceC39510d16, null, 0.0f, 0.0f, interfaceC32720Et0, ((i2 >> 9) & 896) | ((i2 >> 6) & 14) | 12582912 | ((i2 >> 15) & 112) | ((this.f81370l << 6) & 7168), 112);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g16$c */
    /* loaded from: classes.dex */
    public static final class C20690c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f81372h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81373i;

        /* renamed from: j */
        public final /* synthetic */ boolean f81374j;

        /* renamed from: k */
        public final /* synthetic */ boolean f81375k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC32735Eu6 f81376l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC40148e62 f81377m;

        /* renamed from: n */
        public final /* synthetic */ boolean f81378n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81379o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81380p;

        /* renamed from: q */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81381q;

        /* renamed from: r */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81382r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC39510d16 f81383s;

        /* renamed from: t */
        public final /* synthetic */ PD3 f81384t;

        /* renamed from: u */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81385u;

        /* renamed from: v */
        public final /* synthetic */ int f81386v;

        /* renamed from: w */
        public final /* synthetic */ int f81387w;

        /* renamed from: x */
        public final /* synthetic */ int f81388x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20690c(String str, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, boolean z, boolean z2, InterfaceC32735Eu6 interfaceC32735Eu6, InterfaceC40148e62 interfaceC40148e62, boolean z3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, InterfaceC39510d16 interfaceC39510d16, PD3 pd3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26, int i, int i2, int i3) {
            super(2);
            C41288g16.this = r3;
            this.f81372h = str;
            this.f81373i = function2;
            this.f81374j = z;
            this.f81375k = z2;
            this.f81376l = interfaceC32735Eu6;
            this.f81377m = interfaceC40148e62;
            this.f81378n = z3;
            this.f81379o = function22;
            this.f81380p = function23;
            this.f81381q = function24;
            this.f81382r = function25;
            this.f81383s = interfaceC39510d16;
            this.f81384t = pd3;
            this.f81385u = function26;
            this.f81386v = i;
            this.f81387w = i2;
            this.f81388x = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C41288g16.this.m40298b(this.f81372h, this.f81373i, this.f81374j, this.f81375k, this.f81376l, this.f81377m, this.f81378n, this.f81379o, this.f81380p, this.f81381q, this.f81382r, this.f81383s, this.f81384t, this.f81385u, interfaceC32720Et0, C47127ps4.m18626a(this.f81386v | 1), C47127ps4.m18626a(this.f81387w), this.f81388x);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g16$d */
    /* loaded from: classes.dex */
    public static final class C20691d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f81390h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81391i;

        /* renamed from: j */
        public final /* synthetic */ boolean f81392j;

        /* renamed from: k */
        public final /* synthetic */ boolean f81393k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC32735Eu6 f81394l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC40148e62 f81395m;

        /* renamed from: n */
        public final /* synthetic */ boolean f81396n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81397o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81398p;

        /* renamed from: q */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81399q;

        /* renamed from: r */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f81400r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC39510d16 f81401s;

        /* renamed from: t */
        public final /* synthetic */ PD3 f81402t;

        /* renamed from: u */
        public final /* synthetic */ int f81403u;

        /* renamed from: v */
        public final /* synthetic */ int f81404v;

        /* renamed from: w */
        public final /* synthetic */ int f81405w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20691d(String str, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, boolean z, boolean z2, InterfaceC32735Eu6 interfaceC32735Eu6, InterfaceC40148e62 interfaceC40148e62, boolean z3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, InterfaceC39510d16 interfaceC39510d16, PD3 pd3, int i, int i2, int i3) {
            super(2);
            C41288g16.this = r3;
            this.f81390h = str;
            this.f81391i = function2;
            this.f81392j = z;
            this.f81393k = z2;
            this.f81394l = interfaceC32735Eu6;
            this.f81395m = interfaceC40148e62;
            this.f81396n = z3;
            this.f81397o = function22;
            this.f81398p = function23;
            this.f81399q = function24;
            this.f81400r = function25;
            this.f81401s = interfaceC39510d16;
            this.f81402t = pd3;
            this.f81403u = i;
            this.f81404v = i2;
            this.f81405w = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C41288g16.this.m40297c(this.f81390h, this.f81391i, this.f81392j, this.f81393k, this.f81394l, this.f81395m, this.f81396n, this.f81397o, this.f81398p, this.f81399q, this.f81400r, this.f81401s, this.f81402t, interfaceC32720Et0, C47127ps4.m18626a(this.f81403u | 1), C47127ps4.m18626a(this.f81404v), this.f81405w);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g16$e */
    /* loaded from: classes.dex */
    public static final class C20692e extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f81406g;

        /* renamed from: h */
        public final /* synthetic */ boolean f81407h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40148e62 f81408i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC39510d16 f81409j;

        /* renamed from: k */
        public final /* synthetic */ float f81410k;

        /* renamed from: l */
        public final /* synthetic */ float f81411l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20692e(boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, float f, float f2) {
            super(3);
            this.f81406g = z;
            this.f81407h = z2;
            this.f81408i = interfaceC40148e62;
            this.f81409j = interfaceC39510d16;
            this.f81410k = f;
            this.f81411l = f2;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m40283a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC48627sP5 m36901b;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1398930845);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:280)");
            }
            m36901b = C41881h16.m36901b(this.f81406g, this.f81407h, this.f81408i, this.f81409j, this.f81410k, this.f81411l, interfaceC32720Et0, 0);
            InterfaceC41563gV2 m18295j = C47218q16.m18295j(InterfaceC41563gV2.f82354b0, (C20064eZ) m36901b.getValue());
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m18295j;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m40283a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n1#1,170:1\n274#2,8:171\n*E\n"})
    /* renamed from: g16$f */
    /* loaded from: classes.dex */
    public static final class C20693f extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f81412g;

        /* renamed from: h */
        public final /* synthetic */ boolean f81413h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40148e62 f81414i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC39510d16 f81415j;

        /* renamed from: k */
        public final /* synthetic */ float f81416k;

        /* renamed from: l */
        public final /* synthetic */ float f81417l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20693f(boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, float f, float f2) {
            super(1);
            this.f81412g = z;
            this.f81413h = z2;
            this.f81414i = interfaceC40148e62;
            this.f81415j = interfaceC39510d16;
            this.f81416k = f;
            this.f81417l = f2;
        }

        /* renamed from: a */
        public final void m40282a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("indicatorLine");
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f81412g));
            s42.m86038a().m104824a("isError", Boolean.valueOf(this.f81413h));
            s42.m86038a().m104824a("interactionSource", this.f81414i);
            s42.m86038a().m104824a("colors", this.f81415j);
            s42.m86038a().m104824a("focusedIndicatorLineThickness", C43705k61.m29306d(this.f81416k));
            s42.m86038a().m104824a("unfocusedIndicatorLineThickness", C43705k61.m29306d(this.f81417l));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m40282a(s42);
            return Unit.INSTANCE;
        }
    }

    private C41288g16() {
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC41563gV2 m40292h(C41288g16 c41288g16, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = f81354e;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = f81353d;
        } else {
            f4 = f2;
        }
        return c41288g16.m40293g(interfaceC41563gV2, z, z2, interfaceC40148e62, interfaceC39510d16, f3, f4);
    }

    /* renamed from: k */
    public static /* synthetic */ PD3 m40289k(C41288g16 c41288g16, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C44846m16.m26476f();
        }
        if ((i & 2) != 0) {
            f2 = C44846m16.m26476f();
        }
        if ((i & 4) != 0) {
            f3 = C44846m16.m26476f();
        }
        if ((i & 8) != 0) {
            f4 = C44846m16.m26476f();
        }
        return c41288g16.m40290j(f, f2, f3, f4);
    }

    /* renamed from: n */
    public static /* synthetic */ PD3 m40286n(C41288g16 c41288g16, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C44846m16.m26476f();
        }
        if ((i & 2) != 0) {
            f2 = C44846m16.m26476f();
        }
        if ((i & 4) != 0) {
            f3 = C47218q16.m18294k();
        }
        if ((i & 8) != 0) {
            f4 = C47218q16.m18293l();
        }
        return c41288g16.m40287m(f, f2, f3, f4);
    }

    /* renamed from: p */
    public static /* synthetic */ PD3 m40284p(C41288g16 c41288g16, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C44846m16.m26476f();
        }
        if ((i & 2) != 0) {
            f2 = C44846m16.m26476f();
        }
        if ((i & 4) != 0) {
            f3 = C44846m16.m26476f();
        }
        if ((i & 8) != 0) {
            f4 = C44846m16.m26476f();
        }
        return c41288g16.m40285o(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m40299a(boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC39510d16 colors, InterfaceC42444hy5 interfaceC42444hy5, float f, float f2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC42444hy5 interfaceC42444hy52;
        float f3;
        float f4;
        int i8;
        Object obj;
        float f5;
        float f6;
        InterfaceC48627sP5 m36901b;
        InterfaceC42444hy5 interfaceC42444hy53;
        float f7;
        float f8;
        InterfaceC36874Wm5 mo89512w;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(943754022);
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
            if (mo89518u.mo89536o(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89539n(interactionSource)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(colors)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                interfaceC42444hy52 = interfaceC42444hy5;
                if (mo89518u.mo89539n(interfaceC42444hy52)) {
                    i11 = 16384;
                    i3 |= i11;
                }
            } else {
                interfaceC42444hy52 = interfaceC42444hy5;
            }
            i11 = 8192;
            i3 |= i11;
        } else {
            interfaceC42444hy52 = interfaceC42444hy5;
        }
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (mo89518u.mo89533p(f3)) {
                    i10 = DateUtils.FORMAT_NUMERIC_DATE;
                    i3 |= i10;
                }
            } else {
                f3 = f;
            }
            i10 = 65536;
            i3 |= i10;
        } else {
            f3 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (mo89518u.mo89533p(f4)) {
                    i9 = 1048576;
                    i3 |= i9;
                }
            } else {
                f4 = f2;
            }
            i9 = 524288;
            i3 |= i9;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i8 = 12582912;
        } else {
            if ((29360128 & i) == 0) {
                if (mo89518u.mo89539n(this)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
            }
            if ((23967451 & i3) != 4793490 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                f7 = f3;
                f8 = f4;
                interfaceC42444hy53 = interfaceC42444hy52;
            } else {
                mo89518u.mo89626J();
                if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                    mo89518u.mo89548k();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                } else {
                    if ((i2 & 16) != 0) {
                        interfaceC42444hy52 = m40294f(mo89518u, (i3 >> 21) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = f81354e;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        obj = interfaceC42444hy52;
                        f5 = f81353d;
                        f6 = f3;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(943754022, i3, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)");
                        }
                        int i12 = i3 >> 3;
                        InterfaceC42444hy5 interfaceC42444hy54 = obj;
                        m36901b = C41881h16.m36901b(z, z2, interactionSource, colors, f6, f5, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES));
                        C39504d10.m44736a(C19783dZ.m44156f(InterfaceC41563gV2.f82354b0, (C20064eZ) m36901b.getValue(), interfaceC42444hy54), mo89518u, 0);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC42444hy53 = interfaceC42444hy54;
                        f7 = f6;
                        f8 = f5;
                    }
                }
                obj = interfaceC42444hy52;
                f6 = f3;
                f5 = f4;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i122 = i3 >> 3;
                InterfaceC42444hy5 interfaceC42444hy542 = obj;
                m36901b = C41881h16.m36901b(z, z2, interactionSource, colors, f6, f5, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i122) | (i122 & ImageMetadata.JPEG_GPS_COORDINATES));
                C39504d10.m44736a(C19783dZ.m44156f(InterfaceC41563gV2.f82354b0, (C20064eZ) m36901b.getValue(), interfaceC42444hy542), mo89518u, 0);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC42444hy53 = interfaceC42444hy542;
                f7 = f6;
                f8 = f5;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new C20688a(z, z2, interactionSource, colors, interfaceC42444hy53, f7, f8, i, i2));
                return;
            }
            return;
        }
        i3 |= i8;
        if ((23967451 & i3) != 4793490) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        obj = interfaceC42444hy52;
        f6 = f3;
        f5 = f4;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i1222 = i3 >> 3;
        InterfaceC42444hy5 interfaceC42444hy5422 = obj;
        m36901b = C41881h16.m36901b(z, z2, interactionSource, colors, f6, f5, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i1222) | (i1222 & ImageMetadata.JPEG_GPS_COORDINATES));
        C39504d10.m44736a(C19783dZ.m44156f(InterfaceC41563gV2.f82354b0, (C20064eZ) m36901b.getValue(), interfaceC42444hy5422), mo89518u, 0);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC42444hy53 = interfaceC42444hy5422;
        f7 = f6;
        f8 = f5;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:437:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m40298b(String value, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> innerTextField, boolean z, boolean z2, InterfaceC32735Eu6 visualTransformation, InterfaceC40148e62 interactionSource, boolean z3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, InterfaceC39510d16 interfaceC39510d16, PD3 pd3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InterfaceC39510d16 interfaceC39510d162;
        PD3 pd32;
        PD3 pd33;
        InterfaceC39510d16 interfaceC39510d163;
        InterfaceC42389ht0 interfaceC42389ht0;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27;
        boolean z4;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function28;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function29;
        InterfaceC32720Et0 interfaceC32720Et02;
        boolean z5;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function210;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function211;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function212;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function213;
        InterfaceC39510d16 interfaceC39510d164;
        PD3 pd34;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function214;
        InterfaceC36874Wm5 mo89512w;
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1280721485);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (mo89518u.mo89539n(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= mo89518u.mo89629I(innerTextField) ? 32 : 16;
        }
        int i14 = 128;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= mo89518u.mo89536o(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= mo89518u.mo89536o(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= mo89518u.mo89539n(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ImageMetadata.EDGE_MODE;
                } else {
                    if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                        i5 = mo89518u.mo89539n(interactionSource) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= mo89518u.mo89536o(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= mo89518u.mo89629I(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= mo89518u.mo89629I(function22) ? 67108864 : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= mo89518u.mo89629I(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (mo89518u.mo89629I(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        if ((i3 & 2048) == 0 && mo89518u.mo89539n(interfaceC39510d16)) {
                            i13 = 32;
                            i11 |= i13;
                        }
                        i13 = 16;
                        i11 |= i13;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && mo89518u.mo89539n(pd3)) {
                            i14 = 256;
                        }
                        i11 |= i14;
                    }
                    int i15 = i11;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i15 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i15 |= mo89518u.mo89629I(function25) ? 2048 : 1024;
                        if ((i3 & 16384) != 0) {
                            i15 |= 24576;
                        } else if ((i2 & 57344) == 0) {
                            i15 |= mo89518u.mo89539n(this) ? 16384 : 8192;
                            if ((i4 & 1533916891) != 306783378 && (46811 & i15) == 9362 && mo89518u.mo89575b()) {
                                mo89518u.mo89548k();
                                function210 = function2;
                                function211 = function22;
                                function212 = function23;
                                function213 = function24;
                                interfaceC39510d164 = interfaceC39510d16;
                                pd34 = pd3;
                                function214 = function25;
                                interfaceC32720Et02 = mo89518u;
                                z5 = z3;
                            } else {
                                mo89518u.mo89626J();
                                if ((i & 1) != 0 || mo89518u.mo89545l()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function215 = i7 == 0 ? null : function2;
                                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function216 = i8 == 0 ? null : function22;
                                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function217 = i9 == 0 ? null : function23;
                                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function218 = i10 == 0 ? function24 : null;
                                    if ((i3 & 2048) == 0) {
                                        interfaceC39510d162 = m40291i(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mo89518u, 0, 0, (i15 >> 9) & 112, 2097151);
                                        i15 &= -113;
                                    } else {
                                        interfaceC39510d162 = interfaceC39510d16;
                                    }
                                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function219 = function217;
                                    if ((i3 & 4096) == 0) {
                                        pd32 = m40289k(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i15 &= -897;
                                    } else {
                                        pd32 = pd3;
                                    }
                                    if (i12 == 0) {
                                        pd33 = pd32;
                                        interfaceC39510d163 = interfaceC39510d162;
                                        function26 = function219;
                                        interfaceC42389ht0 = C43575jt0.m29791b(mo89518u, 1261916269, true, new C20689b(z, z6, interactionSource, interfaceC39510d162, i4, i15));
                                    } else {
                                        pd33 = pd32;
                                        interfaceC39510d163 = interfaceC39510d162;
                                        interfaceC42389ht0 = function25;
                                        function26 = function219;
                                    }
                                    function27 = function215;
                                    z4 = z6;
                                    function28 = function216;
                                    function29 = function218;
                                } else {
                                    mo89518u.mo89548k();
                                    if ((i3 & 2048) != 0) {
                                        i15 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i15 &= -897;
                                    }
                                    z4 = z3;
                                    function27 = function2;
                                    function28 = function22;
                                    function26 = function23;
                                    function29 = function24;
                                    interfaceC39510d163 = interfaceC39510d16;
                                    pd33 = pd3;
                                    interfaceC42389ht0 = function25;
                                }
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-1280721485, i4, i15, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                                }
                                int i16 = i4 << 3;
                                int i17 = i4 >> 9;
                                interfaceC32720Et02 = mo89518u;
                                C44846m16.m26481a(E16.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, pd33, interfaceC39510d163, interfaceC42389ht0, interfaceC32720Et02, (i16 & 896) | (i16 & 112) | 6 | ((i4 >> 3) & 7168) | (i17 & 57344) | (458752 & i17) | (i17 & 3670016) | ((i15 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15 & 896) | ((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                z5 = z4;
                                function210 = function27;
                                function211 = function28;
                                function212 = function26;
                                function213 = function29;
                                interfaceC39510d164 = interfaceC39510d163;
                                pd34 = pd33;
                                function214 = interfaceC42389ht0;
                            }
                            mo89512w = interfaceC32720Et02.mo89512w();
                            if (mo89512w != null) {
                                return;
                            }
                            mo89512w.mo20405a(new C20690c(value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function210, function211, function212, function213, interfaceC39510d164, pd34, function214, i, i2, i3));
                            return;
                        }
                        if ((i4 & 1533916891) != 306783378) {
                        }
                        mo89518u.mo89626J();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2192 = function217;
                        if ((i3 & 4096) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        function27 = function215;
                        z4 = z6;
                        function28 = function216;
                        function29 = function218;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        int i162 = i4 << 3;
                        int i172 = i4 >> 9;
                        interfaceC32720Et02 = mo89518u;
                        C44846m16.m26481a(E16.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, pd33, interfaceC39510d163, interfaceC42389ht0, interfaceC32720Et02, (i162 & 896) | (i162 & 112) | 6 | ((i4 >> 3) & 7168) | (i172 & 57344) | (458752 & i172) | (i172 & 3670016) | ((i15 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15 & 896) | ((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0);
                        if (C35528Qt0.m87827O()) {
                        }
                        z5 = z4;
                        function210 = function27;
                        function211 = function28;
                        function212 = function26;
                        function213 = function29;
                        interfaceC39510d164 = interfaceC39510d163;
                        pd34 = pd33;
                        function214 = interfaceC42389ht0;
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w != null) {
                        }
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function21922 = function217;
                    if ((i3 & 4096) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    function27 = function215;
                    z4 = z6;
                    function28 = function216;
                    function29 = function218;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    int i1622 = i4 << 3;
                    int i1722 = i4 >> 9;
                    interfaceC32720Et02 = mo89518u;
                    C44846m16.m26481a(E16.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, pd33, interfaceC39510d163, interfaceC42389ht0, interfaceC32720Et02, (i1622 & 896) | (i1622 & 112) | 6 | ((i4 >> 3) & 7168) | (i1722 & 57344) | (458752 & i1722) | (i1722 & 3670016) | ((i15 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15 & 896) | ((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0);
                    if (C35528Qt0.m87827O()) {
                    }
                    z5 = z4;
                    function210 = function27;
                    function211 = function28;
                    function212 = function26;
                    function213 = function29;
                    interfaceC39510d164 = interfaceC39510d163;
                    pd34 = pd33;
                    function214 = interfaceC42389ht0;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i152 = i11;
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function219222 = function217;
                if ((i3 & 4096) == 0) {
                }
                if (i12 == 0) {
                }
                function27 = function215;
                z4 = z6;
                function28 = function216;
                function29 = function218;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i16222 = i4 << 3;
                int i17222 = i4 >> 9;
                interfaceC32720Et02 = mo89518u;
                C44846m16.m26481a(E16.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, pd33, interfaceC39510d163, interfaceC42389ht0, interfaceC32720Et02, (i16222 & 896) | (i16222 & 112) | 6 | ((i4 >> 3) & 7168) | (i17222 & 57344) | (458752 & i17222) | (i17222 & 3670016) | ((i152 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i152 & 896) | ((i152 << 6) & 7168) | ((i152 << 3) & 57344), 0);
                if (C35528Qt0.m87827O()) {
                }
                z5 = z4;
                function210 = function27;
                function211 = function28;
                function212 = function26;
                function213 = function29;
                interfaceC39510d164 = interfaceC39510d163;
                pd34 = pd33;
                function214 = interfaceC42389ht0;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i1522 = i11;
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2192222 = function217;
            if ((i3 & 4096) == 0) {
            }
            if (i12 == 0) {
            }
            function27 = function215;
            z4 = z6;
            function28 = function216;
            function29 = function218;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            int i162222 = i4 << 3;
            int i172222 = i4 >> 9;
            interfaceC32720Et02 = mo89518u;
            C44846m16.m26481a(E16.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, pd33, interfaceC39510d163, interfaceC42389ht0, interfaceC32720Et02, (i162222 & 896) | (i162222 & 112) | 6 | ((i4 >> 3) & 7168) | (i172222 & 57344) | (458752 & i172222) | (i172222 & 3670016) | ((i1522 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i1522 & 896) | ((i1522 << 6) & 7168) | ((i1522 << 3) & 57344), 0);
            if (C35528Qt0.m87827O()) {
            }
            z5 = z4;
            function210 = function27;
            function211 = function28;
            function212 = function26;
            function213 = function29;
            interfaceC39510d164 = interfaceC39510d163;
            pd34 = pd33;
            function214 = interfaceC42389ht0;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i15222 = i11;
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function21922222 = function217;
        if ((i3 & 4096) == 0) {
        }
        if (i12 == 0) {
        }
        function27 = function215;
        z4 = z6;
        function28 = function216;
        function29 = function218;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i1622222 = i4 << 3;
        int i1722222 = i4 >> 9;
        interfaceC32720Et02 = mo89518u;
        C44846m16.m26481a(E16.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, pd33, interfaceC39510d163, interfaceC42389ht0, interfaceC32720Et02, (i1622222 & 896) | (i1622222 & 112) | 6 | ((i4 >> 3) & 7168) | (i1722222 & 57344) | (458752 & i1722222) | (i1722222 & 3670016) | ((i15222 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15222 & 896) | ((i15222 << 6) & 7168) | ((i15222 << 3) & 57344), 0);
        if (C35528Qt0.m87827O()) {
        }
        z5 = z4;
        function210 = function27;
        function211 = function28;
        function212 = function26;
        function213 = function29;
        interfaceC39510d164 = interfaceC39510d163;
        pd34 = pd33;
        function214 = interfaceC42389ht0;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:415:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m40297c(String value, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> innerTextField, boolean z, boolean z2, InterfaceC32735Eu6 visualTransformation, InterfaceC40148e62 interactionSource, boolean z3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, InterfaceC39510d16 interfaceC39510d16, PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC39510d16 interfaceC39510d162;
        PD3 pd32;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25;
        InterfaceC39510d16 interfaceC39510d163;
        boolean z4;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function28;
        PD3 m40286n;
        InterfaceC32720Et0 interfaceC32720Et02;
        boolean z5;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function29;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function210;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function211;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function212;
        InterfaceC39510d16 interfaceC39510d164;
        PD3 pd33;
        InterfaceC36874Wm5 mo89512w;
        int i12;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1171040065);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (mo89518u.mo89539n(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= mo89518u.mo89629I(innerTextField) ? 32 : 16;
        }
        int i13 = 128;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= mo89518u.mo89536o(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= mo89518u.mo89536o(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= mo89518u.mo89539n(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ImageMetadata.EDGE_MODE;
                } else {
                    if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                        i5 = mo89518u.mo89539n(interactionSource) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= mo89518u.mo89536o(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= mo89518u.mo89629I(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= mo89518u.mo89629I(function22) ? 67108864 : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= mo89518u.mo89629I(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (mo89518u.mo89629I(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        if ((i3 & 2048) == 0 && mo89518u.mo89539n(interfaceC39510d16)) {
                            i12 = 32;
                            i11 |= i12;
                        }
                        i12 = 16;
                        i11 |= i12;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && mo89518u.mo89539n(pd3)) {
                            i13 = 256;
                        }
                        i11 |= i13;
                    }
                    int i14 = i11;
                    if ((i3 & 8192) == 0) {
                        i14 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i14 |= mo89518u.mo89539n(this) ? 2048 : 1024;
                        if ((i4 & 1533916891) != 306783378 && (i14 & 5851) == 1170 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            z5 = z3;
                            function29 = function2;
                            function210 = function22;
                            function211 = function23;
                            function212 = function24;
                            interfaceC39510d164 = interfaceC39510d16;
                            pd33 = pd3;
                            interfaceC32720Et02 = mo89518u;
                        } else {
                            mo89518u.mo89626J();
                            if ((i & 1) != 0 || mo89518u.mo89545l()) {
                                boolean z6 = i6 != 0 ? false : z3;
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function213 = i7 != 0 ? null : function2;
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function214 = i8 != 0 ? null : function22;
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function215 = i9 != 0 ? null : function23;
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function216 = i10 == 0 ? function24 : null;
                                if ((i3 & 2048) != 0) {
                                    interfaceC39510d162 = m40288l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mo89518u, 0, 0, (i14 >> 6) & 112, 2097151);
                                    i14 &= -113;
                                } else {
                                    interfaceC39510d162 = interfaceC39510d16;
                                }
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function217 = function215;
                                if ((i3 & 4096) != 0) {
                                    if (function213 == null) {
                                        m40286n = m40284p(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        m40286n = m40286n(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i14 &= -897;
                                    function25 = function217;
                                    pd32 = m40286n;
                                } else {
                                    pd32 = pd3;
                                    function25 = function217;
                                }
                                interfaceC39510d163 = interfaceC39510d162;
                                z4 = z6;
                                function26 = function213;
                                function27 = function216;
                                function28 = function214;
                            } else {
                                mo89518u.mo89548k();
                                if ((i3 & 2048) != 0) {
                                    i14 &= -113;
                                }
                                if ((i3 & 4096) != 0) {
                                    i14 &= -897;
                                }
                                z4 = z3;
                                function26 = function2;
                                function28 = function22;
                                function25 = function23;
                                function27 = function24;
                                interfaceC39510d163 = interfaceC39510d16;
                                pd32 = pd3;
                            }
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1171040065, i4, i14, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                            }
                            int i15 = i4 << 3;
                            int i16 = i4 >> 9;
                            interfaceC32720Et02 = mo89518u;
                            C44846m16.m26481a(E16.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, pd32, interfaceC39510d163, null, interfaceC32720Et02, (i15 & 896) | (i15 & 112) | 6 | ((i4 >> 3) & 7168) | (i16 & 57344) | (i16 & ImageMetadata.JPEG_GPS_COORDINATES) | (i16 & 3670016) | ((i14 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i14 & 896) | ((i14 << 6) & 7168), 16384);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            z5 = z4;
                            function29 = function26;
                            function210 = function28;
                            function211 = function25;
                            function212 = function27;
                            interfaceC39510d164 = interfaceC39510d163;
                            pd33 = pd32;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C20691d(value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function29, function210, function211, function212, interfaceC39510d164, pd33, i, i2, i3));
                        return;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2172 = function215;
                    if ((i3 & 4096) != 0) {
                    }
                    interfaceC39510d163 = interfaceC39510d162;
                    z4 = z6;
                    function26 = function213;
                    function27 = function216;
                    function28 = function214;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    int i152 = i4 << 3;
                    int i162 = i4 >> 9;
                    interfaceC32720Et02 = mo89518u;
                    C44846m16.m26481a(E16.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, pd32, interfaceC39510d163, null, interfaceC32720Et02, (i152 & 896) | (i152 & 112) | 6 | ((i4 >> 3) & 7168) | (i162 & 57344) | (i162 & ImageMetadata.JPEG_GPS_COORDINATES) | (i162 & 3670016) | ((i14 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i14 & 896) | ((i14 << 6) & 7168), 16384);
                    if (C35528Qt0.m87827O()) {
                    }
                    z5 = z4;
                    function29 = function26;
                    function210 = function28;
                    function211 = function25;
                    function212 = function27;
                    interfaceC39510d164 = interfaceC39510d163;
                    pd33 = pd32;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i142 = i11;
                if ((i3 & 8192) == 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function21722 = function215;
                if ((i3 & 4096) != 0) {
                }
                interfaceC39510d163 = interfaceC39510d162;
                z4 = z6;
                function26 = function213;
                function27 = function216;
                function28 = function214;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i1522 = i4 << 3;
                int i1622 = i4 >> 9;
                interfaceC32720Et02 = mo89518u;
                C44846m16.m26481a(E16.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, pd32, interfaceC39510d163, null, interfaceC32720Et02, (i1522 & 896) | (i1522 & 112) | 6 | ((i4 >> 3) & 7168) | (i1622 & 57344) | (i1622 & ImageMetadata.JPEG_GPS_COORDINATES) | (i1622 & 3670016) | ((i142 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i142 & 896) | ((i142 << 6) & 7168), 16384);
                if (C35528Qt0.m87827O()) {
                }
                z5 = z4;
                function29 = function26;
                function210 = function28;
                function211 = function25;
                function212 = function27;
                interfaceC39510d164 = interfaceC39510d163;
                pd33 = pd32;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i1422 = i11;
            if ((i3 & 8192) == 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function217222 = function215;
            if ((i3 & 4096) != 0) {
            }
            interfaceC39510d163 = interfaceC39510d162;
            z4 = z6;
            function26 = function213;
            function27 = function216;
            function28 = function214;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            int i15222 = i4 << 3;
            int i16222 = i4 >> 9;
            interfaceC32720Et02 = mo89518u;
            C44846m16.m26481a(E16.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, pd32, interfaceC39510d163, null, interfaceC32720Et02, (i15222 & 896) | (i15222 & 112) | 6 | ((i4 >> 3) & 7168) | (i16222 & 57344) | (i16222 & ImageMetadata.JPEG_GPS_COORDINATES) | (i16222 & 3670016) | ((i1422 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i1422 & 896) | ((i1422 << 6) & 7168), 16384);
            if (C35528Qt0.m87827O()) {
            }
            z5 = z4;
            function29 = function26;
            function210 = function28;
            function211 = function25;
            function212 = function27;
            interfaceC39510d164 = interfaceC39510d163;
            pd33 = pd32;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i14222 = i11;
        if ((i3 & 8192) == 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2172222 = function215;
        if ((i3 & 4096) != 0) {
        }
        interfaceC39510d163 = interfaceC39510d162;
        z4 = z6;
        function26 = function213;
        function27 = function216;
        function28 = function214;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i152222 = i4 << 3;
        int i162222 = i4 >> 9;
        interfaceC32720Et02 = mo89518u;
        C44846m16.m26481a(E16.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, pd32, interfaceC39510d163, null, interfaceC32720Et02, (i152222 & 896) | (i152222 & 112) | 6 | ((i4 >> 3) & 7168) | (i162222 & 57344) | (i162222 & ImageMetadata.JPEG_GPS_COORDINATES) | (i162222 & 3670016) | ((i14222 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i14222 & 896) | ((i14222 << 6) & 7168), 16384);
        if (C35528Qt0.m87827O()) {
        }
        z5 = z4;
        function29 = function26;
        function210 = function28;
        function211 = function25;
        function212 = function27;
        interfaceC39510d164 = interfaceC39510d163;
        pd33 = pd32;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: d */
    public final float m40296d() {
        return f81351b;
    }

    /* renamed from: e */
    public final float m40295e() {
        return f81352c;
    }

    @JvmName(name = "getOutlinedTextFieldShape")
    /* renamed from: f */
    public final InterfaceC42444hy5 m40294f(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        KC0 m109564e = TM2.f35372a.m83730b(interfaceC32720Et0, 6).m109564e();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return m109564e;
    }

    /* renamed from: g */
    public final InterfaceC41563gV2 m40293g(InterfaceC41563gV2 indicatorLine, boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC39510d16 colors, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (K32.m99301c()) {
            m99303a = new C20693f(z, z2, interactionSource, colors, f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(indicatorLine, m99303a, new C20692e(z, z2, interactionSource, colors, f, f2));
    }

    /* renamed from: i */
    public final InterfaceC39510d16 m40291i(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3, int i4) {
        interfaceC32720Et0.mo89638F(1762667317);
        long m18743m = (i4 & 1) != 0 ? C47063pm0.m18743m(((C47063pm0) interfaceC32720Et0.mo89572c(C41372gA0.m39962a())).m18733w(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m18743m2 = (i4 & 2) != 0 ? C47063pm0.m18743m(m18743m, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m18727f = (i4 & 4) != 0 ? C47063pm0.f104050b.m18727f() : j3;
        long m94900j = (i4 & 8) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94900j() : j4;
        long m94906d = (i4 & 16) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j5;
        long m18743m3 = (i4 & 32) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94900j(), C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m18743m4 = (i4 & 64) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m18743m5 = (i4 & 128) != 0 ? C47063pm0.m18743m(m18743m4, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m94906d2 = (i4 & 256) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j9;
        long m18743m6 = (i4 & 512) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m18743m7 = (i4 & 1024) != 0 ? C47063pm0.m18743m(m18743m6, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m18743m6 : j12;
        long m18743m8 = (i4 & 4096) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m18743m9 = (i4 & 8192) != 0 ? C47063pm0.m18743m(m18743m8, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m94906d3 = (i4 & 16384) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j15;
        long m18743m10 = (32768 & i4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94900j(), C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m18743m11 = (65536 & i4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m18743m12 = (131072 & i4) != 0 ? C47063pm0.m18743m(m18743m11, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m94906d4 = (262144 & i4) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j19;
        long m18743m13 = (524288 & i4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m18743m14 = (i4 & 1048576) != 0 ? C47063pm0.m18743m(m18743m13, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        OY0 oy0 = new OY0(m18743m, m18743m2, m94900j, m94906d, m18743m3, m18743m4, m94906d2, m18743m5, m18743m6, m18743m7, j22, m18743m8, m18743m9, m94906d3, m18727f, m18743m10, m18743m11, m18743m12, m94906d4, m18743m13, m18743m14, null);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return oy0;
    }

    /* renamed from: j */
    public final PD3 m40290j(float f, float f2, float f3, float f4) {
        return ND3.m94189d(f, f2, f3, f4);
    }

    /* renamed from: l */
    public final InterfaceC39510d16 m40288l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3, int i4) {
        interfaceC32720Et0.mo89638F(231892599);
        long m18743m = (i4 & 1) != 0 ? C47063pm0.m18743m(((C47063pm0) interfaceC32720Et0.mo89572c(C41372gA0.m39962a())).m18733w(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m18743m2 = (i4 & 2) != 0 ? C47063pm0.m18743m(m18743m, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m18743m3 = (i4 & 4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m94900j = (i4 & 8) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94900j() : j4;
        long m94906d = (i4 & 16) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j5;
        long m18743m4 = (i4 & 32) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94900j(), C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m18743m5 = (i4 & 64) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m18743m6 = (i4 & 128) != 0 ? C47063pm0.m18743m(m18743m5, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m94906d2 = (i4 & 256) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j9;
        long m18743m7 = (i4 & 512) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m18743m8 = (i4 & 1024) != 0 ? C47063pm0.m18743m(m18743m7, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m18743m7 : j12;
        long m18743m9 = (i4 & 4096) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m18743m10 = (i4 & 8192) != 0 ? C47063pm0.m18743m(m18743m9, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m94906d3 = (i4 & 16384) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j15;
        long m18743m11 = (32768 & i4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94900j(), C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m18743m12 = (65536 & i4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m18743m13 = (131072 & i4) != 0 ? C47063pm0.m18743m(m18743m12, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m94906d4 = (262144 & i4) != 0 ? TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94906d() : j19;
        long m18743m14 = (524288 & i4) != 0 ? C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m18743m15 = (i4 & 1048576) != 0 ? C47063pm0.m18743m(m18743m14, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        OY0 oy0 = new OY0(m18743m, m18743m2, m94900j, m94906d, m18743m4, m18743m5, m94906d2, m18743m6, m18743m7, m18743m8, j22, m18743m9, m18743m10, m94906d3, m18743m3, m18743m11, m18743m12, m18743m13, m94906d4, m18743m14, m18743m15, null);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return oy0;
    }

    /* renamed from: m */
    public final PD3 m40287m(float f, float f2, float f3, float f4) {
        return ND3.m94189d(f, f3, f2, f4);
    }

    /* renamed from: o */
    public final PD3 m40285o(float f, float f2, float f3, float f4) {
        return ND3.m94189d(f, f2, f3, f4);
    }
}
