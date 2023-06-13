package pl.charmas.android.reactivelocation2.observables;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.disposables.C23466d;
import io.reactivex.functions.InterfaceC23478a;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes8.dex */
public abstract class BaseObservableOnSubscribe<T> implements InterfaceC24579z<T> {
    private final Context ctx;
    private final Handler handler;
    private final List<Api<? extends Api.ApiOptions.NotRequiredOptions>> services;

    /* loaded from: classes8.dex */
    public class ApiClientConnectionCallbacks implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private GoogleApiClient apiClient;
        private final Context context;
        private final InterfaceC24578y<? super T> emitter;

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            try {
                BaseObservableOnSubscribe.this.onGoogleApiClientReady(this.context, this.apiClient, this.emitter);
            } catch (Throwable th) {
                if (!this.emitter.mo1769e()) {
                    this.emitter.onError(th);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            if (!this.emitter.mo1769e()) {
                this.emitter.onError(new GoogleAPIConnectionException("Error connecting to GoogleApiClient.", connectionResult));
            }
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            if (!this.emitter.mo1769e()) {
                this.emitter.onError(new GoogleAPIConnectionSuspendedException(i));
            }
        }

        public void setClient(GoogleApiClient googleApiClient) {
            this.apiClient = googleApiClient;
        }

        private ApiClientConnectionCallbacks(Context context, InterfaceC24578y<? super T> interfaceC24578y) {
            this.context = context;
            this.emitter = interfaceC24578y;
        }
    }

    @SafeVarargs
    public BaseObservableOnSubscribe(ObservableContext observableContext, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        this.ctx = observableContext.getContext();
        this.handler = observableContext.getHandler();
        this.services = Arrays.asList(apiArr);
    }

    private GoogleApiClient createApiClient(InterfaceC24578y<? super T> interfaceC24578y) {
        ApiClientConnectionCallbacks apiClientConnectionCallbacks = new ApiClientConnectionCallbacks(this.ctx, interfaceC24578y);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.ctx);
        for (Api<? extends Api.ApiOptions.NotRequiredOptions> api : this.services) {
            builder = builder.addApi(api);
        }
        GoogleApiClient.Builder addOnConnectionFailedListener = builder.addConnectionCallbacks(apiClientConnectionCallbacks).addOnConnectionFailedListener(apiClientConnectionCallbacks);
        Handler handler = this.handler;
        if (handler != null) {
            addOnConnectionFailedListener = addOnConnectionFailedListener.setHandler(handler);
        }
        GoogleApiClient build = addOnConnectionFailedListener.build();
        apiClientConnectionCallbacks.setClient(build);
        return build;
    }

    public void onDisposed() {
    }

    public abstract void onGoogleApiClientReady(Context context, GoogleApiClient googleApiClient, InterfaceC24578y<? super T> interfaceC24578y);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.InterfaceC24579z
    public void subscribe(InterfaceC24578y<T> interfaceC24578y) throws Exception {
        final GoogleApiClient createApiClient = createApiClient(interfaceC24578y);
        try {
            createApiClient.connect();
        } catch (Throwable th) {
            if (!interfaceC24578y.mo1769e()) {
                interfaceC24578y.onError(th);
            }
        }
        interfaceC24578y.mo11915b(C23466d.m33021c(new InterfaceC23478a() { // from class: pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe.1
            @Override // io.reactivex.functions.InterfaceC23478a
            public void run() throws Exception {
                BaseObservableOnSubscribe.this.onDisposed();
                createApiClient.disconnect();
            }
        }));
    }
}
