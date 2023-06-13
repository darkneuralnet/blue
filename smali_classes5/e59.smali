.class public final Le59;
.super LDw9;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/location/LocationCallback;


# direct methods
.method public constructor <init>(LHy9;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationCallback;)V
    .locals 0

    iput-object p3, p0, Le59;->a:Lcom/google/android/gms/location/LocationCallback;

    invoke-direct {p0, p2}, LDw9;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, LTA7;

    iget-object v0, p0, Le59;->a:Lcom/google/android/gms/location/LocationCallback;

    const-class v1, Lcom/google/android/gms/location/LocationCallback;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerKey(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;

    move-result-object v0

    new-instance v1, LHx9;

    invoke-direct {v1, p0}, LHx9;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    invoke-virtual {p1, v0, v1}, LTA7;->k(Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;Lcn7;)V

    return-void
.end method
