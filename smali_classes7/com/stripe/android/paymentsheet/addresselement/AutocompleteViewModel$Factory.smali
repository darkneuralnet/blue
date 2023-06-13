.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;
.implements Lcom/stripe/android/core/injection/NonFallbackInjectable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\'\u0010\u0007\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R(\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;",
        "Landroidx/lifecycle/u$b;",
        "Lcom/stripe/android/core/injection/NonFallbackInjectable;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)LOr6;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
        "Lkotlin/Function0;",
        "Landroid/app/Application;",
        "applicationSupplier",
        "Lkotlin/jvm/functions/Function0;",
        "LY94;",
        "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
        "subComponentBuilderProvider",
        "LY94;",
        "getSubComponentBuilderProvider",
        "()LY94;",
        "setSubComponentBuilderProvider",
        "(LY94;)V",
        "<init>",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lkotlin/jvm/functions/Function0;)V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final applicationSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

.field private final injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

.field public subComponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/injection/NonFallbackInjector;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/NonFallbackInjector;",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    const-string v0, "injector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationSupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->args:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->applicationSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)LOr6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    invoke-interface {p1, p0}, Lcom/stripe/android/core/injection/Injector;->inject(Lcom/stripe/android/core/injection/Injectable;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->getSubComponentBuilderProvider()LY94;

    move-result-object p1

    invoke-interface {p1}, LY94;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->applicationSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->args:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;->configuration(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;->build()Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent;->getAutoCompleteViewModel()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;LFE0;)LOr6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic fallbackInitialize(Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->fallbackInitialize(Lkotlin/Unit;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/injection/Injector;

    return-object p1
.end method

.method public fallbackInitialize(Lkotlin/Unit;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/core/injection/NonFallbackInjectable$DefaultImpls;->fallbackInitialize(Lcom/stripe/android/core/injection/NonFallbackInjectable;Lkotlin/Unit;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public final getSubComponentBuilderProvider()LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->subComponentBuilderProvider:LY94;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "subComponentBuilderProvider"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setSubComponentBuilderProvider(LY94;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->subComponentBuilderProvider:LY94;

    return-void
.end method
