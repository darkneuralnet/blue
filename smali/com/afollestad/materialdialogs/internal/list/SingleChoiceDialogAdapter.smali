.class public final Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"

# interfaces
.implements Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;",
        ">;",
        "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter<",
        "Ljava/lang/CharSequence;",
        "Lkotlin/jvm/functions/Function3<",
        "-",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "-",
        "Ljava/lang/Integer;",
        "-",
        "Ljava/lang/CharSequence;",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u001a\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u008a\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001e\u0012\u0008\u0010A\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u00109\u001a\u00020+\u0012Q\u0010;\u001aM\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e\u00a2\u0006\u0004\u0008C\u0010DJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0008\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0016J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0008\u0010\u001d\u001a\u00020\rH\u0016Ji\u0010!\u001a\u00020\r2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001e2Q\u0010 \u001aM\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010\'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0008\u0010(\u001a\u00020\rH\u0016J\u0008\u0010)\u001a\u00020\rH\u0016J\u0008\u0010*\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016R$\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\"\u0004\u00080\u0010\u0010R\u0016\u00101\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u00103R(\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\u0014\u00109\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:Rm\u0010;\u001aM\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@\u00a8\u0006E"
    }
    d2 = {
        "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;",
        "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;",
        "",
        "Lkotlin/Function3;",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "Lkotlin/ParameterName;",
        "name",
        "dialog",
        "",
        "index",
        "text",
        "",
        "Lcom/afollestad/materialdialogs/list/SingleChoiceListener;",
        "itemClicked$core",
        "(I)V",
        "itemClicked",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "getItemCount",
        "holder",
        "position",
        "onBindViewHolder",
        "",
        "",
        "payloads",
        "positiveButtonClicked",
        "",
        "items",
        "listener",
        "replaceItems",
        "",
        "indices",
        "disableItems",
        "checkItems",
        "uncheckItems",
        "toggleItems",
        "checkAllItems",
        "uncheckAllItems",
        "toggleAllChecked",
        "",
        "isItemChecked",
        "value",
        "currentSelection",
        "I",
        "setCurrentSelection",
        "disabledIndices",
        "[I",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "Ljava/util/List;",
        "getItems$core",
        "()Ljava/util/List;",
        "setItems$core",
        "(Ljava/util/List;)V",
        "waitForActionButton",
        "Z",
        "selection",
        "Lkotlin/jvm/functions/Function3;",
        "getSelection$core",
        "()Lkotlin/jvm/functions/Function3;",
        "setSelection$core",
        "(Lkotlin/jvm/functions/Function3;)V",
        "disabledItems",
        "initialSelection",
        "<init>",
        "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;)V",
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
.field private currentSelection:I

.field private dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

.field private disabledIndices:[I

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field private selection:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/CharSequence;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final waitForActionButton:Z


# direct methods
.method public constructor <init>(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;[IIZ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/CharSequence;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    iput-boolean p5, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->waitForActionButton:Z

    iput-object p6, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    iput p4, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p3, p1, [I

    :goto_0
    iput-object p3, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->disabledIndices:[I

    return-void
.end method

.method private final setCurrentSelection(I)V
    .locals 2

    iget v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    sget-object v1, Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;

    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(ILjava/lang/Object;)V

    sget-object v0, Lcom/afollestad/materialdialogs/internal/list/CheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/CheckPayload;

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public checkAllItems()V
    .locals 0

    return-void
.end method

.method public checkItems([I)V
    .locals 3

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    aget p1, p1, v2

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    :goto_1
    if-ltz p1, :cond_2

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v1, :cond_4

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->disabledIndices:[I

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-direct {p0, p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->setCurrentSelection(I)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is out of range for this adapter of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " items."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public disableItems([I)V
    .locals 0

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->disabledIndices:[I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItems$core()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getSelection$core()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Ljava/lang/Integer;",
            "Ljava/lang/CharSequence;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public isItemChecked(I)Z
    .locals 1

    iget v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final itemClicked$core(I)V
    .locals 4

    invoke-direct {p0, p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->setCurrentSelection(I)V

    iget-boolean v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->waitForActionButton:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v0}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->hasActionButtons(Lcom/afollestad/materialdialogs/MaterialDialog;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v0, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Unit;

    :cond_1
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->getAutoDismissEnabled()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {p1}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->hasActionButtons(Lcom/afollestad/materialdialogs/MaterialDialog;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;ILjava/util/List;)V
    .locals 0

    check-cast p1, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;I)V
    .locals 3

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->disabledIndices:[I

    invoke-static {v0, p2}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->setEnabled(Z)V

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatRadioButton;

    move-result-object v0

    iget v2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    if-ne v2, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getTitleView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v0, "holder.itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v0}, Lcom/afollestad/materialdialogs/list/DialogListExtKt;->getItemSelector(Lcom/afollestad/materialdialogs/MaterialDialog;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->getBodyFont()Landroid/graphics/Typeface;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getTitleView()Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->getBodyFont()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    return-void
.end method

.method public onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/afollestad/materialdialogs/internal/list/CheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/CheckPayload;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatRadioButton;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    :cond_0
    sget-object v1, Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatRadioButton;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$h;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;
    .locals 8

    sget-object p2, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/MaterialDialog;->getWindowContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/afollestad/materialdialogs/R$layout;->md_listitem_singlechoice:I

    invoke-virtual {p2, p1, v0, v1}, Lcom/afollestad/materialdialogs/utils/MDUtil;->inflate(Landroid/view/ViewGroup;Landroid/content/Context;I)Landroid/view/View;

    move-result-object p1

    new-instance v7, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;

    invoke-direct {v7, p1, p0}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;-><init>(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;)V

    invoke-virtual {v7}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getTitleView()Landroid/widget/TextView;

    move-result-object v1

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->getWindowContext()Landroid/content/Context;

    move-result-object v2

    sget p1, Lcom/afollestad/materialdialogs/R$attr;->md_color_content:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Lcom/afollestad/materialdialogs/utils/MDUtil;->maybeSetTextColor$default(Lcom/afollestad/materialdialogs/utils/MDUtil;Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)V

    const/4 p1, 0x2

    new-array v0, p1, [I

    sget v1, Lcom/afollestad/materialdialogs/R$attr;->md_color_widget:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/afollestad/materialdialogs/R$attr;->md_color_widget_unchecked:I

    const/4 v3, 0x1

    aput v1, v0, v3

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v1, v0, v4, p1, v4}, Lcom/afollestad/materialdialogs/utils/ColorsKt;->resolveColors$default(Lcom/afollestad/materialdialogs/MaterialDialog;[ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)[I

    move-result-object p1

    invoke-virtual {v7}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatRadioButton;

    move-result-object v0

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v1}, Lcom/afollestad/materialdialogs/MaterialDialog;->getWindowContext()Landroid/content/Context;

    move-result-object v1

    aget v2, p1, v2

    aget p1, p1, v3

    invoke-virtual {p2, v1, p1, v2}, Lcom/afollestad/materialdialogs/utils/MDUtil;->createColorSelector(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, Lsu0;->d(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    return-object v7
.end method

.method public positiveButtonClicked()V
    .locals 5

    iget v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    iget v4, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;

    :cond_0
    return-void
.end method

.method public bridge synthetic replaceItems(Ljava/util/List;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlin/jvm/functions/Function3;

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->replaceItems(Ljava/util/List;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public replaceItems(Ljava/util/List;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/CharSequence;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public final setItems$core(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    return-void
.end method

.method public final setSelection$core(Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/CharSequence;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public toggleAllChecked()V
    .locals 0

    return-void
.end method

.method public toggleItems([I)V
    .locals 5

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    xor-int/2addr v0, v1

    const/4 v3, -0x1

    if-eqz v0, :cond_1

    aget v0, p1, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->disabledIndices:[I

    invoke-static {v4, v0}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v4

    if-eqz v4, :cond_2

    return-void

    :cond_2
    array-length p1, p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    if-nez v1, :cond_5

    iget p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->currentSelection:I

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-direct {p0, v0}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->setCurrentSelection(I)V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-direct {p0, v3}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->setCurrentSelection(I)V

    :goto_4
    return-void
.end method

.method public uncheckAllItems()V
    .locals 0

    return-void
.end method

.method public uncheckItems([I)V
    .locals 4

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    xor-int/2addr v0, v1

    const/4 v3, -0x1

    if-eqz v0, :cond_1

    aget p1, p1, v2

    goto :goto_1

    :cond_1
    move p1, v3

    :goto_1
    if-ltz p1, :cond_2

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v1, :cond_4

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->disabledIndices:[I

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    invoke-direct {p0, v3}, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->setCurrentSelection(I)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is out of range for this adapter of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " items."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
