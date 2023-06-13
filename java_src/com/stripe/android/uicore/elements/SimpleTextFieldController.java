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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\"\u001a\u00020!8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\u0004\u0018\u0001038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010,R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\u0019\u001a\u0004\b>\u0010\u001bR \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\u0019\u001a\u0004\b@\u0010\u001bR \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\u0019\u001a\u0004\bB\u0010\u001bR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010,R \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010\u0019\u001a\u0004\bE\u0010\u001bR \u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010\u0019\u001a\u0004\bG\u0010\u001bR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010,R \u0010I\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010\u0019\u001a\u0004\bJ\u0010\u001bR\"\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010\u0019\u001a\u0004\bM\u0010\u001bR \u0010N\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010\u0019\u001a\u0004\bN\u0010\u001bR \u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010\u0019\u001a\u0004\bQ\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "", "displayFormatted", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onValueChange", "rawValue", "", "onRawValueChange", "", "newHasFocus", "onFocusChange", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "textFieldConfig", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "getTextFieldConfig", "()Lcom/stripe/android/uicore/elements/TextFieldConfig;", "showOptionalLabel", "Z", "getShowOptionalLabel", "()Z", "LEu1;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LEu1;", "getTrailingIcon", "()LEu1;", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboardType", "getKeyboardType-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "LGX2;", "", "label", "LGX2;", "getLabel", "()LGX2;", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LRu;", "autofillType", "LRu;", "getAutofillType", "()LRu;", "getAutofillType$annotations", "()V", "placeHolder", "getPlaceHolder", "_fieldValue", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "_fieldState", "fieldState", "getFieldState", "loading", "getLoading", "_hasFocus", "visibleError", "getVisibleError", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formFieldValue", "getFormFieldValue", "initialValue", "<init>", "(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n47#2:198\n49#2:202\n47#2:203\n49#2:207\n47#2:208\n49#2:212\n50#3:199\n55#3:201\n50#3:204\n55#3:206\n50#3:209\n55#3:211\n106#4:200\n106#4:205\n106#4:210\n1#5:213\n*S KotlinDebug\n*F\n+ 1 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n*L\n133#1:198\n133#1:202\n152#1:203\n152#1:207\n156#1:208\n156#1:212\n133#1:199\n133#1:201\n152#1:204\n152#1:206\n156#1:209\n156#1:211\n133#1:200\n152#1:205\n156#1:210\n*E\n"})
/* loaded from: classes7.dex */
public final class SimpleTextFieldController implements TextFieldController, SectionFieldErrorController {
    public static final int $stable = 8;
    private final GX2<TextFieldState> _fieldState;
    private final GX2<String> _fieldValue;
    private final GX2<Boolean> _hasFocus;
    private final EnumC7283Ru autofillType;
    private final int capitalization;
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
    private final GX2<String> placeHolder;
    private final InterfaceC32730Eu1<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final TextFieldConfig textFieldConfig;
    private final InterfaceC32730Eu1<TextFieldIcon> trailingIcon;
    private final InterfaceC32730Eu1<Boolean> visibleError;
    private final InterfaceC32735Eu6 visualTransformation;

