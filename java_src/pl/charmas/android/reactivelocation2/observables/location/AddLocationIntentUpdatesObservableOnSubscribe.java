package pl.charmas.android.reactivelocation2.observables.location;

import android.app.PendingIntent;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class AddLocationIntentUpdatesObservableOnSubscribe extends BaseLocationObservableOnSubscribe<Void> {
    private final PendingIntent intent;
    private final LocationRequest locationRequest;

    private AddLocationIntentUpdatesObservableOnSubscribe(ObservableContext observableContext, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(observableContext);
        this.locationRequest = locationRequest;
        this.intent = pendingIntent;
    }

    public static Observable<Void> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return observableFactory.createObservable(new AddLocationIntentUpdatesObservableOnSubscribe(observableContext, locationRequest, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation2.observables.location.BaseLocationObservableOnSubscribe
    public void onLocationProviderClientReady(FusedLocationProviderClient fusedLocationProviderClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        fusedLocationProviderClient.requestLocationUpdates(this.locationRequest, this.intent).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: pl.charmas.android.reactivelocation2.observables.location.AddLocationIntentUpdatesObservableOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Void r1) {
                if (interfaceC24578y.mo1769e()) {
                    return;
                }
                interfaceC24578y.onComplete();
            }
        }).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
