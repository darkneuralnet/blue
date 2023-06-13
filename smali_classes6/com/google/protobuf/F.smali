.class public final Lcom/google/protobuf/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJm5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LJm5<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final r:[I

.field public static final s:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/protobuf/D;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:[I

.field public final k:I

.field public final l:I

.field public final m:LY73;

.field public final n:Lcom/google/protobuf/x;

.field public final o:Lcom/google/protobuf/L;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/L<",
            "**>;"
        }
    .end annotation
.end field

.field public final p:Lcom/google/protobuf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l<",
            "*>;"
        }
    .end annotation
.end field

.field public final q:Lcom/google/protobuf/B;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/protobuf/F;->r:[I

    invoke-static {}, Lye6;->D()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/protobuf/D;ZZ[IIILY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[",
            "Ljava/lang/Object;",
            "II",
            "Lcom/google/protobuf/D;",
            "ZZ[III",
            "LY73;",
            "Lcom/google/protobuf/x;",
            "Lcom/google/protobuf/L<",
            "**>;",
            "Lcom/google/protobuf/l<",
            "*>;",
            "Lcom/google/protobuf/B;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/F;->a:[I

    iput-object p2, p0, Lcom/google/protobuf/F;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/protobuf/F;->c:I

    iput p4, p0, Lcom/google/protobuf/F;->d:I

    instance-of p1, p5, Lcom/google/protobuf/r;

    iput-boolean p1, p0, Lcom/google/protobuf/F;->g:Z

    iput-boolean p6, p0, Lcom/google/protobuf/F;->h:Z

    if-eqz p14, :cond_0

    invoke-virtual {p14, p5}, Lcom/google/protobuf/l;->e(Lcom/google/protobuf/D;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/google/protobuf/F;->f:Z

    iput-boolean p7, p0, Lcom/google/protobuf/F;->i:Z

    iput-object p8, p0, Lcom/google/protobuf/F;->j:[I

    iput p9, p0, Lcom/google/protobuf/F;->k:I

    iput p10, p0, Lcom/google/protobuf/F;->l:I

    iput-object p11, p0, Lcom/google/protobuf/F;->m:LY73;

    iput-object p12, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    iput-object p13, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    iput-object p14, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    iput-object p5, p0, Lcom/google/protobuf/F;->e:Lcom/google/protobuf/D;

    iput-object p15, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    return-void
.end method

.method public static B(Ljava/lang/Object;ILJm5;)Z
    .locals 2

    invoke-static {p1}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, LJm5;->f(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static E(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/protobuf/r;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/protobuf/r;

    invoke-virtual {p0}, Lcom/google/protobuf/r;->H()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static H(I)Z
    .locals 1

    const/high16 v0, 0x10000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static I(Ljava/lang/Object;J)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static J(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static R(Ljava/lang/Class;LqT2;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LqT2;",
            "LY73;",
            "Lcom/google/protobuf/x;",
            "Lcom/google/protobuf/L<",
            "**>;",
            "Lcom/google/protobuf/l<",
            "*>;",
            "Lcom/google/protobuf/B;",
            ")",
            "Lcom/google/protobuf/F<",
            "TT;>;"
        }
    .end annotation

    instance-of p0, p1, Lrn4;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, Lrn4;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/protobuf/F;->T(Lrn4;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v0, p1

    check-cast v0, LPS5;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/protobuf/F;->S(LPS5;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;

    move-result-object p0

    return-object p0
.end method

.method public static S(LPS5;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LPS5;",
            "LY73;",
            "Lcom/google/protobuf/x;",
            "Lcom/google/protobuf/L<",
            "**>;",
            "Lcom/google/protobuf/l<",
            "*>;",
            "Lcom/google/protobuf/B;",
            ")",
            "Lcom/google/protobuf/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, LPS5;->c()LI94;

    move-result-object v0

    sget-object v1, LI94;->c:LI94;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    move v9, v0

    goto :goto_0

    :cond_0
    move v9, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, LPS5;->e()[Lcom/google/protobuf/n;

    move-result-object v0

    array-length v1, v0

    const/4 v3, 0x0

    if-nez v1, :cond_4

    const/4 v6, 0x0

    const/4 v7, 0x0

    array-length v1, v0

    mul-int/lit8 v4, v1, 0x3

    new-array v4, v4, [I

    mul-int/lit8 v1, v1, 0x2

    new-array v5, v1, [Ljava/lang/Object;

    array-length v1, v0

    if-gtz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, LPS5;->d()[I

    move-result-object v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/google/protobuf/F;->r:[I

    :cond_1
    array-length v8, v0

    if-gtz v8, :cond_2

    sget-object v0, Lcom/google/protobuf/F;->r:[I

    sget-object v3, Lcom/google/protobuf/F;->r:[I

    array-length v8, v1

    array-length v10, v0

    add-int/2addr v8, v10

    array-length v10, v3

    add-int/2addr v8, v10

    new-array v11, v8, [I

    array-length v8, v1

    invoke-static {v1, v2, v11, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v8, v1

    array-length v10, v0

    invoke-static {v0, v2, v11, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v8, v1

    array-length v10, v0

    add-int/2addr v8, v10

    array-length v10, v3

    invoke-static {v3, v2, v11, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Lcom/google/protobuf/F;

    invoke-virtual/range {p0 .. p0}, LPS5;->b()Lcom/google/protobuf/D;

    move-result-object v8

    const/4 v10, 0x1

    array-length v12, v1

    array-length v1, v1

    array-length v0, v0

    add-int v13, v1, v0

    move-object v3, v2

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    invoke-direct/range {v3 .. v18}, Lcom/google/protobuf/F;-><init>([I[Ljava/lang/Object;IILcom/google/protobuf/D;ZZ[IIILY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)V

    return-object v2

    :cond_2
    aget-object v0, v0, v2

    throw v3

    :cond_3
    aget-object v0, v0, v2

    throw v3

    :cond_4
    aget-object v0, v0, v2

    throw v3
.end method

.method public static T(Lrn4;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lrn4;",
            "LY73;",
            "Lcom/google/protobuf/x;",
            "Lcom/google/protobuf/L<",
            "**>;",
            "Lcom/google/protobuf/l<",
            "*>;",
            "Lcom/google/protobuf/B;",
            ")",
            "Lcom/google/protobuf/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lrn4;->c()LI94;

    move-result-object v0

    sget-object v1, LI94;->c:LI94;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lrn4;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    if-lt v4, v5, :cond_1

    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    move v4, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    :cond_2
    add-int/lit8 v4, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_4

    and-int/lit16 v6, v6, 0x1fff

    const/16 v8, 0xd

    :goto_2
    add-int/lit8 v9, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_3

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v8

    or-int/2addr v6, v4

    add-int/lit8 v8, v8, 0xd

    move v4, v9

    goto :goto_2

    :cond_3
    shl-int/2addr v4, v8

    or-int/2addr v6, v4

    move v4, v9

    :cond_4
    if-nez v6, :cond_5

    sget-object v6, Lcom/google/protobuf/F;->r:[I

    move v8, v2

    move v9, v8

    move v11, v9

    move v12, v11

    move v14, v12

    move/from16 v16, v14

    move-object v13, v6

    move/from16 v6, v16

    goto/16 :goto_b

    :cond_5
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_7

    and-int/lit16 v4, v4, 0x1fff

    const/16 v8, 0xd

    :goto_3
    add-int/lit8 v9, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_6

    and-int/lit16 v6, v6, 0x1fff

    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    add-int/lit8 v8, v8, 0xd

    move v6, v9

    goto :goto_3

    :cond_6
    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    move v6, v9

    :cond_7
    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_9

    and-int/lit16 v6, v6, 0x1fff

    const/16 v9, 0xd

    :goto_4
    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_8

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v11

    goto :goto_4

    :cond_8
    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    move v8, v11

    :cond_9
    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_b

    and-int/lit16 v8, v8, 0x1fff

    const/16 v11, 0xd

    :goto_5
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_5

    :cond_a
    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    move v9, v12

    :cond_b
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_d

    and-int/lit16 v9, v9, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_c

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_6

    :cond_c
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_d
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_f

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_e

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_e
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_f
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_11

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_10

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_10
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_11
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_13

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_12

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_12
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_13
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_15

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_a
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_14

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_a

    :cond_14
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_15
    add-int v16, v14, v12

    add-int v13, v16, v13

    new-array v13, v13, [I

    mul-int/lit8 v16, v4, 0x2

    add-int v16, v16, v6

    move v6, v4

    move v4, v15

    :goto_b
    sget-object v15, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, Lrn4;->d()[Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lrn4;->b()Lcom/google/protobuf/D;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    mul-int/lit8 v7, v11, 0x3

    new-array v7, v7, [I

    mul-int/lit8 v11, v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    add-int v20, v14, v12

    move/from16 v22, v14

    move/from16 v23, v20

    const/4 v12, 0x0

    const/16 v21, 0x0

    :goto_c
    if-ge v4, v1, :cond_33

    add-int/lit8 v24, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_17

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v3, v24

    const/16 v24, 0xd

    :goto_d
    add-int/lit8 v26, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_16

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v24

    or-int/2addr v4, v3

    add-int/lit8 v24, v24, 0xd

    move/from16 v3, v26

    goto :goto_d

    :cond_16
    shl-int v3, v3, v24

    or-int/2addr v4, v3

    move/from16 v3, v26

    goto :goto_e

    :cond_17
    move/from16 v3, v24

    :goto_e
    add-int/lit8 v24, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_19

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v5, v24

    const/16 v24, 0xd

    :goto_f
    add-int/lit8 v27, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v28, v1

    const v1, 0xd800

    if-lt v5, v1, :cond_18

    and-int/lit16 v1, v5, 0x1fff

    shl-int v1, v1, v24

    or-int/2addr v3, v1

    add-int/lit8 v24, v24, 0xd

    move/from16 v5, v27

    move/from16 v1, v28

    goto :goto_f

    :cond_18
    shl-int v1, v5, v24

    or-int/2addr v3, v1

    move/from16 v1, v27

    goto :goto_10

    :cond_19
    move/from16 v28, v1

    move/from16 v1, v24

    :goto_10
    and-int/lit16 v5, v3, 0xff

    move/from16 v24, v14

    and-int/lit16 v14, v3, 0x400

    if-eqz v14, :cond_1a

    add-int/lit8 v14, v12, 0x1

    aput v21, v13, v12

    move v12, v14

    :cond_1a
    const/16 v14, 0x33

    move/from16 v30, v12

    if-lt v5, v14, :cond_22

    add-int/lit8 v14, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v12, 0xd800

    if-lt v1, v12, :cond_1c

    and-int/lit16 v1, v1, 0x1fff

    const/16 v32, 0xd

    :goto_11
    add-int/lit8 v33, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v12, :cond_1b

    and-int/lit16 v12, v14, 0x1fff

    shl-int v12, v12, v32

    or-int/2addr v1, v12

    add-int/lit8 v32, v32, 0xd

    move/from16 v14, v33

    const v12, 0xd800

    goto :goto_11

    :cond_1b
    shl-int v12, v14, v32

    or-int/2addr v1, v12

    move/from16 v14, v33

    :cond_1c
    add-int/lit8 v12, v5, -0x33

    move/from16 v32, v14

    const/16 v14, 0x9

    if-eq v12, v14, :cond_1e

    const/16 v14, 0x11

    if-ne v12, v14, :cond_1d

    goto :goto_12

    :cond_1d
    const/16 v14, 0xc

    if-ne v12, v14, :cond_1f

    if-nez v10, :cond_1f

    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    const/4 v14, 0x1

    add-int/2addr v12, v14

    add-int/lit8 v14, v16, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    goto :goto_13

    :cond_1e
    :goto_12
    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    const/4 v14, 0x1

    add-int/2addr v12, v14

    add-int/lit8 v14, v16, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    :goto_13
    move/from16 v16, v14

    :cond_1f
    mul-int/lit8 v1, v1, 0x2

    aget-object v12, v17, v1

    instance-of v14, v12, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_20

    check-cast v12, Ljava/lang/reflect/Field;

    goto :goto_14

    :cond_20
    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Lcom/google/protobuf/F;->h0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v17, v1

    :goto_14
    move v14, v8

    move/from16 v33, v9

    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    add-int/lit8 v1, v1, 0x1

    aget-object v9, v17, v1

    instance-of v12, v9, Ljava/lang/reflect/Field;

    if-eqz v12, :cond_21

    check-cast v9, Ljava/lang/reflect/Field;

    goto :goto_15

    :cond_21
    check-cast v9, Ljava/lang/String;

    invoke-static {v2, v9}, Lcom/google/protobuf/F;->h0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    aput-object v9, v17, v1

    :goto_15
    move v1, v8

    invoke-virtual {v15, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    move-object/from16 v31, v0

    move v9, v8

    move v0, v10

    move/from16 v29, v32

    const/16 v25, 0x1

    move v8, v1

    const/4 v1, 0x0

    goto/16 :goto_21

    :cond_22
    move v14, v8

    move/from16 v33, v9

    add-int/lit8 v8, v16, 0x1

    aget-object v9, v17, v16

    check-cast v9, Ljava/lang/String;

    invoke-static {v2, v9}, Lcom/google/protobuf/F;->h0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    const/16 v12, 0x9

    if-eq v5, v12, :cond_2a

    const/16 v12, 0x11

    if-ne v5, v12, :cond_23

    goto :goto_19

    :cond_23
    const/16 v12, 0x1b

    if-eq v5, v12, :cond_29

    const/16 v12, 0x31

    if-ne v5, v12, :cond_24

    goto :goto_17

    :cond_24
    const/16 v12, 0xc

    if-eq v5, v12, :cond_28

    const/16 v12, 0x1e

    if-eq v5, v12, :cond_28

    const/16 v12, 0x2c

    if-ne v5, v12, :cond_25

    goto :goto_16

    :cond_25
    const/16 v12, 0x32

    if-ne v5, v12, :cond_26

    add-int/lit8 v12, v22, 0x1

    aput v21, v13, v22

    div-int/lit8 v22, v21, 0x3

    mul-int/lit8 v22, v22, 0x2

    add-int/lit8 v27, v8, 0x1

    aget-object v8, v17, v8

    aput-object v8, v11, v22

    and-int/lit16 v8, v3, 0x800

    if-eqz v8, :cond_27

    add-int/lit8 v22, v22, 0x1

    add-int/lit8 v8, v27, 0x1

    aget-object v27, v17, v27

    aput-object v27, v11, v22

    move/from16 v22, v12

    :cond_26
    const/16 v25, 0x1

    goto :goto_1a

    :cond_27
    move/from16 v22, v12

    move/from16 v12, v27

    const/16 v25, 0x1

    goto :goto_1b

    :cond_28
    :goto_16
    if-nez v10, :cond_26

    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v27, v8, 0x1

    aget-object v8, v17, v8

    aput-object v8, v11, v12

    goto :goto_18

    :cond_29
    :goto_17
    const/16 v25, 0x1

    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v27, v8, 0x1

    aget-object v8, v17, v8

    aput-object v8, v11, v12

    :goto_18
    move/from16 v12, v27

    goto :goto_1b

    :cond_2a
    :goto_19
    const/16 v25, 0x1

    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v27

    aput-object v27, v11, v12

    :goto_1a
    move v12, v8

    :goto_1b
    invoke-virtual {v15, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    and-int/lit16 v9, v3, 0x1000

    move/from16 v27, v12

    const/16 v12, 0x1000

    if-ne v9, v12, :cond_2b

    move/from16 v9, v25

    goto :goto_1c

    :cond_2b
    const/4 v9, 0x0

    :goto_1c
    if-eqz v9, :cond_2f

    const/16 v9, 0x11

    if-gt v5, v9, :cond_2f

    add-int/lit8 v9, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v12, 0xd800

    if-lt v1, v12, :cond_2d

    and-int/lit16 v1, v1, 0x1fff

    const/16 v26, 0xd

    :goto_1d
    add-int/lit8 v29, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v12, :cond_2c

    and-int/lit16 v9, v9, 0x1fff

    shl-int v9, v9, v26

    or-int/2addr v1, v9

    add-int/lit8 v26, v26, 0xd

    move/from16 v9, v29

    goto :goto_1d

    :cond_2c
    shl-int v9, v9, v26

    or-int/2addr v1, v9

    goto :goto_1e

    :cond_2d
    move/from16 v29, v9

    :goto_1e
    mul-int/lit8 v9, v6, 0x2

    div-int/lit8 v26, v1, 0x20

    add-int v9, v9, v26

    aget-object v12, v17, v9

    move-object/from16 v31, v0

    instance-of v0, v12, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2e

    check-cast v12, Ljava/lang/reflect/Field;

    goto :goto_1f

    :cond_2e
    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Lcom/google/protobuf/F;->h0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v17, v9

    :goto_1f
    move v0, v10

    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v9

    long-to-int v9, v9

    rem-int/lit8 v1, v1, 0x20

    goto :goto_20

    :cond_2f
    move-object/from16 v31, v0

    move v0, v10

    const v9, 0xfffff

    move/from16 v29, v1

    const/4 v1, 0x0

    :goto_20
    const/16 v10, 0x12

    if-lt v5, v10, :cond_30

    const/16 v10, 0x31

    if-gt v5, v10, :cond_30

    add-int/lit8 v10, v23, 0x1

    aput v8, v13, v23

    move/from16 v23, v10

    :cond_30
    move/from16 v16, v27

    :goto_21
    add-int/lit8 v10, v21, 0x1

    aput v4, v7, v21

    add-int/lit8 v4, v10, 0x1

    and-int/lit16 v12, v3, 0x200

    if-eqz v12, :cond_31

    const/high16 v12, 0x20000000

    goto :goto_22

    :cond_31
    const/4 v12, 0x0

    :goto_22
    and-int/lit16 v3, v3, 0x100

    if-eqz v3, :cond_32

    const/high16 v3, 0x10000000

    goto :goto_23

    :cond_32
    const/4 v3, 0x0

    :goto_23
    or-int/2addr v3, v12

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v3, v5

    or-int/2addr v3, v8

    aput v3, v7, v10

    add-int/lit8 v21, v4, 0x1

    shl-int/lit8 v1, v1, 0x14

    or-int/2addr v1, v9

    aput v1, v7, v4

    move v10, v0

    move v8, v14

    move/from16 v14, v24

    move/from16 v1, v28

    move/from16 v4, v29

    move/from16 v12, v30

    move-object/from16 v0, v31

    move/from16 v9, v33

    const v5, 0xd800

    goto/16 :goto_c

    :cond_33
    move/from16 v33, v9

    move v0, v10

    move/from16 v24, v14

    move v14, v8

    new-instance v1, Lcom/google/protobuf/F;

    invoke-virtual/range {p0 .. p0}, Lrn4;->b()Lcom/google/protobuf/D;

    move-result-object v9

    const/4 v2, 0x0

    move-object v4, v1

    move-object v5, v7

    move-object v6, v11

    move v7, v14

    move/from16 v8, v33

    move v11, v2

    move-object v12, v13

    move/from16 v13, v24

    move/from16 v14, v20

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    invoke-direct/range {v4 .. v19}, Lcom/google/protobuf/F;-><init>([I[Ljava/lang/Object;IILcom/google/protobuf/D;ZZ[IIILY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)V

    return-object v1
.end method

.method public static V(I)J
    .locals 2

    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static W(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static X(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static Y(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static Z(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static a0(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static h0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static k(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->r(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static l(Ljava/lang/Object;)V
    .locals 3

    invoke-static {p0}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mutating immutable message: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static m(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->x(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static n0(I)I
    .locals 1

    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static q(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->y(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method public static x(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static y(I)Z
    .locals 1

    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final A(Ljava/lang/Object;IIII)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;IIII)Z"
        }
    .end annotation

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final C(Ljava/lang/Object;II)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "II)Z"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object p2

    const/4 p3, 0x0

    move v1, p3

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, LJm5;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return p3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final D(Ljava/lang/Object;II)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/protobuf/B;->g(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->s(I)Ljava/lang/Object;

    move-result-object p2

    iget-object p3, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {p3, p2}, Lcom/google/protobuf/B;->a(Ljava/lang/Object;)Lcom/google/protobuf/z$a;

    move-result-object p2

    iget-object p2, p2, Lcom/google/protobuf/z$a;->c:Lcom/google/protobuf/P$b;

    invoke-virtual {p2}, Lcom/google/protobuf/P$b;->b()Lcom/google/protobuf/P$c;

    move-result-object p2

    sget-object p3, Lcom/google/protobuf/P$c;->k:Lcom/google/protobuf/P$c;

    if-eq p2, p3, :cond_1

    return v0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_3

    invoke-static {}, LL94;->a()LL94;

    move-result-object p2

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, LL94;->c(Ljava/lang/Class;)LJm5;

    move-result-object p2

    :cond_3
    invoke-interface {p2, p3}, LJm5;->f(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_4
    return v0
.end method

.method public final F(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->c0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final G(Ljava/lang/Object;II)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->c0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final K(Lcom/google/protobuf/L;Lcom/google/protobuf/l;Ljava/lang/Object;Lcom/google/protobuf/I;Lcom/google/protobuf/k;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            "ET::",
            "Lcom/google/protobuf/o$b<",
            "TET;>;>(",
            "Lcom/google/protobuf/L<",
            "TUT;TUB;>;",
            "Lcom/google/protobuf/l<",
            "TET;>;TT;",
            "Lcom/google/protobuf/I;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v7, p1

    move-object/from16 v15, p3

    move-object/from16 v0, p4

    move-object/from16 v6, p5

    const/16 v17, 0x0

    move-object/from16 v5, v17

    move-object v9, v5

    :goto_0
    :try_start_0
    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->n()I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/google/protobuf/F;->b0(I)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    if-gez v3, :cond_b

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_2

    iget v0, v8, Lcom/google/protobuf/F;->k:I

    move-object v4, v5

    :goto_1
    iget v1, v8, Lcom/google/protobuf/F;->l:I

    if-ge v0, v1, :cond_0

    iget-object v1, v8, Lcom/google/protobuf/F;->j:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    if-eqz v4, :cond_1

    invoke-virtual {v7, v15, v4}, Lcom/google/protobuf/L;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    :try_start_1
    iget-boolean v1, v8, Lcom/google/protobuf/F;->f:Z

    if-nez v1, :cond_3

    move-object/from16 v4, p2

    move-object/from16 v12, v17

    goto :goto_2

    :cond_3
    iget-object v1, v8, Lcom/google/protobuf/F;->e:Lcom/google/protobuf/D;

    move-object/from16 v4, p2

    invoke-virtual {v4, v6, v1, v2}, Lcom/google/protobuf/l;->b(Lcom/google/protobuf/k;Lcom/google/protobuf/D;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v12, v1

    :goto_2
    if-eqz v12, :cond_5

    if-nez v9, :cond_4

    :try_start_2
    invoke-virtual/range {p2 .. p3}, Lcom/google/protobuf/l;->d(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_16

    :cond_4
    move-object v1, v9

    :goto_3
    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v13, p5

    move-object v14, v1

    move-object v3, v15

    move-object v15, v5

    move-object/from16 v16, p1

    :try_start_3
    invoke-virtual/range {v9 .. v16}, Lcom/google/protobuf/l;->g(Ljava/lang/Object;Lcom/google/protobuf/I;Ljava/lang/Object;Lcom/google/protobuf/k;Lcom/google/protobuf/o;Ljava/lang/Object;Lcom/google/protobuf/L;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v1

    :goto_4
    move-object v15, v3

    goto :goto_0

    :cond_5
    move-object v3, v15

    invoke-virtual {v7, v0}, Lcom/google/protobuf/L;->q(Lcom/google/protobuf/I;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->q()Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_5
    goto :goto_4

    :cond_6
    if-nez v5, :cond_7

    invoke-virtual {v7, v3}, Lcom/google/protobuf/L;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    :cond_7
    invoke-virtual {v7, v5, v0}, Lcom/google/protobuf/L;->m(Ljava/lang/Object;Lcom/google/protobuf/I;)Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    iget v0, v8, Lcom/google/protobuf/F;->k:I

    move-object v4, v5

    :goto_6
    iget v1, v8, Lcom/google/protobuf/F;->l:I

    if-ge v0, v1, :cond_9

    iget-object v1, v8, Lcom/google/protobuf/F;->j:[I

    aget v5, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object v10, v3

    move v3, v5

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    move-object v3, v10

    goto :goto_6

    :cond_9
    move-object v10, v3

    if-eqz v4, :cond_a

    invoke-virtual {v7, v10, v4}, Lcom/google/protobuf/L;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_a
    return-void

    :catchall_1
    move-exception v0

    move-object v10, v3

    goto/16 :goto_15

    :catchall_2
    move-exception v0

    move-object v10, v15

    goto/16 :goto_15

    :cond_b
    move-object/from16 v4, p2

    move-object v10, v15

    :try_start_4
    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    :try_start_5
    invoke-static {v11}, Lcom/google/protobuf/F;->n0(I)I

    move-result v1
    :try_end_5
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    packed-switch v1, :pswitch_data_0

    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    if-nez v12, :cond_10

    :try_start_6
    invoke-virtual {v14, v10}, Lcom/google/protobuf/L;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_6
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto/16 :goto_e

    :pswitch_0
    :try_start_7
    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->Q(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/D;

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v11

    invoke-interface {v0, v1, v11, v6}, Lcom/google/protobuf/I;->M(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    invoke-virtual {v8, v10, v2, v3, v1}, Lcom/google/protobuf/F;->m0(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->F()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto/16 :goto_8

    :pswitch_2
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto/16 :goto_8

    :pswitch_3
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->b()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto/16 :goto_8

    :pswitch_4
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->H()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_5
    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->e()I

    move-result v1

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->r(I)Lcom/google/protobuf/t$e;

    move-result-object v12

    if-eqz v12, :cond_d

    invoke-interface {v12, v1}, Lcom/google/protobuf/t$e;->a(I)Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {v10, v2, v1, v5, v7}, Lcom/google/protobuf/J;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/protobuf/L;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v6

    move-object v14, v7

    goto/16 :goto_14

    :cond_d
    :goto_7
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_6
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_7
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->h()Lcom/google/protobuf/e;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_8
    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->Q(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/D;

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v11

    invoke-interface {v0, v1, v11, v6}, Lcom/google/protobuf/I;->N(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    invoke-virtual {v8, v10, v2, v3, v1}, Lcom/google/protobuf/F;->m0(Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_8

    :pswitch_9
    invoke-virtual {v8, v10, v11, v0}, Lcom/google/protobuf/F;->f0(Ljava/lang/Object;ILcom/google/protobuf/I;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    :goto_8
    move-object v12, v5

    move-object v13, v6

    goto/16 :goto_9

    :pswitch_a
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->w()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_b
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->E()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_c
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->u()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_d
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->B()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_e
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->j()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_f
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->t()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_10
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->readFloat()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto/16 :goto_8

    :pswitch_11
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v11

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->readDouble()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v10, v11, v12, v1}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v2, v3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V
    :try_end_7
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto/16 :goto_8

    :catchall_3
    move-exception v0

    goto/16 :goto_15

    :pswitch_12
    :try_start_8
    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->s(I)Ljava/lang/Object;

    move-result-object v11
    :try_end_8
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object v4, v11

    move-object v12, v5

    move-object/from16 v5, p5

    move-object v13, v6

    move-object/from16 v6, p4

    :try_start_9
    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->L(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/k;Lcom/google/protobuf/I;)V

    :goto_9
    move-object v14, v7

    goto/16 :goto_b

    :pswitch_13
    move-object v12, v5

    move-object v13, v6

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v4

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6
    :try_end_9
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-wide v3, v4

    move-object/from16 v5, p4

    move-object v14, v7

    move-object/from16 v7, p5

    :try_start_a
    invoke-virtual/range {v1 .. v7}, Lcom/google/protobuf/F;->d0(Ljava/lang/Object;JLcom/google/protobuf/I;LJm5;Lcom/google/protobuf/k;)V

    goto/16 :goto_b

    :catchall_4
    move-exception v0

    move-object v14, v7

    goto/16 :goto_c

    :catch_0
    move-object v14, v7

    goto/16 :goto_d

    :pswitch_14
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->a(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_15
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->i(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_16
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->k(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_17
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->v(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_18
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v4

    invoke-virtual {v1, v10, v4, v5}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/google/protobuf/I;->z(Ljava/util/List;)V

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->r(I)Lcom/google/protobuf/t$e;

    move-result-object v5

    move-object/from16 v1, p3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v12

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v6}, Lcom/google/protobuf/J;->A(Ljava/lang/Object;ILjava/util/List;Lcom/google/protobuf/t$e;Ljava/lang/Object;Lcom/google/protobuf/L;)Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_14

    :pswitch_19
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->D(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_1a
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->g(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_1b
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->m(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_1c
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->C(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_1d
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->l(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_1e
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->x(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_1f
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->y(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_20
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->p(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_21
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->s(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_22
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->a(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_23
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->i(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_24
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->k(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_25
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->v(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_26
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v4

    invoke-virtual {v1, v10, v4, v5}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/google/protobuf/I;->z(Ljava/util/List;)V

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->r(I)Lcom/google/protobuf/t$e;

    move-result-object v5

    move-object/from16 v1, p3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v12

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v6}, Lcom/google/protobuf/J;->A(Ljava/lang/Object;ILjava/util/List;Lcom/google/protobuf/t$e;Ljava/lang/Object;Lcom/google/protobuf/L;)Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_14

    :pswitch_27
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->D(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_28
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->r(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_29
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move v3, v11

    move-object/from16 v4, p4

    move-object/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->e0(Ljava/lang/Object;ILcom/google/protobuf/I;LJm5;Lcom/google/protobuf/k;)V

    goto/16 :goto_b

    :pswitch_2a
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-virtual {v8, v10, v11, v0}, Lcom/google/protobuf/F;->g0(Ljava/lang/Object;ILcom/google/protobuf/I;)V

    goto/16 :goto_b

    :pswitch_2b
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->g(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_2c
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->m(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_2d
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->C(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_2e
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->l(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_2f
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->x(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_30
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->y(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_31
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->p(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_32
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    iget-object v1, v8, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/I;->s(Ljava/util/List;)V

    goto/16 :goto_b

    :pswitch_33
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->P(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/D;

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v2

    invoke-interface {v0, v1, v2, v13}, Lcom/google/protobuf/I;->M(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    invoke-virtual {v8, v10, v3, v1}, Lcom/google/protobuf/F;->l0(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_34
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->F()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_35
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->f()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_36
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->b()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_37
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->H()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_38
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->e()I

    move-result v1

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->r(I)Lcom/google/protobuf/t$e;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-interface {v4, v1}, Lcom/google/protobuf/t$e;->a(I)Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_a

    :cond_e
    invoke-static {v10, v2, v1, v12, v14}, Lcom/google/protobuf/J;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/protobuf/L;)Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_14

    :cond_f
    :goto_a
    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v4

    invoke-static {v10, v4, v5, v1}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_39
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->c()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_3a
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->h()Lcom/google/protobuf/e;

    move-result-object v4

    invoke-static {v10, v1, v2, v4}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_3b
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->P(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/D;

    invoke-virtual {v8, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v2

    invoke-interface {v0, v1, v2, v13}, Lcom/google/protobuf/I;->N(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    invoke-virtual {v8, v10, v3, v1}, Lcom/google/protobuf/F;->l0(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3c
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-virtual {v8, v10, v11, v0}, Lcom/google/protobuf/F;->f0(Ljava/lang/Object;ILcom/google/protobuf/I;)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_3d
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->w()Z

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->H(Ljava/lang/Object;JZ)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_3e
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->E()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_3f
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->u()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_b

    :pswitch_40
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->B()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_b

    :pswitch_41
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->j()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_b

    :pswitch_42
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->t()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_b

    :pswitch_43
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->readFloat()F

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lye6;->O(Ljava/lang/Object;JF)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_b

    :pswitch_44
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    invoke-static {v11}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->readDouble()D

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lye6;->N(Ljava/lang/Object;JD)V

    invoke-virtual {v8, v10, v3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V
    :try_end_a
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :goto_b
    move-object v5, v12

    goto/16 :goto_14

    :catchall_5
    move-exception v0

    :goto_c
    move-object v5, v12

    goto/16 :goto_17

    :catch_1
    :goto_d
    move-object v5, v12

    goto :goto_11

    :goto_e
    move-object v5, v1

    goto :goto_f

    :cond_10
    move-object v5, v12

    :goto_f
    :try_start_b
    invoke-virtual {v14, v5, v0}, Lcom/google/protobuf/L;->m(Ljava/lang/Object;Lcom/google/protobuf/I;)Z

    move-result v1
    :try_end_b
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    if-nez v1, :cond_19

    iget v0, v8, Lcom/google/protobuf/F;->k:I

    move-object v4, v5

    :goto_10
    iget v1, v8, Lcom/google/protobuf/F;->l:I

    if-ge v0, v1, :cond_11

    iget-object v1, v8, Lcom/google/protobuf/F;->j:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_11
    if-eqz v4, :cond_12

    invoke-virtual {v14, v10, v4}, Lcom/google/protobuf/L;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_12
    return-void

    :catch_2
    move-object v12, v5

    :catch_3
    move-object v13, v6

    move-object v14, v7

    :catch_4
    :goto_11
    :try_start_c
    invoke-virtual {v14, v0}, Lcom/google/protobuf/L;->q(Lcom/google/protobuf/I;)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface/range {p4 .. p4}, Lcom/google/protobuf/I;->q()Z

    move-result v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    if-nez v1, :cond_19

    iget v0, v8, Lcom/google/protobuf/F;->k:I

    move-object v4, v5

    :goto_12
    iget v1, v8, Lcom/google/protobuf/F;->l:I

    if-ge v0, v1, :cond_13

    iget-object v1, v8, Lcom/google/protobuf/F;->j:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    :cond_13
    if-eqz v4, :cond_14

    invoke-virtual {v14, v10, v4}, Lcom/google/protobuf/L;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_14
    return-void

    :cond_15
    if-nez v5, :cond_16

    :try_start_d
    invoke-virtual {v14, v10}, Lcom/google/protobuf/L;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    :cond_16
    invoke-virtual {v14, v5, v0}, Lcom/google/protobuf/L;->m(Ljava/lang/Object;Lcom/google/protobuf/I;)Z

    move-result v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    if-nez v1, :cond_19

    iget v0, v8, Lcom/google/protobuf/F;->k:I

    move-object v4, v5

    :goto_13
    iget v1, v8, Lcom/google/protobuf/F;->l:I

    if-ge v0, v1, :cond_17

    iget-object v1, v8, Lcom/google/protobuf/F;->j:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_13

    :cond_17
    if-eqz v4, :cond_18

    invoke-virtual {v14, v10, v4}, Lcom/google/protobuf/L;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_18
    return-void

    :cond_19
    :goto_14
    move-object v15, v10

    move-object v6, v13

    move-object v7, v14

    goto/16 :goto_0

    :catchall_6
    move-exception v0

    goto :goto_17

    :catchall_7
    move-exception v0

    move-object v12, v5

    :goto_15
    move-object v14, v7

    goto :goto_17

    :catchall_8
    move-exception v0

    move-object v12, v5

    :goto_16
    move-object v14, v7

    move-object v10, v15

    :goto_17
    iget v1, v8, Lcom/google/protobuf/F;->k:I

    move v7, v1

    move-object v4, v5

    :goto_18
    iget v1, v8, Lcom/google/protobuf/F;->l:I

    if-ge v7, v1, :cond_1a

    iget-object v1, v8, Lcom/google/protobuf/F;->j:[I

    aget v3, v1, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/protobuf/F;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v7, v7, 0x1

    goto :goto_18

    :cond_1a
    if-eqz v4, :cond_1b

    invoke-virtual {v14, v10, v4}, Lcom/google/protobuf/L;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1b
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final L(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/k;Lcom/google/protobuf/I;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/k;",
            "Lcom/google/protobuf/I;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->o0(I)I

    move-result p2

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {p2, p3}, Lcom/google/protobuf/B;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {v2, p2}, Lcom/google/protobuf/B;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {v2, p3}, Lcom/google/protobuf/B;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {v3, v2, p2}, Lcom/google/protobuf/B;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p2, v2

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {p1, p2}, Lcom/google/protobuf/B;->e(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {p2, p3}, Lcom/google/protobuf/B;->a(Ljava/lang/Object;)Lcom/google/protobuf/z$a;

    move-result-object p2

    invoke-interface {p5, p1, p2, p4}, Lcom/google/protobuf/I;->L(Ljava/util/Map;Lcom/google/protobuf/z$a;Lcom/google/protobuf/k;)V

    return-void
.end method

.method public final M(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    sget-object v2, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LJm5;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v3}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, LJm5;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v3}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->U(I)I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->U(I)I

    move-result v0

    invoke-virtual {p0, p2, v0, p3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    sget-object v3, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LJm5;->d()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v4}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, LJm5;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v4}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->U(I)I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final O(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->U(I)I

    move-result v3

    invoke-static {v0}, Lcom/google/protobuf/F;->n0(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->N(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0, p2, v3, p3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v3, p3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->N(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p0, p2, v3, p3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v3, p3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_4
    iget-object p3, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-static {p3, p1, p2, v1, v2}, Lcom/google/protobuf/J;->F(Lcom/google/protobuf/B;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_0

    :pswitch_5
    iget-object p3, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-virtual {p3, p1, p2, v1, v2}, Lcom/google/protobuf/x;->d(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->M(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->M(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->r(Ljava/lang/Object;J)Z

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->H(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_12
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_13
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_14
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_15
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lye6;->Q(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_16
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->y(Ljava/lang/Object;J)F

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lye6;->O(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_17
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lye6;->x(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lye6;->N(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final P(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->o0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, LJm5;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, LJm5;->d()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final Q(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, LJm5;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->o0(I)I

    move-result p3

    invoke-static {p3}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, LJm5;->d()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final U(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, p1, p2, v2}, Lcom/google/protobuf/F;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/L;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {v2, p2}, Lcom/google/protobuf/L;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-boolean v0, p0, Lcom/google/protobuf/F;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p1

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, p2}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/protobuf/o;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final b0(I)I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/F;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/google/protobuf/F;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/F;->k0(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/protobuf/F;->l(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/protobuf/F;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/F;->O(Ljava/lang/Object;Ljava/lang/Object;I)V

    add-int/lit8 v0, v0, 0x3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/J;->G(Lcom/google/protobuf/L;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/protobuf/F;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/J;->E(Lcom/google/protobuf/l;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final c0(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public d()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->m:LY73;

    iget-object v1, p0, Lcom/google/protobuf/F;->e:Lcom/google/protobuf/D;

    invoke-interface {v0, v1}, LY73;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final d0(Ljava/lang/Object;JLcom/google/protobuf/I;LJm5;Lcom/google/protobuf/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J",
            "Lcom/google/protobuf/I;",
            "LJm5<",
            "TE;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, p1, p5, p6}, Lcom/google/protobuf/I;->J(Ljava/util/List;LJm5;Lcom/google/protobuf/k;)V

    return-void
.end method

.method public e(Ljava/lang/Object;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/protobuf/F;->o0(I)I

    move-result v3

    invoke-virtual {p0, v1}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v5

    invoke-static {v3}, Lcom/google/protobuf/F;->n0(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->W(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, Lcom/google/protobuf/t;->c(Z)I

    move-result v3

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->Y(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/protobuf/F;->X(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_14
    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_1c
    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    :goto_1
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_3

    :pswitch_1d
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2

    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->r(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, Lcom/google/protobuf/t;->c(Z)I

    move-result v3

    goto :goto_2

    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_2

    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto :goto_2

    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_2

    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto :goto_2

    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    goto :goto_2

    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->y(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_2

    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lye6;->x(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/protobuf/t;->f(J)I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    :cond_1
    :goto_3
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/L;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/google/protobuf/F;->f:Z

    if-eqz v0, :cond_3

    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/o;->hashCode()I

    move-result p1

    add-int/2addr v2, p1

    :cond_3
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e0(Ljava/lang/Object;ILcom/google/protobuf/I;LJm5;Lcom/google/protobuf/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "I",
            "Lcom/google/protobuf/I;",
            "LJm5<",
            "TE;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    iget-object p2, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1, p4, p5}, Lcom/google/protobuf/I;->K(Ljava/util/List;LJm5;Lcom/google/protobuf/k;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v8, 0xfffff

    const/4 v9, 0x0

    move v0, v8

    move v1, v9

    move v10, v1

    :goto_0
    iget v2, v6, Lcom/google/protobuf/F;->k:I

    const/4 v3, 0x1

    if-ge v10, v2, :cond_8

    iget-object v2, v6, Lcom/google/protobuf/F;->j:[I

    aget v11, v2, v10

    invoke-virtual {v6, v11}, Lcom/google/protobuf/F;->U(I)I

    move-result v12

    invoke-virtual {v6, v11}, Lcom/google/protobuf/F;->o0(I)I

    move-result v13

    iget-object v2, v6, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 v4, v11, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v14, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    int-to-long v1, v4

    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v16, v1

    move v15, v4

    goto :goto_1

    :cond_1
    move v15, v0

    move/from16 v16, v1

    :goto_1
    invoke-static {v13}, Lcom/google/protobuf/F;->H(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/protobuf/F;->A(Ljava/lang/Object;IIII)Z

    move-result v0

    if-nez v0, :cond_2

    return v9

    :cond_2
    invoke-static {v13}, Lcom/google/protobuf/F;->n0(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_6

    const/16 v1, 0x11

    if-eq v0, v1, :cond_6

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_5

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_4

    const/16 v1, 0x44

    if-eq v0, v1, :cond_4

    const/16 v1, 0x31

    if-eq v0, v1, :cond_5

    const/16 v1, 0x32

    if-eq v0, v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/protobuf/F;->D(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_4
    invoke-virtual {v6, v7, v12, v11}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v6, v11}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/protobuf/F;->B(Ljava/lang/Object;ILJm5;)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_5
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/protobuf/F;->C(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/protobuf/F;->A(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v6, v11}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/protobuf/F;->B(Ljava/lang/Object;ILJm5;)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_7
    :goto_2
    add-int/lit8 v10, v10, 0x1

    move v0, v15

    move/from16 v1, v16

    goto/16 :goto_0

    :cond_8
    iget-boolean v0, v6, Lcom/google/protobuf/F;->f:Z

    if-eqz v0, :cond_9

    iget-object v0, v6, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, v7}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/o;->p()Z

    move-result v0

    if-nez v0, :cond_9

    return v9

    :cond_9
    return v3
.end method

.method public final f0(Ljava/lang/Object;ILcom/google/protobuf/I;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Lcom/google/protobuf/F;->y(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-interface {p3}, Lcom/google/protobuf/I;->I()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/F;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-interface {p3}, Lcom/google/protobuf/I;->G()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-interface {p3}, Lcom/google/protobuf/I;->h()Lcom/google/protobuf/e;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lye6;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public g(Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/protobuf/F;->E(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/r;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->r()V

    invoke-virtual {v0}, Lcom/google/protobuf/r;->q()V

    invoke-virtual {v0}, Lcom/google/protobuf/r;->J()V

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/protobuf/F;->o0(I)I

    move-result v2

    invoke-static {v2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v3

    invoke-static {v2}, Lcom/google/protobuf/F;->n0(I)I

    move-result v2

    const/16 v5, 0x9

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v2, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v6, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {v6, v5}, Lcom/google/protobuf/B;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-virtual {v2, p1, v3, v4}, Lcom/google/protobuf/x;->c(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v2

    sget-object v5, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, LJm5;->g(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/L;->j(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/protobuf/F;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->f(Ljava/lang/Object;)V

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g0(Ljava/lang/Object;ILcom/google/protobuf/I;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Lcom/google/protobuf/F;->y(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/google/protobuf/I;->A(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/F;->n:Lcom/google/protobuf/x;

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/protobuf/x;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/google/protobuf/I;->o(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/protobuf/F;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/F;->v(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/protobuf/F;->u(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public i(Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/protobuf/Q;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Lcom/google/protobuf/Q;->B()Lcom/google/protobuf/Q$a;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Q$a;->c:Lcom/google/protobuf/Q$a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/F;->r0(Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/F;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/F;->q0(Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/F;->p0(Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    :goto_0
    return-void
.end method

.method public final i0(Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->c0(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    const/4 v2, 0x1

    shl-int p2, v2, p2

    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    return-void
.end method

.method public j(Ljava/lang/Object;Lcom/google/protobuf/I;Lcom/google/protobuf/k;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/protobuf/I;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/protobuf/F;->l(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    iget-object v2, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/protobuf/F;->K(Lcom/google/protobuf/L;Lcom/google/protobuf/l;Ljava/lang/Object;Lcom/google/protobuf/I;Lcom/google/protobuf/k;)V

    return-void
.end method

.method public final j0(Ljava/lang/Object;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->c0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lye6;->P(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final k0(II)I
    .locals 4

    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v1, 0x3

    invoke-virtual {p0, v2}, Lcom/google/protobuf/F;->U(I)I

    move-result v3

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    if-ge p1, v3, :cond_1

    add-int/lit8 v1, v1, -0x1

    move v0, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final l0(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->o0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/F;->i0(Ljava/lang/Object;I)V

    return-void
.end method

.method public final m0(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->j0(Ljava/lang/Object;II)V

    return-void
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v1

    invoke-static {v0}, Lcom/google/protobuf/F;->n0(I)I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    return v4

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->F(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v3, v4

    :cond_0
    return v3

    :pswitch_1
    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v4

    :cond_1
    return v3

    :pswitch_4
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_2

    move v3, v4

    :cond_2
    return v3

    :pswitch_5
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_3

    move v3, v4

    :cond_3
    return v3

    :pswitch_6
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {p1, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_4

    move v3, v4

    :cond_4
    return v3

    :pswitch_7
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_5

    move v3, v4

    :cond_5
    return v3

    :pswitch_8
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_6

    move v3, v4

    :cond_6
    return v3

    :pswitch_9
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_7

    move v3, v4

    :cond_7
    return v3

    :pswitch_a
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    move v3, v4

    :cond_8
    return v3

    :pswitch_b
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    move v3, v4

    :cond_9
    return v3

    :pswitch_c
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {p1, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/protobuf/J;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    move v3, v4

    :cond_a
    return v3

    :pswitch_d
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-static {p1, v1, v2}, Lye6;->r(Ljava/lang/Object;J)Z

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->r(Ljava/lang/Object;J)Z

    move-result p2

    if-ne p1, p2, :cond_b

    move v3, v4

    :cond_b
    return v3

    :pswitch_e
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_c

    move v3, v4

    :cond_c
    return v3

    :pswitch_f
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-static {p1, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_d

    move v3, v4

    :cond_d
    return v3

    :pswitch_10
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_e

    move v3, v4

    :cond_e
    return v3

    :pswitch_11
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_f

    invoke-static {p1, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_f

    move v3, v4

    :cond_f
    return v3

    :pswitch_12
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_10

    invoke-static {p1, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_10

    move v3, v4

    :cond_10
    return v3

    :pswitch_13
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_11

    invoke-static {p1, v1, v2}, Lye6;->y(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-static {p2, v1, v2}, Lye6;->y(Ljava/lang/Object;J)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    if-ne p1, p2, :cond_11

    move v3, v4

    :cond_11
    return v3

    :pswitch_14
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/F;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_12

    invoke-static {p1, v1, v2}, Lye6;->x(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lye6;->x(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_12

    move v3, v4

    :cond_12
    return v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "ITUB;",
            "Lcom/google/protobuf/L<",
            "TUT;TUB;>;",
            "Ljava/lang/Object;",
            ")TUB;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->U(I)I

    move-result v2

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->o0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->r(I)Lcom/google/protobuf/t$e;

    move-result-object v4

    if-nez v4, :cond_1

    return-object p3

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {v0, p1}, Lcom/google/protobuf/B;->e(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move v1, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Lcom/google/protobuf/F;->p(IILjava/util/Map;Lcom/google/protobuf/t$e;Ljava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final o0(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final p(IILjava/util/Map;Lcom/google/protobuf/t$e;Ljava/lang/Object;Lcom/google/protobuf/L;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/protobuf/t$e;",
            "TUB;",
            "Lcom/google/protobuf/L<",
            "TUT;TUB;>;",
            "Ljava/lang/Object;",
            ")TUB;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/F;->s(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/protobuf/B;->a(Ljava/lang/Object;)Lcom/google/protobuf/z$a;

    move-result-object p1

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p4, v1}, Lcom/google/protobuf/t$e;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez p5, :cond_1

    invoke-virtual {p6, p7}, Lcom/google/protobuf/L;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/google/protobuf/z;->b(Lcom/google/protobuf/z$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/e;->v(I)Lcom/google/protobuf/e$h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/e$h;->b()Lcom/google/protobuf/CodedOutputStream;

    move-result-object v2

    :try_start_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, p1, v3, v0}, Lcom/google/protobuf/z;->e(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/z$a;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Lcom/google/protobuf/e$h;->a()Lcom/google/protobuf/e;

    move-result-object v0

    invoke-virtual {p6, p5, p2, v0}, Lcom/google/protobuf/L;->d(Ljava/lang/Object;ILcom/google/protobuf/e;)V

    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return-object p5
.end method

.method public final p0(Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/protobuf/Q;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, Lcom/google/protobuf/F;->f:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v3, v1}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/protobuf/o;->n()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3}, Lcom/google/protobuf/o;->t()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    iget-object v6, v0, Lcom/google/protobuf/F;->a:[I

    array-length v6, v6

    sget-object v7, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    const v8, 0xfffff

    move v11, v8

    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v10, v6, :cond_7

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->o0(I)I

    move-result v13

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v14

    invoke-static {v13}, Lcom/google/protobuf/F;->n0(I)I

    move-result v15

    const/16 v4, 0x11

    if-gt v15, v4, :cond_2

    iget-object v4, v0, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 v16, v10, 0x2

    aget v4, v4, v16

    and-int v9, v4, v8

    if-eq v9, v11, :cond_1

    int-to-long v11, v9

    invoke-virtual {v7, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v12

    move v11, v9

    :cond_1
    ushr-int/lit8 v4, v4, 0x14

    const/4 v9, 0x1

    shl-int v4, v9, v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v5, :cond_4

    iget-object v9, v0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v9, v5}, Lcom/google/protobuf/l;->a(Ljava/util/Map$Entry;)I

    move-result v9

    if-gt v9, v14, :cond_4

    iget-object v9, v0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v9, v2, v5}, Lcom/google/protobuf/l;->j(Lcom/google/protobuf/Q;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    invoke-static {v13}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    packed-switch v15, :pswitch_data_0

    :cond_5
    :goto_3
    const/4 v13, 0x0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/protobuf/Q;->J(ILjava/lang/Object;LJm5;)V

    goto :goto_3

    :pswitch_1
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->j(IJ)V

    goto :goto_3

    :pswitch_2
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->I(II)V

    goto :goto_3

    :pswitch_3
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->w(IJ)V

    goto :goto_3

    :pswitch_4
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->o(II)V

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->G(II)V

    goto :goto_3

    :pswitch_6
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->k(II)V

    goto :goto_3

    :pswitch_7
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/protobuf/e;

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    goto :goto_3

    :pswitch_8
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/protobuf/Q;->M(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v14, v4, v2}, Lcom/google/protobuf/F;->t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->W(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->n(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->c(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->m(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->g(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->e(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->C(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->Y(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->F(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->X(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->z(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v2, v14, v4, v10}, Lcom/google/protobuf/F;->s0(Lcom/google/protobuf/Q;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v9

    invoke-static {v4, v8, v2, v9}, Lcom/google/protobuf/J;->U(ILjava/util/List;Lcom/google/protobuf/Q;LJm5;)V

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v13, 0x1

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->b0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_15
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->a0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_16
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->Z(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_17
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->Y(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_18
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->Q(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_19
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->d0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1a
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->N(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1b
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->R(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1c
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->S(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1d
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->V(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1e
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->e0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1f
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->W(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_20
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->T(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_21
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->P(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_22
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->b0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_23
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->a0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_24
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->Z(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_25
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->Y(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_26
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->Q(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_27
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->d0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_28
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2}, Lcom/google/protobuf/J;->O(ILjava/util/List;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v9

    invoke-static {v4, v8, v2, v9}, Lcom/google/protobuf/J;->X(ILjava/util/List;Lcom/google/protobuf/Q;LJm5;)V

    goto/16 :goto_3

    :pswitch_2a
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2}, Lcom/google/protobuf/J;->c0(ILjava/util/List;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_2b
    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->N(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_2c
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->R(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_2d
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->S(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_2e
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->V(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_2f
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->e0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_30
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->W(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_31
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->T(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_32
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->U(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/protobuf/J;->P(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_4

    :pswitch_33
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/protobuf/Q;->J(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_4

    :pswitch_34
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->j(IJ)V

    goto/16 :goto_4

    :pswitch_35
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->I(II)V

    goto/16 :goto_4

    :pswitch_36
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->w(IJ)V

    goto/16 :goto_4

    :pswitch_37
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->o(II)V

    goto/16 :goto_4

    :pswitch_38
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->G(II)V

    goto/16 :goto_4

    :pswitch_39
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->k(II)V

    goto/16 :goto_4

    :pswitch_3a
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/protobuf/e;

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    goto/16 :goto_4

    :pswitch_3b
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/protobuf/Q;->M(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_4

    :pswitch_3c
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v14, v4, v2}, Lcom/google/protobuf/F;->t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V

    goto :goto_4

    :pswitch_3d
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->k(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->n(IZ)V

    goto :goto_4

    :pswitch_3e
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->c(II)V

    goto :goto_4

    :pswitch_3f
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->m(IJ)V

    goto :goto_4

    :pswitch_40
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->g(II)V

    goto :goto_4

    :pswitch_41
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->e(IJ)V

    goto :goto_4

    :pswitch_42
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->C(IJ)V

    goto :goto_4

    :pswitch_43
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->q(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/protobuf/Q;->F(IF)V

    goto :goto_4

    :pswitch_44
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-static {v1, v8, v9}, Lcom/google/protobuf/F;->m(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/protobuf/Q;->z(ID)V

    :cond_6
    :goto_4
    add-int/lit8 v10, v10, 0x3

    const v8, 0xfffff

    goto/16 :goto_1

    :cond_7
    :goto_5
    if-eqz v5, :cond_9

    iget-object v4, v0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v4, v2, v5}, Lcom/google/protobuf/l;->j(Lcom/google/protobuf/Q;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    move-object v5, v4

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    goto :goto_5

    :cond_9
    iget-object v3, v0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {v0, v3, v1, v2}, Lcom/google/protobuf/F;->u0(Lcom/google/protobuf/L;Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q0(Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/protobuf/Q;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/protobuf/F;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/o;->n()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/protobuf/o;->t()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lcom/google/protobuf/F;->a:[I

    array-length v3, v3

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_4

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->o0(I)I

    move-result v6

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    :goto_2
    if-eqz v2, :cond_2

    iget-object v8, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v8, v2}, Lcom/google/protobuf/l;->a(Ljava/util/Map$Entry;)I

    move-result v8

    if-gt v8, v7, :cond_2

    iget-object v8, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v8, p2, v2}, Lcom/google/protobuf/l;->j(Lcom/google/protobuf/Q;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v6}, Lcom/google/protobuf/F;->n0(I)I

    move-result v8

    const/4 v9, 0x1

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lcom/google/protobuf/Q;->J(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->j(IJ)V

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->I(II)V

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->w(IJ)V

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->o(II)V

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->G(II)V

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->k(II)V

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/protobuf/e;

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lcom/google/protobuf/Q;->M(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v7, v6, p2}, Lcom/google/protobuf/F;->t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->W(Ljava/lang/Object;J)Z

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->n(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->c(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->m(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->g(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->e(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->C(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->Y(Ljava/lang/Object;J)F

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->F(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->X(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->z(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, p2, v7, v6, v5}, Lcom/google/protobuf/F;->s0(Lcom/google/protobuf/Q;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, Lcom/google/protobuf/J;->U(ILjava/util/List;Lcom/google/protobuf/Q;LJm5;)V

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->b0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->a0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->Z(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->Y(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->Q(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->d0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->N(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->R(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1c
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->S(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1d
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->V(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1e
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->e0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1f
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->W(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_20
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->T(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_21
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/protobuf/J;->P(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_22
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->b0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_23
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->a0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_24
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->Z(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_25
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->Y(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_26
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->Q(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_27
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->d0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_28
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, Lcom/google/protobuf/J;->O(ILjava/util/List;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, Lcom/google/protobuf/J;->X(ILjava/util/List;Lcom/google/protobuf/Q;LJm5;)V

    goto/16 :goto_3

    :pswitch_2a
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, Lcom/google/protobuf/J;->c0(ILjava/util/List;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_2b
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->N(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2c
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->R(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2d
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->S(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2e
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->V(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2f
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->e0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_30
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->W(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_31
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->T(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_32
    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/protobuf/J;->P(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_33
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lcom/google/protobuf/Q;->J(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->j(IJ)V

    goto/16 :goto_3

    :pswitch_35
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->I(II)V

    goto/16 :goto_3

    :pswitch_36
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->w(IJ)V

    goto/16 :goto_3

    :pswitch_37
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->o(II)V

    goto/16 :goto_3

    :pswitch_38
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->G(II)V

    goto/16 :goto_3

    :pswitch_39
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->k(II)V

    goto/16 :goto_3

    :pswitch_3a
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/protobuf/e;

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    goto/16 :goto_3

    :pswitch_3b
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lcom/google/protobuf/Q;->M(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_3c
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v7, v6, p2}, Lcom/google/protobuf/F;->t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_3d
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->k(Ljava/lang/Object;J)Z

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->n(IZ)V

    goto/16 :goto_3

    :pswitch_3e
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->c(II)V

    goto :goto_3

    :pswitch_3f
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->m(IJ)V

    goto :goto_3

    :pswitch_40
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->g(II)V

    goto :goto_3

    :pswitch_41
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->e(IJ)V

    goto :goto_3

    :pswitch_42
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->C(IJ)V

    goto :goto_3

    :pswitch_43
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->q(Ljava/lang/Object;J)F

    move-result v6

    invoke-interface {p2, v7, v6}, Lcom/google/protobuf/Q;->F(IF)V

    goto :goto_3

    :pswitch_44
    invoke-virtual {p0, p1, v5}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/protobuf/F;->m(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, Lcom/google/protobuf/Q;->z(ID)V

    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x3

    goto/16 :goto_1

    :cond_4
    :goto_4
    if-eqz v2, :cond_6

    iget-object v3, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v3, p2, v2}, Lcom/google/protobuf/l;->j(Lcom/google/protobuf/Q;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_4

    :cond_5
    move-object v2, v1

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/protobuf/F;->u0(Lcom/google/protobuf/L;Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(I)Lcom/google/protobuf/t$e;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/F;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/protobuf/t$e;

    return-object p1
.end method

.method public final r0(Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/protobuf/Q;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/protobuf/F;->u0(Lcom/google/protobuf/L;Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    iget-boolean v0, p0, Lcom/google/protobuf/F;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/o;->n()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/protobuf/o;->g()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lcom/google/protobuf/F;->a:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x3

    :goto_1
    if-ltz v3, :cond_4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->o0(I)I

    move-result v4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    :goto_2
    if-eqz v2, :cond_2

    iget-object v6, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v6, v2}, Lcom/google/protobuf/l;->a(Ljava/util/Map$Entry;)I

    move-result v6

    if-le v6, v5, :cond_2

    iget-object v6, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v6, p2, v2}, Lcom/google/protobuf/l;->j(Lcom/google/protobuf/Q;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lcom/google/protobuf/F;->n0(I)I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lcom/google/protobuf/Q;->J(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->j(IJ)V

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->I(II)V

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->w(IJ)V

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->o(II)V

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->G(II)V

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->k(II)V

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/protobuf/e;

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lcom/google/protobuf/Q;->M(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v5, v4, p2}, Lcom/google/protobuf/F;->t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->W(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->n(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->c(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->m(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->g(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->e(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->C(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->Y(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->F(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->X(Ljava/lang/Object;J)D

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->z(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, p2, v5, v4, v3}, Lcom/google/protobuf/F;->s0(Lcom/google/protobuf/Q;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lcom/google/protobuf/J;->U(ILjava/util/List;Lcom/google/protobuf/Q;LJm5;)V

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->b0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->a0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->Z(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->Y(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->Q(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->d0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->N(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->R(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1c
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->S(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1d
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->V(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1e
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->e0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_1f
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->W(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_20
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->T(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_21
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/protobuf/J;->P(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_22
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->b0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_23
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->a0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_24
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->Z(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_25
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->Y(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_26
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->Q(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_27
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->d0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_28
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lcom/google/protobuf/J;->O(ILjava/util/List;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lcom/google/protobuf/J;->X(ILjava/util/List;Lcom/google/protobuf/Q;LJm5;)V

    goto/16 :goto_3

    :pswitch_2a
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lcom/google/protobuf/J;->c0(ILjava/util/List;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_2b
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->N(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2c
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->R(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2d
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->S(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2e
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->V(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_2f
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->e0(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_30
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->W(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_31
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->T(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_32
    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->U(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/protobuf/J;->P(ILjava/util/List;Lcom/google/protobuf/Q;Z)V

    goto/16 :goto_3

    :pswitch_33
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lcom/google/protobuf/Q;->J(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->j(IJ)V

    goto/16 :goto_3

    :pswitch_35
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->I(II)V

    goto/16 :goto_3

    :pswitch_36
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->w(IJ)V

    goto/16 :goto_3

    :pswitch_37
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->o(II)V

    goto/16 :goto_3

    :pswitch_38
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->G(II)V

    goto/16 :goto_3

    :pswitch_39
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->k(II)V

    goto/16 :goto_3

    :pswitch_3a
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/protobuf/e;

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    goto/16 :goto_3

    :pswitch_3b
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lcom/google/protobuf/Q;->M(ILjava/lang/Object;LJm5;)V

    goto/16 :goto_3

    :pswitch_3c
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v5, v4, p2}, Lcom/google/protobuf/F;->t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V

    goto/16 :goto_3

    :pswitch_3d
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->k(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->n(IZ)V

    goto/16 :goto_3

    :pswitch_3e
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->c(II)V

    goto :goto_3

    :pswitch_3f
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->m(IJ)V

    goto :goto_3

    :pswitch_40
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->x(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->g(II)V

    goto :goto_3

    :pswitch_41
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->e(IJ)V

    goto :goto_3

    :pswitch_42
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->J(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->C(IJ)V

    goto :goto_3

    :pswitch_43
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->q(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {p2, v5, v4}, Lcom/google/protobuf/Q;->F(IF)V

    goto :goto_3

    :pswitch_44
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/protobuf/F;->m(Ljava/lang/Object;J)D

    move-result-wide v6

    invoke-interface {p2, v5, v6, v7}, Lcom/google/protobuf/Q;->z(ID)V

    :cond_3
    :goto_3
    add-int/lit8 v3, v3, -0x3

    goto/16 :goto_1

    :cond_4
    :goto_4
    if-eqz v2, :cond_6

    iget-object p1, p0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {p1, p2, v2}, Lcom/google/protobuf/l;->j(Lcom/google/protobuf/Q;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    move-object v2, p1

    goto :goto_4

    :cond_5
    move-object v2, v1

    goto :goto_4

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/F;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final s0(Lcom/google/protobuf/Q;ILjava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/Q;",
            "I",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-virtual {p0, p4}, Lcom/google/protobuf/F;->s(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v0, p4}, Lcom/google/protobuf/B;->a(Ljava/lang/Object;)Lcom/google/protobuf/z$a;

    move-result-object p4

    iget-object v0, p0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-interface {v0, p3}, Lcom/google/protobuf/B;->g(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p3

    invoke-interface {p1, p2, p4, p3}, Lcom/google/protobuf/Q;->N(ILcom/google/protobuf/z$a;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final t(I)LJm5;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/google/protobuf/F;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, LJm5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LL94;->a()LL94;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/F;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, LL94;->c(Ljava/lang/Class;)LJm5;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/F;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final t0(ILjava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/String;

    invoke-interface {p3, p1, p2}, Lcom/google/protobuf/Q;->d(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    check-cast p2, Lcom/google/protobuf/e;

    invoke-interface {p3, p1, p2}, Lcom/google/protobuf/Q;->K(ILcom/google/protobuf/e;)V

    :goto_0
    return-void
.end method

.method public final u(Ljava/lang/Object;)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    const v4, 0xfffff

    move v7, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, Lcom/google/protobuf/F;->a:[I

    array-length v9, v9

    if-ge v5, v9, :cond_15

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->o0(I)I

    move-result v9

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->U(I)I

    move-result v10

    invoke-static {v9}, Lcom/google/protobuf/F;->n0(I)I

    move-result v11

    const/16 v12, 0x11

    const/4 v13, 0x1

    if-gt v11, v12, :cond_0

    iget-object v12, v0, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 v14, v5, 0x2

    aget v12, v12, v14

    and-int v14, v12, v4

    ushr-int/lit8 v15, v12, 0x14

    shl-int v15, v13, v15

    if-eq v14, v7, :cond_2

    int-to-long v7, v14

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v7, v14

    goto :goto_2

    :cond_0
    iget-boolean v12, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v12, :cond_1

    sget-object v12, Lal1;->T:Lal1;

    invoke-virtual {v12}, Lal1;->b()I

    move-result v12

    if-lt v11, v12, :cond_1

    sget-object v12, Lal1;->w0:Lal1;

    invoke-virtual {v12}, Lal1;->b()I

    move-result v12

    if-gt v11, v12, :cond_1

    iget-object v12, v0, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 v14, v5, 0x2

    aget v12, v12, v14

    and-int/2addr v12, v4

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    const/4 v15, 0x0

    :cond_2
    :goto_2
    invoke-static {v9}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v13

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    packed-switch v11, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/protobuf/D;

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->s(ILcom/google/protobuf/D;LJm5;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->P(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_2
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->N(II)I

    move-result v3

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->L(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_4
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, 0x0

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->J(II)I

    move-result v4

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->k(II)I

    move-result v3

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->U(II)I

    move-result v3

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/protobuf/e;

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_8
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->o(ILjava/lang/Object;LJm5;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_9
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/google/protobuf/e;

    if-eqz v4, :cond_3

    check-cast v3, Lcom/google/protobuf/e;

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v3

    goto/16 :goto_5

    :cond_3
    check-cast v3, Ljava/lang/String;

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->R(ILjava/lang/String;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_a
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, 0x1

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->d(IZ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_b
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, 0x0

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->m(II)I

    move-result v4

    goto/16 :goto_7

    :pswitch_c
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->o(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_d
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->v(II)I

    move-result v3

    goto/16 :goto_5

    :pswitch_e
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->W(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_f
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v1, v13, v14}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->x(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_10
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v10, v9}, Lcom/google/protobuf/CodedOutputStream;->q(IF)I

    move-result v3

    goto/16 :goto_5

    :pswitch_11
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_12

    const-wide/16 v3, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->i(ID)I

    move-result v3

    goto/16 :goto_5

    :pswitch_12
    iget-object v3, v0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->s(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v3, v10, v4, v9}, Lcom/google/protobuf/B;->d(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_13
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->j(ILjava/util/List;LJm5;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_14
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->t(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_4

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_4
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->r(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_5

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_6

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_6
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_7

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_7
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_8

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_8
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->w(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_9

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_9
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->b(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_a

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_a
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_b

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_b
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_1c
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_c

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_c
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_1d
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->l(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_d

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_d
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto/16 :goto_3

    :pswitch_1e
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->y(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_e

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_e
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto :goto_3

    :pswitch_1f
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->n(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_f

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_f
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto :goto_3

    :pswitch_20
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_10

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_10
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    goto :goto_3

    :pswitch_21
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/protobuf/J;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_12

    iget-boolean v4, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v4, :cond_11

    int-to-long v11, v12

    invoke-virtual {v2, v1, v11, v12, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_11
    invoke-static {v10}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v9

    :goto_3
    add-int/2addr v4, v9

    add-int/2addr v4, v3

    goto/16 :goto_7

    :pswitch_22
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->s(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_23
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->q(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_24
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->h(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_25
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->f(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_26
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->d(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_27
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->v(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_5

    :pswitch_28
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3}, Lcom/google/protobuf/J;->c(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_29
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->p(ILjava/util/List;LJm5;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_2a
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3}, Lcom/google/protobuf/J;->u(ILjava/util/List;)I

    move-result v3

    goto :goto_5

    :pswitch_2b
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->a(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2c
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->f(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2d
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->h(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2e
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->k(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2f
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->x(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_30
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->m(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_31
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->f(ILjava/util/List;Z)I

    move-result v3

    :goto_4
    add-int/2addr v6, v3

    move v11, v4

    goto/16 :goto_9

    :pswitch_32
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->h(ILjava/util/List;Z)I

    move-result v3

    :goto_5
    add-int/2addr v6, v3

    :cond_12
    :goto_6
    const/4 v11, 0x0

    goto/16 :goto_9

    :pswitch_33
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/protobuf/D;

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->s(ILcom/google/protobuf/D;LJm5;)I

    move-result v3

    goto :goto_5

    :pswitch_34
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->P(IJ)I

    move-result v3

    goto :goto_5

    :pswitch_35
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->N(II)I

    move-result v3

    goto :goto_5

    :pswitch_36
    and-int v9, v8, v15

    if-eqz v9, :cond_12

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->L(IJ)I

    move-result v3

    goto :goto_5

    :pswitch_37
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    const/4 v3, 0x0

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->J(II)I

    move-result v4

    :goto_7
    add-int/2addr v6, v4

    goto :goto_6

    :pswitch_38
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->k(II)I

    move-result v3

    goto :goto_5

    :pswitch_39
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->U(II)I

    move-result v3

    goto :goto_5

    :pswitch_3a
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/protobuf/e;

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v3

    goto :goto_5

    :pswitch_3b
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/J;->o(ILjava/lang/Object;LJm5;)I

    move-result v3

    goto :goto_5

    :pswitch_3c
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/google/protobuf/e;

    if-eqz v4, :cond_13

    check-cast v3, Lcom/google/protobuf/e;

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v3

    goto/16 :goto_5

    :cond_13
    check-cast v3, Ljava/lang/String;

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->R(ILjava/lang/String;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_3d
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    const/4 v3, 0x1

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->d(IZ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_3e
    and-int v3, v8, v15

    if-eqz v3, :cond_12

    const/4 v11, 0x0

    invoke-static {v10, v11}, Lcom/google/protobuf/CodedOutputStream;->m(II)I

    move-result v3

    goto :goto_8

    :pswitch_3f
    const/4 v11, 0x0

    and-int v9, v8, v15

    if-eqz v9, :cond_14

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->o(IJ)I

    move-result v3

    goto :goto_8

    :pswitch_40
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_14

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/protobuf/CodedOutputStream;->v(II)I

    move-result v3

    goto :goto_8

    :pswitch_41
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_14

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->W(IJ)I

    move-result v3

    goto :goto_8

    :pswitch_42
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_14

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->x(IJ)I

    move-result v3

    goto :goto_8

    :pswitch_43
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_14

    invoke-static {v10, v9}, Lcom/google/protobuf/CodedOutputStream;->q(IF)I

    move-result v3

    goto :goto_8

    :pswitch_44
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_14

    const-wide/16 v3, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->i(ID)I

    move-result v3

    :goto_8
    add-int/2addr v6, v3

    :cond_14
    :goto_9
    add-int/lit8 v5, v5, 0x3

    const v4, 0xfffff

    goto/16 :goto_0

    :cond_15
    iget-object v2, v0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {v0, v2, v1}, Lcom/google/protobuf/F;->w(Lcom/google/protobuf/L;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, Lcom/google/protobuf/F;->f:Z

    if-eqz v2, :cond_16

    iget-object v2, v0, Lcom/google/protobuf/F;->p:Lcom/google/protobuf/l;

    invoke-virtual {v2, v1}, Lcom/google/protobuf/l;->c(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/o;->l()I

    move-result v1

    add-int/2addr v6, v1

    :cond_16
    return v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u0(Lcom/google/protobuf/L;Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/L<",
            "TUT;TUB;>;TT;",
            "Lcom/google/protobuf/Q;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/protobuf/L;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/L;->t(Ljava/lang/Object;Lcom/google/protobuf/Q;)V

    return-void
.end method

.method public final v(Ljava/lang/Object;)I
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/google/protobuf/F;->s:Lsun/misc/Unsafe;

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    iget-object v6, v0, Lcom/google/protobuf/F;->a:[I

    array-length v6, v6

    if-ge v4, v6, :cond_12

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->o0(I)I

    move-result v6

    invoke-static {v6}, Lcom/google/protobuf/F;->n0(I)I

    move-result v7

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->U(I)I

    move-result v8

    invoke-static {v6}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v9

    sget-object v6, Lal1;->T:Lal1;

    invoke-virtual {v6}, Lal1;->b()I

    move-result v6

    if-lt v7, v6, :cond_0

    sget-object v6, Lal1;->w0:Lal1;

    invoke-virtual {v6}, Lal1;->b()I

    move-result v6

    if-gt v7, v6, :cond_0

    iget-object v6, v0, Lcom/google/protobuf/F;->a:[I

    add-int/lit8 v11, v4, 0x2

    aget v6, v6, v11

    const v11, 0xfffff

    and-int/2addr v6, v11

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    const/4 v11, 0x1

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/protobuf/D;

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->s(ILcom/google/protobuf/D;LJm5;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->P(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->N(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v13, v14}, Lcom/google/protobuf/CodedOutputStream;->L(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v3}, Lcom/google/protobuf/CodedOutputStream;->J(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->k(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->U(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/protobuf/e;

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/J;->o(ILjava/lang/Object;LJm5;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/google/protobuf/e;

    if-eqz v7, :cond_1

    check-cast v6, Lcom/google/protobuf/e;

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v6

    goto/16 :goto_3

    :cond_1
    check-cast v6, Ljava/lang/String;

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->R(ILjava/lang/String;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v11}, Lcom/google/protobuf/CodedOutputStream;->d(IZ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v3}, Lcom/google/protobuf/CodedOutputStream;->m(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v13, v14}, Lcom/google/protobuf/CodedOutputStream;->o(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->Z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->v(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->W(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->a0(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->x(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v12}, Lcom/google/protobuf/CodedOutputStream;->q(IF)I

    move-result v6

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/protobuf/F;->G(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_11

    const-wide/16 v6, 0x0

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->i(ID)I

    move-result v6

    goto/16 :goto_3

    :pswitch_12
    iget-object v6, v0, Lcom/google/protobuf/F;->q:Lcom/google/protobuf/B;

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->s(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v6, v8, v7, v9}, Lcom/google/protobuf/B;->d(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_13
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/J;->j(ILjava/util/List;LJm5;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->t(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_2

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_2
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_15
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->r(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_3

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_16
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_4

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_4
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_17
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_5

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_18
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->e(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_6

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_6
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_19
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->w(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_7

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_7
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_1a
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->b(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_8

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_8
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_1b
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_9

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_9
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_1c
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_a

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_a
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_1d
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->l(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_b

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_b
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto/16 :goto_2

    :pswitch_1e
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->y(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_c

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_c
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto :goto_2

    :pswitch_1f
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->n(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_d

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_d
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto :goto_2

    :pswitch_20
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_e

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_e
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    goto :goto_2

    :pswitch_21
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/protobuf/J;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_11

    iget-boolean v9, v0, Lcom/google/protobuf/F;->i:Z

    if-eqz v9, :cond_f

    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_f
    invoke-static {v8}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/protobuf/CodedOutputStream;->V(I)I

    move-result v8

    :goto_2
    add-int/2addr v6, v8

    add-int/2addr v6, v7

    goto/16 :goto_3

    :pswitch_22
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->s(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_23
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->q(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_24
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->h(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_25
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->f(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_26
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->d(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_27
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->v(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_28
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6}, Lcom/google/protobuf/J;->c(ILjava/util/List;)I

    move-result v6

    goto :goto_3

    :pswitch_29
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/J;->p(ILjava/util/List;LJm5;)I

    move-result v6

    goto :goto_3

    :pswitch_2a
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6}, Lcom/google/protobuf/J;->u(ILjava/util/List;)I

    move-result v6

    goto :goto_3

    :pswitch_2b
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->a(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_2c
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->f(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_2d
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->h(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_2e
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->k(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_2f
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->x(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_30
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->m(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_31
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->f(ILjava/util/List;Z)I

    move-result v6

    goto :goto_3

    :pswitch_32
    invoke-static {v1, v9, v10}, Lcom/google/protobuf/F;->I(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/protobuf/J;->h(ILjava/util/List;Z)I

    move-result v6

    :goto_3
    add-int/2addr v5, v6

    goto/16 :goto_4

    :pswitch_33
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/protobuf/D;

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->s(ILcom/google/protobuf/D;LJm5;)I

    move-result v6

    goto :goto_3

    :pswitch_34
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->P(IJ)I

    move-result v6

    goto :goto_3

    :pswitch_35
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->N(II)I

    move-result v6

    goto :goto_3

    :pswitch_36
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v13, v14}, Lcom/google/protobuf/CodedOutputStream;->L(IJ)I

    move-result v6

    goto :goto_3

    :pswitch_37
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v3}, Lcom/google/protobuf/CodedOutputStream;->J(II)I

    move-result v6

    goto :goto_3

    :pswitch_38
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->k(II)I

    move-result v6

    goto :goto_3

    :pswitch_39
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->U(II)I

    move-result v6

    goto :goto_3

    :pswitch_3a
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/protobuf/e;

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v6

    goto :goto_3

    :pswitch_3b
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/protobuf/F;->t(I)LJm5;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/J;->o(ILjava/lang/Object;LJm5;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_3c
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/google/protobuf/e;

    if-eqz v7, :cond_10

    check-cast v6, Lcom/google/protobuf/e;

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->g(ILcom/google/protobuf/e;)I

    move-result v6

    goto/16 :goto_3

    :cond_10
    check-cast v6, Ljava/lang/String;

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->R(ILjava/lang/String;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_3d
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v11}, Lcom/google/protobuf/CodedOutputStream;->d(IZ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_3e
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v3}, Lcom/google/protobuf/CodedOutputStream;->m(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_3f
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v13, v14}, Lcom/google/protobuf/CodedOutputStream;->o(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_40
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->z(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/protobuf/CodedOutputStream;->v(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_41
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->W(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_42
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v1, v9, v10}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->x(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_43
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v8, v12}, Lcom/google/protobuf/CodedOutputStream;->q(IF)I

    move-result v6

    goto/16 :goto_3

    :pswitch_44
    invoke-virtual {p0, v1, v4}, Lcom/google/protobuf/F;->z(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_11

    const-wide/16 v6, 0x0

    invoke-static {v8, v6, v7}, Lcom/google/protobuf/CodedOutputStream;->i(ID)I

    move-result v6

    goto/16 :goto_3

    :cond_11
    :goto_4
    add-int/lit8 v4, v4, 0x3

    goto/16 :goto_0

    :cond_12
    iget-object v2, v0, Lcom/google/protobuf/F;->o:Lcom/google/protobuf/L;

    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/F;->w(Lcom/google/protobuf/L;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v5, v1

    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w(Lcom/google/protobuf/L;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/L<",
            "TUT;TUB;>;TT;)I"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/protobuf/L;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/protobuf/L;->h(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final z(Ljava/lang/Object;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->c0(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v1, v0

    int-to-long v1, v1

    const-wide/32 v3, 0xfffff

    cmp-long v3, v1, v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_11

    invoke-virtual {p0, p2}, Lcom/google/protobuf/F;->o0(I)I

    move-result p2

    invoke-static {p2}, Lcom/google/protobuf/F;->V(I)J

    move-result-wide v0

    invoke-static {p2}, Lcom/google/protobuf/F;->n0(I)I

    move-result p2

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move v4, v5

    :cond_0
    return v4

    :pswitch_1
    invoke-static {p1, v0, v1}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    move v4, v5

    :cond_1
    return v4

    :pswitch_2
    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    move v4, v5

    :cond_2
    return v4

    :pswitch_3
    invoke-static {p1, v0, v1}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    move v4, v5

    :cond_3
    return v4

    :pswitch_4
    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    move v4, v5

    :cond_4
    return v4

    :pswitch_5
    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    move v4, v5

    :cond_5
    return v4

    :pswitch_6
    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    move v4, v5

    :cond_6
    return v4

    :pswitch_7
    sget-object p2, Lcom/google/protobuf/e;->c:Lcom/google/protobuf/e;

    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/protobuf/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :pswitch_8
    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    move v4, v5

    :cond_7
    return v4

    :pswitch_9
    invoke-static {p1, v0, v1}, Lye6;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_8

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_8
    instance-of p2, p1, Lcom/google/protobuf/e;

    if-eqz p2, :cond_9

    sget-object p2, Lcom/google/protobuf/e;->c:Lcom/google/protobuf/e;

    invoke-virtual {p2, p1}, Lcom/google/protobuf/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lye6;->r(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_a

    move v4, v5

    :cond_a
    return v4

    :pswitch_c
    invoke-static {p1, v0, v1}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_b

    move v4, v5

    :cond_b
    return v4

    :pswitch_d
    invoke-static {p1, v0, v1}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_c

    move v4, v5

    :cond_c
    return v4

    :pswitch_e
    invoke-static {p1, v0, v1}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_d

    move v4, v5

    :cond_d
    return v4

    :pswitch_f
    invoke-static {p1, v0, v1}, Lye6;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    move v4, v5

    :cond_e
    return v4

    :pswitch_10
    invoke-static {p1, v0, v1}, Lye6;->y(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_f

    move v4, v5

    :cond_f
    return v4

    :pswitch_11
    invoke-static {p1, v0, v1}, Lye6;->x(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    move v4, v5

    :cond_10
    return v4

    :cond_11
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v5, p2

    invoke-static {p1, v1, v2}, Lye6;->z(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_12

    move v4, v5

    :cond_12
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
