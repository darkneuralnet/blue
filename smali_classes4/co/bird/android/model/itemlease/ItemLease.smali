.class public final Lco/bird/android/model/itemlease/ItemLease;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008 \n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0010H\u00c6\u0003J\t\u00109\u001a\u00020\u0010H\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\u000f\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0015H\u00c6\u0003J\t\u0010>\u001a\u00020\u001aH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\nH\u00c6\u0003J\t\u0010D\u001a\u00020\nH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u00c9\u0001\u0010G\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00152\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001aH\u00c6\u0001J\t\u0010H\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010I\u001a\u00020*2\u0008\u0010J\u001a\u0004\u0018\u00010KH\u00d6\u0003J\t\u0010L\u001a\u00020\u0010H\u00d6\u0001J\u0016\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0006J\u0016\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0006J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010$R\u0011\u0010)\u001a\u00020*8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010+R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010$R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\"R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\"R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010\u001d\u00a8\u0006Y"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/ItemLease;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "principalId",
        "leaseType",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "leasedItemId",
        "associatedItemId",
        "startedAt",
        "Lorg/joda/time/DateTime;",
        "dueAt",
        "returnedAt",
        "finalizedAt",
        "currency",
        "initialChargeAmount",
        "",
        "returnRefundAmount",
        "delinquentFeeAmount",
        "delinquencySettledAt",
        "validations",
        "",
        "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
        "assets",
        "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
        "metadata",
        "Lco/bird/android/model/itemlease/ItemLeaseMetadata;",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)V",
        "getAssets",
        "()Ljava/util/List;",
        "getAssociatedItemId",
        "()Ljava/lang/String;",
        "getCurrency",
        "getDelinquencySettledAt",
        "()Lorg/joda/time/DateTime;",
        "getDelinquentFeeAmount",
        "()I",
        "getDueAt",
        "getFinalizedAt",
        "getId",
        "getInitialChargeAmount",
        "isActive",
        "",
        "()Z",
        "getLeaseType",
        "()Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "getLeasedItemId",
        "getMetadata",
        "()Lco/bird/android/model/itemlease/ItemLeaseMetadata;",
        "getPrincipalId",
        "getReturnRefundAmount",
        "getReturnedAt",
        "getStartedAt",
        "getValidations",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "isLeaseForBird",
        "bird",
        "Lco/bird/android/model/wire/WireBird;",
        "type",
        "isLeaseForBirdId",
        "birdId",
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
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final assets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
            ">;"
        }
    .end annotation
.end field

.field private final associatedItemId:Ljava/lang/String;

.field private final currency:Ljava/lang/String;

.field private final delinquencySettledAt:Lorg/joda/time/DateTime;

.field private final delinquentFeeAmount:I

.field private final dueAt:Lorg/joda/time/DateTime;

.field private final finalizedAt:Lorg/joda/time/DateTime;

.field private final id:Ljava/lang/String;

.field private final initialChargeAmount:I

.field private final leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

.field private final leasedItemId:Ljava/lang/String;

.field private final metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

.field private final principalId:Ljava/lang/String;

.field private final returnRefundAmount:I

.field private final returnedAt:Lorg/joda/time/DateTime;

.field private final startedAt:Lorg/joda/time/DateTime;

