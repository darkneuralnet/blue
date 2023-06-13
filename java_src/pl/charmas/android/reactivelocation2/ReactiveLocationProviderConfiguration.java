package pl.charmas.android.reactivelocation2;

import android.os.Handler;
/* loaded from: classes8.dex */
public class ReactiveLocationProviderConfiguration {
    private final Handler customCallbackHandler;
    private final boolean retryOnConnectionSuspended;

    /* loaded from: classes8.dex */
    public static class Builder {
        private Handler customCallbackHandler = null;
        private boolean retryOnConnectionSuspended = false;

        public ReactiveLocationProviderConfiguration build() {
            return new ReactiveLocationProviderConfiguration(this);
        }

        public Builder setCustomCallbackHandler(Handler handler) {
            this.customCallbackHandler = handler;
            return this;
        }

        public Builder setRetryOnConnectionSuspended(boolean z) {
            this.retryOnConnectionSuspended = z;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public Handler getCustomCallbackHandler() {
        return this.customCallbackHandler;
    }

    public boolean isRetryOnConnectionSuspended() {
        return this.retryOnConnectionSuspended;
    }

    private ReactiveLocationProviderConfiguration(Builder builder) {
        this.customCallbackHandler = builder.customCallbackHandler;
        this.retryOnConnectionSuspended = builder.retryOnConnectionSuspended;
    }
}
