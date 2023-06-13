.class public final Lco/bird/api/response/BeginnerModeOnboardingResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
        "",
        "navigationTitle",
        "",
        "contentTitle",
        "contentSubtitle",
        "asset",
        "Lco/bird/android/model/wire/WireLegacyAsset;",
        "actions",
        "",
        "Lco/bird/api/response/BeginnerModeOnboardingAction;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)V",
        "getActions",
        "()Ljava/util/List;",
        "getAsset",
        "()Lco/bird/android/model/wire/WireLegacyAsset;",
        "getContentSubtitle",
        "()Ljava/lang/String;",
        "getContentTitle",
        "getNavigationTitle",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private final actions:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "actions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeOnboardingAction;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "actions"
    .end annotation
.end field

.field private final asset:Lco/bird/android/model/wire/WireLegacyAsset;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "asset"
    .end annotation

    .annotation runtime Lft5;
        value = "asset"
    .end annotation
.end field

.field private final contentSubtitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "content_subtitle"
    .end annotation

    .annotation runtime Lft5;
        value = "content_subtitle"
    .end annotation
.end field

.field private final contentTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "content_title"
    .end annotation

    .annotation runtime Lft5;
        value = "content_title"
    .end annotation
.end field

.field private final navigationTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "navigation_title"
    .end annotation

    .annotation runtime Lft5;
        value = "navigation_title"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLegacyAsset;",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeOnboardingAction;",
            ">;)V"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "asset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    iput-object p5, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    const-string v0, ""

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p5

    :cond_3
    move-object v6, p5

    move-object v1, p0

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lco/bird/api/response/BeginnerModeOnboardingResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/BeginnerModeOnboardingResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;ILjava/lang/Object;)Lco/bird/api/response/BeginnerModeOnboardingResponse;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/response/BeginnerModeOnboardingResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)Lco/bird/api/response/BeginnerModeOnboardingResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/wire/WireLegacyAsset;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeOnboardingAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)Lco/bird/api/response/BeginnerModeOnboardingResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLegacyAsset;",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeOnboardingAction;",
            ">;)",
            "Lco/bird/api/response/BeginnerModeOnboardingResponse;"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "asset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/BeginnerModeOnboardingResponse;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/api/response/BeginnerModeOnboardingResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;

    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    iget-object v3, p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    iget-object p1, p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeOnboardingAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final getAsset()Lco/bird/android/model/wire/WireLegacyAsset;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    return-object v0
.end method

.method public final getContentSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLegacyAsset;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentTitle:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->contentSubtitle:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->asset:Lco/bird/android/model/wire/WireLegacyAsset;

    iget-object v4, p0, Lco/bird/api/response/BeginnerModeOnboardingResponse;->actions:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "BeginnerModeOnboardingResponse(navigationTitle="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contentTitle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contentSubtitle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", asset="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actions="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
