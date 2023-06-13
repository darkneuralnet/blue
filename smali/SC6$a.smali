.class public LSC6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSC6;->a(Landroid/content/Context;Ljava/util/UUID;LYw1;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lew5;

.field public final synthetic c:Ljava/util/UUID;

.field public final synthetic d:LYw1;

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:LSC6;


# direct methods
.method public constructor <init>(LSC6;Lew5;Ljava/util/UUID;LYw1;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LSC6$a;->f:LSC6;

    iput-object p2, p0, LSC6$a;->b:Lew5;

    iput-object p3, p0, LSC6$a;->c:Ljava/util/UUID;

    iput-object p4, p0, LSC6$a;->d:LYw1;

    iput-object p5, p0, LSC6$a;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, LSC6$a;->b:Lew5;

    invoke-virtual {v0}, Lw0;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LSC6$a;->c:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LSC6$a;->f:LSC6;

    iget-object v1, v1, LSC6;->c:LIG6;

    invoke-interface {v1, v0}, LIG6;->l(Ljava/lang/String;)LHG6;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, v1, LHG6;->b:LUC6$a;

    invoke-virtual {v2}, LUC6$a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, LSC6$a;->f:LSC6;

    iget-object v2, v2, LSC6;->b:LZw1;

    iget-object v3, p0, LSC6$a;->d:LYw1;

    invoke-interface {v2, v0, v3}, LZw1;->a(Ljava/lang/String;LYw1;)V

    iget-object v0, p0, LSC6$a;->e:Landroid/content/Context;

    invoke-static {v1}, LKG6;->a(LHG6;)LTC6;

    move-result-object v1

    iget-object v2, p0, LSC6$a;->d:LYw1;

    invoke-static {v0, v1, v2}, Landroidx/work/impl/foreground/a;->c(Landroid/content/Context;LTC6;LYw1;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, LSC6$a;->e:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, LSC6$a;->b:Lew5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lew5;->p(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, LSC6$a;->b:Lew5;

    invoke-virtual {v1, v0}, Lew5;->q(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method
