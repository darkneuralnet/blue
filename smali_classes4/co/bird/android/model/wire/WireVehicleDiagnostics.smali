.class public final Lco/bird/android/model/wire/WireVehicleDiagnostics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0008H\u00c6\u0003JA\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
        "",
        "imei",
        "Lco/bird/android/model/wire/WireDisplayValue;",
        "iccid",
        "stmver",
        "lastTrack",
        "vehFaults",
        "",
        "(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)V",
        "getIccid",
        "()Lco/bird/android/model/wire/WireDisplayValue;",
        "getImei",
        "getLastTrack",
        "getStmver",
        "getVehFaults",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final iccid:Lco/bird/android/model/wire/WireDisplayValue;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "iccid"
    .end annotation

    .annotation runtime Lft5;
        value = "iccid"
    .end annotation
.end field

.field private final imei:Lco/bird/android/model/wire/WireDisplayValue;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "imei"
    .end annotation

    .annotation runtime Lft5;
        value = "imei"
    .end annotation
.end field

.field private final lastTrack:Lco/bird/android/model/wire/WireDisplayValue;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "last_track"
    .end annotation

    .annotation runtime Lft5;
        value = "last_track"
    .end annotation
.end field

.field private final stmver:Lco/bird/android/model/wire/WireDisplayValue;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "stmver"
    .end annotation

    .annotation runtime Lft5;
        value = "stmver"
    .end annotation
.end field

.field private final vehFaults:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "veh_faults"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "veh_faults"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            ">;)V"
        }
    .end annotation

    const-string v0, "imei"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iccid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stmver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastTrack"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehFaults"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    iput-object p2, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    iput-object p3, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    iput-object p4, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    iput-object p5, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p5

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireVehicleDiagnostics;-><init>(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireVehicleDiagnostics;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/wire/WireVehicleDiagnostics;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/WireVehicleDiagnostics;->copy(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)Lco/bird/android/model/wire/WireVehicleDiagnostics;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)Lco/bird/android/model/wire/WireVehicleDiagnostics;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            ">;)",
            "Lco/bird/android/model/wire/WireVehicleDiagnostics;"
        }
    .end annotation

    const-string v0, "imei"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iccid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stmver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastTrack"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehFaults"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireVehicleDiagnostics;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WireVehicleDiagnostics;-><init>(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;

    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v3, p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v3, p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v3, p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v3, p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getIccid()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final getImei()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final getLastTrack()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final getStmver()Lco/bird/android/model/wire/WireDisplayValue;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    return-object v0
.end method

.method public final getVehFaults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireDisplayValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireDisplayValue;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireDisplayValue;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireDisplayValue;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireDisplayValue;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->imei:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v1, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->iccid:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v2, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->stmver:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v3, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->lastTrack:Lco/bird/android/model/wire/WireDisplayValue;

    iget-object v4, p0, Lco/bird/android/model/wire/WireVehicleDiagnostics;->vehFaults:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WireVehicleDiagnostics(imei="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iccid="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stmver="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastTrack="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vehFaults="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
