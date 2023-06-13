package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.nestedstructures.FleetTarget;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011B!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/ScoreboardView;", "Landroidx/cardview/widget/CardView;", "", "Lco/bird/android/model/persistence/nestedstructures/FleetTarget;", "targets", "", "r", "Lzt6;", "k", "Lzt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScoreboardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScoreboardView.kt\nco/bird/android/feature/fleetstatus/kpi/views/ScoreboardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1855#2:30\n1856#2:32\n1#3:31\n*S KotlinDebug\n*F\n+ 1 ScoreboardView.kt\nco/bird/android/feature/fleetstatus/kpi/views/ScoreboardView\n*L\n24#1:30\n24#1:32\n*E\n"})
/* loaded from: classes3.dex */
public final class ScoreboardView extends CardView {

    /* renamed from: k */
    public final C53067zt6 f63957k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreboardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C53067zt6 m155b = C53067zt6.m155b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m155b, "inflate(context.layoutInflater, this)");
        this.f63957k = m155b;
    }

    /* renamed from: r */
    public final void m58194r(List<FleetTarget> targets) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        this.f63957k.f122440b.removeAllViews();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(C49520tu6.m11247d(this, 10), C49520tu6.m11247d(this, 10), C49520tu6.m11247d(this, 10), C49520tu6.m11247d(this, 10));
        for (FleetTarget fleetTarget : targets) {
            LinearLayout linearLayout = this.f63957k.f122440b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            TargetView targetView = new TargetView(context);
            targetView.m58185e(fleetTarget);
            linearLayout.addView(targetView, layoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C53067zt6 m155b = C53067zt6.m155b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m155b, "inflate(context.layoutInflater, this)");
        this.f63957k = m155b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreboardView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C53067zt6 m155b = C53067zt6.m155b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m155b, "inflate(context.layoutInflater, this)");
        this.f63957k = m155b;
    }
}
