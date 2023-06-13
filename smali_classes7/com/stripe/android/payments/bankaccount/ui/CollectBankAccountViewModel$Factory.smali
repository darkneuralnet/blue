.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ/\u0010\u0008\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;",
        "Landroidx/lifecycle/u$b;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "LFE0;",
        "extras",
        "create",
        "(Ljava/lang/Class;LFE0;)LOr6;",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "argsSupplier",
        "Lkotlin/jvm/functions/Function0;",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final argsSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;)V"
        }
    .end annotation

    const-string v0, "argsSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;->argsSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public bridge synthetic create(Ljava/lang/Class;)LOr6;
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;)LOr6;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LFE0;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/stripe/android/utils/CreationExtrasKtxKt;->requireApplication(LFE0;)Landroid/app/Application;

    move-result-object p1

    invoke-static {p2}, Landroidx/lifecycle/q;->a(LFE0;)Landroidx/lifecycle/p;

    move-result-object p2

    invoke-static {}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent;->builder()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;->savedStateHandle(Landroidx/lifecycle/p;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p2, v0, p2}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;->viewEffect(LBX2;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;->argsSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-interface {p1, p2}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;->configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;->build()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;->getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
