.class public final LYn$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYn;->R0(Landroid/location/Location;DLco/bird/android/model/constant/MapMode;Z)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireArea;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireArea;",
        "wireAreas",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/h;"
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
        "SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1549#2:254\n1620#2,3:255\n1549#2:258\n1620#2,3:259\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$2\n*L\n64#1:254\n64#1:255,3\n65#1:258\n65#1:259,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LYn;

.field public final synthetic h:Lco/bird/android/model/constant/MapMode;


# direct methods
.method public constructor <init>(LYn;Lco/bird/android/model/constant/MapMode;)V
    .locals 0

    iput-object p1, p0, LYn$b;->g:LYn;

    iput-object p2, p0, LYn$b;->h:Lco/bird/android/model/constant/MapMode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArea;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "wireAreas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYn$b;->g:LYn;

    invoke-static {v0}, LYn;->access$getPreference$p(LYn;)Lgl;

    move-result-object v0

    iget-object v1, p0, LYn$b;->h:Lco/bird/android/model/constant/MapMode;

    invoke-static {v0, v1}, Leo;->access$role(Lgl;Lco/bird/android/model/constant/MapMode;)Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireArea;

    invoke-static {v4, v0}, LVm;->a(Lco/bird/android/model/wire/WireArea;Ljava/lang/String;)Lco/bird/android/model/persistence/Area;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireArea;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireArea;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, LYn$b;->g:LYn;

    invoke-static {p1, v0, v1, v3}, LYn;->access$trimAndInsertAreas(LYn;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LYn$b;->a(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