.field private final validations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/itemlease/ItemLease$Creator;

    invoke-direct {v0}, Lco/bird/android/model/itemlease/ItemLease$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/itemlease/ItemLease;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "III",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
            ">;",
            "Lco/bird/android/model/itemlease/ItemLeaseMetadata;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p10

    move-object/from16 v7, p15

    move-object/from16 v8, p16

    move-object/from16 v9, p17

    const-string v10, "id"

    invoke-static {p1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "principalId"

    invoke-static {p2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "leaseType"

    invoke-static {p3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "startedAt"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "dueAt"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "currency"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "validations"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "assets"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "metadata"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    iput-object v2, v0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    iput-object v3, v0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    move-object v1, p4

    iput-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    move-object/from16 v1, p5

    iput-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    iput-object v5, v0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p8

    iput-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p9

    iput-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    iput-object v6, v0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    move/from16 v1, p11

    iput v1, v0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    move/from16 v1, p12

    iput v1, v0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    move/from16 v1, p13

    iput v1, v0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    iput-object v7, v0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    iput-object v8, v0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    iput-object v9, v0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->UNKNOWN:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    const-string v1, "usd"

    move-object v12, v1

    goto :goto_5

    :cond_5
    move-object/from16 v12, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    move v13, v3

    goto :goto_6

    :cond_6
    move/from16 v13, p11

    :goto_6
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_7

    move v14, v3

    goto :goto_7

    :cond_7
    move/from16 v14, p12

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_8

    move v15, v3

    goto :goto_8

    :cond_8
    move/from16 v15, p13

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p14

    :goto_9
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_a

    :cond_a
    move-object/from16 v17, p15

    :goto_a
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_b

    :cond_b
    move-object/from16 v18, p16

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_c

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v2, v1, v2}, Lco/bird/android/model/itemlease/ItemLeaseMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v0

    goto :goto_c

    :cond_c
    move-object/from16 v19, p17

    :goto_c
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v2 .. v19}, Lco/bird/android/model/itemlease/ItemLease;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/itemlease/ItemLease;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;ILjava/lang/Object;)Lco/bird/android/model/itemlease/ItemLease;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v1

    invoke-virtual/range {p0 .. p17}, Lco/bird/android/model/itemlease/ItemLease;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    return v0
.end method

.method public final component14()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Lco/bird/android/model/itemlease/ItemLeaseMetadata;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/itemlease/enum/ItemLeaseType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component7()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component8()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component9()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)Lco/bird/android/model/itemlease/ItemLease;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "III",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
            ">;",
            "Lco/bird/android/model/itemlease/ItemLeaseMetadata;",
            ")",
            "Lco/bird/android/model/itemlease/ItemLease;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    const-string v0, "id"

    move-object/from16 v18, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "principalId"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startedAt"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dueAt"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validations"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assets"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lco/bird/android/model/itemlease/ItemLease;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-direct/range {v0 .. v17}, Lco/bird/android/model/itemlease/ItemLease;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)V

    return-object v19
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
    instance-of v1, p1, Lco/bird/android/model/itemlease/ItemLease;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/itemlease/ItemLease;

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    iget v3, p1, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    iget v3, p1, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    iget v3, p1, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    iget-object p1, p1, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAssets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    return-object v0
.end method

.method public final getAssociatedItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDelinquencySettledAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getDelinquentFeeAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    return v0
.end method

.method public final getDueAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getFinalizedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialChargeAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    return v0
.end method

.method public final getLeaseType()Lco/bird/android/model/itemlease/enum/ItemLeaseType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    return-object v0
.end method

.method public final getLeasedItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lco/bird/android/model/itemlease/ItemLeaseMetadata;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    return-object v0
.end method

.method public final getPrincipalId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReturnRefundAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    return v0
.end method

.method public final getReturnedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getStartedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getValidations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

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

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/ItemLeaseMetadata;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isLeaseForBird(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/itemlease/ItemLease;->isLeaseForBirdId(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result p1

    return p1
.end method

.method public final isLeaseForBirdId(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 1

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    iget-object v4, v0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    iget-object v5, v0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    iget-object v6, v0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    iget-object v7, v0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    iget-object v8, v0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    iget-object v9, v0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    iget-object v10, v0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    iget v11, v0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    iget v12, v0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    iget v13, v0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    iget-object v14, v0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    iget-object v15, v0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v15

    const-string v15, "ItemLease(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", principalId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", leaseType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", leasedItemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", associatedItemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dueAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", returnedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", finalizedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", initialChargeAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", returnRefundAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delinquentFeeAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delinquencySettledAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", validations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", assets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->principalId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->leaseType:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->leasedItemId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->associatedItemId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->startedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->dueAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->finalizedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->currency:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->initialChargeAmount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->returnRefundAmount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquentFeeAmount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->delinquencySettledAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->validations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/itemlease/ItemLeaseValidation;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->assets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/itemlease/ItemLeaseAsset;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/itemlease/ItemLeaseAsset;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lco/bird/android/model/itemlease/ItemLease;->metadata:Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/itemlease/ItemLeaseMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
