.class public final Lzq0;
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
        "Lzq0;",
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
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nComplaintResolutionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapterDiff.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,40:1\n18#2:41\n18#2:46\n18#2:51\n18#2:56\n18#2:61\n18#2:66\n18#2:71\n18#2:76\n18#2:81\n9#3,4:42\n9#3,4:47\n9#3,4:52\n9#3,4:57\n9#3,4:62\n9#3,4:67\n9#3,4:72\n9#3,4:77\n9#3,4:82\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapterDiff.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapterDiff\n*L\n17#1:41\n18#1:46\n19#1:51\n21#1:56\n22#1:61\n23#1:66\n24#1:71\n25#1:76\n34#1:81\n17#1:42,4\n18#1:47,4\n19#1:52,4\n21#1:57,4\n22#1:62,4\n23#1:67,4\n24#1:72,4\n25#1:77,4\n34#1:82,4\n*E\n"
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
    .locals 13

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, LVi4;->item_category:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lga2;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, Lga2;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    move-object v3, p1

    goto/16 :goto_0

    :cond_2
    sget v1, LVi4;->item_complaint_resolution_header:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIH1;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    check-cast v2, LIH1;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, LIH1;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_4
    sget v1, LVi4;->item_complaint_section_header:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LNq5;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    check-cast v2, LNq5;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, LNq5;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_6
    sget v1, LVi4;->item_information:I

    if-ne v0, v1, :cond_7

    const-string v3, "info"

    goto/16 :goto_0

    :cond_7
    sget v1, LVi4;->item_take_photo:I

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LAY5;

    if-eqz v0, :cond_8

    move-object v2, p1

    :cond_8
    check-cast v2, LAY5;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, LAY5;->b()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_9
    sget v1, LVi4;->item_issue:I

    if-ne v0, v1, :cond_b

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_a

    move-object v2, p1

    :cond_a
    check-cast v2, Lkotlin/Pair;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;->getValue()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_b
    sget v1, LVi4;->item_action_taken:I

    if-ne v0, v1, :cond_d

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_c

    move-object v2, p1

    :cond_c
    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_13

    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lzq0$a;->g:Lzq0$a;

    const/16 v11, 0x1f

    const/4 v12, 0x0

    invoke-static/range {v4 .. v12}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_d
    sget v1, LVi4;->item_complaint_vehicle_involved:I

    if-ne v0, v1, :cond_f

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/Bird;

    if-eqz v0, :cond_e

    move-object v2, p1

    :cond_e
    check-cast v2, Lco/bird/android/model/persistence/Bird;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_f
    sget v1, LVi4;->item_scan_vehicles:I

    if-ne v0, v1, :cond_12

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_10

    move-object v2, p1

    :cond_10
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_11

    goto :goto_0

    :cond_11
    move-object v3, v2

    goto :goto_0

    :cond_12
    sget p1, LVi4;->item_additional_notes:I

    if-ne v0, p1, :cond_13

    const-string v3, "notes"

    :cond_13
    :goto_0
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 3

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LAY5;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, LAY5;

    invoke-virtual {p1}, LAY5;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LAY5;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    check-cast p2, LAY5;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LAY5;->e()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method
