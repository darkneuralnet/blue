.class public final Ljx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVL4;
.implements Luj1$f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LVL4<",
        "TZ;>;",
        "Luj1$f;"
    }
.end annotation


# static fields
.field public static final f:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "Ljx2<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:LLP5;

.field public c:LVL4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVL4<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljx2$a;

    invoke-direct {v0}, Ljx2$a;-><init>()V

    const/16 v1, 0x14

    invoke-static {v1, v0}, Luj1;->d(ILuj1$d;)LgY3;

    move-result-object v0

    sput-object v0, Ljx2;->f:LgY3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LLP5;->a()LLP5;

    move-result-object v0

    iput-object v0, p0, Ljx2;->b:LLP5;

    return-void
.end method

.method public static f(LVL4;)Ljx2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "LVL4<",
            "TZ;>;)",
            "Ljx2<",
            "TZ;>;"
        }
    .end annotation

    sget-object v0, Ljx2;->f:LgY3;

    invoke-interface {v0}, LgY3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljx2;

    invoke-static {v0}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljx2;

    invoke-virtual {v0, p0}, Ljx2;->c(LVL4;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Ljx2;->c:LVL4;

    invoke-interface {v0}, LVL4;->a()I

    move-result v0

    return v0
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljx2;->b:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljx2;->e:Z

    iget-boolean v0, p0, Ljx2;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ljx2;->c:LVL4;

    invoke-interface {v0}, LVL4;->b()V

    invoke-virtual {p0}, Ljx2;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c(LVL4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TZ;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljx2;->e:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljx2;->d:Z

    iput-object p1, p0, Ljx2;->c:LVL4;

    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Ljx2;->c:LVL4;

    invoke-interface {v0}, LVL4;->d()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public e()LLP5;
    .locals 1

    iget-object v0, p0, Ljx2;->b:LLP5;

    return-object v0
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ljx2;->c:LVL4;

    sget-object v0, Ljx2;->f:LgY3;

    invoke-interface {v0, p0}, LgY3;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    iget-object v0, p0, Ljx2;->c:LVL4;

    invoke-interface {v0}, LVL4;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized h()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljx2;->b:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-boolean v0, p0, Ljx2;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljx2;->d:Z

    iget-boolean v0, p0, Ljx2;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljx2;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
