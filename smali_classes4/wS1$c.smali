.class public final LwS1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwS1;->a(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Ljava/lang/String;Lco/bird/android/model/RadarTagMetadata;)Lio/reactivex/F;
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
        "Lco/bird/android/model/wire/WirePart;",
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
        "attachedParts",
        "",
        "Lco/bird/android/model/wire/WirePart;",
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
        "SMAP\nIdToolsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n*S KotlinDebug\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$2\n*L\n49#1:142\n49#1:143,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:LwS1;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;LwS1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LwS1$c;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LwS1$c;->h:LwS1;

    iput-object p3, p0, LwS1$c;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LwS1$c;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LwS1$c;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v0, "attachedParts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WirePart;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v5, LzQ1;->c:LzQ1;

    iget-object v1, p0, LwS1$c;->h:LwS1;

    const/4 v3, 0x1

    iget-object v6, p0, LwS1$c;->i:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, LwS1;->access$trackIdToolsActionCompleted(LwS1;Ljava/lang/String;ZLjava/util/List;LzQ1;Ljava/lang/String;)V

    return-void
.end method
