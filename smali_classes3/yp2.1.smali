.class public final Lyp2;
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
        "Lyp2;",
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
        "SMAP\nLegacyWorkOrderInspectionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapterDiff.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,49:1\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapterDiff.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapterDiff\n*L\n18#1:50\n19#1:55\n20#1:60\n21#1:65\n33#1:70\n37#1:75\n38#1:80\n43#1:85\n18#1:51,4\n19#1:56,4\n20#1:61,4\n21#1:66,4\n33#1:71,4\n37#1:76,4\n38#1:81,4\n43#1:86,4\n*E\n"
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

    sget v1, LXj4;->item_vehicle_summary:I

    if-ne v0, v1, :cond_0

    const-string p1, "summary"

    goto/16 :goto_2

    :cond_0
    sget v1, LXj4;->item_inspect_instructions:I

    if-ne v0, v1, :cond_1

    const-string p1, "instructions"

    goto/16 :goto_2

    :cond_1
    sget v1, Lmk4;->item_button_secondary:I

    if-ne v0, v1, :cond_2

    const-string p1, "commands"

    goto/16 :goto_2

    :cond_2
    sget v1, LXj4;->item_category_header:I

    const-string v2, ""

    const/4 v3, 0x0

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LMg0;

    if-eqz v0, :cond_3

    move-object v3, p1

    :cond_3
    check-cast v3, LMg0;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LMg0;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_e

    :cond_4
    :goto_0
    move-object p1, v2

    goto/16 :goto_2

    :cond_5
    sget v1, LXj4;->item_issue_empty:I

    if-ne v0, v1, :cond_7

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_6

    move-object v3, p1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "-empty"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_7
    sget v1, LXj4;->item_issue_header:I

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/IssueType;

    if-eqz v0, :cond_8

    move-object v3, p1

    :cond_8
    check-cast v3, Lco/bird/android/model/IssueType;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_e

    goto :goto_0

    :cond_9
    sget v1, LXj4;->item_dropdown_button:I

    if-ne v0, v1, :cond_c

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_a

    goto :goto_1

    :cond_a
    move-object p1, v3

    :goto_1
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-button"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_c
    sget p1, LXj4;->item_work_order_notes:I

    if-ne v0, p1, :cond_d

    const-string p1, "notes"

    goto :goto_2

    :cond_d
    sget p1, Lmk4;->item_button:I

    if-ne v0, p1, :cond_4

    const-string p1, "submit"

    :cond_e
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

    sget v1, LXj4;->item_vehicle_summary:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto/16 :goto_a

    :cond_0
    sget v1, Lmk4;->item_button_secondary:I

    if-ne v0, v1, :cond_1

    goto/16 :goto_a

    :cond_1
    sget v1, LXj4;->item_category_header:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LMg0;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v4

    :goto_0
    check-cast p1, LMg0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LMg0;->c()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v4

    :goto_1
    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LMg0;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, v4

    :goto_2
    check-cast p2, LMg0;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, LMg0;->c()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :cond_5
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    :goto_3
    move v2, v3

    goto/16 :goto_a

    :cond_6
    sget v1, LXj4;->item_work_order_notes:I

    if-ne v0, v1, :cond_7

    goto/16 :goto_a

    :cond_7
    sget v1, Lmk4;->item_button:I

    if-ne v0, v1, :cond_c

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LeT5;

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    move-object p1, v4

    :goto_4
    check-cast p1, LeT5;

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LeT5;

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    move-object p2, v4

    :goto_5
    check-cast p2, LeT5;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, LeT5;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_6

    :cond_a
    move-object p1, v4

    :goto_6
    if-eqz p2, :cond_b

    invoke-virtual {p2}, LeT5;->b()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :cond_b
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_3

    :cond_c
    sget v1, LXj4;->item_dropdown_button:I

    if-ne v0, v1, :cond_11

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    move-object p1, v4

    :goto_7
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_8

    :cond_e
    move-object p1, v4

    :goto_8
    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lkotlin/Pair;

    if-eqz v0, :cond_f

    goto :goto_9

    :cond_f
    move-object p2, v4

    :goto_9
    check-cast p2, Lkotlin/Pair;

    if-eqz p2, :cond_10

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    :cond_10
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_3

    :cond_11
    :goto_a
    return v2
.end method
