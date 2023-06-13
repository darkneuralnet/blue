package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.view.ExpiryDateEditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0016H\u0007J#\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b,\u0010-J-\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0001¢\u0006\u0002\b3J\u0012\u00104\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00066"}, m28432d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "completionCallback", "Lkotlin/Function0;", "", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "dateDigitsLength", "<set-?>", "", "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release", "()Z", "setIncludeSeparatorGaps$payments_core_release", "(Z)V", "includeSeparatorGaps$delegate", "Lkotlin/properties/ReadWriteProperty;", "isDateValid", "separator", "validatedDate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getValidatedDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "month", "year", "listenForTextChanges", "setIncludeSeparatorGaps", "include", "setText", "expiryMonth", "expiryYear", "setText$payments_core_release", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateSelectionIndex", "newLength", "editActionStart", "editActionAddition", "maxInputLength", "updateSelectionIndex$payments_core_release", "updateSeparatorUi", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nExpiryDateEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpiryDateEditText.kt\ncom/stripe/android/view/ExpiryDateEditText\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,326:1\n33#2,3:327\n37#3,2:330\n*S KotlinDebug\n*F\n+ 1 ExpiryDateEditText.kt\ncom/stripe/android/view/ExpiryDateEditText\n*L\n55#1:327,3\n96#1:330,2\n*E\n"})
/* loaded from: classes7.dex */
public final class ExpiryDateEditText extends StripeEditText {
    @Deprecated
    private static final boolean INCLUDE_SEPARATOR_GAPS_DEFAULT = false;
    @Deprecated
    private static final int INVALID_INPUT = -1;
    @Deprecated
    private static final String SEPARATOR_WITHOUT_GAPS = "/";
    @Deprecated
    private static final String SEPARATOR_WITH_GAPS = " / ";
    private /* synthetic */ Function0<Unit> completionCallback;
    private final int dateDigitsLength;
    private final ReadWriteProperty includeSeparatorGaps$delegate;
    private boolean isDateValid;
    private String separator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/view/ExpiryDateEditText$Companion;", "", "()V", "INCLUDE_SEPARATOR_GAPS_DEFAULT", "", "INVALID_INPUT", "", "SEPARATOR_WITHOUT_GAPS", "", "SEPARATOR_WITH_GAPS", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpiryDateEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ExpiryDateEditText this$0, View view, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            Editable text = this$0.getText();
            if (text != null && text.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && !this$0.isDateValid) {
                this$0.setShouldShowError(true);
            }
        }
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.ExpiryDateEditText$listenForTextChanges$1
            private ExpirationDate.Unvalidated expirationDate = ExpirationDate.Unvalidated.Companion.getEMPTY();
            private String formattedDate;
            private int latestChangeStart;
            private int latestInsertionSize;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                boolean z;
                int i;
                boolean isDateValid;
                int coerceIn;
                String str = this.formattedDate;
                boolean z2 = false;
                if (str != null) {
                    ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                        coerceIn = RangesKt___RangesKt.coerceIn(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length());
                        expiryDateEditText.setSelection(coerceIn);
                    }
                }
                String month = this.expirationDate.getMonth();
                String year = this.expirationDate.getYear();
                if (month.length() == 2 && !this.expirationDate.isMonthValid()) {
                    z = true;
                } else {
                    z = false;
                }
                if (month.length() == 2 && year.length() == 2) {
                    boolean isDateValid2 = ExpiryDateEditText.this.isDateValid();
                    ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                    isDateValid = expiryDateEditText2.isDateValid(month, year);
                    expiryDateEditText2.isDateValid = isDateValid;
                    boolean z3 = !ExpiryDateEditText.this.isDateValid();
                    if (!isDateValid2 && ExpiryDateEditText.this.isDateValid()) {
                        ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                    }
                    z = z3;
                } else {
                    ExpiryDateEditText.this.isDateValid = false;
                }
                ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
                Resources resources = expiryDateEditText3.getResources();
                if (this.expirationDate.isPartialEntry$payments_core_release()) {
                    i = C18606R.string.incomplete_expiry_date;
                } else if (!this.expirationDate.isMonthValid()) {
                    i = C18606R.string.invalid_expiry_month;
                } else {
                    i = C18606R.string.invalid_expiry_year;
                }
                expiryDateEditText3.setErrorMessage(resources.getString(i));
                ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
                if (z && (this.expirationDate.isPartialEntry$payments_core_release() || this.expirationDate.isComplete$payments_core_release())) {
                    z2 = true;
                }
                expiryDateEditText4.setShouldShowError(z2);
                this.formattedDate = null;
                this.newCursorPosition = null;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.latestChangeStart = i;
                this.latestInsertionSize = i3;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String str;
                int i4;
                String str2;
                String str3;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = str.charAt(i5);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
                if (sb2.length() == 1 && this.latestChangeStart == 0 && this.latestInsertionSize == 1) {
                    char charAt2 = sb2.charAt(0);
                    if (charAt2 != '0' && charAt2 != '1') {
                        sb2 = "0" + sb2;
                        this.latestInsertionSize++;
                    }
                } else if (sb2.length() == 2 && this.latestChangeStart == 2 && this.latestInsertionSize == 0) {
                    sb2 = sb2.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(sb2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                ExpirationDate.Unvalidated create = ExpirationDate.Unvalidated.Companion.create(sb2);
                this.expirationDate = create;
                boolean z = !create.isMonthValid();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(create.getMonth());
                if ((create.getMonth().length() == 2 && this.latestInsertionSize > 0 && !z) || sb2.length() > 2) {
                    str3 = ExpiryDateEditText.this.separator;
                    sb3.append(str3);
                }
                sb3.append(create.getYear());
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "formattedDateBuilder.toString()");
                ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                int length2 = sb4.length();
                int i6 = this.latestChangeStart;
                int i7 = this.latestInsertionSize;
                i4 = ExpiryDateEditText.this.dateDigitsLength;
                str2 = ExpiryDateEditText.this.separator;
                this.newCursorPosition = Integer.valueOf(expiryDateEditText.updateSelectionIndex$payments_core_release(length2, i6, i7, i4 + str2.length()));
                this.formattedDate = sb4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSeparatorUi(boolean z) {
        String str;
        List listOf;
        if (z) {
            str = SEPARATOR_WITH_GAPS;
        } else {
            str = SEPARATOR_WITHOUT_GAPS;
        }
        this.separator = str;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new InputFilter.LengthFilter(this.dateDigitsLength + this.separator.length()));
        setFilters((InputFilter[]) listOf.toArray(new InputFilter.LengthFilter[0]));
    }

    public static /* synthetic */ void updateSeparatorUi$default(ExpiryDateEditText expiryDateEditText, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        expiryDateEditText.updateSeparatorUi(z);
    }

    @Override // com.stripe.android.view.StripeEditText
    public String getAccessibilityText() {
        String string = getResources().getString(C18606R.string.acc_label_expiry_date_node, getText());
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…l_expiry_date_node, text)");
        return string;
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.includeSeparatorGaps$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final ExpirationDate.Validated getValidatedDate() {
        boolean z = this.isDateValid;
        if (z) {
            return ExpirationDate.Unvalidated.Companion.create(getFieldText$payments_core_release()).validate();
        }
        if (!z) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isDateValid() {
        return this.isDateValid;
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    public final void setIncludeSeparatorGaps(boolean z) {
        setIncludeSeparatorGaps$payments_core_release(z);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z) {
        this.includeSeparatorGaps$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setText$payments_core_release(Integer num, Integer num2) {
        String padStart;
        String takeLast;
        String padStart2;
        List listOf;
        String joinToString$default;
        if (num != null && num2 != null) {
            padStart = StringsKt__StringsKt.padStart(num.toString(), 2, '0');
            takeLast = StringsKt___StringsKt.takeLast(num2.toString(), 2);
            padStart2 = StringsKt__StringsKt.padStart(takeLast, 2, '0');
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{padStart, padStart2});
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOf, this.separator, null, null, 0, null, null, 62, null);
            setText(joinToString$default);
        }
    }

    public final int updateSelectionIndex$payments_core_release(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6 = 0;
        if (i2 <= 2 && i2 + i3 >= 2) {
            i5 = this.separator.length();
        } else {
            i5 = 0;
        }
        boolean z2 = true;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i2 != this.separator.length() + 2) {
            z2 = false;
        }
        int i7 = i2 + i3 + i5;
        if (z2 && i7 > 0) {
            i6 = this.separator.length();
        }
        return Math.min(i4, Math.min(i7 - i6, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDateValid(String str, String str2) {
        Object obj;
        int intValue;
        Object obj2;
        int i = -1;
        if (str.length() != 2) {
            intValue = -1;
        } else {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m116783constructorimpl(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            boolean m116789isFailureimpl = Result.m116789isFailureimpl(obj);
            Object obj3 = obj;
            if (m116789isFailureimpl) {
                obj3 = r2;
            }
            intValue = ((Number) obj3).intValue();
        }
        if (str2.length() == 2) {
            try {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.m116783constructorimpl(Integer.valueOf(DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2))));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.m116783constructorimpl(ResultKt.createFailure(th2));
            }
            i = ((Number) (Result.m116789isFailureimpl(obj2) ? -1 : obj2)).intValue();
        }
        return DateUtils.isExpiryDataValid(intValue, i);
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.completionCallback = ExpiryDateEditText$completionCallback$1.INSTANCE;
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.includeSeparatorGaps$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.ExpiryDateEditText$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                this.updateSeparatorUi(booleanValue);
            }
        };
        this.dateDigitsLength = context.getResources().getInteger(C18606R.integer.stripe_date_digits_length);
        this.separator = SEPARATOR_WITHOUT_GAPS;
        setNumberOnlyInputType();
        updateSeparatorUi$default(this, false, 1, null);
        listenForTextChanges();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardExpirationDate"});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: wi1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ExpiryDateEditText._init_$lambda$1(ExpiryDateEditText.this, view, z);
            }
        });
        setLayoutDirection(0);
    }
}
