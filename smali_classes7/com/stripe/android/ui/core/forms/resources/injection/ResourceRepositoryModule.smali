.class public final Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;",
        "",
        "()V",
        "provideResources",
        "Landroid/content/res/Resources;",
        "context",
        "Landroid/content/Context;",
        "providesLpmRepository",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "resources",
        "payments-ui-core_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;->INSTANCE:Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideResources(Landroid/content/Context;)Landroid/content/res/Resources;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const-string v0, "context.resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final providesLpmRepository(Landroid/content/res/Resources;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->Companion:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;

    new-instance v1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, p1, v2, v3, v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;-><init>(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;->getInstance(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object p1

    return-object p1
.end method
