.class public Lzendesk/belvedere/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/h;->w(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/Window;

.field public final synthetic b:Landroid/animation/ValueAnimator;

.field public final synthetic c:Lzendesk/belvedere/h;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/h;Landroid/view/Window;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/h$f;->c:Lzendesk/belvedere/h;

    iput-object p2, p0, Lzendesk/belvedere/h$f;->a:Landroid/view/Window;

    iput-object p3, p0, Lzendesk/belvedere/h$f;->b:Landroid/animation/ValueAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object p1, p0, Lzendesk/belvedere/h$f;->a:Landroid/view/Window;

    iget-object v0, p0, Lzendesk/belvedere/h$f;->b:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method
