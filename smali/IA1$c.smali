.class public LIA1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIA1;->m(ZLcom/google/common/util/concurrent/ListenableFuture;LxA1;LO80$a;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LO80$a;

.field public final synthetic b:LxA1;


# direct methods
.method public constructor <init>(LO80$a;LxA1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LIA1$c;->a:LO80$a;

    iput-object p2, p0, LIA1$c;->b:LxA1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LIA1$c;->a:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LIA1$c;->a:LO80$a;

    iget-object v1, p0, LIA1$c;->b:LxA1;

    invoke-interface {v1, p1}, LxA1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, LO80$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LIA1$c;->a:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
