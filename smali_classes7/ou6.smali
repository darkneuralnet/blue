.class public final synthetic Lou6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/stripe/android/view/ViewWidthAnimator;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/ViewWidthAnimator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lou6;->a:Lcom/stripe/android/view/ViewWidthAnimator;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lou6;->a:Lcom/stripe/android/view/ViewWidthAnimator;

    invoke-static {v0, p1}, Lcom/stripe/android/view/ViewWidthAnimator;->a(Lcom/stripe/android/view/ViewWidthAnimator;Landroid/animation/ValueAnimator;)V

    return-void
.end method
