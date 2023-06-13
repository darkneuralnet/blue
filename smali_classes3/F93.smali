.class public final LF93;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ7\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0013\u001a\u0004\u0008\u0016\u0010\u0015R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "LF93;",
        "",
        "Lco/bird/android/model/NonRepair;",
        "nonRepair",
        "Lco/bird/android/model/NonRepairReason;",
        "selectedReason",
        "selectedSubreason",
        "",
        "submitEnabled",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Lco/bird/android/model/NonRepair;",
        "b",
        "()Lco/bird/android/model/NonRepair;",
        "Lco/bird/android/model/NonRepairReason;",
        "c",
        "()Lco/bird/android/model/NonRepairReason;",
        "d",
        "Z",
        "e",
        "()Z",
        "<init>",
        "(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/NonRepair;

.field public final b:Lco/bird/android/model/NonRepairReason;

.field public final c:Lco/bird/android/model/NonRepairReason;

.field public final d:Z


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

    invoke-direct/range {v0 .. v6}, LF93;-><init>(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF93;->a:Lco/bird/android/model/NonRepair;

    iput-object p2, p0, LF93;->b:Lco/bird/android/model/NonRepairReason;

    iput-object p3, p0, LF93;->c:Lco/bird/android/model/NonRepairReason;

    iput-boolean p4, p0, LF93;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, LF93;-><init>(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)V

    return-void
.end method

.method public static synthetic copy$default(LF93;Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;ZILjava/lang/Object;)LF93;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, LF93;->a:Lco/bird/android/model/NonRepair;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, LF93;->b:Lco/bird/android/model/NonRepairReason;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, LF93;->c:Lco/bird/android/model/NonRepairReason;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, LF93;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LF93;->a(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)LF93;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)LF93;
    .locals 1

    new-instance v0, LF93;

    invoke-direct {v0, p1, p2, p3, p4}, LF93;-><init>(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/NonRepair;
    .locals 1

    iget-object v0, p0, LF93;->a:Lco/bird/android/model/NonRepair;

    return-object v0
.end method

.method public final c()Lco/bird/android/model/NonRepairReason;
    .locals 1

    iget-object v0, p0, LF93;->b:Lco/bird/android/model/NonRepairReason;

    return-object v0
.end method

.method public final d()Lco/bird/android/model/NonRepairReason;
    .locals 1

    iget-object v0, p0, LF93;->c:Lco/bird/android/model/NonRepairReason;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LF93;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LF93;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LF93;

    iget-object v1, p0, LF93;->a:Lco/bird/android/model/NonRepair;

    iget-object v3, p1, LF93;->a:Lco/bird/android/model/NonRepair;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LF93;->b:Lco/bird/android/model/NonRepairReason;

    iget-object v3, p1, LF93;->b:Lco/bird/android/model/NonRepairReason;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LF93;->c:Lco/bird/android/model/NonRepairReason;

    iget-object v3, p1, LF93;->c:Lco/bird/android/model/NonRepairReason;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LF93;->d:Z

    iget-boolean p1, p1, LF93;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LF93;->a:Lco/bird/android/model/NonRepair;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/NonRepair;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LF93;->b:Lco/bird/android/model/NonRepairReason;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/NonRepairReason;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LF93;->c:Lco/bird/android/model/NonRepairReason;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/NonRepairReason;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LF93;->d:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LF93;->a:Lco/bird/android/model/NonRepair;

    iget-object v1, p0, LF93;->b:Lco/bird/android/model/NonRepairReason;

    iget-object v2, p0, LF93;->c:Lco/bird/android/model/NonRepairReason;

    iget-boolean v3, p0, LF93;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "NonRepairSurveyState(nonRepair="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedReason="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedSubreason="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", submitEnabled="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
