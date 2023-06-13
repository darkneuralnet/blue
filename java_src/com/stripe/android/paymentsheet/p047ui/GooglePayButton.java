package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.paymentsheet.databinding.StripeGooglePayButtonBinding;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/GooglePayButton;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", TransferTable.COLUMN_STATE, "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;", "getViewBinding$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;", "onFinishProcessing", "", "onReadyState", "onStartProcessing", "setEnabled", "enabled", "", "updateAlpha", "updateState", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n262#2,2:107\n262#2,2:109\n262#2,2:111\n262#2,2:113\n262#2,2:115\n262#2,2:117\n*S KotlinDebug\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButton\n*L\n54#1:107,2\n55#1:109,2\n59#1:111,2\n60#1:113,2\n64#1:115,2\n65#1:117,2\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.GooglePayButton */
/* loaded from: classes7.dex */
public final class GooglePayButton extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    public static final String TEST_TAG = "google-pay-button";
    private PrimaryButton.State state;
    private final StripeGooglePayButtonBinding viewBinding;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/GooglePayButton$Companion;", "", "()V", "TEST_TAG", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.GooglePayButton$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GooglePayButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void onFinishProcessing() {
        PrimaryButton primaryButton = this.viewBinding.googlePayPrimaryButton;
        Intrinsics.checkNotNullExpressionValue(primaryButton, "viewBinding.googlePayPrimaryButton");
        primaryButton.setVisibility(0);
        ImageView imageView = this.viewBinding.googlePayButtonContent;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.googlePayButtonContent");
        imageView.setVisibility(8);
    }

    private final void onReadyState() {
        PrimaryButton primaryButton = this.viewBinding.googlePayPrimaryButton;
        Intrinsics.checkNotNullExpressionValue(primaryButton, "viewBinding.googlePayPrimaryButton");
        primaryButton.setVisibility(8);
        ImageView imageView = this.viewBinding.googlePayButtonContent;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.googlePayButtonContent");
        imageView.setVisibility(0);
    }

    private final void onStartProcessing() {
        PrimaryButton primaryButton = this.viewBinding.googlePayPrimaryButton;
        Intrinsics.checkNotNullExpressionValue(primaryButton, "viewBinding.googlePayPrimaryButton");
        primaryButton.setVisibility(0);
        ImageView imageView = this.viewBinding.googlePayButtonContent;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.googlePayButtonContent");
        imageView.setVisibility(8);
    }

    private final void updateAlpha() {
        float f;
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonLayout;
        PrimaryButton.State state = this.state;
        if ((state == null || (state instanceof PrimaryButton.State.Ready)) && !isEnabled()) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        relativeLayout.setAlpha(f);
    }

    public final StripeGooglePayButtonBinding getViewBinding$paymentsheet_release() {
        return this.viewBinding;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.viewBinding.googlePayPrimaryButton.setEnabled(z);
        updateAlpha();
    }

    public final void updateState(PrimaryButton.State state) {
        this.viewBinding.googlePayPrimaryButton.updateState(state);
        this.state = state;
        updateAlpha();
        if (state instanceof PrimaryButton.State.Ready) {
            onReadyState();
        } else if (Intrinsics.areEqual(state, PrimaryButton.State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state instanceof PrimaryButton.State.FinishProcessing) {
            onFinishProcessing();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GooglePayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GooglePayButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GooglePayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeGooglePayButtonBinding inflate = StripeGooglePayButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        super.setClickable(true);
        super.setEnabled(true);
        inflate.googlePayPrimaryButton.setBackgroundTintList(null);
        inflate.googlePayPrimaryButton.setFinishedBackgroundColor$paymentsheet_release(0);
    }
}
