.class public final Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a#\u0010\u000e\u001a\u00020\u0008*\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\u0008*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a#\u0010\u0016\u001a\u00020\u0008*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "paymentDetails",
        "",
        "enabled",
        "isSupported",
        "isSelected",
        "isUpdating",
        "Lkotlin/Function0;",
        "",
        "onClick",
        "onMenuButtonClick",
        "PaymentDetailsListItem",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "LZc5;",
        "PaymentDetails",
        "(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLEt0;I)V",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "card",
        "CardInfo",
        "(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;ZLEt0;I)V",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;",
        "bankAccount",
        "BankAccountInfo",
        "(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;ZLEt0;I)V",
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
        "SMAP\nPaymentDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,251:1\n154#2:252\n154#2:286\n154#2:287\n154#2:386\n154#2:392\n154#2:398\n154#2:404\n154#2:437\n154#2:438\n154#2:449\n154#2:450\n75#3,6:253\n81#3:285\n75#3,6:321\n81#3:353\n85#3:397\n85#3:448\n75#4:259\n76#4,11:261\n75#4:294\n76#4,11:296\n75#4:327\n76#4,11:329\n75#4:359\n76#4,11:361\n89#4:390\n89#4:396\n89#4:402\n75#4:410\n76#4,11:412\n89#4:442\n89#4:447\n76#5:260\n76#5:295\n76#5:328\n76#5:360\n76#5:411\n460#6,13:272\n460#6,13:307\n460#6,13:340\n460#6,13:372\n473#6,3:387\n473#6,3:393\n473#6,3:399\n460#6,13:423\n473#6,3:439\n473#6,3:444\n74#7,6:288\n80#7:320\n84#7:403\n68#8,5:354\n73#8:385\n77#8:391\n68#8,5:405\n73#8:436\n77#8:443\n*S KotlinDebug\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsKt\n*L\n60#1:252\n67#1:286\n75#1:287\n95#1:386\n108#1:392\n117#1:398\n126#1:404\n130#1:437\n131#1:438\n149#1:449\n151#1:450\n57#1:253,6\n57#1:285\n78#1:321,6\n78#1:353\n78#1:397\n57#1:448\n57#1:259\n57#1:261,11\n73#1:294\n73#1:296,11\n78#1:327\n78#1:329,11\n85#1:359\n85#1:361,11\n85#1:390\n78#1:396\n73#1:402\n122#1:410\n122#1:412,11\n122#1:442\n57#1:447\n57#1:260\n73#1:295\n78#1:328\n85#1:360\n122#1:411\n57#1:272,13\n73#1:307,13\n78#1:340,13\n85#1:372,13\n85#1:387,3\n78#1:393,3\n73#1:399,3\n122#1:423,13\n122#1:439,3\n57#1:444,3\n73#1:288,6\n73#1:320\n73#1:403\n85#1:354,5\n85#1:385\n85#1:391\n122#1:405,5\n122#1:436\n122#1:443\n*E\n"
    }
.end annotation


