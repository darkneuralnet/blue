.class public final LGK4$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGK4;->b(Landroid/content/Intent;)V
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
        "Lco/bird/android/model/Reservation;",
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
        "Lco/bird/android/model/Reservation;",
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
.field public final synthetic g:LGK4;


# direct methods
.method public constructor <init>(LGK4;)V
    .locals 0

    iput-object p1, p0, LGK4$f;->g:LGK4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/Reservation;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LGK4$f;->g:LGK4;

    invoke-static {p1}, LGK4;->access$getAnalyticsManager$p(LGK4;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/RiderReserveCancelFeedbackSubmitted;

    iget-object v1, p0, LGK4$f;->g:LGK4;

    invoke-static {v1}, LGK4;->access$getSelectedOptions$p(LGK4;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, LGK4$f;->g:LGK4;

    invoke-static {v2}, LGK4;->access$getUi$p(LGK4;)LKK4;

    move-result-object v2

    invoke-interface {v2}, LKK4;->U()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/RiderReserveCancelFeedbackSubmitted;-><init>(Ljava/util/Set;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LGK4$f;->g:LGK4;

    invoke-static {p1}, LGK4;->access$getActivity$p(LGK4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    iget-object p1, p0, LGK4$f;->g:LGK4;

    invoke-static {p1}, LGK4;->access$getNavigator$p(LGK4;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LGK4$f;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
