.class public final Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000c2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        "context",
        "Landroid/content/Context;",
        "googlePlacesApiKey",
        "",
        "isPlacesAvailable",
        "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
        "clientFactory",
        "Lkotlin/Function1;",
        "Lcom/google/android/libraries/places/api/net/PlacesClient;",
        "initializer",
        "Lkotlin/Function0;",
        "",
        "getPlacesPoweredByGoogleDrawable",
        "",
        "isSystemDarkTheme",
        "",
        "(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->$$INSTANCE:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    new-instance p3, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    new-instance p4, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$create$1;

    invoke-direct {p4, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$create$1;-><init>(Landroid/content/Context;)V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    new-instance p5, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$create$2;

    invoke-direct {p5, p1, p2}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$create$2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPlacesPoweredByGoogleDrawable$default(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;ILjava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {p2}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->getPlacesPoweredByGoogleDrawable(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Lcom/google/android/libraries/places/api/net/PlacesClient;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePlacesApiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "isPlacesAvailable"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "clientFactory"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "initializer"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    new-instance p2, Lcom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy;

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/api/net/PlacesClient;

    invoke-direct {p2, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy;-><init>(Lcom/google/android/libraries/places/api/net/PlacesClient;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/stripe/android/ui/core/elements/autocomplete/UnsupportedPlacesClientProxy;

    invoke-direct {p2}, Lcom/stripe/android/ui/core/elements/autocomplete/UnsupportedPlacesClientProxy;-><init>()V

    :goto_0
    return-object p2
.end method

.method public final getPlacesPoweredByGoogleDrawable(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "isPlacesAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    sget p1, Lcom/stripe/android/ui/core/R$drawable;->places_powered_by_google_dark:I

    goto :goto_0

    :cond_0
    sget p1, Lcom/stripe/android/ui/core/R$drawable;->places_powered_by_google_light:I

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method
