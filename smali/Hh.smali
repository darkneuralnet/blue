.class public final LHh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R \u0010\u0006\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R \u0010\t\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0005R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0012"
    }
    d2 = {
        "LHh;",
        "",
        "Lk61;",
        "b",
        "F",
        "()F",
        "TopAppBarElevation",
        "c",
        "getBottomAppBarElevation-D9Ej5fM",
        "BottomAppBarElevation",
        "LPD3;",
        "d",
        "LPD3;",
        "a",
        "()LPD3;",
        "ContentPadding",
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
        "SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,547:1\n154#2:548\n154#2:549\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n250#1:548\n255#1:549\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LHh;

.field public static final b:F

.field public static final c:F

.field public static final d:LPD3;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LHh;

    invoke-direct {v0}, LHh;-><init>()V

    sput-object v0, LHh;->a:LHh;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LHh;->b:F

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LHh;->c:F

    invoke-static {}, LIh;->f()F

    move-result v1

    const/4 v2, 0x0

    invoke-static {}, LIh;->f()F

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LND3;->e(FFFFILjava/lang/Object;)LPD3;

    move-result-object v0

    sput-object v0, LHh;->d:LPD3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LPD3;
    .locals 1

    sget-object v0, LHh;->d:LPD3;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LHh;->b:F

    return v0
.end method
