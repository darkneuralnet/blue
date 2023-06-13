.class Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;->startLocationMocking(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/g<",
        "Landroid/location/Location;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;

.field final synthetic val$emitter:Lio/reactivex/y;

.field final synthetic val$locationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;->this$0:Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe;

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;->val$locationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    iput-object p3, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;->val$emitter:Lio/reactivex/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Landroid/location/Location;)V
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;->val$locationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->setMockLocation(Landroid/location/Location;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/BaseFailureListener;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;->val$emitter:Lio/reactivex/y;

    invoke-direct {v0, v1}, Lpl/charmas/android/reactivelocation2/BaseFailureListener;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/location/MockLocationObservableOnSubscribe$2;->accept(Landroid/location/Location;)V

    return-void
.end method
