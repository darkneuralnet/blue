.class public final LPm;
.super LtA;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007J\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\nJ\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u000cJ\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000cH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\nH\u0002\u00a8\u0006\u001a"
    }
    d2 = {
        "LPm;",
        "LtA;",
        "Lgo;",
        "areaModel",
        "",
        "LH6;",
        "r",
        "LMn;",
        "model",
        "u",
        "Le01;",
        "s",
        "LOj6;",
        "v",
        "Lds4;",
        "t",
        "bottomSheetModel",
        "y",
        "A",
        "w",
        "z",
        "x",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "co.bird.android.feature.operator.bottomsheets"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LtA;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final A(LOj6;)LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    invoke-virtual {p1}, LOj6;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, LOj6;->e()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p1}, LOj6;->d()I

    move-result v10

    invoke-virtual {p1}, LOj6;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1}, LOj6;->f()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v12, p1

    new-instance p1, Lb56;

    move-object v7, p1

    invoke-direct/range {v7 .. v12}, Lb56;-><init>(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;)V

    sget v9, LDk4;->item_title_message:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    move-object v8, p1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final r(Lgo;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgo;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "areaModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LPm;->w(Lgo;)LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final s(Le01;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le01;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LPm;->x(Le01;)LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lds4;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds4;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LPm;->y(Lds4;)LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final u(LMn;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMn;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LPm;->z(LMn;)LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final v(LOj6;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOj6;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LPm;->A(LOj6;)LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lgo;)LH6;
    .locals 18

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v2}, Lgo;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lgo;->b()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lgo;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lgo;->d()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lgo;->f()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lgo;->g()Lye0;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lgo;->e()Ljava/lang/Double;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lgo;->i()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lgo;->h()Lorg/joda/time/DateTime;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lgo;->j()Z

    move-result v17

    new-instance v2, Lze0;

    move-object v7, v2

    invoke-direct/range {v7 .. v17}, Lze0;-><init>(Ljava/lang/String;ILjava/lang/String;ILco/bird/android/model/constant/AreaIconType;Lye0;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/Double;Z)V

    sget v9, LDk4;->item_cap_restriction:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    move-object v8, v2

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final x(Le01;)LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    new-instance v8, Lf01;

    invoke-virtual {p1}, Le01;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Le01;->b()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-direct {v8, v2, p1}, Lf01;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;)V

    sget v9, LDk4;->item_demand_area:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final y(Lds4;)LH6;
    .locals 15

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    invoke-virtual/range {p1 .. p1}, Lds4;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lds4;->e()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lds4;->d()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lds4;->b()Ljava/lang/String;

    move-result-object v11

    new-instance v2, Lb56;

    const/4 v12, 0x0

    const/16 v13, 0x10

    const/4 v14, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v14}, Lb56;-><init>(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v9, LDk4;->item_title_message:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    move-object v7, v1

    move-object v8, v2

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final z(LMn;)LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    invoke-virtual {p1}, LMn;->b()Lorg/joda/time/DateTime;

    move-result-object v8

    sget v9, LDk4;->item_refresh:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
