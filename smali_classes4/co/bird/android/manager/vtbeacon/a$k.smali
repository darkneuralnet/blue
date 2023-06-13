.class public final Lco/bird/android/manager/vtbeacon/a$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/vtbeacon/a;->y(Lke5;LXi6;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/Observable<",
        "[B>;",
        "Lio/reactivex/K<",
        "+",
        "Lio/reactivex/Observable<",
        "[B>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001ab\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000 \u0002*0\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "",
        "kotlin.jvm.PlatformType",
        "ackObserver",
        "Lio/reactivex/K;",
        "b",
        "(Lio/reactivex/Observable;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lke5;

.field public final synthetic h:LXi6;


# direct methods
.method public constructor <init>(Lke5;LXi6;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/vtbeacon/a$k;->g:Lke5;

    iput-object p2, p0, Lco/bird/android/manager/vtbeacon/a$k;->h:LXi6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a$k;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/Observable;

    return-object p0
.end method


# virtual methods
.method public final b(Lio/reactivex/Observable;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "[B>;)",
            "Lio/reactivex/K<",
            "+",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    const-string v0, "ackObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/vtbeacon/a$k;->g:Lke5;

    sget-object v1, LWi6;->c:LWi6;

    invoke-virtual {v1}, LWi6;->b()Ljava/util/UUID;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/manager/vtbeacon/a$k;->h:LXi6;

    invoke-static {v2}, LYi6;->b(LXi6;)[B

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/vtbeacon/a$k$a;

    invoke-direct {v1, p1}, Lco/bird/android/manager/vtbeacon/a$k$a;-><init>(Lio/reactivex/Observable;)V

    new-instance p1, Lnj6;

    invoke-direct {p1, v1}, Lnj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/Observable;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/vtbeacon/a$k;->b(Lio/reactivex/Observable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
