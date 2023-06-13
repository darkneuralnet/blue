package androidx.compose.p003ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47720qs4;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010W\u001a\u00020V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X\u0012\b\b\u0002\u0010Z\u001a\u00020\u0012¢\u0006\u0004\b[\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0004J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0004J7\u0010\"\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0019H\u0016J\u0012\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u0012H\u0016J\"\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H\u0016J\u001c\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J$\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J$\u0010/\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0014J,\u0010/\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020\u0019H\u0014J\b\u00101\u001a\u00020\u0019H\u0016R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R(\u00107\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010>\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010FR0\u0010G\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00198F@FX\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bM\u0010F\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010HR\u0016\u0010O\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010HR\u0018\u0010P\u001a\u00020\u0019*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bR\u0010JR\u0011\u0010U\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010J¨\u0006]"}, m28432d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "", "checkAddView", "LYt0;", "cacheIfAlive", "resolveParentCompositionContext", "ensureCompositionCreated", "parent", "setParentCompositionContext", "Landroidx/compose/ui/platform/k;", "strategy", "setViewCompositionStrategy", "Content", "(LEt0;I)V", "createComposition", "disposeComposition", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "isTransitionGroup", "setTransitionGroup", "Landroid/view/View;", "child", "addView", "index", "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "value", "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "LXt0;", "composition", "LXt0;", "parentContext", "LYt0;", "setParentContext", "(LYt0;)V", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "()V", "showLayoutBounds", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "isAlive", "(LYt0;)Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<AbstractC37400Yt0> cachedViewTreeCompositionContext;
    private InterfaceC37166Xt0 composition;
    private boolean creatingComposition;
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private AbstractC37400Yt0 parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AbstractComposeView$a */
    /* loaded from: classes.dex */
    public static final class C11337a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        public C11337a() {
            super(2);
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
                C35528Qt0.m87816Z(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:250)");
            }
            AbstractComposeView.this.Content(interfaceC32720Et0, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AbstractC37400Yt0 cacheIfAlive(AbstractC37400Yt0 abstractC37400Yt0) {
        AbstractC37400Yt0 abstractC37400Yt02;
        if (isAlive(abstractC37400Yt0)) {
            abstractC37400Yt02 = abstractC37400Yt0;
        } else {
            abstractC37400Yt02 = null;
        }
        if (abstractC37400Yt02 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(abstractC37400Yt02);
        }
        return abstractC37400Yt0;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = C11447m.m68283e(this, resolveParentCompositionContext(), C43575jt0.m29790c(-656146368, true, new C11337a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(AbstractC37400Yt0 abstractC37400Yt0) {
        return !(abstractC37400Yt0 instanceof C47720qs4) || ((C47720qs4) abstractC37400Yt0).m16872X().getValue().compareTo(C47720qs4.EnumC27716d.ShuttingDown) > 0;
    }

    private final AbstractC37400Yt0 resolveParentCompositionContext() {
        AbstractC37400Yt0 abstractC37400Yt0;
        AbstractC37400Yt0 abstractC37400Yt02;
        AbstractC37400Yt0 abstractC37400Yt03 = this.parentContext;
        if (abstractC37400Yt03 == null) {
            AbstractC37400Yt0 m68505d = WindowRecomposer_androidKt.m68505d(this);
            AbstractC37400Yt0 abstractC37400Yt04 = null;
            if (m68505d != null) {
                abstractC37400Yt0 = cacheIfAlive(m68505d);
            } else {
                abstractC37400Yt0 = null;
            }
            if (abstractC37400Yt0 == null) {
                WeakReference<AbstractC37400Yt0> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (abstractC37400Yt02 = weakReference.get()) != null && isAlive(abstractC37400Yt02)) {
                    abstractC37400Yt04 = abstractC37400Yt02;
                }
                AbstractC37400Yt0 abstractC37400Yt05 = abstractC37400Yt04;
                if (abstractC37400Yt05 == null) {
                    return cacheIfAlive(WindowRecomposer_androidKt.m68501h(this));
                }
                return abstractC37400Yt05;
            }
            return abstractC37400Yt0;
        }
        return abstractC37400Yt03;
    }

    private final void setParentContext(AbstractC37400Yt0 abstractC37400Yt0) {
        if (this.parentContext != abstractC37400Yt0) {
            this.parentContext = abstractC37400Yt0;
            if (abstractC37400Yt0 != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            InterfaceC37166Xt0 interfaceC37166Xt0 = this.composition;
            if (interfaceC37166Xt0 != null) {
                interfaceC37166Xt0.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(InterfaceC32720Et0 interfaceC32720Et0, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void createComposition() {
        boolean z;
        if (this.parentContext == null && !isAttachedToWindow()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ensureCompositionCreated();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void disposeComposition() {
        InterfaceC37166Xt0 interfaceC37166Xt0 = this.composition;
        if (interfaceC37166Xt0 != null) {
            interfaceC37166Xt0.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui_release(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(AbstractC37400Yt0 abstractC37400Yt0) {
        setParentContext(abstractC37400Yt0);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((InterfaceC43181jD3) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(InterfaceC11435k strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.mo68289a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = InterfaceC11435k.f53386a.m68290a().mo68289a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }
}
