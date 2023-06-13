.class public final Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;",
        "",
        "enableHibernate",
        "",
        "enableHibernateCreateBatch",
        "enableCharging",
        "hibernateMinBattery",
        "",
        "(ZZZI)V",
        "getEnableCharging",
        "()Z",
        "getEnableHibernate",
        "getEnableHibernateCreateBatch",
        "getHibernateMinBattery",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final enableCharging:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_charging"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_charging"
    .end annotation
.end field

.field private final enableHibernate:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_hibernation"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_hibernation"
    .end annotation
.end field

.field private final enableHibernateCreateBatch:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_hibernation_create_batch"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_hibernation_create_batch"
    .end annotation
.end field

.field private final hibernateMinBattery:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "hibernate_min_battery"
    .end annotation

    .annotation runtime Lft5;
        value = "hibernate_min_battery"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;-><init>(ZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    iput p4, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    return-void
.end method

.method public synthetic constructor <init>(ZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/16 p4, 0x28

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;-><init>(ZZZI)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;ZZZIILjava/lang/Object;)Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->copy(ZZZI)Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    return v0
.end method

.method public final copy(ZZZI)Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;-><init>(ZZZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    iget p1, p1, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEnableCharging()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    return v0
.end method

.method public final getEnableHibernate()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    return v0
.end method

.method public final getEnableHibernateCreateBatch()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    return v0
.end method

.method public final getHibernateMinBattery()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernate:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableHibernateCreateBatch:Z

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->enableCharging:Z

    iget v3, p0, Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;->hibernateMinBattery:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceCenterBulkProgressConfig(enableHibernate="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableHibernateCreateBatch="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableCharging="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hibernateMinBattery="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
