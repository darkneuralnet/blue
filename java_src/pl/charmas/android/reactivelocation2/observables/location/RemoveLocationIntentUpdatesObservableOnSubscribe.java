package pl.charmas.android.reactivelocation2.observables.location;

import android.app.PendingIntent;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class RemoveLocationIntentUpdatesObservableOnSubscribe extends BaseLocationObservableOnSubscribe<Void> {
    private final PendingIntent intent;

    private RemoveLocationIntentUpdatesObservableOnSubscribe(ObservableContext observableContext, PendingIntent pendingIntent) {
        super(observableContext);
        this.intent = pendingIntent;
    }

    public static Observable<Void> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, PendingIntent pendingIntent) {
        return observableFactory.createObservable(new RemoveLocationIntentUpdatesObservableOnSubscribe(observableContext, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation2.observables.location.BaseLocationObservableOnSubscribe
    public void onLocationProviderClientReady(FusedLocationProviderClient fusedLocationProviderClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        fusedLocationProviderClient.removeLocationUpdates(this.intent).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: pl.charmas.android.reactivelocation2.observables.location.RemoveLocationIntentUpdatesObservableOnSubscribe.1
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
