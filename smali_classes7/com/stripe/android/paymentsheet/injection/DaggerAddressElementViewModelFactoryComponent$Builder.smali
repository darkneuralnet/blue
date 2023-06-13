.class final Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LzG0;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->context:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    const-class v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    new-instance v5, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    invoke-direct {v5}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;-><init>()V

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->context:Landroid/content/Context;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;LwG0;)V

    return-object v0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic starterArgs(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->starterArgs(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public starterArgs(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;->starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    return-object p0
.end method
