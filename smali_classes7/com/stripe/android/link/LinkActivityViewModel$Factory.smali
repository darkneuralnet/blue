.class public final Lcom/stripe/android/link/LinkActivityViewModel$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;
.implements Lcom/stripe/android/core/injection/Injectable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/u$b;",
        "Lcom/stripe/android/core/injection/Injectable<",
        "Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0015\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ/\u0010\n\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityViewModel$Factory;",
        "Landroidx/lifecycle/u$b;",
        "Lcom/stripe/android/core/injection/Injectable;",
        "Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "LFE0;",
        "extras",
        "create",
        "(Ljava/lang/Class;LFE0;)LOr6;",
        "arg",
        "Lcom/stripe/android/core/injection/Injector;",
        "fallbackInitialize",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "starterArgsSupplier",
        "Lkotlin/jvm/functions/Function0;",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "viewModel",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/link/LinkActivityViewModel;",
        "setViewModel",
        "(Lcom/stripe/android/link/LinkActivityViewModel;)V",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;)V",
        "FallbackInitializeParam",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final starterArgsSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field public viewModel:Lcom/stripe/android/link/LinkActivityViewModel;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;)V"
        }
    .end annotation

    const-string v0, "starterArgsSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->starterArgsSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public bridge synthetic create(Ljava/lang/Class;)LOr6;
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;)LOr6;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LFE0;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->starterArgsSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-static {p2}, Lcom/stripe/android/utils/CreationExtrasKtxKt;->requireApplication(LFE0;)Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->getInjectorKey()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance p2, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->getEnableLogging()Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move v3, v0

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->getPublishableKey()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, v1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object v4, v0

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->getStripeAccountId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, v1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v5, v0

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->getProductUsage()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    :cond_6
    move-object v6, v0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;-><init>(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    invoke-static {p0, p1, p2}, Lcom/stripe/android/core/injection/InjectWithFallbackKt;->injectWithFallback(Lcom/stripe/android/core/injection/Injectable;Ljava/lang/String;Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.stripe.android.core.injection.NonFallbackInjector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/core/injection/NonFallbackInjector;

    invoke-virtual {p2, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->setInjector(Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type T of com.stripe.android.link.LinkActivityViewModel.Factory.create"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public fallbackInitialize(Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;)Lcom/stripe/android/core/injection/Injector;
    .locals 2

    const-string v0, "arg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent;->builder()Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->getEnableLogging()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->enableLogging(Z)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$2;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$2;-><init>(Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->getProductUsage()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->getStarterArgs()Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->starterArgs(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;->inject(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)V

    return-object p1
.end method

.method public bridge synthetic fallbackInitialize(Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;
    .locals 0

    check-cast p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->fallbackInitialize(Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;)Lcom/stripe/android/core/injection/Injector;

    move-result-object p1

    return-object p1
.end method

.method public final getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "viewModel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setViewModel(Lcom/stripe/android/link/LinkActivityViewModel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    return-void
.end method
