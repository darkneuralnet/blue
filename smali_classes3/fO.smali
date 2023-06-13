.class public final synthetic LfO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LgO;


# direct methods
.method public synthetic constructor <init>(LgO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfO;->a:LgO;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LfO;->a:LgO;

    invoke-static {v0, p1}, LgO;->Pl(LgO;Landroid/animation/ValueAnimator;)V

    return-void
.end method
