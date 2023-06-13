.class Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;

.field final synthetic val$apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe$1;->this$0:Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe$1;->val$apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe$1;->this$0:Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;

    invoke-virtual {v0}, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;->onDisposed()V

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe$1;->val$apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    return-void
.end method
