.class public final Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AcceptDesignation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;",
        "acceptDestinationConfirmationTitle",
        "",
        "acceptDestinationConfirmationBody",
        "bountyIds",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "getAcceptDestinationConfirmationBody",
        "()Ljava/lang/String;",
        "getAcceptDestinationConfirmationTitle",
        "getBountyIds",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "acceptDestinationConfirmationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptDestinationConfirmationBody"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

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

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;"
        }
    .end annotation

    const-string v0, "acceptDestinationConfirmationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptDestinationConfirmationBody"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAcceptDestinationConfirmationBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getAcceptDestinationConfirmationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

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

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationTitle:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->acceptDestinationConfirmationBody:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->bountyIds:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AcceptDesignation(acceptDestinationConfirmationTitle="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptDestinationConfirmationBody="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bountyIds="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
