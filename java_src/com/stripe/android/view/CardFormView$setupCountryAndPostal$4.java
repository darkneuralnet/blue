package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView$setupCountryAndPostal$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,472:1\n262#2,2:473\n*S KotlinDebug\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView$setupCountryAndPostal$4\n*L\n229#1:473,2\n*E\n"})
/* loaded from: classes7.dex */
public final class CardFormView$setupCountryAndPostal$4 extends Lambda implements Function1<CountryCode, Unit> {
    final /* synthetic */ CardFormView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardFormView$setupCountryAndPostal$4(CardFormView cardFormView) {
        super(1);
        this.this$0 = cardFormView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CountryCode countryCode) {
        invoke2(countryCode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CountryCode countryCode) {
        TextInputLayout textInputLayout;
        PostalCodeEditText postalCodeEditText;
        PostalCodeEditText postalCodeEditText2;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.this$0.updatePostalCodeViewLocale(countryCode);
        textInputLayout = this.this$0.postalCodeContainer;
        textInputLayout.setVisibility(CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode) ? 0 : 8);
        postalCodeEditText = this.this$0.postalCodeView;
        postalCodeEditText.setShouldShowError(false);
        postalCodeEditText2 = this.this$0.postalCodeView;
        postalCodeEditText2.setText((CharSequence) null);
    }
}
