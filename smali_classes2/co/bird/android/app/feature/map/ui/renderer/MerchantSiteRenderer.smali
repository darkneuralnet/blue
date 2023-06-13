.class public final Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapModelRenderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer<",
        "Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer;",
        "Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;",
        "Lco/bird/android/model/wire/WireMerchantSite$Icon;",
        "kind",
        "",
        "getDrawableFor",
        "merchantRenderItem",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "getMarkerOptions",
        "LfM2;",
        "getOrCreateMarker",
        "",
        "models",
        "",
        "render",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "LcD1;",
        "map",
        "LcD1;",
        "",
        "",
        "markers",
        "Ljava/util/Map;",
        "LPT;",
        "bitmapDescriptors",
        "<init>",
        "(Landroid/content/Context;LcD1;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMerchantSiteRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantSiteRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n361#2,7:76\n361#2,7:83\n1855#3,2:90\n1855#3:92\n1856#3:94\n1#4:93\n*S KotlinDebug\n*F\n+ 1 MerchantSiteRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer\n*L\n50#1:76,7\n58#1:83,7\n63#1:90,2\n69#1:92\n69#1:94\n*E\n"
    }
.end annotation


# instance fields
.field private final bitmapDescriptors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final map:LcD1;

.field private final markers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LcD1;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->context:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->map:LcD1;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->markers:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->bitmapDescriptors:Ljava/util/Map;

    return-void
.end method

.method private final getDrawableFor(Lco/bird/android/model/wire/WireMerchantSite$Icon;)I
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    sget p1, Lrg4;->pin_store:I

    goto :goto_0

    :cond_0
    sget p1, Lrg4;->pin_food_truck:I

    goto :goto_0

    :cond_1
    sget p1, Lrg4;->pin_food_truck:I

    goto :goto_0

    :cond_2
    sget p1, Lrg4;->pin_cart:I

    :goto_0
    return p1
.end method

.method private final getMarkerOptions(Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 11

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireMerchantSite;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireMerchantSite;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getPinVisibility()Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    move-result-object v1

    sget-object v2, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->PIN_WITH_NAMES:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    if-ne v1, v2, :cond_0

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->context:Landroid/content/Context;

    sget v4, Lmk4;->view_info_window_title:I

    sget v5, Lzi4;->titleContainer:I

    sget v6, Lzi4;->title:I

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantDescription;->getName()Ljava/lang/String;

    move-result-object v7

    sget v8, Lzi4;->icon:I

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantSite;->getIcon()Lco/bird/android/model/wire/WireMerchantSite$Icon;

    move-result-object v1

    invoke-direct {p0, v1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->getDrawableFor(Lco/bird/android/model/wire/WireMerchantSite$Icon;)I

    move-result v9

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getPinSize()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static/range {v3 .. v10}, LfB0;->s(Landroid/content/Context;IIILjava/lang/String;IILjava/lang/Double;)LPT;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->bitmapDescriptors:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireMerchantSite;->getIcon()Lco/bird/android/model/wire/WireMerchantSite$Icon;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v4, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getIcon()Lco/bird/android/model/wire/WireMerchantSite$Icon;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->getDrawableFor(Lco/bird/android/model/wire/WireMerchantSite$Icon;)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    move-object p1, v3

    check-cast p1, LPT;

    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const/high16 v0, 0x42cc0000    # 102.0f

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const-string v0, "MarkerOptions()\n    .pos\u2026_MERCHANT_MARKER_Z_INDEX)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getOrCreateMarker(Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;)LfM2;
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->markers:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMarkerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->map:LcD1;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->getMarkerOptions(Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {v2, p1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, LfM2;

    return-object v2
.end method


# virtual methods
.method public render(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "models"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    invoke-direct {p0, v1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->getOrCreateMarker(Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;)LfM2;

    move-result-object v3

    invoke-virtual {v3, v1}, LfM2;->p(Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, LfM2;->r(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->markers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    invoke-virtual {v5}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->getMarkerId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    const/4 v3, 0x0

    if-eqz v4, :cond_4

    move v4, v2

    goto :goto_3

    :cond_4
    move v4, v3

    :goto_3
    if-nez v4, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LfM2;

    invoke-virtual {v1, v3}, LfM2;->r(Z)V

    goto :goto_1

    :cond_5
    return-void
.end method
