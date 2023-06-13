.class public final LHI6;
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
        "LHI6;",
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
        "zone-flight-sheet_release"
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
        "SMAP\nZoneFlightSheetAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapterDiff.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,42:1\n18#2:43\n18#2:48\n18#2:53\n18#2:58\n18#2:63\n9#3,4:44\n9#3,4:49\n9#3,4:54\n9#3,4:59\n9#3,4:64\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapterDiff.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapterDiff\n*L\n17#1:43\n18#1:48\n26#1:53\n31#1:58\n35#1:63\n17#1:44,4\n18#1:49,4\n26#1:54,4\n31#1:59,4\n35#1:64,4\n*E\n"
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

    sget v1, LYj4;->item_zone_flight_sheet_summary:I

    if-ne v0, v1, :cond_0

    const-string p1, "summary"

    goto :goto_1

    :cond_0
    sget v1, LYj4;->item_zone_flight_sheet_status:I

    if-ne v0, v1, :cond_1

    const-string p1, "status"

    goto :goto_1

    :cond_1
    sget v1, LYj4;->item_zone_flight_sheet_details_title:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    if-eqz v0, :cond_2

    move-object v2, p1

    :cond_2
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_3
    sget v1, LYj4;->item_zone_flight_sheet_detail:I

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    if-eqz v0, :cond_4

    move-object v2, p1

    :cond_4
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    :cond_5
    :goto_0
    move-object p1, v3

    :cond_6
    :goto_1
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 4

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;->getTitle()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    if-eqz v0, :cond_3

    :goto_1
    move v1, v3

    goto :goto_2

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    if-eqz v0, :cond_5

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    if-eqz v0, :cond_4

    move-object v2, p2

    :cond_4
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    if-eqz v0, :cond_6

    move-object v2, p2

    :cond_6
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    :goto_2
    return v1
.end method
