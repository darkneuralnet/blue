.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\"\u0010\u0008\u001a\u00020\u00078\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        "LOr6;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "navigator",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "getNavigator",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "getInjector",
        "()Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "setInjector",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;)V",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

.field private final navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    return-void
.end method


# virtual methods
.method public final getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "injector"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getNavigator()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    return-object v0
.end method

.method public final setInjector(Lcom/stripe/android/core/injection/NonFallbackInjector;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    return-void
.end method
