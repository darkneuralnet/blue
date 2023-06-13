.class public final enum LYU3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYU3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYU3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\u0008\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000ej\u0002\u0008\u0012j\u0002\u0008\u0015j\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 \u00a8\u0006!"
    }
    d2 = {
        "LYU3;",
        "",
        "",
        "b",
        "F",
        "getInstantPlacementDistance",
        "()F",
        "setInstantPlacementDistance",
        "(F)V",
        "instantPlacementDistance",
        "",
        "c",
        "Z",
        "getInstantPlacementFallback",
        "()Z",
        "setInstantPlacementFallback",
        "(Z)V",
        "instantPlacementFallback",
        "d",
        "planeEnabled",
        "Lcom/google/ar/core/Config$PlaneFindingMode;",
        "e",
        "()Lcom/google/ar/core/Config$PlaneFindingMode;",
        "planeFindingMode",
        "depthEnabled",
        "instantPlacementEnabled",
        "<init>",
        "(Ljava/lang/String;IFZ)V",
        "f",
        "g",
        "h",
        "i",
        "j",
        "arsceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum d:LYU3;

.field public static final enum e:LYU3;

.field public static final enum f:LYU3;

.field public static final enum g:LYU3;

.field public static final enum h:LYU3;

.field public static final enum i:LYU3;

.field public static final enum j:LYU3;

.field public static final synthetic k:[LYU3;


# instance fields
.field public b:F

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v7, LYU3;

    const-string v1, "DISABLED"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, LYU3;->d:LYU3;

    new-instance v0, LYU3;

    const-string v9, "PLANE_HORIZONTAL"

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYU3;->e:LYU3;

    new-instance v0, LYU3;

    const-string v2, "PLANE_VERTICAL"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYU3;->f:LYU3;

    new-instance v0, LYU3;

    const-string v9, "PLANE_HORIZONTAL_AND_VERTICAL"

    const/4 v10, 0x3

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYU3;->g:LYU3;

    new-instance v0, LYU3;

    const-string v2, "DEPTH"

    const/4 v3, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYU3;->h:LYU3;

    new-instance v0, LYU3;

    const-string v9, "INSTANT"

    const/4 v10, 0x5

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYU3;->i:LYU3;

    new-instance v0, LYU3;

    const-string v2, "BEST_AVAILABLE"

    const/4 v3, 0x6

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LYU3;-><init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYU3;->j:LYU3;

    invoke-static {}, LYU3;->a()[LYU3;

    move-result-object v0

    sput-object v0, LYU3;->k:[LYU3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IFZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LYU3;->b:F

    iput-boolean p4, p0, LYU3;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p3, Lio/github/sceneview/ar/node/ArModelNode;->W0:Lio/github/sceneview/ar/node/ArModelNode$a;

    invoke-virtual {p3}, Lio/github/sceneview/ar/node/ArModelNode$a;->a()F

    move-result p3

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LYU3;-><init>(Ljava/lang/String;IFZ)V

    return-void
.end method

.method public static final synthetic a()[LYU3;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LYU3;

    const/4 v1, 0x0

    sget-object v2, LYU3;->d:LYU3;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LYU3;->e:LYU3;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LYU3;->f:LYU3;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LYU3;->g:LYU3;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LYU3;->h:LYU3;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LYU3;->i:LYU3;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LYU3;->j:LYU3;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LYU3;
    .locals 1

    const-class v0, LYU3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYU3;

    return-object p0
.end method

.method public static values()[LYU3;
    .locals 1

    sget-object v0, LYU3;->k:[LYU3;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYU3;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 2

    sget-object v0, LYU3$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public final c()Z
    .locals 1

    sget-object v0, LYU3;->i:LYU3;

    if-eq p0, v0, :cond_1

    iget-boolean v0, p0, LYU3;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final d()Z
    .locals 3

    invoke-virtual {p0}, LYU3;->e()Lcom/google/ar/core/Config$PlaneFindingMode;

    move-result-object v0

    sget-object v1, LYU3$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    return v1
.end method

.method public final e()Lcom/google/ar/core/Config$PlaneFindingMode;
    .locals 2

    sget-object v0, LYU3$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/ar/core/Config$PlaneFindingMode;->DISABLED:Lcom/google/ar/core/Config$PlaneFindingMode;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/ar/core/Config$PlaneFindingMode;->HORIZONTAL_AND_VERTICAL:Lcom/google/ar/core/Config$PlaneFindingMode;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/google/ar/core/Config$PlaneFindingMode;->VERTICAL:Lcom/google/ar/core/Config$PlaneFindingMode;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/ar/core/Config$PlaneFindingMode;->HORIZONTAL:Lcom/google/ar/core/Config$PlaneFindingMode;

    :goto_0
    return-object v0
.end method
