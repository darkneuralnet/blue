package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S\u0012\b\b\u0002\u0010V\u001a\u00020U\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\bX\u0010YB#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010[\u001a\u00020Z\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bX\u0010\\J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R \u00104\u001a\b\u0012\u0004\u0012\u0002030$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u001a\u00106\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b6\u0010\u0010\u001a\u0004\b7\u0010\u0012R\"\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010'R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010,R \u0010@\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR \u0010F\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\bG\u0010)R \u0010H\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010'\u001a\u0004\bI\u0010)R\"\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\bL\u0010)R \u0010M\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010'\u001a\u0004\bM\u0010)R \u0010O\u001a\b\u0012\u0004\u0012\u00020N0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010'\u001a\u0004\bP\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberEditableController;", "Lcom/stripe/android/ui/core/elements/CardNumberController;", "", "displayFormatted", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onValueChange", "rawValue", "", "onRawValueChange", "", "newHasFocus", "onFocusChange", "Lcom/stripe/android/ui/core/elements/CardNumberConfig;", "cardTextFieldConfig", "Lcom/stripe/android/ui/core/elements/CardNumberConfig;", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboardType", "getKeyboardType-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LEu1;", "", "label", "LEu1;", "getLabel", "()LEu1;", "LGX2;", "_fieldValue", "LGX2;", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "Lcom/stripe/android/model/CardBrand;", "cardBrandFlow", "getCardBrandFlow", "cardScanEnabled", "getCardScanEnabled", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "getTrailingIcon", "_fieldState", "fieldState", "getFieldState", "_hasFocus", "Lcom/stripe/android/cards/CardAccountRangeService;", "accountRangeService", "Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService", "()Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService$annotations", "()V", "loading", "getLoading", "visibleError", "getVisibleError", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "staticCardAccountRanges", "initialValue", "<init>", "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Landroid/content/Context;Ljava/lang/String;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,185:1\n47#2:186\n49#2:190\n47#2:191\n49#2:195\n47#2:196\n49#2:200\n47#2:201\n49#2:205\n50#3:187\n55#3:189\n50#3:192\n55#3:194\n50#3:197\n55#3:199\n50#3:202\n55#3:204\n106#4:188\n106#4:193\n106#4:198\n106#4:203\n*S KotlinDebug\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n78#1:186\n78#1:190\n82#1:191\n82#1:195\n89#1:196\n89#1:200\n152#1:201\n152#1:205\n78#1:187\n78#1:189\n82#1:192\n82#1:194\n89#1:197\n89#1:199\n152#1:202\n152#1:204\n78#1:188\n82#1:193\n89#1:198\n152#1:203\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController */
/* loaded from: classes7.dex */
public final class CardNumberEditableController extends CardNumberController {
    private final InterfaceC32730Eu1<TextFieldState> _fieldState;
    private final GX2<String> _fieldValue;
    private final GX2<Boolean> _hasFocus;
    private final CardAccountRangeService accountRangeService;
    private final int capitalization;
    private final InterfaceC32730Eu1<CardBrand> cardBrandFlow;
    private final boolean cardScanEnabled;
    private final CardNumberConfig cardTextFieldConfig;
    private final InterfaceC32730Eu1<String> contentDescription;
    private final String debugLabel;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<TextFieldState> fieldState;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final int keyboardType;
    private final InterfaceC32730Eu1<Integer> label;
    private final InterfaceC32730Eu1<Boolean> loading;
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final InterfaceC32730Eu1<TextFieldIcon> trailingIcon;
    private final InterfaceC32730Eu1<Boolean> visibleError;
    private final InterfaceC32735Eu6 visualTransformation;

