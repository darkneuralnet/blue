.class public final Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u001aO\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "paymentDetails",
        "Lkotlin/Function0;",
        "",
        "onEditClick",
        "onSetDefaultClick",
        "onRemoveClick",
        "onCancelClick",
        "WalletPaymentMethodMenu",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
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
        "SMAP\nWalletPaymentMethodMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletPaymentMethodMenu.kt\ncom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n83#2,3:67\n1057#3,6:70\n*S KotlinDebug\n*F\n+ 1 WalletPaymentMethodMenu.kt\ncom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt\n*L\n56#1:67,3\n56#1:70,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final WalletPaymentMethodMenu(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
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

    const-string v0, "paymentDetails"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEditClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSetDefaultClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRemoveClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCancelClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xfdcc57a

    invoke-interface {p5, v0}, LEt0;->u(I)LEt0;

    move-result-object p5

    and-int/lit8 v1, p6, 0xe

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-interface {p5, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, p6

    goto :goto_1

    :cond_1
    move v1, p6

    :goto_1
    and-int/lit8 v4, p6, 0x70

    if-nez v4, :cond_3

    invoke-interface {p5, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, p6, 0x380

    if-nez v4, :cond_5

    invoke-interface {p5, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, p6, 0x1c00

    if-nez v4, :cond_7

    invoke-interface {p5, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v1, v4

    :cond_7
    const v4, 0xe000

    and-int/2addr v4, p6

    if-nez v4, :cond_9

    invoke-interface {p5, p4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v1, v4

    :cond_9
    const v4, 0xb6db

    and-int/2addr v1, v4

    const/16 v4, 0x2492

    if-ne v1, v4, :cond_b

    invoke-interface {p5}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {p5}, LEt0;->k()V

    goto/16 :goto_8

    :cond_b
    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, -0x1

    const-string v4, "com.stripe.android.link.ui.wallet.WalletPaymentMethodMenu (WalletPaymentMethodMenu.kt:33)"

    invoke-static {v0, p6, v1, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v0

    instance-of v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v1, :cond_d

    sget-object v1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$EditCard;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$EditCard;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result v1

    if-nez v1, :cond_e

    sget-object v1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;

    invoke-static {p0}, Lcom/stripe/android/link/model/ConsumerPaymentDetailsKtxKt;->getRemoveLabel(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)I

    move-result v4

    invoke-direct {v1, v4}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Cancel;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Cancel;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v1, v4

    const/4 v5, 0x1

    aput-object p2, v1, v5

    aput-object p3, v1, v3

    const/4 v3, 0x3

    aput-object p4, v1, v3

    const v3, -0x21de6e89

    invoke-interface {p5, v3}, LEt0;->F(I)V

    move v3, v4

    :goto_7
    if-ge v4, v2, :cond_f

    aget-object v5, v1, v4

    invoke-interface {p5, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_f
    invoke-interface {p5}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v3, :cond_10

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_11

    :cond_10
    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$1$1;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p5, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_11
    invoke-interface {p5}, LEt0;->Q()V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x8

    invoke-static {v0, v1, p5, v2}, Lcom/stripe/android/link/ui/menus/LinkMenuKt;->LinkMenu(Ljava/util/List;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LQt0;->Y()V

    :cond_12
    :goto_8
    invoke-interface {p5}, LEt0;->w()LWm5;

    move-result-object p5

    if-nez p5, :cond_13

    goto :goto_9

    :cond_13
    new-instance v7, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$2;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p5, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void
.end method
