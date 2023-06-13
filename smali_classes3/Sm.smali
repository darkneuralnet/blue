.class public final LSm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002J\u0012\u0010\u0008\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "LSm;",
        "",
        "Lco/bird/android/model/persistence/Area;",
        "LRm;",
        "e",
        "d",
        "",
        "showRefreshUi",
        "b",
        "a",
        "",
        "label",
        "c",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "Ldr4;",
        "Ldr4;",
        "locationManager",
        "Lbn;",
        "Lbn;",
        "areaManager",
        "<init>",
        "(LTq4;Landroid/content/Context;Ldr4;Lbn;)V",
        "co.bird.android.feature.operator.bottomsheets"
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
        "SMAP\nAreaBottomSheetModelConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetModelConversion.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetModelConversion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LTq4;

.field public final b:Landroid/content/Context;

.field public final c:Ldr4;

.field public final d:Lbn;


# direct methods
.method public constructor <init>(LTq4;Landroid/content/Context;Ldr4;Lbn;)V
    .locals 1

    const-string v0, "reactiveConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSm;->a:LTq4;

    iput-object p2, p0, LSm;->b:Landroid/content/Context;

    iput-object p3, p0, LSm;->c:Ldr4;

    iput-object p4, p0, LSm;->d:Lbn;

    return-void
.end method


# virtual methods
.method public final a()LRm;
    .locals 2

    new-instance v0, LMn;

    iget-object v1, p0, LSm;->d:Lbn;

    invoke-interface {v1}, Lbn;->w()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-direct {v0, v1}, LMn;-><init>(Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public final b(Lco/bird/android/model/persistence/Area;Z)LRm;
    .locals 15

    move-object v0, p0

    const-string v1, "<this>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lho;->d(Lco/bird/android/model/persistence/Area;)I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->title()Ljava/lang/String;

    move-result-object v4

    invoke-static/range {p1 .. p1}, Lho;->a(Lco/bird/android/model/persistence/Area;)I

    move-result v5

    invoke-static/range {p1 .. p1}, Lho;->b(Lco/bird/android/model/persistence/Area;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v6, v1

    invoke-static/range {p1 .. p1}, Lho;->c(Lco/bird/android/model/persistence/Area;)I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getAreaReleaseCapacityIconType()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v8

    invoke-static/range {p1 .. p1}, Lho;->e(Lco/bird/android/model/persistence/Area;)Lye0;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getReleaseCapacity()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getCenterPoint()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getCenterPoint()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, v0, LSm;->c:Ldr4;

    invoke-static {v1}, LUB1;->a(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Landroid/location/Location;

    move-result-object v1

    invoke-interface {v2, v1}, Ldr4;->n(Landroid/location/Location;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v12, v1

    iget-object v1, v0, LSm;->d:Lbn;

    invoke-interface {v1}, Lbn;->w()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lorg/joda/time/DateTime;

    new-instance v1, Lgo;

    move-object v2, v1

    move/from16 v14, p2

    invoke-direct/range {v2 .. v14}, Lgo;-><init>(ILjava/lang/String;ILjava/lang/String;ILco/bird/android/model/constant/AreaIconType;Lye0;Ljava/lang/Integer;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/Double;Lorg/joda/time/DateTime;Z)V

    return-object v1
.end method

.method public final c(Ljava/lang/String;)LRm;
    .locals 2

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le01;

    iget-object v1, p0, LSm;->d:Lbn;

    invoke-interface {v1}, Lbn;->w()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-direct {v0, p1, v1}, Le01;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public final d(Lco/bird/android/model/persistence/Area;)LRm;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lds4;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lan;->a(Lco/bird/android/model/constant/AreaIconType;)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LSm;->b:Landroid/content/Context;

    invoke-static {p1, v2}, Les4;->b(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Les4;->c(Lco/bird/android/model/persistence/Area;)I

    move-result v3

    iget-object v4, p0, LSm;->b:Landroid/content/Context;

    invoke-static {p1, v4}, Les4;->a(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lds4;-><init>(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)V

    return-object v0
.end method

.method public final e(Lco/bird/android/model/persistence/Area;)LRm;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOj6;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lan;->a(Lco/bird/android/model/constant/AreaIconType;)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v2, v1

    iget-object v1, p0, LSm;->b:Landroid/content/Context;

    invoke-static {p1, v1}, LPj6;->b(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, LPj6;->c(Lco/bird/android/model/persistence/Area;)I

    move-result v4

    iget-object v1, p0, LSm;->b:Landroid/content/Context;

    invoke-static {p1, v1}, LPj6;->a(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, LSm;->a:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getMap()Lco/bird/android/model/wire/configs/OperatorMapConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorMapConfig;->getOperatorArea()Lco/bird/android/model/wire/configs/OperatorAreaConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorAreaConfig;->getVariableFeeZendeskArticleId()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LOj6;-><init>(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
