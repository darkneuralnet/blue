.class public Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

.field private final factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;->builder()Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->build()Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;-><init>(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;->builder()Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->setCustomCallbackHandler(Landroid/os/Handler;)Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->build()Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;-><init>(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-direct {v0, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;-><init>(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;)V

    iput-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    new-instance p1, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-direct {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    return-void
.end method

.method private varargs connectGoogleApiClient([Lcom/google/android/gms/common/api/Api;)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/GoogleAPIClientObservableOnSubscribe;->create(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;[Lcom/google/android/gms/common/api/Api;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method private fromTask(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/common/api/Response;",
            ">(",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;

    invoke-direct {v0, p1}, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;-><init>(Lcom/google/android/gms/tasks/Task;)V

    invoke-static {v0}, Lio/reactivex/F;->j(Lio/reactivex/J;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public addGeofences(Landroid/app/PendingIntent;Lcom/google/android/gms/location/GeofencingRequest;)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p2, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationSettingsRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lcom/google/android/gms/location/LocationSettingsResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/common/api/Api;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->connectGoogleApiClient([Lcom/google/android/gms/common/api/Api;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v1}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/location/LocationServices;->getSettingsClient(Landroid/content/Context;)Lcom/google/android/gms/location/SettingsClient;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/location/SettingsClient;->checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->fromTask(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public detectedActivity(I)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/location/ActivityRecognitionResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;I)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public geocode(Ljava/lang/String;I)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->geocode(Ljava/lang/String;ILcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public geocode(Ljava/lang/String;ILcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->geocode(Ljava/lang/String;ILcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/Locale;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public geocode(Ljava/lang/String;ILcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/Locale;)Lio/reactivex/F;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Ljava/util/Locale;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lpl/charmas/android/reactivelocation2/observables/geocode/GeocodeObservable;->createObservable(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Ljava/lang/String;ILcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/Locale;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public getCurrentPlace(Lcom/google/android/gms/location/places/PlaceFilter;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/places/PlaceFilter;",
            ")",
            "Lio/reactivex/F<",
            "Lcom/google/android/gms/location/places/PlaceLikelihoodBufferResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/common/api/Api;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/location/places/Places;->PLACE_DETECTION_API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/location/places/Places;->GEO_DATA_API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->connectGoogleApiClient([Lcom/google/android/gms/common/api/Api;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v1}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/location/places/Places;->getPlaceDetectionClient(Landroid/content/Context;)Lcom/google/android/gms/location/places/PlaceDetectionClient;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/location/places/PlaceDetectionClient;->getCurrentPlace(Lcom/google/android/gms/location/places/PlaceFilter;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->fromTask(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public getLastKnownLocation()Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1}, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object v0

    return-object v0
.end method

.method public getPhotoMetadataById(Ljava/lang/String;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lcom/google/android/gms/location/places/PlacePhotoMetadataResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/common/api/Api;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/location/places/Places;->PLACE_DETECTION_API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/location/places/Places;->GEO_DATA_API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->connectGoogleApiClient([Lcom/google/android/gms/common/api/Api;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v1}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/location/places/Places;->getGeoDataClient(Landroid/content/Context;)Lcom/google/android/gms/location/places/GeoDataClient;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/location/places/GeoDataClient;->getPlacePhotos(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->fromTask(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public getPlaceAutocompletePredictions(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Lcom/google/android/gms/location/places/AutocompleteFilter;",
            ")",
            "Lio/reactivex/F<",
            "Lcom/google/android/gms/location/places/AutocompletePredictionBufferResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/common/api/Api;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/location/places/Places;->PLACE_DETECTION_API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/location/places/Places;->GEO_DATA_API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->connectGoogleApiClient([Lcom/google/android/gms/common/api/Api;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v1}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/location/places/Places;->getGeoDataClient(Landroid/content/Context;)Lcom/google/android/gms/location/places/GeoDataClient;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3}, Lcom/google/android/gms/location/places/GeoDataClient;->getAutocompletePredictions(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->fromTask(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public getPlaceById(Ljava/lang/String;)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lcom/google/android/gms/location/places/PlaceBufferResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/common/api/Api;

    sget-object v1, Lcom/google/android/gms/location/places/Places;->PLACE_DETECTION_API:Lcom/google/android/gms/common/api/Api;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/location/places/Places;->GEO_DATA_API:Lcom/google/android/gms/common/api/Api;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-direct {p0, v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->connectGoogleApiClient([Lcom/google/android/gms/common/api/Api;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v1}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/location/places/Places;->getGeoDataClient(Landroid/content/Context;)Lcom/google/android/gms/location/places/GeoDataClient;

    move-result-object v1

    new-array v3, v3, [Ljava/lang/String;

    aput-object p1, v3, v2

    invoke-virtual {v1, v3}, Lcom/google/android/gms/location/places/GeoDataClient;->getPlaceById([Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->fromTask(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public getUpdatedLocation(Lcom/google/android/gms/location/LocationRequest;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationRequest;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lcom/google/android/gms/location/LocationRequest;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public mockLocation(Lio/reactivex/Observable;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public removeGeofences(Landroid/app/PendingIntent;)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Landroid/app/PendingIntent;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public removeGeofences(Ljava/util/List;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Ljava/util/List;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1}, Lpl/charmas/android/reactivelocation2/observables/location/RemoveLocationIntentUpdatesObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Landroid/app/PendingIntent;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {v0, v1, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/location/AddLocationIntentUpdatesObservableOnSubscribe;->createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public reverseGeocode(DDI)Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDI)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    move-wide v4, p1

    move-wide v6, p3

    move v8, p5

    invoke-static/range {v1 .. v8}, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->createObservable(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Ljava/util/Locale;DDI)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public reverseGeocode(Ljava/util/Locale;DDI)Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "DDI)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->ctx:Lpl/charmas/android/reactivelocation2/observables/ObservableContext;

    invoke-virtual {v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->factory:Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    move v8, p6

    invoke-static/range {v1 .. v8}, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->createObservable(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Ljava/util/Locale;DDI)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
