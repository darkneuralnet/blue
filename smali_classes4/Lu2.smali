.class public final LLu2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aP\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u000e\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\tH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Lco/bird/android/model/constant/AssetManagerType;",
        "manager",
        "Lorg/joda/time/DateTime;",
        "manifestDate",
        "downloadUrl",
        "mediaType",
        "filePath",
        "downloadedAt",
        "LNo;",
        "a",
        "Lco/bird/android/model/LocalAsset;",
        "c",
        "local-asset_release"
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
        "SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)LNo;
    .locals 13

    new-instance v12, LNo;

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v10, 0x24

    const/4 v11, 0x0

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move-object v8, p2

    move-object/from16 v9, p3

    invoke-direct/range {v0 .. v11}, LNo;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12
.end method

.method public static final synthetic access$toLocalAsset(LNo;)Lco/bird/android/model/LocalAsset;
    .locals 0

    invoke-static {p0}, LLu2;->c(LNo;)Lco/bird/android/model/LocalAsset;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ILjava/lang/Object;)LNo;
    .locals 6

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_3

    move-object v4, v1

    goto :goto_3

    :cond_3
    move-object v4, p5

    :goto_3
    and-int/lit8 v5, p7, 0x20

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move-object v1, p6

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v2

    move-object p6, v3

    move-object p7, v4

    move-object p8, v1

    invoke-static/range {p2 .. p8}, LLu2;->a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)LNo;

    move-result-object v0

    return-object v0
.end method

.method public static final c(LNo;)Lco/bird/android/model/LocalAsset;
    .locals 11

    invoke-virtual {p0}, LNo;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LNo;->h()Lco/bird/android/model/constant/AssetManagerType;

    move-result-object v2

    invoke-virtual {p0}, LNo;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    new-instance v4, Ljava/io/File;

    invoke-virtual {p0}, LNo;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LNo;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, LNo;->f()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p0}, LNo;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, LNo;->d()Lorg/joda/time/DateTime;

    move-result-object v8

    if-nez v8, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {p0}, LNo;->i()Lorg/joda/time/DateTime;

    move-result-object v9

    invoke-virtual {p0}, LNo;->c()Ljava/lang/String;

    move-result-object p0

    new-instance v10, Lco/bird/android/model/LocalAsset;

    move-object v0, v10

    move-object v3, v4

    move-object v4, v6

    move-object v6, v7

    move-object v7, v9

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lco/bird/android/model/LocalAsset;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/io/File;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-object v10

    :cond_1
    return-object v3
.end method
