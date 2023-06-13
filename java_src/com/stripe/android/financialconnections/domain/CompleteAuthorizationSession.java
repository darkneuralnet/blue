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
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;", "", "coordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authorizationSessionId", "", "publicToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCompleteAuthorizationSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompleteAuthorizationSession.kt\ncom/stripe/android/financialconnections/domain/CompleteAuthorizationSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* loaded from: classes7.dex */
public final class CompleteAuthorizationSession {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final NativeAuthFlowCoordinator coordinator;
    private final FinancialConnectionsManifestRepository repository;

    public CompleteAuthorizationSession(NativeAuthFlowCoordinator coordinator, FinancialConnectionsManifestRepository repository, FinancialConnectionsSheet.Configuration configuration) {
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
    public final Object invoke(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        CompleteAuthorizationSession$invoke$1 completeAuthorizationSession$invoke$1;
        Object coroutine_suspended;
        int i;
        CompleteAuthorizationSession completeAuthorizationSession;
        BX2<NativeAuthFlowCoordinator.Message> invoke;
        NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth clearPartnerWebAuth;
        if (continuation instanceof CompleteAuthorizationSession$invoke$1) {
            completeAuthorizationSession$invoke$1 = (CompleteAuthorizationSession$invoke$1) continuation;
            int i2 = completeAuthorizationSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                completeAuthorizationSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = completeAuthorizationSession$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = completeAuthorizationSession$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj2 = completeAuthorizationSession$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completeAuthorizationSession = (CompleteAuthorizationSession) completeAuthorizationSession$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
                    String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                    completeAuthorizationSession$invoke$1.L$0 = this;
                    completeAuthorizationSession$invoke$1.label = 1;
                    obj = financialConnectionsManifestRepository.completeAuthorizationSession(financialConnectionsSessionClientSecret, str, str2, completeAuthorizationSession$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completeAuthorizationSession = this;
                }
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                invoke = completeAuthorizationSession.coordinator.invoke();
                clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
                completeAuthorizationSession$invoke$1.L$0 = obj;
                completeAuthorizationSession$invoke$1.label = 2;
                if (invoke.emit(clearPartnerWebAuth, completeAuthorizationSession$invoke$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        completeAuthorizationSession$invoke$1 = new CompleteAuthorizationSession$invoke$1(this, continuation);
        Object obj3 = completeAuthorizationSession$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = completeAuthorizationSession$invoke$1.label;
        if (i == 0) {
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) obj3;
        invoke = completeAuthorizationSession.coordinator.invoke();
        clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
        completeAuthorizationSession$invoke$1.L$0 = obj3;
        completeAuthorizationSession$invoke$1.label = 2;
        if (invoke.emit(clearPartnerWebAuth, completeAuthorizationSession$invoke$1) != coroutine_suspended) {
        }
    }
}
