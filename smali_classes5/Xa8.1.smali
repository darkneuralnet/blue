.class public final LXa8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Ljava/io/Reader;

.field public c:Z

.field public final d:[C

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:J

.field public k:I

.field public l:[I

.field public m:I

.field public n:[Ljava/lang/String;

.field public o:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LKa8;

    invoke-direct {v0}, LKa8;-><init>()V

    sput-object v0, LpW7;->a:LpW7;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LXa8;->c:Z

    const/16 v1, 0x400

    new-array v1, v1, [C

    iput-object v1, p0, LXa8;->d:[C

    iput v0, p0, LXa8;->e:I

    iput v0, p0, LXa8;->f:I

    iput v0, p0, LXa8;->g:I

    iput v0, p0, LXa8;->h:I

    iput v0, p0, LXa8;->i:I

    const/16 v1, 0x20

    new-array v2, v1, [I

    iput-object v2, p0, LXa8;->l:[I

    const/4 v3, 0x1

    iput v3, p0, LXa8;->m:I

    const/4 v3, 0x6

    aput v3, v2, v0

    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, LXa8;->n:[Ljava/lang/String;

    new-array v0, v1, [I

    iput-object v0, p0, LXa8;->o:[I

    iput-object p1, p0, LXa8;->b:Ljava/io/Reader;

    return-void
.end method


# virtual methods
.method public final A(C)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :cond_0
    :pswitch_0
    invoke-virtual {p0}, LXa8;->v()V

    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a()I
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, LXa8;->l:[I

    iget v2, v0, LXa8;->m:I

    const/4 v3, -0x1

    add-int/2addr v2, v3

    aget v4, v1, v2

    const/16 v6, 0xa

    const/16 v8, 0x27

    const/16 v9, 0x5d

    const/16 v10, 0x3b

    const/16 v11, 0x2c

    const/4 v12, 0x6

    const/4 v13, 0x3

    const/4 v15, 0x4

    const/4 v5, 0x5

    const/4 v7, 0x2

    const/4 v14, 0x1

    if-ne v4, v14, :cond_1

    aput v7, v1, v2

    :cond_0
    :goto_0
    const/4 v1, 0x0

    goto/16 :goto_2

    :cond_1
    if-ne v4, v7, :cond_4

    invoke-virtual {v0, v14}, LXa8;->r(Z)I

    move-result v1

    if-eq v1, v11, :cond_0

    if-eq v1, v10, :cond_3

    if-ne v1, v9, :cond_2

    iput v15, v0, LXa8;->i:I

    return v15

    :cond_2
    const-string v1, "Unterminated array"

    invoke-virtual {v0, v1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_3
    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    goto :goto_0

    :cond_4
    const/16 v7, 0x7d

    if-eq v4, v13, :cond_42

    if-ne v4, v5, :cond_5

    goto/16 :goto_19

    :cond_5
    if-ne v4, v15, :cond_8

    aput v5, v1, v2

    invoke-virtual {v0, v14}, LXa8;->r(Z)I

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_0

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    iget v1, v0, LXa8;->e:I

    iget v2, v0, LXa8;->f:I

    if-lt v1, v2, :cond_6

    invoke-virtual {v0, v14}, LXa8;->z(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_6
    iget-object v1, v0, LXa8;->d:[C

    iget v2, v0, LXa8;->e:I

    aget-char v1, v1, v2

    const/16 v7, 0x3e

    if-ne v1, v7, :cond_0

    add-int/2addr v2, v14

    iput v2, v0, LXa8;->e:I

    goto :goto_0

    :cond_7
    const-string v1, "Expected \':\'"

    invoke-virtual {v0, v1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_8
    if-ne v4, v12, :cond_b

    iget-boolean v1, v0, LXa8;->c:Z

    if-eqz v1, :cond_a

    invoke-virtual {v0, v14}, LXa8;->r(Z)I

    iget v1, v0, LXa8;->e:I

    add-int/2addr v1, v3

    iput v1, v0, LXa8;->e:I

    add-int/lit8 v2, v1, 0x5

    iget v12, v0, LXa8;->f:I

    if-le v2, v12, :cond_9

    invoke-virtual {v0, v5}, LXa8;->z(I)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_1

    :cond_9
    iget-object v2, v0, LXa8;->d:[C

    aget-char v12, v2, v1

    const/16 v13, 0x29

    if-ne v12, v13, :cond_a

    add-int/lit8 v12, v1, 0x1

    aget-char v12, v2, v12

    if-ne v12, v9, :cond_a

    add-int/lit8 v12, v1, 0x2

    aget-char v12, v2, v12

    if-ne v12, v7, :cond_a

    add-int/lit8 v7, v1, 0x3

    aget-char v7, v2, v7

    if-ne v7, v8, :cond_a

    add-int/2addr v1, v15

    aget-char v1, v2, v1

    if-ne v1, v6, :cond_a

    iget v1, v0, LXa8;->e:I

    add-int/2addr v1, v5

    iput v1, v0, LXa8;->e:I

    :cond_a
    :goto_1
    iget-object v1, v0, LXa8;->l:[I

    iget v2, v0, LXa8;->m:I

    add-int/2addr v2, v3

    const/4 v7, 0x7

    aput v7, v1, v2

    goto/16 :goto_0

    :cond_b
    const/4 v7, 0x7

    if-ne v4, v7, :cond_d

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LXa8;->r(Z)I

    move-result v2

    if-ne v2, v3, :cond_c

    const/16 v1, 0x11

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_c
    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    iget v2, v0, LXa8;->e:I

    add-int/2addr v2, v3

    iput v2, v0, LXa8;->e:I

    goto :goto_2

    :cond_d
    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eq v4, v2, :cond_41

    :goto_2
    invoke-virtual {v0, v14}, LXa8;->r(Z)I

    move-result v2

    const/16 v7, 0x22

    if-eq v2, v7, :cond_40

    if-eq v2, v8, :cond_3f

    if-eq v2, v11, :cond_3c

    if-eq v2, v10, :cond_3c

    const/16 v7, 0x5b

    if-eq v2, v7, :cond_3b

    if-eq v2, v9, :cond_39

    const/16 v4, 0x7b

    if-eq v2, v4, :cond_38

    iget v2, v0, LXa8;->e:I

    add-int/2addr v2, v3

    iput v2, v0, LXa8;->e:I

    iget-object v3, v0, LXa8;->d:[C

    aget-char v2, v3, v2

    const/16 v3, 0x74

    if-eq v2, v3, :cond_12

    const/16 v3, 0x54

    if-ne v2, v3, :cond_e

    goto :goto_4

    :cond_e
    const/16 v3, 0x66

    if-eq v2, v3, :cond_11

    const/16 v3, 0x46

    if-ne v2, v3, :cond_f

    goto :goto_3

    :cond_f
    const/16 v3, 0x6e

    if-eq v2, v3, :cond_10

    const/16 v3, 0x4e

    if-ne v2, v3, :cond_17

    :cond_10
    const-string v2, "null"

    const-string v3, "NULL"

    const/4 v4, 0x7

    goto :goto_5

    :cond_11
    :goto_3
    const-string v2, "false"

    const-string v3, "FALSE"

    const/4 v4, 0x6

    goto :goto_5

    :cond_12
    :goto_4
    const-string v2, "true"

    const-string v3, "TRUE"

    move v4, v5

    :goto_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    move v8, v14

    :goto_6
    if-ge v8, v7, :cond_15

    iget v9, v0, LXa8;->e:I

    add-int/2addr v9, v8

    iget v10, v0, LXa8;->f:I

    if-lt v9, v10, :cond_13

    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v0, v9}, LXa8;->z(I)Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_7

    :cond_13
    iget-object v9, v0, LXa8;->d:[C

    iget v10, v0, LXa8;->e:I

    add-int/2addr v10, v8

    aget-char v9, v9, v10

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_14

    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_14

    goto :goto_7

    :cond_14
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_15
    iget v2, v0, LXa8;->e:I

    add-int/2addr v2, v7

    iget v3, v0, LXa8;->f:I

    if-lt v2, v3, :cond_16

    add-int/lit8 v2, v7, 0x1

    invoke-virtual {v0, v2}, LXa8;->z(I)Z

    move-result v2

    if-eqz v2, :cond_18

    :cond_16
    iget-object v2, v0, LXa8;->d:[C

    iget v3, v0, LXa8;->e:I

    add-int/2addr v3, v7

    aget-char v2, v2, v3

    invoke-virtual {v0, v2}, LXa8;->A(C)Z

    move-result v2

    if-eqz v2, :cond_18

    :cond_17
    :goto_7
    move v4, v1

    goto :goto_8

    :cond_18
    iget v2, v0, LXa8;->e:I

    add-int/2addr v2, v7

    iput v2, v0, LXa8;->e:I

    iput v4, v0, LXa8;->i:I

    :goto_8
    if-nez v4, :cond_37

    iget-object v2, v0, LXa8;->d:[C

    iget v3, v0, LXa8;->e:I

    iget v4, v0, LXa8;->f:I

    const-wide/16 v7, 0x0

    move v9, v1

    move v10, v9

    move/from16 v16, v10

    move-wide v11, v7

    move v13, v14

    :goto_9
    add-int v1, v3, v10

    if-ne v1, v4, :cond_1d

    const/16 v1, 0x400

    if-ne v10, v1, :cond_1a

    :cond_19
    :goto_a
    const/4 v14, 0x0

    goto/16 :goto_16

    :cond_1a
    add-int/lit8 v1, v10, 0x1

    invoke-virtual {v0, v1}, LXa8;->z(I)Z

    move-result v1

    if-nez v1, :cond_1c

    :cond_1b
    const/4 v1, 0x2

    goto/16 :goto_10

    :cond_1c
    iget v1, v0, LXa8;->e:I

    iget v3, v0, LXa8;->f:I

    move v4, v3

    move v3, v1

    :cond_1d
    add-int v1, v3, v10

    aget-char v1, v2, v1

    const/16 v6, 0x2b

    if-eq v1, v6, :cond_33

    const/16 v6, 0x45

    if-eq v1, v6, :cond_31

    const/16 v6, 0x65

    if-eq v1, v6, :cond_31

    const/16 v6, 0x2d

    if-eq v1, v6, :cond_2f

    const/16 v6, 0x2e

    if-eq v1, v6, :cond_2e

    const/16 v6, 0x30

    if-lt v1, v6, :cond_27

    const/16 v6, 0x39

    if-le v1, v6, :cond_1e

    goto :goto_f

    :cond_1e
    if-eq v9, v14, :cond_26

    if-nez v9, :cond_1f

    goto :goto_e

    :cond_1f
    const/4 v6, 0x2

    if-ne v9, v6, :cond_23

    cmp-long v6, v11, v7

    if-nez v6, :cond_20

    goto :goto_a

    :cond_20
    const-wide/16 v17, 0xa

    mul-long v17, v17, v11

    add-int/lit8 v1, v1, -0x30

    int-to-long v14, v1

    sub-long v17, v17, v14

    const-wide v14, -0xcccccccccccccccL

    cmp-long v1, v11, v14

    if-gtz v1, :cond_22

    if-nez v1, :cond_21

    cmp-long v1, v17, v11

    if-gez v1, :cond_21

    goto :goto_b

    :cond_21
    const/4 v1, 0x0

    goto :goto_c

    :cond_22
    :goto_b
    const/4 v1, 0x1

    :goto_c
    and-int/2addr v13, v1

    move-wide/from16 v11, v17

    goto :goto_d

    :cond_23
    const/4 v1, 0x3

    if-ne v9, v1, :cond_24

    const/4 v9, 0x4

    :goto_d
    const/4 v14, 0x6

    goto/16 :goto_15

    :cond_24
    const/4 v14, 0x6

    if-eq v9, v5, :cond_25

    if-ne v9, v14, :cond_34

    :cond_25
    const/4 v9, 0x7

    goto/16 :goto_15

    :cond_26
    :goto_e
    const/4 v14, 0x6

    add-int/lit8 v1, v1, -0x30

    neg-int v1, v1

    int-to-long v11, v1

    const/4 v9, 0x2

    goto/16 :goto_15

    :cond_27
    :goto_f
    invoke-virtual {v0, v1}, LXa8;->A(C)Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_a

    :goto_10
    if-ne v9, v1, :cond_2c

    if-eqz v13, :cond_2b

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v1, v11, v1

    if-nez v1, :cond_28

    if-eqz v16, :cond_2b

    const/4 v14, 0x1

    goto :goto_11

    :cond_28
    move/from16 v14, v16

    :goto_11
    cmp-long v1, v11, v7

    if-nez v1, :cond_29

    if-nez v14, :cond_2b

    goto :goto_12

    :cond_29
    if-eqz v14, :cond_2a

    goto :goto_13

    :cond_2a
    :goto_12
    neg-long v11, v11

    :goto_13
    iput-wide v11, v0, LXa8;->j:J

    iget v1, v0, LXa8;->e:I

    add-int/2addr v1, v10

    iput v1, v0, LXa8;->e:I

    const/16 v1, 0xf

    iput v1, v0, LXa8;->i:I

    const/16 v14, 0xf

    goto :goto_16

    :cond_2b
    const/4 v1, 0x2

    const/4 v9, 0x2

    :cond_2c
    if-eq v9, v1, :cond_2d

    const/4 v1, 0x4

    if-eq v9, v1, :cond_2d

    const/4 v1, 0x7

    if-ne v9, v1, :cond_19

    :cond_2d
    iput v10, v0, LXa8;->k:I

    const/16 v1, 0x10

    iput v1, v0, LXa8;->i:I

    const/16 v14, 0x10

    goto :goto_16

    :cond_2e
    const/4 v1, 0x2

    const/4 v14, 0x6

    if-ne v9, v1, :cond_19

    const/4 v9, 0x3

    goto :goto_15

    :cond_2f
    const/4 v1, 0x2

    const/4 v14, 0x6

    if-nez v9, :cond_30

    const/4 v9, 0x1

    const/16 v16, 0x1

    goto :goto_15

    :cond_30
    if-ne v9, v5, :cond_19

    goto :goto_14

    :cond_31
    const/4 v1, 0x2

    const/4 v14, 0x6

    if-eq v9, v1, :cond_32

    const/4 v1, 0x4

    if-ne v9, v1, :cond_19

    :cond_32
    move v9, v5

    goto :goto_15

    :cond_33
    const/4 v14, 0x6

    if-ne v9, v5, :cond_19

    :goto_14
    move v9, v14

    :cond_34
    :goto_15
    add-int/lit8 v10, v10, 0x1

    const/16 v6, 0xa

    const/4 v14, 0x1

    const/4 v15, 0x4

    goto/16 :goto_9

    :goto_16
    if-eqz v14, :cond_35

    return v14

    :cond_35
    iget-object v1, v0, LXa8;->d:[C

    iget v2, v0, LXa8;->e:I

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, LXa8;->A(C)Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    const/16 v1, 0xa

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_36
    const-string v1, "Expected value"

    invoke-virtual {v0, v1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_37
    return v4

    :cond_38
    move v1, v14

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_39
    move v1, v14

    if-eq v4, v1, :cond_3a

    goto :goto_17

    :cond_3a
    const/4 v2, 0x4

    iput v2, v0, LXa8;->i:I

    return v2

    :cond_3b
    const/4 v1, 0x3

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_3c
    move v1, v14

    :goto_17
    if-eq v4, v1, :cond_3e

    const/4 v1, 0x2

    if-ne v4, v1, :cond_3d

    goto :goto_18

    :cond_3d
    const-string v1, "Unexpected value"

    invoke-virtual {v0, v1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_3e
    :goto_18
    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    iget v1, v0, LXa8;->e:I

    add-int/2addr v1, v3

    iput v1, v0, LXa8;->e:I

    const/4 v1, 0x7

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_3f
    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    const/16 v1, 0x8

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_40
    const/16 v1, 0x9

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JsonReader is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_42
    :goto_19
    move v6, v15

    aput v6, v1, v2

    if-ne v4, v5, :cond_45

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LXa8;->r(Z)I

    move-result v2

    if-eq v2, v11, :cond_45

    if-eq v2, v10, :cond_44

    if-ne v2, v7, :cond_43

    const/4 v1, 0x2

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_43
    const-string v1, "Unterminated object"

    invoke-virtual {v0, v1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_44
    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    :cond_45
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LXa8;->r(Z)I

    move-result v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_4a

    if-eq v1, v8, :cond_49

    const-string v2, "Expected name"

    if-eq v1, v7, :cond_47

    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    iget v4, v0, LXa8;->e:I

    add-int/2addr v4, v3

    iput v4, v0, LXa8;->e:I

    int-to-char v1, v1

    invoke-virtual {v0, v1}, LXa8;->A(C)Z

    move-result v1

    if-eqz v1, :cond_46

    const/16 v1, 0xe

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_46
    invoke-virtual {v0, v2}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_47
    if-eq v4, v5, :cond_48

    const/4 v1, 0x2

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_48
    invoke-virtual {v0, v2}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_49
    invoke-virtual/range {p0 .. p0}, LXa8;->v()V

    const/16 v1, 0xc

    iput v1, v0, LXa8;->i:I

    return v1

    :cond_4a
    const/16 v1, 0xd

    iput v1, v0, LXa8;->i:I

    return v1
.end method

.method public final b()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LXa8;->u()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    invoke-virtual {p0, v0}, LXa8;->t(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, LXa8;->t(C)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    iput v1, p0, LXa8;->i:I

    iget-object v1, p0, LXa8;->n:[Ljava/lang/String;

    iget v2, p0, LXa8;->m:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x18

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected a name but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LXa8;->u()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    invoke-virtual {p0, v0}, LXa8;->t(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, LXa8;->t(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    const/16 v1, 0xf

    if-ne v0, v1, :cond_5

    iget-wide v0, p0, LXa8;->j:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, LXa8;->d:[C

    iget v2, p0, LXa8;->e:I

    iget v3, p0, LXa8;->k:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    iget v1, p0, LXa8;->e:I

    iget v2, p0, LXa8;->k:I

    add-int/2addr v1, v2

    iput v1, p0, LXa8;->e:I

    :goto_0
    const/4 v1, 0x0

    iput v1, p0, LXa8;->i:I

    iget-object v1, p0, LXa8;->o:[I

    iget v2, p0, LXa8;->m:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1a

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected a string but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LXa8;->i:I

    iget-object v1, p0, LXa8;->l:[I

    const/16 v2, 0x8

    aput v2, v1, v0

    const/4 v0, 0x1

    iput v0, p0, LXa8;->m:I

    iget-object v0, p0, LXa8;->b:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void
.end method

.method public final d()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LXa8;->x(I)V

    iget-object v0, p0, LXa8;->o:[I

    iget v1, p0, LXa8;->m:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    iput v2, p0, LXa8;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1d

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected BEGIN_ARRAY but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LXa8;->x(I)V

    const/4 v0, 0x0

    iput v0, p0, LXa8;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1e

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected BEGIN_OBJECT but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget v0, p0, LXa8;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LXa8;->m:I

    iget-object v1, p0, LXa8;->o:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, LXa8;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1b

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected END_ARRAY but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, LXa8;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LXa8;->m:I

    iget-object v1, p0, LXa8;->n:[Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    iget-object v1, p0, LXa8;->o:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, LXa8;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1c

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected END_OBJECT but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    iput v0, p0, LXa8;->i:I

    iget-object v0, p0, LXa8;->o:[I

    iget v1, p0, LXa8;->m:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x16

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected null but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, LXa8;->c:Z

    return-void
.end method

.method public final m()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, LXa8;->c:Z

    return v0
.end method

.method public final p()Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    iput v3, p0, LXa8;->i:I

    iget-object v0, p0, LXa8;->o:[I

    iget v1, p0, LXa8;->m:I

    add-int/lit8 v1, v1, -0x1

    aget v3, v0, v1

    add-int/2addr v3, v2

    aput v3, v0, v1

    return v2

    :cond_1
    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    iput v3, p0, LXa8;->i:I

    iget-object v0, p0, LXa8;->o:[I

    iget v1, p0, LXa8;->m:I

    add-int/lit8 v1, v1, -0x1

    aget v4, v0, v1

    add-int/2addr v4, v2

    aput v4, v0, v1

    return v3

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, LXa8;->q()I

    move-result v1

    invoke-static {v1}, Llb8;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1b

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Expected a boolean but was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LXa8;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LXa8;->a()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xa

    return v0

    :pswitch_0
    const/4 v0, 0x7

    return v0

    :pswitch_1
    const/4 v0, 0x5

    return v0

    :pswitch_2
    const/4 v0, 0x6

    return v0

    :pswitch_3
    const/16 v0, 0x9

    return v0

    :pswitch_4
    const/16 v0, 0x8

    return v0

    :pswitch_5
    const/4 v0, 0x2

    return v0

    :pswitch_6
    const/4 v0, 0x1

    return v0

    :pswitch_7
    const/4 v0, 0x4

    return v0

    :pswitch_8
    const/4 v0, 0x3

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Z)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LXa8;->d:[C

    iget v1, p0, LXa8;->e:I

    iget v2, p0, LXa8;->f:I

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    iput v1, p0, LXa8;->e:I

    invoke-virtual {p0, v3}, LXa8;->z(I)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p1, :cond_1

    new-instance p1, Ljava/io/EOFException;

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "End of input"

    if-eqz v1, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    iget v1, p0, LXa8;->e:I

    iget v2, p0, LXa8;->f:I

    :cond_3
    add-int/lit8 v4, v1, 0x1

    aget-char v1, v0, v1

    const/16 v5, 0xa

    if-ne v1, v5, :cond_4

    iget v1, p0, LXa8;->g:I

    add-int/2addr v1, v3

    iput v1, p0, LXa8;->g:I

    iput v4, p0, LXa8;->h:I

    goto/16 :goto_7

    :cond_4
    const/16 v6, 0x20

    if-eq v1, v6, :cond_11

    const/16 v6, 0xd

    if-eq v1, v6, :cond_11

    const/16 v6, 0x9

    if-ne v1, v6, :cond_5

    goto/16 :goto_7

    :cond_5
    const/16 v6, 0x2f

    if-ne v1, v6, :cond_f

    iput v4, p0, LXa8;->e:I

    const/4 v1, 0x2

    if-ne v4, v2, :cond_7

    add-int/lit8 v4, v4, -0x1

    iput v4, p0, LXa8;->e:I

    invoke-virtual {p0, v1}, LXa8;->z(I)Z

    move-result v2

    iget v4, p0, LXa8;->e:I

    add-int/2addr v4, v3

    iput v4, p0, LXa8;->e:I

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    return v6

    :cond_7
    :goto_2
    invoke-virtual {p0}, LXa8;->v()V

    iget v2, p0, LXa8;->e:I

    aget-char v4, v0, v2

    const/16 v7, 0x2a

    if-eq v4, v7, :cond_9

    if-eq v4, v6, :cond_8

    return v6

    :cond_8
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LXa8;->e:I

    invoke-virtual {p0}, LXa8;->y()V

    iget v1, p0, LXa8;->e:I

    iget v2, p0, LXa8;->f:I

    goto/16 :goto_0

    :cond_9
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LXa8;->e:I

    :goto_3
    iget v2, p0, LXa8;->e:I

    add-int/2addr v2, v1

    iget v4, p0, LXa8;->f:I

    if-le v2, v4, :cond_b

    invoke-virtual {p0, v1}, LXa8;->z(I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_4

    :cond_a
    const-string p1, "Unterminated comment"

    invoke-virtual {p0, p1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_b
    :goto_4
    iget-object v2, p0, LXa8;->d:[C

    iget v4, p0, LXa8;->e:I

    aget-char v2, v2, v4

    if-ne v2, v5, :cond_c

    iget v2, p0, LXa8;->g:I

    add-int/2addr v2, v3

    iput v2, p0, LXa8;->g:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, LXa8;->h:I

    goto :goto_6

    :cond_c
    const/4 v2, 0x0

    :goto_5
    if-ge v2, v1, :cond_e

    iget-object v4, p0, LXa8;->d:[C

    iget v6, p0, LXa8;->e:I

    add-int/2addr v6, v2

    aget-char v4, v4, v6

    const-string v6, "*/"

    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v4, v6, :cond_d

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_d
    :goto_6
    iget v2, p0, LXa8;->e:I

    add-int/2addr v2, v3

    iput v2, p0, LXa8;->e:I

    goto :goto_3

    :cond_e
    iget v2, p0, LXa8;->e:I

    add-int/2addr v1, v2

    iget v2, p0, LXa8;->f:I

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x23

    if-ne v1, v2, :cond_10

    iput v4, p0, LXa8;->e:I

    invoke-virtual {p0}, LXa8;->v()V

    invoke-virtual {p0}, LXa8;->y()V

    iget v1, p0, LXa8;->e:I

    iget v2, p0, LXa8;->f:I

    goto/16 :goto_0

    :cond_10
    iput v4, p0, LXa8;->e:I

    return v1

    :cond_11
    :goto_7
    move v1, v4

    goto/16 :goto_0
.end method

.method public final s(Ljava/lang/String;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_object_detection_bundled/zzeq;

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_0
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_object_detection_bundled/zzeq;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t(C)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LXa8;->d:[C

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, LXa8;->e:I

    iget v3, p0, LXa8;->f:I

    :goto_1
    move v4, v3

    move v3, v2

    :goto_2
    const/16 v5, 0x10

    const/4 v6, 0x1

    if-ge v2, v4, :cond_16

    add-int/lit8 v7, v2, 0x1

    aget-char v2, v0, v2

    if-ne v2, p1, :cond_1

    iput v7, p0, LXa8;->e:I

    sub-int/2addr v7, v3

    add-int/lit8 v7, v7, -0x1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v3, v7}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_0
    invoke-virtual {v1, v0, v3, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v8, 0x5c

    const/16 v9, 0xa

    if-ne v2, v8, :cond_14

    iput v7, p0, LXa8;->e:I

    sub-int/2addr v7, v3

    add-int/lit8 v7, v7, -0x1

    if-nez v1, :cond_2

    add-int/lit8 v1, v7, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr v1, v1

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1, v0, v3, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iget v2, p0, LXa8;->e:I

    iget v3, p0, LXa8;->f:I

    const-string v4, "Unterminated escape sequence"

    if-ne v2, v3, :cond_4

    invoke-virtual {p0, v6}, LXa8;->z(I)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v4}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_3
    iget-object v2, p0, LXa8;->d:[C

    iget v3, p0, LXa8;->e:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, LXa8;->e:I

    aget-char v2, v2, v3

    if-eq v2, v9, :cond_11

    const/16 v3, 0x22

    if-eq v2, v3, :cond_12

    const/16 v3, 0x27

    if-eq v2, v3, :cond_12

    const/16 v3, 0x2f

    if-eq v2, v3, :cond_12

    if-eq v2, v8, :cond_12

    const/16 v3, 0x62

    if-eq v2, v3, :cond_10

    const/16 v3, 0x66

    if-eq v2, v3, :cond_f

    const/16 v6, 0x6e

    if-eq v2, v6, :cond_13

    const/16 v6, 0x72

    if-eq v2, v6, :cond_e

    const/16 v6, 0x74

    if-eq v2, v6, :cond_d

    const/16 v6, 0x75

    if-ne v2, v6, :cond_c

    add-int/lit8 v5, v5, 0x4

    iget v2, p0, LXa8;->f:I

    const/4 v6, 0x4

    if-le v5, v2, :cond_6

    invoke-virtual {p0, v6}, LXa8;->z(I)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p0, v4}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_6
    :goto_4
    iget v2, p0, LXa8;->e:I

    add-int/lit8 v4, v2, 0x4

    const/4 v5, 0x0

    move v9, v5

    :goto_5
    if-ge v2, v4, :cond_b

    iget-object v5, p0, LXa8;->d:[C

    aget-char v7, v5, v2

    shl-int/lit8 v8, v9, 0x4

    int-to-char v8, v8

    const/16 v9, 0x30

    if-lt v7, v9, :cond_7

    const/16 v9, 0x39

    if-gt v7, v9, :cond_7

    add-int/lit8 v7, v7, -0x30

    :goto_6
    add-int/2addr v8, v7

    int-to-char v5, v8

    move v9, v5

    goto :goto_7

    :cond_7
    const/16 v9, 0x61

    if-lt v7, v9, :cond_8

    if-gt v7, v3, :cond_8

    add-int/lit8 v7, v7, -0x57

    goto :goto_6

    :cond_8
    const/16 v9, 0x41

    if-lt v7, v9, :cond_9

    const/16 v9, 0x46

    if-gt v7, v9, :cond_9

    add-int/lit8 v7, v7, -0x37

    goto :goto_6

    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/NumberFormatException;

    new-instance v0, Ljava/lang/String;

    iget v1, p0, LXa8;->e:I

    invoke-direct {v0, v5, v1, v6}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "\\u"

    if-eqz v1, :cond_a

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_a
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_8
    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    iget v2, p0, LXa8;->e:I

    add-int/2addr v2, v6

    iput v2, p0, LXa8;->e:I

    goto :goto_9

    :cond_c
    const-string p1, "Invalid escape sequence"

    invoke-virtual {p0, p1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_d
    const/16 v9, 0x9

    goto :goto_9

    :cond_e
    const/16 v9, 0xd

    goto :goto_9

    :cond_f
    const/16 v9, 0xc

    goto :goto_9

    :cond_10
    const/16 v9, 0x8

    goto :goto_9

    :cond_11
    iget v3, p0, LXa8;->g:I

    add-int/2addr v3, v6

    iput v3, p0, LXa8;->g:I

    iput v5, p0, LXa8;->h:I

    :cond_12
    move v9, v2

    :cond_13
    :goto_9
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, LXa8;->e:I

    iget v3, p0, LXa8;->f:I

    goto/16 :goto_1

    :cond_14
    if-ne v2, v9, :cond_15

    iget v2, p0, LXa8;->g:I

    add-int/2addr v2, v6

    iput v2, p0, LXa8;->g:I

    iput v7, p0, LXa8;->h:I

    :cond_15
    move v2, v7

    goto/16 :goto_2

    :cond_16
    if-nez v1, :cond_17

    sub-int v1, v2, v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/2addr v1, v1

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v1, v4

    :cond_17
    sub-int v4, v2, v3

    invoke-virtual {v1, v0, v3, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iput v2, p0, LXa8;->e:I

    invoke-virtual {p0, v6}, LXa8;->z(I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto/16 :goto_0

    :cond_18
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-class v0, LXa8;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LXa8;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :cond_1
    :goto_0
    iget v3, p0, LXa8;->e:I

    add-int/2addr v3, v2

    iget v4, p0, LXa8;->f:I

    if-ge v3, v4, :cond_3

    iget-object v4, p0, LXa8;->d:[C

    aget-char v3, v4, v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_4

    const/16 v4, 0xa

    if-eq v3, v4, :cond_4

    const/16 v4, 0xc

    if-eq v3, v4, :cond_4

    const/16 v4, 0xd

    if-eq v3, v4, :cond_4

    const/16 v4, 0x20

    if-eq v3, v4, :cond_4

    const/16 v4, 0x23

    if-eq v3, v4, :cond_2

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_4

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_2

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_2

    const/16 v4, 0x7b

    if-eq v3, v4, :cond_4

    const/16 v4, 0x7d

    if-eq v3, v4, :cond_4

    const/16 v4, 0x3a

    if-eq v3, v4, :cond_4

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_2

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :pswitch_0
    invoke-virtual {p0}, LXa8;->v()V

    goto :goto_1

    :cond_3
    const/16 v3, 0x400

    if-ge v2, v3, :cond_5

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v3}, LXa8;->z(I)Z

    move-result v3

    if-nez v3, :cond_1

    :cond_4
    :goto_1
    :pswitch_1
    move v1, v2

    goto :goto_2

    :cond_5
    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :cond_6
    iget-object v3, p0, LXa8;->d:[C

    iget v4, p0, LXa8;->e:I

    invoke-virtual {v0, v3, v4, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iget v3, p0, LXa8;->e:I

    add-int/2addr v3, v2

    iput v3, p0, LXa8;->e:I

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, LXa8;->z(I)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_2
    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, LXa8;->d:[C

    iget v3, p0, LXa8;->e:I

    invoke-direct {v0, v2, v3, v1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_3

    :cond_7
    iget-object v2, p0, LXa8;->d:[C

    iget v3, p0, LXa8;->e:I

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    iget v2, p0, LXa8;->e:I

    add-int/2addr v2, v1

    iput v2, p0, LXa8;->e:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final v()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LXa8;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    invoke-virtual {p0, v0}, LXa8;->s(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final x(I)V
    .locals 3

    iget v0, p0, LXa8;->m:I

    iget-object v1, p0, LXa8;->l:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    add-int/2addr v0, v0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, LXa8;->l:[I

    iget-object v1, p0, LXa8;->o:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, LXa8;->o:[I

    iget-object v1, p0, LXa8;->n:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, LXa8;->n:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, LXa8;->l:[I

    iget v1, p0, LXa8;->m:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LXa8;->m:I

    aput p1, v0, v1

    return-void
.end method

.method public final y()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    iget v0, p0, LXa8;->e:I

    iget v1, p0, LXa8;->f:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, v2}, LXa8;->z(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, LXa8;->d:[C

    iget v1, p0, LXa8;->e:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, LXa8;->e:I

    aget-char v0, v0, v1

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    iget v0, p0, LXa8;->g:I

    add-int/2addr v0, v2

    iput v0, p0, LXa8;->g:I

    iput v3, p0, LXa8;->h:I

    return-void

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    :cond_3
    return-void
.end method

.method public final z(I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LXa8;->d:[C

    iget v1, p0, LXa8;->h:I

    iget v2, p0, LXa8;->e:I

    sub-int/2addr v1, v2

    iput v1, p0, LXa8;->h:I

    iget v1, p0, LXa8;->f:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, LXa8;->f:I

    invoke-static {v0, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    iput v3, p0, LXa8;->f:I

    :goto_0
    iput v3, p0, LXa8;->e:I

    :cond_1
    iget-object v1, p0, LXa8;->b:Ljava/io/Reader;

    iget v2, p0, LXa8;->f:I

    rsub-int v4, v2, 0x400

    invoke-virtual {v1, v0, v2, v4}, Ljava/io/Reader;->read([CII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    iget v2, p0, LXa8;->f:I

    add-int/2addr v2, v1

    iput v2, p0, LXa8;->f:I

    iget v1, p0, LXa8;->g:I

    const/4 v4, 0x1

    if-nez v1, :cond_2

    iget v1, p0, LXa8;->h:I

    if-nez v1, :cond_2

    if-lez v2, :cond_2

    aget-char v1, v0, v3

    const v5, 0xfeff

    if-ne v1, v5, :cond_2

    iget v1, p0, LXa8;->e:I

    add-int/2addr v1, v4

    iput v1, p0, LXa8;->e:I

    iput v4, p0, LXa8;->h:I

    add-int/lit8 p1, p1, 0x1

    :cond_2
    if-lt v2, p1, :cond_1

    return v4

    :cond_3
    return v3
.end method

.method public final zzb()Ljava/lang/String;
    .locals 7

    iget v0, p0, LXa8;->g:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, LXa8;->e:I

    iget v3, p0, LXa8;->h:I

    sub-int/2addr v2, v3

    add-int/2addr v2, v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v4, 0x24

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    :goto_0
    iget v5, p0, LXa8;->m:I

    if-ge v4, v5, :cond_3

    iget-object v5, p0, LXa8;->l:[I

    aget v5, v5, v4

    if-eq v5, v1, :cond_1

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    const/4 v6, 0x4

    if-eq v5, v6, :cond_0

    const/4 v6, 0x5

    if-eq v5, v6, :cond_0

    goto :goto_1

    :cond_0
    const/16 v5, 0x2e

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v5, p0, LXa8;->n:[Ljava/lang/String;

    aget-object v5, v5, v4

    if-eqz v5, :cond_2

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    iget-object v5, p0, LXa8;->o:[I

    aget v5, v5, v4

    const/16 v6, 0x5b

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x5d

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x2d

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, " at line "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " column "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " path "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