# direct methods
.method public static final BankAccountInfo(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;ZLEt0;I)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bankAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5fcccc48

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x380

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v1, v1, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.wallet.BankAccountInfo (PaymentDetails.kt:204)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    const/4 v0, 0x1

    new-array v1, v0, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v2

    if-eqz p2, :cond_9

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_9
    const v3, 0x3f19999a    # 0.6f

    :goto_5
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$BankAccountInfo$1;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$BankAccountInfo$1;-><init>(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)V

    const v3, -0x32ce5078

    invoke-static {p3, v3, v0, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p3, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    :goto_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_b

    goto :goto_7

    :cond_b
    new-instance v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$BankAccountInfo$2;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$BankAccountInfo$2;-><init>(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;ZI)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final CardInfo(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;ZLEt0;I)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3a434ba6

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x380

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v1, v1, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.wallet.CardInfo (PaymentDetails.kt:170)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    const/4 v0, 0x1

    new-array v1, v0, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v2

    if-eqz p2, :cond_9

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_9
    const v3, 0x3f19999a    # 0.6f

    :goto_5
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$CardInfo$1;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$CardInfo$1;-><init>(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;)V

    const v3, 0x2684479a

    invoke-static {p3, v3, v0, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p3, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    :goto_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_b

    goto :goto_7

    :cond_b
    new-instance v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$CardInfo$2;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$CardInfo$2;-><init>(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;ZI)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final PaymentDetails(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLEt0;I)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2e77d098

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x380

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x2db

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.wallet.PaymentDetails (PaymentDetails.kt:155)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    instance-of v0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_9

    const v0, 0x1a45b87c

    invoke-interface {p3, v0}, LEt0;->F(I)V

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    and-int/lit8 v2, v1, 0xe

    sget v3, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    invoke-static {p0, v0, p2, p3, v1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->CardInfo(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;ZLEt0;I)V

    invoke-interface {p3}, LEt0;->Q()V

    goto :goto_5

    :cond_9
    instance-of v0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v0, :cond_a

    const v0, 0x1a45b8f8

    invoke-interface {p3, v0}, LEt0;->F(I)V

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    and-int/lit8 v2, v1, 0xe

    sget v3, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    invoke-static {p0, v0, p2, p3, v1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->BankAccountInfo(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;ZLEt0;I)V

    invoke-interface {p3}, LEt0;->Q()V

    goto :goto_5

    :cond_a
    const v0, 0x1a45b956

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->Q()V

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_c

    goto :goto_7

    :cond_c
    new-instance v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetails$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetails$1;-><init>(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZI)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final PaymentDetailsListItem(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "ZZZZ",
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

    move-object/from16 v1, p0

    move/from16 v10, p1

    move/from16 v11, p2

    move/from16 v0, p3

    move/from16 v9, p4

    move-object/from16 v15, p5

    move-object/from16 v14, p6

    move/from16 v13, p8

    const-string v2, "paymentDetails"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClick"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onMenuButtonClick"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x6c84d165

    move-object/from16 v3, p7

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v3, v13, 0xe

    if-nez v3, :cond_1

    invoke-interface {v12, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_1
    move v3, v13

    :goto_1
    and-int/lit8 v4, v13, 0x70

    if-nez v4, :cond_3

    invoke-interface {v12, v10}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v13, 0x380

    if-nez v4, :cond_5

    invoke-interface {v12, v11}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, v13, 0x1c00

    if-nez v4, :cond_7

    invoke-interface {v12, v0}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v3, v4

    :cond_7
    const v4, 0xe000

    and-int/2addr v4, v13

    if-nez v4, :cond_9

    invoke-interface {v12, v9}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v3, v4

    :cond_9
    const/high16 v4, 0x70000

    and-int/2addr v4, v13

    if-nez v4, :cond_b

    invoke-interface {v12, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x10000

    :goto_6
    or-int/2addr v3, v4

    :cond_b
    const/high16 v4, 0x380000

    and-int/2addr v4, v13

    if-nez v4, :cond_d

    invoke-interface {v12, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/high16 v4, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v4, 0x80000

    :goto_7
    or-int/2addr v3, v4

    :cond_d
    move v6, v3

    const v3, 0x2db6db

    and-int/2addr v3, v6

    const v4, 0x92492

    if-ne v3, v4, :cond_f

    invoke-interface {v12}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_8

    :cond_e
    invoke-interface {v12}, LEt0;->k()V

    move-object v0, v12

    goto/16 :goto_14

    :cond_f
    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.wallet.PaymentDetailsListItem (PaymentDetails.kt:47)"

    invoke-static {v2, v6, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    sget-object v5, LgV2;->b0:LgV2$a;

    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-static {v5, v4, v3, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    const/16 v8, 0x38

    int-to-float v8, v8

    invoke-static {v8}, Lk61;->g(F)F

    move-result v8

    invoke-static {v7, v4, v8, v3, v2}, LBB5;->h(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v10, :cond_11

    if-eqz v11, :cond_11

    move/from16 v17, v3

    goto :goto_9

    :cond_11
    move/from16 v17, v8

    :goto_9
    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x6

    const/16 v21, 0x0

    move-object v2, v7

    move v7, v3

    move/from16 v3, v17

    move-object/from16 v4, v18

    move-object/from16 v37, v5

    move-object/from16 v5, v19

    move v15, v6

    move-object/from16 v6, p5

    move/from16 v7, v20

    move/from16 p7, v8

    move-object/from16 v8, v21

    invoke-static/range {v2 .. v8}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v38, LK9;->a:LK9$a;

    invoke-virtual/range {v38 .. v38}, LK9$a;->h()LK9$c;

    move-result-object v3

    const v4, 0x2952b718

    invoke-interface {v12, v4}, LEt0;->F(I)V

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->f()Llo$d;

    move-result-object v6

    const/16 v7, 0x30

    invoke-static {v6, v3, v12, v7}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    const v8, -0x4ee9b9da

    invoke-interface {v12, v8}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v12, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v12, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v12, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v39, LBt0;->M:LBt0$a;

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v12}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_12

    invoke-static {}, Lyt0;->c()V

    :cond_12
    invoke-interface {v12}, LEt0;->h()V

    invoke-interface {v12}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v12, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_a

    :cond_13
    invoke-interface {v12}, LEt0;->e()V

    :goto_a
    invoke-interface {v12}, LEt0;->L()V

    invoke-static {v12}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v8, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v12}, LEt0;->q()V

    invoke-static {v12}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v12, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v12, v2}, LEt0;->F(I)V

    const v3, -0x286e2e7f

    invoke-interface {v12, v3}, LEt0;->F(I)V

    sget-object v4, Lad5;->a:Lad5;

    const v6, -0xdfec401

    invoke-interface {v12, v6}, LEt0;->F(I)V

    const/4 v6, 0x0

    const/16 v10, 0x14

    int-to-float v7, v10

    invoke-static {v7}, Lk61;->g(F)F

    move-result v17

    const/16 v18, 0x0

    const/4 v8, 0x6

    int-to-float v10, v8

    invoke-static {v10}, Lk61;->g(F)F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v22, 0x0

    move-object/from16 v16, v37

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v10

    const/16 v28, 0x0

    const/16 v29, 0x0

    sget-object v16, LUm4;->a:LUm4;

    sget-object v8, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-static {v8, v12, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/stripe/android/link/theme/LinkColors;->getActionLabelLight-0d7_KjU()J

    move-result-wide v17

    invoke-static {v8, v12, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/link/theme/LinkColors;->getDisabledText-0d7_KjU()J

    move-result-wide v19

    const-wide/16 v21, 0x0

    sget v23, LUm4;->b:I

    shl-int/lit8 v24, v23, 0x9

    const/16 v25, 0x4

    move-object/from16 v23, v12

    invoke-virtual/range {v16 .. v25}, LUm4;->a(JJJLEt0;II)LTm4;

    move-result-object v17

    shr-int/lit8 v16, v15, 0x9

    and-int/lit8 v2, v16, 0xe

    or-int/lit16 v2, v2, 0x1b0

    const/16 v20, 0x18

    move-object/from16 v40, v12

    move/from16 v12, p3

    move-object v13, v6

    move-object v14, v10

    move v10, v15

    move/from16 v15, v28

    move-object/from16 v16, v29

    move-object/from16 v18, v40

    move/from16 v19, v2

    invoke-static/range {v12 .. v20}, LVm4;->a(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;LEt0;II)V

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v6

    move-object/from16 v14, v37

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v14, v15, v6, v12, v13}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v17

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v16 .. v21}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v6

    const v12, -0x1cd0f17e

    move-object/from16 v13, v40

    invoke-interface {v13, v12}, LEt0;->F(I)V

    invoke-virtual {v5}, Llo;->g()Llo$l;

    move-result-object v12

    invoke-virtual/range {v38 .. v38}, LK9$a;->j()LK9$b;

    move-result-object v15

    move/from16 v9, p7

    invoke-static {v12, v15, v13, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v12

    const v15, -0x4ee9b9da

    invoke-interface {v13, v15}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v15

    invoke-interface {v13, v15}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v13, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    move/from16 v37, v2

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJq6;

    move/from16 v40, v7

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v6}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v6

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v0

    instance-of v0, v0, Llm;

    if-nez v0, :cond_14

    invoke-static {}, Lyt0;->c()V

    :cond_14
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v13, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_b

    :cond_15
    invoke-interface {v13}, LEt0;->e()V

    :goto_b
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v0, v12, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v0, v15, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v0, v9, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v0, v2, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v0, v13, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x30eb6675

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static {v14, v0, v6, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    invoke-virtual/range {v38 .. v38}, LK9$a;->h()LK9$c;

    move-result-object v9

    const v12, 0x2952b718

    invoke-interface {v13, v12}, LEt0;->F(I)V

    invoke-virtual {v5}, Llo;->f()Llo$d;

    move-result-object v5

    const/16 v12, 0x30

    invoke-static {v5, v9, v13, v12}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v5

    const v9, -0x4ee9b9da

    invoke-interface {v13, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v13, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v12

    invoke-interface {v13, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v15

    invoke-interface {v13, v15}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LJq6;

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v2

    instance-of v2, v2, Llm;

    if-nez v2, :cond_16

    invoke-static {}, Lyt0;->c()V

    :cond_16
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v13, v0}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_c

    :cond_17
    invoke-interface {v13}, LEt0;->e()V

    :goto_c
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v9, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v12, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v15, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v0, v13, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const v0, -0x4c7c0527

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    const/4 v2, 0x6

    or-int/2addr v0, v2

    shl-int/lit8 v2, v10, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v10, 0x380

    or-int/2addr v0, v2

    invoke-static {v4, v1, v11, v13, v0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->PaymentDetails(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLEt0;I)V

    const v0, -0x69a4b735

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result v0

    const v2, -0x7f65a980

    const v9, 0x2bb5b5d7

    const/16 v7, 0xc

    if-eqz v0, :cond_1a

    invoke-virtual {v8, v13, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->l()J

    move-result-wide v4

    invoke-static {v8, v13, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/theme/LinkShapes;->getExtraSmall()Lbc5;

    move-result-object v0

    invoke-static {v14, v4, v5, v0}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v0

    invoke-virtual/range {v38 .. v38}, LK9$a;->e()LK9;

    move-result-object v4

    invoke-interface {v13, v9}, LEt0;->F(I)V

    const/4 v5, 0x6

    const/4 v12, 0x0

    invoke-static {v4, v12, v13, v5}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v4

    const v15, -0x4ee9b9da

    invoke-interface {v13, v15}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v12

    invoke-interface {v13, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v13, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v13, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_18

    invoke-static {}, Lyt0;->c()V

    :cond_18
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v13, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_d

    :cond_19
    invoke-interface {v13}, LEt0;->e()V

    :goto_d
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v9, v4, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v12, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v4, v13, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-interface {v13, v2}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0x256b087a

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/link/R$string;->wallet_default:I

    const/4 v4, 0x0

    invoke-static {v0, v13, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    const/4 v0, 0x1

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    const/4 v9, 0x2

    int-to-float v5, v9

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v14, v4, v5}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v4

    move-object v6, v13

    const/4 v5, 0x0

    move-object v13, v4

    invoke-static {v8, v6, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkColors;->getDisabledText-0d7_KjU()J

    move-result-wide v15

    move-object v4, v14

    const/4 v0, 0x0

    const v36, -0x4ee9b9da

    move-wide v14, v15

    invoke-static {v7}, LN26;->f(I)J

    move-result-wide v16

    const/16 v18, 0x0

    sget-object v19, LJw1;->c:LJw1$a;

    invoke-virtual/range {v19 .. v19}, LJw1$a;->c()LJw1;

    move-result-object v19

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const v33, 0x30c30

    const/16 v34, 0x0

    const v35, 0xffd0

    move-object/from16 v32, v6

    invoke-static/range {v12 .. v35}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->f()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    goto :goto_e

    :cond_1a
    move-object v6, v13

    move-object v4, v14

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x2

    const v36, -0x4ee9b9da

    :goto_e
    invoke-interface {v6}, LEt0;->Q()V

    instance-of v12, v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v12, :cond_1b

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_f

    :cond_1b
    move-object v12, v5

    :goto_f
    if-eqz v12, :cond_1c

    invoke-virtual {v12}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v12

    goto :goto_10

    :cond_1c
    const/4 v12, 0x0

    :goto_10
    const v13, -0x67cd81e

    invoke-interface {v6, v13}, LEt0;->F(I)V

    if-eqz v12, :cond_1d

    if-nez p3, :cond_1d

    sget v12, Lcom/stripe/android/link/R$drawable;->ic_link_error:I

    const/4 v13, 0x0

    invoke-static {v12, v6, v13}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static/range {v40 .. v40}, Lk61;->g(F)F

    move-result v14

    invoke-static {v4, v14}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v14

    invoke-static {v8, v6, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v15

    invoke-virtual {v15}, Lcom/stripe/android/link/theme/LinkColors;->getErrorText-0d7_KjU()J

    move-result-wide v15

    const/16 v18, 0x1b8

    const/16 v19, 0x0

    move-object/from16 v17, v6

    invoke-static/range {v12 .. v19}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    :cond_1d
    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->f()V

    invoke-interface {v6}, LEt0;->Q()V

    invoke-interface {v6}, LEt0;->Q()V

    const v12, -0x65f624c6

    invoke-interface {v6, v12}, LEt0;->F(I)V

    if-nez v11, :cond_1e

    sget v12, Lcom/stripe/android/link/R$string;->wallet_unavailable:I

    const/4 v13, 0x0

    invoke-static {v12, v6, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    sget-object v20, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->INSTANCE:Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

    invoke-static/range {v37 .. v37}, Lk61;->g(F)F

    move-result v14

    invoke-static/range {v37 .. v37}, Lk61;->g(F)F

    move-result v15

    invoke-static/range {v37 .. v37}, Lk61;->g(F)F

    move-result v16

    const/16 v17, 0x0

    const/16 v18, 0x8

    const/16 v19, 0x0

    move-object v13, v4

    invoke-static/range {v13 .. v19}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v13

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    move/from16 v41, v3

    move-object v3, v12

    move-object v12, v4

    move-object v4, v13

    const/4 v13, 0x6

    move-object/from16 v5, v20

    move-object/from16 v40, v6

    move v13, v7

    move v7, v14

    move-object v14, v8

    move/from16 v9, v36

    const/4 v0, 0x6

    move v8, v15

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorText(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V

    goto :goto_11

    :cond_1e
    move/from16 v41, v3

    move-object v12, v4

    move-object/from16 v40, v6

    move v13, v7

    move-object v14, v8

    move/from16 v9, v36

    const/4 v0, 0x6

    :goto_11
    invoke-interface/range {v40 .. v40}, LEt0;->Q()V

    invoke-interface/range {v40 .. v40}, LEt0;->Q()V

    invoke-interface/range {v40 .. v40}, LEt0;->Q()V

    invoke-interface/range {v40 .. v40}, LEt0;->Q()V

    invoke-interface/range {v40 .. v40}, LEt0;->f()V

    invoke-interface/range {v40 .. v40}, LEt0;->Q()V

    invoke-interface/range {v40 .. v40}, LEt0;->Q()V

    invoke-virtual/range {v38 .. v38}, LK9$a;->e()LK9;

    move-result-object v3

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getMinimumTouchTargetSize()F

    move-result v4

    invoke-static {v12, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    int-to-float v4, v13

    invoke-static {v4}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0xb

    const/16 v21, 0x0

    invoke-static/range {v15 .. v21}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v4

    move-object/from16 v8, v40

    const v5, 0x2bb5b5d7

    invoke-interface {v8, v5}, LEt0;->F(I)V

    const/4 v5, 0x0

    invoke-static {v3, v5, v8, v0}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v0

    invoke-interface {v8, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v8, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v8, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v8, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v8}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_1f

    invoke-static {}, Lyt0;->c()V

    :cond_1f
    invoke-interface {v8}, LEt0;->h()V

    invoke-interface {v8}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_20

    invoke-interface {v8, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_12

    :cond_20
    invoke-interface {v8}, LEt0;->e()V

    :goto_12
    invoke-interface {v8}, LEt0;->L()V

    invoke-static {v8}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v7, v0, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v3, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v5, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v6, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v8}, LEt0;->q()V

    invoke-static {v8}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v0, v8, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v8, v0}, LEt0;->F(I)V

    invoke-interface {v8, v2}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, -0x2847cdfb

    invoke-interface {v8, v0}, LEt0;->F(I)V

    if-eqz p4, :cond_21

    const v0, -0x67cd49c

    invoke-interface {v8, v0}, LEt0;->F(I)V

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v12, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    const-wide/16 v2, 0x0

    const/4 v9, 0x2

    int-to-float v4, v9

    invoke-static {v4}, Lk61;->g(F)F

    move-result v15

    const/16 v17, 0x186

    const/16 v18, 0x2

    move-object v7, v12

    move-object v12, v0

    move-object v0, v14

    move-wide v13, v2

    move-object/from16 v16, v8

    invoke-static/range {v12 .. v18}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {v8}, LEt0;->Q()V

    move-object v13, v7

    move-object v15, v8

    move v10, v9

    goto :goto_13

    :cond_21
    move-object v7, v12

    move-object v0, v14

    const/4 v9, 0x2

    const v2, -0x67cd3ee

    invoke-interface {v8, v2}, LEt0;->F(I)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    sget-object v2, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt;->INSTANCE:Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt;->getLambda-1$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    shr-int/lit8 v2, v10, 0x12

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6000

    shl-int/lit8 v4, v10, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int v10, v2, v4

    const/16 v12, 0xa

    move-object/from16 v2, p6

    move/from16 v4, p1

    move-object v13, v7

    move-object v7, v8

    move-object v15, v8

    move v8, v10

    move v10, v9

    move v9, v12

    invoke-static/range {v2 .. v9}, LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    :goto_13
    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    sget-object v12, LqY5;->a:LqY5;

    const/16 v2, 0x14

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v13, v2, v3, v10, v4}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v13

    move/from16 v2, v41

    invoke-static {v0, v15, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/theme/LinkColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v2

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v14

    sget v0, LqY5;->e:I

    shl-int/lit8 v0, v0, 0x9

    or-int/lit8 v18, v0, 0x36

    const/16 v19, 0x0

    move-object v0, v15

    move-wide v15, v2

    move-object/from16 v17, v0

    invoke-virtual/range {v12 .. v19}, LqY5;->a(LgV2;FJLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-static {}, LQt0;->Y()V

    :cond_22
    :goto_14
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_23

    goto :goto_15

    :cond_23
    new-instance v10, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_15
    return-void
.end method
