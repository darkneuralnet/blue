.class public final LNo9;
.super Ltm8;
.source "SourceFile"


# instance fields
.field public final a:LxA8;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:LNq9;


# direct methods
.method public constructor <init>(LNq9;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iput-object p1, p0, LNo9;->c:LNq9;

    invoke-direct {p0}, Ltm8;-><init>()V

    new-instance p1, LxA8;

    const-string v0, "OnRequestIntegrityTokenCallback"

    invoke-direct {p1, v0}, LxA8;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LNo9;->a:LxA8;

    iput-object p2, p0, LNo9;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final v1(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, LNo9;->c:LNq9;

    iget-object v0, v0, LNq9;->c:LOq9;

    iget-object v1, p0, LNo9;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1}, LOq9;->r(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v0, p0, LNo9;->a:LxA8;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestIntegrityToken"

    invoke-virtual {v0, v2, v1}, LxA8;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, LNo9;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    const-string v0, "token"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, LNo9;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    const/16 v2, -0x64

    invoke-direct {v0, v2, v1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void

    :cond_1
    iget-object v0, p0, LNo9;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v1, LoY7;

    invoke-direct {v1}, LoY7;-><init>()V

    invoke-virtual {v1, p1}, Ltv9;->a(Ljava/lang/String;)Ltv9;

    invoke-virtual {v1}, Ltv9;->b()LW52;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void
.end method
