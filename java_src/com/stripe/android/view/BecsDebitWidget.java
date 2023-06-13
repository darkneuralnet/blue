package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.BecsDebitWidgetBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.BecsDebitBanks;
import com.stripe.android.view.BecsDebitWidget;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001!B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010 \u001a\u00020\u001fH\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitWidget;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "companyName", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V", "isInputValid", "", "()Z", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "validParamsCallback", "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "getValidParamsCallback", "()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "setValidParamsCallback", "(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V", "viewBinding", "Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "applyAttributes", "", "verifyCompanyName", "ValidParamsCallback", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBecsDebitWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitWidget.kt\ncom/stripe/android/view/BecsDebitWidget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,230:1\n1855#2:231\n1856#2:258\n1855#2:259\n1856#2:286\n58#3,23:232\n93#3,3:255\n58#3,23:260\n93#3,3:283\n1#4:287\n52#5,9:288\n*S KotlinDebug\n*F\n+ 1 BecsDebitWidget.kt\ncom/stripe/android/view/BecsDebitWidget\n*L\n77#1:231\n77#1:258\n151#1:259\n151#1:286\n78#1:232,23\n78#1:255,3\n152#1:260,23\n152#1:283,3\n174#1:288,9\n*E\n"})
/* loaded from: classes7.dex */
public final class BecsDebitWidget extends FrameLayout {
    public static final int $stable = 8;
    private ValidParamsCallback validParamsCallback;
    private final Lazy viewBinding$delegate;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "bank", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.BecsDebitWidget$2 */
    /* loaded from: classes7.dex */
    public static final class C195022 extends Lambda implements Function1<BecsDebitBanks.Bank, Unit> {
        public C195022() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BecsDebitBanks.Bank bank) {
            invoke2(bank);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
            if (r0.equals("73") == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
            if (r0.equals("08") == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
            if (r0.equals("03") == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
            r3 = 6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
            if (r0.equals("01") == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
            if (r0.equals("00") == false) goto L44;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(BecsDebitBanks.Bank bank) {
            int i;
            String prefix;
            String str = null;
            if (bank != null) {
                BecsDebitWidget.this.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperText(bank.getName());
                BecsDebitWidget.this.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperTextEnabled(true);
            } else {
                BecsDebitWidget.this.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperText(null);
                BecsDebitWidget.this.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperTextEnabled(false);
            }
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = BecsDebitWidget.this.getViewBinding$payments_core_release().accountNumberEditText;
            if (bank != null && (prefix = bank.getPrefix()) != null) {
                str = StringsKt___StringsKt.take(prefix, 2);
            }
            if (str != null) {
                int hashCode = str.hashCode();
                i = 9;
                if (hashCode != 1536) {
                    if (hashCode != 1537) {
                        if (hashCode != 1539) {
                            if (hashCode != 1542) {
                                if (hashCode != 1544) {
                                    if (hashCode != 1756) {
                                        if (hashCode == 1784 && str.equals("80")) {
                                            i = 4;
                                        }
                                    }
                                }
                            } else if (str.equals("06")) {
                                i = 8;
                            }
                        }
                    }
                }
                becsDebitAccountNumberEditText.setMinLength(i);
            }
            i = 5;
            becsDebitAccountNumberEditText.setMinLength(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.BecsDebitWidget$3 */
    /* loaded from: classes7.dex */
    public static final class C195033 extends Lambda implements Function0<Unit> {
        public C195033() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BecsDebitWidget.this.getViewBinding$payments_core_release().accountNumberTextInputLayout.requestFocus();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "", "onInputChanged", "", "isValid", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ValidParamsCallback {
        void onInputChanged(boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitWidget(Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] BecsDebitWidget = C18606R.styleable.BecsDebitWidget;
        Intrinsics.checkNotNullExpressionValue(BecsDebitWidget, "BecsDebitWidget");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BecsDebitWidget, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C18606R.styleable.BecsDebitWidget_companyName);
        if (string != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isInputValid() {
        boolean isBlank;
        boolean z;
        boolean z2;
        boolean z3;
        boolean isBlank2;
        boolean isBlank3;
        boolean isBlank4;
        String fieldText$payments_core_release = getViewBinding$payments_core_release().nameEditText.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().emailEditText.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().bsbEditText.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().accountNumberEditText.getAccountNumber();
        isBlank = StringsKt__StringsJVMKt.isBlank(fieldText$payments_core_release);
        if (isBlank) {
            return false;
        }
        if (email != null) {
            isBlank4 = StringsKt__StringsJVMKt.isBlank(email);
            if (!isBlank4) {
                z = false;
                if (!z) {
                    return false;
                }
                if (bsb$payments_core_release != null) {
                    isBlank3 = StringsKt__StringsJVMKt.isBlank(bsb$payments_core_release);
                    if (!isBlank3) {
                        z2 = false;
                        if (!z2) {
                            return false;
                        }
                        if (accountNumber != null) {
                            isBlank2 = StringsKt__StringsJVMKt.isBlank(accountNumber);
                            if (!isBlank2) {
                                z3 = false;
                                if (!z3) {
                                    return false;
                                }
                                return true;
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    private final void verifyCompanyName() {
        if (!getViewBinding$payments_core_release().mandateAcceptanceTextView.isValid$payments_core_release()) {
            throw new IllegalArgumentException("A company name is required to render a BecsDebitWidget.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
        if (r2 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PaymentMethodCreateParams getParams() {
        boolean isBlank;
        boolean z;
        boolean z2;
        boolean z3;
        boolean isBlank2;
        boolean z4;
        boolean z5;
        boolean isBlank3;
        boolean isBlank4;
        boolean isBlank5;
        boolean isBlank6;
        boolean isBlank7;
        boolean isBlank8;
        String fieldText$payments_core_release = getViewBinding$payments_core_release().nameEditText.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().emailEditText.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().bsbEditText.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().accountNumberEditText.getAccountNumber();
        StripeEditText stripeEditText = getViewBinding$payments_core_release().nameEditText;
        isBlank = StringsKt__StringsJVMKt.isBlank(fieldText$payments_core_release);
        stripeEditText.setShouldShowError(isBlank);
        EmailEditText emailEditText = getViewBinding$payments_core_release().emailEditText;
        boolean z6 = false;
        if (email != null) {
            isBlank8 = StringsKt__StringsJVMKt.isBlank(email);
            if (!isBlank8) {
                z = false;
                emailEditText.setShouldShowError(z);
                BecsDebitBsbEditText becsDebitBsbEditText = getViewBinding$payments_core_release().bsbEditText;
                if (bsb$payments_core_release != null) {
                    isBlank7 = StringsKt__StringsJVMKt.isBlank(bsb$payments_core_release);
                    if (!isBlank7) {
                        z2 = false;
                        becsDebitBsbEditText.setShouldShowError(z2);
                        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().accountNumberEditText;
                        if (accountNumber != null) {
                            isBlank6 = StringsKt__StringsJVMKt.isBlank(accountNumber);
                            if (!isBlank6) {
                                z3 = false;
                                becsDebitAccountNumberEditText.setShouldShowError(z3);
                                isBlank2 = StringsKt__StringsJVMKt.isBlank(fieldText$payments_core_release);
                                if (isBlank2) {
                                    if (email != null) {
                                        isBlank5 = StringsKt__StringsJVMKt.isBlank(email);
                                        if (!isBlank5) {
                                            z4 = false;
                                            if (z4) {
                                                if (bsb$payments_core_release != null) {
                                                    isBlank4 = StringsKt__StringsJVMKt.isBlank(bsb$payments_core_release);
                                                    if (!isBlank4) {
                                                        z5 = false;
                                                        if (z5) {
                                                            if (accountNumber != null) {
                                                                isBlank3 = StringsKt__StringsJVMKt.isBlank(accountNumber);
                                                            }
                                                            z6 = true;
                                                            if (!z6) {
                                                                return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.AuBecsDebit(bsb$payments_core_release, accountNumber), new PaymentMethod.BillingDetails(null, email, fieldText$payments_core_release, null, 9, null), (Map) null, 4, (Object) null);
                                                            }
                                                            return null;
                                                        }
                                                        return null;
                                                    }
                                                }
                                                z5 = true;
                                                if (z5) {
                                                }
                                            } else {
                                                return null;
                                            }
                                        }
                                    }
                                    z4 = true;
                                    if (z4) {
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                        z3 = true;
                        becsDebitAccountNumberEditText.setShouldShowError(z3);
                        isBlank2 = StringsKt__StringsJVMKt.isBlank(fieldText$payments_core_release);
                        if (isBlank2) {
                        }
                    }
                }
                z2 = true;
                becsDebitBsbEditText.setShouldShowError(z2);
                BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = getViewBinding$payments_core_release().accountNumberEditText;
                if (accountNumber != null) {
                }
                z3 = true;
                becsDebitAccountNumberEditText2.setShouldShowError(z3);
                isBlank2 = StringsKt__StringsJVMKt.isBlank(fieldText$payments_core_release);
                if (isBlank2) {
                }
            }
        }
        z = true;
        emailEditText.setShouldShowError(z);
        BecsDebitBsbEditText becsDebitBsbEditText2 = getViewBinding$payments_core_release().bsbEditText;
        if (bsb$payments_core_release != null) {
        }
        z2 = true;
        becsDebitBsbEditText2.setShouldShowError(z2);
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText22 = getViewBinding$payments_core_release().accountNumberEditText;
        if (accountNumber != null) {
        }
        z3 = true;
        becsDebitAccountNumberEditText22.setShouldShowError(z3);
        isBlank2 = StringsKt__StringsJVMKt.isBlank(fieldText$payments_core_release);
        if (isBlank2) {
        }
    }

    public final ValidParamsCallback getValidParamsCallback() {
        return this.validParamsCallback;
    }

    public final BecsDebitWidgetBinding getViewBinding$payments_core_release() {
        return (BecsDebitWidgetBinding) this.viewBinding$delegate.getValue();
    }

    public final void setValidParamsCallback(ValidParamsCallback validParamsCallback) {
        Intrinsics.checkNotNullParameter(validParamsCallback, "<set-?>");
        this.validParamsCallback = validParamsCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BecsDebitWidget(Context context, AttributeSet attributeSet, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i, String companyName) {
        super(context, attributeSet, i);
        Lazy lazy;
        Set<StripeEditText> of;
        Set<StripeEditText> of2;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        lazy = LazyKt__LazyJVMKt.lazy(new BecsDebitWidget$viewBinding$2(context, this));
        this.viewBinding$delegate = lazy;
        this.validParamsCallback = new ValidParamsCallback() { // from class: com.stripe.android.view.BecsDebitWidget$validParamsCallback$1
            @Override // com.stripe.android.view.BecsDebitWidget.ValidParamsCallback
            public void onInputChanged(boolean z) {
            }
        };
        if (Build.VERSION.SDK_INT >= 26) {
            getViewBinding$payments_core_release().nameEditText.setAutofillHints(new String[]{"name"});
            getViewBinding$payments_core_release().emailEditText.setAutofillHints(new String[]{"emailAddress"});
        }
        of = SetsKt__SetsKt.setOf((Object[]) new StripeEditText[]{getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText, getViewBinding$payments_core_release().bsbEditText, getViewBinding$payments_core_release().accountNumberEditText});
        for (StripeEditText field : of) {
            Intrinsics.checkNotNullExpressionValue(field, "field");
            field.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitWidget$_init_$lambda$1$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    boolean isInputValid;
                    BecsDebitWidget.ValidParamsCallback validParamsCallback = BecsDebitWidget.this.getValidParamsCallback();
                    isInputValid = BecsDebitWidget.this.isInputValid();
                    validParamsCallback.onInputChanged(isInputValid);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
        }
        getViewBinding$payments_core_release().bsbEditText.setOnBankChangedCallback(new C195022());
        getViewBinding$payments_core_release().bsbEditText.setOnCompletedCallback(new C195033());
        EmailEditText emailEditText = getViewBinding$payments_core_release().emailEditText;
        StripeEditText stripeEditText = getViewBinding$payments_core_release().nameEditText;
        Intrinsics.checkNotNullExpressionValue(stripeEditText, "viewBinding.nameEditText");
        emailEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(stripeEditText));
        BecsDebitBsbEditText becsDebitBsbEditText = getViewBinding$payments_core_release().bsbEditText;
        EmailEditText emailEditText2 = getViewBinding$payments_core_release().emailEditText;
        Intrinsics.checkNotNullExpressionValue(emailEditText2, "viewBinding.emailEditText");
        becsDebitBsbEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(emailEditText2));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().accountNumberEditText;
        BecsDebitBsbEditText becsDebitBsbEditText2 = getViewBinding$payments_core_release().bsbEditText;
        Intrinsics.checkNotNullExpressionValue(becsDebitBsbEditText2, "viewBinding.bsbEditText");
        becsDebitAccountNumberEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(becsDebitBsbEditText2));
        getViewBinding$payments_core_release().nameEditText.setErrorMessage$payments_core_release(getResources().getString(C18606R.string.becs_widget_name_required));
        StripeEditText stripeEditText2 = getViewBinding$payments_core_release().nameEditText;
        TextInputLayout textInputLayout = getViewBinding$payments_core_release().nameTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewBinding.nameTextInputLayout");
        stripeEditText2.setErrorMessageListener(new ErrorListener(textInputLayout));
        EmailEditText emailEditText3 = getViewBinding$payments_core_release().emailEditText;
        TextInputLayout textInputLayout2 = getViewBinding$payments_core_release().emailTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewBinding.emailTextInputLayout");
        emailEditText3.setErrorMessageListener(new ErrorListener(textInputLayout2));
        BecsDebitBsbEditText becsDebitBsbEditText3 = getViewBinding$payments_core_release().bsbEditText;
        TextInputLayout textInputLayout3 = getViewBinding$payments_core_release().bsbTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "viewBinding.bsbTextInputLayout");
        becsDebitBsbEditText3.setErrorMessageListener(new ErrorListener(textInputLayout3));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = getViewBinding$payments_core_release().accountNumberEditText;
        TextInputLayout textInputLayout4 = getViewBinding$payments_core_release().accountNumberTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "viewBinding.accountNumberTextInputLayout");
        becsDebitAccountNumberEditText2.setErrorMessageListener(new ErrorListener(textInputLayout4));
        of2 = SetsKt__SetsKt.setOf((Object[]) new StripeEditText[]{getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText});
        for (final StripeEditText field2 : of2) {
            Intrinsics.checkNotNullExpressionValue(field2, "field");
            field2.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitWidget$_init_$lambda$3$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    StripeEditText.this.setShouldShowError(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
        }
        isBlank = StringsKt__StringsJVMKt.isBlank(companyName);
        companyName = isBlank ^ true ? companyName : null;
        if (companyName != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(companyName);
        }
        applyAttributes(attributeSet);
        verifyCompanyName();
    }
}
