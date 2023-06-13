.class public LPX5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPX5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Landroid/os/Handler;

.field public final d:Lvf0;

.field public final e:LTe4;

.field public final f:LTe4;

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Lvf0;LTe4;LTe4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPX5$a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LPX5$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, LPX5$a;->c:Landroid/os/Handler;

    iput-object p4, p0, LPX5$a;->d:Lvf0;

    iput-object p5, p0, LPX5$a;->e:LTe4;

    iput-object p6, p0, LPX5$a;->f:LTe4;

    new-instance p1, LPw1;

    invoke-direct {p1, p5, p6}, LPw1;-><init>(LTe4;LTe4;)V

    invoke-virtual {p1}, LPw1;->b()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lrw6;

    invoke-direct {p1, p5}, Lrw6;-><init>(LTe4;)V

    invoke-virtual {p1}, Lrw6;->i()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, LOw1;

    invoke-direct {p1, p6}, LOw1;-><init>(LTe4;)V

    invoke-virtual {p1}, LOw1;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, LPX5$a;->g:Z

    return-void
.end method


# virtual methods
.method public a()LPX5;
    .locals 9

    new-instance v0, LPX5;

    iget-boolean v1, p0, LPX5$a;->g:Z

    if-eqz v1, :cond_0

    new-instance v1, LOX5;

    iget-object v3, p0, LPX5$a;->e:LTe4;

    iget-object v4, p0, LPX5$a;->f:LTe4;

    iget-object v5, p0, LPX5$a;->d:Lvf0;

    iget-object v6, p0, LPX5$a;->a:Ljava/util/concurrent/Executor;

    iget-object v7, p0, LPX5$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v8, p0, LPX5$a;->c:Landroid/os/Handler;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LOX5;-><init>(LTe4;LTe4;Lvf0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    goto :goto_0

    :cond_0
    new-instance v1, LJX5;

    iget-object v2, p0, LPX5$a;->d:Lvf0;

    iget-object v3, p0, LPX5$a;->a:Ljava/util/concurrent/Executor;

    iget-object v4, p0, LPX5$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, p0, LPX5$a;->c:Landroid/os/Handler;

    invoke-direct {v1, v2, v3, v4, v5}, LJX5;-><init>(Lvf0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    :goto_0
    invoke-direct {v0, v1}, LPX5;-><init>(LPX5$b;)V

    return-object v0
.end method
