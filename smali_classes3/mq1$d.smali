.class public abstract Lmq1$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmq1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00a2\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001a"
    }
    d2 = {
        "Lmq1$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;",
        "Landroid/widget/ImageView;",
        "chevron",
        "e",
        "LKp6;",
        "b",
        "LKp6;",
        "getBinding",
        "()LKp6;",
        "binding",
        "Landroid/animation/ValueAnimator;",
        "c",
        "Landroid/animation/ValueAnimator;",
        "animator",
        "j",
        "()Landroid/widget/ImageView;",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lmq1;Landroid/view/View;LKp6;)V",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LKp6;

.field public c:Landroid/animation/ValueAnimator;

.field public final synthetic d:Lmq1;


# direct methods
.method public constructor <init>(Lmq1;Landroid/view/View;LKp6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LKp6;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmq1$d;->d:Lmq1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p3, p0, Lmq1$d;->b:LKp6;

    invoke-interface {p3}, LKp6;->getRoot()Landroid/view/View;

    move-result-object p2

    const-string p3, "binding.root"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lmq1$d$a;

    invoke-direct {p3, p0, p1}, Lmq1$d$a;-><init>(Lmq1$d;Lmq1;)V

    invoke-static {p2, p3}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic a(Landroid/widget/ImageView;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lmq1$d;->i(Landroid/widget/ImageView;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic b(Lmq1$d;Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;Landroid/widget/ImageView;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmq1$d;->e(Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;Landroid/widget/ImageView;)V

    return-void
.end method

.method public static final i(Landroid/widget/ImageView;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, Lmq1$d;->d:Lmq1;

    invoke-static {v0}, Lmq1;->access$getAdapterData(Lmq1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    iget-object v0, p0, Lmq1$d;->d:Lmq1;

    invoke-static {v0}, Lmq1;->access$getAdapterData(Lmq1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->i(LG6;)LH6;

    move-result-object p1

    invoke-virtual {p1}, LH6;->c()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lmq1$d;->j()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v3, v1, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lmq1$d;->b:LKp6;

    invoke-interface {v0}, LKp6;->getRoot()Landroid/view/View;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0}, Lmq1$d;->j()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LG6;->d()Z

    move-result p1

    if-ne p1, v2, :cond_2

    move v1, v2

    :cond_2
    if-eqz v1, :cond_3

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    :goto_1
    return-void
.end method

.method public final e(Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;Landroid/widget/ImageView;)V
    .locals 3

    if-eqz p2, :cond_2

    iget-object v0, p0, Lmq1$d;->d:Lmq1;

    invoke-static {v0}, Lmq1;->access$getExpandedStates$p(Lmq1;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget-object v0, p0, Lmq1$d;->c:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    invoke-virtual {p2}, Landroid/view/View;->getScaleX()F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    aput p1, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-wide/16 v0, 0x96

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v0, Lnq1;

    invoke-direct {v0, p2}, Lnq1;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    iput-object p1, p0, Lmq1$d;->c:Landroid/animation/ValueAnimator;

    :cond_2
    return-void
.end method

.method public abstract j()Landroid/widget/ImageView;
.end method
