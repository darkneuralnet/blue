.class public final LhB$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhB;->b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WirePart;)V
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
        "Lco/bird/android/model/wire/WireBirdPart;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "birdParts",
        "",
        "Lco/bird/android/model/wire/WireBirdPart;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdToolsIdentifyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$onBirdIdentified$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1747#2,3:287\n223#2,2:290\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$onBirdIdentified$2\n*L\n191#1:287,3\n192#1:290,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LhB;


# direct methods
.method public constructor <init>(LhB;)V
    .locals 0

    iput-object p1, p0, LhB$h;->g:LhB;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LhB$h;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdPart;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LhB$h;->g:LhB;

    invoke-virtual {v0}, LhB;->P()Lco/bird/android/model/wire/WirePart;

    move-result-object v0

    if-nez v0, :cond_8

    iget-object v0, p0, LhB$h;->g:LhB;

    const-string v1, "birdParts"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v2, v4

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireBirdPart;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBirdPart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    if-ne v5, v6, :cond_3

    move v5, v3

    goto :goto_0

    :cond_3
    move v5, v4

    :goto_0
    if-eqz v5, :cond_2

    move v2, v3

    :goto_1
    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBirdPart;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBirdPart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v2

    sget-object v5, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    if-ne v2, v5, :cond_5

    move v2, v3

    goto :goto_2

    :cond_5
    move v2, v4

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBirdPart;->toPart()Lco/bird/android/model/wire/WirePart;

    move-result-object p1

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBirdPart;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBirdPart;->toPart()Lco/bird/android/model/wire/WirePart;

    move-result-object p1

    :goto_3
    invoke-virtual {v0, p1}, LhB;->j0(Lco/bird/android/model/wire/WirePart;)V

    :cond_8
    return-void
.end method
