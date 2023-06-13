.class public final LGJ1$e;
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
        "Lkotlin/Unit;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "+",
        "Landroid/net/Uri;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\t\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "Landroid/net/Uri;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
        "<anonymous>"
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

    iput-object p1, p0, LGJ1$e;->g:LGJ1;

    iput-object p2, p0, LGJ1$e;->h:Lco/bird/android/model/itemlease/ItemLease;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LGJ1$e;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LGJ1$e;->g:LGJ1;

    invoke-static {p1}, LGJ1;->access$getCapturedFileRelay$p(LGJ1;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGJ1$a;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LGJ1$a;->d()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Couldn\'t determine file size for path "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v1, 0x0

    :goto_0
    move-wide v6, v1

    iget-object v1, p0, LGJ1$e;->g:LGJ1;

    invoke-static {v1}, LGJ1;->access$getCapturedFileRelay$p(LGJ1;)La94;

    move-result-object v1

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LGJ1$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LGJ1$a;->b()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v9, v2

    goto :goto_1

    :cond_1
    move v9, v0

    :goto_1
    iget-object v0, p0, LGJ1$e;->g:LGJ1;

    invoke-static {v0}, LGJ1;->access$getCapturedFileRelay$p(LGJ1;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGJ1$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LGJ1$a;->c()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_3
    move-object v10, v0

    iget-object v0, p0, LGJ1$e;->g:LGJ1;

    invoke-static {v0}, LGJ1;->access$getItemLeaseManager$p(LGJ1;)LMc2;

    move-result-object v3

    iget-object v0, p0, LGJ1$e;->h:Lco/bird/android/model/itemlease/ItemLease;

    invoke-virtual {v0}, Lco/bird/android/model/itemlease/ItemLease;->getId()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->RETURN_VERIFICATION:Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    const-string v8, "image/jpeg"

    invoke-interface/range {v3 .. v10}, LMc2;->B(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;JLjava/lang/String;ZLjava/util/List;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LGJ1$e$a;

    invoke-direct {v1, p1}, LGJ1$e$a;-><init>(Landroid/net/Uri;)V

    new-instance p1, LHJ1;

    invoke-direct {p1, v1}, LHJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    new-instance p1, Ljava/io/FileNotFoundException;

    const-string v0, "captured file uri was not found while attempting to capture image"

    invoke-direct {p1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LGJ1$e;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
