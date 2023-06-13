.class public final Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0008\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/view/ViewPropertyAnimator;",
        "k",
        "n",
        "La00;",
        "b",
        "La00;",
        "binding",
        "Lco/bird/android/feature/ar/view/SemiCircleMapView;",
        "c",
        "Lco/bird/android/feature/ar/view/SemiCircleMapView;",
        "i",
        "()Lco/bird/android/feature/ar/view/SemiCircleMapView;",
        "mapView",
        "Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;",
        "d",
        "Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;",
        "j",
        "()Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;",
        "parkingStatus",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "co.bird.android.feature.ar-parking"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:La00;

.field public final c:Lco/bird/android/feature/ar/view/SemiCircleMapView;

.field public final d:Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, La00;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La00;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this, true)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->b:La00;

    iget-object p2, p1, La00;->b:Lco/bird/android/feature/ar/view/SemiCircleMapView;

    const-string p3, "binding.mapView"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->c:Lco/bird/android/feature/ar/view/SemiCircleMapView;

    iget-object p1, p1, La00;->c:Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;

    const-string p2, "binding.parkingStatus"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->d:Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic e(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->p(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    return-void
.end method

.method public static synthetic f(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->l(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    return-void
.end method

.method public static synthetic g(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->m(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    return-void
.end method

.method public static synthetic h(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->o(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    return-void
.end method

.method public static final l(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static final m(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static final o(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static final p(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final i()Lco/bird/android/feature/ar/view/SemiCircleMapView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->c:Lco/bird/android/feature/ar/view/SemiCircleMapView;

    return-object v0
.end method

.method public final j()Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->d:Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;

    return-object v0
.end method

.method public final k()Landroid/view/ViewPropertyAnimator;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, LIH3;

    invoke-direct {v1, p0}, LIH3;-><init>(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, LJH3;

    invoke-direct {v1, p0}, LJH3;-><init>(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-string v1, "animate()\n      .setStar\u2026translationY = 0f\n      }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final n()Landroid/view/ViewPropertyAnimator;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, LGH3;

    invoke-direct {v1, p0}, LGH3;-><init>(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, LHH3;

    invoke-direct {v1, p0}, LHH3;-><init>(Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-string v1, "animate()\n      .setDura\u2026 = View.INVISIBLE\n      }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
