.class public LLN1$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLN1;->i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LLN1;


# direct methods
.method public constructor <init>(LLN1;)V
    .locals 0

    iput-object p1, p0, LLN1$j;->b:LLN1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLN1$j;->b:LLN1;

    invoke-static {v0}, LLN1;->l(LLN1;)Lgz5;

    move-result-object v0

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    iget-object v1, p0, LLN1$j;->b:LLN1;

    invoke-static {v1}, LLN1;->j(LLN1;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LLN1$j;->b:LLN1;

    invoke-static {v2}, LLN1;->j(LLN1;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, LLN1$j;->b:LLN1;

    invoke-static {v2}, LLN1;->j(LLN1;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LLN1$j;->b:LLN1;

    invoke-static {v2}, LLN1;->l(LLN1;)Lgz5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgz5;->h(LqV5;)V

    return-object v1

    :catchall_0
    move-exception v1

    iget-object v2, p0, LLN1$j;->b:LLN1;

    invoke-static {v2}, LLN1;->j(LLN1;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LLN1$j;->b:LLN1;

    invoke-static {v2}, LLN1;->l(LLN1;)Lgz5;

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

    invoke-virtual {p0}, LLN1$j;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
