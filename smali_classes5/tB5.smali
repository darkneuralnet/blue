.class public final LtB5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LtB5$d;,
        LtB5$c;
    }
.end annotation


# static fields
.field public static volatile d:LtB5;


# instance fields
.field public final a:LtB5$c;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LDy0$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LtB5;->b:Ljava/util/Set;

    new-instance v0, LtB5$a;

    invoke-direct {v0, p0, p1}, LtB5$a;-><init>(LtB5;Landroid/content/Context;)V

    invoke-static {v0}, LMC1;->a(LMC1$b;)LMC1$b;

    move-result-object p1

    new-instance v0, LtB5$b;

    invoke-direct {v0, p0}, LtB5$b;-><init>(LtB5;)V

    new-instance v1, LtB5$d;

    invoke-direct {v1, p1, v0}, LtB5$d;-><init>(LMC1$b;LDy0$a;)V

    iput-object v1, p0, LtB5;->a:LtB5$c;

    return-void
.end method

.method public static a(Landroid/content/Context;)LtB5;
    .locals 2

    sget-object v0, LtB5;->d:LtB5;

    if-nez v0, :cond_1

    const-class v0, LtB5;

    monitor-enter v0

    :try_start_0
    sget-object v1, LtB5;->d:LtB5;

    if-nez v1, :cond_0

    new-instance v1, LtB5;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, LtB5;-><init>(Landroid/content/Context;)V

    sput-object v1, LtB5;->d:LtB5;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, LtB5;->d:LtB5;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-boolean v0, p0, LtB5;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LtB5;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LtB5;->a:LtB5$c;

    invoke-interface {v0}, LtB5$c;->register()Z

    move-result v0

    iput-boolean v0, p0, LtB5;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, LtB5;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LtB5;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LtB5;->a:LtB5$c;

    invoke-interface {v0}, LtB5$c;->unregister()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LtB5;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized d(LDy0$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LtB5;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LtB5;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(LDy0$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LtB5;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LtB5;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
