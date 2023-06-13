.class public final Lco/bird/android/model/persistence/NestFlightSheetDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\'\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0095\u0001\u0010=\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010>\u001a\u00020?2\u0008\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020BH\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\'R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100\u00a8\u0006D"
    }
    d2 = {
        "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
        "",
        "nestId",
        "",
        "nestSummary",
        "Lco/bird/android/model/persistence/nestedstructures/NestSummary;",
        "nestBirdle",
        "Lco/bird/android/model/persistence/nestedstructures/NestBirdle;",
        "nestStatus",
        "Lco/bird/android/model/persistence/nestedstructures/NestStatus;",
        "nestImages",
        "Lco/bird/android/model/persistence/nestedstructures/NestImages;",
        "nestCapacity",
        "Lco/bird/android/model/persistence/nestedstructures/NestCapacity;",
        "nestDetails",
        "Lco/bird/android/model/persistence/nestedstructures/NestDetails;",
        "vehicleDetails",
        "Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;",
        "nestButtons",
        "Lco/bird/android/model/persistence/nestedstructures/NestButtons;",
        "claimDetails",
        "Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;",
        "nestAllowedVehicles",
        "Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;",
        "newClaimErrorMessage",
        "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)V",
        "getClaimDetails",
        "()Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;",
        "getNestAllowedVehicles",
        "()Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;",
        "getNestBirdle",
        "()Lco/bird/android/model/persistence/nestedstructures/NestBirdle;",
        "getNestButtons",
        "()Lco/bird/android/model/persistence/nestedstructures/NestButtons;",
        "getNestCapacity",
        "()Lco/bird/android/model/persistence/nestedstructures/NestCapacity;",
        "getNestDetails",
        "()Lco/bird/android/model/persistence/nestedstructures/NestDetails;",
        "getNestId",
        "()Ljava/lang/String;",
        "getNestImages",
        "()Lco/bird/android/model/persistence/nestedstructures/NestImages;",
        "getNestStatus",
        "()Lco/bird/android/model/persistence/nestedstructures/NestStatus;",
        "getNestSummary",
        "()Lco/bird/android/model/persistence/nestedstructures/NestSummary;",
        "getNewClaimErrorMessage",
        "getVehicleDetails",
        "()Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "model-persistence_release"
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
.field private final claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

.field private final nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

.field private final nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

.field private final nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

.field private final nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

.field private final nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

.field private final nestId:Ljava/lang/String;

.field private final nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

.field private final nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

.field private final nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

.field private final newClaimErrorMessage:Ljava/lang/String;

.field private final vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)V
    .locals 1

    const-string v0, "nestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nestSummary"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    iput-object p3, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    iput-object p4, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    iput-object p5, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    iput-object p6, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    iput-object p7, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    iput-object p8, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    iput-object p9, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    iput-object p10, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    iput-object p11, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    iput-object p12, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v8, v2

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

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_8

    move-object v14, v2

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v15, p12

    invoke-direct/range {v3 .. v15}, Lco/bird/android/model/persistence/NestFlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/NestFlightSheetDetails;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/persistence/NestFlightSheetDetails;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p12

    :goto_b
    move-object p1, v2

    move-object p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/NestFlightSheetDetails;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    return-object v0
.end method

.method public final component11()Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/NestSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/NestBirdle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/nestedstructures/NestStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/persistence/nestedstructures/NestImages;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/persistence/nestedstructures/NestCapacity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/persistence/nestedstructures/NestDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    return-object v0
.end method

.method public final component9()Lco/bird/android/model/persistence/nestedstructures/NestButtons;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/NestFlightSheetDetails;
    .locals 14

    const-string v0, "nestId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nestSummary"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/NestFlightSheetDetails;

    move-object v1, v0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lco/bird/android/model/persistence/NestFlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getClaimDetails()Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    return-object v0
.end method

.method public final getNestAllowedVehicles()Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    return-object v0
.end method

.method public final getNestBirdle()Lco/bird/android/model/persistence/nestedstructures/NestBirdle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    return-object v0
.end method

.method public final getNestButtons()Lco/bird/android/model/persistence/nestedstructures/NestButtons;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    return-object v0
.end method

.method public final getNestCapacity()Lco/bird/android/model/persistence/nestedstructures/NestCapacity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    return-object v0
.end method

.method public final getNestDetails()Lco/bird/android/model/persistence/nestedstructures/NestDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    return-object v0
.end method

.method public final getNestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    return-object v0
.end method

.method public final getNestImages()Lco/bird/android/model/persistence/nestedstructures/NestImages;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    return-object v0
.end method

.method public final getNestStatus()Lco/bird/android/model/persistence/nestedstructures/NestStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    return-object v0
.end method

.method public final getNestSummary()Lco/bird/android/model/persistence/nestedstructures/NestSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    return-object v0
.end method

.method public final getNewClaimErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getVehicleDetails()Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestSummary;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestStatus;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestImages;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestCapacity;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestDetails;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestButtons;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestSummary:Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    iget-object v2, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestBirdle:Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    iget-object v3, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestStatus:Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    iget-object v4, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestImages:Lco/bird/android/model/persistence/nestedstructures/NestImages;

    iget-object v5, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestCapacity:Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    iget-object v6, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestDetails:Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    iget-object v7, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->vehicleDetails:Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    iget-object v8, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestButtons:Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    iget-object v9, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->claimDetails:Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    iget-object v10, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->nestAllowedVehicles:Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    iget-object v11, p0, Lco/bird/android/model/persistence/NestFlightSheetDetails;->newClaimErrorMessage:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "NestFlightSheetDetails(nestId="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nestSummary="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestBirdle="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestStatus="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestImages="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestCapacity="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestDetails="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vehicleDetails="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestButtons="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", claimDetails="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nestAllowedVehicles="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", newClaimErrorMessage="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
