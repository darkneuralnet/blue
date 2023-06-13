.class public final Lx43$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx43;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lx43$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lud2;",
        "b",
        "Lud2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lx43;Landroid/view/View;)V",
        "nest-details_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lud2;

.field public final synthetic c:Lx43;


# direct methods
.method public constructor <init>(Lx43;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx43$b;->c:Lx43;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lud2;->a(Landroid/view/View;)Lud2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lx43$b;->b:Lud2;

    iget-object p2, p2, Lud2;->g:Landroid/widget/Button;

    const-string v0, "binding.reserve"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx43$b$a;

    invoke-direct {v0, p0, p1}, Lx43$b$a;-><init>(Lx43$b;Lx43;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 13

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, Lx43$b;->c:Lx43;

    invoke-static {v0}, Lx43;->access$getAdapterData$p(Lx43;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    iget-object v2, p0, Lx43$b;->c:Lx43;

    invoke-static {v2}, Lx43;->access$getShowRange$p(Lx43;)Z

    move-result v2

    const-string v3, "context"

    const-string v4, "binding.batteryView"

    const-string v5, "binding.rangeView"

    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lx43$b;->b:Lud2;

    iget-object v2, v2, Lud2;->f:Landroid/widget/LinearLayout;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ltu6;->r(Landroid/view/View;)V

    iget-object v2, p0, Lx43$b;->b:Lud2;

    iget-object v2, v2, Lud2;->d:Landroid/widget/LinearLayout;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ltu6;->l(Landroid/view/View;)V

    iget-object v2, p0, Lx43$b;->b:Lud2;

    iget-object v2, v2, Lud2;->e:Landroid/widget/TextView;

    sget-object v4, Lxx1;->a:Lxx1;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v6, v0

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    invoke-static/range {v4 .. v12}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx43$b;->b:Lud2;

    iget-object v0, v0, Lud2;->f:Landroid/widget/LinearLayout;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lx43$b;->b:Lud2;

    iget-object v0, v0, Lud2;->d:Landroid/widget/LinearLayout;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lx43$b;->b:Lud2;

    iget-object v0, v0, Lud2;->b:Landroid/widget/TextView;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {v2, v1, v3, v4}, Lxx1;->a(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lx43$b;->b:Lud2;

    iget-object v0, v0, Lud2;->c:Lco/bird/android/widget/BatteryView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    :goto_0
    iget-object v0, p0, Lx43$b;->b:Lud2;

    iget-object v0, v0, Lud2;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lx43$b;->b:Lud2;

    iget-object v0, v0, Lud2;->j:Landroid/widget/ImageView;

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lrg4;->ic_vehicle_moped:I

    goto :goto_1

    :cond_1
    sget p1, Lrg4;->ic_scooter_flying:I

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
