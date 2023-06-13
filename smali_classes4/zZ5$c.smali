.class public final LzZ5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzZ5;->b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        "kotlin.jvm.PlatformType",
        "flightSheetDetails",
        "",
        "a",
        "(Lco/bird/android/model/persistence/FlightSheetDetails;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LzZ5;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(LzZ5;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LzZ5$c;->g:LzZ5;

    iput-object p2, p0, LzZ5$c;->h:Ljava/lang/String;

    iput-object p3, p0, LzZ5$c;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/FlightSheetDetails;)V
    .locals 5

    iget-object v0, p0, LzZ5$c;->g:LzZ5;

    iget-object v1, p0, LzZ5$c;->h:Ljava/lang/String;

    invoke-static {v0, v1}, LzZ5;->access$setTaskOrderBirdId$p(LzZ5;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FlightSheetDetails;->getTaskOrderInfo()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LzZ5$c;->g:LzZ5;

    iget-object v1, p0, LzZ5$c;->h:Ljava/lang/String;

    iget-object v2, p0, LzZ5$c;->i:Ljava/lang/String;

    invoke-static {v0}, LzZ5;->access$getMutableTaskData$p(LzZ5;)La94;

    move-result-object v0

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v4, Lco/bird/android/model/TaskOrderData;

    invoke-direct {v4, v1, v2, p1}, Lco/bird/android/model/TaskOrderData;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;)V

    invoke-virtual {v3, v4}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    iget-object p1, p0, LzZ5$c;->g:LzZ5;

    invoke-static {p1}, LzZ5;->access$getMutableTaskData$p(LzZ5;)La94;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FlightSheetDetails;

    invoke-virtual {p0, p1}, LzZ5$c;->a(Lco/bird/android/model/persistence/FlightSheetDetails;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
