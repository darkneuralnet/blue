.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u0012\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "",
        "country",
        "",
        "AutocompleteScreen",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;LEt0;I)V",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
        "viewModel",
        "AutocompleteScreenUI",
        "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;LEt0;I)V",
        "TEST_TAG_ATTRIBUTION_DRAWABLE",
        "Ljava/lang/String;",
        "getTEST_TAG_ATTRIBUTION_DRAWABLE$annotations",
        "()V",
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
        "SMAP\nAutocompleteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,235:1\n76#2:236\n81#3,11:237\n25#4:248\n1057#5,6:249\n76#6:255\n76#6:256\n*S KotlinDebug\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt\n*L\n59#1:236\n61#1:237,11\n81#1:248\n81#1:249,6\n76#1:255\n77#1:256\n*E\n"
    }
.end annotation


# static fields
.field public static final TEST_TAG_ATTRIBUTION_DRAWABLE:Ljava/lang/String; = "AutocompleteAttributionDrawable"


# direct methods
.method public static final AutocompleteScreen(Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;LEt0;I)V
    .locals 9

    const-string v0, "injector"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x8d227f4

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreen (AutocompleteScreen.kt:54)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Application;

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreen$viewModel$1;

    invoke-direct {v2, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreen$viewModel$1;-><init>(Landroid/app/Application;)V

    invoke-direct {v4, p0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lkotlin/jvm/functions/Function0;)V

    const v0, 0x671a9c9b

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, Lpv2;->a:Lpv2;

    const/4 v1, 0x6

    invoke-virtual {v0, p2, v1}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v2

    if-eqz v2, :cond_4

    const/4 v3, 0x0

    instance-of v0, v2, Landroidx/lifecycle/e;

    if-eqz v0, :cond_1

    move-object v0, v2

    check-cast v0, Landroidx/lifecycle/e;

    invoke-interface {v0}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v0

    const-string v1, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v0, LFE0$a;->b:LFE0$a;

    :goto_0
    move-object v5, v0

    const-class v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    const v7, 0x9048

    const/4 v8, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v0

    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    const/16 v1, 0x8

    invoke-static {v0, p2, v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->AutocompleteScreenUI(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreen$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreen$1;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final AutocompleteScreenUI(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;LEt0;I)V
    .locals 36

    move-object/from16 v7, p0

    move/from16 v8, p2

    const-string v0, "viewModel"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x96d476

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:74)"

    invoke-static {v0, v8, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->getPredictions()LtP5;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v9, 0x0

    const/4 v14, 0x1

    invoke-static {v0, v9, v15, v1, v14}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->getLoading()LtP5;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, v15

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->getTextFieldController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldValue()LEu1;

    move-result-object v1

    const-string v2, ""

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;->Companion:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    const/4 v2, 0x0

    invoke-static {v15, v2}, LwS0;->a(LEt0;I)Z

    move-result v2

    const/4 v3, 0x2

    invoke-static {v0, v2, v9, v3, v9}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->getPlacesPoweredByGoogleDrawable$default(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;ILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v6

    const v0, -0x1d58f75c

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    new-instance v0, Landroidx/compose/ui/focus/h;

    invoke-direct {v0}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v15, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {v15}, LEt0;->Q()V

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/focus/h;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$1;

    invoke-direct {v2, v3, v9}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$1;-><init>(Landroidx/compose/ui/focus/h;Lkotlin/coroutines/Continuation;)V

    const/16 v4, 0x46

    invoke-static {v0, v2, v15, v4}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$2;

    invoke-direct {v0, v7}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V

    const v2, 0x371c4e4f

    invoke-static {v15, v2, v14, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v11

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3;

    invoke-direct {v0, v7}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V

    const v2, 0x6fa51c50

    invoke-static {v15, v2, v14, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v0, 0x0

    move v5, v14

    move-object v14, v0

    const/4 v0, 0x0

    move-object v4, v15

    move v15, v0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    sget-object v0, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-virtual {v0, v4, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->n()J

    move-result-wide v27

    const-wide/16 v29, 0x0

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4;

    move-object v0, v2

    move-object v9, v2

    move-object/from16 v2, p0

    move-object v10, v4

    move-object/from16 v4, v32

    move v13, v5

    move-object/from16 v5, v31

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4;-><init>(LsP5;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Landroidx/compose/ui/focus/h;LsP5;LsP5;Ljava/lang/Integer;)V

    const v0, -0x37473fb8    # -378370.25f

    invoke-static {v10, v0, v13, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v31

    const/16 v33, 0xd80

    const/high16 v34, 0xc00000

    const v35, 0x17ff3

    move-object/from16 v32, v10

    move-object v0, v10

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v35}, LVi5;->a(LgV2;LXi5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLhy5;FJJJJJLkotlin/jvm/functions/Function3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$5;

    invoke-direct {v1, v7, v8}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$5;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final AutocompleteScreenUI$lambda$0(LsP5;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final AutocompleteScreenUI$lambda$1(LsP5;)Z
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

.method public static final synthetic access$AutocompleteScreenUI$lambda$0(LsP5;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->AutocompleteScreenUI$lambda$0(LsP5;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$AutocompleteScreenUI$lambda$1(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->AutocompleteScreenUI$lambda$1(LsP5;)Z

    move-result p0

    return p0
.end method

.method public static synthetic getTEST_TAG_ATTRIBUTION_DRAWABLE$annotations()V
    .locals 0

    return-void
.end method
