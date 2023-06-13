package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LinkActivity$onCreate$1$2$1$1$5$3$1$1 extends Lambda implements Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, Unit> {
    final /* synthetic */ EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> $bottomSheetContent$delegate;
    final /* synthetic */ ZC0 $coroutineScope;
    final /* synthetic */ GU2 $sheetState;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$3$1$1$1", m28418f = "LinkActivity.kt", m28417i = {}, m28416l = {174}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$3$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189701 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> $bottomSheetContent$delegate;
        final /* synthetic */ GU2 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189701(GU2 gu2, EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> ex2, Continuation<? super C189701> continuation) {
            super(2, continuation);
            this.$sheetState = gu2;
            this.$bottomSheetContent$delegate = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C189701(this.$sheetState, this.$bottomSheetContent$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C189701) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                GU2 gu2 = this.$sheetState;
                this.label = 1;
                if (gu2.m105061i(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.$bottomSheetContent$delegate.setValue(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1$2$1$1$5$3$1$1(ZC0 zc0, GU2 gu2, EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> ex2) {
        super(1);
        this.$coroutineScope = zc0;
        this.$sheetState = gu2;
        this.$bottomSheetContent$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, ? extends Unit> function3) {
        invoke2((Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>) function3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
        if (function3 == null) {
            Z30.m73800d(this.$coroutineScope, null, null, new C189701(this.$sheetState, this.$bottomSheetContent$delegate, null), 3, null);
        } else {
            this.$bottomSheetContent$delegate.setValue(function3);
        }
    }
}
