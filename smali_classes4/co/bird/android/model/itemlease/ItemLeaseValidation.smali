.class public final Lco/bird/android/model/itemlease/ItemLeaseValidation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003JG\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u000b2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u001fH\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u00d6\u0001R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "leaseId",
        "validationType",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;",
        "validatorId",
        "createdAt",
        "Lorg/joda/time/DateTime;",
        "result",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V",
        "getCreatedAt",
        "()Lorg/joda/time/DateTime;",
        "getId",
        "()Ljava/lang/String;",
        "getLeaseId",
        "getResult",
        "()Z",
        "getValidationType",
        "()Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;",
        "getValidatorId",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
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
            "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final createdAt:Lorg/joda/time/DateTime;

.field private final id:Ljava/lang/String;

.field private final leaseId:Ljava/lang/String;

.field private final result:Z

.field private final validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

.field private final validatorId:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseValidation$Creator;

    invoke-direct {v0}, Lco/bird/android/model/itemlease/ItemLeaseValidation$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validatorId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    iput-object p4, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    iput-boolean p6, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/itemlease/ItemLeaseValidation;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/itemlease/ItemLeaseValidation;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;ZILjava/lang/Object;)Lco/bird/android/model/itemlease/ItemLeaseValidation;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)Lco/bird/android/model/itemlease/ItemLeaseValidation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)Lco/bird/android/model/itemlease/ItemLeaseValidation;
    .locals 8

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validatorId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseValidation;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/itemlease/ItemLeaseValidation;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V

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
    instance-of v1, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    iget-boolean p1, p1, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeaseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getResult()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    return v0
.end method

.method public final getValidationType()Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    return-object v0
.end method

.method public final getValidatorId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    iget-object v3, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    iget-boolean v5, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ItemLeaseValidation(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", leaseId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", validationType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", validatorId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->leaseId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validationType:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->validatorId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->createdAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-boolean p2, p0, Lco/bird/android/model/itemlease/ItemLeaseValidation;->result:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
