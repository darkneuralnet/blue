.class public final Lco/bird/android/model/wire/configs/OperatorTaskListConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BK\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000cR\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/OperatorTaskListConfig;",
        "",
        "enabled",
        "",
        "enableAlarmAction",
        "enableLockAction",
        "enableCancelTaskAction",
        "enableDirectTaskCancel",
        "showTaskLimit",
        "v2",
        "(ZZZZZZZ)V",
        "getEnableAlarmAction",
        "()Z",
        "getEnableCancelTaskAction",
        "getEnableDirectTaskCancel",
        "getEnableLockAction",
        "getEnabled",
        "getShowTaskLimit",
        "getV2",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
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
.field private final enableAlarmAction:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_alarm_action"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_alarm_action"
    .end annotation
.end field

.field private final enableCancelTaskAction:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_cancel_task_action"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_cancel_task_action"
    .end annotation
.end field

.field private final enableDirectTaskCancel:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_direct_task_cancel"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_direct_task_cancel"
    .end annotation
.end field

.field private final enableLockAction:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_lock_action"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_lock_action"
    .end annotation
.end field

.field private final enabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final showTaskLimit:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_task_limit"
    .end annotation

    .annotation runtime Lft5;
        value = "show_task_limit"
    .end annotation
.end field

.field private final v2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "v2"
    .end annotation

    .annotation runtime Lft5;
        value = "v2"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7f

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;-><init>(ZZZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    iput-boolean p4, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    iput-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    iput-boolean p6, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    iput-boolean p7, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p9, v0

    goto :goto_0

    :cond_0
    move p9, p1

    :goto_0
    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    move v3, p4

    :goto_3
    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    move v4, v0

    goto :goto_4

    :cond_4
    move v4, p5

    :goto_4
    and-int/lit8 p1, p8, 0x20

    if-eqz p1, :cond_5

    move v5, v0

    goto :goto_5

    :cond_5
    move v5, p6

    :goto_5
    and-int/lit8 p1, p8, 0x40

    if-eqz p1, :cond_6

    move p8, v0

    goto :goto_6

    :cond_6
    move p8, p7

    :goto_6
    move-object p1, p0

    move p2, p9

    move p3, v1

    move p4, v2

    move p5, v3

    move p6, v4

    move p7, v5

    invoke-direct/range {p1 .. p8}, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;-><init>(ZZZZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/OperatorTaskListConfig;ZZZZZZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorTaskListConfig;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    :cond_1
    move p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    :cond_5
    move v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-boolean p7, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    :cond_6
    move v4, p7

    move-object p2, p0

    move p3, p1

    move p4, p9

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    move p9, v4

    invoke-virtual/range {p2 .. p9}, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->copy(ZZZZZZZ)Lco/bird/android/model/wire/configs/OperatorTaskListConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    return v0
.end method

.method public final copy(ZZZZZZZ)Lco/bird/android/model/wire/configs/OperatorTaskListConfig;
    .locals 9

    new-instance v8, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;

    move-object v0, v8

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;-><init>(ZZZZZZZ)V

    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getEnableAlarmAction()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    return v0
.end method

.method public final getEnableCancelTaskAction()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    return v0
.end method

.method public final getEnableDirectTaskCancel()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    return v0
.end method

.method public final getEnableLockAction()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    return v0
.end method

.method public final getShowTaskLimit()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    return v0
.end method

.method public final getV2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enabled:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableAlarmAction:Z

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableLockAction:Z

    iget-boolean v3, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableCancelTaskAction:Z

    iget-boolean v4, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->enableDirectTaskCancel:Z

    iget-boolean v5, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->showTaskLimit:Z

    iget-boolean v6, p0, Lco/bird/android/model/wire/configs/OperatorTaskListConfig;->v2:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "OperatorTaskListConfig(enabled="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableAlarmAction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableLockAction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableCancelTaskAction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableDirectTaskCancel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showTaskLimit="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", v2="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
