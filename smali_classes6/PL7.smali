.class public final LPL7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM99;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LM99<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lzh7;


# direct methods
.method public constructor <init>(LfM7;Lzh7;)V
    .locals 0

    iput-object p2, p0, LPL7;->a:Lzh7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    instance-of v0, p1, Lcom/google/android/gms/internal/recaptcha/zzby;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    iget-object p1, p0, LPL7;->a:Lzh7;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "Error during initialization step - read/write local cache failed"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v0}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/recaptcha/zzbx;

    const/4 v2, 0x7

    const/16 v3, 0xd

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/Exception;

    instance-of v0, p1, Lcom/google/android/gms/recaptcha/RecaptchaNetworkException;

    if-eqz v0, :cond_1

    iget-object p1, p0, LPL7;->a:Lzh7;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "Error during initialization step - server connection failed"

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v0}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    if-eqz v0, :cond_2

    iget-object v0, p0, LPL7;->a:Lzh7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    check-cast p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/HttpStatusException;->a()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v4, 0x5c

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Error during initialization step - failed to fetch initialization data - status: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    :cond_2
    return-void

    :cond_3
    instance-of v0, p1, Lcom/google/android/gms/internal/recaptcha/zzbi;

    if-eqz v0, :cond_4

    iget-object v0, p0, LPL7;->a:Lzh7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    check-cast p1, Lcom/google/android/gms/internal/recaptcha/zzbi;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_4
    instance-of v0, p1, Lcom/google/android/gms/recaptcha/RecaptchaNetworkException;

    if-eqz v0, :cond_5

    iget-object v0, p0, LPL7;->a:Lzh7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    check-cast p1, Lcom/google/android/gms/recaptcha/RecaptchaNetworkException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_5
    instance-of v0, p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    if-eqz v0, :cond_6

    iget-object v0, p0, LPL7;->a:Lzh7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    check-cast p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_6
    iget-object p1, p0, LPL7;->a:Lzh7;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "Internal error during execution"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v0}, LfM7;->d(Lzh7;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, LPL7;->a:Lzh7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    sget-object v2, LfM7;->e:Ljava/util/concurrent/ExecutorService;

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/recaptcha/zzx;

    new-instance v3, Lcom/google/android/gms/recaptcha/RecaptchaResultData;

    invoke-direct {v3, p1}, Lcom/google/android/gms/recaptcha/RecaptchaResultData;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/recaptcha/zzx;-><init>(Lcom/google/android/gms/recaptcha/RecaptchaResultData;)V

    invoke-interface {v0, v1, v2}, Lzh7;->B(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/recaptcha/zzx;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "RecaptchaOPExecute"

    invoke-static {v0, p1}, LHo7;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
