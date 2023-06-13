.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1;->invoke(LBn2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Lrn2;",
        "Ljava/lang/Integer;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "Lrn2;",
        "",
        "it",
        "",
        "invoke",
        "(Lrn2;ILEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,493:1\n430#2,4:494\n434#2,2:499\n437#2:502\n438#2,2:504\n436#2,7:507\n444#2:521\n443#2:522\n441#2,6:523\n448#2,4:569\n452#2,2:574\n454#2:577\n476#2:578\n467#2,12:579\n479#2:596\n154#3:498\n154#3:501\n154#3:503\n154#3:506\n154#3:573\n25#4:514\n50#4:529\n49#4:530\n460#4,13:555\n473#4,3:591\n1057#5,6:515\n1057#5,6:531\n68#6,5:537\n73#6:568\n77#6:595\n75#7:542\n76#7,11:544\n89#7:594\n76#8:543\n76#8:576\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1\n*L\n433#1:498\n435#1:501\n437#1:503\n439#1:506\n451#1:573\n442#1:514\n446#1:529\n446#1:530\n430#1:555,13\n430#1:591,3\n442#1:515,6\n446#1:531,6\n430#1:537,5\n430#1:568\n430#1:595\n430#1:542\n430#1:544,11\n430#1:594\n430#1:543\n453#1:576\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty$inlined:I

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->$onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;

    iput p3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->$$dirty$inlined:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrn2;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LEt0;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->invoke(Lrn2;ILEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lrn2;ILEt0;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v13, p3

    const-string v3, "$this$items"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p4, 0xe

    if-nez v3, :cond_1

    invoke-interface {v13, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v3, p4, 0x70

    const/16 v4, 0x20

    const/16 v5, 0x10

    if-nez v3, :cond_3

    invoke-interface {v13, v2}, LEt0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v1, 0x2db

    const/16 v6, 0x92

    if-ne v3, v6, :cond_5

    invoke-interface/range {p3 .. p3}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LEt0;->k()V

    goto/16 :goto_8

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v6, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:390)"

    const v7, 0x29b3c0fe

    invoke-static {v7, v1, v3, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->$items:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    and-int/lit8 v1, v1, 0xe

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const v2, 0x413d2c40

    invoke-interface {v13, v2}, LEt0;->F(I)V

    and-int/lit8 v2, v1, 0x70

    if-nez v2, :cond_8

    invoke-interface {v13, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    move v4, v5

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    and-int/lit16 v1, v1, 0x2d1

    const/16 v2, 0x90

    if-ne v1, v2, :cond_a

    invoke-interface/range {p3 .. p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    invoke-interface/range {p3 .. p3}, LEt0;->k()V

    goto/16 :goto_7

    :cond_a
    :goto_5
    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->e()LK9;

    move-result-object v9

    sget-object v10, LgV2;->b0:LgV2$a;

    const/16 v1, 0x50

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v10, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    invoke-static {v1, v11, v12, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v15, 0x6

    int-to-float v2, v15

    invoke-static {v2}, Lk61;->g(F)F

    move-result v3

    invoke-static {v3}, Lcc5;->d(F)Lbc5;

    move-result-object v3

    invoke-static {v1, v3}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v1

    int-to-float v3, v12

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    sget-object v4, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v4, v13, v15}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBorderDefault-0d7_KjU()J

    move-result-wide v5

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v2}, Lcc5;->d(F)Lbc5;

    move-result-object v2

    invoke-static {v1, v3, v5, v6, v2}, LdZ;->g(LgV2;FJLhy5;)LgV2;

    move-result-object v16

    const v1, -0x1d58f75c

    invoke-interface {v13, v1}, LEt0;->F(I)V

    invoke-interface/range {p3 .. p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v17, LEt0;->a:LEt0$a;

    invoke-virtual/range {v17 .. v17}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_b

    invoke-static {}, Lf62;->a()LrX2;

    move-result-object v1

    invoke-interface {v13, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_b
    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    move-object/from16 v18, v1

    check-cast v18, LrX2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v13, v15}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v3

    const/4 v6, 0x0

    const/4 v7, 0x3

    move-object/from16 v5, p3

    invoke-static/range {v1 .. v7}, Lwb5;->e(ZFJLEt0;II)Ly12;

    move-result-object v1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v2, 0x1e7b2b64

    invoke-interface {v13, v2}, LEt0;->F(I)V

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->$onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p3 .. p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_c

    invoke-virtual/range {v17 .. v17}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_d

    :cond_c
    new-instance v3, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$2$1;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5;->$onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;

    invoke-direct {v3, v2, v8}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$2$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    invoke-interface {v13, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_d
    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    move-object/from16 v22, v3

    check-cast v22, Lkotlin/jvm/functions/Function0;

    const/16 v23, 0x1c

    const/16 v24, 0x0

    move-object/from16 v17, v18

    move-object/from16 v18, v1

    invoke-static/range {v16 .. v24}, Lak0;->c(LgV2;LrX2;Ly12;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    const v2, 0x2bb5b5d7

    invoke-interface {v13, v2}, LEt0;->F(I)V

    const/4 v2, 0x0

    invoke-static {v9, v2, v13, v15}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v13, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

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

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_e

    invoke-static {}, Lyt0;->c()V

    :cond_e
    invoke-interface/range {p3 .. p3}, LEt0;->h()V

    invoke-interface/range {p3 .. p3}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_f

    invoke-interface {v13, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    :cond_f
    invoke-interface/range {p3 .. p3}, LEt0;->e()V

    :goto_6
    invoke-interface/range {p3 .. p3}, LEt0;->L()V

    invoke-static/range {p3 .. p3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v9, v3, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p3 .. p3}, LEt0;->q()V

    invoke-static/range {p3 .. p3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v3, v13, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v13, v1}, LEt0;->F(I)V

    const v1, -0x7f65a980

    invoke-interface {v13, v1}, LEt0;->F(I)V

    sget-object v1, Lf10;->a:Lf10;

    const v1, -0x325fc13a    # -3.3605856E8f

    invoke-interface {v13, v1}, LEt0;->F(I)V

    invoke-static {v10, v11, v12, v14}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v4

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getLogo()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_11

    :cond_10
    const-string v1, ""

    :cond_11
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/image/StripeImageLoader;

    sget-object v3, LBA0;->a:LBA0$a;

    invoke-virtual {v3}, LBA0$a;->b()LBA0;

    move-result-object v5

    const-string v3, "Institution logo"

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v9, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$3$1;

    invoke-direct {v9, v8}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$3$1;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    const v8, -0x172d809f

    invoke-static {v13, v8, v12, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v8

    sget-object v9, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;->getLambda-5$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    sget v10, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v10, v10, 0x3

    const v11, 0x6c06d80

    or-int/2addr v11, v10

    const/16 v12, 0x60

    move-object/from16 v10, p3

    invoke-static/range {v1 .. v12}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-interface/range {p3 .. p3}, LEt0;->f()V

    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    :goto_7
    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {}, LQt0;->Y()V

    :cond_12
    :goto_8
    return-void
.end method
