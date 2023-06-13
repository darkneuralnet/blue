.class public final Lco/bird/android/model/itemlease/ItemLeaseExemption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/itemlease/ItemLeaseExemption$Companion;,
        Lco/bird/android/model/itemlease/ItemLeaseExemption$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 *2\u00020\u0001:\u0001*B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u0010\u0010\u001f\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\"\u001a\u00020\u0019J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
        "Landroid/os/Parcelable;",
        "bird",
        "Lco/bird/android/model/wire/WireBird;",
        "leaseType",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "exception",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;",
        "createdAt",
        "Lorg/joda/time/DateTime;",
        "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)V",
        "getBird",
        "()Lco/bird/android/model/wire/WireBird;",
        "getCreatedAt",
        "()Lorg/joda/time/DateTime;",
        "getException",
        "()Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;",
        "getLeaseType",
        "()Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "isValid",
        "config",
        "Lco/bird/android/model/wire/configs/Config;",
        "ttlSeconds",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
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
            "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/itemlease/ItemLeaseExemption$Companion;

.field private static final DEFAULT_EXEMPTION_EXPIRY_SECONDS:I = 0x708


# instance fields
.field private final bird:Lco/bird/android/model/wire/WireBird;

.field private final createdAt:Lorg/joda/time/DateTime;

.field private final exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

.field private final leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseExemption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/itemlease/ItemLeaseExemption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->Companion:Lco/bird/android/model/itemlease/ItemLeaseExemption$Companion;

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseExemption$Creator;

    invoke-direct {v0}, Lco/bird/android/model/itemlease/ItemLeaseExemption$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    iput-object p3, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    iput-object p4, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p4

    const-string p5, "now()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/itemlease/ItemLeaseExemption;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/itemlease/ItemLeaseExemption;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/itemlease/ItemLeaseExemption;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->copy(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)Lco/bird/android/model/itemlease/ItemLeaseExemption;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isValid$default(Lco/bird/android/model/itemlease/ItemLeaseExemption;IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x708

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->isValid(I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/itemlease/enum/ItemLeaseType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    return-object v0
.end method

.method public final component4()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)Lco/bird/android/model/itemlease/ItemLeaseExemption;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/itemlease/ItemLeaseExemption;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)V

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
    instance-of v1, p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBird()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getException()Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    return-object v0
.end method

.method public final getLeaseType()Lco/bird/android/model/itemlease/enum/ItemLeaseType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isValid(I)Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    return p1
.end method

.method public final isValid(Lco/bird/android/model/wire/configs/Config;)Z
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    sget-object v1, Lco/bird/android/model/itemlease/ItemLeaseExemption$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getLeaseConfig()Lco/bird/android/model/wire/configs/LeaseConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/LeaseConfig;->getLeaseTypes()Lco/bird/android/model/wire/configs/LeaseTypesConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->getHelmet()Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->getLeaseExemptionDurationSeconds()I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 p1, 0x708

    :goto_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->isValid(I)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    iget-object v2, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    iget-object v3, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ItemLeaseExemption(bird="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leaseType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exception="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->exception:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseExemption;->createdAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
