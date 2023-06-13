.class public final LgS$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgS;->x0(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "wireBird",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"
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


# direct methods
.method public constructor <init>(LgS;)V
    .locals 0

    iput-object p1, p0, LgS$c;->g:LgS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LgS;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, LgS$c;->c(LgS;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LgS;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$wireBird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LgS;->access$getBirdDao$p(LgS;)LbL;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Lco/bird/android/model/persistence/Bird;

    const/4 v1, 0x0

    invoke-static {p1}, LZK;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    aput-object p1, v0, v1

    invoke-virtual {p0, v0}, LbL;->l([Lco/bird/android/model/persistence/Bird;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;
    .locals 2

    const-string v0, "wireBird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LgS$c;->g:LgS;

    new-instance v1, LhS;

    invoke-direct {v1, v0, p1}, LhS;-><init>(LgS;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v1}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LgS$c;->b(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
