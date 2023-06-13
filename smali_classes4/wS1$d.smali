.class public final LwS1$d;
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
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
        "SMAP\nIdToolsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,141:1\n11335#2:142\n11670#2,3:143\n*S KotlinDebug\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$3\n*L\n58#1:142\n58#1:143,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:[Lco/bird/android/model/wire/WirePart;

.field public final synthetic i:LwS1;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;LwS1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LwS1$d;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LwS1$d;->h:[Lco/bird/android/model/wire/WirePart;

    iput-object p3, p0, LwS1$d;->i:LwS1;

    iput-object p4, p0, LwS1$d;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LwS1$d;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 6

    iget-object p1, p0, LwS1$d;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, LwS1$d;->h:[Lco/bird/android/model/wire/WirePart;

    new-instance v3, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p1, v2

    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sget-object v4, LzQ1;->c:LzQ1;

    iget-object v0, p0, LwS1$d;->i:LwS1;

    const/4 v2, 0x0

    iget-object v5, p0, LwS1$d;->j:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, LwS1;->access$trackIdToolsActionCompleted(LwS1;Ljava/lang/String;ZLjava/util/List;LzQ1;Ljava/lang/String;)V

    return-void
.end method
