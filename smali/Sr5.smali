.class public final LSr5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001d\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001d\u0010\u0008\u001a\u00020\u00048\u0000X\u0080\u0004\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u001d\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u001a\u0004\u0008\t\u0010\u0007\" \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "LCe3;",
        "position",
        "a",
        "(J)J",
        "Lk61;",
        "F",
        "c",
        "()F",
        "HandleWidth",
        "b",
        "HandleHeight",
        "Lrs5;",
        "LRr5;",
        "Lrs5;",
        "d",
        "()Lrs5;",
        "SelectionHandleInfoKey",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n154#2:71\n154#2:72\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:71\n28#1:72\n*E\n"
    }
.end annotation


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:Lrs5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrs5<",
            "LRr5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x19

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    sput v1, LSr5;->a:F

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LSr5;->b:F

    new-instance v0, Lrs5;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "SelectionHandleInfo"

    invoke-direct {v0, v3, v1, v2, v1}, Lrs5;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSr5;->c:Lrs5;

    return-void
.end method

.method public static final a(J)J
    .locals 1

    invoke-static {p0, p1}, LCe3;->o(J)F

    move-result v0

    invoke-static {p0, p1}, LCe3;->p(J)F

    move-result p0

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p0, p1

    invoke-static {v0, p0}, LGe3;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b()F
    .locals 1

    sget v0, LSr5;->b:F

    return v0
.end method

.method public static final c()F
    .locals 1

    sget v0, LSr5;->a:F

    return v0
.end method

.method public static final d()Lrs5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrs5<",
            "LRr5;",
            ">;"
        }
    .end annotation

    sget-object v0, LSr5;->c:Lrs5;

    return-object v0
.end method
