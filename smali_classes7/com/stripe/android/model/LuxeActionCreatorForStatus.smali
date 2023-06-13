.class public final Lcom/stripe/android/model/LuxeActionCreatorForStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;,
        Lcom/stripe/android/model/LuxeActionCreatorForStatus$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus;",
        "",
        "status",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "actionCreator",
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;",
        "(Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;)V",
        "getActionCreator",
        "()Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;",
        "getStatus",
        "()Lcom/stripe/android/model/StripeIntent$Status;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "ActionCreator",
        "Companion",
        "payments-core_release"
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
.field public static final Companion:Lcom/stripe/android/model/LuxeActionCreatorForStatus$Companion;


# instance fields
.field private final actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

.field private final status:Lcom/stripe/android/model/StripeIntent$Status;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/LuxeActionCreatorForStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/LuxeActionCreatorForStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->Companion:Lcom/stripe/android/model/LuxeActionCreatorForStatus$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionCreator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    iput-object p2, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;ILjava/lang/Object;)Lcom/stripe/android/model/LuxeActionCreatorForStatus;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->copy(Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;)Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/StripeIntent$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;)Lcom/stripe/android/model/LuxeActionCreatorForStatus;
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionCreator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/LuxeActionCreatorForStatus;-><init>(Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    iget-object v1, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v3, p1, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    iget-object p1, p1, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getActionCreator()Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/model/StripeIntent$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->status:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v1, p0, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->actionCreator:Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LuxeActionCreatorForStatus(status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionCreator="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
