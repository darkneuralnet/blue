.class public final Lcom/google/android/gms/location/places/internal/zzar;
.super Lcom/google/android/gms/location/places/internal/zzaw;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/location/places/Place;


# instance fields
.field private final placeId:Ljava/lang/String;

.field private final zzcf:Lcom/google/android/gms/location/places/internal/zzai;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 6

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/zzaw;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    const-string p1, "place_id"

    const-string p2, ""

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/zzar;->placeId:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPlaceTypes()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPhoneNumber()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPhoneNumber()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-gtz p1, :cond_3

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getWebsiteUri()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getWebsiteUri()Landroid/net/Uri;

    move-result-object p1

    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getRating()F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-gez p1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPriceLevel()I

    move-result p1

    if-ltz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const/4 p2, 0x0

    if-eqz p1, :cond_5

    new-instance p1, Lcom/google/android/gms/location/places/internal/zzai;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPlaceTypes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPhoneNumber()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPhoneNumber()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_4
    move-object v2, p2

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getWebsiteUri()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getRating()F

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPriceLevel()I

    move-result v5

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/zzai;-><init>(Ljava/util/List;Ljava/lang/String;Landroid/net/Uri;FI)V

    move-object p2, p1

    :cond_5
    iput-object p2, p0, Lcom/google/android/gms/location/places/internal/zzar;->zzcf:Lcom/google/android/gms/location/places/internal/zzai;

    return-void
.end method

.method private final zzl()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "place_attributions"

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzc(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic freeze()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getAddress()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzd(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzar;->zzl()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzd(Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    const-string v1, "place_is_permanently_closed"

    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/data/DataBufferRef;->hasColumn(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/data/DataBufferRef;->hasNull(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/data/DataBufferRef;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Z)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    const-string v1, "place_level_number"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(F)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzc(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPhoneNumber()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zze(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPriceLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzc(I)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getRating()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzc(F)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getPlaceTypes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzc(Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getViewport()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getWebsiteUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Landroid/net/Uri;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    const-string v1, "place_opening_hours"

    sget-object v2, Lcom/google/android/gms/location/places/internal/zzal;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/places/internal/zzal;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Lcom/google/android/gms/location/places/internal/zzal;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/zzar;->zzcf:Lcom/google/android/gms/location/places/internal/zzai;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzb(Lcom/google/android/gms/location/places/internal/zzai;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    const-string v1, "place_adr_address"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzf(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/location/places/internal/PlaceEntity$zzb;->zzj()Lcom/google/android/gms/location/places/internal/PlaceEntity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzar;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity;->setLocale(Ljava/util/Locale;)V

    return-object v0
.end method

.method public final getAddress()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "place_address"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getAttributions()Ljava/lang/CharSequence;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzar;->zzl()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/location/places/internal/zzi;->zzc(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/zzar;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatLng()Lcom/google/android/gms/maps/model/LatLng;
    .locals 2

    const-string v0, "place_lat_lng"

    sget-object v1, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 3

    const-string v0, "place_locale_language"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "place_locale_country"

    invoke-virtual {p0, v2, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/Locale;

    invoke-direct {v2, v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const-string v0, "place_locale"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/Locale;

    invoke-direct {v1, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "place_name"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPhoneNumber()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "place_phone_number"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPlaceTypes()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "place_types"

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getPriceLevel()I
    .locals 2

    const-string v0, "place_price_level"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzc(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getRating()F
    .locals 2

    const-string v0, "place_rating"

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public final getViewport()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 2

    const-string v0, "place_viewport"

    sget-object v1, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object v0
.end method

.method public final getWebsiteUri()Landroid/net/Uri;
    .locals 2

    const-string v0, "place_website_uri"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzaw;->zzb(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
