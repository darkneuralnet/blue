.class public final LBd0$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBd0;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/CannotAccessBirdReport;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/CannotAccessBirdReport;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBd0;


# direct methods
.method public constructor <init>(LBd0;)V
    .locals 0

    iput-object p1, p0, LBd0$f;->g:LBd0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/CannotAccessBirdReport;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-object v0, p0, LBd0$f;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getAnalyticsManager$p(LBd0;)LEa;

    move-result-object v0

    new-instance v11, LWd0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, p0, LBd0$f;->g:LBd0;

    invoke-static {v2}, LBd0;->access$getBird$p(LBd0;)Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    const-string v12, "bird"

    if-nez v2, :cond_0

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_0
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v2, p0, LBd0$f;->g:LBd0;

    invoke-static {v2}, LBd0;->access$getSource$p(LBd0;)Lco/bird/android/model/InaccessibleReportSource;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "source"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/CannotAccessBirdReport;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/api/response/CannotAccessBirdReport;->getReason()Lco/bird/android/model/InaccessibleReason;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_2
    const-string v2, "unknown"

    :cond_3
    move-object v8, v2

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, LWd0;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v0, p0, LBd0$f;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object v0

    sget v2, Lnl4;->cannot_access_submission_success:I

    const/4 v3, 0x2

    invoke-static {v0, v2, v1, v3, v1}, Lh56$a;->topToast$default(Lh56;ILf56;ILjava/lang/Object;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    const-string v2, "activity_result"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, LBd0$f;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getBird$p(LBd0;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v1, p1

    :goto_0
    invoke-virtual {v0, v12, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, LBd0$f;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getNavigator$p(LBd0;)Le13;

    move-result-object p1

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Le13;->e4(ILandroid/content/Intent;)V

    goto :goto_1

    :cond_5
    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ltg1;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ltg1;->b()I

    move-result v1

    invoke-virtual {p1}, Ltg1;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error title \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", code \'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\', message: \'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' (thread: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_6
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    iget-object p1, p0, LBd0$f;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    sget v0, Lnl4;->cannot_access_submission_error:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    iget-object p1, p0, LBd0$f;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LXd0;->p(Z)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LBd0$f;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
