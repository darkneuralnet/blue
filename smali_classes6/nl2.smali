.class public final Lnl2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkl2$b;


# direct methods
.method public constructor <init>(Lkl2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnl2;->a:Lkl2$b;

    return-void
.end method

.method public static i()Lnl2;
    .locals 2

    new-instance v0, Lnl2;

    invoke-static {}, Lkl2;->O()Lkl2$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lnl2;-><init>(Lkl2$b;)V

    return-object v0
.end method

.method public static j(Lll2;)Lnl2;
    .locals 1

    new-instance v0, Lnl2;

    invoke-virtual {p0}, Lll2;->f()Lkl2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;->D()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object p0

    check-cast p0, Lkl2$b;

    invoke-direct {v0, p0}, Lnl2;-><init>(Lkl2$b;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(LJk2;)Lnl2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, LJk2;->b()LKk2;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnl2;->b(LKk2;Z)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(LKk2;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lnl2;->f(LKk2;)Lkl2$c;

    move-result-object p1

    iget-object v0, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {v0, p1}, Lkl2$b;->y(Lkl2$c;)Lkl2$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {p1}, Lkl2$c;->L()I

    move-result v0

    invoke-virtual {p2, v0}, Lkl2$b;->C(I)Lkl2$b;

    :cond_0
    invoke-virtual {p1}, Lkl2$c;->L()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(Lhk2;LeA3;)Lkl2$c;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lnl2;->g()I

    move-result v0

    sget-object v1, LeA3;->c:LeA3;

    if-eq p2, v1, :cond_0

    invoke-static {}, Lkl2$c;->P()Lkl2$c$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkl2$c$a;->y(Lhk2;)Lkl2$c$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lkl2$c$a;->z(I)Lkl2$c$a;

    move-result-object p1

    sget-object v0, LIk2;->d:LIk2;

    invoke-virtual {p1, v0}, Lkl2$c$a;->B(LIk2;)Lkl2$c$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lkl2$c$a;->A(LeA3;)Lkl2$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, Lkl2$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d()Lll2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    check-cast v0, Lkl2;

    invoke-static {v0}, Lll2;->e(Lkl2;)Lll2;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized e(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {v0}, Lkl2$b;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkl2$c;

    invoke-virtual {v1}, Lkl2$c;->L()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized f(LKk2;)Lkl2$c;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, LNt4;->j(LKk2;)Lhk2;

    move-result-object v0

    invoke-virtual {p1}, LKk2;->K()LeA3;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lnl2;->c(Lhk2;LeA3;)Lkl2$c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized g()I
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lsi6;->b()I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Lnl2;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lsi6;->b()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h(I)Lnl2;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {v1}, Lkl2$b;->A()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {v1, v0}, Lkl2$b;->z(I)Lkl2$c;

    move-result-object v1

    invoke-virtual {v1}, Lkl2$c;->L()I

    move-result v2

    if-ne v2, p1, :cond_1

    invoke-virtual {v1}, Lkl2$c;->N()LIk2;

    move-result-object v0

    sget-object v1, LIk2;->d:LIk2;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnl2;->a:Lkl2$b;

    invoke-virtual {v0, p1}, Lkl2$b;->C(I)Lkl2$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
