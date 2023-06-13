.class public final LGL5$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGL5;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGL5;


# direct methods
.method public constructor <init>(LGL5;)V
    .locals 0

    iput-object p1, p0, LGL5$l;->g:LGL5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LGL5$l;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getUnlockCount$p(LGL5;)I

    move-result p1

    if-gtz p1, :cond_3

    sget-object p1, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    iget-object v0, p0, LGL5$l;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getMapMode(LGL5;)Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LGL5$l;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getUnlocking$p(LGL5;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_0
    iget-object p1, p0, LGL5$l;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getPrivateBird$p(LGL5;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LGL5$l;->g:LGL5;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LGL5;->access$setConfirmDialogShowing$p(LGL5;Z)V

    iget-object p1, p0, LGL5$l;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getUnlocking$p(LGL5;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LGL5$l;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getUi$p(LGL5;)LWL5;

    move-result-object p1

    sget v0, Lcj4;->dialog_cancel_smartlock_unlock:I

    iget-object v1, p0, LGL5$l;->g:LGL5;

    invoke-static {v1}, LGL5;->access$getLockState$p(LGL5;)Lgx2;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LWL5;->Dc(ILgx2;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, LGL5$l;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getUi$p(LGL5;)LWL5;

    move-result-object p1

    sget v0, Lcj4;->dialog_cancel_smartlock_lock:I

    iget-object v1, p0, LGL5$l;->g:LGL5;

    invoke-static {v1}, LGL5;->access$getLockState$p(LGL5;)Lgx2;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LWL5;->x9(ILgx2;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_0
    sget-object p1, Lco/bird/android/model/DialogResponse;->OK:Lco/bird/android/model/DialogResponse;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "{\n          // Simulate \u2026logResponse.OK)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LGL5$l;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
