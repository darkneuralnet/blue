package zendesk.messaging.p061ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: zendesk.messaging.ui.ValueAnimators */
/* loaded from: classes8.dex */
class ValueAnimators {
    private ValueAnimators() {
    }

    public static ValueAnimator topMarginAnimator(final View view, int i, int i2, long j) {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zendesk.messaging.ui.ValueAnimators.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration(j);
        return ofInt;
    }

    public static ValueAnimator topPaddingAnimator(View view, int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view, ofInt) { // from class: zendesk.messaging.ui.ValueAnimators.1
            final int paddingBottom;
            final int paddingLeft;
            final int paddingRight;
            final /* synthetic */ ValueAnimator val$valueAnimator;
            final /* synthetic */ View val$view;

            {
                this.val$view = view;
                this.val$valueAnimator = ofInt;
                this.paddingLeft = view.getPaddingLeft();
                this.paddingRight = view.getPaddingRight();
                this.paddingBottom = view.getPaddingBottom();
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.val$view.setPadding(this.paddingLeft, ((Integer) this.val$valueAnimator.getAnimatedValue()).intValue(), this.paddingRight, this.paddingBottom);
            }
        });
        ofInt.setDuration(j);
        return ofInt;
    }
}
