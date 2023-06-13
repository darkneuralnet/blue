.class public final Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;",
        "",
        "LPD3;",
        "DropdownMenuItemContentPadding",
        "LPD3;",
        "getDropdownMenuItemContentPadding",
        "()LPD3;",
        "<init>",
        "()V",
        "payments-ui-core_release"
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
        "SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\ncom/stripe/android/ui/core/elements/menu/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,317:1\n154#2:318\n*S KotlinDebug\n*F\n+ 1 Menu.kt\ncom/stripe/android/ui/core/elements/menu/MenuDefaults\n*L\n201#1:318\n*E\n"
    }
.end annotation


# static fields
.field private static final DropdownMenuItemContentPadding:LPD3;

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;->INSTANCE:Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/menu/MenuKt;->getDropdownMenuItemHorizontalPadding()F

    move-result v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v0, v1}, LND3;->b(FF)LPD3;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;->DropdownMenuItemContentPadding:LPD3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDropdownMenuItemContentPadding()LPD3;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/menu/MenuDefaults;->DropdownMenuItemContentPadding:LPD3;

    return-object v0
.end method
