package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.forms.FormFieldEntry;
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
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001e\u0010\u000eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\u000e¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", "Lcom/stripe/android/uicore/elements/InputController;", "", "saveForFutureUse", "", "onValueChange", "", "rawValue", "onRawValueChange", "LEu1;", "", "label", "LEu1;", "getLabel", "()LEu1;", "LGX2;", "_saveForFutureUse", "LGX2;", "getSaveForFutureUse", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "saveForFutureUseInitialValue", "<init>", "(Z)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveForFutureUseController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveForFutureUseController.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,41:1\n47#2:42\n49#2:46\n50#3:43\n55#3:45\n106#4:44\n*S KotlinDebug\n*F\n+ 1 SaveForFutureUseController.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseController\n*L\n22#1:42\n22#1:46\n22#1:43\n22#1:45\n22#1:44\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseController */
/* loaded from: classes7.dex */
public final class SaveForFutureUseController implements InputController {
    public static final int $stable = 8;
    private final GX2<Boolean> _saveForFutureUse;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final InterfaceC32730Eu1<Integer> label = C50405vP5.m8742a(Integer.valueOf(C19369R.string.save_for_future_payments_with_merchant_name));
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final InterfaceC32730Eu1<Boolean> saveForFutureUse;
    private final boolean showOptionalLabel;

    public SaveForFutureUseController(boolean z) {
        final GX2<Boolean> m8742a = C50405vP5.m8742a(Boolean.valueOf(z));
        this._saveForFutureUse = m8742a;
        this.saveForFutureUse = m8742a;
        this.fieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SaveForFutureUseController.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseController\n*L\n1#1,222:1\n48#2:223\n22#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194092<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2", m28418f = "SaveForFutureUseController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194101 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194101(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194092.this.emit(null, this);
                    }
                }

                public C194092(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194101 c194101;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194101) {
                        c194101 = (C194101) continuation;
                        int i2 = c194101.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194101.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194101.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194101.label;
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
                                c194101.label = 1;
                                if (interfaceC33198Gu1.emit(valueOf, c194101) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194101 = new C194101(continuation);
                    Object obj22 = c194101.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194101.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194092(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.rawFieldValue = getFieldValue();
        this.error = C50405vP5.m8742a(null);
        this.isComplete = C50405vP5.m8742a(Boolean.TRUE);
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new SaveForFutureUseController$formFieldValue$1(null));
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

    public final InterfaceC32730Eu1<Boolean> getSaveForFutureUse() {
        return this.saveForFutureUse;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
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
        this._saveForFutureUse.setValue(Boolean.valueOf(z));
    }
}
