package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.databinding.StripeCardFormViewBinding;
import com.stripe.android.databinding.StripeHorizontalDividerBinding;
import com.stripe.android.databinding.StripeVerticalDividerBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.CardFormView;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001d\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002QRB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020>H\u0002J\u001a\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020'2\b\u0010A\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010B\u001a\u00020;2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\b\u0010E\u001a\u00020DH\u0014J\u0010\u0010F\u001a\u00020;2\b\u0010G\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020>H\u0016J\b\u0010J\u001a\u00020;H\u0002J\b\u0010K\u001a\u00020;H\u0002J\b\u0010L\u001a\u00020;H\u0002J\u0012\u0010M\u001a\u00020;2\b\u0010A\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010N\u001a\u00020;2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\n /*\u0004\u0018\u00010.0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, m28432d2 = {"Lcom/stripe/android/view/CardFormView;", "Landroid/widget/LinearLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allEditTextFields", "", "Lcom/stripe/android/view/StripeEditText;", "getAllEditTextFields", "()Ljava/util/Collection;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "cardContainer", "Lcom/google/android/material/card/MaterialCardView;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "com/stripe/android/view/CardFormView$cardValidTextWatcher$1", "Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;", "countryLayout", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryPostalDivider", "Landroid/view/View;", "errors", "Landroid/widget/TextView;", "errorsMap", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "", "invalidFields", "", "getInvalidFields", "()Ljava/util/Set;", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "postalCodeContainer", "Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeView", "Lcom/stripe/android/view/PostalCodeEditText;", "style", "Lcom/stripe/android/view/CardFormView$Style;", "viewBinding", "Lcom/stripe/android/databinding/StripeCardFormViewBinding;", "applyBorderlessStyle", "", "applyStandardStyle", "isPostalValid", "", "onFieldError", "field", "errorMessage", "onRestoreInstanceState", TransferTable.COLUMN_STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "setCardValidCallback", "callback", "setEnabled", "enabled", "setupCardWidget", "setupCountryAndPostal", "showPostalError", "updateErrorsView", "updatePostalCodeViewLocale", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "Companion", "Style", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,472:1\n52#2,9:473\n1#3:482\n1855#4,2:483\n1855#4,2:485\n1855#4,2:513\n1855#4:541\n1856#4:546\n288#4,2:553\n58#5,23:487\n93#5,3:510\n58#5,23:515\n93#5,3:538\n329#6,4:542\n262#6,2:547\n262#6,2:555\n11335#7:549\n11670#7,3:550\n*S KotlinDebug\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView\n*L\n160#1:473,9\n184#1:483,2\n188#1:485,2\n265#1:513,2\n307#1:541\n307#1:546\n456#1:553,2\n216#1:487,23\n216#1:510,3\n293#1:515,23\n293#1:538,3\n308#1:542,4\n442#1:547,2\n463#1:555,2\n455#1:549\n455#1:550,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CardFormView extends LinearLayout {
    public static final String CARD_FORM_VIEW = "CardFormView";
    private static final String STATE_ENABLED = "state_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final MaterialCardView cardContainer;
    private final CardMultilineWidget cardMultilineWidget;
    private CardValidCallback cardValidCallback;
    private final CardFormView$cardValidTextWatcher$1 cardValidTextWatcher;
    private final CountryTextInputLayout countryLayout;
    private final View countryPostalDivider;
    private final TextView errors;
    private final Map<CardValidCallback.Fields, String> errorsMap;
    private final LayoutInflater layoutInflater;
    private final TextInputLayout postalCodeContainer;
    private final PostalCodeValidator postalCodeValidator;
    private final PostalCodeEditText postalCodeView;
    private Style style;
    private final StripeCardFormViewBinding viewBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/CardFormView$Companion;", "", "()V", "CARD_FORM_VIEW", "", "STATE_ENABLED", "STATE_SUPER_STATE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/CardFormView$Style;", "", "attrValue", "", "(Ljava/lang/String;II)V", "getAttrValue$payments_core_release", "()I", "Standard", "Borderless", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Style {
        Standard(0),
        Borderless(1);
        
        private final int attrValue;

        Style(int i) {
            this.attrValue = i;
        }

        public final int getAttrValue$payments_core_release() {
            return this.attrValue;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.Borderless.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardFormView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyBorderlessStyle() {
        this.cardMultilineWidget.getCardNumberTextInputLayout().addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false).getRoot(), 1);
        this.cardMultilineWidget.getExpiryTextInputLayout().addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false).getRoot(), 1);
        this.cardMultilineWidget.getCvcInputLayout().addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false).getRoot(), 1);
        CountryTextInputLayout countryTextInputLayout = this.countryLayout;
        countryTextInputLayout.addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, countryTextInputLayout, false).getRoot());
        this.countryPostalDivider.setVisibility(8);
        this.cardContainer.setCardElevation(0.0f);
    }

    private final void applyStandardStyle() {
        CardMultilineWidget cardMultilineWidget = this.cardMultilineWidget;
        cardMultilineWidget.addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, cardMultilineWidget, false).getRoot(), 1);
        this.cardMultilineWidget.getSecondRowLayout().addView(StripeVerticalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget.getSecondRowLayout(), false).getRoot(), 1);
        CardMultilineWidget cardMultilineWidget2 = this.cardMultilineWidget;
        cardMultilineWidget2.addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, cardMultilineWidget2, false).getRoot(), this.cardMultilineWidget.getChildCount());
        this.cardContainer.setCardElevation(getResources().getDimension(C18606R.dimen.stripe_card_form_view_card_elevation));
    }

    private final Collection<StripeEditText> getAllEditTextFields() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new StripeEditText[]{this.cardMultilineWidget.getCardNumberEditText(), this.cardMultilineWidget.getExpiryDateEditText(), this.cardMultilineWidget.getCvcEditText(), this.postalCodeView});
        return listOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<CardValidCallback.Fields> getInvalidFields() {
        List list;
        List listOfNotNull;
        List plus;
        Set<CardValidCallback.Fields> set;
        list = CollectionsKt___CollectionsKt.toList(this.cardMultilineWidget.getInvalidFields$payments_core_release());
        List list2 = list;
        CardValidCallback.Fields fields = CardValidCallback.Fields.Postal;
        if (!(!isPostalValid())) {
            fields = null;
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(fields);
        plus = CollectionsKt___CollectionsKt.plus((Collection) list2, (Iterable) listOfNotNull);
        set = CollectionsKt___CollectionsKt.toSet(plus);
        return set;
    }

    private final boolean isPostalValid() {
        CountryCode selectedCountryCode$payments_core_release = this.countryLayout.getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            PostalCodeValidator postalCodeValidator = this.postalCodeValidator;
            String postalCode$payments_core_release = this.postalCodeView.getPostalCode$payments_core_release();
            if (postalCode$payments_core_release == null) {
                postalCode$payments_core_release = "";
            }
            return postalCodeValidator.isValid(postalCode$payments_core_release, selectedCountryCode$payments_core_release.getValue());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[EDGE_INSN: B:22:0x0047->B:19:0x0047 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFieldError(CardValidCallback.Fields fields, String str) {
        Object obj;
        boolean z;
        boolean isBlank;
        this.errorsMap.put(fields, str);
        CardValidCallback.Fields[] values = CardValidCallback.Fields.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (CardValidCallback.Fields fields2 : values) {
            arrayList.add(this.errorsMap.get(fields2));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = (String) obj;
                if (str2 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                    if (!isBlank) {
                        z = false;
                        if (!z) {
                            break;
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            } else {
                obj = null;
                break;
            }
        }
        updateErrorsView((String) obj);
    }

    private final void setupCardWidget() {
        Set<StripeEditText> of;
        Set<TextInputLayout> of2;
        of = SetsKt__SetsKt.setOf((Object[]) new StripeEditText[]{this.cardMultilineWidget.getCardNumberEditText(), this.cardMultilineWidget.getExpiryDateEditText(), this.cardMultilineWidget.getCvcEditText()});
        for (StripeEditText stripeEditText : of) {
            stripeEditText.setTextSize(0, getResources().getDimension(C18606R.dimen.stripe_card_form_view_textsize));
            stripeEditText.setTextColor(NA0.m94300d(getContext(), C18606R.color.stripe_card_form_view_text_color));
            stripeEditText.setBackgroundResource(17170445);
            stripeEditText.setErrorColor(NA0.m94301c(getContext(), C18606R.color.stripe_card_form_view_form_error));
        }
        this.cardMultilineWidget.getExpiryDateEditText().setIncludeSeparatorGaps$payments_core_release(true);
        this.cardMultilineWidget.setExpirationDatePlaceholderRes$payments_core_release(null);
        this.cardMultilineWidget.getExpiryTextInputLayout().setHint(getContext().getString(C18606R.string.stripe_paymentsheet_expiration_date_hint));
        this.cardMultilineWidget.getCardNumberTextInputLayout().setPlaceholderText(null);
        this.cardMultilineWidget.setCvcPlaceholderText("");
        this.cardMultilineWidget.getCvcEditText().setImeOptions(5);
        this.cardMultilineWidget.setBackgroundResource(C18606R.C18607drawable.stripe_card_form_view_text_input_layout_background);
        this.cardMultilineWidget.getCvcEditText().addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextInputLayout textInputLayout;
                boolean z;
                CardMultilineWidget cardMultilineWidget;
                PostalCodeEditText postalCodeEditText;
                textInputLayout = CardFormView.this.postalCodeContainer;
                if (textInputLayout.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    cardMultilineWidget = CardFormView.this.cardMultilineWidget;
                    if (cardMultilineWidget.getBrand().isMaxCvc(String.valueOf(editable))) {
                        postalCodeEditText = CardFormView.this.postalCodeView;
                        postalCodeEditText.requestFocus();
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        int dimensionPixelSize = getResources().getDimensionPixelSize(C18606R.dimen.stripe_card_form_view_text_margin_horizontal);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C18606R.dimen.stripe_card_form_view_text_margin_vertical);
        of2 = SetsKt__SetsKt.setOf((Object[]) new TextInputLayout[]{this.cardMultilineWidget.getCardNumberTextInputLayout(), this.cardMultilineWidget.getExpiryTextInputLayout(), this.cardMultilineWidget.getCvcInputLayout()});
        for (TextInputLayout textInputLayout : of2) {
            ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(dimensionPixelSize);
                layoutParams2.setMarginEnd(dimensionPixelSize);
                layoutParams2.topMargin = dimensionPixelSize2;
                layoutParams2.bottomMargin = dimensionPixelSize2;
                textInputLayout.setLayoutParams(layoutParams2);
                textInputLayout.setErrorEnabled(false);
                textInputLayout.setError(null);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        this.cardMultilineWidget.setCvcIcon(Integer.valueOf(C18606R.C18607drawable.stripe_ic_cvc));
        this.cardMultilineWidget.setCardNumberErrorListener$payments_core_release(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$4
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.this.onFieldError(CardValidCallback.Fields.Number, str);
            }
        });
        this.cardMultilineWidget.setExpirationDateErrorListener$payments_core_release(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$5
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.this.onFieldError(CardValidCallback.Fields.Expiry, str);
            }
        });
        this.cardMultilineWidget.setCvcErrorListener$payments_core_release(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$6
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.this.onFieldError(CardValidCallback.Fields.Cvc, str);
            }
        });
        this.cardMultilineWidget.setPostalCodeErrorListener$payments_core_release(null);
    }

    private final void setupCountryAndPostal() {
        updatePostalCodeViewLocale(this.countryLayout.getSelectedCountryCode$payments_core_release());
        this.postalCodeView.setErrorColor(NA0.m94301c(getContext(), C18606R.color.stripe_card_form_view_form_error));
        this.postalCodeView.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Gf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFormView.setupCountryAndPostal$lambda$5(CardFormView.this, view, z);
            }
        });
        this.postalCodeView.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardFormView.this.onFieldError(CardValidCallback.Fields.Postal, null);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.postalCodeView.setErrorMessageListener(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCountryAndPostal$3
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.this.onFieldError(CardValidCallback.Fields.Postal, str);
            }
        });
        this.countryLayout.setCountryCodeChangeCallback(new CardFormView$setupCountryAndPostal$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCountryAndPostal$lambda$5(CardFormView this$0, View view, boolean z) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            PostalCodeEditText postalCodeEditText = this$0.postalCodeView;
            isBlank = StringsKt__StringsJVMKt.isBlank(postalCodeEditText.getFieldText$payments_core_release());
            boolean z2 = true;
            postalCodeEditText.setShouldShowError((!(isBlank ^ true) || this$0.isPostalValid()) ? false : false);
            if (this$0.postalCodeView.getShouldShowError()) {
                this$0.showPostalError();
            } else {
                this$0.onFieldError(CardValidCallback.Fields.Postal, null);
            }
        }
    }

    private final void showPostalError() {
        onFieldError(CardValidCallback.Fields.Postal, this.postalCodeView.getErrorMessage$payments_core_release());
    }

    private final void updateErrorsView(String str) {
        boolean z;
        this.errors.setText(str);
        TextView textView = this.errors;
        int i = 0;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePostalCodeViewLocale(CountryCode countryCode) {
        if (CountryCode.Companion.isUS(countryCode)) {
            this.postalCodeView.setConfig$payments_core_release(PostalCodeEditText.Config.US);
            this.postalCodeView.setErrorMessage(getResources().getString(C18606R.string.address_zip_invalid));
            return;
        }
        this.postalCodeView.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.postalCodeView.setErrorMessage(getResources().getString(C18606R.string.address_postal_code_invalid));
    }

    public final CardBrand getBrand() {
        return this.cardMultilineWidget.getBrand();
    }

    public final CardParams getCardParams() {
        Set of;
        String str;
        String str2;
        String str3 = null;
        if (!this.cardMultilineWidget.validateAllFields()) {
            this.cardMultilineWidget.setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        this.cardMultilineWidget.setShouldShowErrorIcon$payments_core_release(false);
        if (!isPostalValid()) {
            showPostalError();
            return null;
        }
        updateErrorsView(null);
        ExpirationDate.Validated validatedDate = this.cardMultilineWidget.getExpiryDateEditText().getValidatedDate();
        if (validatedDate != null) {
            CardBrand brand = this.cardMultilineWidget.getBrand();
            of = SetsKt__SetsJVMKt.setOf(CARD_FORM_VIEW);
            CardNumber.Validated validatedCardNumber$payments_core_release = this.cardMultilineWidget.getValidatedCardNumber$payments_core_release();
            if (validatedCardNumber$payments_core_release != null) {
                str = validatedCardNumber$payments_core_release.getValue();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str4 = str;
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            Editable text = this.cardMultilineWidget.getCvcEditText().getText();
            if (text != null) {
                str2 = text.toString();
            } else {
                str2 = null;
            }
            Address.Builder countryCode = new Address.Builder().setCountryCode(this.countryLayout.getSelectedCountryCode$payments_core_release());
            Editable text2 = this.postalCodeView.getText();
            if (text2 != null) {
                str3 = text2.toString();
            }
            return new CardParams(brand, of, str4, month, year, str2, null, countryCode.setPostalCode(str3).build(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            setEnabled(bundle.getBoolean(STATE_ENABLED));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return C39564d70.m44603a(TuplesKt.m28425to(STATE_SUPER_STATE, super.onSaveInstanceState()), TuplesKt.m28425to(STATE_ENABLED, Boolean.valueOf(isEnabled())));
    }

    public final void setCardValidCallback(CardValidCallback cardValidCallback) {
        this.cardValidCallback = cardValidCallback;
        for (StripeEditText stripeEditText : getAllEditTextFields()) {
            stripeEditText.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback != null) {
            for (StripeEditText stripeEditText2 : getAllEditTextFields()) {
                stripeEditText2.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback2 = this.cardValidCallback;
        if (cardValidCallback2 != null) {
            cardValidCallback2.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.cardContainer.setEnabled(z);
        this.cardMultilineWidget.setEnabled(z);
        this.countryLayout.setEnabled(z);
        this.postalCodeContainer.setEnabled(z);
        this.errors.setEnabled(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardFormView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.stripe.android.view.CardFormView$cardValidTextWatcher$1] */
    @JvmOverloads
    public CardFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        this.layoutInflater = from;
        StripeCardFormViewBinding inflate = StripeCardFormViewBinding.inflate(from, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, this)");
        this.viewBinding = inflate;
        MaterialCardView materialCardView = inflate.cardMultilineWidgetContainer;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "viewBinding.cardMultilineWidgetContainer");
        this.cardContainer = materialCardView;
        CardMultilineWidget cardMultilineWidget = inflate.cardMultilineWidget;
        Intrinsics.checkNotNullExpressionValue(cardMultilineWidget, "viewBinding.cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget;
        View view = inflate.countryPostalDivider;
        Intrinsics.checkNotNullExpressionValue(view, "viewBinding.countryPostalDivider");
        this.countryPostalDivider = view;
        TextInputLayout textInputLayout = inflate.postalCodeContainer;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewBinding.postalCodeContainer");
        this.postalCodeContainer = textInputLayout;
        TextView textView = inflate.errors;
        Intrinsics.checkNotNullExpressionValue(textView, "viewBinding.errors");
        this.errors = textView;
        PostalCodeEditText postalCodeEditText = inflate.postalCode;
        Intrinsics.checkNotNullExpressionValue(postalCodeEditText, "viewBinding.postalCode");
        this.postalCodeView = postalCodeEditText;
        CountryTextInputLayout countryTextInputLayout = inflate.countryLayout;
        Intrinsics.checkNotNullExpressionValue(countryTextInputLayout, "viewBinding.countryLayout");
        this.countryLayout = countryTextInputLayout;
        this.postalCodeValidator = new PostalCodeValidator();
        this.style = Style.Standard;
        this.errorsMap = new LinkedHashMap();
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardFormView$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardValidCallback cardValidCallback;
                Set invalidFields;
                Set<? extends CardValidCallback.Fields> invalidFields2;
                super.afterTextChanged(editable);
                cardValidCallback = CardFormView.this.cardValidCallback;
                if (cardValidCallback != null) {
                    invalidFields = CardFormView.this.getInvalidFields();
                    boolean isEmpty = invalidFields.isEmpty();
                    invalidFields2 = CardFormView.this.getInvalidFields();
                    cardValidCallback.onInputChanged(isEmpty, invalidFields2);
                }
            }
        };
        setOrientation(1);
        setupCountryAndPostal();
        setupCardWidget();
        int[] StripeCardFormView = C18606R.styleable.StripeCardFormView;
        Intrinsics.checkNotNullExpressionValue(StripeCardFormView, "StripeCardFormView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCardFormView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C18606R.styleable.StripeCardFormView_backgroundColorStateList);
        this.style = Style.values()[obtainStyledAttributes.getInt(C18606R.styleable.StripeCardFormView_cardFormStyle, 0)];
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            materialCardView.setCardBackgroundColor(colorStateList);
            cardMultilineWidget.setBackgroundColor(0);
            countryTextInputLayout.setBackgroundColor(0);
            textInputLayout.setBackgroundColor(0);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i2 == 1) {
            applyStandardStyle();
        } else if (i2 != 2) {
        } else {
            applyBorderlessStyle();
        }
    }
}
