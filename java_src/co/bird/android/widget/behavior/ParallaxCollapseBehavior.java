package co.bird.android.widget.behavior;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014¨\u0006\""}, m28432d2 = {"Lco/bird/android/widget/behavior/ParallaxCollapseBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "dependency", "", "onDependentViewChanged", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z", "", "translationBottom", "", "b", C17296a.f69688o, "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "I", "translationBottomViewId", "", "c", "F", "parallaxRatio", DateTokenConverter.CONVERTER_KEY, "translationTop", "e", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ParallaxCollapseBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: f */
    public static final C16633a f67794f = new C16633a(null);

    /* renamed from: a */
    public final Context f67795a;

    /* renamed from: b */
    public final int f67796b;

    /* renamed from: c */
    public final float f67797c;

    /* renamed from: d */
    public int f67798d;

    /* renamed from: e */
    public int f67799e;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/behavior/ParallaxCollapseBehavior$a;", "", "Landroid/view/View;", "view", "", C17296a.f69688o, "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.behavior.ParallaxCollapseBehavior$a */
    /* loaded from: classes4.dex */
    public static final class C16633a {
        public /* synthetic */ C16633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m54237a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getLayoutParams() instanceof CoordinatorLayout.C11529e) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                return ((CoordinatorLayout.C11529e) layoutParams).m67769f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private C16633a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParallaxCollapseBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67795a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, C34290Ll4.ParallaxCollapseBehavior);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ParallaxCollapseBehavior)");
        this.f67796b = obtainStyledAttributes.getResourceId(C34290Ll4.ParallaxCollapseBehavior_behavior_bottom_toTopOf, -1);
        this.f67797c = obtainStyledAttributes.getFloat(C34290Ll4.ParallaxCollapseBehavior_behavior_parallaxRatio, 1.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void m54239a(CoordinatorLayout parent, V child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        child.setTranslationY(this.f67797c * (this.f67799e - parent.getHeight()));
    }

    /* renamed from: b */
    public final void m54238b(int i) {
        this.f67799e = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout parent, V child, View dependency) {
        boolean z;
        Context context;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (parent.isInEditMode() || !f67794f.m54237a(dependency)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = dependency.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) layoutParams).m67769f();
        Intrinsics.checkNotNull(m67769f, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) m67769f;
        if (this.f67798d == 0) {
            Intrinsics.checkNotNull(parent.getContext(), "null cannot be cast to non-null type android.app.Activity");
            this.f67798d = (int) (((Activity) context).findViewById(16908290).getHeight() * 0.5d);
        }
        if (this.f67796b != -1) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
            int top = ((Activity) context2).findViewById(this.f67796b).getTop();
            if (this.f67799e != top) {
                this.f67799e = top;
            }
        }
        if (dependency.getTop() >= bottomSheetBehavior.m50129K()) {
            int i = this.f67798d;
            int i2 = this.f67799e;
            int top2 = dependency.getTop();
            if (i <= top2 && top2 <= i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                child.setTranslationY(this.f67797c * (dependency.getTop() - parent.getHeight()));
                return true;
            }
        }
        if (dependency.getTop() <= this.f67798d && child.getTranslationY() > this.f67797c * (this.f67798d - parent.getHeight())) {
            child.setTranslationY(this.f67797c * (this.f67798d - parent.getHeight()));
        } else if (dependency.getTop() < this.f67799e || child.getTranslationY() >= this.f67797c * (this.f67799e - parent.getHeight())) {
            return false;
        } else {
            child.setTranslationY(this.f67797c * (this.f67799e - parent.getHeight()));
        }
        return true;
    }
}
