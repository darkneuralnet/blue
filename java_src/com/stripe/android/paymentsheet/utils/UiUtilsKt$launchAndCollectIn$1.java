package com.stripe.android.paymentsheet.utils;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1", m28418f = "UiUtils.kt", m28417i = {}, m28416l = {21}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1\n*L\n1#1,27:1\n*E\n"})
/* loaded from: classes7.dex */
public final class UiUtilsKt$launchAndCollectIn$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $action;
    final /* synthetic */ AbstractC11719f.EnumC11724b $minActiveState;
    final /* synthetic */ LifecycleOwner $owner;
    final /* synthetic */ InterfaceC32730Eu1<T> $this_launchAndCollectIn;
    int label;

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1", m28418f = "UiUtils.kt", m28417i = {}, m28416l = {22}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1\n*L\n1#1,27:1\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1 */
    /* loaded from: classes7.dex */
    public static final class C193231 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<T, Unit> $action;
        final /* synthetic */ InterfaceC32730Eu1<T> $this_launchAndCollectIn;
        int label;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1$1\n*L\n1#1,27:1\n*E\n"})
        /* renamed from: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C193241 implements InterfaceC33198Gu1<T> {
            final /* synthetic */ Function1<T, Unit> $action;

            /* JADX WARN: Multi-variable type inference failed */
            public C193241(Function1<? super T, Unit> function1) {
                this.$action = function1;
            }

            @Override // p000.InterfaceC33198Gu1
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                this.$action.invoke(t);
                return Unit.INSTANCE;
            }

            public final Object emit$$forInline(T t, final Continuation<? super Unit> continuation) {
                InlineMarker.mark(4);
                new ContinuationImpl(continuation) { // from class: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1$1$emit$1
                    int label;
                    /* synthetic */ Object result;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return UiUtilsKt$launchAndCollectIn$1.C193231.C193241.this.emit(null, this);
                    }
                };
                InlineMarker.mark(5);
                this.$action.invoke(t);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C193231(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function1<? super T, Unit> function1, Continuation<? super C193231> continuation) {
            super(2, continuation);
            this.$this_launchAndCollectIn = interfaceC32730Eu1;
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C193231(this.$this_launchAndCollectIn, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C193231) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
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
                InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.$this_launchAndCollectIn;
                C193241 c193241 = new C193241(this.$action);
                this.label = 1;
                if (interfaceC32730Eu1.collect(c193241, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.$this_launchAndCollectIn;
            C193241 c193241 = new C193241(this.$action);
            InlineMarker.mark(0);
            interfaceC32730Eu1.collect(c193241, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UiUtilsKt$launchAndCollectIn$1(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11724b enumC11724b, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function1<? super T, Unit> function1, Continuation<? super UiUtilsKt$launchAndCollectIn$1> continuation) {
        super(2, continuation);
        this.$owner = lifecycleOwner;
        this.$minActiveState = enumC11724b;
        this.$this_launchAndCollectIn = interfaceC32730Eu1;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiUtilsKt$launchAndCollectIn$1(this.$owner, this.$minActiveState, this.$this_launchAndCollectIn, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((UiUtilsKt$launchAndCollectIn$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
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
            LifecycleOwner lifecycleOwner = this.$owner;
            AbstractC11719f.EnumC11724b enumC11724b = this.$minActiveState;
            C193231 c193231 = new C193231(this.$this_launchAndCollectIn, this.$action, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m67039a(lifecycleOwner, enumC11724b, c193231, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        LifecycleOwner lifecycleOwner = this.$owner;
        AbstractC11719f.EnumC11724b enumC11724b = this.$minActiveState;
        C193231 c193231 = new C193231(this.$this_launchAndCollectIn, this.$action, null);
        InlineMarker.mark(0);
        RepeatOnLifecycleKt.m67039a(lifecycleOwner, enumC11724b, c193231, this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
