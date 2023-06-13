package com.stripe.android.p049ui.core.injection;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import java.util.Set;
/* renamed from: com.stripe.android.ui.core.injection.FormControllerModule_ProvideTransformSpecToElementsFactory */
/* loaded from: classes7.dex */
public final class FormControllerModule_ProvideTransformSpecToElementsFactory implements InterfaceC48812sj1<TransformSpecToElements> {
    private final Y94<AddressRepository> addressRepositoryProvider;
    private final Y94<Context> contextProvider;
    private final Y94<Map<IdentifierSpec, String>> initialValuesProvider;
    private final Y94<String> merchantNameProvider;
    private final Y94<Map<IdentifierSpec, String>> shippingValuesProvider;
    private final Y94<StripeIntent> stripeIntentProvider;
    private final Y94<Set<IdentifierSpec>> viewOnlyFieldsProvider;

    public FormControllerModule_ProvideTransformSpecToElementsFactory(Y94<AddressRepository> y94, Y94<Context> y942, Y94<String> y943, Y94<StripeIntent> y944, Y94<Map<IdentifierSpec, String>> y945, Y94<Map<IdentifierSpec, String>> y946, Y94<Set<IdentifierSpec>> y947) {
        this.addressRepositoryProvider = y94;
        this.contextProvider = y942;
        this.merchantNameProvider = y943;
        this.stripeIntentProvider = y944;
        this.initialValuesProvider = y945;
        this.shippingValuesProvider = y946;
        this.viewOnlyFieldsProvider = y947;
    }

    public static FormControllerModule_ProvideTransformSpecToElementsFactory create(Y94<AddressRepository> y94, Y94<Context> y942, Y94<String> y943, Y94<StripeIntent> y944, Y94<Map<IdentifierSpec, String>> y945, Y94<Map<IdentifierSpec, String>> y946, Y94<Set<IdentifierSpec>> y947) {
        return new FormControllerModule_ProvideTransformSpecToElementsFactory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static TransformSpecToElements provideTransformSpecToElements(AddressRepository addressRepository, Context context, String str, StripeIntent stripeIntent, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2, Set<IdentifierSpec> set) {
        return (TransformSpecToElements) C51679xZ3.m5002e(FormControllerModule.INSTANCE.provideTransformSpecToElements(addressRepository, context, str, stripeIntent, map, map2, set));
    }

    @Override // p000.Y94
    public TransformSpecToElements get() {
        return provideTransformSpecToElements(this.addressRepositoryProvider.get(), this.contextProvider.get(), this.merchantNameProvider.get(), this.stripeIntentProvider.get(), this.initialValuesProvider.get(), this.shippingValuesProvider.get(), this.viewOnlyFieldsProvider.get());
    }
}
