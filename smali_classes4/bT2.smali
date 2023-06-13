.class public final LbT2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J-\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "LbT2;",
        "",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "merchantSite",
        "",
        "",
        "offerDealIds",
        "",
        "offerRedeemed",
        "a",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "b",
        "()Lco/bird/android/model/wire/WireMerchantSite;",
        "Ljava/util/List;",
        "getOfferDealIds",
        "()Ljava/util/List;",
        "Z",
        "getOfferRedeemed",
        "()Z",
        "<init>",
        "(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)V",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final merchantSite:Lco/bird/android/model/wire/WireMerchantSite;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "merchant_site"
    .end annotation

    .annotation runtime Lft5;
        value = "merchant_site"
    .end annotation
.end field

.field private final offerDealIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "redeemed_offer_deal_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "redeemed_offer_deal_ids"
    .end annotation
.end field

.field private final offerRedeemed:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "offer_redeemed"
    .end annotation

    .annotation runtime Lft5;
        value = "offer_redeemed"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "merchantSite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerDealIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    iput-object p2, p0, LbT2;->offerDealIds:Ljava/util/List;

    iput-boolean p3, p0, LbT2;->offerRedeemed:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LbT2;-><init>(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)V

    return-void
.end method

.method public static synthetic copy$default(LbT2;Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;ZILjava/lang/Object;)LbT2;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, LbT2;->offerDealIds:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, LbT2;->offerRedeemed:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LbT2;->a(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)LbT2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)LbT2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "LbT2;"
        }
    .end annotation

    const-string v0, "merchantSite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerDealIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LbT2;

    invoke-direct {v0, p1, p2, p3}, LbT2;-><init>(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/wire/WireMerchantSite;
    .locals 1

    iget-object v0, p0, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LbT2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LbT2;

    iget-object v1, p0, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    iget-object v3, p1, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LbT2;->offerDealIds:Ljava/util/List;

    iget-object v3, p1, LbT2;->offerDealIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LbT2;->offerRedeemed:Z

    iget-boolean p1, p1, LbT2;->offerRedeemed:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LbT2;->offerDealIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LbT2;->offerRedeemed:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LbT2;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    iget-object v1, p0, LbT2;->offerDealIds:Ljava/util/List;

    iget-boolean v2, p0, LbT2;->offerRedeemed:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MerchantScanResponse(merchantSite="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offerDealIds="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offerRedeemed="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
