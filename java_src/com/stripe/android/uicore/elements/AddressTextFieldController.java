package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bd\u0010eJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016JU\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001e\u001a\u00020\u000bR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010,\u001a\u00020+8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00101\u001a\u0002008\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\"\u0010G\u001a\u0004\u0018\u00010F8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010L\u001a\u0004\bI\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010?R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010(\u001a\u0004\bO\u0010*R \u0010P\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010*R \u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010(\u001a\u0004\bS\u0010*R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010?R \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010(\u001a\u0004\bV\u0010*R \u0010W\u001a\b\u0012\u0004\u0012\u00020\t0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010(\u001a\u0004\bX\u0010*R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010?R \u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010(\u001a\u0004\b[\u0010*R\"\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010(\u001a\u0004\b^\u0010*R \u0010_\u001a\b\u0012\u0004\u0012\u00020\t0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010(\u001a\u0004\b_\u0010*R \u0010a\u001a\b\u0012\u0004\u0012\u00020`0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010(\u001a\u0004\bb\u0010*\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006f"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressTextFieldController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "displayFormatted", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onValueChange", "", "newHasFocus", "", "onFocusChange", "rawValue", "onRawValueChange", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "launchAutocompleteScreen", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "config", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "Lkotlin/Function0;", "onNavigation", "Lkotlin/jvm/functions/Function0;", "LEu1;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LEu1;", "getTrailingIcon", "()LEu1;", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboardType", "getKeyboardType-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "LGX2;", "", "label", "LGX2;", "getLabel", "()LGX2;", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LRu;", "autofillType", "LRu;", "getAutofillType", "()LRu;", "getAutofillType$annotations", "()V", "_fieldValue", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "_fieldState", "fieldState", "getFieldState", "loading", "getLoading", "_hasFocus", "visibleError", "getVisibleError", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "initialValue", "<init>", "(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,120:1\n1#2:121\n47#3:122\n49#3:126\n47#3:127\n49#3:131\n47#3:132\n49#3:136\n50#4:123\n55#4:125\n50#4:128\n55#4:130\n50#4:133\n55#4:135\n106#5:124\n106#5:129\n106#5:134\n*S KotlinDebug\n*F\n+ 1 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n*L\n46#1:122\n46#1:126\n65#1:127\n65#1:131\n69#1:132\n69#1:136\n46#1:123\n46#1:125\n65#1:128\n65#1:130\n69#1:133\n69#1:135\n46#1:124\n65#1:129\n69#1:134\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressTextFieldController implements TextFieldController, InputController, SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final GX2<TextFieldState> _fieldState;
    private final GX2<String> _fieldValue;
    private final GX2<Boolean> _hasFocus;
    private final EnumC7283Ru autofillType;
    private final int capitalization;
    private final TextFieldConfig config;
    private final InterfaceC32730Eu1<String> contentDescription;
    private final String debugLabel;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<TextFieldState> fieldState;
    private final InterfaceC32730Eu1<String> fieldValue;
    private final InterfaceC32730Eu1<FormFieldEntry> formFieldValue;
    private final InterfaceC32730Eu1<Boolean> isComplete;
    private final int keyboardType;
    private final GX2<Integer> label;
    private final InterfaceC32730Eu1<Boolean> loading;
    private final Function0<Unit> onNavigation;
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final InterfaceC32730Eu1<TextFieldIcon> trailingIcon;
    private final InterfaceC32730Eu1<Boolean> visibleError;
    private final InterfaceC32735Eu6 visualTransformation;

    public AddressTextFieldController(TextFieldConfig config, Function0<Unit> function0, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.onNavigation = function0;
        if (str != null) {
            onRawValueChange(str);
        }
        this.trailingIcon = config.getTrailingIcon();
        this.capitalization = config.mo116656getCapitalizationIUNYP9k();
        this.keyboardType = config.mo116657getKeyboardPjHm6EE();
        InterfaceC32735Eu6 visualTransformation = config.getVisualTransformation();
        this.visualTransformation = visualTransformation == null ? InterfaceC32735Eu6.f8291a.m108216a() : visualTransformation;
        this.label = C50405vP5.m8742a(config.getLabel());
        this.debugLabel = config.getDebugLabel();
        final GX2<String> m8742a = C50405vP5.m8742a("");
        this._fieldValue = m8742a;
        this.fieldValue = m8742a;
        this.rawFieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n*L\n1#1,222:1\n48#2:223\n46#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194422<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ AddressTextFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$1$2", m28418f = "AddressTextFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194431 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194431(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194422.this.emit(null, this);
                    }
                }

                public C194422(InterfaceC33198Gu1 interfaceC33198Gu1, AddressTextFieldController addressTextFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = addressTextFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194431 c194431;
                    Object coroutine_suspended;
                    int i;
                    TextFieldConfig textFieldConfig;
                    if (continuation instanceof C194431) {
                        c194431 = (C194431) continuation;
                        int i2 = c194431.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194431.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194431.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194431.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                textFieldConfig = this.this$0.config;
                                String convertToRaw = textFieldConfig.convertToRaw((String) obj);
                                c194431.label = 1;
                                if (interfaceC33198Gu1.emit(convertToRaw, c194431) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194431 = new C194431(continuation);
                    Object obj22 = c194431.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194431.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194422(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.contentDescription = m8742a;
        final GX2<TextFieldState> m8742a2 = C50405vP5.m8742a(TextFieldStateConstants.Error.Blank.INSTANCE);
        this._fieldState = m8742a2;
        this.fieldState = m8742a2;
        this.loading = config.getLoading();
        GX2<Boolean> m8742a3 = C50405vP5.m8742a(Boolean.FALSE);
        this._hasFocus = m8742a3;
        this.visibleError = C36708Vu1.m79257n(m8742a2, m8742a3, new AddressTextFieldController$visibleError$1(null));
        final InterfaceC32730Eu1<Boolean> visibleError = getVisibleError();
        this.error = new InterfaceC32730Eu1<FieldError>() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n66#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C194442<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ AddressTextFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$2$2", m28418f = "AddressTextFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194451 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194451(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194442.this.emit(null, this);
                    }
                }

                public C194442(InterfaceC33198Gu1 interfaceC33198Gu1, AddressTextFieldController addressTextFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = addressTextFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194451 c194451;
                    Object coroutine_suspended;
                    int i;
                    GX2 gx2;
                    if (continuation instanceof C194451) {
                        c194451 = (C194451) continuation;
                        int i2 = c194451.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194451.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194451.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194451.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                gx2 = this.this$0._fieldState;
                                FieldError error = ((TextFieldState) gx2.getValue()).getError();
                                if (error == null || !booleanValue) {
                                    error = null;
                                }
                                c194451.label = 1;
                                if (interfaceC33198Gu1.emit(error, c194451) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194451 = new C194451(continuation);
                    Object obj22 = c194451.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194451.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194442(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.isComplete = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n*L\n1#1,222:1\n48#2:223\n70#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C194462<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ AddressTextFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$3$2", m28418f = "AddressTextFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.AddressTextFieldController$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194471 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194471(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194462.this.emit(null, this);
                    }
                }

                public C194462(InterfaceC33198Gu1 interfaceC33198Gu1, AddressTextFieldController addressTextFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = addressTextFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194471 c194471;
                    Object coroutine_suspended;
                    int i;
                    boolean z;
                    if (continuation instanceof C194471) {
                        c194471 = (C194471) continuation;
                        int i2 = c194471.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194471.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194471.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194471.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                TextFieldState textFieldState = (TextFieldState) obj;
                                if (!textFieldState.isValid() && (textFieldState.isValid() || !this.this$0.getShowOptionalLabel() || !textFieldState.isBlank())) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                Boolean boxBoolean = Boxing.boxBoolean(z);
                                c194471.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c194471) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194471 = new C194471(continuation);
                    Object obj22 = c194471.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194471.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194462(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new AddressTextFieldController$formFieldValue$1(null));
    }

    public static /* synthetic */ void getAutofillType$annotations() {
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2122817753);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2122817753, i3, -1, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:103)");
        }
        AddressTextFieldUIKt.AddressTextFieldUI(this, null, mo89518u, 8, 2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AddressTextFieldController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
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

    public final void launchAutocompleteScreen() {
        Function0<Unit> function0 = this.onNavigation;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onFocusChange(boolean z) {
        this._hasFocus.setValue(Boolean.valueOf(z));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(this.config.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.config.filter(displayFormatted));
        this._fieldState.setValue(this.config.determineState(this._fieldValue.getValue()));
        if (!Intrinsics.areEqual(this._fieldState.getValue(), this._fieldState.getValue())) {
            return this._fieldState.getValue();
        }
        return null;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public GX2<Integer> getLabel() {
        return this.label;
    }

    public /* synthetic */ AddressTextFieldController(TextFieldConfig textFieldConfig, Function0 function0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldConfig, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : str);
    }
}
