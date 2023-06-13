.class public final Lco/bird/android/model/BirdSummaryViewModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/BirdSummaryViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\'\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u0000 <2\u00020\u0001:\u0001<B7\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tBy\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u009a\u0001\u00105\u001a\u00020\u00002\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0010H\u00d6\u0001J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u001f\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0019R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\'\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0019\u00a8\u0006="
    }
    d2 = {
        "Lco/bird/android/model/BirdSummaryViewModel;",
        "",
        "birdSummary",
        "Lco/bird/android/model/BirdSummary;",
        "trackedAt",
        "",
        "batteryLastTrackedAt",
        "warehouse",
        "serviceStatus",
        "(Lco/bird/android/model/BirdSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "code",
        "displayModel",
        "model",
        "Lco/bird/android/model/constant/BirdModel;",
        "brainState",
        "brainStateColor",
        "",
        "condition",
        "trackedAtColor",
        "battery",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V",
        "getBattery",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getBatteryLastTrackedAt",
        "()Ljava/lang/String;",
        "getBirdSummary",
        "()Lco/bird/android/model/BirdSummary;",
        "setBirdSummary",
        "(Lco/bird/android/model/BirdSummary;)V",
        "getBrainState",
        "getBrainStateColor",
        "getCode",
        "getCondition",
        "getDisplayModel",
        "getModel",
        "()Lco/bird/android/model/constant/BirdModel;",
        "getServiceStatus",
        "getTrackedAt",
        "getTrackedAtColor",
        "getWarehouse",
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
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/BirdSummaryViewModel;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field public static final Companion:Lco/bird/android/model/BirdSummaryViewModel$Companion;

.field private static final EMPTY_CHAR:Ljava/lang/String; = "-"


# instance fields
.field private final battery:Ljava/lang/Integer;

.field private final batteryLastTrackedAt:Ljava/lang/String;

.field private birdSummary:Lco/bird/android/model/BirdSummary;

.field private final brainState:Ljava/lang/String;

.field private final brainStateColor:Ljava/lang/Integer;

.field private final code:Ljava/lang/String;

.field private final condition:Ljava/lang/String;

.field private final displayModel:Ljava/lang/String;

.field private final model:Lco/bird/android/model/constant/BirdModel;

.field private final serviceStatus:Ljava/lang/String;

.field private final trackedAt:Ljava/lang/String;

.field private final trackedAtColor:Ljava/lang/Integer;

.field private final warehouse:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/model/BirdSummaryViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/BirdSummaryViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/BirdSummaryViewModel;->Companion:Lco/bird/android/model/BirdSummaryViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/BirdSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 15

    move-object/from16 v0, p1

    const-string v1, "birdSummary"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getModelDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getModel()Lco/bird/android/model/constant/BirdModel;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getBrainState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "-"

    if-nez v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object v8, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getBrainStateColor()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getCondition()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object v10, v1

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getTrackedAtColor()Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdSummary;->getBatteryLevel()Ljava/lang/Integer;

    move-result-object v13

    move-object v2, p0

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v11, p2

    move-object/from16 v14, p3

    invoke-direct/range {v2 .. v14}, Lco/bird/android/model/BirdSummaryViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object v1, p0

    iput-object v0, v1, Lco/bird/android/model/BirdSummaryViewModel;->birdSummary:Lco/bird/android/model/BirdSummary;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "brainState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "condition"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    iput-object p4, p0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    iput-object p8, p0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    iput-object p9, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    iput-object p10, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    iput-object p11, p0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    iput-object p12, p0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/BirdSummaryViewModel;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/BirdSummaryViewModel;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

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

    invoke-virtual/range {p0 .. p12}, Lco/bird/android/model/BirdSummaryViewModel;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/BirdSummaryViewModel;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/BirdModel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/BirdSummaryViewModel;
    .locals 14

    const-string v0, "brainState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "condition"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BirdSummaryViewModel;

    move-object v1, v0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lco/bird/android/model/BirdSummaryViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/BirdSummaryViewModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/BirdSummaryViewModel;

    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBattery()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBatteryLastTrackedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getBirdSummary()Lco/bird/android/model/BirdSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->birdSummary:Lco/bird/android/model/BirdSummary;

    return-object v0
.end method

.method public final getBrainState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    return-object v0
.end method

.method public final getBrainStateColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getCondition()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayModel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    return-object v0
.end method

.method public final getModel()Lco/bird/android/model/constant/BirdModel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    return-object v0
.end method

.method public final getServiceStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackedAtColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWarehouse()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public final setBirdSummary(Lco/bird/android/model/BirdSummary;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/BirdSummaryViewModel;->birdSummary:Lco/bird/android/model/BirdSummary;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lco/bird/android/model/BirdSummaryViewModel;->code:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/BirdSummaryViewModel;->displayModel:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/BirdSummaryViewModel;->model:Lco/bird/android/model/constant/BirdModel;

    iget-object v3, p0, Lco/bird/android/model/BirdSummaryViewModel;->warehouse:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/BirdSummaryViewModel;->serviceStatus:Ljava/lang/String;

    iget-object v5, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainState:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/android/model/BirdSummaryViewModel;->brainStateColor:Ljava/lang/Integer;

    iget-object v7, p0, Lco/bird/android/model/BirdSummaryViewModel;->condition:Ljava/lang/String;

    iget-object v8, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAt:Ljava/lang/String;

    iget-object v9, p0, Lco/bird/android/model/BirdSummaryViewModel;->trackedAtColor:Ljava/lang/Integer;

    iget-object v10, p0, Lco/bird/android/model/BirdSummaryViewModel;->battery:Ljava/lang/Integer;

    iget-object v11, p0, Lco/bird/android/model/BirdSummaryViewModel;->batteryLastTrackedAt:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "BirdSummaryViewModel(code="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayModel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", warehouse="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", serviceStatus="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", brainState="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", brainStateColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", condition="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", trackedAt="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", trackedAtColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", battery="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", batteryLastTrackedAt="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
