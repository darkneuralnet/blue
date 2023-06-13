.class public abstract LYV5$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h(IILandroid/graphics/Rect;Landroid/util/Size;IZ)LYV5$d;
    .locals 9

    new-instance v8, Lmu;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    move-object v0, v8

    move v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lmu;-><init>(Ljava/util/UUID;IILandroid/graphics/Rect;Landroid/util/Size;IZ)V

    return-object v8
.end method

.method public static i(LMV5;)LYV5$d;
    .locals 6

    invoke-virtual {p0}, LMV5;->u()I

    move-result v0

    invoke-virtual {p0}, LMV5;->p()I

    move-result v1

    invoke-virtual {p0}, LMV5;->n()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, LMV5;->n()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {p0}, LMV5;->r()I

    move-result v4

    invoke-static {v3, v4}, Lp96;->e(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v3

    invoke-virtual {p0}, LMV5;->r()I

    move-result v4

    invoke-virtual {p0}, LMV5;->q()Z

    move-result v5

    invoke-static/range {v0 .. v5}, LYV5$d;->h(IILandroid/graphics/Rect;Landroid/util/Size;IZ)LYV5$d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a()Landroid/graphics/Rect;
.end method

.method public abstract b()I
.end method

.method public abstract c()Z
.end method

.method public abstract d()I
.end method

.method public abstract e()Landroid/util/Size;
.end method

.method public abstract f()I
.end method

.method public abstract g()Ljava/util/UUID;
.end method
