.class public final Lzv9;
.super LDw9;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(LHy9;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p3, p0, Lzv9;->a:Landroid/app/PendingIntent;

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

    new-instance v0, LHx9;

    invoke-direct {v0, p0}, LHx9;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    iget-object v1, p0, Lzv9;->a:Landroid/app/PendingIntent;

    invoke-virtual {p1, v1, v0}, LTA7;->j(Landroid/app/PendingIntent;Lcn7;)V

    return-void
.end method
