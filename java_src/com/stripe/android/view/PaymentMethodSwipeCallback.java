package com.stripe.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.C18606R;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b.\u0010/J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J@\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%¨\u00062"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback;", "Landroidx/recyclerview/widget/l$h;", "Landroid/view/View;", "itemView", "", "dX", "", "transitionFraction", "Landroid/graphics/Canvas;", "canvas", "", "updateSwipedPaymentMethod", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "target", "", "onMove", "direction", "onSwiped", "getSwipeDirs", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "getSwipeThreshold", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "Landroid/graphics/drawable/Drawable;", "trashIcon", "Landroid/graphics/drawable/Drawable;", "swipeStartColor", "I", "swipeThresholdColor", "Landroid/graphics/drawable/ColorDrawable;", "background", "Landroid/graphics/drawable/ColorDrawable;", "itemViewStartPadding", "iconStartOffset", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;)V", "Companion", "Listener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentMethodSwipeCallback extends C11925l.AbstractC11936h {
    public static final Companion Companion = new Companion(null);
    private static final float END_TRANSITION_THRESHOLD = 0.5f;
    private static final float START_TRANSITION_THRESHOLD = 0.25f;
    private final PaymentMethodsAdapter adapter;
    private final ColorDrawable background;
    private final int iconStartOffset;
    private final int itemViewStartPadding;
    private final Listener listener;
    private final int swipeStartColor;
    private final int swipeThresholdColor;
    private final Drawable trashIcon;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback$Companion;", "", "()V", "END_TRANSITION_THRESHOLD", "", "START_TRANSITION_THRESHOLD", "calculateTransitionColor", "", "fraction", "startValue", "endValue", "calculateTransitionColor$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int calculateTransitionColor$payments_core_release(float f, int i, int i2) {
            int alpha = Color.alpha(i);
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            return Color.argb((int) (alpha + ((Color.alpha(i2) - alpha) * f)), (int) (red + ((Color.red(i2) - red) * f)), (int) (green + ((Color.green(i2) - green) * f)), (int) (blue + ((Color.blue(i2) - blue) * f)));
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "", "onSwiped", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Listener {
        void onSwiped(PaymentMethod paymentMethod);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodSwipeCallback(Context context, PaymentMethodsAdapter adapter, Listener listener) {
        super(0, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.adapter = adapter;
        this.listener = listener;
        Drawable m94299e = NA0.m94299e(context, C18606R.C18607drawable.stripe_ic_trash);
        Intrinsics.checkNotNull(m94299e);
        this.trashIcon = m94299e;
        int m94301c = NA0.m94301c(context, C18606R.color.stripe_swipe_start_payment_method);
        this.swipeStartColor = m94301c;
        this.swipeThresholdColor = NA0.m94301c(context, C18606R.color.stripe_swipe_threshold_payment_method);
        this.background = new ColorDrawable(m94301c);
        this.itemViewStartPadding = m94299e.getIntrinsicWidth() / 2;
        this.iconStartOffset = context.getResources().getDimensionPixelSize(C18606R.dimen.stripe_list_row_start_padding);
    }

    private final void updateSwipedPaymentMethod(View view, int i, float f, Canvas canvas) {
        int calculateTransitionColor$payments_core_release;
        int top = view.getTop() + ((view.getHeight() - this.trashIcon.getIntrinsicHeight()) / 2);
        int intrinsicHeight = this.trashIcon.getIntrinsicHeight() + top;
        if (i > 0) {
            int left = view.getLeft() + this.iconStartOffset;
            int intrinsicWidth = this.trashIcon.getIntrinsicWidth() + left;
            if (i > intrinsicWidth) {
                this.trashIcon.setBounds(left, top, intrinsicWidth, intrinsicHeight);
            } else {
                this.trashIcon.setBounds(0, 0, 0, 0);
            }
            this.background.setBounds(view.getLeft(), view.getTop(), view.getLeft() + i + this.itemViewStartPadding, view.getBottom());
            ColorDrawable colorDrawable = this.background;
            if (f <= 0.0f) {
                calculateTransitionColor$payments_core_release = this.swipeStartColor;
            } else if (f >= 1.0f) {
                calculateTransitionColor$payments_core_release = this.swipeThresholdColor;
            } else {
                calculateTransitionColor$payments_core_release = Companion.calculateTransitionColor$payments_core_release(f, this.swipeStartColor, this.swipeThresholdColor);
            }
            colorDrawable.setColor(calculateTransitionColor$payments_core_release);
        } else {
            this.trashIcon.setBounds(0, 0, 0, 0);
            this.background.setBounds(0, 0, 0, 0);
        }
        this.background.draw(canvas);
        this.trashIcon.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11936h
    public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder) {
            return super.getSwipeDirs(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public float getSwipeThreshold(RecyclerView.AbstractC11834D viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return 0.5f;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder, float f, float f2, int i, boolean z) {
        float f3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (viewHolder instanceof PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder) {
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
            float width = view.getWidth() * START_TRANSITION_THRESHOLD;
            float width2 = view.getWidth() * 0.5f;
            if (f < width) {
                f3 = 0.0f;
            } else if (f >= width2) {
                f3 = 1.0f;
            } else {
                f3 = (f - width) / (width2 - width);
            }
            updateSwipedPaymentMethod(view, (int) f, f3, canvas);
        }
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public boolean onMove(RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder, RecyclerView.AbstractC11834D target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return true;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public void onSwiped(RecyclerView.AbstractC11834D viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.listener.onSwiped(this.adapter.getPaymentMethodAtPosition$payments_core_release(viewHolder.getBindingAdapterPosition()));
    }
}
