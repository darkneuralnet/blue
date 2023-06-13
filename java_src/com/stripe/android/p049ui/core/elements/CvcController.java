package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0!\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\bQ\u0010RJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0003038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010'R \u00108\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010'R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010'R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010$R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010'R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\n038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00105R \u0010@\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010'R\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010$\u001a\u0004\bD\u0010'R \u0010E\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010$\u001a\u0004\bE\u0010'R \u0010G\u001a\b\u0012\u0004\u0012\u00020F0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\bH\u0010'R\"\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010$\u001a\u0004\bK\u0010'R \u0010L\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010$\u001a\u0004\bM\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CvcController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "", "displayFormatted", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onValueChange", "rawValue", "", "onRawValueChange", "", "newHasFocus", "onFocusChange", "Lcom/stripe/android/ui/core/elements/CvcConfig;", "cvcTextFieldConfig", "Lcom/stripe/android/ui/core/elements/CvcConfig;", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboardType", "getKeyboardType-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "LEu1;", "", "_label", "LEu1;", "label", "getLabel", "()LEu1;", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LRu;", "autofillType", "LRu;", "getAutofillType", "()LRu;", "getAutofillType$annotations", "()V", "LGX2;", "_fieldValue", "LGX2;", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "_fieldState", "fieldState", "getFieldState", "_hasFocus", "visibleError", "getVisibleError", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "getTrailingIcon", "loading", "getLoading", "Lcom/stripe/android/model/CardBrand;", "cardBrandFlow", "initialValue", "<init>", "(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;Z)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCvcController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,112:1\n47#2:113\n49#2:117\n47#2:118\n49#2:122\n47#2:123\n49#2:127\n47#2:128\n49#2:132\n47#2:133\n49#2:137\n50#3:114\n55#3:116\n50#3:119\n55#3:121\n50#3:124\n55#3:126\n50#3:129\n55#3:131\n50#3:134\n55#3:136\n106#4:115\n106#4:120\n106#4:125\n106#4:130\n106#4:135\n*S KotlinDebug\n*F\n+ 1 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n32#1:113\n32#1:117\n50#1:118\n50#1:122\n53#1:123\n53#1:127\n75#1:128\n75#1:132\n82#1:133\n82#1:137\n32#1:114\n32#1:116\n50#1:119\n50#1:121\n53#1:124\n53#1:126\n75#1:129\n75#1:131\n82#1:134\n82#1:136\n32#1:115\n50#1:120\n53#1:125\n75#1:130\n82#1:135\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CvcController */
/* loaded from: classes7.dex */
public final class CvcController implements TextFieldController, SectionFieldErrorController {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<TextFieldState> _fieldState;
    private final GX2<String> _fieldValue;
    private final GX2<Boolean> _hasFocus;
    private final InterfaceC32730Eu1<Integer> _label;
    private final EnumC7283Ru autofillType;
    private final int capitalization;
    private final InterfaceC32730Eu1<String> contentDescription;
    private final CvcConfig cvcTextFieldConfig;
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

