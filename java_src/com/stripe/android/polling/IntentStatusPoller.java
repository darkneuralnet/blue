package com.stripe.android.polling;

import ch.qos.logback.core.joran.action.Action;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H&R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/polling/IntentStatusPoller;", "", "LZC0;", Action.SCOPE_ATTRIBUTE, "", "startPolling", "Lcom/stripe/android/model/StripeIntent$Status;", "forcePoll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopPolling", "LtP5;", "getState", "()LtP5;", TransferTable.COLUMN_STATE, "Config", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface IntentStatusPoller {

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/polling/IntentStatusPoller$Config;", "", "clientSecret", "", "maxAttempts", "", "(Ljava/lang/String;I)V", "getClientSecret", "()Ljava/lang/String;", "getMaxAttempts", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Config {
        public static final int $stable = 0;
        private final String clientSecret;
        private final int maxAttempts;

        public Config(String clientSecret, int i) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.maxAttempts = i;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = config.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = config.maxAttempts;
            }
            return config.copy(str, i);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final int component2() {
            return this.maxAttempts;
        }

        public final Config copy(String clientSecret, int i) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Config(clientSecret, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                Config config = (Config) obj;
                return Intrinsics.areEqual(this.clientSecret, config.clientSecret) && this.maxAttempts == config.maxAttempts;
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int hashCode() {
            return (this.clientSecret.hashCode() * 31) + Integer.hashCode(this.maxAttempts);
        }

        public String toString() {
            String str = this.clientSecret;
            int i = this.maxAttempts;
            return "Config(clientSecret=" + str + ", maxAttempts=" + i + ")";
        }
    }

    Object forcePoll(Continuation<? super StripeIntent.Status> continuation);

    InterfaceC49220tP5<StripeIntent.Status> getState();

    void startPolling(ZC0 zc0);

    void stopPolling();
}
