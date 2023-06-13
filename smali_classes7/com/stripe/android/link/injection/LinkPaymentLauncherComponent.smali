.class public abstract Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/link/injection/LinkCommonModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008!\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001bH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;",
        "",
        "()V",
        "configuration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "getConfiguration",
        "()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "injector",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "getInjector",
        "()Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "getLinkAccountManager",
        "()Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkComponentBuilder",
        "Lcom/stripe/android/link/injection/LinkComponent$Builder;",
        "getLinkComponentBuilder",
        "()Lcom/stripe/android/link/injection/LinkComponent$Builder;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "getLinkEventsReporter",
        "()Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "inject",
        "",
        "factory",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;",
        "Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;",
        "Builder",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final injector:Lcom/stripe/android/core/injection/NonFallbackInjector;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$injector$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$injector$1;-><init>(Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;)V

    iput-object v0, p0, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    return-void
.end method


# virtual methods
.method public abstract getConfiguration()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
.end method

.method public final getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    return-object v0
.end method

.method public abstract getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;
.end method

.method public abstract getLinkComponentBuilder()Lcom/stripe/android/link/injection/LinkComponent$Builder;
.end method

.method public abstract getLinkEventsReporter()Lcom/stripe/android/link/analytics/LinkEventsReporter;
.end method

.method public abstract inject(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;)V
.end method

.method public abstract inject(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)V
.end method
