.class Lzendesk/messaging/ui/RecyclerViewScroller$1;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/messaging/ui/RecyclerViewScroller;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/messaging/ui/RecyclerViewScroller;

.field final synthetic val$linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;


# direct methods
.method public constructor <init>(Lzendesk/messaging/ui/RecyclerViewScroller;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller$1;->this$0:Lzendesk/messaging/ui/RecyclerViewScroller;

    iput-object p2, p0, Lzendesk/messaging/ui/RecyclerViewScroller$1;->val$linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$t;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    iget-object p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller$1;->this$0:Lzendesk/messaging/ui/RecyclerViewScroller;

    invoke-static {p1}, Lzendesk/messaging/ui/RecyclerViewScroller;->access$100(Lzendesk/messaging/ui/RecyclerViewScroller;)I

    move-result p2

    invoke-static {p1, p2}, Lzendesk/messaging/ui/RecyclerViewScroller;->access$002(Lzendesk/messaging/ui/RecyclerViewScroller;I)I

    iget-object p1, p0, Lzendesk/messaging/ui/RecyclerViewScroller$1;->this$0:Lzendesk/messaging/ui/RecyclerViewScroller;

    iget-object p2, p0, Lzendesk/messaging/ui/RecyclerViewScroller$1;->val$linearLayoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()I

    move-result p2

    invoke-static {p1, p2}, Lzendesk/messaging/ui/RecyclerViewScroller;->access$102(Lzendesk/messaging/ui/RecyclerViewScroller;I)I

    return-void
.end method
