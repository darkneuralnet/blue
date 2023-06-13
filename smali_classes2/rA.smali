.class public abstract LrA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "LrA;",
        "LF6;",
        "LG6;",
        "adapterItem",
        "",
        "b",
        "oldItem",
        "newItem",
        "",
        "c",
        "<init>",
        "()V",
        "co.bird.android.commandcenter"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseCommandCenterAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapterDiff.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n18#2:88\n18#2:93\n18#2:98\n18#2:103\n18#2:108\n18#2:113\n18#2:118\n18#2:123\n18#2:128\n18#2:133\n18#2:138\n9#3,4:84\n9#3,4:89\n9#3,4:94\n9#3,4:99\n9#3,4:104\n9#3,4:109\n9#3,4:114\n9#3,4:119\n9#3,4:124\n9#3,4:129\n9#3,4:134\n9#3,4:139\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapterDiff.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapterDiff\n*L\n22#1:83\n24#1:88\n28#1:93\n32#1:98\n36#1:103\n40#1:108\n45#1:113\n48#1:118\n59#1:123\n64#1:128\n71#1:133\n75#1:138\n22#1:84,4\n24#1:89,4\n28#1:94,4\n32#1:99,4\n36#1:104,4\n40#1:109,4\n45#1:114,4\n48#1:119,4\n59#1:124,4\n64#1:129,4\n71#1:134,4\n75#1:139,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/util/List<",
            "LH6;",
            ">;)",
            "Landroidx/recyclerview/widget/h$e;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LF6$a;->a(LF6;Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object p1

    return-object p1
.end method

.method public b(LG6;)Ljava/lang/String;
    .locals 5

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Lyj4;->item_command_center_header:I

    const-string v2, ""

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LVl0;

    if-eqz v0, :cond_0

    move-object v3, p1

    :cond_0
    check-cast v3, LVl0;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, LVl0;->d()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_8

    :cond_1
    move-object v2, p1

    goto/16 :goto_8

    :cond_2
    sget v1, Lyj4;->item_command_center_notice:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/CommandCenterNotice;

    if-eqz v0, :cond_3

    move-object v3, p1

    :cond_3
    check-cast v3, Lco/bird/android/model/CommandCenterNotice;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lco/bird/android/model/CommandCenterNotice;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_8

    :cond_4
    sget v1, Lnj4;->item_command_center_command:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/VehicleCommand;

    if-eqz v0, :cond_5

    move-object v3, p1

    :cond_5
    check-cast v3, Lco/bird/android/model/VehicleCommand;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lco/bird/android/model/VehicleCommand;->getCommand()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_8

    :cond_6
    sget v1, Lyj4;->item_command_center_repair_log:I

    const-string v4, "."

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/RepairLog;

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    move-object p1, v3

    :goto_0
    check-cast p1, Lco/bird/android/model/RepairLog;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairType()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_8
    move-object v0, v3

    :goto_1
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getCreatedAtTime()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_8

    :cond_a
    sget v1, Lyj4;->item_command_center_diagnostic:I

    if-ne v0, v1, :cond_f

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/DamageTrack;

    if-eqz v0, :cond_b

    goto :goto_2

    :cond_b
    move-object p1, v3

    :goto_2
    check-cast p1, Lco/bird/android/model/DamageTrack;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/DamageTrack;->getCodeHeader()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_c
    move-object v0, v3

    :goto_3
    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lco/bird/android/model/DamageTrack;->getCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_d
    move-object v1, v3

    :goto_4
    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lco/bird/android/model/DamageTrack;->getCreatedAtTime()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_8

    :cond_f
    sget v1, Lyj4;->item_command_center_details:I

    if-ne v0, v1, :cond_13

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Detail;

    if-eqz v0, :cond_10

    goto :goto_5

    :cond_10
    move-object p1, v3

    :goto_5
    check-cast p1, Lco/bird/android/model/Detail;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lco/bird/android/model/Detail;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_11
    move-object v0, v3

    :goto_6
    if-eqz p1, :cond_12

    invoke-virtual {p1}, Lco/bird/android/model/Detail;->getDetail()Ljava/lang/String;

    move-result-object v3

    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    :cond_13
    sget v1, Lyj4;->item_work_order_header:I

    if-ne v0, v1, :cond_14

    const-string v2, "active_work_order_header"

    goto :goto_8

    :cond_14
    sget v1, Lyj4;->item_work_order_issue_header:I

    if-ne v0, v1, :cond_16

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_15

    move-object v3, p1

    :cond_15
    check-cast v3, Lco/bird/android/model/Issue;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_8

    :cond_16
    sget v1, Lmk4;->item_button:I

    const/4 v4, 0x1

    if-ne v0, v1, :cond_17

    goto :goto_7

    :cond_17
    sget v1, Lmk4;->item_button_secondary:I

    if-ne v0, v1, :cond_18

    goto :goto_7

    :cond_18
    const/4 v4, 0x0

    :goto_7
    if-eqz v4, :cond_1a

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/CommandCenterButton;

    if-eqz v0, :cond_19

    move-object v3, p1

    :cond_19
    check-cast v3, Lco/bird/android/model/CommandCenterButton;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lco/bird/android/model/CommandCenterButton;->getText()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_1a
    :goto_8
    return-object v2
.end method

.method public c(LG6;LG6;)Z
    .locals 4

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lun6;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/Detail;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/Detail;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v3

    :goto_0
    check-cast p2, Lco/bird/android/model/Detail;

    check-cast p1, Lco/bird/android/model/Detail;

    invoke-virtual {p1}, Lco/bird/android/model/Detail;->getDetail()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/Detail;->getDetail()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_3

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_6

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move-object p2, v3

    :goto_1
    check-cast p2, Lco/bird/android/model/Issue;

    check-cast p1, Lco/bird/android/model/Issue;

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v3

    if-ne v0, v3, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatusColor()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/Issue;->getStatusColor()Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_3

    :cond_6
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_8

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_7

    move-object v3, p2

    :cond_7
    check-cast v3, Ljava/lang/String;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_3

    :cond_8
    instance-of v0, p1, Lco/bird/android/model/CommandCenterButton;

    if-eqz v0, :cond_b

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/CommandCenterButton;

    if-eqz v0, :cond_9

    goto :goto_2

    :cond_9
    move-object p2, v3

    :goto_2
    check-cast p2, Lco/bird/android/model/CommandCenterButton;

    check-cast p1, Lco/bird/android/model/CommandCenterButton;

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getText()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lco/bird/android/model/CommandCenterButton;->getText()Ljava/lang/String;

    move-result-object v3

    :cond_a
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_3

    :cond_b
    move v1, v2

    :cond_c
    :goto_3
    return v1
.end method
