package com.stripe.android.paymentsheet.model;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.p047ui.PaymentMethodsUiExtensionKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "", "resources", "Landroid/content/res/Resources;", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "(Landroid/content/res/Resources;Lcom/stripe/android/uicore/image/StripeImageLoader;)V", "create", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "isDarkTheme", "", "loadPaymentOption", "Landroid/graphics/drawable/Drawable;", "paymentOption", "(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentOptionFactory {
    private final StripeImageLoader imageLoader;
    private final Resources resources;

    public PaymentOptionFactory(Resources resources, StripeImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.resources = resources;
        this.imageLoader = imageLoader;
    }

    private final boolean isDarkTheme() {
        Configuration configuration = this.resources.getConfiguration();
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadPaymentOption(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
        String lightThemeIconUrl$paymentsheet_release = paymentOption.getLightThemeIconUrl$paymentsheet_release();
        String darkThemeIconUrl$paymentsheet_release = paymentOption.getDarkThemeIconUrl$paymentsheet_release();
        if (isDarkTheme() && darkThemeIconUrl$paymentsheet_release != null) {
            return loadPaymentOption$loadIcon(this, paymentOption, darkThemeIconUrl$paymentsheet_release, continuation);
        }
        if (lightThemeIconUrl$paymentsheet_release != null) {
            return loadPaymentOption$loadIcon(this, paymentOption, lightThemeIconUrl$paymentsheet_release, continuation);
        }
        return loadPaymentOption$loadResource(this, paymentOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object loadPaymentOption$loadIcon(PaymentOptionFactory paymentOptionFactory, PaymentOption paymentOption, String str, Continuation<? super Drawable> continuation) {
        PaymentOptionFactory$loadPaymentOption$loadIcon$1 paymentOptionFactory$loadPaymentOption$loadIcon$1;
        Object coroutine_suspended;
        int i;
        Object m116767loadgIAlus;
        Bitmap bitmap;
        if (continuation instanceof PaymentOptionFactory$loadPaymentOption$loadIcon$1) {
            paymentOptionFactory$loadPaymentOption$loadIcon$1 = (PaymentOptionFactory$loadPaymentOption$loadIcon$1) continuation;
            int i2 = paymentOptionFactory$loadPaymentOption$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentOptionFactory$loadPaymentOption$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentOptionFactory$loadPaymentOption$loadIcon$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentOptionFactory$loadPaymentOption$loadIcon$1.label;
                if (i == 0) {
                    if (i == 1) {
                        paymentOption = (PaymentOption) paymentOptionFactory$loadPaymentOption$loadIcon$1.L$1;
                        paymentOptionFactory = (PaymentOptionFactory) paymentOptionFactory$loadPaymentOption$loadIcon$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        m116767loadgIAlus = ((Result) obj).m116792unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    StripeImageLoader stripeImageLoader = paymentOptionFactory.imageLoader;
                    paymentOptionFactory$loadPaymentOption$loadIcon$1.L$0 = paymentOptionFactory;
                    paymentOptionFactory$loadPaymentOption$loadIcon$1.L$1 = paymentOption;
                    paymentOptionFactory$loadPaymentOption$loadIcon$1.label = 1;
                    m116767loadgIAlus = stripeImageLoader.m116767loadgIAlus(str, paymentOptionFactory$loadPaymentOption$loadIcon$1);
                    if (m116767loadgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (Result.m116789isFailureimpl(m116767loadgIAlus)) {
                    m116767loadgIAlus = null;
                }
                bitmap = (Bitmap) m116767loadgIAlus;
                if (bitmap == null) {
                    return new BitmapDrawable(paymentOptionFactory.resources, bitmap);
                }
                return loadPaymentOption$loadResource(paymentOptionFactory, paymentOption);
            }
        }
        paymentOptionFactory$loadPaymentOption$loadIcon$1 = new PaymentOptionFactory$loadPaymentOption$loadIcon$1(continuation);
        Object obj2 = paymentOptionFactory$loadPaymentOption$loadIcon$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentOptionFactory$loadPaymentOption$loadIcon$1.label;
        if (i == 0) {
        }
        if (Result.m116789isFailureimpl(m116767loadgIAlus)) {
        }
        bitmap = (Bitmap) m116767loadgIAlus;
        if (bitmap == null) {
        }
    }

    private static final Drawable loadPaymentOption$loadResource(PaymentOptionFactory paymentOptionFactory, PaymentOption paymentOption) {
        Drawable m10397f = C49785uM4.m10397f(paymentOptionFactory.resources, paymentOption.getDrawableResourceId(), null);
        if (m10397f == null) {
            return new ShapeDrawable();
        }
        return m10397f;
    }

    public final PaymentOption create(PaymentSelection selection) {
        int i;
        Intrinsics.checkNotNullParameter(selection, "selection");
        if (Intrinsics.areEqual(selection, PaymentSelection.GooglePay.INSTANCE)) {
            int i2 = C19159R.C19160drawable.stripe_google_pay_mark;
            String string = this.resources.getString(C19159R.string.google_pay);
            PaymentOptionFactory$create$1 paymentOptionFactory$create$1 = new PaymentOptionFactory$create$1(this);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.google_pay)");
            return new PaymentOption(i2, string, null, null, paymentOptionFactory$create$1);
        } else if (Intrinsics.areEqual(selection, PaymentSelection.Link.INSTANCE)) {
            int i3 = C19159R.C19160drawable.stripe_ic_paymentsheet_link;
            String string2 = this.resources.getString(C19159R.string.link);
            PaymentOptionFactory$create$2 paymentOptionFactory$create$2 = new PaymentOptionFactory$create$2(this);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.link)");
            return new PaymentOption(i3, string2, null, null, paymentOptionFactory$create$2);
        } else if (selection instanceof PaymentSelection.Saved) {
            PaymentSelection.Saved saved = (PaymentSelection.Saved) selection;
            Integer savedPaymentMethodIcon = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon(saved.getPaymentMethod());
            if (savedPaymentMethodIcon != null) {
                i = savedPaymentMethodIcon.intValue();
            } else {
                i = 0;
            }
            int i4 = i;
            String label = PaymentMethodsUiExtensionKt.getLabel(saved.getPaymentMethod(), this.resources);
            if (label == null) {
                label = "";
            }
            return new PaymentOption(i4, label, null, null, new PaymentOptionFactory$create$3(this));
        } else if (selection instanceof PaymentSelection.New.Card) {
            PaymentSelection.New.Card card = (PaymentSelection.New.Card) selection;
            return new PaymentOption(PaymentMethodsUiExtensionKt.getCardBrandIcon(card.getBrand()), PaymentMethodsUiExtensionKt.createCardLabel(this.resources, card.getLast4()), null, null, new PaymentOptionFactory$create$4(this));
        } else if (selection instanceof PaymentSelection.New.LinkInline) {
            PaymentSelection.New.LinkInline linkInline = (PaymentSelection.New.LinkInline) selection;
            return new PaymentOption(linkInline.getIconResource(), linkInline.getLabel(), null, null, new PaymentOptionFactory$create$5(this));
        } else if (selection instanceof PaymentSelection.New.GenericPaymentMethod) {
            PaymentSelection.New.GenericPaymentMethod genericPaymentMethod = (PaymentSelection.New.GenericPaymentMethod) selection;
            return new PaymentOption(genericPaymentMethod.getIconResource(), genericPaymentMethod.getLabelResource(), genericPaymentMethod.getLightThemeIconUrl(), genericPaymentMethod.getDarkThemeIconUrl(), new PaymentOptionFactory$create$6(this));
        } else if (selection instanceof PaymentSelection.New.USBankAccount) {
            PaymentSelection.New.USBankAccount uSBankAccount = (PaymentSelection.New.USBankAccount) selection;
            return new PaymentOption(uSBankAccount.getIconResource(), uSBankAccount.getLabelResource(), null, null, new PaymentOptionFactory$create$7(this));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
