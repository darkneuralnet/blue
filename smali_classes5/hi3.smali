.class public final Lhi3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001d\u0010\u0004\u001a\u00020\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J-\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0007\u00a8\u0006\u001e"
    }
    d2 = {
        "Lhi3;",
        "",
        "LUE2;",
        "x",
        "b",
        "",
        "a",
        "w",
        "h",
        "i",
        "",
        "startDim",
        "f",
        "",
        "tensors",
        "([LUE2;)LUE2;",
        "j",
        "d",
        "",
        "texts",
        "seqLength",
        "e",
        "([Ljava/lang/String;ILUE2;)LUE2;",
        "k",
        "l",
        "c",
        "poolSize",
        "g",
        "<init>",
        "()V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lhi3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhi3;

    invoke-direct {v0}, Lhi3;-><init>()V

    sput-object v0, Lhi3;->a:Lhi3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LUE2;LUE2;)V
    .locals 11
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "b"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LUE2;->b(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, LUE2;->b(I)I

    move-result v3

    const/4 v4, 0x2

    invoke-virtual {p0, v4}, LUE2;->b(I)I

    move-result v4

    invoke-virtual {p0}, LUE2;->a()[F

    move-result-object p0

    invoke-virtual {p1}, LUE2;->a()[F

    move-result-object p1

    move v5, v1

    :goto_0
    if-ge v5, v2, :cond_3

    move v6, v1

    :goto_1
    if-ge v6, v3, :cond_2

    move v7, v1

    :goto_2
    if-ge v7, v4, :cond_1

    mul-int v8, v5, v3

    mul-int/2addr v8, v4

    mul-int v9, v6, v4

    add-int/2addr v8, v9

    add-int/2addr v8, v7

    aget v9, p0, v8

    aget v10, p1, v7

    add-float/2addr v9, v10

    aput v9, p0, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final b([LUE2;)LUE2;
    .locals 15
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "tensors"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    aget-object v3, p0, v1

    invoke-virtual {v3, v1}, LUE2;->b(I)I

    move-result v3

    array-length v4, p0

    move v5, v1

    move v6, v5

    :goto_0
    const/4 v7, 0x1

    if-ge v5, v4, :cond_1

    aget-object v8, p0, v5

    invoke-virtual {v8, v7}, LUE2;->b(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    new-instance v4, LUE2;

    const/4 v5, 0x2

    new-array v5, v5, [I

    aput v3, v5, v1

    aput v6, v5, v7

    invoke-direct {v4, v5}, LUE2;-><init>([I)V

    invoke-virtual {v4}, LUE2;->a()[F

    move-result-object v5

    move v8, v1

    :goto_1
    if-ge v8, v3, :cond_3

    mul-int v9, v8, v6

    array-length v10, p0

    move v11, v1

    :goto_2
    if-ge v11, v10, :cond_2

    aget-object v12, p0, v11

    invoke-virtual {v12}, LUE2;->a()[F

    move-result-object v12

    aget-object v13, p0, v11

    invoke-virtual {v13, v7}, LUE2;->b(I)I

    move-result v13

    mul-int v14, v8, v13

    invoke-static {v12, v14, v5, v9, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v9, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    return-object v4

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final c(LUE2;LUE2;)LUE2;
    .locals 19
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-class v2, Lhi3;

    invoke-static {v2}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    return-object v4

    :cond_0
    :try_start_0
    const-string v3, "x"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "w"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, LUE2;->b(I)I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v0, v6}, LUE2;->b(I)I

    move-result v7

    const/4 v8, 0x2

    invoke-virtual {v0, v8}, LUE2;->b(I)I

    move-result v9

    invoke-virtual {v1, v3}, LUE2;->b(I)I

    move-result v10

    sub-int v11, v7, v10

    add-int/2addr v11, v6

    invoke-virtual {v1, v8}, LUE2;->b(I)I

    move-result v12

    new-instance v13, LUE2;

    const/4 v14, 0x3

    new-array v14, v14, [I

    aput v5, v14, v3

    aput v11, v14, v6

    aput v12, v14, v8

    invoke-direct {v13, v14}, LUE2;-><init>([I)V

    invoke-virtual/range {p0 .. p0}, LUE2;->a()[F

    move-result-object v0

    invoke-virtual {v13}, LUE2;->a()[F

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LUE2;->a()[F

    move-result-object v1

    move v8, v3

    :goto_0
    if-ge v8, v5, :cond_5

    move v14, v3

    :goto_1
    if-ge v14, v12, :cond_4

    move v15, v3

    :goto_2
    if-ge v15, v11, :cond_3

    const/16 v16, 0x0

    :goto_3
    if-ge v3, v10, :cond_2

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v9, :cond_1

    mul-int v17, v7, v9

    mul-int v17, v17, v8

    add-int v18, v3, v15

    mul-int v18, v18, v9

    add-int v17, v17, v18

    add-int v17, v17, v4

    aget v17, v0, v17

    mul-int v18, v3, v9

    add-int v18, v18, v4

    mul-int v18, v18, v12

    add-int v18, v18, v14

    aget v18, v1, v18

    mul-float v17, v17, v18

    add-float v16, v16, v17

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    goto :goto_3

    :cond_2
    mul-int v3, v11, v12

    mul-int/2addr v3, v8

    mul-int v4, v15, v12

    add-int/2addr v3, v4

    add-int/2addr v3, v14

    aput v16, v6, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_2

    :cond_3
    add-int/lit8 v14, v14, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_4
    add-int/lit8 v8, v8, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_0

    :cond_5
    return-object v13

    :catchall_0
    move-exception v0

    invoke-static {v0, v2}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public static final d(LUE2;LUE2;LUE2;)LUE2;
    .locals 10
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "w"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "b"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LUE2;->b(I)I

    move-result v3

    invoke-virtual {p2, v1}, LUE2;->b(I)I

    move-result v4

    invoke-static {p0, p1}, Lhi3;->h(LUE2;LUE2;)LUE2;

    move-result-object p0

    invoke-virtual {p2}, LUE2;->a()[F

    move-result-object p1

    invoke-virtual {p0}, LUE2;->a()[F

    move-result-object p2

    move v5, v1

    :goto_0
    if-ge v5, v3, :cond_2

    move v6, v1

    :goto_1
    if-ge v6, v4, :cond_1

    mul-int v7, v5, v4

    add-int/2addr v7, v6

    aget v8, p2, v7

    aget v9, p1, v6

    add-float/2addr v8, v9

    aput v8, p2, v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final e([Ljava/lang/String;ILUE2;)LUE2;
    .locals 13
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "texts"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "w"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p0

    const/4 v3, 0x1

    invoke-virtual {p2, v3}, LUE2;->b(I)I

    move-result v4

    new-instance v5, LUE2;

    const/4 v6, 0x3

    new-array v6, v6, [I

    const/4 v7, 0x0

    aput v1, v6, v7

    aput p1, v6, v3

    const/4 v3, 0x2

    aput v4, v6, v3

    invoke-direct {v5, v6}, LUE2;-><init>([I)V

    invoke-virtual {v5}, LUE2;->a()[F

    move-result-object v3

    invoke-virtual {p2}, LUE2;->a()[F

    move-result-object p2

    move v6, v7

    :goto_0
    if-ge v6, v1, :cond_2

    sget-object v8, LMi6;->a:LMi6;

    aget-object v9, p0, v6

    invoke-virtual {v8, v9, p1}, LMi6;->d(Ljava/lang/String;I)[I

    move-result-object v8

    move v9, v7

    :goto_1
    if-ge v9, p1, :cond_1

    aget v10, v8, v9

    mul-int/2addr v10, v4

    mul-int v11, v4, p1

    mul-int/2addr v11, v6

    mul-int v12, v4, v9

    add-int/2addr v11, v12

    invoke-static {p2, v10, v3, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    return-object v5

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final f(LUE2;I)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LUE2;->c()I

    move-result v1

    if-lt p1, v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, LUE2;->c()I

    move-result v1

    const/4 v2, 0x1

    move v3, p1

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, LUE2;->b(I)I

    move-result v4

    mul-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [I

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p1, :cond_3

    invoke-virtual {p0, v3}, LUE2;->b(I)I

    move-result v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    aput v2, v1, p1

    invoke-virtual {p0, v1}, LUE2;->d([I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(LUE2;I)LUE2;
    .locals 18
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-class v2, Lhi3;

    invoke-static {v2}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    return-object v4

    :cond_0
    :try_start_0
    const-string v3, "x"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, LUE2;->b(I)I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v0, v6}, LUE2;->b(I)I

    move-result v7

    const/4 v8, 0x2

    invoke-virtual {v0, v8}, LUE2;->b(I)I

    move-result v9

    sub-int v10, v7, v1

    add-int/2addr v10, v6

    new-instance v11, LUE2;

    const/4 v12, 0x3

    new-array v12, v12, [I

    aput v5, v12, v3

    aput v10, v12, v6

    aput v9, v12, v8

    invoke-direct {v11, v12}, LUE2;-><init>([I)V

    invoke-virtual/range {p0 .. p0}, LUE2;->a()[F

    move-result-object v0

    invoke-virtual {v11}, LUE2;->a()[F

    move-result-object v6

    move v8, v3

    :goto_0
    if-ge v8, v5, :cond_4

    move v12, v3

    :goto_1
    if-ge v12, v9, :cond_3

    move v13, v3

    :goto_2
    if-ge v13, v10, :cond_2

    mul-int v14, v8, v10

    mul-int/2addr v14, v9

    mul-int v15, v13, v9

    add-int/2addr v14, v15

    add-int/2addr v14, v12

    mul-int v16, v8, v7

    mul-int v16, v16, v9

    add-int v16, v16, v15

    add-int v16, v16, v12

    const/4 v15, 0x1

    aput v15, v6, v14

    move v15, v3

    :goto_3
    if-ge v15, v1, :cond_1

    aget v3, v6, v14

    mul-int v17, v15, v9

    add-int v17, v16, v17

    aget v4, v0, v17

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v6, v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_3

    :cond_1
    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    add-int/lit8 v12, v12, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    add-int/lit8 v8, v8, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_0

    :cond_4
    return-object v11

    :catchall_0
    move-exception v0

    invoke-static {v0, v2}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public static final h(LUE2;LUE2;)LUE2;
    .locals 17
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-class v2, Lhi3;

    invoke-static {v2}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    return-object v4

    :cond_0
    :try_start_0
    const-string v3, "x"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "w"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, LUE2;->b(I)I

    move-result v5

    invoke-virtual {v1, v3}, LUE2;->b(I)I

    move-result v6

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, LUE2;->b(I)I

    move-result v8

    new-instance v9, LUE2;

    const/4 v10, 0x2

    new-array v10, v10, [I

    aput v5, v10, v3

    aput v8, v10, v7

    invoke-direct {v9, v10}, LUE2;-><init>([I)V

    invoke-virtual/range {p0 .. p0}, LUE2;->a()[F

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LUE2;->a()[F

    move-result-object v1

    invoke-virtual {v9}, LUE2;->a()[F

    move-result-object v7

    move v10, v3

    :goto_0
    if-ge v10, v5, :cond_3

    move v11, v3

    :goto_1
    if-ge v11, v8, :cond_2

    mul-int v12, v10, v8

    add-int/2addr v12, v11

    const/4 v13, 0x0

    aput v13, v7, v12

    move v13, v3

    :goto_2
    if-ge v13, v6, :cond_1

    aget v14, v7, v12

    mul-int v15, v10, v6

    add-int/2addr v15, v13

    aget v15, v0, v15

    mul-int v16, v13, v8

    add-int v16, v16, v11

    aget v16, v1, v16

    mul-float v15, v15, v16

    add-float/2addr v14, v15

    aput v14, v7, v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    return-object v9

    :catchall_0
    move-exception v0

    invoke-static {v0, v2}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v4
.end method

.method public static final i(LUE2;)V
    .locals 6
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LUE2;->a()[F

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget v4, p0, v3

    int-to-float v5, v2

    cmpg-float v4, v4, v5

    if-gez v4, :cond_1

    const/4 v4, 0x0

    aput v4, p0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final j(LUE2;)V
    .locals 11
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LUE2;->b(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, LUE2;->b(I)I

    move-result v3

    invoke-virtual {p0}, LUE2;->a()[F

    move-result-object p0

    :goto_0
    if-ge v1, v2, :cond_5

    mul-int v4, v1, v3

    add-int v5, v4, v3

    const/4 v6, 0x1

    move v7, v4

    :goto_1
    if-ge v7, v5, :cond_2

    aget v8, p0, v7

    cmpl-float v9, v8, v6

    if-lez v9, :cond_1

    move v6, v8

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    move v8, v4

    :goto_2
    if-ge v8, v5, :cond_3

    aget v9, p0, v8

    sub-float/2addr v9, v6

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    move-result-wide v9

    double-to-float v9, v9

    aput v9, p0, v8

    add-float/2addr v7, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-ge v4, v5, :cond_4

    aget v6, p0, v4

    div-float/2addr v6, v7

    aput v6, p0, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final k(LUE2;)LUE2;
    .locals 11
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LUE2;->b(I)I

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {p0, v4}, LUE2;->b(I)I

    move-result v5

    new-instance v6, LUE2;

    const/4 v7, 0x2

    new-array v7, v7, [I

    aput v5, v7, v1

    aput v3, v7, v4

    invoke-direct {v6, v7}, LUE2;-><init>([I)V

    invoke-virtual {p0}, LUE2;->a()[F

    move-result-object p0

    invoke-virtual {v6}, LUE2;->a()[F

    move-result-object v4

    move v7, v1

    :goto_0
    if-ge v7, v3, :cond_2

    move v8, v1

    :goto_1
    if-ge v8, v5, :cond_1

    mul-int v9, v8, v3

    add-int/2addr v9, v7

    mul-int v10, v7, v5

    add-int/2addr v10, v8

    aget v10, p0, v10

    aput v10, v4, v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    return-object v6

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final l(LUE2;)LUE2;
    .locals 14
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lhi3;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "x"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LUE2;->b(I)I

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {p0, v4}, LUE2;->b(I)I

    move-result v5

    const/4 v6, 0x2

    invoke-virtual {p0, v6}, LUE2;->b(I)I

    move-result v7

    new-instance v8, LUE2;

    const/4 v9, 0x3

    new-array v9, v9, [I

    aput v7, v9, v1

    aput v5, v9, v4

    aput v3, v9, v6

    invoke-direct {v8, v9}, LUE2;-><init>([I)V

    invoke-virtual {p0}, LUE2;->a()[F

    move-result-object p0

    invoke-virtual {v8}, LUE2;->a()[F

    move-result-object v4

    move v6, v1

    :goto_0
    if-ge v6, v3, :cond_3

    move v9, v1

    :goto_1
    if-ge v9, v5, :cond_2

    move v10, v1

    :goto_2
    if-ge v10, v7, :cond_1

    mul-int v11, v10, v3

    mul-int/2addr v11, v5

    mul-int v12, v9, v3

    add-int/2addr v11, v12

    add-int/2addr v11, v6

    mul-int v12, v6, v5

    mul-int/2addr v12, v7

    mul-int v13, v9, v7

    add-int/2addr v12, v13

    add-int/2addr v12, v10

    aget v12, p0, v12

    aput v12, v4, v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    return-object v8

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method
