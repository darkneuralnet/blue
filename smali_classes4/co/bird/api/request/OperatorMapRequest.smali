.class public final Lco/bird/api/request/OperatorMapRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u000f\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u00c6\u0003Jk\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u000cH\u00d6\u0001R\u001c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0012\u00a8\u0006,"
    }
    d2 = {
        "Lco/bird/api/request/OperatorMapRequest;",
        "",
        "latitude",
        "",
        "longitude",
        "radius",
        "kind",
        "Lco/bird/android/model/constant/OperatorMapKind;",
        "filters",
        "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;",
        "bypassFilterBirdIds",
        "",
        "",
        "bypassFilterBountyIds",
        "viewport",
        "Lco/bird/android/model/wire/WireLocation;",
        "(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getBypassFilterBirdIds",
        "()Ljava/util/List;",
        "getBypassFilterBountyIds",
        "getFilters",
        "()Lco/bird/android/model/wire/WireOperatorMapFilterBundle;",
        "getKind",
        "()Lco/bird/android/model/constant/OperatorMapKind;",
        "getLatitude",
        "()D",
        "getLongitude",
        "getRadius",
        "getViewport",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bypassFilterBirdIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bypass_filter_bird_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "bypass_filter_bird_ids"
    .end annotation
.end field

.field private final bypassFilterBountyIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bypass_filter_bounty_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "bypass_filter_bounty_ids"
    .end annotation
.end field

.field private final filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "filters"
    .end annotation

    .annotation runtime Lft5;
        value = "filters"
    .end annotation
.end field

.field private final kind:Lco/bird/android/model/constant/OperatorMapKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field

.field private final latitude:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "latitude"
    .end annotation

    .annotation runtime Lft5;
        value = "latitude"
    .end annotation
.end field

.field private final longitude:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "longitude"
    .end annotation

    .annotation runtime Lft5;
        value = "longitude"
    .end annotation
.end field

.field private final radius:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "radius"
    .end annotation

    .annotation runtime Lft5;
        value = "radius"
    .end annotation
.end field

.field private final viewport:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "viewport"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "viewport"
    .end annotation
.end field


# direct methods
.method public constructor <init>(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDD",
            "Lco/bird/android/model/constant/OperatorMapKind;",
            "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;)V"
        }
    .end annotation

    const-string v0, "kind"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filters"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bypassFilterBirdIds"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bypassFilterBountyIds"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewport"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    iput-wide p3, p0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    iput-wide p5, p0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    iput-object p7, p0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    iput-object p8, p0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    iput-object p9, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    iput-object p10, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    iput-object p11, p0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p12, 0x20

    if-eqz v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    and-int/lit8 v0, p12, 0x40

    if-eqz v0, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v11, v0

    goto :goto_1

    :cond_1
    move-object/from16 v11, p10

    :goto_1
    move-object v1, p0

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lco/bird/api/request/OperatorMapRequest;-><init>(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/OperatorMapRequest;DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lco/bird/api/request/OperatorMapRequest;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    goto :goto_1

    :cond_1
    move-wide v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-wide v6, v0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p5

    :goto_2
    and-int/lit8 v8, v1, 0x8

    if-eqz v8, :cond_3

    iget-object v8, v0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    goto :goto_3

    :cond_3
    move-object/from16 v8, p7

    :goto_3
    and-int/lit8 v9, v1, 0x10

    if-eqz v9, :cond_4

    iget-object v9, v0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    goto :goto_4

    :cond_4
    move-object/from16 v9, p8

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget-object v10, v0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v10, p9

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget-object v11, v0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v11, p10

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p11

    :goto_7
    move-wide p1, v2

    move-wide p3, v4

    move-wide/from16 p5, v6

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lco/bird/api/request/OperatorMapRequest;->copy(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lco/bird/api/request/OperatorMapRequest;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    return-wide v0
.end method

.method public final component4()Lco/bird/android/model/constant/OperatorMapKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/wire/WireOperatorMapFilterBundle;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    return-object v0
.end method

.method public final copy(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lco/bird/api/request/OperatorMapRequest;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDD",
            "Lco/bird/android/model/constant/OperatorMapKind;",
            "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;)",
            "Lco/bird/api/request/OperatorMapRequest;"
        }
    .end annotation

    const-string v0, "kind"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filters"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bypassFilterBirdIds"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bypassFilterBountyIds"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewport"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/OperatorMapRequest;

    move-object v1, v0

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    invoke-direct/range {v1 .. v12}, Lco/bird/api/request/OperatorMapRequest;-><init>(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/OperatorMapRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/OperatorMapRequest;

    iget-wide v3, p0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    iget-wide v5, p1, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    iget-wide v5, p1, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    iget-wide v5, p1, Lco/bird/api/request/OperatorMapRequest;->radius:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    iget-object v3, p1, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    iget-object v3, p1, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    iget-object p1, p1, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBypassFilterBirdIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    return-object v0
.end method

.method public final getBypassFilterBountyIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    return-object v0
.end method

.method public final getFilters()Lco/bird/android/model/wire/WireOperatorMapFilterBundle;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    return-object v0
.end method

.method public final getKind()Lco/bird/android/model/constant/OperatorMapKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    return-object v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    return-wide v0
.end method

.method public final getRadius()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    return-wide v0
.end method

.method public final getViewport()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireOperatorMapFilterBundle;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-wide v0, p0, Lco/bird/api/request/OperatorMapRequest;->latitude:D

    iget-wide v2, p0, Lco/bird/api/request/OperatorMapRequest;->longitude:D

    iget-wide v4, p0, Lco/bird/api/request/OperatorMapRequest;->radius:D

    iget-object v6, p0, Lco/bird/api/request/OperatorMapRequest;->kind:Lco/bird/android/model/constant/OperatorMapKind;

    iget-object v7, p0, Lco/bird/api/request/OperatorMapRequest;->filters:Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    iget-object v8, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBirdIds:Ljava/util/List;

    iget-object v9, p0, Lco/bird/api/request/OperatorMapRequest;->bypassFilterBountyIds:Ljava/util/List;

    iget-object v10, p0, Lco/bird/api/request/OperatorMapRequest;->viewport:Ljava/util/List;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "OperatorMapRequest(latitude="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", longitude="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", radius="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", kind="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", filters="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bypassFilterBirdIds="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bypassFilterBountyIds="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewport="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
