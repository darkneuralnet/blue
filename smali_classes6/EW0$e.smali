.class public LEW0$e;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xc
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEW0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final a:LEW0$i;

.field public final b:LfM2;

.field public final c:Lcom/google/android/gms/maps/model/LatLng;

.field public final d:Lcom/google/android/gms/maps/model/LatLng;

.field public e:Z

.field public f:LlM2;

.field public final synthetic g:LEW0;


# direct methods
.method public constructor <init>(LEW0;LEW0$i;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, LEW0$e;->g:LEW0;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, LEW0$e;->a:LEW0$i;

    invoke-static {p2}, LEW0$i;->a(LEW0$i;)LfM2;

    move-result-object p1

    iput-object p1, p0, LEW0$e;->b:LfM2;

    iput-object p3, p0, LEW0$e;->c:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p4, p0, LEW0$e;->d:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public synthetic constructor <init>(LEW0;LEW0$i;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;LFW0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LEW0$e;-><init>(LEW0;LEW0$i;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-static {}, LEW0;->q()Landroid/animation/TimeInterpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b(LlM2;)V
    .locals 0

    iput-object p1, p0, LEW0$e;->f:LlM2;

    const/4 p1, 0x1

    iput-boolean p1, p0, LEW0$e;->e:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, LEW0$e;->e:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LEW0$e;->g:LEW0;

    invoke-static {p1}, LEW0;->k(LEW0;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LEW0$e;->b:LfM2;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDl0;

    iget-object v0, p0, LEW0$e;->g:LEW0;

    invoke-static {v0}, LEW0;->d(LEW0;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LEW0$e;->g:LEW0;

    invoke-static {p1}, LEW0;->j(LEW0;)LEW0$g;

    move-result-object p1

    iget-object v0, p0, LEW0$e;->b:LfM2;

    invoke-virtual {p1, v0}, LEW0$g;->d(LfM2;)V

    iget-object p1, p0, LEW0$e;->g:LEW0;

    invoke-static {p1}, LEW0;->k(LEW0;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LEW0$e;->b:LfM2;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LEW0$e;->f:LlM2;

    iget-object v0, p0, LEW0$e;->b:LfM2;

    invoke-virtual {p1, v0}, LlM2;->f(LfM2;)Z

    :cond_0
    iget-object p1, p0, LEW0$e;->a:LEW0$i;

    iget-object v0, p0, LEW0$e;->d:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v0}, LEW0$i;->c(LEW0$i;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 12

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget-object v0, p0, LEW0$e;->d:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-object v3, p0, LEW0$e;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v1, v4

    float-to-double v6, p1

    mul-double/2addr v1, v6

    add-double/2addr v1, v4

    iget-wide v4, v0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v8, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    sub-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    const-wide v10, 0x4066800000000000L    # 180.0

    cmpl-double p1, v8, v10

    if-lez p1, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    const-wide v10, 0x4076800000000000L    # 360.0

    mul-double/2addr v8, v10

    sub-double/2addr v4, v8

    :cond_0
    mul-double/2addr v4, v6

    iget-object p1, p0, LEW0$e;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v6, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    add-double/2addr v4, v6

    new-instance p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p1, v1, v2, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v0, p0, LEW0$e;->b:LfM2;

    invoke-virtual {v0, p1}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
