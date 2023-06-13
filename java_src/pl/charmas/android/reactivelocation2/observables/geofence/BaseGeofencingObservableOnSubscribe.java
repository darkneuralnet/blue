package pl.charmas.android.reactivelocation2.observables.geofence;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.LocationServices;
import io.reactivex.InterfaceC24578y;
import pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
/* loaded from: classes8.dex */
public abstract class BaseGeofencingObservableOnSubscribe<T> extends BaseObservableOnSubscribe<T> {
    public BaseGeofencingObservableOnSubscribe(ObservableContext observableContext) {
        super(observableContext, LocationServices.API);
    }

    public abstract void onGeofencingClientReady(GeofencingClient geofencingClient, InterfaceC24578y<? super T> interfaceC24578y);

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public final void onGoogleApiClientReady(Context context, GoogleApiClient googleApiClient, InterfaceC24578y<? super T> interfaceC24578y) {
        onGeofencingClientReady(LocationServices.getGeofencingClient(context), interfaceC24578y);
    }
}
