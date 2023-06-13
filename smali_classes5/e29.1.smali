.class public final Le29;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF39;


# instance fields
.field public final a:Lr19;

.field public final b:LQ69;

.field public final c:Z

.field public final d:LdR8;


# direct methods
.method public constructor <init>(LQ69;LdR8;Lr19;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le29;->b:LQ69;

    invoke-virtual {p2, p3}, LdR8;->c(Lr19;)Z

    move-result p1

    iput-boolean p1, p0, Le29;->c:Z

    iput-object p2, p0, Le29;->d:LdR8;

    iput-object p3, p0, Le29;->a:Lr19;

    return-void
.end method

.method public static f(LQ69;LdR8;Lr19;)Le29;
    .locals 1

    new-instance v0, Le29;

    invoke-direct {v0, p0, p1, p2}, Le29;-><init>(LQ69;LdR8;Lr19;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le29;->b:LQ69;

    invoke-static {v0, p1, p2}, LX39;->c(LQ69;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean p1, p0, Le29;->c:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Le29;->d:LdR8;

    invoke-virtual {p1, p2}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Le29;->d:LdR8;

    invoke-virtual {v0, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Le29;->b:LQ69;

    invoke-virtual {v0, p1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Le29;->b:LQ69;

    invoke-virtual {v1, p2}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Le29;->c:Z

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Le29;->d:LdR8;

    invoke-virtual {v0, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    iget-object p1, p0, Le29;->d:LdR8;

    invoke-virtual {p1, p2}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(Ljava/lang/Object;Lba9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p2, p0, Le29;->d:LdR8;

    invoke-virtual {p2, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final e(Ljava/lang/Object;[BIILzK8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object p2, p1

    check-cast p2, LpU8;

    iget-object p3, p2, LpU8;->zzc:LY69;

    invoke-static {}, LY69;->c()LY69;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LY69;->f()LY69;

    move-result-object p3

    iput-object p3, p2, LpU8;->zzc:LY69;

    :goto_0
    check-cast p1, LfT8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Le29;->b:LQ69;

    invoke-virtual {v0, p1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LQ69;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Le29;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Le29;->d:LdR8;

    invoke-virtual {v0, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Le29;->b:LQ69;

    invoke-virtual {v0, p1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Le29;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Le29;->d:LdR8;

    invoke-virtual {v0, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final zze()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le29;->a:Lr19;

    instance-of v1, v0, LpU8;

    if-eqz v1, :cond_0

    check-cast v0, LpU8;

    invoke-virtual {v0}, LpU8;->l()LpU8;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lr19;->e()Lh19;

    move-result-object v0

    invoke-interface {v0}, Lh19;->R1()Lr19;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le29;->b:LQ69;

    invoke-virtual {v0, p1}, LQ69;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Le29;->d:LdR8;

    invoke-virtual {v0, p1}, LdR8;->b(Ljava/lang/Object;)V

    return-void
.end method
