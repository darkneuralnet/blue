package pl.charmas.android.reactivelocation2.observables.geofence;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class AddGeofenceObservableOnSubscribe extends BaseGeofencingObservableOnSubscribe<Void> {
    private final PendingIntent geofenceTransitionPendingIntent;
    private final GeofencingRequest request;

    private AddGeofenceObservableOnSubscribe(ObservableContext observableContext, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(observableContext);
        this.request = geofencingRequest;
        this.geofenceTransitionPendingIntent = pendingIntent;
    }

    public static Observable<Void> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return observableFactory.createObservable(new AddGeofenceObservableOnSubscribe(observableContext, geofencingRequest, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation2.observables.geofence.BaseGeofencingObservableOnSubscribe
    public void onGeofencingClientReady(GeofencingClient geofencingClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        geofencingClient.addGeofences(this.request, this.geofenceTransitionPendingIntent).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: pl.charmas.android.reactivelocation2.observables.geofence.AddGeofenceObservableOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Void r1) {
                interfaceC24578y.onComplete();
            }
        }).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
