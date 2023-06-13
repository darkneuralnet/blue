package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\"J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "component1", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", "component2", "", "component3", "identifier", "controller", "merchantName", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", "getController", "()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", "Ljava/lang/String;", "getMerchantName", "()Ljava/lang/String;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;Ljava/lang/String;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveForFutureUseElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveForFutureUseElement.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,27:1\n47#2:28\n49#2:32\n50#3:29\n55#3:31\n106#4:30\n*S KotlinDebug\n*F\n+ 1 SaveForFutureUseElement.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElement\n*L\n21#1:28\n21#1:32\n21#1:29\n21#1:31\n21#1:30\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseElement */
/* loaded from: classes7.dex */
public final class SaveForFutureUseElement implements FormElement {
    public static final int $stable = 8;
    private final SaveForFutureUseController controller;
    private final IdentifierSpec identifier;
    private final String merchantName;

    public SaveForFutureUseElement(IdentifierSpec identifier, SaveForFutureUseController controller, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
        this.merchantName = str;
    }

    public static /* synthetic */ SaveForFutureUseElement copy$default(SaveForFutureUseElement saveForFutureUseElement, IdentifierSpec identifierSpec, SaveForFutureUseController saveForFutureUseController, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = saveForFutureUseElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            saveForFutureUseController = saveForFutureUseElement.getController();
        }
        if ((i & 4) != 0) {
            str = saveForFutureUseElement.merchantName;
        }
        return saveForFutureUseElement.copy(identifierSpec, saveForFutureUseController, str);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final SaveForFutureUseController component2() {
        return getController();
    }

    public final String component3() {
        return this.merchantName;
    }

    public final SaveForFutureUseElement copy(IdentifierSpec identifier, SaveForFutureUseController controller, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new SaveForFutureUseElement(identifier, controller, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveForFutureUseElement) {
            SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) obj;
            return Intrinsics.areEqual(getIdentifier(), saveForFutureUseElement.getIdentifier()) && Intrinsics.areEqual(getController(), saveForFutureUseElement.getController()) && Intrinsics.areEqual(this.merchantName, saveForFutureUseElement.merchantName);
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = getController().getFormFieldValue();
        return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseElement$getFormFieldValueFlow$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SaveForFutureUseElement.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElement\n*L\n1#1,222:1\n48#2:223\n23#3:224\n22#3:225\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseElement$getFormFieldValueFlow$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194112<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ SaveForFutureUseElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.SaveForFutureUseElement$getFormFieldValueFlow$$inlined$map$1$2", m28418f = "SaveForFutureUseElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseElement$getFormFieldValueFlow$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194121 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194121(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194112.this.emit(null, this);
                    }
                }

                public C194112(InterfaceC33198Gu1 interfaceC33198Gu1, SaveForFutureUseElement saveForFutureUseElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = saveForFutureUseElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194121 c194121;
                    Object coroutine_suspended;
                    int i;
                    List listOf;
                    if (continuation instanceof C194121) {
                        c194121 = (C194121) continuation;
                        int i2 = c194121.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194121.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194121.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194121.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(this.this$0.getIdentifier(), (FormFieldEntry) obj));
                                c194121.label = 1;
                                if (interfaceC33198Gu1.emit(listOf, c194121) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194121 = new C194121(continuation);
                    Object obj22 = c194121.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194121.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194112(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public int hashCode() {
        int hashCode = ((getIdentifier().hashCode() * 31) + getController().hashCode()) * 31;
        String str = this.merchantName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        SaveForFutureUseController controller = getController();
        String str = this.merchantName;
        return "SaveForFutureUseElement(identifier=" + identifier + ", controller=" + controller + ", merchantName=" + str + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public SaveForFutureUseController getController() {
        return this.controller;
    }
}
