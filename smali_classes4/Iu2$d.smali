.class public final LIu2$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIu2;->e(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/LocalAsset;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/LocalAsset;",
        "kotlin.jvm.PlatformType",
        "asset",
        "",
        "a",
        "(Lco/bird/android/model/LocalAsset;)V"
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
        "SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$assetReady$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n819#2:329\n847#2,2:330\n1#3:332\n*S KotlinDebug\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$assetReady$2\n*L\n180#1:329\n180#1:330,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIu2;


# direct methods
.method public constructor <init>(LIu2;)V
    .locals 0

    iput-object p1, p0, LIu2$d;->g:LIu2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/LocalAsset;)V
    .locals 5

    iget-object v0, p0, LIu2$d;->g:LIu2;

    invoke-static {v0}, LIu2;->access$getTasksSubject$p(LIu2;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/AssetTask;

    invoke-virtual {v3}, Lco/bird/android/model/AssetTask;->getAssetId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, LIu2$d;->g:LIu2;

    invoke-static {p1}, LIu2;->access$getTasksSubject$p(LIu2;)La94;

    move-result-object p1

    invoke-virtual {p1, v1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/LocalAsset;

    invoke-virtual {p0, p1}, LIu2$d;->a(Lco/bird/android/model/LocalAsset;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
