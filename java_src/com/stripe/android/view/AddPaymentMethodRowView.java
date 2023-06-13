package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.databinding.AddPaymentMethodRowBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodRowView;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "label", "Landroidx/appcompat/widget/AppCompatTextView;", "getLabel$payments_core_release", "()Landroidx/appcompat/widget/AppCompatTextView;", "viewBinding", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentMethodRowView extends FrameLayout {
    private final AppCompatTextView label;
    private final AddPaymentMethodRowBinding viewBinding;

    private AddPaymentMethodRowView(Context context) {
        super(context);
        AddPaymentMethodRowBinding inflate = AddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.viewBinding = inflate;
        AppCompatTextView appCompatTextView = inflate.label;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "viewBinding.label");
        this.label = appCompatTextView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setFocusable(true);
        setClickable(true);
    }

    public final AppCompatTextView getLabel$payments_core_release() {
        return this.label;
    }
}
