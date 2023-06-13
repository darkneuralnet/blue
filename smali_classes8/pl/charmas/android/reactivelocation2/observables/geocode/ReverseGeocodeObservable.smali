.class public Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "Ljava/util/List<",
        "Landroid/location/Address;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final ctx:Landroid/content/Context;

.field private final latitude:D

.field private final locale:Ljava/util/Locale;

.field private final longitude:D

.field private final maxResults:I


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/util/Locale;DDI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->ctx:Landroid/content/Context;

    iput-wide p3, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->latitude:D

    iput-wide p5, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->longitude:D

    iput p7, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->maxResults:I

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->locale:Ljava/util/Locale;

    return-void
.end method

.method public static createObservable(Landroid/content/Context;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Ljava/util/Locale;DDI)Lio/reactivex/Observable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "Ljava/util/Locale;",
            "DDI)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    new-instance v8, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p3

    move-wide v5, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;-><init>(Landroid/content/Context;Ljava/util/Locale;DDI)V

    move-object v0, p1

    invoke-virtual {p1, v8}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Landroid/location/Geocoder;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->ctx:Landroid/content/Context;

    iget-object v2, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->locale:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    :try_start_0
    iget-wide v1, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->latitude:D

    iget-wide v3, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->longitude:D

    iget v5, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->maxResults:I

    invoke-virtual/range {v0 .. v5}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Lio/reactivex/y;->e()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p1}, Lio/reactivex/y;->e()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/geocode/FallbackReverseGeocodeObservable;

    iget-object v2, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->locale:Ljava/util/Locale;

    iget-wide v3, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->latitude:D

    iget-wide v5, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->longitude:D

    iget v7, p0, Lpl/charmas/android/reactivelocation2/observables/geocode/ReverseGeocodeObservable;->maxResults:I

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lpl/charmas/android/reactivelocation2/observables/geocode/FallbackReverseGeocodeObservable;-><init>(Ljava/util/Locale;DDI)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lpl/charmas/android/reactivelocation2/observables/ObservableEmitterWrapper;

    invoke-direct {v1, p1}, Lpl/charmas/android/reactivelocation2/observables/ObservableEmitterWrapper;-><init>(Lio/reactivex/y;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    :cond_0
    :goto_0
    return-void
.end method
