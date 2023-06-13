.class public final LJL2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIL2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJL2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "LJL2;",
        "LIL2;",
        "LcD1;",
        "map",
        "",
        "",
        "includePointsOfInterest",
        "",
        "a",
        "style",
        "",
        "d",
        "enabledPointsOfInterest",
        "b",
        "Lg46$b;",
        "c",
        "()Lg46$b;",
        "logger",
        "<init>",
        "()V",
        "co.bird.android.lib.map.style"
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
        "SMAP\nMapStylerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapStylerImpl.kt\nco/bird/android/lib/map/style/MapStylerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1855#2,2:179\n766#2:181\n857#2,2:182\n1#3:184\n*S KotlinDebug\n*F\n+ 1 MapStylerImpl.kt\nco/bird/android/lib/map/style/MapStylerImpl\n*L\n147#1:179,2\n168#1:181\n168#1:182,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LJL2$a;

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, LJL2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJL2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJL2;->a:LJL2$a;

    const-string v2, "attraction"

    const-string v3, "business"

    const-string v4, "government"

    const-string v5, "medical"

    const-string v6, "park"

    const-string v7, "place_of_worship"

    const-string v8, "school"

    const-string v9, "sports_complex"

    filled-new-array/range {v2 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LJL2;->b:Ljava/util/List;

    const-string v0, "        [\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#f2f1f0\"\n      },\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f2f1f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#f2f1f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"color\": \"#d0d0d0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#c0c0c0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#d0d0d0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"saturation\": -35\n      },\n      {\n        \"lightness\": 30\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#747d8b\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#c1e1f0\"\n      }\n    ]\n  }\n]"

    sput-object v0, LJL2;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LcD1;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcD1;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, LJL2;->d(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_2

    move-object v0, v1

    :cond_2
    invoke-virtual {p0}, LJL2;->c()Lg46$b;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Updating the map style options."

    invoke-virtual {p2, v2, v1}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/gms/maps/model/MapStyleOptions;

    invoke-virtual {p0, v0}, LJL2;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/google/android/gms/maps/model/MapStyleOptions;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LcD1;->q(Lcom/google/android/gms/maps/model/MapStyleOptions;)Z

    return-void
.end method

.method public final b(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    :try_start_0
    new-instance v0, LWi2;

    invoke-direct {v0}, LWi2;-><init>()V

    sget-object v1, LJL2;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, LWi2;->a(Ljava/lang/String;)Lyi2;

    move-result-object v0

    invoke-virtual {v0}, Lyi2;->c()Lfi2;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to parse muted base map style as json array, ingoring style"

    invoke-static {v0, v2, v1}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lfi2;

    invoke-direct {v0}, Lfi2;-><init>()V

    :goto_0
    if-eqz p1, :cond_0

    sget-object v1, LJL2;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, LTi2;

    invoke-direct {v2}, LTi2;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "poi."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "featureType"

    invoke-virtual {v2, v3, v1}, LTi2;->x(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lfi2;

    invoke-direct {v1}, Lfi2;-><init>()V

    new-instance v3, LTi2;

    invoke-direct {v3}, LTi2;-><init>()V

    const-string v4, "visibility"

    const-string v5, "off"

    invoke-virtual {v3, v4, v5}, LTi2;->x(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lfi2;->w(Lyi2;)V

    const-string v3, "stylers"

    invoke-virtual {v2, v3, v1}, LTi2;->w(Ljava/lang/String;Lyi2;)V

    invoke-virtual {v0, v2}, Lfi2;->w(Lyi2;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lyi2;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "jsonArray.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c()Lg46$b;
    .locals 2

    const-string v0, "map-styler"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"map-styler\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, LJL2;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
