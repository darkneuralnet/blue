.class public final Lvn0;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0016\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008+\u0010,J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0012\u001a\u00020\u0005*\u0004\u0018\u00010\u000eH\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR.\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006-"
    }
    d2 = {
        "Lvn0;",
        "Landroidx/viewpager2/adapter/FragmentStateAdapter;",
        "",
        "getItemCount",
        "position",
        "",
        "getItemId",
        "itemId",
        "",
        "p",
        "Landroidx/fragment/app/Fragment;",
        "q",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lco/bird/android/model/constant/ServiceCenterStatus;",
        "status",
        "",
        "P",
        "Q",
        "LTq4;",
        "k",
        "LTq4;",
        "reactiveConfig",
        "",
        "l",
        "[J",
        "pageIds",
        "m",
        "I",
        "itemCount",
        "n",
        "Lco/bird/android/model/wire/WireBird;",
        "value",
        "o",
        "Lco/bird/android/model/constant/ServiceCenterStatus;",
        "getStatus",
        "()Lco/bird/android/model/constant/ServiceCenterStatus;",
        "R",
        "(Lco/bird/android/model/constant/ServiceCenterStatus;)V",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "Landroidx/lifecycle/f;",
        "lifecycle",
        "<init>",
        "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LTq4;)V",
        "co.bird.android.feature.commandcenter"
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
        "SMAP\nCommandCenterFragmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterFragmentAdapter.kt\nco/bird/android/feature/commandcenter/commandcenter/adapters/CommandCenterFragmentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"
    }
.end annotation


# instance fields
.field public final k:LTq4;

.field public final l:[J

.field public m:I

.field public n:Lco/bird/android/model/wire/WireBird;

.field public o:Lco/bird/android/model/constant/ServiceCenterStatus;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LTq4;)V
    .locals 2

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V

    iput-object p3, p0, Lvn0;->k:LTq4;

    const/4 p1, 0x2

    new-array p2, p1, [J

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p1, :cond_0

    const-wide/16 v0, 0x0

    aput-wide v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lvn0;->l:[J

    return-void
.end method


# virtual methods
.method public final P(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/ServiceCenterStatus;)V
    .locals 2

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lvn0;->n:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p2}, Lvn0;->R(Lco/bird/android/model/constant/ServiceCenterStatus;)V

    const/4 p2, 0x2

    iput p2, p0, Lvn0;->m:I

    iget-object p2, p0, Lvn0;->l:[J

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result p1

    int-to-long v0, p1

    const/4 p1, 0x1

    aput-wide v0, p2, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public final Q(Lco/bird/android/model/constant/ServiceCenterStatus;)J
    .locals 2

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->Companion:Lco/bird/android/model/constant/ServiceCenterRoute$Companion;

    invoke-virtual {v0}, Lco/bird/android/model/constant/ServiceCenterRoute$Companion;->getCHECK_IN_ROUTE_STATUSES()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvn0;->k:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getEntryRouting()Lco/bird/android/model/wire/configs/EntryRoutingConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/EntryRoutingConfig;->getEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public final R(Lco/bird/android/model/constant/ServiceCenterStatus;)V
    .locals 5

    iput-object p1, p0, Lvn0;->o:Lco/bird/android/model/constant/ServiceCenterStatus;

    iget-object v0, p0, Lvn0;->l:[J

    const/4 v1, 0x0

    aget-wide v1, v0, v1

    invoke-virtual {p0, p1}, Lvn0;->Q(Lco/bird/android/model/constant/ServiceCenterStatus;)J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget v0, p0, Lvn0;->m:I

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const-wide/16 v0, -0x1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lvn0;->n:Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    int-to-long v0, p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lvn0;->o:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {p0, p1}, Lvn0;->Q(Lco/bird/android/model/constant/ServiceCenterStatus;)J

    move-result-wide v0

    :goto_1
    return-wide v0
.end method

.method public p(J)Z
    .locals 3

    iget-object v0, p0, Lvn0;->l:[J

    invoke-static {v0, p1, p2}, Lkotlin/collections/ArraysKt;->contains([JJ)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p2, p0, Lvn0;->l:[J

    iget-object v0, p0, Lvn0;->o:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {p0, v0}, Lvn0;->Q(Lco/bird/android/model/constant/ServiceCenterStatus;)J

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, p2, v2

    :cond_0
    return p1
.end method

.method public q(I)Landroidx/fragment/app/Fragment;
    .locals 2

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance p1, Landroidx/fragment/app/Fragment;

    invoke-direct {p1}, Landroidx/fragment/app/Fragment;-><init>()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lvn0;->n:Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_1

    sget-object v0, LXk6;->d:LXk6$a;

    invoke-virtual {v0, p1}, LXk6$a;->a(Lco/bird/android/model/wire/WireBird;)LXk6;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Landroidx/fragment/app/Fragment;

    invoke-direct {p1}, Landroidx/fragment/app/Fragment;-><init>()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lvn0;->n:Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_4

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->Companion:Lco/bird/android/model/constant/ServiceCenterRoute$Companion;

    invoke-virtual {v0}, Lco/bird/android/model/constant/ServiceCenterRoute$Companion;->getCHECK_IN_ROUTE_STATUSES()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lvn0;->o:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lvn0;->k:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getEntryRouting()Lco/bird/android/model/wire/configs/EntryRoutingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/EntryRoutingConfig;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lco/bird/android/feature/commandcenter/routing/b;->c:Lco/bird/android/feature/commandcenter/routing/b$a;

    invoke-virtual {v0, p1}, Lco/bird/android/feature/commandcenter/routing/b$a;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/feature/commandcenter/routing/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object v0, Lw46;->c:Lw46$a;

    invoke-virtual {v0, p1}, Lw46$a;->a(Lco/bird/android/model/wire/WireBird;)Lw46;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_5

    :cond_4
    new-instance p1, Landroidx/fragment/app/Fragment;

    invoke-direct {p1}, Landroidx/fragment/app/Fragment;-><init>()V

    :cond_5
    :goto_1
    return-object p1
.end method
