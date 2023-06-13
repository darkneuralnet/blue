.class public final Lco/bird/android/model/BirdPartBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003JA\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\nH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/BirdPartBody;",
        "",
        "attachSource",
        "Lco/bird/android/model/AttachSource;",
        "sourcePart",
        "Lco/bird/android/model/wire/WirePart;",
        "identifyingPart",
        "partKind",
        "Lco/bird/android/model/constant/PartKind;",
        "birdId",
        "",
        "(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V",
        "getAttachSource",
        "()Lco/bird/android/model/AttachSource;",
        "getBirdId",
        "()Ljava/lang/String;",
        "getIdentifyingPart",
        "()Lco/bird/android/model/wire/WirePart;",
        "getPartKind",
        "()Lco/bird/android/model/constant/PartKind;",
        "getSourcePart",
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
        "model_release"
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
.field private final attachSource:Lco/bird/android/model/AttachSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "attach_source"
    .end annotation

    .annotation runtime Lft5;
        value = "attach_source"
    .end annotation
.end field

.field private final birdId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_id"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_id"
    .end annotation
.end field

.field private final identifyingPart:Lco/bird/android/model/wire/WirePart;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "identifying_part"
    .end annotation

    .annotation runtime Lft5;
        value = "identifying_part"
    .end annotation
.end field

.field private final partKind:Lco/bird/android/model/constant/PartKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "part_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "part_kind"
    .end annotation
.end field

.field private final sourcePart:Lco/bird/android/model/wire/WirePart;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "source_part"
    .end annotation

    .annotation runtime Lft5;
        value = "source_part"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/BirdPartBody;-><init>(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V
    .locals 1

    const-string v0, "attachSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    iput-object p2, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    iput-object p3, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    iput-object p4, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    iput-object p5, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lco/bird/android/model/AttachSource;->SCAN:Lco/bird/android/model/AttachSource;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move-object p7, v0

    goto :goto_0

    :cond_1
    move-object p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    move-object v1, v0

    goto :goto_1

    :cond_2
    move-object v1, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    const-string p5, ""

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v1

    move-object p6, v0

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lco/bird/android/model/BirdPartBody;-><init>(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/BirdPartBody;Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/BirdPartBody;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/BirdPartBody;->copy(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lco/bird/android/model/BirdPartBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/AttachSource;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WirePart;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WirePart;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/PartKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lco/bird/android/model/BirdPartBody;
    .locals 7

    const-string v0, "attachSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BirdPartBody;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/BirdPartBody;-><init>(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/BirdPartBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/BirdPartBody;

    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    iget-object v3, p1, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    iget-object v3, p1, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    iget-object v3, p1, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    iget-object v3, p1, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAttachSource()Lco/bird/android/model/AttachSource;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    return-object v0
.end method

.method public final getBirdId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final getIdentifyingPart()Lco/bird/android/model/wire/WirePart;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    return-object v0
.end method

.method public final getPartKind()Lco/bird/android/model/constant/PartKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    return-object v0
.end method

.method public final getSourcePart()Lco/bird/android/model/wire/WirePart;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePart;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePart;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/BirdPartBody;->attachSource:Lco/bird/android/model/AttachSource;

    iget-object v1, p0, Lco/bird/android/model/BirdPartBody;->sourcePart:Lco/bird/android/model/wire/WirePart;

    iget-object v2, p0, Lco/bird/android/model/BirdPartBody;->identifyingPart:Lco/bird/android/model/wire/WirePart;

    iget-object v3, p0, Lco/bird/android/model/BirdPartBody;->partKind:Lco/bird/android/model/constant/PartKind;

    iget-object v4, p0, Lco/bird/android/model/BirdPartBody;->birdId:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "BirdPartBody(attachSource="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourcePart="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", identifyingPart="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", partKind="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birdId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
