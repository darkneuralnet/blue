package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "Lkotlin/time/Duration;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModelKt$countdownFlow$1", m28418f = "PollingViewModel.kt", m28417i = {0, 0, 1, 1, 2, 2}, m28416l = {235, 238, 240}, m28415m = "invokeSuspend", m28414n = {"$this$flow", "remainingDuration", "$this$flow", "remainingDuration", "$this$flow", "remainingDuration"}, m28413s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes7.dex */
public final class PollingViewModelKt$countdownFlow$1 extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super Duration>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingViewModelKt$countdownFlow$1(long j, Continuation<? super PollingViewModelKt$countdownFlow$1> continuation) {
        super(2, continuation);
        this.$duration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PollingViewModelKt$countdownFlow$1 pollingViewModelKt$countdownFlow$1 = new PollingViewModelKt$countdownFlow$1(this.$duration, continuation);
        pollingViewModelKt$countdownFlow$1.L$0 = obj;
        return pollingViewModelKt$countdownFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC33198Gu1<? super Duration> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        return ((PollingViewModelKt$countdownFlow$1) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0083 -> B:15:0x004a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC33198Gu1 interfaceC33198Gu1;
        long j;
        PollingViewModelKt$countdownFlow$1 pollingViewModelKt$countdownFlow$1;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    j = this.J$0;
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pollingViewModelKt$countdownFlow$1 = this;
                    Duration.Companion companion = Duration.Companion;
                    j = Duration.m118175minusLRDsOJo(j, DurationKt.toDuration(1, DurationUnit.SECONDS));
                    Duration m118138boximpl = Duration.m118138boximpl(j);
                    pollingViewModelKt$countdownFlow$1.L$0 = interfaceC33198Gu1;
                    pollingViewModelKt$countdownFlow$1.J$0 = j;
                    pollingViewModelKt$countdownFlow$1.label = 3;
                    if (interfaceC33198Gu1.emit(m118138boximpl, pollingViewModelKt$countdownFlow$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (Duration.m118139compareToLRDsOJo(j, Duration.Companion.m118242getZEROUwyO8pc()) > 0) {
                        long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                        pollingViewModelKt$countdownFlow$1.L$0 = interfaceC33198Gu1;
                        pollingViewModelKt$countdownFlow$1.J$0 = j;
                        pollingViewModelKt$countdownFlow$1.label = 2;
                        if (C48120rZ0.m15767b(duration, pollingViewModelKt$countdownFlow$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Duration.Companion companion2 = Duration.Companion;
                        j = Duration.m118175minusLRDsOJo(j, DurationKt.toDuration(1, DurationUnit.SECONDS));
                        Duration m118138boximpl2 = Duration.m118138boximpl(j);
                        pollingViewModelKt$countdownFlow$1.L$0 = interfaceC33198Gu1;
                        pollingViewModelKt$countdownFlow$1.J$0 = j;
                        pollingViewModelKt$countdownFlow$1.label = 3;
                        if (interfaceC33198Gu1.emit(m118138boximpl2, pollingViewModelKt$countdownFlow$1) == coroutine_suspended) {
                        }
                        if (Duration.m118139compareToLRDsOJo(j, Duration.Companion.m118242getZEROUwyO8pc()) > 0) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
            j = this.J$0;
            interfaceC33198Gu1 = (InterfaceC33198Gu1) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC33198Gu1 = (InterfaceC33198Gu1) this.L$0;
            j = this.$duration;
            Duration m118138boximpl3 = Duration.m118138boximpl(j);
            this.L$0 = interfaceC33198Gu1;
            this.J$0 = j;
            this.label = 1;
            if (interfaceC33198Gu1.emit(m118138boximpl3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        pollingViewModelKt$countdownFlow$1 = this;
        if (Duration.m118139compareToLRDsOJo(j, Duration.Companion.m118242getZEROUwyO8pc()) > 0) {
        }
    }
}
