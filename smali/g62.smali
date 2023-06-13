.class public final Lg62;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\"&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\"&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0005\u0012\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\u000b\u0010\u0007\"\u0017\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u000f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "LgV2;",
        "c",
        "LU94;",
        "",
        "a",
        "LU94;",
        "b",
        "()LU94;",
        "getLocalMinimumInteractiveComponentEnforcement$annotations",
        "()V",
        "LocalMinimumInteractiveComponentEnforcement",
        "getLocalMinimumTouchTargetEnforcement",
        "getLocalMinimumTouchTargetEnforcement$annotations",
        "LocalMinimumTouchTargetEnforcement",
        "Lo61;",
        "J",
        "minimumInteractiveComponentSize",
        "material_release"
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
        "SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,129:1\n135#2:130\n154#3:131\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n49#1:130\n128#1:131\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lg62$a;->g:Lg62$a;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lg62;->a:LU94;

    sput-object v0, Lg62;->b:LU94;

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v1, v0}, Lm61;->b(FF)J

    move-result-wide v0

    sput-wide v0, Lg62;->c:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Lg62;->c:J

    return-wide v0
.end method

.method public static final b()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lg62;->a:LU94;

    return-object v0
.end method

.method public static final c(LgV2;)LgV2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lg62$b;

    invoke-direct {v0}, Lg62$b;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    sget-object v1, Lg62$c;->g:Lg62$c;

    invoke-static {p0, v0, v1}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method
