.class public final Liv7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNv7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LNv7<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final q:[I

.field public static final r:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lfv7;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:[I

.field public final j:I

.field public final k:I

.field public final l:LSu7;

.field public final m:Lsw7;

.field public final n:LAt7;

.field public final o:LCv7;

.field public final p:Lav7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Liv7;->q:[I

    invoke-static {}, LCw7;->l()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Liv7;->r:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILfv7;ZZ[IIILCv7;LSu7;Lsw7;LAt7;Lav7;[B)V
    .locals 5

    move-object v0, p0

    move-object v1, p5

    move-object/from16 v2, p14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, Liv7;->a:[I

    move-object v3, p2

    iput-object v3, v0, Liv7;->b:[Ljava/lang/Object;

    move v3, p3

    iput v3, v0, Liv7;->c:I

    move v3, p4

    iput v3, v0, Liv7;->d:I

    instance-of v3, v1, Leu7;

    iput-boolean v3, v0, Liv7;->g:Z

    move v3, p6

    iput-boolean v3, v0, Liv7;->h:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, p5}, LAt7;->j(Lfv7;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    :cond_0
    iput-boolean v3, v0, Liv7;->f:Z

    move-object v3, p8

    iput-object v3, v0, Liv7;->i:[I

    move v3, p9

    iput v3, v0, Liv7;->j:I

    move v3, p10

    iput v3, v0, Liv7;->k:I

    move-object/from16 v3, p11

    iput-object v3, v0, Liv7;->o:LCv7;

    move-object/from16 v3, p12

    iput-object v3, v0, Liv7;->l:LSu7;

    move-object/from16 v3, p13

    iput-object v3, v0, Liv7;->m:Lsw7;

    iput-object v2, v0, Liv7;->n:LAt7;

    iput-object v1, v0, Liv7;->e:Lfv7;

    move-object/from16 v1, p15

    iput-object v1, v0, Liv7;->p:Lav7;

    return-void
.end method

.method public static A(Ljava/lang/Object;ILNv7;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, LNv7;->d(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static C(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final D([BIILIw7;Ljava/lang/Class;LFs7;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LIw7;->d:LIw7;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    packed-switch p3, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "unsupported field type."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    invoke-static {p0, p1, p5}, LGs7;->m([BILFs7;)I

    move-result p0

    iget-wide p1, p5, LFs7;->b:J

    invoke-static {p1, p2}, Lot7;->f(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, LFs7;->c:Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_2
    invoke-static {p0, p1, p5}, LGs7;->j([BILFs7;)I

    move-result p0

    iget p1, p5, LFs7;->a:I

    invoke-static {p1}, Lot7;->e(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, LFs7;->c:Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p0, p1, p5}, LGs7;->a([BILFs7;)I

    move-result p0

    goto/16 :goto_3

    :pswitch_4
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object p3

    invoke-virtual {p3, p4}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object p3

    invoke-static {p3, p0, p1, p2, p5}, LGs7;->d(LNv7;[BIILFs7;)I

    move-result p0

    goto/16 :goto_3

    :pswitch_5
    invoke-static {p0, p1, p5}, LGs7;->h([BILFs7;)I

    move-result p0

    goto :goto_3

    :pswitch_6
    invoke-static {p0, p1, p5}, LGs7;->m([BILFs7;)I

    move-result p0

    iget-wide p1, p5, LFs7;->b:J

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p5, LFs7;->c:Ljava/lang/Object;

    goto :goto_3

    :pswitch_7
    invoke-static {p0, p1}, LGs7;->b([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, p5, LFs7;->c:Ljava/lang/Object;

    goto :goto_1

    :pswitch_8
    invoke-static {p0, p1}, LGs7;->o([BI)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    iput-object p0, p5, LFs7;->c:Ljava/lang/Object;

    goto :goto_2

    :pswitch_9
    invoke-static {p0, p1, p5}, LGs7;->j([BILFs7;)I

    move-result p0

    iget p1, p5, LFs7;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, LFs7;->c:Ljava/lang/Object;

    goto :goto_3

    :pswitch_a
    invoke-static {p0, p1, p5}, LGs7;->m([BILFs7;)I

    move-result p0

    iget-wide p1, p5, LFs7;->b:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, LFs7;->c:Ljava/lang/Object;

    goto :goto_3

    :pswitch_b
    invoke-static {p0, p1}, LGs7;->b([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    iput-object p0, p5, LFs7;->c:Ljava/lang/Object;

    :goto_1
    add-int/lit8 p0, p1, 0x4

    goto :goto_3

    :pswitch_c
    invoke-static {p0, p1}, LGs7;->o([BI)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    iput-object p0, p5, LFs7;->c:Ljava/lang/Object;

    :goto_2
    add-int/lit8 p0, p1, 0x8

    :goto_3
    return p0

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
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final E(ILjava/lang/Object;LKw7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, LKw7;->w(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lkt7;

    invoke-interface {p2, p0, p1}, LKw7;->K(ILkt7;)V

    return-void
.end method

.method public static G(Ljava/lang/Object;)Ltw7;
    .locals 2

    check-cast p0, Leu7;

    iget-object v0, p0, Leu7;->zzc:Ltw7;

    invoke-static {}, Ltw7;->c()Ltw7;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Ltw7;->e()Ltw7;

    move-result-object v0

    iput-object v0, p0, Leu7;->zzc:Ltw7;

    :cond_0
    return-object v0
.end method

.method public static H(Ljava/lang/Class;Lcv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;
    .locals 6

    instance-of p0, p1, LHv7;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, LHv7;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Liv7;->I(LHv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p1, LYv7;

    const/4 p0, 0x0

    throw p0
.end method

.method public static I(LHv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;
    .locals 34

    invoke-virtual/range {p0 .. p0}, LHv7;->zzc()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, LHv7;->a()Ljava/lang/String;

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

    sget-object v6, Liv7;->q:[I

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

    add-int v16, v4, v4

    add-int v16, v16, v6

    move v6, v4

    move v4, v15

    move/from16 v33, v12

    move v12, v9

    move/from16 v9, v33

    :goto_b
    sget-object v15, Liv7;->r:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, LHv7;->b()[Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, LHv7;->zza()Lfv7;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    mul-int/lit8 v7, v11, 0x3

    new-array v7, v7, [I

    add-int/2addr v11, v11

    new-array v11, v11, [Ljava/lang/Object;

    add-int v21, v14, v9

    move/from16 v22, v14

    move/from16 v23, v21

    const/4 v9, 0x0

    const/16 v20, 0x0

    :goto_c
    if-ge v4, v1, :cond_32

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

    add-int/lit8 v14, v20, 0x1

    aput v9, v13, v20

    move/from16 v20, v14

    :cond_1a
    const/16 v14, 0x33

    if-lt v5, v14, :cond_22

    add-int/lit8 v14, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v27, v14

    const v14, 0xd800

    if-lt v1, v14, :cond_1c

    and-int/lit16 v1, v1, 0x1fff

    move/from16 v14, v27

    const/16 v27, 0xd

    :goto_11
    add-int/lit8 v31, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    move/from16 v32, v12

    const v12, 0xd800

    if-lt v14, v12, :cond_1b

    and-int/lit16 v12, v14, 0x1fff

    shl-int v12, v12, v27

    or-int/2addr v1, v12

    add-int/lit8 v27, v27, 0xd

    move/from16 v14, v31

    move/from16 v12, v32

    goto :goto_11

    :cond_1b
    shl-int v12, v14, v27

    or-int/2addr v1, v12

    move/from16 v14, v31

    goto :goto_12

    :cond_1c
    move/from16 v32, v12

    move/from16 v14, v27

    :goto_12
    add-int/lit8 v12, v5, -0x33

    move/from16 v27, v14

    const/16 v14, 0x9

    if-eq v12, v14, :cond_1e

    const/16 v14, 0x11

    if-ne v12, v14, :cond_1d

    goto :goto_13

    :cond_1d
    const/16 v14, 0xc

    if-ne v12, v14, :cond_1f

    if-nez v10, :cond_1f

    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v14, v16, 0x1

    add-int/2addr v12, v12

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    goto :goto_14

    :cond_1e
    :goto_13
    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v14, v16, 0x1

    add-int/2addr v12, v12

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    :goto_14
    move/from16 v16, v14

    :cond_1f
    add-int/2addr v1, v1

    aget-object v12, v17, v1

    instance-of v14, v12, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_20

    check-cast v12, Ljava/lang/reflect/Field;

    goto :goto_15

    :cond_20
    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Liv7;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v17, v1

    :goto_15
    move-object/from16 v31, v7

    move v14, v8

    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    add-int/lit8 v1, v1, 0x1

    aget-object v8, v17, v1

    instance-of v12, v8, Ljava/lang/reflect/Field;

    if-eqz v12, :cond_21

    check-cast v8, Ljava/lang/reflect/Field;

    goto :goto_16

    :cond_21
    check-cast v8, Ljava/lang/String;

    invoke-static {v2, v8}, Liv7;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    aput-object v8, v17, v1

    :goto_16
    move v1, v7

    invoke-virtual {v15, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    move-object/from16 v30, v0

    move v8, v7

    move-object/from16 v29, v11

    const/16 v25, 0x1

    move v7, v1

    const/4 v1, 0x0

    goto/16 :goto_21

    :cond_22
    move-object/from16 v31, v7

    move v14, v8

    move/from16 v32, v12

    add-int/lit8 v7, v16, 0x1

    aget-object v8, v17, v16

    check-cast v8, Ljava/lang/String;

    invoke-static {v2, v8}, Liv7;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    const/16 v12, 0x9

    if-eq v5, v12, :cond_2a

    const/16 v12, 0x11

    if-ne v5, v12, :cond_23

    goto :goto_1a

    :cond_23
    const/16 v12, 0x1b

    if-eq v5, v12, :cond_29

    const/16 v12, 0x31

    if-ne v5, v12, :cond_24

    goto :goto_18

    :cond_24
    const/16 v12, 0xc

    if-eq v5, v12, :cond_28

    const/16 v12, 0x1e

    if-eq v5, v12, :cond_28

    const/16 v12, 0x2c

    if-ne v5, v12, :cond_25

    goto :goto_17

    :cond_25
    const/16 v12, 0x32

    if-ne v5, v12, :cond_26

    add-int/lit8 v12, v22, 0x1

    aput v9, v13, v22

    div-int/lit8 v22, v9, 0x3

    add-int v22, v22, v22

    add-int/lit8 v27, v7, 0x1

    aget-object v7, v17, v7

    aput-object v7, v11, v22

    and-int/lit16 v7, v3, 0x800

    if-eqz v7, :cond_27

    add-int/lit8 v7, v27, 0x1

    add-int/lit8 v22, v22, 0x1

    aget-object v27, v17, v27

    aput-object v27, v11, v22

    move/from16 v22, v12

    :cond_26
    const/16 v25, 0x1

    goto :goto_1b

    :cond_27
    move/from16 v22, v12

    move/from16 v12, v27

    const/16 v25, 0x1

    goto :goto_1c

    :cond_28
    :goto_17
    if-nez v10, :cond_26

    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v27, v7, 0x1

    add-int/2addr v12, v12

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aget-object v7, v17, v7

    aput-object v7, v11, v12

    goto :goto_19

    :cond_29
    :goto_18
    const/16 v25, 0x1

    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v27, v7, 0x1

    add-int/2addr v12, v12

    add-int/lit8 v12, v12, 0x1

    aget-object v7, v17, v7

    aput-object v7, v11, v12

    :goto_19
    move/from16 v12, v27

    goto :goto_1c

    :cond_2a
    :goto_1a
    const/16 v25, 0x1

    div-int/lit8 v12, v9, 0x3

    add-int/2addr v12, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v27

    aput-object v27, v11, v12

    :goto_1b
    move v12, v7

    :goto_1c
    invoke-virtual {v15, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    and-int/lit16 v8, v3, 0x1000

    const v27, 0xfffff

    move-object/from16 v29, v11

    const/16 v11, 0x1000

    if-ne v8, v11, :cond_2e

    const/16 v8, 0x11

    if-gt v5, v8, :cond_2e

    add-int/lit8 v8, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v11, 0xd800

    if-lt v1, v11, :cond_2c

    and-int/lit16 v1, v1, 0x1fff

    const/16 v26, 0xd

    :goto_1d
    add-int/lit8 v27, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v11, :cond_2b

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v26

    or-int/2addr v1, v8

    add-int/lit8 v26, v26, 0xd

    move/from16 v8, v27

    goto :goto_1d

    :cond_2b
    shl-int v8, v8, v26

    or-int/2addr v1, v8

    goto :goto_1e

    :cond_2c
    move/from16 v27, v8

    :goto_1e
    add-int v8, v6, v6

    div-int/lit8 v26, v1, 0x20

    add-int v8, v8, v26

    aget-object v11, v17, v8

    move-object/from16 v30, v0

    instance-of v0, v11, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2d

    check-cast v11, Ljava/lang/reflect/Field;

    goto :goto_1f

    :cond_2d
    check-cast v11, Ljava/lang/String;

    invoke-static {v2, v11}, Liv7;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    aput-object v11, v17, v8

    :goto_1f
    move v0, v12

    invoke-virtual {v15, v11}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v11

    long-to-int v8, v11

    rem-int/lit8 v1, v1, 0x20

    goto :goto_20

    :cond_2e
    move-object/from16 v30, v0

    move v0, v12

    move/from16 v8, v27

    move/from16 v27, v1

    const/4 v1, 0x0

    :goto_20
    const/16 v11, 0x12

    if-lt v5, v11, :cond_2f

    const/16 v11, 0x31

    if-gt v5, v11, :cond_2f

    add-int/lit8 v11, v23, 0x1

    aput v7, v13, v23

    move/from16 v16, v0

    move/from16 v23, v11

    goto :goto_21

    :cond_2f
    move/from16 v16, v0

    :goto_21
    add-int/lit8 v0, v9, 0x1

    aput v4, v31, v9

    add-int/lit8 v4, v0, 0x1

    and-int/lit16 v9, v3, 0x200

    if-eqz v9, :cond_30

    const/high16 v9, 0x20000000

    goto :goto_22

    :cond_30
    const/4 v9, 0x0

    :goto_22
    and-int/lit16 v3, v3, 0x100

    if-eqz v3, :cond_31

    const/high16 v3, 0x10000000

    goto :goto_23

    :cond_31
    const/4 v3, 0x0

    :goto_23
    or-int/2addr v3, v9

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v3, v5

    or-int/2addr v3, v7

    aput v3, v31, v0

    add-int/lit8 v9, v4, 0x1

    shl-int/lit8 v0, v1, 0x14

    or-int/2addr v0, v8

    aput v0, v31, v4

    move v8, v14

    move/from16 v14, v24

    move/from16 v4, v27

    move/from16 v1, v28

    move-object/from16 v11, v29

    move-object/from16 v0, v30

    move-object/from16 v7, v31

    move/from16 v12, v32

    const v5, 0xd800

    goto/16 :goto_c

    :cond_32
    move-object/from16 v31, v7

    move-object/from16 v29, v11

    move/from16 v32, v12

    move/from16 v24, v14

    move v14, v8

    new-instance v0, Liv7;

    move-object v4, v0

    invoke-virtual/range {p0 .. p0}, LHv7;->zza()Lfv7;

    move-result-object v9

    const/4 v11, 0x0

    move-object/from16 v1, v29

    const/16 v20, 0x0

    move-object/from16 v5, v31

    move-object v6, v1

    move v7, v14

    move/from16 v8, v32

    move-object v12, v13

    move/from16 v13, v24

    move/from16 v14, v21

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    invoke-direct/range {v4 .. v20}, Liv7;-><init>([I[Ljava/lang/Object;IILfv7;ZZ[IIILCv7;LSu7;Lsw7;LAt7;Lav7;[B)V

    return-object v0
.end method

.method public static J(Ljava/lang/Object;J)D
    .locals 0

    invoke-static {p0, p1, p2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static K(Ljava/lang/Object;J)F
    .locals 0

    invoke-static {p0, p1, p2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static N(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static c(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static j(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6

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

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x28

    add-int/2addr v2, v3

    add-int/2addr v2, v4

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Field "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static x(I)Z
    .locals 1

    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;II)Z
    .locals 2

    invoke-virtual {p0, p3}, Liv7;->U(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final F(Ljava/lang/Object;[BIIILFs7;)I
    .locals 29
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

    sget-object v10, Liv7;->r:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v0, p3

    move/from16 v1, v16

    move v3, v1

    move v5, v3

    const/4 v2, -0x1

    const v6, 0xfffff

    :goto_0
    const/16 v17, 0x0

    if-ge v0, v13, :cond_1b

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v1, v9}, LGs7;->k(I[BILFs7;)I

    move-result v0

    iget v1, v9, LFs7;->a:I

    move v4, v1

    move v1, v0

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    ushr-int/lit8 v0, v4, 0x3

    and-int/lit8 v8, v4, 0x7

    const/4 v7, 0x3

    if-le v0, v2, :cond_1

    div-int/2addr v3, v7

    invoke-virtual {v15, v0, v3}, Liv7;->T(II)I

    move-result v2

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v0}, Liv7;->S(I)I

    move-result v2

    :goto_2
    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    move/from16 v24, v0

    move v2, v1

    move/from16 v20, v3

    move v7, v4

    move/from16 v21, v5

    move-object/from16 v28, v10

    move v0, v11

    move/from16 v19, v16

    goto/16 :goto_16

    :cond_2
    iget-object v3, v15, Liv7;->a:[I

    add-int/lit8 v20, v2, 0x1

    aget v7, v3, v20

    invoke-static {v7}, Liv7;->c(I)I

    move-result v11

    move/from16 v20, v0

    const v18, 0xfffff

    and-int v0, v7, v18

    move/from16 v21, v1

    int-to-long v0, v0

    move-wide/from16 v22, v0

    const/16 v0, 0x11

    if-gt v11, v0, :cond_e

    add-int/lit8 v0, v2, 0x2

    aget v0, v3, v0

    ushr-int/lit8 v3, v0, 0x14

    const/4 v1, 0x1

    shl-int v24, v1, v3

    const v3, 0xfffff

    and-int/2addr v0, v3

    if-eq v0, v6, :cond_4

    move/from16 v18, v4

    if-eq v6, v3, :cond_3

    int-to-long v3, v6

    invoke-virtual {v10, v14, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    int-to-long v3, v0

    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move/from16 v25, v0

    goto :goto_3

    :cond_4
    move/from16 v18, v4

    move/from16 v25, v6

    :goto_3
    move v6, v5

    const/4 v0, 0x5

    packed-switch v11, :pswitch_data_0

    move v13, v2

    move/from16 p3, v20

    move/from16 v11, v21

    move-wide/from16 v2, v22

    const/4 v0, 0x3

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v0, :cond_d

    invoke-virtual {v15, v13}, Liv7;->l(I)LNv7;

    move-result-object v0

    shl-int/lit8 v1, p3, 0x3

    or-int/lit8 v4, v1, 0x4

    move-object/from16 v1, p2

    move-wide v7, v2

    move v2, v11

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LGs7;->c(LNv7;[BIIILFs7;)I

    move-result v0

    and-int v1, v6, v24

    if-nez v1, :cond_c

    iget-object v1, v9, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_0
    if-nez v8, :cond_5

    move/from16 v3, v21

    invoke-static {v12, v3, v9}, LGs7;->m([BILFs7;)I

    move-result v7

    iget-wide v0, v9, LFs7;->b:J

    invoke-static {v0, v1}, Lot7;->f(J)J

    move-result-wide v4

    move/from16 v11, v20

    move-object v0, v10

    move-object/from16 v1, p1

    move v8, v2

    const v19, 0xfffff

    const/16 v20, -0x1

    move-wide/from16 v2, v22

    move/from16 p3, v11

    move/from16 v11, v18

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v6, v24

    move/from16 v2, p3

    move v0, v7

    move v3, v8

    goto/16 :goto_a

    :cond_5
    move/from16 p3, v20

    const v19, 0xfffff

    const/16 v20, -0x1

    move v13, v2

    move/from16 v11, v21

    goto/16 :goto_f

    :pswitch_1
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    const v19, 0xfffff

    const/16 v20, -0x1

    if-nez v8, :cond_b

    invoke-static {v12, v3, v9}, LGs7;->j([BILFs7;)I

    move-result v0

    iget v1, v9, LFs7;->a:I

    invoke-static {v1}, Lot7;->e(I)I

    move-result v1

    move-wide/from16 v7, v22

    invoke-virtual {v10, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_9

    :pswitch_2
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v0, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-nez v8, :cond_b

    invoke-static {v12, v3, v9}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v3, v9, LFs7;->a:I

    invoke-virtual {v15, v4}, Liv7;->k(I)Liu7;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-interface {v5, v3}, Liu7;->zza(I)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-static/range {p1 .. p1}, Liv7;->G(Ljava/lang/Object;)Ltw7;

    move-result-object v0

    int-to-long v7, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Ltw7;->h(ILjava/lang/Object;)V

    move v0, v2

    move v3, v4

    move v5, v6

    goto :goto_6

    :cond_7
    :goto_4
    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_5

    :pswitch_3
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v0, v22

    const/4 v2, 0x2

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v2, :cond_b

    invoke-static {v12, v3, v9}, LGs7;->a([BILFs7;)I

    move-result v2

    iget-object v3, v9, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_5
    or-int v5, v6, v24

    move v0, v2

    move v3, v4

    :goto_6
    move v1, v11

    move/from16 v6, v25

    move/from16 v2, p3

    goto/16 :goto_b

    :pswitch_4
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v0, v22

    const/4 v2, 0x2

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v2, :cond_b

    invoke-virtual {v15, v4}, Liv7;->l(I)LNv7;

    move-result-object v2

    invoke-static {v2, v12, v3, v13, v9}, LGs7;->d(LNv7;[BIILFs7;)I

    move-result v2

    and-int v3, v6, v24

    if-nez v3, :cond_8

    iget-object v3, v9, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v10, v14, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    iget-object v5, v9, LFs7;->c:Ljava/lang/Object;

    invoke-static {v3, v5}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_5
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v0, v22

    const/4 v2, 0x2

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v2, :cond_b

    const/high16 v2, 0x20000000

    and-int/2addr v2, v7

    if-nez v2, :cond_9

    invoke-static {v12, v3, v9}, LGs7;->g([BILFs7;)I

    move-result v2

    goto :goto_7

    :cond_9
    invoke-static {v12, v3, v9}, LGs7;->h([BILFs7;)I

    move-result v2

    :goto_7
    iget-object v3, v9, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_6
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v1, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-nez v8, :cond_b

    invoke-static {v12, v3, v9}, LGs7;->m([BILFs7;)I

    move-result v0

    iget-wide v7, v9, LFs7;->b:J

    const-wide/16 v21, 0x0

    cmp-long v3, v7, v21

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    goto :goto_8

    :cond_a
    move/from16 v3, v16

    :goto_8
    invoke-static {v14, v1, v2, v3}, LCw7;->r(Ljava/lang/Object;JZ)V

    goto :goto_9

    :pswitch_7
    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v1, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v0, :cond_b

    invoke-static {v12, v3}, LGs7;->b([BI)I

    move-result v0

    invoke-virtual {v10, v14, v1, v2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v3, 0x4

    :goto_9
    or-int v5, v6, v24

    move/from16 v2, p3

    move v3, v4

    :goto_a
    move v1, v11

    move/from16 v6, v25

    :goto_b
    move/from16 v11, p5

    goto/16 :goto_0

    :pswitch_8
    move v0, v1

    move v4, v2

    move/from16 v11, v18

    move/from16 p3, v20

    move/from16 v3, v21

    move-wide/from16 v1, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v0, :cond_b

    invoke-static {v12, v3}, LGs7;->o([BI)J

    move-result-wide v7

    move-object v0, v10

    move v5, v3

    move-wide v2, v1

    move-object/from16 v1, p1

    move v13, v4

    move/from16 v18, v11

    move v11, v5

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_c

    :cond_b
    move v13, v4

    move/from16 v18, v11

    move v11, v3

    goto/16 :goto_f

    :pswitch_9
    move v13, v2

    move/from16 p3, v20

    move/from16 v11, v21

    move-wide/from16 v2, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-nez v8, :cond_d

    invoke-static {v12, v11, v9}, LGs7;->j([BILFs7;)I

    move-result v0

    iget v1, v9, LFs7;->a:I

    invoke-virtual {v10, v14, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_d

    :pswitch_a
    move v13, v2

    move/from16 p3, v20

    move/from16 v11, v21

    move-wide/from16 v2, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-nez v8, :cond_d

    invoke-static {v12, v11, v9}, LGs7;->m([BILFs7;)I

    move-result v7

    iget-wide v4, v9, LFs7;->b:J

    move-object v0, v10

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v6, v24

    move/from16 v2, p3

    move/from16 v11, p5

    move v0, v7

    goto :goto_e

    :pswitch_b
    move v13, v2

    move/from16 p3, v20

    move/from16 v11, v21

    move-wide/from16 v2, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v0, :cond_d

    invoke-static {v12, v11}, LGs7;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v2, v3, v0}, LCw7;->u(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v11, 0x4

    goto :goto_d

    :pswitch_c
    move v0, v1

    move v13, v2

    move/from16 p3, v20

    move/from16 v11, v21

    move-wide/from16 v2, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    if-ne v8, v0, :cond_d

    invoke-static {v12, v11}, LGs7;->o([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v2, v3, v0, v1}, LCw7;->t(Ljava/lang/Object;JD)V

    :goto_c
    add-int/lit8 v0, v11, 0x8

    :goto_d
    or-int v5, v6, v24

    move/from16 v2, p3

    move/from16 v11, p5

    :goto_e
    move v3, v13

    move/from16 v1, v18

    goto/16 :goto_11

    :cond_c
    invoke-virtual {v10, v14, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v9, LFs7;->c:Ljava/lang/Object;

    invoke-static {v1, v2}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_d

    :cond_d
    :goto_f
    move/from16 v24, p3

    move/from16 v0, p5

    move/from16 v21, v6

    move-object/from16 v28, v10

    move v2, v11

    move/from16 v19, v13

    goto/16 :goto_15

    :cond_e
    move v13, v2

    move/from16 v18, v4

    move v3, v11

    move/from16 v4, v20

    move/from16 v11, v21

    move-wide/from16 v1, v22

    const v19, 0xfffff

    const/16 v20, -0x1

    const/16 v0, 0x1b

    if-ne v3, v0, :cond_12

    const/4 v0, 0x2

    if-ne v8, v0, :cond_11

    invoke-virtual {v10, v14, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnu7;

    invoke-interface {v0}, Lnu7;->zzc()Z

    move-result v3

    if-nez v3, :cond_10

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_f

    const/16 v3, 0xa

    goto :goto_10

    :cond_f
    add-int/2addr v3, v3

    :goto_10
    invoke-interface {v0, v3}, Lnu7;->d(I)Lnu7;

    move-result-object v0

    invoke-virtual {v10, v14, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_10
    move-object v7, v0

    invoke-virtual {v15, v13}, Liv7;->l(I)LNv7;

    move-result-object v0

    move/from16 v1, v18

    move-object/from16 v2, p2

    move v3, v11

    move v8, v4

    move/from16 v4, p4

    move/from16 v21, v5

    move-object v5, v7

    move/from16 v25, v6

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, LGs7;->e(LNv7;I[BIILnu7;LFs7;)I

    move-result v0

    move/from16 v11, p5

    move v2, v8

    move v3, v13

    move/from16 v5, v21

    :goto_11
    move/from16 v6, v25

    move/from16 v13, p4

    goto/16 :goto_0

    :cond_11
    move/from16 v21, v5

    move/from16 v25, v6

    move/from16 v24, v4

    move-object/from16 v28, v10

    move v15, v11

    move/from16 v19, v13

    goto/16 :goto_14

    :cond_12
    move/from16 v21, v5

    move/from16 v25, v6

    move v5, v4

    const/16 v0, 0x31

    if-gt v3, v0, :cond_14

    int-to-long v6, v7

    move-object/from16 v0, p0

    move-wide/from16 v22, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v4, v3

    move v3, v11

    move/from16 p3, v4

    move/from16 v4, p4

    move/from16 v24, v5

    move/from16 v5, v18

    move-wide/from16 v26, v6

    move/from16 v6, v24

    move v7, v8

    move v8, v13

    move-object/from16 v28, v10

    move-wide/from16 v9, v26

    move v15, v11

    move/from16 v11, p3

    move/from16 v19, v13

    move-wide/from16 v12, v22

    move-object/from16 v14, p6

    invoke-virtual/range {v0 .. v14}, Liv7;->R(Ljava/lang/Object;[BIIIIIIJIJLFs7;)I

    move-result v0

    if-eq v0, v15, :cond_13

    :goto_12
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    move/from16 v1, v18

    move/from16 v3, v19

    move/from16 v5, v21

    move/from16 v2, v24

    move/from16 v6, v25

    :goto_13
    move-object/from16 v10, v28

    goto/16 :goto_0

    :cond_13
    move v2, v0

    move/from16 v7, v18

    move/from16 v6, v25

    move/from16 v0, p5

    goto/16 :goto_16

    :cond_14
    move-wide/from16 v22, v1

    move/from16 p3, v3

    move/from16 v24, v5

    move-object/from16 v28, v10

    move v15, v11

    move/from16 v19, v13

    const/16 v0, 0x32

    move/from16 v9, p3

    if-ne v9, v0, :cond_16

    const/4 v0, 0x2

    if-ne v8, v0, :cond_15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v19

    move-wide/from16 v6, v22

    move-object/from16 v8, p6

    invoke-virtual/range {v0 .. v8}, Liv7;->O(Ljava/lang/Object;[BIIIJLFs7;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_12

    :cond_15
    :goto_14
    move/from16 v0, p5

    move v2, v15

    :goto_15
    move/from16 v7, v18

    move/from16 v6, v25

    goto :goto_16

    :cond_16
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v18

    move/from16 v6, v24

    move v10, v7

    move v7, v8

    move v8, v10

    move-wide/from16 v10, v22

    move/from16 v12, v19

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, Liv7;->P(Ljava/lang/Object;[BIIIIIIIJILFs7;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_12

    :goto_16
    if-ne v7, v0, :cond_17

    if-eqz v0, :cond_17

    move-object/from16 v8, p0

    move-object/from16 v12, p1

    move v9, v0

    move v0, v2

    move v1, v7

    move/from16 v5, v21

    goto/16 :goto_19

    :cond_17
    move-object/from16 v8, p0

    move v9, v0

    iget-boolean v0, v8, Liv7;->f:Z

    if-eqz v0, :cond_1a

    move-object/from16 v10, p6

    iget-object v0, v10, LFs7;->d:Lzt7;

    invoke-static {}, Lzt7;->a()Lzt7;

    move-result-object v1

    if-eq v0, v1, :cond_19

    iget-object v0, v8, Liv7;->e:Lfv7;

    iget-object v1, v10, LFs7;->d:Lzt7;

    move/from16 v11, v24

    invoke-virtual {v1, v0, v11}, Lzt7;->c(Lfv7;I)Ldu7;

    move-result-object v0

    if-nez v0, :cond_18

    invoke-static/range {p1 .. p1}, Liv7;->G(Ljava/lang/Object;)Ltw7;

    move-result-object v4

    move v0, v7

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LGs7;->i(I[BIILtw7;LFs7;)I

    move-result v0

    move-object/from16 v12, p1

    goto :goto_18

    :cond_18
    move-object/from16 v12, p1

    move-object v0, v12

    check-cast v0, Lbu7;

    invoke-virtual {v0}, Lbu7;->D()LEt7;

    throw v17

    :cond_19
    move-object/from16 v12, p1

    goto :goto_17

    :cond_1a
    move-object/from16 v12, p1

    move-object/from16 v10, p6

    :goto_17
    move/from16 v11, v24

    invoke-static/range {p1 .. p1}, Liv7;->G(Ljava/lang/Object;)Ltw7;

    move-result-object v4

    move v0, v7

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LGs7;->i(I[BIILtw7;LFs7;)I

    move-result v0

    :goto_18
    move/from16 v13, p4

    move v1, v7

    move-object v15, v8

    move v2, v11

    move-object v14, v12

    move/from16 v3, v19

    move/from16 v5, v21

    move-object/from16 v12, p2

    move v11, v9

    move-object v9, v10

    goto/16 :goto_13

    :cond_1b
    move/from16 v21, v5

    move/from16 v25, v6

    move-object/from16 v28, v10

    move v9, v11

    move-object v12, v14

    move-object v8, v15

    :goto_19
    const v2, 0xfffff

    if-eq v6, v2, :cond_1c

    int-to-long v2, v6

    move-object/from16 v4, v28

    invoke-virtual {v4, v12, v2, v3, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1c
    iget v2, v8, Liv7;->j:I

    move-object/from16 v3, v17

    :goto_1a
    iget v4, v8, Liv7;->k:I

    if-ge v2, v4, :cond_1d

    iget-object v4, v8, Liv7;->i:[I

    aget v4, v4, v2

    iget-object v5, v8, Liv7;->m:Lsw7;

    invoke-virtual {v8, v12, v4, v3, v5}, Liv7;->m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    :cond_1d
    if-eqz v3, :cond_1e

    iget-object v2, v8, Liv7;->m:Lsw7;

    invoke-virtual {v2, v12, v3}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1e
    if-nez v9, :cond_20

    move/from16 v2, p4

    if-ne v0, v2, :cond_1f

    goto :goto_1b

    :cond_1f
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v0

    throw v0

    :cond_20
    move/from16 v2, p4

    if-gt v0, v2, :cond_21

    if-ne v1, v9, :cond_21

    :goto_1b
    return v0

    :cond_21
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v0

    throw v0

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

.method public final L(Ljava/lang/Object;)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    sget-object v2, Liv7;->r:Lsun/misc/Unsafe;

    const v4, 0xfffff

    move v8, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    iget-object v9, v0, Liv7;->a:[I

    array-length v9, v9

    if-ge v5, v9, :cond_6

    invoke-virtual {p0, v5}, Liv7;->i(I)I

    move-result v9

    iget-object v10, v0, Liv7;->a:[I

    aget v11, v10, v5

    invoke-static {v9}, Liv7;->c(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v12, v13, :cond_0

    add-int/lit8 v13, v5, 0x2

    aget v10, v10, v13

    and-int v13, v10, v4

    ushr-int/lit8 v10, v10, 0x14

    shl-int v10, v14, v10

    if-eq v13, v8, :cond_1

    int-to-long v7, v13

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    move v8, v13

    goto :goto_1

    :cond_0
    const/4 v10, 0x0

    :cond_1
    :goto_1
    and-int/2addr v9, v4

    int-to-long v3, v9

    const/16 v9, 0x3f

    packed-switch v12, :pswitch_data_0

    goto/16 :goto_b

    :pswitch_0
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfv7;

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lut7;->d(ILfv7;LNv7;)I

    move-result v3

    goto/16 :goto_a

    :pswitch_1
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    invoke-static {v10}, Lut7;->m(I)I

    move-result v10

    add-long v11, v3, v3

    shr-long/2addr v3, v9

    xor-long/2addr v3, v11

    invoke-static {v3, v4}, Lut7;->n(J)I

    move-result v3

    add-int/2addr v10, v3

    add-int/2addr v6, v10

    goto/16 :goto_b

    :pswitch_2
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_7

    :pswitch_3
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_5

    :pswitch_4
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_5
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->f(I)I

    move-result v3

    goto/16 :goto_7

    :pswitch_6
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_7

    :pswitch_7
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkt7;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-virtual {v3}, Lkt7;->e()I

    move-result v3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    :goto_2
    add-int/2addr v9, v3

    add-int/2addr v4, v9

    goto/16 :goto_8

    :pswitch_8
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, LPv7;->Q(ILjava/lang/Object;LNv7;)I

    move-result v3

    goto/16 :goto_a

    :pswitch_9
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lkt7;

    if-eqz v4, :cond_2

    check-cast v3, Lkt7;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-virtual {v3}, Lkt7;->e()I

    move-result v3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_2

    :cond_2
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->k(Ljava/lang/String;)I

    move-result v3

    goto/16 :goto_7

    :pswitch_a
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_a

    :pswitch_b
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto :goto_4

    :pswitch_c
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto :goto_5

    :pswitch_d
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->f(I)I

    move-result v3

    goto/16 :goto_7

    :pswitch_e
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lut7;->m(I)I

    move-result v9

    invoke-static {v3, v4}, Lut7;->n(J)I

    move-result v3

    goto :goto_3

    :pswitch_f
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lut7;->m(I)I

    move-result v9

    invoke-static {v3, v4}, Lut7;->n(J)I

    move-result v3

    :goto_3
    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto/16 :goto_b

    :pswitch_10
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    :goto_4
    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_a

    :pswitch_11
    invoke-virtual {p0, v1, v11, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    :goto_5
    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_a

    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v5}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lav7;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    goto/16 :goto_a

    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, LPv7;->L(ILjava/util/List;LNv7;)I

    move-result v3

    goto/16 :goto_a

    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->V(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->T(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->G(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->Y(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->D(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto/16 :goto_6

    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_6

    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->N(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_6

    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->a0(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_6

    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->P(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_6

    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_6

    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, LPv7;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v11}, Lut7;->l(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    :goto_6
    add-int/2addr v4, v9

    :goto_7
    add-int/2addr v4, v3

    :goto_8
    add-int/2addr v6, v4

    goto/16 :goto_b

    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v9, 0x0

    invoke-static {v11, v3, v9}, LPv7;->U(ILjava/util/List;Z)I

    move-result v3

    goto :goto_9

    :pswitch_23
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LPv7;->S(ILjava/util/List;Z)I

    move-result v3

    goto :goto_9

    :pswitch_24
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LPv7;->J(ILjava/util/List;Z)I

    move-result v3

    goto :goto_9

    :pswitch_25
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LPv7;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_9

    :pswitch_26
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LPv7;->F(ILjava/util/List;Z)I

    move-result v3

    :goto_9
    add-int/2addr v6, v3

    move v12, v9

    goto/16 :goto_13

    :pswitch_27
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, LPv7;->X(ILjava/util/List;Z)I

    move-result v3

    goto :goto_a

    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, LPv7;->E(ILjava/util/List;)I

    move-result v3

    goto :goto_a

    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, LPv7;->R(ILjava/util/List;LNv7;)I

    move-result v3

    goto :goto_a

    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, LPv7;->W(ILjava/util/List;)I

    move-result v3

    :goto_a
    add-int/2addr v6, v3

    :cond_3
    :goto_b
    const/4 v12, 0x0

    goto/16 :goto_13

    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v11, v3, v12}, LPv7;->A(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_2c
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_2d
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->J(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_2e
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->M(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_2f
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->Z(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_30
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->O(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_31
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_c

    :pswitch_32
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, LPv7;->J(ILjava/util/List;Z)I

    move-result v3

    :goto_c
    add-int/2addr v6, v3

    goto/16 :goto_13

    :pswitch_33
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfv7;

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lut7;->d(ILfv7;LNv7;)I

    move-result v3

    goto :goto_c

    :pswitch_34
    const/4 v12, 0x0

    and-int/2addr v10, v7

    if-eqz v10, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    invoke-static {v10}, Lut7;->m(I)I

    move-result v10

    add-long v13, v3, v3

    shr-long/2addr v3, v9

    xor-long/2addr v3, v13

    invoke-static {v3, v4}, Lut7;->n(J)I

    move-result v3

    add-int/2addr v10, v3

    add-int/2addr v6, v10

    goto/16 :goto_13

    :pswitch_35
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_e

    :pswitch_36
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_12

    :pswitch_37
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_11

    :pswitch_38
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->f(I)I

    move-result v3

    goto/16 :goto_e

    :pswitch_39
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto/16 :goto_e

    :pswitch_3a
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkt7;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-virtual {v3}, Lkt7;->e()I

    move-result v3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    :goto_d
    add-int/2addr v9, v3

    add-int/2addr v4, v9

    goto/16 :goto_f

    :pswitch_3b
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, LPv7;->Q(ILjava/lang/Object;LNv7;)I

    move-result v3

    goto/16 :goto_c

    :pswitch_3c
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lkt7;

    if-eqz v4, :cond_4

    check-cast v3, Lkt7;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-virtual {v3}, Lkt7;->e()I

    move-result v3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v9

    goto :goto_d

    :cond_4
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->k(Ljava/lang/String;)I

    move-result v3

    goto :goto_e

    :pswitch_3d
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_c

    :pswitch_3e
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto :goto_11

    :pswitch_3f
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    goto :goto_12

    :pswitch_40
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    invoke-static {v3}, Lut7;->f(I)I

    move-result v3

    :goto_e
    add-int/2addr v4, v3

    :goto_f
    add-int/2addr v6, v4

    goto :goto_13

    :pswitch_41
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lut7;->m(I)I

    move-result v9

    invoke-static {v3, v4}, Lut7;->n(J)I

    move-result v3

    goto :goto_10

    :pswitch_42
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lut7;->m(I)I

    move-result v9

    invoke-static {v3, v4}, Lut7;->n(J)I

    move-result v3

    :goto_10
    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto :goto_13

    :pswitch_43
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    :goto_11
    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_c

    :pswitch_44
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lut7;->m(I)I

    move-result v3

    :goto_12
    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_c

    :cond_5
    :goto_13
    add-int/lit8 v5, v5, 0x3

    const v4, 0xfffff

    goto/16 :goto_0

    :cond_6
    const/4 v12, 0x0

    iget-object v2, v0, Liv7;->m:Lsw7;

    invoke-virtual {v2, v1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lsw7;->a(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, Liv7;->f:Z

    if-eqz v2, :cond_9

    iget-object v2, v0, Liv7;->n:LAt7;

    invoke-virtual {v2, v1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object v1

    move v3, v12

    :goto_14
    iget-object v2, v1, LEt7;->a:LXv7;

    invoke-virtual {v2}, LXv7;->b()I

    move-result v2

    if-ge v3, v2, :cond_7

    iget-object v2, v1, LEt7;->a:LXv7;

    invoke-virtual {v2, v3}, LXv7;->g(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LDt7;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, LEt7;->c(LDt7;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v12, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_7
    iget-object v1, v1, LEt7;->a:LXv7;

    invoke-virtual {v1}, LXv7;->c()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LDt7;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, LEt7;->c(LDt7;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v12, v2

    goto :goto_15

    :cond_8
    add-int/2addr v6, v12

    :cond_9
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

.method public final M(Ljava/lang/Object;)I
    .locals 11

    sget-object v0, Liv7;->r:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    iget-object v4, p0, Liv7;->a:[I

    array-length v4, v4

    if-ge v2, v4, :cond_4

    invoke-virtual {p0, v2}, Liv7;->i(I)I

    move-result v4

    invoke-static {v4}, Liv7;->c(I)I

    move-result v5

    iget-object v6, p0, Liv7;->a:[I

    aget v6, v6, v2

    const v7, 0xfffff

    and-int/2addr v4, v7

    int-to-long v7, v4

    sget-object v4, LVt7;->R:LVt7;

    invoke-virtual {v4}, LVt7;->zza()I

    move-result v4

    if-lt v5, v4, :cond_0

    sget-object v4, LVt7;->u0:LVt7;

    invoke-virtual {v4}, LVt7;->zza()I

    move-result v4

    if-gt v5, v4, :cond_0

    iget-object v4, p0, Liv7;->a:[I

    add-int/lit8 v9, v2, 0x2

    aget v4, v4, v9

    :cond_0
    const/16 v4, 0x3f

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_a

    :pswitch_0
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfv7;

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lut7;->d(ILfv7;LNv7;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v7

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    add-long v9, v7, v7

    shr-long v6, v7, v4

    xor-long/2addr v6, v9

    invoke-static {v6, v7}, Lut7;->n(J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_2
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_4
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_5
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->f(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkt7;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-virtual {v4}, Lkt7;->e()I

    move-result v4

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, LPv7;->Q(ILjava/lang/Object;LNv7;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lkt7;

    if-eqz v5, :cond_1

    check-cast v4, Lkt7;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-virtual {v4}, Lkt7;->e()I

    move-result v4

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_3

    :cond_1
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->k(Ljava/lang/String;)I

    move-result v4

    goto/16 :goto_5

    :pswitch_a
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_c
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_d
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->f(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_e
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lut7;->m(I)I

    move-result v6

    invoke-static {v4, v5}, Lut7;->n(J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_f
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lut7;->m(I)I

    move-result v6

    invoke-static {v4, v5}, Lut7;->n(J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_10
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_11
    invoke-virtual {p0, p1, v6, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_12
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lav7;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_13
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, LPv7;->L(ILjava/util/List;LNv7;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_14
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->V(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_15
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->T(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_16
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_17
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_18
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->G(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_19
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->Y(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_1a
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_1b
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_1c
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto :goto_1

    :pswitch_1d
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->N(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto :goto_1

    :pswitch_1e
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->a0(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto :goto_1

    :pswitch_1f
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->P(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto :goto_1

    :pswitch_20
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto :goto_1

    :pswitch_21
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LPv7;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lut7;->l(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    :goto_1
    add-int/2addr v5, v6

    goto/16 :goto_5

    :pswitch_22
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->U(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_23
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->S(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_24
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->J(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_25
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->H(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_26
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->F(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_27
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->X(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_28
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, LPv7;->E(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_29
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, LPv7;->R(ILjava/util/List;LNv7;)I

    move-result v4

    goto :goto_2

    :pswitch_2a
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, LPv7;->W(ILjava/util/List;)I

    move-result v4

    goto :goto_2

    :pswitch_2b
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->A(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2c
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2d
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->J(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2e
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->M(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2f
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->Z(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_30
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->O(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_31
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_32
    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, LPv7;->J(ILjava/util/List;Z)I

    move-result v4

    :goto_2
    add-int/2addr v3, v4

    goto/16 :goto_a

    :pswitch_33
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfv7;

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lut7;->d(ILfv7;LNv7;)I

    move-result v4

    goto :goto_2

    :pswitch_34
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v7

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    add-long v9, v7, v7

    shr-long v6, v7, v4

    xor-long/2addr v6, v9

    invoke-static {v6, v7}, Lut7;->n(J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_35
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_36
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_37
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_38
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->f(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_39
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkt7;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-virtual {v4}, Lkt7;->e()I

    move-result v4

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    :goto_3
    add-int/2addr v6, v4

    add-int/2addr v5, v6

    goto/16 :goto_6

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, LPv7;->Q(ILjava/lang/Object;LNv7;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lkt7;

    if-eqz v5, :cond_2

    check-cast v4, Lkt7;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-virtual {v4}, Lkt7;->e()I

    move-result v4

    invoke-static {v4}, Lut7;->m(I)I

    move-result v6

    goto :goto_3

    :cond_2
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->k(Ljava/lang/String;)I

    move-result v4

    goto :goto_5

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto :goto_8

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    goto :goto_9

    :pswitch_40
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lut7;->m(I)I

    move-result v5

    invoke-static {v4}, Lut7;->f(I)I

    move-result v4

    :goto_5
    add-int/2addr v5, v4

    :goto_6
    add-int/2addr v3, v5

    goto :goto_a

    :pswitch_41
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lut7;->m(I)I

    move-result v6

    invoke-static {v4, v5}, Lut7;->n(J)I

    move-result v4

    goto :goto_7

    :pswitch_42
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lut7;->m(I)I

    move-result v6

    invoke-static {v4, v5}, Lut7;->n(J)I

    move-result v4

    :goto_7
    add-int/2addr v6, v4

    add-int/2addr v3, v6

    goto :goto_a

    :pswitch_43
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    :goto_8
    add-int/lit8 v4, v4, 0x4

    goto/16 :goto_2

    :pswitch_44
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lut7;->m(I)I

    move-result v4

    :goto_9
    add-int/lit8 v4, v4, 0x8

    goto/16 :goto_2

    :cond_3
    :goto_a
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Liv7;->m:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsw7;->a(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v3, p1

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

.method public final O(Ljava/lang/Object;[BIIIJLFs7;)I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v6, p2

    move/from16 v7, p4

    move-wide/from16 v1, p6

    move-object/from16 v8, p8

    sget-object v3, Liv7;->r:Lsun/misc/Unsafe;

    move-object/from16 v9, p0

    move/from16 v4, p5

    invoke-virtual {v9, v4}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lav7;->b(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-static {}, LZu7;->d()LZu7;

    move-result-object v10

    invoke-virtual {v10}, LZu7;->e()LZu7;

    move-result-object v10

    invoke-static {v10, v5}, Lav7;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v0, v1, v2, v10}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v5, v10

    :cond_0
    check-cast v4, LYu7;

    invoke-virtual {v4}, LYu7;->c()LXu7;

    move-result-object v10

    move-object v11, v5

    check-cast v11, LZu7;

    move/from16 v0, p3

    invoke-static {v6, v0, v8}, LGs7;->j([BILFs7;)I

    move-result v0

    iget v1, v8, LFs7;->a:I

    if-ltz v1, :cond_7

    sub-int v2, v7, v0

    if-gt v1, v2, :cond_7

    add-int v12, v0, v1

    iget-object v1, v10, LXu7;->b:Ljava/lang/Object;

    iget-object v2, v10, LXu7;->d:Ljava/lang/Object;

    move-object v13, v1

    move-object v14, v2

    :goto_0
    if-ge v0, v12, :cond_5

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v6, v0

    if-gez v0, :cond_1

    invoke-static {v0, v6, v1, v8}, LGs7;->k(I[BILFs7;)I

    move-result v0

    iget v1, v8, LFs7;->a:I

    move v15, v1

    move v1, v0

    move v0, v15

    :cond_1
    and-int/lit8 v2, v0, 0x7

    ushr-int/lit8 v3, v0, 0x3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v10, LXu7;->c:LIw7;

    invoke-virtual {v3}, LIw7;->zza()I

    move-result v3

    if-ne v2, v3, :cond_4

    iget-object v3, v10, LXu7;->c:LIw7;

    iget-object v0, v10, LXu7;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v0, p2

    move/from16 v2, p4

    move-object/from16 v5, p8

    invoke-static/range {v0 .. v5}, Liv7;->D([BIILIw7;Ljava/lang/Class;LFs7;)I

    move-result v0

    iget-object v14, v8, LFs7;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iget-object v3, v10, LXu7;->a:LIw7;

    invoke-virtual {v3}, LIw7;->zza()I

    move-result v3

    if-ne v2, v3, :cond_4

    iget-object v3, v10, LXu7;->a:LIw7;

    const/4 v4, 0x0

    move-object/from16 v0, p2

    move/from16 v2, p4

    move-object/from16 v5, p8

    invoke-static/range {v0 .. v5}, Liv7;->D([BIILIw7;Ljava/lang/Class;LFs7;)I

    move-result v0

    iget-object v13, v8, LFs7;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {v0, v6, v1, v7, v8}, LGs7;->n(I[BIILFs7;)I

    move-result v0

    goto :goto_0

    :cond_5
    if-ne v0, v12, :cond_6

    invoke-interface {v11, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v12

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v0

    throw v0

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v0

    throw v0
.end method

.method public final P(Ljava/lang/Object;[BIIIIIIIJILFs7;)I
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

    move/from16 v2, p5

    move/from16 v8, p6

    move/from16 v5, p7

    move-wide/from16 v9, p10

    move/from16 v6, p12

    move-object/from16 v11, p13

    sget-object v12, Liv7;->r:Lsun/misc/Unsafe;

    iget-object v7, v0, Liv7;->a:[I

    add-int/lit8 v13, v6, 0x2

    aget v7, v7, v13

    const v13, 0xfffff

    and-int/2addr v7, v13

    int-to-long v13, v7

    const/4 v7, 0x5

    const/4 v15, 0x2

    packed-switch p9, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    const/4 v7, 0x3

    if-ne v5, v7, :cond_13

    invoke-virtual {v0, v6}, Liv7;->l(I)LNv7;

    move-result-object v5

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v6, v2, 0x4

    move-object v2, v5

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, LGs7;->c(LNv7;[BIIILFs7;)I

    move-result v2

    invoke-virtual {v12, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_0

    invoke-virtual {v12, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v15

    goto :goto_0

    :cond_0
    const/4 v15, 0x0

    :goto_0
    if-nez v15, :cond_1

    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-static {v15, v3}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_1
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_1
    if-eqz v5, :cond_2

    goto/16 :goto_9

    :cond_2
    invoke-static {v3, v4, v11}, LGs7;->m([BILFs7;)I

    move-result v2

    iget-wide v3, v11, LFs7;->b:J

    invoke-static {v3, v4}, Lot7;->f(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_2
    if-eqz v5, :cond_3

    goto/16 :goto_9

    :cond_3
    invoke-static {v3, v4, v11}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v3, v11, LFs7;->a:I

    invoke-static {v3}, Lot7;->e(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    if-nez v5, :cond_13

    invoke-static {v3, v4, v11}, LGs7;->j([BILFs7;)I

    move-result v3

    iget v4, v11, LFs7;->a:I

    invoke-virtual {v0, v6}, Liv7;->k(I)Liu7;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-interface {v5, v4}, Liu7;->zza(I)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-static/range {p1 .. p1}, Liv7;->G(Ljava/lang/Object;)Ltw7;

    move-result-object v1

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ltw7;->h(ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_3
    move v2, v3

    goto/16 :goto_a

    :pswitch_4
    if-eq v5, v15, :cond_6

    goto/16 :goto_9

    :cond_6
    invoke-static {v3, v4, v11}, LGs7;->a([BILFs7;)I

    move-result v2

    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    if-ne v5, v15, :cond_13

    invoke-virtual {v0, v6}, Liv7;->l(I)LNv7;

    move-result-object v2

    move/from16 v5, p4

    invoke-static {v2, v3, v4, v5, v11}, LGs7;->d(LNv7;[BIILFs7;)I

    move-result v2

    invoke-virtual {v12, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_7

    invoke-virtual {v12, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v15

    goto :goto_4

    :cond_7
    const/4 v15, 0x0

    :goto_4
    if-nez v15, :cond_8

    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :cond_8
    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-static {v15, v3}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_5
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_6
    if-ne v5, v15, :cond_13

    invoke-static {v3, v4, v11}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v4, v11, LFs7;->a:I

    if-nez v4, :cond_9

    const-string v3, ""

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :cond_9
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_b

    add-int v5, v2, v4

    invoke-static {v3, v2, v5}, LHw7;->i([BII)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->d()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_b
    :goto_6
    new-instance v5, Ljava/lang/String;

    sget-object v6, Lou7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v5, v3, v2, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v12, v1, v9, v10, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v4

    :goto_7
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_7
    if-nez v5, :cond_13

    invoke-static {v3, v4, v11}, LGs7;->m([BILFs7;)I

    move-result v2

    iget-wide v3, v11, LFs7;->b:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_c

    const/4 v15, 0x1

    goto :goto_8

    :cond_c
    const/4 v15, 0x0

    :goto_8
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_8
    if-eq v5, v7, :cond_d

    goto/16 :goto_9

    :cond_d
    invoke-static/range {p2 .. p3}, LGs7;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x4

    return v1

    :pswitch_9
    const/4 v2, 0x1

    if-eq v5, v2, :cond_e

    goto :goto_9

    :cond_e
    invoke-static/range {p2 .. p3}, LGs7;->o([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x8

    return v1

    :pswitch_a
    if-eqz v5, :cond_f

    goto :goto_9

    :cond_f
    invoke-static {v3, v4, v11}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v3, v11, LFs7;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    if-eqz v5, :cond_10

    goto :goto_9

    :cond_10
    invoke-static {v3, v4, v11}, LGs7;->m([BILFs7;)I

    move-result v2

    iget-wide v3, v11, LFs7;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    if-eq v5, v7, :cond_11

    goto :goto_9

    :cond_11
    invoke-static/range {p2 .. p3}, LGs7;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x4

    return v1

    :pswitch_d
    const/4 v2, 0x1

    if-eq v5, v2, :cond_12

    goto :goto_9

    :cond_12
    invoke-static/range {p2 .. p3}, LGs7;->o([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x8

    return v1

    :cond_13
    :goto_9
    move v2, v4

    :goto_a
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

.method public final Q(Ljava/lang/Object;[BIILFs7;)I
    .locals 29
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

    sget-object v9, Liv7;->r:Lsun/misc/Unsafe;

    const v10, 0xfffff

    const/16 v16, 0x0

    const/4 v8, -0x1

    move/from16 v0, p3

    move v1, v8

    move v7, v10

    move/from16 v2, v16

    move v6, v2

    :goto_0
    if-ge v0, v13, :cond_15

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v3, v11}, LGs7;->k(I[BILFs7;)I

    move-result v0

    iget v3, v11, LFs7;->a:I

    move v4, v0

    move/from16 v17, v3

    goto :goto_1

    :cond_0
    move/from16 v17, v0

    move v4, v3

    :goto_1
    ushr-int/lit8 v5, v17, 0x3

    and-int/lit8 v3, v17, 0x7

    if-le v5, v1, :cond_1

    div-int/lit8 v2, v2, 0x3

    invoke-virtual {v15, v5, v2}, Liv7;->T(II)I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v5}, Liv7;->S(I)I

    move-result v0

    :goto_2
    move v2, v0

    if-ne v2, v8, :cond_2

    move v2, v4

    move/from16 v21, v5

    move/from16 v18, v8

    move-object/from16 v28, v9

    move/from16 v24, v16

    goto/16 :goto_10

    :cond_2
    iget-object v0, v15, Liv7;->a:[I

    add-int/lit8 v1, v2, 0x1

    aget v1, v0, v1

    invoke-static {v1}, Liv7;->c(I)I

    move-result v8

    move/from16 p3, v5

    and-int v5, v1, v10

    int-to-long v10, v5

    const/16 v5, 0x11

    move-wide/from16 v20, v10

    if-gt v8, v5, :cond_c

    add-int/lit8 v5, v2, 0x2

    aget v0, v0, v5

    ushr-int/lit8 v5, v0, 0x14

    const/4 v11, 0x1

    shl-int v22, v11, v5

    const v5, 0xfffff

    and-int/2addr v0, v5

    if-eq v0, v7, :cond_5

    if-eq v7, v5, :cond_3

    int-to-long v10, v7

    invoke-virtual {v9, v14, v10, v11, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    if-eq v0, v5, :cond_4

    int-to-long v6, v0

    invoke-virtual {v9, v14, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    :cond_4
    move v7, v0

    :cond_5
    const/4 v0, 0x5

    packed-switch v8, :pswitch_data_0

    move/from16 v21, p3

    move-object/from16 v11, p5

    move v10, v2

    move v8, v4

    move/from16 v24, v5

    goto/16 :goto_a

    :pswitch_0
    if-nez v3, :cond_6

    move-object/from16 v11, p5

    move-wide/from16 v0, v20

    invoke-static {v12, v4, v11}, LGs7;->m([BILFs7;)I

    move-result v8

    iget-wide v3, v11, LFs7;->b:J

    invoke-static {v3, v4}, Lot7;->f(J)J

    move-result-wide v19

    move-wide v3, v0

    move-object v0, v9

    move-object/from16 v1, p1

    move v10, v2

    move-wide v2, v3

    move/from16 v21, p3

    move/from16 v24, v5

    move-wide/from16 v4, v19

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_7

    :cond_6
    move/from16 v21, p3

    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    goto/16 :goto_6

    :pswitch_1
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v0, v20

    move/from16 v21, p3

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v3, v11, LFs7;->a:I

    invoke-static {v3}, Lot7;->e(I)I

    move-result v3

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_3

    :pswitch_2
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v0, v20

    move/from16 v21, p3

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v3, v11, LFs7;->a:I

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_3

    :pswitch_3
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v0, v20

    const/4 v2, 0x2

    move/from16 v21, p3

    if-ne v3, v2, :cond_a

    invoke-static {v12, v4, v11}, LGs7;->a([BILFs7;)I

    move-result v2

    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_3
    or-int v6, v6, v22

    move v0, v2

    goto/16 :goto_c

    :pswitch_4
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v0, v20

    const/4 v2, 0x2

    move/from16 v21, p3

    if-ne v3, v2, :cond_a

    invoke-virtual {v15, v10}, Liv7;->l(I)LNv7;

    move-result-object v2

    invoke-static {v2, v12, v4, v13, v11}, LGs7;->d(LNv7;[BIILFs7;)I

    move-result v2

    invoke-virtual {v9, v14, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    iget-object v3, v11, LFs7;->c:Ljava/lang/Object;

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_7
    iget-object v4, v11, LFs7;->c:Ljava/lang/Object;

    invoke-static {v3, v4}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :pswitch_5
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v25, v20

    const/4 v0, 0x2

    move/from16 v21, p3

    if-ne v3, v0, :cond_a

    const/high16 v0, 0x20000000

    and-int/2addr v0, v1

    if-nez v0, :cond_8

    invoke-static {v12, v4, v11}, LGs7;->g([BILFs7;)I

    move-result v0

    goto :goto_4

    :cond_8
    invoke-static {v12, v4, v11}, LGs7;->h([BILFs7;)I

    move-result v0

    :goto_4
    iget-object v1, v11, LFs7;->c:Ljava/lang/Object;

    move-wide/from16 v2, v25

    invoke-virtual {v9, v14, v2, v3, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_6
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v1, v20

    move/from16 v21, p3

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, LGs7;->m([BILFs7;)I

    move-result v0

    iget-wide v3, v11, LFs7;->b:J

    const-wide/16 v19, 0x0

    cmp-long v3, v3, v19

    if-eqz v3, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    move/from16 v3, v16

    :goto_5
    invoke-static {v14, v1, v2, v3}, LCw7;->r(Ljava/lang/Object;JZ)V

    goto/16 :goto_9

    :pswitch_7
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v1, v20

    move/from16 v21, p3

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, LGs7;->b([BI)I

    move-result v0

    invoke-virtual {v9, v14, v1, v2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v4, 0x4

    goto/16 :goto_9

    :pswitch_8
    move-object/from16 v11, p5

    move v10, v2

    move/from16 v24, v5

    move-wide/from16 v1, v20

    const/4 v0, 0x1

    move/from16 v21, p3

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, LGs7;->o([BI)J

    move-result-wide v19

    move-object v0, v9

    move-wide v2, v1

    move-object/from16 v1, p1

    move v8, v4

    move-wide/from16 v4, v19

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_8

    :cond_a
    :goto_6
    move v8, v4

    goto/16 :goto_a

    :pswitch_9
    move-object/from16 v11, p5

    move v10, v2

    move v8, v4

    move/from16 v24, v5

    move-wide/from16 v4, v20

    move/from16 v21, p3

    if-nez v3, :cond_b

    invoke-static {v12, v8, v11}, LGs7;->j([BILFs7;)I

    move-result v0

    iget v1, v11, LFs7;->a:I

    invoke-virtual {v9, v14, v4, v5, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_9

    :pswitch_a
    move-object/from16 v11, p5

    move v10, v2

    move v8, v4

    move/from16 v24, v5

    move-wide/from16 v4, v20

    move/from16 v21, p3

    if-nez v3, :cond_b

    invoke-static {v12, v8, v11}, LGs7;->m([BILFs7;)I

    move-result v8

    iget-wide v2, v11, LFs7;->b:J

    move-object v0, v9

    move-object/from16 v1, p1

    move-wide/from16 v19, v2

    move-wide v2, v4

    move-wide/from16 v4, v19

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    :goto_7
    or-int v6, v6, v22

    move v0, v8

    goto/16 :goto_c

    :pswitch_b
    move-object/from16 v11, p5

    move v10, v2

    move v8, v4

    move/from16 v24, v5

    move-wide/from16 v4, v20

    move/from16 v21, p3

    if-ne v3, v0, :cond_b

    invoke-static {v12, v8}, LGs7;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v4, v5, v0}, LCw7;->u(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v8, 0x4

    goto :goto_9

    :pswitch_c
    move-object/from16 v11, p5

    move v10, v2

    move v8, v4

    move/from16 v24, v5

    move-wide/from16 v4, v20

    const/4 v0, 0x1

    move/from16 v21, p3

    if-ne v3, v0, :cond_b

    invoke-static {v12, v8}, LGs7;->o([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v4, v5, v0, v1}, LCw7;->t(Ljava/lang/Object;JD)V

    :goto_8
    add-int/lit8 v0, v8, 0x8

    :goto_9
    or-int v6, v6, v22

    goto :goto_c

    :cond_b
    :goto_a
    move v2, v8

    move-object/from16 v28, v9

    move/from16 v24, v10

    const/16 v18, -0x1

    goto/16 :goto_10

    :cond_c
    move-object/from16 v11, p5

    move v10, v2

    move v2, v4

    move-wide/from16 v4, v20

    const v24, 0xfffff

    move/from16 v21, p3

    const/16 v0, 0x1b

    if-ne v8, v0, :cond_10

    const/4 v0, 0x2

    if-ne v3, v0, :cond_f

    invoke-virtual {v9, v14, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnu7;

    invoke-interface {v0}, Lnu7;->zzc()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0xa

    goto :goto_b

    :cond_d
    add-int/2addr v1, v1

    :goto_b
    invoke-interface {v0, v1}, Lnu7;->d(I)Lnu7;

    move-result-object v0

    invoke-virtual {v9, v14, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_e
    move-object v5, v0

    invoke-virtual {v15, v10}, Liv7;->l(I)LNv7;

    move-result-object v0

    move/from16 v1, v17

    move v3, v2

    move-object/from16 v2, p2

    move/from16 v4, p4

    move v8, v6

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, LGs7;->e(LNv7;I[BIILnu7;LFs7;)I

    move-result v0

    move v6, v8

    :goto_c
    move v2, v10

    move/from16 v1, v21

    move/from16 v10, v24

    const/4 v8, -0x1

    goto/16 :goto_0

    :cond_f
    move v14, v2

    move/from16 v23, v6

    move v15, v7

    move-object/from16 v28, v9

    move/from16 v24, v10

    const/16 v18, -0x1

    goto/16 :goto_e

    :cond_10
    const/16 v0, 0x31

    if-gt v8, v0, :cond_12

    int-to-long v0, v1

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 p3, v2

    move-object/from16 v2, p2

    move/from16 v22, v3

    move/from16 v3, p3

    move-wide/from16 v25, v4

    move/from16 v4, p4

    move/from16 v5, v17

    move v15, v6

    move/from16 v6, v21

    move/from16 v23, v15

    move v15, v7

    move/from16 v7, v22

    move/from16 v27, v8

    const/16 v18, -0x1

    move v8, v10

    move-object/from16 v28, v9

    move/from16 v24, v10

    move-wide/from16 v9, v19

    move/from16 v11, v27

    move-wide/from16 v12, v25

    move-object/from16 v14, p5

    invoke-virtual/range {v0 .. v14}, Liv7;->R(Ljava/lang/Object;[BIIIIIIJIJLFs7;)I

    move-result v0

    move/from16 v14, p3

    if-eq v0, v14, :cond_11

    :goto_d
    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move v7, v15

    move/from16 v8, v18

    move/from16 v1, v21

    move/from16 v6, v23

    move/from16 v2, v24

    move-object/from16 v9, v28

    const v10, 0xfffff

    move-object/from16 v15, p0

    goto/16 :goto_0

    :cond_11
    move v2, v0

    goto :goto_f

    :cond_12
    move v14, v2

    move/from16 v22, v3

    move-wide/from16 v25, v4

    move/from16 v23, v6

    move v15, v7

    move/from16 v27, v8

    move-object/from16 v28, v9

    move/from16 v24, v10

    const/16 v18, -0x1

    const/16 v0, 0x32

    move/from16 v9, v27

    if-ne v9, v0, :cond_14

    move/from16 v7, v22

    const/4 v0, 0x2

    if-ne v7, v0, :cond_13

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move/from16 v5, v24

    move-wide/from16 v6, v25

    move-object/from16 v8, p5

    invoke-virtual/range {v0 .. v8}, Liv7;->O(Ljava/lang/Object;[BIIIJLFs7;)I

    move-result v0

    if-eq v0, v14, :cond_11

    goto :goto_d

    :cond_13
    :goto_e
    move v2, v14

    :goto_f
    move v7, v15

    move/from16 v6, v23

    goto :goto_10

    :cond_14
    move/from16 v7, v22

    move-object/from16 v0, p0

    move v8, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move/from16 v5, v17

    move/from16 v6, v21

    move-wide/from16 v10, v25

    move/from16 v12, v24

    move-object/from16 v13, p5

    invoke-virtual/range {v0 .. v13}, Liv7;->P(Ljava/lang/Object;[BIIIIIIIJILFs7;)I

    move-result v0

    if-eq v0, v14, :cond_11

    goto :goto_d

    :goto_10
    invoke-static/range {p1 .. p1}, Liv7;->G(Ljava/lang/Object;)Ltw7;

    move-result-object v4

    move/from16 v0, v17

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, LGs7;->i(I[BIILtw7;LFs7;)I

    move-result v0

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move/from16 v8, v18

    move/from16 v1, v21

    move/from16 v2, v24

    move-object/from16 v9, v28

    const v10, 0xfffff

    goto/16 :goto_0

    :cond_15
    move/from16 v23, v6

    move v15, v7

    move-object/from16 v28, v9

    move v1, v10

    if-eq v15, v1, :cond_16

    int-to-long v1, v15

    move-object/from16 v3, p1

    move/from16 v6, v23

    move-object/from16 v4, v28

    invoke-virtual {v4, v3, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_16
    move/from16 v1, p4

    if-ne v0, v1, :cond_17

    return v0

    :cond_17
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v0

    throw v0

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

.method public final R(Ljava/lang/Object;[BIIIIIIJIJLFs7;)I
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v2, p5

    move/from16 v6, p7

    move/from16 v8, p8

    move-wide/from16 v9, p12

    move-object/from16 v7, p14

    sget-object v11, Liv7;->r:Lsun/misc/Unsafe;

    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lnu7;

    invoke-interface {v12}, Lnu7;->zzc()Z

    move-result v13

    if-nez v13, :cond_1

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-nez v13, :cond_0

    const/16 v13, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v13, v13

    :goto_0
    invoke-interface {v12, v13}, Lnu7;->d(I)Lnu7;

    move-result-object v12

    invoke-virtual {v11, v1, v9, v10, v12}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v9, 0x5

    const-wide/16 v10, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x2

    packed-switch p11, :pswitch_data_0

    const/4 v1, 0x3

    if-ne v6, v1, :cond_48

    invoke-virtual {p0, v8}, Liv7;->l(I)LNv7;

    move-result-object v1

    and-int/lit8 v6, v2, -0x8

    or-int/lit8 v6, v6, 0x4

    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, LGs7;->c(LNv7;[BIIILFs7;)I

    move-result v4

    iget-object v8, v7, LFs7;->c:Ljava/lang/Object;

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_25

    :pswitch_0
    if-ne v6, v14, :cond_4

    check-cast v12, LTu7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-static {v3, v1, v7}, LGs7;->m([BILFs7;)I

    move-result v1

    iget-wide v4, v7, LFs7;->b:J

    invoke-static {v4, v5}, Lot7;->f(J)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, LTu7;->e(J)V

    goto :goto_1

    :cond_2
    if-ne v1, v2, :cond_3

    goto/16 :goto_28

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_4
    if-nez v6, :cond_48

    check-cast v12, LTu7;

    invoke-static {v3, v4, v7}, LGs7;->m([BILFs7;)I

    move-result v1

    iget-wide v8, v7, LFs7;->b:J

    invoke-static {v8, v9}, Lot7;->f(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, LTu7;->e(J)V

    :goto_2
    if-ge v1, v5, :cond_6

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v3, v4, v7}, LGs7;->m([BILFs7;)I

    move-result v1

    iget-wide v8, v7, LFs7;->b:J

    invoke-static {v8, v9}, Lot7;->f(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, LTu7;->e(J)V

    goto :goto_2

    :cond_6
    :goto_3
    return v1

    :pswitch_1
    if-ne v6, v14, :cond_9

    check-cast v12, Lfu7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_4
    if-ge v1, v2, :cond_7

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    invoke-static {v4}, Lot7;->e(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lfu7;->e(I)V

    goto :goto_4

    :cond_7
    if-ne v1, v2, :cond_8

    goto/16 :goto_28

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_9
    if-nez v6, :cond_48

    check-cast v12, Lfu7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    invoke-static {v4}, Lot7;->e(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lfu7;->e(I)V

    :goto_5
    if-ge v1, v5, :cond_b

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    invoke-static {v4}, Lot7;->e(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lfu7;->e(I)V

    goto :goto_5

    :cond_b
    :goto_6
    return v1

    :pswitch_2
    if-ne v6, v14, :cond_c

    invoke-static {v3, v4, v12, v7}, LGs7;->f([BILnu7;LFs7;)I

    move-result v2

    goto :goto_7

    :cond_c
    if-nez v6, :cond_48

    move/from16 v2, p5

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v12

    move-object/from16 v7, p14

    invoke-static/range {v2 .. v7}, LGs7;->l(I[BIILnu7;LFs7;)I

    move-result v2

    :goto_7
    check-cast v1, Leu7;

    iget-object v3, v1, Leu7;->zzc:Ltw7;

    invoke-static {}, Ltw7;->c()Ltw7;

    move-result-object v4

    if-ne v3, v4, :cond_d

    const/4 v3, 0x0

    :cond_d
    invoke-virtual {p0, v8}, Liv7;->k(I)Liu7;

    move-result-object v4

    iget-object v5, v0, Liv7;->m:Lsw7;

    move/from16 v6, p6

    invoke-static {v6, v12, v4, v3, v5}, LPv7;->c(ILjava/util/List;Liu7;Ljava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_e

    goto/16 :goto_11

    :cond_e
    check-cast v3, Ltw7;

    iput-object v3, v1, Leu7;->zzc:Ltw7;

    return v2

    :pswitch_3
    if-ne v6, v14, :cond_48

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    if-ltz v4, :cond_16

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_15

    if-nez v4, :cond_f

    sget-object v4, Lkt7;->c:Lkt7;

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_f
    invoke-static {v3, v1, v4}, Lkt7;->D([BII)Lkt7;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/2addr v1, v4

    :goto_9
    if-ge v1, v5, :cond_14

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_10

    goto :goto_a

    :cond_10
    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    if-ltz v4, :cond_13

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_12

    if-nez v4, :cond_11

    sget-object v4, Lkt7;->c:Lkt7;

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_11
    invoke-static {v3, v1, v4}, Lkt7;->D([BII)Lkt7;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_13
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_14
    :goto_a
    return v1

    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_16
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :pswitch_4
    if-eq v6, v14, :cond_17

    goto/16 :goto_27

    :cond_17
    invoke-virtual {p0, v8}, Liv7;->l(I)LNv7;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v12

    move-object/from16 p12, p14

    invoke-static/range {p6 .. p12}, LGs7;->e(LNv7;I[BIILnu7;LFs7;)I

    move-result v1

    return v1

    :pswitch_5
    if-ne v6, v14, :cond_48

    const-wide/32 v8, 0x20000000

    and-long v8, p9, v8

    cmp-long v1, v8, v10

    const-string v6, ""

    if-nez v1, :cond_1c

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    if-ltz v4, :cond_1b

    if-nez v4, :cond_18

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_18
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lou7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v1, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/2addr v1, v4

    :goto_c
    if-ge v1, v5, :cond_49

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v8, v7, LFs7;->a:I

    if-ne v2, v8, :cond_49

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    if-ltz v4, :cond_1a

    if-nez v4, :cond_19

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_19
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lou7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v1, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1a
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_1b
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_1c
    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    if-ltz v4, :cond_22

    if-nez v4, :cond_1d

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1d
    add-int v8, v1, v4

    invoke-static {v3, v1, v8}, LHw7;->i([BII)Z

    move-result v9

    if-eqz v9, :cond_21

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lou7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v1, v4, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_d
    move v1, v8

    :goto_e
    if-ge v1, v5, :cond_49

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v8, v7, LFs7;->a:I

    if-ne v2, v8, :cond_49

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v4, v7, LFs7;->a:I

    if-ltz v4, :cond_20

    if-nez v4, :cond_1e

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1e
    add-int v8, v1, v4

    invoke-static {v3, v1, v8}, LHw7;->i([BII)Z

    move-result v9

    if-eqz v9, :cond_1f

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lou7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v1, v4, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_1f
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->d()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_20
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_21
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->d()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :pswitch_6
    const/4 v1, 0x0

    if-ne v6, v14, :cond_26

    check-cast v12, LHs7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v2

    iget v4, v7, LFs7;->a:I

    add-int/2addr v4, v2

    :goto_f
    if-ge v2, v4, :cond_24

    invoke-static {v3, v2, v7}, LGs7;->m([BILFs7;)I

    move-result v2

    iget-wide v5, v7, LFs7;->b:J

    cmp-long v5, v5, v10

    if-eqz v5, :cond_23

    move v5, v13

    goto :goto_10

    :cond_23
    move v5, v1

    :goto_10
    invoke-virtual {v12, v5}, LHs7;->b(Z)V

    goto :goto_f

    :cond_24
    if-ne v2, v4, :cond_25

    :goto_11
    move v1, v2

    goto/16 :goto_28

    :cond_25
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_26
    if-nez v6, :cond_48

    check-cast v12, LHs7;

    invoke-static {v3, v4, v7}, LGs7;->m([BILFs7;)I

    move-result v4

    iget-wide v8, v7, LFs7;->b:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_27

    move v6, v13

    goto :goto_12

    :cond_27
    move v6, v1

    :goto_12
    invoke-virtual {v12, v6}, LHs7;->b(Z)V

    :goto_13
    if-ge v4, v5, :cond_2a

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v6

    iget v8, v7, LFs7;->a:I

    if-eq v2, v8, :cond_28

    goto :goto_15

    :cond_28
    invoke-static {v3, v6, v7}, LGs7;->m([BILFs7;)I

    move-result v4

    iget-wide v8, v7, LFs7;->b:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_29

    move v6, v13

    goto :goto_14

    :cond_29
    move v6, v1

    :goto_14
    invoke-virtual {v12, v6}, LHs7;->b(Z)V

    goto :goto_13

    :cond_2a
    :goto_15
    return v4

    :pswitch_7
    if-ne v6, v14, :cond_2d

    check-cast v12, Lfu7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_16
    if-ge v1, v2, :cond_2b

    invoke-static {v3, v1}, LGs7;->b([BI)I

    move-result v4

    invoke-virtual {v12, v4}, Lfu7;->e(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_16

    :cond_2b
    if-ne v1, v2, :cond_2c

    goto/16 :goto_28

    :cond_2c
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_2d
    if-ne v6, v9, :cond_48

    check-cast v12, Lfu7;

    invoke-static/range {p2 .. p3}, LGs7;->b([BI)I

    move-result v1

    invoke-virtual {v12, v1}, Lfu7;->e(I)V

    :goto_17
    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_2f

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_2e

    goto :goto_18

    :cond_2e
    invoke-static {v3, v4}, LGs7;->b([BI)I

    move-result v1

    invoke-virtual {v12, v1}, Lfu7;->e(I)V

    goto :goto_17

    :cond_2f
    :goto_18
    return v1

    :pswitch_8
    if-ne v6, v14, :cond_32

    check-cast v12, LTu7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_19
    if-ge v1, v2, :cond_30

    invoke-static {v3, v1}, LGs7;->o([BI)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, LTu7;->e(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_19

    :cond_30
    if-ne v1, v2, :cond_31

    goto/16 :goto_28

    :cond_31
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_32
    if-ne v6, v13, :cond_48

    check-cast v12, LTu7;

    invoke-static/range {p2 .. p3}, LGs7;->o([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, LTu7;->e(J)V

    :goto_1a
    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_34

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_33

    goto :goto_1b

    :cond_33
    invoke-static {v3, v4}, LGs7;->o([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, LTu7;->e(J)V

    goto :goto_1a

    :cond_34
    :goto_1b
    return v1

    :pswitch_9
    if-ne v6, v14, :cond_35

    invoke-static {v3, v4, v12, v7}, LGs7;->f([BILnu7;LFs7;)I

    move-result v1

    goto/16 :goto_28

    :cond_35
    if-eqz v6, :cond_36

    goto/16 :goto_27

    :cond_36
    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v12

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, LGs7;->l(I[BIILnu7;LFs7;)I

    move-result v1

    return v1

    :pswitch_a
    if-ne v6, v14, :cond_39

    check-cast v12, LTu7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_1c
    if-ge v1, v2, :cond_37

    invoke-static {v3, v1, v7}, LGs7;->m([BILFs7;)I

    move-result v1

    iget-wide v4, v7, LFs7;->b:J

    invoke-virtual {v12, v4, v5}, LTu7;->e(J)V

    goto :goto_1c

    :cond_37
    if-ne v1, v2, :cond_38

    goto/16 :goto_28

    :cond_38
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_39
    if-nez v6, :cond_48

    check-cast v12, LTu7;

    invoke-static {v3, v4, v7}, LGs7;->m([BILFs7;)I

    move-result v1

    iget-wide v8, v7, LFs7;->b:J

    invoke-virtual {v12, v8, v9}, LTu7;->e(J)V

    :goto_1d
    if-ge v1, v5, :cond_3b

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_3a

    goto :goto_1e

    :cond_3a
    invoke-static {v3, v4, v7}, LGs7;->m([BILFs7;)I

    move-result v1

    iget-wide v8, v7, LFs7;->b:J

    invoke-virtual {v12, v8, v9}, LTu7;->e(J)V

    goto :goto_1d

    :cond_3b
    :goto_1e
    return v1

    :pswitch_b
    if-ne v6, v14, :cond_3e

    check-cast v12, LWt7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_1f
    if-ge v1, v2, :cond_3c

    invoke-static {v3, v1}, LGs7;->b([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v12, v4}, LWt7;->c(F)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_1f

    :cond_3c
    if-ne v1, v2, :cond_3d

    goto/16 :goto_28

    :cond_3d
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_3e
    if-ne v6, v9, :cond_48

    check-cast v12, LWt7;

    invoke-static/range {p2 .. p3}, LGs7;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v12, v1}, LWt7;->c(F)V

    :goto_20
    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_40

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_3f

    goto :goto_21

    :cond_3f
    invoke-static {v3, v4}, LGs7;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v12, v1}, LWt7;->c(F)V

    goto :goto_20

    :cond_40
    :goto_21
    return v1

    :pswitch_c
    if-ne v6, v14, :cond_43

    check-cast v12, Lwt7;

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v1

    iget v2, v7, LFs7;->a:I

    add-int/2addr v2, v1

    :goto_22
    if-ge v1, v2, :cond_41

    invoke-static {v3, v1}, LGs7;->o([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lwt7;->b(D)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_22

    :cond_41
    if-ne v1, v2, :cond_42

    goto :goto_28

    :cond_42
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object v1

    throw v1

    :cond_43
    if-ne v6, v13, :cond_48

    check-cast v12, Lwt7;

    invoke-static/range {p2 .. p3}, LGs7;->o([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lwt7;->b(D)V

    :goto_23
    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_45

    invoke-static {v3, v1, v7}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v6, v7, LFs7;->a:I

    if-eq v2, v6, :cond_44

    goto :goto_24

    :cond_44
    invoke-static {v3, v4}, LGs7;->o([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lwt7;->b(D)V

    goto :goto_23

    :cond_45
    :goto_24
    return v1

    :goto_25
    if-ge v4, v5, :cond_47

    invoke-static {v3, v4, v7}, LGs7;->j([BILFs7;)I

    move-result v8

    iget v9, v7, LFs7;->a:I

    if-eq v2, v9, :cond_46

    goto :goto_26

    :cond_46
    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, v8

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, LGs7;->c(LNv7;[BIIILFs7;)I

    move-result v4

    iget-object v8, v7, LFs7;->c:Ljava/lang/Object;

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_47
    :goto_26
    return v4

    :cond_48
    :goto_27
    move v1, v4

    :cond_49
    :goto_28
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

.method public final S(I)I
    .locals 1

    iget v0, p0, Liv7;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Liv7;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Liv7;->b(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final T(II)I
    .locals 1

    iget v0, p0, Liv7;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Liv7;->d:I

    if-gt p1, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Liv7;->b(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final U(I)I
    .locals 1

    iget-object v0, p0, Liv7;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Liv7;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Liv7;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    int-to-long v2, v2

    iget-object v4, p0, Liv7;->a:[I

    aget v4, v4, v0

    invoke-static {v1}, Liv7;->c(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, Liv7;->q(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p2, v4, v0}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, Liv7;->q(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p2, v4, v0}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_4
    iget-object v1, p0, Liv7;->p:Lav7;

    invoke-static {v1, p1, p2, v2, v3}, LPv7;->B(Lav7;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_1

    :pswitch_5
    iget-object v1, p0, Liv7;->l:LSu7;

    invoke-virtual {v1, p1, p2, v2, v3}, LSu7;->c(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, Liv7;->p(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, Liv7;->p(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->r(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_12
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_15
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_16
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->g(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v2, v3, v1}, LCw7;->u(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_17
    invoke-virtual {p0, p2, v0}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LCw7;->f(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LCw7;->t(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, v0}, Liv7;->s(Ljava/lang/Object;I)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Liv7;->m:Lsw7;

    invoke-static {v0, p1, p2}, LPv7;->f(Lsw7;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Liv7;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Liv7;->n:LAt7;

    invoke-static {v0, p1, p2}, LPv7;->e(LAt7;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
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

.method public final b(II)I
    .locals 5

    iget-object v0, p0, Liv7;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v2, v0, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    iget-object v4, p0, Liv7;->a:[I

    aget v4, v4, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    move v0, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move p2, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v8, 0xfffff

    const/4 v9, 0x0

    move v0, v8

    move v1, v9

    move v10, v1

    :goto_0
    iget v2, v6, Liv7;->j:I

    const/4 v3, 0x1

    if-ge v10, v2, :cond_c

    iget-object v2, v6, Liv7;->i:[I

    aget v11, v2, v10

    iget-object v2, v6, Liv7;->a:[I

    aget v12, v2, v11

    invoke-virtual {v6, v11}, Liv7;->i(I)I

    move-result v13

    iget-object v2, v6, Liv7;->a:[I

    add-int/lit8 v4, v11, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v14, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, Liv7;->r:Lsun/misc/Unsafe;

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
    const/high16 v0, 0x10000000

    and-int/2addr v0, v13

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Liv7;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v9

    :cond_3
    :goto_2
    invoke-static {v13}, Liv7;->c(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_a

    const/16 v1, 0x11

    if-eq v0, v1, :cond_a

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_8

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_7

    const/16 v1, 0x44

    if-eq v0, v1, :cond_7

    const/16 v1, 0x31

    if-eq v0, v1, :cond_8

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    and-int v0, v13, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZu7;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v6, v11}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYu7;

    invoke-virtual {v1}, LYu7;->c()LXu7;

    move-result-object v1

    iget-object v1, v1, LXu7;->c:LIw7;

    invoke-virtual {v1}, LIw7;->a()LJw7;

    move-result-object v1

    sget-object v2, LJw7;->k:LJw7;

    if-ne v1, v2, :cond_b

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v1

    :cond_6
    invoke-interface {v1, v2}, LNv7;->d(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v9

    :cond_7
    invoke-virtual {v6, v7, v12, v11}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v6, v11}, Liv7;->l(I)LNv7;

    move-result-object v0

    invoke-static {v7, v13, v0}, Liv7;->A(Ljava/lang/Object;ILNv7;)Z

    move-result v0

    if-nez v0, :cond_b

    return v9

    :cond_8
    and-int v0, v13, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v6, v11}, Liv7;->l(I)LNv7;

    move-result-object v1

    move v2, v9

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, LNv7;->d(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return v9

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Liv7;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v6, v11}, Liv7;->l(I)LNv7;

    move-result-object v0

    invoke-static {v7, v13, v0}, Liv7;->A(Ljava/lang/Object;ILNv7;)Z

    move-result v0

    if-nez v0, :cond_b

    return v9

    :cond_b
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move v0, v15

    move/from16 v1, v16

    goto/16 :goto_0

    :cond_c
    iget-boolean v0, v6, Liv7;->f:Z

    if-eqz v0, :cond_d

    iget-object v0, v6, Liv7;->n:LAt7;

    invoke-virtual {v0, v7}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object v0

    invoke-virtual {v0}, LEt7;->n()Z

    move-result v0

    if-nez v0, :cond_d

    return v9

    :cond_d
    return v3
.end method

.method public final e(Ljava/lang/Object;[BIILFs7;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Liv7;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, Liv7;->Q(Ljava/lang/Object;[BIILFs7;)I

    return-void

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Liv7;->F(Ljava/lang/Object;[BIIILFs7;)I

    return-void
.end method

.method public final f(Ljava/lang/Object;LKw7;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Liv7;->h:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Liv7;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liv7;->n:LAt7;

    invoke-virtual {v0, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object v0

    iget-object v2, v0, LEt7;->a:LXv7;

    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, LEt7;->h()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Liv7;->a:[I

    array-length v3, v3

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_4

    invoke-virtual {p0, v5}, Liv7;->i(I)I

    move-result v6

    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    :goto_2
    if-eqz v2, :cond_2

    iget-object v8, p0, Liv7;->n:LAt7;

    invoke-virtual {v8, v2}, LAt7;->a(Ljava/util/Map$Entry;)I

    move-result v8

    if-gt v8, v7, :cond_2

    iget-object v8, p0, Liv7;->n:LAt7;

    invoke-virtual {v8, p2, v2}, LAt7;->i(LKw7;Ljava/util/Map$Entry;)V

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
    invoke-static {v6}, Liv7;->c(I)I

    move-result v8

    const/4 v9, 0x1

    const v10, 0xfffff

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, LKw7;->H(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->y(IJ)V

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->A(II)V

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->v(IJ)V

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->J(II)V

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->i(II)V

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->F(II)V

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkt7;

    invoke-interface {p2, v7, v6}, LKw7;->K(ILkt7;)V

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, LKw7;->G(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6, p2}, Liv7;->E(ILjava/lang/Object;LKw7;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->C(Ljava/lang/Object;J)Z

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->f(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->h(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->k(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->o(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->C(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->m(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->K(Ljava/lang/Object;J)F

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->j(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, v7, v5}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, Liv7;->J(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->g(ID)V

    goto/16 :goto_3

    :pswitch_12
    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, p2, v7, v6, v5}, Liv7;->v(LKw7;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, LPv7;->o(ILjava/util/List;LKw7;LNv7;)V

    goto/16 :goto_3

    :pswitch_14
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->v(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_15
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->u(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_16
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->t(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_17
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->s(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_18
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->k(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_19
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->x(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1a
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->h(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1b
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->l(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1c
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->m(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1d
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->p(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1e
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->y(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1f
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->q(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_20
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->n(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_21
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v10, v6

    invoke-static {p1, v10, v11}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, LPv7;->j(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_22
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->v(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_23
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->u(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_24
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->t(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_25
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->s(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_26
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->k(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_27
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->x(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_28
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, LPv7;->i(ILjava/util/List;LKw7;)V

    goto/16 :goto_3

    :pswitch_29
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, LPv7;->r(ILjava/util/List;LKw7;LNv7;)V

    goto/16 :goto_3

    :pswitch_2a
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, LPv7;->w(ILjava/util/List;LKw7;)V

    goto/16 :goto_3

    :pswitch_2b
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->h(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_2c
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->l(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_2d
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->m(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_2e
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->p(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_2f
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->y(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_30
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->q(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_31
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->n(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_32
    iget-object v7, p0, Liv7;->a:[I

    aget v7, v7, v5

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, LPv7;->j(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_33
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, LKw7;->H(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->y(IJ)V

    goto/16 :goto_3

    :pswitch_35
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->A(II)V

    goto/16 :goto_3

    :pswitch_36
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->v(IJ)V

    goto/16 :goto_3

    :pswitch_37
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->J(II)V

    goto/16 :goto_3

    :pswitch_38
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->i(II)V

    goto/16 :goto_3

    :pswitch_39
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->F(II)V

    goto/16 :goto_3

    :pswitch_3a
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkt7;

    invoke-interface {p2, v7, v6}, LKw7;->K(ILkt7;)V

    goto/16 :goto_3

    :pswitch_3b
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, LKw7;->G(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_3

    :pswitch_3c
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6, p2}, Liv7;->E(ILjava/lang/Object;LKw7;)V

    goto/16 :goto_3

    :pswitch_3d
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->f(IZ)V

    goto/16 :goto_3

    :pswitch_3e
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->h(II)V

    goto :goto_3

    :pswitch_3f
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->k(IJ)V

    goto :goto_3

    :pswitch_40
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->o(II)V

    goto :goto_3

    :pswitch_41
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->C(IJ)V

    goto :goto_3

    :pswitch_42
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->m(IJ)V

    goto :goto_3

    :pswitch_43
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->g(Ljava/lang/Object;J)F

    move-result v6

    invoke-interface {p2, v7, v6}, LKw7;->j(IF)V

    goto :goto_3

    :pswitch_44
    invoke-virtual {p0, p1, v5}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    and-int/2addr v6, v10

    int-to-long v8, v6

    invoke-static {p1, v8, v9}, LCw7;->f(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {p2, v7, v8, v9}, LKw7;->g(ID)V

    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x3

    goto/16 :goto_1

    :cond_4
    :goto_4
    if-eqz v2, :cond_6

    iget-object v3, p0, Liv7;->n:LAt7;

    invoke-virtual {v3, p2, v2}, LAt7;->i(LKw7;Ljava/util/Map$Entry;)V

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
    iget-object v0, p0, Liv7;->m:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lsw7;->q(Ljava/lang/Object;LKw7;)V

    return-void

    :cond_7
    invoke-virtual {p0, p1, p2}, Liv7;->u(Ljava/lang/Object;LKw7;)V

    return-void

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

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    iget-object v0, p0, Liv7;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Liv7;->i(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    int-to-long v5, v5

    invoke-static {v3}, Liv7;->c(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, v2}, Liv7;->U(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto :goto_1

    :pswitch_2
    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_1
    if-nez v3, :cond_1

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, LPv7;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :pswitch_12
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :pswitch_13
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, LCw7;->g(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_3

    :pswitch_14
    invoke-virtual {p0, p1, p2, v2}, Liv7;->w(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LCw7;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LCw7;->f(Ljava/lang/Object;J)D

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
    iget-object v0, p0, Liv7;->m:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Liv7;->m:Lsw7;

    invoke-virtual {v2, p2}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Liv7;->f:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Liv7;->n:LAt7;

    invoke-virtual {v0, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p1

    iget-object v0, p0, Liv7;->n:LAt7;

    invoke-virtual {v0, p2}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p2

    invoke-virtual {p1, p2}, LEt7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1

    nop

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

.method public final h(Ljava/lang/Object;LIv7;Lzt7;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p0, Liv7;->m:Lsw7;

    iget-object v8, p0, Liv7;->n:LAt7;

    const/4 v9, 0x0

    move-object v0, v9

    move-object v10, v0

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p2}, LIv7;->zzc()I

    move-result v1

    invoke-virtual {p0, v1}, Liv7;->S(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v2, :cond_8

    const v2, 0x7fffffff

    if-ne v1, v2, :cond_2

    iget p2, p0, Liv7;->j:I

    :goto_1
    iget p3, p0, Liv7;->k:I

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Liv7;->i:[I

    aget p3, p3, p2

    invoke-virtual {p0, p1, p3, v10, v7}, Liv7;->m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    if-eqz v10, :cond_17

    invoke-virtual {v7, p1, v10}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_1
    iget-boolean v2, p0, Liv7;->f:Z

    if-nez v2, :cond_3

    move-object v2, v9

    goto :goto_2

    :cond_3
    iget-object v2, p0, Liv7;->e:Lfv7;

    invoke-virtual {v8, p3, v2, v1}, LAt7;->d(Lzt7;Lfv7;I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_5

    if-nez v0, :cond_4

    invoke-virtual {v8, p1}, LAt7;->c(Ljava/lang/Object;)LEt7;

    move-result-object v0

    :cond_4
    move-object v11, v0

    move-object v0, v8

    move-object v1, p2

    move-object v3, p3

    move-object v4, v11

    move-object v5, v10

    move-object v6, v7

    invoke-virtual/range {v0 .. v6}, LAt7;->e(LIv7;Ljava/lang/Object;Lzt7;LEt7;Ljava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    move-object v0, v11

    goto :goto_0

    :cond_5
    invoke-virtual {v7, p2}, Lsw7;->s(LIv7;)Z

    if-nez v10, :cond_6

    invoke-virtual {v7, p1}, Lsw7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    :cond_6
    invoke-virtual {v7, v10, p2}, Lsw7;->r(Ljava/lang/Object;LIv7;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    iget p2, p0, Liv7;->j:I

    :goto_3
    iget p3, p0, Liv7;->k:I

    if-ge p2, p3, :cond_7

    iget-object p3, p0, Liv7;->i:[I

    aget p3, p3, p2

    invoke-virtual {p0, p1, p3, v10, v7}, Liv7;->m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_7
    if-eqz v10, :cond_17

    invoke-virtual {v7, p1, v10}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p2

    goto/16 :goto_b

    :cond_8
    :try_start_2
    invoke-virtual {p0, v2}, Liv7;->i(I)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v3}, Liv7;->c(I)I

    move-result v4

    const v5, 0xfffff

    packed-switch v4, :pswitch_data_0

    if-nez v10, :cond_13

    invoke-virtual {v7}, Lsw7;->f()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_8

    :pswitch_0
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-interface {p2, v5, p3}, LIv7;->E(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_1
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->e()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_2
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->zzi()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_3
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_4
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->zzh()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_5
    invoke-interface {p2}, LIv7;->zze()I

    move-result v4

    invoke-virtual {p0, v2}, Liv7;->k(I)Liu7;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-interface {v6, v4}, Liu7;->zza(I)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v1, v4, v10, v7}, LPv7;->d(IILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_0

    :cond_a
    :goto_4
    and-int/2addr v3, v5

    int-to-long v5, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1, v5, v6, v3}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_6
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->c()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_7
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->d()Lkt7;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p0, p1, v1, v2}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_b

    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v6

    invoke-interface {p2, v6, p3}, LIv7;->D(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :cond_b
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v5

    invoke-interface {p2, v5, p3}, LIv7;->D(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    :goto_5
    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p0, p1, v3, p2}, Liv7;->r(Ljava/lang/Object;ILIv7;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_a
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->h()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_b
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->x()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_c
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_d
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->zzg()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_e
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->f()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_f
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->j()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_10
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->zzb()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_11
    and-int/2addr v3, v5

    int-to-long v3, v3

    invoke-interface {p2}, LIv7;->zza()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v2}, Liv7;->t(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {p0, v2}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2}, Liv7;->i(I)I

    move-result v2

    and-int/2addr v2, v5

    int-to-long v2, v2

    invoke-static {p1, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c

    invoke-static {}, LZu7;->d()LZu7;

    move-result-object v4

    invoke-virtual {v4}, LZu7;->e()LZu7;

    move-result-object v4

    invoke-static {p1, v2, v3, v4}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :cond_c
    invoke-static {v4}, Lav7;->b(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-static {}, LZu7;->d()LZu7;

    move-result-object v5

    invoke-virtual {v5}, LZu7;->e()LZu7;

    move-result-object v5

    invoke-static {v5, v4}, Lav7;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v2, v3, v5}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v4, v5

    :cond_d
    :goto_6
    check-cast v4, LZu7;

    check-cast v1, LYu7;

    invoke-virtual {v1}, LYu7;->c()LXu7;

    move-result-object v1

    invoke-interface {p2, v4, v1, p3}, LIv7;->F(Ljava/util/Map;LXu7;Lzt7;)V

    goto/16 :goto_0

    :pswitch_13
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v1

    iget-object v2, p0, Liv7;->l:LSu7;

    invoke-virtual {v2, p1, v3, v4}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {p2, v2, v1, p3}, LIv7;->C(Ljava/util/List;LNv7;Lzt7;)V

    goto/16 :goto_0

    :pswitch_14
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->u(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_15
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->s(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_16
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->t(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_17
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->y(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_18
    iget-object v4, p0, Liv7;->l:LSu7;

    and-int/2addr v3, v5

    int-to-long v5, v3

    invoke-virtual {v4, p1, v5, v6}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {p2, v3}, LIv7;->l(Ljava/util/List;)V

    invoke-virtual {p0, v2}, Liv7;->k(I)Liu7;

    move-result-object v2

    invoke-static {v1, v3, v2, v10, v7}, LPv7;->c(ILjava/util/List;Liu7;Ljava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_0

    :pswitch_19
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->r(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1a
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->p(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1b
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->o(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1c
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->z(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1d
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->w(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1e
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->q(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1f
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->v(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_20
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->A(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_21
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->m(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_22
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->u(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_23
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->s(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_24
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->t(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_25
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->y(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_26
    iget-object v4, p0, Liv7;->l:LSu7;

    and-int/2addr v3, v5

    int-to-long v5, v3

    invoke-virtual {v4, p1, v5, v6}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {p2, v3}, LIv7;->l(Ljava/util/List;)V

    invoke-virtual {p0, v2}, Liv7;->k(I)Liu7;

    move-result-object v2

    invoke-static {v1, v3, v2, v10, v7}, LPv7;->c(ILjava/util/List;Liu7;Ljava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_0

    :pswitch_27
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->r(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_28
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->n(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_29
    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v1

    and-int v2, v3, v5

    int-to-long v2, v2

    iget-object v4, p0, Liv7;->l:LSu7;

    invoke-virtual {v4, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {p2, v2, v1, p3}, LIv7;->B(Ljava/util/List;LNv7;Lzt7;)V

    goto/16 :goto_0

    :pswitch_2a
    invoke-static {v3}, Liv7;->x(I)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    move-object v2, p2

    check-cast v2, Lpt7;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Lpt7;->G(Ljava/util/List;Z)V

    goto/16 :goto_0

    :cond_e
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    move-object v2, p2

    check-cast v2, Lpt7;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lpt7;->G(Ljava/util/List;Z)V

    goto/16 :goto_0

    :pswitch_2b
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->p(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2c
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->o(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2d
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->z(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2e
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->w(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2f
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->q(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_30
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->v(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_31
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->A(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_32
    iget-object v1, p0, Liv7;->l:LSu7;

    and-int v2, v3, v5

    int-to-long v2, v2

    invoke-virtual {v1, p1, v2, v3}, LSu7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, LIv7;->m(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_33
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_f

    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-static {p1, v3, v4}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v2

    invoke-interface {p2, v2, p3}, LIv7;->E(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_0

    :cond_f
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v1

    invoke-interface {p2, v1, p3}, LIv7;->E(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_34
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->e()J

    move-result-wide v5

    invoke-static {p1, v3, v4, v5, v6}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_35
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->zzi()I

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_36
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->b()J

    move-result-wide v5

    invoke-static {p1, v3, v4, v5, v6}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_37
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->zzh()I

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_38
    invoke-interface {p2}, LIv7;->zze()I

    move-result v4

    invoke-virtual {p0, v2}, Liv7;->k(I)Liu7;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-interface {v6, v4}, Liu7;->zza(I)Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_7

    :cond_10
    invoke-static {v1, v4, v10, v7}, LPv7;->d(IILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_0

    :cond_11
    :goto_7
    and-int v1, v3, v5

    int-to-long v5, v1

    invoke-static {p1, v5, v6, v4}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_39
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->c()I

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3a
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->d()Lkt7;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_12

    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-static {p1, v3, v4}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v2

    invoke-interface {p2, v2, p3}, LIv7;->D(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_0

    :cond_12
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-virtual {p0, v2}, Liv7;->l(I)LNv7;

    move-result-object v1

    invoke-interface {p2, v1, p3}, LIv7;->D(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3c
    invoke-virtual {p0, p1, v3, p2}, Liv7;->r(Ljava/lang/Object;ILIv7;)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3d
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->h()Z

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->r(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3e
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->x()I

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3f
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->a()J

    move-result-wide v5

    invoke-static {p1, v3, v4, v5, v6}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_40
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->zzg()I

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_41
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->f()J

    move-result-wide v5

    invoke-static {p1, v3, v4, v5, v6}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_42
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->j()J

    move-result-wide v5

    invoke-static {p1, v3, v4, v5, v6}, LCw7;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_43
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->zzb()F

    move-result v1

    invoke-static {p1, v3, v4, v1}, LCw7;->u(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_44
    and-int v1, v3, v5

    int-to-long v3, v1

    invoke-interface {p2}, LIv7;->zza()D

    move-result-wide v5

    invoke-static {p1, v3, v4, v5, v6}, LCw7;->t(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, v2}, Liv7;->s(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :goto_8
    move-object v10, v1

    :cond_13
    invoke-virtual {v7, v10, p2}, Lsw7;->r(Ljava/lang/Object;LIv7;)Z

    move-result v1
    :try_end_3
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_0

    iget p2, p0, Liv7;->j:I

    :goto_9
    iget p3, p0, Liv7;->k:I

    if-ge p2, p3, :cond_14

    iget-object p3, p0, Liv7;->i:[I

    aget p3, p3, p2

    invoke-virtual {p0, p1, p3, v10, v7}, Liv7;->m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 p2, p2, 0x1

    goto :goto_9

    :cond_14
    if-eqz v10, :cond_17

    invoke-virtual {v7, p1, v10}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catch_0
    :try_start_4
    invoke-virtual {v7, p2}, Lsw7;->s(LIv7;)Z

    if-nez v10, :cond_15

    invoke-virtual {v7, p1}, Lsw7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    :cond_15
    invoke-virtual {v7, v10, p2}, Lsw7;->r(Ljava/lang/Object;LIv7;)Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v1, :cond_0

    iget p2, p0, Liv7;->j:I

    :goto_a
    iget p3, p0, Liv7;->k:I

    if-ge p2, p3, :cond_16

    iget-object p3, p0, Liv7;->i:[I

    aget p3, p3, p2

    invoke-virtual {p0, p1, p3, v10, v7}, Liv7;->m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 p2, p2, 0x1

    goto :goto_a

    :cond_16
    if-eqz v10, :cond_17

    invoke-virtual {v7, p1, v10}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    return-void

    :goto_b
    iget p3, p0, Liv7;->j:I

    :goto_c
    iget v0, p0, Liv7;->k:I

    if-ge p3, v0, :cond_18

    iget-object v0, p0, Liv7;->i:[I

    aget v0, v0, p3

    invoke-virtual {p0, p1, v0, v10, v7}, Liv7;->m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 p3, p3, 0x1

    goto :goto_c

    :cond_18
    if-eqz v10, :cond_19

    invoke-virtual {v7, p1, v10}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_19
    throw p2

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

.method public final i(I)I
    .locals 1

    iget-object v0, p0, Liv7;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final k(I)Liu7;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Liv7;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Liu7;

    return-object p1
.end method

.method public final l(I)LNv7;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Liv7;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, LNv7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    iget-object v1, p0, Liv7;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    iget-object v1, p0, Liv7;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final m(Ljava/lang/Object;ILjava/lang/Object;Lsw7;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Liv7;->a:[I

    aget v0, v0, p2

    invoke-virtual {p0, p2}, Liv7;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, v1, v2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, Liv7;->k(I)Liu7;

    move-result-object v1

    if-nez v1, :cond_1

    return-object p3

    :cond_1
    check-cast p1, LZu7;

    invoke-virtual {p0, p2}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYu7;

    invoke-virtual {p2}, LYu7;->c()LXu7;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v1, v3}, Liu7;->zza(I)Z

    move-result v3

    if-nez v3, :cond_2

    if-nez p3, :cond_3

    invoke-virtual {p4}, Lsw7;->f()Ljava/lang/Object;

    move-result-object p3

    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v3, v4}, LYu7;->b(LXu7;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    sget-object v4, Lkt7;->c:Lkt7;

    new-array v3, v3, [B

    invoke-static {v3}, Lut7;->o([B)Lut7;

    move-result-object v4

    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, p2, v5, v2}, LYu7;->e(Lut7;LXu7;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v4, v3}, Lgt7;->a(Lut7;[B)Lkt7;

    move-result-object v2

    invoke-virtual {p4, p3, v0, v2}, Lsw7;->k(Ljava/lang/Object;ILkt7;)V

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    return-object p3
.end method

.method public final n(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Liv7;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final p(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3

    invoke-virtual {p0, p3}, Liv7;->i(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {p0, p2, p3}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2, p2}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, Liv7;->s(Ljava/lang/Object;I)V

    return-void

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    invoke-static {p1, v0, v1, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, Liv7;->s(Ljava/lang/Object;I)V

    :cond_3
    return-void
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 4

    invoke-virtual {p0, p3}, Liv7;->i(I)I

    move-result v0

    iget-object v1, p0, Liv7;->a:[I

    aget v1, v1, p3

    const v2, 0xfffff

    and-int/2addr v0, v2

    int-to-long v2, v0

    invoke-virtual {p0, p2, v1, p3}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, v1, p3}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {p2, v2, v3}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, p2}, Lou7;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, v3, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, p3}, Liv7;->t(Ljava/lang/Object;II)V

    return-void

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    invoke-static {p1, v2, v3, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, p3}, Liv7;->t(Ljava/lang/Object;II)V

    :cond_4
    return-void
.end method

.method public final r(Ljava/lang/Object;ILIv7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Liv7;->x(I)Z

    move-result v0

    const v1, 0xfffff

    if-eqz v0, :cond_0

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, LIv7;->i()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Liv7;->g:Z

    if-eqz v0, :cond_1

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, LIv7;->g()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void

    :cond_1
    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, LIv7;->d()Lkt7;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final s(Ljava/lang/Object;I)V
    .locals 4

    invoke-virtual {p0, p2}, Liv7;->U(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v2

    ushr-int/lit8 p2, p2, 0x14

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, LCw7;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final t(Ljava/lang/Object;II)V
    .locals 2

    invoke-virtual {p0, p3}, Liv7;->U(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, LCw7;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final u(Ljava/lang/Object;LKw7;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, Liv7;->f:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Liv7;->n:LAt7;

    invoke-virtual {v3, v1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object v3

    iget-object v5, v3, LEt7;->a:LXv7;

    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3}, LEt7;->h()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    iget-object v6, v0, Liv7;->a:[I

    array-length v6, v6

    sget-object v7, Liv7;->r:Lsun/misc/Unsafe;

    const/4 v10, 0x0

    const v11, 0xfffff

    const/4 v12, 0x0

    :goto_1
    if-ge v10, v6, :cond_7

    invoke-virtual {v0, v10}, Liv7;->i(I)I

    move-result v13

    iget-object v14, v0, Liv7;->a:[I

    aget v15, v14, v10

    invoke-static {v13}, Liv7;->c(I)I

    move-result v4

    const/16 v9, 0x11

    if-gt v4, v9, :cond_2

    add-int/lit8 v9, v10, 0x2

    aget v9, v14, v9

    const v14, 0xfffff

    and-int v8, v9, v14

    if-eq v8, v11, :cond_1

    int-to-long v11, v8

    invoke-virtual {v7, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v12

    move v11, v8

    :cond_1
    ushr-int/lit8 v8, v9, 0x14

    const/4 v9, 0x1

    shl-int v8, v9, v8

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-eqz v5, :cond_4

    iget-object v9, v0, Liv7;->n:LAt7;

    invoke-virtual {v9, v5}, LAt7;->a(Ljava/util/Map$Entry;)I

    move-result v9

    if-gt v9, v15, :cond_4

    iget-object v9, v0, Liv7;->n:LAt7;

    invoke-virtual {v9, v2, v5}, LAt7;->i(LKw7;Ljava/util/Map$Entry;)V

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
    const v9, 0xfffff

    and-int/2addr v13, v9

    int-to-long v13, v13

    packed-switch v4, :pswitch_data_0

    :cond_5
    :goto_3
    const/4 v4, 0x0

    goto/16 :goto_5

    :pswitch_0
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-interface {v2, v15, v4, v8}, LKw7;->H(ILjava/lang/Object;LNv7;)V

    goto :goto_3

    :pswitch_1
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->y(IJ)V

    goto :goto_3

    :pswitch_2
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->A(II)V

    goto :goto_3

    :pswitch_3
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->v(IJ)V

    goto :goto_3

    :pswitch_4
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->J(II)V

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->i(II)V

    goto :goto_3

    :pswitch_6
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->F(II)V

    goto :goto_3

    :pswitch_7
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkt7;

    invoke-interface {v2, v15, v4}, LKw7;->K(ILkt7;)V

    goto :goto_3

    :pswitch_8
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Liv7;->l(I)LNv7;

    move-result-object v8

    invoke-interface {v2, v15, v4, v8}, LKw7;->G(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v15, v4, v2}, Liv7;->E(ILjava/lang/Object;LKw7;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->C(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->f(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->h(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->k(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->o(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->C(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->m(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->K(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v15, v4}, LKw7;->j(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {v0, v1, v15, v10}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v13, v14}, Liv7;->J(Ljava/lang/Object;J)D

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->g(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v2, v15, v4, v10}, Liv7;->v(LKw7;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v10}, Liv7;->l(I)LNv7;

    move-result-object v13

    invoke-static {v4, v8, v2, v13}, LPv7;->o(ILjava/util/List;LKw7;LNv7;)V

    goto/16 :goto_3

    :pswitch_14
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v15, 0x1

    invoke-static {v4, v8, v2, v15}, LPv7;->v(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_15
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->u(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_16
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->t(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_17
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->s(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_18
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->k(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_19
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->x(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1a
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->h(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1b
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->l(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1c
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->m(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1d
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->p(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1e
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->y(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_1f
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->q(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_20
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->n(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_21
    const/4 v15, 0x1

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->j(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_3

    :pswitch_22
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v15, 0x0

    invoke-static {v4, v8, v2, v15}, LPv7;->v(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_4

    :pswitch_23
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->u(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_4

    :pswitch_24
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->t(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_4

    :pswitch_25
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->s(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_4

    :pswitch_26
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->k(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_4

    :pswitch_27
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->x(ILjava/util/List;LKw7;Z)V

    goto/16 :goto_4

    :pswitch_28
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2}, LPv7;->i(ILjava/util/List;LKw7;)V

    goto/16 :goto_3

    :pswitch_29
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v10}, Liv7;->l(I)LNv7;

    move-result-object v13

    invoke-static {v4, v8, v2, v13}, LPv7;->r(ILjava/util/List;LKw7;LNv7;)V

    goto/16 :goto_3

    :pswitch_2a
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2}, LPv7;->w(ILjava/util/List;LKw7;)V

    goto/16 :goto_3

    :pswitch_2b
    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v15, 0x0

    invoke-static {v4, v8, v2, v15}, LPv7;->h(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_2c
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->l(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_2d
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->m(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_2e
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->p(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_2f
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->y(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_30
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->q(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_31
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->n(ILjava/util/List;LKw7;Z)V

    goto :goto_4

    :pswitch_32
    const/4 v15, 0x0

    iget-object v4, v0, Liv7;->a:[I

    aget v4, v4, v10

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v15}, LPv7;->j(ILjava/util/List;LKw7;Z)V

    :goto_4
    move v4, v15

    goto/16 :goto_5

    :pswitch_33
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v10}, Liv7;->l(I)LNv7;

    move-result-object v13

    invoke-interface {v2, v15, v8, v13}, LKw7;->H(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_5

    :pswitch_34
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->y(IJ)V

    goto/16 :goto_5

    :pswitch_35
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->A(II)V

    goto/16 :goto_5

    :pswitch_36
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->v(IJ)V

    goto/16 :goto_5

    :pswitch_37
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->J(II)V

    goto/16 :goto_5

    :pswitch_38
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->i(II)V

    goto/16 :goto_5

    :pswitch_39
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->F(II)V

    goto/16 :goto_5

    :pswitch_3a
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkt7;

    invoke-interface {v2, v15, v8}, LKw7;->K(ILkt7;)V

    goto/16 :goto_5

    :pswitch_3b
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v10}, Liv7;->l(I)LNv7;

    move-result-object v13

    invoke-interface {v2, v15, v8, v13}, LKw7;->G(ILjava/lang/Object;LNv7;)V

    goto/16 :goto_5

    :pswitch_3c
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v15, v8, v2}, Liv7;->E(ILjava/lang/Object;LKw7;)V

    goto :goto_5

    :pswitch_3d
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-static {v1, v13, v14}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->f(IZ)V

    goto :goto_5

    :pswitch_3e
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->h(II)V

    goto :goto_5

    :pswitch_3f
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->k(IJ)V

    goto :goto_5

    :pswitch_40
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->o(II)V

    goto :goto_5

    :pswitch_41
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->C(IJ)V

    goto :goto_5

    :pswitch_42
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-virtual {v7, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->m(IJ)V

    goto :goto_5

    :pswitch_43
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-static {v1, v13, v14}, LCw7;->g(Ljava/lang/Object;J)F

    move-result v8

    invoke-interface {v2, v15, v8}, LKw7;->j(IF)V

    goto :goto_5

    :pswitch_44
    const/4 v4, 0x0

    and-int/2addr v8, v12

    if-eqz v8, :cond_6

    invoke-static {v1, v13, v14}, LCw7;->f(Ljava/lang/Object;J)D

    move-result-wide v13

    invoke-interface {v2, v15, v13, v14}, LKw7;->g(ID)V

    :cond_6
    :goto_5
    add-int/lit8 v10, v10, 0x3

    goto/16 :goto_1

    :cond_7
    :goto_6
    if-eqz v5, :cond_9

    iget-object v4, v0, Liv7;->n:LAt7;

    invoke-virtual {v4, v2, v5}, LAt7;->i(LKw7;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_6

    :cond_8
    const/4 v5, 0x0

    goto :goto_6

    :cond_9
    iget-object v3, v0, Liv7;->m:Lsw7;

    invoke-virtual {v3, v1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, Lsw7;->q(Ljava/lang/Object;LKw7;)V

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

.method public final v(LKw7;ILjava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p0, p4}, Liv7;->n(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LYu7;

    invoke-virtual {p4}, LYu7;->c()LXu7;

    move-result-object p4

    check-cast p3, LZu7;

    invoke-interface {p1, p2, p4, p3}, LKw7;->z(ILXu7;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final w(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    invoke-virtual {p0, p1, p3}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Liv7;->y(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final y(Ljava/lang/Object;I)Z
    .locals 7

    invoke-virtual {p0, p2}, Liv7;->U(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-virtual {p0, p2}, Liv7;->i(I)I

    move-result p2

    and-int v0, p2, v1

    int-to-long v0, v0

    invoke-static {p2}, Liv7;->c(I)I

    move-result p2

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lkt7;->c:Lkt7;

    invoke-static {p1, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lkt7;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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
    instance-of p2, p1, Lkt7;

    if-eqz p2, :cond_c

    sget-object p2, Lkt7;->c:Lkt7;

    invoke-virtual {p2, p1}, Lkt7;->equals(Ljava/lang/Object;)Z

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
    invoke-static {p1, v0, v1}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, LCw7;->g(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, LCw7;->f(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    invoke-static {p1, v2, v3}, LCw7;->h(Ljava/lang/Object;J)I

    move-result p1

    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

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

.method public final z(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Liv7;->y(Ljava/lang/Object;I)Z

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

.method public final zza(Ljava/lang/Object;)I
    .locals 1

    iget-boolean v0, p0, Liv7;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Liv7;->M(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Liv7;->L(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 8

    iget-object v0, p0, Liv7;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Liv7;->i(I)I

    move-result v3

    iget-object v4, p0, Liv7;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    int-to-long v5, v5

    invoke-static {v3}, Liv7;->c(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->C(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, Lou7;->a(Z)I

    move-result v3

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->N(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->K(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Liv7;->B(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Liv7;->J(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_14
    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_1c
    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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

    invoke-static {p1, v5, v6}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2

    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, Lou7;->a(Z)I

    move-result v3

    goto :goto_2

    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_2

    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto :goto_2

    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_2

    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto :goto_2

    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    goto :goto_2

    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_2

    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LCw7;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {v3, v4}, Lou7;->c(J)I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    :cond_1
    :goto_3
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Liv7;->m:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Liv7;->f:Z

    if-eqz v0, :cond_3

    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Liv7;->n:LAt7;

    invoke-virtual {v0, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p1

    iget-object p1, p1, LEt7;->a:LXv7;

    invoke-virtual {p1}, LXv7;->hashCode()I

    move-result p1

    add-int/2addr v2, p1

    :cond_3
    return v2

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
    .locals 3

    iget-object v0, p0, Liv7;->e:Lfv7;

    check-cast v0, Leu7;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Liv7;->j:I

    :goto_0
    iget v1, p0, Liv7;->k:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Liv7;->i:[I

    aget v1, v1, v0

    invoke-virtual {p0, v1}, Liv7;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, v1, v2}, LCw7;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    move-object v4, v3

    check-cast v4, LZu7;

    invoke-virtual {v4}, LZu7;->f()V

    invoke-static {p1, v1, v2, v3}, LCw7;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Liv7;->i:[I

    array-length v0, v0

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Liv7;->l:LSu7;

    iget-object v3, p0, Liv7;->i:[I

    aget v3, v3, v1

    int-to-long v3, v3

    invoke-virtual {v2, p1, v3, v4}, LSu7;->b(Ljava/lang/Object;J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Liv7;->m:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->m(Ljava/lang/Object;)V

    iget-boolean v0, p0, Liv7;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Liv7;->n:LAt7;

    invoke-virtual {v0, p1}, LAt7;->f(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
