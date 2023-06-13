.class public final LZL1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVL1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0008\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00060\tH\u0016J\u0008\u0010\u000c\u001a\u00020\u0004H\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "LZL1;",
        "LVL1;",
        "",
        "birdId",
        "Lio/reactivex/c;",
        "l1",
        "",
        "birdIds",
        "s0",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
        "N",
        "f",
        "clear",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "LVK;",
        "b",
        "LVK;",
        "birdClient",
        "LTk3;",
        "c",
        "LTk3;",
        "operatorClient",
        "LSL1;",
        "d",
        "LSL1;",
        "hibernationDao",
        "<init>",
        "(Landroid/content/Context;LVK;LTk3;LSL1;)V",
        "co.bird.android.repository.hibernation"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LVK;

.field public final c:LTk3;

.field public final d:LSL1;


# direct methods
.method public constructor <init>(Landroid/content/Context;LVK;LTk3;LSL1;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hibernationDao"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZL1;->a:Landroid/content/Context;

    iput-object p2, p0, LZL1;->b:LVK;

    iput-object p3, p0, LZL1;->c:LTk3;

    iput-object p4, p0, LZL1;->d:LSL1;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LZL1;->N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LZL1;->M1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

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

.method public static final N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getContext$p(LZL1;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LZL1;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getHibernationDao$p(LZL1;)LSL1;
    .locals 0

    iget-object p0, p0, LZL1;->d:LSL1;

    return-object p0
.end method


# virtual methods
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

    invoke-static {p0, p1}, LVL1$a;->a(LVL1;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public N()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LZL1;->d:LSL1;

    invoke-virtual {v0}, LSL1;->c()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0, v0}, LZL1;->L1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LZL1;->d:LSL1;

    invoke-virtual {v0}, LSL1;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public f()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LZL1;->d:LSL1;

    invoke-virtual {v0}, LSL1;->b()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public l1(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZL1;->b:LVK;

    new-instance v1, Lco/bird/api/request/BirdIdBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/BirdIdBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LVK;->M(Lco/bird/api/request/BirdIdBody;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LZL1$b;

    invoke-direct {v1, p0, p1}, LZL1$b;-><init>(LZL1;Ljava/lang/String;)V

    new-instance p1, LXL1;

    invoke-direct {p1, v1}, LXL1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun hibernateVe\u2026e))\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public s0(Ljava/util/List;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "birdIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZL1;->c:LTk3;

    new-instance v1, Lco/bird/api/request/HibernationStatusRequest;

    invoke-direct {v1, p1}, Lco/bird/api/request/HibernationStatusRequest;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, LTk3;->x(Lco/bird/api/request/HibernationStatusRequest;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LZL1$a;

    invoke-direct {v0, p0}, LZL1$a;-><init>(LZL1;)V

    new-instance v1, LWL1;

    invoke-direct {v1, v0}, LWL1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun fetchHibern\u2026edulers.io())\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
