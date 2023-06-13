.class final Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/lifecycle/u$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/u$b;",
        "invoke",
        "()Landroidx/lifecycle/u$b;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/u$b;
    .locals 5

    new-instance v0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$Factory;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    invoke-static {v2}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$getPublishableKey(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    invoke-static {v3}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$getStripeAccountId(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    invoke-static {v4}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$getArgs$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v4, "args"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_0
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$Factory;-><init>(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$viewModel$2;->invoke()Landroidx/lifecycle/u$b;

    move-result-object v0

    return-object v0
.end method
