.class public final Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/view/View;",
        "view",
        "",
        "onClick",
        "Landroid/widget/TextView;",
        "titleView",
        "Landroid/widget/TextView;",
        "getTitleView",
        "()Landroid/widget/TextView;",
        "Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;",
        "adapter",
        "Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;",
        "itemView",
        "<init>",
        "(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;)V",
        "core"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private final adapter:Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;

.field private final titleView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;->adapter:Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    check-cast p1, Landroid/view/ViewGroup;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;->titleView:Landroid/widget/TextView;

    return-void

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type android.widget.TextView"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getTitleView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;->titleView:Landroid/widget/TextView;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;->adapter:Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;->itemClicked(I)V

    return-void
.end method
