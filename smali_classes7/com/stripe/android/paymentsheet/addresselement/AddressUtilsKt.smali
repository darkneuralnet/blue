.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u001a2\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0008\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "other",
        "",
        "levenshtein",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "otherAddress",
        "editDistance",
        "LgV2;",
        "modifier",
        "Lkotlin/Function1;",
        "LPm0;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "ScrollableColumn",
        "(LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V",
        "paymentsheet_release"
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
        "SMAP\nAddressUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressUtils.kt\ncom/stripe/android/paymentsheet/addresselement/AddressUtilsKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,72:1\n67#2,6:73\n73#2:105\n77#2:148\n75#3:79\n76#3,11:81\n75#3:112\n76#3,11:114\n89#3:142\n89#3:147\n76#4:80\n76#4:113\n460#5,13:92\n460#5,13:125\n473#5,3:139\n473#5,3:144\n74#6,6:106\n80#6:138\n84#6:143\n*S KotlinDebug\n*F\n+ 1 AddressUtils.kt\ncom/stripe/android/paymentsheet/addresselement/AddressUtilsKt\n*L\n63#1:73,6\n63#1:105\n63#1:148\n63#1:79\n63#1:81,11\n66#1:112\n66#1:114,11\n66#1:142\n63#1:147\n63#1:80\n66#1:113\n63#1:92,13\n66#1:125,13\n66#1:139,3\n63#1:144,3\n66#1:106,6\n66#1:138\n66#1:143\n*E\n"
    }
.end annotation


