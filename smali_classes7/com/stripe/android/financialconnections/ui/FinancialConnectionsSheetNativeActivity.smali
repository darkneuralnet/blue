.class public final Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements LNN2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007\u00a2\u0006\u0004\u0008>\u0010?J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0012\u001a\u00020\u00072\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0008\u0010\u0013\u001a\u00020\u0007H\u0016J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001b\u001a\u00020\u00072\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u0008\u0010\u001c\u001a\u00020\u0007H\u0014R\u001d\u0010\"\u001a\u0004\u0018\u00010\u001d8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "LNN2;",
        "LOY2;",
        "navController",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "pane",
        "",
        "BackHandler",
        "(LOY2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V",
        "LaunchedPane",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V",
        "NavigationEffect",
        "(LOY2;LEt0;I)V",
        "LUY2;",
        "popUpIfNotBackwardsNavigable",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "invalidate",
        "initialPane",
        "",
        "reducedBranding",
        "NavHost",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLEt0;I)V",
        "Landroid/content/Intent;",
        "intent",
        "onNewIntent",
        "onResume",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;",
        "args$delegate",
        "Lkotlin/properties/ReadOnlyProperty;",
        "getArgs",
        "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;",
        "args",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getViewModel",
        "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "viewModel",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "getNavigationManager",
        "()Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "setNavigationManager",
        "(Lcom/stripe/android/financialconnections/navigation/NavigationManager;)V",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "setLogger",
        "(Lcom/stripe/android/core/Logger;)V",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "imageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "getImageLoader",
        "()Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "setImageLoader",
        "(Lcom/stripe/android/uicore/image/StripeImageLoader;)V",
        "<init>",
        "()V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsSheetNativeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeActivity.kt\ncom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity\n+ 2 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,283:1\n26#2,11:284\n76#3:295\n25#4:296\n36#4:303\n1057#5,6:297\n1057#5,6:304\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetNativeActivity.kt\ncom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity\n*L\n59#1:284,11\n138#1:295\n140#1:296\n142#1:303\n140#1:297,6\n142#1:304,6\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;

.field public static final EXTRA_RESULT:Ljava/lang/String; = "result"


# instance fields
.field private final args$delegate:Lkotlin/properties/ReadOnlyProperty;

.field public imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field public logger:Lcom/stripe/android/core/Logger;

