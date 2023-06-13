.class public final enum LcY0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LcY0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LcY0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:LcY0$a;

.field public static final enum g:LcY0$a;

.field public static final enum h:LcY0$a;

.field public static final enum i:LcY0$a;

.field public static final enum j:LcY0$a;

.field public static final enum k:LcY0$a;

.field public static final enum l:LcY0$a;

.field public static final enum m:LcY0$a;

.field public static final enum n:LcY0$a;

.field public static final enum o:LcY0$a;

.field public static final enum p:LcY0$a;

.field public static final synthetic q:[LcY0$a;


# instance fields
.field public final b:Z

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Number;

.field public final e:Ljava/lang/Number;


# direct methods
.method public static constructor <clinit>()V
    .locals 26

    new-instance v7, LcY0$a;

    const-string v1, "BYTE_BOXED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-class v4, Ljava/lang/Byte;

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    invoke-static/range {v17 .. v17}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v7, LcY0$a;->f:LcY0$a;

    new-instance v0, LcY0$a;

    const-string v10, "SHORT_BOXED"

    const/4 v11, 0x1

    const/4 v12, 0x1

    const-class v13, Ljava/lang/Short;

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v14

    invoke-static/range {v17 .. v17}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v15

    move-object v9, v0

    invoke-direct/range {v9 .. v15}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v0, LcY0$a;->g:LcY0$a;

    new-instance v1, LcY0$a;

    const-string v10, "INTEGER_BOXED"

    const/4 v11, 0x2

    const-class v13, Ljava/lang/Integer;

    move-object v9, v1

    move-object/from16 v14, v16

    move-object/from16 v15, v18

    invoke-direct/range {v9 .. v15}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v1, LcY0$a;->h:LcY0$a;

    new-instance v2, LcY0$a;

    const-string v10, "INTEGER_ATOMIC"

    const/4 v11, 0x3

    const-class v13, Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v2, LcY0$a;->i:LcY0$a;

    new-instance v3, LcY0$a;

    const-string v20, "LONG_BOXED"

    const/16 v21, 0x4

    const/16 v22, 0x1

    const-class v23, Ljava/lang/Long;

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v25

    move-object/from16 v19, v3

    move-object/from16 v24, v14

    invoke-direct/range {v19 .. v25}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v3, LcY0$a;->j:LcY0$a;

    new-instance v4, LcY0$a;

    const-string v10, "LONG_ATOMIC"

    const/4 v11, 0x5

    const-class v13, Ljava/util/concurrent/atomic/AtomicLong;

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v4, LcY0$a;->k:LcY0$a;

    new-instance v5, LcY0$a;

    const-string v20, "BIG_INTEGER"

    const/16 v21, 0x6

    const-class v23, Ljava/math/BigInteger;

    sget-object v24, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    sget-object v25, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    move-object/from16 v19, v5

    invoke-direct/range {v19 .. v25}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v5, LcY0$a;->l:LcY0$a;

    new-instance v6, LcY0$a;

    const-string v10, "RATIONAL"

    const/4 v11, 0x7

    const/4 v12, 0x0

    const-class v13, Lqn4;

    sget-object v14, Lqn4;->m:Lqn4;

    sget-object v15, Lqn4;->l:Lqn4;

    move-object v9, v6

    invoke-direct/range {v9 .. v15}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v6, LcY0$a;->m:LcY0$a;

    new-instance v9, LcY0$a;

    const-string v19, "FLOAT_BOXED"

    const/16 v20, 0x8

    const/16 v21, 0x0

    const-class v22, Ljava/lang/Float;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    move-object/from16 v18, v9

    invoke-direct/range {v18 .. v24}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v9, LcY0$a;->n:LcY0$a;

    new-instance v18, LcY0$a;

    const-string v11, "DOUBLE_BOXED"

    const/16 v12, 0x9

    const/4 v13, 0x0

    const-class v14, Ljava/lang/Double;

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    const-wide/16 v19, 0x0

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v16

    move-object/from16 v10, v18

    invoke-direct/range {v10 .. v16}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v18, LcY0$a;->o:LcY0$a;

    new-instance v10, LcY0$a;

    const-string v20, "BIG_DECIMAL"

    const/16 v21, 0xa

    const/16 v22, 0x0

    const-class v23, Ljava/math/BigDecimal;

    sget-object v24, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    sget-object v25, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    move-object/from16 v19, v10

    invoke-direct/range {v19 .. v25}, LcY0$a;-><init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V

    sput-object v10, LcY0$a;->p:LcY0$a;

    const/16 v11, 0xb

    new-array v11, v11, [LcY0$a;

    aput-object v7, v11, v17

    aput-object v0, v11, v8

    const/4 v0, 0x2

    aput-object v1, v11, v0

    const/4 v0, 0x3

    aput-object v2, v11, v0

    const/4 v0, 0x4

    aput-object v3, v11, v0

    const/4 v0, 0x5

    aput-object v4, v11, v0

    const/4 v0, 0x6

    aput-object v5, v11, v0

    const/4 v0, 0x7

    aput-object v6, v11, v0

    const/16 v0, 0x8

    aput-object v9, v11, v0

    const/16 v0, 0x9

    aput-object v18, v11, v0

    const/16 v0, 0xa

    aput-object v10, v11, v0

    sput-object v11, LcY0$a;->q:[LcY0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZLjava/lang/Class;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Number;",
            ">;",
            "Ljava/lang/Number;",
            "Ljava/lang/Number;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, LcY0$a;->b:Z

    iput-object p4, p0, LcY0$a;->c:Ljava/lang/Class;

    iput-object p5, p0, LcY0$a;->d:Ljava/lang/Number;

    iput-object p6, p0, LcY0$a;->e:Ljava/lang/Number;

    return-void
.end method

.method public static synthetic a(LcY0$a;)Ljava/lang/Number;
    .locals 0

    iget-object p0, p0, LcY0$a;->e:Ljava/lang/Number;

    return-object p0
.end method

.method public static synthetic b(LcY0$a;)Ljava/lang/Number;
    .locals 0

    iget-object p0, p0, LcY0$a;->d:Ljava/lang/Number;

    return-object p0
.end method

.method public static d(Ljava/lang/Number;)LcY0$a;
    .locals 2

    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    sget-object p0, LcY0$a;->j:LcY0$a;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz v0, :cond_1

    sget-object p0, LcY0$a;->k:LcY0$a;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    sget-object p0, LcY0$a;->h:LcY0$a;

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v0, :cond_3

    sget-object p0, LcY0$a;->i:LcY0$a;

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_4

    sget-object p0, LcY0$a;->o:LcY0$a;

    return-object p0

    :cond_4
    instance-of v0, p0, Ljava/lang/Short;

    if-eqz v0, :cond_5

    sget-object p0, LcY0$a;->g:LcY0$a;

    return-object p0

    :cond_5
    instance-of v0, p0, Ljava/lang/Byte;

    if-eqz v0, :cond_6

    sget-object p0, LcY0$a;->f:LcY0$a;

    return-object p0

    :cond_6
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_7

    sget-object p0, LcY0$a;->n:LcY0$a;

    return-object p0

    :cond_7
    instance-of v0, p0, Ljava/math/BigDecimal;

    if-eqz v0, :cond_8

    sget-object p0, LcY0$a;->p:LcY0$a;

    return-object p0

    :cond_8
    instance-of v0, p0, Ljava/math/BigInteger;

    if-eqz v0, :cond_9

    sget-object p0, LcY0$a;->l:LcY0$a;

    return-object p0

    :cond_9
    instance-of v0, p0, Lqn4;

    if-eqz v0, :cond_a

    sget-object p0, LcY0$a;->m:LcY0$a;

    return-object p0

    :cond_a
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "Unsupported number type \'%s\'"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)LcY0$a;
    .locals 1

    const-class v0, LcY0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LcY0$a;

    return-object p0
.end method

.method public static values()[LcY0$a;
    .locals 1

    sget-object v0, LcY0$a;->q:[LcY0$a;

    invoke-virtual {v0}, [LcY0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LcY0$a;

    return-object v0
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-boolean v0, p0, LcY0$a;->b:Z

    return v0
.end method
