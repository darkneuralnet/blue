package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/UpiElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/elements/InputController;", "controller", "Lcom/stripe/android/uicore/elements/InputController;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/InputController;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUpiElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpiElement.kt\ncom/stripe/android/ui/core/elements/UpiElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,26:1\n47#2:27\n49#2:31\n50#3:28\n55#3:30\n106#4:29\n*S KotlinDebug\n*F\n+ 1 UpiElement.kt\ncom/stripe/android/ui/core/elements/UpiElement\n*L\n21#1:27\n21#1:31\n21#1:28\n21#1:30\n21#1:29\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.UpiElement */
/* loaded from: classes7.dex */
public final class UpiElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final InputController controller;
    private final IdentifierSpec identifier;

    public /* synthetic */ UpiElement(IdentifierSpec identifierSpec, InputController inputController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, (i & 2) != 0 ? new SimpleTextFieldController(new UpiConfig(), false, null, 6, null) : inputController);
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public InputController getController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = getController().getFormFieldValue();
        return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.UpiElement$getFormFieldValueFlow$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UpiElement.kt\ncom/stripe/android/ui/core/elements/UpiElement\n*L\n1#1,222:1\n48#2:223\n22#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.UpiElement$getFormFieldValueFlow$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194192<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ UpiElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.UpiElement$getFormFieldValueFlow$$inlined$map$1$2", m28418f = "UpiElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.UpiElement$getFormFieldValueFlow$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194201 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194201(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194192.this.emit(null, this);
                    }
                }

                public C194192(InterfaceC33198Gu1 interfaceC33198Gu1, UpiElement upiElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = upiElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194201 c194201;
                    Object coroutine_suspended;
                    int i;
                    List listOf;
                    if (continuation instanceof C194201) {
                        c194201 = (C194201) continuation;
                        int i2 = c194201.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194201.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194201.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194201.label;
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
                                c194201.label = 1;
                                if (interfaceC33198Gu1.emit(listOf, c194201) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194201 = new C194201(continuation);
                    Object obj22 = c194201.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194201.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194192(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiElement(IdentifierSpec identifier, InputController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }
}
