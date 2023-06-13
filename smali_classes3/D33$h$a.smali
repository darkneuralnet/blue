.class public final LD33$h$a;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD33$h;-><init>(LD33;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "D33$h$a",
        "Landroidx/recyclerview/widget/RecyclerView$t;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "newState",
        "",
        "onScrollStateChanged",
        "nest-flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LD33$h;


# direct methods
.method public constructor <init>(LD33$h;)V
    .locals 0

    iput-object p1, p0, LD33$h$a;->a:LD33$h;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$t;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_0

    iget-object p1, p0, LD33$h$a;->a:LD33$h;

    invoke-static {p1}, LD33$h;->a(LD33$h;)LCd2;

    move-result-object p1

    iget-object p1, p1, LCd2;->b:Landroid/widget/ImageView;

    const-string p2, "binding.leftArrow"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LD33$h$a;->a:LD33$h;

    invoke-static {p2}, LD33$h;->a(LD33$h;)LCd2;

    move-result-object p2

    iget-object p2, p2, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p2

    const/4 v0, 0x4

    invoke-static {p1, p2, v0}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object p1, p0, LD33$h$a;->a:LD33$h;

    invoke-static {p1}, LD33$h;->a(LD33$h;)LCd2;

    move-result-object p1

    iget-object p1, p1, LCd2;->d:Landroid/widget/ImageView;

    const-string p2, "binding.rightArrow"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LD33$h$a;->a:LD33$h;

    invoke-static {p2}, LD33$h;->a(LD33$h;)LCd2;

    move-result-object p2

    iget-object p2, p2, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p2

    invoke-static {p1, p2, v0}, Ltu6;->s(Landroid/view/View;ZI)V

    :cond_0
    return-void
.end method
