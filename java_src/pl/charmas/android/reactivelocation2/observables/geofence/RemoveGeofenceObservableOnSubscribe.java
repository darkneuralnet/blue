package pl.charmas.android.reactivelocation2.observables.geofence;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingClient;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import java.util.List;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public abstract class RemoveGeofenceObservableOnSubscribe<T> extends BaseGeofencingObservableOnSubscribe<T> {
    public RemoveGeofenceObservableOnSubscribe(ObservableContext observableContext) {
        super(observableContext);
    }

    public static Observable<Void> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, PendingIntent pendingIntent) {
        return observableFactory.createObservable(new RemoveGeofenceByPendingIntentObservableOnSubscribe(observableContext, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation2.observables.geofence.BaseGeofencingObservableOnSubscribe
    public void onGeofencingClientReady(GeofencingClient geofencingClient, InterfaceC24578y<? super T> interfaceC24578y) {
        removeGeofences(geofencingClient, interfaceC24578y);
    }

    public abstract void removeGeofences(GeofencingClient geofencingClient, InterfaceC24578y<? super T> interfaceC24578y);

    public static Observable<Void> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, List<String> list) {
        return observableFactory.createObservable(new RemoveGeofenceRequestIdsObservableOnSubscribe(observableContext, list));
    }
}
