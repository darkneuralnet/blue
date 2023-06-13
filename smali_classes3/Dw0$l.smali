.class public final LDw0$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDw0;->y(LFw0;)V
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
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/model/persistence/Tutorial;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/persistence/Tutorial;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
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
.field public final synthetic g:LDw0;


# direct methods
.method public constructor <init>(LDw0;)V
    .locals 0

    iput-object p1, p0, LDw0$l;->g:LDw0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(ZLDw0;Lco/bird/android/model/persistence/Tutorial;)V
    .locals 0

    invoke-static {p0, p1, p2}, LDw0$l;->b(ZLDw0;Lco/bird/android/model/persistence/Tutorial;)V

    return-void
.end method

.method public static final b(ZLDw0;Lco/bird/android/model/persistence/Tutorial;)V
    .locals 10

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    new-instance p0, Le83;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Tutorial;->getPages()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p0, p2}, Le83;-><init>(I)V

    invoke-virtual {p1, p0}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LDw0;->access$getAnalyticsManager$p(LDw0;)LEa;

    move-result-object p0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Tutorial;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Tutorial;->getViewCount()I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    invoke-static {p1}, LDw0;->access$getEndRideManager$p(LDw0;)LXc1;

    move-result-object v0

    invoke-interface {v0}, LXc1;->n()Ljava/lang/String;

    move-result-object v5

    new-instance v9, LQa6;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LQa6;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    new-instance p0, LR51;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Tutorial;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, LR51;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lf1;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/Tutorial;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getSkippable()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, LDw0$l;->g:LDw0;

    invoke-static {v1}, LDw0;->access$getKeepUnseen$p(LDw0;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LDw0$l;->g:LDw0;

    invoke-static {v1}, LDw0;->access$getManager$p(LDw0;)Llw0;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Llw0;->B(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    :goto_0
    iget-object v2, p0, LDw0$l;->g:LDw0;

    new-instance v3, LEw0;

    invoke-direct {v3, v0, v2, p1}, LEw0;-><init>(ZLDw0;Lco/bird/android/model/persistence/Tutorial;)V

    invoke-virtual {v1, v3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LDw0$l;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
