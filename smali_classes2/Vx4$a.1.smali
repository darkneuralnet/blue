.class public final LVx4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVx4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "LVx4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LVx4;",
        "b",
        "LVx4;",
        "getAdapter",
        "()LVx4;",
        "adapter",
        "LWx4;",
        "c",
        "LWx4;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LVx4;Landroid/view/View;LVx4;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LVx4;

.field public final c:LWx4;

.field public final synthetic d:LVx4;


# direct methods
.method public constructor <init>(LVx4;Landroid/view/View;LVx4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LVx4;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LVx4$a;->d:LVx4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p3, p0, LVx4$a;->b:LVx4;

    invoke-static {p2}, LWx4;->a(Landroid/view/View;)LWx4;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LVx4$a;->c:LWx4;

    return-void
.end method

.method public static synthetic a(LVx4$a;Lco/bird/android/model/RentalPlan;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, LVx4$a;->b(LVx4$a;Lco/bird/android/model/RentalPlan;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LVx4$a;Lco/bird/android/model/RentalPlan;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$item"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LVx4$a;->b:LVx4;

    invoke-virtual {p0, p1}, LOr5;->H(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LVx4$a;->d:LVx4;

    invoke-virtual {v0}, LOr5;->F()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LHg4;->frame_rectangle_border_rounded_large_radius_purple:I

    invoke-static {v1, v2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LHg4;->frame_rectangle_border_rounded_large_radius:I

    invoke-static {v1, v2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    iget-object v0, p0, LVx4$a;->b:LVx4;

    invoke-virtual {v0, p1}, Lct4;->q(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RentalPlan;

    iget-object v0, p0, LVx4$a;->c:LWx4;

    iget-object v0, v0, LWx4;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RentalPlan;->getDescriptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LVx4$a;->c:LWx4;

    iget-object v0, v0, LWx4;->d:Landroid/widget/TextView;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/RentalPlan;->getBaseCost()J

    move-result-wide v2

    invoke-virtual {p1}, Lco/bird/android/model/RentalPlan;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    sget-object v5, LUx1;->c:LUx1;

    invoke-virtual {v1, v2, v3, v4, v5}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v1, LUx4;

    invoke-direct {v1, p0, p1}, LUx4;-><init>(LVx4$a;Lco/bird/android/model/RentalPlan;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
