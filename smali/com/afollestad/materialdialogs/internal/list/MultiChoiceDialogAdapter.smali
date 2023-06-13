.class public final Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"

# interfaces
.implements Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;",
        ">;",
        "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter<",
        "Ljava/lang/CharSequence;",
        "Lkotlin/jvm/functions/Function3<",
        "-",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "-[I-",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/CharSequence;",
        ">;+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u001b\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012_\u0012\u0004\u0012\u00020\u0004\u0012U\u0012S\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u000c\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f0\u0003B\u0098\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c\u0012\u0008\u0010A\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u00108\u001a\u00020*\u0012\u0006\u0010:\u001a\u00020*\u0012W\u0010;\u001aS\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u000c\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f\u00a2\u0006\u0004\u0008C\u0010DJ\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0008\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J&\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u0008\u0010 \u001a\u00020\u000eH\u0016Jo\u0010\"\u001a\u00020\u000e2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2W\u0010!\u001aS\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u000c\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000fH\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\'\u001a\u00020\u000eH\u0016J\u0008\u0010(\u001a\u00020\u000eH\u0016J\u0008\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R$\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u0010.R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u00102R(\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\u0014\u00108\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0014\u0010:\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00109Rs\u0010;\u001aS\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u000c\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@\u00a8\u0006E"
    }
    d2 = {
        "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;",
        "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;",
        "",
        "Lkotlin/Function3;",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "Lkotlin/ParameterName;",
        "name",
        "dialog",
        "",
        "indices",
        "",
        "items",
        "",
        "Lcom/afollestad/materialdialogs/list/MultiChoiceListener;",
        "",
        "index",
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
        "listener",
        "replaceItems",
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
        "[I",
        "setCurrentSelection",
        "([I)V",
        "disabledIndices",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "Ljava/util/List;",
        "getItems$core",
        "()Ljava/util/List;",
        "setItems$core",
        "(Ljava/util/List;)V",
        "waitForActionButton",
        "Z",
        "allowEmptySelection",
        "selection",
        "Lkotlin/jvm/functions/Function3;",
        "getSelection$core",
        "()Lkotlin/jvm/functions/Function3;",
        "setSelection$core",
        "(Lkotlin/jvm/functions/Function3;)V",
        "disabledItems",
        "initialSelection",
        "<init>",
        "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[I[IZZLkotlin/jvm/functions/Function3;)V",
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
.field private final allowEmptySelection:Z

.field private currentSelection:[I

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
            "-[I-",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final waitForActionButton:Z


# direct methods
.method public constructor <init>(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[I[IZZLkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;[I[IZZ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "-[I-",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    iput-boolean p5, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->waitForActionButton:Z

    iput-boolean p6, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->allowEmptySelection:Z

    iput-object p7, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p3, p1, [I

    :goto_0
    iput-object p3, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->disabledIndices:[I

    return-void
.end method

.method private final setCurrentSelection([I)V
    .locals 6

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    invoke-static {p1, v4}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v5

    if-nez v5, :cond_0

    sget-object v5, Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;

    invoke-virtual {p0, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_3

    aget v3, p1, v2

    invoke-static {v0, v3}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v4

    if-nez v4, :cond_2

    sget-object v4, Lcom/afollestad/materialdialogs/internal/list/CheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/CheckPayload;

    invoke-virtual {p0, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(ILjava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public checkAllItems()V
    .locals 9

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->getItemCount()I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    aput v4, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v5, v3

    :goto_1
    const/4 v6, 0x1

    if-ge v5, v1, :cond_2

    aget v7, v2, v5

    invoke-static {v0, v7}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v8

    xor-int/2addr v6, v8

    if-eqz v6, :cond_1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {v1, v4}, Lcom/afollestad/materialdialogs/utils/IntArraysKt;->appendAll([ILjava/util/Collection;)[I

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->setCurrentSelection([I)V

    array-length v0, v0

    if-nez v0, :cond_3

    move v3, v6

    :cond_3
    if-eqz v3, :cond_4

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v1, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    invoke-static {v0, v1, v6}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    :cond_4
    return-void
.end method

.method public checkItems([I)V
    .locals 8

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_3

    aget v6, p1, v4

    if-ltz v6, :cond_0

    iget-object v7, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_0

    move v7, v5

    goto :goto_1

    :cond_0
    move v7, v3

    :goto_1
    if-eqz v7, :cond_2

    invoke-static {v0, v6}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v7

    xor-int/2addr v5, v7

    if-eqz v5, :cond_1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " is out of range for this adapter of "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " items."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {p1, v1}, Lcom/afollestad/materialdialogs/utils/IntArraysKt;->appendAll([ILjava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->setCurrentSelection([I)V

    array-length p1, v0

    if-nez p1, :cond_4

    move v3, v5

    :cond_4
    if-eqz v3, :cond_5

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v0, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    invoke-static {p1, v0, v5}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    :cond_5
    return-void
.end method

.method public disableItems([I)V
    .locals 0

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->disabledIndices:[I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

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

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getSelection$core()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "[I",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public isItemChecked(I)Z
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result p1

    return p1
.end method

.method public final itemClicked$core(I)V
    .locals 5

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toMutableList([I)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->setCurrentSelection([I)V

    iget-boolean p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->waitForActionButton:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {p1}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->hasActionButtons(Lcom/afollestad/materialdialogs/MaterialDialog;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v1, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    iget-boolean v2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->allowEmptySelection:Z

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    array-length v2, v2

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    xor-int/2addr v2, v3

    if-eqz v2, :cond_3

    :cond_2
    move v0, v3

    :cond_3
    invoke-static {p1, v1, v0}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v1

    :goto_2
    if-ge v0, v3, :cond_5

    aget v4, v1, v0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    if-eqz p1, :cond_6

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-interface {p1, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Unit;

    :cond_6
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->getAutoDismissEnabled()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {p1}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->hasActionButtons(Lcom/afollestad/materialdialogs/MaterialDialog;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    :cond_7
    :goto_3
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;ILjava/util/List;)V
    .locals 0

    check-cast p1, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;I)V
    .locals 2

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->disabledIndices:[I

    invoke-static {v0, p2}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->setEnabled(Z)V

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {v1, p2}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getTitleView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v0, "holder.itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v0}, Lcom/afollestad/materialdialogs/list/DialogListExtKt;->getItemSelector(Lcom/afollestad/materialdialogs/MaterialDialog;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->getBodyFont()Landroid/graphics/Typeface;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getTitleView()Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->getBodyFont()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method

.method public onBindViewHolder(Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;",
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

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    :cond_0
    sget-object v1, Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;->INSTANCE:Lcom/afollestad/materialdialogs/internal/list/UncheckPayload;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$h;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;ILjava/util/List;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$h;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;
    .locals 8

    sget-object p2, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/MaterialDialog;->getWindowContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/afollestad/materialdialogs/R$layout;->md_listitem_multichoice:I

    invoke-virtual {p2, p1, v0, v1}, Lcom/afollestad/materialdialogs/utils/MDUtil;->inflate(Landroid/view/ViewGroup;Landroid/content/Context;I)Landroid/view/View;

    move-result-object p1

    new-instance v7, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;

    invoke-direct {v7, p1, p0}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;-><init>(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;)V

    invoke-virtual {v7}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getTitleView()Landroid/widget/TextView;

    move-result-object v1

    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

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

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v1, v0, v4, p1, v4}, Lcom/afollestad/materialdialogs/utils/ColorsKt;->resolveColors$default(Lcom/afollestad/materialdialogs/MaterialDialog;[ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)[I

    move-result-object p1

    invoke-virtual {v7}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;->getControlView()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

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
    .locals 6

    iget-boolean v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->allowEmptySelection:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    array-length v0, v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    xor-int/2addr v0, v2

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v2

    :goto_1
    if-ge v1, v4, :cond_2

    aget v5, v2, v1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-interface {v0, v1, v2, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;

    :cond_3
    return-void
.end method

.method public bridge synthetic replaceItems(Ljava/util/List;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlin/jvm/functions/Function3;

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->replaceItems(Ljava/util/List;Lkotlin/jvm/functions/Function3;)V

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
            "-[I-",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

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

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

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
            "-[I-",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->selection:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public toggleAllChecked()V
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->checkAllItems()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->uncheckAllItems()V

    :goto_1
    return-void
.end method

.method public toggleItems([I)V
    .locals 6

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toMutableList([I)Ljava/util/List;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget v4, p1, v3

    iget-object v5, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->disabledIndices:[I

    invoke-static {v5, v4}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v1, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    array-length v3, p1

    const/4 v4, 0x1

    if-nez v3, :cond_3

    move v2, v4

    :cond_3
    if-eqz v2, :cond_4

    iget-boolean v4, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->allowEmptySelection:Z

    :cond_4
    invoke-static {v0, v1, v4}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    invoke-direct {p0, p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->setCurrentSelection([I)V

    return-void
.end method

.method public uncheckAllItems()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [I

    invoke-direct {p0, v0}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->setCurrentSelection([I)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v1, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    iget-boolean v2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->allowEmptySelection:Z

    invoke-static {v0, v1, v2}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    return-void
.end method

.method public uncheckItems([I)V
    .locals 8

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_3

    aget v6, p1, v4

    if-ltz v6, :cond_0

    iget-object v7, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_0

    goto :goto_1

    :cond_0
    move v5, v3

    :goto_1
    if-eqz v5, :cond_2

    invoke-static {v0, v6}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " is out of range for this adapter of "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " items."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->currentSelection:[I

    invoke-static {p1, v1}, Lcom/afollestad/materialdialogs/utils/IntArraysKt;->removeAll([ILjava/util/Collection;)[I

    move-result-object p1

    array-length v0, p1

    if-nez v0, :cond_4

    move v3, v5

    :cond_4
    if-eqz v3, :cond_5

    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->dialog:Lcom/afollestad/materialdialogs/MaterialDialog;

    sget-object v1, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    iget-boolean v2, p0, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->allowEmptySelection:Z

    invoke-static {v0, v1, v2}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    :cond_5
    invoke-direct {p0, p1}, Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;->setCurrentSelection([I)V

    return-void
.end method
