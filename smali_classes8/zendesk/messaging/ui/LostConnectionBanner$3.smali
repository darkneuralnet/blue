.class Lzendesk/messaging/ui/LostConnectionBanner$3;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/messaging/ui/LostConnectionBanner;-><init>(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Lzendesk/messaging/ui/InputBox;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private final originalMargin:I

.field private final originalPaddingBottom:I

.field final synthetic this$0:Lzendesk/messaging/ui/LostConnectionBanner;

.field final synthetic val$inputBox:Lzendesk/messaging/ui/InputBox;

.field final synthetic val$lostConnectionBanner:Landroid/view/View;

.field final synthetic val$params:Landroid/view/ViewGroup$MarginLayoutParams;

.field final synthetic val$recyclerView:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Lzendesk/messaging/ui/LostConnectionBanner;Landroid/view/ViewGroup$MarginLayoutParams;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Lzendesk/messaging/ui/InputBox;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->this$0:Lzendesk/messaging/ui/LostConnectionBanner;

    iput-object p2, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$params:Landroid/view/ViewGroup$MarginLayoutParams;

    iput-object p3, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p4, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$lostConnectionBanner:Landroid/view/View;

    iput-object p5, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$inputBox:Lzendesk/messaging/ui/InputBox;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->originalMargin:I

    invoke-virtual {p3}, Landroid/view/View;->getPaddingBottom()I

    move-result p1

    iput p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->originalPaddingBottom:I

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 5

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$params:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->originalMargin:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$lostConnectionBanner:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$lostConnectionBanner:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    iget v3, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->originalPaddingBottom:I

    iget-object v4, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->val$inputBox:Lzendesk/messaging/ui/InputBox;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->this$0:Lzendesk/messaging/ui/LostConnectionBanner;

    sget-object v0, Lzendesk/messaging/ui/LostConnectionBanner$State;->EXITED:Lzendesk/messaging/ui/LostConnectionBanner$State;

    invoke-static {p1, v0}, Lzendesk/messaging/ui/LostConnectionBanner;->access$102(Lzendesk/messaging/ui/LostConnectionBanner;Lzendesk/messaging/ui/LostConnectionBanner$State;)Lzendesk/messaging/ui/LostConnectionBanner$State;

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner$3;->this$0:Lzendesk/messaging/ui/LostConnectionBanner;

    sget-object v0, Lzendesk/messaging/ui/LostConnectionBanner$State;->EXITING:Lzendesk/messaging/ui/LostConnectionBanner$State;

    invoke-static {p1, v0}, Lzendesk/messaging/ui/LostConnectionBanner;->access$102(Lzendesk/messaging/ui/LostConnectionBanner;Lzendesk/messaging/ui/LostConnectionBanner$State;)Lzendesk/messaging/ui/LostConnectionBanner$State;

    return-void
.end method
