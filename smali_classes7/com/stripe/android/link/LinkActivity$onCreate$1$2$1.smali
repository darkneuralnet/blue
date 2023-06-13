.class final Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->invoke(LEt0;I)V
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
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,276:1\n74#2,6:277\n80#2:309\n84#2:314\n75#3:283\n76#3,11:285\n89#3:313\n76#4:284\n460#5,13:296\n473#5,3:310\n76#6:315\n76#6:316\n76#6:317\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$2$1\n*L\n112#1:277,6\n112#1:309\n112#1:314\n112#1:283\n112#1:285,11\n112#1:313\n112#1:284\n112#1:296,13\n112#1:310,3\n113#1:315\n114#1:316\n115#1:317\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bottomSheetContent$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $coroutineScope:LZC0;

.field final synthetic $sheetState:LGU2;

.field final synthetic this$0:Lcom/stripe/android/link/LinkActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkActivity;LZC0;LGU2;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkActivity;",
            "LZC0;",
            "LGU2;",
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->$coroutineScope:LZC0;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->$sheetState:LGU2;

    iput-object p4, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->$bottomSheetContent$delegate:LEX2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$3$lambda$0(LsP5;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke$lambda$3$lambda$0(LsP5;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$0(LsP5;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;)",
            "Lcom/stripe/android/link/model/LinkAccount;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/model/LinkAccount;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$1(LsP5;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final invoke$lambda$3$lambda$2(LsP5;)LAY2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "LAY2;",
            ">;)",
            "LAY2;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAY2;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LinkActivity.kt:106)"

    const v4, 0xda4ce7

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    const/4 v7, 0x0

    new-array v2, v7, [Ld13;

    const/16 v8, 0x8

    invoke-static {v2, v9, v8}, LPY2;->e([Ld13;LEt0;I)LOY2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/link/LinkActivity;->setNavController(LOY2;)V

    iget-object v1, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-static {v1}, Lcom/stripe/android/link/LinkActivity;->access$getViewModel(Lcom/stripe/android/link/LinkActivity;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityViewModel;->getNavigator()Lcom/stripe/android/link/model/Navigator;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivity;->getNavController()LOY2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/link/model/Navigator;->setNavigationController(LOY2;)V

    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v1, v2, v10, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v13, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    iget-object v15, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->$coroutineScope:LZC0;

    iget-object v14, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->$sheetState:LGU2;

    iget-object v12, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->$bottomSheetContent$delegate:LEX2;

    const v2, -0x1cd0f17e

    invoke-interface {v9, v2}, LEt0;->F(I)V

    sget-object v2, Llo;->a:Llo;

    invoke-virtual {v2}, Llo;->g()Llo$l;

    move-result-object v2

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->j()LK9$b;

    move-result-object v3

    invoke-static {v2, v3, v9, v7}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v9, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v9, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v9, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v9, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v2, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v10, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v10, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v10, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v9, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v9, v1}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v9, v1}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, 0x15f69431

    invoke-interface {v9, v1}, LEt0;->F(I)V

    invoke-static {v13}, Lcom/stripe/android/link/LinkActivity;->access$getViewModel(Lcom/stripe/android/link/LinkActivity;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkAccount()LtP5;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v10

    invoke-static {v13}, Lcom/stripe/android/link/LinkActivity;->access$isRootScreenFlow(Lcom/stripe/android/link/LinkActivity;)LEu1;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-virtual {v13}, Lcom/stripe/android/link/LinkActivity;->getNavController()LOY2;

    move-result-object v2

    invoke-static {v2, v9, v8}, LPY2;->d(LDY2;LEt0;I)LsP5;

    move-result-object v2

    invoke-static {v1}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke$lambda$3$lambda$1(LsP5;)Z

    move-result v1

    invoke-static {v2}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke$lambda$3$lambda$2(LsP5;)LAY2;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LAY2;->f()LHY2;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LHY2;->w()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    invoke-static {v10}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke$lambda$3$lambda$0(LsP5;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    invoke-static {v10}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke$lambda$3$lambda$0(LsP5;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v4

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :goto_4
    const/4 v6, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/LinkAppBarStateKt;->rememberLinkAppBarState(ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;LEt0;I)Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$1;

    invoke-static {v13}, Lcom/stripe/android/link/LinkActivity;->access$getViewModel(Lcom/stripe/android/link/LinkActivity;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$1;-><init>(Ljava/lang/Object;)V

    const/4 v3, 0x1

    invoke-static {v7, v2, v9, v7, v3}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    new-instance v2, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$2;

    invoke-virtual {v13}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v3

    const-string v4, "onBackPressedDispatcher"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$2;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$3;

    invoke-static {v13}, Lcom/stripe/android/link/LinkActivity;->access$getViewModel(Lcom/stripe/android/link/LinkActivity;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$3;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$4;

    invoke-direct {v4, v15, v14, v12}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$4;-><init>(LZC0;LGU2;LEX2;)V

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-virtual {v13}, Lcom/stripe/android/link/LinkActivity;->getNavController()LOY2;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/link/LinkScreen$Loading;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Loading;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;

    move-object v6, v12

    move-object v12, v5

    move-object v7, v14

    move-object v14, v10

    move-object/from16 v16, v7

    move-object/from16 v17, v6

    invoke-direct/range {v12 .. v17}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;-><init>(Lcom/stripe/android/link/LinkActivity;LsP5;LZC0;LGU2;LEX2;)V

    const/16 v7, 0x8

    const/16 v8, 0xc

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, LRY2;->b(LOY2;Ljava/lang/String;LgV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_5
    return-void
.end method
