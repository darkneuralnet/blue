.class public Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private fusedLocationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

.field private final locationObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field private mockLocationSubscription:Lio/reactivex/disposables/c;


# direct methods
.method private constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lio/reactivex/Observable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->locationObservable:Lio/reactivex/Observable;

    return-void
.end method

.method public static synthetic access$000(Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->startLocationMocking(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V

    return-void
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lio/reactivex/Observable;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private startLocationMocking(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            "Lio/reactivex/y<",
            "-",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->locationObservable:Lio/reactivex/Observable;

    new-instance v1, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;

    invoke-direct {v1, p0, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;-><init>(Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V

    new-instance p1, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$3;

    invoke-direct {p1, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$3;-><init>(Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;Lio/reactivex/y;)V

    new-instance v2, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$4;

    invoke-direct {v2, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$4;-><init>(Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;Lio/reactivex/y;)V

    invoke-virtual {v0, v1, p1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object p1

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->mockLocationSubscription:Lio/reactivex/disposables/c;

    return-void
.end method


# virtual methods
.method public onDisposed()V
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->fusedLocationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->setMockMode(Z)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->mockLocationSubscription:Lio/reactivex/disposables/c;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/reactivex/disposables/c;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->mockLocationSubscription:Lio/reactivex/disposables/c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    :cond_1
    return-void
.end method

.method public onLocationProviderClientReady(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            "Lio/reactivex/y<",
            "-",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->fusedLocationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->setMockMode(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$1;

    invoke-direct {v1, p0, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$1;-><init>(Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/BaseFailureListener;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/BaseFailureListener;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
