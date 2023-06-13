package com.stripe.android.view;

import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CardInputWidget$initView$12 extends Lambda implements Function1<CardBrand, Unit> {
    final /* synthetic */ CardInputWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$12(CardInputWidget cardInputWidget) {
        super(1);
        this.this$0 = cardInputWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) {
        invoke2(cardBrand);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.this$0.getCardBrandView$payments_core_release().setBrand(brand);
        CardInputWidget cardInputWidget = this.this$0;
        cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.getCardNumberEditText$payments_core_release().getPanLength$payments_core_release());
        this.this$0.updateCvc();
    }
}
