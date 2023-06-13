.class public final LDo3;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDo3$a;,
        LDo3$b;,
        LDo3$c;,
        LDo3$d;,
        LDo3$e;,
        LDo3$f;,
        LDo3$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001:\u0007\u0018\u0019\u0013\u001a\u001b\u001c\u001dB\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eR\"\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u000f0\u000f0\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001e"
    }
    d2 = {
        "LDo3;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "LF6;",
        "r",
        "Lio/reactivex/Observable;",
        "",
        "v",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lma4;",
        "locationRelay",
        "<init>",
        "()V",
        "a",
        "b",
        "d",
        "e",
        "f",
        "g",
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
.field public final c:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LDo3;->c:Lma4;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LDo3;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLocationRelay$p(LDo3;)Lma4;
    .locals 0

    iget-object p0, p0, LDo3;->c:Lma4;

    return-object p0
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LLo3;

    invoke-direct {v0}, LLo3;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LDo3;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LQj4;->item_operator_order_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, LDo3$d;

    invoke-direct {p2, p0, p1}, LDo3$d;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LQj4;->item_operator_order_location:I

    if-ne p2, v0, :cond_1

    new-instance p2, LDo3$f;

    invoke-direct {p2, p0, p1}, LDo3$f;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LQj4;->item_operator_order_delivery_point:I

    if-ne p2, v0, :cond_2

    new-instance p2, LDo3$g;

    invoke-direct {p2, p0, p1}, LDo3$g;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LQj4;->item_operator_order_date:I

    if-ne p2, v0, :cond_3

    new-instance p2, LDo3$b;

    invoke-direct {p2, p0, p1}, LDo3$b;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v0, LQj4;->item_operator_order_bill_of_lading:I

    if-ne p2, v0, :cond_4

    new-instance p2, LDo3$a;

    invoke-direct {p2, p0, p1}, LDo3$a;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    sget v0, LQj4;->item_operator_order_detail:I

    if-ne p2, v0, :cond_5

    new-instance p2, LDo3$c;

    invoke-direct {p2, p0, p1}, LDo3$c;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_5
    sget v0, LQj4;->item_operator_order_instructions:I

    if-ne p2, v0, :cond_6

    new-instance p2, LDo3$e;

    invoke-direct {p2, p0, p1}, LDo3$e;-><init>(LDo3;Landroid/view/View;)V

    goto :goto_0

    :cond_6
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LFo3;

    invoke-direct {v0}, LFo3;-><init>()V

    return-object v0
.end method

.method public final v()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDo3;->c:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "locationRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
