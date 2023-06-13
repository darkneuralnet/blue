.class public final synthetic LEj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LGj0;


# direct methods
.method public synthetic constructor <init>(LGj0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEj0;->a:LGj0;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LEj0;->a:LGj0;

    invoke-static {v0, p1}, LGj0;->a(LGj0;Landroid/animation/ValueAnimator;)V

    return-void
.end method
