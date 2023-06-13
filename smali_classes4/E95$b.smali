.class public final LE95$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE95;->t(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/MobilePartner;",
        "LAA3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/MobilePartner;",
        "it",
        "LAA3;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/MobilePartner;)LAA3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRiderMapMarkerRemoteOverridesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/RiderMapMarkerRemoteOverridesManager$overrideMedia$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LE95;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LE95;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LE95$b;->g:LE95;

    iput-object p2, p0, LE95$b;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final b(Lkotlin/Lazy;)Lco/bird/android/model/wire/WireAssetMedia;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Lco/bird/android/model/wire/WireAssetMedia;",
            ">;)",
            "Lco/bird/android/model/wire/WireAssetMedia;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireAssetMedia;

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/MobilePartner;)LAA3;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LE95$b$a;

    iget-object v3, v0, LE95$b;->g:LE95;

    invoke-direct {v1, v3}, LE95$b$a;-><init>(LE95;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/MobilePartner;->getAssets()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Lco/bird/android/model/constant/AssetUsage;->RIDER_MAP_ANNOTATION_LOGO_OVERRIDE:Lco/bird/android/model/constant/AssetUsage;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireLegacyAsset;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    invoke-static {v1}, LE95$b;->b(Lkotlin/Lazy;)Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v3

    if-eqz v3, :cond_5

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v4, "RIDER_MAP_ANNOTATION_LOGO_OVERRIDE was missing so defaulted to fallback partner media"

    invoke-static {v4, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireAssetMedia;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaType()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v4, v5, v6, v3}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/MobilePartner;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_4

    :cond_3
    iget-object v2, v0, LE95$b;->g:LE95;

    invoke-static {v2}, LE95;->access$getContext$p(LE95;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->bird:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.getString(L.string.bird)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    new-instance v3, LAA3;

    invoke-direct {v3, v1, v2}, LAA3;-><init>(Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Ljava/lang/String;)V

    return-object v3

    :cond_5
    iget-object v1, v0, LE95$b;->g:LE95;

    iget-object v3, v0, LE95$b;->h:Lco/bird/android/model/wire/WireBird;

    new-instance v4, Ljava/lang/NullPointerException;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/MobilePartner;->getPartnerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "RIDER_MAP_ANNOTATION_LOGO_OVERRIDE media not found for partner id "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " required by bird "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (id="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") when making call to /partner/by-id endpoint"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LE95;->access$getAnalyticsManager$p(LE95;)LEa;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v13

    new-instance v2, LAK2;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "unknown"

    const-string v10, "rider_map_annotation_logo_override"

    const-string v11, "not found"

    const-string v12, "unknown"

    const-wide/16 v14, 0x0

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v17}, LAK2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    throw v4
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/MobilePartner;

    invoke-virtual {p0, p1}, LE95$b;->a(Lco/bird/android/model/MobilePartner;)LAA3;

    move-result-object p1

    return-object p1
.end method
