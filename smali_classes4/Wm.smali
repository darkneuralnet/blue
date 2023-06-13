.class public final LWm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\u000c\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u000c\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0007J\u000c\u0010\u0008\u001a\u00020\u0006*\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u000e\u0010\u000b\u001a\u00020\t*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LWm;",
        "",
        "Lco/bird/android/model/Polygon;",
        "",
        "b",
        "e",
        "Lco/bird/android/model/constant/ZoomBehavior;",
        "d",
        "f",
        "Lco/bird/android/model/constant/AreaIconType;",
        "c",
        "a",
        "Lwi2;",
        "Lwi2;",
        "deserializer",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.area.impl"
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
        "SMAP\nAreaConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaConverters.kt\nco/bird/android/persistence/area/impl/converters/AreaConverters\n+ 2 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n13#2,2:32\n15#2,2:36\n1109#3,2:34\n1#4:38\n*S KotlinDebug\n*F\n+ 1 AreaConverters.kt\nco/bird/android/persistence/area/impl/converters/AreaConverters\n*L\n23#1:32,2\n23#1:36,2\n23#1:34,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LWm;

.field public static final b:Lwi2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWm;

    invoke-direct {v0}, LWm;-><init>()V

    sput-object v0, LWm;->a:LWm;

    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {v0}, Lco/bird/android/persistence/common/impl/Converters;->a()Lwi2;

    move-result-object v0

    sput-object v0, LWm;->b:Lwi2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;)Lco/bird/android/model/constant/AreaIconType;
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p0, :cond_0

    :try_start_0
    invoke-static {p0}, Lco/bird/android/model/constant/AreaIconType;->valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/AreaIconType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Lco/bird/android/model/constant/AreaIconType;->UNKNOWN:Lco/bird/android/model/constant/AreaIconType;

    :goto_0
    if-nez p0, :cond_1

    :cond_0
    sget-object p0, Lco/bird/android/model/constant/AreaIconType;->UNKNOWN:Lco/bird/android/model/constant/AreaIconType;

    :cond_1
    return-object p0
.end method

.method public static final b(Lco/bird/android/model/Polygon;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LWm;->b:Lwi2;

    invoke-virtual {v0, p0}, Lwi2;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/constant/AreaIconType;)Ljava/lang/String;
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(Lco/bird/android/model/constant/ZoomBehavior;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)Lco/bird/android/model/Polygon;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LWm;->b:Lwi2;

    const-class v1, Lco/bird/android/model/Polygon;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Polygon;

    return-object p0
.end method

.method public static final f(Ljava/lang/String;)Lco/bird/android/model/constant/ZoomBehavior;
    .locals 9
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "Array contains no element matching the predicate."

    const-class v1, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v4, v3

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    move-object v7, v6

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v7, p0, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string p0, "{\n    E::class.java.enum\u2026.equals(name, true) }\n  }"

    invoke-static {v6, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Enum;

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v1, p0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, p0, v2

    move-object v4, v3

    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    const-string v5, "UNKNOWN"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string p0, "{\n    E::class.java.enum\u2026m.name == \"UNKNOWN\" }\n  }"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v3

    check-cast v6, Ljava/lang/Enum;

    :goto_2
    check-cast v6, Lco/bird/android/model/constant/ZoomBehavior;

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sget-object v6, Lco/bird/android/model/constant/ZoomBehavior;->ALWAYS_HIDDEN:Lco/bird/android/model/constant/ZoomBehavior;

    :goto_3
    return-object v6
.end method
