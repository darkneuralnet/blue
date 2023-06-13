package pl.charmas.android.reactivelocation2.observables.location;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import io.reactivex.InterfaceC24578y;
import pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
/* loaded from: classes8.dex */
public abstract class BaseLocationObservableOnSubscribe<T> extends BaseObservableOnSubscribe<T> {
    public BaseLocationObservableOnSubscribe(ObservableContext observableContext) {
        super(observableContext, LocationServices.API);
    }

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public final void onGoogleApiClientReady(Context context, GoogleApiClient googleApiClient, InterfaceC24578y<? super T> interfaceC24578y) {
        onLocationProviderClientReady(LocationServices.getFusedLocationProviderClient(context), interfaceC24578y);
    }

    public abstract void onLocationProviderClientReady(FusedLocationProviderClient fusedLocationProviderClient, InterfaceC24578y<? super T> interfaceC24578y);
}
