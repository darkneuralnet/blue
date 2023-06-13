package com.stripe.android.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.view.BecsDebitBanks;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0014H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText;", "Lcom/stripe/android/view/StripeEditText;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bank", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "getBank", "()Lcom/stripe/android/view/BecsDebitBanks$Bank;", "banks", "Lcom/stripe/android/view/BecsDebitBanks;", "bsb", "", "getBsb$payments_core_release", "()Ljava/lang/String;", "isComplete", "", "()Z", "onBankChangedCallback", "Lkotlin/Function1;", "", "getOnBankChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnBankChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCompletedCallback", "Lkotlin/Function0;", "getOnCompletedCallback", "()Lkotlin/jvm/functions/Function0;", "setOnCompletedCallback", "(Lkotlin/jvm/functions/Function0;)V", "formatBsb", "updateIcon", "isError", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBecsDebitBsbEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitBsbEditText.kt\ncom/stripe/android/view/BecsDebitBsbEditText\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n429#2:147\n502#2,5:148\n1#3:153\n*S KotlinDebug\n*F\n+ 1 BecsDebitBsbEditText.kt\ncom/stripe/android/view/BecsDebitBsbEditText\n*L\n38#1:147\n38#1:148,5\n*E\n"})
/* loaded from: classes7.dex */
public final class BecsDebitBsbEditText extends StripeEditText {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_LENGTH = 7;
    @Deprecated
    private static final int MIN_VALIDATION_THRESHOLD = 2;
    @Deprecated
    private static final String SEPARATOR = "-";
    private final BecsDebitBanks banks;
    private Function1<? super BecsDebitBanks.Bank, Unit> onBankChangedCallback;
    private Function0<Unit> onCompletedCallback;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText$Companion;", "", "()V", "MAX_LENGTH", "", "MIN_VALIDATION_THRESHOLD", "SEPARATOR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public BecsDebitBsbEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatBsb(String str) {
        String take;
        String takeLast;
        List listOf;
        String joinToString$default;
        if (str.length() >= 3) {
            take = StringsKt___StringsKt.take(str, 3);
            takeLast = StringsKt___StringsKt.takeLast(str, str.length() - 3);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{take, takeLast});
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOf, "-", null, null, 0, null, null, 62, null);
            return joinToString$default;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BecsDebitBanks.Bank getBank() {
        return this.banks.byPrefix(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComplete() {
        return getBank() != null && getFieldText$payments_core_release().length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIcon(boolean z) {
        int i;
        if (z) {
            i = C18606R.C18607drawable.stripe_ic_bank_error;
        } else {
            i = C18606R.C18607drawable.stripe_ic_bank_becs;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final String getBsb$payments_core_release() {
        String str;
        if (getFieldText$payments_core_release().length() < 2) {
            str = getResources().getString(C18606R.string.becs_widget_bsb_incomplete);
        } else if (getBank() == null) {
            str = getResources().getString(C18606R.string.becs_widget_bsb_invalid);
        } else if (getFieldText$payments_core_release().length() < 7) {
            str = getResources().getString(C18606R.string.becs_widget_bsb_incomplete);
        } else {
            str = null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i = 0; i < length; i++) {
            char charAt = fieldText$payments_core_release.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        if (!isComplete()) {
            return null;
        }
        return sb2;
    }

    public final Function1<BecsDebitBanks.Bank, Unit> getOnBankChangedCallback() {
        return this.onBankChangedCallback;
    }

    public final Function0<Unit> getOnCompletedCallback() {
        return this.onCompletedCallback;
    }

    public final void setOnBankChangedCallback(Function1<? super BecsDebitBanks.Bank, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onBankChangedCallback = function1;
    }

    public final void setOnCompletedCallback(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCompletedCallback = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.banks = new BecsDebitBanks(context, false, 2, (DefaultConstructorMarker) null);
        this.onBankChangedCallback = BecsDebitBsbEditText$onBankChangedCallback$1.INSTANCE;
        this.onCompletedCallback = BecsDebitBsbEditText$onCompletedCallback$1.INSTANCE;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.BecsDebitBsbEditText.1
            private String formattedBsb;
            private boolean ignoreChanges;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                boolean z;
                String str;
                int coerceIn;
                if (this.ignoreChanges) {
                    return;
                }
                boolean z2 = true;
                this.ignoreChanges = true;
                if (!BecsDebitBsbEditText.this.isLastKeyDelete$payments_core_release() && (str = this.formattedBsb) != null) {
                    BecsDebitBsbEditText.this.setText(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        BecsDebitBsbEditText becsDebitBsbEditText = BecsDebitBsbEditText.this;
                        coerceIn = RangesKt___RangesKt.coerceIn(num.intValue(), 0, becsDebitBsbEditText.getFieldText$payments_core_release().length());
                        becsDebitBsbEditText.setSelection(coerceIn);
                    }
                }
                String str2 = null;
                this.formattedBsb = null;
                this.newCursorPosition = null;
                this.ignoreChanges = false;
                if (BecsDebitBsbEditText.this.getBank() == null && BecsDebitBsbEditText.this.getFieldText$payments_core_release().length() >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                BecsDebitBsbEditText becsDebitBsbEditText2 = BecsDebitBsbEditText.this;
                if (z) {
                    str2 = becsDebitBsbEditText2.getResources().getString(C18606R.string.becs_widget_bsb_invalid);
                }
                becsDebitBsbEditText2.setErrorMessage$payments_core_release(str2);
                BecsDebitBsbEditText becsDebitBsbEditText3 = BecsDebitBsbEditText.this;
                if (becsDebitBsbEditText3.getErrorMessage$payments_core_release() == null) {
                    z2 = false;
                }
                becsDebitBsbEditText3.setShouldShowError(z2);
                BecsDebitBsbEditText.this.getOnBankChangedCallback().invoke(BecsDebitBsbEditText.this.getBank());
                BecsDebitBsbEditText.this.updateIcon(z);
                if (BecsDebitBsbEditText.this.isComplete()) {
                    BecsDebitBsbEditText.this.getOnCompletedCallback().invoke();
                }
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                String str;
                if (this.ignoreChanges || i2 > 4) {
                    return;
                }
                Integer num = null;
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
                String formatBsb = BecsDebitBsbEditText.this.formatBsb(sb2);
                this.formattedBsb = formatBsb;
                if (formatBsb != null) {
                    num = Integer.valueOf(formatBsb.length());
                }
                this.newCursorPosition = num;
            }
        });
    }
}
