.class public final Lco/bird/api/request/ContractorNextOnboardStepBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003JA\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/api/request/ContractorNextOnboardStepBody;",
        "",
        "rootFieldId",
        "",
        "fields",
        "",
        "country",
        "contractorLevel",
        "Lco/bird/android/model/ContractorLevel;",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)V",
        "getContractorLevel",
        "()Lco/bird/android/model/ContractorLevel;",
        "getCountry",
        "()Ljava/lang/String;",
        "getFields",
        "()Ljava/util/Map;",
        "getRootFieldId",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final contractorLevel:Lco/bird/android/model/ContractorLevel;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "contractor_level"
    .end annotation

    .annotation runtime Lft5;
        value = "contractor_level"
    .end annotation
.end field

.field private final country:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "country"
    .end annotation

    .annotation runtime Lft5;
        value = "country"
    .end annotation
.end field

.field private final fields:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fields"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "fields"
    .end annotation
.end field

.field private final rootFieldId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "root_field_id"
    .end annotation

    .annotation runtime Lft5;
        value = "root_field_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/ContractorLevel;",
            ")V"
        }
    .end annotation

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    iput-object p3, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/api/request/ContractorNextOnboardStepBody;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/ContractorNextOnboardStepBody;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;ILjava/lang/Object;)Lco/bird/api/request/ContractorNextOnboardStepBody;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/ContractorNextOnboardStepBody;->copy(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)Lco/bird/api/request/ContractorNextOnboardStepBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/ContractorLevel;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)Lco/bird/api/request/ContractorNextOnboardStepBody;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/ContractorLevel;",
            ")",
            "Lco/bird/api/request/ContractorNextOnboardStepBody;"
        }
    .end annotation

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/ContractorNextOnboardStepBody;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/ContractorNextOnboardStepBody;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/ContractorNextOnboardStepBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/ContractorNextOnboardStepBody;

    iget-object v1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    iget-object p1, p1, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getContractorLevel()Lco/bird/android/model/ContractorLevel;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    return-object v0
.end method

.method public final getRootFieldId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->rootFieldId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->fields:Ljava/util/Map;

    iget-object v2, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->country:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/api/request/ContractorNextOnboardStepBody;->contractorLevel:Lco/bird/android/model/ContractorLevel;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ContractorNextOnboardStepBody(rootFieldId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fields="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", country="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contractorLevel="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
