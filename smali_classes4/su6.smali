.class public final Lsu6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0010\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006*\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u000e\u0010\u000b\u001a\u00020\n*\u00060\u0005j\u0002`\t\u001a\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006*\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u0004*\n\u0010\u000e\"\u00020\u00052\u00020\u0005\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroid/widget/ScrollView;",
        "Lio/reactivex/F;",
        "",
        "e",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "Landroid/view/View;",
        "Lio/reactivex/Observable;",
        "",
        "g",
        "Lco/bird/android/widget/extension/DialogContentView;",
        "",
        "d",
        "LOZ;",
        "c",
        "DialogContentView",
        "widget_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lio/reactivex/y;)V
    .locals 0

    invoke-static {p0, p1}, Lsu6;->h(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lio/reactivex/y;)V

    return-void
.end method

.method public static synthetic b(Landroid/widget/ScrollView;Lio/reactivex/H;)V
    .locals 0

    invoke-static {p0, p1}, Lsu6;->f(Landroid/widget/ScrollView;Lio/reactivex/H;)V

    return-void
.end method

.method public static final c(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "+",
            "Landroid/view/View;",
            ">;)",
            "Lio/reactivex/Observable<",
            "LOZ;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsu6$a;

    invoke-direct {v0, p0}, Lsu6$a;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-static {v0}, Lnh5;->i(Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroid/view/View;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lsu6$b;

    invoke-direct {v1, p0}, Lsu6$b;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public static final e(Landroid/widget/ScrollView;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ScrollView;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpu6;

    invoke-direct {v0, p0}, Lpu6;-><init>(Landroid/widget/ScrollView;)V

    invoke-static {v0}, Lio/reactivex/F;->j(Lio/reactivex/J;)Lio/reactivex/F;

    move-result-object p0

    const-string v0, "create { emitter ->\n    \u2026(this)\n      }\n    })\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final f(Landroid/widget/ScrollView;Lio/reactivex/H;)V
    .locals 2

    const-string v0, "$this_scrollable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lsu6$c;

    invoke-direct {v1, p1, p0}, Lsu6$c;-><init>(Lio/reactivex/H;Landroid/widget/ScrollView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public static final g(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/view/View;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqu6;

    invoke-direct {v0, p0}, Lqu6;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    const-string v0, "create { emitter ->\n    \u2026 p1: Float) {}\n    })\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final h(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lio/reactivex/y;)V
    .locals 1

    const-string v0, "$this_stateChanged"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsu6$d;

    invoke-direct {v0, p1}, Lsu6$d;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    return-void
.end method
