.class public LF90$h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF90$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public b:Ljava/util/concurrent/Executor;

.field public c:Z

.field public final synthetic d:LF90$h;


# direct methods
.method public constructor <init>(LF90$h;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, LF90$h$b;->d:LF90$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LF90$h$b;->c:Z

    iput-object p2, p0, LF90$h$b;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(LF90$h$b;)V
    .locals 0

    invoke-direct {p0}, LF90$h$b;->c()V

    return-void
.end method

.method private synthetic c()V
    .locals 3

    iget-boolean v0, p0, LF90$h$b;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LF90$h$b;->d:LF90$h;

    iget-object v0, v0, LF90$h;->f:LF90;

    iget-object v0, v0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->h:LF90$g;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    iget-object v0, p0, LF90$h$b;->d:LF90$h;

    invoke-virtual {v0}, LF90$h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LF90$h$b;->d:LF90$h;

    iget-object v0, v0, LF90$h;->f:LF90;

    invoke-virtual {v0, v2}, LF90;->r0(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LF90$h$b;->d:LF90$h;

    iget-object v0, v0, LF90$h;->f:LF90;

    invoke-virtual {v0, v2}, LF90;->s0(Z)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF90$h$b;->c:Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, LF90$h$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LG90;

    invoke-direct {v1, p0}, LG90;-><init>(LF90$h$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
