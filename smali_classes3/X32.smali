.class public final LX32;
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
        "LX32;",
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
        "SMAP\nInspectionV3AdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3AdapterDiff.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3AdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,40:1\n18#2:41\n18#2:46\n18#2:51\n9#3,4:42\n9#3,4:47\n9#3,4:52\n*S KotlinDebug\n*F\n+ 1 InspectionV3AdapterDiff.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3AdapterDiff\n*L\n16#1:41\n25#1:46\n30#1:51\n16#1:42,4\n25#1:47,4\n30#1:52,4\n*E\n"
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
    .locals 3

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Lmk4;->item_vehicle_servicing_vehicle_info:I

    if-ne v0, v1, :cond_0

    const-string p1, "Vehicle Info"

    goto :goto_1

    :cond_0
    sget v1, LXj4;->item_inspection_instructions:I

    if-ne v0, v1, :cond_1

    const-string p1, "Instructions"

    goto :goto_1

    :cond_1
    sget v1, LXj4;->item_inspection_category:I

    const-string v2, ""

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LQ32;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LQ32;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LQ32;->f()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    move-object p1, v2

    :cond_4
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

    instance-of v0, p1, Lco/bird/android/model/InspectionFlow;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/InspectionFlow;

    if-eqz v0, :cond_0

    move-object v1, p2

    :cond_0
    check-cast v1, Lco/bird/android/model/InspectionFlow;

    if-eqz v1, :cond_1

    move-object p2, p1

    check-cast p2, Lco/bird/android/model/InspectionFlow;

    invoke-virtual {p2}, Lco/bird/android/model/InspectionFlow;->getBatteryLevel()I

    move-result p2

    invoke-virtual {v1}, Lco/bird/android/model/InspectionFlow;->getBatteryLevel()I

    move-result v0

    if-ne p2, v0, :cond_1

    move p2, v2

    goto :goto_0

    :cond_1
    move p2, v3

    :goto_0
    if-eqz p2, :cond_7

    check-cast p1, Lco/bird/android/model/InspectionFlow;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionFlow;->getMarker()Lco/bird/android/model/wire/WireMapMarker;

    move-result-object p1

    invoke-virtual {v1}, Lco/bird/android/model/InspectionFlow;->getMarker()Lco/bird/android/model/wire/WireMapMarker;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_2
    instance-of v0, p1, LQ32;

    if-eqz v0, :cond_6

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LQ32;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p2, v1

    :goto_1
    check-cast p2, LQ32;

    check-cast p1, LQ32;

    invoke-virtual {p1}, LQ32;->i()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LQ32;->i()Ljava/lang/Boolean;

    move-result-object v1

    :cond_4
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz p2, :cond_5

    invoke-virtual {p1}, LQ32;->e()Z

    move-result v0

    invoke-virtual {p2}, LQ32;->e()Z

    move-result v1

    if-ne v0, v1, :cond_5

    move v0, v2

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    if-eqz v0, :cond_7

    invoke-virtual {p1}, LQ32;->j()LH6;

    move-result-object p1

    invoke-virtual {p2}, LQ32;->j()LH6;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    move v2, v3

    :cond_7
    :goto_3
    return v2
.end method
