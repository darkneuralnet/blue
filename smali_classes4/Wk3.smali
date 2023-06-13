.class public final LWk3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010\u000c\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\n\u001a\u00020\t\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\t\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireOperatorOptionFilter;",
        "",
        "",
        "enabledOptions",
        "Lco/bird/android/model/constant/FilterLogicToggleOption;",
        "logicOperator",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "a",
        "Lco/bird/android/model/wire/WireOperatorFilterOption;",
        "",
        "enabled",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
        "c",
        "Lco/bird/android/model/wire/WireOperatorToggleFilter;",
        "Lco/bird/android/model/persistence/OperatorToggleFilter;",
        "b",
        "co.bird.android.repository.fleet-status"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorFilterConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterConversion.kt\nco/bird/android/repository/operatorfilter/converters/OperatorFilterConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 OperatorFilterConversion.kt\nco/bird/android/repository/operatorfilter/converters/OperatorFilterConversionKt\n*L\n19#1:55\n19#1:56,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireOperatorOptionFilter;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;)Lco/bird/android/model/persistence/OperatorOptionFilter;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireOperatorOptionFilter;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/FilterLogicToggleOption;",
            ")",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getKind()Lco/bird/android/model/constant/OperatorMapKind;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getOrdinal()I

    move-result v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireOperatorFilterOption;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireOperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v1, v8}, LWk3;->c(Lco/bird/android/model/wire/WireOperatorFilterOption;Z)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    move-object v10, p1

    goto :goto_1

    :cond_1
    move-object v10, v0

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v11

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    move-object v12, p0

    goto :goto_2

    :cond_2
    move-object v12, v0

    :goto_2
    new-instance p0, Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-object v1, p0

    move-object v8, p2

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/persistence/OperatorOptionFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireOperatorToggleFilter;Z)Lco/bird/android/model/persistence/OperatorToggleFilter;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getKind()Lco/bird/android/model/constant/OperatorMapKind;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getOrdinal()I

    move-result v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getToggleTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object v10, v8

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v11

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    move-object v12, p0

    goto :goto_1

    :cond_1
    move-object v12, v8

    :goto_1
    move-object v1, v0

    move v8, p1

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/persistence/OperatorToggleFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireOperatorFilterOption;Z)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorFilterOption;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorFilterOption;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorFilterOption;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v7

    move-object v1, v0

    move v5, p1

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-object v0
.end method

.method public static synthetic toPersistence$default(Lco/bird/android/model/wire/WireOperatorOptionFilter;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;ILjava/lang/Object;)Lco/bird/android/model/persistence/OperatorOptionFilter;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LWk3;->a(Lco/bird/android/model/wire/WireOperatorOptionFilter;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;)Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object p0

    return-object p0
.end method
