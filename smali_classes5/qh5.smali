.class public Lqh5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqh5$b;
    }
.end annotation


# instance fields
.field public final a:LuE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuE2<",
            "Lak2;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "Lqh5$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LuE2;

    const-wide/16 v1, 0x3e8

    invoke-direct {v0, v1, v2}, LuE2;-><init>(J)V

    iput-object v0, p0, Lqh5;->a:LuE2;

    new-instance v0, Lqh5$a;

    invoke-direct {v0, p0}, Lqh5$a;-><init>(Lqh5;)V

    const/16 v1, 0xa

    invoke-static {v1, v0}, Luj1;->d(ILuj1$d;)LgY3;

    move-result-object v0

    iput-object v0, p0, Lqh5;->b:LgY3;

    return-void
.end method


# virtual methods
.method public final a(Lak2;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lqh5;->b:LgY3;

    invoke-interface {v0}, LgY3;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqh5$b;

    :try_start_0
    iget-object v1, v0, Lqh5$b;->b:Ljava/security/MessageDigest;

    invoke-interface {p1, v1}, Lak2;->a(Ljava/security/MessageDigest;)V

    iget-object p1, v0, Lqh5$b;->b:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Lpi6;->w([B)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lqh5;->b:LgY3;

    invoke-interface {v1, v0}, LgY3;->b(Ljava/lang/Object;)Z

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lqh5;->b:LgY3;

    invoke-interface {v1, v0}, LgY3;->b(Ljava/lang/Object;)Z

    throw p1
.end method

.method public b(Lak2;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lqh5;->a:LuE2;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lqh5;->a:LuE2;

    invoke-virtual {v1, p1}, LuE2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lqh5;->a(Lak2;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v2, p0, Lqh5;->a:LuE2;

    monitor-enter v2

    :try_start_1
    iget-object v0, p0, Lqh5;->a:LuE2;

    invoke-virtual {v0, p1, v1}, LuE2;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
