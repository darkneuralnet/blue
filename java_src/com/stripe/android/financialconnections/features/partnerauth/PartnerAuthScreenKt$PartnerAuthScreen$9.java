package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreen$9 extends Lambda implements Function0<Unit> {
    final /* synthetic */ GU2 $bottomSheetState;
    final /* synthetic */ ZC0 $scope;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt$PartnerAuthScreen$9$1", m28418f = "PartnerAuthScreen.kt", m28417i = {}, m28416l = {139}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt$PartnerAuthScreen$9$1 */
    /* loaded from: classes7.dex */
    public static final class C188611 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ GU2 $bottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188611(GU2 gu2, Continuation<? super C188611> continuation) {
            super(2, continuation);
            this.$bottomSheetState = gu2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188611(this.$bottomSheetState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C188611) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                GU2 gu2 = this.$bottomSheetState;
                this.label = 1;
                if (gu2.m105061i(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthScreenKt$PartnerAuthScreen$9(ZC0 zc0, GU2 gu2) {
        super(0);
        this.$scope = zc0;
        this.$bottomSheetState = gu2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Z30.m73800d(this.$scope, null, null, new C188611(this.$bottomSheetState, null), 3, null);
    }
}
