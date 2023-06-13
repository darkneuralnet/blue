.class public final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment;
.super Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment;",
        "Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;",
        "()V",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrimaryButtonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,95:1\n172#2,9:96\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment\n*L\n77#1:96,9\n*E\n"
    }
.end annotation


# instance fields
.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;-><init>()V

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$viewModel$2;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$viewModel$2;

    const-class v1, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$2;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    if-nez v0, :cond_0

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    invoke-static {p0, v1, v2, v3, v0}, LGy1;->b(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public getViewModel()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    move-result-object v0

    return-object v0
.end method
