.class public final LeC7;
.super LZX7;
.source "SourceFile"


# instance fields
.field public final a:LdD8;


# direct methods
.method public constructor <init>(LdD8;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LZX7;-><init>(LRP7;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LeC7;->a:LdD8;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0}, LdD8;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1, p2, p3}, LdD8;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0}, LdD8;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1}, LdD8;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1}, LdD8;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1, p2, p3}, LdD8;->f(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1, p2}, LdD8;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1}, LdD8;->h(Landroid/os/Bundle;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1, p2, p3}, LdD8;->i(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0, p1}, LdD8;->zza(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final zzb()J
    .locals 2

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0}, LdD8;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0}, LdD8;->zzh()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LeC7;->a:LdD8;

    invoke-interface {v0}, LdD8;->zzi()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
