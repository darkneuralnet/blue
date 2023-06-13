.class public final Lws9;
.super LDw9;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/location/LocationRequest;

.field public final synthetic b:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(LHy9;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p3, p0, Lws9;->a:Lcom/google/android/gms/location/LocationRequest;

    iput-object p4, p0, Lws9;->b:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, LDw9;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, LTA7;

    new-instance v0, LHx9;

    invoke-direct {v0, p0}, LHx9;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    iget-object v1, p0, Lws9;->a:Lcom/google/android/gms/location/LocationRequest;

    iget-object v2, p0, Lws9;->b:Landroid/app/PendingIntent;

    invoke-virtual {p1, v1, v2, v0}, LTA7;->h(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lcn7;)V

    return-void
.end method
