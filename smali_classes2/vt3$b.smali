.class public final Lvt3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvt3;->r(Lwt3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/config/tweaks/dsl/Tweaks;",
        "Ljava/util/List<",
        "+",
        "LRa6<",
        "Ljava/lang/Object;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0010\u0006\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/config/tweaks/dsl/Tweaks;",
        "tweaks",
        "",
        "LRa6;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/config/tweaks/dsl/Tweaks;)Ljava/util/List;"
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
        "SMAP\nOperatorSettingsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSettingsPresenter.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsPresenter$consume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n*S KotlinDebug\n*F\n+ 1 OperatorSettingsPresenter.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsPresenter$consume$1\n*L\n28#1:47\n28#1:48,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lvt3$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvt3$b;

    invoke-direct {v0}, Lvt3$b;-><init>()V

    sput-object v0, Lvt3$b;->g:Lvt3$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/config/tweaks/dsl/Tweaks;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/config/tweaks/dsl/Tweaks;",
            ")",
            "Ljava/util/List<",
            "LRa6<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "tweaks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lvt3;->access$getTWEAK_KEYS$cp()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lco/bird/android/config/tweaks/dsl/Tweaks;->getTweak(Ljava/lang/String;)LRa6;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/config/tweaks/dsl/Tweaks;

    invoke-virtual {p0, p1}, Lvt3$b;->a(Lco/bird/android/config/tweaks/dsl/Tweaks;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
