.class public final Lmg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljg;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0008\u0010\u000e\u001a\u00020\u0002H\u0016J\u0008\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lmg;",
        "Ljg;",
        "Lio/reactivex/c;",
        "p",
        "Lco/bird/android/model/constant/AnnouncementContext;",
        "context",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/Announcement;",
        "b0",
        "F",
        "",
        "announcementId",
        "q",
        "e1",
        "clear",
        "Lpg;",
        "a",
        "Lpg;",
        "announcementClient",
        "Leg;",
        "b",
        "Leg;",
        "announcementDao",
        "<init>",
        "(Lpg;Leg;)V",
        "co.bird.android.repository.announcement"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lpg;

.field public final b:Leg;


# direct methods
.method public constructor <init>(Lpg;Leg;)V
    .locals 1

    const-string v0, "announcementClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "announcementDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmg;->a:Lpg;

    iput-object p2, p0, Lmg;->b:Leg;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lmg;->N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lmg;->M1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final M1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getAnnouncementDao$p(Lmg;)Leg;
    .locals 0

    iget-object p0, p0, Lmg;->b:Leg;

    return-object p0
.end method


# virtual methods
.method public F()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lmg;->b:Leg;

    sget-object v1, Lco/bird/android/model/constant/AnnouncementDisplayType;->BANNER:Lco/bird/android/model/constant/AnnouncementDisplayType;

    invoke-virtual {v0, v1}, Leg;->b(Lco/bird/android/model/constant/AnnouncementDisplayType;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lmg$b;->g:Lmg$b;

    new-instance v2, Llg;

    invoke-direct {v2, v1}, Llg;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "announcementDao.announce\u2026ement.isGenericBanner } }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public L1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljg$a;->a(Ljg;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public b0(Lco/bird/android/model/constant/AnnouncementContext;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AnnouncementContext;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;>;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmg;->b:Leg;

    invoke-virtual {v0, p1}, Leg;->a(Lco/bird/android/model/constant/AnnouncementContext;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmg;->L1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    invoke-virtual {p0}, Lmg;->e1()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public e1()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, Lmg;->b:Leg;

    invoke-virtual {v0}, Leg;->c()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public p()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, Lmg;->a:Lpg;

    invoke-interface {v0}, Lpg;->b()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lmg$a;

    invoke-direct {v1, p0}, Lmg$a;-><init>(Lmg;)V

    new-instance v2, Lkg;

    invoke-direct {v2, v1}, Lkg;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun fetchAnnoun\u2026 )\n        ))\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "announcementId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmg;->a:Lpg;

    new-instance v1, Lco/bird/api/request/AnnouncementsSeenBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/AnnouncementsSeenBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lpg;->a(Lco/bird/api/request/AnnouncementsSeenBody;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p0}, Lmg;->p()Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "announcementClient.annou\u2026hen(fetchAnnouncements())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
