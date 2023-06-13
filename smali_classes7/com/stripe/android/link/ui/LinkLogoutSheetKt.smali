.class public final Lcom/stripe/android/link/ui/LinkLogoutSheetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "onLogoutClick",
        "onCancelClick",
        "LinkLogoutSheet",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
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
        "SMAP\nLinkLogoutSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkLogoutSheet.kt\ncom/stripe/android/link/ui/LinkLogoutSheetKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,36:1\n50#2:37\n49#2:38\n1057#3,6:39\n*S KotlinDebug\n*F\n+ 1 LinkLogoutSheet.kt\ncom/stripe/android/link/ui/LinkLogoutSheetKt\n*L\n28#1:37\n28#1:38\n28#1:39,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final LinkLogoutSheet(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "onLogoutClick"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCancelClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4a117701

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p3, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x70

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-interface {p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.LinkLogoutSheet (LinkLogoutSheet.kt:16)"

    invoke-static {v0, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-array v0, v2, [Lcom/stripe/android/link/ui/LinkLogoutMenuItem;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Logout;->INSTANCE:Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Logout;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Cancel;->INSTANCE:Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Cancel;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const v1, 0x1e7b2b64

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    :cond_7
    new-instance v2, Lcom/stripe/android/link/ui/LinkLogoutSheetKt$LinkLogoutSheet$1$1;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/link/ui/LinkLogoutSheetKt$LinkLogoutSheet$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p2, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x6

    invoke-static {v0, v2, p2, v1}, Lcom/stripe/android/link/ui/menus/LinkMenuKt;->LinkMenu(Ljava/util/List;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_4
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_a

    goto :goto_5

    :cond_a
    new-instance v0, Lcom/stripe/android/link/ui/LinkLogoutSheetKt$LinkLogoutSheet$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/link/ui/LinkLogoutSheetKt$LinkLogoutSheet$2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method
