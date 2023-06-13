package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/widget/MultiIconView;", "Landroid/widget/FrameLayout;", "", "resId", "", "setPrimaryIcon", "setSecondaryIcon", "LYr6;", "b", "LYr6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MultiIconView extends FrameLayout {

    /* renamed from: b */
    public final C37388Yr6 f67398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiIconView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C37388Yr6 m74091b = C37388Yr6.m74091b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(m74091b, "inflate(LayoutInflater.from(context), this)");
        this.f67398b = m74091b;
    }

    public final void setPrimaryIcon(int i) {
        this.f67398b.f47498b.setImageDrawable(NA0.m94299e(getContext(), i));
    }

    public final void setSecondaryIcon(int i) {
        this.f67398b.f47499c.setImageDrawable(NA0.m94299e(getContext(), i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C37388Yr6 m74091b = C37388Yr6.m74091b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(m74091b, "inflate(LayoutInflater.from(context), this)");
        this.f67398b = m74091b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C37388Yr6 m74091b = C37388Yr6.m74091b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(m74091b, "inflate(LayoutInflater.from(context), this)");
        this.f67398b = m74091b;
    }
}
