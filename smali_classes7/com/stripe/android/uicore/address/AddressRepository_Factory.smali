.class public final Lcom/stripe/android/uicore/address/AddressRepository_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final resourcesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private final workContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->resourcesProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->workContextProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lcom/stripe/android/uicore/address/AddressRepository_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/uicore/address/AddressRepository_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/uicore/address/AddressRepository_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/address/AddressRepository_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/res/Resources;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/uicore/address/AddressRepository;
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/address/AddressRepository;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/address/AddressRepository;-><init>(Landroid/content/res/Resources;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/uicore/address/AddressRepository;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->resourcesProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->workContextProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->newInstance(Landroid/content/res/Resources;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/uicore/address/AddressRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->get()Lcom/stripe/android/uicore/address/AddressRepository;

    move-result-object v0

    return-object v0
.end method
