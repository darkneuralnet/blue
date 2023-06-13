package pl.charmas.android.reactivelocation2.observables.geofence;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
/* loaded from: classes8.dex */
class RemoveGeofenceByPendingIntentObservableOnSubscribe extends BaseGeofencingObservableOnSubscribe<Void> {
    private final PendingIntent pendingIntent;

    public RemoveGeofenceByPendingIntentObservableOnSubscribe(ObservableContext observableContext, PendingIntent pendingIntent) {
        super(observableContext);
        this.pendingIntent = pendingIntent;
    }

    @Override // pl.charmas.android.reactivelocation2.observables.geofence.BaseGeofencingObservableOnSubscribe
    public void onGeofencingClientReady(GeofencingClient geofencingClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        geofencingClient.removeGeofences(this.pendingIntent).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: pl.charmas.android.reactivelocation2.observables.geofence.RemoveGeofenceByPendingIntentObservableOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Void r1) {
                interfaceC24578y.onComplete();
            }
        }).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
