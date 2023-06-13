.class public final LGJ1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGJ1;->y(Lco/bird/android/model/itemlease/ItemLease;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "+",
        "Landroid/net/Uri;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "Landroid/net/Uri;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
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

.field public final synthetic h:Lco/bird/android/model/itemlease/ItemLease;


# direct methods
.method public constructor <init>(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)V
    .locals 0

    iput-object p1, p0, LGJ1$f;->g:LGJ1;

    iput-object p2, p0, LGJ1$f;->h:Lco/bird/android/model/itemlease/ItemLease;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGJ1$f;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LGJ1$f;->d(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)Lio/reactivex/K;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$itemLease"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "setting lease as returned"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0}, LGJ1;->access$getItemLeaseManager$p(LGJ1;)LMc2;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/itemlease/ItemLease;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, LMc2;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
            "+",
            "Landroid/net/Uri;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroid/net/Uri;

    invoke-virtual {v0}, Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;->getSignedUrl()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x1e

    invoke-static {p1, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploading asset via put to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LGJ1$f;->g:LGJ1;

    invoke-static {p1}, LGJ1;->access$getUploadManager$p(LGJ1;)Lef6;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0}, Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;->getSignedUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lef6$a;->putAssetUpload$default(Lef6;Ljava/util/Map;Ljava/lang/String;Landroid/net/Uri;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    const-wide/16 v0, 0x14

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LGJ1$f;->g:LGJ1;

    iget-object v1, p0, LGJ1$f;->h:Lco/bird/android/model/itemlease/ItemLease;

    new-instance v2, LIJ1;

    invoke-direct {v2, v0, v1}, LIJ1;-><init>(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)V

    invoke-static {v2}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LGJ1$f$a;

    iget-object v1, p0, LGJ1$f;->g:LGJ1;

    invoke-direct {v0, v1}, LGJ1$f$a;-><init>(LGJ1;)V

    new-instance v1, LJJ1;

    invoke-direct {v1, v0}, LJJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LGJ1$f;->c(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
