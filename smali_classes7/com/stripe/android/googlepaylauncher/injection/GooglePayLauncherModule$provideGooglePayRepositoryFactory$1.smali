.class final Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$provideGooglePayRepositoryFactory$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;->provideGooglePayRepositoryFactory(Landroid/content/Context;Lcom/stripe/android/core/Logger;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;",
        "environment",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
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


# instance fields
.field final synthetic $appContext:Landroid/content/Context;

.field final synthetic $logger:Lcom/stripe/android/core/Logger;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$provideGooglePayRepositoryFactory$1;->$appContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$provideGooglePayRepositoryFactory$1;->$logger:Lcom/stripe/android/core/Logger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;
    .locals 10

    const-string v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$provideGooglePayRepositoryFactory$1;->$appContext:Landroid/content/Context;

    new-instance v9, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;-><init>(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x1

    const/4 v6, 0x1

    iget-object v7, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$provideGooglePayRepositoryFactory$1;->$logger:Lcom/stripe/android/core/Logger;

    move-object v1, v0

    move-object v3, p1

    move-object v4, v9

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$provideGooglePayRepositoryFactory$1;->invoke(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    move-result-object p1

    return-object p1
.end method
