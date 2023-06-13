.class public final Lvi3;
.super Lf86;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001:\u0001\u0012B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016R\"\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvi3;",
        "Lf86;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "Lma4;",
        "",
        "kotlin.jvm.PlatformType",
        "d",
        "Lma4;",
        "mutableScheduleUpdateClicks",
        "<init>",
        "()V",
        "a",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final d:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lf86;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvi3;->d:Lma4;

    return-void
.end method

.method public static final synthetic access$getMutableScheduleUpdateClicks$p(Lvi3;)Lma4;
    .locals 0

    iget-object p0, p0, Lvi3;->d:Lma4;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lvi3;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LQj4;->item_container_order_details_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, LUl0$a;

    invoke-direct {p2, p0, p1}, LUl0$a;-><init>(LUl0;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LQj4;->item_operator_allocation_status:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lf86$e;

    invoke-direct {p2, p0, p1}, Lf86$e;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LQj4;->item_header_spannable_status_cta:I

    if-ne p2, v0, :cond_2

    new-instance p2, Lvi3$a;

    invoke-direct {p2, p0, p1}, Lvi3$a;-><init>(Lvi3;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LQj4;->item_header_value:I

    if-ne p2, v0, :cond_3

    new-instance p2, Lf86$d;

    invoke-direct {p2, p0, p1}, Lf86$d;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LjC5;

    invoke-direct {v0}, LjC5;-><init>()V

    return-object v0
.end method
