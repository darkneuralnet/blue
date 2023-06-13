.class public final Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$SignedInViewModelSubcomponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$FormControllerSubcomponentBuilder;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$SignedInViewModelSubcomponentBuilder;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;,
        Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 2

    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;-><init>(LxL0;)V

    return-object v0
.end method
