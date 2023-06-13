.class public final LE95$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE95$b;->a(Lco/bird/android/model/MobilePartner;)LAA3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/model/wire/WireAssetMedia;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireAssetMedia;",
        "b",
        "()Lco/bird/android/model/wire/WireAssetMedia;"
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
        "SMAP\nRiderMapMarkerRemoteOverridesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/RiderMapMarkerRemoteOverridesManager$overrideMedia$1$fallbackPartnerAssetMedia$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n288#2,2:105\n*S KotlinDebug\n*F\n+ 1 RiderMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/RiderMapMarkerRemoteOverridesManager$overrideMedia$1$fallbackPartnerAssetMedia$2\n*L\n62#1:105,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LE95;


# direct methods
.method public constructor <init>(LE95;)V
    .locals 0

    iput-object p1, p0, LE95$b$a;->g:LE95;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lco/bird/android/model/wire/WireAssetMedia;
    .locals 5

    iget-object v0, p0, LE95$b$a;->g:LE95;

    invoke-static {v0}, LE95;->access$getPartnerManager$p(LE95;)LGI3;

    move-result-object v0

    invoke-interface {v0}, LGI3;->o1()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/PartnerUser;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/PartnerUser;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "11111111-1111-1111-1111-111111111111"

    :cond_1
    iget-object v1, p0, LE95$b$a;->g:LE95;

    invoke-static {v1}, LE95;->access$getPartnerManager$p(LE95;)LGI3;

    move-result-object v1

    invoke-interface {v1}, LGI3;->A()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/MobilePartner;

    const/4 v1, 0x0

    if-nez v0, :cond_7

    iget-object v0, p0, LE95$b$a;->g:LE95;

    invoke-static {v0}, LE95;->access$getPartnerManager$p(LE95;)LGI3;

    move-result-object v0

    invoke-interface {v0}, LGI3;->A()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/MobilePartner;

    invoke-virtual {v3}, Lco/bird/android/model/MobilePartner;->getAssets()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_3

    sget-object v4, Lco/bird/android/model/constant/AssetUsage;->RIDER_MAP_ANNOTATION_LOGO_OVERRIDE:Lco/bird/android/model/constant/AssetUsage;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireLegacyAsset;

    goto :goto_0

    :cond_3
    move-object v3, v1

    :goto_0
    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    goto :goto_2

    :cond_5
    move-object v2, v1

    :goto_2
    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/MobilePartner;

    goto :goto_3

    :cond_6
    move-object v0, v1

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lco/bird/android/model/MobilePartner;->getAssets()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v2, Lco/bird/android/model/constant/AssetUsage;->RIDER_MAP_ANNOTATION_LOGO_OVERRIDE:Lco/bird/android/model/constant/AssetUsage;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireLegacyAsset;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v1

    :cond_8
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE95$b$a;->b()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v0

    return-object v0
.end method
