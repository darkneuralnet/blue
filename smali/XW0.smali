.class public final LXW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "LXW0;",
        "Lma1;",
        "Lpm0;",
        "color",
        "Lk61;",
        "elevation",
        "a",
        "(JFLEt0;I)J",
        "<init>",
        "()V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n154#2:103\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n71#1:103\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LXW0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LXW0;

    invoke-direct {v0}, LXW0;-><init>()V

    sput-object v0, LXW0;->a:LXW0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JFLEt0;I)J
    .locals 3

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)"

    const v2, -0x648f4fbd

    invoke-static {v2, p5, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LTM2;->a:LTM2;

    const/4 v1, 0x6

    invoke-virtual {v0, p4, v1}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {p3, v1}, Lk61;->f(FF)I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LMm0;->o()Z

    move-result v0

    if-nez v0, :cond_1

    and-int/lit8 v0, p5, 0xe

    and-int/lit8 p5, p5, 0x70

    or-int/2addr p5, v0

    invoke-static {p1, p2, p3, p4, p5}, Lna1;->a(JFLEt0;I)J

    move-result-wide p3

    invoke-static {p3, p4, p1, p2}, Lvm0;->d(JJ)J

    move-result-wide p1

    :cond_1
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    return-wide p1
.end method