    public /* synthetic */ CardNumberEditableController(CardNumberConfig cardNumberConfig, CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext coroutineContext, StaticCardAccountRanges staticCardAccountRanges, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardNumberConfig, cardAccountRangeRepository, coroutineContext, (i & 8) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges, str, (i & 32) != 0 ? false : z);
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
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

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<TextFieldState> getFieldState() {
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
    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public int mo116662getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Integer> getLabel() {
        return this.label;
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
    public InterfaceC32730Eu1<TextFieldIcon> getTrailingIcon() {
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
        this._hasFocus.setValue(Boolean.valueOf(z));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(this.cardTextFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cardTextFieldConfig.filter(displayFormatted));
        this.accountRangeService.onCardNumberChanged(new CardNumber.Unvalidated(displayFormatted));
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditableController(CardNumberConfig cardTextFieldConfig, CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext workContext, StaticCardAccountRanges staticCardAccountRanges, String str, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(cardTextFieldConfig, "cardTextFieldConfig");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        this.cardTextFieldConfig = cardTextFieldConfig;
        this.showOptionalLabel = z;
        this.capitalization = cardTextFieldConfig.mo116659getCapitalizationIUNYP9k();
        this.keyboardType = cardTextFieldConfig.mo116660getKeyboardPjHm6EE();
        this.visualTransformation = cardTextFieldConfig.getVisualTransformation();
        this.debugLabel = cardTextFieldConfig.getDebugLabel();
        this.label = C50405vP5.m8742a(Integer.valueOf(cardTextFieldConfig.getLabel()));
        final GX2<String> m8742a = C50405vP5.m8742a("");
        this._fieldValue = m8742a;
        this.fieldValue = m8742a;
        this.rawFieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n1#1,222:1\n48#2:223\n78#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193812<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ CardNumberEditableController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193821 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193821(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193812.this.emit(null, this);
                    }
                }

                public C193812(InterfaceC33198Gu1 interfaceC33198Gu1, CardNumberEditableController cardNumberEditableController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = cardNumberEditableController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193821 c193821;
                    Object coroutine_suspended;
                    int i;
                    CardNumberConfig cardNumberConfig;
                    if (continuation instanceof C193821) {
                        c193821 = (C193821) continuation;
                        int i2 = c193821.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193821.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193821.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193821.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                cardNumberConfig = this.this$0.cardTextFieldConfig;
                                String convertToRaw = cardNumberConfig.convertToRaw((String) obj);
                                c193821.label = 1;
                                if (interfaceC33198Gu1.emit(convertToRaw, c193821) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193821 = new C193821(continuation);
                    Object obj22 = c193821.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193821.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193812(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.contentDescription = m8742a;
        this.cardBrandFlow = new InterfaceC32730Eu1<CardBrand>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n1#1,222:1\n48#2:223\n83#3,2:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C193832<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ CardNumberEditableController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193841 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193841(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193832.this.emit(null, this);
                    }
                }

                public C193832(InterfaceC33198Gu1 interfaceC33198Gu1, CardNumberEditableController cardNumberEditableController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = cardNumberEditableController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193841 c193841;
                    Object coroutine_suspended;
                    int i;
                    Object firstOrNull;
                    CardBrand cardBrand;
                    if (continuation instanceof C193841) {
                        c193841 = (C193841) continuation;
                        int i2 = c193841.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193841.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193841.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193841.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String str = (String) obj;
                                AccountRange accountRange = this.this$0.getAccountRangeService().getAccountRange();
                                if (accountRange == null || (cardBrand = accountRange.getBrand()) == null) {
                                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) CardBrand.Companion.getCardBrands(str));
                                    cardBrand = (CardBrand) firstOrNull;
                                    if (cardBrand == null) {
                                        cardBrand = CardBrand.Unknown;
                                    }
                                }
                                c193841.label = 1;
                                if (interfaceC33198Gu1.emit(cardBrand, c193841) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193841 = new C193841(continuation);
                    Object obj22 = c193841.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193841.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super CardBrand> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193832(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.cardScanEnabled = true;
        this.trailingIcon = new InterfaceC32730Eu1<TextFieldIcon>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n90#3,5:224\n95#3:232\n96#3:234\n98#3:243\n99#3:247\n100#3:249\n102#3,3:258\n1549#4:229\n1620#4,2:230\n1622#4:233\n777#4:235\n788#4:236\n1864#4,2:237\n789#4,2:239\n1866#4:241\n791#4:242\n1549#4:244\n1620#4,2:245\n1622#4:248\n777#4:250\n788#4:251\n1864#4,2:252\n789#4,2:254\n1866#4:256\n791#4:257\n*S KotlinDebug\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n94#1:229\n94#1:230,2\n94#1:233\n96#1:235\n96#1:236\n96#1:237,2\n96#1:239,2\n96#1:241\n96#1:242\n98#1:244\n98#1:245,2\n98#1:248\n100#1:250\n100#1:251\n100#1:252,2\n100#1:254,2\n100#1:256\n100#1:257\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C193852<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ CardNumberEditableController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3$2", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193861 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193861(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193852.this.emit(null, this);
                    }
                }

                public C193852(InterfaceC33198Gu1 interfaceC33198Gu1, CardNumberEditableController cardNumberEditableController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = cardNumberEditableController;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193861 c193861;
                    Object coroutine_suspended;
                    int i;
                    int collectionSizeOrDefault;
                    int collectionSizeOrDefault2;
                    Object multiTrailing;
                    boolean z;
                    boolean z2;
                    if (continuation instanceof C193861) {
                        c193861 = (C193861) continuation;
                        int i2 = c193861.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193861.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193861.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193861.label;
                            int i3 = 1;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                List<CardBrand> cardBrands = CardBrand.Companion.getCardBrands((String) obj);
                                if (this.this$0.getAccountRangeService().getAccountRange() != null) {
                                    AccountRange accountRange = this.this$0.getAccountRangeService().getAccountRange();
                                    Intrinsics.checkNotNull(accountRange);
                                    multiTrailing = new TextFieldIcon.Trailing(accountRange.getBrand().getIcon(), null, false, null, 10, null);
                                } else {
                                    List<CardBrand> list = cardBrands;
                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                    for (CardBrand cardBrand : list) {
                                        arrayList.add(new TextFieldIcon.Trailing(cardBrand.getIcon(), null, false, null, 10, null));
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    int i4 = 0;
                                    for (T t : arrayList) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        }
                                        TextFieldIcon.Trailing trailing = (TextFieldIcon.Trailing) t;
                                        if (i4 < 3) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            arrayList2.add(t);
                                        }
                                        i4 = i5;
                                    }
                                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                                    for (CardBrand cardBrand2 : list) {
                                        arrayList3.add(new TextFieldIcon.Trailing(cardBrand2.getIcon(), null, false, null, 10, null));
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    int i6 = 0;
                                    for (T t2 : arrayList3) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        }
                                        TextFieldIcon.Trailing trailing2 = (TextFieldIcon.Trailing) t2;
                                        if (i6 > 2) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            arrayList4.add(t2);
                                        }
                                        i6 = i7;
                                    }
                                    multiTrailing = new TextFieldIcon.MultiTrailing(arrayList2, arrayList4);
                                    i3 = 1;
                                }
                                c193861.label = i3;
                                if (interfaceC33198Gu1.emit(multiTrailing, c193861) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193861 = new C193861(continuation);
                    Object obj22 = c193861.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193861.label;
                    int i32 = 1;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super TextFieldIcon> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193852(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        final InterfaceC32730Eu1<TextFieldState> m79257n = C36708Vu1.m79257n(getCardBrandFlow(), m8742a, new CardNumberEditableController$_fieldState$1(this, null));
        this._fieldState = m79257n;
        this.fieldState = m79257n;
        GX2<Boolean> m8742a2 = C50405vP5.m8742a(Boolean.FALSE);
        this._hasFocus = m8742a2;
        CardAccountRangeService cardAccountRangeService = new CardAccountRangeService(cardAccountRangeRepository, workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangeResult(AccountRange accountRange) {
                if (accountRange != null) {
                    int panLength = accountRange.getPanLength();
                    InterfaceC32735Eu6 visualTransformation = CardNumberEditableController.this.getVisualTransformation();
                    Intrinsics.checkNotNull(visualTransformation, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.CardNumberVisualTransformation");
                    ((CardNumberVisualTransformation) visualTransformation).setBinBasedMaxPan$payments_ui_core_release(Integer.valueOf(panLength));
                }
            }
        });
        this.accountRangeService = cardAccountRangeService;
        this.loading = cardAccountRangeService.isLoading();
        this.visibleError = C36708Vu1.m79257n(m79257n, m8742a2, new CardNumberEditableController$visibleError$1(null));
        this.error = C36708Vu1.m79257n(getVisibleError(), m79257n, new CardNumberEditableController$error$1(null));
        this.isComplete = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n1#1,222:1\n48#2:223\n152#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2 */
            /* loaded from: classes7.dex */
            public static final class C193872<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193881 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193881(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193872.this.emit(null, this);
                    }
                }

                public C193872(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193881 c193881;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C193881) {
                        c193881 = (C193881) continuation;
                        int i2 = c193881.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193881.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193881.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193881.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                Boolean boxBoolean = Boxing.boxBoolean(((TextFieldState) obj).isValid());
                                c193881.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c193881) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193881 = new C193881(continuation);
                    Object obj22 = c193881.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193881.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193872(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new CardNumberEditableController$formFieldValue$1(null));
        onRawValueChange(str == null ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditableController(CardNumberConfig cardTextFieldConfig, Context context, String str) {
        this(cardTextFieldConfig, new DefaultCardAccountRangeRepositoryFactory(context).create(), T41.m84377b(), null, str, false, 40, null);
        Intrinsics.checkNotNullParameter(cardTextFieldConfig, "cardTextFieldConfig");
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
