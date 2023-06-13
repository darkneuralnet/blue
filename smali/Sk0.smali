.class public final LSk0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u001d\u0010\u0008\u001a\u00020\u00048\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\t\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "LgV2;",
        "LEy3;",
        "orientation",
        "a",
        "Lk61;",
        "F",
        "b",
        "()F",
        "MaxSupportedElevation",
        "LgV2;",
        "HorizontalScrollableClipModifier",
        "c",
        "VerticalScrollableClipModifier",
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
        "SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n154#2:98\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n61#1:98\n*E\n"
    }
.end annotation


# static fields
.field public static final a:F

.field public static final b:LgV2;

.field public static final c:LgV2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1e

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LSk0;->a:F

    sget-object v0, LgV2;->b0:LgV2$a;

    new-instance v1, LSk0$a;

    invoke-direct {v1}, LSk0$a;-><init>()V

    invoke-static {v0, v1}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v1

    sput-object v1, LSk0;->b:LgV2;

    new-instance v1, LSk0$b;

    invoke-direct {v1}, LSk0$b;-><init>()V

    invoke-static {v0, v1}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v0

    sput-object v0, LSk0;->c:LgV2;

    return-void
.end method

.method public static final a(LgV2;LEy3;)LgV2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LEy3;->b:LEy3;

    if-ne p1, v0, :cond_0

    sget-object p1, LSk0;->c:LgV2;

    goto :goto_0

    :cond_0
    sget-object p1, LSk0;->b:LgV2;

    :goto_0
    invoke-interface {p0, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final b()F
    .locals 1

    sget v0, LSk0;->a:F

    return v0
.end method
