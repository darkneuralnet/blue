.class public final Lco/bird/android/model/persistence/nestedstructures/Lifecycle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
        "",
        "condition",
        "Lco/bird/android/model/constant/Condition;",
        "specialCondition",
        "Lco/bird/android/model/constant/SpecialCondition;",
        "brainState",
        "Lco/bird/android/model/constant/BrainState;",
        "placement",
        "Lco/bird/android/model/constant/Placement;",
        "(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V",
        "getBrainState",
        "()Lco/bird/android/model/constant/BrainState;",
        "getCondition",
        "()Lco/bird/android/model/constant/Condition;",
        "getPlacement",
        "()Lco/bird/android/model/constant/Placement;",
        "getSpecialCondition",
        "()Lco/bird/android/model/constant/SpecialCondition;",
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
        "",
        "model-persistence_release"
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
.field private final brainState:Lco/bird/android/model/constant/BrainState;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "brain_state"
    .end annotation

    .annotation runtime Lft5;
        value = "brain_state"
    .end annotation
.end field

.field private final condition:Lco/bird/android/model/constant/Condition;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "condition"
    .end annotation

    .annotation runtime Lft5;
        value = "condition"
    .end annotation
.end field

.field private final placement:Lco/bird/android/model/constant/Placement;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "placement"
    .end annotation

    .annotation runtime Lft5;
        value = "placement"
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
.method public constructor <init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V
    .locals 1

    const-string v0, "condition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCondition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brainState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placement"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->copy(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/Condition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/SpecialCondition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/BrainState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/Placement;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;
    .locals 1

    const-string v0, "condition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCondition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brainState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placement"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;-><init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBrainState()Lco/bird/android/model/constant/BrainState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    return-object v0
.end method

.method public final getCondition()Lco/bird/android/model/constant/Condition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    return-object v0
.end method

.method public final getPlacement()Lco/bird/android/model/constant/Placement;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    return-object v0
.end method

.method public final getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->condition:Lco/bird/android/model/constant/Condition;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->specialCondition:Lco/bird/android/model/constant/SpecialCondition;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->brainState:Lco/bird/android/model/constant/BrainState;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->placement:Lco/bird/android/model/constant/Placement;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Lifecycle(condition="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", specialCondition="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", brainState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", placement="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