.field public navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-string v2, "args"

    const-string v3, "getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;"

    const-class v4, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->Companion:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    invoke-static {}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->argsOrNull()Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->args$delegate:Lkotlin/properties/ReadOnlyProperty;

    const-class v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$special$$inlined$viewModelLazy$default$1;

    invoke-direct {v1, v0, p0, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$special$$inlined$viewModelLazy$default$1;-><init>(Lkotlin/reflect/KClass;Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final BackHandler(LOY2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V
    .locals 4

    const v0, -0x900a24f

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.BackHandler (FinancialConnectionsSheetNativeActivity.kt:208)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$BackHandler$1;

    invoke-direct {v0, p0, p2, p1}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$BackHandler$1;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LOY2;)V

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3, v0, p3, v1, v2}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$BackHandler$2;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$BackHandler$2;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;LOY2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private final LaunchedPane(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V
    .locals 3

    const v0, -0x5e834fc7

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.LaunchedPane (FinancialConnectionsSheetNativeActivity.kt:216)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$LaunchedPane$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$LaunchedPane$1;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    const/16 v2, 0x46

    invoke-static {v0, v1, p2, v2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$LaunchedPane$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$LaunchedPane$2;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private final NavigationEffect(LOY2;LEt0;I)V
    .locals 3

    const v0, 0x600601a3

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavigationEffect (FinancialConnectionsSheetNativeActivity.kt:236)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getNavigationManager()Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->getCommands()LBX2;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavigationEffect$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavigationEffect$1;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;LOY2;Lkotlin/coroutines/Continuation;)V

    const/16 v2, 0x48

    invoke-static {v0, v1, p2, v2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavigationEffect$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavigationEffect$2;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;LOY2;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final synthetic access$BackHandler(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;LOY2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->BackHandler(LOY2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LaunchedPane(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->LaunchedPane(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$NavigationEffect(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;LOY2;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->NavigationEffect(LOY2;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$popUpIfNotBackwardsNavigable(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;LUY2;LOY2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->popUpIfNotBackwardsNavigable(LUY2;LOY2;)V

    return-void
.end method

.method private final popUpIfNotBackwardsNavigable(LUY2;LOY2;)V
    .locals 5

    invoke-virtual {p2}, LDY2;->y()LAY2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LAY2;->f()LHY2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LHY2;->w()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getPartnerAuth()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v3

    invoke-interface {v3}, Lcom/stripe/android/financialconnections/navigation/NavigationCommand;->getDestination()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v2

    invoke-interface {v2}, Lcom/stripe/android/financialconnections/navigation/NavigationCommand;->getDestination()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {p2}, LDY2;->A()LHY2;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LHY2;->w()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-static {v1, p2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$popUpIfNotBackwardsNavigable$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$popUpIfNotBackwardsNavigable$1;

    invoke-virtual {p1, v0, p2}, LUY2;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final NavHost(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLEt0;I)V
    .locals 7

    const-string v0, "initialPane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x368c09c0

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost (FinancialConnectionsSheetNativeActivity.kt:133)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {p3, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    new-array v2, v1, [Ld13;

    const/16 v3, 0x8

    invoke-static {v2, p3, v3}, LPY2;->e([Ld13;LEt0;I)LOY2;

    move-result-object v2

    const v3, -0x1d58f75c

    invoke-interface {p3, v3}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    new-instance v3, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;-><init>(Landroid/content/Context;)V

    invoke-interface {p3, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v3, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;

    const v0, 0x44faf204

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_2

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {p1, v0, v4}, Lcom/stripe/android/financialconnections/domain/GoNextKt;->toNavigationCommand(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/core/Logger;Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationCommand;->getDestination()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p3, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v5, Ljava/lang/String;

    const/16 v0, 0x48

    invoke-direct {p0, v2, p3, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->NavigationEffect(LOY2;LEt0;I)V

    const/4 v0, 0x4

    new-array v0, v0, [LW94;

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalReducedBranding()LU94;

    move-result-object v4

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v4, v6}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v4

    aput-object v4, v0, v1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalNavHostController()LU94;

    move-result-object v1

    invoke-virtual {v1, v2}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, v0, v4

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getImageLoader()Lcom/stripe/android/uicore/image/StripeImageLoader;

    move-result-object v6

    invoke-virtual {v1, v6}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    const/4 v6, 0x2

    aput-object v1, v0, v6

    invoke-static {}, Lhu0;->p()LU94;

    move-result-object v1

    invoke-virtual {v1, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$1;

    invoke-direct {v1, v2, v5, p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$1;-><init>(LOY2;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V

    const v2, -0x2f11d300

    invoke-static {p3, v2, v4, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p3, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_5

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZI)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public collectLatest(LEu1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LNN2$a;->a(LNN2;LEu1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public final getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->args$delegate:Lkotlin/properties/ReadOnlyProperty;

    sget-object v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;

    return-object v0
.end method

.method public final getImageLoader()Lcom/stripe/android/uicore/image/StripeImageLoader;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "imageLoader"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->logger:Lcom/stripe/android/core/Logger;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "logger"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMavericksViewInternalViewModel()LON2;
    .locals 1

    invoke-static {p0}, LNN2$a;->b(LNN2;)LON2;

    move-result-object v0

    return-object v0
.end method

.method public getMvrxViewId()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LNN2$a;->c(LNN2;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNavigationManager()Lcom/stripe/android/financialconnections/navigation/NavigationManager;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navigationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSubscriptionLifecycleOwner()LLifecycleOwner;
    .locals 1

    invoke-static {p0}, LNN2$a;->d(LNN2;)LLifecycleOwner;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    return-object v0
.end method

.method public invalidate()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$invalidate$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$invalidate$1;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V

    invoke-static {v0, v1}, LVr6;->a(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public onAsync(LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+",
            "Ldp<",
            "+TT;>;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, LNN2$a;->e(LNN2;LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getActivityRetainedComponent()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->inject(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$onCreate$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$onCreate$1;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LNN2$a;->n(LNN2;LRN2;La01;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v6

    const-string v0, "onBackPressedDispatcher"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$onCreate$2;

    invoke-direct {v9, p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$onCreate$2;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lbf3;->b(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LVe3;

    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$onCreate$3;-><init>(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V

    const v1, -0x7dc1685

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    invoke-static {p0, p1, v0, v2, p1}, LMs0;->b(Landroidx/activity/ComponentActivity;LYt0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onEach(LRN2;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            ">(",
            "LRN2<",
            "TS;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TS;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LNN2$a;->f(LNN2;LRN2;La01;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TA;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, LNN2$a;->g(LNN2;LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function3;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function3<",
            "-TA;-TB;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, LNN2$a;->h(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function3;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function4;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function4<",
            "-TA;-TB;-TC;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p6}, LNN2$a;->i(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function4;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function5;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function5<",
            "-TA;-TB;-TC;-TD;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p7}, LNN2$a;->j(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function5;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function6;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TE;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function6<",
            "-TA;-TB;-TC;-TD;-TE;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p8}, LNN2$a;->k(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function6;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function7;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TE;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TF;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function7<",
            "-TA;-TB;-TC;-TD;-TE;-TF;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p9}, LNN2$a;->l(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function7;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function8;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            "G:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TE;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TF;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TG;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function8<",
            "-TA;-TB;-TC;-TD;-TE;-TF;-TG;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p10}, LNN2$a;->m(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function8;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->handleOnNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onResume()V

    return-void
.end method

.method public postInvalidate()V
    .locals 0

    invoke-static {p0}, LNN2$a;->o(LNN2;)V

    return-void
.end method

.method public final setImageLoader(Lcom/stripe/android/uicore/image/StripeImageLoader;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    return-void
.end method

.method public final setLogger(Lcom/stripe/android/core/Logger;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public final setNavigationManager(Lcom/stripe/android/financialconnections/navigation/NavigationManager;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    return-void
.end method

.method public uniqueOnly(Ljava/lang/String;)LRd6;
    .locals 0

    invoke-static {p0, p1}, LNN2$a;->p(LNN2;Ljava/lang/String;)LRd6;

    move-result-object p1

    return-object p1
.end method
