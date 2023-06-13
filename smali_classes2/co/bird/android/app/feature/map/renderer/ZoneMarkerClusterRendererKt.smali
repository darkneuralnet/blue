.class public final Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "cacheKey",
        "",
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
        "getCacheKey",
        "(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;",
        "Lco/bird/android/model/persistence/nestedstructures/Icon;",
        "(Lco/bird/android/model/persistence/nestedstructures/Icon;)Ljava/lang/String;",
        "co.bird.android.feature.map"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nZoneMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$getCacheKey(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt;->getCacheKey(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCacheKey(Lco/bird/android/model/persistence/nestedstructures/Icon;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt;->getCacheKey(Lco/bird/android/model/persistence/nestedstructures/Icon;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getCacheKey(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v1

    const-string v2, "-"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v3

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getLabel()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v4

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getBorderColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getCacheKey(Lco/bird/android/model/persistence/nestedstructures/Icon;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
