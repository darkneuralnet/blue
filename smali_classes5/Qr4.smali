.class public LQr4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LA62;)V
    .locals 1

    const-string v0, "strategy == null"

    invoke-static {p0, v0}, LBZ3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static b()Lio/reactivex/Observable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lz62;->b()Lz62;

    move-result-object v0

    invoke-virtual {v0}, Lz62;->i()LA62;

    move-result-object v1

    invoke-virtual {v0}, Lz62;->f()I

    move-result v2

    invoke-virtual {v0}, Lz62;->g()I

    move-result v3

    invoke-virtual {v0}, Lz62;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lz62;->h()I

    move-result v5

    invoke-virtual {v0}, Lz62;->j()I

    move-result v6

    invoke-virtual {v0}, Lz62;->e()I

    move-result v7

    invoke-virtual {v0}, Lz62;->c()Lgg1;

    move-result-object v8

    invoke-static/range {v1 .. v8}, LQr4;->c(LA62;IILjava/lang/String;IIILgg1;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public static c(LA62;IILjava/lang/String;IIILgg1;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LA62;",
            "II",
            "Ljava/lang/String;",
            "III",
            "Lgg1;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LQr4;->a(LA62;)V

    invoke-interface/range {p0 .. p7}, LA62;->a(IILjava/lang/String;IIILgg1;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Observable<",
            "LBy0;",
            ">;"
        }
    .end annotation

    invoke-static {}, LBZ3;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LoM2;

    invoke-direct {v0}, LoM2;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {}, LBZ3;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lfz2;

    invoke-direct {v0}, Lfz2;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, LcZ3;

    invoke-direct {v0}, LcZ3;-><init>()V

    :goto_0
    invoke-static {p0, v0}, LQr4;->e(Landroid/content/Context;LI73;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;LI73;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LI73;",
            ")",
            "Lio/reactivex/Observable<",
            "LBy0;",
            ">;"
        }
    .end annotation

    const-string v0, "context == null"

    invoke-static {p0, v0}, LBZ3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strategy == null"

    invoke-static {p1, v0}, LBZ3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, LI73;->a(Landroid/content/Context;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method
