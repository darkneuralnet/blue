.class public final LZZ1;
.super LQM4;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0018\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000c\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0008\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001bR\u001a\u0010!\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0019\u001a\u0004\u0008 \u0010\u001bR\u001a\u0010$\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0019\u001a\u0004\u0008#\u0010\u001b\u00a8\u0006\'"
    }
    d2 = {
        "LZZ1;",
        "LQM4;",
        "Landroid/content/Context;",
        "context",
        "",
        "title",
        "message",
        "",
        "isGuest",
        "",
        "fineString",
        "h",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "f",
        "Z",
        "()Z",
        "g",
        "Ljava/lang/String;",
        "getFineString",
        "()Ljava/lang/String;",
        "I",
        "d",
        "()I",
        "iconRes",
        "i",
        "smallIconRes",
        "j",
        "c",
        "color",
        "k",
        "e",
        "shortTitle",
        "<init>",
        "(ZLjava/lang/String;)V",
        "core-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LQM4;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p1, p0, LZZ1;->f:Z

    iput-object p2, p0, LZZ1;->g:Ljava/lang/String;

    sget p1, Lrg4;->ic_ride_warning_no_parking_area_icon:I

    iput p1, p0, LZZ1;->h:I

    sget p1, Lrg4;->ic_no_parking:I

    iput p1, p0, LZZ1;->i:I

    sget p1, LDf4;->birdRed:I

    iput p1, p0, LZZ1;->j:I

    sget p1, Lnl4;->rider_pill_slow_no_park_zone:I

    iput p1, p0, LZZ1;->k:I

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, LZZ1;-><init>(ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(LZZ1;ZLjava/lang/String;ILjava/lang/Object;)LZZ1;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, LZZ1;->f:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, LZZ1;->g:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, LZZ1;->h(ZLjava/lang/String;)LZZ1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LZZ1;->j:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LZZ1;->h:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LZZ1;->k:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LZZ1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LZZ1;

    iget-boolean v1, p0, LZZ1;->f:Z

    iget-boolean v3, p1, LZZ1;->f:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LZZ1;->g:Ljava/lang/String;

    iget-object p1, p1, LZZ1;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LZZ1;->i:I

    return v0
.end method

.method public final h(ZLjava/lang/String;)LZZ1;
    .locals 1

    new-instance v0, LZZ1;

    invoke-direct {v0, p1, p2}, LZZ1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LZZ1;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LZZ1;->g:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public message(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, p0, LZZ1;->f:Z

    sget v3, Lnl4;->area_state_dialog_guest_slow_no_park_body:I

    sget v4, Lnl4;->area_state_dialog_slow_no_park_body:I

    iget-object v5, p0, LZZ1;->g:Ljava/lang/String;

    sget v0, Lnl4;->area_state_dialog_guest_slow_no_park_with_fine_body:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget v0, Lnl4;->area_state_dialog_slow_no_park_with_fine_body:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LOy;->access$getStringForGuestAndFineCombo(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public title(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, p0, LZZ1;->f:Z

    sget v3, Lnl4;->area_state_dialog_guest_slow_no_park_title:I

    sget v4, Lnl4;->area_state_dialog_slow_no_park_title:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x38

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, LOy;->c(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, LZZ1;->f:Z

    iget-object v1, p0, LZZ1;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InSlowNoParkAreaDialog(isGuest="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", fineString="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
