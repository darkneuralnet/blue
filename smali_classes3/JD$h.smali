.class public final LJD$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJD;->a(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lco/bird/android/model/WorkOrder;",
        "+",
        "Lco/bird/android/model/BirdSummaryBody;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/MobilePartner;",
        ">;+",
        "Ljava/util/Map<",
        "Lco/bird/android/model/Issue;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairType;",
        ">;>;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairTypeLock;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\r\u001a\u00020\u000c2\u00b7\u0001\u0010\u000b\u001a\u00b2\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u0008 \u0003*X\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u0008\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\r\u0010\u000e"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/WorkOrder;",
        "Lco/bird/android/model/BirdSummaryBody;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/MobilePartner;",
        "",
        "Lco/bird/android/model/Issue;",
        "",
        "Lco/bird/android/model/RepairType;",
        "Lco/bird/android/model/RepairTypeLock;",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LRe4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJD;


# direct methods
.method public constructor <init>(LJD;)V
    .locals 0

    iput-object p1, p0, LJD$h;->g:LJD;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/WorkOrder;",
            "Lco/bird/android/model/BirdSummaryBody;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/MobilePartner;",
            ">;+",
            "Ljava/util/Map<",
            "Lco/bird/android/model/Issue;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;>;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/WorkOrder;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/BirdSummaryBody;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v4, p0, LJD$h;->g:LJD;

    invoke-virtual {v4}, LJD;->J()Lio/reactivex/subjects/a;

    move-result-object v4

    sget-object v5, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v5, v0}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LJD$h;->g:LJD;

    invoke-virtual {v0}, LJD;->w()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LJD$h;->g:LJD;

    invoke-virtual {v0}, LJD;->C()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LJD$h;->g:LJD;

    invoke-virtual {v0}, LJD;->A()Lio/reactivex/subjects/a;

    move-result-object v0

    iget-object v1, p0, LJD$h;->g:LJD;

    invoke-virtual {v1}, LJD;->z()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/collections/MapsKt;->toSortedMap(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LJD$h;->g:LJD;

    invoke-virtual {v0}, LJD;->E()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LJD$h;->a(LRe4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
