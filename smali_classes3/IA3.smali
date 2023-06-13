.class public final synthetic LIA3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LHA3$c;


# direct methods
.method public synthetic constructor <init>(LHA3$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIA3;->a:LHA3$c;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LIA3;->a:LHA3$c;

    invoke-static {v0, p1}, LHA3$c;->e(LHA3$c;Landroid/animation/ValueAnimator;)V

    return-void
.end method
