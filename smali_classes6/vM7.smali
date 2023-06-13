.class public final LvM7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM99;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LM99<",
        "Lq28;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lnj7;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(LLM7;Lnj7;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, LvM7;->a:Lnj7;

    iput-object p3, p0, LvM7;->b:Ljava/lang/String;

    iput-object p4, p0, LvM7;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    instance-of v0, p1, Lcom/google/android/gms/recaptcha/RecaptchaNetworkException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LvM7;->a:Lnj7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x7

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, LLM7;->a(Lnj7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    if-eqz v0, :cond_1

    iget-object v0, p0, LvM7;->a:Lnj7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    check-cast p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/HttpStatusException;->a()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x3a

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Failed to fetch data for local cache - status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0xd

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, LLM7;->a(Lnj7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_1
    instance-of p1, p1, Ljava/io/IOException;

    const/16 v0, 0x8

    if-eqz p1, :cond_2

    iget-object p1, p0, LvM7;->a:Lnj7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const-string v2, "Failed to read/write local cache"

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v1}, LLM7;->a(Lnj7;Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    iget-object p1, p0, LvM7;->a:Lnj7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const-string v2, "Internal error during init"

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v1}, LLM7;->a(Lnj7;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lq28;

    iget-object v0, p0, LvM7;->a:Lnj7;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object v2, p0, LvM7;->b:Ljava/lang/String;

    iget-object v3, p0, LvM7;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lq28;->D()Ljava/util/List;

    move-result-object p1

    :try_start_0
    new-instance v4, Lcom/google/android/gms/internal/recaptcha/zzai;

    new-instance v5, Lcom/google/android/gms/recaptcha/RecaptchaHandle;

    invoke-direct {v5, v2, v3, p1}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/recaptcha/zzai;-><init>(Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V

    invoke-interface {v0, v1, v4}, Lnj7;->o4(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/recaptcha/zzai;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "RecaptchaOPInit"

    invoke-static {v0, p1}, LHo7;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
