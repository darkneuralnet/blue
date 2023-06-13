.class public final LGJ1$f$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGJ1$f;->c(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/itemlease/LeaseReturnResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGJ1;


# direct methods
.method public constructor <init>(LGJ1;)V
    .locals 0

    iput-object p1, p0, LGJ1$f$a;->g:LGJ1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/itemlease/LeaseReturnResponse;)V
    .locals 4

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "setting as hasSubmitted"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LGJ1$f$a;->g:LGJ1;

    invoke-static {v0}, LGJ1;->access$getHasSubmitted$p(LGJ1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v0, "closing screen down"

    new-array v2, p1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LGJ1$f$a;->g:LGJ1;

    invoke-static {v0}, LGJ1;->access$getCapturedFileRelay$p(LGJ1;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGJ1$a;

    iget-object v2, p0, LGJ1$f$a;->g:LGJ1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LGJ1$a;->b()Z

    move-result v3

    if-ne v3, v1, :cond_0

    move p1, v1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LGJ1$a;->c()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_2
    const-string v1, "returned"

    invoke-static {v2, v1, p1, v0}, LGJ1;->access$trackResolution(LGJ1;Ljava/lang/String;ZLjava/util/List;)V

    iget-object p1, p0, LGJ1$f$a;->g:LGJ1;

    invoke-static {p1}, LGJ1;->access$getNavigator$p(LGJ1;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/itemlease/LeaseReturnResponse;

    invoke-virtual {p0, p1}, LGJ1$f$a;->a(Lco/bird/android/model/itemlease/LeaseReturnResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
