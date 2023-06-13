.class public final Lcom/stripe/android/link/ui/LinkButtonViewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a9\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u000b\"\u0017\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\"\u0017\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00038\u0006X\u0087T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "",
        "LinkButton",
        "(LEt0;I)V",
        "",
        "email",
        "",
        "enabled",
        "Lkotlin/Function0;",
        "onClick",
        "LgV2;",
        "modifier",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "Lk61;",
        "LinkButtonVerticalPadding",
        "F",
        "LinkButtonHorizontalPadding",
        "Lbc5;",
        "LinkButtonShape",
        "Lbc5;",
        "LinkButtonEmailShape",
        "LinkButtonTestTag",
        "Ljava/lang/String;",
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
        "SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n154#2:167\n154#2:168\n154#2:169\n154#2:170\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt\n*L\n44#1:167\n45#1:168\n46#1:169\n47#1:170\n*E\n"
    }
.end annotation


# static fields
.field private static final LinkButtonEmailShape:Lbc5;

.field private static final LinkButtonHorizontalPadding:F

.field private static final LinkButtonShape:Lbc5;

.field public static final LinkButtonTestTag:Ljava/lang/String; = "LinkButtonTestTag"

.field private static final LinkButtonVerticalPadding:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonVerticalPadding:F

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonHorizontalPadding:F

    const/16 v0, 0x16

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonShape:Lbc5;

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonEmailShape:Lbc5;

    return-void
.end method

.method private static final LinkButton(LEt0;I)V
    .locals 8

    const v0, -0x2542a322

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkButton (LinkButtonView.kt:53)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const-string v1, "example@stripe.com"

    const/4 v2, 0x1

    sget-object v3, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$1;->INSTANCE:Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$1;

    const/4 v4, 0x0

    const/16 v6, 0x1b6

    const/16 v7, 0x8

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$2;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final LinkButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3492d5d0

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p5, 0xe

    if-nez v1, :cond_2

    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_2
    move v1, p5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, p5, 0x70

    if-nez v2, :cond_5

    invoke-interface {p4, p1}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, p5, 0x380

    if-nez v2, :cond_8

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v3, p5, 0x1c00

    if-nez v3, :cond_b

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_6

    :cond_a
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v1, v3

    :cond_b
    :goto_7
    move v7, v1

    and-int/lit16 v1, v7, 0x16db

    const/16 v3, 0x492

    if-ne v1, v3, :cond_e

    invoke-interface {p4}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {p4}, LEt0;->k()V

    :cond_d
    :goto_8
    move-object v5, p3

    goto :goto_b

    :cond_e
    :goto_9
    if-eqz v2, :cond_f

    sget-object p3, LgV2;->b0:LgV2$a;

    :cond_f
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkButton (LinkButtonView.kt:63)"

    invoke-static {v0, v7, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    const/4 v0, 0x1

    new-array v1, v0, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v2

    sget-object v3, LWz0;->a:LWz0;

    sget v4, LWz0;->b:I

    if-eqz p1, :cond_11

    invoke-virtual {v3, p4, v4}, LWz0;->c(LEt0;I)F

    move-result v3

    goto :goto_a

    :cond_11
    invoke-virtual {v3, p4, v4}, LWz0;->b(LEt0;I)F

    move-result v3

    :goto_a
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;

    move-object v3, v2

    move-object v4, p2

    move-object v5, p3

    move v6, p1

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;-><init>(Lkotlin/jvm/functions/Function0;LgV2;ZILjava/lang/String;)V

    const v3, -0x504e570

    invoke-static {p4, v3, v0, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p4, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    goto :goto_8

    :goto_b
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_12

    goto :goto_c

    :cond_12
    new-instance p4, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$4;

    move-object v1, p4

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$4;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {p3, p4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_c
    return-void
.end method

.method public static final synthetic access$LinkButton(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButton(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$getLinkButtonEmailShape$p()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonEmailShape:Lbc5;

    return-object v0
.end method

.method public static final synthetic access$getLinkButtonHorizontalPadding$p()F
    .locals 1

    sget v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonHorizontalPadding:F

    return v0
.end method

.method public static final synthetic access$getLinkButtonShape$p()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonShape:Lbc5;

    return-object v0
.end method

.method public static final synthetic access$getLinkButtonVerticalPadding$p()F
    .locals 1

    sget v0, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButtonVerticalPadding:F

    return v0
.end method
