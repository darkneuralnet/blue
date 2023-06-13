.class public final Lhu2$m$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu2$m;->d(Lco/bird/android/model/AssetTask;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireSignedUrl;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireSignedUrl;",
        "kotlin.jvm.PlatformType",
        "assetResponse",
        "",
        "c",
        "(Lco/bird/api/response/WireSignedUrl;)V"
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
        "SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$6$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,274:1\n237#2:275\n*S KotlinDebug\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$6$1\n*L\n114#1:275\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lhu2;

.field public final synthetic h:Lco/bird/android/model/AssetTask;

.field public final synthetic i:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public constructor <init>(Lhu2;Lco/bird/android/model/AssetTask;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 0

    iput-object p1, p0, Lhu2$m$a;->g:Lhu2;

    iput-object p2, p0, Lhu2$m$a;->h:Lco/bird/android/model/AssetTask;

    iput-object p3, p0, Lhu2$m$a;->i:Lcom/uber/autodispose/ScopeProvider;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lhu2$m$a;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lhu2$m$a;->d()V

    return-void
.end method

.method public static final d()V
    .locals 0

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/api/response/WireSignedUrl;)V
    .locals 13

    invoke-virtual {p1}, Lco/bird/api/response/WireSignedUrl;->getAsset()Lco/bird/android/model/wire/WireAsset;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhu2$m$a;->g:Lhu2;

    invoke-static {v0}, Lhu2;->access$getLocalAssetManager$p(Lhu2;)Lsu2;

    move-result-object v1

    iget-object v0, p0, Lhu2$m$a;->h:Lco/bird/android/model/AssetTask;

    invoke-virtual {v0}, Lco/bird/android/model/AssetTask;->getAssetId()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lhu2$m$a;->h:Lco/bird/android/model/AssetTask;

    invoke-virtual {v0}, Lco/bird/android/model/AssetTask;->getManager()Lco/bird/android/model/constant/AssetManagerType;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireAsset;->getFileSize()J

    move-result-wide v4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireAsset;->getMediaType()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireAsset;->getCreatedBy()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xd0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v12}, Lsu2$a;->updateAssetData$default(Lsu2;Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lhu2$m$a;->i:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v0, Lou2;

    invoke-direct {v0}, Lou2;-><init>()V

    sget-object v1, Lhu2$m$a$a;->b:Lhu2$m$a$a;

    new-instance v2, Lpu2;

    invoke-direct {v2, v1}, Lpu2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0, v2}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireSignedUrl;

    invoke-virtual {p0, p1}, Lhu2$m$a;->c(Lco/bird/api/response/WireSignedUrl;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
