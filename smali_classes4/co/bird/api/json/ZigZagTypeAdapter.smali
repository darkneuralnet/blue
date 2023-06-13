.class public final Lco/bird/api/json/ZigZagTypeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi2;
.implements Llj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi2<",
        "Lco/bird/android/model/ZigZagVehiclesResponse;",
        ">;",
        "Llj2<",
        "Lco/bird/android/model/ZigZagVehiclesResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\"\u0010\r\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000cH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010H\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/api/json/ZigZagTypeAdapter;",
        "Lvi2;",
        "Lco/bird/android/model/ZigZagVehiclesResponse;",
        "Llj2;",
        "Lyi2;",
        "json",
        "Ljava/lang/reflect/Type;",
        "type",
        "Lui2;",
        "context",
        "a",
        "src",
        "Lkj2;",
        "d",
        "Lfi2;",
        "b",
        "LTi2;",
        "c",
        "LoE1;",
        "LoE1;",
        "gson",
        "<init>",
        "()V",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nZigZagTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZigZagTypeAdapter.kt\nco/bird/api/json/ZigZagTypeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1603#2,9:90\n1855#2:99\n1856#2:101\n1612#2:102\n1603#2,9:103\n1855#2:112\n1603#2,9:113\n1855#2:122\n1856#2:124\n1612#2:125\n1856#2:127\n1612#2:128\n1#3:100\n1#3:123\n1#3:126\n1#3:129\n*S KotlinDebug\n*F\n+ 1 ZigZagTypeAdapter.kt\nco/bird/api/json/ZigZagTypeAdapter\n*L\n51#1:90,9\n51#1:99\n51#1:101\n51#1:102\n70#1:103,9\n70#1:112\n72#1:113,9\n72#1:122\n72#1:124\n72#1:125\n70#1:127\n70#1:128\n51#1:100\n72#1:123\n70#1:126\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LoE1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LpE1;

    invoke-direct {v0}, LpE1;-><init>()V

    invoke-virtual {v0}, LpE1;->d()LpE1;

    move-result-object v0

    invoke-virtual {v0}, LpE1;->h()LpE1;

    move-result-object v0

    sget-object v1, LVk1;->f:LVk1;

    invoke-virtual {v0, v1}, LpE1;->i(LVk1;)LpE1;

    move-result-object v0

    invoke-virtual {v0}, LpE1;->l()LpE1;

    move-result-object v0

    invoke-virtual {v0}, LpE1;->b()LoE1;

    move-result-object v0

    const-string v1, "GsonBuilder()\n    .enabl\u2026yPrinting()\n    .create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/api/json/ZigZagTypeAdapter;->a:LoE1;

    return-void
.end method


# virtual methods
.method public a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/android/model/ZigZagVehiclesResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyi2;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lyi2;->c()Lfi2;

    move-result-object p1

    const-string p2, "json.asJsonArray"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/api/json/ZigZagTypeAdapter;->b(Lfi2;)Lco/bird/android/model/ZigZagVehiclesResponse;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lyi2;->u()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string p2, "json.asJsonObject"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/api/json/ZigZagTypeAdapter;->c(LTi2;)Lco/bird/android/model/ZigZagVehiclesResponse;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Lco/bird/android/model/ZigZagVehiclesResponse;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Lco/bird/android/model/ZigZagVehiclesResponse;-><init>(Ljava/util/List;)V

    :goto_0
    return-object p1
.end method

.method public final b(Lfi2;)Lco/bird/android/model/ZigZagVehiclesResponse;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lyi2;->c()Lfi2;

    move-result-object p1

    invoke-virtual {p1}, Lfi2;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyi2;

    invoke-virtual {v1}, Lyi2;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lyi2;->e()LTi2;

    move-result-object v1

    invoke-virtual {v1}, LTi2;->entrySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "plateObject.entrySet()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyi2;

    invoke-virtual {v3}, Lyi2;->u()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lco/bird/api/json/ZigZagTypeAdapter;->a:LoE1;

    const-class v5, Lco/bird/android/model/ZigZagVehicle;

    invoke-virtual {v4, v3, v5}, LoE1;->h(Lyi2;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/ZigZagVehicle;

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_4
    new-instance p1, Lco/bird/android/model/ZigZagVehiclesResponse;

    invoke-direct {p1, v0}, Lco/bird/android/model/ZigZagVehiclesResponse;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public final c(LTi2;)Lco/bird/android/model/ZigZagVehiclesResponse;
    .locals 7

    invoke-virtual {p1}, LTi2;->entrySet()Ljava/util/Set;

    move-result-object p1

    const-string v0, "json.entrySet()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyi2;

    invoke-virtual {v2}, Lyi2;->u()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyi2;

    invoke-virtual {v1}, Lyi2;->e()LTi2;

    move-result-object v1

    invoke-virtual {v1}, LTi2;->entrySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "plateDictionary.value.asJsonObject.entrySet()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyi2;

    invoke-virtual {v4}, Lyi2;->u()Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Lco/bird/api/json/ZigZagTypeAdapter;->a:LoE1;

    const-class v6, Lco/bird/android/model/ZigZagVehicle;

    invoke-virtual {v5, v4, v6}, LoE1;->h(Lyi2;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/ZigZagVehicle;

    goto :goto_2

    :cond_2
    move-object v4, v3

    :goto_2
    if-eqz v4, :cond_1

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object v3, v2

    :cond_4
    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/ZigZagVehiclesResponse;

    invoke-direct {v0, p1}, Lco/bird/android/model/ZigZagVehiclesResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public d(Lco/bird/android/model/ZigZagVehiclesResponse;Ljava/lang/reflect/Type;Lkj2;)Lyi2;
    .locals 1

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p2, p0, Lco/bird/api/json/ZigZagTypeAdapter;->a:LoE1;

    const-class p3, Lco/bird/android/model/ZigZagVehiclesResponse;

    invoke-virtual {p2, p1, p3}, LoE1;->E(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lyi2;

    move-result-object p1

    const-string p2, "{\n      gson.toJsonTree(\u2026sponse::class.java)\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p1, LQi2;->b:LQi2;

    const-string p2, "{\n      JsonNull.INSTANCE\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic deserialize(Lyi2;Ljava/lang/reflect/Type;Lui2;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/json/ZigZagTypeAdapter;->a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/android/model/ZigZagVehiclesResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lkj2;)Lyi2;
    .locals 0

    check-cast p1, Lco/bird/android/model/ZigZagVehiclesResponse;

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/json/ZigZagTypeAdapter;->d(Lco/bird/android/model/ZigZagVehiclesResponse;Ljava/lang/reflect/Type;Lkj2;)Lyi2;

    move-result-object p1

    return-object p1
.end method
