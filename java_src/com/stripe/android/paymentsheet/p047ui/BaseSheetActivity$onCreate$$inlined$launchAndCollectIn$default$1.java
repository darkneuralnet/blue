package com.stripe.android.paymentsheet.p047ui;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, m28432d2 = {"T", "LZC0;", "", "com/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1", m28418f = "BaseSheetActivity.kt", m28417i = {}, m28416l = {21}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1\n*L\n1#1,27:1\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1 */
/* loaded from: classes7.dex */
public final class BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC11719f.EnumC11724b $minActiveState;
    final /* synthetic */ LifecycleOwner $owner;
    final /* synthetic */ InterfaceC32730Eu1 $this_launchAndCollectIn;
    int label;
    final /* synthetic */ BaseSheetActivity this$0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, m28432d2 = {"T", "LZC0;", "", "com/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1$1", m28418f = "BaseSheetActivity.kt", m28417i = {}, m28416l = {22}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1\n*L\n1#1,27:1\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1$1 */
    /* loaded from: classes7.dex */
    public static final class C192981 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC32730Eu1 $this_launchAndCollectIn;
        int label;
        final /* synthetic */ BaseSheetActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192981(InterfaceC32730Eu1 interfaceC32730Eu1, Continuation continuation, BaseSheetActivity baseSheetActivity) {
            super(2, continuation);
            this.$this_launchAndCollectIn = interfaceC32730Eu1;
            this.this$0 = baseSheetActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192981(this.$this_launchAndCollectIn, continuation, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192981) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32730Eu1 interfaceC32730Eu1 = this.$this_launchAndCollectIn;
                final BaseSheetActivity baseSheetActivity = this.this$0;
                InterfaceC33198Gu1<Boolean> interfaceC33198Gu1 = new InterfaceC33198Gu1<Boolean>() { // from class: com.stripe.android.paymentsheet.ui.BaseSheetActivity$onCreate$.inlined.launchAndCollectIn.default.1.1.1
                    @Override // p000.InterfaceC33198Gu1
                    public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                        if (bool.booleanValue()) {
                            BaseSheetActivity.this.finish();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC32730Eu1.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11724b enumC11724b, InterfaceC32730Eu1 interfaceC32730Eu1, Continuation continuation, BaseSheetActivity baseSheetActivity) {
        super(2, continuation);
        this.$owner = lifecycleOwner;
        this.$minActiveState = enumC11724b;
        this.$this_launchAndCollectIn = interfaceC32730Eu1;
        this.this$0 = baseSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1(this.$owner, this.$minActiveState, this.$this_launchAndCollectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C192981 c192981 = new C192981(this.$this_launchAndCollectIn, null, this.this$0);
            this.label = 1;
            if (RepeatOnLifecycleKt.m67039a(lifecycleOwner, enumC11724b, c192981, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}