.class Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;->onLocationProviderClientReady(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Landroid/location/Location;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;

.field final synthetic val$emitter:Lio/reactivex/y;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;->this$0:Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;->val$emitter:Lio/reactivex/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;->val$emitter:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/y;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;->val$emitter:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;->val$emitter:Lio/reactivex/y;

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;->onSuccess(Landroid/location/Location;)V

    return-void
.end method
