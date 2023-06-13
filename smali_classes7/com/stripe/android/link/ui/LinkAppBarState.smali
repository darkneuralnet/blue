.class public final Lcom/stripe/android/link/ui/LinkAppBarState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0080\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003J?\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0008H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LinkAppBarState;",
        "",
        "navigationIcon",
        "",
        "showHeader",
        "",
        "showOverflowMenu",
        "email",
        "",
        "accountStatus",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V",
        "getAccountStatus",
        "()Lcom/stripe/android/link/model/AccountStatus;",
        "getEmail",
        "()Ljava/lang/String;",
        "getNavigationIcon",
        "()I",
        "getShowHeader",
        "()Z",
        "getShowOverflowMenu",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "link_release"
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
.field private final accountStatus:Lcom/stripe/android/link/model/AccountStatus;

.field private final email:Ljava/lang/String;

.field private final navigationIcon:I

.field private final showHeader:Z

.field private final showOverflowMenu:Z


# direct methods
.method public constructor <init>(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    iput-object p4, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/LinkAppBarState;IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;ILjava/lang/Object;)Lcom/stripe/android/link/ui/LinkAppBarState;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/link/ui/LinkAppBarState;->copy(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/link/model/AccountStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-object v0
.end method

.method public final copy(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)Lcom/stripe/android/link/ui/LinkAppBarState;
    .locals 7

    new-instance v6, Lcom/stripe/android/link/ui/LinkAppBarState;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/LinkAppBarState;-><init>(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/LinkAppBarState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/LinkAppBarState;

    iget v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    iget v3, p1, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    iget-object p1, p1, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationIcon()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    return v0
.end method

.method public final getShowHeader()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    return v0
.end method

.method public final getShowOverflowMenu()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->navigationIcon:I

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showHeader:Z

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->showOverflowMenu:Z

    iget-object v3, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->email:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/link/ui/LinkAppBarState;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "LinkAppBarState(navigationIcon="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", showHeader="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showOverflowMenu="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", email="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", accountStatus="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
