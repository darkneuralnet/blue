package pl.charmas.android.reactivelocation2.observables.location;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import java.lang.ref.WeakReference;
import pl.charmas.android.reactivelocation2.BaseFailureListener;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class LocationUpdatesObservableOnSubscribe extends BaseLocationObservableOnSubscribe<Location> {
    private FusedLocationProviderClient fusedLocationProviderClient;
    private LocationCallback listener;
    private final LocationRequest locationRequest;

    /* loaded from: classes8.dex */
    public static class LocationUpdatesLocationListener extends LocationCallback {
        private final WeakReference<InterfaceC24578y<? super Location>> weakRef;

        public LocationUpdatesLocationListener(InterfaceC24578y<? super Location> interfaceC24578y) {
            this.weakRef = new WeakReference<>(interfaceC24578y);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationAvailability(LocationAvailability locationAvailability) {
            super.onLocationAvailability(locationAvailability);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            InterfaceC24578y<? super Location> interfaceC24578y = this.weakRef.get();
            if (interfaceC24578y != null && !interfaceC24578y.mo1769e()) {
                for (Location location : locationResult.getLocations()) {
                    interfaceC24578y.onNext(location);
                }
            }
        }
    }

    private LocationUpdatesObservableOnSubscribe(ObservableContext observableContext, LocationRequest locationRequest) {
        super(observableContext);
        this.locationRequest = locationRequest;
    }

    public static Observable<Location> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, LocationRequest locationRequest) {
        Observable<Location> createObservable = observableFactory.createObservable(new LocationUpdatesObservableOnSubscribe(observableContext, locationRequest));
        int numUpdates = locationRequest.getNumUpdates();
        if (numUpdates > 0 && numUpdates < Integer.MAX_VALUE) {
            return createObservable.take(numUpdates);
        }
        return createObservable;
    }

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public void onDisposed() {
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
        if (fusedLocationProviderClient != null) {
            fusedLocationProviderClient.removeLocationUpdates(this.listener);
        }
    }

    @Override // pl.charmas.android.reactivelocation2.observables.location.BaseLocationObservableOnSubscribe
    public void onLocationProviderClientReady(FusedLocationProviderClient fusedLocationProviderClient, InterfaceC24578y<? super Location> interfaceC24578y) {
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        LocationUpdatesLocationListener locationUpdatesLocationListener = new LocationUpdatesLocationListener(interfaceC24578y);
        this.listener = locationUpdatesLocationListener;
        fusedLocationProviderClient.requestLocationUpdates(this.locationRequest, locationUpdatesLocationListener, null).addOnFailureListener(new BaseFailureListener(interfaceC24578y));
    }
}
