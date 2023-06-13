.class public final synthetic LyQ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LAQ5;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(LAQ5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyQ5;->a:LAQ5;

    iput-boolean p2, p0, LyQ5;->b:Z

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, LyQ5;->a:LAQ5;

    iget-boolean v1, p0, LyQ5;->b:Z

    invoke-static {v0, v1, p1}, LAQ5;->Pl(LAQ5;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method
