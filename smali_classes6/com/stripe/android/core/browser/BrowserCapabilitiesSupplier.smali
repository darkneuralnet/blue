.class public final Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;,
        Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "get",
        "Lcom/stripe/android/core/browser/BrowserCapabilities;",
        "isCustomTabsSupported",
        "",
        "Companion",
        "NoopCustomTabsServiceConnection",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CHROME_PACKAGE:Ljava/lang/String; = "com.android.chrome"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;->Companion:Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;->context:Landroid/content/Context;

    return-void
.end method

.method private final isCustomTabsSupported()Z
    .locals 3

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;->context:Landroid/content/Context;

    const-string v1, "com.android.chrome"

    new-instance v2, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;

    invoke-direct {v2}, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;-><init>()V

    invoke-static {v0, v1, v2}, LvF0;->a(Landroid/content/Context;Ljava/lang/String;LyF0;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final get()Lcom/stripe/android/core/browser/BrowserCapabilities;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;->isCustomTabsSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/core/browser/BrowserCapabilities;->CustomTabs:Lcom/stripe/android/core/browser/BrowserCapabilities;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/core/browser/BrowserCapabilities;->Unknown:Lcom/stripe/android/core/browser/BrowserCapabilities;

    :goto_0
    return-object v0
.end method
