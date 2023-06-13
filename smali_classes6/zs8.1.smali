.class public final Lzs8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzj8;


# instance fields
.field public final synthetic a:LOs8;


# direct methods
.method public synthetic constructor <init>(LOs8;LCr8;)V
    .locals 0

    iput-object p1, p0, Lzs8;->a:LOs8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk69;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzs8;->a:LOs8;

    invoke-static {v0}, LOs8;->c(LOs8;)LYA8;

    move-result-object v0

    invoke-virtual {v0}, LYA8;->a()V

    iget-object v0, p0, Lzs8;->a:LOs8;

    invoke-static {v0}, LOs8;->b(LOs8;)Lxy8;

    move-result-object v0

    invoke-virtual {v0}, Lxy8;->b()LMb9;

    move-result-object v0

    invoke-static {v0}, Lva9;->h(LMb9;)LMb9;

    move-result-object v0

    new-instance v1, Lws8;

    invoke-direct {v1, p0, p1, p2}, Lws8;-><init>(Lzs8;Lk69;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, LKD8;->c(Lk69;)Lk69;

    move-result-object p1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method
