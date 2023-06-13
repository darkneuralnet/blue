.class public final Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final resourcesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;->resourcesProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static providesLpmRepository(Landroid/content/res/Resources;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;->INSTANCE:Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;

    invoke-virtual {v0, p0}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;->providesLpmRepository(Landroid/content/res/Resources;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;->resourcesProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    invoke-static {v0}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;->providesLpmRepository(Landroid/content/res/Resources;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvidesLpmRepositoryFactory;->get()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object v0

    return-object v0
.end method
