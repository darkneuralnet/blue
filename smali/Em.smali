.class public LEm;
.super LnZ5;
.source "SourceFile"


# static fields
.field public static volatile c:LEm;

.field public static final d:Ljava/util/concurrent/Executor;

.field public static final e:Ljava/util/concurrent/Executor;


# instance fields
.field public a:LnZ5;

.field public final b:LnZ5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LCm;

    invoke-direct {v0}, LCm;-><init>()V

    sput-object v0, LEm;->d:Ljava/util/concurrent/Executor;

    new-instance v0, LDm;

    invoke-direct {v0}, LDm;-><init>()V

    sput-object v0, LEm;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LnZ5;-><init>()V

    new-instance v0, LMY0;

    invoke-direct {v0}, LMY0;-><init>()V

    iput-object v0, p0, LEm;->b:LnZ5;

    iput-object v0, p0, LEm;->a:LnZ5;

    return-void
.end method

.method public static synthetic e(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, LEm;->k(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, LEm;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static g()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LEm;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static h()LEm;
    .locals 2

    sget-object v0, LEm;->c:LEm;

    if-eqz v0, :cond_0

    sget-object v0, LEm;->c:LEm;

    return-object v0

    :cond_0
    const-class v0, LEm;

    monitor-enter v0

    :try_start_0
    sget-object v1, LEm;->c:LEm;

    if-nez v1, :cond_1

    new-instance v1, LEm;

    invoke-direct {v1}, LEm;-><init>()V

    sput-object v1, LEm;->c:LEm;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, LEm;->c:LEm;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static i()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LEm;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static synthetic j(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, LEm;->h()LEm;

    move-result-object v0

    invoke-virtual {v0, p0}, LEm;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic k(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, LEm;->h()LEm;

    move-result-object v0

    invoke-virtual {v0, p0}, LEm;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LEm;->a:LnZ5;

    invoke-virtual {v0, p1}, LnZ5;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LEm;->a:LnZ5;

    invoke-virtual {v0}, LnZ5;->c()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LEm;->a:LnZ5;

    invoke-virtual {v0, p1}, LnZ5;->d(Ljava/lang/Runnable;)V

    return-void
.end method
