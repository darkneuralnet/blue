.class public final Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/y<",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/y;",
        "",
        "emitter",
        "b",
        "(Lio/reactivex/y;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity$e;->g:Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lio/reactivex/y;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity$e;->c(Lio/reactivex/y;)V

    return-void
.end method

.method public static final c(Lio/reactivex/y;)V
    .locals 1

    const-string v0, "$emitter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p0, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity$e;->g:Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;

    invoke-static {v0}, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;->access$getBinding$p(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)Ld5;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ld5;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    new-instance v1, Lbu4;

    invoke-direct {v1, p1}, Lbu4;-><init>(Lio/reactivex/y;)V

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/y;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity$e;->b(Lio/reactivex/y;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
