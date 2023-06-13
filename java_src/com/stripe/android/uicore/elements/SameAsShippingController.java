package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00102\u001a\u00020\u0003¢\u0006\u0004\b3\u00104J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016JU\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\"\u0010\u001eR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u001a\u0010*\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b.\u0010\u001eR \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SameAsShippingController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "value", "", "onValueChange", "", "rawValue", "onRawValueChange", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "LEu1;", "", "label", "LEu1;", "getLabel", "()LEu1;", "LGX2;", "_value", "LGX2;", "getValue", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "initialValue", "<init>", "(Z)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSameAsShippingController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameAsShippingController.kt\ncom/stripe/android/uicore/elements/SameAsShippingController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n47#2:55\n49#2:59\n47#2:60\n49#2:64\n50#3:56\n55#3:58\n50#3:61\n55#3:63\n106#4:57\n106#4:62\n*S KotlinDebug\n*F\n+ 1 SameAsShippingController.kt\ncom/stripe/android/uicore/elements/SameAsShippingController\n*L\n22#1:55\n22#1:59\n29#1:60\n29#1:64\n22#1:56\n22#1:58\n29#1:61\n29#1:63\n22#1:57\n29#1:62\n*E\n"})
/* loaded from: classes7.dex */
public final class SameAsShippingController implements InputController, SectionFieldComposable {
    public static final int $stable = 8;
    private final GX2<Boolean> _value;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final InterfaceC32730Eu1<Integer> label = C50405vP5.m8742a(Integer.valueOf(C19423R.string.stripe_paymentsheet_address_element_same_as_shipping));
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final InterfaceC32730Eu1<Boolean> value;

    public SameAsShippingController(boolean z) {
        final GX2<Boolean> m8742a = C50405vP5.m8742a(Boolean.valueOf(z));
        this._value = m8742a;
        this.value = m8742a;
        this.fieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SameAsShippingController.kt\ncom/stripe/android/uicore/elements/SameAsShippingController\n*L\n1#1,222:1\n48#2:223\n22#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194742<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$1$2", m28418f = "SameAsShippingController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194751 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194751(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194742.this.emit(null, this);
                    }
                }

                public C194742(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194751 c194751;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194751) {
                        c194751 = (C194751) continuation;
                        int i2 = c194751.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194751.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194751.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194751.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String valueOf = String.valueOf(((Boolean) obj).booleanValue());
                                c194751.label = 1;
                                if (interfaceC33198Gu1.emit(valueOf, c194751) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194751 = new C194751(continuation);
                    Object obj22 = c194751.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194751.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194742(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.rawFieldValue = getFieldValue();
        this.error = C36708Vu1.m79281G(null);
        this.isComplete = C36708Vu1.m79281G(Boolean.TRUE);
        final InterfaceC32730Eu1<String> rawFieldValue = getRawFieldValue();
        this.formFieldValue = new InterfaceC32730Eu1<FormFieldEntry>() { // from class: com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SameAsShippingController.kt\ncom/stripe/android/uicore/elements/SameAsShippingController\n*L\n1#1,222:1\n48#2:223\n30#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C194762<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$2$2", m28418f = "SameAsShippingController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SameAsShippingController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194771 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194771(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194762.this.emit(null, this);
                    }
                }

                public C194762(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194771 c194771;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194771) {
                        c194771 = (C194771) continuation;
                        int i2 = c194771.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194771.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194771.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194771.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                FormFieldEntry formFieldEntry = new FormFieldEntry((String) obj, true);
                                c194771.label = 1;
                                if (interfaceC33198Gu1.emit(formFieldEntry, c194771) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194771 = new C194771(continuation);
                    Object obj22 = c194771.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194771.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super FormFieldEntry> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194762(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1284799623);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1284799623, i3, -1, "com.stripe.android.uicore.elements.SameAsShippingController.ComposeUI (SameAsShippingController.kt:41)");
        }
        SameAsShippingElementUIKt.SameAsShippingElementUI(this, mo89518u, 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SameAsShippingController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
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

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Integer> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final InterfaceC32730Eu1<Boolean> getValue() {
        return this.value;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Boolean booleanStrictOrNull;
        boolean z;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        booleanStrictOrNull = StringsKt__StringsKt.toBooleanStrictOrNull(rawValue);
        if (booleanStrictOrNull != null) {
            z = booleanStrictOrNull.booleanValue();
        } else {
            z = true;
        }
        onValueChange(z);
    }

    public final void onValueChange(boolean z) {
        this._value.setValue(Boolean.valueOf(z));
    }
}
