.class public final synthetic LPk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LRk5;


# direct methods
.method public synthetic constructor <init>(LRk5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPk5;->a:LRk5;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LPk5;->a:LRk5;

    invoke-static {v0, p1}, LRk5;->Wl(LRk5;Landroid/animation/ValueAnimator;)V

    return-void
.end method
