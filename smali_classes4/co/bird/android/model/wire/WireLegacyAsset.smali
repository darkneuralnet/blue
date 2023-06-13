.class public final Lco/bird/android/model/wire/WireLegacyAsset;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/model/wire/WireLegacyAsset;",
        "Landroid/os/Parcelable;",
        "kind",
        "Lco/bird/android/model/constant/AssetKind;",
        "assetId",
        "",
        "media",
        "Lco/bird/android/model/wire/WireAssetMedia;",
        "(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)V",
        "getAssetId",
        "()Ljava/lang/String;",
        "getKind",
        "()Lco/bird/android/model/constant/AssetKind;",
        "getMedia",
        "()Lco/bird/android/model/wire/WireAssetMedia;",
        "component1",
        "component2",
        "component3",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model-wire_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/wire/WireLegacyAsset;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final assetId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "asset_id"
    .end annotation

    .annotation runtime Lft5;
        value = "asset_id"
    .end annotation
.end field

.field private final kind:Lco/bird/android/model/constant/AssetKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field

.field private final media:Lco/bird/android/model/wire/WireAssetMedia;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "media"
    .end annotation

    .annotation runtime Lft5;
        value = "media"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireLegacyAsset$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireLegacyAsset$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireLegacyAsset;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)V
    .locals 1

    const-string v0, "media"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    iput-object p2, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lco/bird/android/model/constant/AssetKind;->MEDIA:Lco/bird/android/model/constant/AssetKind;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireLegacyAsset;-><init>(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireLegacyAsset;Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;ILjava/lang/Object;)Lco/bird/android/model/wire/WireLegacyAsset;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireLegacyAsset;->copy(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/AssetKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireAssetMedia;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)Lco/bird/android/model/wire/WireLegacyAsset;
    .locals 1

    const-string v0, "media"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireLegacyAsset;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/WireLegacyAsset;-><init>(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)V

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
    instance-of v1, p1, Lco/bird/android/model/wire/WireLegacyAsset;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireLegacyAsset;

    iget-object v1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    iget-object p1, p1, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAssetId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    return-object v0
.end method

.method public final getKind()Lco/bird/android/model/constant/AssetKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    return-object v0
.end method

.method public final getMedia()Lco/bird/android/model/wire/WireAssetMedia;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireAssetMedia;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    iget-object v1, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireLegacyAsset(kind="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", assetId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", media="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->kind:Lco/bird/android/model/constant/AssetKind;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->assetId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireLegacyAsset;->media:Lco/bird/android/model/wire/WireAssetMedia;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireAssetMedia;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
