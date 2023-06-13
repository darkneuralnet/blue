.class public final Lco/bird/api/request/UpdateSpecialConditionBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/api/request/UpdateSpecialConditionBody;",
        "",
        "birdId",
        "",
        "specialCondition",
        "Lco/bird/android/model/constant/SpecialCondition;",
        "sourceKind",
        "Lco/bird/android/model/LifecycleSourceKind;",
        "source",
        "Lco/bird/android/model/LifecycleSource;",
        "flow",
        "Lco/bird/android/model/LifecycleFlow;",
        "(Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;)V",
        "getBirdId",
        "()Ljava/lang/String;",
        "getFlow",
        "()Lco/bird/android/model/LifecycleFlow;",
        "getSource",
        "()Lco/bird/android/model/LifecycleSource;",
        "getSourceKind",
        "()Lco/bird/android/model/LifecycleSourceKind;",
        "getSpecialCondition",
        "()Lco/bird/android/model/constant/SpecialCondition;",
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
.field private final birdId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_id"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_id"
    .end annotation
.end field

.field private final flow:Lco/bird/android/model/LifecycleFlow;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "flow"
    .end annotation

    .annotation runtime Lft5;
        value = "flow"
    .end annotation
.end field

.field private final source:Lco/bird/android/model/LifecycleSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "source"
    .end annotation

    .annotation runtime Lft5;
        value = "source"
    .end annotation
.end field

.field private final sourceKind:Lco/bird/android/model/LifecycleSourceKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "source_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "source_kind"
    .end annotation
.end field

.field private final specialCondition:Lco/bird/android/model/constant/SpecialCondition;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "special_condition"
    .end annotation

    .annotation runtime Lft5;
        value = "special_condition"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;)V
    .locals 1

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCondition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceKind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    iput-object p3, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    iput-object p4, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    iput-object p5, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/UpdateSpecialConditionBody;Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;ILjava/lang/Object;)Lco/bird/api/request/UpdateSpecialConditionBody;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/request/UpdateSpecialConditionBody;->copy(Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;)Lco/bird/api/request/UpdateSpecialConditionBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/SpecialCondition;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/LifecycleSourceKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/LifecycleSource;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/LifecycleFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;)Lco/bird/api/request/UpdateSpecialConditionBody;
    .locals 7

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCondition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceKind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/UpdateSpecialConditionBody;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/UpdateSpecialConditionBody;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/UpdateSpecialConditionBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/UpdateSpecialConditionBody;

    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    iget-object v3, p1, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    iget-object v3, p1, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    iget-object v3, p1, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    iget-object p1, p1, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBirdId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final getFlow()Lco/bird/android/model/LifecycleFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    return-object v0
.end method

.method public final getSource()Lco/bird/android/model/LifecycleSource;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    return-object v0
.end method

.method public final getSourceKind()Lco/bird/android/model/LifecycleSourceKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    return-object v0
.end method

.method public final getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->birdId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    iget-object v2, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->sourceKind:Lco/bird/android/model/LifecycleSourceKind;

    iget-object v3, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->source:Lco/bird/android/model/LifecycleSource;

    iget-object v4, p0, Lco/bird/api/request/UpdateSpecialConditionBody;->flow:Lco/bird/android/model/LifecycleFlow;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UpdateSpecialConditionBody(birdId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", specialCondition="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourceKind="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", flow="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
