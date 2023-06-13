.class public final Lco/bird/android/model/DeliveryReleaseLocationDetails;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/ReleaseLocationDetails;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0006\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\t\u0012\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\tH\u00c6\u0003J\t\u0010C\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010E\u001a\u00020\tH\u00c6\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u00c6\u0003Je\u0010G\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u00c6\u0001J\t\u0010H\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010I\u001a\u00020\t2\u0008\u0010J\u001a\u0004\u0018\u00010KH\u00d6\u0003J\n\u0010L\u001a\u0004\u0018\u00010MH\u0016J\t\u0010N\u001a\u00020\u001cH\u00d6\u0001J\t\u0010O\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\tX\u0096D\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0014\u0010$\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0015R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0018R\u0014\u0010\'\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u0018R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u0015R\u0016\u0010.\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u0018R\u0014\u0010\r\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u0015R\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u001aR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0014\u00105\u001a\u0002068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u00108R\u0014\u00109\u001a\u0002068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u00108R\u0014\u0010;\u001a\u0002068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u00108R\u0014\u0010=\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010\u0015\u00a8\u0006U"
    }
    d2 = {
        "Lco/bird/android/model/DeliveryReleaseLocationDetails;",
        "Lco/bird/android/model/ReleaseLocationDetails;",
        "config",
        "Lco/bird/android/model/wire/configs/DeliveryConfig;",
        "delivery",
        "Lco/bird/android/model/Delivery;",
        "claimedBy",
        "",
        "mustClaimToRelease",
        "",
        "purpose",
        "Lco/bird/android/model/constant/NestPurpose;",
        "hours",
        "open",
        "brandNames",
        "",
        "(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)V",
        "active",
        "getActive$annotations",
        "()V",
        "getActive",
        "()Z",
        "address",
        "getAddress",
        "()Ljava/lang/String;",
        "getBrandNames",
        "()Ljava/util/List;",
        "capacity",
        "",
        "getCapacity",
        "()I",
        "getClaimedBy",
        "getConfig",
        "()Lco/bird/android/model/wire/configs/DeliveryConfig;",
        "getDelivery",
        "()Lco/bird/android/model/Delivery;",
        "enforceReleaseWindow",
        "getEnforceReleaseWindow",
        "getHours",
        "id",
        "getId",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "getMustClaimToRelease",
        "notes",
        "getNotes",
        "getOpen",
        "photos",
        "getPhotos",
        "getPurpose",
        "()Lco/bird/android/model/constant/NestPurpose;",
        "radius",
        "",
        "getRadius",
        "()D",
        "releaseWindowEndHour",
        "getReleaseWindowEndHour",
        "releaseWindowStartHour",
        "getReleaseWindowStartHour",
        "requireReleasePhoto",
        "getRequireReleasePhoto",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "expiresAt",
        "Lorg/joda/time/DateTime;",
        "hashCode",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/DeliveryReleaseLocationDetails;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final active:Z

.field private final brandNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final claimedBy:Ljava/lang/String;

.field private final config:Lco/bird/android/model/wire/configs/DeliveryConfig;

.field private final delivery:Lco/bird/android/model/Delivery;

.field private final hours:Ljava/lang/String;

.field private final mustClaimToRelease:Z

.field private final open:Z

.field private final purpose:Lco/bird/android/model/constant/NestPurpose;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/DeliveryReleaseLocationDetails$Creator;

    invoke-direct {v0}, Lco/bird/android/model/DeliveryReleaseLocationDetails$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/DeliveryConfig;",
            "Lco/bird/android/model/Delivery;",
            "Ljava/lang/String;",
            "Z",
            "Lco/bird/android/model/constant/NestPurpose;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delivery"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purpose"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    iput-object p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    iput-object p3, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    iput-boolean p4, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    iput-object p5, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    iput-object p6, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    iput-boolean p7, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    iput-object p8, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->active:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v7, v1

    goto :goto_1

    :cond_1
    move/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    sget-object v1, Lco/bird/android/model/constant/NestPurpose;->DELIVERY:Lco/bird/android/model/constant/NestPurpose;

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    move v10, v1

    goto :goto_4

    :cond_4
    move/from16 v10, p7

    :goto_4
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v11, v0

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v3 .. v11}, Lco/bird/android/model/DeliveryReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/DeliveryReleaseLocationDetails;Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lco/bird/android/model/DeliveryReleaseLocationDetails;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move p4, v5

    move-object p5, v6

    move-object p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lco/bird/android/model/DeliveryReleaseLocationDetails;->copy(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)Lco/bird/android/model/DeliveryReleaseLocationDetails;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getActive$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public canReleaseNow(Ljava/util/Calendar;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;->canReleaseNow(Lco/bird/android/model/ReleaseLocationDetails;Ljava/util/Calendar;)Z

    move-result p1

    return p1
.end method

.method public final component1()Lco/bird/android/model/wire/configs/DeliveryConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/Delivery;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    return v0
.end method

.method public final component5()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)Lco/bird/android/model/DeliveryReleaseLocationDetails;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/DeliveryConfig;",
            "Lco/bird/android/model/Delivery;",
            "Ljava/lang/String;",
            "Z",
            "Lco/bird/android/model/constant/NestPurpose;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lco/bird/android/model/DeliveryReleaseLocationDetails;"
        }
    .end annotation

    const-string v0, "config"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delivery"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purpose"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    move-object v1, v0

    move-object v4, p3

    move v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/DeliveryReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)V

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
    instance-of v1, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    iget-object v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    iget-object v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    iget-boolean v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    iget-object v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    iget-boolean v3, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public expiresAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0}, Lco/bird/android/model/Delivery;->getDropAt()Lorg/joda/time/DateTime;

    move-result-object v0

    return-object v0