# direct methods
.method public static final ScrollableColumn(LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
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

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "content"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0xee33aca

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v4

    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0xe

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v4, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/lit8 v9, v2, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v1, 0x70

    if-nez v9, :cond_5

    invoke-interface {v4, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, v8, 0x5b

    const/16 v10, 0x12

    if-ne v9, v10, :cond_7

    invoke-interface {v4}, LEt0;->b()Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v4}, LEt0;->k()V

    move-object v5, v7

    goto/16 :goto_a

    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    sget-object v5, LgV2;->b0:LgV2$a;

    goto :goto_5

    :cond_8
    move-object v5, v7

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, -0x1

    const-string v9, "com.stripe.android.paymentsheet.addresselement.ScrollableColumn (AddressUtils.kt:58)"

    invoke-static {v3, v8, v7, v9}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    sget-object v10, LgV2;->b0:LgV2$a;

    const/4 v3, 0x0

    const/4 v7, 0x1

    invoke-static {v3, v4, v3, v7}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/16 v16, 0x0

    invoke-static/range {v10 .. v16}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v7

    const v9, 0x2bb5b5d7

    invoke-interface {v4, v9}, LEt0;->F(I)V

    sget-object v9, LK9;->a:LK9$a;

    invoke-virtual {v9}, LK9$a;->n()LK9;

    move-result-object v10

    invoke-static {v10, v3, v4, v3}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v10

    const v11, -0x4ee9b9da

    invoke-interface {v4, v11}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v12

    invoke-interface {v4, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v13

    invoke-interface {v4, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v14

    invoke-interface {v4, v14}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LJq6;

    sget-object v15, LBt0;->M:LBt0$a;

    invoke-virtual {v15}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v4}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {v4}, LEt0;->h()V

    invoke-interface {v4}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v4, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    :cond_b
    invoke-interface {v4}, LEt0;->e()V

    :goto_6
    invoke-interface {v4}, LEt0;->L()V

    invoke-static {v4}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v15}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v6, v10, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v6, v12, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v6, v13, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v6, v14, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v4}, LEt0;->q()V

    invoke-static {v4}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v6, v4, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v4, v3}, LEt0;->F(I)V

    const v6, -0x7f65a980

    invoke-interface {v4, v6}, LEt0;->F(I)V

    sget-object v6, Lf10;->a:Lf10;

    const v6, 0x6744ca04

    invoke-interface {v4, v6}, LEt0;->F(I)V

    and-int/lit8 v6, v8, 0xe

    shl-int/lit8 v7, v8, 0x6

    and-int/lit16 v7, v7, 0x1c00

    or-int/2addr v6, v7

    const v7, -0x1cd0f17e

    invoke-interface {v4, v7}, LEt0;->F(I)V

    sget-object v7, Llo;->a:Llo;

    invoke-virtual {v7}, Llo;->g()Llo$l;

    move-result-object v7

    invoke-virtual {v9}, LK9$a;->j()LK9$b;

    move-result-object v8

    shr-int/lit8 v9, v6, 0x3

    and-int/lit8 v10, v9, 0xe

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v9, v10

    invoke-static {v7, v8, v4, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v7

    shl-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0x70

    const v9, -0x4ee9b9da

    invoke-interface {v4, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v4, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v4, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v4, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    invoke-virtual {v15}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v13

    shl-int/lit8 v8, v8, 0x9

    and-int/lit16 v8, v8, 0x1c00

    or-int/lit8 v8, v8, 0x6

    invoke-interface {v4}, LEt0;->v()Llm;

    move-result-object v14

    instance-of v14, v14, Llm;

    if-nez v14, :cond_c

    invoke-static {}, Lyt0;->c()V

    :cond_c
    invoke-interface {v4}, LEt0;->h()V

    invoke-interface {v4}, LEt0;->t()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-interface {v4, v12}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_7

    :cond_d
    invoke-interface {v4}, LEt0;->e()V

    :goto_7
    invoke-interface {v4}, LEt0;->L()V

    invoke-static {v4}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual {v15}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v12, v7, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v9, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v10, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v11, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v4}, LEt0;->q()V

    invoke-static {v4}, LMB5;->b(LEt0;)LEt0;

    move-result-object v7

    invoke-static {v7}, LMB5;->a(LEt0;)LMB5;

    move-result-object v7

    shr-int/lit8 v9, v8, 0x3

    and-int/lit8 v9, v9, 0x70

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v7, v4, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v3}, LEt0;->F(I)V

    shr-int/lit8 v3, v8, 0x9

    and-int/lit8 v3, v3, 0xe

    const v7, -0x455f09d5

    invoke-interface {v4, v7}, LEt0;->F(I)V

    and-int/lit8 v3, v3, 0xb

    const/4 v7, 0x2

    if-ne v3, v7, :cond_f

    invoke-interface {v4}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_8

    :cond_e
    invoke-interface {v4}, LEt0;->k()V

    goto :goto_9

    :cond_f
    :goto_8
    sget-object v3, LQm0;->a:LQm0;

    shr-int/lit8 v6, v6, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int/lit8 v6, v6, 0x6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v3, v4, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->f()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->f()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    :goto_a
    invoke-interface {v4}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_11

    goto :goto_b

    :cond_11
    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt$ScrollableColumn$2;

    invoke-direct {v4, v5, v0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt$ScrollableColumn$2;-><init>(LgV2;Lkotlin/jvm/functions/Function3;II)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method

.method public static final editDistance(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCity()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    move-object v0, v1

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCity()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_3
    move-object v2, v1

    :cond_4
    invoke-static {v0, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v2, 0x0

    add-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    move-object v0, v1

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    :cond_7
    move-object v3, v1

    :cond_8
    invoke-static {v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    add-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    move-object v0, v1

    :cond_a
    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_c

    :cond_b
    move-object v3, v1

    :cond_c
    invoke-static {v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    add-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine2()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    :cond_d
    move-object v0, v1

    :cond_e
    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine2()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_10

    :cond_f
    move-object v3, v1

    :cond_10
    invoke-static {v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    add-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getPostalCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_12

    :cond_11
    move-object v0, v1

    :cond_12
    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getPostalCode()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_14

    :cond_13
    move-object v3, v1

    :cond_14
    invoke-static {v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    add-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getState()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_16

    :cond_15
    move-object p0, v1

    :cond_16
    if-eqz p1, :cond_18

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getState()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_17

    goto :goto_1

    :cond_17
    move-object v1, p1

    :cond_18
    :goto_1
    invoke-static {p0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result p0

    add-int/2addr v2, p0

    return v2
.end method

.method public static final levenshtein(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0

    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0

    :cond_4
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/2addr v0, v2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/2addr v3, v2

    new-array v4, v0, [Ljava/lang/Integer;

    move v5, v1

    :goto_2
    if-ge v5, v0, :cond_5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    new-array v5, v0, [Ljava/lang/Integer;

    move v6, v1

    :goto_3
    if-ge v6, v0, :cond_6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    move v6, v2

    :goto_4
    if-ge v6, v3, :cond_9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v1

    move v7, v2

    :goto_5
    if-ge v7, v0, :cond_8

    add-int/lit8 v8, v7, -0x1

    invoke-interface {p0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    add-int/lit8 v10, v6, -0x1

    invoke-interface {p1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-ne v9, v10, :cond_7

    move v9, v1

    goto :goto_6

    :cond_7
    move v9, v2

    :goto_6
    aget-object v10, v4, v8

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int/2addr v10, v9

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    add-int/2addr v9, v2

    aget-object v8, v5, v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v2

    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {v8, v10}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_8
    add-int/lit8 v6, v6, 0x1

    move-object v11, v5

    move-object v5, v4

    move-object v4, v11

    goto :goto_4

    :cond_9
    sub-int/2addr v0, v2

    aget-object p0, v4, v0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method
