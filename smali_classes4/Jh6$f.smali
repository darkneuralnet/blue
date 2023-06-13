.class public final LJh6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJh6;->p()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/UserDeleteResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/UserDeletionStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/UserDeleteResponse;",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/UserDeletionStatus;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/UserDeleteResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJh6;


# direct methods
.method public constructor <init>(LJh6;)V
    .locals 0

    iput-object p1, p0, LJh6$f;->g:LJh6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/UserDeleteResponse;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/UserDeleteResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/UserDeletionStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/UserDeleteResponse;->getStatus()Lco/bird/android/model/UserDeletionStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/UserDeletionStatus;->DELETED:Lco/bird/android/model/UserDeletionStatus;

    if-eq v0, v1, :cond_0

    iget-object p1, p0, LJh6$f;->g:LJh6;

    invoke-virtual {p1}, LJh6;->n0()Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/UserDeleteResponse;->getStatus()Lco/bird/android/model/UserDeletionStatus;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "{\n          Single.just(it.status)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/UserDeleteResponse;

    invoke-virtual {p0, p1}, LJh6$f;->a(Lco/bird/api/response/UserDeleteResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
