.class public final Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/ui/core/forms/TransformSpecToElements;",
        ">;"
    }
.end annotation


# instance fields
.field private final addressRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final initialValuesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final merchantNameProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shippingValuesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final stripeIntentProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final viewOnlyFieldsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;",
            "LY94<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->addressRepositoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->contextProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->merchantNameProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->stripeIntentProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->initialValuesProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->shippingValuesProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->viewOnlyFieldsProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;",
            "LY94<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;)",
            "Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;"
        }
    .end annotation

    new-instance v8, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static provideTransformSpecToElements(Lcom/stripe/android/uicore/address/AddressRepository;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lcom/stripe/android/ui/core/forms/TransformSpecToElements;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/ui/core/forms/TransformSpecToElements;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/ui/core/injection/FormControllerModule;->INSTANCE:Lcom/stripe/android/ui/core/injection/FormControllerModule;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/stripe/android/ui/core/injection/FormControllerModule;->provideTransformSpecToElements(Lcom/stripe/android/uicore/address/AddressRepository;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/ui/core/forms/TransformSpecToElements;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->addressRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/address/AddressRepository;

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->merchantNameProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->stripeIntentProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->initialValuesProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->shippingValuesProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    iget-object v0, p0, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->viewOnlyFieldsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Set;

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->provideTransformSpecToElements(Lcom/stripe/android/uicore/address/AddressRepository;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->get()Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    move-result-object v0

    return-object v0
.end method
