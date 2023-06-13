.class public final Lhu2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu2;->n(Lcom/uber/autodispose/ScopeProvider;Z)V
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
        "Lco/bird/android/model/AssetTask;",
        "+",
        "LHM4<",
        "Lokhttp3/ResponseBody;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/AssetTask;",
        "LHM4;",
        "Lokhttp3/ResponseBody;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$10\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,274:1\n237#2:275\n*S KotlinDebug\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$10\n*L\n140#1:275\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lhu2;

.field public final synthetic h:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public constructor <init>(Lhu2;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 0

    iput-object p1, p0, Lhu2$e;->g:Lhu2;

    iput-object p2, p0, Lhu2$e;->h:Lcom/uber/autodispose/ScopeProvider;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lhu2$e;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lhu2$e;->c()V

    return-void
.end method

.method public static final c()V
    .locals 0

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lhu2$e;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/AssetTask;",
            "LHM4<",
            "Lokhttp3/ResponseBody;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/AssetTask;

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, Lhu2$e;->g:Lhu2;

    invoke-static {v1}, Lhu2;->access$getLocalAssetManager$p(Lhu2;)Lsu2;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/AssetTask;->getAssetId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    iget-object v1, p0, Lhu2$e;->g:Lhu2;

    invoke-virtual {v1}, Lhu2;->g()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lco/bird/android/model/AssetTask;->assetFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v10

    const/4 v11, 0x0

    const/16 v12, 0xae

    const/4 v13, 0x0

    invoke-static/range {v2 .. v13}, Lsu2$a;->updateAssetData$default(Lsu2;Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lhu2$e;->g:Lhu2;

    invoke-static {v1}, Lhu2;->access$getLocalAssetManager$p(Lhu2;)Lsu2;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/AssetTask;->getAssetId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lsu2;->e(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "concat(\n          listOf\u2026Id)\n          )\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhu2$e;->h:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v0, Lju2;

    invoke-direct {v0}, Lju2;-><init>()V

    sget-object v1, Lhu2$e$a;->b:Lhu2$e$a;

    new-instance v2, Lku2;

    invoke-direct {v2, v1}, Lku2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0, v2}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
