.class public LQB4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "LQB4;",
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
        "repair_release"
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
        "SMAP\nRepairOverviewAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewAdapterDiff.kt\nco/bird/android/feature/repair/v1/base/adapters/RepairOverviewAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n18#2:47\n18#2:52\n18#2:57\n18#2:62\n18#2:68\n18#2:73\n18#2:78\n18#2:83\n9#3,4:48\n9#3,4:53\n9#3,4:58\n9#3,4:63\n9#3,4:69\n9#3,4:74\n9#3,4:79\n9#3,4:84\n1#4:67\n*S KotlinDebug\n*F\n+ 1 RepairOverviewAdapterDiff.kt\nco/bird/android/feature/repair/v1/base/adapters/RepairOverviewAdapterDiff\n*L\n19#1:47\n20#1:52\n21#1:57\n23#1:62\n32#1:68\n33#1:73\n37#1:78\n38#1:83\n19#1:48,4\n20#1:53,4\n21#1:58,4\n23#1:63,4\n32#1:69,4\n33#1:74,4\n37#1:79,4\n38#1:84,4\n*E\n"
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
    .locals 4

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Lnj4;->item_field_summary:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget v1, Lnj4;->item_vehicle_summary:I

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const-string p1, "summary"

    goto/16 :goto_2

    :cond_2
    sget v1, LEj4;->item_repair_work_order_header:I

    if-ne v0, v1, :cond_3

    const-string p1, "work_order_header"

    goto/16 :goto_2

    :cond_3
    sget v1, LEj4;->item_repair_notes:I

    if-ne v0, v1, :cond_4

    const-string p1, "notes"

    goto/16 :goto_2

    :cond_4
    sget v1, Lmk4;->item_button_secondary:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LRB4;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    check-cast v2, LRB4;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LRB4;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_6
    sget v1, LEj4;->item_repair_status:I

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_7

    move-object v2, p1

    :cond_7
    check-cast v2, Lco/bird/android/model/Issue;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_8
    sget v1, LEj4;->item_issue_repair:I

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/RepairType;

    if-eqz v0, :cond_9

    move-object v2, p1

    :cond_9
    check-cast v2, Lco/bird/android/model/RepairType;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lco/bird/android/model/RepairType;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_a
    sget v1, LEj4;->item_dropdown_repair_button:I

    if-ne v0, v1, :cond_c

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_b

    move-object v2, p1

    :cond_b
    check-cast v2, Lkotlin/Pair;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Issue;

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-repair"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    :cond_c
    :goto_1
    move-object p1, v3

    :cond_d
    :goto_2
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 5

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, LEj4;->item_repair_status:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    check-cast p1, Lco/bird/android/model/Issue;

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v4

    :goto_1
    check-cast p2, Lco/bird/android/model/Issue;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatusDisplay()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v4

    :goto_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/Issue;->getStatusDisplay()Ljava/lang/String;

    move-result-object v4

    :cond_3
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_6

    :cond_4
    sget v1, LEj4;->item_dropdown_repair_button:I

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, v4

    :goto_3
    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lkotlin/Pair;

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    move-object p2, v4

    :goto_4
    check-cast p2, Lkotlin/Pair;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_5

    :cond_7
    move-object p1, v4

    :goto_5
    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    :cond_8
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_6

    :cond_9
    move v2, v3

    :goto_6
    return v2
.end method
