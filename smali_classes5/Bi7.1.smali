.class public final LBi7;
.super Luj7;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/location/zzbq;


# direct methods
.method public constructor <init>(Lrk7;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/zzbq;)V
    .locals 0

    iput-object p3, p0, LBi7;->a:Lcom/google/android/gms/location/zzbq;

    invoke-direct {p0, p2}, Luj7;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, LTA7;

    iget-object v0, p0, LBi7;->a:Lcom/google/android/gms/location/zzbq;

    invoke-virtual {p1, v0, p0}, LTA7;->v(Lcom/google/android/gms/location/zzbq;Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    return-void
.end method
