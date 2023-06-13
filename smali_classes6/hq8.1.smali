.class public final Lhq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic c:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, Lhq8;->c:Lcs8;

    iput-object p2, p0, Lhq8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lhq8;->c:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    invoke-virtual {v0}, LhV8;->b()V

    iget-object v0, p0, Lhq8;->c:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    iget-object v1, p0, Lhq8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0}, LhV8;->c()Ldn8;

    move-result-object v2

    invoke-virtual {v2}, Lns8;->e()V

    invoke-virtual {v0}, LhV8;->d()V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzq;->w:Ljava/lang/String;

    invoke-static {v2}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v3

    invoke-virtual {v0}, LhV8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->s()Lec8;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v6, "Setting consent, package, consent"

    invoke-virtual {v4, v6, v5, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v0, v4, v2}, LhV8;->x(Ljava/lang/String;LXm7;)V

    invoke-virtual {v2, v3}, LXm7;->k(LXm7;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, LhV8;->s(Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_0
    return-void
.end method
