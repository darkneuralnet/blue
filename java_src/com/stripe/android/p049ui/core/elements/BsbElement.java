package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.Controller;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.view.BecsDebitBanks;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010 J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/BsbElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "identifierSpec", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "banks", "Ljava/util/List;", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "textElement", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "getTextElement$payments_ui_core_release", "()Lcom/stripe/android/uicore/elements/SimpleTextElement;", "", "bankName", "LEu1;", "getBankName", "()LEu1;", "Lcom/stripe/android/uicore/elements/Controller;", "getController", "()Lcom/stripe/android/uicore/elements/Controller;", "controller", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifier", "initialValue", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Ljava/lang/String;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBsbElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BsbElement.kt\ncom/stripe/android/ui/core/elements/BsbElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,46:1\n47#2:47\n49#2:51\n50#3:48\n55#3:50\n106#4:49\n*S KotlinDebug\n*F\n+ 1 BsbElement.kt\ncom/stripe/android/ui/core/elements/BsbElement\n*L\n30#1:47\n30#1:51\n30#1:48\n30#1:50\n30#1:49\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.BsbElement */
/* loaded from: classes7.dex */
public final class BsbElement implements FormElement {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<String> bankName;
    private final List<BecsDebitBanks.Bank> banks;
    private final IdentifierSpec identifierSpec;
    private final SimpleTextElement textElement;

    public BsbElement(IdentifierSpec identifierSpec, List<BecsDebitBanks.Bank> banks, String str) {
        Intrinsics.checkNotNullParameter(identifierSpec, "identifierSpec");
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.identifierSpec = identifierSpec;
        this.banks = banks;
        SimpleTextElement simpleTextElement = new SimpleTextElement(IdentifierSpec.Companion.Generic("au_becs_debit[bsb_number]"), new SimpleTextFieldController(new BsbConfig(banks), false, str, 2, null));
        this.textElement = simpleTextElement;
        final InterfaceC32730Eu1<String> fieldValue = simpleTextElement.getController().getFieldValue();
        this.bankName = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BsbElement.kt\ncom/stripe/android/ui/core/elements/BsbElement\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n31#3,2:224\n33#3:229\n34#3:234\n766#4:226\n857#4,2:227\n1549#4:230\n1620#4,3:231\n*S KotlinDebug\n*F\n+ 1 BsbElement.kt\ncom/stripe/android/ui/core/elements/BsbElement\n*L\n32#1:226\n32#1:227,2\n33#1:230\n33#1:231,3\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193752<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ BsbElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2", m28418f = "BsbElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193761 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193761(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193752.this.emit(null, this);
                    }
                }

                public C193752(InterfaceC33198Gu1 interfaceC33198Gu1, BsbElement bsbElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = bsbElement;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193761 c193761;
                    Object coroutine_suspended;
                    int i;
                    List list;
                    int collectionSizeOrDefault;
                    Object firstOrNull;
                    boolean startsWith$default;
                    if (continuation instanceof C193761) {
                        c193761 = (C193761) continuation;
                        int i2 = c193761.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193761.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193761.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193761.label;
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
                                list = this.this$0.banks;
                                ArrayList<BecsDebitBanks.Bank> arrayList = new ArrayList();
                                for (T t : list) {
                                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, ((BecsDebitBanks.Bank) t).getPrefix(), false, 2, null);
                                    if (startsWith$default) {
                                        arrayList.add(t);
                                    }
                                }
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                for (BecsDebitBanks.Bank bank : arrayList) {
                                    arrayList2.add(bank.getName());
                                }
                                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                                c193761.label = 1;
                                if (interfaceC33198Gu1.emit(firstOrNull, c193761) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193761 = new C193761(continuation);
                    Object obj22 = c193761.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193761.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193752(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public final InterfaceC32730Eu1<String> getBankName() {
        return this.bankName;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public Controller getController() {
        return null;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return C36708Vu1.m79257n(this.textElement.getController().isComplete(), this.textElement.getController().getFieldValue(), new BsbElement$getFormFieldValueFlow$1(this, null));
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifierSpec;
    }

    public final SimpleTextElement getTextElement$payments_ui_core_release() {
        return this.textElement;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }
}
