.class public final Lco/bird/android/feature/suggestanest/SuggestNestActivity$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/suggestanest/SuggestNestActivity;->X0(LcD1;)V
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
        "Lco/bird/android/model/wire/WireNestArea;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lcom/google/android/gms/maps/model/CircleOptions;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireNestArea;",
        "nests",
        "Lcom/google/android/gms/maps/model/CircleOptions;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1549#2:475\n1620#2,3:476\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$5\n*L\n387#1:475\n387#1:476,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$j;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestArea;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/CircleOptions;",
            ">;"
        }
    .end annotation

    const-string v0, "nests"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$j;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireNestArea;

    new-instance v3, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireNestArea;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    invoke-static {v4}, LcU5;->access$toLatLng(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/CircleOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireNestArea;->getRadius()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/maps/model/CircleOptions;->m0(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v2

    sget v3, LDf4;->birdRed10:I

    invoke-static {v0, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->u(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v2

    sget v3, LDf4;->birdRed:I

    invoke-static {v0, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->p0(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->D0(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$j;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
