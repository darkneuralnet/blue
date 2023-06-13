.class public final synthetic LXP3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LYP3;


# direct methods
.method public synthetic constructor <init>(LYP3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXP3;->a:LYP3;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LXP3;->a:LYP3;

    invoke-static {v0, p1}, LYP3;->a(LYP3;Landroid/animation/ValueAnimator;)V

    return-void
.end method
