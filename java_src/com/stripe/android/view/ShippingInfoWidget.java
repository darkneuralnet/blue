package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.databinding.AddressWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001OB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002052\b\u0010*\u001a\u0004\u0018\u00010'J\b\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u000205H\u0002J\u0014\u0010E\u001a\u0002052\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GJ\b\u0010I\u001a\u000205H\u0002J\u0010\u0010J\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0002J\u0006\u0010N\u001a\u000208R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u000e\u0010 \u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u000e\u0010,\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u0006P"}, m28432d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addressEditText", "Lcom/stripe/android/view/StripeEditText;", "addressEditText2", "addressLine1TextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "addressLine2TextInputLayout", "cityEditText", "cityTextInputLayout", "countryAutoCompleteTextView", "Lcom/stripe/android/view/CountryTextInputLayout;", "value", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenFields", "getHiddenFields", "()Ljava/util/List;", "setHiddenFields", "(Ljava/util/List;)V", "nameEditText", "nameTextInputLayout", "optionalFields", "getOptionalFields", "setOptionalFields", "phoneNumberEditText", "phoneNumberTextInputLayout", "postalCodeEditText", "postalCodeTextInputLayout", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "rawShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getRawShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "getShippingInformation", "stateEditText", "stateTextInputLayout", "viewBinding", "Lcom/stripe/android/databinding/AddressWidgetBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/AddressWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "hideHiddenFields", "", "initView", "isFieldHidden", "", "field", "isFieldOptional", "isFieldRequired", "populateAddressFields", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", "populateShippingInfo", "renderCanadianForm", "renderGreatBritainForm", "renderInternationalForm", "renderLabels", "renderUSForm", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setupErrorHandling", "updateConfigForCountry", "country", "Lcom/stripe/android/core/model/Country;", "updatePostalCodeInputFilter", "validateAllFields", "CustomizableShippingField", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nShippingInfoWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShippingInfoWidget.kt\ncom/stripe/android/view/ShippingInfoWidget\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
/* loaded from: classes7.dex */
public final class ShippingInfoWidget extends LinearLayout {
    public static final int $stable = 8;
    private final StripeEditText addressEditText;
    private final StripeEditText addressEditText2;
    private final TextInputLayout addressLine1TextInputLayout;
    private final TextInputLayout addressLine2TextInputLayout;
    private final StripeEditText cityEditText;
    private final TextInputLayout cityTextInputLayout;
    private final CountryTextInputLayout countryAutoCompleteTextView;
    private List<? extends CustomizableShippingField> hiddenFields;
    private final StripeEditText nameEditText;
    private final TextInputLayout nameTextInputLayout;
    private List<? extends CustomizableShippingField> optionalFields;
    private final StripeEditText phoneNumberEditText;
    private final TextInputLayout phoneNumberTextInputLayout;
    private final StripeEditText postalCodeEditText;
    private final TextInputLayout postalCodeTextInputLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText stateEditText;
    private final TextInputLayout stateTextInputLayout;
    private final Lazy viewBinding$delegate;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "", "(Ljava/lang/String;I)V", "Line1", "Line2", "City", "PostalCode", "State", "Phone", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CustomizableShippingField {
        Line1,
        Line2,
        City,
        PostalCode,
        State,
        Phone
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingInfoWidget(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ShippingInformation getRawShippingInformation() {
        CountryCode countryCode;
        Address.Builder city = new Address.Builder().setCity(this.cityEditText.getFieldText$payments_core_release());
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            countryCode = selectedCountry$payments_core_release.getCode();
        } else {
            countryCode = null;
        }
        return new ShippingInformation(city.setCountryCode(countryCode).setLine1(this.addressEditText.getFieldText$payments_core_release()).setLine2(this.addressEditText2.getFieldText$payments_core_release()).setPostalCode(this.postalCodeEditText.getFieldText$payments_core_release()).setState(this.stateEditText.getFieldText$payments_core_release()).build(), this.nameEditText.getFieldText$payments_core_release(), this.phoneNumberEditText.getFieldText$payments_core_release());
    }

    private final AddressWidgetBinding getViewBinding() {
        return (AddressWidgetBinding) this.viewBinding$delegate.getValue();
    }

    private final void hideHiddenFields() {
        if (isFieldHidden(CustomizableShippingField.Line1)) {
            this.addressLine1TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Line2)) {
            this.addressLine2TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.State)) {
            this.stateTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.City)) {
            this.cityTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.PostalCode)) {
            this.postalCodeTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Phone)) {
            this.phoneNumberTextInputLayout.setVisibility(8);
        }
    }

    private final void initView() {
        this.countryAutoCompleteTextView.setCountryChangeCallback$payments_core_release(new ShippingInfoWidget$initView$1(this));
        this.phoneNumberEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        setupErrorHandling();
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    private final boolean isFieldHidden(CustomizableShippingField customizableShippingField) {
        return this.hiddenFields.contains(customizableShippingField);
    }

    private final boolean isFieldOptional(CustomizableShippingField customizableShippingField) {
        return this.optionalFields.contains(customizableShippingField);
    }

    private final boolean isFieldRequired(CustomizableShippingField customizableShippingField) {
        return (isFieldOptional(customizableShippingField) || isFieldHidden(customizableShippingField)) ? false : true;
    }

    private final void populateAddressFields(Address address) {
        boolean z;
        this.cityEditText.setText(address.getCity());
        String country = address.getCountry();
        if (country != null) {
            if (country.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.countryAutoCompleteTextView.setCountrySelected$payments_core_release(country);
            }
        }
        this.addressEditText.setText(address.getLine1());
        this.addressEditText2.setText(address.getLine2());
        this.postalCodeEditText.setText(address.getPostalCode());
        this.stateEditText.setText(address.getState());
    }

    private final void renderCanadianForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(C18606R.string.address_label_address_optional);
        } else {
            string = getResources().getString(C18606R.string.address_label_address);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(C18606R.string.address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(C18606R.string.address_label_postal_code_optional);
        } else {
            string2 = getResources().getString(C18606R.string.address_label_postal_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(C18606R.string.address_label_province_optional);
        } else {
            string3 = getResources().getString(C18606R.string.address_label_province);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(C18606R.string.address_postal_code_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(C18606R.string.address_province_required));
    }

    private final void renderGreatBritainForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(C18606R.string.address_label_address_line1_optional);
        } else {
            string = getResources().getString(C18606R.string.address_label_address_line1);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(C18606R.string.address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(C18606R.string.address_label_postcode_optional);
        } else {
            string2 = getResources().getString(C18606R.string.address_label_postcode);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(C18606R.string.address_label_county_optional);
        } else {
            string3 = getResources().getString(C18606R.string.address_label_county);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(C18606R.string.address_postcode_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(C18606R.string.address_county_required));
    }

    private final void renderInternationalForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(C18606R.string.address_label_address_line1_optional);
        } else {
            string = getResources().getString(C18606R.string.address_label_address_line1);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(C18606R.string.address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(C18606R.string.address_label_zip_postal_code_optional);
        } else {
            string2 = getResources().getString(C18606R.string.address_label_zip_postal_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(C18606R.string.address_label_region_generic_optional);
        } else {
            string3 = getResources().getString(C18606R.string.address_label_region_generic);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(C18606R.string.address_zip_postal_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(C18606R.string.address_region_generic_required));
    }

    private final void renderLabels() {
        String string;
        String string2;
        this.nameTextInputLayout.setHint(getResources().getString(C18606R.string.address_label_full_name));
        TextInputLayout textInputLayout = this.cityTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.City)) {
            string = getResources().getString(C18606R.string.address_label_city_optional);
        } else {
            string = getResources().getString(C18606R.string.address_label_city);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.phoneNumberTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Phone)) {
            string2 = getResources().getString(C18606R.string.address_label_phone_number_optional);
        } else {
            string2 = getResources().getString(C18606R.string.address_label_phone_number);
        }
        textInputLayout2.setHint(string2);
        hideHiddenFields();
    }

    private final void renderUSForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(C18606R.string.address_label_address_optional);
        } else {
            string = getResources().getString(C18606R.string.address_label_address);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(C18606R.string.address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(C18606R.string.address_label_zip_code_optional);
        } else {
            string2 = getResources().getString(C18606R.string.address_label_zip_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(C18606R.string.address_label_state_optional);
        } else {
            string3 = getResources().getString(C18606R.string.address_label_state);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(C18606R.string.address_zip_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(C18606R.string.address_state_required));
    }

    private final void setupErrorHandling() {
        this.addressEditText.setErrorMessageListener(new ErrorListener(this.addressLine1TextInputLayout));
        this.cityEditText.setErrorMessageListener(new ErrorListener(this.cityTextInputLayout));
        this.nameEditText.setErrorMessageListener(new ErrorListener(this.nameTextInputLayout));
        this.postalCodeEditText.setErrorMessageListener(new ErrorListener(this.postalCodeTextInputLayout));
        this.stateEditText.setErrorMessageListener(new ErrorListener(this.stateTextInputLayout));
        this.phoneNumberEditText.setErrorMessageListener(new ErrorListener(this.phoneNumberTextInputLayout));
        this.addressEditText.setErrorMessage(getResources().getString(C18606R.string.address_required));
        this.cityEditText.setErrorMessage(getResources().getString(C18606R.string.address_city_required));
        this.nameEditText.setErrorMessage(getResources().getString(C18606R.string.address_name_required));
        this.phoneNumberEditText.setErrorMessage(getResources().getString(C18606R.string.address_phone_number_required));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfigForCountry(Country country) {
        int i;
        String value = country.getCode().getValue();
        if (Intrinsics.areEqual(value, Locale.US.getCountry())) {
            renderUSForm();
        } else if (Intrinsics.areEqual(value, Locale.UK.getCountry())) {
            renderGreatBritainForm();
        } else if (Intrinsics.areEqual(value, Locale.CANADA.getCountry())) {
            renderCanadianForm();
        } else {
            renderInternationalForm();
        }
        updatePostalCodeInputFilter(country);
        TextInputLayout textInputLayout = this.postalCodeTextInputLayout;
        if (CountryUtils.INSTANCE.doesCountryUsePostalCode(country.getCode()) && !isFieldHidden(CustomizableShippingField.PostalCode)) {
            i = 0;
        } else {
            i = 8;
        }
        textInputLayout.setVisibility(i);
    }

    private final void updatePostalCodeInputFilter(Country country) {
        this.postalCodeEditText.setFilters(Intrinsics.areEqual(country.getCode().getValue(), Locale.CANADA.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
    }

    public final List<CustomizableShippingField> getHiddenFields() {
        return this.hiddenFields;
    }

    public final List<CustomizableShippingField> getOptionalFields() {
        return this.optionalFields;
    }

    public final ShippingInformation getShippingInformation() {
        if (!validateAllFields()) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void populateShippingInfo(ShippingInformation shippingInformation) {
        if (shippingInformation == null) {
            return;
        }
        Address address = shippingInformation.getAddress();
        if (address != null) {
            populateAddressFields(address);
        }
        this.nameEditText.setText(shippingInformation.getName());
        this.phoneNumberEditText.setText(shippingInformation.getPhone());
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        this.countryAutoCompleteTextView.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends CustomizableShippingField> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.hiddenFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends CustomizableShippingField> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.optionalFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    public final boolean validateAllFields() {
        String obj;
        Editable text;
        String obj2;
        Editable text2;
        String obj3;
        Editable text3;
        String obj4;
        Editable text4;
        String obj5;
        Editable text5;
        String obj6;
        String str;
        boolean isBlank;
        boolean z;
        boolean isBlank2;
        boolean z2;
        boolean isBlank3;
        boolean isBlank4;
        boolean z3;
        boolean isBlank5;
        boolean z4;
        CountryCode code;
        Editable text6 = this.addressEditText.getText();
        if (text6 == null || (obj = text6.toString()) == null || (text = this.nameEditText.getText()) == null || (obj2 = text.toString()) == null || (text2 = this.cityEditText.getText()) == null || (obj3 = text2.toString()) == null || (text3 = this.stateEditText.getText()) == null || (obj4 = text3.toString()) == null || (text4 = this.postalCodeEditText.getText()) == null || (obj5 = text4.toString()) == null || (text5 = this.phoneNumberEditText.getText()) == null || (obj6 = text5.toString()) == null) {
            return false;
        }
        this.countryAutoCompleteTextView.validateCountry$payments_core_release();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        PostalCodeValidator postalCodeValidator = this.postalCodeValidator;
        if (selectedCountry$payments_core_release != null && (code = selectedCountry$payments_core_release.getCode()) != null) {
            str = code.getValue();
        } else {
            str = null;
        }
        boolean isValid$payments_core_release = postalCodeValidator.isValid$payments_core_release(obj5, str, this.optionalFields, this.hiddenFields);
        this.postalCodeEditText.setShouldShowError(!isValid$payments_core_release);
        isBlank = StringsKt__StringsJVMKt.isBlank(obj);
        if (isBlank && isFieldRequired(CustomizableShippingField.Line1)) {
            z = true;
        } else {
            z = false;
        }
        this.addressEditText.setShouldShowError(z);
        isBlank2 = StringsKt__StringsJVMKt.isBlank(obj3);
        if (isBlank2 && isFieldRequired(CustomizableShippingField.City)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.cityEditText.setShouldShowError(z2);
        isBlank3 = StringsKt__StringsJVMKt.isBlank(obj2);
        this.nameEditText.setShouldShowError(isBlank3);
        isBlank4 = StringsKt__StringsJVMKt.isBlank(obj4);
        if (isBlank4 && isFieldRequired(CustomizableShippingField.State)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.stateEditText.setShouldShowError(z3);
        isBlank5 = StringsKt__StringsJVMKt.isBlank(obj6);
        if (isBlank5 && isFieldRequired(CustomizableShippingField.Phone)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.phoneNumberEditText.setShouldShowError(z4);
        if (!isValid$payments_core_release || z || z2 || z3 || isBlank3 || z4 || selectedCountry$payments_core_release == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        List<? extends CustomizableShippingField> emptyList;
        List<? extends CustomizableShippingField> emptyList2;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new ShippingInfoWidget$viewBinding$2(context, this));
        this.viewBinding$delegate = lazy;
        this.postalCodeValidator = new PostalCodeValidator();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.optionalFields = emptyList;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        this.hiddenFields = emptyList2;
        CountryTextInputLayout countryTextInputLayout = getViewBinding().countryAutocompleteAaw;
        Intrinsics.checkNotNullExpressionValue(countryTextInputLayout, "viewBinding.countryAutocompleteAaw");
        this.countryAutoCompleteTextView = countryTextInputLayout;
        TextInputLayout textInputLayout = getViewBinding().tlAddressLine1Aaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewBinding.tlAddressLine1Aaw");
        this.addressLine1TextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = getViewBinding().tlAddressLine2Aaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewBinding.tlAddressLine2Aaw");
        this.addressLine2TextInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = getViewBinding().tlCityAaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "viewBinding.tlCityAaw");
        this.cityTextInputLayout = textInputLayout3;
        TextInputLayout textInputLayout4 = getViewBinding().tlNameAaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "viewBinding.tlNameAaw");
        this.nameTextInputLayout = textInputLayout4;
        TextInputLayout textInputLayout5 = getViewBinding().tlPostalCodeAaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "viewBinding.tlPostalCodeAaw");
        this.postalCodeTextInputLayout = textInputLayout5;
        TextInputLayout textInputLayout6 = getViewBinding().tlStateAaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "viewBinding.tlStateAaw");
        this.stateTextInputLayout = textInputLayout6;
        TextInputLayout textInputLayout7 = getViewBinding().tlPhoneNumberAaw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout7, "viewBinding.tlPhoneNumberAaw");
        this.phoneNumberTextInputLayout = textInputLayout7;
        StripeEditText stripeEditText = getViewBinding().etAddressLineOneAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText, "viewBinding.etAddressLineOneAaw");
        this.addressEditText = stripeEditText;
        StripeEditText stripeEditText2 = getViewBinding().etAddressLineTwoAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText2, "viewBinding.etAddressLineTwoAaw");
        this.addressEditText2 = stripeEditText2;
        StripeEditText stripeEditText3 = getViewBinding().etCityAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText3, "viewBinding.etCityAaw");
        this.cityEditText = stripeEditText3;
        StripeEditText stripeEditText4 = getViewBinding().etNameAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText4, "viewBinding.etNameAaw");
        this.nameEditText = stripeEditText4;
        StripeEditText stripeEditText5 = getViewBinding().etPostalCodeAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText5, "viewBinding.etPostalCodeAaw");
        this.postalCodeEditText = stripeEditText5;
        StripeEditText stripeEditText6 = getViewBinding().etStateAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText6, "viewBinding.etStateAaw");
        this.stateEditText = stripeEditText6;
        StripeEditText stripeEditText7 = getViewBinding().etPhoneNumberAaw;
        Intrinsics.checkNotNullExpressionValue(stripeEditText7, "viewBinding.etPhoneNumberAaw");
        this.phoneNumberEditText = stripeEditText7;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            stripeEditText4.setAutofillHints(new String[]{"name"});
            textInputLayout.setAutofillHints(new String[]{"postalAddress"});
            stripeEditText5.setAutofillHints(new String[]{"postalCode"});
            stripeEditText7.setAutofillHints(new String[]{PaymentMethod.BillingDetails.PARAM_PHONE});
        }
        initView();
    }
}
