.class final Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FormControllerSubcomponentImpl"
.end annotation


# instance fields
.field private final formControllerSubcomponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;

.field private final formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

.field private final initialValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

.field private final merchantName:Ljava/lang/String;

.field private final shippingValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private final viewOnlyFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;Lcom/stripe/android/ui/core/elements/LayoutSpec;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;LZC0;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;",
            "Lcom/stripe/android/ui/core/elements/LayoutSpec;",
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
            ">;",
            "LZC0;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->formControllerSubcomponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iput-object p8, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->merchantName:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->initialValues:Ljava/util/Map;

    iput-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->shippingValues:Ljava/util/Map;

    iput-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->viewOnlyFields:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;Lcom/stripe/android/ui/core/elements/LayoutSpec;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;LZC0;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;LHL0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;Lcom/stripe/android/ui/core/elements/LayoutSpec;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;LZC0;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V

    return-void
.end method

.method private transformSpecToElements()Lcom/stripe/android/ui/core/forms/TransformSpecToElements;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->a(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;

    move-result-object v0

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/address/AddressRepository;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->d(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->merchantName:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->initialValues:Ljava/util/Map;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->shippingValues:Ljava/util/Map;

    iget-object v7, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->viewOnlyFields:Ljava/util/Set;

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/ui/core/injection/FormControllerModule_ProvideTransformSpecToElementsFactory;->provideTransformSpecToElements(Lcom/stripe/android/uicore/address/AddressRepository;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getFormController()Lcom/stripe/android/ui/core/FormController;
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/FormController;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;->transformSpecToElements()Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/FormController;-><init>(Lcom/stripe/android/ui/core/elements/LayoutSpec;Lcom/stripe/android/ui/core/forms/TransformSpecToElements;)V

    return-object v0
.end method
