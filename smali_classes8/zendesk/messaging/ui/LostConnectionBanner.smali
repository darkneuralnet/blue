.class Lzendesk/messaging/ui/LostConnectionBanner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/ui/LostConnectionBanner$State;
    }
.end annotation


# instance fields
.field private final currentConnectionState:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lzendesk/messaging/ConnectionState;",
            ">;"
        }
    .end annotation
.end field

.field private final hideAnimation:Landroid/animation/AnimatorSet;

.field private final lostConnectionBanner:Landroid/view/View;

.field private final lostConnectionButton:Landroid/widget/Button;

.field private final lostConnectionTextView:Landroid/widget/TextView;

.field private onRetryConnectionClickListener:Landroid/view/View$OnClickListener;

.field private final rootView:Landroid/view/ViewGroup;

.field private final showAnimation:Landroidx/transition/TransitionSet;

.field private state:Lzendesk/messaging/ui/LostConnectionBanner$State;


# direct methods
.method private constructor <init>(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Lzendesk/messaging/ui/InputBox;Landroid/view/View;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lzendesk/messaging/ui/LostConnectionBanner$State;->EXITED:Lzendesk/messaging/ui/LostConnectionBanner$State;

    iput-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->state:Lzendesk/messaging/ui/LostConnectionBanner$State;

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->rootView:Landroid/view/ViewGroup;

    iput-object p4, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionBanner:Landroid/view/View;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lzendesk/messaging/ConnectionState;->DISCONNECTED:Lzendesk/messaging/ConnectionState;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->currentConnectionState:Ljava/util/concurrent/atomic/AtomicReference;

    sget p1, Lzendesk/messaging/R$id;->zui_lost_connection_label:I

    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionTextView:Landroid/widget/TextView;

    sget p1, Lzendesk/messaging/R$id;->zui_lost_connection_button:I

    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionButton:Landroid/widget/Button;

    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lzendesk/messaging/ui/LostConnectionBanner$1;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/LostConnectionBanner$1;-><init>(Lzendesk/messaging/ui/LostConnectionBanner;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Landroidx/transition/TransitionSet;

    invoke-direct {p1}, Landroidx/transition/TransitionSet;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/transition/TransitionSet;->M0(I)Landroidx/transition/TransitionSet;

    move-result-object p1

    new-instance v1, Landroidx/transition/Slide;

    const/16 v2, 0x30

    invoke-direct {v1, v2}, Landroidx/transition/Slide;-><init>(I)V

    invoke-virtual {p1, v1}, Landroidx/transition/TransitionSet;->C0(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;

    move-result-object p1

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v1}, Landroidx/transition/TransitionSet;->L0(Landroid/animation/TimeInterpolator;)Landroidx/transition/TransitionSet;

    move-result-object p1

    sget-wide v1, Lzendesk/messaging/ui/MessagingView;->DEFAULT_ANIMATION_DURATION:J

    invoke-virtual {p1, v1, v2}, Landroidx/transition/TransitionSet;->K0(J)Landroidx/transition/TransitionSet;

    move-result-object p1

    new-instance v3, Lzendesk/messaging/ui/LostConnectionBanner$2;

    invoke-direct {v3, p0, p2, p4, p3}, Lzendesk/messaging/ui/LostConnectionBanner$2;-><init>(Lzendesk/messaging/ui/LostConnectionBanner;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Lzendesk/messaging/ui/InputBox;)V

    invoke-virtual {p1, v3}, Landroidx/transition/TransitionSet;->A0(Landroidx/transition/Transition$f;)Landroidx/transition/TransitionSet;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->showAnimation:Landroidx/transition/TransitionSet;

    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->hideAnimation:Landroid/animation/AnimatorSet;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/animation/Animator;

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {p2, v4, v6, v1, v2}, Lzendesk/messaging/ui/ValueAnimators;->topPaddingAnimator(Landroid/view/View;IIJ)Landroid/animation/ValueAnimator;

    move-result-object v4

    aput-object v4, v3, v0

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result v4

    sub-int v4, v0, v4

    invoke-static {p4, v0, v4, v1, v2}, Lzendesk/messaging/ui/ValueAnimators;->topMarginAnimator(Landroid/view/View;IIJ)Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-virtual {p1, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, Lzendesk/messaging/ui/LostConnectionBanner$3;

    move-object v3, v0

    move-object v4, p0

    move-object v6, p2

    move-object v7, p4

    move-object v8, p3

    invoke-direct/range {v3 .. v8}, Lzendesk/messaging/ui/LostConnectionBanner$3;-><init>(Lzendesk/messaging/ui/LostConnectionBanner;Landroid/view/ViewGroup$MarginLayoutParams;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Lzendesk/messaging/ui/InputBox;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public static synthetic access$000(Lzendesk/messaging/ui/LostConnectionBanner;)Landroid/view/View$OnClickListener;
    .locals 0

    iget-object p0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->onRetryConnectionClickListener:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method public static synthetic access$102(Lzendesk/messaging/ui/LostConnectionBanner;Lzendesk/messaging/ui/LostConnectionBanner$State;)Lzendesk/messaging/ui/LostConnectionBanner$State;
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->state:Lzendesk/messaging/ui/LostConnectionBanner$State;

    return-object p1
.end method

.method public static synthetic access$200(Lzendesk/messaging/ui/LostConnectionBanner;)Landroidx/transition/TransitionSet;
    .locals 0

    iget-object p0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->showAnimation:Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method public static create(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Lzendesk/messaging/ui/InputBox;)Lzendesk/messaging/ui/LostConnectionBanner;
    .locals 2

    new-instance v0, Lzendesk/messaging/ui/LostConnectionBanner;

    sget v1, Lzendesk/messaging/R$id;->zui_lost_connection_view:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, p1, p2, v1}, Lzendesk/messaging/ui/LostConnectionBanner;-><init>(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Lzendesk/messaging/ui/InputBox;Landroid/view/View;)V

    return-object v0
.end method


# virtual methods
.method public hide()V
    .locals 2

    sget-object v0, Lzendesk/messaging/ui/LostConnectionBanner$5;->$SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State:[I

    iget-object v1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->state:Lzendesk/messaging/ui/LostConnectionBanner$State;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->hideAnimation:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->showAnimation:Landroidx/transition/TransitionSet;

    new-instance v1, Lzendesk/messaging/ui/LostConnectionBanner$4;

    invoke-direct {v1, p0}, Lzendesk/messaging/ui/LostConnectionBanner$4;-><init>(Lzendesk/messaging/ui/LostConnectionBanner;)V

    invoke-virtual {v0, v1}, Landroidx/transition/TransitionSet;->A0(Landroidx/transition/Transition$f;)Landroidx/transition/TransitionSet;

    return-void
.end method

.method public setOnRetryConnectionClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->onRetryConnectionClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public show()V
    .locals 2

    sget-object v0, Lzendesk/messaging/ui/LostConnectionBanner$5;->$SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State:[I

    iget-object v1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->state:Lzendesk/messaging/ui/LostConnectionBanner$State;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->rootView:Landroid/view/ViewGroup;

    iget-object v1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->showAnimation:Landroidx/transition/TransitionSet;

    invoke-static {v0, v1}, Landroidx/transition/c;->b(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    iget-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionBanner:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public update(Lzendesk/messaging/ConnectionState;)V
    .locals 2

    iget-object v0, p0, Lzendesk/messaging/ui/LostConnectionBanner;->currentConnectionState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lzendesk/messaging/ui/LostConnectionBanner$5;->$SwitchMap$zendesk$messaging$ConnectionState:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/16 v0, 0x8

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lzendesk/messaging/ui/LostConnectionBanner;->hide()V

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionTextView:Landroid/widget/TextView;

    sget v0, Lzendesk/messaging/R$string;->zui_label_reconnecting_failed:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionButton:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lzendesk/messaging/ui/LostConnectionBanner;->show()V

    return-void

    :pswitch_2
    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionTextView:Landroid/widget/TextView;

    sget v1, Lzendesk/messaging/R$string;->zui_label_reconnecting_failed:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionButton:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lzendesk/messaging/ui/LostConnectionBanner;->show()V

    return-void

    :pswitch_3
    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionTextView:Landroid/widget/TextView;

    sget v1, Lzendesk/messaging/R$string;->zui_label_reconnecting:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lzendesk/messaging/ui/LostConnectionBanner;->lostConnectionButton:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lzendesk/messaging/ui/LostConnectionBanner;->show()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
