.class public final Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$FormControllerSubcomponentBuilder;,
        Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;,
        Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .locals 2

    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$Builder;-><init>(LFL0;)V

    return-object v0
.end method
