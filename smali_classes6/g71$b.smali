.class public Lg71$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg71;->o(Landroid/animation/ValueAnimator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg71;


# direct methods
.method public constructor <init>(Lg71;)V
    .locals 0

    iput-object p1, p0, Lg71$b;->a:Lg71;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Lg71$b;->a:Lg71;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lg71;->b(Lg71;ZZ)Z

    iget-object p1, p0, Lg71$b;->a:Lg71;

    invoke-static {p1}, Lg71;->c(Lg71;)V

    return-void
.end method
