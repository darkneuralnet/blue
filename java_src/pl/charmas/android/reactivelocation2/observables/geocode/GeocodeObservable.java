package pl.charmas.android.reactivelocation2.observables.geocode;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class GeocodeObservable implements InterfaceC24579z<List<Address>> {
    private final LatLngBounds bounds;
    private final Context ctx;
    private final Locale locale;
    private final String locationName;
    private final int maxResults;

    private GeocodeObservable(Context context, String str, int i, LatLngBounds latLngBounds, Locale locale) {
        this.ctx = context;
        this.locationName = str;
        this.maxResults = i;
        this.bounds = latLngBounds;
        this.locale = locale;
    }

    private Geocoder createGeocoder() {
        if (this.locale != null) {
            return new Geocoder(this.ctx, this.locale);
        }
        return new Geocoder(this.ctx);
    }

    public static Observable<List<Address>> createObservable(Context context, ObservableFactory observableFactory, String str, int i, LatLngBounds latLngBounds, Locale locale) {
        return observableFactory.createObservable(new GeocodeObservable(context, str, i, latLngBounds, locale));
    }

    private List<Address> getAddresses(Geocoder geocoder) throws IOException {
        LatLngBounds latLngBounds = this.bounds;
        if (latLngBounds != null) {
            String str = this.locationName;
            int i = this.maxResults;
            LatLng latLng = latLngBounds.f71432b;
            double d = latLng.f71430b;
            double d2 = latLng.f71431c;
            LatLng latLng2 = latLngBounds.f71433c;
            return geocoder.getFromLocationName(str, i, d, d2, latLng2.f71430b, latLng2.f71431c);
        }
        return geocoder.getFromLocationName(this.locationName, this.maxResults);
    }

    @Override // io.reactivex.InterfaceC24579z
    public void subscribe(InterfaceC24578y<List<Address>> interfaceC24578y) throws Exception {
        try {
            List<Address> addresses = getAddresses(createGeocoder());
            if (!interfaceC24578y.mo1769e()) {
                interfaceC24578y.onNext(addresses);
                interfaceC24578y.onComplete();
            }
        } catch (IOException e) {
            if (!interfaceC24578y.mo1769e()) {
                interfaceC24578y.onError(e);
            }
        }
    }
}
