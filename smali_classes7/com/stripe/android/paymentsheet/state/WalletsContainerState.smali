.class public final Lcom/stripe/android/paymentsheet/state/WalletsContainerState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;",
        "",
        "showLink",
        "",
        "showGooglePay",
        "dividerTextResource",
        "",
        "(ZZI)V",
        "getDividerTextResource",
        "()I",
        "shouldShow",
        "getShouldShow",
        "()Z",
        "getShowGooglePay",
        "getShowLink",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "paymentsheet_release"
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
.field private final dividerTextResource:I

.field private final showGooglePay:Z

.field private final showLink:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;-><init>(ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    iput p3, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    return-void
.end method

.method public synthetic constructor <init>(ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget p3, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_or_pay_using:I

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;-><init>(ZZI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/state/WalletsContainerState;ZZIILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->copy(ZZI)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    return v0
.end method

.method public final copy(ZZI)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;-><init>(ZZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    iget p1, p1, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDividerTextResource()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    return v0
.end method

.method public final getShouldShow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final getShowGooglePay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    return v0
.end method

.method public final getShowLink()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showLink:Z

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->showGooglePay:Z

    iget v2, p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->dividerTextResource:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WalletsContainerState(showLink="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showGooglePay="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", dividerTextResource="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
