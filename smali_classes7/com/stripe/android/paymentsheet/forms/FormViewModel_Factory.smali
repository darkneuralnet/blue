.class public final Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/forms/FormViewModel;",
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

.field private final formArgumentsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            ">;"
        }
    .end annotation
.end field

.field private final lpmRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final showCheckboxFlowProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ">;",
            "LY94<",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->contextProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->formArgumentsProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->lpmRepositoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->addressRepositoryProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->showCheckboxFlowProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ">;",
            "LY94<",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)Lcom/stripe/android/paymentsheet/forms/FormViewModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/forms/FormViewModel;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;-><init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/forms/FormViewModel;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->formArgumentsProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->lpmRepositoryProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->addressRepositoryProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/uicore/address/AddressRepository;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->showCheckboxFlowProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LEu1;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->newInstance(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    move-result-object v0

    return-object v0
.end method
