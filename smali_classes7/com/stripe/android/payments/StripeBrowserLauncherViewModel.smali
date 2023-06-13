.class public final Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Companion;,
        Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0000\u0018\u0000 $2\u00020\u0001:\u0002$%B/\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00078F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;",
        "LOr6;",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "args",
        "Landroid/content/Intent;",
        "createLaunchIntent",
        "getResultIntent",
        "",
        "shouldUseCustomTabs",
        "",
        "logCapabilities",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "Lcom/stripe/android/core/browser/BrowserCapabilities;",
        "browserCapabilities",
        "Lcom/stripe/android/core/browser/BrowserCapabilities;",
        "",
        "intentChooserTitle",
        "Ljava/lang/String;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "<set-?>",
        "hasLaunched$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "hasLaunched",
        "<init>",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/browser/BrowserCapabilities;Ljava/lang/String;Landroidx/lifecycle/p;)V",
        "Companion",
        "Factory",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeBrowserLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBrowserLauncherViewModel.kt\ncom/stripe/android/payments/StripeBrowserLauncherViewModel\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,128:1\n33#2,3:129\n*S KotlinDebug\n*F\n+ 1 StripeBrowserLauncherViewModel.kt\ncom/stripe/android/payments/StripeBrowserLauncherViewModel\n*L\n32#1:129,3\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Companion;

.field public static final KEY_HAS_LAUNCHED:Ljava/lang/String; = "has_launched"


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final browserCapabilities:Lcom/stripe/android/core/browser/BrowserCapabilities;

.field private final hasLaunched$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final intentChooserTitle:Ljava/lang/String;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final savedStateHandle:Landroidx/lifecycle/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "hasLaunched"

    const-string v3, "getHasLaunched()Z"

    const-class v4, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->Companion:Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/browser/BrowserCapabilities;Ljava/lang/String;Landroidx/lifecycle/p;)V
    .locals 1

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "browserCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentChooserTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p3, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->browserCapabilities:Lcom/stripe/android/core/browser/BrowserCapabilities;

    iput-object p4, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->intentChooserTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    const-string p1, "has_launched"

    invoke-virtual {p5, p1}, Landroidx/lifecycle/p;->e(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$special$$inlined$observable$1;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;)V

    iput-object p2, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->hasLaunched$delegate:Lkotlin/properties/ReadWriteProperty;

    return-void
.end method

.method public static final synthetic access$getSavedStateHandle$p(Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;)Landroidx/lifecycle/p;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    return-object p0
.end method


# virtual methods
.method public final createLaunchIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;
    .locals 3

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->browserCapabilities:Lcom/stripe/android/core/browser/BrowserCapabilities;

    sget-object v1, Lcom/stripe/android/core/browser/BrowserCapabilities;->CustomTabs:Lcom/stripe/android/core/browser/BrowserCapabilities;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->logCapabilities(Z)V

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, LrF0$a;

    invoke-direct {v0}, LrF0$a;-><init>()V

    invoke-virtual {v0, p1}, LrF0$a;->b(I)LrF0$a;

    move-result-object p1

    invoke-virtual {p1}, LrF0$a;->a()LrF0;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    new-instance v0, LwF0$b;

    invoke-direct {v0}, LwF0$b;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, LwF0$b;->f(I)LwF0$b;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, LwF0$b;->c(LrF0;)LwF0$b;

    :cond_2
    invoke-virtual {v0}, LwF0$b;->a()LwF0;

    move-result-object p1

    const-string v0, "Builder()\n              \u2026\n                .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, LwF0;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p1, LwF0;->a:Landroid/content/Intent;

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->intentChooserTitle:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "{\n            val custom\u2026e\n            )\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->intentChooserTitle:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "{\n            // use def\u2026e\n            )\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p1
.end method

.method public final getHasLaunched()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->hasLaunched$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getResultIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;
    .locals 12

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v7, v0

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getShouldCancelSource()Z

    move-result v6

    new-instance p1, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/16 v10, 0x26

    const/4 v11, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "Intent().putExtras(\n    \u2026   ).toBundle()\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final logCapabilities(Z)V
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_0

    :goto_1
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final setHasLaunched(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->hasLaunched$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method
