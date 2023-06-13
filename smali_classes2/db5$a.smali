.class public final Ldb5$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldb5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Ldb5$a;",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;",
        "Landroid/view/MotionEvent;",
        "e",
        "",
        "onDown",
        "onSingleTapUp",
        "e1",
        "e2",
        "",
        "velocityX",
        "velocityY",
        "onFling",
        "<init>",
        "(Ldb5;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Ldb5;


# direct methods
.method public constructor <init>(Ldb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    const-string v0, "e1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e2"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p1, p1, p2

    const/4 p2, 0x0

    if-gez p1, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    cmpl-float p1, p3, p1

    const/4 p3, 0x1

    if-lez p1, :cond_1

    move p1, p3

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    iget-object p4, p0, Ldb5$a;->b:Ldb5;

    invoke-static {p4}, Ldb5;->access$getLottieGallery$p(Ldb5;)Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object p4

    invoke-virtual {p4}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    if-ne p4, p3, :cond_2

    move p2, p3

    :cond_2
    xor-int/2addr p1, p2

    if-eqz p1, :cond_3

    iget-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-static {p1}, Ldb5;->access$previous(Ldb5;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-virtual {p1}, Ldb5;->next()V

    :goto_1
    return p3
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldb5$a;->b:Ldb5;

    invoke-static {v0}, Ldb5;->access$getLottieGallery$p(Ldb5;)Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Ldb5$a;->b:Ldb5;

    invoke-static {v0}, Ldb5;->access$getLottieGallery$p(Ldb5;)Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v2, 0x3f19999a    # 0.6f

    mul-float/2addr v0, v2

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    iget-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-virtual {p1}, Ldb5;->next()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-static {p1}, Ldb5;->access$previous(Ldb5;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Ldb5$a;->b:Ldb5;

    invoke-static {v0}, Ldb5;->access$getLottieGallery$p(Ldb5;)Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v2, 0x3ecccccc    # 0.39999998f

    mul-float/2addr v0, v2

    cmpl-float p1, p1, v0

    if-lez p1, :cond_2

    iget-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-virtual {p1}, Ldb5;->next()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ldb5$a;->b:Ldb5;

    invoke-static {p1}, Ldb5;->access$previous(Ldb5;)V

    :goto_0
    return v1
.end method
