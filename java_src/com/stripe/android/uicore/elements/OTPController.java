package com.stripe.android.uicore.elements;

import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/OTPController;", "Lcom/stripe/android/uicore/elements/Controller;", "", "userTyped", "filter", "", "index", Entry.TYPE_TEXT, "onValueChanged", "otpLength", "I", "getOtpLength", "()I", "Lcl2;", "keyboardType", "getKeyboardType-PjHm6EE$stripe_ui_core_release", "", "LGX2;", "fieldValues", "Ljava/util/List;", "getFieldValues$stripe_ui_core_release", "()Ljava/util/List;", "LEu1;", "fieldValue", "LEu1;", "getFieldValue", "()LEu1;", "<init>", "(I)V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOTPController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n1855#2,2:72\n287#3:65\n288#3:70\n37#4:66\n36#4,3:67\n106#5:71\n429#6:74\n502#6,5:75\n*S KotlinDebug\n*F\n+ 1 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n*L\n14#1:61\n14#1:62,3\n47#1:72,2\n18#1:65\n18#1:70\n18#1:66\n18#1:67,3\n18#1:71\n54#1:74\n54#1:75,5\n*E\n"})
/* loaded from: classes7.dex */
public final class OTPController implements Controller {
    private final InterfaceC32730Eu1<String> fieldValue;
    private final List<GX2<String>> fieldValues;
    private final int keyboardType;
    private final int otpLength;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final CharRange VALID_INPUT_RANGES = new CharRange('0', '9');

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/OTPController$Companion;", "", "()V", "VALID_INPUT_RANGES", "Lkotlin/ranges/CharRange;", "getVALID_INPUT_RANGES", "()Lkotlin/ranges/CharRange;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CharRange getVALID_INPUT_RANGES() {
            return OTPController.VALID_INPUT_RANGES;
        }

        private Companion() {
        }
    }

    public OTPController() {
        this(0, 1, null);
    }

    private final String filter(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (VALID_INPUT_RANGES.contains(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public final InterfaceC32730Eu1<String> getFieldValue() {
        return this.fieldValue;
    }

    public final List<GX2<String>> getFieldValues$stripe_ui_core_release() {
        return this.fieldValues;
    }

    /* renamed from: getKeyboardType-PjHm6EE$stripe_ui_core_release  reason: not valid java name */
    public final int m116735getKeyboardTypePjHm6EE$stripe_ui_core_release() {
        return this.keyboardType;
    }

    public final int getOtpLength() {
        return this.otpLength;
    }

    public final int onValueChanged(int i, String text) {
        boolean z;
        IntRange until;
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(text, this.fieldValues.get(i).getValue())) {
            return 0;
        }
        if (text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.fieldValues.get(i).setValue("");
            return 0;
        }
        String filter = filter(text);
        int length = filter.length();
        int i2 = this.otpLength;
        if (length == i2) {
            i = 0;
        }
        int min = Math.min(i2, filter.length());
        until = RangesKt___RangesKt.until(0, min);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            this.fieldValues.get(i + nextInt).setValue(String.valueOf(filter.charAt(nextInt)));
        }
        return min;
    }

    public OTPController(int i) {
        IntRange until;
        int collectionSizeOrDefault;
        List list;
        this.otpLength = i;
        this.keyboardType = C39329cl2.f61189b.m60911e();
        until = RangesKt___RangesKt.until(0, i);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(C50405vP5.m8742a(""));
        }
        this.fieldValues = arrayList;
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            this.fieldValue = C36708Vu1.m79255p(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.uicore.elements.OTPController$special$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.OTPController$special$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C194552 extends Lambda implements Function0<String[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C194552(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String[] invoke() {
                        return new String[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.OTPController$special$$inlined$combine$1$3", m28418f = "OTPController.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n*L\n1#1,332:1\n19#2:333\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.OTPController$special$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C194563 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super String>, String[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C194563(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, String[] strArr, Continuation<? super Unit> continuation) {
                        C194563 c194563 = new C194563(continuation);
                        c194563.L$0 = interfaceC33198Gu1;
                        c194563.L$1 = strArr;
                        return c194563.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        String joinToString$default;
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
                            joinToString$default = ArraysKt___ArraysKt.joinToString$default((String[]) ((Object[]) this.L$1), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                            this.label = 1;
                            if (((InterfaceC33198Gu1) this.L$0).emit(joinToString$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C194552(interfaceC32730Eu1Arr2), new C194563(null), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m86325a == coroutine_suspended) {
                        return m86325a;
                    }
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public /* synthetic */ OTPController(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}
