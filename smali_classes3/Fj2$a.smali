.class public final LFj2$a;
.super Landroid/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFj2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/LruCache<",
        "Lco/bird/android/model/Geometry;",
        "LWB1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\u0006"
    }
    d2 = {
        "Fj2$a",
        "Landroid/util/LruCache;",
        "Lco/bird/android/model/Geometry;",
        "LWB1;",
        "key",
        "a",
        "geo_release"
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
        "SMAP\nJtsGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt$geometryCache$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n1#1,87:1\n1#2:88\n16#3:89\n*S KotlinDebug\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt$geometryCache$1\n*L\n24#1:89\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x2400

    invoke-direct {p0, v0}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/Geometry;)LWB1;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x2000

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p1, v0}, Lco/bird/android/model/Geometry;->outerWKT(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "builder.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljw6;

    invoke-direct {v0}, Ljw6;-><init>()V

    invoke-virtual {v0, p1}, Ljw6;->v(Ljava/lang/String;)LWB1;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type org.locationtech.jts.geom.Geometry"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Geometry;

    invoke-virtual {p0, p1}, LFj2$a;->a(Lco/bird/android/model/Geometry;)LWB1;

    move-result-object p1

    return-object p1
.end method
