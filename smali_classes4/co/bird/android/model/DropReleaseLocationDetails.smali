.class public final Lco/bird/android/model/DropReleaseLocationDetails;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/ReleaseLocationDetails;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\'\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000cJ\t\u0010>\u001a\u00020\nH\u00c6\u0003J\t\u0010?\u001a\u00020\nH\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J1\u0010B\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010C\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010D\u001a\u00020\u00072\u0008\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\n\u0010G\u001a\u0004\u0018\u00010HH\u0016J\t\u0010I\u001a\u00020\u0018H\u00d6\u0001J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020LH\u0016J\t\u0010M\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0018H\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u000eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0012R\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u000eR\u0016\u0010+\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u0012R\u0016\u0010-\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u0012R\u0014\u0010/\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u000eR\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u0016R\u0014\u00103\u001a\u0002048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u00106R\u0014\u00107\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00109R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00109R\u0014\u0010<\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010\u000e\u00a8\u0006S"
    }
    d2 = {
        "Lco/bird/android/model/DropReleaseLocationDetails;",
        "Lco/bird/android/model/ReleaseLocationDetails;",
        "config",
        "Lco/bird/android/model/wire/configs/Config;",
        "drop",
        "Lco/bird/android/model/wire/WireDrop;",
        "active",
        "",
        "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireDrop;Z)V",
        "releaseWindowStartHour",
        "",
        "releaseWindowEndHour",
        "(DDLco/bird/android/model/wire/WireDrop;Z)V",
        "getActive",
        "()Z",
        "address",
        "",
        "getAddress",
        "()Ljava/lang/String;",
        "brandNames",
        "",
        "getBrandNames",
        "()Ljava/util/List;",
        "capacity",
        "",
        "getCapacity",
        "()I",
        "claimedBy",
        "getClaimedBy",
        "getDrop",
        "()Lco/bird/android/model/wire/WireDrop;",
        "enforceReleaseWindow",
        "getEnforceReleaseWindow",
        "hours",
        "getHours",
        "id",
        "getId",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "mustClaimToRelease",
        "getMustClaimToRelease",
        "nestId",
        "getNestId",
        "notes",
        "getNotes",
        "open",
        "getOpen",
        "photos",
        "getPhotos",
        "purpose",
        "Lco/bird/android/model/constant/NestPurpose;",
        "getPurpose",
        "()Lco/bird/android/model/constant/NestPurpose;",
        "radius",
        "getRadius",
        "()D",
        "getReleaseWindowEndHour",
        "getReleaseWindowStartHour",
        "requireReleasePhoto",
        "getRequireReleasePhoto",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "expiresAt",
        "Lorg/joda/time/DateTime;",
        "hashCode",
        "isClaimed",
        "by",
        "Lco/bird/android/model/User;",
        "toString",
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
        "SMAP\nReleaseLocationDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/DropReleaseLocationDetails\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n*S KotlinDebug\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/DropReleaseLocationDetails\n*L\n132#1:207\n132#1:208,3\n*E\n"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/DropReleaseLocationDetails;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final active:Z

.field private final drop:Lco/bird/android/model/wire/WireDrop;

.field private final releaseWindowEndHour:D

.field private final releaseWindowStartHour:D


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/DropReleaseLocationDetails$Creator;

    invoke-direct {v0}, Lco/bird/android/model/DropReleaseLocationDetails$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/DropReleaseLocationDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(DDLco/bird/android/model/wire/WireDrop;Z)V
    .locals 1

    const-string v0, "drop"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    iput-wide p3, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    iput-object p5, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    iput-boolean p6, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    return-void
.end method

.method public synthetic constructor <init>(DDLco/bird/android/model/wire/WireDrop;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    const/4 p6, 0x1

    :cond_0
    move v6, p6

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/DropReleaseLocationDetails;-><init>(DDLco/bird/android/model/wire/WireDrop;Z)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireDrop;Z)V
    .locals 8

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drop"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getReleaseStartHour()D

    move-result-wide v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getReleaseEndHour()D

    move-result-wide v4

    move-object v1, p0

    move-object v6, p2

    move v7, p3

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/DropReleaseLocationDetails;-><init>(DDLco/bird/android/model/wire/WireDrop;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireDrop;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/DropReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireDrop;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/DropReleaseLocationDetails;DDLco/bird/android/model/wire/WireDrop;ZILjava/lang/Object;)Lco/bird/android/model/DropReleaseLocationDetails;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p5, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    :cond_2
    move-object v5, p5

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-boolean p6, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    :cond_3
    move v6, p6

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lco/bird/android/model/DropReleaseLocationDetails;->copy(DDLco/bird/android/model/wire/WireDrop;Z)Lco/bird/android/model/DropReleaseLocationDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public canReleaseNow(Ljava/util/Calendar;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;->canReleaseNow(Lco/bird/android/model/ReleaseLocationDetails;Ljava/util/Calendar;)Z

    move-result p1

    return p1
.end method

.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    return-wide v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireDrop;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    return v0
.end method

.method public final copy(DDLco/bird/android/model/wire/WireDrop;Z)Lco/bird/android/model/DropReleaseLocationDetails;
    .locals 8

    const-string v0, "drop"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/DropReleaseLocationDetails;

    move-object v1, v0

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/DropReleaseLocationDetails;-><init>(DDLco/bird/android/model/wire/WireDrop;Z)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/DropReleaseLocationDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/DropReleaseLocationDetails;

    iget-wide v3, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    iget-wide v5, p1, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    iget-wide v5, p1, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    iget-object v3, p1, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    iget-boolean p1, p1, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public expiresAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getUnclaimAt()Lorg/joda/time/DateTime;

    move-result-object v0

    return-object v0
.end method

.method public getActive()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    return v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getAddress()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getBrandNameToDisplay()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;->getBrandNameToDisplay(Lco/bird/android/model/ReleaseLocationDetails;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBrandNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getBrandNames()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getCapacity()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getQuantity()I

    move-result v0

    return v0
.end method

.method public getClaimedBy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getUserId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDrop()Lco/bird/android/model/wire/WireDrop;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    return-object v0
.end method

.method public getEnforceReleaseWindow()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getPurpose()Lco/bird/android/model/constant/NestPurpose;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NestPurpose;->RIDER:Lco/bird/android/model/constant/NestPurpose;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getHours()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getFormattedHours()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getMustClaimToRelease()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getNestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNestId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getNotes()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getOpen()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getOpen()Z

    move-result v0

    return v0
.end method

.method public getPhotos()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getPhotos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireNestPhoto;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireNestPhoto;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public getPurpose()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getPurpose()Lco/bird/android/model/constant/NestPurpose;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lco/bird/android/model/constant/NestPurpose;->RIDER:Lco/bird/android/model/constant/NestPurpose;

    :cond_0
    return-object v0
.end method

.method public getRadius()D
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getRadius()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x4022a8f5c28f5c29L    # 9.33

    :goto_0
    return-wide v0
.end method

.method public getReleaseWindowEndHour()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    return-wide v0
.end method

.method public getReleaseWindowStartHour()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    return-wide v0
.end method

.method public getRequireReleasePhoto()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDrop;->getNest()Lco/bird/android/model/wire/WireLegacyNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyNest;->getEnabled()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireDrop;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public isClaimed(Lco/bird/android/model/User;)Z
    .locals 2

    const-string v0, "by"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/DropReleaseLocationDetails;->getClaimedBy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireDrop;->getUnclaimAt()Lorg/joda/time/DateTime;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    if-nez p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-nez p1, :cond_1

    move v0, v1

    :cond_1
    return v0
.end method

.method public releaseWindow()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;->releaseWindow(Lco/bird/android/model/ReleaseLocationDetails;)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    iget-wide v2, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    iget-object v4, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    iget-boolean v5, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DropReleaseLocationDetails(releaseWindowStartHour="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", releaseWindowEndHour="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", drop="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", active="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowStartHour:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->releaseWindowEndHour:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-object v0, p0, Lco/bird/android/model/DropReleaseLocationDetails;->drop:Lco/bird/android/model/wire/WireDrop;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Lco/bird/android/model/DropReleaseLocationDetails;->active:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
