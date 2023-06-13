package pl.charmas.android.reactivelocation2.observables.geofence;

import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import java.util.List;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
/* loaded from: classes8.dex */
class RemoveGeofenceRequestIdsObservableOnSubscribe extends RemoveGeofenceObservableOnSubscribe<Void> {
    private final List<String> geofenceRequestIds;

    public RemoveGeofenceRequestIdsObservableOnSubscribe(ObservableContext observableContext, List<String> list) {
        super(observableContext);
        this.geofenceRequestIds = list;
    }

    @Override // pl.charmas.android.reactivelocation2.observables.geofence.RemoveGeofenceObservableOnSubscribe
    public void removeGeofences(GeofencingClient geofencingClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        geofencingClient.removeGeofences(this.geofenceRequestIds).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: pl.charmas.android.reactivelocation2.observables.geofence.RemoveGeofenceRequestIdsObservableOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Void r1) {
                interfaceC24578y.onComplete();
            }
        }).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
