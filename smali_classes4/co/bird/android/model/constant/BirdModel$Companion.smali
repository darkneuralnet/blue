.class public final Lco/bird/android/model/constant/BirdModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/constant/BirdModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/constant/BirdModel$Companion;",
        "",
        "()V",
        "bikeModels",
        "",
        "Lco/bird/android/model/constant/BirdModel;",
        "getBikeModels",
        "()Ljava/util/List;",
        "birdOnePcmList",
        "getBirdOnePcmList",
        "birdZeroList",
        "getBirdZeroList",
        "cruiserModels",
        "getCruiserModels",
        "miniCruiserModels",
        "getMiniCruiserModels",
        "motoModels",
        "getMotoModels",
        "scooterModels",
        "getScooterModels",
        "swappableModels",
        "getSwappableModels",
        "v2BrainList",
        "getV2BrainList",
        "fromString",
        "text",
        "",
        "model-constant"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdModel.kt\nco/bird/android/model/constant/BirdModel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n1282#2,2:87\n*S KotlinDebug\n*F\n+ 1 BirdModel.kt\nco/bird/android/model/constant/BirdModel$Companion\n*L\n52#1:87,2\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/constant/BirdModel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromString(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->values()[Lco/bird/android/model/constant/BirdModel;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lco/bird/android/model/constant/BirdModel;->getDescription()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v6, p1, v7}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    const-string v9, "getDefault()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Lco/bird/android/model/constant/BirdModel;->getModelOverride()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-static {v6, p1, v7}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-ne v6, v7, :cond_0

    move v6, v7

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    move v7, v3

    :cond_2
    :goto_2
    if-eqz v7, :cond_3

    move-object v0, v5

    goto :goto_3

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_3
    return-object v0
.end method

.method public final getBikeModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getBikeModels$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getBirdOnePcmList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getBirdOnePcmList$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getBirdZeroList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getBirdZeroList$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getCruiserModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getCruiserModels$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getMiniCruiserModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getMiniCruiserModels$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getMotoModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getMotoModels$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getScooterModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getScooterModels$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getSwappableModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getSwappableModels$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getV2BrainList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lco/bird/android/model/constant/BirdModel;->access$getV2BrainList$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
