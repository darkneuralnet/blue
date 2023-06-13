.class public Lzendesk/commonui/AlmostRealProgressBar$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/commonui/AlmostRealProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/animation/Animator;

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->b:Z

    iput-boolean v0, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->c:Z

    iput-object p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->a:Landroid/animation/Animator;

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/animation/Animator;
    .locals 1

    iget-object v0, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->a:Landroid/animation/Animator;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->c:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->b:Z

    return v0
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->b:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->c:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->b:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->c:Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->b:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->c:Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->b:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/commonui/AlmostRealProgressBar$c;->c:Z

    return-void
.end method
