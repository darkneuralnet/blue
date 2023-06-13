package androidx.compose.p003ui.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.p003ui.platform.AbstractComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BX\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010H\u001a\u00020E\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\u0007\u0010\u0089\u0001\u001a\u00020W\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\b\b\u0002\u0010L\u001a\u00020I¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J#\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001f\u0010 J7\u0010)\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J.\u00102\u001a\u00020\u00052\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203J\u0006\u00106\u001a\u00020\u0005J\u000f\u00107\u001a\u00020\u0005H\u0001¢\u0006\u0004\b7\u00108J\u0006\u00109\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u0005J\u0012\u0010<\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010?R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010V\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u00108\u001a\u0004\bS\u0010TR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR8\u0010l\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010f8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b6\u0010h\u001a\u0004\b_\u0010i\"\u0004\bj\u0010kR/\u00104\u001a\u0004\u0018\u0001032\b\u0010g\u001a\u0004\u0018\u0001038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010h\u001a\u0004\bX\u0010m\"\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010qR\u001b\u0010u\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010s\u001a\u0004\bF\u0010tR\u001d\u0010x\u001a\u00020v8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010zR7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010h\u001a\u0004\bJ\u0010|\"\u0004\b\u0019\u0010}R%\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00038\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b2\u0010~\u001a\u0004\b\u007f\u0010tR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0082\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bQ\u0010\u0084\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bN\u0010\u0084\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008e\u0001"}, m28432d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "", "isFocusable", "", "m", "LOq5;", "securePolicy", "o", "clippingEnabled", "l", "", "flags", "b", "Lpm2;", "layoutDirection", "q", "Landroid/view/WindowManager$LayoutParams;", "c", "p", "LYt0;", "parent", "Lkotlin/Function0;", "content", "setContent", "(LYt0;Lkotlin/jvm/functions/Function2;)V", "Content", "(LEt0;I)V", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "onDismissRequest", "LAY3;", "properties", "", "testTag", "r", "Lnm2;", "parentLayoutCoordinates", "t", "k", "s", "()V", "u", DateTokenConverter.CONVERTER_KEY, "Landroid/view/MotionEvent;", "onTouchEvent", "setLayoutDirection", "Lkotlin/jvm/functions/Function0;", "LAY3;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "e", "Landroid/view/View;", "composeView", "LtY3;", "f", "LtY3;", "popupLayoutHelper", "Landroid/view/WindowManager;", "g", "Landroid/view/WindowManager;", "windowManager", "h", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "params", "LzY3;", "i", "LzY3;", "getPositionProvider", "()LzY3;", "setPositionProvider", "(LzY3;)V", "positionProvider", "j", "Lpm2;", "getParentLayoutDirection", "()Lpm2;", "setParentLayoutDirection", "(Lpm2;)V", "parentLayoutDirection", "LG52;", "<set-?>", "LEX2;", "()LG52;", "setPopupContentSize-fhxjrPA", "(LG52;)V", "popupContentSize", "()Lnm2;", "n", "(Lnm2;)V", "LD52;", "LD52;", "parentBounds", "LsP5;", "()Z", "canCalculatePosition", "Lk61;", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "[I", "locationOnScreen", "()I", "displayWidth", "displayHeight", "Lg01;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Landroid/view/View;Lg01;LzY3;Ljava/util/UUID;LtY3;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n154#2:825\n1#3:826\n76#4:827\n102#4,2:828\n76#4:830\n102#4,2:831\n76#4:833\n76#4:834\n102#4,2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:825\n402#1:827\n402#1:828,2\n403#1:830\n403#1:831,2\n407#1:833\n447#1:834\n447#1:835,2\n*E\n"})
/* renamed from: androidx.compose.ui.window.PopupLayout */
/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView {

    /* renamed from: b */
    public Function0<Unit> f53469b;

    /* renamed from: c */
    public AY3 f53470c;

    /* renamed from: d */
    public String f53471d;

    /* renamed from: e */
    public final View f53472e;

    /* renamed from: f */
    public final InterfaceC49299tY3 f53473f;

    /* renamed from: g */
    public final WindowManager f53474g;

    /* renamed from: h */
    public final WindowManager.LayoutParams f53475h;

    /* renamed from: i */
    public InterfaceC52856zY3 f53476i;

    /* renamed from: j */
    public EnumC47065pm2 f53477j;

    /* renamed from: k */
    public final EX2 f53478k;

    /* renamed from: l */
    public final EX2 f53479l;

    /* renamed from: m */
    public D52 f53480m;

    /* renamed from: n */
    public final InterfaceC48627sP5 f53481n;

    /* renamed from: o */
    public final float f53482o;

    /* renamed from: p */
    public final Rect f53483p;

    /* renamed from: q */
    public final EX2 f53484q;

    /* renamed from: r */
    public boolean f53485r;

    /* renamed from: s */
    public final int[] f53486s;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"androidx/compose/ui/window/PopupLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "getOutline", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.PopupLayout$a */
    /* loaded from: classes.dex */
    public static final class C11470a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.window.PopupLayout$b */
    /* loaded from: classes.dex */
    public static final class C11471b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f53488h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11471b(int i) {
            super(2);
            this.f53488h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            PopupLayout.this.Content(interfaceC32720Et0, C47127ps4.m18626a(this.f53488h | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.window.PopupLayout$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11472c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC47065pm2.values().length];
            try {
                iArr[EnumC47065pm2.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC47065pm2.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.window.PopupLayout$d */
    /* loaded from: classes.dex */
    public static final class C11473d extends Lambda implements Function0<Boolean> {
        public C11473d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf((PopupLayout.this.m68235i() == null || PopupLayout.this.m68234j() == null) ? false : true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PopupLayout(Function0 function0, AY3 ay3, String str, View view, InterfaceC41273g01 interfaceC41273g01, InterfaceC52856zY3 interfaceC52856zY3, UUID uuid, InterfaceC49299tY3 interfaceC49299tY3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, ay3, str, view, interfaceC41273g01, interfaceC52856zY3, uuid, r9);
        InterfaceC49299tY3 interfaceC49299tY32;
        InterfaceC49299tY3 c51077wY3;
        if ((i & 128) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                c51077wY3 = new C50484vY3();
            } else {
                c51077wY3 = new C51077wY3();
            }
            interfaceC49299tY32 = c51077wY3;
        } else {
            interfaceC49299tY32 = interfaceC49299tY3;
        }
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-857613600);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        m68238f().invoke(mo89518u, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C11471b(i));
        }
    }

    /* renamed from: b */
    public final void m68242b(int i) {
        WindowManager.LayoutParams layoutParams = this.f53475h;
        layoutParams.flags = i;
        this.f53473f.mo6681a(this.f53474g, this, layoutParams);
    }

    /* renamed from: c */
    public final WindowManager.LayoutParams m68241c() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | DateUtils.FORMAT_ABBREV_RELATIVE;
        layoutParams.type = 1002;
        layoutParams.token = this.f53472e.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f53472e.getContext().getResources().getString(C43499jl4.default_popup_window_title));
        return layoutParams;
    }

    /* renamed from: d */
    public final void m68240d() {
        C35534Qt6.m87652b(this, null);
        this.f53474g.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && this.f53470c.m115567b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            } else if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0<Unit> function0 = this.f53469b;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    /* renamed from: e */
    public final boolean m68239e() {
        return ((Boolean) this.f53481n.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final Function2<InterfaceC32720Et0, Integer, Unit> m68238f() {
        return (Function2) this.f53484q.getValue();
    }

    /* renamed from: g */
    public final int m68237g() {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return roundToInt;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f53485r;
    }

    /* renamed from: h */
    public final int m68236h() {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return roundToInt;
    }

    /* renamed from: i */
    public final InterfaceC45879nm2 m68235i() {
        return (InterfaceC45879nm2) this.f53479l.getValue();
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f53475h.width = childAt.getMeasuredWidth();
        this.f53475h.height = childAt.getMeasuredHeight();
        this.f53473f.mo6681a(this.f53474g, this, this.f53475h);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.f53470c.m115562g()) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(m68236h(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m68237g(), Integer.MIN_VALUE));
        }
    }

    /* renamed from: j */
    public final G52 m68234j() {
        return (G52) this.f53478k.getValue();
    }

    /* renamed from: k */
    public final void m68233k() {
        int[] iArr = this.f53486s;
        int i = iArr[0];
        int i2 = iArr[1];
        this.f53472e.getLocationOnScreen(iArr);
        int[] iArr2 = this.f53486s;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            m68225s();
        }
    }

    /* renamed from: l */
    public final void m68232l(boolean z) {
        int i;
        if (z) {
            i = this.f53475h.flags & (-513);
        } else {
            i = this.f53475h.flags | 512;
        }
        m68242b(i);
    }

    /* renamed from: m */
    public final void m68231m(boolean z) {
        int i;
        if (!z) {
            i = this.f53475h.flags | 8;
        } else {
            i = this.f53475h.flags & (-9);
        }
        m68242b(i);
    }

    /* renamed from: n */
    public final void m68230n(InterfaceC45879nm2 interfaceC45879nm2) {
        this.f53479l.setValue(interfaceC45879nm2);
    }

    /* renamed from: o */
    public final void m68229o(EnumC35038Oq5 enumC35038Oq5) {
        int i;
        if (C35272Pq5.m89705a(enumC35038Oq5, C30242xd.m4927e(this.f53472e))) {
            i = this.f53475h.flags | 8192;
        } else {
            i = this.f53475h.flags & (-8193);
        }
        m68242b(i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f53470c.m115566c()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0<Unit> function0 = this.f53469b;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z2 = true;
        }
        if (z2) {
            Function0<Unit> function02 = this.f53469b;
            if (function02 != null) {
                function02.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m68228p() {
        this.f53474g.addView(this, this.f53475h);
    }

    /* renamed from: q */
    public final void m68227q(EnumC47065pm2 enumC47065pm2) {
        int i = C11472c.$EnumSwitchMapping$0[enumC47065pm2.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    /* renamed from: r */
    public final void m68226r(Function0<Unit> function0, AY3 properties, String testTag, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f53469b = function0;
        this.f53470c = properties;
        this.f53471d = testTag;
        m68231m(properties.m115564e());
        m68229o(properties.m115563f());
        m68232l(properties.m115568a());
        m68227q(layoutDirection);
    }

    /* renamed from: s */
    public final void m68225s() {
        int roundToInt;
        int roundToInt2;
        InterfaceC45879nm2 m68235i = m68235i();
        if (m68235i == null) {
            return;
        }
        long mo23186a = m68235i.mo23186a();
        long m20515f = C46472om2.m20515f(m68235i);
        roundToInt = MathKt__MathJVMKt.roundToInt(C32120Ce3.m111944o(m20515f));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C32120Ce3.m111943p(m20515f));
        D52 m109407a = E52.m109407a(B52.m114704a(roundToInt, roundToInt2), mo23186a);
        if (!Intrinsics.areEqual(m109407a, this.f53480m)) {
            this.f53480m = m109407a;
            m68223u();
        }
    }

    public final void setContent(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        this.f53484q.setValue(function2);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(EnumC47065pm2 enumC47065pm2) {
        Intrinsics.checkNotNullParameter(enumC47065pm2, "<set-?>");
        this.f53477j = enumC47065pm2;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m116235setPopupContentSizefhxjrPA(G52 g52) {
        this.f53478k.setValue(g52);
    }

    public final void setPositionProvider(InterfaceC52856zY3 interfaceC52856zY3) {
        Intrinsics.checkNotNullParameter(interfaceC52856zY3, "<set-?>");
        this.f53476i = interfaceC52856zY3;
    }

    public final void setTestTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f53471d = str;
    }

    /* renamed from: t */
    public final void m68224t(InterfaceC45879nm2 parentLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(parentLayoutCoordinates, "parentLayoutCoordinates");
        m68230n(parentLayoutCoordinates);
        m68225s();
    }

    /* renamed from: u */
    public final void m68223u() {
        G52 m68234j;
        D52 d52 = this.f53480m;
        if (d52 != null && (m68234j = m68234j()) != null) {
            long m105826j = m68234j.m105826j();
            Rect rect = this.f53483p;
            this.f53473f.mo6679c(this.f53472e, rect);
            D52 m4928d = C30242xd.m4928d(rect);
            long m104430a = H52.m104430a(m4928d.m110919f(), m4928d.m110923b());
            long mo116225calculatePositionllwVHH4 = this.f53476i.mo116225calculatePositionllwVHH4(d52, m104430a, this.f53477j, m105826j);
            this.f53475h.x = A52.m116111j(mo116225calculatePositionllwVHH4);
            this.f53475h.y = A52.m116110k(mo116225calculatePositionllwVHH4);
            if (this.f53470c.m115565d()) {
                this.f53473f.mo6680b(this, G52.m105829g(m104430a), G52.m105830f(m104430a));
            }
            this.f53473f.mo6681a(this.f53474g, this, this.f53475h);
        }
    }

    public final void setContent(AbstractC37400Yt0 parent, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f53485r = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PopupLayout(Function0<Unit> function0, AY3 properties, String testTag, View composeView, InterfaceC41273g01 density, InterfaceC52856zY3 initialPositionProvider, UUID popupId, InterfaceC49299tY3 popupLayoutHelper) {
        super(r2, null, 0, 6, null);
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        Intrinsics.checkNotNullParameter(popupLayoutHelper, "popupLayoutHelper");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        this.f53469b = function0;
        this.f53470c = properties;
        this.f53471d = testTag;
        this.f53472e = composeView;
        this.f53473f = popupLayoutHelper;
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f53474g = (WindowManager) systemService;
        this.f53475h = m68241c();
        this.f53476i = initialPositionProvider;
        this.f53477j = EnumC47065pm2.Ltr;
        m97025e = LM5.m97025e(null, null, 2, null);
        this.f53478k = m97025e;
        m97025e2 = LM5.m97025e(null, null, 2, null);
        this.f53479l = m97025e2;
        this.f53481n = GM5.m105204c(new C11473d());
        float m29303g = C43705k61.m29303g(8);
        this.f53482o = m29303g;
        this.f53483p = new Rect();
        setId(16908290);
        C35534Qt6.m87652b(this, C35534Qt6.m87653a(composeView));
        C36470Ut6.m80657b(this, C36470Ut6.m80658a(composeView));
        C36236Tt6.m82296b(this, C36236Tt6.m82297a(composeView));
        int i = C46424oh4.compose_view_saveable_id_tag;
        setTag(i, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.mo3411T0(m29303g));
        setOutlineProvider(new C11470a());
        m97025e3 = LM5.m97025e(C44761lt0.f96857a.m26704a(), null, 2, null);
        this.f53484q = m97025e3;
        this.f53486s = new int[2];
    }
}
