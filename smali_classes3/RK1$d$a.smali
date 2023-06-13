.class public final LRK1$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1$d;->b(Ljava/lang/Throwable;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/Throwable;

.field public final synthetic h:LRK1;

.field public final synthetic i:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;LRK1;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LRK1$d$a;->g:Ljava/lang/Throwable;

    iput-object p2, p0, LRK1$d$a;->h:LRK1;

    iput-object p3, p0, LRK1$d$a;->i:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/DialogResponse;->CANCEL:Lco/bird/android/model/DialogResponse;

    if-ne p1, v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LRK1$d$a;->h:LRK1;

    iget-object v1, p0, LRK1$d$a;->i:Lco/bird/android/model/wire/WireBird;

    const-string v2, "declined"

    invoke-static {v0, v1, v2}, LRK1;->access$trackResolution(LRK1;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V

    invoke-static {v0}, LRK1;->access$getItemLeaseManager$p(LRK1;)LMc2;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v2, v1, v3}, LMc2;->q(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    invoke-static {v0}, LRK1;->access$getNavigator$p(LRK1;)Le13;

    move-result-object v0

    sget-object v1, Le13$b;->b:Le13$b;

    const/4 v2, 0x0

    new-array v2, v2, [Lkotlin/Pair;

    invoke-interface {v0, v1, v2}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LRK1$d$a;->g:Ljava/lang/Throwable;

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LRK1$d$a;->a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
