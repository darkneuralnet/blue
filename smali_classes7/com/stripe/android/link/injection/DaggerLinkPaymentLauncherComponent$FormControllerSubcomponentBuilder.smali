.class final Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FormControllerSubcomponentBuilder"
.end annotation


# instance fields
.field private formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

.field private initialValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final linkComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

.field private final linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

.field private merchantName:Ljava/lang/String;

.field private shippingValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private viewModelScope:LZC0;

.field private viewOnlyFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->linkComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;LyL0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->initialValues:Ljava/util/Map;

    const-class v1, Ljava/util/Map;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewOnlyFields:Ljava/util/Set;

    const-class v1, Ljava/util/Set;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewModelScope:LZC0;

    const-class v1, LZC0;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->merchantName:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentImpl;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->linkComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->initialValues:Ljava/util/Map;

    iget-object v7, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->shippingValues:Ljava/util/Map;

    iget-object v8, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewOnlyFields:Ljava/util/Set;

    iget-object v9, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewModelScope:LZC0;

    iget-object v10, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v11, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->merchantName:Ljava/lang/String;

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;Lcom/stripe/android/ui/core/elements/LayoutSpec;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;LZC0;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;LzL0;)V

    return-object v0
.end method

.method public formSpec(Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-object p0
.end method

.method public bridge synthetic formSpec(Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->formSpec(Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public initialValues(Ljava/util/Map;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->initialValues:Ljava/util/Map;

    return-object p0
.end method

.method public bridge synthetic initialValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->initialValues(Ljava/util/Map;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public merchantName(Ljava/lang/String;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->merchantName:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic merchantName(Ljava/lang/String;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->merchantName(Ljava/lang/String;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public shippingValues(Ljava/util/Map;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->shippingValues:Ljava/util/Map;

    return-object p0
.end method

.method public bridge synthetic shippingValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->shippingValues(Ljava/util/Map;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public stripeIntent(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object p0
.end method

.method public bridge synthetic stripeIntent(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->stripeIntent(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public viewModelScope(LZC0;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZC0;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewModelScope:LZC0;

    return-object p0
.end method

.method public bridge synthetic viewModelScope(LZC0;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewModelScope(LZC0;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public viewOnlyFields(Ljava/util/Set;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewOnlyFields:Ljava/util/Set;

    return-object p0
.end method

.method public bridge synthetic viewOnlyFields(Ljava/util/Set;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;->viewOnlyFields(Ljava/util/Set;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method
