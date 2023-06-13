.class public final Loo8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzac;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic d:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, Loo8;->d:Lcs8;

    iput-object p2, p0, Loo8;->b:Lcom/google/android/gms/measurement/internal/zzac;

    iput-object p3, p0, Loo8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Loo8;->d:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    invoke-virtual {v0}, LhV8;->b()V

    iget-object v0, p0, Loo8;->b:Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Loo8;->d:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    iget-object v1, p0, Loo8;->b:Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v2, p0, Loo8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1, v2}, LhV8;->q(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void

    :cond_0
    iget-object v0, p0, Loo8;->d:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    iget-object v1, p0, Loo8;->b:Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v2, p0, Loo8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1, v2}, LhV8;->w(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void
.end method
