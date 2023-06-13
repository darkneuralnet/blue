.class public final Lkp1;
.super LKA;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0008\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkp1;",
        "LKA;",
        "",
        "a",
        "",
        "fleetId",
        "fleetName",
        "",
        "e",
        "Lmp1;",
        "purpose",
        "f",
        "d",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "",
        "containerId",
        "<init>",
        "(Landroidx/fragment/app/FragmentManager;I)V",
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
        "SMAP\nFleetNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetNavigator.kt\nco/bird/android/feature/fleetstatus/common/FleetNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1747#2,3:70\n*S KotlinDebug\n*F\n+ 1 FleetNavigator.kt\nco/bird/android/feature/fleetstatus/common/FleetNavigator\n*L\n40#1:70,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;I)V
    .locals 1

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LKA;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    return-void
.end method

.method public static synthetic goToFleetStatus$default(Lkp1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lkp1;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    invoke-virtual {p0}, LKA;->b()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->z0()Ljava/util/List;

    move-result-object v0

    const-string v1, "fragmentManager.fragments"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v1, v3, :cond_6

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lzr1;

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/Fragment;

    instance-of v4, v4, Lzr1;

    if-eqz v4, :cond_2

    move v2, v3

    :cond_3
    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {p0}, LKA;->b()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object v1

    const-string v2, "fragmentManager.beginTransaction()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v3

    :goto_1
    if-lez v2, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v4}, Landroidx/fragment/app/m;->s(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/m;

    move-result-object v1

    const-string v4, "transaction.remove(fragments[i])"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/m;->A(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/m;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/m;->j()I

    return v3

    :cond_5
    invoke-super {p0}, LKA;->a()Z

    move-result v0

    return v0

    :cond_6
    :goto_2
    return v2
.end method

.method public final d(Ljava/lang/String;)V
    .locals 5

    const-string v0, "fleetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzr1;->i:Lzr1$a;

    const/4 v1, 0x2

    new-array v1, v1, [Lco/bird/android/model/constant/FleetReportPage;

    sget-object v2, Lco/bird/android/model/constant/FleetReportPage;->CORE:Lco/bird/android/model/constant/FleetReportPage;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    sget-object v4, Lco/bird/android/model/constant/FleetReportPage;->INSIGHTS:Lco/bird/android/model/constant/FleetReportPage;

    aput-object v4, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Lzr1$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FleetReportPage;)Lzr1;

    move-result-object p1

    invoke-virtual {p0, p1}, LKA;->c(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "fleetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzq1;->c:Lzq1$a;

    invoke-virtual {v0, p1, p2}, Lzq1$a;->a(Ljava/lang/String;Ljava/lang/String;)Lzq1;

    move-result-object p1

    invoke-virtual {p0, p1}, LKA;->c(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final f(Lmp1;)V
    .locals 1

    const-string v0, "purpose"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LLr1;->c:LLr1$a;

    invoke-virtual {v0, p1}, LLr1$a;->a(Lmp1;)LLr1;

    move-result-object p1

    invoke-virtual {p0, p1}, LKA;->c(Landroidx/fragment/app/Fragment;)V

    return-void
.end method
