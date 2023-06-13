package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/widget/SelectableButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "c", "b", DateTokenConverter.CONVERTER_KEY, "", "toggled", "setToggled", "Z", "isOptionEnabled", "()Z", "setOptionEnabled", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class SelectableButton extends AppCompatButton {

    /* renamed from: b */
    public boolean f67650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setForeground(NA0.m94299e(getContext(), 17170445));
        setTextAppearance(C32184Cl4.TextAppearance_Uppercase2);
        setStateListAnimator(null);
    }

    /* renamed from: b */
    public final void m54394b() {
        setBackgroundResource(C33309Hg4.button_pill_selector_disabled);
        setTextColor(NA0.m94301c(getContext(), C32364Df4.birdNewRoad));
        this.f67650b = false;
    }

    /* renamed from: c */
    public final void m54393c() {
        setBackgroundResource(C33309Hg4.button_pill_selector_enabled_dark);
        setTextColor(NA0.m94301c(getContext(), C32364Df4.white));
        this.f67650b = true;
    }

    /* renamed from: d */
    public final void m54392d() {
        if (this.f67650b) {
            m54394b();
        } else {
            m54393c();
        }
    }

    public final void setOptionEnabled(boolean z) {
        this.f67650b = z;
    }

    public final void setToggled(boolean z) {
        if (z) {
            m54393c();
        } else {
            m54394b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setForeground(NA0.m94299e(getContext(), 17170445));
        setTextAppearance(C32184Cl4.TextAppearance_Uppercase2);
        setStateListAnimator(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setForeground(NA0.m94299e(getContext(), 17170445));
        setTextAppearance(C32184Cl4.TextAppearance_Uppercase2);
        setStateListAnimator(null);
    }
}
