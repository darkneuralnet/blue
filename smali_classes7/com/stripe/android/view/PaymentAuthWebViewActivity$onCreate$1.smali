.class final Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentAuthWebViewActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LVe3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LVe3;",
        "",
        "invoke",
        "(LVe3;)V",
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
.field final synthetic this$0:Lcom/stripe/android/view/PaymentAuthWebViewActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;->this$0:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LVe3;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;->invoke(LVe3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LVe3;)V
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;->this$0:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->access$getViewBinding(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;->this$0:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->access$getViewBinding(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;->this$0:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->access$cancelIntentSource(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    :goto_0
    return-void
.end method
