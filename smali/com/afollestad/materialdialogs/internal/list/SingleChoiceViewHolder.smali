.class public final Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/view/View;",
        "view",
        "",
        "onClick",
        "Landroidx/appcompat/widget/AppCompatRadioButton;",
        "controlView",
        "Landroidx/appcompat/widget/AppCompatRadioButton;",
        "getControlView",
        "()Landroidx/appcompat/widget/AppCompatRadioButton;",
        "Landroid/widget/TextView;",
        "titleView",
        "Landroid/widget/TextView;",
        "getTitleView",
        "()Landroid/widget/TextView;",
        "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;",
        "adapter",
        "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;",
        "",
        "value",
        "isEnabled",
        "()Z",
        "setEnabled",
        "(Z)V",
        "itemView",
        "<init>",
        "(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;)V",
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
.field private final adapter:Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;

.field private final controlView:Landroidx/appcompat/widget/AppCompatRadioButton;

.field private final titleView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->adapter:Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget p2, Lcom/afollestad/materialdialogs/R$id;->md_control:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string v0, "itemView.findViewById(R.id.md_control)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/appcompat/widget/AppCompatRadioButton;

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->controlView:Landroidx/appcompat/widget/AppCompatRadioButton;

    sget p2, Lcom/afollestad/materialdialogs/R$id;->md_title:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "itemView.findViewById(R.id.md_title)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->titleView:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final getControlView()Landroidx/appcompat/widget/AppCompatRadioButton;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->controlView:Landroidx/appcompat/widget/AppCompatRadioButton;

    return-object v0
.end method

.method public final getTitleView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->titleView:Landroid/widget/TextView;

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    if-gez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->adapter:Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->itemClicked$core(I)V

    return-void
.end method

.method public final setEnabled(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->controlView:Landroidx/appcompat/widget/AppCompatRadioButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->titleView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method
