package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bE\u0010FJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016JU\u0010\u001b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00101\u001a\b\u0012\u0004\u0012\u00020\u0004008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0006008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u00104R\u001a\u0010<\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b=\u0010'R \u0010>\u001a\b\u0012\u0004\u0012\u00020\f008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b>\u00104R \u0010@\u001a\b\u0012\u0004\u0012\u00020?008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u00104R\u0017\u0010B\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010%\u001a\u0004\bC\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/DropdownFieldController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "index", "", "getSelectedItemLabel", "", "onValueChange", "rawValue", "onRawValueChange", "", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "config", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "", "displayItems", "Ljava/util/List;", "getDisplayItems", "()Ljava/util/List;", "disableDropdownWithSingleElement", "Z", "getDisableDropdownWithSingleElement", "()Z", "LGX2;", "_selectedIndex", "LGX2;", "LtP5;", "selectedIndex", "LtP5;", "getSelectedIndex", "()LtP5;", "LEu1;", "label", "LEu1;", "getLabel", "()LEu1;", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "showOptionalLabel", "getShowOptionalLabel", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "tinyMode", "getTinyMode", "initialValue", "<init>", "(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDropdownFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n47#2:82\n49#2:86\n47#2:87\n49#2:91\n50#3:83\n55#3:85\n50#3:88\n55#3:90\n106#4:84\n106#4:89\n1#5:92\n*S KotlinDebug\n*F\n+ 1 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n*L\n29#1:82\n29#1:86\n30#1:87\n30#1:91\n29#1:83\n29#1:85\n30#1:88\n30#1:90\n29#1:84\n30#1:89\n*E\n"})
/* loaded from: classes7.dex */
public final class DropdownFieldController implements InputController, SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final GX2<Integer> _selectedIndex;
    private final DropdownConfig config;
    private final boolean disableDropdownWithSingleElement;
    private final List<String> displayItems;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final InterfaceC32730Eu1<Integer> label;
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final InterfaceC49220tP5<Integer> selectedIndex;
    private final boolean showOptionalLabel;
    private final boolean tinyMode;

    public DropdownFieldController(DropdownConfig config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.displayItems = config.getDisplayItems();
        this.disableDropdownWithSingleElement = config.getDisableDropdownWithSingleElement();
        final GX2<Integer> m8742a = C50405vP5.m8742a(0);
        this._selectedIndex = m8742a;
        this.selectedIndex = m8742a;
        this.label = C50405vP5.m8742a(Integer.valueOf(config.getLabel()));
        this.fieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n*L\n1#1,222:1\n48#2:223\n29#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194512<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ DropdownFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$1$2", m28418f = "DropdownFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194521 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194521(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194512.this.emit(null, this);
                    }
                }

                public C194512(InterfaceC33198Gu1 interfaceC33198Gu1, DropdownFieldController dropdownFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = dropdownFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194521 c194521;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194521) {
                        c194521 = (C194521) continuation;
                        int i2 = c194521.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194521.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194521.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194521.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String str = this.this$0.getDisplayItems().get(((Number) obj).intValue());
                                c194521.label = 1;
                                if (interfaceC33198Gu1.emit(str, c194521) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194521 = new C194521(continuation);
                    Object obj22 = c194521.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194521.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194512(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.rawFieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n*L\n1#1,222:1\n48#2:223\n30#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C194532<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ DropdownFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$2$2", m28418f = "DropdownFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.DropdownFieldController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194541 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194541(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194532.this.emit(null, this);
                    }
                }

                public C194532(InterfaceC33198Gu1 interfaceC33198Gu1, DropdownFieldController dropdownFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = dropdownFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194541 c194541;
                    Object coroutine_suspended;
                    int i;
                    DropdownConfig dropdownConfig;
                    if (continuation instanceof C194541) {
                        c194541 = (C194541) continuation;
                        int i2 = c194541.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194541.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194541.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194541.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                int intValue = ((Number) obj).intValue();
                                dropdownConfig = this.this$0.config;
                                String str = dropdownConfig.getRawItems().get(intValue);
                                c194541.label = 1;
                                if (interfaceC33198Gu1.emit(str, c194541) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194541 = new C194541(continuation);
                    Object obj22 = c194541.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194541.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194532(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.error = C50405vP5.m8742a(null);
        this.isComplete = C50405vP5.m8742a(Boolean.TRUE);
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new DropdownFieldController$formFieldValue$1(null));
        this.tinyMode = config.getTinyMode();
        if (str != null) {
            onRawValueChange(str);
        }
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-186755585);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-186755585, i3, -1, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:65)");
        }
        DropdownFieldUIKt.DropDown(this, z, null, mo89518u, ((i3 << 3) & 112) | 8, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new DropdownFieldController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
    }

    public final boolean getDisableDropdownWithSingleElement() {
        return this.disableDropdownWithSingleElement;
    }

    public final List<String> getDisplayItems() {
        return this.displayItems;
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

    public final InterfaceC49220tP5<Integer> getSelectedIndex() {
        return this.selectedIndex;
    }

    public final String getSelectedItemLabel(int i) {
        return this.config.getSelectedItemLabel(i);
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final boolean getTinyMode() {
        return this.tinyMode;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        boolean z;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        GX2<Integer> gx2 = this._selectedIndex;
        Integer valueOf = Integer.valueOf(this.displayItems.indexOf(this.config.convertFromRaw(rawValue)));
        int i = 0;
        if (valueOf.intValue() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        gx2.setValue(Integer.valueOf(i));
    }

    public final void onValueChange(int i) {
        this._selectedIndex.setValue(Integer.valueOf(i));
    }

    public /* synthetic */ DropdownFieldController(DropdownConfig dropdownConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dropdownConfig, (i & 2) != 0 ? null : str);
    }
}
