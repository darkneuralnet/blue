package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;", "", "coordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authorizationSessionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCancelAuthorizationSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancelAuthorizationSession.kt\ncom/stripe/android/financialconnections/domain/CancelAuthorizationSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/* loaded from: classes7.dex */
public final class CancelAuthorizationSession {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final NativeAuthFlowCoordinator coordinator;
    private final FinancialConnectionsManifestRepository repository;

    public CancelAuthorizationSession(NativeAuthFlowCoordinator coordinator, FinancialConnectionsManifestRepository repository, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.coordinator = coordinator;
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        CancelAuthorizationSession$invoke$1 cancelAuthorizationSession$invoke$1;
        Object coroutine_suspended;
        int i;
        CancelAuthorizationSession cancelAuthorizationSession;
        BX2<NativeAuthFlowCoordinator.Message> invoke;
        NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth clearPartnerWebAuth;
        if (continuation instanceof CancelAuthorizationSession$invoke$1) {
            cancelAuthorizationSession$invoke$1 = (CancelAuthorizationSession$invoke$1) continuation;
            int i2 = cancelAuthorizationSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelAuthorizationSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelAuthorizationSession$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancelAuthorizationSession$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj2 = cancelAuthorizationSession$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancelAuthorizationSession = (CancelAuthorizationSession) cancelAuthorizationSession$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
                    String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                    cancelAuthorizationSession$invoke$1.L$0 = this;
                    cancelAuthorizationSession$invoke$1.label = 1;
                    obj = financialConnectionsManifestRepository.cancelAuthorizationSession(financialConnectionsSessionClientSecret, str, cancelAuthorizationSession$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cancelAuthorizationSession = this;
                }
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                invoke = cancelAuthorizationSession.coordinator.invoke();
                clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
                cancelAuthorizationSession$invoke$1.L$0 = obj;
                cancelAuthorizationSession$invoke$1.label = 2;
                if (invoke.emit(clearPartnerWebAuth, cancelAuthorizationSession$invoke$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        cancelAuthorizationSession$invoke$1 = new CancelAuthorizationSession$invoke$1(this, continuation);
        Object obj3 = cancelAuthorizationSession$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancelAuthorizationSession$invoke$1.label;
        if (i == 0) {
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) obj3;
        invoke = cancelAuthorizationSession.coordinator.invoke();
        clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
        cancelAuthorizationSession$invoke$1.L$0 = obj3;
        cancelAuthorizationSession$invoke$1.label = 2;
        if (invoke.emit(clearPartnerWebAuth, cancelAuthorizationSession$invoke$1) != coroutine_suspended) {
        }
    }
}
