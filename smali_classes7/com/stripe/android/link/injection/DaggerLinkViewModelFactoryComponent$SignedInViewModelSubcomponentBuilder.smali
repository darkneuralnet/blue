.class final Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SignedInViewModelSubcomponentBuilder"
.end annotation


# instance fields
.field private linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field private final linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;LJL0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;-><init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    const-class v1, Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentImpl;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;Lcom/stripe/android/link/model/LinkAccount;LKL0;)V

    return-object v0
.end method

.method public linkAccount(Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    return-object p0
.end method

.method public bridge synthetic linkAccount(Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;->linkAccount(Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$SignedInViewModelSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method
