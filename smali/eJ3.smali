.class public final LeJ3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u001c\n\u0002\u0010!\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008&\u0010\'J\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0006J6\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J6\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006J&\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J&\u0010 \u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0002R\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010$\u00a8\u0006("
    }
    d2 = {
        "LeJ3;",
        "",
        "",
        "LpJ3;",
        "e",
        "b",
        "",
        "x",
        "y",
        "j",
        "h",
        "dx",
        "dy",
        "i",
        "f",
        "g",
        "m",
        "x1",
        "y1",
        "x2",
        "y2",
        "x3",
        "y3",
        "c",
        "dx1",
        "dy1",
        "dx2",
        "dy2",
        "dx3",
        "dy3",
        "d",
        "k",
        "l",
        "node",
        "a",
        "",
        "Ljava/util/List;",
        "nodes",
        "<init>",
        "()V",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LpJ3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LeJ3;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(LpJ3;)LeJ3;
    .locals 1

    iget-object v0, p0, LeJ3;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()LeJ3;
    .locals 1

    sget-object v0, LpJ3$b;->c:LpJ3$b;

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object v0

    return-object v0
.end method

.method public final c(FFFFFF)LeJ3;
    .locals 8

    new-instance v7, LpJ3$c;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, LpJ3$c;-><init>(FFFFFF)V

    invoke-virtual {p0, v7}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final d(FFFFFF)LeJ3;
    .locals 8

    new-instance v7, LpJ3$k;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, LpJ3$k;-><init>(FFFFFF)V

    invoke-virtual {p0, v7}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LpJ3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LeJ3;->a:Ljava/util/List;

    return-object v0
.end method

.method public final f(F)LeJ3;
    .locals 1

    new-instance v0, LpJ3$d;

    invoke-direct {v0, p1}, LpJ3$d;-><init>(F)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final g(F)LeJ3;
    .locals 1

    new-instance v0, LpJ3$l;

    invoke-direct {v0, p1}, LpJ3$l;-><init>(F)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final h(FF)LeJ3;
    .locals 1

    new-instance v0, LpJ3$e;

    invoke-direct {v0, p1, p2}, LpJ3$e;-><init>(FF)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final i(FF)LeJ3;
    .locals 1

    new-instance v0, LpJ3$m;

    invoke-direct {v0, p1, p2}, LpJ3$m;-><init>(FF)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final j(FF)LeJ3;
    .locals 1

    new-instance v0, LpJ3$f;

    invoke-direct {v0, p1, p2}, LpJ3$f;-><init>(FF)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final k(FFFF)LeJ3;
    .locals 1

    new-instance v0, LpJ3$h;

    invoke-direct {v0, p1, p2, p3, p4}, LpJ3$h;-><init>(FFFF)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final l(FFFF)LeJ3;
    .locals 1

    new-instance v0, LpJ3$p;

    invoke-direct {v0, p1, p2, p3, p4}, LpJ3$p;-><init>(FFFF)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method

.method public final m(F)LeJ3;
    .locals 1

    new-instance v0, LpJ3$r;

    invoke-direct {v0, p1}, LpJ3$r;-><init>(F)V

    invoke-virtual {p0, v0}, LeJ3;->a(LpJ3;)LeJ3;

    move-result-object p1

    return-object p1
.end method
