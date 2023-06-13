.class Lzendesk/messaging/ui/RecyclerViewScroller;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final adapter:Landroidx/recyclerview/widget/RecyclerView$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "Landroidx/recyclerview/widget/RecyclerView$D;",
            ">;"
        }
    .end annotation
.end field

.field private lastCompletelyVisiblePosition:I

.field private final linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private secondCompletelyVisiblePosition:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Landroidx/recyclerview/widget/LinearLayoutManager;",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "Landroidx/recyclerview/widget/RecyclerView$D;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->lastCompletelyVisiblePosition:I

    iput v0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->secondCompletelyVisiblePosition:I

    iput-object p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    iput-object p3, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->adapter:Landroidx/recyclerview/widget/RecyclerView$h;

    new-instance v0, Lzendesk/messaging/ui/RecyclerViewScroller$1;

    invoke-direct {v0, p0, p2}, Lzendesk/messaging/ui/RecyclerViewScroller$1;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;Landroidx/recyclerview/widget/LinearLayoutManager;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V

    new-instance p2, Lzendesk/messaging/ui/RecyclerViewScroller$2;

    invoke-direct {p2, p0, p3}, Lzendesk/messaging/ui/RecyclerViewScroller$2;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    new-instance p2, Lzendesk/messaging/ui/RecyclerViewScroller$3;

    invoke-direct {p2, p0, p1}, Lzendesk/messaging/ui/RecyclerViewScroller$3;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView$h;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$j;)V

    return-void
.end method

.method public static synthetic access$000(Lzendesk/messaging/ui/RecyclerViewScroller;)I
    .locals 0

    iget p0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->secondCompletelyVisiblePosition:I

    return p0
.end method

.method public static synthetic access$002(Lzendesk/messaging/ui/RecyclerViewScroller;I)I
    .locals 0

    iput p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->secondCompletelyVisiblePosition:I

    return p1
.end method

.method public static synthetic access$100(Lzendesk/messaging/ui/RecyclerViewScroller;)I
    .locals 0

    iget p0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->lastCompletelyVisiblePosition:I

    return p0
.end method

.method public static synthetic access$102(Lzendesk/messaging/ui/RecyclerViewScroller;I)I
    .locals 0

    iput p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->lastCompletelyVisiblePosition:I

    return p1
.end method

.method public static synthetic access$200(Lzendesk/messaging/ui/RecyclerViewScroller;I)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/messaging/ui/RecyclerViewScroller;->postScrollToBottom(I)V

    return-void
.end method

.method public static synthetic access$300(Lzendesk/messaging/ui/RecyclerViewScroller;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method public static synthetic access$400(Lzendesk/messaging/ui/RecyclerViewScroller;I)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/messaging/ui/RecyclerViewScroller;->scrollToBottom(I)V

    return-void
.end method

.method private postScrollToBottom(I)V
    .locals 2

    iget-object v0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lzendesk/messaging/ui/RecyclerViewScroller$7;

    invoke-direct {v1, p0, p1}, Lzendesk/messaging/ui/RecyclerViewScroller$7;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private scrollToBottom(I)V
    .locals 2

    iget-object v0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->adapter:Landroidx/recyclerview/widget/RecyclerView$h;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_3

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$D;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, p1

    mul-int/lit8 v1, v1, -0x1

    iget-object p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->S2(II)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    if-ne p1, v1, :cond_2

    new-instance p1, Lzendesk/messaging/ui/RecyclerViewScroller$6;

    iget-object v1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, p0, v1}, Lzendesk/messaging/ui/RecyclerViewScroller$6;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$y;->setTargetPosition(I)V

    iget-object v0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;->b2(Landroidx/recyclerview/widget/RecyclerView$y;)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    new-instance p1, Landroidx/recyclerview/widget/n;

    iget-object v1, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$y;->setTargetPosition(I)V

    iget-object v0, p0, Lzendesk/messaging/ui/RecyclerViewScroller;->linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;->b2(Landroidx/recyclerview/widget/RecyclerView$y;)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public install(Lzendesk/messaging/ui/InputBox;)V
    .locals 1

    new-instance v0, Lzendesk/messaging/ui/RecyclerViewScroller$4;

    invoke-direct {v0, p0, p1}, Lzendesk/messaging/ui/RecyclerViewScroller$4;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;Lzendesk/messaging/ui/InputBox;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    new-instance v0, Lzendesk/messaging/ui/RecyclerViewScroller$5;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/RecyclerViewScroller$5;-><init>(Lzendesk/messaging/ui/RecyclerViewScroller;)V

    invoke-virtual {p1, v0}, Lzendesk/messaging/ui/InputBox;->addSendButtonClickListener(Landroid/view/View$OnClickListener;)Z

    return-void
.end method
