package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.DateConfig;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.elements.RowController;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SectionFieldComposable;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u00106\u001a\u000205\u0012\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010807\u0012\b\b\u0002\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<JU\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050(8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b-\u0010.R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "", "label", "Ljava/lang/Integer;", "getLabel", "()Ljava/lang/Integer;", "Lcom/stripe/android/ui/core/elements/CardNumberElement;", "numberElement", "Lcom/stripe/android/ui/core/elements/CardNumberElement;", "getNumberElement", "()Lcom/stripe/android/ui/core/elements/CardNumberElement;", "Lcom/stripe/android/ui/core/elements/CvcElement;", "cvcElement", "Lcom/stripe/android/ui/core/elements/CvcElement;", "getCvcElement", "()Lcom/stripe/android/ui/core/elements/CvcElement;", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "expirationDateElement", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "getExpirationDateElement", "()Lcom/stripe/android/uicore/elements/SimpleTextElement;", "", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "rowFields", "Ljava/util/List;", "fields", "getFields", "()Ljava/util/List;", "LEu1;", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "LEu1;", "getError", "()LEu1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", NamedConstantsKt.INITIAL_VALUES, "cardNumberReadOnly", "<init>", "(Landroid/content/Context;Ljava/util/Map;Z)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardDetailsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsController.kt\ncom/stripe/android/ui/core/elements/CardDetailsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,96:1\n1549#2:97\n1620#2,3:98\n1549#2:101\n1620#2,3:102\n287#3:105\n288#3:110\n37#4:106\n36#4,3:107\n106#5:111\n*S KotlinDebug\n*F\n+ 1 CardDetailsController.kt\ncom/stripe/android/ui/core/elements/CardDetailsController\n*L\n72#1:97\n72#1:98,3\n73#1:101\n73#1:102,3\n70#1:105\n70#1:110\n70#1:106\n70#1:107,3\n70#1:111\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsController */
/* loaded from: classes7.dex */
public final class CardDetailsController implements SectionFieldErrorController, SectionFieldComposable {
    private final CvcElement cvcElement;
    private final InterfaceC32730Eu1<FieldError> error;
    private final SimpleTextElement expirationDateElement;
    private final List<SectionFieldElement> fields;
    private final Integer label;
    private final CardNumberElement numberElement;
    private final List<SectionSingleFieldElement> rowFields;

    public CardDetailsController(Context context, Map<IdentifierSpec, String> initialValues, boolean z) {
        CardNumberController cardNumberEditableController;
        List<SectionSingleFieldElement> listOf;
        List<SectionFieldElement> listOf2;
        List listOf3;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List list;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec cardNumber = companion.getCardNumber();
        if (z) {
            cardNumberEditableController = new CardNumberViewOnlyController(new CardNumberConfig(), initialValues);
        } else {
            cardNumberEditableController = new CardNumberEditableController(new CardNumberConfig(), context, initialValues.get(companion.getCardNumber()));
        }
        CardNumberElement cardNumberElement = new CardNumberElement(cardNumber, cardNumberEditableController);
        this.numberElement = cardNumberElement;
        CvcElement cvcElement = new CvcElement(companion.getCardCvc(), new CvcController(new CvcConfig(), cardNumberElement.getController().getCardBrandFlow(), initialValues.get(companion.getCardCvc()), false, 8, null));
        this.cvcElement = cvcElement;
        IdentifierSpec Generic = companion.Generic("date");
        DateConfig dateConfig = new DateConfig();
        String str = initialValues.get(companion.getCardExpMonth());
        String str2 = initialValues.get(companion.getCardExpYear());
        String takeLast = str2 != null ? StringsKt___StringsKt.takeLast(str2, 2) : null;
        SimpleTextElement simpleTextElement = new SimpleTextElement(Generic, new SimpleTextFieldController(dateConfig, false, ((Object) str) + takeLast, 2, null));
        this.expirationDateElement = simpleTextElement;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{simpleTextElement, cvcElement});
        this.rowFields = listOf;
        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new SectionFieldElement[]{cardNumberElement, new RowElement(companion.Generic("row_" + leastSignificantBits), listOf, new RowController(listOf))});
        this.fields = listOf2;
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{cardNumberElement, simpleTextElement, cvcElement});
        List<SectionSingleFieldElement> list2 = listOf3;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList<InputController> arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionSingleFieldElement sectionSingleFieldElement : list2) {
            arrayList.add(sectionSingleFieldElement.getController());
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (InputController inputController : arrayList) {
            arrayList2.add(inputController.getError());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList2);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            this.error = new InterfaceC32730Eu1<FieldError>() { // from class: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C193792 extends Lambda implements Function0<FieldError[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C193792(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final FieldError[] invoke() {
                        return new FieldError[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1$3", m28418f = "CardDetailsController.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 CardDetailsController.kt\ncom/stripe/android/ui/core/elements/CardDetailsController\n*L\n1#1,332:1\n75#2:333\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C193803 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super FieldError>, FieldError[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C193803(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, FieldError[] fieldErrorArr, Continuation<? super Unit> continuation) {
                        C193803 c193803 = new C193803(continuation);
                        c193803.L$0 = interfaceC33198Gu1;
                        c193803.L$1 = fieldErrorArr;
                        return c193803.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        List filterNotNull;
                        Object firstOrNull;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            filterNotNull = ArraysKt___ArraysKt.filterNotNull((FieldError[]) ((Object[]) this.L$1));
                            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) filterNotNull);
                            this.label = 1;
                            if (((InterfaceC33198Gu1) this.L$0).emit(firstOrNull, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C193792(interfaceC32730Eu1Arr2), new C193803(null), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m86325a == coroutine_suspended) {
                        return m86325a;
                    }
                    return Unit.INSTANCE;
                }
            };
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc  reason: not valid java name */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1407073849);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1407073849, i3, -1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:78)");
        }
        CardDetailsElementUIKt.CardDetailsElementUI(z, this, hiddenIdentifiers, identifierSpec, mo89518u, (i3 & 14) | 576 | (IdentifierSpec.$stable << 9) | ((i3 >> 3) & 7168));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CardDetailsController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
    }

    public final CvcElement getCvcElement() {
        return this.cvcElement;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    public final SimpleTextElement getExpirationDateElement() {
        return this.expirationDateElement;
    }

    public final List<SectionFieldElement> getFields() {
        return this.fields;
    }

    public final Integer getLabel() {
        return this.label;
    }

    public final CardNumberElement getNumberElement() {
        return this.numberElement;
    }

    public /* synthetic */ CardDetailsController(Context context, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, (i & 4) != 0 ? false : z);
    }
}
