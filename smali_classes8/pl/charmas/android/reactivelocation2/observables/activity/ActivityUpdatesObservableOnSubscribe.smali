.class public Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/activity/BaseActivityObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl/charmas/android/reactivelocation2/observables/activity/BaseActivityObservableOnSubscribe<",
        "Lcom/google/android/gms/location/ActivityRecognitionResult;",
        ">;"
    }
.end annotation


# static fields
.field private static final ACTION_ACTIVITY_DETECTED:Ljava/lang/String; = "pl.charmas.android.reactivelocation2.ACTION_ACTIVITY_UPDATE_DETECTED"


# instance fields
.field private activityRecognitionClient:Lcom/google/android/gms/location/ActivityRecognitionClient;

.field private final context:Landroid/content/Context;

.field private final detectionIntervalMilliseconds:I

.field private receiver:Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;


# direct methods
.method private constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;I)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/activity/BaseActivityObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    invoke-virtual {p1}, Lpl/charmas/android/reactivelocation2/observables/ObservableContext;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->context:Landroid/content/Context;

    iput p2, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->detectionIntervalMilliseconds:I

    return-void
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;I)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "I)",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/location/ActivityRecognitionResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;I)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private getReceiverPendingIntent()Landroid/app/PendingIntent;
    .locals 4

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "pl.charmas.android.reactivelocation2.ACTION_ACTIVITY_UPDATE_DETECTED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x8000000

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onActivityRecognitionClientReady(Lcom/google/android/gms/location/ActivityRecognitionClient;Lio/reactivex/y;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/ActivityRecognitionClient;",
            "Lio/reactivex/y<",
            "-",
            "Lcom/google/android/gms/location/ActivityRecognitionResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->activityRecognitionClient:Lcom/google/android/gms/location/ActivityRecognitionClient;

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;-><init>(Lio/reactivex/y;)V

    iput-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->receiver:Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;

    iget-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "pl.charmas.android.reactivelocation2.ACTION_ACTIVITY_UPDATE_DETECTED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-direct {p0}, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->getReceiverPendingIntent()Landroid/app/PendingIntent;

    move-result-object p2

    iget v0, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->detectionIntervalMilliseconds:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/location/ActivityRecognitionClient;->requestActivityUpdates(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public onDisposed()V
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->activityRecognitionClient:Lcom/google/android/gms/location/ActivityRecognitionClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->getReceiverPendingIntent()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/ActivityRecognitionClient;->removeActivityTransitionUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->receiver:Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe;->receiver:Lpl/charmas/android/reactivelocation2/observables/activity/ActivityUpdatesObservableOnSubscribe$ActivityUpdatesBroadcastReceiver;

    :cond_1
    return-void
.end method
