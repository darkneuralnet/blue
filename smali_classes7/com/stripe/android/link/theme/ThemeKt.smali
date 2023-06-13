.class public final Lcom/stripe/android/link/theme/ThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001d\u0010\u0008\u001a\u00020\u00078\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u001d\u0010\u000c\u001a\u00020\u00078\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\r\u0010\u000b\"\u001d\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000f\u0010\u000b\"\u001d\u0010\u0010\u001a\u00020\u00078\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\t\u001a\u0004\u0008\u0011\u0010\u000b\"\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\"\u0018\u0010\u0019\u001a\u00020\u0013*\u00020\u00168AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\"\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00168AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "",
        "darkTheme",
        "Lkotlin/Function0;",
        "",
        "content",
        "DefaultLinkTheme",
        "(ZLkotlin/jvm/functions/Function2;LEt0;II)V",
        "Lk61;",
        "MinimumTouchTargetSize",
        "F",
        "getMinimumTouchTargetSize",
        "()F",
        "AppBarHeight",
        "getAppBarHeight",
        "PrimaryButtonHeight",
        "getPrimaryButtonHeight",
        "HorizontalPadding",
        "getHorizontalPadding",
        "LU94;",
        "Lcom/stripe/android/link/theme/LinkColors;",
        "LocalColors",
        "LU94;",
        "LTM2;",
        "getLinkColors",
        "(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;",
        "linkColors",
        "Lcom/stripe/android/link/theme/LinkShapes;",
        "getLinkShapes",
        "(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;",
        "linkShapes",
        "link_release"
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
        "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/stripe/android/link/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,44:1\n76#2:45\n154#3:46\n154#3:47\n154#3:48\n154#3:49\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/stripe/android/link/theme/ThemeKt\n*L\n38#1:45\n11#1:46\n12#1:47\n13#1:48\n14#1:49\n*E\n"
    }
.end annotation


# static fields
.field private static final AppBarHeight:F

.field private static final HorizontalPadding:F

.field private static final LocalColors:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/link/theme/LinkColors;",
            ">;"
        }
    .end annotation
.end field

.field private static final MinimumTouchTargetSize:F

.field private static final PrimaryButtonHeight:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/link/theme/ThemeKt;->MinimumTouchTargetSize:F

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    sput v1, Lcom/stripe/android/link/theme/ThemeKt;->AppBarHeight:F

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/link/theme/ThemeKt;->PrimaryButtonHeight:F

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/link/theme/ThemeKt;->HorizontalPadding:F

    sget-object v0, Lcom/stripe/android/link/theme/ThemeKt$LocalColors$1;->INSTANCE:Lcom/stripe/android/link/theme/ThemeKt$LocalColors$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/ThemeKt;->LocalColors:LU94;

    return-void
.end method

.method public static final DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x138a1a13

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    and-int/lit8 v1, p4, 0x1

    if-nez v1, :cond_0

    invoke-interface {p2, p0}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p3, 0x70

    if-nez v2, :cond_4

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, v1, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_7

    :cond_6
    :goto_4
    invoke-interface {p2}, LEt0;->J()V

    and-int/lit8 v2, p3, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    invoke-interface {p2}, LEt0;->l()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p2}, LEt0;->k()V

    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_9

    goto :goto_6

    :cond_8
    :goto_5
    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_9

    invoke-static {p2, v3}, LwS0;->a(LEt0;I)Z

    move-result p0

    :goto_6
    and-int/lit8 v1, v1, -0xf

    :cond_9
    invoke-interface {p2}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.theme.DefaultLinkTheme (Theme.kt:18)"

    invoke-static {v0, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    sget-object v0, Lcom/stripe/android/link/theme/LinkThemeConfig;->INSTANCE:Lcom/stripe/android/link/theme/LinkThemeConfig;

    invoke-virtual {v0, p0}, Lcom/stripe/android/link/theme/LinkThemeConfig;->colors(Z)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v0

    const/4 v2, 0x1

    new-array v4, v2, [LW94;

    sget-object v5, Lcom/stripe/android/link/theme/ThemeKt;->LocalColors:LU94;

    invoke-virtual {v5, v0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v5

    aput-object v5, v4, v3

    new-instance v3, Lcom/stripe/android/link/theme/ThemeKt$DefaultLinkTheme$1;

    invoke-direct {v3, v0, p1, v1}, Lcom/stripe/android/link/theme/ThemeKt$DefaultLinkTheme$1;-><init>(Lcom/stripe/android/link/theme/LinkColors;Lkotlin/jvm/functions/Function2;I)V

    const v0, 0x577faaad

    invoke-static {p2, v0, v2, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v4, v0, p2, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_7
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_c

    goto :goto_8

    :cond_c
    new-instance v0, Lcom/stripe/android/link/theme/ThemeKt$DefaultLinkTheme$2;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/link/theme/ThemeKt$DefaultLinkTheme$2;-><init>(ZLkotlin/jvm/functions/Function2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method

.method public static final getAppBarHeight()F
    .locals 1

    sget v0, Lcom/stripe/android/link/theme/ThemeKt;->AppBarHeight:F

    return v0
.end method

.method public static final getHorizontalPadding()F
    .locals 1

    sget v0, Lcom/stripe/android/link/theme/ThemeKt;->HorizontalPadding:F

    return v0
.end method

.method public static final getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;
    .locals 2
    .annotation build Lkotlin/jvm/JvmName;
        name = "getLinkColors"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "com.stripe.android.link.theme.<get-linkColors> (Theme.kt:37)"

    const v1, -0x6dcf577e

    invoke-static {v1, p2, p0, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lcom/stripe/android/link/theme/ThemeKt;->LocalColors:LU94;

    invoke-interface {p1, p0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/theme/LinkColors;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p0
.end method

.method public static final getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "getLinkShapes"
    .end annotation

    const-string p1, "<this>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string p1, "com.stripe.android.link.theme.<get-linkShapes> (Theme.kt:42)"

    const v0, -0xa66c73c

    invoke-static {v0, p2, p0, p1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lcom/stripe/android/link/theme/LinkShapes;->INSTANCE:Lcom/stripe/android/link/theme/LinkShapes;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p0
.end method

.method public static final getMinimumTouchTargetSize()F
    .locals 1

    sget v0, Lcom/stripe/android/link/theme/ThemeKt;->MinimumTouchTargetSize:F

    return v0
.end method

.method public static final getPrimaryButtonHeight()F
    .locals 1

    sget v0, Lcom/stripe/android/link/theme/ThemeKt;->PrimaryButtonHeight:F

    return v0
.end method
