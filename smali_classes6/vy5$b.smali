.class public Lvy5$b;
.super Lvy5$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final c:Lvy5$d;


# direct methods
.method public constructor <init>(Lvy5$d;)V
    .locals 0

    invoke-direct {p0}, Lvy5$g;-><init>()V

    iput-object p1, p0, Lvy5$b;->c:Lvy5$d;

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Matrix;LSx5;ILandroid/graphics/Canvas;)V
    .locals 8

    iget-object v0, p0, Lvy5$b;->c:Lvy5$d;

    invoke-static {v0}, Lvy5$d;->h(Lvy5$d;)F

    move-result v6

    iget-object v0, p0, Lvy5$b;->c:Lvy5$d;

    invoke-static {v0}, Lvy5$d;->i(Lvy5$d;)F

    move-result v7

    new-instance v4, Landroid/graphics/RectF;

    iget-object v0, p0, Lvy5$b;->c:Lvy5$d;

    invoke-static {v0}, Lvy5$d;->b(Lvy5$d;)F

    move-result v0

    iget-object v1, p0, Lvy5$b;->c:Lvy5$d;

    invoke-static {v1}, Lvy5$d;->c(Lvy5$d;)F

    move-result v1

    iget-object v2, p0, Lvy5$b;->c:Lvy5$d;

    invoke-static {v2}, Lvy5$d;->d(Lvy5$d;)F

    move-result v2

    iget-object v3, p0, Lvy5$b;->c:Lvy5$d;

    invoke-static {v3}, Lvy5$d;->e(Lvy5$d;)F

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v1, p2

    move-object v2, p4

    move-object v3, p1

    move v5, p3

    invoke-virtual/range {v1 .. v7}, LSx5;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;IFF)V

    return-void
.end method
