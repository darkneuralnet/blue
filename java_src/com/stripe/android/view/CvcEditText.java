package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.cards.Cvc;
import com.stripe.android.model.CardBrand;
import com.stripe.android.view.CvcEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010!J9\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0002\b'R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m28432d2 = {"Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/StripeEditText;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "completionCallback", "Lkotlin/Function0;", "", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "cvc", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc$payments_core_release", "()Lcom/stripe/android/cards/Cvc$Validated;", "unvalidatedCvc", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "getUnvalidatedCvc", "()Lcom/stripe/android/cards/Cvc$Unvalidated;", "createFilters", "", "Landroid/text/InputFilter;", "(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;", "updateBrand", "customHintText", "customPlaceholderText", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "updateBrand$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCvcEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcEditText.kt\ncom/stripe/android/view/CvcEditText\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,123:1\n58#2,23:124\n93#2,3:147\n*S KotlinDebug\n*F\n+ 1 CvcEditText.kt\ncom/stripe/android/view/CvcEditText\n*L\n51#1:124,23\n51#1:147,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CvcEditText extends StripeEditText {
    public static final int $stable = 8;
    private CardBrand cardBrand;
    private /* synthetic */ Function0<Unit> completionCallback;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CvcEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void _init_$lambda$1(CvcEditText this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z && this$0.getUnvalidatedCvc().isPartialEntry(this$0.cardBrand.getMaxCvcLength())) {
            this$0.setShouldShowError(true);
        }
    }

    private final InputFilter[] createFilters(CardBrand cardBrand) {
        return new InputFilter[]{new InputFilter.LengthFilter(cardBrand.getMaxCvcLength())};
    }

    public final Cvc.Unvalidated getUnvalidatedCvc() {
        return new Cvc.Unvalidated(getFieldText$payments_core_release());
    }

    public static /* synthetic */ void updateBrand$payments_core_release$default(CvcEditText cvcEditText, CardBrand cardBrand, String str, String str2, TextInputLayout textInputLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            textInputLayout = null;
        }
        cvcEditText.updateBrand$payments_core_release(cardBrand, str, str2, textInputLayout);
    }

    @Override // com.stripe.android.view.StripeEditText
    public String getAccessibilityText() {
        String string = getResources().getString(C18606R.string.acc_label_cvc_node, getText());
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…acc_label_cvc_node, text)");
        return string;
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final Cvc.Validated getCvc$payments_core_release() {
        return getUnvalidatedCvc().validate(this.cardBrand.getMaxCvcLength());
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    public final /* synthetic */ void updateBrand$payments_core_release(CardBrand cardBrand, String str, String str2, TextInputLayout textInputLayout) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        this.cardBrand = cardBrand;
        setFilters(createFilters(cardBrand));
        if (str == null) {
            if (cardBrand == CardBrand.AmericanExpress) {
                str = getResources().getString(C18606R.string.cvc_amex_hint);
            } else {
                str = getResources().getString(C18606R.string.cvc_number_hint);
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (cardBrand == CardBra…umber_hint)\n            }");
        }
        boolean z2 = false;
        if (getUnvalidatedCvc().getNormalized$payments_core_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (getUnvalidatedCvc().validate(cardBrand.getMaxCvcLength()) == null) {
                z2 = true;
            }
            setShouldShowError(z2);
        }
        if (textInputLayout != null) {
            textInputLayout.setHint(str);
            if (str2 == null) {
                Resources resources = getResources();
                if (WhenMappings.$EnumSwitchMapping$0[cardBrand.ordinal()] == 1) {
                    i = C18606R.string.cvc_multiline_helper_amex;
                } else {
                    i = C18606R.string.cvc_multiline_helper;
                }
                str2 = resources.getString(i);
            }
            textInputLayout.setPlaceholderText(str2);
            return;
        }
        setHint(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CvcEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        CardBrand cardBrand = CardBrand.Unknown;
        this.cardBrand = cardBrand;
        this.completionCallback = CvcEditText$completionCallback$1.INSTANCE;
        setErrorMessage(getResources().getString(C18606R.string.invalid_cvc));
        setHint(C18606R.string.cvc_number_hint);
        setMaxLines(1);
        setFilters(createFilters(cardBrand));
        setNumberOnlyInputType();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardSecurityCode"});
        }
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CvcEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardBrand cardBrand2;
                Cvc.Unvalidated unvalidatedCvc;
                CvcEditText.this.setShouldShowError(false);
                cardBrand2 = CvcEditText.this.cardBrand;
                unvalidatedCvc = CvcEditText.this.getUnvalidatedCvc();
                if (cardBrand2.isMaxCvc(unvalidatedCvc.getNormalized$payments_core_release())) {
                    CvcEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: GF0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CvcEditText._init_$lambda$1(CvcEditText.this, view, z);
            }
        });
        setLayoutDirection(0);
    }
}
