.class public LFj0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFj0;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LFj0$c;

.field public final synthetic b:LFj0;


# direct methods
.method public constructor <init>(LFj0;LFj0$c;)V
    .locals 0

    iput-object p1, p0, LFj0$a;->b:LFj0;

    iput-object p2, p0, LFj0$a;->a:LFj0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, LFj0$a;->b:LFj0;

    iget-object v1, p0, LFj0$a;->a:LFj0$c;

    invoke-virtual {v0, p1, v1}, LFj0;->n(FLFj0$c;)V

    iget-object v0, p0, LFj0$a;->b:LFj0;

    iget-object v1, p0, LFj0$a;->a:LFj0$c;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, LFj0;->b(FLFj0$c;Z)V

    iget-object p1, p0, LFj0$a;->b:LFj0;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
