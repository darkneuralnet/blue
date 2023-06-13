.class public final LAI6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireZoneRegion;",
        "Lco/bird/android/model/persistence/ZoneRegion;",
        "b",
        "Lco/bird/android/model/wire/WireZoneData;",
        "Lco/bird/android/model/persistence/ZoneData;",
        "a",
        "Lco/bird/android/model/wire/WireZoneOverlay;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;",
        "e",
        "Lco/bird/android/model/wire/WireZoneAnnotation;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;",
        "c",
        "Lco/bird/android/model/wire/WireZoneAnnotationLabel;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;",
        "d",
        "zone_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireZoneData;)Lco/bird/android/model/persistence/ZoneData;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/ZoneData;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneData;->getZoneId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneData;->getOverlay()Lco/bird/android/model/wire/WireZoneOverlay;

    move-result-object v1

    invoke-static {v1}, LAI6;->e(Lco/bird/android/model/wire/WireZoneOverlay;)Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneData;->getAnnotation()Lco/bird/android/model/wire/WireZoneAnnotation;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LAI6;->c(Lco/bird/android/model/wire/WireZoneAnnotation;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v4, v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneData;->getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    move-result-object v5

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v6

    const-string p0, "now()"

    invoke-static {v6, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/ZoneData;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireZoneRegion;)Lco/bird/android/model/persistence/ZoneRegion;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/ZoneRegion;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneRegion;->getZoneId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneRegion;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneRegion;->getCenterPoint()Lco/bird/android/model/Point;

    move-result-object p0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    const-string v4, "now()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2, p0, v3}, Lco/bird/android/model/persistence/ZoneRegion;-><init>(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/Point;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireZoneAnnotation;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotation;->getColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotation;->getBorderColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotation;->getLabel()Lco/bird/android/model/wire/WireZoneAnnotationLabel;

    move-result-object v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LAI6;->d(Lco/bird/android/model/wire/WireZoneAnnotationLabel;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotation;->getIcon()Lco/bird/android/model/wire/WireIcon;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, LqB0;->e(Lco/bird/android/model/wire/WireIcon;)Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotation;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object p0

    move-object v1, v0

    move-object v4, v5

    move-object v5, v6

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;-><init>(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/wire/WireZoneAnnotationLabel;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotationLabel;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAnnotationLabel;->getColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/wire/WireZoneOverlay;)Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneOverlay;->getColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneOverlay;->getBorderColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;-><init>(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method
