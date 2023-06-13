.class public final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0008\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001ai\u0010\u000f\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001aG\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000\u000cH\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "AttachPaymentScreen",
        "(LEt0;I)V",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;",
        "payload",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        "attachPayment",
        "Lkotlin/Function0;",
        "onSelectAnotherBank",
        "onEnterDetailsManually",
        "onCloseClick",
        "Lkotlin/Function1;",
        "",
        "onCloseFromErrorClick",
        "AttachPaymentContent",
        "(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "error",
        "ErrorContent",
        "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "AttachPaymentScreenPreview",
        "financial-connections_release"
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
        "SMAP\nAttachPaymentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachPaymentScreen.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,141:1\n53#2:142\n54#2,15:144\n69#2,8:165\n79#2:176\n80#2,5:179\n76#3:143\n83#4,3:159\n50#4:177\n49#4:178\n1057#5,3:162\n1060#5,3:173\n*S KotlinDebug\n*F\n+ 1 AttachPaymentScreen.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt\n*L\n29#1:142\n29#1:144,15\n29#1:165,8\n29#1:176\n29#1:179,5\n29#1:143\n29#1:159,3\n29#1:177\n29#1:178\n29#1:162,3\n29#1:173,3\n*E\n"
    }
.end annotation


# direct methods
.method private static final AttachPaymentContent(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;",
            ">;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
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
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v7, p7

    const v0, -0x796abb97

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v8

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentContent (AttachPaymentScreen.kt:44)"

    invoke-static {v0, v7, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$1;

    move-object/from16 v9, p4

    invoke-direct {v0, v9, v7}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$1;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v1, 0x9741d9a

    const/4 v10, 0x1

    invoke-static {v8, v1, v10, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p5

    move/from16 v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;-><init>(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    const v0, 0x34e29a56

    invoke-static {v8, v0, v10, v12}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v11, v0, v8, v1}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v8}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_2

    goto :goto_0

    :cond_2
    new-instance v10, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$3;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$3;-><init>(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v8, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final AttachPaymentScreen(LEt0;I)V
    .locals 20

    move/from16 v0, p1

    const v1, 0x5bb57f17

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v10

    if-nez v0, :cond_1

    invoke-interface {v10}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v10}, LEt0;->k()V

    goto/16 :goto_9

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreen (AttachPaymentScreen.kt:27)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e871a90

    invoke-interface {v10, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-interface {v10, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v12

    if-eqz v12, :cond_13

    instance-of v2, v1, LXr6;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, LXr6;

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_12

    instance-of v4, v1, LPi5;

    if-eqz v4, :cond_4

    move-object v4, v1

    check-cast v4, LPi5;

    goto :goto_2

    :cond_4
    move-object v4, v3

    :goto_2
    if-eqz v4, :cond_11

    invoke-interface {v4}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v4

    const-class v5, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v6

    invoke-interface {v10, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    const/4 v7, 0x4

    new-array v8, v7, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v15, 0x1

    aput-object v12, v8, v15

    const/4 v11, 0x2

    aput-object v2, v8, v11

    const/4 v11, 0x3

    aput-object v4, v8, v11

    const v11, -0x21de6e89

    invoke-interface {v10, v11}, LEt0;->F(I)V

    move v11, v9

    move v13, v11

    :goto_3
    if-ge v11, v7, :cond_5

    aget-object v14, v8, v11

    invoke-interface {v10, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_7

    sget-object v8, LEt0;->a:LEt0$a;

    invoke-virtual {v8}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_6

    goto :goto_4

    :cond_6
    move v6, v15

    goto :goto_8

    :cond_7
    :goto_4
    instance-of v7, v1, Landroidx/fragment/app/Fragment;

    if-eqz v7, :cond_8

    check-cast v1, Landroidx/fragment/app/Fragment;

    goto :goto_5

    :cond_8
    move-object v1, v3

    :goto_5
    if-nez v1, :cond_9

    invoke-static {v6}, LtN2;->g(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    :cond_9
    move-object v14, v1

    const-string v1, "mavericks:arg"

    if-eqz v14, :cond_b

    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    goto :goto_6

    :cond_a
    move-object v13, v3

    :goto_6
    new-instance v1, LFy1;

    const/4 v2, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x18

    const/16 v18, 0x0

    move-object v11, v1

    move v6, v15

    move-object v15, v2

    invoke-direct/range {v11 .. v18}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_b
    move v6, v15

    invoke-virtual {v12}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :cond_c
    new-instance v1, Lr6;

    invoke-direct {v1, v12, v3, v2, v4}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    :goto_7
    move-object v7, v1

    invoke-interface {v10, v7}, LEt0;->z(Ljava/lang/Object;)V

    :goto_8
    invoke-interface {v10}, LEt0;->Q()V

    move-object v14, v7

    check-cast v14, LPr6;

    const v1, 0x1e7b2b64

    invoke-interface {v10, v1}, LEt0;->F(I)V

    invoke-interface {v10, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v10, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_d

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_e

    :cond_d
    sget-object v11, LYN2;->a:LYN2;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v12

    const-class v13, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v1, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x30

    const/16 v19, 0x0

    invoke-static/range {v11 .. v19}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface {v10}, LEt0;->Q()V

    check-cast v2, LRN2;

    invoke-interface {v10}, LEt0;->Q()V

    check-cast v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v10, v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/16 v3, 0x8

    invoke-static {v2, v10, v3}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$1;

    const/16 v5, 0x36

    invoke-static {v6, v4, v10, v5, v9}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;->getPayload()Ldp;

    move-result-object v4

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;->getLinkPaymentAccount()Ldp;

    move-result-object v3

    new-instance v5, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$2;

    invoke-direct {v5, v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$2;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$3;

    invoke-direct {v6, v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$3;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$4;

    invoke-direct {v7, v1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$4;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    new-instance v8, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$5;

    invoke-direct {v8, v1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$5;-><init>(Ljava/lang/Object;)V

    const/16 v9, 0x48

    move-object v2, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;->AttachPaymentContent(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_9
    invoke-interface {v10}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_a

    :cond_10
    new-instance v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$6;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreen$6;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a SavedStateRegistryOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a ViewModelStoreOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composable is not hosted in a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final AttachPaymentScreenPreview(LEt0;I)V
    .locals 4

    const v0, 0x5b129f4d

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

    const-string v2, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenPreview (AttachPaymentScreen.kt:124)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/attachpayment/ComposableSingletons$AttachPaymentScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/ComposableSingletons$AttachPaymentScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/attachpayment/ComposableSingletons$AttachPaymentScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreenPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentScreenPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const v0, 0x4209808a

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.attachpayment.ErrorContent (AttachPaymentScreen.kt:102)"

    invoke-static {v0, p5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;

    if-eqz v0, :cond_1

    const v0, 0x2b04e6d8

    invoke-interface {p4, v0}, LEt0;->F(I)V

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;

    and-int/lit8 v1, p5, 0x70

    and-int/lit16 v2, p5, 0x380

    or-int/2addr v1, v2

    invoke-static {v0, p1, p2, p4, v1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->AccountNumberRetrievalErrorContent(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p4}, LEt0;->Q()V

    goto :goto_0

    :cond_1
    const v0, 0x2b04e7a9

    invoke-interface {p4, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, p5, 0x6

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x8

    invoke-static {p0, p3, p4, v0}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->UnclassifiedErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p4}, LEt0;->Q()V

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p4

    if-nez p4, :cond_3

    goto :goto_1

    :cond_3
    new-instance v6, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$ErrorContent$1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$ErrorContent$1;-><init>(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p4, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final synthetic access$AttachPaymentContent(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;->AttachPaymentContent(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;->ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method
