.class public final Laa9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final c:LM99;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LM99<",
            "-TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;LM99;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "TV;>;",
            "LM99<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa9;->b:Ljava/util/concurrent/Future;

    iput-object p2, p0, Laa9;->c:LM99;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Laa9;->b:Ljava/util/concurrent/Future;

    instance-of v1, v0, Lse9;

    if-eqz v1, :cond_1

    check-cast v0, Lse9;

    invoke-static {v0}, Lze9;->a(Lse9;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Laa9;->c:LM99;

    invoke-interface {v1, v0}, LM99;->zza(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Laa9;->b:Ljava/util/concurrent/Future;

    invoke-static {v0}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Laa9;->c:LM99;

    invoke-interface {v1, v0}, LM99;->zzb(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    iget-object v1, p0, Laa9;->c:LM99;

    invoke-interface {v1, v0}, LM99;->zza(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception v0

    iget-object v1, p0, Laa9;->c:LM99;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, LM99;->zza(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, LgJ8;->a(Ljava/lang/Object;)LUI8;

    move-result-object v0

    iget-object v1, p0, Laa9;->c:LM99;

    invoke-virtual {v0, v1}, LUI8;->a(Ljava/lang/Object;)LUI8;

    invoke-virtual {v0}, LUI8;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
