package pl.charmas.android.reactivelocation2;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Address;
import android.location.Location;
import android.os.Handler;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePredictionBufferResponse;
import com.google.android.gms.location.places.PlaceBufferResponse;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceLikelihoodBufferResponse;
import com.google.android.gms.location.places.PlacePhotoMetadataResponse;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Task;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import java.util.Locale;
import pl.charmas.android.reactivelocation2.observables.GoogleAPIClientObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
import pl.charmas.android.reactivelocation2.observables.TaskSingleOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.activity.ActivityUpdatesObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.geocode.GeocodeObservable;
import pl.charmas.android.reactivelocation2.observables.geocode.ReverseGeocodeObservable;
import pl.charmas.android.reactivelocation2.observables.geofence.AddGeofenceObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.geofence.RemoveGeofenceObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.location.AddLocationIntentUpdatesObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.location.LastKnownLocationObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.location.LocationUpdatesObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.location.MockLocationObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.location.RemoveLocationIntentUpdatesObservableOnSubscribe;
/* loaded from: classes8.dex */
public class ReactiveLocationProvider {
    private final ObservableContext ctx;
    private final ObservableFactory factory;

    public ReactiveLocationProvider(Context context) {
        this(context, ReactiveLocationProviderConfiguration.builder().build());
    }

    private AbstractC23461c connectGoogleApiClient(Api... apiArr) {
        return GoogleAPIClientObservableOnSubscribe.create(this.ctx, this.factory, apiArr).ignoreElements();
    }

    private <T extends Response> AbstractC23442F<T> fromTask(Task<T> task) {
        return AbstractC23442F.m33126j(new TaskSingleOnSubscribe(task));
    }

    public AbstractC23461c addGeofences(PendingIntent pendingIntent, GeofencingRequest geofencingRequest) {
        return AddGeofenceObservableOnSubscribe.createObservable(this.ctx, this.factory, geofencingRequest, pendingIntent).ignoreElements();
    }

    public AbstractC23442F<LocationSettingsResponse> checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return connectGoogleApiClient(LocationServices.API).m33042m(fromTask(LocationServices.getSettingsClient(this.ctx.getContext()).checkLocationSettings(locationSettingsRequest)));
    }

    public Observable<ActivityRecognitionResult> detectedActivity(int i) {
        return ActivityUpdatesObservableOnSubscribe.createObservable(this.ctx, this.factory, i);
    }

    public AbstractC23442F<List<Address>> geocode(String str, int i) {
        return geocode(str, i, null);
    }

    public AbstractC23442F<PlaceLikelihoodBufferResponse> getCurrentPlace(PlaceFilter placeFilter) {
        return connectGoogleApiClient(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).m33042m(fromTask(Places.getPlaceDetectionClient(this.ctx.getContext()).getCurrentPlace(placeFilter)));
    }

    public AbstractC24507p<Location> getLastKnownLocation() {
        return LastKnownLocationObservableOnSubscribe.createObservable(this.ctx, this.factory).firstElement();
    }

    public AbstractC23442F<PlacePhotoMetadataResponse> getPhotoMetadataById(String str) {
        return connectGoogleApiClient(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).m33042m(fromTask(Places.getGeoDataClient(this.ctx.getContext()).getPlacePhotos(str)));
    }

    public AbstractC23442F<AutocompletePredictionBufferResponse> getPlaceAutocompletePredictions(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        return connectGoogleApiClient(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).m33042m(fromTask(Places.getGeoDataClient(this.ctx.getContext()).getAutocompletePredictions(str, latLngBounds, autocompleteFilter)));
    }

    public AbstractC23442F<PlaceBufferResponse> getPlaceById(String str) {
        return connectGoogleApiClient(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).m33042m(fromTask(Places.getGeoDataClient(this.ctx.getContext()).getPlaceById(str)));
    }

    public Observable<Location> getUpdatedLocation(LocationRequest locationRequest) {
        return LocationUpdatesObservableOnSubscribe.createObservable(this.ctx, this.factory, locationRequest);
    }

    public AbstractC23461c mockLocation(Observable<Location> observable) {
        return MockLocationObservableOnSubscribe.createObservable(this.ctx, this.factory, observable).ignoreElements();
    }

    public AbstractC23461c removeGeofences(PendingIntent pendingIntent) {
        return RemoveGeofenceObservableOnSubscribe.createObservable(this.ctx, this.factory, pendingIntent).ignoreElements();
    }

    public AbstractC23461c removeLocationUpdates(PendingIntent pendingIntent) {
        return RemoveLocationIntentUpdatesObservableOnSubscribe.createObservable(this.ctx, this.factory, pendingIntent).ignoreElements();
    }

    public AbstractC23461c requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return AddLocationIntentUpdatesObservableOnSubscribe.createObservable(this.ctx, this.factory, locationRequest, pendingIntent).ignoreElements();
    }

    public AbstractC23442F<List<Address>> reverseGeocode(double d, double d2, int i) {
        return ReverseGeocodeObservable.createObservable(this.ctx.getContext(), this.factory, Locale.getDefault(), d, d2, i).singleOrError();
    }

    public ReactiveLocationProvider(Context context, ReactiveLocationProviderConfiguration reactiveLocationProviderConfiguration) {
        ObservableContext observableContext = new ObservableContext(context, reactiveLocationProviderConfiguration);
        this.ctx = observableContext;
        this.factory = new ObservableFactory(observableContext);
    }

    public AbstractC23442F<List<Address>> geocode(String str, int i, LatLngBounds latLngBounds) {
        return geocode(str, i, latLngBounds, null);
    }

    public AbstractC23461c removeGeofences(List<String> list) {
        return RemoveGeofenceObservableOnSubscribe.createObservable(this.ctx, this.factory, list).ignoreElements();
    }

    public AbstractC23442F<List<Address>> reverseGeocode(Locale locale, double d, double d2, int i) {
        return ReverseGeocodeObservable.createObservable(this.ctx.getContext(), this.factory, locale, d, d2, i).singleOrError();
    }

    public AbstractC23442F<List<Address>> geocode(String str, int i, LatLngBounds latLngBounds, Locale locale) {
        return GeocodeObservable.createObservable(this.ctx.getContext(), this.factory, str, i, latLngBounds, locale).singleOrError();
    }

    @Deprecated
    public ReactiveLocationProvider(Context context, Handler handler) {
        this(context, ReactiveLocationProviderConfiguration.builder().setCustomCallbackHandler(handler).build());
    }
}
