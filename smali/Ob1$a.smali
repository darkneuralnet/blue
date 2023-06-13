.class public LOb1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOb1;->e0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "LO22;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LOb1;


# direct methods
.method public constructor <init>(LOb1;)V
    .locals 0

    iput-object p1, p0, LOb1$a;->a:LOb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO22;)V
    .locals 2

    iget-object v0, p0, LOb1$a;->a:LOb1;

    invoke-virtual {v0}, LOb1;->z()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, LO22;->d(J)V

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LO22;->a(Z)V

    invoke-interface {p1}, LO22;->b()Z

    invoke-interface {p1}, LO22;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, LOb1$a$a;

    invoke-direct {v0, p0}, LOb1$a$a;-><init>(LOb1$a;)V

    iget-object v1, p0, LOb1$a;->a:LOb1;

    iget-object v1, v1, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, LOb1$a;->a:LOb1;

    const/4 v1, 0x0

    const-string v2, "Unable to acquire InputBuffer."

    invoke-virtual {v0, v1, v2, p1}, LOb1;->B(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LO22;

    invoke-virtual {p0, p1}, LOb1$a;->a(LO22;)V

    return-void
.end method
