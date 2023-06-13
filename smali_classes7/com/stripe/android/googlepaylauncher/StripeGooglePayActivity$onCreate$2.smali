.class final Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onCreate$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "googlePayResult",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeGooglePayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeGooglePayActivity.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n1#2:232\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onCreate$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onCreate$2;->invoke(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onCreate$2;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    invoke-static {v0, p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$finishWithResult(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;)V

    :cond_0
    return-void
.end method
