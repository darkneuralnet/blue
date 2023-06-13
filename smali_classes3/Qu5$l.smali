.class public final LQu5$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQu5;->a(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lna4<",
        "+",
        "LnQ5$b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lna4;",
        "LnQ5$b;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lkotlin/Unit;)Lna4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQu5;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LQu5;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LQu5$l;->g:LQu5;

    iput-object p2, p0, LQu5$l;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LQu5$l;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lkotlin/Unit;)Lna4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lna4<",
            "+",
            "LnQ5$b;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LQu5$l;->g:LQu5;

    invoke-static {p1}, LQu5;->access$getUi$p(LQu5;)Lbv5;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;

    invoke-direct {v0}, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;-><init>()V

    invoke-interface {p1, v0}, LFQ5;->ig(Lco/bird/android/widget/adapter/ViewHolderSupplier;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lio/reactivex/b;->e:Lio/reactivex/b;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    new-instance v0, LQu5$l$a;

    iget-object v1, p0, LQu5$l;->g:LQu5;

    iget-object v2, p0, LQu5$l;->h:Lco/bird/android/model/wire/WireBird;

    invoke-direct {v0, v1, v2}, LQu5$l$a;-><init>(LQu5;Lco/bird/android/model/wire/WireBird;)V

    new-instance v1, LRu5;

    invoke-direct {v1, v0}, LRu5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LQu5$l;->b(Lkotlin/Unit;)Lna4;

    move-result-object p1

    return-object p1
.end method
