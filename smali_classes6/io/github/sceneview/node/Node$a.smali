.class public final Lio/github/sceneview/node/Node$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/sceneview/node/Node;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u0005R\u0015\u0010\u0010\u001a\u00060\u0002j\u0002`\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/github/sceneview/node/Node$a;",
        "",
        "Lhu1;",
        "Lio/github/sceneview/math/Position;",
        "a",
        "()Lhu1;",
        "DEFAULT_POSITION",
        "LUc4;",
        "b",
        "()LUc4;",
        "DEFAULT_QUATERNION",
        "DEFAULT_ROTATION",
        "Lhu1;",
        "c",
        "Lio/github/sceneview/math/Scale;",
        "d",
        "DEFAULT_SCALE",
        "<init>",
        "()V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lio/github/sceneview/node/Node$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lhu1;
    .locals 2

    new-instance v0, Lhu1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lhu1;-><init>(FFF)V

    return-object v0
.end method

.method public final b()LUc4;
    .locals 8

    new-instance v7, LUc4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LUc4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final c()Lhu1;
    .locals 1

    invoke-static {}, Lio/github/sceneview/node/Node;->J()Lhu1;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lhu1;
    .locals 2

    new-instance v0, Lhu1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lhu1;-><init>(F)V

    return-object v0
.end method
