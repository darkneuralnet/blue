.class public final synthetic LHq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/search/a;

.field public final synthetic b:F

.field public final synthetic c:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/search/a;FLandroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHq5;->a:Lcom/google/android/material/search/a;

    iput p2, p0, LHq5;->b:F

    iput-object p3, p0, LHq5;->c:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, LHq5;->a:Lcom/google/android/material/search/a;

    iget v1, p0, LHq5;->b:F

    iget-object v2, p0, LHq5;->c:Landroid/graphics/Rect;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/material/search/a;->b(Lcom/google/android/material/search/a;FLandroid/graphics/Rect;Landroid/animation/ValueAnimator;)V

    return-void
.end method
