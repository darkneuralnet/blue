.class public final LVp9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbr9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lbr9<",
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

.field public final e:LNp9;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:[I

.field public final j:I

.field public final k:I

.field public final l:Lbp9;

.field public final m:LNr9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LNr9<",
            "**>;"
        }
    .end annotation
.end field

.field public final n:Lyk9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyk9<",
            "*>;"
        }
    .end annotation
.end field

.field public final o:Lbq9;

.field public final p:LAp9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, LVp9;->q:[I

    invoke-static {}, LFs9;->l()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, LVp9;->r:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILNp9;ZZ[IIILbq9;Lbp9;LNr9;Lyk9;LAp9;[B)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[",
            "Ljava/lang/Object;",
            "II",
            "LNp9;",
            "ZZ[III",
            "Lbq9;",
            "Lbp9;",
            "LNr9<",
            "**>;",
            "Lyk9<",
            "*>;",
            "LAp9;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p5

    move-object/from16 v2, p14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, LVp9;->a:[I

    move-object v3, p2

    iput-object v3, v0, LVp9;->b:[Ljava/lang/Object;

    move v3, p3

    iput v3, v0, LVp9;->c:I

    move v3, p4

    iput v3, v0, LVp9;->d:I

    instance-of v3, v1, LEm9;

    iput-boolean v3, v0, LVp9;->g:Z

    move v3, p6

    iput-boolean v3, v0, LVp9;->h:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, p5}, Lyk9;->h(LNp9;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    :cond_0
    iput-boolean v3, v0, LVp9;->f:Z

    move-object v3, p8

    iput-object v3, v0, LVp9;->i:[I

    move v3, p9

    iput v3, v0, LVp9;->j:I

    move v3, p10

    iput v3, v0, LVp9;->k:I

    move-object/from16 v3, p11

    iput-object v3, v0, LVp9;->o:Lbq9;

    move-object/from16 v3, p12

    iput-object v3, v0, LVp9;->l:Lbp9;

    move-object/from16 v3, p13

    iput-object v3, v0, LVp9;->m:LNr9;

    iput-object v2, v0, LVp9;->n:Lyk9;

    iput-object v1, v0, LVp9;->e:LNp9;

    move-object/from16 v1, p15

    iput-object v1, v0, LVp9;->p:LAp9;

    return-void
.end method

.method public static B(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static D(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static I(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6
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

.method public static m(I)Z
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

.method public static p(Ljava/lang/Object;ILbr9;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lbr9;->c(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static r(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final s(ILjava/lang/Object;LVs9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, LVs9;->r(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lnh9;

    invoke-interface {p2, p0, p1}, LVs9;->J(ILnh9;)V

    return-void
.end method

.method public static t(Ljava/lang/Class;LFp9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LFp9;",
            "Lbq9;",
            "Lbp9;",
            "LNr9<",
            "**>;",
            "Lyk9<",
            "*>;",
            "LAp9;",
            ")",
            "LVp9<",
            "TT;>;"
        }
    .end annotation

    instance-of p0, p1, Ltq9;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, Ltq9;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, LVp9;->u(Ltq9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p1, LCr9;

    const/4 p0, 0x0

    throw p0
.end method

.method public static u(Ltq9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ltq9;",
            "Lbq9;",
            "Lbp9;",
            "LNr9<",
            "**>;",
            "Lyk9<",
            "*>;",
            "LAp9;",
            ")",
            "LVp9<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Ltq9;->zzc()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Ltq9;->a()Ljava/lang/String;

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

    sget-object v6, LVp9;->q:[I

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
    sget-object v15, LVp9;->r:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, Ltq9;->b()[Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Ltq9;->zza()LNp9;

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

    invoke-static {v2, v12}, LVp9;->I(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    invoke-static {v2, v8}, LVp9;->I(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    invoke-static {v2, v8}, LVp9;->I(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    invoke-static {v2, v11}, LVp9;->I(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    new-instance v0, LVp9;

    move-object v4, v0

    invoke-virtual/range {p0 .. p0}, Ltq9;->zza()LNp9;

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

    invoke-direct/range {v4 .. v20}, LVp9;-><init>([I[Ljava/lang/Object;IILNp9;ZZ[IIILbq9;Lbp9;LNr9;Lyk9;LAp9;[B)V

    return-object v0
.end method

.method public static v(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static w(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static z(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A(I)I
    .locals 1

    iget-object v0, p0, LVp9;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final C(I)I
    .locals 1

    iget-object v0, p0, LVp9;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final E(I)Lcn9;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, LVp9;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcn9;

    return-object p1
.end method

.method public final F(I)Lbr9;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, LVp9;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lbr9;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lnq9;->a()Lnq9;

    move-result-object v0

    iget-object v1, p0, LVp9;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lnq9;->b(Ljava/lang/Class;)Lbr9;

    move-result-object v0

    iget-object v1, p0, LVp9;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final G(Ljava/lang/Object;ILjava/lang/Object;LNr9;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "ITUB;",
            "LNr9<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    iget-object v0, p0, LVp9;->a:[I

    aget v0, v0, p2

    invoke-virtual {p0, p2}, LVp9;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, v1, v2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, LVp9;->E(I)Lcn9;

    move-result-object v1

    if-nez v1, :cond_1

    return-object p3

    :cond_1
    check-cast p1, Lyp9;

    invoke-virtual {p0, p2}, LVp9;->H(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lvp9;

    invoke-virtual {p2}, Lvp9;->c()Ltp9;

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

    invoke-interface {v1, v3}, Lcn9;->zza(I)Z

    move-result v3

    if-nez v3, :cond_2

    if-nez p3, :cond_3

    invoke-virtual {p4}, LNr9;->f()Ljava/lang/Object;

    move-result-object p3

    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v3, v4}, Lvp9;->b(Ltp9;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    sget-object v4, Lnh9;->c:Lnh9;

    new-array v3, v3, [B

    invoke-static {v3}, Lrj9;->n([B)Lrj9;

    move-result-object v4

    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, p2, v5, v2}, Lvp9;->e(Lrj9;Ltp9;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v4, v3}, LHg9;->a(Lrj9;[B)Lnh9;

    move-result-object v2

    invoke-virtual {p4, p3, v0, v2}, LNr9;->k(Ljava/lang/Object;ILnh9;)V

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

.method public final H(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, LVp9;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final J(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, LVp9;->C(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {p0, p2, p3}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2, p2}, LFn9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, LVp9;->h(Ljava/lang/Object;I)V

    return-void

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    invoke-static {p1, v0, v1, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, LVp9;->h(Ljava/lang/Object;I)V

    :cond_3
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget v0, p0, LVp9;->j:I

    :goto_0
    iget v1, p0, LVp9;->k:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LVp9;->i:[I

    aget v1, v1, v0

    invoke-virtual {p0, v1}, LVp9;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, v1, v2}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    move-object v4, v3

    check-cast v4, Lyp9;

    invoke-virtual {v4}, Lyp9;->f()V

    invoke-static {p1, v1, v2, v3}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LVp9;->i:[I

    array-length v0, v0

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, LVp9;->l:Lbp9;

    iget-object v3, p0, LVp9;->i:[I

    aget v3, v3, v1

    int-to-long v3, v3

    invoke-virtual {v2, p1, v3, v4}, Lbp9;->b(Ljava/lang/Object;J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-virtual {v0, p1}, LNr9;->m(Ljava/lang/Object;)V

    iget-boolean v0, p0, LVp9;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LVp9;->n:Lyk9;

    invoke-virtual {v0, p1}, Lyk9;->e(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final b(Ljava/lang/Object;Lwq9;Lsk9;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lwq9;",
            "Lsk9;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v10, p3

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v11, v1, LVp9;->m:LNr9;

    iget-object v12, v1, LVp9;->n:Lyk9;

    const/4 v13, 0x0

    move-object v3, v13

    move-object v14, v3

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface/range {p2 .. p2}, Lwq9;->zzc()I

    move-result v4

    iget v5, v1, LVp9;->c:I

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x1

    if-lt v4, v5, :cond_3

    iget v5, v1, LVp9;->d:I

    if-gt v4, v5, :cond_3

    iget-object v5, v1, LVp9;->a:[I

    array-length v5, v5

    div-int/lit8 v5, v5, 0x3

    add-int/2addr v5, v7

    move v9, v6

    :goto_1
    if-gt v9, v5, :cond_3

    add-int v15, v5, v9

    ushr-int/2addr v15, v8

    mul-int/lit8 v16, v15, 0x3

    iget-object v7, v1, LVp9;->a:[I

    aget v7, v7, v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v4, v7, :cond_1

    move/from16 v7, v16

    goto :goto_3

    :cond_1
    if-ge v4, v7, :cond_2

    add-int/lit8 v15, v15, -0x1

    move v5, v15

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v15, 0x1

    :goto_2
    const/4 v7, -0x1

    goto :goto_1

    :cond_3
    const/4 v7, -0x1

    :goto_3
    if-gez v7, :cond_b

    const v5, 0x7fffffff

    if-ne v4, v5, :cond_5

    iget v0, v1, LVp9;->j:I

    :goto_4
    iget v3, v1, LVp9;->k:I

    if-ge v0, v3, :cond_4

    iget-object v3, v1, LVp9;->i:[I

    aget v3, v3, v0

    invoke-virtual {v1, v2, v3, v14, v11}, LVp9;->G(Ljava/lang/Object;ILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    if-eqz v14, :cond_1a

    invoke-virtual {v11, v2, v14}, LNr9;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    :try_start_1
    iget-boolean v5, v1, LVp9;->f:Z

    if-nez v5, :cond_6

    move-object v5, v13

    goto :goto_5

    :cond_6
    iget-object v5, v1, LVp9;->e:LNp9;

    invoke-virtual {v12, v10, v5, v4}, Lyk9;->c(Lsk9;LNp9;I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    :goto_5
    if-eqz v5, :cond_8

    if-nez v3, :cond_7

    invoke-virtual {v12, v2}, Lyk9;->b(Ljava/lang/Object;)LVk9;

    move-result-object v3

    :cond_7
    move-object v15, v3

    move-object v3, v12

    move-object/from16 v4, p2

    move-object/from16 v6, p3

    move-object v7, v15

    move-object v8, v14

    move-object v9, v11

    invoke-virtual/range {v3 .. v9}, Lyk9;->d(Lwq9;Ljava/lang/Object;Lsk9;LVk9;Ljava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    move-object v3, v15

    goto :goto_0

    :cond_8
    invoke-virtual {v11, v0}, LNr9;->r(Lwq9;)Z

    if-nez v14, :cond_9

    invoke-virtual {v11, v2}, LNr9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    :cond_9
    invoke-virtual {v11, v14, v0}, LNr9;->q(Ljava/lang/Object;Lwq9;)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_0

    iget v0, v1, LVp9;->j:I

    :goto_6
    iget v3, v1, LVp9;->k:I

    if-ge v0, v3, :cond_a

    iget-object v3, v1, LVp9;->i:[I

    aget v3, v3, v0

    invoke-virtual {v1, v2, v3, v14, v11}, LVp9;->G(Ljava/lang/Object;ILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_a
    if-eqz v14, :cond_1a

    invoke-virtual {v11, v2, v14}, LNr9;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_e

    :cond_b
    :try_start_2
    invoke-virtual {v1, v7}, LVp9;->C(I)I

    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v5}, LVp9;->B(I)I

    move-result v9

    const v15, 0xfffff

    packed-switch v9, :pswitch_data_0

    if-nez v14, :cond_16

    invoke-virtual {v11}, LNr9;->f()Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_b

    :pswitch_0
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v8

    invoke-interface {v0, v8, v10}, Lwq9;->C(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_1
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->e()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_2
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->zzi()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_3
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->b()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_4
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->zzh()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_5
    invoke-interface/range {p2 .. p2}, Lwq9;->zze()I

    move-result v6

    invoke-virtual {v1, v7}, LVp9;->E(I)Lcn9;

    move-result-object v8

    if-eqz v8, :cond_d

    invoke-interface {v8, v6}, Lcn9;->zza(I)Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {v4, v6, v14, v11}, Lhr9;->d(IILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    goto/16 :goto_0

    :cond_d
    :goto_7
    and-int/2addr v5, v15

    int-to-long v8, v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v8, v9, v5}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_6
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->c()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_7
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->d()Lnh9;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {v1, v2, v4, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_e

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-static {v2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-interface {v0, v9, v10}, Lwq9;->D(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, LFn9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_8

    :cond_e
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v8

    invoke-interface {v0, v8, v10}, Lwq9;->D(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    :goto_8
    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {v1, v2, v5, v0}, LVp9;->g(Ljava/lang/Object;ILwq9;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_a
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->h()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_b
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->x()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_c
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_d
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->zzg()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_e
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->f()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_f
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->j()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_10
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->zzb()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_11
    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-interface/range {p2 .. p2}, Lwq9;->zza()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v4, v7}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {v1, v7}, LVp9;->H(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v7}, LVp9;->C(I)I

    move-result v5

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-static {v2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_f

    invoke-static {}, Lyp9;->d()Lyp9;

    move-result-object v7

    invoke-virtual {v7}, Lyp9;->e()Lyp9;

    move-result-object v7

    invoke-static {v2, v5, v6, v7}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :cond_f
    move-object v8, v7

    check-cast v8, Lyp9;

    invoke-virtual {v8}, Lyp9;->h()Z

    move-result v8

    if-nez v8, :cond_10

    invoke-static {}, Lyp9;->d()Lyp9;

    move-result-object v8

    invoke-virtual {v8}, Lyp9;->e()Lyp9;

    move-result-object v8

    invoke-static {v8, v7}, LAp9;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v5, v6, v8}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v7, v8

    :cond_10
    :goto_9
    check-cast v7, Lyp9;

    check-cast v4, Lvp9;

    invoke-virtual {v4}, Lvp9;->c()Ltp9;

    move-result-object v4

    invoke-interface {v0, v7, v4, v10}, Lwq9;->B(Ljava/util/Map;Ltp9;Lsk9;)V

    goto/16 :goto_0

    :pswitch_13
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    iget-object v7, v1, LVp9;->l:Lbp9;

    invoke-virtual {v7, v2, v4, v5}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4, v6, v10}, Lwq9;->E(Ljava/util/List;Lbr9;Lsk9;)V

    goto/16 :goto_0

    :pswitch_14
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->u(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_15
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->s(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_16
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->t(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_17
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->y(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_18
    iget-object v6, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v8, v5

    invoke-virtual {v6, v2, v8, v9}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v5

    invoke-interface {v0, v5}, Lwq9;->l(Ljava/util/List;)V

    invoke-virtual {v1, v7}, LVp9;->E(I)Lcn9;

    move-result-object v6

    invoke-static {v4, v5, v6, v14, v11}, Lhr9;->c(ILjava/util/List;Lcn9;Ljava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    goto/16 :goto_0

    :pswitch_19
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->r(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1a
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->p(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1b
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->o(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1c
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->z(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1d
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->w(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1e
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->q(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1f
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->v(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_20
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->A(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_21
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->m(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_22
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->u(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_23
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->s(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_24
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->t(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_25
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->y(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_26
    iget-object v6, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v8, v5

    invoke-virtual {v6, v2, v8, v9}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v5

    invoke-interface {v0, v5}, Lwq9;->l(Ljava/util/List;)V

    invoke-virtual {v1, v7}, LVp9;->E(I)Lcn9;

    move-result-object v6

    invoke-static {v4, v5, v6, v14, v11}, Lhr9;->c(ILjava/util/List;Lcn9;Ljava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    goto/16 :goto_0

    :pswitch_27
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->r(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_28
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->n(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_29
    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v4

    and-int/2addr v5, v15

    int-to-long v5, v5

    iget-object v7, v1, LVp9;->l:Lbp9;

    invoke-virtual {v7, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v5

    invoke-interface {v0, v5, v4, v10}, Lwq9;->F(Ljava/util/List;Lbr9;Lsk9;)V

    goto/16 :goto_0

    :pswitch_2a
    invoke-static {v5}, LVp9;->m(I)Z

    move-result v4

    if-eqz v4, :cond_11

    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    move-object v5, v0

    check-cast v5, LAi9;

    invoke-virtual {v5, v4, v8}, LAi9;->G(Ljava/util/List;Z)V

    goto/16 :goto_0

    :cond_11
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v7, v5

    invoke-virtual {v4, v2, v7, v8}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    move-object v5, v0

    check-cast v5, LAi9;

    invoke-virtual {v5, v4, v6}, LAi9;->G(Ljava/util/List;Z)V

    goto/16 :goto_0

    :pswitch_2b
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->p(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2c
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->o(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2d
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->z(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2e
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->w(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2f
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->q(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_30
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->v(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_31
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->A(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_32
    iget-object v4, v1, LVp9;->l:Lbp9;

    and-int/2addr v5, v15

    int-to-long v5, v5

    invoke-virtual {v4, v2, v5, v6}, Lbp9;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Lwq9;->m(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_33
    invoke-virtual {v1, v2, v7}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_12

    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-static {v2, v4, v5}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v7

    invoke-interface {v0, v7, v10}, Lwq9;->C(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, LFn9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v5, v6}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_0

    :cond_12
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-interface {v0, v6, v10}, Lwq9;->C(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v5, v6}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_34
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->e()J

    move-result-wide v8

    invoke-static {v2, v4, v5, v8, v9}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_35
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->zzi()I

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_36
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->b()J

    move-result-wide v8

    invoke-static {v2, v4, v5, v8, v9}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_37
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->zzh()I

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_38
    invoke-interface/range {p2 .. p2}, Lwq9;->zze()I

    move-result v6

    invoke-virtual {v1, v7}, LVp9;->E(I)Lcn9;

    move-result-object v8

    if-eqz v8, :cond_14

    invoke-interface {v8, v6}, Lcn9;->zza(I)Z

    move-result v8

    if-eqz v8, :cond_13

    goto :goto_a

    :cond_13
    invoke-static {v4, v6, v14, v11}, Lhr9;->d(IILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    goto/16 :goto_0

    :cond_14
    :goto_a
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-static {v2, v4, v5, v6}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_39
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->c()I

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3a
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->d()Lnh9;

    move-result-object v6

    invoke-static {v2, v4, v5, v6}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3b
    invoke-virtual {v1, v2, v7}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_15

    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-static {v2, v4, v5}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v7

    invoke-interface {v0, v7, v10}, Lwq9;->D(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, LFn9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v5, v6}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_0

    :cond_15
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-virtual {v1, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-interface {v0, v6, v10}, Lwq9;->D(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v5, v6}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3c
    invoke-virtual {v1, v2, v5, v0}, LVp9;->g(Ljava/lang/Object;ILwq9;)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3d
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->h()Z

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->r(Ljava/lang/Object;JZ)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3e
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->x()I

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_3f
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->a()J

    move-result-wide v8

    invoke-static {v2, v4, v5, v8, v9}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_40
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->zzg()I

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_41
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->f()J

    move-result-wide v8

    invoke-static {v2, v4, v5, v8, v9}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_42
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->j()J

    move-result-wide v8

    invoke-static {v2, v4, v5, v8, v9}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_43
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->zzb()F

    move-result v6

    invoke-static {v2, v4, v5, v6}, LFs9;->u(Ljava/lang/Object;JF)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_44
    and-int v4, v5, v15

    int-to-long v4, v4

    invoke-interface/range {p2 .. p2}, Lwq9;->zza()D

    move-result-wide v8

    invoke-static {v2, v4, v5, v8, v9}, LFs9;->t(Ljava/lang/Object;JD)V

    invoke-virtual {v1, v2, v7}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :goto_b
    move-object v14, v4

    :cond_16
    invoke-virtual {v11, v14, v0}, LNr9;->q(Ljava/lang/Object;Lwq9;)Z

    move-result v4
    :try_end_3
    .catch Lcom/google/android/gms/internal/recaptcha/zzrq; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v4, :cond_0

    iget v0, v1, LVp9;->j:I

    :goto_c
    iget v3, v1, LVp9;->k:I

    if-ge v0, v3, :cond_17

    iget-object v3, v1, LVp9;->i:[I

    aget v3, v3, v0

    invoke-virtual {v1, v2, v3, v14, v11}, LVp9;->G(Ljava/lang/Object;ILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    :cond_17
    if-eqz v14, :cond_1a

    invoke-virtual {v11, v2, v14}, LNr9;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catch_0
    :try_start_4
    invoke-virtual {v11, v0}, LNr9;->r(Lwq9;)Z

    if-nez v14, :cond_18

    invoke-virtual {v11, v2}, LNr9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    :cond_18
    invoke-virtual {v11, v14, v0}, LNr9;->q(Ljava/lang/Object;Lwq9;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_0

    iget v0, v1, LVp9;->j:I

    :goto_d
    iget v3, v1, LVp9;->k:I

    if-ge v0, v3, :cond_19

    iget-object v3, v1, LVp9;->i:[I

    aget v3, v3, v0

    invoke-virtual {v1, v2, v3, v14, v11}, LVp9;->G(Ljava/lang/Object;ILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_19
    if-eqz v14, :cond_1a

    invoke-virtual {v11, v2, v14}, LNr9;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1a
    return-void

    :goto_e
    iget v3, v1, LVp9;->j:I

    :goto_f
    iget v4, v1, LVp9;->k:I

    if-ge v3, v4, :cond_1b

    iget-object v4, v1, LVp9;->i:[I

    aget v4, v4, v3

    invoke-virtual {v1, v2, v4, v14, v11}, LVp9;->G(Ljava/lang/Object;ILjava/lang/Object;LNr9;)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_1b
    if-eqz v14, :cond_1c

    invoke-virtual {v11, v2, v14}, LNr9;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1c
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

.method public final c(Ljava/lang/Object;)Z
    .locals 18
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
    iget v2, v6, LVp9;->j:I

    const/4 v11, 0x0

    const/4 v3, 0x1

    if-ge v10, v2, :cond_c

    iget-object v2, v6, LVp9;->i:[I

    aget v12, v2, v10

    iget-object v2, v6, LVp9;->a:[I

    aget v13, v2, v12

    invoke-virtual {v6, v12}, LVp9;->C(I)I

    move-result v14

    iget-object v2, v6, LVp9;->a:[I

    add-int/lit8 v4, v12, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v15, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, LVp9;->r:Lsun/misc/Unsafe;

    int-to-long v1, v4

    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

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

    invoke-virtual/range {v0 .. v5}, LVp9;->o(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v9

    :cond_3
    :goto_2
    invoke-static {v14}, LVp9;->B(I)I

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
    and-int v0, v14, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyp9;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v6, v12}, LVp9;->H(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvp9;

    invoke-virtual {v1}, Lvp9;->c()Ltp9;

    move-result-object v1

    iget-object v1, v1, Ltp9;->c:LRs9;

    invoke-virtual {v1}, LRs9;->a()LTs9;

    move-result-object v1

    sget-object v2, LTs9;->k:LTs9;

    if-ne v1, v2, :cond_b

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v11, :cond_6

    invoke-static {}, Lnq9;->a()Lnq9;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnq9;->b(Ljava/lang/Class;)Lbr9;

    move-result-object v2

    move-object v11, v2

    :cond_6
    invoke-interface {v11, v1}, Lbr9;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v9

    :cond_7
    invoke-virtual {v6, v7, v13, v12}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v6, v12}, LVp9;->F(I)Lbr9;

    move-result-object v0

    invoke-static {v7, v14, v0}, LVp9;->p(Ljava/lang/Object;ILbr9;)Z

    move-result v0

    if-nez v0, :cond_b

    return v9

    :cond_8
    and-int v0, v14, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v6, v12}, LVp9;->F(I)Lbr9;

    move-result-object v1

    move v2, v9

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lbr9;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return v9

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-virtual/range {v0 .. v5}, LVp9;->o(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v6, v12}, LVp9;->F(I)Lbr9;

    move-result-object v0

    invoke-static {v7, v14, v0}, LVp9;->p(Ljava/lang/Object;ILbr9;)Z

    move-result v0

    if-nez v0, :cond_b

    return v9

    :cond_b
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_c
    iget-boolean v0, v6, LVp9;->f:Z

    if-nez v0, :cond_d

    return v3

    :cond_d
    iget-object v0, v6, LVp9;->n:Lyk9;

    invoke-virtual {v0, v7}, Lyk9;->a(Ljava/lang/Object;)LVk9;

    throw v11
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, LVp9;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, LVp9;->C(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    int-to-long v5, v5

    invoke-static {v3}, LVp9;->B(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, v2}, LVp9;->A(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto :goto_1

    :pswitch_2
    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_1
    if-nez v3, :cond_1

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lhr9;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_3

    :pswitch_11
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :pswitch_12
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_3

    :pswitch_13
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, LFs9;->g(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_3

    :pswitch_14
    invoke-virtual {p0, p1, p2, v2}, LVp9;->l(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, LFs9;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, LFs9;->f(Ljava/lang/Object;J)D

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
    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-virtual {v0, p1}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LVp9;->m:LNr9;

    invoke-virtual {v2, p2}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, LVp9;->f:Z

    if-nez v0, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    iget-object v0, p0, LVp9;->n:Lyk9;

    invoke-virtual {v0, p1}, Lyk9;->a(Ljava/lang/Object;)LVk9;

    iget-object p1, p0, LVp9;->n:Lyk9;

    invoke-virtual {p1, p2}, Lyk9;->a(Ljava/lang/Object;)LVk9;

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

.method public final e(Ljava/lang/Object;LVs9;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LVs9;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LVp9;->h:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LVp9;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LVp9;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, LVp9;->C(I)I

    move-result v3

    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    invoke-static {v3}, LVp9;->B(I)I

    move-result v5

    const/4 v6, 0x1

    const v7, 0xfffff

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-interface {p2, v4, v3, v5}, LVs9;->I(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->t(IJ)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->u(II)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->F(IJ)V

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->D(II)V

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->i(II)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->w(II)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnh9;

    invoke-interface {p2, v4, v3}, LVs9;->J(ILnh9;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-interface {p2, v4, v3, v5}, LVs9;->G(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, p2}, LVp9;->s(ILjava/lang/Object;LVs9;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->r(Ljava/lang/Object;J)Z

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->f(IZ)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->h(II)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->k(IJ)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->o(II)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->B(IJ)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->m(IJ)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->w(Ljava/lang/Object;J)F

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->j(IF)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, v4, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LVp9;->v(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->g(ID)V

    goto/16 :goto_1

    :pswitch_12
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, p2, v4, v3, v2}, LVp9;->k(LVs9;ILjava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_13
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v4, v3, p2, v5}, Lhr9;->o(ILjava/util/List;LVs9;Lbr9;)V

    goto/16 :goto_1

    :pswitch_14
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->v(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_15
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->u(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_16
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->t(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_17
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->s(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_18
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->k(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_19
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->x(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_1a
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->h(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_1b
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->l(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_1c
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->m(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_1d
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->p(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_1e
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->y(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_1f
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->q(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_20
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->n(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_21
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lhr9;->j(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_22
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->v(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_23
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->u(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_24
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->t(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_25
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->s(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_26
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->k(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_27
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->x(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_28
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2}, Lhr9;->i(ILjava/util/List;LVs9;)V

    goto/16 :goto_1

    :pswitch_29
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v4, v3, p2, v5}, Lhr9;->r(ILjava/util/List;LVs9;Lbr9;)V

    goto/16 :goto_1

    :pswitch_2a
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2}, Lhr9;->w(ILjava/util/List;LVs9;)V

    goto/16 :goto_1

    :pswitch_2b
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->h(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_2c
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->l(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_2d
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->m(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_2e
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->p(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_2f
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->y(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_30
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->q(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_31
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->n(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_32
    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lhr9;->j(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-interface {p2, v4, v3, v5}, LVs9;->I(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->t(IJ)V

    goto/16 :goto_1

    :pswitch_35
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->u(II)V

    goto/16 :goto_1

    :pswitch_36
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->F(IJ)V

    goto/16 :goto_1

    :pswitch_37
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->D(II)V

    goto/16 :goto_1

    :pswitch_38
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->i(II)V

    goto/16 :goto_1

    :pswitch_39
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->w(II)V

    goto/16 :goto_1

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnh9;

    invoke-interface {p2, v4, v3}, LVs9;->J(ILnh9;)V

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-interface {p2, v4, v3, v5}, LVs9;->G(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_1

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, p2}, LVp9;->s(ILjava/lang/Object;LVs9;)V

    goto/16 :goto_1

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->f(IZ)V

    goto/16 :goto_1

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->h(II)V

    goto :goto_1

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->k(IJ)V

    goto :goto_1

    :pswitch_40
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->o(II)V

    goto :goto_1

    :pswitch_41
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->B(IJ)V

    goto :goto_1

    :pswitch_42
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->m(IJ)V

    goto :goto_1

    :pswitch_43
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-interface {p2, v4, v3}, LVs9;->j(IF)V

    goto :goto_1

    :pswitch_44
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, LFs9;->f(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-interface {p2, v4, v5, v6}, LVs9;->g(ID)V

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-virtual {v0, p1}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LNr9;->p(Ljava/lang/Object;LVs9;)V

    return-void

    :cond_2
    iget-object p2, p0, LVp9;->n:Lyk9;

    invoke-virtual {p2, p1}, Lyk9;->a(Ljava/lang/Object;)LVk9;

    const/4 p1, 0x0

    throw p1

    :cond_3
    invoke-virtual {p0, p1, p2}, LVp9;->j(Ljava/lang/Object;LVs9;)V

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

.method public final f(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, LVp9;->C(I)I

    move-result v0

    iget-object v1, p0, LVp9;->a:[I

    aget v1, v1, p3

    const v2, 0xfffff

    and-int/2addr v0, v2

    int-to-long v2, v0

    invoke-virtual {p0, p2, v1, p3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, v1, p3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, v2, v3}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {p2, v2, v3}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, p2}, LFn9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, v3, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, p3}, LVp9;->i(Ljava/lang/Object;II)V

    return-void

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    invoke-static {p1, v2, v3, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, p3}, LVp9;->i(Ljava/lang/Object;II)V

    :cond_4
    return-void
.end method

.method public final g(Ljava/lang/Object;ILwq9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, LVp9;->m(I)Z

    move-result v0

    const v1, 0xfffff

    if-eqz v0, :cond_0

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, Lwq9;->i()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, LVp9;->g:Z

    if-eqz v0, :cond_1

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, Lwq9;->g()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void

    :cond_1
    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, Lwq9;->d()Lnh9;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, LVp9;->A(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v2

    ushr-int/lit8 p2, p2, 0x14

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, LFs9;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final i(Ljava/lang/Object;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, LVp9;->A(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, LFs9;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final j(Ljava/lang/Object;LVs9;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LVs9;",
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

    iget-boolean v3, v0, LVp9;->f:Z

    if-nez v3, :cond_5

    iget-object v3, v0, LVp9;->a:[I

    array-length v3, v3

    sget-object v4, LVp9;->r:Lsun/misc/Unsafe;

    const v5, 0xfffff

    move v9, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v3, :cond_4

    invoke-virtual {v0, v7}, LVp9;->C(I)I

    move-result v10

    iget-object v11, v0, LVp9;->a:[I

    aget v11, v11, v7

    invoke-static {v10}, LVp9;->B(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v12, v13, :cond_1

    iget-object v13, v0, LVp9;->a:[I

    add-int/lit8 v15, v7, 0x2

    aget v13, v13, v15

    and-int v15, v13, v5

    if-eq v15, v9, :cond_0

    int-to-long v8, v15

    invoke-virtual {v4, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v9, v15

    :cond_0
    ushr-int/lit8 v13, v13, 0x14

    shl-int v13, v14, v13

    goto :goto_1

    :cond_1
    const/4 v13, 0x0

    :goto_1
    and-int/2addr v10, v5

    int-to-long v5, v10

    packed-switch v12, :pswitch_data_0

    :cond_2
    :goto_2
    const/4 v12, 0x0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-interface {v2, v11, v5, v6}, LVs9;->I(ILjava/lang/Object;Lbr9;)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->t(IJ)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->u(II)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->F(IJ)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->D(II)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->i(II)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->w(II)V

    goto :goto_2

    :pswitch_7
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnh9;

    invoke-interface {v2, v11, v5}, LVs9;->J(ILnh9;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-interface {v2, v11, v5, v6}, LVs9;->G(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11, v5, v2}, LVp9;->s(ILjava/lang/Object;LVs9;)V

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->r(Ljava/lang/Object;J)Z

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->f(IZ)V

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->h(II)V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->k(IJ)V

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->o(II)V

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->B(IJ)V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->m(IJ)V

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->w(Ljava/lang/Object;J)F

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->j(IF)V

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {v0, v1, v11, v7}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, LVp9;->v(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->g(ID)V

    goto/16 :goto_2

    :pswitch_12
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2, v11, v5, v7}, LVp9;->k(LVs9;ILjava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_13
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lhr9;->o(ILjava/util/List;LVs9;Lbr9;)V

    goto/16 :goto_2

    :pswitch_14
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->v(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_15
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->u(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_16
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->t(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_17
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->s(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_18
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->k(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_19
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->x(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_1a
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->h(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_1b
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->l(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_1c
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->m(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_1d
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->p(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_1e
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->y(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_1f
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->q(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_20
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->n(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_21
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lhr9;->j(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_2

    :pswitch_22
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v11, 0x0

    invoke-static {v10, v5, v2, v11}, Lhr9;->v(ILjava/util/List;LVs9;Z)V

    goto :goto_3

    :pswitch_23
    const/4 v11, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lhr9;->u(ILjava/util/List;LVs9;Z)V

    goto :goto_3

    :pswitch_24
    const/4 v11, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lhr9;->t(ILjava/util/List;LVs9;Z)V

    goto :goto_3

    :pswitch_25
    const/4 v11, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lhr9;->s(ILjava/util/List;LVs9;Z)V

    goto :goto_3

    :pswitch_26
    const/4 v11, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lhr9;->k(ILjava/util/List;LVs9;Z)V

    goto :goto_3

    :pswitch_27
    const/4 v11, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lhr9;->x(ILjava/util/List;LVs9;Z)V

    :goto_3
    move v12, v11

    goto/16 :goto_4

    :pswitch_28
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lhr9;->i(ILjava/util/List;LVs9;)V

    goto/16 :goto_2

    :pswitch_29
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lhr9;->r(ILjava/util/List;LVs9;Lbr9;)V

    goto/16 :goto_2

    :pswitch_2a
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lhr9;->w(ILjava/util/List;LVs9;)V

    goto/16 :goto_2

    :pswitch_2b
    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v10, v5, v2, v12}, Lhr9;->h(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_2c
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->l(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_2d
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->m(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_2e
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->p(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_2f
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->y(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_30
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->q(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_31
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->n(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_32
    const/4 v12, 0x0

    iget-object v10, v0, LVp9;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lhr9;->j(ILjava/util/List;LVs9;Z)V

    goto/16 :goto_4

    :pswitch_33
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-interface {v2, v11, v5, v6}, LVs9;->I(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_4

    :pswitch_34
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->t(IJ)V

    goto/16 :goto_4

    :pswitch_35
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->u(II)V

    goto/16 :goto_4

    :pswitch_36
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->F(IJ)V

    goto/16 :goto_4

    :pswitch_37
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->D(II)V

    goto/16 :goto_4

    :pswitch_38
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->i(II)V

    goto/16 :goto_4

    :pswitch_39
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->w(II)V

    goto/16 :goto_4

    :pswitch_3a
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnh9;

    invoke-interface {v2, v11, v5}, LVs9;->J(ILnh9;)V

    goto/16 :goto_4

    :pswitch_3b
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, LVp9;->F(I)Lbr9;

    move-result-object v6

    invoke-interface {v2, v11, v5, v6}, LVs9;->G(ILjava/lang/Object;Lbr9;)V

    goto/16 :goto_4

    :pswitch_3c
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11, v5, v2}, LVp9;->s(ILjava/lang/Object;LVs9;)V

    goto/16 :goto_4

    :pswitch_3d
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->f(IZ)V

    goto :goto_4

    :pswitch_3e
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->h(II)V

    goto :goto_4

    :pswitch_3f
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->k(IJ)V

    goto :goto_4

    :pswitch_40
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->o(II)V

    goto :goto_4

    :pswitch_41
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->B(IJ)V

    goto :goto_4

    :pswitch_42
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->m(IJ)V

    goto :goto_4

    :pswitch_43
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, LFs9;->g(Ljava/lang/Object;J)F

    move-result v5

    invoke-interface {v2, v11, v5}, LVs9;->j(IF)V

    goto :goto_4

    :pswitch_44
    const/4 v12, 0x0

    and-int v10, v8, v13

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, LFs9;->f(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-interface {v2, v11, v5, v6}, LVs9;->g(ID)V

    :cond_3
    :goto_4
    add-int/lit8 v7, v7, 0x3

    const v5, 0xfffff

    goto/16 :goto_0

    :cond_4
    iget-object v3, v0, LVp9;->m:LNr9;

    invoke-virtual {v3, v1}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, LNr9;->p(Ljava/lang/Object;LVs9;)V

    return-void

    :cond_5
    iget-object v2, v0, LVp9;->n:Lyk9;

    invoke-virtual {v2, v1}, Lyk9;->a(Ljava/lang/Object;)LVk9;

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

.method public final k(LVs9;ILjava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "LVs9;",
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

    invoke-virtual {p0, p4}, LVp9;->H(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lvp9;

    invoke-virtual {p4}, Lvp9;->c()Ltp9;

    move-result-object p4

    check-cast p3, Lyp9;

    invoke-interface {p1, p2, p4, p3}, LVs9;->H(ILtp9;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final l(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p1, p3}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final n(Ljava/lang/Object;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p2}, LVp9;->A(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-virtual {p0, p2}, LVp9;->C(I)I

    move-result p2

    and-int v0, p2, v1

    int-to-long v0, v0

    invoke-static {p2}, LVp9;->B(I)I

    move-result p2

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lnh9;->c:Lnh9;

    invoke-static {p1, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lnh9;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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
    instance-of p2, p1, Lnh9;

    if-eqz p2, :cond_c

    sget-object p2, Lnh9;->c:Lnh9;

    invoke-virtual {p2, p1}, Lnh9;->equals(Ljava/lang/Object;)Z

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
    invoke-static {p1, v0, v1}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, LFs9;->g(Ljava/lang/Object;J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, LFs9;->f(Ljava/lang/Object;J)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmpl-double p1, p1, v0

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    invoke-static {p1, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

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

.method public final o(Ljava/lang/Object;IIII)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;IIII)Z"
        }
    .end annotation

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, LVp9;->n(Ljava/lang/Object;I)Z

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

.method public final q(Ljava/lang/Object;II)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, LVp9;->A(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, LFs9;->h(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final x(Ljava/lang/Object;)I
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    sget-object v0, LVp9;->r:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    const v2, 0xfffff

    move v3, v1

    move v4, v3

    move v5, v4

    move v6, v2

    :goto_0
    iget-object v7, p0, LVp9;->a:[I

    array-length v7, v7

    if-ge v3, v7, :cond_5

    invoke-virtual {p0, v3}, LVp9;->C(I)I

    move-result v7

    iget-object v8, p0, LVp9;->a:[I

    aget v8, v8, v3

    invoke-static {v7}, LVp9;->B(I)I

    move-result v9

    const/16 v10, 0x11

    const/4 v11, 0x1

    if-gt v9, v10, :cond_0

    iget-object v10, p0, LVp9;->a:[I

    add-int/lit8 v12, v3, 0x2

    aget v10, v10, v12

    and-int v12, v10, v2

    ushr-int/lit8 v10, v10, 0x14

    shl-int v10, v11, v10

    if-eq v12, v6, :cond_1

    int-to-long v5, v12

    invoke-virtual {v0, p1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move v6, v12

    goto :goto_1

    :cond_0
    move v10, v1

    :cond_1
    :goto_1
    and-int/2addr v7, v2

    int-to-long v12, v7

    const/16 v7, 0x3f

    packed-switch v9, :pswitch_data_0

    goto/16 :goto_b

    :pswitch_0
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LNp9;

    invoke-virtual {p0, v3}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lrj9;->c(ILNp9;Lbr9;)I

    move-result v7

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v9

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    add-long v11, v9, v9

    shr-long/2addr v9, v7

    xor-long/2addr v9, v11

    invoke-static {v9, v10}, Lrj9;->m(J)I

    move-result v7

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    add-int v9, v7, v7

    shr-int/lit8 v7, v7, 0x1f

    xor-int/2addr v7, v9

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_3
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_a

    :pswitch_4
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_9

    :pswitch_5
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->e(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_7
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnh9;

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-virtual {v7}, Lnh9;->c()I

    move-result v7

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_4

    :pswitch_8
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v3}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lhr9;->Q(ILjava/lang/Object;Lbr9;)I

    move-result v7

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Lnh9;

    if-eqz v9, :cond_2

    check-cast v7, Lnh9;

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-virtual {v7}, Lnh9;->c()I

    move-result v7

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_4

    :cond_2
    check-cast v7, Ljava/lang/String;

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->j(Ljava/lang/String;)I

    move-result v7

    goto/16 :goto_6

    :pswitch_a
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_5

    :pswitch_b
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_9

    :pswitch_c
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_a

    :pswitch_d
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->e(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_e
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v9

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    invoke-static {v9, v10}, Lrj9;->m(J)I

    move-result v8

    goto/16 :goto_8

    :pswitch_f
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {p1, v12, v13}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v9

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    invoke-static {v9, v10}, Lrj9;->m(J)I

    move-result v8

    goto/16 :goto_8

    :pswitch_10
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_9

    :pswitch_11
    invoke-virtual {p0, p1, v8, v3}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v7

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_a

    :pswitch_12
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v3}, LVp9;->H(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v7, v9}, LAp9;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {p0, v3}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lhr9;->L(ILjava/util/List;Lbr9;)I

    move-result v7

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->V(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_15
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->T(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_16
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->K(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_17
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->I(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_18
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->G(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_19
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->Y(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_1a
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->D(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_1b
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->I(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto/16 :goto_2

    :pswitch_1c
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->K(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto :goto_2

    :pswitch_1d
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->N(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto :goto_2

    :pswitch_1e
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->a0(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto :goto_2

    :pswitch_1f
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->P(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto :goto_2

    :pswitch_20
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->I(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto :goto_2

    :pswitch_21
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lhr9;->K(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-static {v8}, Lrj9;->k(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    :goto_2
    add-int/2addr v8, v9

    goto/16 :goto_6

    :pswitch_22
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->U(ILjava/util/List;Z)I

    move-result v7

    goto/16 :goto_3

    :pswitch_23
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->S(ILjava/util/List;Z)I

    move-result v7

    goto/16 :goto_3

    :pswitch_24
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->J(ILjava/util/List;Z)I

    move-result v7

    goto/16 :goto_3

    :pswitch_25
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->H(ILjava/util/List;Z)I

    move-result v7

    goto/16 :goto_3

    :pswitch_26
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->F(ILjava/util/List;Z)I

    move-result v7

    goto/16 :goto_3

    :pswitch_27
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->X(ILjava/util/List;Z)I

    move-result v7

    goto/16 :goto_3

    :pswitch_28
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7}, Lhr9;->E(ILjava/util/List;)I

    move-result v7

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {p0, v3}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lhr9;->R(ILjava/util/List;Lbr9;)I

    move-result v7

    goto :goto_3

    :pswitch_2a
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7}, Lhr9;->W(ILjava/util/List;)I

    move-result v7

    goto :goto_3

    :pswitch_2b
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->A(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_2c
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->H(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_2d
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->J(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_2e
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->M(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_2f
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->Z(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_30
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->O(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_31
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->H(ILjava/util/List;Z)I

    move-result v7

    goto :goto_3

    :pswitch_32
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v8, v7, v1}, Lhr9;->J(ILjava/util/List;Z)I

    move-result v7

    :goto_3
    add-int/2addr v4, v7

    goto/16 :goto_b

    :pswitch_33
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LNp9;

    invoke-virtual {p0, v3}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lrj9;->c(ILNp9;Lbr9;)I

    move-result v7

    goto :goto_3

    :pswitch_34
    and-int v9, v5, v10

    if-eqz v9, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v9

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    add-long v11, v9, v9

    shr-long/2addr v9, v7

    xor-long/2addr v9, v11

    invoke-static {v9, v10}, Lrj9;->m(J)I

    move-result v7

    goto/16 :goto_6

    :pswitch_35
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    add-int v9, v7, v7

    shr-int/lit8 v7, v7, 0x1f

    xor-int/2addr v7, v9

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_36
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_a

    :pswitch_37
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_9

    :pswitch_38
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->e(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_39
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_3a
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnh9;

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-virtual {v7}, Lnh9;->c()I

    move-result v7

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    :goto_4
    add-int/2addr v9, v7

    add-int/2addr v8, v9

    goto/16 :goto_7

    :pswitch_3b
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v3}, LVp9;->F(I)Lbr9;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lhr9;->Q(ILjava/lang/Object;Lbr9;)I

    move-result v7

    goto/16 :goto_3

    :pswitch_3c
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Lnh9;

    if-eqz v9, :cond_3

    check-cast v7, Lnh9;

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-virtual {v7}, Lnh9;->c()I

    move-result v7

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v9

    goto :goto_4

    :cond_3
    check-cast v7, Ljava/lang/String;

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->j(Ljava/lang/String;)I

    move-result v7

    goto :goto_6

    :pswitch_3d
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    :goto_5
    add-int/2addr v7, v11

    goto/16 :goto_3

    :pswitch_3e
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto :goto_9

    :pswitch_3f
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    goto :goto_a

    :pswitch_40
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    shl-int/lit8 v8, v8, 0x3

    invoke-static {v8}, Lrj9;->l(I)I

    move-result v8

    invoke-static {v7}, Lrj9;->e(I)I

    move-result v7

    :goto_6
    add-int/2addr v8, v7

    :goto_7
    add-int/2addr v4, v8

    goto :goto_b

    :pswitch_41
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v9

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    invoke-static {v9, v10}, Lrj9;->m(J)I

    move-result v8

    goto :goto_8

    :pswitch_42
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v9

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    invoke-static {v9, v10}, Lrj9;->m(J)I

    move-result v8

    :goto_8
    add-int/2addr v7, v8

    goto/16 :goto_3

    :pswitch_43
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    :goto_9
    add-int/lit8 v7, v7, 0x4

    goto/16 :goto_3

    :pswitch_44
    and-int v7, v5, v10

    if-eqz v7, :cond_4

    shl-int/lit8 v7, v8, 0x3

    invoke-static {v7}, Lrj9;->l(I)I

    move-result v7

    :goto_a
    add-int/lit8 v7, v7, 0x8

    goto/16 :goto_3

    :cond_4
    :goto_b
    add-int/lit8 v3, v3, 0x3

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-virtual {v0, p1}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LNr9;->a(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v4, v0

    iget-boolean v0, p0, LVp9;->f:Z

    if-nez v0, :cond_6

    return v4

    :cond_6
    iget-object v0, p0, LVp9;->n:Lyk9;

    invoke-virtual {v0, p1}, Lyk9;->a(Ljava/lang/Object;)LVk9;

    const/4 p1, 0x0

    throw p1

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

.method public final y(Ljava/lang/Object;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    sget-object v0, LVp9;->r:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    iget-object v4, p0, LVp9;->a:[I

    array-length v4, v4

    if-ge v2, v4, :cond_4

    invoke-virtual {p0, v2}, LVp9;->C(I)I

    move-result v4

    invoke-static {v4}, LVp9;->B(I)I

    move-result v5

    iget-object v6, p0, LVp9;->a:[I

    aget v6, v6, v2

    const v7, 0xfffff

    and-int/2addr v4, v7

    int-to-long v7, v4

    sget-object v4, Lbl9;->R:Lbl9;

    invoke-virtual {v4}, Lbl9;->zza()I

    move-result v4

    if-lt v5, v4, :cond_0

    sget-object v4, Lbl9;->u0:Lbl9;

    invoke-virtual {v4}, Lbl9;->zza()I

    move-result v4

    if-gt v5, v4, :cond_0

    iget-object v4, p0, LVp9;->a:[I

    add-int/lit8 v9, v2, 0x2

    aget v4, v4, v9

    :cond_0
    const/16 v4, 0x3f

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_a

    :pswitch_0
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LNp9;

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lrj9;->c(ILNp9;Lbr9;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v7

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    add-long v9, v7, v7

    shr-long v6, v7, v4

    xor-long/2addr v6, v9

    invoke-static {v6, v7}, Lrj9;->m(J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_2
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_4
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_5
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->e(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnh9;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-virtual {v4}, Lnh9;->c()I

    move-result v4

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lhr9;->Q(ILjava/lang/Object;Lbr9;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lnh9;

    if-eqz v5, :cond_1

    check-cast v4, Lnh9;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-virtual {v4}, Lnh9;->c()I

    move-result v4

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_3

    :cond_1
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->j(Ljava/lang/String;)I

    move-result v4

    goto/16 :goto_5

    :pswitch_a
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_c
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_d
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->e(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_e
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lrj9;->l(I)I

    move-result v6

    invoke-static {v4, v5}, Lrj9;->m(J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_f
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lrj9;->l(I)I

    move-result v6

    invoke-static {v4, v5}, Lrj9;->m(J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_10
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_11
    invoke-virtual {p0, p1, v6, v2}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_12
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LVp9;->H(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v4, v5}, LAp9;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_13
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lhr9;->L(ILjava/util/List;Lbr9;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_14
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->V(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_15
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->T(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_16
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_17
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_18
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->G(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_19
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->Y(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_1a
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_1b
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto/16 :goto_1

    :pswitch_1c
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto :goto_1

    :pswitch_1d
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->N(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto :goto_1

    :pswitch_1e
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->a0(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto :goto_1

    :pswitch_1f
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->P(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto :goto_1

    :pswitch_20
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto :goto_1

    :pswitch_21
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lhr9;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_3

    invoke-static {v6}, Lrj9;->k(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    :goto_1
    add-int/2addr v5, v6

    goto/16 :goto_5

    :pswitch_22
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->U(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_23
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->S(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_24
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->J(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_25
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->H(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_26
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->F(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_27
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->X(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_2

    :pswitch_28
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, Lhr9;->E(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_29
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lhr9;->R(ILjava/util/List;Lbr9;)I

    move-result v4

    goto :goto_2

    :pswitch_2a
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, Lhr9;->W(ILjava/util/List;)I

    move-result v4

    goto :goto_2

    :pswitch_2b
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->A(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2c
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2d
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->J(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2e
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->M(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_2f
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->Z(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_30
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->O(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_31
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_2

    :pswitch_32
    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lhr9;->J(ILjava/util/List;Z)I

    move-result v4

    :goto_2
    add-int/2addr v3, v4

    goto/16 :goto_a

    :pswitch_33
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LNp9;

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lrj9;->c(ILNp9;Lbr9;)I

    move-result v4

    goto :goto_2

    :pswitch_34
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v7

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    add-long v9, v7, v7

    shr-long v6, v7, v4

    xor-long/2addr v6, v9

    invoke-static {v6, v7}, Lrj9;->m(J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_35
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_36
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_9

    :pswitch_37
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_8

    :pswitch_38
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->e(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_39
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto/16 :goto_5

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnh9;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-virtual {v4}, Lnh9;->c()I

    move-result v4

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    :goto_3
    add-int/2addr v6, v4

    add-int/2addr v5, v6

    goto/16 :goto_6

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LVp9;->F(I)Lbr9;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lhr9;->Q(ILjava/lang/Object;Lbr9;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lnh9;

    if-eqz v5, :cond_2

    check-cast v4, Lnh9;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-virtual {v4}, Lnh9;->c()I

    move-result v4

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v6

    goto :goto_3

    :cond_2
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->j(Ljava/lang/String;)I

    move-result v4

    goto :goto_5

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto :goto_8

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    goto :goto_9

    :pswitch_40
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v4

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lrj9;->l(I)I

    move-result v5

    invoke-static {v4}, Lrj9;->e(I)I

    move-result v4

    :goto_5
    add-int/2addr v5, v4

    :goto_6
    add-int/2addr v3, v5

    goto :goto_a

    :pswitch_41
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lrj9;->l(I)I

    move-result v6

    invoke-static {v4, v5}, Lrj9;->m(J)I

    move-result v4

    goto :goto_7

    :pswitch_42
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, v7, v8}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lrj9;->l(I)I

    move-result v6

    invoke-static {v4, v5}, Lrj9;->m(J)I

    move-result v4

    :goto_7
    add-int/2addr v6, v4

    add-int/2addr v3, v6

    goto :goto_a

    :pswitch_43
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    :goto_8
    add-int/lit8 v4, v4, 0x4

    goto/16 :goto_2

    :pswitch_44
    invoke-virtual {p0, p1, v2}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_3

    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lrj9;->l(I)I

    move-result v4

    :goto_9
    add-int/lit8 v4, v4, 0x8

    goto/16 :goto_2

    :cond_3
    :goto_a
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-virtual {v0, p1}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, LNr9;->a(Ljava/lang/Object;)I

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

.method public final zza(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-boolean v0, p0, LVp9;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LVp9;->y(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LVp9;->x(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, LVp9;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, LVp9;->C(I)I

    move-result v3

    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    int-to-long v5, v5

    invoke-static {v3}, LVp9;->B(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->r(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, LFn9;->a(Z)I

    move-result v3

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->D(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->w(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LVp9;->v(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_14
    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_2

    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto/16 :goto_2

    :pswitch_1c
    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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

    invoke-static {p1, v5, v6}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2

    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, LFn9;->a(Z)I

    move-result v3

    goto :goto_2

    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_2

    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto :goto_2

    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_2

    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto :goto_2

    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    goto :goto_2

    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_2

    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, LFs9;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {v3, v4}, LFn9;->c(J)I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    :cond_1
    :goto_3
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-virtual {v0, p1}, LNr9;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, LVp9;->f:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, LVp9;->n:Lyk9;

    invoke-virtual {v0, p1}, Lyk9;->a(Ljava/lang/Object;)LVk9;

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

.method public final zzc()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LVp9;->e:LNp9;

    check-cast v0, LEm9;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LEm9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final zze(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LVp9;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, LVp9;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    int-to-long v2, v2

    iget-object v4, p0, LVp9;->a:[I

    aget v4, v4, v0

    invoke-static {v1}, LVp9;->B(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, LVp9;->f(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p2, v4, v0}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, LVp9;->f(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p2, v4, v0}, LVp9;->q(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, LVp9;->i(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_4
    iget-object v1, p0, LVp9;->p:LAp9;

    invoke-static {v1, p1, p2, v2, v3}, Lhr9;->B(LAp9;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_1

    :pswitch_5
    iget-object v1, p0, LVp9;->l:Lbp9;

    invoke-virtual {v1, p1, p2, v2, v3}, Lbp9;->c(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, LVp9;->J(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, LVp9;->J(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, LFs9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->B(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->r(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_12
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->v(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_15
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LFs9;->w(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_16
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->g(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v2, v3, v1}, LFs9;->u(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_17
    invoke-virtual {p0, p2, v0}, LVp9;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, LFs9;->f(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, LFs9;->t(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, v0}, LVp9;->h(Ljava/lang/Object;I)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, LVp9;->m:LNr9;

    invoke-static {v0, p1, p2}, Lhr9;->f(LNr9;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, LVp9;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LVp9;->n:Lyk9;

    invoke-static {v0, p1, p2}, Lhr9;->e(Lyk9;Ljava/lang/Object;Ljava/lang/Object;)V

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
