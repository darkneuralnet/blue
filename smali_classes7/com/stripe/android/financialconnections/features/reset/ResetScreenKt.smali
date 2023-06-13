.class public final Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a?\u0010\n\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00000\u0007H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u0002\u00a8\u0006\r"
    }
    d2 = {
        "",
        "ResetScreen",
        "(LEt0;I)V",
        "Ldp;",
        "payload",
        "Lkotlin/Function0;",
        "onCloseClick",
        "Lkotlin/Function1;",
        "",
        "onCloseFromErrorClick",
        "ResetContent",
        "(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "ResetScreenPreview",
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
        "SMAP\nResetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetScreen.kt\ncom/stripe/android/financialconnections/features/reset/ResetScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n53#2:69\n54#2,15:71\n69#2,8:92\n79#2:103\n80#2,5:106\n76#3:70\n83#4,3:86\n50#4:104\n49#4:105\n1057#5,3:89\n1060#5,3:100\n*S KotlinDebug\n*F\n+ 1 ResetScreen.kt\ncom/stripe/android/financialconnections/features/reset/ResetScreenKt\n*L\n23#1:69\n23#1:71,15\n23#1:92,8\n23#1:103\n23#1:106,5\n23#1:70\n23#1:86,3\n23#1:104\n23#1:105\n23#1:89,3\n23#1:100,3\n*E\n"
    }
.end annotation


# direct methods
.method private static final ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
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

    const v0, -0x6a03cdcd

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.reset.ResetContent (ResetScreen.kt:34)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$1;

    invoke-direct {v0, p1, p4}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$1;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v1, -0x55e1565c

    const/4 v2, 0x1

    invoke-static {p3, v1, v2, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;

    invoke-direct {v1, p0, p2, p4}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;-><init>(Ldp;Lkotlin/jvm/functions/Function1;I)V

    const v3, -0xa5df2a0

    invoke-static {p3, v3, v2, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v2, 0x36

    invoke-static {v0, v1, p3, v2}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;-><init>(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final ResetScreen(LEt0;I)V
    .locals 18

    move/from16 v0, p1

    const v1, 0x236e26a9

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v8

    if-nez v0, :cond_1

    invoke-interface {v8}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v8}, LEt0;->k()V

    goto/16 :goto_9

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.reset.ResetScreen (ResetScreen.kt:21)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e871a90

    invoke-interface {v8, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-interface {v8, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v8, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v10

    if-eqz v10, :cond_13

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

    const-class v5, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v6

    invoke-interface {v8, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    const/4 v7, 0x4

    new-array v9, v7, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v1, v9, v15

    const/4 v14, 0x1

    aput-object v10, v9, v14

    const/4 v11, 0x2

    aput-object v2, v9, v11

    const/4 v11, 0x3

    aput-object v4, v9, v11

    const v11, -0x21de6e89

    invoke-interface {v8, v11}, LEt0;->F(I)V

    move v11, v15

    move v12, v11

    :goto_3
    if-ge v11, v7, :cond_5

    aget-object v13, v9, v11

    invoke-interface {v8, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v8}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v12, :cond_7

    sget-object v9, LEt0;->a:LEt0$a;

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, v7

    move v7, v14

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
    move-object v12, v1

    const-string v1, "mavericks:arg"

    if-eqz v12, :cond_b

    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    goto :goto_6

    :cond_a
    move-object v11, v3

    :goto_6
    new-instance v1, LFy1;

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x18

    const/16 v16, 0x0

    move-object v9, v1

    move v7, v14

    move-object v14, v2

    move v6, v15

    move v15, v3

    invoke-direct/range {v9 .. v16}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_b
    move v7, v14

    move v6, v15

    invoke-virtual {v10}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_c

    invoke-virtual {v9, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :cond_c
    new-instance v1, Lr6;

    invoke-direct {v1, v10, v3, v2, v4}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    :goto_7
    invoke-interface {v8, v1}, LEt0;->z(Ljava/lang/Object;)V

    :goto_8
    invoke-interface {v8}, LEt0;->Q()V

    move-object v12, v1

    check-cast v12, LPr6;

    const v1, 0x1e7b2b64

    invoke-interface {v8, v1}, LEt0;->F(I)V

    invoke-interface {v8, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v8, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v8}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_d

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_e

    :cond_d
    sget-object v9, LYN2;->a:LYN2;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v10

    const-class v11, Lcom/stripe/android/financialconnections/features/reset/ResetState;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v1, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x30

    const/16 v17, 0x0

    invoke-static/range {v9 .. v17}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v2

    invoke-interface {v8, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface {v8}, LEt0;->Q()V

    check-cast v2, LRN2;

    invoke-interface {v8}, LEt0;->Q()V

    check-cast v2, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {v8, v6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;

    const/16 v9, 0x188

    const/4 v10, 0x1

    move-object v5, v8

    move v11, v6

    move v6, v9

    move v9, v7

    move v7, v10

    invoke-static/range {v2 .. v7}, LtN2;->c(LRN2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$1;

    const/16 v4, 0x36

    invoke-static {v9, v3, v8, v4, v11}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldp;

    new-instance v3, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$2;

    invoke-direct {v3, v1}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$2;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    new-instance v4, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$3;

    invoke-direct {v4, v1}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$3;-><init>(Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-static {v2, v3, v4, v8, v1}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;->ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_9
    invoke-interface {v8}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_a

    :cond_10
    new-instance v2, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$4;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$4;-><init>(I)V

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

.method public static final ResetScreenPreview(LEt0;I)V
    .locals 4

    const v0, 0x52a816bb

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

    const-string v2, "com.stripe.android.financialconnections.features.reset.ResetScreenPreview (ResetScreen.kt:59)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/reset/ComposableSingletons$ResetScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ComposableSingletons$ResetScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/reset/ComposableSingletons$ResetScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreenPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreenPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;->ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method
