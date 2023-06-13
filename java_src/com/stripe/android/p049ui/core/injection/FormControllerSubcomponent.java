package com.stripe.android.p049ui.core.injection;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import dagger.BindsInstance;
import dagger.Subcomponent;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
@Subcomponent(modules = {FormControllerModule.class})
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;", "", "formController", "Lcom/stripe/android/ui/core/FormController;", "getFormController", "()Lcom/stripe/android/ui/core/FormController;", "Builder", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.injection.FormControllerSubcomponent */
/* loaded from: classes7.dex */
public interface FormControllerSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u0007\u001a\u00020\u00002\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H'J\"\u0010\t\u001a\u00020\u00002\u0018\b\u0001\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H'J\u0016\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'J\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006H'J\b\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;", "", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "formSpec", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "shippingAddress", NamedConstantsKt.SHIPPING_VALUES, "", "viewOnlyFields", "LZC0;", "viewModelScope", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "merchantName", "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.injection.FormControllerSubcomponent$Builder */
    /* loaded from: classes7.dex */
    public interface Builder {
        FormControllerSubcomponent build();

        @BindsInstance
        Builder formSpec(LayoutSpec layoutSpec);

        @BindsInstance
        Builder initialValues(Map<IdentifierSpec, String> map);

        @BindsInstance
        Builder merchantName(String str);

        @BindsInstance
        Builder shippingValues(Map<IdentifierSpec, String> map);

        @BindsInstance
        Builder stripeIntent(StripeIntent stripeIntent);

        @BindsInstance
        Builder viewModelScope(ZC0 zc0);

        @BindsInstance
        Builder viewOnlyFields(Set<IdentifierSpec> set);
    }

    FormController getFormController();
}
