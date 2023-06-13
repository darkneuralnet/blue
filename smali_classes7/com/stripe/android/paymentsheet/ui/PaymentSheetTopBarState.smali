.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B;\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "",
        "icon",
        "",
        "contentDescription",
        "showTestModeLabel",
        "",
        "showEditMenu",
        "editMenuLabel",
        "isEnabled",
        "(IIZZIZ)V",
        "getContentDescription",
        "()I",
        "getEditMenuLabel",
        "getIcon",
        "()Z",
        "getShowEditMenu",
        "getShowTestModeLabel",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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
.field private final contentDescription:I

.field private final editMenuLabel:I

.field private final icon:I

.field private final isEnabled:Z

.field private final showEditMenu:Z

.field private final showTestModeLabel:Z


# direct methods
.method public constructor <init>(IIZZIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;IIZZIZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->copy(IIZZIZ)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    return v0
.end method

.method public final copy(IIZZIZ)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 8

    new-instance v7, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;-><init>(IIZZIZ)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    iget-boolean p1, p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getContentDescription()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    return v0
.end method

.method public final getEditMenuLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    return v0
.end method

.method public final getIcon()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    return v0
.end method

.method public final getShowEditMenu()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    return v0
.end method

.method public final getShowTestModeLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->icon:I

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->contentDescription:I

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showTestModeLabel:Z

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->showEditMenu:Z

    iget v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->editMenuLabel:I

    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "PaymentSheetTopBarState(icon="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", contentDescription="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", showTestModeLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showEditMenu="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", editMenuLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isEnabled="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
