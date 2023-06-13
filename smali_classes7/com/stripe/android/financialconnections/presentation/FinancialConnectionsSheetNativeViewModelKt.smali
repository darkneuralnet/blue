.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "parentViewModel",
        "(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
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
        "SMAP\nFinancialConnectionsSheetNativeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,375:1\n119#2,4:376\n123#2,4:381\n57#2,12:385\n69#2,8:403\n79#2:414\n80#2,5:417\n76#3:380\n83#4,3:397\n50#4:415\n49#4:416\n1057#5,3:400\n1060#5,3:411\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt\n*L\n358#1:376,4\n358#1:381,4\n358#1:385,12\n358#1:403,8\n358#1:414\n358#1:417,5\n358#1:380\n358#1:397,3\n358#1:415\n358#1:416\n358#1:400,3\n358#1:411,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 21

    move-object/from16 v0, p0

    const v1, 0x2909ec69

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.presentation.parentViewModel (FinancialConnectionsSheetNativeViewModel.kt:356)"

    move/from16 v4, p1

    invoke-static {v1, v4, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const v1, 0x180798b6

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v1

    invoke-interface {v0, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v1

    if-eqz v1, :cond_d

    const v2, 0x1e871a90

    invoke-interface {v0, v2}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v0, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    const-class v3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v3

    invoke-interface {v0, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const/4 v5, 0x4

    new-array v6, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v8, 0x1

    aput-object v4, v6, v8

    const/4 v8, 0x2

    aput-object v1, v6, v8

    const/4 v8, 0x3

    aput-object v2, v6, v8

    const v8, -0x21de6e89

    invoke-interface {v0, v8}, LEt0;->F(I)V

    move v8, v7

    :goto_0
    if-ge v7, v5, :cond_1

    aget-object v9, v6, v7

    invoke-interface {v0, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    invoke-interface/range {p0 .. p0}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v8, :cond_2

    sget-object v6, LEt0;->a:LEt0$a;

    invoke-virtual {v6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_8

    :cond_2
    instance-of v5, v1, Landroidx/fragment/app/Fragment;

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move-object v5, v1

    check-cast v5, Landroidx/fragment/app/Fragment;

    goto :goto_1

    :cond_3
    move-object v5, v6

    :goto_1
    if-nez v5, :cond_4

    invoke-static {v3}, LtN2;->g(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    move-object v7, v3

    goto :goto_2

    :cond_4
    move-object v7, v5

    :goto_2
    const-string v3, "mavericks:arg"

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    goto :goto_3

    :cond_5
    move-object v5, v6

    :goto_3
    new-instance v1, LFy1;

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v10, 0x0

    move-object v3, v1

    move-object v6, v7

    move-object v7, v2

    invoke-direct/range {v3 .. v10}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v1

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    :cond_7
    new-instance v3, Lr6;

    invoke-direct {v3, v4, v6, v1, v2}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    move-object v5, v3

    :goto_4
    invoke-interface {v0, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p0 .. p0}, LEt0;->Q()V

    move-object v15, v5

    check-cast v15, LPr6;

    const v1, 0x1e7b2b64

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-interface {v0, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v0, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p0 .. p0}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_a

    :cond_9
    sget-object v12, LYN2;->a:LYN2;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v13

    const-class v14, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x30

    const/16 v20, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v12 .. v20}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v2

    invoke-interface {v0, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface/range {p0 .. p0}, LEt0;->Q()V

    check-cast v2, LRN2;

    invoke-interface/range {p0 .. p0}, LEt0;->Q()V

    invoke-interface/range {p0 .. p0}, LEt0;->Q()V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    invoke-interface/range {p0 .. p0}, LEt0;->Q()V

    return-object v2

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composable is not hosted in a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LocalContext is not a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
