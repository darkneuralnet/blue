.class public final Luo6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luo6$a;,
        Luo6$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001d\u0008\u0000\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0008\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006J$\u0010\r\u001a\u00020\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\nH\u0002R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0016\u00a8\u0006 "
    }
    d2 = {
        "Luo6;",
        "",
        "",
        "timeMillis",
        "",
        "dataPoint",
        "",
        "a",
        "c",
        "d",
        "",
        "dataPoints",
        "time",
        "b",
        "",
        "Z",
        "isDataDifferential",
        "()Z",
        "Luo6$a;",
        "Luo6$a;",
        "strategy",
        "",
        "I",
        "minSampleSize",
        "",
        "LPS0;",
        "[LPS0;",
        "samples",
        "e",
        "index",
        "<init>",
        "(ZLuo6$a;)V",
        "ui_release"
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

.field public final b:Luo6$a;

.field public final c:I

.field public final d:[LPS0;

.field public e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Luo6;-><init>(ZLuo6$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLuo6$a;)V
    .locals 2

    const-string v0, "strategy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Luo6;->a:Z

    iput-object p2, p0, Luo6;->b:Luo6$a;

    if-eqz p1, :cond_1

    sget-object p1, Luo6$a;->b:Luo6$a;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Lsq2 not (yet) supported for differential axes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Luo6$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    if-ne p1, p2, :cond_2

    const/4 p2, 0x3

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    iput p2, p0, Luo6;->c:I

    const/16 p1, 0x14

    new-array p2, p1, [LPS0;

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p1, :cond_4

    const/4 v1, 0x0

    aput-object v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    iput-object p2, p0, Luo6;->d:[LPS0;

    return-void
.end method

.method public synthetic constructor <init>(ZLuo6$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Luo6$a;->b:Luo6$a;

    :cond_1
    invoke-direct {p0, p1, p2}, Luo6;-><init>(ZLuo6$a;)V

    return-void
.end method


# virtual methods
.method public final a(JF)V
    .locals 2

    iget v0, p0, Luo6;->e:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x14

    iput v0, p0, Luo6;->e:I

    iget-object v1, p0, Luo6;->d:[LPS0;

    invoke-static {v1, v0, p1, p2, p3}, Lwo6;->b([LPS0;IJF)V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    const/4 v0, 0x2

    :try_start_0
    invoke-static {p2, p1, v0}, Lwo6;->f(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()F
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget v2, p0, Luo6;->e:I

    iget-object v3, p0, Luo6;->d:[LPS0;

    aget-object v3, v3, v2

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    const/4 v5, 0x0

    move-object v6, v3

    :goto_0
    iget-object v7, p0, Luo6;->d:[LPS0;

    aget-object v7, v7, v2

    const/4 v8, 0x1

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, LPS0;->b()J

    move-result-wide v9

    invoke-virtual {v7}, LPS0;->b()J

    move-result-wide v11

    sub-long/2addr v9, v11

    long-to-float v9, v9

    invoke-virtual {v7}, LPS0;->b()J

    move-result-wide v10

    invoke-virtual {v6}, LPS0;->b()J

    move-result-wide v12

    sub-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    long-to-float v6, v10

    const/high16 v10, 0x42c80000    # 100.0f

    cmpl-float v10, v9, v10

    if-gtz v10, :cond_5

    const/high16 v10, 0x42200000    # 40.0f

    cmpl-float v6, v6, v10

    if-lez v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, LPS0;->a()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    neg-float v6, v9

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v6, 0x14

    if-nez v2, :cond_3

    move v2, v6

    :cond_3
    sub-int/2addr v2, v8

    add-int/lit8 v5, v5, 0x1

    if-lt v5, v6, :cond_4

    goto :goto_1

    :cond_4
    move-object v6, v7

    goto :goto_0

    :cond_5
    :goto_1
    iget v2, p0, Luo6;->c:I

    if-lt v5, v2, :cond_8

    iget-object v2, p0, Luo6;->b:Luo6$a;

    sget-object v3, Luo6$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/16 v3, 0x3e8

    if-eq v2, v8, :cond_7

    const/4 v4, 0x2

    if-ne v2, v4, :cond_6

    invoke-virtual {p0, v0, v1}, Luo6;->b(Ljava/util/List;Ljava/util/List;)F

    move-result v0

    goto :goto_2

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    iget-boolean v2, p0, Luo6;->a:Z

    invoke-static {v0, v1, v2}, Lwo6;->a(Ljava/util/List;Ljava/util/List;Z)F

    move-result v0

    :goto_2
    int-to-float v1, v3

    mul-float/2addr v0, v1

    return v0

    :cond_8
    return v4
.end method

.method public final d()V
    .locals 6

    iget-object v0, p0, Luo6;->d:[LPS0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/collections/ArraysKt;->fill$default([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    const/4 v0, 0x0

    iput v0, p0, Luo6;->e:I

    return-void
.end method
