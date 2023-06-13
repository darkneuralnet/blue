.class public final Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "paymentDetails",
        "",
        "showDialog",
        "Lkotlin/Function1;",
        "",
        "onDialogDismissed",
        "ConfirmRemoveDialog",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function1;LEt0;I)V",
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
        "SMAP\nConfirmRemoveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmRemoveDialog.kt\ncom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n36#2:56\n1057#3,6:57\n*S KotlinDebug\n*F\n+ 1 ConfirmRemoveDialog.kt\ncom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt\n*L\n22#1:56\n22#1:57,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final ConfirmRemoveDialog(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "paymentDetails"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onDialogDismissed"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x62516e8d

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v5, v3, 0xe

    if-nez v5, :cond_1

    invoke-interface {v14, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v6, v3, 0x70

    if-nez v6, :cond_3

    invoke-interface {v14, v1}, LEt0;->o(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v3, 0x380

    if-nez v6, :cond_5

    invoke-interface {v14, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x2db

    const/16 v7, 0x92

    if-ne v6, v7, :cond_7

    invoke-interface {v14}, LEt0;->b()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v14}, LEt0;->k()V

    move-object v4, v14

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.link.ui.wallet.ConfirmRemoveDialog (ConfirmRemoveDialog.kt:14)"

    invoke-static {v4, v5, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    if-eqz v1, :cond_b

    const v4, 0x44faf204

    invoke-interface {v14, v4}, LEt0;->F(I)V

    invoke-interface {v14, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_9

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_a

    :cond_9
    new-instance v6, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$1$1;

    invoke-direct {v6, v2}, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v14, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {v14}, LEt0;->Q()V

    move-object v4, v6

    check-cast v4, Lkotlin/jvm/functions/Function0;

    new-instance v6, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$2;

    invoke-direct {v6, v2, v5}, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$2;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const v7, -0x45c1c220

    const/4 v8, 0x1

    invoke-static {v14, v7, v8, v6}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    const/4 v7, 0x0

    new-instance v9, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$3;

    invoke-direct {v9, v2, v5}, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$3;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const v5, -0xb499362

    invoke-static {v14, v5, v8, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v9

    const/4 v10, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$4;

    invoke-direct {v5, v0}, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$4;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    const v11, 0x2f2e9b5c

    invoke-static {v14, v11, v8, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v11

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const v20, 0x30c30

    const/16 v21, 0x3d4

    move-object v5, v4

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-wide v12, v15

    move-object v4, v14

    move-wide/from16 v14, v17

    move-object/from16 v16, v19

    move-object/from16 v17, v4

    move/from16 v18, v20

    move/from16 v19, v21

    invoke-static/range {v5 .. v19}, Llb;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lhy5;JJLD31;LEt0;II)V

    goto :goto_5

    :cond_b
    move-object v4, v14

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_6
    invoke-interface {v4}, LEt0;->w()LWm5;

    move-result-object v4

    if-nez v4, :cond_d

    goto :goto_7

    :cond_d
    new-instance v5, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$5;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$5;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function1;I)V

    invoke-interface {v4, v5}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method
