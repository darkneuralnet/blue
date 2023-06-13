.class public final LU19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF39;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LF39<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final p:[I

.field public static final q:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lr19;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:LyY8;

.field public final l:LQ69;

.field public final m:LdR8;

.field public final n:Lo29;

.field public final o:Lv09;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, LU19;->p:[I

    invoke-static {}, Lm89;->l()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, LU19;->q:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILr19;ZZ[IIILo29;LyY8;LQ69;LdR8;Lv09;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU19;->a:[I

    iput-object p2, p0, LU19;->b:[Ljava/lang/Object;

    iput p3, p0, LU19;->c:I

    iput p4, p0, LU19;->d:I

    iput-boolean p6, p0, LU19;->g:Z

    const/4 p1, 0x0

    if-eqz p14, :cond_0

    invoke-virtual {p14, p5}, LdR8;->c(Lr19;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput-boolean p1, p0, LU19;->f:Z

    iput-object p8, p0, LU19;->h:[I

    iput p9, p0, LU19;->i:I

    iput p10, p0, LU19;->j:I

    iput-object p11, p0, LU19;->n:Lo29;

    iput-object p12, p0, LU19;->k:LyY8;

    iput-object p13, p0, LU19;->l:LQ69;

    iput-object p14, p0, LU19;->m:LdR8;

    iput-object p5, p0, LU19;->e:Lr19;

    iput-object p15, p0, LU19;->o:Lv09;

    return-void
.end method

.method public static final A(ILjava/lang/Object;Lba9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lba9;->w(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, LfO8;

    invoke-interface {p2, p0, p1}, Lba9;->B(ILfO8;)V

    return-void
.end method

.method public static C(Ljava/lang/Object;)LY69;
    .locals 2

    check-cast p0, LpU8;

    iget-object v0, p0, LpU8;->zzc:LY69;

    invoke-static {}, LY69;->c()LY69;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, LY69;->f()LY69;

    move-result-object v0

    iput-object v0, p0, LpU8;->zzc:LY69;

    :cond_0
    return-object v0
.end method

.method public static D(Ljava/lang/Class;LO09;Lo29;LyY8;LQ69;LdR8;Lv09;)LU19;
    .locals 31

    move-object/from16 v0, p1

    instance-of v1, v0, Lw39;

    if-eqz v1, :cond_33

    check-cast v0, Lw39;

    invoke-virtual {v0}, Lw39;->zzc()I

    move-result v1

    invoke-virtual {v0}, Lw39;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const v6, 0xd800

    if-lt v5, v6, :cond_0

    const/4 v5, 0x1

    :goto_0
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_1

    move v5, v8

    goto :goto_0

    :cond_0
    const/4 v8, 0x1

    :cond_1
    add-int/lit8 v5, v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v6, :cond_3

    and-int/lit16 v8, v8, 0x1fff

    const/16 v10, 0xd

    :goto_1
    add-int/lit8 v11, v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_2

    and-int/lit16 v5, v5, 0x1fff

    shl-int/2addr v5, v10

    or-int/2addr v8, v5

    add-int/lit8 v10, v10, 0xd

    move v5, v11

    goto :goto_1

    :cond_2
    shl-int/2addr v5, v10

    or-int/2addr v8, v5

    move v5, v11

    :cond_3
    if-nez v8, :cond_4

    sget-object v8, LU19;->p:[I

    move v10, v4

    move v12, v10

    move v13, v12

    move v14, v13

    move/from16 v19, v14

    move-object/from16 v18, v8

    move/from16 v8, v19

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_6

    and-int/lit16 v5, v5, 0x1fff

    const/16 v10, 0xd

    :goto_2
    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v6, :cond_5

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v10

    or-int/2addr v5, v8

    add-int/lit8 v10, v10, 0xd

    move v8, v11

    goto :goto_2

    :cond_5
    shl-int/2addr v8, v10

    or-int/2addr v5, v8

    move v8, v11

    :cond_6
    add-int/lit8 v10, v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v6, :cond_8

    and-int/lit16 v8, v8, 0x1fff

    const/16 v11, 0xd

    :goto_3
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v6, :cond_7

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v8, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_3

    :cond_7
    shl-int/2addr v10, v11

    or-int/2addr v8, v10

    move v10, v12

    :cond_8
    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v6, :cond_a

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_4
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_9

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_4

    :cond_9
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_a
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_c

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_5
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v2, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_b

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_5

    :cond_b
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_c
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v2, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_e

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_6
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_d

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_6

    :cond_d
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_e
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_10

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_7
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_f

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_7

    :cond_f
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_10
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_12

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_8
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v2, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_11

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_8

    :cond_11
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_12
    add-int/lit8 v16, v15, 0x1

    invoke-virtual {v2, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_14

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v4, v16

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v4, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v6, :cond_13

    and-int/lit16 v4, v4, 0x1fff

    shl-int v4, v4, v16

    or-int/2addr v15, v4

    add-int/lit8 v16, v16, 0xd

    move/from16 v4, v17

    goto :goto_9

    :cond_13
    shl-int v4, v4, v16

    or-int/2addr v15, v4

    move/from16 v16, v17

    :cond_14
    add-int v4, v15, v13

    add-int/2addr v4, v14

    add-int v14, v5, v5

    add-int/2addr v14, v8

    new-array v8, v4, [I

    move v4, v5

    move-object/from16 v18, v8

    move v8, v10

    move v10, v14

    move/from16 v19, v15

    move/from16 v5, v16

    move v14, v11

    :goto_a
    sget-object v11, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lw39;->b()[Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v0}, Lw39;->zza()Lr19;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    add-int v20, v19, v13

    add-int v13, v12, v12

    mul-int/lit8 v12, v12, 0x3

    new-array v12, v12, [I

    new-array v13, v13, [Ljava/lang/Object;

    move/from16 v21, v19

    move/from16 v22, v20

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_b
    const/4 v7, 0x2

    if-ne v1, v7, :cond_15

    const/4 v7, 0x1

    goto :goto_c

    :cond_15
    const/4 v7, 0x0

    :goto_c
    if-ge v5, v3, :cond_32

    add-int/lit8 v24, v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_17

    and-int/lit16 v5, v5, 0x1fff

    move/from16 v6, v24

    const/16 v24, 0xd

    :goto_d
    add-int/lit8 v26, v6, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v27, v1

    const v1, 0xd800

    if-lt v6, v1, :cond_16

    and-int/lit16 v1, v6, 0x1fff

    shl-int v1, v1, v24

    or-int/2addr v5, v1

    add-int/lit8 v24, v24, 0xd

    move/from16 v6, v26

    move/from16 v1, v27

    goto :goto_d

    :cond_16
    shl-int v1, v6, v24

    or-int/2addr v5, v1

    move/from16 v1, v26

    goto :goto_e

    :cond_17
    move/from16 v27, v1

    move/from16 v1, v24

    :goto_e
    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v24, v3

    const v3, 0xd800

    if-lt v1, v3, :cond_19

    and-int/lit16 v1, v1, 0x1fff

    const/16 v26, 0xd

    :goto_f
    add-int/lit8 v28, v6, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v3, :cond_18

    and-int/lit16 v3, v6, 0x1fff

    shl-int v3, v3, v26

    or-int/2addr v1, v3

    add-int/lit8 v26, v26, 0xd

    move/from16 v6, v28

    const v3, 0xd800

    goto :goto_f

    :cond_18
    shl-int v3, v6, v26

    or-int/2addr v1, v3

    move/from16 v6, v28

    :cond_19
    and-int/lit16 v3, v1, 0x400

    if-eqz v3, :cond_1a

    add-int/lit8 v3, v16, 0x1

    aput v17, v18, v16

    move/from16 v16, v3

    :cond_1a
    and-int/lit16 v3, v1, 0xff

    move/from16 v26, v14

    const/16 v14, 0x33

    if-lt v3, v14, :cond_22

    add-int/lit8 v14, v6, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v28, v14

    const v14, 0xd800

    if-lt v6, v14, :cond_1c

    and-int/lit16 v6, v6, 0x1fff

    move/from16 v14, v28

    const/16 v28, 0xd

    :goto_10
    add-int/lit8 v29, v14, 0x1

    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    move/from16 v30, v8

    const v8, 0xd800

    if-lt v14, v8, :cond_1b

    and-int/lit16 v8, v14, 0x1fff

    shl-int v8, v8, v28

    or-int/2addr v6, v8

    add-int/lit8 v28, v28, 0xd

    move/from16 v14, v29

    move/from16 v8, v30

    goto :goto_10

    :cond_1b
    shl-int v8, v14, v28

    or-int/2addr v6, v8

    move/from16 v14, v29

    goto :goto_11

    :cond_1c
    move/from16 v30, v8

    move/from16 v14, v28

    :goto_11
    add-int/lit8 v8, v3, -0x33

    move/from16 v28, v14

    const/16 v14, 0x9

    if-eq v8, v14, :cond_1e

    const/16 v14, 0x11

    if-ne v8, v14, :cond_1d

    goto :goto_12

    :cond_1d
    const/16 v14, 0xc

    if-ne v8, v14, :cond_1f

    if-nez v7, :cond_1f

    div-int/lit8 v7, v17, 0x3

    add-int/2addr v7, v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    add-int/lit8 v8, v10, 0x1

    aget-object v10, v15, v10

    aput-object v10, v13, v7

    goto :goto_13

    :cond_1e
    :goto_12
    div-int/lit8 v7, v17, 0x3

    add-int/2addr v7, v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    add-int/lit8 v8, v10, 0x1

    aget-object v10, v15, v10

    aput-object v10, v13, v7

    :goto_13
    move v10, v8

    :cond_1f
    add-int/2addr v6, v6

    aget-object v7, v15, v6

    instance-of v8, v7, Ljava/lang/reflect/Field;

    if-eqz v8, :cond_20

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_14

    :cond_20
    check-cast v7, Ljava/lang/String;

    invoke-static {v9, v7}, LU19;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v15, v6

    :goto_14
    invoke-virtual {v11, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    add-int/lit8 v6, v6, 0x1

    aget-object v8, v15, v6

    instance-of v14, v8, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_21

    check-cast v8, Ljava/lang/reflect/Field;

    goto :goto_15

    :cond_21
    check-cast v8, Ljava/lang/String;

    invoke-static {v9, v8}, LU19;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    aput-object v8, v15, v6

    :goto_15
    move v14, v7

    invoke-virtual {v11, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v6, v6

    move v7, v14

    move-object/from16 v23, v15

    move/from16 v25, v28

    move v14, v6

    const/4 v6, 0x0

    goto/16 :goto_20

    :cond_22
    move/from16 v30, v8

    add-int/lit8 v8, v10, 0x1

    aget-object v10, v15, v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v9, v10}, LU19;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v10

    const/16 v14, 0x9

    if-eq v3, v14, :cond_2a

    const/16 v14, 0x11

    if-ne v3, v14, :cond_23

    goto :goto_19

    :cond_23
    const/16 v14, 0x1b

    if-eq v3, v14, :cond_29

    const/16 v14, 0x31

    if-ne v3, v14, :cond_24

    goto :goto_17

    :cond_24
    const/16 v14, 0xc

    if-eq v3, v14, :cond_27

    const/16 v14, 0x1e

    if-eq v3, v14, :cond_27

    const/16 v14, 0x2c

    if-ne v3, v14, :cond_25

    goto :goto_16

    :cond_25
    const/16 v7, 0x32

    if-ne v3, v7, :cond_28

    add-int/lit8 v7, v21, 0x1

    aput v17, v18, v21

    div-int/lit8 v14, v17, 0x3

    add-int/lit8 v21, v8, 0x1

    aget-object v8, v15, v8

    add-int/2addr v14, v14

    aput-object v8, v13, v14

    and-int/lit16 v8, v1, 0x800

    if-eqz v8, :cond_26

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v8, v21, 0x1

    aget-object v21, v15, v21

    aput-object v21, v13, v14

    move/from16 v21, v7

    goto :goto_1a

    :cond_26
    move-object/from16 v23, v15

    move/from16 v8, v21

    move/from16 v21, v7

    goto :goto_1b

    :cond_27
    :goto_16
    if-nez v7, :cond_28

    div-int/lit8 v7, v17, 0x3

    add-int/2addr v7, v7

    const/4 v14, 0x1

    add-int/2addr v7, v14

    add-int/lit8 v23, v8, 0x1

    aget-object v8, v15, v8

    aput-object v8, v13, v7

    goto :goto_18

    :cond_28
    const/4 v14, 0x1

    goto :goto_1a

    :cond_29
    :goto_17
    const/4 v14, 0x1

    div-int/lit8 v7, v17, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v14

    add-int/lit8 v23, v8, 0x1

    aget-object v8, v15, v8

    aput-object v8, v13, v7

    :goto_18
    move/from16 v8, v23

    goto :goto_1a

    :cond_2a
    :goto_19
    const/4 v14, 0x1

    div-int/lit8 v7, v17, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v14

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v23

    aput-object v23, v13, v7

    :goto_1a
    move-object/from16 v23, v15

    :goto_1b
    invoke-virtual {v11, v10}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v14

    long-to-int v7, v14

    and-int/lit16 v10, v1, 0x1000

    const v14, 0xfffff

    const/16 v15, 0x1000

    if-ne v10, v15, :cond_2e

    const/16 v10, 0x11

    if-gt v3, v10, :cond_2e

    add-int/lit8 v10, v6, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const v15, 0xd800

    if-lt v6, v15, :cond_2c

    and-int/lit16 v6, v6, 0x1fff

    const/16 v14, 0xd

    :goto_1c
    add-int/lit8 v25, v10, 0x1

    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v15, :cond_2b

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v14

    or-int/2addr v6, v10

    add-int/lit8 v14, v14, 0xd

    move/from16 v10, v25

    goto :goto_1c

    :cond_2b
    shl-int/2addr v10, v14

    or-int/2addr v6, v10

    goto :goto_1d

    :cond_2c
    move/from16 v25, v10

    :goto_1d
    add-int v10, v4, v4

    div-int/lit8 v14, v6, 0x20

    add-int/2addr v10, v14

    aget-object v14, v23, v10

    instance-of v15, v14, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_2d

    check-cast v14, Ljava/lang/reflect/Field;

    goto :goto_1e

    :cond_2d
    check-cast v14, Ljava/lang/String;

    invoke-static {v9, v14}, LU19;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v23, v10

    :goto_1e
    invoke-virtual {v11, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v14

    long-to-int v10, v14

    rem-int/lit8 v6, v6, 0x20

    move v14, v10

    goto :goto_1f

    :cond_2e
    move/from16 v25, v6

    const/4 v6, 0x0

    :goto_1f
    const/16 v10, 0x12

    if-lt v3, v10, :cond_2f

    const/16 v10, 0x31

    if-gt v3, v10, :cond_2f

    add-int/lit8 v10, v22, 0x1

    aput v7, v18, v22

    move/from16 v22, v10

    :cond_2f
    move v10, v8

    :goto_20
    add-int/lit8 v8, v17, 0x1

    aput v5, v12, v17

    add-int/lit8 v5, v8, 0x1

    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_30

    const/high16 v15, 0x20000000

    goto :goto_21

    :cond_30
    const/4 v15, 0x0

    :goto_21
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_31

    const/high16 v1, 0x10000000

    goto :goto_22

    :cond_31
    const/4 v1, 0x0

    :goto_22
    shl-int/lit8 v3, v3, 0x14

    or-int/2addr v1, v15

    or-int/2addr v1, v3

    or-int/2addr v1, v7

    aput v1, v12, v8

    add-int/lit8 v17, v5, 0x1

    shl-int/lit8 v1, v6, 0x14

    or-int/2addr v1, v14

    aput v1, v12, v5

    move-object/from16 v15, v23

    move/from16 v3, v24

    move/from16 v5, v25

    move/from16 v14, v26

    move/from16 v1, v27

    move/from16 v8, v30

    const v6, 0xd800

    goto/16 :goto_b

    :cond_32
    move/from16 v30, v8

    move/from16 v26, v14

    new-instance v1, LU19;

    invoke-virtual {v0}, Lw39;->zza()Lr19;

    move-result-object v15

    const/16 v17, 0x0

    move-object v10, v1

    move-object v11, v12

    move-object v12, v13

    move/from16 v13, v30

    move/from16 v16, v7

    move-object/from16 v21, p2

    move-object/from16 v22, p3

    move-object/from16 v23, p4

    move-object/from16 v24, p5

    move-object/from16 v25, p6

    invoke-direct/range {v10 .. v25}, LU19;-><init>([I[Ljava/lang/Object;IILr19;ZZ[IIILo29;LyY8;LQ69;LdR8;Lv09;)V

    return-object v1

    :cond_33
    check-cast v0, Lt69;

    const/4 v0, 0x0

    throw v0
.end method

.method public static E(Ljava/lang/Object;J)D
    .locals 0

    invoke-static {p0, p1, p2}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static F(Ljava/lang/Object;J)F
    .locals 0

    invoke-static {p0, p1, p2}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static H(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static P(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static R(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

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

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static l(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p0}, LU19;->x(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Mutating immutable message: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static w(Ljava/lang/Object;ILF39;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, LF39;->b(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static x(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, LpU8;

    if-eqz v0, :cond_1

    check-cast p0, LpU8;

    invoke-virtual {p0}, LpU8;->y()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static z(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;[BIIILzK8;)I
    .locals 28
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    invoke-static/range {p1 .. p1}, LU19;->l(Ljava/lang/Object;)V

    sget-object v10, LU19;->q:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    const/4 v8, -0x1

    move/from16 v0, p3

    move v1, v8

    move/from16 v2, v16

    move v3, v2

    move v5, v3

    const v6, 0xfffff

    :goto_0
    const/16 v17, 0x0

    if-ge v0, v13, :cond_1b

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v3, v9}, LLK8;->k(I[BILzK8;)I

    move-result v0

    iget v3, v9, LzK8;->a:I

    move v4, v3

    move v3, v0

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    ushr-int/lit8 v0, v4, 0x3

    const/4 v7, 0x3

    if-le v0, v1, :cond_1

    div-int/2addr v2, v7

    invoke-virtual {v15, v0, v2}, LU19;->M(II)I

    move-result v1

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v0}, LU19;->L(I)I

    move-result v1

    :goto_2
    move v2, v1

    if-ne v2, v8, :cond_2

    move/from16 p3, v0

    move v2, v3

    move v7, v4

    move/from16 v20, v5

    move/from16 v19, v8

    move-object/from16 v27, v10

    move v0, v11

    move/from16 v22, v16

    goto/16 :goto_14

    :cond_2
    and-int/lit8 v1, v4, 0x7

    iget-object v8, v15, LU19;->a:[I

    add-int/lit8 v20, v2, 0x1

    aget v7, v8, v20

    invoke-static {v7}, LU19;->P(I)I

    move-result v11

    move/from16 v20, v0

    const v18, 0xfffff

    and-int v0, v7, v18

    move/from16 v22, v3

    move/from16 v21, v4

    int-to-long v3, v0

    const/16 v0, 0x11

    if-gt v11, v0, :cond_e

    add-int/lit8 v0, v2, 0x2

    aget v0, v8, v0

    ushr-int/lit8 v8, v0, 0x14

    const/4 v13, 0x1

    shl-int v8, v13, v8

    const v13, 0xfffff

    and-int/2addr v0, v13

    move/from16 v18, v7

    if-eq v0, v6, :cond_4

    if-eq v6, v13, :cond_3

    int-to-long v6, v6

    invoke-virtual {v10, v14, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    int-to-long v5, v0

    invoke-virtual {v10, v14, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move/from16 v24, v0

    move v7, v5

    goto :goto_3

    :cond_4
    move v7, v5

    move/from16 v24, v6

    :goto_3
    const/4 v0, 0x5

    packed-switch v11, :pswitch_data_0

    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v22

    const/4 v0, 0x3

    if-ne v1, v0, :cond_d

    invoke-virtual {v15, v14, v6}, LU19;->i(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    shl-int/lit8 v0, v11, 0x3

    or-int/lit8 v17, v0, 0x4

    invoke-virtual {v15, v6}, LU19;->g(I)LF39;

    move-result-object v1

    move-object v0, v5

    move-object/from16 v2, p2

    move v3, v13

    move/from16 v4, p4

    move-object v13, v5

    move/from16 v5, v17

    move v12, v6

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, LLK8;->n(Ljava/lang/Object;LF39;[BIIILzK8;)I

    move-result v0

    invoke-virtual {v15, v14, v12, v13}, LU19;->q(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v5, v7, v8

    move/from16 v13, p4

    move v1, v11

    move v2, v12

    move/from16 v3, v21

    move/from16 v6, v24

    const/4 v8, -0x1

    move-object/from16 v12, p2

    goto/16 :goto_d

    :pswitch_0
    if-nez v1, :cond_5

    move/from16 v5, v22

    invoke-static {v12, v5, v9}, LLK8;->m([BILzK8;)I

    move-result v6

    iget-wide v0, v9, LzK8;->b:J

    invoke-static {v0, v1}, LZO8;->b(J)J

    move-result-wide v17

    move/from16 v11, v20

    move-object v0, v10

    move-object/from16 v1, p1

    move v5, v2

    move-wide v2, v3

    move/from16 v20, v6

    move/from16 v13, v21

    move v6, v5

    move-wide/from16 v4, v17

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v7, v8

    move v2, v6

    move v1, v11

    move v3, v13

    move/from16 v0, v20

    goto/16 :goto_a

    :cond_5
    move/from16 v11, v20

    move v12, v2

    move/from16 v13, v22

    goto/16 :goto_f

    :pswitch_1
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v21

    move/from16 v5, v22

    if-nez v1, :cond_8

    invoke-static {v12, v5, v9}, LLK8;->j([BILzK8;)I

    move-result v0

    iget v1, v9, LzK8;->a:I

    invoke-static {v1}, LZO8;->a(I)I

    move-result v1

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_5

    :pswitch_2
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v21

    move/from16 v5, v22

    if-nez v1, :cond_8

    invoke-static {v12, v5, v9}, LLK8;->j([BILzK8;)I

    move-result v0

    iget v1, v9, LzK8;->a:I

    invoke-virtual {v15, v6}, LU19;->f(I)LgV8;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-interface {v2, v1}, LgV8;->zza(I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-static/range {p1 .. p1}, LU19;->C(Ljava/lang/Object;)LY69;

    move-result-object v2

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v13, v1}, LY69;->j(ILjava/lang/Object;)V

    move v2, v6

    move v5, v7

    goto :goto_6

    :cond_7
    :goto_4
    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_5

    :pswitch_3
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v21

    move/from16 v5, v22

    const/4 v0, 0x2

    if-ne v1, v0, :cond_8

    invoke-static {v12, v5, v9}, LLK8;->a([BILzK8;)I

    move-result v0

    iget-object v1, v9, LzK8;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_5
    or-int v5, v7, v8

    move v2, v6

    :goto_6
    move v1, v11

    move v3, v13

    goto/16 :goto_a

    :cond_8
    move v12, v6

    move/from16 v21, v13

    move v13, v5

    goto/16 :goto_f

    :pswitch_4
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v21

    move/from16 v5, v22

    const/4 v0, 0x2

    if-ne v1, v0, :cond_9

    invoke-virtual {v15, v14, v6}, LU19;->i(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v15, v6}, LU19;->g(I)LF39;

    move-result-object v1

    move-object v0, v4

    move-object/from16 v2, p2

    move v3, v5

    move-object v5, v4

    move/from16 v4, p4

    move/from16 v21, v13

    move-object v13, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LLK8;->o(Ljava/lang/Object;LF39;[BIILzK8;)I

    move-result v0

    invoke-virtual {v15, v14, v6, v13}, LU19;->q(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_c

    :cond_9
    move/from16 v21, v13

    goto/16 :goto_9

    :pswitch_5
    move v6, v2

    move/from16 v11, v20

    move/from16 v5, v22

    const/4 v0, 0x2

    if-ne v1, v0, :cond_c

    const/high16 v0, 0x20000000

    and-int v0, v18, v0

    if-nez v0, :cond_a

    invoke-static {v12, v5, v9}, LLK8;->g([BILzK8;)I

    move-result v0

    goto :goto_7

    :cond_a
    invoke-static {v12, v5, v9}, LLK8;->h([BILzK8;)I

    move-result v0

    :goto_7
    iget-object v1, v9, LzK8;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_6
    move v6, v2

    move/from16 v11, v20

    move/from16 v5, v22

    if-nez v1, :cond_c

    invoke-static {v12, v5, v9}, LLK8;->m([BILzK8;)I

    move-result v0

    iget-wide v1, v9, LzK8;->b:J

    const-wide/16 v17, 0x0

    cmp-long v1, v1, v17

    if-eqz v1, :cond_b

    const/4 v13, 0x1

    goto :goto_8

    :cond_b
    move/from16 v13, v16

    :goto_8
    invoke-static {v14, v3, v4, v13}, Lm89;->r(Ljava/lang/Object;JZ)V

    goto/16 :goto_c

    :pswitch_7
    move v6, v2

    move/from16 v11, v20

    move/from16 v5, v22

    if-ne v1, v0, :cond_c

    invoke-static {v12, v5}, LLK8;->b([BI)I

    move-result v0

    invoke-virtual {v10, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v5, 0x4

    goto/16 :goto_c

    :pswitch_8
    move v6, v2

    move/from16 v11, v20

    move/from16 v5, v22

    const/4 v0, 0x1

    if-ne v1, v0, :cond_c

    invoke-static {v12, v5}, LLK8;->p([BI)J

    move-result-wide v17

    move-object v0, v10

    move-object/from16 v1, p1

    move v13, v5

    move-wide v2, v3

    move-wide/from16 v4, v17

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_b

    :cond_c
    :goto_9
    move v13, v5

    goto/16 :goto_e

    :pswitch_9
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v22

    if-nez v1, :cond_d

    invoke-static {v12, v13, v9}, LLK8;->j([BILzK8;)I

    move-result v0

    iget v1, v9, LzK8;->a:I

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_c

    :pswitch_a
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v22

    if-nez v1, :cond_d

    invoke-static {v12, v13, v9}, LLK8;->m([BILzK8;)I

    move-result v13

    iget-wide v1, v9, LzK8;->b:J

    move-object v0, v10

    move-wide/from16 v17, v1

    move-object/from16 v1, p1

    move-wide v2, v3

    move-wide/from16 v4, v17

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v7, v8

    move v2, v6

    move v1, v11

    move v0, v13

    move/from16 v3, v21

    :goto_a
    move/from16 v6, v24

    const/4 v8, -0x1

    move/from16 v13, p4

    goto :goto_d

    :pswitch_b
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v22

    if-ne v1, v0, :cond_d

    invoke-static {v12, v13}, LLK8;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v3, v4, v0}, Lm89;->u(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v13, 0x4

    goto :goto_c

    :pswitch_c
    move v6, v2

    move/from16 v11, v20

    move/from16 v13, v22

    const/4 v0, 0x1

    if-ne v1, v0, :cond_d

    invoke-static {v12, v13}, LLK8;->p([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v3, v4, v0, v1}, Lm89;->t(Ljava/lang/Object;JD)V

    :goto_b
    add-int/lit8 v0, v13, 0x8

    :goto_c
    or-int v5, v7, v8

    move/from16 v13, p4

    move v2, v6

    move v1, v11

    move/from16 v3, v21

    move/from16 v6, v24

    const/4 v8, -0x1

    :goto_d
    move/from16 v11, p5

    goto/16 :goto_0

    :cond_d
    :goto_e
    move v12, v6

    :goto_f
    move/from16 v0, p5

    move/from16 v20, v7

    move-object/from16 v27, v10

    move/from16 p3, v11

    move/from16 v22, v12

    move v2, v13

    move/from16 v7, v21

    move/from16 v6, v24

    const/16 v19, -0x1

    goto/16 :goto_14

    :cond_e
    move v12, v2

    move/from16 v18, v7

    move/from16 v8, v20

    move/from16 v13, v22

    const/16 v0, 0x1b

    if-ne v11, v0, :cond_12

    const/4 v0, 0x2

    if-ne v1, v0, :cond_11

    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_10

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_f

    const/16 v1, 0xa

    goto :goto_10

    :cond_f
    add-int/2addr v1, v1

    :goto_10
    invoke-interface {v0, v1}, LNV8;->d(I)LNV8;

    move-result-object v0

    invoke-virtual {v10, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_10
    move-object v7, v0

    invoke-virtual {v15, v12}, LU19;->g(I)LF39;

    move-result-object v0

    move/from16 v1, v21

    move-object/from16 v2, p2

    move v3, v13

    move/from16 v4, p4

    move/from16 v20, v5

    move-object v5, v7

    move/from16 v24, v6

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, LLK8;->e(LF39;I[BIILNV8;LzK8;)I

    move-result v0

    move/from16 v13, p4

    move/from16 v11, p5

    move v1, v8

    move v2, v12

    move/from16 v5, v20

    move/from16 v3, v21

    move/from16 v6, v24

    const/4 v8, -0x1

    move-object/from16 v12, p2

    goto/16 :goto_0

    :cond_11
    move/from16 v20, v5

    move/from16 v24, v6

    move/from16 p3, v8

    move-object/from16 v27, v10

    move/from16 v22, v12

    move v15, v13

    const/16 v19, -0x1

    goto/16 :goto_13

    :cond_12
    move/from16 v20, v5

    move/from16 v24, v6

    const/16 v0, 0x31

    if-gt v11, v0, :cond_14

    move/from16 v7, v18

    int-to-long v6, v7

    move-object/from16 v0, p0

    move v5, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v25, v3

    move v3, v13

    move/from16 v4, p4

    move/from16 v18, v5

    move/from16 v5, v21

    move-wide/from16 v22, v6

    move v6, v8

    move/from16 v7, v18

    move/from16 p3, v8

    const/16 v19, -0x1

    move v8, v12

    move-object/from16 v27, v10

    move-wide/from16 v9, v22

    move/from16 v15, p5

    move/from16 v22, v12

    move v15, v13

    move-wide/from16 v12, v25

    move-object/from16 v14, p6

    invoke-virtual/range {v0 .. v14}, LU19;->K(Ljava/lang/Object;[BIIIIIIJIJLzK8;)I

    move-result v0

    if-eq v0, v15, :cond_13

    :goto_11
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v1, p3

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    move/from16 v8, v19

    move/from16 v5, v20

    move/from16 v3, v21

    move/from16 v2, v22

    move/from16 v6, v24

    :goto_12
    move-object/from16 v10, v27

    goto/16 :goto_0

    :cond_13
    move v2, v0

    move/from16 v7, v21

    move/from16 v6, v24

    move/from16 v0, p5

    goto/16 :goto_14

    :cond_14
    move-wide/from16 v25, v3

    move/from16 p3, v8

    move-object/from16 v27, v10

    move/from16 v22, v12

    move v15, v13

    move/from16 v7, v18

    const/16 v19, -0x1

    move/from16 v18, v1

    const/16 v0, 0x32

    if-ne v11, v0, :cond_16

    move/from16 v8, v18

    const/4 v0, 0x2

    if-ne v8, v0, :cond_15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v22

    move-wide/from16 v6, v25

    move-object/from16 v8, p6

    invoke-virtual/range {v0 .. v8}, LU19;->I(Ljava/lang/Object;[BIIIJLzK8;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_11

    :cond_15
    :goto_13
    move/from16 v0, p5

    move v2, v15

    move/from16 v7, v21

    move/from16 v6, v24

    goto :goto_14

    :cond_16
    move/from16 v8, v18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v21

    move/from16 v6, p3

    move v9, v7

    move v7, v8

    move v8, v9

    move v9, v11

    move-wide/from16 v10, v25

    move/from16 v12, v22

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, LU19;->J(Ljava/lang/Object;[BIIIIIIIJILzK8;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_11

    :goto_14
    if-ne v7, v0, :cond_17

    if-eqz v0, :cond_17

    move-object/from16 v8, p0

    move-object/from16 v12, p1

    move v9, v0

    move v0, v2

    move v3, v7

    move/from16 v5, v20

    goto/16 :goto_17

    :cond_17
    move-object/from16 v8, p0

    move v9, v0

    iget-boolean v0, v8, LU19;->f:Z

    if-eqz v0, :cond_1a

    move-object/from16 v10, p6

    iget-object v0, v10, LzK8;->d:LTQ8;

    sget-object v1, LTQ8;->c:LTQ8;

    if-eq v0, v1, :cond_19

    iget-object v1, v8, LU19;->e:Lr19;

    move/from16 v11, p3

    invoke-virtual {v0, v1, v11}, LTQ8;->b(Lr19;I)LqT8;

    move-result-object v0

    if-nez v0, :cond_18

    invoke-static/range {p1 .. p1}, LU19;->C(Ljava/lang/Object;)LY69;

    move-result-object v4

    move v0, v7

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LLK8;->i(I[BIILY69;LzK8;)I

    move-result v0

    move-object/from16 v12, p1

    goto :goto_16

    :cond_18
    move-object/from16 v12, p1

    move-object v0, v12

    check-cast v0, LfT8;

    throw v17

    :cond_19
    move-object/from16 v12, p1

    move/from16 v11, p3

    goto :goto_15

    :cond_1a
    move-object/from16 v12, p1

    move/from16 v11, p3

    move-object/from16 v10, p6

    :goto_15
    invoke-static/range {p1 .. p1}, LU19;->C(Ljava/lang/Object;)LY69;

    move-result-object v4

    move v0, v7

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LLK8;->i(I[BIILY69;LzK8;)I

    move-result v0

    :goto_16
    move/from16 v13, p4

    move v3, v7

    move-object v15, v8

    move v1, v11

    move-object v14, v12

    move/from16 v8, v19

    move/from16 v5, v20

    move/from16 v2, v22

    move-object/from16 v12, p2

    move v11, v9

    move-object v9, v10

    goto/16 :goto_12

    :cond_1b
    move/from16 v20, v5

    move/from16 v24, v6

    move-object/from16 v27, v10

    move v9, v11

    move-object v12, v14

    move-object v8, v15

    :goto_17
    const v1, 0xfffff

    if-eq v6, v1, :cond_1c

    int-to-long v6, v6

    move-object/from16 v2, v27

    invoke-virtual {v2, v12, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1c
    iget v2, v8, LU19;->i:I

    :goto_18
    iget v4, v8, LU19;->j:I

    if-ge v2, v4, :cond_1f

    iget-object v4, v8, LU19;->h:[I

    aget v4, v4, v2

    iget-object v5, v8, LU19;->a:[I

    aget v5, v5, v4

    invoke-virtual {v8, v4}, LU19;->Q(I)I

    move-result v5

    and-int/2addr v5, v1

    int-to-long v5, v5

    invoke-static {v12, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1d

    goto :goto_19

    :cond_1d
    invoke-virtual {v8, v4}, LU19;->f(I)LgV8;

    move-result-object v6

    if-nez v6, :cond_1e

    :goto_19
    add-int/lit8 v2, v2, 0x1

    goto :goto_18

    :cond_1e
    check-cast v5, Lm09;

    invoke-virtual {v8, v4}, LU19;->h(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld09;

    throw v17

    :cond_1f
    if-nez v9, :cond_21

    move/from16 v1, p4

    if-ne v0, v1, :cond_20

    goto :goto_1a

    :cond_20
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->e()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v0

    throw v0

    :cond_21
    move/from16 v1, p4

    if-gt v0, v1, :cond_22

    if-ne v3, v9, :cond_22

    :goto_1a
    return v0

    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->e()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G(Ljava/lang/Object;)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    sget-object v2, LU19;->q:Lsun/misc/Unsafe;

    const v4, 0xfffff

    move v7, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, LU19;->a:[I

    array-length v9, v9

    if-ge v5, v9, :cond_6

    invoke-virtual {p0, v5}, LU19;->Q(I)I

    move-result v9

    iget-object v10, v0, LU19;->a:[I

    aget v11, v10, v5

    invoke-static {v9}, LU19;->P(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v12, v13, :cond_1

    add-int/lit8 v13, v5, 0x2

    aget v10, v10, v13

    and-int v13, v10, v4

    ushr-int/lit8 v10, v10, 0x14

    if-eq v13, v7, :cond_0

    int-to-long v7, v13

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v7, v13

    :cond_0
    shl-int v10, v14, v10

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    and-int/2addr v9, v4

    int-to-long v3, v9

    const/16 v9, 0x3f

    packed-switch v12, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr19;

    invoke-virtual {p0, v5}, LU19;->g(I)LF39;

    move-result-object v4

    invoke-static {v11, v3, v4}, LQP8;->u(ILr19;LF39;)I

    move-result v3

    goto/16 :goto_8

    :pswitch_1
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-static {v1, v3, v4}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    add-long v11, v3, v3

    shr-long/2addr v3, v9

    invoke-static {v10}, LQP8;->y(I)I

    move-result v9

    xor-long/2addr v3, v11

    invoke-static {v3, v4}, LQP8;->z(J)I

    move-result v3

    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto/16 :goto_9

    :pswitch_2
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    xor-int/2addr v3, v9

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto/16 :goto_6

    :pswitch_3
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_4
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->v(I)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_7
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LfO8;

    shl-int/lit8 v4, v11, 0x3

    sget-object v9, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v3}, LfO8;->c()I

    move-result v3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    add-int/2addr v9, v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v3

    :goto_2
    add-int/2addr v3, v9

    goto/16 :goto_8

    :pswitch_8
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v5}, LU19;->g(I)LF39;

    move-result-object v4

    invoke-static {v11, v3, v4}, LX39;->L(ILjava/lang/Object;LF39;)I

    move-result v3

    goto/16 :goto_8

    :pswitch_9
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, LfO8;

    if-eqz v4, :cond_2

    check-cast v3, LfO8;

    shl-int/lit8 v4, v11, 0x3

    sget-object v9, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v3}, LfO8;->c()I

    move-result v3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    add-int/2addr v9, v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v3

    goto :goto_2

    :cond_2
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->x(Ljava/lang/String;)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_a
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_8

    :pswitch_b
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto :goto_4

    :pswitch_d
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->v(I)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_e
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v3, v4}, LQP8;->z(J)I

    move-result v3

    invoke-static {v9}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_f
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v3, v4}, LQP8;->z(J)I

    move-result v3

    invoke-static {v9}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_10
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    :goto_3
    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_8

    :pswitch_11
    invoke-virtual {p0, v1, v11, v5}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    :goto_4
    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_8

    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v5}, LU19;->h(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lv09;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    goto/16 :goto_9

    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v5}, LU19;->g(I)LF39;

    move-result-object v4

    invoke-static {v11, v3, v4}, LX39;->G(ILjava/util/List;LF39;)I

    move-result v3

    goto/16 :goto_8

    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->Q(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->O(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->F(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->D(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->B(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->T(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, LX39;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->D(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->F(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_5

    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->V(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_5

    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_5

    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->D(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_5

    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LX39;->F(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    :goto_5
    add-int/2addr v4, v9

    :goto_6
    add-int/2addr v4, v3

    add-int/2addr v6, v4

    goto/16 :goto_9

    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v9, 0x0

    invoke-static {v11, v3, v9}, LX39;->P(ILjava/util/List;Z)I

    move-result v3

    goto :goto_7

    :pswitch_23
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LX39;->N(ILjava/util/List;Z)I

    move-result v3

    goto :goto_7

    :pswitch_24
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LX39;->E(ILjava/util/List;Z)I

    move-result v3

    goto :goto_7

    :pswitch_25
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LX39;->C(ILjava/util/List;Z)I

    move-result v3

    goto :goto_7

    :pswitch_26
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LX39;->A(ILjava/util/List;Z)I

    move-result v3

    :goto_7
    add-int/2addr v6, v3

    move v12, v9

    goto/16 :goto_f

    :pswitch_27
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LX39;->S(ILjava/util/List;Z)I

    move-result v3

    goto :goto_8

    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, LX39;->z(ILjava/util/List;)I

    move-result v3

    goto :goto_8

    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v5}, LU19;->g(I)LF39;

    move-result-object v4

    invoke-static {v11, v3, v4}, LX39;->M(ILjava/util/List;LF39;)I

    move-result v3

    goto :goto_8

    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, LX39;->R(ILjava/util/List;)I

    move-result v3

    :goto_8
    add-int/2addr v6, v3

    :cond_3
    :goto_9
    const/4 v12, 0x0

    goto/16 :goto_f

    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v11, v3, v12}, LX39;->y(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_2c
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->C(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_2d
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->E(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_2e
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_2f
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->U(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_30
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->J(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_31
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->C(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_32
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LX39;->E(ILjava/util/List;Z)I

    move-result v3

    :goto_a
    add-int/2addr v6, v3

    goto/16 :goto_f

    :pswitch_33
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr19;

    invoke-virtual {p0, v5}, LU19;->g(I)LF39;

    move-result-object v4

    invoke-static {v11, v3, v4}, LQP8;->u(ILr19;LF39;)I

    move-result v3

    goto :goto_a

    :pswitch_34
    const/4 v12, 0x0

    and-int/2addr v10, v8

    if-eqz v10, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    add-long v13, v3, v3

    shr-long/2addr v3, v9

    invoke-static {v10}, LQP8;->y(I)I

    move-result v9

    xor-long/2addr v3, v13

    invoke-static {v3, v4}, LQP8;->z(J)I

    move-result v3

    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto/16 :goto_f

    :pswitch_35
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    xor-int/2addr v3, v9

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto/16 :goto_c

    :pswitch_36
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto/16 :goto_e

    :pswitch_37
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto/16 :goto_d

    :pswitch_38
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->v(I)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_c

    :pswitch_39
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_c

    :pswitch_3a
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LfO8;

    shl-int/lit8 v4, v11, 0x3

    sget-object v9, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v3}, LfO8;->c()I

    move-result v3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    add-int/2addr v9, v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v3

    :goto_b
    add-int/2addr v3, v9

    goto/16 :goto_a

    :pswitch_3b
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v5}, LU19;->g(I)LF39;

    move-result-object v4

    invoke-static {v11, v3, v4}, LX39;->L(ILjava/lang/Object;LF39;)I

    move-result v3

    goto/16 :goto_a

    :pswitch_3c
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, LfO8;

    if-eqz v4, :cond_4

    check-cast v3, LfO8;

    shl-int/lit8 v4, v11, 0x3

    sget-object v9, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v3}, LfO8;->c()I

    move-result v3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v9

    add-int/2addr v9, v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v3

    goto :goto_b

    :cond_4
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->x(Ljava/lang/String;)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_c

    :pswitch_3d
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_a

    :pswitch_3e
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto :goto_d

    :pswitch_3f
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    goto :goto_e

    :pswitch_40
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v3}, LQP8;->v(I)I

    move-result v3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_c

    :pswitch_41
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v3, v4}, LQP8;->z(J)I

    move-result v3

    invoke-static {v9}, LQP8;->y(I)I

    move-result v4

    goto :goto_c

    :pswitch_42
    const/4 v12, 0x0

    and-int v9, v8, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v3, v4}, LQP8;->z(J)I

    move-result v3

    invoke-static {v9}, LQP8;->y(I)I

    move-result v4

    :goto_c
    add-int/2addr v4, v3

    add-int/2addr v6, v4

    goto :goto_f

    :pswitch_43
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    :goto_d
    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_a

    :pswitch_44
    const/4 v12, 0x0

    and-int v3, v8, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, LQP8;->y(I)I

    move-result v3

    :goto_e
    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_a

    :cond_5
    :goto_f
    add-int/lit8 v5, v5, 0x3

    const v4, 0xfffff

    goto/16 :goto_0

    :cond_6
    iget-object v2, v0, LU19;->l:LQ69;

    invoke-virtual {v2, v1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, LQ69;->a(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, LU19;->f:Z

    if-nez v2, :cond_7

    return v6

    :cond_7
    iget-object v2, v0, LU19;->m:LdR8;

    invoke-virtual {v2, v1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 v1, 0x0

    throw v1

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

.method public final I(Ljava/lang/Object;[BIIIJLzK8;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object p2, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p5}, LU19;->h(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p1, p6, p7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p4

    move-object p5, p4

    check-cast p5, Lm09;

    invoke-virtual {p5}, Lm09;->h()Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lm09;->d()Lm09;

    move-result-object p5

    invoke-virtual {p5}, Lm09;->e()Lm09;

    move-result-object p5

    invoke-static {p5, p4}, Lv09;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1, p6, p7, p5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    check-cast p3, Ld09;

    const/4 p1, 0x0

    throw p1
.end method

.method public final J(Ljava/lang/Object;[BIIIIIIIJILzK8;)I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v2, p5

    move/from16 v9, p6

    move/from16 v3, p7

    move-wide/from16 v6, p10

    move/from16 v10, p12

    move-object/from16 v8, p13

    sget-object v11, LU19;->q:Lsun/misc/Unsafe;

    iget-object v12, v0, LU19;->a:[I

    add-int/lit8 v13, v10, 0x2

    aget v12, v12, v13

    const v13, 0xfffff

    and-int/2addr v12, v13

    int-to-long v12, v12

    const/4 v14, 0x5

    const/4 v15, 0x2

    packed-switch p9, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    const/4 v6, 0x3

    if-ne v3, v6, :cond_6

    invoke-virtual {v0, v1, v9, v10}, LU19;->j(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v7, v2, 0x4

    invoke-virtual {v0, v10}, LU19;->g(I)LF39;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-static/range {v2 .. v8}, LLK8;->n(Ljava/lang/Object;LF39;[BIIILzK8;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, LU19;->r(Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :pswitch_1
    if-nez v3, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->m([BILzK8;)I

    move-result v2

    iget-wide v3, v8, LzK8;->b:J

    invoke-static {v3, v4}, LZO8;->b(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_2
    if-nez v3, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->j([BILzK8;)I

    move-result v2

    iget v3, v8, LzK8;->a:I

    invoke-static {v3}, LZO8;->a(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    if-nez v3, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->j([BILzK8;)I

    move-result v3

    iget v4, v8, LzK8;->a:I

    invoke-virtual {v0, v10}, LU19;->f(I)LgV8;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v5, v4}, LgV8;->zza(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static/range {p1 .. p1}, LU19;->C(Ljava/lang/Object;)LY69;

    move-result-object v1

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, LY69;->j(ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_1
    move v2, v3

    goto/16 :goto_6

    :pswitch_4
    if-ne v3, v15, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->a([BILzK8;)I

    move-result v2

    iget-object v3, v8, LzK8;->c:Ljava/lang/Object;

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    if-ne v3, v15, :cond_6

    invoke-virtual {v0, v1, v9, v10}, LU19;->j(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, LU19;->g(I)LF39;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, LLK8;->o(Ljava/lang/Object;LF39;[BIILzK8;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, LU19;->r(Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :pswitch_6
    if-ne v3, v15, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->j([BILzK8;)I

    move-result v2

    iget v3, v8, LzK8;->a:I

    if-nez v3, :cond_2

    const-string v3, ""

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_2
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_4

    add-int v5, v2, v3

    invoke-static {v4, v2, v5}, LZ89;->e([BII)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->c()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_4
    :goto_2
    new-instance v5, Ljava/lang/String;

    sget-object v8, LXV8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v5, v4, v2, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v11, v1, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v3

    :goto_3
    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_6

    :pswitch_7
    if-nez v3, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->m([BILzK8;)I

    move-result v2

    iget-wide v3, v8, LzK8;->b:J

    const-wide/16 v14, 0x0

    cmp-long v3, v3, v14

    if-eqz v3, :cond_5

    const/4 v15, 0x1

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    :goto_4
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_8
    if-ne v3, v14, :cond_6

    invoke-static/range {p2 .. p3}, LLK8;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x4

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_9
    const/4 v2, 0x1

    if-ne v3, v2, :cond_6

    invoke-static/range {p2 .. p3}, LLK8;->p([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x8

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_a
    if-nez v3, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->j([BILzK8;)I

    move-result v2

    iget v3, v8, LzK8;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    if-nez v3, :cond_6

    invoke-static {v4, v5, v8}, LLK8;->m([BILzK8;)I

    move-result v2

    iget-wide v3, v8, LzK8;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    if-ne v3, v14, :cond_6

    invoke-static/range {p2 .. p3}, LLK8;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x4

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_d
    const/4 v2, 0x1

    if-ne v3, v2, :cond_6

    invoke-static/range {p2 .. p3}, LLK8;->p([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x8

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :cond_6
    :goto_5
    move v2, v5

    :goto_6
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(Ljava/lang/Object;[BIIIIIIJIJLzK8;)I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v2, p5

    move/from16 v8, p6

    move/from16 v6, p7

    move/from16 v9, p8

    move-wide/from16 v10, p12

    move-object/from16 v7, p14

    sget-object v12, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {v12, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LNV8;

    invoke-interface {v13}, LNV8;->zzc()Z

    move-result v14

    if-nez v14, :cond_1

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v14

    if-nez v14, :cond_0

    const/16 v14, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v14, v14

    :goto_0
    invoke-interface {v13, v14}, LNV8;->d(I)LNV8;

    move-result-object v13

    invoke-virtual {v12, v1, v10, v11, v13}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v10, 0x5

    const-wide/16 v11, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x2

    packed-switch p11, :pswitch_data_0

    const/4 v1, 0x3

    if-ne v6, v1, :cond_4a

    invoke-virtual {v0, v9}, LU19;->g(I)LF39;

    move-result-object v1

    and-int/lit8 v6, v2, -0x8

    or-int/lit8 v6, v6, 0x4

    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, LLK8;->c(LF39;[BIIILzK8;)I

    move-result v4

    iget-object v8, v7, LzK8;->c:Ljava/lang/Object;

    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_27

    :pswitch_0
    if-ne v6, v14, :cond_4

    check-cast v13, LIY8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-static {v3, v1, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v4, v7, LzK8;->b:J

    invoke-static {v4, v5}, LZO8;->b(J)J

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, LIY8;->c(J)V

    goto :goto_1

    :cond_2
    if-ne v1, v2, :cond_3

    goto/16 :goto_29

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_4
    if-nez v6, :cond_4a

    check-cast v13, LIY8;

    invoke-static {v3, v4, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v8, v7, LzK8;->b:J

    invoke-static {v8, v9}, LZO8;->b(J)J

    move-result-wide v8

    invoke-virtual {v13, v8, v9}, LIY8;->c(J)V

    :goto_2
    if-ge v1, v5, :cond_6

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v3, v4, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v8, v7, LzK8;->b:J

    invoke-static {v8, v9}, LZO8;->b(J)J

    move-result-wide v8

    invoke-virtual {v13, v8, v9}, LIY8;->c(J)V

    goto :goto_2

    :cond_6
    :goto_3
    return v1

    :pswitch_1
    if-ne v6, v14, :cond_9

    check-cast v13, LAU8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_4
    if-ge v1, v2, :cond_7

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    invoke-static {v4}, LZO8;->a(I)I

    move-result v4

    invoke-virtual {v13, v4}, LAU8;->zzh(I)V

    goto :goto_4

    :cond_7
    if-ne v1, v2, :cond_8

    goto/16 :goto_29

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_9
    if-nez v6, :cond_4a

    check-cast v13, LAU8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    invoke-static {v4}, LZO8;->a(I)I

    move-result v4

    invoke-virtual {v13, v4}, LAU8;->zzh(I)V

    :goto_5
    if-ge v1, v5, :cond_b

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    invoke-static {v4}, LZO8;->a(I)I

    move-result v4

    invoke-virtual {v13, v4}, LAU8;->zzh(I)V

    goto :goto_5

    :cond_b
    :goto_6
    return v1

    :pswitch_2
    if-ne v6, v14, :cond_c

    invoke-static {v3, v4, v13, v7}, LLK8;->f([BILNV8;LzK8;)I

    move-result v2

    goto :goto_7

    :cond_c
    if-nez v6, :cond_4a

    move/from16 v2, p5

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v13

    move-object/from16 v7, p14

    invoke-static/range {v2 .. v7}, LLK8;->l(I[BIILNV8;LzK8;)I

    move-result v2

    :goto_7
    invoke-virtual {v0, v9}, LU19;->f(I)LgV8;

    move-result-object v3

    iget-object v4, v0, LU19;->l:LQ69;

    sget-object v5, LX39;->a:Ljava/lang/Class;

    if-eqz v3, :cond_12

    instance-of v5, v13, Ljava/util/RandomAccess;

    const/4 v6, 0x0

    if-eqz v5, :cond_10

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    const/4 v14, 0x0

    :goto_8
    if-ge v14, v5, :cond_f

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-interface {v3, v9}, LgV8;->zza(I)Z

    move-result v10

    if-eqz v10, :cond_e

    if-eq v14, v7, :cond_d

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v7, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_e
    invoke-static {v1, v8, v9, v6, v4}, LX39;->b(Ljava/lang/Object;IILjava/lang/Object;LQ69;)Ljava/lang/Object;

    move-result-object v6

    :goto_9
    add-int/lit8 v14, v14, 0x1

    goto :goto_8

    :cond_f
    if-eq v7, v5, :cond_12

    invoke-interface {v13, v7, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    return v2

    :cond_10
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_11
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v3, v7}, LgV8;->zza(I)Z

    move-result v9

    if-nez v9, :cond_11

    invoke-static {v1, v8, v7, v6, v4}, LX39;->b(Ljava/lang/Object;IILjava/lang/Object;LQ69;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_a

    :cond_12
    move v1, v2

    goto/16 :goto_29

    :pswitch_3
    if-ne v6, v14, :cond_4a

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    if-ltz v4, :cond_1a

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_19

    if-nez v4, :cond_13

    sget-object v4, LfO8;->c:LfO8;

    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_13
    invoke-static {v3, v1, v4}, LfO8;->v([BII)LfO8;

    move-result-object v6

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/2addr v1, v4

    :goto_c
    if-ge v1, v5, :cond_18

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_14

    goto :goto_d

    :cond_14
    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    if-ltz v4, :cond_17

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_16

    if-nez v4, :cond_15

    sget-object v4, LfO8;->c:LfO8;

    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_15
    invoke-static {v3, v1, v4}, LfO8;->v([BII)LfO8;

    move-result-object v6

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_16
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_17
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->d()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_18
    :goto_d
    return v1

    :cond_19
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_1a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->d()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :pswitch_4
    if-ne v6, v14, :cond_4a

    invoke-virtual {v0, v9}, LU19;->g(I)LF39;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v13

    move-object/from16 p12, p14

    invoke-static/range {p6 .. p12}, LLK8;->e(LF39;I[BIILNV8;LzK8;)I

    move-result v1

    return v1

    :pswitch_5
    if-ne v6, v14, :cond_4a

    const-wide/32 v8, 0x20000000

    and-long v8, p9, v8

    cmp-long v1, v8, v11

    const-string v6, ""

    if-nez v1, :cond_1f

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    if-ltz v4, :cond_1e

    if-nez v4, :cond_1b

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1b
    new-instance v8, Ljava/lang/String;

    sget-object v9, LXV8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v1, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_e
    add-int/2addr v1, v4

    :goto_f
    if-ge v1, v5, :cond_4b

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v8, v7, LzK8;->a:I

    if-ne v2, v8, :cond_4b

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    if-ltz v4, :cond_1d

    if-nez v4, :cond_1c

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1c
    new-instance v8, Ljava/lang/String;

    sget-object v9, LXV8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v1, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->d()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_1e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->d()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_1f
    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    if-ltz v4, :cond_25

    if-nez v4, :cond_20

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_20
    add-int v8, v1, v4

    invoke-static {v3, v1, v8}, LZ89;->e([BII)Z

    move-result v9

    if-eqz v9, :cond_24

    new-instance v9, Ljava/lang/String;

    sget-object v10, LXV8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v1, v4, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v13, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_10
    move v1, v8

    :goto_11
    if-ge v1, v5, :cond_4b

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v8, v7, LzK8;->a:I

    if-ne v2, v8, :cond_4b

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v4, v7, LzK8;->a:I

    if-ltz v4, :cond_23

    if-nez v4, :cond_21

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_21
    add-int v8, v1, v4

    invoke-static {v3, v1, v8}, LZ89;->e([BII)Z

    move-result v9

    if-eqz v9, :cond_22

    new-instance v9, Ljava/lang/String;

    sget-object v10, LXV8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v1, v4, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v13, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->c()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_23
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->d()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_24
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->c()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_25
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->d()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :pswitch_6
    if-ne v6, v14, :cond_29

    check-cast v13, LXK8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_12
    if-ge v1, v2, :cond_27

    invoke-static {v3, v1, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v4, v7, LzK8;->b:J

    cmp-long v4, v4, v11

    if-eqz v4, :cond_26

    move v4, v15

    goto :goto_13

    :cond_26
    const/4 v4, 0x0

    :goto_13
    invoke-virtual {v13, v4}, LXK8;->b(Z)V

    goto :goto_12

    :cond_27
    if-ne v1, v2, :cond_28

    goto/16 :goto_29

    :cond_28
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_29
    if-nez v6, :cond_4a

    check-cast v13, LXK8;

    invoke-static {v3, v4, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v8, v7, LzK8;->b:J

    cmp-long v4, v8, v11

    if-eqz v4, :cond_2a

    move v4, v15

    goto :goto_14

    :cond_2a
    const/4 v4, 0x0

    :goto_14
    invoke-virtual {v13, v4}, LXK8;->b(Z)V

    :goto_15
    if-ge v1, v5, :cond_2d

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_2b

    goto :goto_17

    :cond_2b
    invoke-static {v3, v4, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v8, v7, LzK8;->b:J

    cmp-long v4, v8, v11

    if-eqz v4, :cond_2c

    move v4, v15

    goto :goto_16

    :cond_2c
    const/4 v4, 0x0

    :goto_16
    invoke-virtual {v13, v4}, LXK8;->b(Z)V

    goto :goto_15

    :cond_2d
    :goto_17
    return v1

    :pswitch_7
    if-ne v6, v14, :cond_30

    check-cast v13, LAU8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_18
    if-ge v1, v2, :cond_2e

    invoke-static {v3, v1}, LLK8;->b([BI)I

    move-result v4

    invoke-virtual {v13, v4}, LAU8;->zzh(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_18

    :cond_2e
    if-ne v1, v2, :cond_2f

    goto/16 :goto_29

    :cond_2f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_30
    if-ne v6, v10, :cond_4a

    check-cast v13, LAU8;

    invoke-static/range {p2 .. p3}, LLK8;->b([BI)I

    move-result v1

    invoke-virtual {v13, v1}, LAU8;->zzh(I)V

    :goto_19
    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_32

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_31

    goto :goto_1a

    :cond_31
    invoke-static {v3, v4}, LLK8;->b([BI)I

    move-result v1

    invoke-virtual {v13, v1}, LAU8;->zzh(I)V

    goto :goto_19

    :cond_32
    :goto_1a
    return v1

    :pswitch_8
    if-ne v6, v14, :cond_35

    check-cast v13, LIY8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_1b
    if-ge v1, v2, :cond_33

    invoke-static {v3, v1}, LLK8;->p([BI)J

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, LIY8;->c(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_1b

    :cond_33
    if-ne v1, v2, :cond_34

    goto/16 :goto_29

    :cond_34
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_35
    if-ne v6, v15, :cond_4a

    check-cast v13, LIY8;

    invoke-static/range {p2 .. p3}, LLK8;->p([BI)J

    move-result-wide v8

    invoke-virtual {v13, v8, v9}, LIY8;->c(J)V

    :goto_1c
    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_37

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_36

    goto :goto_1d

    :cond_36
    invoke-static {v3, v4}, LLK8;->p([BI)J

    move-result-wide v8

    invoke-virtual {v13, v8, v9}, LIY8;->c(J)V

    goto :goto_1c

    :cond_37
    :goto_1d
    return v1

    :pswitch_9
    if-ne v6, v14, :cond_38

    invoke-static {v3, v4, v13, v7}, LLK8;->f([BILNV8;LzK8;)I

    move-result v1

    goto/16 :goto_29

    :cond_38
    if-nez v6, :cond_4a

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v13

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, LLK8;->l(I[BIILNV8;LzK8;)I

    move-result v1

    return v1

    :pswitch_a
    if-ne v6, v14, :cond_3b

    check-cast v13, LIY8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_1e
    if-ge v1, v2, :cond_39

    invoke-static {v3, v1, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v4, v7, LzK8;->b:J

    invoke-virtual {v13, v4, v5}, LIY8;->c(J)V

    goto :goto_1e

    :cond_39
    if-ne v1, v2, :cond_3a

    goto/16 :goto_29

    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_3b
    if-nez v6, :cond_4a

    check-cast v13, LIY8;

    invoke-static {v3, v4, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v8, v7, LzK8;->b:J

    invoke-virtual {v13, v8, v9}, LIY8;->c(J)V

    :goto_1f
    if-ge v1, v5, :cond_3d

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_3c

    goto :goto_20

    :cond_3c
    invoke-static {v3, v4, v7}, LLK8;->m([BILzK8;)I

    move-result v1

    iget-wide v8, v7, LzK8;->b:J

    invoke-virtual {v13, v8, v9}, LIY8;->c(J)V

    goto :goto_1f

    :cond_3d
    :goto_20
    return v1

    :pswitch_b
    if-ne v6, v14, :cond_40

    check-cast v13, LoS8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_21
    if-ge v1, v2, :cond_3e

    invoke-static {v3, v1}, LLK8;->b([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v13, v4}, LoS8;->b(F)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_21

    :cond_3e
    if-ne v1, v2, :cond_3f

    goto/16 :goto_29

    :cond_3f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_40
    if-ne v6, v10, :cond_4a

    check-cast v13, LoS8;

    invoke-static/range {p2 .. p3}, LLK8;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v13, v1}, LoS8;->b(F)V

    :goto_22
    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_42

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_41

    goto :goto_23

    :cond_41
    invoke-static {v3, v4}, LLK8;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v13, v1}, LoS8;->b(F)V

    goto :goto_22

    :cond_42
    :goto_23
    return v1

    :pswitch_c
    if-ne v6, v14, :cond_45

    check-cast v13, LmQ8;

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v1

    iget v2, v7, LzK8;->a:I

    add-int/2addr v2, v1

    :goto_24
    if-ge v1, v2, :cond_43

    invoke-static {v3, v1}, LLK8;->p([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, LmQ8;->b(D)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_24

    :cond_43
    if-ne v1, v2, :cond_44

    goto :goto_29

    :cond_44
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v1

    throw v1

    :cond_45
    if-ne v6, v15, :cond_4a

    check-cast v13, LmQ8;

    invoke-static/range {p2 .. p3}, LLK8;->p([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v13, v8, v9}, LmQ8;->b(D)V

    :goto_25
    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_47

    invoke-static {v3, v1, v7}, LLK8;->j([BILzK8;)I

    move-result v4

    iget v6, v7, LzK8;->a:I

    if-eq v2, v6, :cond_46

    goto :goto_26

    :cond_46
    invoke-static {v3, v4}, LLK8;->p([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v13, v8, v9}, LmQ8;->b(D)V

    goto :goto_25

    :cond_47
    :goto_26
    return v1

    :goto_27
    if-ge v4, v5, :cond_49

    invoke-static {v3, v4, v7}, LLK8;->j([BILzK8;)I

    move-result v8

    iget v9, v7, LzK8;->a:I

    if-eq v2, v9, :cond_48

    goto :goto_28

    :cond_48
    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, v8

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, LLK8;->c(LF39;[BIIILzK8;)I

    move-result v4

    iget-object v8, v7, LzK8;->c:Ljava/lang/Object;

    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_49
    :goto_28
    return v4

    :cond_4a
    move v1, v4

    :cond_4b
    :goto_29
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final L(I)I
    .locals 1

    iget v0, p0, LU19;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, LU19;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LU19;->O(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final M(II)I
    .locals 1

    iget v0, p0, LU19;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, LU19;->d:I

    if-gt p1, v0, :cond_0

    invoke-virtual {p0, p1, p2}, LU19;->O(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final N(I)I
    .locals 1

    iget-object v0, p0, LU19;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final O(II)I
    .locals 5

    iget-object v0, p0, LU19;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v2, v0, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    iget-object v4, p0, LU19;->a:[I

    aget v4, v4, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final Q(I)I
    .locals 1

    iget-object v0, p0, LU19;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1}, LU19;->l(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LU19;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, LU19;->Q(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    iget-object v3, p0, LU19;->a:[I

    aget v3, v3, v0

    invoke-static {v1}, LU19;->P(I)I

    move-result v1

    int-to-long v4, v2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, LU19;->n(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p2, v3, v0}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lm89;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v3, v0}, LU19;->p(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, LU19;->n(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p2, v3, v0}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lm89;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v3, v0}, LU19;->p(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_4
    sget-object v1, LX39;->a:Ljava/lang/Class;

    invoke-static {p1, v4, v5}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v4, v5}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lv09;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lm89;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_5
    iget-object v1, p0, LU19;->k:LyY8;

    invoke-virtual {v1, p1, p2, v4, v5}, LyY8;->b(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, LU19;->m(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lm89;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lm89;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lm89;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, LU19;->m(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lm89;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->r(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_12
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lm89;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lm89;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_15
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lm89;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_16
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->g(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lm89;->u(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_17
    invoke-virtual {p0, p2, v0}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lm89;->t(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, v0}, LU19;->o(Ljava/lang/Object;I)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, LU19;->l:LQ69;

    invoke-static {v0, p1, p2}, LX39;->c(LQ69;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean p1, p0, LU19;->f:Z

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, LU19;->m:LdR8;

    invoke-virtual {p1, p2}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1

    nop

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

.method public final b(Ljava/lang/Object;)Z
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const/4 v8, 0x0

    const v9, 0xfffff

    move v1, v8

    move v10, v1

    move v0, v9

    :goto_0
    iget v2, v6, LU19;->i:I

    const/4 v11, 0x0

    const/4 v3, 0x1

    if-ge v10, v2, :cond_b

    iget-object v2, v6, LU19;->h:[I

    aget v12, v2, v10

    iget-object v2, v6, LU19;->a:[I

    aget v13, v2, v12

    invoke-virtual {v6, v12}, LU19;->Q(I)I

    move-result v14

    iget-object v2, v6, LU19;->a:[I

    add-int/lit8 v4, v12, 0x2

    aget v2, v2, v4

    and-int v4, v2, v9

    ushr-int/lit8 v2, v2, 0x14

    shl-int v15, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v9, :cond_0

    int-to-long v0, v4

    sget-object v2, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {v2, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v17, v1

    move/from16 v16, v4

    goto :goto_1

    :cond_1
    move/from16 v16, v0

    move/from16 v17, v1

    :goto_1
    const/high16 v0, 0x10000000

    and-int/2addr v0, v14

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-virtual/range {v0 .. v5}, LU19;->v(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v8

    :cond_3
    :goto_2
    invoke-static {v14}, LU19;->P(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_9

    const/16 v1, 0x11

    if-eq v0, v1, :cond_9

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_7

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_6

    const/16 v1, 0x44

    if-eq v0, v1, :cond_6

    const/16 v1, 0x31

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    and-int v0, v14, v9

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm09;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v6, v12}, LU19;->h(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld09;

    throw v11

    :cond_6
    invoke-virtual {v6, v7, v13, v12}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6, v12}, LU19;->g(I)LF39;

    move-result-object v0

    invoke-static {v7, v14, v0}, LU19;->w(Ljava/lang/Object;ILF39;)Z

    move-result v0

    if-nez v0, :cond_a

    return v8

    :cond_7
    and-int v0, v14, v9

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v6, v12}, LU19;->g(I)LF39;

    move-result-object v1

    move v2, v8

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_a

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, LF39;->b(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    return v8

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-virtual/range {v0 .. v5}, LU19;->v(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6, v12}, LU19;->g(I)LF39;

    move-result-object v0

    invoke-static {v7, v14, v0}, LU19;->w(Ljava/lang/Object;ILF39;)Z

    move-result v0

    if-nez v0, :cond_a

    return v8

    :cond_a
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_b
    iget-boolean v0, v6, LU19;->f:Z

    if-nez v0, :cond_c

    return v3

    :cond_c
    iget-object v0, v6, LU19;->m:LdR8;

    invoke-virtual {v0, v7}, LdR8;->a(Ljava/lang/Object;)LSR8;

    throw v11
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    iget-object v0, p0, LU19;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, LU19;->Q(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    invoke-static {v3}, LU19;->P(I)I

    move-result v3

    int-to-long v5, v5

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, v2}, LU19;->N(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto :goto_1

    :pswitch_2
    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_1
    if-nez v3, :cond_1

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LX39;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :pswitch_12
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :pswitch_13
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, Lm89;->g(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_3

    :pswitch_14
    invoke-virtual {p0, p1, p2, v2}, LU19;->t(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :cond_0
    :goto_2
    return v1

    :cond_1
    :goto_3
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, LU19;->l:LQ69;

    invoke-virtual {v0, p1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LU19;->l:LQ69;

    invoke-virtual {v2, p2}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, LU19;->f:Z

    if-nez v0, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    iget-object v0, p0, LU19;->m:LdR8;

    invoke-virtual {v0, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    iget-object p1, p0, LU19;->m:LdR8;

    invoke-virtual {p1, p2}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1

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

.method public final d(Ljava/lang/Object;Lba9;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, LU19;->g:Z

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const v7, 0xfffff

    if-eqz v3, :cond_3

    iget-boolean v3, v0, LU19;->f:Z

    if-nez v3, :cond_2

    iget-object v3, v0, LU19;->a:[I

    array-length v3, v3

    move v4, v6

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-virtual {v0, v4}, LU19;->Q(I)I

    move-result v8

    iget-object v9, v0, LU19;->a:[I

    aget v9, v9, v4

    invoke-static {v8}, LU19;->P(I)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v4}, LU19;->g(I)LF39;

    move-result-object v10

    invoke-interface {v2, v9, v8, v10}, Lba9;->I(ILjava/lang/Object;LF39;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->y(IJ)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->H(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->v(II)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->G(IJ)V

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->H(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->F(II)V

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->H(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->i(II)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->H(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->z(II)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LfO8;

    invoke-interface {v2, v9, v8}, Lba9;->B(ILfO8;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v4}, LU19;->g(I)LF39;

    move-result-object v10

    invoke-interface {v2, v9, v8, v10}, Lba9;->E(ILjava/lang/Object;LF39;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9, v8, v2}, LU19;->A(ILjava/lang/Object;Lba9;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->z(Ljava/lang/Object;J)Z

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->f(IZ)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->H(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->h(II)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->k(IJ)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->H(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->o(II)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->D(IJ)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->m(IJ)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->F(Ljava/lang/Object;J)F

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->j(IF)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {v0, v1, v9, v4}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, LU19;->E(Ljava/lang/Object;J)D

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->g(ID)V

    goto/16 :goto_1

    :pswitch_12
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v2, v9, v8, v4}, LU19;->s(Lba9;ILjava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_13
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v4}, LU19;->g(I)LF39;

    move-result-object v10

    invoke-static {v9, v8, v2, v10}, LX39;->l(ILjava/util/List;Lba9;LF39;)V

    goto/16 :goto_1

    :pswitch_14
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->s(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_15
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->r(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_16
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->q(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_17
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->p(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_18
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->h(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_19
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->u(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_1a
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->e(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_1b
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->i(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_1c
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->j(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_1d
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->m(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_1e
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->v(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_1f
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->n(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_20
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->k(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_21
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v5}, LX39;->g(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_22
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->s(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_23
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->r(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_24
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->q(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_25
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->p(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_26
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->h(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_27
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->u(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_28
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2}, LX39;->f(ILjava/util/List;Lba9;)V

    goto/16 :goto_1

    :pswitch_29
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v4}, LU19;->g(I)LF39;

    move-result-object v10

    invoke-static {v9, v8, v2, v10}, LX39;->o(ILjava/util/List;Lba9;LF39;)V

    goto/16 :goto_1

    :pswitch_2a
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2}, LX39;->t(ILjava/util/List;Lba9;)V

    goto/16 :goto_1

    :pswitch_2b
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->e(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_2c
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->i(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_2d
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->j(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_2e
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->m(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_2f
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->v(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_30
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->n(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_31
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->k(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_32
    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, LX39;->g(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v4}, LU19;->g(I)LF39;

    move-result-object v10

    invoke-interface {v2, v9, v8, v10}, Lba9;->I(ILjava/lang/Object;LF39;)V

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->y(IJ)V

    goto/16 :goto_1

    :pswitch_35
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->v(II)V

    goto/16 :goto_1

    :pswitch_36
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->G(IJ)V

    goto/16 :goto_1

    :pswitch_37
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->F(II)V

    goto/16 :goto_1

    :pswitch_38
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->i(II)V

    goto/16 :goto_1

    :pswitch_39
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->z(II)V

    goto/16 :goto_1

    :pswitch_3a
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LfO8;

    invoke-interface {v2, v9, v8}, Lba9;->B(ILfO8;)V

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v4}, LU19;->g(I)LF39;

    move-result-object v10

    invoke-interface {v2, v9, v8, v10}, Lba9;->E(ILjava/lang/Object;LF39;)V

    goto/16 :goto_1

    :pswitch_3c
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9, v8, v2}, LU19;->A(ILjava/lang/Object;Lba9;)V

    goto/16 :goto_1

    :pswitch_3d
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->f(IZ)V

    goto/16 :goto_1

    :pswitch_3e
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->h(II)V

    goto :goto_1

    :pswitch_3f
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->k(IJ)V

    goto :goto_1

    :pswitch_40
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->o(II)V

    goto :goto_1

    :pswitch_41
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->D(IJ)V

    goto :goto_1

    :pswitch_42
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->m(IJ)V

    goto :goto_1

    :pswitch_43
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->g(Ljava/lang/Object;J)F

    move-result v8

    invoke-interface {v2, v9, v8}, Lba9;->j(IF)V

    goto :goto_1

    :pswitch_44
    invoke-virtual {v0, v1, v4}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v7

    int-to-long v10, v8

    invoke-static {v1, v10, v11}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide v10

    invoke-interface {v2, v9, v10, v11}, Lba9;->g(ID)V

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v3, v0, LU19;->l:LQ69;

    invoke-virtual {v3, v1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, LQ69;->i(Ljava/lang/Object;Lba9;)V

    return-void

    :cond_2
    iget-object v2, v0, LU19;->m:LdR8;

    invoke-virtual {v2, v1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    throw v4

    :cond_3
    iget-boolean v3, v0, LU19;->f:Z

    if-nez v3, :cond_9

    iget-object v3, v0, LU19;->a:[I

    array-length v3, v3

    sget-object v4, LU19;->q:Lsun/misc/Unsafe;

    move v8, v6

    move v10, v8

    move v9, v7

    :goto_2
    if-ge v8, v3, :cond_8

    invoke-virtual {v0, v8}, LU19;->Q(I)I

    move-result v11

    iget-object v12, v0, LU19;->a:[I

    aget v13, v12, v8

    invoke-static {v11}, LU19;->P(I)I

    move-result v14

    const/16 v15, 0x11

    if-gt v14, v15, :cond_5

    add-int/lit8 v15, v8, 0x2

    aget v12, v12, v15

    and-int v15, v12, v7

    if-eq v15, v9, :cond_4

    int-to-long v9, v15

    invoke-virtual {v4, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v10

    move v9, v15

    :cond_4
    ushr-int/lit8 v12, v12, 0x14

    shl-int v12, v5, v12

    goto :goto_3

    :cond_5
    move v12, v6

    :goto_3
    and-int/2addr v11, v7

    int-to-long v6, v11

    packed-switch v14, :pswitch_data_1

    :cond_6
    :goto_4
    const/4 v14, 0x0

    goto/16 :goto_6

    :pswitch_45
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v8}, LU19;->g(I)LF39;

    move-result-object v7

    invoke-interface {v2, v13, v6, v7}, Lba9;->I(ILjava/lang/Object;LF39;)V

    goto :goto_4

    :pswitch_46
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->y(IJ)V

    goto :goto_4

    :pswitch_47
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->H(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->v(II)V

    goto :goto_4

    :pswitch_48
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->G(IJ)V

    goto :goto_4

    :pswitch_49
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->H(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->F(II)V

    goto :goto_4

    :pswitch_4a
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->H(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->i(II)V

    goto :goto_4

    :pswitch_4b
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->H(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->z(II)V

    goto :goto_4

    :pswitch_4c
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LfO8;

    invoke-interface {v2, v13, v6}, Lba9;->B(ILfO8;)V

    goto :goto_4

    :pswitch_4d
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v8}, LU19;->g(I)LF39;

    move-result-object v7

    invoke-interface {v2, v13, v6, v7}, Lba9;->E(ILjava/lang/Object;LF39;)V

    goto/16 :goto_4

    :pswitch_4e
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13, v6, v2}, LU19;->A(ILjava/lang/Object;Lba9;)V

    goto/16 :goto_4

    :pswitch_4f
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->z(Ljava/lang/Object;J)Z

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->f(IZ)V

    goto/16 :goto_4

    :pswitch_50
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->H(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->h(II)V

    goto/16 :goto_4

    :pswitch_51
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->k(IJ)V

    goto/16 :goto_4

    :pswitch_52
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->H(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->o(II)V

    goto/16 :goto_4

    :pswitch_53
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->D(IJ)V

    goto/16 :goto_4

    :pswitch_54
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->m(IJ)V

    goto/16 :goto_4

    :pswitch_55
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->F(Ljava/lang/Object;J)F

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->j(IF)V

    goto/16 :goto_4

    :pswitch_56
    invoke-virtual {v0, v1, v13, v8}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v1, v6, v7}, LU19;->E(Ljava/lang/Object;J)D

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->g(ID)V

    goto/16 :goto_4

    :pswitch_57
    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v2, v13, v6, v8}, LU19;->s(Lba9;ILjava/lang/Object;I)V

    goto/16 :goto_4

    :pswitch_58
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v0, v8}, LU19;->g(I)LF39;

    move-result-object v7

    invoke-static {v11, v6, v2, v7}, LX39;->l(ILjava/util/List;Lba9;LF39;)V

    goto/16 :goto_4

    :pswitch_59
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->s(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_5a
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->r(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_5b
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->q(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_5c
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->p(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_5d
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->h(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_5e
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->u(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_5f
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->e(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_60
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->i(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_61
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->j(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_62
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->m(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_63
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->v(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_64
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->n(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_65
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->k(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_66
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, LX39;->g(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_4

    :pswitch_67
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v11, v6, v2, v12}, LX39;->s(ILjava/util/List;Lba9;Z)V

    goto :goto_5

    :pswitch_68
    const/4 v12, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v12}, LX39;->r(ILjava/util/List;Lba9;Z)V

    goto :goto_5

    :pswitch_69
    const/4 v12, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v12}, LX39;->q(ILjava/util/List;Lba9;Z)V

    goto :goto_5

    :pswitch_6a
    const/4 v12, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v12}, LX39;->p(ILjava/util/List;Lba9;Z)V

    goto :goto_5

    :pswitch_6b
    const/4 v12, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v12}, LX39;->h(ILjava/util/List;Lba9;Z)V

    goto :goto_5

    :pswitch_6c
    const/4 v12, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v12}, LX39;->u(ILjava/util/List;Lba9;Z)V

    :goto_5
    move v14, v12

    goto/16 :goto_6

    :pswitch_6d
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2}, LX39;->f(ILjava/util/List;Lba9;)V

    goto/16 :goto_4

    :pswitch_6e
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v0, v8}, LU19;->g(I)LF39;

    move-result-object v7

    invoke-static {v11, v6, v2, v7}, LX39;->o(ILjava/util/List;Lba9;LF39;)V

    goto/16 :goto_4

    :pswitch_6f
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2}, LX39;->t(ILjava/util/List;Lba9;)V

    goto/16 :goto_4

    :pswitch_70
    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    const/4 v14, 0x0

    invoke-static {v11, v6, v2, v14}, LX39;->e(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_71
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->i(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_72
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->j(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_73
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->m(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_74
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->v(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_75
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->n(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_76
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->k(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_77
    const/4 v14, 0x0

    iget-object v11, v0, LU19;->a:[I

    aget v11, v11, v8

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v11, v6, v2, v14}, LX39;->g(ILjava/util/List;Lba9;Z)V

    goto/16 :goto_6

    :pswitch_78
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v8}, LU19;->g(I)LF39;

    move-result-object v7

    invoke-interface {v2, v13, v6, v7}, Lba9;->I(ILjava/lang/Object;LF39;)V

    goto/16 :goto_6

    :pswitch_79
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->y(IJ)V

    goto/16 :goto_6

    :pswitch_7a
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->v(II)V

    goto/16 :goto_6

    :pswitch_7b
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->G(IJ)V

    goto/16 :goto_6

    :pswitch_7c
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->F(II)V

    goto/16 :goto_6

    :pswitch_7d
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->i(II)V

    goto/16 :goto_6

    :pswitch_7e
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->z(II)V

    goto/16 :goto_6

    :pswitch_7f
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LfO8;

    invoke-interface {v2, v13, v6}, Lba9;->B(ILfO8;)V

    goto/16 :goto_6

    :pswitch_80
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v8}, LU19;->g(I)LF39;

    move-result-object v7

    invoke-interface {v2, v13, v6, v7}, Lba9;->E(ILjava/lang/Object;LF39;)V

    goto/16 :goto_6

    :pswitch_81
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13, v6, v2}, LU19;->A(ILjava/lang/Object;Lba9;)V

    goto/16 :goto_6

    :pswitch_82
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-static {v1, v6, v7}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->f(IZ)V

    goto :goto_6

    :pswitch_83
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->h(II)V

    goto :goto_6

    :pswitch_84
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->k(IJ)V

    goto :goto_6

    :pswitch_85
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->o(II)V

    goto :goto_6

    :pswitch_86
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->D(IJ)V

    goto :goto_6

    :pswitch_87
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-virtual {v4, v1, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->m(IJ)V

    goto :goto_6

    :pswitch_88
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-static {v1, v6, v7}, Lm89;->g(Ljava/lang/Object;J)F

    move-result v6

    invoke-interface {v2, v13, v6}, Lba9;->j(IF)V

    goto :goto_6

    :pswitch_89
    const/4 v14, 0x0

    and-int v11, v10, v12

    if-eqz v11, :cond_7

    invoke-static {v1, v6, v7}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide v6

    invoke-interface {v2, v13, v6, v7}, Lba9;->g(ID)V

    :cond_7
    :goto_6
    add-int/lit8 v8, v8, 0x3

    move v6, v14

    const v7, 0xfffff

    goto/16 :goto_2

    :cond_8
    iget-object v3, v0, LU19;->l:LQ69;

    invoke-virtual {v3, v1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, LQ69;->i(Ljava/lang/Object;Lba9;)V

    return-void

    :cond_9
    iget-object v2, v0, LU19;->m:LdR8;

    invoke-virtual {v2, v1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    throw v4

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

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;[BIILzK8;)V
    .locals 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    iget-boolean v0, v15, LU19;->g:Z

    if-eqz v0, :cond_17

    invoke-static/range {p1 .. p1}, LU19;->l(Ljava/lang/Object;)V

    sget-object v9, LU19;->q:Lsun/misc/Unsafe;

    const/4 v10, -0x1

    const/16 v16, 0x0

    const v8, 0xfffff

    move/from16 v0, p3

    move v7, v8

    move v1, v10

    move/from16 v2, v16

    move v6, v2

    :goto_0
    if-ge v0, v13, :cond_14

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v3, v11}, LLK8;->k(I[BILzK8;)I

    move-result v0

    iget v3, v11, LzK8;->a:I

    move v4, v0

    move/from16 v17, v3

    goto :goto_1

    :cond_0
    move/from16 v17, v0

    move v4, v3

    :goto_1
    ushr-int/lit8 v5, v17, 0x3

    if-le v5, v1, :cond_1

    div-int/lit8 v2, v2, 0x3

    invoke-virtual {v15, v5, v2}, LU19;->M(II)I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v5}, LU19;->L(I)I

    move-result v0

    :goto_2
    move v2, v0

    if-ne v2, v10, :cond_2

    move v2, v4

    move/from16 v23, v5

    move-object/from16 v29, v9

    move/from16 v18, v10

    move/from16 v15, v16

    goto/16 :goto_12

    :cond_2
    and-int/lit8 v3, v17, 0x7

    iget-object v0, v15, LU19;->a:[I

    add-int/lit8 v1, v2, 0x1

    aget v1, v0, v1

    invoke-static {v1}, LU19;->P(I)I

    move-result v13

    and-int v10, v1, v8

    move-object/from16 v19, v9

    int-to-long v8, v10

    const/16 v10, 0x11

    move/from16 p3, v5

    if-gt v13, v10, :cond_b

    add-int/lit8 v10, v2, 0x2

    aget v0, v0, v10

    ushr-int/lit8 v10, v0, 0x14

    const/4 v5, 0x1

    shl-int v10, v5, v10

    const v15, 0xfffff

    and-int/2addr v0, v15

    move/from16 v22, v1

    move/from16 v20, v2

    if-eq v0, v7, :cond_5

    if-eq v7, v15, :cond_3

    int-to-long v1, v7

    move-object/from16 v7, v19

    invoke-virtual {v7, v14, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_3

    :cond_3
    move-object/from16 v7, v19

    :goto_3
    if-eq v0, v15, :cond_4

    int-to-long v1, v0

    invoke-virtual {v7, v14, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move v6, v1

    :cond_4
    move-object v2, v7

    move v7, v0

    goto :goto_4

    :cond_5
    move-object/from16 v2, v19

    :goto_4
    const/4 v0, 0x5

    packed-switch v13, :pswitch_data_0

    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    goto/16 :goto_d

    :pswitch_0
    if-nez v3, :cond_6

    invoke-static {v12, v4, v11}, LLK8;->m([BILzK8;)I

    move-result v13

    iget-wide v0, v11, LzK8;->b:J

    invoke-static {v0, v1}, LZO8;->b(J)J

    move-result-wide v4

    move-object v0, v2

    move-object/from16 v1, p1

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    move-wide v2, v8

    move/from16 v23, p3

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int/2addr v6, v10

    move-object v9, v7

    move v0, v13

    move v2, v15

    move/from16 v7, v20

    move/from16 v1, v23

    const v8, 0xfffff

    const/4 v10, -0x1

    move-object/from16 v15, p0

    goto/16 :goto_c

    :cond_6
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    goto/16 :goto_6

    :pswitch_1
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, LLK8;->j([BILzK8;)I

    move-result v0

    iget v1, v11, LzK8;->a:I

    invoke-static {v1}, LZO8;->a(I)I

    move-result v1

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_5

    :pswitch_2
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, LLK8;->j([BILzK8;)I

    move-result v0

    iget v1, v11, LzK8;->a:I

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_5

    :pswitch_3
    move/from16 v23, p3

    move/from16 v15, v20

    const/4 v0, 0x2

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_7

    invoke-static {v12, v4, v11}, LLK8;->a([BILzK8;)I

    move-result v0

    iget-object v1, v11, LzK8;->c:Ljava/lang/Object;

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_5
    or-int/2addr v6, v10

    move/from16 v13, p4

    move-object v9, v7

    move v2, v15

    move/from16 v7, v20

    move/from16 v1, v23

    const v8, 0xfffff

    const/4 v10, -0x1

    goto/16 :goto_14

    :pswitch_4
    move/from16 v23, p3

    move/from16 v15, v20

    const/4 v0, 0x2

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_7

    move-object/from16 v13, p0

    const v19, 0xfffff

    invoke-virtual {v13, v14, v15}, LU19;->i(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v13, v15}, LU19;->g(I)LF39;

    move-result-object v1

    move-object v0, v8

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, LLK8;->o(Ljava/lang/Object;LF39;[BIILzK8;)I

    move-result v0

    invoke-virtual {v13, v14, v15, v8}, LU19;->q(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_a

    :cond_7
    :goto_6
    move-object/from16 v13, p0

    const v19, 0xfffff

    goto/16 :goto_d

    :pswitch_5
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    const/4 v0, 0x2

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    const/high16 v0, 0x20000000

    and-int v0, v22, v0

    if-nez v0, :cond_8

    invoke-static {v12, v4, v11}, LLK8;->g([BILzK8;)I

    move-result v0

    goto :goto_7

    :cond_8
    invoke-static {v12, v4, v11}, LLK8;->h([BILzK8;)I

    move-result v0

    :goto_7
    iget-object v1, v11, LzK8;->c:Ljava/lang/Object;

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_6
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, LLK8;->m([BILzK8;)I

    move-result v0

    iget-wide v1, v11, LzK8;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_9

    goto :goto_8

    :cond_9
    move/from16 v5, v16

    :goto_8
    invoke-static {v14, v8, v9, v5}, Lm89;->r(Ljava/lang/Object;JZ)V

    goto/16 :goto_a

    :pswitch_7
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, LLK8;->b([BI)I

    move-result v0

    invoke-virtual {v7, v14, v8, v9, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_9

    :pswitch_8
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v5, :cond_a

    invoke-static {v12, v4}, LLK8;->p([BI)J

    move-result-wide v21

    move-object v0, v7

    move-object/from16 v1, p1

    move-wide v2, v8

    move v8, v4

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v0, v8, 0x8

    goto/16 :goto_a

    :pswitch_9
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, LLK8;->j([BILzK8;)I

    move-result v0

    iget v1, v11, LzK8;->a:I

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_a

    :pswitch_a
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, LLK8;->m([BILzK8;)I

    move-result v17

    iget-wide v4, v11, LzK8;->b:J

    move-object v0, v7

    move-object/from16 v1, p1

    move-wide v2, v8

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int/2addr v6, v10

    move-object v9, v7

    move v2, v15

    move/from16 v0, v17

    goto :goto_b

    :pswitch_b
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, LLK8;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v8, v9, v0}, Lm89;->u(Ljava/lang/Object;JF)V

    :goto_9
    add-int/lit8 v0, v4, 0x4

    goto :goto_a

    :pswitch_c
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v19, v15

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v5, :cond_a

    invoke-static {v12, v4}, LLK8;->p([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v8, v9, v0, v1}, Lm89;->t(Ljava/lang/Object;JD)V

    add-int/lit8 v0, v4, 0x8

    :goto_a
    or-int/2addr v6, v10

    move-object v9, v7

    move v2, v15

    :goto_b
    move/from16 v8, v19

    move/from16 v7, v20

    move/from16 v1, v23

    const/4 v10, -0x1

    move-object v15, v13

    :goto_c
    move/from16 v13, p4

    goto/16 :goto_0

    :cond_a
    :goto_d
    move v2, v4

    move-object/from16 v29, v7

    move/from16 v7, v20

    const/16 v18, -0x1

    goto/16 :goto_12

    :cond_b
    move/from16 v23, p3

    move/from16 v22, v1

    move/from16 v20, v7

    move-object v10, v15

    move-object/from16 v7, v19

    const v19, 0xfffff

    move v15, v2

    const/16 v0, 0x1b

    if-ne v13, v0, :cond_f

    const/4 v0, 0x2

    if-ne v3, v0, :cond_e

    invoke-virtual {v7, v14, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_c

    const/16 v1, 0xa

    goto :goto_e

    :cond_c
    add-int/2addr v1, v1

    :goto_e
    invoke-interface {v0, v1}, LNV8;->d(I)LNV8;

    move-result-object v0

    invoke-virtual {v7, v14, v8, v9, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_d
    move-object v5, v0

    invoke-virtual {v10, v15}, LU19;->g(I)LF39;

    move-result-object v0

    move/from16 v1, v17

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move v8, v6

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, LLK8;->e(LF39;I[BIILNV8;LzK8;)I

    move-result v0

    move/from16 v13, p4

    move-object v9, v7

    move v6, v8

    move v2, v15

    move/from16 v8, v19

    move/from16 v7, v20

    move/from16 v1, v23

    move-object v15, v10

    const/4 v10, -0x1

    goto/16 :goto_0

    :cond_e
    move v14, v4

    move/from16 v25, v6

    move-object/from16 v29, v7

    move/from16 v26, v20

    const/16 v18, -0x1

    goto/16 :goto_10

    :cond_f
    const/16 v0, 0x31

    if-gt v13, v0, :cond_11

    move/from16 v1, v22

    int-to-long v1, v1

    move-object/from16 v0, p0

    move-wide/from16 v21, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v5, v3

    move v3, v4

    move/from16 v24, v4

    move/from16 v4, p4

    move/from16 p3, v5

    move/from16 v5, v17

    move/from16 v25, v6

    move/from16 v6, v23

    move/from16 v26, v20

    move-object/from16 v20, v7

    move/from16 v7, p3

    move-wide/from16 v27, v8

    move/from16 v9, v19

    move v8, v15

    move-object/from16 v29, v20

    const/16 v18, -0x1

    move-wide/from16 v9, v21

    move v11, v13

    move-wide/from16 v12, v27

    move-object/from16 v14, p5

    invoke-virtual/range {v0 .. v14}, LU19;->K(Ljava/lang/Object;[BIIIIIIJIJLzK8;)I

    move-result v0

    move/from16 v14, v24

    if-eq v0, v14, :cond_10

    :goto_f
    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move v2, v15

    move/from16 v10, v18

    move/from16 v1, v23

    move/from16 v6, v25

    move/from16 v7, v26

    goto/16 :goto_13

    :cond_10
    move v2, v0

    goto :goto_11

    :cond_11
    move/from16 p3, v3

    move v14, v4

    move/from16 v25, v6

    move-object/from16 v29, v7

    move-wide/from16 v27, v8

    move/from16 v26, v20

    move/from16 v1, v22

    const/16 v18, -0x1

    const/16 v0, 0x32

    if-ne v13, v0, :cond_13

    move/from16 v7, p3

    const/4 v0, 0x2

    if-ne v7, v0, :cond_12

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move v5, v15

    move-wide/from16 v6, v27

    move-object/from16 v8, p5

    invoke-virtual/range {v0 .. v8}, LU19;->I(Ljava/lang/Object;[BIIIJLzK8;)I

    move-result v0

    if-eq v0, v14, :cond_10

    goto :goto_f

    :cond_12
    :goto_10
    move v2, v14

    :goto_11
    move/from16 v6, v25

    move/from16 v7, v26

    goto :goto_12

    :cond_13
    move/from16 v7, p3

    move-object/from16 v0, p0

    move v8, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move/from16 v5, v17

    move/from16 v6, v23

    move v9, v13

    move-wide/from16 v10, v27

    move v12, v15

    move-object/from16 v13, p5

    invoke-virtual/range {v0 .. v13}, LU19;->J(Ljava/lang/Object;[BIIIIIIIJILzK8;)I

    move-result v0

    if-eq v0, v14, :cond_10

    goto :goto_f

    :goto_12
    invoke-static/range {p1 .. p1}, LU19;->C(Ljava/lang/Object;)LY69;

    move-result-object v4

    move/from16 v0, v17

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, LLK8;->i(I[BIILY69;LzK8;)I

    move-result v0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move v2, v15

    move/from16 v10, v18

    move/from16 v1, v23

    :goto_13
    move-object/from16 v9, v29

    const v8, 0xfffff

    :goto_14
    move-object/from16 v15, p0

    goto/16 :goto_0

    :cond_14
    move/from16 v25, v6

    move v1, v8

    move-object/from16 v29, v9

    if-eq v7, v1, :cond_15

    int-to-long v1, v7

    move-object/from16 v3, p1

    move/from16 v6, v25

    move-object/from16 v4, v29

    invoke-virtual {v4, v3, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_15
    move/from16 v4, p4

    if-ne v0, v4, :cond_16

    return-void

    :cond_16
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->e()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object v0

    throw v0

    :cond_17
    move v4, v13

    move-object v3, v14

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v6, p5

    invoke-virtual/range {v0 .. v6}, LU19;->B(Ljava/lang/Object;[BIIILzK8;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(I)LgV8;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, LU19;->b:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, LgV8;

    return-object p1
.end method

.method public final g(I)LF39;
    .locals 3

    iget-object v0, p0, LU19;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    aget-object v0, v0, p1

    check-cast v0, LF39;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LR29;->a()LR29;

    move-result-object v0

    iget-object v1, p0, LU19;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, LR29;->b(Ljava/lang/Class;)LF39;

    move-result-object v0

    iget-object v1, p0, LU19;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final h(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, LU19;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final i(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, LU19;->g(I)LF39;

    move-result-object v0

    invoke-virtual {p0, p2}, LU19;->Q(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    invoke-virtual {p0, p1, p2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, LF39;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    int-to-long v1, v1

    sget-object p2, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LU19;->x(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, LF39;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final j(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p3}, LU19;->g(I)LF39;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, LU19;->y(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, LF39;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, LU19;->Q(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LU19;->x(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, LF39;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final m(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2, p3}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, LU19;->Q(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    sget-object v1, LU19;->q:Lsun/misc/Unsafe;

    int-to-long v2, v0

    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p3}, LU19;->g(I)LF39;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, LU19;->x(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LF39;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v0}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, LU19;->o(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LU19;->x(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, LF39;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v0}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, LU19;->a:[I

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    iget-object v0, p0, LU19;->a:[I

    aget v0, v0, p3

    invoke-virtual {p0, p2, v0, p3}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, LU19;->Q(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    sget-object v2, LU19;->q:Lsun/misc/Unsafe;

    int-to-long v3, v1

    invoke-virtual {v2, p2, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, p3}, LU19;->g(I)LF39;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v1}, LU19;->x(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2, p1, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LF39;->zze()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v1}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, LU19;->p(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LU19;->x(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, LF39;->zze()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v1}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, LU19;->a:[I

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(Ljava/lang/Object;I)V
    .locals 4

    invoke-virtual {p0, p2}, LU19;->N(I)I

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

    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lm89;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final p(Ljava/lang/Object;II)V
    .locals 2

    invoke-virtual {p0, p3}, LU19;->N(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lm89;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final q(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    sget-object v0, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, LU19;->Q(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LU19;->o(Ljava/lang/Object;I)V

    return-void
.end method

.method public final r(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    sget-object v0, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, LU19;->Q(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, LU19;->p(Ljava/lang/Object;II)V

    return-void
.end method

.method public final s(Lba9;ILjava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p4}, LU19;->h(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld09;

    const/4 p1, 0x0

    throw p1
.end method

.method public final t(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    invoke-virtual {p0, p1, p3}, LU19;->u(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, LU19;->u(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final u(Ljava/lang/Object;I)Z
    .locals 7

    invoke-virtual {p0, p2}, LU19;->N(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-virtual {p0, p2}, LU19;->Q(I)I

    move-result p2

    and-int v0, p2, v1

    invoke-static {p2}, LU19;->P(I)I

    move-result p2

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, LfO8;->c:LfO8;

    invoke-static {p1, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, LfO8;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v6

    :cond_9
    return v5

    :cond_a
    instance-of p2, p1, LfO8;

    if-eqz p2, :cond_c

    sget-object p2, LfO8;->c:LfO8;

    invoke-virtual {p2, p1}, LfO8;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lm89;->g(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    invoke-static {p1, v2, v3}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

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

.method public final v(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final y(Ljava/lang/Object;II)Z
    .locals 2

    invoke-virtual {p0, p3}, LU19;->N(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lm89;->h(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 11

    iget-boolean v0, p0, LU19;->g:Z

    if-eqz v0, :cond_5

    sget-object v0, LU19;->q:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    iget-object v4, p0, LU19;->a:[I

    array-length v4, v4

    if-ge v2, v4, :cond_4

    invoke-virtual {p0, v2}, LU19;->Q(I)I

    move-result v4

    invoke-static {v4}, LU19;->P(I)I

    move-result v5

    iget-object v6, p0, LU19;->a:[I

    aget v6, v6, v2

    const v7, 0xfffff

    and-int/2addr v4, v7

    sget-object v7, LdS8;->R:LdS8;

    invoke-virtual {v7}, LdS8;->zza()I

    move-result v7

    if-lt v5, v7, :cond_0

    sget-object v7, LdS8;->u0:LdS8;

    invoke-virtual {v7}, LdS8;->zza()I

    move-result v7

    if-gt v5, v7, :cond_0

    iget-object v7, p0, LU19;->a:[I

    add-int/lit8 v8, v2, 0x2

    aget v7, v7, v8

    :cond_0
    int-to-long v7, v4

    const/16 v4, 0x3f

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr19;

    invoke-virtual {p0, v2}, LU19;->g(I)LF39;

    move-result-object v5

    invoke-static {v6, v4, v5}, LQP8;->u(ILr19;LF39;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p1, v7, v8}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v7

    shl-int/lit8 v5, v6, 0x3

    add-long v9, v7, v7

    shr-long v6, v7, v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v4

    xor-long v5, v9, v6

    invoke-static {v5, v6}, LQP8;->z(J)I

    move-result v5

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LU19;->H(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    xor-int/2addr v4, v6

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_3
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_4
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LU19;->H(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->v(I)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LU19;->H(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_7
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfO8;

    shl-int/lit8 v5, v6, 0x3

    sget-object v6, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v4}, LfO8;->c()I

    move-result v4

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    add-int/2addr v6, v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_4

    :pswitch_8
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LU19;->g(I)LF39;

    move-result-object v5

    invoke-static {v6, v4, v5}, LX39;->L(ILjava/lang/Object;LF39;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, LfO8;

    if-eqz v5, :cond_1

    check-cast v4, LfO8;

    shl-int/lit8 v5, v6, 0x3

    sget-object v6, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v4}, LfO8;->c()I

    move-result v4

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    add-int/2addr v6, v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_4

    :cond_1
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->x(Ljava/lang/String;)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_a
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_b
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_7

    :pswitch_c
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_d
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LU19;->H(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->v(I)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_e
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v4, v5}, LQP8;->z(J)I

    move-result v4

    invoke-static {v6}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_f
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v4, v5}, LQP8;->z(J)I

    move-result v4

    invoke-static {v6}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_10
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_7

    :pswitch_11
    invoke-virtual {p0, p1, v6, v2}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_12
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LU19;->h(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lv09;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    goto/16 :goto_9

    :pswitch_13
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, LU19;->g(I)LF39;

    move-result-object v5

    invoke-static {v6, v4, v5}, LX39;->G(ILjava/util/List;LF39;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_14
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->Q(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_15
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->O(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_16
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->F(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_17
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_18
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->B(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_19
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->T(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_1a
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v5, LX39;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_1b
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_1c
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->F(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_1

    :pswitch_1d
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto :goto_1

    :pswitch_1e
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->V(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto :goto_1

    :pswitch_1f
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto :goto_1

    :pswitch_20
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto :goto_1

    :pswitch_21
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LX39;->F(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    :goto_1
    add-int/2addr v5, v6

    goto/16 :goto_6

    :pswitch_22
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->P(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_23
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->N(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_24
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->E(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_25
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->C(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_26
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->A(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_27
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->S(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_28
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, LX39;->z(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_29
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, LU19;->g(I)LF39;

    move-result-object v5

    invoke-static {v6, v4, v5}, LX39;->M(ILjava/util/List;LF39;)I

    move-result v4

    goto :goto_2

    :pswitch_2a
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, LX39;->R(ILjava/util/List;)I

    move-result v4

    goto :goto_2

    :pswitch_2b
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->y(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2c
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->C(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2d
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->E(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2e
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2f
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->U(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_30
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->J(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_31
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->C(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_32
    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LX39;->E(ILjava/util/List;Z)I

    move-result v4

    :goto_2
    add-int/2addr v3, v4

    goto/16 :goto_9

    :pswitch_33
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr19;

    invoke-virtual {p0, v2}, LU19;->g(I)LF39;

    move-result-object v5

    invoke-static {v6, v4, v5}, LQP8;->u(ILr19;LF39;)I

    move-result v4

    goto :goto_2

    :pswitch_34
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v7

    shl-int/lit8 v5, v6, 0x3

    add-long v9, v7, v7

    shr-long v6, v7, v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v4

    xor-long v5, v9, v6

    invoke-static {v5, v6}, LQP8;->z(J)I

    move-result v5

    :goto_3
    add-int/2addr v4, v5

    goto :goto_2

    :pswitch_35
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    xor-int/2addr v4, v6

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_6

    :pswitch_36
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_37
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto/16 :goto_7

    :pswitch_38
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->v(I)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_39
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfO8;

    shl-int/lit8 v5, v6, 0x3

    sget-object v6, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v4}, LfO8;->c()I

    move-result v4

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    add-int/2addr v6, v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v4

    :goto_4
    add-int/2addr v4, v6

    goto/16 :goto_2

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LU19;->g(I)LF39;

    move-result-object v5

    invoke-static {v6, v4, v5}, LX39;->L(ILjava/lang/Object;LF39;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, LfO8;

    if-eqz v5, :cond_2

    check-cast v4, LfO8;

    shl-int/lit8 v5, v6, 0x3

    sget-object v6, LQP8;->b:Ljava/util/logging/Logger;

    invoke-virtual {v4}, LfO8;->c()I

    move-result v4

    invoke-static {v4}, LQP8;->y(I)I

    move-result v6

    add-int/2addr v6, v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v4

    goto :goto_4

    :cond_2
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->x(Ljava/lang/String;)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto :goto_6

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_7

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    goto :goto_8

    :pswitch_40
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v4}, LQP8;->v(I)I

    move-result v4

    invoke-static {v5}, LQP8;->y(I)I

    move-result v5

    goto :goto_6

    :pswitch_41
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v4, v5}, LQP8;->z(J)I

    move-result v4

    invoke-static {v6}, LQP8;->y(I)I

    move-result v5

    goto :goto_6

    :pswitch_42
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v4, v5}, LQP8;->z(J)I

    move-result v4

    invoke-static {v6}, LQP8;->y(I)I

    move-result v5

    :goto_6
    add-int/2addr v5, v4

    add-int/2addr v3, v5

    goto :goto_9

    :pswitch_43
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    :goto_7
    add-int/lit8 v4, v4, 0x4

    goto/16 :goto_2

    :pswitch_44
    invoke-virtual {p0, p1, v2}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, LQP8;->y(I)I

    move-result v4

    :goto_8
    add-int/lit8 v4, v4, 0x8

    goto/16 :goto_2

    :cond_3
    :goto_9
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, LU19;->l:LQ69;

    invoke-virtual {v0, p1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, LQ69;->a(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v3, p1

    goto :goto_a

    :cond_5
    invoke-virtual {p0, p1}, LU19;->G(Ljava/lang/Object;)I

    move-result v3

    :goto_a
    return v3

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

.method public final zzb(Ljava/lang/Object;)I
    .locals 9

    iget-object v0, p0, LU19;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, LU19;->Q(I)I

    move-result v3

    iget-object v4, p0, LU19;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    invoke-static {v3}, LU19;->P(I)I

    move-result v3

    int-to-long v5, v5

    const/16 v7, 0x25

    const/16 v8, 0x20

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->z(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, LXV8;->a(Z)I

    move-result v3

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->H(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->R(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->F(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LU19;->E(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_14
    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_3

    :pswitch_1c
    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    :goto_1
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_4

    :pswitch_1d
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_3

    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, LXV8;->a(Z)I

    move-result v3

    goto :goto_3

    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_3

    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto :goto_2

    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_3

    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto :goto_2

    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    goto :goto_2

    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_3

    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lm89;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    sget-object v5, LXV8;->a:Ljava/nio/charset/Charset;

    :goto_2
    ushr-long v5, v3, v8

    xor-long/2addr v3, v5

    long-to-int v3, v3

    :goto_3
    add-int/2addr v2, v3

    :cond_1
    :goto_4
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, LU19;->l:LQ69;

    invoke-virtual {v0, p1}, LQ69;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, LU19;->f:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, LU19;->m:LdR8;

    invoke-virtual {v0, p1}, LdR8;->a(Ljava/lang/Object;)LSR8;

    const/4 p1, 0x0

    throw p1

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

.method public final zze()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LU19;->e:Lr19;

    check-cast v0, LpU8;

    invoke-virtual {v0}, LpU8;->l()LpU8;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, LU19;->x(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, LpU8;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LpU8;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, LpU8;->x(I)V

    iput v1, v0, LQJ8;->zzb:I

    invoke-virtual {v0}, LpU8;->v()V

    :cond_1
    iget-object v0, p0, LU19;->a:[I

    array-length v0, v0

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-virtual {p0, v1}, LU19;->Q(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, LU19;->P(I)I

    move-result v2

    int-to-long v3, v3

    const/16 v5, 0x9

    if-eq v2, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v2, v5, :cond_2

    const/16 v5, 0x44

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v2, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v6, v5

    check-cast v6, Lm09;

    invoke-virtual {v6}, Lm09;->f()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, LU19;->k:LyY8;

    invoke-virtual {v2, p1, v3, v4}, LyY8;->a(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, LU19;->a:[I

    aget v2, v2, v1

    invoke-virtual {p0, p1, v2, v1}, LU19;->y(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, LU19;->g(I)LF39;

    move-result-object v2

    sget-object v5, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, LF39;->zzf(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :pswitch_2
    invoke-virtual {p0, p1, v1}, LU19;->u(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, LU19;->g(I)LF39;

    move-result-object v2

    sget-object v5, LU19;->q:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, LF39;->zzf(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, LU19;->l:LQ69;

    invoke-virtual {v0, p1}, LQ69;->g(Ljava/lang/Object;)V

    iget-boolean v0, p0, LU19;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, LU19;->m:LdR8;

    invoke-virtual {v0, p1}, LdR8;->b(Ljava/lang/Object;)V

    :cond_6
    return-void

    nop

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
