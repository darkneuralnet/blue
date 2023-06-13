.class public final Lco/bird/android/model/wire/WireBountyFlightSheetAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jg\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u001e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\'"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBountyFlightSheetAction;",
        "",
        "type",
        "Lco/bird/android/model/constant/BountyFlightSheetActionType;",
        "surplusId",
        "",
        "complaintIds",
        "",
        "bountyIds",
        "navigationLocation",
        "Lco/bird/android/model/Point;",
        "acceptDestinationConfirmationTitle",
        "acceptDestinationConfirmationBody",
        "(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)V",
        "getAcceptDestinationConfirmationBody",
        "()Ljava/lang/String;",
        "getAcceptDestinationConfirmationTitle",
        "getBountyIds",
        "()Ljava/util/List;",
        "getComplaintIds",
        "getNavigationLocation",
        "()Lco/bird/android/model/Point;",
        "getSurplusId",
        "getType",
        "()Lco/bird/android/model/constant/BountyFlightSheetActionType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final acceptDestinationConfirmationBody:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "accept_designation_confirmation_body"
    .end annotation

    .annotation runtime Lft5;
        value = "accept_designation_confirmation_body"
    .end annotation
.end field

.field private final acceptDestinationConfirmationTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "accept_designation_confirmation_title"
    .end annotation

    .annotation runtime Lft5;
        value = "accept_designation_confirmation_title"
    .end annotation
.end field

.field private final bountyIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_ids"
    .end annotation
.end field

.field private final complaintIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "complaint_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "complaint_ids"
    .end annotation
.end field

.field private final navigationLocation:Lco/bird/android/model/Point;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "navigation_location"
    .end annotation

    .annotation runtime Lft5;
        value = "navigation_location"
    .end annotation
.end field

.field private final surplusId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "surplus_id"
    .end annotation

    .annotation runtime Lft5;
        value = "surplus_id"
    .end annotation
.end field

.field private final type:Lco/bird/android/model/constant/BountyFlightSheetActionType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "type"
    .end annotation

    .annotation runtime Lft5;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/BountyFlightSheetActionType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/Point;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    iput-object p2, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    iput-object p4, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    iput-object p5, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    iput-object p6, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 v0, p8, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_3

    move-object v4, v1

    goto :goto_3

    :cond_3
    move-object v4, p5

    :goto_3
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_4

    move-object v5, v1

    goto :goto_4

    :cond_4
    move-object v5, p6

    :goto_4
    and-int/lit8 v6, p8, 0x40

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, p7

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v2

    move-object p6, v3

    move-object p7, v4

    move-object p8, v5

    move-object/from16 p9, v1

    invoke-direct/range {p2 .. p9}, Lco/bird/android/model/wire/WireBountyFlightSheetAction;-><init>(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireBountyFlightSheetAction;Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireBountyFlightSheetAction;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->copy(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireBountyFlightSheetAction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/BountyFlightSheetActionType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/Point;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireBountyFlightSheetAction;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/BountyFlightSheetActionType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/Point;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/android/model/wire/WireBountyFlightSheetAction;"
        }
    .end annotation

    const-string v0, "type"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/wire/WireBountyFlightSheetAction;-><init>(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAcceptDestinationConfirmationBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getAcceptDestinationConfirmationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    return-object v0
.end method

.method public final getComplaintIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    return-object v0
.end method

.method public final getNavigationLocation()Lco/bird/android/model/Point;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    return-object v0
.end method

.method public final getSurplusId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lco/bird/android/model/constant/BountyFlightSheetActionType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/Point;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->type:Lco/bird/android/model/constant/BountyFlightSheetActionType;

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->surplusId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->complaintIds:Ljava/util/List;

    iget-object v3, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->bountyIds:Ljava/util/List;

    iget-object v4, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->navigationLocation:Lco/bird/android/model/Point;

    iget-object v5, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/android/model/wire/WireBountyFlightSheetAction;->acceptDestinationConfirmationBody:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "WireBountyFlightSheetAction(type="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", surplusId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", complaintIds="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bountyIds="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationLocation="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptDestinationConfirmationTitle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptDestinationConfirmationBody="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
