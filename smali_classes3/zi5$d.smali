.class public final Lzi5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi5;->x(LAi5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzi5$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lhi5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lhi5;",
        "kotlin.jvm.PlatformType",
        "cardClicked",
        "",
        "a",
        "(Lhi5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lzi5;


# direct methods
.method public constructor <init>(Lzi5;)V
    .locals 0

    iput-object p1, p0, Lzi5$d;->g:Lzi5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhi5;)V
    .locals 9

    iget-object v0, p0, Lzi5$d;->g:Lzi5;

    invoke-static {v0}, Lzi5;->access$getAnalyticsManager$p(Lzi5;)LEa;

    move-result-object v0

    new-instance v8, Lgi5;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lgi5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    sget-object v0, Lzi5$d$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzi5$d;->g:Lzi5;

    invoke-virtual {p1}, Lzi5;->J()Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->s4()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lzi5$d;->g:Lzi5;

    invoke-virtual {p1}, Lzi5;->J()Le13;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "save_money"

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Le13$a;->goToPreloadV2OptionsSelection$default(Le13;ZZLjava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lzi5$d;->g:Lzi5;

    invoke-virtual {p1}, Lzi5;->J()Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->R3()V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lzi5$d;->g:Lzi5;

    invoke-virtual {p1}, Lzi5;->J()Le13;

    move-result-object p1

    invoke-static {p1, v1, v0, v1}, Le13$a;->goToRidePassV4$default(Le13;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lzi5$d;->g:Lzi5;

    invoke-virtual {p1}, Lzi5;->J()Le13;

    move-result-object p1

    invoke-static {p1, v1, v0, v1}, Le13$a;->goToBirdPlus$default(Le13;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhi5;

    invoke-virtual {p0, p1}, Lzi5$d;->a(Lhi5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
