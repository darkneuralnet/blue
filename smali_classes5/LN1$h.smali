.class public LLN1$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLN1;->f(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

.field public final synthetic c:LLN1;


# direct methods
.method public constructor <init>(LLN1;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LLN1$h;->c:LLN1;

    iput-object p2, p0, LLN1$h;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLN1$h;->c:LLN1;

    invoke-static {v0}, LLN1;->j(LLN1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LLN1$h;->c:LLN1;

    invoke-static {v0}, LLN1;->k(LLN1;)Lcf1;

    move-result-object v0

    iget-object v1, p0, LLN1$h;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {v0, v1}, Lcf1;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object v2, p0, LLN1$h;->c:LLN1;

    invoke-static {v2}, LLN1;->j(LLN1;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->A()V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LLN1$h;->c:LLN1;

    invoke-static {v1}, LLN1;->j(LLN1;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LLN1$h;->c:LLN1;

    invoke-static {v1}, LLN1;->j(LLN1;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LLN1$h;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
