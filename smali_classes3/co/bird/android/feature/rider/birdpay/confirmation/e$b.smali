.class public final Lco/bird/android/feature/rider/birdpay/confirmation/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/rider/birdpay/confirmation/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0019\u0008\u0086\u0008\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\u0008(\u0010)Je\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0019\u001a\u0004\u0008\u001d\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008\u0018\u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001bR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010#\u001a\u0004\u0008\u001e\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0019\u001a\u0004\u0008\"\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001f\u001a\u0004\u0008%\u0010!R\u0017\u0010\'\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001f\u001a\u0004\u0008&\u0010!\u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/feature/rider/birdpay/confirmation/e$b;",
        "",
        "",
        "isNewPayment",
        "",
        "transactionId",
        "merchantSiteId",
        "",
        "preTipAmount",
        "amountBilled",
        "currency",
        "Lorg/joda/time/DateTime;",
        "dateTime",
        "placardId",
        "tipAmount",
        "a",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Z",
        "k",
        "()Z",
        "b",
        "Ljava/lang/String;",
        "j",
        "()Ljava/lang/String;",
        "c",
        "e",
        "d",
        "J",
        "g",
        "()J",
        "f",
        "Lorg/joda/time/DateTime;",
        "()Lorg/joda/time/DateTime;",
        "h",
        "i",
        "totalAmount",
        "<init>",
        "(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)V",
        "bird-pay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:Lorg/joda/time/DateTime;

.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)V
    .locals 1

    const-string v0, "transactionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantSiteId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateTime"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    iput-wide p4, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    iput-wide p6, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    iput-object p8, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    iput-object p9, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    iput-object p10, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    iput-wide p11, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    add-long/2addr p4, p11

    iput-wide p4, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->j:J

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p13

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v11, v0

    goto :goto_0

    :cond_0
    move-object/from16 v11, p10

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-wide/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;-><init>(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/feature/rider/birdpay/confirmation/e$b;ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;JILjava/lang/Object;)Lco/bird/android/feature/rider/birdpay/confirmation/e$b;
    .locals 14

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-object v11, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p10

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-wide v12, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    goto :goto_8

    :cond_8
    move-wide/from16 v12, p11

    :goto_8
    move p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-wide/from16 p4, v5

    move-wide/from16 p6, v7

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-wide/from16 p11, v12

    invoke-virtual/range {p0 .. p12}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)Lco/bird/android/feature/rider/birdpay/confirmation/e$b;
    .locals 14

    const-string v0, "transactionId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantSiteId"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateTime"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    move-object v1, v0

    move v2, p1

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v11, p10

    move-wide/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;-><init>(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)V

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    iget-boolean v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    iget-boolean v3, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    iget-wide v5, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    iget-wide v5, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    iget-wide v5, p1, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    return-wide v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->j:J

    return-wide v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-boolean v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->a:Z

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->b:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c:Ljava/lang/String;

    iget-wide v3, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->d:J

    iget-wide v5, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e:J

    iget-object v7, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f:Ljava/lang/String;

    iget-object v8, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->g:Lorg/joda/time/DateTime;

    iget-object v9, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h:Ljava/lang/String;

    iget-wide v10, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i:J

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Parameters(isNewPayment="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", transactionId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", merchantSiteId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", preTipAmount="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", amountBilled="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dateTime="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", placardId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tipAmount="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
