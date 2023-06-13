package p000;

import android.view.KeyEvent;
import androidx.compose.p003ui.draw.C11289a;
import androidx.compose.p003ui.focus.C11309h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import okhttp3.internal.http.StatusLine;
import p000.AbstractC44199kw1;
import p000.AbstractC48600sM5;
import p000.C42474i16;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aæ\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b!\u0010\"\u001a-\u0010&\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010*\u001a\u00020\u0005*\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#H\u0002\u001a \u0010.\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0011H\u0002\u001a0\u00103\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00102\u001a\u000201H\u0002\u001a\u0010\u00104\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0002\u001a7\u00109\u001a\u00020\u0003*\u0002052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0080@ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u001f\u0010<\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0011H\u0003¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010>\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b>\u0010?\u001a \u0010@\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00102\u001a\u000201H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, m28432d2 = {"LF16;", "value", "Lkotlin/Function1;", "", "onValueChange", "LgV2;", "modifier", "LG26;", "textStyle", "LEu6;", "visualTransformation", "Li26;", "onTextLayout", "LrX2;", "interactionSource", "La30;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "LGY1;", "imeOptions", "LZk2;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", C17296a.f69688o, "(LF16;Lkotlin/jvm/functions/Function1;LgV2;LG26;LEu6;Lkotlin/jvm/functions/Function1;LrX2;La30;ZIILGY1;LZk2;ZZLkotlin/jvm/functions/Function3;LEt0;III)V", "Lx16;", "manager", "content", "b", "(LgV2;Lx16;Lkotlin/jvm/functions/Function2;LEt0;I)V", "LC16;", TransferTable.COLUMN_STATE, "o", "Landroidx/compose/ui/focus/h;", "focusRequester", "allowKeyboard", "p", "LU16;", "textInputService", "LHe3;", "offsetMapping", "m", "n", "LE20;", "LT06;", "textDelegate", "textLayoutResult", "k", "(LE20;LF16;LT06;Li26;LHe3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "c", "(Lx16;ZLEt0;I)V", DateTokenConverter.CONVERTER_KEY, "(Lx16;LEt0;I)V", "l", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1087:1\n25#2:1088\n36#2:1100\n50#2:1107\n49#2:1108\n25#2:1115\n25#2:1122\n25#2:1129\n25#2:1143\n25#2:1154\n460#2,13:1180\n473#2,3:1194\n36#2:1200\n36#2:1208\n1114#3,6:1089\n1114#3,6:1101\n1114#3,6:1109\n1114#3,6:1116\n1114#3,6:1123\n1114#3,6:1130\n1114#3,3:1144\n1117#3,3:1150\n1114#3,6:1155\n1114#3,6:1201\n1114#3,6:1209\n76#4:1095\n76#4:1096\n76#4:1097\n76#4:1098\n76#4:1099\n76#4:1136\n76#4:1137\n76#4:1138\n76#4:1168\n76#4:1207\n474#5,4:1139\n478#5,2:1147\n482#5:1153\n474#6:1149\n67#7,6:1161\n73#7:1193\n77#7:1198\n75#8:1167\n76#8,11:1169\n89#8:1197\n1#9:1199\n480#10,4:1215\n485#10:1224\n122#11,5:1219\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n200#1:1088\n216#1:1100\n219#1:1107\n219#1:1108\n232#1:1115\n260#1:1122\n263#1:1129\n275#1:1143\n276#1:1154\n669#1:1180,13\n669#1:1194,3\n1037#1:1200\n1045#1:1208\n200#1:1089,6\n216#1:1101,6\n219#1:1109,6\n232#1:1116,6\n260#1:1123,6\n263#1:1130,6\n275#1:1144,3\n275#1:1150,3\n276#1:1155,6\n1037#1:1201,6\n1045#1:1209,6\n204#1:1095\n205#1:1096\n206#1:1097\n207#1:1098\n208#1:1099\n269#1:1136\n270#1:1137\n271#1:1138\n669#1:1168\n1038#1:1207\n275#1:1139,4\n275#1:1147,2\n275#1:1153\n275#1:1149\n669#1:1161,6\n669#1:1193\n669#1:1198\n669#1:1167\n669#1:1169,11\n669#1:1197\n1073#1:1215,4\n1073#1:1224\n1073#1:1219,5\n*E\n"})
/* renamed from: IC0 */
/* loaded from: classes.dex */
public final class IC0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$a */
    /* loaded from: classes.dex */
    public static final class C3368a extends Lambda implements Function1<C42484i26, Unit> {

        /* renamed from: g */
        public static final C3368a f14650g = new C3368a();

        public C3368a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C42484i26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
            invoke2(c42484i26);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n*L\n326#1:1088,5\n*E\n"})
    /* renamed from: IC0$b */
    /* loaded from: classes.dex */
    public static final class C3369b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14651g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"IC0$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n*L\n1#1,484:1\n327#2,4:485\n*E\n"})
        /* renamed from: IC0$b$a */
        /* loaded from: classes.dex */
        public static final class C3370a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ C16 f14652a;

            public C3370a(C16 c16) {
                this.f14652a = c16;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                if (this.f14652a.m112992d()) {
                    IC0.m102801n(this.f14652a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3369b(C16 c16) {
            super(1);
            this.f14651g = c16;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C3370a(this.f14651g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n*L\n514#1:1088,5\n*E\n"})
    /* renamed from: IC0$c */
    /* loaded from: classes.dex */
    public static final class C3371c extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ C51367x16 f14653g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"IC0$c$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n*L\n1#1,484:1\n514#2:485\n*E\n"})
        /* renamed from: IC0$c$a */
        /* loaded from: classes.dex */
        public static final class C3372a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ C51367x16 f14654a;

            public C3372a(C51367x16 c51367x16) {
                this.f14654a = c51367x16;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f14654a.m5971J();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3371c(C51367x16 c51367x16) {
            super(1);
            this.f14653g = c51367x16;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C3372a(this.f14653g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n528#1:1088,5\n*E\n"})
    /* renamed from: IC0$d */
    /* loaded from: classes.dex */
    public static final class C3373d extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ U16 f14655g;

        /* renamed from: h */
        public final /* synthetic */ C16 f14656h;

        /* renamed from: i */
        public final /* synthetic */ F16 f14657i;

        /* renamed from: j */
        public final /* synthetic */ GY1 f14658j;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"IC0$d$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n1#1,484:1\n528#2:485\n*E\n"})
        /* renamed from: IC0$d$a */
        /* loaded from: classes.dex */
        public static final class C3374a implements InterfaceC44288l51 {
            @Override // p000.InterfaceC44288l51
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3373d(U16 u16, C16 c16, F16 f16, GY1 gy1) {
            super(1);
            this.f14655g = u16;
            this.f14656h = c16;
            this.f14657i = f16;
            this.f14658j = gy1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            if (this.f14655g != null && this.f14656h.m112992d()) {
                C16 c16 = this.f14656h;
                c16.m112973w(C42474i16.f86286a.m35370h(this.f14655g, this.f14657i, c16.m112985k(), this.f14658j, this.f14656h.m112986j(), this.f14656h.m112987i()));
            }
            return new C3374a();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$e */
    /* loaded from: classes.dex */
    public static final class C3375e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> f14659g;

        /* renamed from: h */
        public final /* synthetic */ int f14660h;

        /* renamed from: i */
        public final /* synthetic */ C16 f14661i;

        /* renamed from: j */
        public final /* synthetic */ G26 f14662j;

        /* renamed from: k */
        public final /* synthetic */ int f14663k;

        /* renamed from: l */
        public final /* synthetic */ int f14664l;

        /* renamed from: m */
        public final /* synthetic */ C50182v16 f14665m;

        /* renamed from: n */
        public final /* synthetic */ F16 f14666n;

        /* renamed from: o */
        public final /* synthetic */ InterfaceC32735Eu6 f14667o;

        /* renamed from: p */
        public final /* synthetic */ InterfaceC41563gV2 f14668p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC41563gV2 f14669q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC41563gV2 f14670r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC41563gV2 f14671s;

        /* renamed from: t */
        public final /* synthetic */ E20 f14672t;

        /* renamed from: u */
        public final /* synthetic */ C51367x16 f14673u;

        /* renamed from: v */
        public final /* synthetic */ boolean f14674v;

        /* renamed from: w */
        public final /* synthetic */ boolean f14675w;

        /* renamed from: x */
        public final /* synthetic */ Function1<C42484i26, Unit> f14676x;

        /* renamed from: y */
        public final /* synthetic */ InterfaceC33290He3 f14677y;

        /* renamed from: z */
        public final /* synthetic */ InterfaceC41273g01 f14678z;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$e$a */
        /* loaded from: classes.dex */
        public static final class C3376a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C16 f14679g;

            /* renamed from: h */
            public final /* synthetic */ G26 f14680h;

            /* renamed from: i */
            public final /* synthetic */ int f14681i;

            /* renamed from: j */
            public final /* synthetic */ int f14682j;

            /* renamed from: k */
            public final /* synthetic */ C50182v16 f14683k;

            /* renamed from: l */
            public final /* synthetic */ F16 f14684l;

            /* renamed from: m */
            public final /* synthetic */ InterfaceC32735Eu6 f14685m;

            /* renamed from: n */
            public final /* synthetic */ InterfaceC41563gV2 f14686n;

            /* renamed from: o */
            public final /* synthetic */ InterfaceC41563gV2 f14687o;

            /* renamed from: p */
            public final /* synthetic */ InterfaceC41563gV2 f14688p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC41563gV2 f14689q;

            /* renamed from: r */
            public final /* synthetic */ E20 f14690r;

            /* renamed from: s */
            public final /* synthetic */ C51367x16 f14691s;

            /* renamed from: t */
            public final /* synthetic */ boolean f14692t;

            /* renamed from: u */
            public final /* synthetic */ boolean f14693u;

            /* renamed from: v */
            public final /* synthetic */ Function1<C42484i26, Unit> f14694v;

            /* renamed from: w */
            public final /* synthetic */ InterfaceC33290He3 f14695w;

            /* renamed from: x */
            public final /* synthetic */ InterfaceC41273g01 f14696x;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1087:1\n71#2,4:1088\n75#2,11:1093\n88#2:1118\n76#3:1092\n456#4,14:1104\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n*L\n591#1:1088,4\n591#1:1093,11\n591#1:1118\n591#1:1092\n591#1:1104,14\n*E\n"})
            /* renamed from: IC0$e$a$a */
            /* loaded from: classes.dex */
            public static final class C3377a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C51367x16 f14697g;

                /* renamed from: h */
                public final /* synthetic */ C16 f14698h;

                /* renamed from: i */
                public final /* synthetic */ boolean f14699i;

                /* renamed from: j */
                public final /* synthetic */ boolean f14700j;

                /* renamed from: k */
                public final /* synthetic */ Function1<C42484i26, Unit> f14701k;

                /* renamed from: l */
                public final /* synthetic */ F16 f14702l;

                /* renamed from: m */
                public final /* synthetic */ InterfaceC33290He3 f14703m;

                /* renamed from: n */
                public final /* synthetic */ InterfaceC41273g01 f14704n;

                /* renamed from: o */
                public final /* synthetic */ int f14705o;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1087:1\n480#2,4:1088\n485#2:1097\n122#3,5:1092\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n*L\n598#1:1088,4\n598#1:1097\n598#1:1092,5\n*E\n"})
                /* renamed from: IC0$e$a$a$a */
                /* loaded from: classes.dex */
                public static final class C3378a implements InterfaceC51579xO2 {

                    /* renamed from: a */
                    public final /* synthetic */ C16 f14706a;

                    /* renamed from: b */
                    public final /* synthetic */ Function1<C42484i26, Unit> f14707b;

                    /* renamed from: c */
                    public final /* synthetic */ F16 f14708c;

                    /* renamed from: d */
                    public final /* synthetic */ InterfaceC33290He3 f14709d;

                    /* renamed from: e */
                    public final /* synthetic */ InterfaceC41273g01 f14710e;

                    /* renamed from: f */
                    public final /* synthetic */ int f14711f;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    /* renamed from: IC0$e$a$a$a$a */
                    /* loaded from: classes.dex */
                    public static final class C3379a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

                        /* renamed from: g */
                        public static final C3379a f14712g = new C3379a();

                        public C3379a() {
                            super(1);
                        }

                        /* renamed from: a */
                        public final void m102798a(OU3.AbstractC6015a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                            m102798a(abstractC6015a);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public C3378a(C16 c16, Function1<? super C42484i26, Unit> function1, F16 f16, InterfaceC33290He3 interfaceC33290He3, InterfaceC41273g01 interfaceC41273g01, int i) {
                        this.f14706a = c16;
                        this.f14707b = function1;
                        this.f14708c = f16;
                        this.f14709d = interfaceC33290He3;
                        this.f14710e = interfaceC41273g01;
                        this.f14711f = i;
                    }

                    @Override // p000.InterfaceC51579xO2
                    /* renamed from: a */
                    public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
                        C42484i26 c42484i26;
                        int i;
                        int roundToInt;
                        int roundToInt2;
                        Map<AbstractC4750L9, Integer> mapOf;
                        Intrinsics.checkNotNullParameter(measure, "$this$measure");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
                        C16 c16 = this.f14706a;
                        AbstractC48600sM5 m14281a = c28290a.m14281a();
                        try {
                            AbstractC48600sM5 m14295k = m14281a.m14295k();
                            C43077j26 m112989g = c16.m112989g();
                            if (m112989g != null) {
                                c42484i26 = m112989g.m31225i();
                            } else {
                                c42484i26 = null;
                            }
                            m14281a.m14288r(m14295k);
                            m14281a.mo1848d();
                            Triple<Integer, Integer, C42484i26> m35375c = C42474i16.f86286a.m35375c(this.f14706a.m112978r(), j, measure.getLayoutDirection(), c42484i26);
                            int intValue = m35375c.component1().intValue();
                            int intValue2 = m35375c.component2().intValue();
                            C42484i26 component3 = m35375c.component3();
                            if (!Intrinsics.areEqual(c42484i26, component3)) {
                                this.f14706a.m112971y(new C43077j26(component3));
                                this.f14707b.invoke(component3);
                                IC0.m102803l(this.f14706a, this.f14708c, this.f14709d);
                            }
                            C16 c162 = this.f14706a;
                            InterfaceC41273g01 interfaceC41273g01 = this.f14710e;
                            if (this.f14711f == 1) {
                                i = V06.m80500a(component3.m34596l(0));
                            } else {
                                i = 0;
                            }
                            c162.m112970z(interfaceC41273g01.mo3398w(i));
                            YM1 m94314a = C5482N9.m94314a();
                            roundToInt = MathKt__MathJVMKt.roundToInt(component3.m34601g());
                            YM1 m94313b = C5482N9.m94313b();
                            roundToInt2 = MathKt__MathJVMKt.roundToInt(component3.m34598j());
                            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(m94314a, Integer.valueOf(roundToInt)), TuplesKt.m28425to(m94313b, Integer.valueOf(roundToInt2)));
                            return measure.mo1431O0(intValue, intValue2, mapOf, C3379a.f14712g);
                        } catch (Throwable th) {
                            m14281a.mo1848d();
                            throw th;
                        }
                    }

                    @Override // p000.InterfaceC51579xO2
                    /* renamed from: b */
                    public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
                        Intrinsics.checkNotNullParameter(z62, "<this>");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        this.f14706a.m112978r().m84431o(z62.getLayoutDirection());
                        return this.f14706a.m112978r().m84443c();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3377a(C51367x16 c51367x16, C16 c16, boolean z, boolean z2, Function1<? super C42484i26, Unit> function1, F16 f16, InterfaceC33290He3 interfaceC33290He3, InterfaceC41273g01 interfaceC41273g01, int i) {
                    super(2);
                    this.f14697g = c51367x16;
                    this.f14698h = c16;
                    this.f14699i = z;
                    this.f14700j = z2;
                    this.f14701k = function1;
                    this.f14702l = f16;
                    this.f14703m = interfaceC33290He3;
                    this.f14704n = interfaceC41273g01;
                    this.f14705o = i;
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
                        C35528Qt0.m87816Z(-363167407, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:589)");
                    }
                    C3378a c3378a = new C3378a(this.f14698h, this.f14701k, this.f14702l, this.f14703m, this.f14704n, this.f14705o);
                    interfaceC32720Et0.mo89638F(-1323940314);
                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
                    if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                        C52468yt0.m2335c();
                    }
                    interfaceC32720Et0.mo89557h();
                    if (interfaceC32720Et0.mo89521t()) {
                        interfaceC32720Et0.mo89617M(m113415a);
                    } else {
                        interfaceC32720Et0.mo89566e();
                    }
                    InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
                    C38680bf6.m64191b(m64192a, c3378a, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    boolean z = false;
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                    interfaceC32720Et0.mo89638F(2058660585);
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89563f();
                    interfaceC32720Et0.mo89605Q();
                    C51367x16 c51367x16 = this.f14697g;
                    if (this.f14698h.m112993c() == ME1.Selection && this.f14698h.m112990f() != null) {
                        InterfaceC45879nm2 m112990f = this.f14698h.m112990f();
                        Intrinsics.checkNotNull(m112990f);
                        if (m112990f.mo23189F() && this.f14699i) {
                            z = true;
                        }
                    }
                    IC0.m102812c(c51367x16, z, interfaceC32720Et0, 8);
                    if (this.f14698h.m112993c() == ME1.Cursor && !this.f14700j && this.f14699i) {
                        IC0.m102811d(this.f14697g, interfaceC32720Et0, 8);
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: IC0$e$a$b */
            /* loaded from: classes.dex */
            public static final class C3380b extends Lambda implements Function0<C43077j26> {

                /* renamed from: g */
                public final /* synthetic */ C16 f14713g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3380b(C16 c16) {
                    super(0);
                    this.f14713g = c16;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b */
                public final C43077j26 invoke() {
                    return this.f14713g.m112989g();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3376a(C16 c16, G26 g26, int i, int i2, C50182v16 c50182v16, F16 f16, InterfaceC32735Eu6 interfaceC32735Eu6, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC41563gV2 interfaceC41563gV22, InterfaceC41563gV2 interfaceC41563gV23, InterfaceC41563gV2 interfaceC41563gV24, E20 e20, C51367x16 c51367x16, boolean z, boolean z2, Function1<? super C42484i26, Unit> function1, InterfaceC33290He3 interfaceC33290He3, InterfaceC41273g01 interfaceC41273g01) {
                super(2);
                this.f14679g = c16;
                this.f14680h = g26;
                this.f14681i = i;
                this.f14682j = i2;
                this.f14683k = c50182v16;
                this.f14684l = f16;
                this.f14685m = interfaceC32735Eu6;
                this.f14686n = interfaceC41563gV2;
                this.f14687o = interfaceC41563gV22;
                this.f14688p = interfaceC41563gV23;
                this.f14689q = interfaceC41563gV24;
                this.f14690r = e20;
                this.f14691s = c51367x16;
                this.f14692t = z;
                this.f14693u = z2;
                this.f14694v = function1;
                this.f14695w = interfaceC33290He3;
                this.f14696x = interfaceC41273g01;
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
                    C35528Qt0.m87816Z(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:564)");
                }
                QA5.m88807a(G20.m105944b(B16.m114787a(C49589u16.m11053c(EI1.m109244a(BB5.m114252q(InterfaceC41563gV2.f82354b0, this.f14679g.m112988h(), 0.0f, 2, null), this.f14680h, this.f14681i, this.f14682j), this.f14683k, this.f14684l, this.f14685m, new C3380b(this.f14679g)).mo39266t0(this.f14686n).mo39266t0(this.f14687o), this.f14680h).mo39266t0(this.f14688p).mo39266t0(this.f14689q), this.f14690r), C43575jt0.m29791b(interfaceC32720Et0, -363167407, true, new C3377a(this.f14691s, this.f14679g, this.f14692t, this.f14693u, this.f14694v, this.f14684l, this.f14695w, this.f14696x, this.f14682j)), interfaceC32720Et0, 48, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3375e(Function3<? super Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, C16 c16, G26 g26, int i2, int i3, C50182v16 c50182v16, F16 f16, InterfaceC32735Eu6 interfaceC32735Eu6, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC41563gV2 interfaceC41563gV22, InterfaceC41563gV2 interfaceC41563gV23, InterfaceC41563gV2 interfaceC41563gV24, E20 e20, C51367x16 c51367x16, boolean z, boolean z2, Function1<? super C42484i26, Unit> function1, InterfaceC33290He3 interfaceC33290He3, InterfaceC41273g01 interfaceC41273g01) {
            super(2);
            this.f14659g = function3;
            this.f14660h = i;
            this.f14661i = c16;
            this.f14662j = g26;
            this.f14663k = i2;
            this.f14664l = i3;
            this.f14665m = c50182v16;
            this.f14666n = f16;
            this.f14667o = interfaceC32735Eu6;
            this.f14668p = interfaceC41563gV2;
            this.f14669q = interfaceC41563gV22;
            this.f14670r = interfaceC41563gV23;
            this.f14671s = interfaceC41563gV24;
            this.f14672t = e20;
            this.f14673u = c51367x16;
            this.f14674v = z;
            this.f14675w = z2;
            this.f14676x = function1;
            this.f14677y = interfaceC33290He3;
            this.f14678z = interfaceC41273g01;
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
                C35528Qt0.m87816Z(-374338080, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:563)");
            }
            this.f14659g.invoke(C43575jt0.m29791b(interfaceC32720Et0, 2032502107, true, new C3376a(this.f14661i, this.f14662j, this.f14663k, this.f14664l, this.f14665m, this.f14666n, this.f14667o, this.f14668p, this.f14669q, this.f14670r, this.f14671s, this.f14672t, this.f14673u, this.f14674v, this.f14675w, this.f14676x, this.f14677y, this.f14678z)), interfaceC32720Et0, Integer.valueOf(((this.f14660h >> 12) & 112) | 6));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$f */
    /* loaded from: classes.dex */
    public static final class C3381f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F16 f14714g;

        /* renamed from: h */
        public final /* synthetic */ Function1<F16, Unit> f14715h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f14716i;

        /* renamed from: j */
        public final /* synthetic */ G26 f14717j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC32735Eu6 f14718k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C42484i26, Unit> f14719l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC48104rX2 f14720m;

        /* renamed from: n */
        public final /* synthetic */ AbstractC37727a30 f14721n;

        /* renamed from: o */
        public final /* synthetic */ boolean f14722o;

        /* renamed from: p */
        public final /* synthetic */ int f14723p;

        /* renamed from: q */
        public final /* synthetic */ int f14724q;

        /* renamed from: r */
        public final /* synthetic */ GY1 f14725r;

        /* renamed from: s */
        public final /* synthetic */ C37555Zk2 f14726s;

        /* renamed from: t */
        public final /* synthetic */ boolean f14727t;

        /* renamed from: u */
        public final /* synthetic */ boolean f14728u;

        /* renamed from: v */
        public final /* synthetic */ Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> f14729v;

        /* renamed from: w */
        public final /* synthetic */ int f14730w;

        /* renamed from: x */
        public final /* synthetic */ int f14731x;

        /* renamed from: y */
        public final /* synthetic */ int f14732y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3381f(F16 f16, Function1<? super F16, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, InterfaceC32735Eu6 interfaceC32735Eu6, Function1<? super C42484i26, Unit> function12, InterfaceC48104rX2 interfaceC48104rX2, AbstractC37727a30 abstractC37727a30, boolean z, int i, int i2, GY1 gy1, C37555Zk2 c37555Zk2, boolean z2, boolean z3, Function3<? super Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i3, int i4, int i5) {
            super(2);
            this.f14714g = f16;
            this.f14715h = function1;
            this.f14716i = interfaceC41563gV2;
            this.f14717j = g26;
            this.f14718k = interfaceC32735Eu6;
            this.f14719l = function12;
            this.f14720m = interfaceC48104rX2;
            this.f14721n = abstractC37727a30;
            this.f14722o = z;
            this.f14723p = i;
            this.f14724q = i2;
            this.f14725r = gy1;
            this.f14726s = c37555Zk2;
            this.f14727t = z2;
            this.f14728u = z3;
            this.f14729v = function3;
            this.f14730w = i3;
            this.f14731x = i4;
            this.f14732y = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            IC0.m102814a(this.f14714g, this.f14715h, this.f14716i, this.f14717j, this.f14718k, this.f14719l, this.f14720m, this.f14721n, this.f14722o, this.f14723p, this.f14724q, this.f14725r, this.f14726s, this.f14727t, this.f14728u, this.f14729v, interfaceC32720Et0, C47127ps4.m18626a(this.f14730w | 1), C47127ps4.m18626a(this.f14731x), this.f14732y);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$g */
    /* loaded from: classes.dex */
    public static final class C3382g extends Lambda implements Function1<InterfaceC45879nm2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14733g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3382g(C16 c16) {
            super(1);
            this.f14733g = c16;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
            invoke2(interfaceC45879nm2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC45879nm2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C43077j26 m112989g = this.f14733g.m112989g();
            if (m112989g == null) {
                return;
            }
            m112989g.m31222l(it);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1087:1\n245#2:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n*L\n372#1:1088\n*E\n"})
    /* renamed from: IC0$h */
    /* loaded from: classes.dex */
    public static final class C3383h extends Lambda implements Function1<I61, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14734g;

        /* renamed from: h */
        public final /* synthetic */ F16 f14735h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC33290He3 f14736i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3383h(C16 c16, F16 f16, InterfaceC33290He3 interfaceC33290He3) {
            super(1);
            this.f14734g = c16;
            this.f14735h = f16;
            this.f14736i = interfaceC33290He3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            C43077j26 m112989g = this.f14734g.m112989g();
            if (m112989g != null) {
                F16 f16 = this.f14735h;
                InterfaceC33290He3 interfaceC33290He3 = this.f14736i;
                C16 c16 = this.f14734g;
                C42474i16.f86286a.m35376b(drawBehind.mo20750d0().mo20724a(), f16, interfaceC33290He3, m112989g.m31225i(), c16.m112983m());
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$i */
    /* loaded from: classes.dex */
    public static final class C3384i extends Lambda implements Function1<InterfaceC36951Wv1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14737g;

        /* renamed from: h */
        public final /* synthetic */ U16 f14738h;

        /* renamed from: i */
        public final /* synthetic */ F16 f14739i;

        /* renamed from: j */
        public final /* synthetic */ GY1 f14740j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33290He3 f14741k;

        /* renamed from: l */
        public final /* synthetic */ C51367x16 f14742l;

        /* renamed from: m */
        public final /* synthetic */ ZC0 f14743m;

        /* renamed from: n */
        public final /* synthetic */ E20 f14744n;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", m28418f = "CoreTextField.kt", m28417i = {}, m28416l = {StatusLine.HTTP_PERM_REDIRECT}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: IC0$i$a */
        /* loaded from: classes.dex */
        public static final class C3385a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f14745h;

            /* renamed from: i */
            public final /* synthetic */ E20 f14746i;

            /* renamed from: j */
            public final /* synthetic */ F16 f14747j;

            /* renamed from: k */
            public final /* synthetic */ C16 f14748k;

            /* renamed from: l */
            public final /* synthetic */ C43077j26 f14749l;

            /* renamed from: m */
            public final /* synthetic */ InterfaceC33290He3 f14750m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3385a(E20 e20, F16 f16, C16 c16, C43077j26 c43077j26, InterfaceC33290He3 interfaceC33290He3, Continuation<? super C3385a> continuation) {
                super(2, continuation);
                this.f14746i = e20;
                this.f14747j = f16;
                this.f14748k = c16;
                this.f14749l = c43077j26;
                this.f14750m = interfaceC33290He3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C3385a(this.f14746i, this.f14747j, this.f14748k, this.f14749l, this.f14750m, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C3385a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f14745h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    E20 e20 = this.f14746i;
                    F16 f16 = this.f14747j;
                    T06 m112978r = this.f14748k.m112978r();
                    C42484i26 m31225i = this.f14749l.m31225i();
                    InterfaceC33290He3 interfaceC33290He3 = this.f14750m;
                    this.f14745h = 1;
                    if (IC0.m102804k(e20, f16, m112978r, m31225i, interfaceC33290He3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3384i(C16 c16, U16 u16, F16 f16, GY1 gy1, InterfaceC33290He3 interfaceC33290He3, C51367x16 c51367x16, ZC0 zc0, E20 e20) {
            super(1);
            this.f14737g = c16;
            this.f14738h = u16;
            this.f14739i = f16;
            this.f14740j = gy1;
            this.f14741k = interfaceC33290He3;
            this.f14742l = c51367x16;
            this.f14743m = zc0;
            this.f14744n = e20;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36951Wv1 interfaceC36951Wv1) {
            invoke2(interfaceC36951Wv1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC36951Wv1 it) {
            C43077j26 m112989g;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f14737g.m112992d() == it.mo76101a()) {
                return;
            }
            this.f14737g.m112974v(it.mo76101a());
            U16 u16 = this.f14738h;
            if (u16 != null) {
                IC0.m102802m(u16, this.f14737g, this.f14739i, this.f14740j, this.f14741k);
                if (it.mo76101a() && (m112989g = this.f14737g.m112989g()) != null) {
                    Z30.m73800d(this.f14743m, null, null, new C3385a(this.f14744n, this.f14739i, this.f14737g, m112989g, this.f14741k, null), 3, null);
                }
            }
            if (it.mo76101a()) {
                return;
            }
            C51367x16.m5936q(this.f14742l, null, 1, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$j */
    /* loaded from: classes.dex */
    public static final class C3386j extends Lambda implements Function1<InterfaceC45879nm2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14751g;

        /* renamed from: h */
        public final /* synthetic */ boolean f14752h;

        /* renamed from: i */
        public final /* synthetic */ C51367x16 f14753i;

        /* renamed from: j */
        public final /* synthetic */ F16 f14754j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33290He3 f14755k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3386j(C16 c16, boolean z, C51367x16 c51367x16, F16 f16, InterfaceC33290He3 interfaceC33290He3) {
            super(1);
            this.f14751g = c16;
            this.f14752h = z;
            this.f14753i = c51367x16;
            this.f14754j = f16;
            this.f14755k = interfaceC33290He3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
            invoke2(interfaceC45879nm2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC45879nm2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f14751g.m112972x(it);
            if (this.f14752h) {
                if (this.f14751g.m112993c() == ME1.Selection) {
                    if (this.f14751g.m112981o()) {
                        this.f14753i.m5953a0();
                    } else {
                        this.f14753i.m5971J();
                    }
                    this.f14751g.m112997D(C51960y16.m4233c(this.f14753i, true));
                    this.f14751g.m112998C(C51960y16.m4233c(this.f14753i, false));
                } else if (this.f14751g.m112993c() == ME1.Cursor) {
                    this.f14751g.m113000A(C51960y16.m4233c(this.f14753i, true));
                }
                IC0.m102803l(this.f14751g, this.f14754j, this.f14755k);
            }
            C43077j26 m112989g = this.f14751g.m112989g();
            if (m112989g == null) {
                return;
            }
            m112989g.m31221m(it);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$k */
    /* loaded from: classes.dex */
    public static final class C3387k extends Lambda implements Function1<C32120Ce3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14756g;

        /* renamed from: h */
        public final /* synthetic */ C11309h f14757h;

        /* renamed from: i */
        public final /* synthetic */ boolean f14758i;

        /* renamed from: j */
        public final /* synthetic */ C51367x16 f14759j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33290He3 f14760k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3387k(C16 c16, C11309h c11309h, boolean z, C51367x16 c51367x16, InterfaceC33290He3 interfaceC33290He3) {
            super(1);
            this.f14756g = c16;
            this.f14757h = c11309h;
            this.f14758i = z;
            this.f14759j = c51367x16;
            this.f14760k = interfaceC33290He3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
            m116223invokek4lQ0M(c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m116223invokek4lQ0M(long j) {
            boolean z = true;
            IC0.m102799p(this.f14756g, this.f14757h, !this.f14758i);
            if (this.f14756g.m112992d()) {
                if (this.f14756g.m112993c() != ME1.Selection) {
                    C43077j26 m112989g = this.f14756g.m112989g();
                    if (m112989g != null) {
                        C16 c16 = this.f14756g;
                        C42474i16.f86286a.m35369i(j, m112989g, c16.m112985k(), this.f14760k, c16.m112986j());
                        if (c16.m112978r().m84434l().length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            c16.m112975u(ME1.Cursor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f14759j.m5937p(C32120Ce3.m111955d(j));
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$l */
    /* loaded from: classes.dex */
    public static final class C3388l extends Lambda implements Function0<C50182v16> {

        /* renamed from: g */
        public final /* synthetic */ EnumC32768Ey3 f14761g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3388l(EnumC32768Ey3 enumC32768Ey3) {
            super(0);
            this.f14761g = enumC32768Ey3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C50182v16 invoke() {
            return new C50182v16(this.f14761g, 0.0f, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$m */
    /* loaded from: classes.dex */
    public static final class C3389m extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ GY1 f14762g;

        /* renamed from: h */
        public final /* synthetic */ A96 f14763h;

        /* renamed from: i */
        public final /* synthetic */ F16 f14764i;

        /* renamed from: j */
        public final /* synthetic */ boolean f14765j;

        /* renamed from: k */
        public final /* synthetic */ boolean f14766k;

        /* renamed from: l */
        public final /* synthetic */ boolean f14767l;

        /* renamed from: m */
        public final /* synthetic */ C16 f14768m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC33290He3 f14769n;

        /* renamed from: o */
        public final /* synthetic */ C51367x16 f14770o;

        /* renamed from: p */
        public final /* synthetic */ C11309h f14771p;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$a */
        /* loaded from: classes.dex */
        public static final class C3390a extends Lambda implements Function1<List<C42484i26>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C16 f14772g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3390a(C16 c16) {
                super(1);
                this.f14772g = c16;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<C42484i26> it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f14772g.m112989g() != null) {
                    C43077j26 m112989g = this.f14772g.m112989g();
                    Intrinsics.checkNotNull(m112989g);
                    it.add(m112989g.m31225i());
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$b */
        /* loaded from: classes.dex */
        public static final class C3391b extends Lambda implements Function1<C1577Df, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C16 f14773g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC48906ss5 f14774h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3391b(C16 c16, InterfaceC48906ss5 interfaceC48906ss5) {
                super(1);
                this.f14773g = c16;
                this.f14774h = interfaceC48906ss5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(C1577Df text) {
                Unit unit;
                List<? extends N91> listOf;
                Intrinsics.checkNotNullParameter(text, "text");
                C37723a26 m112991e = this.f14773g.m112991e();
                if (m112991e != null) {
                    C16 c16 = this.f14773g;
                    C42474i16.C22861a c22861a = C42474i16.f86286a;
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new N91[]{new UZ0(), new C46500op0(text, 1)});
                    c22861a.m35372f(listOf, c16.m112985k(), c16.m112986j(), m112991e);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.f14773g.m112986j().invoke(new F16(text.m110052j(), C49006t26.m13201a(text.m110052j().length()), (C48413s26) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$c */
        /* loaded from: classes.dex */
        public static final class C3392c extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC33290He3 f14775g;

            /* renamed from: h */
            public final /* synthetic */ boolean f14776h;

            /* renamed from: i */
            public final /* synthetic */ F16 f14777i;

            /* renamed from: j */
            public final /* synthetic */ C51367x16 f14778j;

            /* renamed from: k */
            public final /* synthetic */ C16 f14779k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3392c(InterfaceC33290He3 interfaceC33290He3, boolean z, F16 f16, C51367x16 c51367x16, C16 c16) {
                super(3);
                this.f14775g = interfaceC33290He3;
                this.f14776h = z;
                this.f14777i = f16;
                this.f14778j = c51367x16;
                this.f14779k = c16;
            }

            /* renamed from: a */
            public final Boolean m102794a(int i, int i2, boolean z) {
                int coerceAtMost;
                int coerceAtLeast;
                if (!z) {
                    i = this.f14775g.transformedToOriginal(i);
                }
                if (!z) {
                    i2 = this.f14775g.transformedToOriginal(i2);
                }
                boolean z2 = false;
                if (this.f14776h && (i != C48413s26.m14832n(this.f14777i.m108103g()) || i2 != C48413s26.m14837i(this.f14777i.m108103g()))) {
                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(i, i2);
                    if (coerceAtMost >= 0) {
                        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, i2);
                        if (coerceAtLeast <= this.f14777i.m108105e().length()) {
                            if (!z && i != i2) {
                                this.f14778j.m5935r();
                            } else {
                                this.f14778j.m5934s();
                            }
                            this.f14779k.m112986j().invoke(new F16(this.f14777i.m108105e(), C49006t26.m13200b(i, i2), (C48413s26) null, 4, (DefaultConstructorMarker) null));
                            z2 = true;
                        }
                    }
                    this.f14778j.m5934s();
                }
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return m102794a(num.intValue(), num2.intValue(), bool.booleanValue());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$d */
        /* loaded from: classes.dex */
        public static final class C3393d extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C16 f14780g;

            /* renamed from: h */
            public final /* synthetic */ C11309h f14781h;

            /* renamed from: i */
            public final /* synthetic */ boolean f14782i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3393d(C16 c16, C11309h c11309h, boolean z) {
                super(0);
                this.f14780g = c16;
                this.f14781h = c11309h;
                this.f14782i = z;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                IC0.m102799p(this.f14780g, this.f14781h, !this.f14782i);
                return Boolean.TRUE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$e */
        /* loaded from: classes.dex */
        public static final class C3394e extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C51367x16 f14783g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3394e(C51367x16 c51367x16) {
                super(0);
                this.f14783g = c51367x16;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f14783g.m5935r();
                return Boolean.TRUE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$f */
        /* loaded from: classes.dex */
        public static final class C3395f extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C51367x16 f14784g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3395f(C51367x16 c51367x16) {
                super(0);
                this.f14784g = c51367x16;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C51367x16.m5941l(this.f14784g, false, 1, null);
                return Boolean.TRUE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$g */
        /* loaded from: classes.dex */
        public static final class C3396g extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C51367x16 f14785g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3396g(C51367x16 c51367x16) {
                super(0);
                this.f14785g = c51367x16;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f14785g.m5938o();
                return Boolean.TRUE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IC0$m$h */
        /* loaded from: classes.dex */
        public static final class C3397h extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C51367x16 f14786g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3397h(C51367x16 c51367x16) {
                super(0);
                this.f14786g = c51367x16;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f14786g.m5969L();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3389m(GY1 gy1, A96 a96, F16 f16, boolean z, boolean z2, boolean z3, C16 c16, InterfaceC33290He3 interfaceC33290He3, C51367x16 c51367x16, C11309h c11309h) {
            super(1);
            this.f14762g = gy1;
            this.f14763h = a96;
            this.f14764i = f16;
            this.f14765j = z;
            this.f14766k = z2;
            this.f14767l = z3;
            this.f14768m = c16;
            this.f14769n = interfaceC33290He3;
            this.f14770o = c51367x16;
            this.f14771p = c11309h;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18614L(semantics, this.f14762g.m105018d());
            C47128ps5.m18617I(semantics, this.f14763h.m116051b());
            C47128ps5.m18601Y(semantics, this.f14764i.m108103g());
            if (!this.f14765j) {
                C47128ps5.m18591h(semantics);
            }
            if (this.f14766k) {
                C47128ps5.m18577v(semantics);
            }
            C47128ps5.m18584o(semantics, null, new C3390a(this.f14768m), 1, null);
            C47128ps5.m18602X(semantics, null, new C3391b(this.f14768m, semantics), 1, null);
            C47128ps5.m18607S(semantics, null, new C3392c(this.f14769n, this.f14765j, this.f14764i, this.f14770o, this.f14768m), 1, null);
            C47128ps5.m18580s(semantics, null, new C3393d(this.f14768m, this.f14771p, this.f14767l), 1, null);
            C47128ps5.m18578u(semantics, null, new C3394e(this.f14770o), 1, null);
            if (!C48413s26.m14838h(this.f14764i.m108103g()) && !this.f14766k) {
                C47128ps5.m18595d(semantics, null, new C3395f(this.f14770o), 1, null);
                if (this.f14765j && !this.f14767l) {
                    C47128ps5.m18593f(semantics, null, new C3396g(this.f14770o), 1, null);
                }
            }
            if (!this.f14765j || this.f14767l) {
                return;
            }
            C47128ps5.m18575x(semantics, null, new C3397h(this.f14770o), 1, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$n */
    /* loaded from: classes.dex */
    public static final class C3398n extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f14787g;

        /* renamed from: h */
        public final /* synthetic */ C51367x16 f14788h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f14789i;

        /* renamed from: j */
        public final /* synthetic */ int f14790j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3398n(InterfaceC41563gV2 interfaceC41563gV2, C51367x16 c51367x16, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f14787g = interfaceC41563gV2;
            this.f14788h = c51367x16;
            this.f14789i = function2;
            this.f14790j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            IC0.m102813b(this.f14787g, this.f14788h, this.f14789i, interfaceC32720Et0, C47127ps4.m18626a(this.f14790j | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$o */
    /* loaded from: classes.dex */
    public static final class C3399o extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C51367x16 f14791g;

        /* renamed from: h */
        public final /* synthetic */ boolean f14792h;

        /* renamed from: i */
        public final /* synthetic */ int f14793i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3399o(C51367x16 c51367x16, boolean z, int i) {
            super(2);
            this.f14791g = c51367x16;
            this.f14792h = z;
            this.f14793i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            IC0.m102812c(this.f14791g, this.f14792h, interfaceC32720Et0, C47127ps4.m18626a(this.f14793i | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", m28418f = "CoreTextField.kt", m28417i = {}, m28416l = {1043}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: IC0$p */
    /* loaded from: classes.dex */
    public static final class C3400p extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f14794h;

        /* renamed from: i */
        public /* synthetic */ Object f14795i;

        /* renamed from: j */
        public final /* synthetic */ Z06 f14796j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3400p(Z06 z06, Continuation<? super C3400p> continuation) {
            super(2, continuation);
            this.f14796j = z06;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3400p c3400p = new C3400p(this.f14796j, continuation);
            c3400p.f14795i = obj;
            return c3400p;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C3400p) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14794h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Z06 z06 = this.f14796j;
                this.f14794h = 1;
                if (C44230kz2.m28050c((InterfaceC49290tX3) this.f14795i, z06, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$q */
    /* loaded from: classes.dex */
    public static final class C3401q extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f14797g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3401q(long j) {
            super(1);
            this.f14797g = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            semantics.mo13560a(C35983Sr5.m84736d(), new C35749Rr5(HE1.Cursor, this.f14797g, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC0$r */
    /* loaded from: classes.dex */
    public static final class C3402r extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C51367x16 f14798g;

        /* renamed from: h */
        public final /* synthetic */ int f14799h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3402r(C51367x16 c51367x16, int i) {
            super(2);
            this.f14798g = c51367x16;
            this.f14799h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            IC0.m102811d(this.f14798g, interfaceC32720Et0, C47127ps4.m18626a(this.f14799h | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lik2;", "keyEvent", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IC0$s */
    /* loaded from: classes.dex */
    public static final class C3403s extends Lambda implements Function1<C42894ik2, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C16 f14800g;

        /* renamed from: h */
        public final /* synthetic */ C51367x16 f14801h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3403s(C16 c16, C51367x16 c51367x16) {
            super(1);
            this.f14800g = c16;
            this.f14801h = c51367x16;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
            return m116224invokeZmokQxo(c42894ik2.m33518f());
        }

        /* renamed from: invoke-ZmokQxo  reason: not valid java name */
        public final Boolean m116224invokeZmokQxo(KeyEvent keyEvent) {
            boolean z;
            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
            if (this.f14800g.m112993c() == ME1.Selection && C44080kk2.m28555a(keyEvent)) {
                z = true;
                C51367x16.m5936q(this.f14801h, null, 1, null);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0455, code lost:
        if (r11 == null) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x068c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* JADX WARN: Type inference failed for: r0v39, types: [gV2] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m102814a(F16 value, Function1<? super F16, Unit> onValueChange, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, InterfaceC32735Eu6 interfaceC32735Eu6, Function1<? super C42484i26, Unit> function1, InterfaceC48104rX2 interfaceC48104rX2, AbstractC37727a30 abstractC37727a30, boolean z, int i, int i2, GY1 gy1, C37555Zk2 c37555Zk2, boolean z2, boolean z3, Function3<? super Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4, int i5) {
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
        InterfaceC41563gV2 interfaceC41563gV22;
        AbstractC37727a30 abstractC37727a302;
        GY1 gy12;
        boolean z4;
        InterfaceC41563gV2 interfaceC41563gV23;
        Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> function32;
        boolean z5;
        int i20;
        C37555Zk2 c37555Zk22;
        AbstractC37727a30 abstractC37727a303;
        boolean z6;
        G26 g262;
        InterfaceC32735Eu6 interfaceC32735Eu62;
        Function1<? super C42484i26, Unit> function12;
        InterfaceC48104rX2 interfaceC48104rX22;
        int i21;
        GY1 gy13;
        int i22;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        EnumC32768Ey3 enumC32768Ey3;
        boolean mo89539n;
        Object mo89635G2;
        boolean mo89539n2;
        A96 mo89635G3;
        C48413s26 m108104f;
        InterfaceC48104rX2 interfaceC48104rX23;
        Object mo89635G4;
        Object mo89635G5;
        Object mo89635G6;
        Object mo89635G7;
        Object mo89635G8;
        InterfaceC41563gV2 m28017c;
        InterfaceC41563gV2 interfaceC41563gV24;
        C33518Id6 c33518Id6;
        U16 u16;
        InterfaceC48104rX2 interfaceC48104rX24;
        boolean z7;
        InterfaceC41563gV2 m41252b;
        InterfaceC32720Et0 interfaceC32720Et02;
        G26 g263;
        InterfaceC32735Eu6 interfaceC32735Eu63;
        Function1<? super C42484i26, Unit> function13;
        AbstractC37727a30 abstractC37727a304;
        boolean z8;
        int i23;
        C37555Zk2 c37555Zk23;
        InterfaceC41563gV2 interfaceC41563gV25;
        InterfaceC48104rX2 interfaceC48104rX25;
        boolean z9;
        Function3<? super Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, ? super InterfaceC32720Et0, ? super Integer, Unit> function33;
        boolean z10;
        GY1 gy14;
        int i24;
        InterfaceC36874Wm5 mo89512w;
        int i25;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-958708118);
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
        int i26 = i5 & 4;
        if (i26 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= mo89518u.mo89539n(interfaceC41563gV2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= mo89518u.mo89539n(g26) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= mo89518u.mo89539n(interfaceC32735Eu6) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ImageMetadata.EDGE_MODE;
                } else if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i6 |= mo89518u.mo89629I(function1) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= mo89518u.mo89539n(interfaceC48104rX2) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= mo89518u.mo89539n(abstractC37727a30) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= mo89518u.mo89536o(z) ? 67108864 : 33554432;
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= mo89518u.mo89527r(i) ? 536870912 : 268435456;
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (mo89518u.mo89527r(i2) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                if ((i4 & 112) == 0) {
                    if ((i5 & 2048) == 0 && mo89518u.mo89539n(gy1)) {
                        i25 = 32;
                        i15 |= i25;
                    }
                    i25 = 16;
                    i15 |= i25;
                }
                int i27 = i15;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i27 |= 384;
                } else if ((i4 & 896) == 0) {
                    i27 |= mo89518u.mo89539n(c37555Zk2) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i27 |= 3072;
                    } else if ((i4 & 7168) == 0) {
                        i27 |= mo89518u.mo89536o(z2) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i27 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i27 |= mo89518u.mo89536o(z3) ? 16384 : 8192;
                        }
                        i19 = i5 & DateUtils.FORMAT_ABBREV_WEEKDAY;
                        if (i19 != 0) {
                            i27 |= ImageMetadata.EDGE_MODE;
                        } else if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                            i27 |= mo89518u.mo89629I(function3) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                        }
                        if ((i6 & 1533916891) != 306783378 && (374491 & i27) == 74898 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV25 = interfaceC41563gV2;
                            g263 = g26;
                            interfaceC32735Eu63 = interfaceC32735Eu6;
                            function13 = function1;
                            interfaceC48104rX25 = interfaceC48104rX2;
                            abstractC37727a304 = abstractC37727a30;
                            z8 = z;
                            i23 = i2;
                            gy14 = gy1;
                            c37555Zk23 = c37555Zk2;
                            z10 = z2;
                            z9 = z3;
                            function33 = function3;
                            interfaceC32720Et02 = mo89518u;
                            i24 = i;
                        } else {
                            mo89518u.mo89626J();
                            if ((i3 & 1) == 0 && !mo89518u.mo89545l()) {
                                mo89518u.mo89548k();
                                if ((i5 & 2048) != 0) {
                                    interfaceC41563gV23 = interfaceC41563gV2;
                                    g262 = g26;
                                    interfaceC32735Eu62 = interfaceC32735Eu6;
                                    function12 = function1;
                                    interfaceC48104rX22 = interfaceC48104rX2;
                                    abstractC37727a303 = abstractC37727a30;
                                    z5 = z;
                                    i21 = i;
                                    i20 = i2;
                                    gy13 = gy1;
                                    c37555Zk22 = c37555Zk2;
                                    z4 = z2;
                                    z6 = z3;
                                    function32 = function3;
                                    i22 = i27 & (-113);
                                    mo89518u.mo89650B();
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87816Z(-958708118, i6, i22, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:180)");
                                    }
                                    mo89518u.mo89638F(-492369756);
                                    mo89635G = mo89518u.mo89635G();
                                    c2012a = InterfaceC32720Et0.f8257a;
                                    if (mo89635G == c2012a.m108267a()) {
                                        mo89635G = new C11309h();
                                        mo89518u.mo89503z(mo89635G);
                                    }
                                    mo89518u.mo89605Q();
                                    C11309h c11309h = (C11309h) mo89635G;
                                    mo89518u.mo89638F(-55012947);
                                    U16 u162 = (z4 || z6) ? null : (U16) mo89518u.mo89572c(C42399hu0.m35605n());
                                    mo89518u.mo89605Q();
                                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                                    AbstractC44199kw1.InterfaceC25559b interfaceC25559b = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                                    long m114777a = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                                    InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                                    enumC32768Ey3 = !(i21 != 1 && !z5 && gy13.m105016f()) ? EnumC32768Ey3.Horizontal : EnumC32768Ey3.Vertical;
                                    Object[] objArr = {enumC32768Ey3};
                                    InterfaceC35668Ri5<C50182v16, Object> m9363a = C50182v16.f113347f.m9363a();
                                    InterfaceC41563gV2 interfaceC41563gV26 = interfaceC41563gV23;
                                    mo89518u.mo89638F(1157296644);
                                    mo89539n = mo89518u.mo89539n(enumC32768Ey3);
                                    int i28 = i21;
                                    mo89635G2 = mo89518u.mo89635G();
                                    if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                                        mo89635G2 = new C3388l(enumC32768Ey3);
                                        mo89518u.mo89503z(mo89635G2);
                                    }
                                    mo89518u.mo89605Q();
                                    C50182v16 c50182v16 = (C50182v16) C35550Qv4.m87571b(objArr, m9363a, null, (Function0) mo89635G2, mo89518u, 72, 4);
                                    mo89518u.mo89638F(511388516);
                                    mo89539n2 = mo89518u.mo89539n(value) | mo89518u.mo89539n(interfaceC32735Eu62);
                                    mo89635G3 = mo89518u.mo89635G();
                                    if (!mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                                        A96 m8229a = C50595vj6.m8229a(interfaceC32735Eu62, value.m108105e());
                                        m108104f = value.m108104f();
                                        if (m108104f == null) {
                                            interfaceC48104rX23 = interfaceC48104rX22;
                                            A96 m35377a = C42474i16.f86286a.m35377a(m108104f.m14828r(), m8229a);
                                            mo89635G3 = m35377a;
                                        } else {
                                            interfaceC48104rX23 = interfaceC48104rX22;
                                        }
                                        mo89635G3 = m8229a;
                                        mo89518u.mo89503z(mo89635G3);
                                    } else {
                                        interfaceC48104rX23 = interfaceC48104rX22;
                                    }
                                    mo89518u.mo89605Q();
                                    A96 a96 = (A96) mo89635G3;
                                    C1577Df m116051b = a96.m116051b();
                                    InterfaceC33290He3 m116052a = a96.m116052a();
                                    InterfaceC45941ns4 m2336b = C52468yt0.m2336b(mo89518u, 0);
                                    mo89518u.mo89638F(-492369756);
                                    mo89635G4 = mo89518u.mo89635G();
                                    int i29 = i22;
                                    if (mo89635G4 == c2012a.m108267a()) {
                                        mo89635G4 = new C16(new T06(m116051b, g262, 0, 0, z5, 0, interfaceC41273g01, interfaceC25559b, null, 300, null), m2336b);
                                        mo89518u.mo89503z(mo89635G4);
                                    }
                                    mo89518u.mo89605Q();
                                    C16 c16 = (C16) mo89635G4;
                                    c16.m112996E(value.m108105e(), m116051b, g262, z5, interfaceC41273g01, interfaceC25559b, onValueChange, c37555Zk22, interfaceC32037Bv1, m114777a);
                                    c16.m112985k().m90634d(value, c16.m112991e());
                                    mo89518u.mo89638F(-492369756);
                                    mo89635G5 = mo89518u.mo89635G();
                                    if (mo89635G5 == c2012a.m108267a()) {
                                        mo89635G5 = new C33518Id6(0, 1, null);
                                        mo89518u.mo89503z(mo89635G5);
                                    }
                                    mo89518u.mo89605Q();
                                    C33518Id6 c33518Id62 = (C33518Id6) mo89635G5;
                                    C33518Id6.m101869f(c33518Id62, value, 0L, 2, null);
                                    mo89518u.mo89638F(-492369756);
                                    mo89635G6 = mo89518u.mo89635G();
                                    if (mo89635G6 == c2012a.m108267a()) {
                                        mo89635G6 = new C51367x16(c33518Id62);
                                        mo89518u.mo89503z(mo89635G6);
                                    }
                                    mo89518u.mo89605Q();
                                    C51367x16 c51367x16 = (C51367x16) mo89635G6;
                                    c51367x16.m5960U(m116052a);
                                    c51367x16.m5955Z(interfaceC32735Eu62);
                                    c51367x16.m5959V(c16.m112986j());
                                    c51367x16.m5958W(c16);
                                    c51367x16.m5956Y(value);
                                    c51367x16.m5967N((InterfaceC36383Uk0) mo89518u.mo89572c(C42399hu0.m35613f()));
                                    c51367x16.m5957X((I26) mo89518u.mo89572c(C42399hu0.m35604o()));
                                    c51367x16.m5961T((WE1) mo89518u.mo89572c(C42399hu0.m35609j()));
                                    c51367x16.m5963R(c11309h);
                                    c51367x16.m5964Q(!z6);
                                    mo89518u.mo89638F(773894976);
                                    mo89518u.mo89638F(-492369756);
                                    mo89635G7 = mo89518u.mo89635G();
                                    if (mo89635G7 == c2012a.m108267a()) {
                                        C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                                        mo89518u.mo89503z(c42992iu0);
                                        mo89635G7 = c42992iu0;
                                    }
                                    mo89518u.mo89605Q();
                                    ZC0 m31665a = ((C42992iu0) mo89635G7).m31665a();
                                    mo89518u.mo89605Q();
                                    mo89518u.mo89638F(-492369756);
                                    mo89635G8 = mo89518u.mo89635G();
                                    if (mo89635G8 == c2012a.m108267a()) {
                                        mo89635G8 = G20.m105945a();
                                        mo89518u.mo89503z(mo89635G8);
                                    }
                                    mo89518u.mo89605Q();
                                    E20 e20 = (E20) mo89635G8;
                                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                                    C3384i c3384i = new C3384i(c16, u162, value, gy13, m116052a, c51367x16, m31665a, e20);
                                    InterfaceC48104rX2 interfaceC48104rX26 = interfaceC48104rX23;
                                    m28017c = C44253l16.m28017c(c20912a, z4, c11309h, interfaceC48104rX26, c3384i);
                                    mo89518u.mo89638F(-55008430);
                                    if (z4 || z6) {
                                        interfaceC41563gV24 = m28017c;
                                    } else {
                                        interfaceC41563gV24 = m28017c;
                                        Y91.m75536c(c16, new C3369b(c16), mo89518u, 8);
                                    }
                                    mo89518u.mo89605Q();
                                    if (!Y56.m75752a()) {
                                        m41252b = C48996t16.m13227a(c20912a, interfaceC48104rX26, z4, new C3387k(c16, c11309h, z6, c51367x16, m116052a)).mo39266t0(C44253l16.m28019a(c20912a, c51367x16.m5974G(), z4));
                                        c33518Id6 = c33518Id62;
                                        u16 = u162;
                                        interfaceC48104rX24 = interfaceC48104rX26;
                                        z7 = false;
                                    } else {
                                        c33518Id6 = c33518Id62;
                                        u16 = u162;
                                        interfaceC48104rX24 = interfaceC48104rX26;
                                        z7 = false;
                                        m41252b = C40989fX3.m41252b(C44253l16.m28018b(c20912a, c51367x16.m5979B(), z4), C47228q26.m18273a(), false, 2, null);
                                    }
                                    InterfaceC41563gV2 m68867a = C11289a.m68867a(c20912a, new C3383h(c16, value, m116052a));
                                    InterfaceC41563gV2 m83186a = C36116Tg3.m83186a(c20912a, new C3386j(c16, z4, c51367x16, value, m116052a));
                                    InterfaceC41563gV2 m40621a = C41198fs5.m40621a(c20912a, true, new C3389m(gy13, a96, value, z4, interfaceC32735Eu62 instanceof OI3, z6, c16, m116052a, c51367x16, c11309h));
                                    InterfaceC41563gV2 m42266b = C40695f16.m42266b(c20912a, c16, value, m116052a, abstractC37727a303, (z4 || z6) ? z7 : true);
                                    Y91.m75536c(c51367x16, new C3371c(c51367x16), mo89518u, 8);
                                    Y91.m75536c(gy13, new C3373d(u16, c16, value, gy13), mo89518u, (i29 >> 3) & 14);
                                    InterfaceC48104rX2 interfaceC48104rX27 = interfaceC48104rX24;
                                    InterfaceC41563gV2 m83186a2 = C36116Tg3.m83186a(C49589u16.m11052d(m102800o(C43660k16.m29453a(interfaceC41563gV26.mo39266t0(interfaceC41563gV24), c16, interfaceC32037Bv1), c16, c51367x16).mo39266t0(C46032o16.m21978a(c20912a, c16, c51367x16, value, c16.m112986j(), !z6, i28 != 1 ? true : z7, m116052a, c33518Id6)), c50182v16, interfaceC48104rX27, z4).mo39266t0(m41252b).mo39266t0(m40621a), new C3382g(c16));
                                    boolean z11 = !z4 && c16.m112992d() && Y56.m75752a();
                                    boolean z12 = z4;
                                    GY1 gy15 = gy13;
                                    InterfaceC32735Eu6 interfaceC32735Eu64 = interfaceC32735Eu62;
                                    interfaceC32720Et02 = mo89518u;
                                    m102813b(m83186a2, c51367x16, C43575jt0.m29791b(interfaceC32720Et02, -374338080, true, new C3375e(function32, i29, c16, g262, i20, i28, c50182v16, value, interfaceC32735Eu62, m42266b, m68867a, m83186a, !z11 ? C52553z16.m2012b(c20912a, c51367x16) : c20912a, e20, c51367x16, z11, z6, function12, m116052a, interfaceC41273g01)), interfaceC32720Et02, 448);
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    g263 = g262;
                                    interfaceC32735Eu63 = interfaceC32735Eu64;
                                    function13 = function12;
                                    abstractC37727a304 = abstractC37727a303;
                                    z8 = z5;
                                    i23 = i20;
                                    c37555Zk23 = c37555Zk22;
                                    interfaceC41563gV25 = interfaceC41563gV26;
                                    interfaceC48104rX25 = interfaceC48104rX27;
                                    z9 = z6;
                                    function33 = function32;
                                    z10 = z12;
                                    gy14 = gy15;
                                    i24 = i28;
                                } else {
                                    interfaceC41563gV23 = interfaceC41563gV2;
                                    g262 = g26;
                                    interfaceC32735Eu62 = interfaceC32735Eu6;
                                    function12 = function1;
                                    interfaceC48104rX22 = interfaceC48104rX2;
                                    abstractC37727a303 = abstractC37727a30;
                                    z5 = z;
                                    i21 = i;
                                    i20 = i2;
                                    gy13 = gy1;
                                    c37555Zk22 = c37555Zk2;
                                    z4 = z2;
                                    z6 = z3;
                                    function32 = function3;
                                }
                            } else {
                                InterfaceC41563gV2 interfaceC41563gV27 = i26 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                                G26 m105898a = i7 != 0 ? G26.f10825d.m105898a() : g26;
                                InterfaceC32735Eu6 m108216a = i8 != 0 ? InterfaceC32735Eu6.f8291a.m108216a() : interfaceC32735Eu6;
                                Function1<? super C42484i26, Unit> function14 = i9 != 0 ? C3368a.f14650g : function1;
                                InterfaceC48104rX2 interfaceC48104rX28 = i10 != 0 ? null : interfaceC48104rX2;
                                if (i11 != 0) {
                                    interfaceC41563gV22 = interfaceC41563gV27;
                                    abstractC37727a302 = new C46831pN5(C47063pm0.f104050b.m18726g(), null);
                                } else {
                                    interfaceC41563gV22 = interfaceC41563gV27;
                                    abstractC37727a302 = abstractC37727a30;
                                }
                                boolean z13 = i12 != 0 ? true : z;
                                int i30 = i13 != 0 ? Integer.MAX_VALUE : i;
                                int i31 = i14 != 0 ? 1 : i2;
                                if ((i5 & 2048) != 0) {
                                    gy12 = GY1.f12055f.m105015a();
                                    i27 &= -113;
                                } else {
                                    gy12 = gy1;
                                }
                                C37555Zk2 m72587a = i16 != 0 ? C37555Zk2.f49150g.m72587a() : c37555Zk2;
                                z4 = i17 != 0 ? true : z2;
                                boolean z14 = i18 != 0 ? false : z3;
                                if (i19 != 0) {
                                    interfaceC41563gV23 = interfaceC41563gV22;
                                    z5 = z13;
                                    i20 = i31;
                                    c37555Zk22 = m72587a;
                                    abstractC37727a303 = abstractC37727a302;
                                    z6 = z14;
                                    g262 = m105898a;
                                    function32 = C48911st0.f109448a.m13550a();
                                } else {
                                    interfaceC41563gV23 = interfaceC41563gV22;
                                    function32 = function3;
                                    z5 = z13;
                                    i20 = i31;
                                    c37555Zk22 = m72587a;
                                    abstractC37727a303 = abstractC37727a302;
                                    z6 = z14;
                                    g262 = m105898a;
                                }
                                interfaceC32735Eu62 = m108216a;
                                function12 = function14;
                                interfaceC48104rX22 = interfaceC48104rX28;
                                i21 = i30;
                                gy13 = gy12;
                            }
                            i22 = i27;
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                            }
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            c2012a = InterfaceC32720Et0.f8257a;
                            if (mo89635G == c2012a.m108267a()) {
                            }
                            mo89518u.mo89605Q();
                            C11309h c11309h2 = (C11309h) mo89635G;
                            mo89518u.mo89638F(-55012947);
                            if (z4) {
                            }
                            mo89518u.mo89605Q();
                            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            AbstractC44199kw1.InterfaceC25559b interfaceC25559b2 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                            long m114777a2 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                            InterfaceC32037Bv1 interfaceC32037Bv12 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                            if (!(i21 != 1 && !z5 && gy13.m105016f())) {
                            }
                            Object[] objArr2 = {enumC32768Ey3};
                            InterfaceC35668Ri5<C50182v16, Object> m9363a2 = C50182v16.f113347f.m9363a();
                            InterfaceC41563gV2 interfaceC41563gV262 = interfaceC41563gV23;
                            mo89518u.mo89638F(1157296644);
                            mo89539n = mo89518u.mo89539n(enumC32768Ey3);
                            int i282 = i21;
                            mo89635G2 = mo89518u.mo89635G();
                            if (!mo89539n) {
                            }
                            mo89635G2 = new C3388l(enumC32768Ey3);
                            mo89518u.mo89503z(mo89635G2);
                            mo89518u.mo89605Q();
                            C50182v16 c50182v162 = (C50182v16) C35550Qv4.m87571b(objArr2, m9363a2, null, (Function0) mo89635G2, mo89518u, 72, 4);
                            mo89518u.mo89638F(511388516);
                            mo89539n2 = mo89518u.mo89539n(value) | mo89518u.mo89539n(interfaceC32735Eu62);
                            mo89635G3 = mo89518u.mo89635G();
                            if (mo89539n2) {
                            }
                            A96 m8229a2 = C50595vj6.m8229a(interfaceC32735Eu62, value.m108105e());
                            m108104f = value.m108104f();
                            if (m108104f == null) {
                            }
                            mo89635G3 = m8229a2;
                            mo89518u.mo89503z(mo89635G3);
                            mo89518u.mo89605Q();
                            A96 a962 = (A96) mo89635G3;
                            C1577Df m116051b2 = a962.m116051b();
                            InterfaceC33290He3 m116052a2 = a962.m116052a();
                            InterfaceC45941ns4 m2336b2 = C52468yt0.m2336b(mo89518u, 0);
                            mo89518u.mo89638F(-492369756);
                            mo89635G4 = mo89518u.mo89635G();
                            int i292 = i22;
                            if (mo89635G4 == c2012a.m108267a()) {
                            }
                            mo89518u.mo89605Q();
                            C16 c162 = (C16) mo89635G4;
                            c162.m112996E(value.m108105e(), m116051b2, g262, z5, interfaceC41273g012, interfaceC25559b2, onValueChange, c37555Zk22, interfaceC32037Bv12, m114777a2);
                            c162.m112985k().m90634d(value, c162.m112991e());
                            mo89518u.mo89638F(-492369756);
                            mo89635G5 = mo89518u.mo89635G();
                            if (mo89635G5 == c2012a.m108267a()) {
                            }
                            mo89518u.mo89605Q();
                            C33518Id6 c33518Id622 = (C33518Id6) mo89635G5;
                            C33518Id6.m101869f(c33518Id622, value, 0L, 2, null);
                            mo89518u.mo89638F(-492369756);
                            mo89635G6 = mo89518u.mo89635G();
                            if (mo89635G6 == c2012a.m108267a()) {
                            }
                            mo89518u.mo89605Q();
                            C51367x16 c51367x162 = (C51367x16) mo89635G6;
                            c51367x162.m5960U(m116052a2);
                            c51367x162.m5955Z(interfaceC32735Eu62);
                            c51367x162.m5959V(c162.m112986j());
                            c51367x162.m5958W(c162);
                            c51367x162.m5956Y(value);
                            c51367x162.m5967N((InterfaceC36383Uk0) mo89518u.mo89572c(C42399hu0.m35613f()));
                            c51367x162.m5957X((I26) mo89518u.mo89572c(C42399hu0.m35604o()));
                            c51367x162.m5961T((WE1) mo89518u.mo89572c(C42399hu0.m35609j()));
                            c51367x162.m5963R(c11309h2);
                            c51367x162.m5964Q(!z6);
                            mo89518u.mo89638F(773894976);
                            mo89518u.mo89638F(-492369756);
                            mo89635G7 = mo89518u.mo89635G();
                            if (mo89635G7 == c2012a.m108267a()) {
                            }
                            mo89518u.mo89605Q();
                            ZC0 m31665a2 = ((C42992iu0) mo89635G7).m31665a();
                            mo89518u.mo89605Q();
                            mo89518u.mo89638F(-492369756);
                            mo89635G8 = mo89518u.mo89635G();
                            if (mo89635G8 == c2012a.m108267a()) {
                            }
                            mo89518u.mo89605Q();
                            E20 e202 = (E20) mo89635G8;
                            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                            C3384i c3384i2 = new C3384i(c162, u162, value, gy13, m116052a2, c51367x162, m31665a2, e202);
                            InterfaceC48104rX2 interfaceC48104rX262 = interfaceC48104rX23;
                            m28017c = C44253l16.m28017c(c20912a2, z4, c11309h2, interfaceC48104rX262, c3384i2);
                            mo89518u.mo89638F(-55008430);
                            if (z4) {
                            }
                            interfaceC41563gV24 = m28017c;
                            mo89518u.mo89605Q();
                            if (!Y56.m75752a()) {
                            }
                            InterfaceC41563gV2 m68867a2 = C11289a.m68867a(c20912a2, new C3383h(c162, value, m116052a2));
                            InterfaceC41563gV2 m83186a3 = C36116Tg3.m83186a(c20912a2, new C3386j(c162, z4, c51367x162, value, m116052a2));
                            InterfaceC41563gV2 m40621a2 = C41198fs5.m40621a(c20912a2, true, new C3389m(gy13, a962, value, z4, interfaceC32735Eu62 instanceof OI3, z6, c162, m116052a2, c51367x162, c11309h2));
                            InterfaceC41563gV2 m42266b2 = C40695f16.m42266b(c20912a2, c162, value, m116052a2, abstractC37727a303, (z4 || z6) ? z7 : true);
                            Y91.m75536c(c51367x162, new C3371c(c51367x162), mo89518u, 8);
                            Y91.m75536c(gy13, new C3373d(u16, c162, value, gy13), mo89518u, (i292 >> 3) & 14);
                            InterfaceC48104rX2 interfaceC48104rX272 = interfaceC48104rX24;
                            InterfaceC41563gV2 m83186a22 = C36116Tg3.m83186a(C49589u16.m11052d(m102800o(C43660k16.m29453a(interfaceC41563gV262.mo39266t0(interfaceC41563gV24), c162, interfaceC32037Bv12), c162, c51367x162).mo39266t0(C46032o16.m21978a(c20912a2, c162, c51367x162, value, c162.m112986j(), !z6, i282 != 1 ? true : z7, m116052a2, c33518Id6)), c50182v162, interfaceC48104rX272, z4).mo39266t0(m41252b).mo39266t0(m40621a2), new C3382g(c162));
                            if (z4) {
                            }
                            boolean z122 = z4;
                            GY1 gy152 = gy13;
                            InterfaceC32735Eu6 interfaceC32735Eu642 = interfaceC32735Eu62;
                            interfaceC32720Et02 = mo89518u;
                            m102813b(m83186a22, c51367x162, C43575jt0.m29791b(interfaceC32720Et02, -374338080, true, new C3375e(function32, i292, c162, g262, i20, i282, c50182v162, value, interfaceC32735Eu62, m42266b2, m68867a2, m83186a3, !z11 ? C52553z16.m2012b(c20912a2, c51367x162) : c20912a2, e202, c51367x162, z11, z6, function12, m116052a2, interfaceC41273g012)), interfaceC32720Et02, 448);
                            if (C35528Qt0.m87827O()) {
                            }
                            g263 = g262;
                            interfaceC32735Eu63 = interfaceC32735Eu642;
                            function13 = function12;
                            abstractC37727a304 = abstractC37727a303;
                            z8 = z5;
                            i23 = i20;
                            c37555Zk23 = c37555Zk22;
                            interfaceC41563gV25 = interfaceC41563gV262;
                            interfaceC48104rX25 = interfaceC48104rX272;
                            z9 = z6;
                            function33 = function32;
                            z10 = z122;
                            gy14 = gy152;
                            i24 = i282;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C3381f(value, onValueChange, interfaceC41563gV25, g263, interfaceC32735Eu63, function13, interfaceC48104rX25, abstractC37727a304, z8, i24, i23, gy14, c37555Zk23, z10, z9, function33, i3, i4, i5));
                        return;
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & DateUtils.FORMAT_ABBREV_WEEKDAY;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i3 & 1) == 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    interfaceC32735Eu62 = m108216a;
                    function12 = function14;
                    interfaceC48104rX22 = interfaceC48104rX28;
                    i21 = i30;
                    gy13 = gy12;
                    i22 = i27;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    C11309h c11309h22 = (C11309h) mo89635G;
                    mo89518u.mo89638F(-55012947);
                    if (z4) {
                    }
                    mo89518u.mo89605Q();
                    InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    AbstractC44199kw1.InterfaceC25559b interfaceC25559b22 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                    long m114777a22 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                    InterfaceC32037Bv1 interfaceC32037Bv122 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                    if (!(i21 != 1 && !z5 && gy13.m105016f())) {
                    }
                    Object[] objArr22 = {enumC32768Ey3};
                    InterfaceC35668Ri5<C50182v16, Object> m9363a22 = C50182v16.f113347f.m9363a();
                    InterfaceC41563gV2 interfaceC41563gV2622 = interfaceC41563gV23;
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(enumC32768Ey3);
                    int i2822 = i21;
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G2 = new C3388l(enumC32768Ey3);
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    C50182v16 c50182v1622 = (C50182v16) C35550Qv4.m87571b(objArr22, m9363a22, null, (Function0) mo89635G2, mo89518u, 72, 4);
                    mo89518u.mo89638F(511388516);
                    mo89539n2 = mo89518u.mo89539n(value) | mo89518u.mo89539n(interfaceC32735Eu62);
                    mo89635G3 = mo89518u.mo89635G();
                    if (mo89539n2) {
                    }
                    A96 m8229a22 = C50595vj6.m8229a(interfaceC32735Eu62, value.m108105e());
                    m108104f = value.m108104f();
                    if (m108104f == null) {
                    }
                    mo89635G3 = m8229a22;
                    mo89518u.mo89503z(mo89635G3);
                    mo89518u.mo89605Q();
                    A96 a9622 = (A96) mo89635G3;
                    C1577Df m116051b22 = a9622.m116051b();
                    InterfaceC33290He3 m116052a22 = a9622.m116052a();
                    InterfaceC45941ns4 m2336b22 = C52468yt0.m2336b(mo89518u, 0);
                    mo89518u.mo89638F(-492369756);
                    mo89635G4 = mo89518u.mo89635G();
                    int i2922 = i22;
                    if (mo89635G4 == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    C16 c1622 = (C16) mo89635G4;
                    c1622.m112996E(value.m108105e(), m116051b22, g262, z5, interfaceC41273g0122, interfaceC25559b22, onValueChange, c37555Zk22, interfaceC32037Bv122, m114777a22);
                    c1622.m112985k().m90634d(value, c1622.m112991e());
                    mo89518u.mo89638F(-492369756);
                    mo89635G5 = mo89518u.mo89635G();
                    if (mo89635G5 == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    C33518Id6 c33518Id6222 = (C33518Id6) mo89635G5;
                    C33518Id6.m101869f(c33518Id6222, value, 0L, 2, null);
                    mo89518u.mo89638F(-492369756);
                    mo89635G6 = mo89518u.mo89635G();
                    if (mo89635G6 == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    C51367x16 c51367x1622 = (C51367x16) mo89635G6;
                    c51367x1622.m5960U(m116052a22);
                    c51367x1622.m5955Z(interfaceC32735Eu62);
                    c51367x1622.m5959V(c1622.m112986j());
                    c51367x1622.m5958W(c1622);
                    c51367x1622.m5956Y(value);
                    c51367x1622.m5967N((InterfaceC36383Uk0) mo89518u.mo89572c(C42399hu0.m35613f()));
                    c51367x1622.m5957X((I26) mo89518u.mo89572c(C42399hu0.m35604o()));
                    c51367x1622.m5961T((WE1) mo89518u.mo89572c(C42399hu0.m35609j()));
                    c51367x1622.m5963R(c11309h22);
                    c51367x1622.m5964Q(!z6);
                    mo89518u.mo89638F(773894976);
                    mo89518u.mo89638F(-492369756);
                    mo89635G7 = mo89518u.mo89635G();
                    if (mo89635G7 == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    ZC0 m31665a22 = ((C42992iu0) mo89635G7).m31665a();
                    mo89518u.mo89605Q();
                    mo89518u.mo89638F(-492369756);
                    mo89635G8 = mo89518u.mo89635G();
                    if (mo89635G8 == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    E20 e2022 = (E20) mo89635G8;
                    InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
                    C3384i c3384i22 = new C3384i(c1622, u162, value, gy13, m116052a22, c51367x1622, m31665a22, e2022);
                    InterfaceC48104rX2 interfaceC48104rX2622 = interfaceC48104rX23;
                    m28017c = C44253l16.m28017c(c20912a22, z4, c11309h22, interfaceC48104rX2622, c3384i22);
                    mo89518u.mo89638F(-55008430);
                    if (z4) {
                    }
                    interfaceC41563gV24 = m28017c;
                    mo89518u.mo89605Q();
                    if (!Y56.m75752a()) {
                    }
                    InterfaceC41563gV2 m68867a22 = C11289a.m68867a(c20912a22, new C3383h(c1622, value, m116052a22));
                    InterfaceC41563gV2 m83186a32 = C36116Tg3.m83186a(c20912a22, new C3386j(c1622, z4, c51367x1622, value, m116052a22));
                    InterfaceC41563gV2 m40621a22 = C41198fs5.m40621a(c20912a22, true, new C3389m(gy13, a9622, value, z4, interfaceC32735Eu62 instanceof OI3, z6, c1622, m116052a22, c51367x1622, c11309h22));
                    InterfaceC41563gV2 m42266b22 = C40695f16.m42266b(c20912a22, c1622, value, m116052a22, abstractC37727a303, (z4 || z6) ? z7 : true);
                    Y91.m75536c(c51367x1622, new C3371c(c51367x1622), mo89518u, 8);
                    Y91.m75536c(gy13, new C3373d(u16, c1622, value, gy13), mo89518u, (i2922 >> 3) & 14);
                    InterfaceC48104rX2 interfaceC48104rX2722 = interfaceC48104rX24;
                    InterfaceC41563gV2 m83186a222 = C36116Tg3.m83186a(C49589u16.m11052d(m102800o(C43660k16.m29453a(interfaceC41563gV2622.mo39266t0(interfaceC41563gV24), c1622, interfaceC32037Bv122), c1622, c51367x1622).mo39266t0(C46032o16.m21978a(c20912a22, c1622, c51367x1622, value, c1622.m112986j(), !z6, i2822 != 1 ? true : z7, m116052a22, c33518Id6)), c50182v1622, interfaceC48104rX2722, z4).mo39266t0(m41252b).mo39266t0(m40621a22), new C3382g(c1622));
                    if (z4) {
                    }
                    boolean z1222 = z4;
                    GY1 gy1522 = gy13;
                    InterfaceC32735Eu6 interfaceC32735Eu6422 = interfaceC32735Eu62;
                    interfaceC32720Et02 = mo89518u;
                    m102813b(m83186a222, c51367x1622, C43575jt0.m29791b(interfaceC32720Et02, -374338080, true, new C3375e(function32, i2922, c1622, g262, i20, i2822, c50182v1622, value, interfaceC32735Eu62, m42266b22, m68867a22, m83186a32, !z11 ? C52553z16.m2012b(c20912a22, c51367x1622) : c20912a22, e2022, c51367x1622, z11, z6, function12, m116052a22, interfaceC41273g0122)), interfaceC32720Et02, 448);
                    if (C35528Qt0.m87827O()) {
                    }
                    g263 = g262;
                    interfaceC32735Eu63 = interfaceC32735Eu6422;
                    function13 = function12;
                    abstractC37727a304 = abstractC37727a303;
                    z8 = z5;
                    i23 = i20;
                    c37555Zk23 = c37555Zk22;
                    interfaceC41563gV25 = interfaceC41563gV2622;
                    interfaceC48104rX25 = interfaceC48104rX2722;
                    z9 = z6;
                    function33 = function32;
                    z10 = z1222;
                    gy14 = gy1522;
                    i24 = i2822;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & DateUtils.FORMAT_ABBREV_WEEKDAY;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i3 & 1) == 0) {
                }
                if (i26 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                interfaceC32735Eu62 = m108216a;
                function12 = function14;
                interfaceC48104rX22 = interfaceC48104rX28;
                i21 = i30;
                gy13 = gy12;
                i22 = i27;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                C11309h c11309h222 = (C11309h) mo89635G;
                mo89518u.mo89638F(-55012947);
                if (z4) {
                }
                mo89518u.mo89605Q();
                InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                AbstractC44199kw1.InterfaceC25559b interfaceC25559b222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                long m114777a222 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                InterfaceC32037Bv1 interfaceC32037Bv1222 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                if (!(i21 != 1 && !z5 && gy13.m105016f())) {
                }
                Object[] objArr222 = {enumC32768Ey3};
                InterfaceC35668Ri5<C50182v16, Object> m9363a222 = C50182v16.f113347f.m9363a();
                InterfaceC41563gV2 interfaceC41563gV26222 = interfaceC41563gV23;
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(enumC32768Ey3);
                int i28222 = i21;
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G2 = new C3388l(enumC32768Ey3);
                mo89518u.mo89503z(mo89635G2);
                mo89518u.mo89605Q();
                C50182v16 c50182v16222 = (C50182v16) C35550Qv4.m87571b(objArr222, m9363a222, null, (Function0) mo89635G2, mo89518u, 72, 4);
                mo89518u.mo89638F(511388516);
                mo89539n2 = mo89518u.mo89539n(value) | mo89518u.mo89539n(interfaceC32735Eu62);
                mo89635G3 = mo89518u.mo89635G();
                if (mo89539n2) {
                }
                A96 m8229a222 = C50595vj6.m8229a(interfaceC32735Eu62, value.m108105e());
                m108104f = value.m108104f();
                if (m108104f == null) {
                }
                mo89635G3 = m8229a222;
                mo89518u.mo89503z(mo89635G3);
                mo89518u.mo89605Q();
                A96 a96222 = (A96) mo89635G3;
                C1577Df m116051b222 = a96222.m116051b();
                InterfaceC33290He3 m116052a222 = a96222.m116052a();
                InterfaceC45941ns4 m2336b222 = C52468yt0.m2336b(mo89518u, 0);
                mo89518u.mo89638F(-492369756);
                mo89635G4 = mo89518u.mo89635G();
                int i29222 = i22;
                if (mo89635G4 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                C16 c16222 = (C16) mo89635G4;
                c16222.m112996E(value.m108105e(), m116051b222, g262, z5, interfaceC41273g01222, interfaceC25559b222, onValueChange, c37555Zk22, interfaceC32037Bv1222, m114777a222);
                c16222.m112985k().m90634d(value, c16222.m112991e());
                mo89518u.mo89638F(-492369756);
                mo89635G5 = mo89518u.mo89635G();
                if (mo89635G5 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                C33518Id6 c33518Id62222 = (C33518Id6) mo89635G5;
                C33518Id6.m101869f(c33518Id62222, value, 0L, 2, null);
                mo89518u.mo89638F(-492369756);
                mo89635G6 = mo89518u.mo89635G();
                if (mo89635G6 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                C51367x16 c51367x16222 = (C51367x16) mo89635G6;
                c51367x16222.m5960U(m116052a222);
                c51367x16222.m5955Z(interfaceC32735Eu62);
                c51367x16222.m5959V(c16222.m112986j());
                c51367x16222.m5958W(c16222);
                c51367x16222.m5956Y(value);
                c51367x16222.m5967N((InterfaceC36383Uk0) mo89518u.mo89572c(C42399hu0.m35613f()));
                c51367x16222.m5957X((I26) mo89518u.mo89572c(C42399hu0.m35604o()));
                c51367x16222.m5961T((WE1) mo89518u.mo89572c(C42399hu0.m35609j()));
                c51367x16222.m5963R(c11309h222);
                c51367x16222.m5964Q(!z6);
                mo89518u.mo89638F(773894976);
                mo89518u.mo89638F(-492369756);
                mo89635G7 = mo89518u.mo89635G();
                if (mo89635G7 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                ZC0 m31665a222 = ((C42992iu0) mo89635G7).m31665a();
                mo89518u.mo89605Q();
                mo89518u.mo89638F(-492369756);
                mo89635G8 = mo89518u.mo89635G();
                if (mo89635G8 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                E20 e20222 = (E20) mo89635G8;
                InterfaceC41563gV2.C20912a c20912a222 = InterfaceC41563gV2.f82354b0;
                C3384i c3384i222 = new C3384i(c16222, u162, value, gy13, m116052a222, c51367x16222, m31665a222, e20222);
                InterfaceC48104rX2 interfaceC48104rX26222 = interfaceC48104rX23;
                m28017c = C44253l16.m28017c(c20912a222, z4, c11309h222, interfaceC48104rX26222, c3384i222);
                mo89518u.mo89638F(-55008430);
                if (z4) {
                }
                interfaceC41563gV24 = m28017c;
                mo89518u.mo89605Q();
                if (!Y56.m75752a()) {
                }
                InterfaceC41563gV2 m68867a222 = C11289a.m68867a(c20912a222, new C3383h(c16222, value, m116052a222));
                InterfaceC41563gV2 m83186a322 = C36116Tg3.m83186a(c20912a222, new C3386j(c16222, z4, c51367x16222, value, m116052a222));
                InterfaceC41563gV2 m40621a222 = C41198fs5.m40621a(c20912a222, true, new C3389m(gy13, a96222, value, z4, interfaceC32735Eu62 instanceof OI3, z6, c16222, m116052a222, c51367x16222, c11309h222));
                InterfaceC41563gV2 m42266b222 = C40695f16.m42266b(c20912a222, c16222, value, m116052a222, abstractC37727a303, (z4 || z6) ? z7 : true);
                Y91.m75536c(c51367x16222, new C3371c(c51367x16222), mo89518u, 8);
                Y91.m75536c(gy13, new C3373d(u16, c16222, value, gy13), mo89518u, (i29222 >> 3) & 14);
                InterfaceC48104rX2 interfaceC48104rX27222 = interfaceC48104rX24;
                InterfaceC41563gV2 m83186a2222 = C36116Tg3.m83186a(C49589u16.m11052d(m102800o(C43660k16.m29453a(interfaceC41563gV26222.mo39266t0(interfaceC41563gV24), c16222, interfaceC32037Bv1222), c16222, c51367x16222).mo39266t0(C46032o16.m21978a(c20912a222, c16222, c51367x16222, value, c16222.m112986j(), !z6, i28222 != 1 ? true : z7, m116052a222, c33518Id6)), c50182v16222, interfaceC48104rX27222, z4).mo39266t0(m41252b).mo39266t0(m40621a222), new C3382g(c16222));
                if (z4) {
                }
                boolean z12222 = z4;
                GY1 gy15222 = gy13;
                InterfaceC32735Eu6 interfaceC32735Eu64222 = interfaceC32735Eu62;
                interfaceC32720Et02 = mo89518u;
                m102813b(m83186a2222, c51367x16222, C43575jt0.m29791b(interfaceC32720Et02, -374338080, true, new C3375e(function32, i29222, c16222, g262, i20, i28222, c50182v16222, value, interfaceC32735Eu62, m42266b222, m68867a222, m83186a322, !z11 ? C52553z16.m2012b(c20912a222, c51367x16222) : c20912a222, e20222, c51367x16222, z11, z6, function12, m116052a222, interfaceC41273g01222)), interfaceC32720Et02, 448);
                if (C35528Qt0.m87827O()) {
                }
                g263 = g262;
                interfaceC32735Eu63 = interfaceC32735Eu64222;
                function13 = function12;
                abstractC37727a304 = abstractC37727a303;
                z8 = z5;
                i23 = i20;
                c37555Zk23 = c37555Zk22;
                interfaceC41563gV25 = interfaceC41563gV26222;
                interfaceC48104rX25 = interfaceC48104rX27222;
                z9 = z6;
                function33 = function32;
                z10 = z12222;
                gy14 = gy15222;
                i24 = i28222;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 112) == 0) {
            }
            int i272 = i15;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & DateUtils.FORMAT_ABBREV_WEEKDAY;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i3 & 1) == 0) {
            }
            if (i26 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            interfaceC32735Eu62 = m108216a;
            function12 = function14;
            interfaceC48104rX22 = interfaceC48104rX28;
            i21 = i30;
            gy13 = gy12;
            i22 = i272;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C11309h c11309h2222 = (C11309h) mo89635G;
            mo89518u.mo89638F(-55012947);
            if (z4) {
            }
            mo89518u.mo89605Q();
            InterfaceC41273g01 interfaceC41273g012222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            AbstractC44199kw1.InterfaceC25559b interfaceC25559b2222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
            long m114777a2222 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
            InterfaceC32037Bv1 interfaceC32037Bv12222 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
            if (!(i21 != 1 && !z5 && gy13.m105016f())) {
            }
            Object[] objArr2222 = {enumC32768Ey3};
            InterfaceC35668Ri5<C50182v16, Object> m9363a2222 = C50182v16.f113347f.m9363a();
            InterfaceC41563gV2 interfaceC41563gV262222 = interfaceC41563gV23;
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(enumC32768Ey3);
            int i282222 = i21;
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G2 = new C3388l(enumC32768Ey3);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            C50182v16 c50182v162222 = (C50182v16) C35550Qv4.m87571b(objArr2222, m9363a2222, null, (Function0) mo89635G2, mo89518u, 72, 4);
            mo89518u.mo89638F(511388516);
            mo89539n2 = mo89518u.mo89539n(value) | mo89518u.mo89539n(interfaceC32735Eu62);
            mo89635G3 = mo89518u.mo89635G();
            if (mo89539n2) {
            }
            A96 m8229a2222 = C50595vj6.m8229a(interfaceC32735Eu62, value.m108105e());
            m108104f = value.m108104f();
            if (m108104f == null) {
            }
            mo89635G3 = m8229a2222;
            mo89518u.mo89503z(mo89635G3);
            mo89518u.mo89605Q();
            A96 a962222 = (A96) mo89635G3;
            C1577Df m116051b2222 = a962222.m116051b();
            InterfaceC33290He3 m116052a2222 = a962222.m116052a();
            InterfaceC45941ns4 m2336b2222 = C52468yt0.m2336b(mo89518u, 0);
            mo89518u.mo89638F(-492369756);
            mo89635G4 = mo89518u.mo89635G();
            int i292222 = i22;
            if (mo89635G4 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C16 c162222 = (C16) mo89635G4;
            c162222.m112996E(value.m108105e(), m116051b2222, g262, z5, interfaceC41273g012222, interfaceC25559b2222, onValueChange, c37555Zk22, interfaceC32037Bv12222, m114777a2222);
            c162222.m112985k().m90634d(value, c162222.m112991e());
            mo89518u.mo89638F(-492369756);
            mo89635G5 = mo89518u.mo89635G();
            if (mo89635G5 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C33518Id6 c33518Id622222 = (C33518Id6) mo89635G5;
            C33518Id6.m101869f(c33518Id622222, value, 0L, 2, null);
            mo89518u.mo89638F(-492369756);
            mo89635G6 = mo89518u.mo89635G();
            if (mo89635G6 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C51367x16 c51367x162222 = (C51367x16) mo89635G6;
            c51367x162222.m5960U(m116052a2222);
            c51367x162222.m5955Z(interfaceC32735Eu62);
            c51367x162222.m5959V(c162222.m112986j());
            c51367x162222.m5958W(c162222);
            c51367x162222.m5956Y(value);
            c51367x162222.m5967N((InterfaceC36383Uk0) mo89518u.mo89572c(C42399hu0.m35613f()));
            c51367x162222.m5957X((I26) mo89518u.mo89572c(C42399hu0.m35604o()));
            c51367x162222.m5961T((WE1) mo89518u.mo89572c(C42399hu0.m35609j()));
            c51367x162222.m5963R(c11309h2222);
            c51367x162222.m5964Q(!z6);
            mo89518u.mo89638F(773894976);
            mo89518u.mo89638F(-492369756);
            mo89635G7 = mo89518u.mo89635G();
            if (mo89635G7 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            ZC0 m31665a2222 = ((C42992iu0) mo89635G7).m31665a();
            mo89518u.mo89605Q();
            mo89518u.mo89638F(-492369756);
            mo89635G8 = mo89518u.mo89635G();
            if (mo89635G8 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            E20 e202222 = (E20) mo89635G8;
            InterfaceC41563gV2.C20912a c20912a2222 = InterfaceC41563gV2.f82354b0;
            C3384i c3384i2222 = new C3384i(c162222, u162, value, gy13, m116052a2222, c51367x162222, m31665a2222, e202222);
            InterfaceC48104rX2 interfaceC48104rX262222 = interfaceC48104rX23;
            m28017c = C44253l16.m28017c(c20912a2222, z4, c11309h2222, interfaceC48104rX262222, c3384i2222);
            mo89518u.mo89638F(-55008430);
            if (z4) {
            }
            interfaceC41563gV24 = m28017c;
            mo89518u.mo89605Q();
            if (!Y56.m75752a()) {
            }
            InterfaceC41563gV2 m68867a2222 = C11289a.m68867a(c20912a2222, new C3383h(c162222, value, m116052a2222));
            InterfaceC41563gV2 m83186a3222 = C36116Tg3.m83186a(c20912a2222, new C3386j(c162222, z4, c51367x162222, value, m116052a2222));
            InterfaceC41563gV2 m40621a2222 = C41198fs5.m40621a(c20912a2222, true, new C3389m(gy13, a962222, value, z4, interfaceC32735Eu62 instanceof OI3, z6, c162222, m116052a2222, c51367x162222, c11309h2222));
            InterfaceC41563gV2 m42266b2222 = C40695f16.m42266b(c20912a2222, c162222, value, m116052a2222, abstractC37727a303, (z4 || z6) ? z7 : true);
            Y91.m75536c(c51367x162222, new C3371c(c51367x162222), mo89518u, 8);
            Y91.m75536c(gy13, new C3373d(u16, c162222, value, gy13), mo89518u, (i292222 >> 3) & 14);
            InterfaceC48104rX2 interfaceC48104rX272222 = interfaceC48104rX24;
            InterfaceC41563gV2 m83186a22222 = C36116Tg3.m83186a(C49589u16.m11052d(m102800o(C43660k16.m29453a(interfaceC41563gV262222.mo39266t0(interfaceC41563gV24), c162222, interfaceC32037Bv12222), c162222, c51367x162222).mo39266t0(C46032o16.m21978a(c20912a2222, c162222, c51367x162222, value, c162222.m112986j(), !z6, i282222 != 1 ? true : z7, m116052a2222, c33518Id6)), c50182v162222, interfaceC48104rX272222, z4).mo39266t0(m41252b).mo39266t0(m40621a2222), new C3382g(c162222));
            if (z4) {
            }
            boolean z122222 = z4;
            GY1 gy152222 = gy13;
            InterfaceC32735Eu6 interfaceC32735Eu642222 = interfaceC32735Eu62;
            interfaceC32720Et02 = mo89518u;
            m102813b(m83186a22222, c51367x162222, C43575jt0.m29791b(interfaceC32720Et02, -374338080, true, new C3375e(function32, i292222, c162222, g262, i20, i282222, c50182v162222, value, interfaceC32735Eu62, m42266b2222, m68867a2222, m83186a3222, !z11 ? C52553z16.m2012b(c20912a2222, c51367x162222) : c20912a2222, e202222, c51367x162222, z11, z6, function12, m116052a2222, interfaceC41273g012222)), interfaceC32720Et02, 448);
            if (C35528Qt0.m87827O()) {
            }
            g263 = g262;
            interfaceC32735Eu63 = interfaceC32735Eu642222;
            function13 = function12;
            abstractC37727a304 = abstractC37727a303;
            z8 = z5;
            i23 = i20;
            c37555Zk23 = c37555Zk22;
            interfaceC41563gV25 = interfaceC41563gV262222;
            interfaceC48104rX25 = interfaceC48104rX272222;
            z9 = z6;
            function33 = function32;
            z10 = z122222;
            gy14 = gy152222;
            i24 = i282222;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 112) == 0) {
        }
        int i2722 = i15;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & DateUtils.FORMAT_ABBREV_WEEKDAY;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i3 & 1) == 0) {
        }
        if (i26 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        interfaceC32735Eu62 = m108216a;
        function12 = function14;
        interfaceC48104rX22 = interfaceC48104rX28;
        i21 = i30;
        gy13 = gy12;
        i22 = i2722;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C11309h c11309h22222 = (C11309h) mo89635G;
        mo89518u.mo89638F(-55012947);
        if (z4) {
        }
        mo89518u.mo89605Q();
        InterfaceC41273g01 interfaceC41273g0122222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        AbstractC44199kw1.InterfaceC25559b interfaceC25559b22222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
        long m114777a22222 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
        InterfaceC32037Bv1 interfaceC32037Bv122222 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
        if (!(i21 != 1 && !z5 && gy13.m105016f())) {
        }
        Object[] objArr22222 = {enumC32768Ey3};
        InterfaceC35668Ri5<C50182v16, Object> m9363a22222 = C50182v16.f113347f.m9363a();
        InterfaceC41563gV2 interfaceC41563gV2622222 = interfaceC41563gV23;
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(enumC32768Ey3);
        int i2822222 = i21;
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G2 = new C3388l(enumC32768Ey3);
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        C50182v16 c50182v1622222 = (C50182v16) C35550Qv4.m87571b(objArr22222, m9363a22222, null, (Function0) mo89635G2, mo89518u, 72, 4);
        mo89518u.mo89638F(511388516);
        mo89539n2 = mo89518u.mo89539n(value) | mo89518u.mo89539n(interfaceC32735Eu62);
        mo89635G3 = mo89518u.mo89635G();
        if (mo89539n2) {
        }
        A96 m8229a22222 = C50595vj6.m8229a(interfaceC32735Eu62, value.m108105e());
        m108104f = value.m108104f();
        if (m108104f == null) {
        }
        mo89635G3 = m8229a22222;
        mo89518u.mo89503z(mo89635G3);
        mo89518u.mo89605Q();
        A96 a9622222 = (A96) mo89635G3;
        C1577Df m116051b22222 = a9622222.m116051b();
        InterfaceC33290He3 m116052a22222 = a9622222.m116052a();
        InterfaceC45941ns4 m2336b22222 = C52468yt0.m2336b(mo89518u, 0);
        mo89518u.mo89638F(-492369756);
        mo89635G4 = mo89518u.mo89635G();
        int i2922222 = i22;
        if (mo89635G4 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C16 c1622222 = (C16) mo89635G4;
        c1622222.m112996E(value.m108105e(), m116051b22222, g262, z5, interfaceC41273g0122222, interfaceC25559b22222, onValueChange, c37555Zk22, interfaceC32037Bv122222, m114777a22222);
        c1622222.m112985k().m90634d(value, c1622222.m112991e());
        mo89518u.mo89638F(-492369756);
        mo89635G5 = mo89518u.mo89635G();
        if (mo89635G5 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C33518Id6 c33518Id6222222 = (C33518Id6) mo89635G5;
        C33518Id6.m101869f(c33518Id6222222, value, 0L, 2, null);
        mo89518u.mo89638F(-492369756);
        mo89635G6 = mo89518u.mo89635G();
        if (mo89635G6 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C51367x16 c51367x1622222 = (C51367x16) mo89635G6;
        c51367x1622222.m5960U(m116052a22222);
        c51367x1622222.m5955Z(interfaceC32735Eu62);
        c51367x1622222.m5959V(c1622222.m112986j());
        c51367x1622222.m5958W(c1622222);
        c51367x1622222.m5956Y(value);
        c51367x1622222.m5967N((InterfaceC36383Uk0) mo89518u.mo89572c(C42399hu0.m35613f()));
        c51367x1622222.m5957X((I26) mo89518u.mo89572c(C42399hu0.m35604o()));
        c51367x1622222.m5961T((WE1) mo89518u.mo89572c(C42399hu0.m35609j()));
        c51367x1622222.m5963R(c11309h22222);
        c51367x1622222.m5964Q(!z6);
        mo89518u.mo89638F(773894976);
        mo89518u.mo89638F(-492369756);
        mo89635G7 = mo89518u.mo89635G();
        if (mo89635G7 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        ZC0 m31665a22222 = ((C42992iu0) mo89635G7).m31665a();
        mo89518u.mo89605Q();
        mo89518u.mo89638F(-492369756);
        mo89635G8 = mo89518u.mo89635G();
        if (mo89635G8 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        E20 e2022222 = (E20) mo89635G8;
        InterfaceC41563gV2.C20912a c20912a22222 = InterfaceC41563gV2.f82354b0;
        C3384i c3384i22222 = new C3384i(c1622222, u162, value, gy13, m116052a22222, c51367x1622222, m31665a22222, e2022222);
        InterfaceC48104rX2 interfaceC48104rX2622222 = interfaceC48104rX23;
        m28017c = C44253l16.m28017c(c20912a22222, z4, c11309h22222, interfaceC48104rX2622222, c3384i22222);
        mo89518u.mo89638F(-55008430);
        if (z4) {
        }
        interfaceC41563gV24 = m28017c;
        mo89518u.mo89605Q();
        if (!Y56.m75752a()) {
        }
        InterfaceC41563gV2 m68867a22222 = C11289a.m68867a(c20912a22222, new C3383h(c1622222, value, m116052a22222));
        InterfaceC41563gV2 m83186a32222 = C36116Tg3.m83186a(c20912a22222, new C3386j(c1622222, z4, c51367x1622222, value, m116052a22222));
        InterfaceC41563gV2 m40621a22222 = C41198fs5.m40621a(c20912a22222, true, new C3389m(gy13, a9622222, value, z4, interfaceC32735Eu62 instanceof OI3, z6, c1622222, m116052a22222, c51367x1622222, c11309h22222));
        InterfaceC41563gV2 m42266b22222 = C40695f16.m42266b(c20912a22222, c1622222, value, m116052a22222, abstractC37727a303, (z4 || z6) ? z7 : true);
        Y91.m75536c(c51367x1622222, new C3371c(c51367x1622222), mo89518u, 8);
        Y91.m75536c(gy13, new C3373d(u16, c1622222, value, gy13), mo89518u, (i2922222 >> 3) & 14);
        InterfaceC48104rX2 interfaceC48104rX2722222 = interfaceC48104rX24;
        InterfaceC41563gV2 m83186a222222 = C36116Tg3.m83186a(C49589u16.m11052d(m102800o(C43660k16.m29453a(interfaceC41563gV2622222.mo39266t0(interfaceC41563gV24), c1622222, interfaceC32037Bv122222), c1622222, c51367x1622222).mo39266t0(C46032o16.m21978a(c20912a22222, c1622222, c51367x1622222, value, c1622222.m112986j(), !z6, i2822222 != 1 ? true : z7, m116052a22222, c33518Id6)), c50182v1622222, interfaceC48104rX2722222, z4).mo39266t0(m41252b).mo39266t0(m40621a22222), new C3382g(c1622222));
        if (z4) {
        }
        boolean z1222222 = z4;
        GY1 gy1522222 = gy13;
        InterfaceC32735Eu6 interfaceC32735Eu6422222 = interfaceC32735Eu62;
        interfaceC32720Et02 = mo89518u;
        m102813b(m83186a222222, c51367x1622222, C43575jt0.m29791b(interfaceC32720Et02, -374338080, true, new C3375e(function32, i2922222, c1622222, g262, i20, i2822222, c50182v1622222, value, interfaceC32735Eu62, m42266b22222, m68867a22222, m83186a32222, !z11 ? C52553z16.m2012b(c20912a22222, c51367x1622222) : c20912a22222, e2022222, c51367x1622222, z11, z6, function12, m116052a22222, interfaceC41273g0122222)), interfaceC32720Et02, 448);
        if (C35528Qt0.m87827O()) {
        }
        g263 = g262;
        interfaceC32735Eu63 = interfaceC32735Eu6422222;
        function13 = function12;
        abstractC37727a304 = abstractC37727a303;
        z8 = z5;
        i23 = i20;
        c37555Zk23 = c37555Zk22;
        interfaceC41563gV25 = interfaceC41563gV2622222;
        interfaceC48104rX25 = interfaceC48104rX2722222;
        z9 = z6;
        function33 = function32;
        z10 = z1222222;
        gy14 = gy1522222;
        i24 = i2822222;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final void m102813b(InterfaceC41563gV2 interfaceC41563gV2, C51367x16 c51367x16, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-20551815);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:663)");
        }
        int i2 = (i & 14) | 384;
        mo89518u.mo89638F(733328855);
        int i3 = i2 >> 3;
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), true, mo89518u, (i3 & 112) | (i3 & 14));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(interfaceC41563gV2);
        int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
        C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i4 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        C40689f10 c40689f10 = C40689f10.f79291a;
        YA0.m75478a(c51367x16, function2, mo89518u, ((i >> 3) & 112) | 8);
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C3398n(interfaceC41563gV2, c51367x16, function2, i));
        }
    }

    /* renamed from: c */
    public static final void m102812c(C51367x16 c51367x16, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z2;
        C43077j26 m112989g;
        C42484i26 m31225i;
        boolean z3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(626339208);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:991)");
        }
        if (z) {
            C16 m5976E = c51367x16.m5976E();
            C42484i26 c42484i26 = null;
            boolean z4 = true;
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null && (m31225i = m112989g.m31225i()) != null) {
                C16 m5976E2 = c51367x16.m5976E();
                if (m5976E2 != null) {
                    z3 = m5976E2.m112976t();
                } else {
                    z3 = true;
                }
                if (!z3) {
                    c42484i26 = m31225i;
                }
            }
            if (c42484i26 != null) {
                if (!C48413s26.m14838h(c51367x16.m5973H().m108103g())) {
                    int originalToTransformed = c51367x16.m5978C().originalToTransformed(C48413s26.m14832n(c51367x16.m5973H().m108103g()));
                    int originalToTransformed2 = c51367x16.m5978C().originalToTransformed(C48413s26.m14837i(c51367x16.m5973H().m108103g()));
                    UL4 m34606b = c42484i26.m34606b(originalToTransformed);
                    UL4 m34606b2 = c42484i26.m34606b(Math.max(originalToTransformed2 - 1, 0));
                    mo89518u.mo89638F(-498391544);
                    C16 m5976E3 = c51367x16.m5976E();
                    if (m5976E3 != null && m5976E3.m112979q()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C51960y16.m4235a(true, m34606b, c51367x16, mo89518u, 518);
                    }
                    mo89518u.mo89605Q();
                    C16 m5976E4 = c51367x16.m5976E();
                    if (m5976E4 == null || !m5976E4.m112980p()) {
                        z4 = false;
                    }
                    if (z4) {
                        C51960y16.m4235a(false, m34606b2, c51367x16, mo89518u, 518);
                    }
                }
                C16 m5976E5 = c51367x16.m5976E();
                if (m5976E5 != null) {
                    if (c51367x16.m5970K()) {
                        m5976E5.m112999B(false);
                    }
                    if (m5976E5.m112992d()) {
                        if (m5976E5.m112981o()) {
                            c51367x16.m5953a0();
                        } else {
                            c51367x16.m5971J();
                        }
                    }
                }
            }
        } else {
            c51367x16.m5971J();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C3399o(c51367x16, z, i));
        }
    }

    /* renamed from: d */
    public static final void m102811d(C51367x16 manager, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(manager, "manager");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1436003720);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1034)");
        }
        C16 m5976E = manager.m5976E();
        if (m5976E != null && m5976E.m112982n()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(manager);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = manager.m5939n();
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            Z06 z06 = (Z06) mo89635G;
            long m5931v = manager.m5931v((InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g()));
            InterfaceC41563gV2 m1270c = C52840zW5.m1270c(InterfaceC41563gV2.f82354b0, z06, new C3400p(z06, null));
            C32120Ce3 m111955d = C32120Ce3.m111955d(m5931v);
            mo89518u.mo89638F(1157296644);
            boolean mo89539n2 = mo89518u.mo89539n(m111955d);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new C3401q(m5931v);
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            C31051zc.m1042a(m5931v, C41198fs5.m40620b(m1270c, false, (Function1) mo89635G2, 1, null), null, mo89518u, 384);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C3402r(manager, i));
        }
    }

    /* renamed from: k */
    public static final Object m102804k(E20 e20, F16 f16, T06 t06, C42484i26 c42484i26, InterfaceC33290He3 interfaceC33290He3, Continuation<? super Unit> continuation) {
        C35055Os4 c35055Os4;
        Object coroutine_suspended;
        int originalToTransformed = interfaceC33290He3.originalToTransformed(C48413s26.m14835k(f16.m108103g()));
        if (originalToTransformed < c42484i26.m34597k().m40259j().length()) {
            c35055Os4 = c42484i26.m34605c(originalToTransformed);
        } else if (originalToTransformed != 0) {
            c35055Os4 = c42484i26.m34605c(originalToTransformed - 1);
        } else {
            c35055Os4 = new C35055Os4(0.0f, 0.0f, 1.0f, G52.m105830f(C43067j16.m31239b(t06.m84435k(), t06.m84445a(), t06.m84444b(), null, 0, 24, null)));
        }
        Object mo108092b = e20.mo108092b(c35055Os4, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (mo108092b == coroutine_suspended) {
            return mo108092b;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m102803l(C16 c16, F16 f16, InterfaceC33290He3 interfaceC33290He3) {
        AbstractC48600sM5 m14281a = AbstractC48600sM5.f108670e.m14281a();
        try {
            AbstractC48600sM5 m14295k = m14281a.m14295k();
            C43077j26 m112989g = c16.m112989g();
            if (m112989g == null) {
                m14281a.m14288r(m14295k);
                return;
            }
            C37723a26 m112991e = c16.m112991e();
            if (m112991e == null) {
                m14281a.m14288r(m14295k);
                return;
            }
            InterfaceC45879nm2 m112990f = c16.m112990f();
            if (m112990f == null) {
                m14281a.m14288r(m14295k);
                return;
            }
            C42474i16.f86286a.m35374d(f16, c16.m112978r(), m112989g.m31225i(), m112990f, m112991e, c16.m112992d(), interfaceC33290He3);
            Unit unit = Unit.INSTANCE;
            m14281a.m14288r(m14295k);
        } finally {
            m14281a.mo1848d();
        }
    }

    /* renamed from: m */
    public static final void m102802m(U16 u16, C16 c16, F16 f16, GY1 gy1, InterfaceC33290He3 interfaceC33290He3) {
        if (c16.m112992d()) {
            c16.m112973w(C42474i16.f86286a.m35371g(u16, f16, c16.m112985k(), gy1, c16.m112986j(), c16.m112987i()));
            m102803l(c16, f16, interfaceC33290He3);
            return;
        }
        m102801n(c16);
    }

    /* renamed from: n */
    public static final void m102801n(C16 c16) {
        C37723a26 m112991e = c16.m112991e();
        if (m112991e != null) {
            C42474i16.f86286a.m35373e(m112991e, c16.m112985k(), c16.m112986j());
        }
        c16.m112973w(null);
    }

    /* renamed from: o */
    public static final InterfaceC41563gV2 m102800o(InterfaceC41563gV2 interfaceC41563gV2, C16 c16, C51367x16 c51367x16) {
        return C47638qk2.m17172b(interfaceC41563gV2, new C3403s(c16, c51367x16));
    }

    /* renamed from: p */
    public static final void m102799p(C16 c16, C11309h c11309h, boolean z) {
        C37723a26 m112991e;
        if (!c16.m112992d()) {
            c11309h.m68779e();
        } else if (z && (m112991e = c16.m112991e()) != null) {
            m112991e.m71959e();
        }
    }
}
