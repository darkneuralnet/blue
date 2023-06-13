.class final Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

.field private savedStateHandle:Landroidx/lifecycle/p;

.field private viewEffect:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LMH0;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public build()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect:LBX2;

    const-class v1, LBX2;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle:Landroidx/lifecycle/p;

    const-class v1, Landroidx/lifecycle/p;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    const-class v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v5, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application:Landroid/app/Application;

    iget-object v6, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect:LBX2;

    iget-object v7, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle:Landroidx/lifecycle/p;

    iget-object v8, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;LBX2;Landroidx/lifecycle/p;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LNH0;)V

    return-object v0
.end method

.method public bridge synthetic configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    return-object p0
.end method

.method public bridge synthetic savedStateHandle(Landroidx/lifecycle/p;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle(Landroidx/lifecycle/p;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public savedStateHandle(Landroidx/lifecycle/p;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/p;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle:Landroidx/lifecycle/p;

    return-object p0
.end method

.method public bridge synthetic viewEffect(LBX2;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect(LBX2;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public viewEffect(LBX2;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBX2;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect:LBX2;

    return-object p0
.end method
