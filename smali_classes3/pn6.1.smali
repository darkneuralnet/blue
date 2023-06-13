.class public final Lpn6;
.super Lct4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpn6$a;,
        Lpn6$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lct4<",
        "Lnn6$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpn6;",
        "Lct4;",
        "Lnn6$a;",
        "",
        "position",
        "getItemViewType",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "onCreateViewHolder",
        "holder",
        "",
        "onBindViewHolder",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "a",
        "b",
        "vehicle-pricing_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lct4;-><init>(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getItemViewType(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lct4;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnn6$a;

    invoke-virtual {p1}, Lnn6$a;->b()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpn6$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lct4;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnn6$a;

    invoke-virtual {p2}, Lnn6$a;->c()Lco/bird/android/model/VehiclePricing;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p1, Lpn6$b;

    invoke-virtual {p1, p2}, Lpn6$b;->a(Lco/bird/android/model/VehiclePricing;)V

    :cond_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 3

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-instance p2, Lpn6$a;

    invoke-virtual {p0}, Lct4;->u()Landroid/content/Context;

    move-result-object v1

    sget v2, LSj4;->view_by_vehicle_header:I

    invoke-static {v1, v2, p1, v0}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Lpn6$a;-><init>(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lpn6$b;

    invoke-virtual {p0}, Lct4;->u()Landroid/content/Context;

    move-result-object v1

    sget v2, LSj4;->view_vehicle_pricing:I

    invoke-static {v1, v2, p1, v0}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Lpn6$b;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method
