.class public final Lco/bird/api/response/WireReleaseNoticeResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/api/response/WireReleaseNoticeResponse;",
        "",
        "title",
        "",
        "message",
        "primaryButtonAction",
        "Lco/bird/android/model/constant/ReleaseNoticeAction;",
        "allowReleaseAnyway",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)V",
        "getAllowReleaseAnyway",
        "()Z",
        "getMessage",
        "()Ljava/lang/String;",
        "getPrimaryButtonAction",
        "()Lco/bird/android/model/constant/ReleaseNoticeAction;",
        "getTitle",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
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
.field private final allowReleaseAnyway:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "allow_release_anyway"
    .end annotation

    .annotation runtime Lft5;
        value = "allow_release_anyway"
    .end annotation
.end field

.field private final message:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "message"
    .end annotation

    .annotation runtime Lft5;
        value = "message"
    .end annotation
.end field

.field private final primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "primary_button_action"
    .end annotation

    .annotation runtime Lft5;
        value = "primary_button_action"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/api/response/WireReleaseNoticeResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    iput-boolean p4, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const-string v0, ""

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x1

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/api/response/WireReleaseNoticeResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WireReleaseNoticeResponse;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;ZILjava/lang/Object;)Lco/bird/api/response/WireReleaseNoticeResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/response/WireReleaseNoticeResponse;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)Lco/bird/api/response/WireReleaseNoticeResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/ReleaseNoticeAction;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)Lco/bird/api/response/WireReleaseNoticeResponse;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/WireReleaseNoticeResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/response/WireReleaseNoticeResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WireReleaseNoticeResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WireReleaseNoticeResponse;

    iget-object v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    iget-object v3, p1, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    iget-boolean p1, p1, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAllowReleaseAnyway()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryButtonAction()Lco/bird/android/model/constant/ReleaseNoticeAction;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->message:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->primaryButtonAction:Lco/bird/android/model/constant/ReleaseNoticeAction;

    iget-boolean v3, p0, Lco/bird/api/response/WireReleaseNoticeResponse;->allowReleaseAnyway:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WireReleaseNoticeResponse(title="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", message="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryButtonAction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allowReleaseAnyway="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
