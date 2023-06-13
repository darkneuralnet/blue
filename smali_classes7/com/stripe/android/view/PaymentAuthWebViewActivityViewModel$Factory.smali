.class public final Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0006\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;",
        "Landroidx/lifecycle/u$b;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)LOr6;",
        "Landroid/app/Application;",
        "application",
        "Landroid/app/Application;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "args",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "<init>",
        "(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private final args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

.field private final logger:Lcom/stripe/android/core/Logger;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->application:Landroid/app/Application;

    iput-object p2, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->logger:Lcom/stripe/android/core/Logger;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)LOr6;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    new-instance v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    iget-object v2, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->logger:Lcom/stripe/android/core/Logger;

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    new-instance v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v3, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->application:Landroid/app/Application;

    iget-object v4, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    invoke-virtual {v4}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    const-string v5, "PaymentAuthWebViewActivity"

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V

    invoke-direct {p1, v0, v1, v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;-><init>(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V

    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;LFE0;)LOr6;

    move-result-object p1

    return-object p1
.end method
