.class public final LCu4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAu4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LCu4;",
        "LAu4;",
        "Lio/reactivex/c;",
        "o0",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/ZoneAssignmentGroup;",
        "z0",
        "",
        "id",
        "Q0",
        "clear",
        "LFu4;",
        "a",
        "LFu4;",
        "releaseClient",
        "LxI6;",
        "b",
        "LxI6;",
        "zoneAssignmentDao",
        "Lgl;",
        "c",
        "Lgl;",
        "preferences",
        "<init>",
        "(LFu4;LxI6;Lgl;)V",
        "co.bird.android.repository.release-assignment"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LFu4;

.field public final b:LxI6;

.field public final c:Lgl;


# direct methods
.method public constructor <init>(LFu4;LxI6;Lgl;)V
    .locals 1

    const-string v0, "releaseClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneAssignmentDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferences"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCu4;->a:LFu4;

    iput-object p2, p0, LCu4;->b:LxI6;

    iput-object p3, p0, LCu4;->c:Lgl;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LCu4;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getPreferences$p(LCu4;)Lgl;
    .locals 0

    iget-object p0, p0, LCu4;->c:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getZoneAssignmentDao$p(LCu4;)LxI6;
    .locals 0

    iget-object p0, p0, LCu4;->b:LxI6;

    return-object p0
.end method


# virtual methods
.method public K1(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, LAu4$a;->a(LAu4;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public Q0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCu4;->a:LFu4;

    new-instance v1, Lco/bird/api/request/CappedZoneReservationCancelRequest;

    invoke-direct {v1, p1}, Lco/bird/api/request/CappedZoneReservationCancelRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LFu4;->b(Lco/bird/api/request/CappedZoneReservationCancelRequest;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, LCu4;->b:LxI6;

    invoke-virtual {v0}, LxI6;->a()Lio/reactivex/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "merge(listOf(\n      zone\u2026gnmentDao.clear(),\n    ))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public o0()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LCu4;->a:LFu4;

    invoke-interface {v0}, LFu4;->a()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LCu4$a;

    invoke-direct {v1, p0}, LCu4$a;-><init>(LCu4;)V

    new-instance v2, LBu4;

    invoke-direct {v2, v1}, LBu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun fetchZoneAs\u2026learOnError()\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public z0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZoneAssignmentGroup;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LCu4;->b:LxI6;

    invoke-virtual {v0}, LxI6;->c()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
