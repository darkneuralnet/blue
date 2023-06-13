.class public Lio/github/sceneview/node/LightNode;
.super Lio/github/sceneview/node/Node;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016R:\u0010\u0010\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\u00082\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\u00088\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/github/sceneview/node/LightNode;",
        "Lio/github/sceneview/node/Node;",
        "LPy1;",
        "frameTime",
        "",
        "g",
        "N",
        "",
        "Lio/github/sceneview/light/Light;",
        "value",
        "K",
        "Ljava/lang/Integer;",
        "getLight",
        "()Ljava/lang/Integer;",
        "setLight",
        "(Ljava/lang/Integer;)V",
        "light",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public K:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public N()V
    .locals 1

    invoke-super {p0}, Lio/github/sceneview/node/Node;->N()V

    iget-object v0, p0, Lio/github/sceneview/node/LightNode;->K:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, LNq2;->c(I)V

    :cond_0
    return-void
.end method

.method public g(LPy1;)V
    .locals 9

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->g(LPy1;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->j0()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/github/sceneview/node/LightNode;->K:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, LNq2;->k(I)Lhu1;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->g0()Lhu1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->g0()Lhu1;

    move-result-object v0

    invoke-static {p1, v0}, LNq2;->t(ILhu1;)V

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->h0()LUc4;

    move-result-object v0

    new-instance v7, Lhu1;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lhu1;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, LUc4;

    invoke-direct {v1, v7, v2}, LUc4;-><init>(Lhu1;F)V

    new-instance v2, LUc4;

    invoke-virtual {v0}, LUc4;->a()F

    move-result v3

    invoke-virtual {v1}, LUc4;->b()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {v0}, LUc4;->b()F

    move-result v4

    invoke-virtual {v1}, LUc4;->a()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {v0}, LUc4;->c()F

    move-result v4

    invoke-virtual {v1}, LUc4;->d()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {v0}, LUc4;->d()F

    move-result v4

    invoke-virtual {v1}, LUc4;->c()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {v0}, LUc4;->a()F

    move-result v4

    invoke-virtual {v1}, LUc4;->c()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {v0}, LUc4;->b()F

    move-result v5

    invoke-virtual {v1}, LUc4;->d()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {v0}, LUc4;->c()F

    move-result v5

    invoke-virtual {v1}, LUc4;->a()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {v0}, LUc4;->d()F

    move-result v5

    invoke-virtual {v1}, LUc4;->b()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {v0}, LUc4;->a()F

    move-result v5

    invoke-virtual {v1}, LUc4;->d()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {v0}, LUc4;->b()F

    move-result v6

    invoke-virtual {v1}, LUc4;->c()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {v0}, LUc4;->c()F

    move-result v6

    invoke-virtual {v1}, LUc4;->b()F

    move-result v7

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-virtual {v0}, LUc4;->d()F

    move-result v6

    invoke-virtual {v1}, LUc4;->a()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {v0}, LUc4;->a()F

    move-result v6

    invoke-virtual {v1}, LUc4;->a()F

    move-result v7

    mul-float/2addr v6, v7

    invoke-virtual {v0}, LUc4;->b()F

    move-result v7

    invoke-virtual {v1}, LUc4;->b()F

    move-result v8

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-virtual {v0}, LUc4;->c()F

    move-result v7

    invoke-virtual {v1}, LUc4;->c()F

    move-result v8

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-virtual {v0}, LUc4;->d()F

    move-result v7

    invoke-virtual {v1}, LUc4;->d()F

    move-result v1

    mul-float/2addr v7, v1

    sub-float/2addr v6, v7

    invoke-direct {v2, v3, v4, v5, v6}, LUc4;-><init>(FFFF)V

    invoke-static {v0}, LWc4;->c(LUc4;)LUc4;

    move-result-object v0

    new-instance v1, LUc4;

    invoke-virtual {v2}, LUc4;->a()F

    move-result v3

    invoke-virtual {v0}, LUc4;->b()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {v2}, LUc4;->b()F

    move-result v4

    invoke-virtual {v0}, LUc4;->a()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {v2}, LUc4;->c()F

    move-result v4

    invoke-virtual {v0}, LUc4;->d()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {v2}, LUc4;->d()F

    move-result v4

    invoke-virtual {v0}, LUc4;->c()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {v2}, LUc4;->a()F

    move-result v4

    invoke-virtual {v0}, LUc4;->c()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {v2}, LUc4;->b()F

    move-result v5

    invoke-virtual {v0}, LUc4;->d()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {v2}, LUc4;->c()F

    move-result v5

    invoke-virtual {v0}, LUc4;->a()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {v2}, LUc4;->d()F

    move-result v5

    invoke-virtual {v0}, LUc4;->b()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {v2}, LUc4;->a()F

    move-result v5

    invoke-virtual {v0}, LUc4;->d()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {v2}, LUc4;->b()F

    move-result v6

    invoke-virtual {v0}, LUc4;->c()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {v2}, LUc4;->c()F

    move-result v6

    invoke-virtual {v0}, LUc4;->b()F

    move-result v7

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-virtual {v2}, LUc4;->d()F

    move-result v6

    invoke-virtual {v0}, LUc4;->a()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {v2}, LUc4;->a()F

    move-result v6

    invoke-virtual {v0}, LUc4;->a()F

    move-result v7

    mul-float/2addr v6, v7

    invoke-virtual {v2}, LUc4;->b()F

    move-result v7

    invoke-virtual {v0}, LUc4;->b()F

    move-result v8

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-virtual {v2}, LUc4;->c()F

    move-result v7

    invoke-virtual {v0}, LUc4;->c()F

    move-result v8

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-virtual {v2}, LUc4;->d()F

    move-result v2

    invoke-virtual {v0}, LUc4;->d()F

    move-result v0

    mul-float/2addr v2, v0

    sub-float/2addr v6, v2

    invoke-direct {v1, v3, v4, v5, v6}, LUc4;-><init>(FFFF)V

    new-instance v0, Lhu1;

    invoke-virtual {v1}, LUc4;->b()F

    move-result v2

    invoke-virtual {v1}, LUc4;->c()F

    move-result v3

    invoke-virtual {v1}, LUc4;->d()F

    move-result v1

    invoke-direct {v0, v2, v3, v1}, Lhu1;-><init>(FFF)V

    invoke-static {p1}, LNq2;->e(I)Lhu1;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1, v0}, LNq2;->r(ILhu1;)V

    :cond_1
    return-void
.end method
