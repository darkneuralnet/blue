.class final Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/link/injection/LinkComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkComponentBuilder"
.end annotation


# instance fields
.field private final linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

.field private starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;LAL0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/link/injection/LinkComponent;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    const-class v1, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/LinkActivityContract$Args;LBL0;)V

    return-object v0
.end method

.method public starterArgs(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object p0
.end method

.method public bridge synthetic starterArgs(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/injection/LinkComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;->starterArgs(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;

    move-result-object p1

    return-object p1
.end method
