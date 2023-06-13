.class public final LZx3$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZx3;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "zoneId",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/String;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZx3;


# direct methods
.method public constructor <init>(LZx3;)V
    .locals 0

    iput-object p1, p0, LZx3$v;->g:LZx3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LZx3;Ljava/lang/String;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LZx3$v;->c(LZx3;Ljava/lang/String;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LZx3;Ljava/lang/String;)Lio/reactivex/B;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZx3;->access$getZoneManager$p(LZx3;)LQI6;

    move-result-object p0

    invoke-interface {p0, p1}, LQI6;->g0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lio/reactivex/B;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZx3$v;->g:LZx3;

    invoke-static {v0}, LZx3;->access$getZoneManager$p(LZx3;)LQI6;

    move-result-object v0

    invoke-interface {v0, p1}, LQI6;->i0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LZx3$v;->g:LZx3;

    invoke-static {v1}, LZx3;->access$getOperatorUi$p(LZx3;)LCw3;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LZx3$v;->g:LZx3;

    new-instance v2, Lby3;

    invoke-direct {v2, v1, p1}, Lby3;-><init>(LZx3;Ljava/lang/String;)V

    invoke-static {v2}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LZx3$v;->b(Ljava/lang/String;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
