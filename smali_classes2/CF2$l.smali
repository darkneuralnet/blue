.class public final LCF2$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCF2;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lqa1;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lqa1;",
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
.field public final synthetic g:LCF2;


# direct methods
.method public constructor <init>(LCF2;)V
    .locals 0

    iput-object p1, p0, LCF2$l;->g:LCF2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LCF2$l;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lqa1;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LCF2$l;->g:LCF2;

    invoke-static {p1}, LCF2;->access$getOptInEnabled$p(LCF2;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LCF2$l;->g:LCF2;

    invoke-static {p1}, LCF2;->access$getOptInManager$p(LCF2;)LEp0;

    move-result-object p1

    iget-object v0, p0, LCF2$l;->g:LCF2;

    invoke-static {v0}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object v0

    invoke-interface {v0}, LKF2;->X0()Z

    move-result v0

    iget-object v1, p0, LCF2$l;->g:LCF2;

    invoke-static {v1}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object v1

    invoke-interface {v1}, LKF2;->E0()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LEp0;->a(ZLjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LCF2$l;->g:LCF2;

    invoke-static {p1}, LCF2;->access$getAnalyticsManager$p(LCF2;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/EmailSubmitted;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lco/bird/android/model/analytics/EmailSubmitted;-><init>(Z)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method
