package com.stripe.android.p049ui.core;

import com.stripe.android.p049ui.core.elements.CardBillingAddressElement;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR!\u0010\f\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\n¢\u0006\u0002\b\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0012R)\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u00130\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0012R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u0012¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/ui/core/FormController;", "", "LtP5;", "", "Lcom/stripe/android/uicore/elements/FormElement;", "elements", "LtP5;", "getElements", "()LtP5;", "LEu1;", "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;", "Lkotlin/internal/NoInfer;", "cardBillingElement", "LEu1;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "getHiddenIdentifiers", "()LEu1;", "", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "completeFormValues", "getCompleteFormValues", "formValues", "getFormValues", "textFieldControllerIdsFlow", "lastTextFieldIdentifier", "getLastTextFieldIdentifier", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "formSpec", "Lcom/stripe/android/ui/core/forms/TransformSpecToElements;", "transformSpecToElement", "<init>", "(Lcom/stripe/android/ui/core/elements/LayoutSpec;Lcom/stripe/android/ui/core/forms/TransformSpecToElements;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFormController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,107:1\n47#2:108\n49#2:112\n47#2:113\n49#2:117\n47#2:118\n49#2:122\n47#2:123\n49#2:127\n47#2:128\n49#2:132\n47#2:133\n49#2:137\n47#2:138\n49#2:142\n50#3:109\n55#3:111\n50#3:114\n55#3:116\n50#3:119\n55#3:121\n50#3:124\n55#3:126\n50#3:129\n55#3:131\n50#3:134\n55#3:136\n50#3:139\n55#3:141\n106#4:110\n106#4:115\n106#4:120\n106#4:125\n106#4:130\n106#4:135\n106#4:140\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n32#1:108\n32#1:112\n44#1:113\n44#1:117\n52#1:118\n52#1:122\n66#1:123\n66#1:127\n74#1:128\n74#1:132\n88#1:133\n88#1:137\n92#1:138\n92#1:142\n32#1:109\n32#1:111\n44#1:114\n44#1:116\n52#1:119\n52#1:121\n66#1:124\n66#1:126\n74#1:129\n74#1:131\n88#1:134\n88#1:136\n92#1:139\n92#1:141\n32#1:110\n44#1:115\n52#1:120\n66#1:125\n74#1:130\n88#1:135\n92#1:140\n*E\n"})
/* renamed from: com.stripe.android.ui.core.FormController */
/* loaded from: classes7.dex */
public final class FormController {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<CardBillingAddressElement> cardBillingElement;
    private final InterfaceC32730Eu1<Map<IdentifierSpec, FormFieldEntry>> completeFormValues;
    private final InterfaceC49220tP5<List<FormElement>> elements;
    private final InterfaceC32730Eu1<Map<IdentifierSpec, FormFieldEntry>> formValues;
    private final InterfaceC32730Eu1<Set<IdentifierSpec>> hiddenIdentifiers;
    private final InterfaceC32730Eu1<IdentifierSpec> lastTextFieldIdentifier;
    private final InterfaceC32730Eu1<List<IdentifierSpec>> textFieldControllerIdsFlow;

