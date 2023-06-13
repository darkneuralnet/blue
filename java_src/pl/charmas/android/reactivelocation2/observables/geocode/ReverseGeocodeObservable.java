package pl.charmas.android.reactivelocation2.observables.geocode;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import pl.charmas.android.reactivelocation2.observables.ObservableEmitterWrapper;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class ReverseGeocodeObservable implements InterfaceC24579z<List<Address>> {
    private final Context ctx;
    private final double latitude;
    private final Locale locale;
    private final double longitude;
    private final int maxResults;

    private ReverseGeocodeObservable(Context context, Locale locale, double d, double d2, int i) {
        this.ctx = context;
        this.latitude = d;
        this.longitude = d2;
        this.maxResults = i;
        this.locale = locale;
    }

    public static Observable<List<Address>> createObservable(Context context, ObservableFactory observableFactory, Locale locale, double d, double d2, int i) {
        return observableFactory.createObservable(new ReverseGeocodeObservable(context, locale, d, d2, i));
    }

    @Override // io.reactivex.InterfaceC24579z
    public void subscribe(InterfaceC24578y<List<Address>> interfaceC24578y) throws Exception {
        try {
            List<Address> fromLocation = new Geocoder(this.ctx, this.locale).getFromLocation(this.latitude, this.longitude, this.maxResults);
            if (!interfaceC24578y.mo1769e()) {
                interfaceC24578y.onNext(fromLocation);
                interfaceC24578y.onComplete();
            }
        } catch (IOException unused) {
            if (!interfaceC24578y.mo1769e()) {
                Observable.create(new FallbackReverseGeocodeObservable(this.locale, this.latitude, this.longitude, this.maxResults)).subscribeOn(C24542a.m31932c()).subscribe(new ObservableEmitterWrapper(interfaceC24578y));
            }
        }
    }
}
