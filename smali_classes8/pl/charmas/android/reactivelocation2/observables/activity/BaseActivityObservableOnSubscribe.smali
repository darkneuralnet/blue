.class abstract Lpl/charmas/android/reactivelocation2/observables/activity/BaseActivityObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/common/api/Api;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/location/ActivityRecognition;->API:Lcom/google/android/gms/common/api/Api;

    aput-object v2, v0, v1

    invoke-direct {p0, p1, v0}, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;[Lcom/google/android/gms/common/api/Api;)V

    return-void
.end method


# virtual methods
.method public abstract onActivityRecognitionClientReady(Lcom/google/android/gms/location/ActivityRecognitionClient;Lio/reactivex/y;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/ActivityRecognitionClient;",
            "Lio/reactivex/y<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final onGoogleApiClientReady(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Lio/reactivex/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lio/reactivex/y<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/location/ActivityRecognition;->getClient(Landroid/content/Context;)Lcom/google/android/gms/location/ActivityRecognitionClient;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lpl/charmas/android/reactivelocation2/observables/activity/BaseActivityObservableOnSubscribe;->onActivityRecognitionClientReady(Lcom/google/android/gms/location/ActivityRecognitionClient;Lio/reactivex/y;)V

    return-void
.end method
