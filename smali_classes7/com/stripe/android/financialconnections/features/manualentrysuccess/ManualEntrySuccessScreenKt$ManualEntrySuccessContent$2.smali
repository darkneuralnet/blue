.class final Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt;->ManualEntrySuccessContent(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPD3;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nManualEntrySuccessScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntrySuccessScreen.kt\ncom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,344:1\n154#2:345\n154#2:346\n154#2:347\n154#2:348\n154#2:349\n154#2:382\n154#2:383\n75#3,5:350\n80#3:381\n84#3:388\n75#4:355\n76#4,11:357\n89#4:387\n76#5:356\n460#6,13:368\n473#6,3:384\n*S KotlinDebug\n*F\n+ 1 ManualEntrySuccessScreen.kt\ncom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2\n*L\n84#1:345\n88#1:346\n89#1:347\n90#1:348\n91#1:349\n95#1:382\n120#1:383\n83#1:350,5\n83#1:381\n83#1:388\n83#1:355\n83#1:357,11\n83#1:387\n83#1:356\n83#1:368,13\n83#1:384,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $last4:Ljava/lang/String;

.field final synthetic $loading:Z

.field final synthetic $microdepositVerificationMethod:Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;

.field final synthetic $onDoneClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$microdepositVerificationMethod:Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$last4:Ljava/lang/String;

    iput p3, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$$dirty:I

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$loading:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPD3;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 63

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "it"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessContent.<anonymous> (ManualEntrySuccessScreen.kt:81)"

    const v5, 0x6324d596

    invoke-static {v5, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Llo;->a:Llo;

    int-to-float v2, v3

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-virtual {v1, v2}, Llo;->n(F)Llo$e;

    move-result-object v1

    sget-object v15, LgV2;->b0:LgV2$a;

    const/4 v13, 0x0

    const/4 v12, 0x1

    const/4 v10, 0x0

    invoke-static {v15, v13, v12, v10}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const/16 v3, 0x8

    int-to-float v11, v3

    invoke-static {v11}, Lk61;->g(F)F

    move-result v3

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4}, Lk61;->g(F)F

    move-result v6

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v2, v5, v3, v6, v4}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v2

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$microdepositVerificationMethod:Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$last4:Ljava/lang/String;

    iget v7, v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$$dirty:I

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iget-boolean v4, v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2;->$loading:Z

    const v3, -0x1cd0f17e

    invoke-interface {v14, v3}, LEt0;->F(I)V

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->j()LK9$b;

    move-result-object v3

    const/4 v5, 0x6

    invoke-static {v1, v3, v14, v5}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v3, -0x4ee9b9da

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v14, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v14, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v5

    instance-of v5, v5, Llm;

    if-nez v5, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v14, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v5, v1, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v10, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v12, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v25, LQm0;->a:LQm0;

    const v1, 0x221b5560

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/16 v1, 0x28

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v15, v1}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    sget v1, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_check_circle:I

    invoke-static {v1, v14, v13}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    sget-object v12, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v5, 0x6

    invoke-virtual {v12, v14, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSuccess-0d7_KjU()J

    move-result-wide v18

    const/4 v2, 0x0

    const/16 v10, 0x1b8

    const/16 v16, 0x0

    move/from16 v26, v4

    move/from16 v21, v11

    move v11, v5

    move-wide/from16 v4, v18

    move-object/from16 v27, v6

    move-object/from16 v6, p2

    move/from16 v28, v7

    move v7, v10

    move-object v10, v8

    move/from16 v8, v16

    invoke-static/range {v1 .. v8}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x1

    invoke-static {v15, v2, v8, v1}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v29

    sget-object v3, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v8, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    const v3, -0x30340027

    invoke-interface {v14, v3}, LEt0;->F(I)V

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentrysuccess_title_descriptorcode:I

    invoke-static {v3, v14, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_2

    :cond_5
    const v1, -0x3034128c

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    const v3, -0x303400be

    invoke-interface {v14, v3}, LEt0;->F(I)V

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentrysuccess_title:I

    invoke-static {v3, v14, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_2
    move-object/from16 v30, v3

    invoke-virtual {v12, v14, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v31

    invoke-virtual {v12, v14, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v32

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    const v55, 0x3fffe

    const/16 v56, 0x0

    invoke-static/range {v31 .. v56}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v20

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v16, 0x0

    move/from16 v17, v8

    move-object/from16 v8, v16

    move-object/from16 v57, v9

    move-object/from16 v9, v16

    const-wide/16 v18, 0x0

    move-object v1, v10

    move/from16 v31, v21

    move-wide/from16 v10, v18

    move-object/from16 v58, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v59, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x30

    const/16 v23, 0x0

    const/16 v24, 0x7ffc

    move-object/from16 v60, v1

    move-object/from16 v1, v30

    move-object/from16 v2, v29

    move-object/from16 v21, p2

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    and-int/lit8 v1, v28, 0xe

    and-int/lit8 v2, v28, 0x70

    or-int/2addr v1, v2

    move-object/from16 v14, p2

    move-object/from16 v15, v57

    move-object/from16 v13, v60

    invoke-static {v15, v13, v14, v1}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt;->resolveText(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/String;LEt0;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v61, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object v2, v14

    move-object/from16 v62, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v3, v58

    const/4 v4, 0x6

    invoke-virtual {v3, v2, v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v32

    invoke-virtual {v3, v2, v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v33

    const-wide/16 v35, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const v56, 0x3fffe

    const/16 v57, 0x0

    invoke-static/range {v32 .. v57}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v20

    const/16 v22, 0x0

    const/16 v24, 0x7ffe

    move-object v0, v2

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static/range {v31 .. v31}, Lk61;->g(F)F

    move-result v1

    move-object/from16 v8, v59

    invoke-static {v8, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v0, v2}, LDN5;->a(LgV2;LEt0;I)V

    shr-int/lit8 v1, v28, 0x3

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v2, v28, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    move-object/from16 v3, v61

    move-object/from16 v2, v62

    invoke-static {v3, v2, v0, v1}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt;->TransactionHistoryTable(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;LEt0;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object/from16 v2, v25

    move-object v3, v8

    invoke-static/range {v2 .. v7}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v8, v2, v3, v1}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v1, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ComposableSingletons$ManualEntrySuccessScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentrysuccess/ComposableSingletons$ManualEntrySuccessScreenKt;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ComposableSingletons$ManualEntrySuccessScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    shr-int/lit8 v1, v28, 0xc

    and-int/lit8 v1, v1, 0xe

    const v6, 0x180030

    or-int/2addr v1, v6

    shl-int/lit8 v6, v28, 0x9

    const/high16 v8, 0x70000

    and-int/2addr v6, v8

    or-int v9, v1, v6

    const/16 v10, 0x1c

    move-object/from16 v1, v27

    move/from16 v6, v26

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    return-void
.end method
