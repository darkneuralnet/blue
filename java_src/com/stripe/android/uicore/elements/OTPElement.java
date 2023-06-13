package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.FormElement;
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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/OTPElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "component1", "Lcom/stripe/android/uicore/elements/OTPController;", "component2", "identifier", "controller", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/elements/OTPController;", "getController", "()Lcom/stripe/android/uicore/elements/OTPController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/OTPController;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOTPElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElement.kt\ncom/stripe/android/uicore/elements/OTPElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,19:1\n47#2:20\n49#2:24\n50#3:21\n55#3:23\n106#4:22\n*S KotlinDebug\n*F\n+ 1 OTPElement.kt\ncom/stripe/android/uicore/elements/OTPElement\n*L\n14#1:20\n14#1:24\n14#1:21\n14#1:23\n14#1:22\n*E\n"})
/* loaded from: classes7.dex */
public final class OTPElement implements FormElement {
    public static final int $stable = 8;
    private final OTPController controller;
    private final IdentifierSpec identifier;

    public OTPElement(IdentifierSpec identifier, OTPController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ OTPElement copy$default(OTPElement oTPElement, IdentifierSpec identifierSpec, OTPController oTPController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = oTPElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            oTPController = oTPElement.getController();
        }
        return oTPElement.copy(identifierSpec, oTPController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final OTPController component2() {
        return getController();
    }

    public final OTPElement copy(IdentifierSpec identifier, OTPController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new OTPElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OTPElement) {
            OTPElement oTPElement = (OTPElement) obj;
            return Intrinsics.areEqual(getIdentifier(), oTPElement.getIdentifier()) && Intrinsics.areEqual(getController(), oTPElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final InterfaceC32730Eu1<String> fieldValue = getController().getFieldValue();
        return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OTPElement.kt\ncom/stripe/android/uicore/elements/OTPElement\n*L\n1#1,222:1\n48#2:223\n15#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194572<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ OTPElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2", m28418f = "OTPElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194581 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194581(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194572.this.emit(null, this);
                    }
                }

                public C194572(InterfaceC33198Gu1 interfaceC33198Gu1, OTPElement oTPElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = oTPElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194581 c194581;
                    Object coroutine_suspended;
                    int i;
                    boolean z;
                    List listOf;
                    if (continuation instanceof C194581) {
                        c194581 = (C194581) continuation;
                        int i2 = c194581.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194581.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194581.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194581.label;
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
                                IdentifierSpec identifier = this.this$0.getIdentifier();
                                if (str.length() == this.this$0.getController().getOtpLength()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(identifier, new FormFieldEntry(str, z)));
                                c194581.label = 1;
                                if (interfaceC33198Gu1.emit(listOf, c194581) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194581 = new C194581(continuation);
                    Object obj22 = c194581.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194581.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194572(interfaceC33198Gu1, this), continuation);
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

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + getController().hashCode();
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        OTPController controller = getController();
        return "OTPElement(identifier=" + identifier + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public OTPController getController() {
        return this.controller;
    }
}
