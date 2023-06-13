package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.nestedstructures.FleetTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/TargetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lco/bird/android/model/persistence/nestedstructures/FleetTarget;", "target", "", "e", "LJt6;", "b", "LJt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class TargetView extends ConstraintLayout {

    /* renamed from: b */
    public final C33896Jt6 f63973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33896Jt6 m99595b = C33896Jt6.m99595b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99595b, "inflate(context.layoutInflater, this)");
        this.f63973b = m99595b;
    }

    /* renamed from: e */
    public final void m58185e(FleetTarget target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f63973b.f18408c.setText(target.getName());
        ImageView imageView = this.f63973b.f18407b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.checkIcon");
        C49520tu6.show$default(imageView, target.getTargetMet(), 0, 2, null);
        ImageView imageView2 = this.f63973b.f18409d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.xIcon");
        C49520tu6.show$default(imageView2, !target.getTargetMet(), 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33896Jt6 m99595b = C33896Jt6.m99595b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99595b, "inflate(context.layoutInflater, this)");
        this.f63973b = m99595b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33896Jt6 m99595b = C33896Jt6.m99595b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99595b, "inflate(context.layoutInflater, this)");
        this.f63973b = m99595b;
    }
}
