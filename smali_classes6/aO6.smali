.class public final LaO6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:LzO6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LzO6<",
            "TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LzO6;

    invoke-direct {v0}, LzO6;-><init>()V

    iput-object v0, p0, LaO6;->a:LzO6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)V"
        }
    .end annotation

    iget-object v0, p0, LaO6;->a:LzO6;

    invoke-virtual {v0, p1}, LzO6;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LaO6;->a:LzO6;

    invoke-virtual {v0, p1}, LzO6;->j(Ljava/lang/Exception;)V

    return-void
.end method

.method public final c()LXY5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LXY5<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, LaO6;->a:LzO6;

    return-object v0
.end method

.method public final d(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LaO6;->a:LzO6;

    invoke-virtual {v0, p1}, LzO6;->k(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)V"
        }
    .end annotation

    iget-object v0, p0, LaO6;->a:LzO6;

    invoke-virtual {v0, p1}, LzO6;->i(Ljava/lang/Object;)Z

    return-void
.end method
