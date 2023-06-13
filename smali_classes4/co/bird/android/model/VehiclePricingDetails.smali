.class public final Lco/bird/android/model/VehiclePricingDetails;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\u001a\u0010\u0016\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0012J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/VehiclePricingDetails;",
        "Landroid/os/Parcelable;",
        "emptyState",
        "Lco/bird/android/model/VehiclePricingDetailsEmptyState;",
        "vehiclePrices",
        "",
        "Lco/bird/android/model/VehiclePricing;",
        "(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)V",
        "getEmptyState",
        "()Lco/bird/android/model/VehiclePricingDetailsEmptyState;",
        "getVehiclePrices",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "pricingChanged",
        "ignoreEmptyState",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVehiclePricingDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclePricingDetails.kt\nco/bird/android/model/VehiclePricingDetails\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1855#2,2:34\n*S KotlinDebug\n*F\n+ 1 VehiclePricingDetails.kt\nco/bird/android/model/VehiclePricingDetails\n*L\n24#1:34,2\n*E\n"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/VehiclePricingDetails;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "empty_state"
    .end annotation

    .annotation runtime Lft5;
        value = "empty_state"
    .end annotation
.end field

.field private final vehiclePrices:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "vehicle_prices"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/VehiclePricing;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "vehicle_prices"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/VehiclePricingDetails$Creator;

    invoke-direct {v0}, Lco/bird/android/model/VehiclePricingDetails$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/VehiclePricingDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lco/bird/android/model/VehiclePricingDetails;-><init>(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehiclePricingDetailsEmptyState;",
            "Ljava/util/List<",
            "Lco/bird/android/model/VehiclePricing;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    iput-object p2, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lco/bird/android/model/VehiclePricingDetails;-><init>(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/VehiclePricingDetails;Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/VehiclePricingDetails;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/VehiclePricingDetails;->copy(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)Lco/bird/android/model/VehiclePricingDetails;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic pricingChanged$default(Lco/bird/android/model/VehiclePricingDetails;Lco/bird/android/model/VehiclePricingDetails;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/VehiclePricingDetails;->pricingChanged(Lco/bird/android/model/VehiclePricingDetails;Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/VehiclePricingDetailsEmptyState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/VehiclePricing;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)Lco/bird/android/model/VehiclePricingDetails;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehiclePricingDetailsEmptyState;",
            "Ljava/util/List<",
            "Lco/bird/android/model/VehiclePricing;",
            ">;)",
            "Lco/bird/android/model/VehiclePricingDetails;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/model/VehiclePricingDetails;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/VehiclePricingDetails;-><init>(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/VehiclePricingDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/VehiclePricingDetails;

    iget-object v1, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    iget-object v3, p1, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEmptyState()Lco/bird/android/model/VehiclePricingDetailsEmptyState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    return-object v0
.end method

.method public final getVehiclePrices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/VehiclePricing;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/VehiclePricingDetailsEmptyState;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final pricingChanged(Lco/bird/android/model/VehiclePricingDetails;Z)Z
    .locals 4

    const/4 v0, 0x1

    if-eqz p1, :cond_7

    if-nez p2, :cond_0

    iget-object p2, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    iget-object v1, p1, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    :cond_0
    iget-object p2, p1, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    iget-object v2, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    iget-object p2, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz p2, :cond_6

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/VehiclePricing;

    iget-object v3, p1, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    if-eqz v3, :cond_5

    invoke-interface {v3, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_5

    move v2, v0

    goto :goto_1

    :cond_5
    move v2, v1

    :goto_1
    if-eqz v2, :cond_4

    return v0

    :cond_6
    return v1

    :cond_7
    :goto_2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    iget-object v1, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VehiclePricingDetails(emptyState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vehiclePrices="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->emptyState:Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/VehiclePricingDetailsEmptyState;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/VehiclePricingDetails;->vehiclePrices:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/VehiclePricing;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/VehiclePricing;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method
