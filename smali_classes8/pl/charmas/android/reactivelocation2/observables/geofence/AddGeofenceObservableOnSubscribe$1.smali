.class Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;->onGeofencingClientReady(Lcom/google/android/gms/location/GeofencingClient;Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;

.field final synthetic val$emitter:Lio/reactivex/y;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;->this$0:Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;->val$emitter:Lio/reactivex/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;->val$emitter:Lio/reactivex/y;

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    return-void
.end method
