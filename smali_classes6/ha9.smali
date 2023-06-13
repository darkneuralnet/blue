.class public final Lha9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZP8<",
            "LMb9<",
            "+TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(ZLZP8;LT99;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lha9;->a:Z

    iput-object p2, p0, Lha9;->b:LZP8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LMb9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TC;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TC;>;"
        }
    .end annotation

    new-instance v0, Le79;

    iget-object v1, p0, Lha9;->b:LZP8;

    iget-boolean v2, p0, Lha9;->a:Z

    invoke-direct {v0, v1, v2, p2, p1}, Le79;-><init>(LXO8;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public final b(Lc69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            ">(",
            "Lc69<",
            "TC;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TC;>;"
        }
    .end annotation

    new-instance v0, Le79;

    iget-object v1, p0, Lha9;->b:LZP8;

    iget-boolean v2, p0, Lha9;->a:Z

    invoke-direct {v0, v1, v2, p2, p1}, Le79;-><init>(LXO8;ZLjava/util/concurrent/Executor;Lc69;)V

    return-object v0
.end method
