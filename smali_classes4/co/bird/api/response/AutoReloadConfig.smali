.class public final Lco/bird/api/response/AutoReloadConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001a\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BE\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\u000cH\u00c6\u0003J\t\u0010!\u001a\u00020\u000cH\u00c6\u0003JW\u0010\"\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00062\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u000cH\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/api/response/AutoReloadConfig;",
        "",
        "options",
        "",
        "Lco/bird/api/response/ReloadOption;",
        "enabled",
        "",
        "currentOption",
        "mandatory",
        "mandatoryMinBalance",
        "",
        "nagMinRideCount",
        "",
        "nagEveryRideCount",
        "(Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJII)V",
        "getCurrentOption",
        "()Lco/bird/api/response/ReloadOption;",
        "getEnabled",
        "()Z",
        "getMandatory",
        "getMandatoryMinBalance",
        "()J",
        "getNagEveryRideCount",
        "()I",
        "getNagMinRideCount",
        "getOptions",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "co.bird.android.api"
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
.field private final currentOption:Lco/bird/api/response/ReloadOption;

.field private final enabled:Z

.field private final mandatory:Z

.field private final mandatoryMinBalance:J

.field private final nagEveryRideCount:I

.field private final nagMinRideCount:I

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;Z",
            "Lco/bird/api/response/ReloadOption;",
            "ZJII)V"
        }
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    iput-boolean p2, p0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    iput-object p3, p0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    iput-boolean p4, p0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    iput-wide p5, p0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    iput p7, p0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    iput p8, p0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/AutoReloadConfig;Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJIIILjava/lang/Object;)Lco/bird/api/response/AutoReloadConfig;
    .locals 9

    move-object v0, p0

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_1

    iget-boolean v2, v0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_2

    iget-object v3, v0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_3

    iget-boolean v4, v0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    goto :goto_3

    :cond_3
    move v4, p4

    :goto_3
    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_4

    iget-wide v5, v0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    goto :goto_4

    :cond_4
    move-wide v5, p5

    :goto_4
    and-int/lit8 v7, p9, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    goto :goto_5

    :cond_5
    move/from16 v7, p7

    :goto_5
    and-int/lit8 v8, p9, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    :goto_6
    move-object p1, v1

    move p2, v2

    move-object p3, v3

    move p4, v4

    move-wide p5, v5

    move/from16 p7, v7

    move/from16 p8, v8

    invoke-virtual/range {p0 .. p8}, Lco/bird/api/response/AutoReloadConfig;->copy(Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJII)Lco/bird/api/response/AutoReloadConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    return v0
.end method

.method public final component3()Lco/bird/api/response/ReloadOption;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    return v0
.end method

.method public final copy(Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJII)Lco/bird/api/response/AutoReloadConfig;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;Z",
            "Lco/bird/api/response/ReloadOption;",
            "ZJII)",
            "Lco/bird/api/response/AutoReloadConfig;"
        }
    .end annotation

    const-string v0, "options"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/AutoReloadConfig;

    move-object v1, v0

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-wide v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lco/bird/api/response/AutoReloadConfig;-><init>(Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/AutoReloadConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/AutoReloadConfig;

    iget-object v1, p0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    iget-object v3, p1, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    iget-boolean v3, p1, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    iget-wide v5, p1, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    iget v3, p1, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    iget p1, p1, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCurrentOption()Lco/bird/api/response/ReloadOption;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    return v0
.end method

.method public final getMandatory()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    return v0
.end method

.method public final getMandatoryMinBalance()J
    .locals 2

    iget-wide v0, p0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    return-wide v0
.end method

.method public final getNagEveryRideCount()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    return v0
.end method

.method public final getNagMinRideCount()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    return v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lco/bird/api/response/ReloadOption;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lco/bird/api/response/AutoReloadConfig;->options:Ljava/util/List;

    iget-boolean v1, p0, Lco/bird/api/response/AutoReloadConfig;->enabled:Z

    iget-object v2, p0, Lco/bird/api/response/AutoReloadConfig;->currentOption:Lco/bird/api/response/ReloadOption;

    iget-boolean v3, p0, Lco/bird/api/response/AutoReloadConfig;->mandatory:Z

    iget-wide v4, p0, Lco/bird/api/response/AutoReloadConfig;->mandatoryMinBalance:J

    iget v6, p0, Lco/bird/api/response/AutoReloadConfig;->nagMinRideCount:I

    iget v7, p0, Lco/bird/api/response/AutoReloadConfig;->nagEveryRideCount:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "AutoReloadConfig(options="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", currentOption="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mandatory="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mandatoryMinBalance="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", nagMinRideCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", nagEveryRideCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
