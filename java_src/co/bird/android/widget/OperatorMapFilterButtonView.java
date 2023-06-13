package co.bird.android.widget;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/widget/OperatorMapFilterButtonView;", "Landroid/widget/LinearLayout;", "Landroid/util/AttributeSet;", "attrs", "", C17296a.f69688o, "LGm3;", "b", "LGm3;", "binding", "", "value", "c", "I", "getNumFiltersApplied", "()I", "setNumFiltersApplied", "(I)V", "numFiltersApplied", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class OperatorMapFilterButtonView extends LinearLayout {

    /* renamed from: b */
    public final C33128Gm3 f67433b;

    /* renamed from: c */
    public int f67434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorMapFilterButtonView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.operator_map_filter_button_view, this, true);
        Drawable m94299e = NA0.m94299e(getContext(), C33309Hg4.background_map_button);
        setBackground(m94299e != null ? m94299e.mutate() : null);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C40474ef4.map_button_anim));
        C33128Gm3 m104764a = C33128Gm3.m104764a(this);
        Intrinsics.checkNotNullExpressionValue(m104764a, "bind(this)");
        this.f67433b = m104764a;
    }

    /* renamed from: a */
    public final void m54516a(AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C34290Ll4.OperatorMapFilterButtonView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ratorMapFilterButtonView)");
        try {
            setNumFiltersApplied(obtainStyledAttributes.getInteger(C34290Ll4.OperatorMapFilterButtonView_numFilters, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setNumFiltersApplied(int i) {
        this.f67434c = i;
        if (i > 0) {
            getBackground().setTint(NA0.m94301c(getContext(), C32364Df4.birdNewRoad));
            this.f67433b.f12405c.setImageTintList(ColorStateList.valueOf(NA0.m94301c(getContext(), C32364Df4.birdWhite)));
            TextView textView = this.f67433b.f12406d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.filterLabel");
            C49520tu6.show$default(textView, true, 0, 2, null);
            TextView textView2 = this.f67433b.f12404b;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.filterCount");
            C49520tu6.show$default(textView2, true, 0, 2, null);
            this.f67433b.f12404b.setText(String.valueOf(i));
            return;
        }
        getBackground().setTint(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        this.f67433b.f12405c.setImageTintList(ColorStateList.valueOf(NA0.m94301c(getContext(), C32364Df4.birdNewRoad)));
        TextView textView3 = this.f67433b.f12406d;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.filterLabel");
        C49520tu6.show$default(textView3, false, 0, 2, null);
        TextView textView4 = this.f67433b.f12404b;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.filterCount");
        C49520tu6.show$default(textView4, false, 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorMapFilterButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.operator_map_filter_button_view, this, true);
        Drawable m94299e = NA0.m94299e(getContext(), C33309Hg4.background_map_button);
        setBackground(m94299e != null ? m94299e.mutate() : null);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C40474ef4.map_button_anim));
        C33128Gm3 m104764a = C33128Gm3.m104764a(this);
        Intrinsics.checkNotNullExpressionValue(m104764a, "bind(this)");
        this.f67433b = m104764a;
        m54516a(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorMapFilterButtonView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.operator_map_filter_button_view, this, true);
        Drawable m94299e = NA0.m94299e(getContext(), C33309Hg4.background_map_button);
        setBackground(m94299e != null ? m94299e.mutate() : null);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C40474ef4.map_button_anim));
        C33128Gm3 m104764a = C33128Gm3.m104764a(this);
        Intrinsics.checkNotNullExpressionValue(m104764a, "bind(this)");
        this.f67433b = m104764a;
        m54516a(attrs);
    }
}
