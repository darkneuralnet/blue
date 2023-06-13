.class public final Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0008H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;",
        "Landroid/os/Parcelable;",
        "priority",
        "Lco/bird/android/model/constant/CampaignPriority;",
        "color",
        "",
        "sortWeight",
        "campaignIssueMessage",
        "",
        "campaignRepairMessage",
        "(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)V",
        "getCampaignIssueMessage",
        "()Ljava/lang/String;",
        "getCampaignRepairMessage",
        "getColor",
        "()I",
        "getPriority",
        "()Lco/bird/android/model/constant/CampaignPriority;",
        "getSortWeight",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final campaignIssueMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "campaign_issue_message"
    .end annotation

    .annotation runtime Lft5;
        value = "campaign_issue_message"
    .end annotation
.end field

.field private final campaignRepairMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "campaign_repair_message"
    .end annotation

    .annotation runtime Lft5;
        value = "campaign_repair_message"
    .end annotation
.end field

.field private final color:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "color"
    .end annotation

    .annotation runtime Lft5;
        value = "color"
    .end annotation
.end field

.field private final priority:Lco/bird/android/model/constant/CampaignPriority;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "priority"
    .end annotation

    .annotation runtime Lft5;
        value = "priority"
    .end annotation
.end field

.field private final sortWeight:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sort_weight"
    .end annotation

    .annotation runtime Lft5;
        value = "sort_weight"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

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

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;-><init>(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "campaignIssueMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "campaignRepairMessage"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    iput p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    iput p3, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    iput-object p4, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lco/bird/android/model/constant/CampaignPriority;->INFO:Lco/bird/android/model/constant/CampaignPriority;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p7, v0

    goto :goto_0

    :cond_1
    move p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    const-string p3, ""

    if-eqz p2, :cond_3

    move-object v1, p3

    goto :goto_2

    :cond_3
    move-object v1, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    move-object v2, p3

    goto :goto_3

    :cond_4
    move-object v2, p5

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;-><init>(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->copy(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/CampaignPriority;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;
    .locals 7

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "campaignIssueMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "campaignRepairMessage"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;-><init>(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    iget-object v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    iget-object v3, p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    iget v3, p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    iget v3, p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCampaignIssueMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getCampaignRepairMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    return v0
.end method

.method public final getPriority()Lco/bird/android/model/constant/CampaignPriority;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    return-object v0
.end method

.method public final getSortWeight()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    iget v1, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    iget v2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    iget-object v3, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WireServiceCenterCampaignPriority(priority="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sortWeight="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", campaignIssueMessage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", campaignRepairMessage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->priority:Lco/bird/android/model/constant/CampaignPriority;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->color:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->sortWeight:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignIssueMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->campaignRepairMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
