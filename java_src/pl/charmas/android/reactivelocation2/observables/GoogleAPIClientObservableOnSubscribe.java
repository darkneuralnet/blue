package pl.charmas.android.reactivelocation2.observables;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
/* loaded from: classes8.dex */
public class GoogleAPIClientObservableOnSubscribe extends BaseObservableOnSubscribe<Void> {
    @SafeVarargs
    private GoogleAPIClientObservableOnSubscribe(ObservableContext observableContext, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        super(observableContext, apiArr);
    }

    @SafeVarargs
    public static Observable<Void> create(ObservableContext observableContext, ObservableFactory observableFactory, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        return observableFactory.createObservable(new GoogleAPIClientObservableOnSubscribe(observableContext, apiArr));
    }

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public void onGoogleApiClientReady(Context context, GoogleApiClient googleApiClient, InterfaceC24578y<? super Void> interfaceC24578y) {
        if (interfaceC24578y.mo1769e()) {
            return;
        }
        interfaceC24578y.onComplete();
    }
}
