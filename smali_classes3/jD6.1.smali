.class public final LjD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "LjD6;",
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
        "workorders_release"
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
        "SMAP\nWorkOrderDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapterDiff.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,44:1\n18#2:45\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n9#3,4:46\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapterDiff.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapterDiff\n*L\n16#1:45\n17#1:50\n19#1:55\n29#1:60\n35#1:65\n16#1:46,4\n17#1:51,4\n19#1:56,4\n29#1:61,4\n35#1:66,4\n*E\n"
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

    sget v1, LXj4;->item_bird_code_and_model:I

    if-ne v0, v1, :cond_0

    const-string p1, "model"

    goto/16 :goto_1

    :cond_0
    sget v1, LXj4;->item_work_order_header:I

    if-ne v0, v1, :cond_1

    const-string p1, "header"

    goto :goto_1

    :cond_1
    sget v1, LXj4;->item_issue_header:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_2

    move-object v2, p1

    :cond_2
    check-cast v2, Lco/bird/android/model/Issue;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    :cond_3
    :goto_0
    move-object p1, v3

    goto :goto_1

    :cond_4
    sget v1, LXj4;->item_work_order_repair:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/LegacyRepair;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    check-cast v2, Lco/bird/android/model/LegacyRepair;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/LegacyRepair;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_6
    sget v1, LXj4;->item_work_order_details_header:I

    if-ne v0, v1, :cond_7

    const-string p1, "details"

    goto :goto_1

    :cond_7
    sget v1, LXj4;->item_work_order_details:I

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_8

    move-object v2, p1

    :cond_8
    check-cast v2, Lkotlin/Pair;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_a

    goto :goto_0

    :cond_9
    sget p1, LXj4;->item_work_order_details_add:I

    if-ne v0, p1, :cond_3

    const-string p1, "add"

    :cond_a
    :goto_1
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 5

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lkotlin/Pair;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    check-cast p2, Lkotlin/Pair;

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    :cond_2
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_4

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/Issue;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, v3

    :goto_2
    check-cast p2, Lco/bird/android/model/Issue;

    check-cast p1, Lco/bird/android/model/Issue;

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v4

    goto :goto_3

    :cond_5
    move-object v4, v3

    :goto_3
    if-ne v0, v4, :cond_8

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatusColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lco/bird/android/model/Issue;->getStatusColor()Ljava/lang/Integer;

    move-result-object v3

    :cond_6
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_4

    :cond_7
    move v1, v2

    :cond_8
    :goto_4
    return v1
.end method
