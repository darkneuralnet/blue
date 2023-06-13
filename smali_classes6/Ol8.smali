.class public abstract LOl8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LNp9;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i()LAl8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LNp9;",
            ">()",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LLi8;

    invoke-direct {v0}, LLi8;-><init>()V

    invoke-static {}, LOn8;->a()LOn8;

    move-result-object v1

    invoke-virtual {v0, v1}, LLi8;->h(LOn8;)LAl8;

    invoke-static {}, Lqv8;->a()Lqv8;

    move-result-object v1

    invoke-virtual {v0, v1}, LAl8;->b(Lmj8;)LAl8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LAl8;->d(Z)LAl8;

    invoke-virtual {v0, v1}, LAl8;->a(Z)LAl8;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LAl8;->f(Z)LAl8;

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroid/net/Uri;
.end method

.method public abstract b()Lmj8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmj8<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract c()LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "LNj8<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public abstract d()LNp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract e()Z
.end method

.method public abstract f()Z
.end method

.method public abstract g()Z
.end method

.method public abstract h()LOn8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LOn8;"
        }
    .end annotation
.end method
