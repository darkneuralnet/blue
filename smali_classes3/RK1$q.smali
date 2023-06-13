.class public final LRK1$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->b0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LRK1;

.field public final synthetic h:Lco/bird/android/model/itemlease/ItemLease;


# direct methods
.method public constructor <init>(LRK1;Lco/bird/android/model/itemlease/ItemLease;)V
    .locals 0

    iput-object p1, p0, LRK1$q;->g:LRK1;

    iput-object p2, p0, LRK1$q;->h:Lco/bird/android/model/itemlease/ItemLease;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;)Lio/reactivex/K;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LRK1$q;->g:LRK1;

    invoke-static {p1}, LRK1;->access$getItemLeaseManager$p(LRK1;)LMc2;

    move-result-object p1

    iget-object v0, p0, LRK1$q;->h:Lco/bird/android/model/itemlease/ItemLease;

    invoke-virtual {v0}, Lco/bird/android/model/itemlease/ItemLease;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LMc2;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;

    invoke-virtual {p0, p1}, LRK1$q;->a(Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
