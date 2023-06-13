.class public final LgS$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgS;->F0(Ljava/lang/String;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Lco/bird/android/model/constant/BulkScanPurpose;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/Bird;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Bird;",
        "bird",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LgS;

.field public final synthetic h:Lco/bird/android/model/constant/BulkScanPurpose;


# direct methods
.method public constructor <init>(LgS;Lco/bird/android/model/constant/BulkScanPurpose;)V
    .locals 0

    iput-object p1, p0, LgS$b;->g:LgS;

    iput-object p2, p0, LgS$b;->h:Lco/bird/android/model/constant/BulkScanPurpose;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/u;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Bird;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LgS$b;->g:LgS;

    invoke-static {v0}, LgS;->access$getBulkScanPurposeBirdDao$p(LgS;)Li40;

    move-result-object v1

    new-instance v2, Lco/bird/android/model/persistence/BulkScanPurposeBird;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LgS$b;->h:Lco/bird/android/model/constant/BulkScanPurpose;

    invoke-direct {v2, v3, v4}, Lco/bird/android/model/persistence/BulkScanPurposeBird;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/BulkScanPurpose;)V

    invoke-virtual {v1, v2}, Li40;->c(Lco/bird/android/model/persistence/BulkScanPurposeBird;)Lio/reactivex/c;

    move-result-object v1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/c;->k(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object p1

    const-string v1, "bulkScanPurposeBirdDao.i\u2026andThen(Maybe.just(bird))"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LgS;->a2(Lio/reactivex/p;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p0, p1}, LgS$b;->a(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
