package p000;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J#\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u001d\u0010'\u001a\u00020%8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m28432d2 = {"LJ31;", "LQs0;", "", "LYt0;", "parentComposition", "Lkotlin/Function0;", "", "children", "f", "(LYt0;Lkotlin/jvm/functions/Function2;)V", "onDismissRequest", "LD31;", "properties", "Lpm2;", "layoutDirection", "i", "e", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "cancel", "g", "LOq5;", "securePolicy", "h", "b", "Lkotlin/jvm/functions/Function0;", "c", "LD31;", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "composeView", "Lv31;", "Lv31;", "dialogLayout", "Lk61;", "F", "maxSupportedElevation", "", "I", "defaultSoftInputMode", "Lg01;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lkotlin/jvm/functions/Function0;LD31;Landroid/view/View;Lpm2;Lg01;Ljava/util/UUID;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n154#2:457\n1#3:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n300#1:457\n*E\n"})
/* renamed from: J31 */
/* loaded from: classes.dex */
public final class J31 extends DialogC35519Qs0 {

    /* renamed from: b */
    public Function0<Unit> f16725b;

    /* renamed from: c */
    public D31 f16726c;

    /* renamed from: d */
    public final View f16727d;

    /* renamed from: e */
    public final C50196v31 f16728e;

    /* renamed from: f */
    public final float f16729f;

    /* renamed from: g */
    public final int f16730g;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"J31$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "getOutline", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: J31$a */
    /* loaded from: classes.dex */
    public static final class C3875a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LVe3;", "", "invoke", "(LVe3;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J31$b */
    /* loaded from: classes.dex */
    public static final class C3876b extends Lambda implements Function1<AbstractC36566Ve3, Unit> {
        public C3876b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC36566Ve3 abstractC36566Ve3) {
            invoke2(abstractC36566Ve3);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(AbstractC36566Ve3 addCallback) {
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            if (J31.this.f16726c.m111010b()) {
                J31.this.f16725b.invoke();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J31$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C3877c {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J31(Function0<Unit> onDismissRequest, D31 properties, View composeView, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density, UUID dialogId) {
        super(new ContextThemeWrapper(r1, r2), 0, 2, null);
        int i;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Context context = composeView.getContext();
        if (Build.VERSION.SDK_INT < 31 && !properties.m111011a()) {
            i = C31716Al4.FloatingDialogWindowTheme;
        } else {
            i = C31716Al4.DialogWindowTheme;
        }
        this.f16725b = onDismissRequest;
        this.f16726c = properties;
        this.f16727d = composeView;
        float m29303g = C43705k61.m29303g(8);
        this.f16729f = m29303g;
        Window window = getWindow();
        if (window != null) {
            this.f16730g = window.getAttributes().softInputMode & 240;
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            C43166jB6.m31026b(window, this.f16726c.m111011a());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            C50196v31 c50196v31 = new C50196v31(context2, window);
            int i2 = C46424oh4.compose_view_saveable_id_tag;
            c50196v31.setTag(i2, "Dialog:" + dialogId);
            c50196v31.setClipChildren(false);
            c50196v31.setElevation(density.mo3411T0(m29303g));
            c50196v31.setOutlineProvider(new C3875a());
            this.f16728e = c50196v31;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                m101248b(viewGroup);
            }
            setContentView(c50196v31);
            C35534Qt6.m87652b(c50196v31, C35534Qt6.m87653a(composeView));
            C36470Ut6.m80657b(c50196v31, C36470Ut6.m80658a(composeView));
            C36236Tt6.m82296b(c50196v31, C36236Tt6.m82297a(composeView));
            m101241i(this.f16725b, this.f16726c, layoutDirection);
            C38677bf3.m64201b(getOnBackPressedDispatcher(), this, false, new C3876b(), 2, null);
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    /* renamed from: b */
    public static final void m101248b(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C50196v31) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                m101248b(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    /* renamed from: e */
    public final void m101245e() {
        this.f16728e.disposeComposition();
    }

    /* renamed from: f */
    public final void m101244f(AbstractC37400Yt0 parentComposition, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> children) {
        Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f16728e.setContent(parentComposition, children);
    }

    /* renamed from: g */
    public final void m101243g(EnumC47065pm2 enumC47065pm2) {
        C50196v31 c50196v31 = this.f16728e;
        int i = C3877c.$EnumSwitchMapping$0[enumC47065pm2.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 0;
        }
        c50196v31.setLayoutDirection(i2);
    }

    /* renamed from: h */
    public final void m101242h(EnumC35038Oq5 enumC35038Oq5) {
        int i;
        boolean m89705a = C35272Pq5.m89705a(enumC35038Oq5, C30242xd.m4927e(this.f16727d));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (m89705a) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
    }

    /* renamed from: i */
    public final void m101241i(Function0<Unit> onDismissRequest, D31 properties, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f16725b = onDismissRequest;
        this.f16726c = properties;
        m101242h(properties.m111008d());
        m101243g(layoutDirection);
        this.f16728e.m9267d(properties.m111007e());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.m111011a()) {
                Window window = getWindow();
                if (window != null) {
                    window.setSoftInputMode(this.f16730g);
                    return;
                }
                return;
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.f16726c.m111009c()) {
            this.f16725b.invoke();
        }
        return onTouchEvent;
    }
}
