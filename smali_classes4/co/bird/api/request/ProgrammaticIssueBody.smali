.class public final Lco/bird/api/request/ProgrammaticIssueBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/api/request/ProgrammaticIssueBody;",
        "",
        "flowType",
        "Lco/bird/android/model/IssueFlow;",
        "issueKind",
        "Lco/bird/android/model/IssueKind;",
        "errorMessage",
        "",
        "birdId",
        "(Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;)V",
        "getBirdId",
        "()Ljava/lang/String;",
        "getErrorMessage",
        "getFlowType",
        "()Lco/bird/android/model/IssueFlow;",
        "getIssueKind",
        "()Lco/bird/android/model/IssueKind;",
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
.field private final birdId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_id"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_id"
    .end annotation
.end field

.field private final errorMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "error_message"
    .end annotation

    .annotation runtime Lft5;
        value = "error_message"
    .end annotation
.end field

.field private final flowType:Lco/bird/android/model/IssueFlow;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "flow_type"
    .end annotation

    .annotation runtime Lft5;
        value = "flow_type"
    .end annotation
.end field

.field private final issueKind:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "issue_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "issue_kind"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "flowType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "issueKind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    iput-object p2, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    iput-object p3, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/ProgrammaticIssueBody;Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/api/request/ProgrammaticIssueBody;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/ProgrammaticIssueBody;->copy(Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/request/ProgrammaticIssueBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/IssueFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/IssueKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/request/ProgrammaticIssueBody;
    .locals 1

    const-string v0, "flowType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "issueKind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/ProgrammaticIssueBody;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/ProgrammaticIssueBody;-><init>(Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/ProgrammaticIssueBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/ProgrammaticIssueBody;

    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    iget-object v3, p1, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    iget-object v3, p1, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBirdId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getFlowType()Lco/bird/android/model/IssueFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    return-object v0
.end method

.method public final getIssueKind()Lco/bird/android/model/IssueKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/request/ProgrammaticIssueBody;->flowType:Lco/bird/android/model/IssueFlow;

    iget-object v1, p0, Lco/bird/api/request/ProgrammaticIssueBody;->issueKind:Lco/bird/android/model/IssueKind;

    iget-object v2, p0, Lco/bird/api/request/ProgrammaticIssueBody;->errorMessage:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/api/request/ProgrammaticIssueBody;->birdId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ProgrammaticIssueBody(flowType="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", issueKind="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", birdId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
