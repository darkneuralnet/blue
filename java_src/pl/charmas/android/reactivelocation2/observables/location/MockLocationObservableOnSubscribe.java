package pl.charmas.android.reactivelocation2.observables.location;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class MockLocationObservableOnSubscribe extends BaseLocationObservableOnSubscribe<Void> {
    private FusedLocationProviderClient fusedLocationProviderClient;
    private final Observable<Location> locationObservable;
    private InterfaceC23465c mockLocationSubscription;

    private MockLocationObservableOnSubscribe(ObservableContext observableContext, Observable<Location> observable) {
        super(observableContext);
        this.locationObservable = observable;
    }

    public static Observable<Void> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, Observable<Location> observable) {
        return observableFactory.createObservable(new MockLocationObservableOnSubscribe(observableContext, observable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLocationMocking(final FusedLocationProviderClient fusedLocationProviderClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        this.mockLocationSubscription = this.locationObservable.subscribe(new InterfaceC23484g<Location>() { // from class: pl.charmas.android.reactivelocation2.observables.location.MockLocationObservableOnSubscribe.2
            @Override // io.reactivex.functions.InterfaceC23484g
            public void accept(Location location) {
                fusedLocationProviderClient.setMockLocation(location).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
            }
        }, new InterfaceC23484g<Throwable>() { // from class: pl.charmas.android.reactivelocation2.observables.location.MockLocationObservableOnSubscribe.3
            @Override // io.reactivex.functions.InterfaceC23484g
            public void accept(Throwable th) {
                interfaceC24578y.onError(th);
            }
        }, new InterfaceC23478a() { // from class: pl.charmas.android.reactivelocation2.observables.location.MockLocationObservableOnSubscribe.4
            @Override // io.reactivex.functions.InterfaceC23478a
            public void run() {
                interfaceC24578y.onComplete();
            }
        });
    }

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public void onDisposed() {
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
        if (fusedLocationProviderClient != null) {
            fusedLocationProviderClient.setMockMode(false);
        }
        InterfaceC23465c interfaceC23465c = this.mockLocationSubscription;
        if (interfaceC23465c != null && !interfaceC23465c.mo1769e()) {
            this.mockLocationSubscription.dispose();
        }
    }

    @Override // pl.charmas.android.reactivelocation2.observables.location.BaseLocationObservableOnSubscribe
    public void onLocationProviderClientReady(final FusedLocationProviderClient fusedLocationProviderClient, final InterfaceC24578y<? super Void> interfaceC24578y) {
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        fusedLocationProviderClient.setMockMode(true).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: pl.charmas.android.reactivelocation2.observables.location.MockLocationObservableOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Void r3) {
                MockLocationObservableOnSubscribe.this.startLocationMocking(fusedLocationProviderClient, interfaceC24578y);
            }
        }).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
