package com.stripe.android.p049ui.core.elements;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010J\u001a\u00020I\u0012\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010\u00020K¢\u0006\u0004\bN\u0010OJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R#\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u001a\u00100\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00105\u001a\b\u0012\u0004\u0012\u0002040$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R \u00108\u001a\b\u0012\u0004\u0012\u0002070$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(R\u001a\u0010:\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u001a\u0010<\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R \u0010>\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010&\u001a\u0004\b>\u0010(R \u0010@\u001a\b\u0012\u0004\u0012\u00020?0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(R\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(R \u0010E\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010&\u001a\u0004\bF\u0010(R \u0010G\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;", "Lcom/stripe/android/ui/core/elements/CardNumberController;", "", "displayFormatted", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onValueChange", "rawValue", "", "onRawValueChange", "", "newHasFocus", "onFocusChange", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboardType", "getKeyboardType-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LGX2;", "", "label", "LGX2;", "getLabel", "()LGX2;", "_fieldValue", "LEu1;", "fieldValue", "LEu1;", "getFieldValue", "()LEu1;", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "Lcom/stripe/android/model/CardBrand;", "cardBrandFlow", "getCardBrandFlow", "cardScanEnabled", "Z", "getCardScanEnabled", "()Z", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "trailingIcon", "getTrailingIcon", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;", "fieldState", "getFieldState", "enabled", "getEnabled", "showOptionalLabel", "getShowOptionalLabel", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "", "error", "getError", "loading", "getLoading", "visibleError", "getVisibleError", "Lcom/stripe/android/ui/core/elements/CardNumberConfig;", "cardTextFieldConfig", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", NamedConstantsKt.INITIAL_VALUES, "<init>", "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Ljava/util/Map;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardNumberViewOnlyController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberViewOnlyController.kt\ncom/stripe/android/ui/core/elements/CardNumberViewOnlyController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,79:1\n47#2:80\n49#2:84\n50#3:81\n55#3:83\n106#4:82\n*S KotlinDebug\n*F\n+ 1 CardNumberViewOnlyController.kt\ncom/stripe/android/ui/core/elements/CardNumberViewOnlyController\n*L\n55#1:80\n55#1:84\n55#1:81\n55#1:83\n55#1:82\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberViewOnlyController */
/* loaded from: classes7.dex */
public final class CardNumberViewOnlyController extends CardNumberController {
    private final GX2<String> _fieldValue;
    private final int capitalization;
    private final InterfaceC32730Eu1<CardBrand> cardBrandFlow;
    private final boolean cardScanEnabled;
    private final InterfaceC32730Eu1<String> contentDescription;
    private final String debugLabel;
    private final boolean enabled;
    private final InterfaceC32730Eu1 error;
    private final InterfaceC32730Eu1<TextFieldStateConstants.Valid.Full> fieldState;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final int keyboardType;
    private final GX2<Integer> label;
    private final InterfaceC32730Eu1<Boolean> loading;
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final InterfaceC32730Eu1<TextFieldIcon.Trailing> trailingIcon;
    private final InterfaceC32730Eu1<Boolean> visibleError;
    private final InterfaceC32735Eu6 visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberViewOnlyController(CardNumberConfig cardTextFieldConfig, Map<IdentifierSpec, String> initialValues) {
        super(null);
        CardBrand cardBrand;
        Intrinsics.checkNotNullParameter(cardTextFieldConfig, "cardTextFieldConfig");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        this.capitalization = cardTextFieldConfig.mo116659getCapitalizationIUNYP9k();
        this.keyboardType = cardTextFieldConfig.mo116660getKeyboardPjHm6EE();
        this.visualTransformation = InterfaceC32735Eu6.f8291a.m108216a();
        this.debugLabel = cardTextFieldConfig.getDebugLabel();
        this.label = C50405vP5.m8742a(Integer.valueOf(cardTextFieldConfig.getLabel()));
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        String str = initialValues.get(companion.getCardNumber());
        GX2<String> m8742a = C50405vP5.m8742a(str == null ? "" : str);
        this._fieldValue = m8742a;
        this.fieldValue = m8742a;
        this.rawFieldValue = getFieldValue();
        this.contentDescription = getFieldValue();
        String str2 = initialValues.get(companion.getCardBrand());
        this.cardBrandFlow = C36708Vu1.m79281G((str2 == null || (cardBrand = CardBrand.Companion.fromCode(str2)) == null) ? CardBrand.Unknown : cardBrand);
        final InterfaceC32730Eu1<CardBrand> cardBrandFlow = getCardBrandFlow();
        this.trailingIcon = new InterfaceC32730Eu1<TextFieldIcon.Trailing>() { // from class: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardNumberViewOnlyController.kt\ncom/stripe/android/ui/core/elements/CardNumberViewOnlyController\n*L\n1#1,222:1\n48#2:223\n55#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193892<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2", m28418f = "CardNumberViewOnlyController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193901 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193901(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193892.this.emit(null, this);
                    }
                }

                public C193892(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193901 c193901;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C193901) {
                        c193901 = (C193901) continuation;
                        int i2 = c193901.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193901.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193901.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193901.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                TextFieldIcon.Trailing trailing = new TextFieldIcon.Trailing(((CardBrand) obj).getIcon(), null, false, null, 10, null);
                                c193901.label = 1;
                                if (interfaceC33198Gu1.emit(trailing, c193901) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193901 = new C193901(continuation);
                    Object obj22 = c193901.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193901.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super TextFieldIcon.Trailing> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193892(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.fieldState = C36708Vu1.m79281G(TextFieldStateConstants.Valid.Full.INSTANCE);
        this.isComplete = C36708Vu1.m79281G(Boolean.TRUE);
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new CardNumberViewOnlyController$formFieldValue$1(null));
        this.error = C36708Vu1.m79281G(null);
        Boolean bool = Boolean.FALSE;
        this.loading = C36708Vu1.m79281G(bool);
        this.visibleError = C36708Vu1.m79281G(bool);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo116661getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardNumberController
    public InterfaceC32730Eu1<CardBrand> getCardBrandFlow() {
        return this.cardBrandFlow;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardNumberController
    public boolean getCardScanEnabled() {
        return this.cardScanEnabled;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardNumberController, com.stripe.android.uicore.elements.TextFieldController
    public boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1 getError() {
        return this.error;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<TextFieldStateConstants.Valid.Full> getFieldState() {
        return this.fieldState;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<String> getFieldValue() {
        return this.fieldValue;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getKeyboardType-PjHm6EE */
    public int mo116662getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<TextFieldIcon.Trailing> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<Boolean> getVisibleError() {
        return this.visibleError;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32735Eu6 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onFocusChange(boolean z) {
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        return null;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public GX2<Integer> getLabel() {
        return this.label;
    }
}
