.class public final Lco/bird/api/request/IssueCreateMultipleBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/api/request/IssueCreateMultipleBody;",
        "",
        "workOrderId",
        "",
        "issueTypeIds",
        "",
        "source",
        "Lco/bird/android/model/IssueCreateSource;",
        "(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)V",
        "getIssueTypeIds",
        "()Ljava/util/List;",
        "getSource",
        "()Lco/bird/android/model/IssueCreateSource;",
        "getWorkOrderId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
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
.field private final issueTypeIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "issue_type_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "issue_type_ids"
    .end annotation
.end field

.field private final source:Lco/bird/android/model/IssueCreateSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "source"
    .end annotation

    .annotation runtime Lft5;
        value = "source"
    .end annotation
.end field

.field private final workOrderId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "work_order_id"
    .end annotation

    .annotation runtime Lft5;
        value = "work_order_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/IssueCreateSource;",
            ")V"
        }
    .end annotation

    const-string v0, "issueTypeIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    iput-object p3, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/request/IssueCreateMultipleBody;-><init>(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/IssueCreateMultipleBody;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;ILjava/lang/Object;)Lco/bird/api/request/IssueCreateMultipleBody;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/request/IssueCreateMultipleBody;->copy(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)Lco/bird/api/request/IssueCreateMultipleBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/IssueCreateSource;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)Lco/bird/api/request/IssueCreateMultipleBody;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/IssueCreateSource;",
            ")",
            "Lco/bird/api/request/IssueCreateMultipleBody;"
        }
    .end annotation

    const-string v0, "issueTypeIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/IssueCreateMultipleBody;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/request/IssueCreateMultipleBody;-><init>(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/IssueCreateMultipleBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/IssueCreateMultipleBody;

    iget-object v1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    iget-object p1, p1, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIssueTypeIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    return-object v0
.end method

.method public final getSource()Lco/bird/android/model/IssueCreateSource;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    return-object v0
.end method

.method public final getWorkOrderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/request/IssueCreateMultipleBody;->workOrderId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/IssueCreateMultipleBody;->issueTypeIds:Ljava/util/List;

    iget-object v2, p0, Lco/bird/api/request/IssueCreateMultipleBody;->source:Lco/bird/android/model/IssueCreateSource;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IssueCreateMultipleBody(workOrderId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", issueTypeIds="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
