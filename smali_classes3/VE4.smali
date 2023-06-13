.class public final LVE4;
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
        "LVE4;",
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
        "SMAP\nRepairV3OverviewAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapterDiff.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n18#2:38\n18#2:43\n9#3,4:39\n9#3,4:44\n1#4:48\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapterDiff.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapterDiff\n*L\n16#1:38\n25#1:43\n16#1:39,4\n25#1:44,4\n*E\n"
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

    const-string p1, "vehicle_info"

    goto :goto_2

    :cond_0
    sget v1, LEj4;->item_repair_category:I

    const-string v2, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIy4;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LIy4;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LIy4;->e()Lco/bird/android/model/RepairCategory;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/RepairCategory;->getDisplay()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_2
    sget p1, LEj4;->item_quick_links_section:I

    if-ne v0, p1, :cond_3

    const-string p1, "quick_links"

    goto :goto_2

    :cond_3
    :goto_1
    move-object p1, v2

    :cond_4
    :goto_2
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 6

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIy4;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v2, p2, LIy4;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    check-cast p2, LIy4;

    if-eqz v0, :cond_1

    check-cast p1, LIy4;

    goto :goto_1

    :cond_1
    move-object p1, v3

    :goto_1
    const/4 v0, 0x1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LIy4;->a()Lco/bird/android/model/RepairCategory;

    move-result-object v2

    invoke-virtual {p1}, LIy4;->b()LH6;

    move-result-object v4

    invoke-virtual {p1}, LIy4;->c()Z

    move-result p1

    invoke-virtual {v2}, Lco/bird/android/model/RepairCategory;->getDescription()Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, LIy4;->e()Lco/bird/android/model/RepairCategory;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lco/bird/android/model/RepairCategory;->getDescription()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz p2, :cond_3

    invoke-virtual {p2}, LIy4;->f()LH6;

    move-result-object v3

    :cond_3
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p2}, LIy4;->g()Z

    move-result p2

    if-eq p1, p2, :cond_5

    :cond_4
    move v1, v0

    :cond_5
    return v1
.end method