.end method

.method public getActive()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->active:Z

    return v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0}, Lco/bird/android/model/Delivery;->getAddress()Ljava/lang/String;

    move-result-object v0

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

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    return-object v0
.end method

.method public getCapacity()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getClaimedBy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    return-object v0
.end method

.method public final getConfig()Lco/bird/android/model/wire/configs/DeliveryConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    return-object v0
.end method

.method public final getDelivery()Lco/bird/android/model/Delivery;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    return-object v0
.end method

.method public getEnforceReleaseWindow()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHours()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0}, Lco/bird/android/model/Delivery;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0}, Lco/bird/android/model/Delivery;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    return-object v0
.end method

.method public getMustClaimToRelease()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    return v0
.end method

.method public getNestId()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;->getNestId(Lco/bird/android/model/ReleaseLocationDetails;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0}, Lco/bird/android/model/Delivery;->getNotes()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOpen()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    return v0
.end method

.method public getPhotos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0}, Lco/bird/android/model/Delivery;->getPhotoUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPurpose()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    return-object v0
.end method

.method public getRadius()D
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getReleaseRadius()D

    move-result-wide v0

    return-wide v0
.end method

.method public getReleaseWindowEndHour()D
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getReleaseWindowEndHour()I

    move-result v0

    int-to-double v0, v0

    return-wide v0
.end method

.method public getReleaseWindowStartHour()D
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getReleaseWindowStartHour()I

    move-result v0

    int-to-double v0, v0

    return-wide v0
.end method

.method public getRequireReleasePhoto()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/DeliveryConfig;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v1}, Lco/bird/android/model/Delivery;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v3, v1

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public isClaimed(Lco/bird/android/model/User;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;->isClaimed(Lco/bird/android/model/ReleaseLocationDetails;Lco/bird/android/model/User;)Z

    move-result p1

    return p1
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
    .locals 10

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    iget-object v1, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    iget-object v2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    iget-boolean v3, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    iget-object v4, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    iget-object v5, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    iget-boolean v6, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    iget-object v7, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "DeliveryReleaseLocationDetails(config="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", delivery="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", claimedBy="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mustClaimToRelease="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", purpose="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hours="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", open="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", brandNames="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->config:Lco/bird/android/model/wire/configs/DeliveryConfig;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->delivery:Lco/bird/android/model/Delivery;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/Delivery;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->claimedBy:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->mustClaimToRelease:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->purpose:Lco/bird/android/model/constant/NestPurpose;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->hours:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->open:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/DeliveryReleaseLocationDetails;->brandNames:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return-void
.end method
