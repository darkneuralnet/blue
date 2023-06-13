.class public final LVZ1;
.super LRM4;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u001a\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\r\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0008\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001b\u001a\u0004\u0008 \u0010\u001dR\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001b\u001a\u0004\u0008#\u0010\u001dR\u001a\u0010\'\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001b\u001a\u0004\u0008&\u0010\u001d\u00a8\u0006*"
    }
    d2 = {
        "LVZ1;",
        "LRM4;",
        "Landroid/content/Context;",
        "context",
        "",
        "title",
        "message",
        "",
        "isGuest",
        "",
        "fineString",
        "presentArParkingOption",
        "i",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "h",
        "Z",
        "()Z",
        "Ljava/lang/String;",
        "getFineString",
        "()Ljava/lang/String;",
        "j",
        "k",
        "I",
        "d",
        "()I",
        "iconRes",
        "l",
        "g",
        "smallIconRes",
        "m",
        "c",
        "color",
        "n",
        "e",
        "shortTitle",
        "<init>",
        "(ZLjava/lang/String;Z)V",
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
.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Z

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p3, v0}, LRM4;-><init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p1, p0, LVZ1;->h:Z

    iput-object p2, p0, LVZ1;->i:Ljava/lang/String;

    iput-boolean p3, p0, LVZ1;->j:Z

    sget p1, Lrg4;->ic_ride_warning_no_parking_area_icon:I

    iput p1, p0, LVZ1;->k:I

    sget p1, Lrg4;->ic_no_parking:I

    iput p1, p0, LVZ1;->l:I

    sget p1, LDf4;->birdRed:I

    iput p1, p0, LVZ1;->m:I

    sget p1, Lnl4;->rider_pill_no_ride_no_park_zone:I

    iput p1, p0, LVZ1;->n:I

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LVZ1;-><init>(ZLjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(LVZ1;ZLjava/lang/String;ZILjava/lang/Object;)LVZ1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, LVZ1;->h:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, LVZ1;->i:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, LVZ1;->j:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LVZ1;->i(ZLjava/lang/String;Z)LVZ1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LVZ1;->m:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LVZ1;->k:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LVZ1;->n:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LVZ1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LVZ1;

    iget-boolean v1, p0, LVZ1;->h:Z

    iget-boolean v3, p1, LVZ1;->h:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LVZ1;->i:Ljava/lang/String;

    iget-object v3, p1, LVZ1;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LVZ1;->j:Z

    iget-boolean p1, p1, LVZ1;->j:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LVZ1;->l:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LVZ1;->j:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, LVZ1;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LVZ1;->i:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, LVZ1;->j:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final i(ZLjava/lang/String;Z)LVZ1;
    .locals 1

    new-instance v0, LVZ1;

    invoke-direct {v0, p1, p2, p3}, LVZ1;-><init>(ZLjava/lang/String;Z)V

    return-object v0
.end method

.method public message(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, p0, LVZ1;->h:Z

    sget v3, Lnl4;->area_state_dialog_guest_no_ride_no_park_body:I

    sget v4, Lnl4;->area_state_dialog_no_ride_no_park_body:I

    iget-object v5, p0, LVZ1;->i:Ljava/lang/String;

    sget v0, Lnl4;->area_state_dialog_guest_no_ride_no_park_with_fine_body:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget v0, Lnl4;->area_state_dialog_no_ride_no_park_with_fine_body:I

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

    iget-boolean v2, p0, LVZ1;->h:Z

    sget v3, Lnl4;->area_state_dialog_guest_no_ride_no_park_title:I

    sget v4, Lnl4;->area_state_dialog_no_ride_no_park_title:I

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
    .locals 5

    iget-boolean v0, p0, LVZ1;->h:Z

    iget-object v1, p0, LVZ1;->i:Ljava/lang/String;

    iget-boolean v2, p0, LVZ1;->j:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "InNoRideNoParkAreaDialog(isGuest="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", fineString="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", presentArParkingOption="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