    public SimpleTextFieldController(TextFieldConfig textFieldConfig, boolean z, String str) {
        EnumC7283Ru enumC7283Ru;
        Intrinsics.checkNotNullParameter(textFieldConfig, "textFieldConfig");
        this.textFieldConfig = textFieldConfig;
        this.showOptionalLabel = z;
        this.trailingIcon = textFieldConfig.getTrailingIcon();
        this.capitalization = textFieldConfig.mo116656getCapitalizationIUNYP9k();
        this.keyboardType = textFieldConfig.mo116657getKeyboardPjHm6EE();
        InterfaceC32735Eu6 visualTransformation = textFieldConfig.getVisualTransformation();
        this.visualTransformation = visualTransformation == null ? InterfaceC32735Eu6.f8291a.m108216a() : visualTransformation;
        this.label = C50405vP5.m8742a(textFieldConfig.getLabel());
        this.debugLabel = textFieldConfig.getDebugLabel();
        if (textFieldConfig instanceof DateConfig) {
            enumC7283Ru = EnumC7283Ru.CreditCardExpirationDate;
        } else if (textFieldConfig instanceof PostalCodeConfig) {
            enumC7283Ru = EnumC7283Ru.PostalCode;
        } else if (textFieldConfig instanceof EmailConfig) {
            enumC7283Ru = EnumC7283Ru.EmailAddress;
        } else {
            enumC7283Ru = textFieldConfig instanceof NameConfig ? EnumC7283Ru.PersonFullName : null;
        }
        this.autofillType = enumC7283Ru;
        this.placeHolder = C50405vP5.m8742a(textFieldConfig.getPlaceHolder());
        final GX2<String> m8742a = C50405vP5.m8742a("");
        this._fieldValue = m8742a;
        this.fieldValue = m8742a;
        this.rawFieldValue = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n*L\n1#1,222:1\n48#2:223\n133#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194882<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ SimpleTextFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$1$2", m28418f = "TextFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194891 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194891(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194882.this.emit(null, this);
                    }
                }

                public C194882(InterfaceC33198Gu1 interfaceC33198Gu1, SimpleTextFieldController simpleTextFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = simpleTextFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194891 c194891;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C194891) {
                        c194891 = (C194891) continuation;
                        int i2 = c194891.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194891.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194891.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194891.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String convertToRaw = this.this$0.getTextFieldConfig().convertToRaw((String) obj);
                                c194891.label = 1;
                                if (interfaceC33198Gu1.emit(convertToRaw, c194891) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194891 = new C194891(continuation);
                    Object obj22 = c194891.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194891.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194882(interfaceC33198Gu1, this), continuation);
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
        this.loading = textFieldConfig.getLoading();
        GX2<Boolean> m8742a3 = C50405vP5.m8742a(Boolean.FALSE);
        this._hasFocus = m8742a3;
        this.visibleError = C36708Vu1.m79257n(m8742a2, m8742a3, new SimpleTextFieldController$visibleError$1(null));
        final InterfaceC32730Eu1<Boolean> visibleError = getVisibleError();
        this.error = new InterfaceC32730Eu1<FieldError>() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n153#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C194902<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ SimpleTextFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$2$2", m28418f = "TextFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194911 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194911(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194902.this.emit(null, this);
                    }
                }

                public C194902(InterfaceC33198Gu1 interfaceC33198Gu1, SimpleTextFieldController simpleTextFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = simpleTextFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194911 c194911;
                    Object coroutine_suspended;
                    int i;
                    GX2 gx2;
                    if (continuation instanceof C194911) {
                        c194911 = (C194911) continuation;
                        int i2 = c194911.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194911.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194911.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194911.label;
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
                                c194911.label = 1;
                                if (interfaceC33198Gu1.emit(error, c194911) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194911 = new C194911(continuation);
                    Object obj22 = c194911.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194911.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194902(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.isComplete = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n*L\n1#1,222:1\n48#2:223\n157#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C194922<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ SimpleTextFieldController this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$3$2", m28418f = "TextFieldController.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SimpleTextFieldController$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194931 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194931(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194922.this.emit(null, this);
                    }
                }

                public C194922(InterfaceC33198Gu1 interfaceC33198Gu1, SimpleTextFieldController simpleTextFieldController) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = simpleTextFieldController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194931 c194931;
                    Object coroutine_suspended;
                    int i;
                    boolean z;
                    if (continuation instanceof C194931) {
                        c194931 = (C194931) continuation;
                        int i2 = c194931.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194931.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194931.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194931.label;
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
                                c194931.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c194931) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194931 = new C194931(continuation);
                    Object obj22 = c194931.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194931.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194922(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.formFieldValue = C36708Vu1.m79257n(isComplete(), getRawFieldValue(), new SimpleTextFieldController$formFieldValue$1(null));
        if (str != null) {
            onRawValueChange(str);
        }
    }

    public static /* synthetic */ void getAutofillType$annotations() {
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement sectionFieldElement, InterfaceC41563gV2 interfaceC41563gV2, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        TextFieldController.DefaultImpls.m116749ComposeUIMxjM1cc(this, z, sectionFieldElement, interfaceC41563gV2, set, identifierSpec, i, i2, interfaceC32720Et0, i3);
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

    @Override // com.stripe.android.uicore.elements.InputController
    public InterfaceC32730Eu1<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final TextFieldConfig getTextFieldConfig() {
        return this.textFieldConfig;
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

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onFocusChange(boolean z) {
        this._hasFocus.setValue(Boolean.valueOf(z));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(this.textFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.textFieldConfig.filter(displayFormatted));
        this._fieldState.setValue(this.textFieldConfig.determineState(this._fieldValue.getValue()));
        if (!Intrinsics.areEqual(this._fieldState.getValue(), this._fieldState.getValue())) {
            return this._fieldState.getValue();
        }
        return null;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public GX2<Integer> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public GX2<String> getPlaceHolder() {
        return this.placeHolder;
    }

    public /* synthetic */ SimpleTextFieldController(TextFieldConfig textFieldConfig, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldConfig, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }
}
