package co.bird.android.app.feature.ridertutorial.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;", "Landroid/widget/LinearLayout;", "", "iconUrl", "", "setIcon", "subtitle", "setSubtitle", "title", "setTitle", "LJp6;", "b", "LJp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BeginnerModeTopView extends LinearLayout {

    /* renamed from: b */
    public final C33860Jp6 f62717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnerModeTopView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33860Jp6 m99646b = C33860Jp6.m99646b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99646b, "inflate(context.layoutInflater, this)");
        this.f62717b = m99646b;
        setGravity(1);
        setOrientation(1);
    }

    public final void setIcon(String iconUrl) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(iconUrl).m16096R0(this.f62717b.f18302b);
    }

    public final void setSubtitle(String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f62717b.f18303c.setText(subtitle);
    }

    public final void setTitle(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f62717b.f18304d.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnerModeTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33860Jp6 m99646b = C33860Jp6.m99646b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99646b, "inflate(context.layoutInflater, this)");
        this.f62717b = m99646b;
        setGravity(1);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnerModeTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33860Jp6 m99646b = C33860Jp6.m99646b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99646b, "inflate(context.layoutInflater, this)");
        this.f62717b = m99646b;
        setGravity(1);
        setOrientation(1);
    }
}
