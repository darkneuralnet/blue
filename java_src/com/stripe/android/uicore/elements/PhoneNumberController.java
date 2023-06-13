package com.stripe.android.uicore.elements;

import com.stripe.android.core.model.Country;
import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB7\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018\u0012\b\b\u0002\u0010&\u001a\u00020\u0010¢\u0006\u0004\bP\u0010QJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010JU\u0010!\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00101R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010,R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bB\u0010.R \u0010D\u001a\b\u0012\u0004\u0012\u00020C0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\bE\u0010.R\"\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\bH\u0010.R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0006¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010.R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K0*8\u0006¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\bM\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006S"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "getCountryCode", "phoneNumber", "getE164PhoneNumber", "", "index", "", "onSelectedCountryIndex", "(I)Lkotlin/Unit;", "displayFormatted", "onValueChange", "rawValue", "onRawValueChange", "", "newHasFocus", "onFocusChange", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "initialPhoneNumber", "Ljava/lang/String;", "getInitialPhoneNumber", "()Ljava/lang/String;", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "LEu1;", "label", "LEu1;", "getLabel", "()LEu1;", "LGX2;", "_fieldValue", "LGX2;", "fieldValue", "getFieldValue", "_hasFocus", "Lcom/stripe/android/uicore/elements/CountryConfig;", "countryConfig", "Lcom/stripe/android/uicore/elements/CountryConfig;", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "countryDropdownController", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "getCountryDropdownController", "()Lcom/stripe/android/uicore/elements/DropdownFieldController;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "phoneNumberFormatter", "phoneNumberMinimumLength", "rawFieldValue", "getRawFieldValue", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "placeholder", "getPlaceholder", "LEu6;", "visualTransformation", "getVisualTransformation", "initiallySelectedCountryCode", "overrideCountryCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Z)V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,180:1\n47#2:181\n49#2:185\n47#2:186\n49#2:190\n47#2:191\n49#2:195\n50#3:182\n55#3:184\n50#3:187\n55#3:189\n50#3:192\n55#3:194\n106#4:183\n106#4:188\n106#4:193\n*S KotlinDebug\n*F\n+ 1 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n*L\n61#1:181\n61#1:185\n92#1:186\n92#1:190\n94#1:191\n94#1:195\n61#1:182\n61#1:184\n92#1:187\n92#1:189\n94#1:192\n94#1:194\n61#1:183\n92#1:188\n94#1:193\n*E\n"})
/* loaded from: classes7.dex */
public final class PhoneNumberController implements InputController, SectionFieldComposable {
    private final GX2<String> _fieldValue;
    private final GX2<Boolean> _hasFocus;
    private final CountryConfig countryConfig;
    private final DropdownFieldController countryDropdownController;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final String initialPhoneNumber;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final InterfaceC32730Eu1<Integer> label;
    private final GX2<PhoneNumberFormatter> phoneNumberFormatter;
    private final InterfaceC32730Eu1<Integer> phoneNumberMinimumLength;
    private final InterfaceC32730Eu1<String> placeholder;
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final InterfaceC32730Eu1<InterfaceC32735Eu6> visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;", "", "()V", "createPhoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "initialValue", "", "initiallySelectedCountryCode", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PhoneNumberController createPhoneNumberController$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.createPhoneNumberController(str, str2);
        }

        public final PhoneNumberController createPhoneNumberController(String initialValue, String str) {
            boolean startsWith$default;
            String removePrefix;
            String removePrefix2;
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            PhoneNumberFormatter phoneNumberFormatter = null;
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(initialValue, "+", false, 2, null);
            if (str == null && startsWith$default) {
                phoneNumberFormatter = PhoneNumberFormatter.Companion.forPrefix(initialValue);
            } else if (str != null) {
                phoneNumberFormatter = PhoneNumberFormatter.Companion.forCountry(str);
            }
            if (phoneNumberFormatter != null) {
                String prefix = phoneNumberFormatter.getPrefix();
                removePrefix = StringsKt__StringsKt.removePrefix(initialValue, (CharSequence) prefix);
                removePrefix2 = StringsKt__StringsKt.removePrefix(phoneNumberFormatter.toE164Format(removePrefix), (CharSequence) prefix);
                return new PhoneNumberController(removePrefix2, phoneNumberFormatter.getCountryCode(), null, false, 12, null);
            }
            return new PhoneNumberController(initialValue, str, null, false, 12, null);
        }

        private Companion() {
        }
    }

    public PhoneNumberController() {
        this(null, null, null, false, 15, null);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1468906333);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1468906333, i3, -1, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:164)");
        }
        PhoneNumberElementUIKt.m116744PhoneNumberElementUIrvJmuoc(z, this, false, 0, mo89518u, (i3 & 14) | 64, 12);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PhoneNumberController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
    }

    public final String getCountryCode() {
        return this.phoneNumberFormatter.getValue().getCountryCode();
    }

    public final DropdownFieldController getCountryDropdownController() {
        return this.countryDropdownController;
    }

    public final String getE164PhoneNumber(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return this.phoneNumberFormatter.getValue().toE164Format(phoneNumber);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<String> getFieldValue() {
        return this.fieldValue;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    public final String getInitialPhoneNumber() {
        return this.initialPhoneNumber;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Integer> getLabel() {
        return this.label;
    }

    public final InterfaceC32730Eu1<String> getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final InterfaceC32730Eu1<InterfaceC32735Eu6> getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Boolean> isComplete() {
        return this.isComplete;
    }

    public final void onFocusChange(boolean z) {
        this._hasFocus.setValue(Boolean.valueOf(z));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(rawValue);
    }

    public final Unit onSelectedCountryIndex(int i) {
        Country country = this.countryConfig.getCountries$stripe_ui_core_release().get(i);
        if (!(!Intrinsics.areEqual(country.getCode().getValue(), this.phoneNumberFormatter.getValue().getCountryCode()))) {
            country = null;
        }
        Country country2 = country;
        if (country2 == null) {
            return null;
        }
        this.phoneNumberFormatter.setValue(PhoneNumberFormatter.Companion.forCountry(country2.getCode().getValue()));
        return Unit.INSTANCE;
    }

    public final void onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.phoneNumberFormatter.getValue().userInputFilter(displayFormatted));
    }

    public PhoneNumberController(String initialPhoneNumber, String str, Set<String> overrideCountryCodes, boolean z) {
        Intrinsics.checkNotNullParameter(initialPhoneNumber, "initialPhoneNumber");
        Intrinsics.checkNotNullParameter(overrideCountryCodes, "overrideCountryCodes");
        this.initialPhoneNumber = initialPhoneNumber;
        this.showOptionalLabel = z;
        this.label = C36708Vu1.m79281G(Integer.valueOf(C19423R.string.address_label_phone_number));
        GX2<String> m8742a = C50405vP5.m8742a(initialPhoneNumber);
        this._fieldValue = m8742a;
        this.fieldValue = m8742a;
        GX2<Boolean> m8742a2 = C50405vP5.m8742a(Boolean.FALSE);
        this._hasFocus = m8742a2;
        CountryConfig countryConfig = new CountryConfig(overrideCountryCodes, null, true, false, PhoneNumberController$countryConfig$1.INSTANCE, PhoneNumberController$countryConfig$2.INSTANCE, 10, null);
        this.countryConfig = countryConfig;
        DropdownFieldController dropdownFieldController = new DropdownFieldController(countryConfig, str);
        this.countryDropdownController = dropdownFieldController;
        final GX2<PhoneNumberFormatter> m8742a3 = C50405vP5.m8742a(PhoneNumberFormatter.Companion.forCountry(countryConfig.getCountries$stripe_ui_core_release().get(dropdownFieldController.getSelectedIndex().getValue().intValue()).getCode().getValue()));
        this.phoneNumberFormatter = m8742a3;
        final InterfaceC49220tP5<Integer> selectedIndex = dropdownFieldController.getSelectedIndex();
        InterfaceC32730Eu1<Integer> interfaceC32730Eu1 = new InterfaceC32730Eu1<Integer>() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n*L\n1#1,222:1\n48#2:223\n62#3,2:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194602<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ PhoneNumberController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$1$2", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194611 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194611(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194602.this.emit(null, this);
                    }
                }

                public C194602(InterfaceC33198Gu1 interfaceC33198Gu1, PhoneNumberController phoneNumberController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = phoneNumberController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194611 c194611;
                    Object coroutine_suspended;
                    int i;
                    CountryConfig countryConfig;
                    if (continuation instanceof C194611) {
                        c194611 = (C194611) continuation;
                        int i2 = c194611.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194611.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194611.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194611.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                int intValue = ((Number) obj).intValue();
                                PhoneNumberFormatter.Companion companion = PhoneNumberFormatter.Companion;
                                countryConfig = this.this$0.countryConfig;
                                Integer lengthForCountry = companion.lengthForCountry(countryConfig.getCountries$stripe_ui_core_release().get(intValue).getCode().getValue());
                                c194611.label = 1;
                                if (interfaceC33198Gu1.emit(lengthForCountry, c194611) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194611 = new C194611(continuation);
                    Object obj22 = c194611.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194611.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Integer> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194602(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.phoneNumberMinimumLength = interfaceC32730Eu1;
        this.rawFieldValue = C36708Vu1.m79257n(getFieldValue(), m8742a3, new PhoneNumberController$rawFieldValue$1(null));
        this.isComplete = C36708Vu1.m79257n(getFieldValue(), interfaceC32730Eu1, new PhoneNumberController$isComplete$1(this, null));
        this.formFieldValue = C36708Vu1.m79282F(getFieldValue(), isComplete(), new PhoneNumberController$formFieldValue$1(null));
        this.error = C36708Vu1.m79258m(getFieldValue(), isComplete(), m8742a2, new PhoneNumberController$error$1(null));
        this.placeholder = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n*L\n1#1,222:1\n48#2:223\n92#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C194622<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$2$2", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194631 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194631(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194622.this.emit(null, this);
                    }
                }

                public C194622(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194631 c194631;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194631) {
                        c194631 = (C194631) continuation;
                        int i2 = c194631.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194631.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194631.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194631.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String placeholder = ((PhoneNumberFormatter) obj).getPlaceholder();
                                c194631.label = 1;
                                if (interfaceC33198Gu1.emit(placeholder, c194631) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194631 = new C194631(continuation);
                    Object obj22 = c194631.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194631.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194622(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.visualTransformation = new InterfaceC32730Eu1<InterfaceC32735Eu6>() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n*L\n1#1,222:1\n48#2:223\n94#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C194642<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$3$2", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.PhoneNumberController$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194651 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194651(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194642.this.emit(null, this);
                    }
                }

                public C194642(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194651 c194651;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194651) {
                        c194651 = (C194651) continuation;
                        int i2 = c194651.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194651.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194651.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194651.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                InterfaceC32735Eu6 visualTransformation = ((PhoneNumberFormatter) obj).getVisualTransformation();
                                c194651.label = 1;
                                if (interfaceC33198Gu1.emit(visualTransformation, c194651) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194651 = new C194651(continuation);
                    Object obj22 = c194651.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194651.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super InterfaceC32735Eu6> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194642(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public /* synthetic */ PhoneNumberController(String str, String str2, Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 8) != 0 ? false : z);
    }
}
