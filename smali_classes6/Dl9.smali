.class public final LDl9;
.super LcH8;
.source "SourceFile"


# instance fields
.field public final synthetic c:[B

.field public final synthetic d:Ljava/lang/Long;

.field public final synthetic e:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic f:LV52;

.field public final synthetic g:LNq9;


# direct methods
.method public constructor <init>(LNq9;Lcom/google/android/gms/tasks/TaskCompletionSource;[BLjava/lang/Long;Lcom/google/android/gms/tasks/TaskCompletionSource;LV52;)V
    .locals 0

    iput-object p1, p0, LDl9;->g:LNq9;

    iput-object p3, p0, LDl9;->c:[B

    iput-object p4, p0, LDl9;->d:Ljava/lang/Long;

    iput-object p5, p0, LDl9;->e:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p6, p0, LDl9;->f:LV52;

    invoke-direct {p0, p2}, LcH8;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/play/integrity/internal/zzu;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, LcH8;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, LcH8;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()V
    .locals 5

    :try_start_0
    iget-object v0, p0, LDl9;->g:LNq9;

    iget-object v0, v0, LNq9;->c:LOq9;

    invoke-virtual {v0}, LOq9;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, LDl9;->g:LNq9;

    iget-object v2, p0, LDl9;->c:[B

    iget-object v3, p0, LDl9;->d:Ljava/lang/Long;

    invoke-static {v1, v2, v3}, LNq9;->a(LNq9;[BLjava/lang/Long;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, LNo9;

    iget-object v3, p0, LDl9;->g:LNq9;

    iget-object v4, p0, LDl9;->e:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v2, v3, v4}, LNo9;-><init>(LNq9;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, v1, v2}, LGe8;->e1(Landroid/os/Bundle;Lut8;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, LDl9;->g:LNq9;

    invoke-static {v1}, LNq9;->c(LNq9;)LxA8;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, LDl9;->f:LV52;

    aput-object v4, v2, v3

    const-string v3, "requestIntegrityToken(%s)"

    invoke-virtual {v1, v0, v3, v2}, LxA8;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, LDl9;->e:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void
.end method