    public CvcController(CvcConfig cvcTextFieldConfig, final InterfaceC32730Eu1<? extends CardBrand> cardBrandFlow, String str, boolean z) {
        Intrinsics.checkNotNullParameter(cvcTextFieldConfig, "cvcTextFieldConfig");
        Intrinsics.checkNotNullParameter(cardBrandFlow, "cardBrandFlow");
        this.cvcTextFieldConfig = cvcTextFieldConfig;
        this.showOptionalLabel = z;
        this.capitalization = cvcTextFieldConfig.mo116659getCapitalizationIUNYP9k();
        this.keyboardType = cvcTextFieldConfig.mo116660getKeyboardPjHm6EE();
        this.visualTransformation = cvcTextFieldConfig.getVisualTransformation();
        InterfaceC32730Eu1<Integer> interfaceC32730Eu1 = new InterfaceC32730Eu1<Integer>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n1#1,222:1\n48#2:223\n33#3,4:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193962<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2", m28418f = "CvcController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193971 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193971(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193962.this.emit(null, this);
                    }
                }

                public C193962(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193971 c193971;
                    Object coroutine_suspended;
                    int i;
                    int i2;
                    if (continuation instanceof C193971) {
                        c193971 = (C193971) continuation;
                        int i3 = c193971.label;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            c193971.label = i3 - Integer.MIN_VALUE;
                            Object obj2 = c193971.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193971.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                if (((CardBrand) obj) == CardBrand.AmericanExpress) {
                                    i2 = C19369R.string.cvc_amex_hint;
                                } else {
                                    i2 = C19369R.string.cvc_number_hint;
                                }
                                Integer boxInt = Boxing.boxInt(i2);
                                c193971.label = 1;
                                if (interfaceC33198Gu1.emit(boxInt, c193971) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193971 = new C193971(continuation);
                    Object obj22 = c193971.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193971.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Integer> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193962(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this._label = interfaceC32730Eu1;
        this.label = interfaceC32730Eu1;
        this.debugLabel = cvcTextFieldConfig.getDebugLabel();
        this.autofillType = EnumC7283Ru.CreditCardSecurityCode;
        final GX2<String> m8742a = C50405vP5.m8742a("");
        this._fieldValue = m8742a;
        this.fieldValue = m8742a;
        this.rawFieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n1#1,222:1\n48#2:223\n50#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C193982<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ CvcController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2", m28418f = "CvcController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193991 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193991(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193982.this.emit(null, this);
                    }
                }

                public C193982(InterfaceC33198Gu1 interfaceC33198Gu1, CvcController cvcController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = cvcController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193991 c193991;
                    Object coroutine_suspended;
                    int i;
                    CvcConfig cvcConfig;
                    if (continuation instanceof C193991) {
                        c193991 = (C193991) continuation;
                        int i2 = c193991.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193991.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193991.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193991.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                cvcConfig = this.this$0.cvcTextFieldConfig;
                                String convertToRaw = cvcConfig.convertToRaw((String) obj);
                                c193991.label = 1;
                                if (interfaceC33198Gu1.emit(convertToRaw, c193991) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193991 = new C193991(continuation);
                    Object obj22 = c193991.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193991.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193982(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.contentDescription = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n1#1,222:1\n48#2:223\n53#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C194002<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2", m28418f = "CvcController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194011 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194011(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194002.this.emit(null, this);
                    }
                }

                public C194002(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194011 c194011;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194011) {
                        c194011 = (C194011) continuation;
                        int i2 = c194011.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194011.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194011.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194011.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String replace = new Regex("\\d").replace((String) obj, "$0 ");
                                c194011.label = 1;
                                if (interfaceC33198Gu1.emit(replace, c194011) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194011 = new C194011(continuation);
                    Object obj22 = c194011.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194011.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194002(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        final InterfaceC32730Eu1<TextFieldState> m79257n = C36708Vu1.m79257n(cardBrandFlow, m8742a, new CvcController$_fieldState$1(this, null));
        this._fieldState = m79257n;
        this.fieldState = m79257n;
        Boolean bool = Boolean.FALSE;
        GX2<Boolean> m8742a2 = C50405vP5.m8742a(bool);
        this._hasFocus = m8742a2;
        this.visibleError = C36708Vu1.m79257n(m79257n, m8742a2, new CvcController$visibleError$1(null));
        this.error = C36708Vu1.m79257n(getVisibleError(), m79257n, new CvcController$error$1(null));
        this.isComplete = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n1#1,222:1\n48#2:223\n75#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2 */
            /* loaded from: classes7.dex */
            public static final class C194022<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2", m28418f = "CvcController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194031 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194031(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194022.this.emit(null, this);
                    }
                }

                public C194022(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194031 c194031;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194031) {
                        c194031 = (C194031) continuation;
                        int i2 = c194031.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194031.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194031.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194031.label;
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
                                c194031.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c194031) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194031 = new C194031(continuation);
                    Object obj22 = c194031.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194031.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194022(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new CvcController$formFieldValue$1(null));
        this.trailingIcon = new InterfaceC32730Eu1<TextFieldIcon.Trailing>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n1#1,222:1\n48#2:223\n83#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2 */
            /* loaded from: classes7.dex */
            public static final class C194042<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2", m28418f = "CvcController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194051 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194051(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194042.this.emit(null, this);
                    }
                }

                public C194042(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194051 c194051;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194051) {
                        c194051 = (C194051) continuation;
                        int i2 = c194051.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194051.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194051.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194051.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                TextFieldIcon.Trailing trailing = new TextFieldIcon.Trailing(((CardBrand) obj).getCvcIcon(), null, false, null, 10, null);
                                c194051.label = 1;
                                if (interfaceC33198Gu1.emit(trailing, c194051) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194051 = new C194051(continuation);
                    Object obj22 = c194051.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194051.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super TextFieldIcon.Trailing> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194042(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.loading = C50405vP5.m8742a(bool);
        onRawValueChange(str == null ? "" : str);
    }

    public static /* synthetic */ void getAutofillType$annotations() {
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement sectionFieldElement, InterfaceC41563gV2 interfaceC41563gV2, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        TextFieldController.DefaultImpls.m116749ComposeUIMxjM1cc(this, z, sectionFieldElement, interfaceC41563gV2, set, identifierSpec, i, i2, interfaceC32720Et0, i3);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public EnumC7283Ru getAutofillType() {
        return this.autofillType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo116661getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public boolean getEnabled() {
        return TextFieldController.DefaultImpls.getEnabled(this);
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
    /* renamed from: getKeyboardType-PjHm6EE */
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

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<String> getPlaceHolder() {
        return TextFieldController.DefaultImpls.getPlaceHolder(this);
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
        onValueChange(this.cvcTextFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cvcTextFieldConfig.filter(displayFormatted));
        return null;
    }

    public /* synthetic */ CvcController(CvcConfig cvcConfig, InterfaceC32730Eu1 interfaceC32730Eu1, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CvcConfig() : cvcConfig, interfaceC32730Eu1, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z);
    }
}
