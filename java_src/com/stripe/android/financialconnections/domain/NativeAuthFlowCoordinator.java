package com.stripe.android.financialconnections.domain;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "", "LBX2;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "invoke", "flow", "LBX2;", "<init>", "()V", "Message", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class NativeAuthFlowCoordinator {
    private final BX2<Message> flow = C36748Vy5.m79031b(0, 0, null, 7, null);

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "", "ClearPartnerWebAuth", "Finish", "Terminate", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Finish;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Message {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ClearPartnerWebAuth implements Message {
            public static final int $stable = 0;
            public static final ClearPartnerWebAuth INSTANCE = new ClearPartnerWebAuth();

            private ClearPartnerWebAuth() {
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Finish;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V", "getResult", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Finish implements Message {
            public static final int $stable = 0;
            private final FinancialConnectionsSheetActivityResult result;

            public Finish(FinancialConnectionsSheetActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public static /* synthetic */ Finish copy$default(Finish finish, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    financialConnectionsSheetActivityResult = finish.result;
                }
                return finish.copy(financialConnectionsSheetActivityResult);
            }

            public final FinancialConnectionsSheetActivityResult component1() {
                return this.result;
            }

            public final Finish copy(FinancialConnectionsSheetActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                return new Finish(result);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Finish) && Intrinsics.areEqual(this.result, ((Finish) obj).result);
            }

            public final FinancialConnectionsSheetActivityResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = this.result;
                return "Finish(result=" + financialConnectionsSheetActivityResult + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "cause", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;", "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;)V", "getCause", "()Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "EarlyTerminationCause", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Terminate implements Message {
            public static final int $stable = 0;
            private final EarlyTerminationCause cause;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public enum EarlyTerminationCause {
                USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY("user_initiated_with_custom_manual_entry");
                
                private final String value;

                EarlyTerminationCause(String str) {
                    this.value = str;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            public Terminate(EarlyTerminationCause cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public static /* synthetic */ Terminate copy$default(Terminate terminate, EarlyTerminationCause earlyTerminationCause, int i, Object obj) {
                if ((i & 1) != 0) {
                    earlyTerminationCause = terminate.cause;
                }
                return terminate.copy(earlyTerminationCause);
            }

            public final EarlyTerminationCause component1() {
                return this.cause;
            }

            public final Terminate copy(EarlyTerminationCause cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new Terminate(cause);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Terminate) && this.cause == ((Terminate) obj).cause;
            }

            public final EarlyTerminationCause getCause() {
                return this.cause;
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                EarlyTerminationCause earlyTerminationCause = this.cause;
                return "Terminate(cause=" + earlyTerminationCause + ")";
            }
        }
    }

    public final BX2<Message> invoke() {
        return this.flow;
    }
}
