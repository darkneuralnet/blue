.class public final LKX7;
.super Lge8;
.source "SourceFile"


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(LKm8;Lcom/google/android/gms/common/api/GoogleApiClient;JLandroid/app/PendingIntent;)V
    .locals 0

    iput-wide p3, p0, LKX7;->a:J

    iput-object p5, p0, LKX7;->b:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lge8;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    iget-wide v0, p0, LKX7;->a:J

    iget-object v2, p0, LKX7;->b:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1, v2}, LTA7;->p(JLandroid/app/PendingIntent;)V

    sget-object p1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
