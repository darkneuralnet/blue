package pl.charmas.android.reactivelocation2.observables.location;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class LastKnownLocationObservableOnSubscribe extends BaseLocationObservableOnSubscribe<Location> {
    private LastKnownLocationObservableOnSubscribe(ObservableContext observableContext) {
        super(observableContext);
    }

    public static Observable<Location> createObservable(ObservableContext observableContext, ObservableFactory observableFactory) {
        return observableFactory.createObservable(new LastKnownLocationObservableOnSubscribe(observableContext));
    }

    @Override // pl.charmas.android.reactivelocation2.observables.location.BaseLocationObservableOnSubscribe
    public void onLocationProviderClientReady(FusedLocationProviderClient fusedLocationProviderClient, final InterfaceC24578y<? super Location> interfaceC24578y) {
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() { // from class: pl.charmas.android.reactivelocation2.observables.location.LastKnownLocationObservableOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Location location) {
                if (interfaceC24578y.mo1769e()) {
                    return;
                }
                if (location != null) {
                    interfaceC24578y.onNext(location);
                }
                interfaceC24578y.onComplete();
            }
        }).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
