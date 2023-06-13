.class public final synthetic LSj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LWj0;


# direct methods
.method public synthetic constructor <init>(LWj0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSj0;->a:LWj0;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LSj0;->a:LWj0;

    invoke-static {v0, p1}, LWj0;->v(LWj0;Landroid/animation/ValueAnimator;)V

    return-void
.end method
