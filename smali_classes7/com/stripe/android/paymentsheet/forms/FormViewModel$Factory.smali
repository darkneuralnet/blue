.class public final Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;
.implements Lcom/stripe/android/core/injection/NonFallbackInjectable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/forms/FormViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001f\u0010 J\'\u0010\u0007\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R(\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;",
        "Landroidx/lifecycle/u$b;",
        "Lcom/stripe/android/core/injection/NonFallbackInjectable;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)LOr6;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "config",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "getConfig",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "LEu1;",
        "",
        "showCheckboxFlow",
        "LEu1;",
        "getShowCheckboxFlow",
        "()LEu1;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "LY94;",
        "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;",
        "subComponentBuilderProvider",
        "LY94;",
        "getSubComponentBuilderProvider",
        "()LY94;",
        "setSubComponentBuilderProvider",
        "(LY94;)V",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;)V",
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
.field private final config:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field private final injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

.field private final showCheckboxFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public subComponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/core/injection/NonFallbackInjector;",
            ")V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showCheckboxFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "injector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->config:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->showCheckboxFlow:LEu1;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

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

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    invoke-interface {p1, p0}, Lcom/stripe/android/core/injection/Injector;->inject(Lcom/stripe/android/core/injection/Injectable;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->getSubComponentBuilderProvider()LY94;

    move-result-object p1

    invoke-interface {p1}, LY94;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->config:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;->formArguments(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->showCheckboxFlow:LEu1;

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;->showCheckboxFlow(LEu1;)Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;->build()Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;->getViewModel()Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.forms.FormViewModel.Factory.create"

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

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->fallbackInitialize(Lkotlin/Unit;)Ljava/lang/Void;

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

.method public final getConfig()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->config:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object v0
.end method

.method public final getShowCheckboxFlow()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->showCheckboxFlow:LEu1;

    return-object v0
.end method

.method public final getSubComponentBuilderProvider()LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->subComponentBuilderProvider:LY94;

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
            "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;->subComponentBuilderProvider:LY94;

    return-void
.end method
