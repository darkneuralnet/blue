.class public Lre7;
.super LTN8;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LTN8<",
        "Lre7;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Lcom/google/android/gms/internal/gtm/zzbv;

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 2
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzd()LQl9;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzr()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LTN8;-><init>(LQl9;Lcom/google/android/gms/common/util/Clock;)V

    iput-object p1, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    return-void
.end method


# virtual methods
.method public final a(LLt8;)V
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/gtm/zzbe;

    invoke-virtual {p1, v0}, LLt8;->b(Ljava/lang/Class;)LrH8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/gtm/zzbe;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbe;->zze()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzi()Lcom/google/android/gms/internal/gtm/zzcn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzcn;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/gtm/zzbe;->zzj(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lre7;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbe;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zze()Lcom/google/android/gms/internal/gtm/zzbi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbi;->zza()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/gtm/zzbe;->zzi(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbi;->zzb()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/gtm/zzbe;->zzh(Z)V

    :cond_1
    return-void
.end method

.method public final d()LLt8;
    .locals 2

    iget-object v0, p0, LTN8;->b:LLt8;

    new-instance v1, LLt8;

    invoke-direct {v1, v0}, LLt8;-><init>(LLt8;)V

    iget-object v0, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzh()Lcom/google/android/gms/internal/gtm/zzcf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzcf;->zza()Lcom/google/android/gms/internal/gtm/zzav;

    move-result-object v0

    invoke-virtual {v1, v0}, LLt8;->g(LrH8;)V

    iget-object v0, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzk()Lcom/google/android/gms/internal/gtm/zzcx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzcx;->zza()Lcom/google/android/gms/internal/gtm/zzba;

    move-result-object v0

    invoke-virtual {v1, v0}, LLt8;->g(LrH8;)V

    invoke-virtual {p0, v1}, LTN8;->c(LLt8;)V

    return-object v1
.end method

.method public final e()Lcom/google/android/gms/internal/gtm/zzbv;
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    return-object v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, LNB7;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, LTN8;->b:LLt8;

    invoke-virtual {v1}, LLt8;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZq9;

    invoke-interface {v2}, LZq9;->zzb()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/ListIterator;->remove()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LTN8;->b:LLt8;

    invoke-virtual {v0}, LLt8;->f()Ljava/util/List;

    move-result-object v0

    new-instance v1, LNB7;

    iget-object v2, p0, Lre7;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-direct {v1, v2, p1}, LNB7;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, Lre7;->e:Z

    return-void
.end method
