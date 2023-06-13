.class public final Lgt1;
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
        "Lgt1;",
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
        "flight-sheet_release"
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
        "SMAP\nFlightSheetV2AdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2AdapterDiff.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2AdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,69:1\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n18#2:90\n18#2:95\n18#2:100\n18#2:105\n18#2:110\n18#2:115\n18#2:120\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n9#3,4:91\n9#3,4:96\n9#3,4:101\n9#3,4:106\n9#3,4:111\n9#3,4:116\n9#3,4:121\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2AdapterDiff.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2AdapterDiff\n*L\n24#1:70\n27#1:75\n28#1:80\n29#1:85\n34#1:90\n43#1:95\n49#1:100\n53#1:105\n57#1:110\n61#1:115\n64#1:120\n24#1:71,4\n27#1:76,4\n28#1:81,4\n29#1:86,4\n34#1:91,4\n43#1:96,4\n49#1:101,4\n53#1:106,4\n57#1:111,4\n61#1:116,4\n64#1:121,4\n*E\n"
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

    sget v1, LZj4;->item_flight_sheet_summary:I

    if-ne v0, v1, :cond_0

    const-string p1, "summary"

    goto/16 :goto_2

    :cond_0
    sget v1, LZj4;->item_flight_sheet_campaign:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/CampaignButton;

    if-eqz v0, :cond_1

    move-object v2, p1

    :cond_1
    check-cast v2, Lco/bird/android/model/CampaignButton;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/CampaignButton;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    :cond_2
    :goto_0
    move-object p1, v3

    goto/16 :goto_2

    :cond_3
    sget v1, LZj4;->item_flight_sheet_summary_quick_capture:I

    if-ne v0, v1, :cond_4

    const-string p1, "quick_capture"

    goto/16 :goto_2

    :cond_4
    sget v1, LZj4;->item_flight_sheet_status:I

    if-ne v0, v1, :cond_5

    const-string p1, "status"

    goto/16 :goto_2

    :cond_5
    sget v1, LZj4;->item_flight_sheet_command:I

    if-ne v0, v1, :cond_7

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/VehicleCommand;

    if-eqz v0, :cond_6

    move-object v2, p1

    :cond_6
    check-cast v2, Lco/bird/android/model/VehicleCommand;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/VehicleCommand;->getCommand()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    goto :goto_0

    :cond_7
    sget v1, LZj4;->item_collapsable_header:I

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LVl0;

    if-eqz v0, :cond_8

    move-object v2, p1

    :cond_8
    check-cast v2, LVl0;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LVl0;->d()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    goto :goto_0

    :cond_9
    sget v1, LZj4;->item_labeled_detail:I

    if-ne v0, v1, :cond_b

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;

    if-eqz v0, :cond_a

    move-object v2, p1

    :cond_a
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;->getLabel()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    goto :goto_0

    :cond_b
    sget v1, LZj4;->item_labeled_rating:I

    if-ne v0, v1, :cond_c

    const-string p1, "rating"

    goto :goto_2

    :cond_c
    sget v1, LZj4;->item_last_ride_map:I

    if-ne v0, v1, :cond_d

    const-string p1, "map"

    goto :goto_2

    :cond_d
    sget v1, LZj4;->item_last_ride_photo:I

    if-ne v0, v1, :cond_e

    const-string p1, "photo"

    goto :goto_2

    :cond_e
    sget v1, Lmk4;->item_button_secondary:I

    const/4 v4, 0x1

    if-ne v0, v1, :cond_f

    goto :goto_1

    :cond_f
    sget v1, Lmk4;->item_white_button_with_end_chevron:I

    if-ne v0, v1, :cond_10

    goto :goto_1

    :cond_10
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/FlightSheetButton;

    if-eqz v0, :cond_11

    move-object v2, p1

    :cond_11
    check-cast v2, Lco/bird/android/model/FlightSheetButton;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/FlightSheetButton;->getText()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    goto/16 :goto_0

    :cond_12
    :goto_2
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

    instance-of v0, p1, LTU5;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_0
    move v1, v2

    goto/16 :goto_6

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/QuickCaptureButton;

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/QuickCaptureButton;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, v3

    :goto_0
    check-cast p2, Lco/bird/android/model/QuickCaptureButton;

    check-cast p1, Lco/bird/android/model/QuickCaptureButton;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/QuickCaptureButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/QuickCaptureButton;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v3

    if-ne v0, v3, :cond_15

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getTimeout()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/QuickCaptureButton;->getTimeout()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_4
    instance-of v0, p1, Lco/bird/android/model/CampaignButton;

    if-eqz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    instance-of v0, p1, LGQ5;

    if-eqz v0, :cond_6

    goto/16 :goto_6

    :cond_6
    instance-of v0, p1, Lco/bird/android/model/VehicleCommand;

    if-eqz v0, :cond_9

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/VehicleCommand;

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    move-object p2, v3

    :goto_1
    check-cast p2, Lco/bird/android/model/VehicleCommand;

    check-cast p1, Lco/bird/android/model/VehicleCommand;

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getCommand()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lco/bird/android/model/VehicleCommand;->getCommand()Ljava/lang/String;

    move-result-object v3

    :cond_8
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_9
    instance-of v0, p1, Lco/bird/android/model/FlightSheetButton;

    if-eqz v0, :cond_c

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/FlightSheetButton;

    if-eqz v0, :cond_a

    goto :goto_2

    :cond_a
    move-object p2, v3

    :goto_2
    check-cast p2, Lco/bird/android/model/FlightSheetButton;

    check-cast p1, Lco/bird/android/model/FlightSheetButton;

    invoke-virtual {p1}, Lco/bird/android/model/FlightSheetButton;->getText()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Lco/bird/android/model/FlightSheetButton;->getText()Ljava/lang/String;

    move-result-object v3

    :cond_b
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_c
    instance-of v0, p1, LXL2;

    if-eqz v0, :cond_f

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/FlightSheetMap;

    if-eqz v0, :cond_d

    goto :goto_3

    :cond_d
    move-object p2, v3

    :goto_3
    check-cast p2, Lco/bird/android/model/FlightSheetMap;

    check-cast p1, LXL2;

    invoke-virtual {p1}, LXL2;->e()Ljava/util/List;

    move-result-object p1

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Lco/bird/android/model/FlightSheetMap;->getTracks()Ljava/util/List;

    move-result-object v3

    :cond_e
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_6

    :cond_f
    instance-of v0, p1, Lon4;

    if-eqz v0, :cond_12

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lon4;

    if-eqz v0, :cond_10

    move-object v3, p2

    :cond_10
    check-cast v3, Lon4;

    if-eqz v3, :cond_11

    check-cast p1, Lon4;

    invoke-virtual {p1}, Lon4;->d()I

    move-result p1

    invoke-virtual {v3}, Lon4;->d()I

    move-result p2

    if-ne p1, p2, :cond_11

    move p1, v1

    goto :goto_4

    :cond_11
    move p1, v2

    :goto_4
    if-nez p1, :cond_0

    goto :goto_6

    :cond_12
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;

    if-eqz v0, :cond_0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;->getDetail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;

    if-eqz v0, :cond_13

    goto :goto_5

    :cond_13
    move-object p2, v3

    :goto_5
    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;

    if-eqz p2, :cond_14

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;->getDetail()Ljava/lang/String;

    move-result-object v3

    :cond_14
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    :cond_15
    :goto_6
    return v1
.end method
