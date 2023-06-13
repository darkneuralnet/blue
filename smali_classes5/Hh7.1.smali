.class public final LHh7;
.super Luj7;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/location/GeofencingRequest;

.field public final synthetic b:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(Lrk7;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p3, p0, LHh7;->a:Lcom/google/android/gms/location/GeofencingRequest;

    iput-object p4, p0, LHh7;->b:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Luj7;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    iget-object v0, p0, LHh7;->a:Lcom/google/android/gms/location/GeofencingRequest;

    iget-object v1, p0, LHh7;->b:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1, p0}, LTA7;->u(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    return-void
.end method
