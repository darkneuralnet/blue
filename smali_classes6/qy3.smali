.class public Lqy3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX94;
.implements LgZ0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LX94<",
        "TT;>;",
        "LgZ0<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:LgZ0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgZ0$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:LgZ0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgZ0$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lny3;

    invoke-direct {v0}, Lny3;-><init>()V

    sput-object v0, Lqy3;->c:LgZ0$a;

    new-instance v0, Loy3;

    invoke-direct {v0}, Loy3;-><init>()V

    sput-object v0, Lqy3;->d:LX94;

    return-void
.end method

.method public constructor <init>(LgZ0$a;LX94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgZ0$a<",
            "TT;>;",
            "LX94<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqy3;->a:LgZ0$a;

    iput-object p2, p0, Lqy3;->b:LX94;

    return-void
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lqy3;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(LX94;)V
    .locals 0

    invoke-static {p0}, Lqy3;->f(LX94;)V

    return-void
.end method

.method public static synthetic d(LgZ0$a;LgZ0$a;LX94;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lqy3;->h(LgZ0$a;LgZ0$a;LX94;)V

    return-void
.end method

.method public static e()Lqy3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lqy3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqy3;

    sget-object v1, Lqy3;->c:LgZ0$a;

    sget-object v2, Lqy3;->d:LX94;

    invoke-direct {v0, v1, v2}, Lqy3;-><init>(LgZ0$a;LX94;)V

    return-object v0
.end method

.method public static synthetic f(LX94;)V
    .locals 0

    return-void
.end method

.method public static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic h(LgZ0$a;LgZ0$a;LX94;)V
    .locals 0

    invoke-interface {p0, p2}, LgZ0$a;->a(LX94;)V

    invoke-interface {p1, p2}, LgZ0$a;->a(LX94;)V

    return-void
.end method

.method public static i(LX94;)Lqy3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LX94<",
            "TT;>;)",
            "Lqy3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqy3;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lqy3;-><init>(LgZ0$a;LX94;)V

    return-object v0
.end method


# virtual methods
.method public a(LgZ0$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgZ0$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqy3;->b:LX94;

    sget-object v1, Lqy3;->d:LX94;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, LgZ0$a;->a(LX94;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqy3;->b:LX94;

    if-eq v0, v1, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lqy3;->a:LgZ0$a;

    new-instance v2, Lpy3;

    invoke-direct {v2, v1, p1}, Lpy3;-><init>(LgZ0$a;LgZ0$a;)V

    iput-object v2, p0, Lqy3;->a:LgZ0$a;

    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, LgZ0$a;->a(LX94;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lqy3;->b:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public j(LX94;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LX94<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqy3;->b:LX94;

    sget-object v1, Lqy3;->d:LX94;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqy3;->a:LgZ0$a;

    const/4 v1, 0x0

    iput-object v1, p0, Lqy3;->a:LgZ0$a;

    iput-object p1, p0, Lqy3;->b:LX94;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, LgZ0$a;->a(LX94;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
