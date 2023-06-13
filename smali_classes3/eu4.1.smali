.class public final Leu4;
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
        "Leu4;",
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
        "release-assignment_release"
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
        "SMAP\nReleaseAssignmentAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapterDiff.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,28:1\n18#2:29\n18#2:34\n18#2:39\n18#2:44\n18#2:49\n9#3,4:30\n9#3,4:35\n9#3,4:40\n9#3,4:45\n9#3,4:50\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapterDiff.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapterDiff\n*L\n15#1:29\n16#1:34\n17#1:39\n18#1:44\n19#1:49\n15#1:30,4\n16#1:35,4\n17#1:40,4\n18#1:45,4\n19#1:50,4\n*E\n"
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

    sget v1, Luj4;->item_group_header:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/ZoneAssignmentGroup;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, Lco/bird/android/model/persistence/ZoneAssignmentGroup;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lco/bird/android/model/persistence/ZoneAssignmentGroup;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    move-object v3, p1

    goto :goto_0

    :cond_2
    sget v1, Luj4;->item_group_empty_text:I

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    move-object v3, v2

    goto :goto_0

    :cond_5
    sget v1, Luj4;->item_release_assignment:I

    if-ne v0, v1, :cond_7

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    if-eqz v0, :cond_6

    move-object v2, p1

    :cond_6
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_7
    sget v1, Luj4;->item_capped_zone_reservation_group_header:I

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;

    if-eqz v0, :cond_8

    move-object v2, p1

    :cond_8
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_9
    sget v1, Luj4;->item_capped_zone_reservation:I

    if-ne v0, v1, :cond_b

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;

    if-eqz v0, :cond_a

    move-object v2, p1

    :cond_a
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_b
    :goto_0
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newItem"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
