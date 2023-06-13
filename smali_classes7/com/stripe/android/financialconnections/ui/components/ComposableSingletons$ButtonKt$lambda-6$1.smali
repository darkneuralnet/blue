.class final Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
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
        "SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,241:1\n154#2:242\n75#3,5:243\n80#3:274\n84#3:279\n75#4:248\n76#4,11:250\n89#4:278\n76#5:249\n460#6,13:261\n473#6,3:275\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1\n*L\n197#1:242\n193#1:243,5\n193#1:274\n193#1:279\n193#1:248\n193#1:250,11\n193#1:278\n193#1:249\n193#1:261,13\n193#1:275,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 17

    move-object/from16 v10, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$ButtonKt.lambda-6.<anonymous> (Button.kt:191)"

    const v3, 0x72c818c1

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v11, LgV2;->b0:LgV2$a;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v1, 0x6

    invoke-virtual {v0, v10, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundSurface-0d7_KjU()J

    move-result-wide v5

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v4, v11

    invoke-static/range {v4 .. v9}, Lbw;->d(LgV2;JLhy5;ILjava/lang/Object;)LgV2;

    move-result-object v0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v0, v12, v13, v14}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v0

    sget-object v2, Llo;->a:Llo;

    invoke-virtual {v2}, Llo;->e()Llo$e;

    move-result-object v2

    const v3, -0x1cd0f17e

    invoke-interface {v10, v3}, LEt0;->F(I)V

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->j()LK9$b;

    move-result-object v3

    invoke-static {v2, v3, v10, v1}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v10, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v10, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v10, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v5, LBt0;->M:LBt0$a;

    invoke-virtual {v5}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v10, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v5}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v10, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v10, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v10, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x53488fc9

    invoke-interface {v10, v0}, LEt0;->F(I)V

    invoke-static {v11, v12, v13, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v15, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;

    invoke-virtual {v15}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const v8, 0x1b0036

    const/16 v9, 0x1c

    move-object/from16 v7, p1

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {v11, v12, v13, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$2;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$2;

    const/4 v5, 0x1

    invoke-virtual {v15}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {v11, v12, v13, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$3;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$3;

    const/4 v5, 0x0

    invoke-virtual {v15}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const v8, 0x186036

    const/16 v9, 0x2c

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {v11, v12, v13, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v16, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$4;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$4;

    invoke-virtual {v15}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->getLambda-4$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const v8, 0x1b01b6

    const/16 v9, 0x18

    move-object/from16 v2, v16

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {v11, v12, v13, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$5;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt$lambda-6$1$1$5;

    invoke-virtual {v15}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->getLambda-5$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const v8, 0x1b61b6

    const/16 v9, 0x8

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method
