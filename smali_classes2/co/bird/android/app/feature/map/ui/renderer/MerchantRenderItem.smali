.class public final Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;",
        "",
        "markerId",
        "",
        "merchantSite",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "pinSize",
        "",
        "pinVisibility",
        "Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)V",
        "getMarkerId",
        "()Ljava/lang/String;",
        "getMerchantSite",
        "()Lco/bird/android/model/wire/WireMerchantSite;",
        "getPinSize",
        "()D",
        "getPinVisibility",
        "()Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final markerId:Ljava/lang/String;

.field private final merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

.field private final pinSize:D

.field private final pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)V
    .locals 1

    const-string v0, "markerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantSite"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinVisibility"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    iput-wide p3, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    iput-object p5, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const-wide/high16 p3, 0x3ff0000000000000L    # 1.0

    :cond_0
    move-wide v3, p3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;ILjava/lang/Object;)Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-wide p3, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    :cond_2
    move-wide v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p5, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    :cond_3
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-wide p5, v0

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->copy(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireMerchantSite;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    return-wide v0
.end method

.method public final component4()Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;
    .locals 7

    const-string v0, "markerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantSite"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinVisibility"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    iget-object v3, p1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    iget-wide v5, p1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    iget-object p1, p1, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMarkerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMerchantSite()Lco/bird/android/model/wire/WireMerchantSite;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    return-object v0
.end method

.method public final getPinSize()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    return-wide v0
.end method

.method public final getPinVisibility()Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantSite;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->markerId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->merchantSite:Lco/bird/android/model/wire/WireMerchantSite;

    iget-wide v2, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinSize:D

    iget-object v4, p0, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;->pinVisibility:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MerchantRenderItem(markerId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", merchantSite="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pinSize="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", pinVisibility="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
