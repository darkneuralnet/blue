.class public Landroidx/transition/TransitionSet$b;
.super Landroidx/transition/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/TransitionSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Landroidx/transition/TransitionSet;


# direct methods
.method public constructor <init>(Landroidx/transition/TransitionSet;)V
    .locals 0

    invoke-direct {p0}, Landroidx/transition/b;-><init>()V

    iput-object p1, p0, Landroidx/transition/TransitionSet$b;->a:Landroidx/transition/TransitionSet;

    return-void
.end method


# virtual methods
.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 2

    iget-object v0, p0, Landroidx/transition/TransitionSet$b;->a:Landroidx/transition/TransitionSet;

    iget v1, v0, Landroidx/transition/TransitionSet;->R:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Landroidx/transition/TransitionSet;->R:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/TransitionSet;->S:Z

    invoke-virtual {v0}, Landroidx/transition/Transition;->w()V

    :cond_0
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->h0(Landroidx/transition/Transition$f;)Landroidx/transition/Transition;

    return-void
.end method

.method public onTransitionStart(Landroidx/transition/Transition;)V
    .locals 1

    iget-object p1, p0, Landroidx/transition/TransitionSet$b;->a:Landroidx/transition/TransitionSet;

    iget-boolean v0, p1, Landroidx/transition/TransitionSet;->S:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/transition/Transition;->y0()V

    iget-object p1, p0, Landroidx/transition/TransitionSet$b;->a:Landroidx/transition/TransitionSet;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/transition/TransitionSet;->S:Z

    :cond_0
    return-void
.end method
