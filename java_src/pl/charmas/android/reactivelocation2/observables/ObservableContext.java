package pl.charmas.android.reactivelocation2.observables;

import android.content.Context;
import android.os.Handler;
import pl.charmas.android.reactivelocation2.ReactiveLocationProviderConfiguration;
/* loaded from: classes8.dex */
public class ObservableContext {
    private final Context context;
    private final Handler handler;
    private final boolean retryOnConnectionSuspended;

    public ObservableContext(Context context, ReactiveLocationProviderConfiguration reactiveLocationProviderConfiguration) {
        this.context = context;
        this.handler = reactiveLocationProviderConfiguration.getCustomCallbackHandler();
        this.retryOnConnectionSuspended = reactiveLocationProviderConfiguration.isRetryOnConnectionSuspended();
    }

    public Context getContext() {
        return this.context;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public boolean isRetryOnConnectionSuspended() {
        return this.retryOnConnectionSuspended;
    }
}
