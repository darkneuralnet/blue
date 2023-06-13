package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.init.p048ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.Factory0;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "Lcom/stripe/android/stripe3ds2/utils/Factory0;", "Landroid/app/Dialog;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "create", "ChallengeSubmitDialog", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeSubmitDialogFactory implements Factory0<Dialog> {
    private final Context context;
    private final UiCustomization uiCustomization;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;", "Landroid/app/Dialog;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "getViewBinding", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "onStart", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ChallengeSubmitDialog extends Dialog {
        private final UiCustomization uiCustomization;
        private final Lazy viewBinding$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSubmitDialog(Context context, UiCustomization uiCustomization) {
            super(context);
            Lazy lazy;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
            lazy = LazyKt__LazyJVMKt.lazy(new ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2(this));
            this.viewBinding$delegate = lazy;
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final StripeChallengeSubmitDialogBinding getViewBinding() {
            return (StripeChallengeSubmitDialogBinding) this.viewBinding$delegate.getValue();
        }

        @Override // android.app.Dialog
        public void onStart() {
            super.onStart();
            setContentView(getViewBinding().getRoot());
            CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
            CircularProgressIndicator circularProgressIndicator = getViewBinding().progressBar;
            Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "viewBinding.progressBar");
            customizeUtils.applyProgressBarColor$3ds2sdk_release(circularProgressIndicator, this.uiCustomization);
        }
    }

    public ChallengeSubmitDialogFactory(Context context, UiCustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.context = context;
        this.uiCustomization = uiCustomization;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.stripe3ds2.utils.Factory0
    public Dialog create() {
        return new ChallengeSubmitDialog(this.context, this.uiCustomization);
    }
}
