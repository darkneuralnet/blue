.class public final Loq1;
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
        "Loq1;",
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
        "co.bird.android.feature.fleet-status"
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
        "SMAP\nFleetStateAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapterDiff.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,49:1\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapterDiff.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapterDiff\n*L\n15#1:50\n16#1:55\n17#1:60\n18#1:65\n26#1:70\n32#1:75\n38#1:80\n42#1:85\n15#1:51,4\n16#1:56,4\n17#1:61,4\n18#1:66,4\n26#1:71,4\n32#1:76,4\n38#1:81,4\n42#1:86,4\n*E\n"
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

    sget v1, Laj4;->item_fleet_state:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetState;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FleetState;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, p1

    goto :goto_0

    :cond_2
    sget v1, Laj4;->item_fleet_substate:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_4
    sget v1, Laj4;->item_fleet_rating_average:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetRating;->getDescription()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_6
    sget v1, Laj4;->item_fleet_rating_group:I

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    if-eqz v0, :cond_7

    move-object v2, p1

    :cond_7
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_8
    :goto_0
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 6

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/FleetState;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/FleetState;

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetState;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getTitle()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getSubstates()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetState;->getSubstates()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_4

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    if-eqz v0, :cond_5

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p2, v3

    :goto_1
    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getTitle()Ljava/lang/String;

    move-result-object v3

    :cond_4
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v3

    if-ne v0, v3, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getActions()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;->getActions()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_4

    :cond_5
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    if-eqz v0, :cond_8

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    move-object p2, v3

    :goto_2
    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetRating;->getRating()D

    move-result-wide v4

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetRating;->getRating()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    :cond_7
    invoke-static {v4, v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(DLjava/lang/Double;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_4

    :cond_8
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    if-eqz v0, :cond_b

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    if-eqz v0, :cond_9

    move-object v3, p2

    :cond_9
    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    if-eqz v3, :cond_a

    move-object p2, p1

    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;->getCount()I

    move-result p2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;->getCount()I

    move-result v0

    if-ne p2, v0, :cond_a

    move p2, v1

    goto :goto_3

    :cond_a
    move p2, v2

    :goto_3
    if-eqz p2, :cond_c

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;->getBirdIds()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;->getBirdIds()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_4

    :cond_b
    move v1, v2

    :cond_c
    :goto_4
    return v1
.end method
