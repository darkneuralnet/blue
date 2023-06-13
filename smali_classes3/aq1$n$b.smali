.class public final Laq1$n$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq1$n;->d(Lkotlin/Triple;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/persistence/FleetReport;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "e",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/persistence/FleetReport;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Throwable;)Lio/reactivex/B;",
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
.field public final synthetic g:Laq1;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/persistence/FleetReportPeriod;

.field public final synthetic j:Lco/bird/android/model/constant/FleetReportPage;


# direct methods
.method public constructor <init>(Laq1;Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)V
    .locals 0

    iput-object p1, p0, Laq1$n$b;->g:Laq1;

    iput-object p2, p0, Laq1$n$b;->h:Ljava/lang/String;

    iput-object p3, p0, Laq1$n$b;->i:Lco/bird/android/model/persistence/FleetReportPeriod;

    iput-object p4, p0, Laq1$n$b;->j:Lco/bird/android/model/constant/FleetReportPage;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Laq1$n$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Throwable;)Lio/reactivex/B;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/persistence/FleetReport;",
            ">;"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Laq1$n$b;->g:Laq1;

    invoke-static {p1}, Laq1;->access$getManager$p(Laq1;)LHp1;

    move-result-object v0

    iget-object v1, p0, Laq1$n$b;->h:Ljava/lang/String;

    iget-object v2, p0, Laq1$n$b;->i:Lco/bird/android/model/persistence/FleetReportPeriod;

    iget-object v3, p0, Laq1$n$b;->j:Lco/bird/android/model/constant/FleetReportPage;

    invoke-interface {v0, v1, v2, v3}, LHp1;->u(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1, v0}, Laq1;->access$progress(Laq1;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Laq1$n$b$a;

    iget-object v1, p0, Laq1$n$b;->g:Laq1;

    invoke-direct {v0, v1}, Laq1$n$b$a;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lfq1;

    invoke-direct {v1, v0}, Lfq1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Laq1$b;

    invoke-direct {v0}, Laq1$b;-><init>()V

    invoke-static {v0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Laq1$n$b;->invoke(Ljava/lang/Throwable;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
