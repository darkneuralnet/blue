.class public LLy6$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLy6;->a()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LLy6;


# direct methods
.method public constructor <init>(LLy6;)V
    .locals 0

    iput-object p1, p0, LLy6$d;->b:LLy6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLy6$d;->b:LLy6;

    invoke-static {v0}, LLy6;->f(LLy6;)Lgz5;

    move-result-object v0

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    iget-object v1, p0, LLy6$d;->b:LLy6;

    invoke-static {v1}, LLy6;->d(LLy6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object v1, p0, LLy6$d;->b:LLy6;

    invoke-static {v1}, LLy6;->d(LLy6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LLy6$d;->b:LLy6;

    invoke-static {v1}, LLy6;->d(LLy6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LLy6$d;->b:LLy6;

    invoke-static {v1}, LLy6;->f(LLy6;)Lgz5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    iget-object v2, p0, LLy6$d;->b:LLy6;

    invoke-static {v2}, LLy6;->d(LLy6;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LLy6$d;->b:LLy6;

    invoke-static {v2}, LLy6;->f(LLy6;)Lgz5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgz5;->h(LqV5;)V

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LLy6$d;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
