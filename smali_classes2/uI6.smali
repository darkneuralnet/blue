.class public final LuI6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "LuI6;",
        "",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "marker",
        "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
        "overlayAnalytics",
        "",
        "b",
        "Lco/bird/android/model/persistence/ZonePolygonable;",
        "polygonable",
        "c",
        "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
        "flightSheet",
        "a",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
        "selectedOverlayAnalytics",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "selectedMarker",
        "<init>",
        "(LEa;)V",
        "app_birdRelease"
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
        "SMAP\nZoneAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneAnalyticsManager.kt\nco/bird/android/app/feature/operator/zone/ZoneAnalyticsManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public b:Lco/bird/android/model/persistence/ZoneOverlayAnalytics;

.field public c:Lco/bird/android/model/persistence/ZoneMarker;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LEa;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuI6;->a:LEa;

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/ZoneFlightSheetDetails;)V
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "flightSheet"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LuI6;->c:Lco/bird/android/model/persistence/ZoneMarker;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->getZoneId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iget-object v4, v0, LuI6;->b:Lco/bird/android/model/persistence/ZoneOverlayAnalytics;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lco/bird/android/model/persistence/ZoneOverlayAnalytics;->getZoneId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->getZoneId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lco/bird/android/model/persistence/ZoneOverlayAnalytics;->getOverlay()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v5, v0, LuI6;->a:LEa;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->getZoneId()Ljava/lang/String;

    move-result-object v10

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    :cond_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    :cond_3
    move-object v11, v6

    goto :goto_2

    :cond_4
    move-object v11, v3

    :goto_2
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v13, v6

    goto :goto_3

    :cond_5
    move-object v13, v3

    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getLabel()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;->getText()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_4

    :cond_6
    move-object v12, v3

    :goto_4
    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v14

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;->getBorderColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v15

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->getZoneStatus()Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;->getTitle()Ljava/lang/String;

    move-result-object v16

    new-instance v1, LPI6;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v17, 0x7

    const/16 v18, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v18}, LPI6;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iput-object v3, v0, LuI6;->c:Lco/bird/android/model/persistence/ZoneMarker;

    iput-object v3, v0, LuI6;->b:Lco/bird/android/model/persistence/ZoneOverlayAnalytics;

    :cond_7
    return-void
.end method

.method public final b(Lco/bird/android/model/persistence/ZoneMarker;Lco/bird/android/model/persistence/ZoneOverlayAnalytics;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlayAnalytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LuI6;->c:Lco/bird/android/model/persistence/ZoneMarker;

    iput-object p2, p0, LuI6;->b:Lco/bird/android/model/persistence/ZoneOverlayAnalytics;

    return-void
.end method

.method public final c(Lco/bird/android/model/persistence/ZonePolygonable;)V
    .locals 2

    const-string v0, "polygonable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/ZoneOverlayAnalytics;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZonePolygonable;->getZoneId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZonePolygonable;->getOverlay()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lco/bird/android/model/persistence/ZoneOverlayAnalytics;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;)V

    iput-object v0, p0, LuI6;->b:Lco/bird/android/model/persistence/ZoneOverlayAnalytics;

    const/4 p1, 0x0

    iput-object p1, p0, LuI6;->c:Lco/bird/android/model/persistence/ZoneMarker;

    return-void
.end method