    public FormController(LayoutSpec formSpec, TransformSpecToElements transformSpecToElement) {
        Intrinsics.checkNotNullParameter(formSpec, "formSpec");
        Intrinsics.checkNotNullParameter(transformSpecToElement, "transformSpecToElement");
        final GX2 m8742a = C50405vP5.m8742a(transformSpecToElement.transform(formSpec.getItems()));
        this.elements = m8742a;
        final InterfaceC32730Eu1<CardBillingAddressElement> interfaceC32730Eu1 = new InterfaceC32730Eu1<CardBillingAddressElement>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n33#3,2:224\n35#3:237\n36#3:244\n37#3:256\n800#4,11:226\n1360#4:238\n1446#4,5:239\n800#4,11:245\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n34#1:226,11\n35#1:238\n35#1:239,5\n36#1:245,11\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193522<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$1$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193531 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193531(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193522.this.emit(null, this);
                    }
                }

                public C193522(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193531 c193531;
                    Object coroutine_suspended;
                    int i;
                    Object firstOrNull;
                    if (continuation instanceof C193531) {
                        c193531 = (C193531) continuation;
                        int i2 = c193531.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193531.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193531.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193531.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                ArrayList<SectionElement> arrayList = new ArrayList();
                                for (T t : (List) obj) {
                                    if (t instanceof SectionElement) {
                                        arrayList.add(t);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (SectionElement sectionElement : arrayList) {
                                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, sectionElement.getFields());
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (T t2 : arrayList2) {
                                    if (t2 instanceof CardBillingAddressElement) {
                                        arrayList3.add(t2);
                                    }
                                }
                                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList3);
                                c193531.label = 1;
                                if (interfaceC33198Gu1.emit(firstOrNull, c193531) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193531 = new C193531(continuation);
                    Object obj22 = c193531.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193531.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super CardBillingAddressElement> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193522(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.cardBillingElement = interfaceC32730Eu1;
        InterfaceC32730Eu1<Set<IdentifierSpec>> m79285C = C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends Set<? extends IdentifierSpec>>>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n1#1,222:1\n48#2:223\n45#3:224\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C193542<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$2$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193551 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193551(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193542.this.emit(null, this);
                    }
                }

                public C193542(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193551 c193551;
                    Object coroutine_suspended;
                    int i;
                    Set emptySet;
                    InterfaceC32730Eu1<Set<IdentifierSpec>> m79281G;
                    if (continuation instanceof C193551) {
                        c193551 = (C193551) continuation;
                        int i2 = c193551.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193551.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193551.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193551.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                CardBillingAddressElement cardBillingAddressElement = (CardBillingAddressElement) obj;
                                if (cardBillingAddressElement == null || (m79281G = cardBillingAddressElement.getHiddenIdentifiers()) == null) {
                                    emptySet = SetsKt__SetsKt.emptySet();
                                    m79281G = C36708Vu1.m79281G(emptySet);
                                }
                                c193551.label = 1;
                                if (interfaceC33198Gu1.emit(m79281G, c193551) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193551 = new C193551(continuation);
                    Object obj22 = c193551.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193551.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends Set<? extends IdentifierSpec>>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193542(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        });
        this.hiddenIdentifiers = m79285C;
        final InterfaceC32730Eu1 m79257n = C36708Vu1.m79257n(C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,222:1\n48#2:223\n54#3:224\n55#3:228\n53#3:230\n1549#4:225\n1620#4,2:226\n1622#4:229\n287#5:231\n288#5:236\n37#6:232\n36#6,3:233\n106#7:237\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n54#1:225\n54#1:226,2\n54#1:229\n53#1:231\n53#1:236\n53#1:232\n53#1:233,3\n53#1:237\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C193562<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$3$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193571 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193571(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193562.this.emit(null, this);
                    }
                }

                public C193562(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193571 c193571;
                    Object coroutine_suspended;
                    int i;
                    int collectionSizeOrDefault;
                    List list;
                    if (continuation instanceof C193571) {
                        c193571 = (C193571) continuation;
                        int i2 = c193571.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193571.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193571.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193571.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                List<FormElement> list2 = (List) obj;
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                for (FormElement formElement : list2) {
                                    arrayList.add(formElement.getFormFieldValueFlow());
                                }
                                list = CollectionsKt___CollectionsKt.toList(arrayList);
                                Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
                                if (array != null) {
                                    final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                                    InterfaceC32730Eu1<Map<IdentifierSpec, ? extends FormFieldEntry>> interfaceC32730Eu1 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CONSTRUCTOR  (r2v4 'interfaceC32730Eu1' Eu1<java.util.Map<com.stripe.android.uicore.elements.IdentifierSpec, ? extends com.stripe.android.uicore.forms.FormFieldEntry>>) = (r6v8 'interfaceC32730Eu1Arr' Eu1[] A[DONT_INLINE]) call: com.stripe.android.ui.core.FormController$completeFormValues$lambda$5$$inlined$combine$1.<init>(Eu1[]):void type: CONSTRUCTOR in method: com.stripe.android.ui.core.FormController$special$$inlined$map$3.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:289)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.ui.core.FormController$completeFormValues$lambda$5$$inlined$combine$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:698)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:397)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
                                        	... 39 more
                                        */
                                    /*
                                        this = this;
                                        boolean r0 = r7 instanceof com.stripe.android.p049ui.core.FormController$special$$inlined$map$3.C193562.C193571
                                        if (r0 == 0) goto L13
                                        r0 = r7
                                        com.stripe.android.ui.core.FormController$special$$inlined$map$3$2$1 r0 = (com.stripe.android.p049ui.core.FormController$special$$inlined$map$3.C193562.C193571) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        com.stripe.android.ui.core.FormController$special$$inlined$map$3$2$1 r0 = new com.stripe.android.ui.core.FormController$special$$inlined$map$3$2$1
                                        r0.<init>(r7)
                                    L18:
                                        java.lang.Object r7 = r0.result
                                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                        int r2 = r0.label
                                        r3 = 1
                                        if (r2 == 0) goto L31
                                        if (r2 != r3) goto L29
                                        kotlin.ResultKt.throwOnFailure(r7)
                                        goto L7c
                                    L29:
                                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                        r6.<init>(r7)
                                        throw r6
                                    L31:
                                        kotlin.ResultKt.throwOnFailure(r7)
                                        Gu1 r7 = r5.$this_unsafeFlow
                                        java.util.List r6 = (java.util.List) r6
                                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                                        java.util.ArrayList r2 = new java.util.ArrayList
                                        r4 = 10
                                        int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
                                        r2.<init>(r4)
                                        java.util.Iterator r6 = r6.iterator()
                                    L49:
                                        boolean r4 = r6.hasNext()
                                        if (r4 == 0) goto L5d
                                        java.lang.Object r4 = r6.next()
                                        com.stripe.android.uicore.elements.FormElement r4 = (com.stripe.android.uicore.elements.FormElement) r4
                                        Eu1 r4 = r4.getFormFieldValueFlow()
                                        r2.add(r4)
                                        goto L49
                                    L5d:
                                        java.util.List r6 = kotlin.collections.CollectionsKt.toList(r2)
                                        java.util.Collection r6 = (java.util.Collection) r6
                                        r2 = 0
                                        Eu1[] r2 = new p000.InterfaceC32730Eu1[r2]
                                        java.lang.Object[] r6 = r6.toArray(r2)
                                        if (r6 == 0) goto L7f
                                        Eu1[] r6 = (p000.InterfaceC32730Eu1[]) r6
                                        com.stripe.android.ui.core.FormController$completeFormValues$lambda$5$$inlined$combine$1 r2 = new com.stripe.android.ui.core.FormController$completeFormValues$lambda$5$$inlined$combine$1
                                        r2.<init>(r6)
                                        r0.label = r3
                                        java.lang.Object r6 = r7.emit(r2, r0)
                                        if (r6 != r1) goto L7c
                                        return r1
                                    L7c:
                                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                        return r6
                                    L7f:
                                        java.lang.NullPointerException r6 = new java.lang.NullPointerException
                                        java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                                        r6.<init>(r7)
                                        throw r6
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.p049ui.core.FormController$special$$inlined$map$3.C193562.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // p000.InterfaceC32730Eu1
                            public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                                Object coroutine_suspended;
                                Object collect = InterfaceC32730Eu1.this.collect(new C193562(interfaceC33198Gu1), continuation);
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (collect == coroutine_suspended) {
                                    return collect;
                                }
                                return Unit.INSTANCE;
                            }
                        }), m79285C, new FormController$completeFormValues$2(null));
                        this.completeFormValues = new InterfaceC32730Eu1<Map<IdentifierSpec, ? extends FormFieldEntry>>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$4

                            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n67#3:224\n1#4:225\n1726#5,3:226\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n67#1:226,3\n*E\n"})
                            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$4$2 */
                            /* loaded from: classes7.dex */
                            public static final class C193582<T> implements InterfaceC33198Gu1 {
                                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$4$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$4$2$1 */
                                /* loaded from: classes7.dex */
                                public static final class C193591 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public C193591(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return C193582.this.emit(null, this);
                                    }
                                }

                                public C193582(InterfaceC33198Gu1 interfaceC33198Gu1) {
                                    this.$this_unsafeFlow = interfaceC33198Gu1;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                                @Override // p000.InterfaceC33198Gu1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    C193591 c193591;
                                    Object coroutine_suspended;
                                    int i;
                                    boolean z;
                                    if (continuation instanceof C193591) {
                                        c193591 = (C193591) continuation;
                                        int i2 = c193591.label;
                                        if ((i2 & Integer.MIN_VALUE) != 0) {
                                            c193591.label = i2 - Integer.MIN_VALUE;
                                            Object obj2 = c193591.result;
                                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = c193591.label;
                                            if (i == 0) {
                                                if (i == 1) {
                                                    ResultKt.throwOnFailure(obj2);
                                                } else {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                            } else {
                                                ResultKt.throwOnFailure(obj2);
                                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                                Map map = (Map) obj;
                                                Collection<FormFieldEntry> values = map.values();
                                                if (!(values instanceof Collection) || !values.isEmpty()) {
                                                    for (FormFieldEntry formFieldEntry : values) {
                                                        if (!formFieldEntry.isComplete()) {
                                                            z = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z = true;
                                                if (!z) {
                                                    map = null;
                                                }
                                                c193591.label = 1;
                                                if (interfaceC33198Gu1.emit(map, c193591) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    c193591 = new C193591(continuation);
                                    Object obj22 = c193591.result;
                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = c193591.label;
                                    if (i == 0) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // p000.InterfaceC32730Eu1
                            public Object collect(InterfaceC33198Gu1<? super Map<IdentifierSpec, ? extends FormFieldEntry>> interfaceC33198Gu1, Continuation continuation) {
                                Object coroutine_suspended;
                                Object collect = InterfaceC32730Eu1.this.collect(new C193582(interfaceC33198Gu1), continuation);
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (collect == coroutine_suspended) {
                                    return collect;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        final InterfaceC32730Eu1 m79257n2 = C36708Vu1.m79257n(C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$5

                            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,222:1\n48#2:223\n76#3:224\n77#3:228\n75#3:230\n1549#4:225\n1620#4,2:226\n1622#4:229\n287#5:231\n288#5:236\n37#6:232\n36#6,3:233\n106#7:237\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n76#1:225\n76#1:226,2\n76#1:229\n75#1:231\n75#1:236\n75#1:232\n75#1:233,3\n75#1:237\n*E\n"})
                            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$5$2 */
                            /* loaded from: classes7.dex */
                            public static final class C193602<T> implements InterfaceC33198Gu1 {
                                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$5$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$5$2$1 */
                                /* loaded from: classes7.dex */
                                public static final class C193611 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public C193611(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return C193602.this.emit(null, this);
                                    }
                                }

                                public C193602(InterfaceC33198Gu1 interfaceC33198Gu1) {
                                    this.$this_unsafeFlow = interfaceC33198Gu1;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                                @Override // p000.InterfaceC33198Gu1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    C193611 c193611;
                                    Object coroutine_suspended;
                                    int i;
                                    int collectionSizeOrDefault;
                                    List list;
                                    if (continuation instanceof C193611) {
                                        c193611 = (C193611) continuation;
                                        int i2 = c193611.label;
                                        if ((i2 & Integer.MIN_VALUE) != 0) {
                                            c193611.label = i2 - Integer.MIN_VALUE;
                                            Object obj2 = c193611.result;
                                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = c193611.label;
                                            if (i == 0) {
                                                if (i == 1) {
                                                    ResultKt.throwOnFailure(obj2);
                                                } else {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                            } else {
                                                ResultKt.throwOnFailure(obj2);
                                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                                List<FormElement> list2 = (List) obj;
                                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                                for (FormElement formElement : list2) {
                                                    arrayList.add(formElement.getFormFieldValueFlow());
                                                }
                                                list = CollectionsKt___CollectionsKt.toList(arrayList);
                                                Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
                                                if (array != null) {
                                                    final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                                                    InterfaceC32730Eu1<Map<IdentifierSpec, ? extends FormFieldEntry>> interfaceC32730Eu1 = 
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CONSTRUCTOR  (r2v4 'interfaceC32730Eu1' Eu1<java.util.Map<com.stripe.android.uicore.elements.IdentifierSpec, ? extends com.stripe.android.uicore.forms.FormFieldEntry>>) = (r6v8 'interfaceC32730Eu1Arr' Eu1[] A[DONT_INLINE]) call: com.stripe.android.ui.core.FormController$formValues$lambda$11$$inlined$combine$1.<init>(Eu1[]):void type: CONSTRUCTOR in method: com.stripe.android.ui.core.FormController$special$$inlined$map$5.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:289)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.ui.core.FormController$formValues$lambda$11$$inlined$combine$1, state: NOT_LOADED
                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:698)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:397)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
                                                        	... 39 more
                                                        */
                                                    /*
                                                        this = this;
                                                        boolean r0 = r7 instanceof com.stripe.android.p049ui.core.FormController$special$$inlined$map$5.C193602.C193611
                                                        if (r0 == 0) goto L13
                                                        r0 = r7
                                                        com.stripe.android.ui.core.FormController$special$$inlined$map$5$2$1 r0 = (com.stripe.android.p049ui.core.FormController$special$$inlined$map$5.C193602.C193611) r0
                                                        int r1 = r0.label
                                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                        r3 = r1 & r2
                                                        if (r3 == 0) goto L13
                                                        int r1 = r1 - r2
                                                        r0.label = r1
                                                        goto L18
                                                    L13:
                                                        com.stripe.android.ui.core.FormController$special$$inlined$map$5$2$1 r0 = new com.stripe.android.ui.core.FormController$special$$inlined$map$5$2$1
                                                        r0.<init>(r7)
                                                    L18:
                                                        java.lang.Object r7 = r0.result
                                                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                                        int r2 = r0.label
                                                        r3 = 1
                                                        if (r2 == 0) goto L31
                                                        if (r2 != r3) goto L29
                                                        kotlin.ResultKt.throwOnFailure(r7)
                                                        goto L7c
                                                    L29:
                                                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                                        r6.<init>(r7)
                                                        throw r6
                                                    L31:
                                                        kotlin.ResultKt.throwOnFailure(r7)
                                                        Gu1 r7 = r5.$this_unsafeFlow
                                                        java.util.List r6 = (java.util.List) r6
                                                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                                                        java.util.ArrayList r2 = new java.util.ArrayList
                                                        r4 = 10
                                                        int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
                                                        r2.<init>(r4)
                                                        java.util.Iterator r6 = r6.iterator()
                                                    L49:
                                                        boolean r4 = r6.hasNext()
                                                        if (r4 == 0) goto L5d
                                                        java.lang.Object r4 = r6.next()
                                                        com.stripe.android.uicore.elements.FormElement r4 = (com.stripe.android.uicore.elements.FormElement) r4
                                                        Eu1 r4 = r4.getFormFieldValueFlow()
                                                        r2.add(r4)
                                                        goto L49
                                                    L5d:
                                                        java.util.List r6 = kotlin.collections.CollectionsKt.toList(r2)
                                                        java.util.Collection r6 = (java.util.Collection) r6
                                                        r2 = 0
                                                        Eu1[] r2 = new p000.InterfaceC32730Eu1[r2]
                                                        java.lang.Object[] r6 = r6.toArray(r2)
                                                        if (r6 == 0) goto L7f
                                                        Eu1[] r6 = (p000.InterfaceC32730Eu1[]) r6
                                                        com.stripe.android.ui.core.FormController$formValues$lambda$11$$inlined$combine$1 r2 = new com.stripe.android.ui.core.FormController$formValues$lambda$11$$inlined$combine$1
                                                        r2.<init>(r6)
                                                        r0.label = r3
                                                        java.lang.Object r6 = r7.emit(r2, r0)
                                                        if (r6 != r1) goto L7c
                                                        return r1
                                                    L7c:
                                                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                                        return r6
                                                    L7f:
                                                        java.lang.NullPointerException r6 = new java.lang.NullPointerException
                                                        java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                                                        r6.<init>(r7)
                                                        throw r6
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.p049ui.core.FormController$special$$inlined$map$5.C193602.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                                }
                                            }

                                            @Override // p000.InterfaceC32730Eu1
                                            public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                                                Object coroutine_suspended;
                                                Object collect = InterfaceC32730Eu1.this.collect(new C193602(interfaceC33198Gu1), continuation);
                                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                if (collect == coroutine_suspended) {
                                                    return collect;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), m79285C, new FormController$formValues$2(null));
                                        this.formValues = new InterfaceC32730Eu1<Map<IdentifierSpec, ? extends FormFieldEntry>>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$6

                                            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                                            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,222:1\n48#2:223\n89#3:224\n515#4:225\n500#4,6:226\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n89#1:225\n89#1:226,6\n*E\n"})
                                            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$6$2 */
                                            /* loaded from: classes7.dex */
                                            public static final class C193622<T> implements InterfaceC33198Gu1 {
                                                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$6$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                                                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                                                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$6$2$1 */
                                                /* loaded from: classes7.dex */
                                                public static final class C193631 extends ContinuationImpl {
                                                    Object L$0;
                                                    int label;
                                                    /* synthetic */ Object result;

                                                    public C193631(Continuation continuation) {
                                                        super(continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        this.result = obj;
                                                        this.label |= Integer.MIN_VALUE;
                                                        return C193622.this.emit(null, this);
                                                    }
                                                }

                                                public C193622(InterfaceC33198Gu1 interfaceC33198Gu1) {
                                                    this.$this_unsafeFlow = interfaceC33198Gu1;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                                                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                                                @Override // p000.InterfaceC33198Gu1
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final Object emit(Object obj, Continuation continuation) {
                                                    C193631 c193631;
                                                    Object coroutine_suspended;
                                                    int i;
                                                    if (continuation instanceof C193631) {
                                                        c193631 = (C193631) continuation;
                                                        int i2 = c193631.label;
                                                        if ((i2 & Integer.MIN_VALUE) != 0) {
                                                            c193631.label = i2 - Integer.MIN_VALUE;
                                                            Object obj2 = c193631.result;
                                                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            i = c193631.label;
                                                            if (i == 0) {
                                                                if (i == 1) {
                                                                    ResultKt.throwOnFailure(obj2);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj2);
                                                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                for (Map.Entry entry : ((Map) obj).entrySet()) {
                                                                    if (((FormFieldEntry) entry.getValue()).isComplete()) {
                                                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                                                    }
                                                                }
                                                                c193631.label = 1;
                                                                if (interfaceC33198Gu1.emit(linkedHashMap, c193631) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                    c193631 = new C193631(continuation);
                                                    Object obj22 = c193631.result;
                                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    i = c193631.label;
                                                    if (i == 0) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Override // p000.InterfaceC32730Eu1
                                            public Object collect(InterfaceC33198Gu1<? super Map<IdentifierSpec, ? extends FormFieldEntry>> interfaceC33198Gu1, Continuation continuation) {
                                                Object coroutine_suspended;
                                                Object collect = InterfaceC32730Eu1.this.collect(new C193622(interfaceC33198Gu1), continuation);
                                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                if (collect == coroutine_suspended) {
                                                    return collect;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final InterfaceC32730Eu1 m79249v = C36708Vu1.m79249v(m8742a);
                                        InterfaceC32730Eu1<List<IdentifierSpec>> m79285C2 = C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends List<? extends IdentifierSpec>>>() { // from class: com.stripe.android.ui.core.FormController$special$$inlined$map$7

                                            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                                            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormController.kt\ncom/stripe/android/ui/core/FormController\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,222:1\n48#2:223\n93#3:224\n1549#4:225\n1620#4,3:226\n287#5:229\n288#5:234\n37#6:230\n36#6,3:231\n106#7:235\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController\n*L\n93#1:225\n93#1:226,3\n93#1:229\n93#1:234\n93#1:230\n93#1:231,3\n93#1:235\n*E\n"})
                                            /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$7$2 */
                                            /* loaded from: classes7.dex */
                                            public static final class C193642<T> implements InterfaceC33198Gu1 {
                                                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                                @DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$special$$inlined$map$7$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                                                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                                                /* renamed from: com.stripe.android.ui.core.FormController$special$$inlined$map$7$2$1 */
                                                /* loaded from: classes7.dex */
                                                public static final class C193651 extends ContinuationImpl {
                                                    Object L$0;
                                                    int label;
                                                    /* synthetic */ Object result;

                                                    public C193651(Continuation continuation) {
                                                        super(continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        this.result = obj;
                                                        this.label |= Integer.MIN_VALUE;
                                                        return C193642.this.emit(null, this);
                                                    }
                                                }

                                                public C193642(InterfaceC33198Gu1 interfaceC33198Gu1) {
                                                    this.$this_unsafeFlow = interfaceC33198Gu1;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                                                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                                                @Override // p000.InterfaceC33198Gu1
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final Object emit(Object obj, Continuation continuation) {
                                                    C193651 c193651;
                                                    Object coroutine_suspended;
                                                    int i;
                                                    int collectionSizeOrDefault;
                                                    List list;
                                                    if (continuation instanceof C193651) {
                                                        c193651 = (C193651) continuation;
                                                        int i2 = c193651.label;
                                                        if ((i2 & Integer.MIN_VALUE) != 0) {
                                                            c193651.label = i2 - Integer.MIN_VALUE;
                                                            Object obj2 = c193651.result;
                                                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            i = c193651.label;
                                                            if (i == 0) {
                                                                if (i == 1) {
                                                                    ResultKt.throwOnFailure(obj2);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj2);
                                                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                                                List<FormElement> list2 = (List) obj;
                                                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                                                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                                                for (FormElement formElement : list2) {
                                                                    arrayList.add(formElement.getTextFieldIdentifiers());
                                                                }
                                                                list = CollectionsKt___CollectionsKt.toList(arrayList);
                                                                Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
                                                                if (array != null) {
                                                                    final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                                                                    InterfaceC32730Eu1<List<? extends IdentifierSpec>> interfaceC32730Eu1 = 
                                                                    /*  JADX ERROR: Method code generation error
                                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CONSTRUCTOR  (r2v4 'interfaceC32730Eu1' Eu1<java.util.List<? extends com.stripe.android.uicore.elements.IdentifierSpec>>) = (r6v8 'interfaceC32730Eu1Arr' Eu1[] A[DONT_INLINE]) call: com.stripe.android.ui.core.FormController$textFieldControllerIdsFlow$lambda$16$$inlined$combine$1.<init>(Eu1[]):void type: CONSTRUCTOR in method: com.stripe.android.ui.core.FormController$special$$inlined$map$7.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
                                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:289)
                                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
                                                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.ui.core.FormController$textFieldControllerIdsFlow$lambda$16$$inlined$combine$1, state: NOT_LOADED
                                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:698)
                                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:397)
                                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
                                                                        	... 39 more
                                                                        */
                                                                    /*
                                                                        this = this;
                                                                        boolean r0 = r7 instanceof com.stripe.android.p049ui.core.FormController$special$$inlined$map$7.C193642.C193651
                                                                        if (r0 == 0) goto L13
                                                                        r0 = r7
                                                                        com.stripe.android.ui.core.FormController$special$$inlined$map$7$2$1 r0 = (com.stripe.android.p049ui.core.FormController$special$$inlined$map$7.C193642.C193651) r0
                                                                        int r1 = r0.label
                                                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                                        r3 = r1 & r2
                                                                        if (r3 == 0) goto L13
                                                                        int r1 = r1 - r2
                                                                        r0.label = r1
                                                                        goto L18
                                                                    L13:
                                                                        com.stripe.android.ui.core.FormController$special$$inlined$map$7$2$1 r0 = new com.stripe.android.ui.core.FormController$special$$inlined$map$7$2$1
                                                                        r0.<init>(r7)
                                                                    L18:
                                                                        java.lang.Object r7 = r0.result
                                                                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                                                        int r2 = r0.label
                                                                        r3 = 1
                                                                        if (r2 == 0) goto L31
                                                                        if (r2 != r3) goto L29
                                                                        kotlin.ResultKt.throwOnFailure(r7)
                                                                        goto L7c
                                                                    L29:
                                                                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                                                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                                                        r6.<init>(r7)
                                                                        throw r6
                                                                    L31:
                                                                        kotlin.ResultKt.throwOnFailure(r7)
                                                                        Gu1 r7 = r5.$this_unsafeFlow
                                                                        java.util.List r6 = (java.util.List) r6
                                                                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                                                                        java.util.ArrayList r2 = new java.util.ArrayList
                                                                        r4 = 10
                                                                        int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
                                                                        r2.<init>(r4)
                                                                        java.util.Iterator r6 = r6.iterator()
                                                                    L49:
                                                                        boolean r4 = r6.hasNext()
                                                                        if (r4 == 0) goto L5d
                                                                        java.lang.Object r4 = r6.next()
                                                                        com.stripe.android.uicore.elements.FormElement r4 = (com.stripe.android.uicore.elements.FormElement) r4
                                                                        Eu1 r4 = r4.getTextFieldIdentifiers()
                                                                        r2.add(r4)
                                                                        goto L49
                                                                    L5d:
                                                                        java.util.List r6 = kotlin.collections.CollectionsKt.toList(r2)
                                                                        java.util.Collection r6 = (java.util.Collection) r6
                                                                        r2 = 0
                                                                        Eu1[] r2 = new p000.InterfaceC32730Eu1[r2]
                                                                        java.lang.Object[] r6 = r6.toArray(r2)
                                                                        if (r6 == 0) goto L7f
                                                                        Eu1[] r6 = (p000.InterfaceC32730Eu1[]) r6
                                                                        com.stripe.android.ui.core.FormController$textFieldControllerIdsFlow$lambda$16$$inlined$combine$1 r2 = new com.stripe.android.ui.core.FormController$textFieldControllerIdsFlow$lambda$16$$inlined$combine$1
                                                                        r2.<init>(r6)
                                                                        r0.label = r3
                                                                        java.lang.Object r6 = r7.emit(r2, r0)
                                                                        if (r6 != r1) goto L7c
                                                                        return r1
                                                                    L7c:
                                                                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                                                        return r6
                                                                    L7f:
                                                                        java.lang.NullPointerException r6 = new java.lang.NullPointerException
                                                                        java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                                                                        r6.<init>(r7)
                                                                        throw r6
                                                                    */
                                                                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.p049ui.core.FormController$special$$inlined$map$7.C193642.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                                                }
                                                            }

                                                            @Override // p000.InterfaceC32730Eu1
                                                            public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends List<? extends IdentifierSpec>>> interfaceC33198Gu1, Continuation continuation) {
                                                                Object coroutine_suspended;
                                                                Object collect = InterfaceC32730Eu1.this.collect(new C193642(interfaceC33198Gu1), continuation);
                                                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                if (collect == coroutine_suspended) {
                                                                    return collect;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        });
                                                        this.textFieldControllerIdsFlow = m79285C2;
                                                        this.lastTextFieldIdentifier = C36708Vu1.m79257n(m79285C, m79285C2, new FormController$lastTextFieldIdentifier$1(null));
                                                    }

                                                    public final InterfaceC32730Eu1<Map<IdentifierSpec, FormFieldEntry>> getCompleteFormValues() {
                                                        return this.completeFormValues;
                                                    }

                                                    public final InterfaceC49220tP5<List<FormElement>> getElements() {
                                                        return this.elements;
                                                    }

                                                    public final InterfaceC32730Eu1<Map<IdentifierSpec, FormFieldEntry>> getFormValues() {
                                                        return this.formValues;
                                                    }

                                                    public final InterfaceC32730Eu1<Set<IdentifierSpec>> getHiddenIdentifiers() {
                                                        return this.hiddenIdentifiers;
                                                    }

                                                    public final InterfaceC32730Eu1<IdentifierSpec> getLastTextFieldIdentifier() {
                                                        return this.lastTextFieldIdentifier;
                                                    }
                                                }
