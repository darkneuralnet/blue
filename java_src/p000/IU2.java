package p000;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u0018\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"LIU2;", "", "", "layoutRes", "", "wrapInScrollView", "e", "Landroid/view/View;", "view", "f", "canceledOnTouchOutside", "b", "c", "LDU2;", C17296a.f69688o, "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "j", "()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "parentScopeProvider", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "i", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "contentView", "Landroid/view/View;", "g", "()Landroid/view/View;", "setCloseButton$app_birdRelease", "(Landroid/view/View;)V", "closeButton", "Ltu0;", "Ltu0;", "h", "()Ltu0;", "compoundDismissListener", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IU2 */
/* loaded from: classes2.dex */
public final class IU2 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f15751a;

    /* renamed from: b */
    public final Context f15752b;

    /* renamed from: c */
    public final MaterialDialog f15753c;

    /* renamed from: d */
    public FrameLayout f15754d;

    /* renamed from: e */
    public View f15755e;

    /* renamed from: f */
    public final DialogInterface$OnDismissListenerC49514tu0 f15756f;

    public IU2(LifecycleScopeProvider<EnumC7097RE> parentScopeProvider, Context context) {
        Intrinsics.checkNotNullParameter(parentScopeProvider, "parentScopeProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15751a = parentScopeProvider;
        this.f15752b = context;
        MaterialDialog materialDialog = new MaterialDialog(context, MaterialDialog.Companion.getDEFAULT_BEHAVIOR());
        this.f15753c = materialDialog;
        this.f15754d = new FrameLayout(context);
        this.f15756f = new DialogInterface$OnDismissListenerC49514tu0();
        materialDialog.getView().getContentLayout().setCustomView(null);
        DialogCustomViewExtKt.customView$default(materialDialog, null, this.f15754d, false, false, false, false, 57, null);
    }

    /* renamed from: a */
    public final DU2 m102056a() {
        return new DU2(this);
    }

    /* renamed from: b */
    public final IU2 m102055b(boolean z) {
        this.f15753c.cancelOnTouchOutside(z);
        return this;
    }

    /* renamed from: c */
    public final IU2 m102054c() {
        if (this.f15755e == null) {
            View m102053d = m102053d(this.f15752b);
            this.f15755e = m102053d;
            this.f15754d.addView(m102053d);
        }
        return this;
    }

    /* renamed from: d */
    public final View m102053d(Context context) {
        int applyDimension = (int) TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(C40788fB0.m41769m(context, C48193rg4.ic_close, C48183rf4.navigationBackgroundColor, C40788fB0.m41776f(context, C32364Df4.white), true));
        imageView.setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* renamed from: e */
    public final IU2 m102052e(int i, boolean z) {
        this.f15753c.getView().getContentLayout().setCustomView(null);
        DialogCustomViewExtKt.customView$default(this.f15753c, null, LayoutInflater.from(this.f15752b).inflate(i, (ViewGroup) null), z, false, false, false, 57, null);
        return this;
    }

    /* renamed from: f */
    public final IU2 m102051f(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = this.f15755e;
        if (view2 != null) {
            this.f15754d.removeView(view2);
        }
        this.f15754d.addView(view);
        View view3 = this.f15755e;
        if (view3 != null) {
            this.f15754d.addView(view3);
        }
        return this;
    }

    /* renamed from: g */
    public final View m102050g() {
        return this.f15755e;
    }

    /* renamed from: h */
    public final DialogInterface$OnDismissListenerC49514tu0 m102049h() {
        return this.f15756f;
    }

    /* renamed from: i */
    public final MaterialDialog m102048i() {
        return this.f15753c;
    }

    /* renamed from: j */
    public final LifecycleScopeProvider<EnumC7097RE> m102047j() {
        return this.f15751a;
    }

    /* renamed from: k */
    public final DU2 m102046k() {
        DU2 m102056a = m102056a();
        m102056a.m110364o();
        return m102056a;
    }
}
