.class public final LyA4$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyA4;->a(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Issue;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/LegacyRepair;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairType;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u00020\t2\u008b\u0001\u0010\u0008\u001a\u0086\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0004 \u0003*B\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lwb4;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/WorkOrder;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/Issue;",
        "Lco/bird/android/model/LegacyRepair;",
        "Lco/bird/android/model/RepairType;",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lwb4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LyA4;


# direct methods
.method public constructor <init>(LyA4;)V
    .locals 0

    iput-object p1, p0, LyA4$u;->g:LyA4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/LegacyRepair;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v3, p0, LyA4$u;->g:LyA4;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/WorkOrder;

    invoke-virtual {v3, v0}, LyA4;->q0(Lco/bird/android/model/WorkOrder;)V

    iget-object v0, p0, LyA4$u;->g:LyA4;

    invoke-static {v0}, LyA4;->access$getIssuesSubject$p(LyA4;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LyA4$u;->g:LyA4;

    invoke-static {v0}, LyA4;->access$getRepairsSubject$p(LyA4;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LyA4$u;->g:LyA4;

    invoke-static {v0}, LyA4;->access$getRepairTypesSubject$p(LyA4;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LyA4$u;->a(Lwb4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
