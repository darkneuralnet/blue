.class public final Lcom/stripe/android/link/theme/LinkShapes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0004\u001a\u0004\u0008\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0004\u001a\u0004\u0008\u000c\u0010\u0006\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/link/theme/LinkShapes;",
        "",
        "Lbc5;",
        "extraSmall",
        "Lbc5;",
        "getExtraSmall",
        "()Lbc5;",
        "small",
        "getSmall",
        "medium",
        "getMedium",
        "large",
        "getLarge",
        "<init>",
        "()V",
        "link_release"
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
        "SMAP\nLinkShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkShapes.kt\ncom/stripe/android/link/theme/LinkShapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,12:1\n154#2:13\n154#2:14\n154#2:15\n154#2:16\n*S KotlinDebug\n*F\n+ 1 LinkShapes.kt\ncom/stripe/android/link/theme/LinkShapes\n*L\n7#1:13\n8#1:14\n9#1:15\n10#1:16\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/theme/LinkShapes;

.field private static final extraSmall:Lbc5;

.field private static final large:Lbc5;

.field private static final medium:Lbc5;

.field private static final small:Lbc5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/theme/LinkShapes;

    invoke-direct {v0}, Lcom/stripe/android/link/theme/LinkShapes;-><init>()V

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->INSTANCE:Lcom/stripe/android/link/theme/LinkShapes;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->extraSmall:Lbc5;

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->small:Lbc5;

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->medium:Lbc5;

    const/16 v0, 0xe

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->large:Lbc5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getExtraSmall()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/theme/LinkShapes;->extraSmall:Lbc5;

    return-object v0
.end method

.method public final getLarge()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/theme/LinkShapes;->large:Lbc5;

    return-object v0
.end method

.method public final getMedium()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/theme/LinkShapes;->medium:Lbc5;

    return-object v0
.end method

.method public final getSmall()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/theme/LinkShapes;->small:Lbc5;

    return-object v0
.end method
