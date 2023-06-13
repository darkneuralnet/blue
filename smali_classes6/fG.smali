.class public LfG;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static j:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:[Lv2;

.field public final c:Lq81;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, LeG;

    invoke-static {v0}, LAb6;->g(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LfG;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;[Lv2;Lq81;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Lv2;",
            "Lq81;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LfG;->h:Ljava/util/HashMap;

    const-class v0, Ljava/lang/NoSuchFieldException;

    iput-object v0, p0, LfG;->i:Ljava/lang/Class;

    iput-object p1, p0, LfG;->a:Ljava/lang/Class;

    iput-object p2, p0, LfG;->b:[Lv2;

    iput-object p3, p0, LfG;->c:Lq81;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LfG;->d:Ljava/lang/String;

    const-string p2, "java."

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    const-string p3, "AccAccess"

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "com.nimbusds.jose.shaded.asm."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LfG;->e:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LfG;->e:Ljava/lang/String;

    :goto_0
    iget-object p2, p0, LfG;->e:Ljava/lang/String;

    const/16 p3, 0x2e

    const/16 v0, 0x2f

    invoke-virtual {p2, p3, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LfG;->f:Ljava/lang/String;

    invoke-virtual {p1, p3, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LfG;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v4

    and-int/lit8 v4, v4, 0x8

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    goto :goto_1

    :cond_2
    aget-object v4, v4, v1

    const-class v5, Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    iget-object v5, p0, LfG;->h:Ljava/util/HashMap;

    invoke-virtual {v5, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public b(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0}, LfG;->a(Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()Ljava/lang/Class;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v8, LOj0;

    const/4 v9, 0x1

    invoke-direct {v8, v9}, LOj0;-><init>(I)V

    iget-object v1, v0, LfG;->b:[Lv2;

    array-length v1, v1

    const/16 v2, 0xa

    const/4 v10, 0x0

    if-le v1, v2, :cond_0

    move v11, v9

    goto :goto_0

    :cond_0
    move v11, v10

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Lnet/minidev/asm/BeansAccess<L"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";>;"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0x32

    const/16 v3, 0x21

    iget-object v4, v0, LfG;->f:Ljava/lang/String;

    sget-object v6, LfG;->j:Ljava/lang/String;

    const/4 v7, 0x0

    move-object v1, v8

    invoke-virtual/range {v1 .. v7}, LOj0;->a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/4 v2, 0x1

    const-string v3, "<init>"

    const-string v4, "()V"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, LOj0;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;

    move-result-object v1

    invoke-virtual {v1}, LYT2;->e()V

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v10}, LYT2;->E(II)V

    const/16 v13, 0xb7

    sget-object v14, LfG;->j:Ljava/lang/String;

    const-string v15, "<init>"

    const-string v16, "()V"

    const/16 v17, 0x0

    move-object v12, v1

    invoke-virtual/range {v12 .. v17}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v12, 0xb1

    invoke-virtual {v1, v12}, LYT2;->j(I)V

    invoke-virtual {v1, v9, v9}, LYT2;->u(II)V

    invoke-virtual {v1}, LYT2;->f()V

    const-string v3, "set"

    const-string v4, "(Ljava/lang/Object;ILjava/lang/Object;)V"

    move-object v1, v8

    invoke-virtual/range {v1 .. v6}, LOj0;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;

    move-result-object v1

    invoke-virtual {v1}, LYT2;->e()V

    iget-object v2, v0, LfG;->b:[Lv2;

    array-length v3, v2

    const/16 v6, 0x15

    const/4 v5, 0x2

    const/16 v4, 0xe

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    array-length v3, v2

    if-le v3, v4, :cond_4

    invoke-virtual {v1, v6, v5}, LYT2;->E(II)V

    iget-object v2, v0, LfG;->b:[Lv2;

    array-length v2, v2

    invoke-static {v2}, LA;->f(I)[LTl2;

    move-result-object v2

    new-instance v3, LTl2;

    invoke-direct {v3}, LTl2;-><init>()V

    array-length v13, v2

    sub-int/2addr v13, v9

    invoke-virtual {v1, v10, v13, v3, v2}, LYT2;->z(IILTl2;[LTl2;)V

    iget-object v13, v0, LfG;->b:[Lv2;

    array-length v14, v13

    move v15, v10

    move/from16 v16, v15

    :goto_1
    if-ge v15, v14, :cond_3

    aget-object v4, v13, v15

    add-int/lit8 v17, v16, 0x1

    aget-object v6, v2, v16

    invoke-virtual {v1, v6}, LYT2;->o(LTl2;)V

    invoke-virtual {v4}, Lv2;->h()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v1, v12}, LYT2;->j(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1, v4}, LfG;->e(LYT2;Lv2;)V

    :goto_2
    add-int/lit8 v15, v15, 0x1

    move/from16 v16, v17

    const/16 v4, 0xe

    const/16 v6, 0x15

    goto :goto_1

    :cond_3
    invoke-virtual {v1, v3}, LYT2;->o(LTl2;)V

    goto :goto_4

    :cond_4
    array-length v2, v2

    invoke-static {v2}, LA;->f(I)[LTl2;

    move-result-object v2

    iget-object v3, v0, LfG;->b:[Lv2;

    array-length v4, v3

    move v6, v10

    move v15, v6

    :goto_3
    if-ge v6, v4, :cond_5

    aget-object v13, v3, v6

    aget-object v14, v2, v15

    invoke-virtual {v0, v1, v5, v15, v14}, LfG;->d(LYT2;IILTl2;)V

    invoke-virtual {v0, v1, v13}, LfG;->e(LYT2;Lv2;)V

    aget-object v13, v2, v15

    invoke-virtual {v1, v13}, LYT2;->o(LTl2;)V

    const/4 v14, 0x3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    move-object v13, v1

    move/from16 v22, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v21

    invoke-virtual/range {v13 .. v18}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    add-int/lit8 v15, v22, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    iget-object v2, v0, LfG;->i:Ljava/lang/Class;

    if-eqz v2, :cond_6

    invoke-virtual {v0, v1, v2}, LfG;->f(LYT2;Ljava/lang/Class;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v1, v12}, LYT2;->j(I)V

    :goto_5
    invoke-virtual {v1, v10, v10}, LYT2;->u(II)V

    invoke-virtual {v1}, LYT2;->f()V

    const/4 v2, 0x1

    const-string v3, "get"

    const-string v4, "(Ljava/lang/Object;I)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/4 v13, 0x0

    move-object v1, v8

    const/16 v14, 0xe

    move v15, v5

    move-object v5, v6

    const/16 v12, 0x15

    move-object v6, v13

    invoke-virtual/range {v1 .. v6}, LOj0;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;

    move-result-object v1

    invoke-virtual {v1}, LYT2;->e()V

    iget-object v2, v0, LfG;->b:[Lv2;

    array-length v3, v2

    const/16 v13, 0xb4

    const/16 v6, 0xc0

    const/16 v5, 0xb0

    if-nez v3, :cond_7

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v22}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_7
    array-length v3, v2

    if-le v3, v14, :cond_c

    invoke-virtual {v1, v12, v15}, LYT2;->E(II)V

    iget-object v2, v0, LfG;->b:[Lv2;

    array-length v2, v2

    invoke-static {v2}, LA;->f(I)[LTl2;

    move-result-object v2

    new-instance v3, LTl2;

    invoke-direct {v3}, LTl2;-><init>()V

    array-length v4, v2

    sub-int/2addr v4, v9

    invoke-virtual {v1, v10, v4, v3, v2}, LYT2;->z(IILTl2;[LTl2;)V

    iget-object v4, v0, LfG;->b:[Lv2;

    array-length v12, v4

    move v14, v10

    move/from16 v17, v14

    :goto_6
    if-ge v14, v12, :cond_b

    aget-object v10, v4, v14

    add-int/lit8 v23, v17, 0x1

    aget-object v15, v2, v17

    invoke-virtual {v1, v15}, LYT2;->o(LTl2;)V

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v22}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v10}, Lv2;->f()Z

    move-result v15

    if-nez v15, :cond_8

    invoke-virtual {v1, v9}, LYT2;->j(I)V

    invoke-virtual {v1, v5}, LYT2;->j(I)V

    goto :goto_9

    :cond_8
    invoke-virtual {v1, v7, v9}, LYT2;->E(II)V

    iget-object v15, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v1, v6, v15}, LYT2;->D(ILjava/lang/String;)V

    invoke-virtual {v10}, Lv2;->c()Ljava/lang/Class;

    move-result-object v15

    invoke-static {v15}, LAb6;->m(Ljava/lang/Class;)LAb6;

    move-result-object v15

    invoke-virtual {v10}, Lv2;->e()Z

    move-result v17

    if-nez v17, :cond_a

    iget-object v6, v10, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez v6, :cond_9

    goto :goto_7

    :cond_9
    invoke-static {v6}, LAb6;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v21

    const/16 v18, 0xb6

    iget-object v6, v0, LfG;->g:Ljava/lang/String;

    iget-object v10, v10, Lv2;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x0

    move-object/from16 v17, v1

    move-object/from16 v19, v6

    invoke-virtual/range {v17 .. v22}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_8

    :cond_a
    :goto_7
    iget-object v6, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v10}, Lv2;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15}, LAb6;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v13, v6, v10, v7}, LYT2;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_8
    invoke-static {v1, v15}, LA;->a(LYT2;LAb6;)V

    invoke-virtual {v1, v5}, LYT2;->j(I)V

    :goto_9
    add-int/lit8 v14, v14, 0x1

    move/from16 v17, v23

    const/16 v6, 0xc0

    const/16 v7, 0x19

    const/4 v10, 0x0

    const/4 v15, 0x2

    goto :goto_6

    :cond_b
    invoke-virtual {v1, v3}, LYT2;->o(LTl2;)V

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v22}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_c
    array-length v2, v2

    invoke-static {v2}, LA;->f(I)[LTl2;

    move-result-object v2

    iget-object v3, v0, LfG;->b:[Lv2;

    array-length v4, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_a
    if-ge v6, v4, :cond_10

    aget-object v10, v3, v6

    aget-object v12, v2, v7

    const/4 v14, 0x2

    invoke-virtual {v0, v1, v14, v7, v12}, LfG;->d(LYT2;IILTl2;)V

    const/16 v12, 0x19

    invoke-virtual {v1, v12, v9}, LYT2;->E(II)V

    iget-object v12, v0, LfG;->g:Ljava/lang/String;

    const/16 v14, 0xc0

    invoke-virtual {v1, v14, v12}, LYT2;->D(ILjava/lang/String;)V

    invoke-virtual {v10}, Lv2;->c()Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12}, LAb6;->m(Ljava/lang/Class;)LAb6;

    move-result-object v12

    invoke-virtual {v10}, Lv2;->e()Z

    move-result v15

    if-nez v15, :cond_f

    iget-object v15, v10, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez v15, :cond_d

    goto :goto_b

    :cond_d
    if-eqz v15, :cond_e

    invoke-static {v15}, LAb6;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v21

    const/16 v18, 0xb6

    iget-object v15, v0, LfG;->g:Ljava/lang/String;

    iget-object v10, v10, Lv2;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x0

    move-object/from16 v17, v1

    move-object/from16 v19, v15

    invoke-virtual/range {v17 .. v22}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_c

    :cond_e
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "no Getter for field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lv2;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " in class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, LfG;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    :goto_b
    iget-object v15, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v10}, Lv2;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12}, LAb6;->d()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v13, v15, v10, v14}, LYT2;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_c
    invoke-static {v1, v12}, LA;->a(LYT2;LAb6;)V

    invoke-virtual {v1, v5}, LYT2;->j(I)V

    aget-object v10, v2, v7

    invoke-virtual {v1, v10}, LYT2;->o(LTl2;)V

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v22}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_a

    :cond_10
    :goto_d
    iget-object v2, v0, LfG;->i:Ljava/lang/Class;

    if-eqz v2, :cond_11

    invoke-virtual {v0, v1, v2}, LfG;->f(LYT2;Ljava/lang/Class;)V

    goto :goto_e

    :cond_11
    invoke-virtual {v1, v9}, LYT2;->j(I)V

    invoke-virtual {v1, v5}, LYT2;->j(I)V

    :goto_e
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, LYT2;->u(II)V

    invoke-virtual {v1}, LYT2;->f()V

    const/16 v7, 0x99

    if-nez v11, :cond_14

    const/4 v2, 0x1

    const-string v3, "set"

    const-string v4, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V"

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object v1, v8

    move v12, v5

    move-object v5, v6

    const/16 v14, 0xc0

    move-object v6, v10

    invoke-virtual/range {v1 .. v6}, LOj0;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;

    move-result-object v1

    invoke-virtual {v1}, LYT2;->e()V

    iget-object v2, v0, LfG;->b:[Lv2;

    array-length v2, v2

    invoke-static {v2}, LA;->f(I)[LTl2;

    move-result-object v2

    iget-object v3, v0, LfG;->b:[Lv2;

    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_f
    if-ge v5, v4, :cond_12

    aget-object v10, v3, v5

    const/4 v12, 0x2

    const/16 v15, 0x19

    invoke-virtual {v1, v15, v12}, LYT2;->E(II)V

    iget-object v12, v10, Lv2;->g:Ljava/lang/String;

    invoke-virtual {v1, v12}, LYT2;->p(Ljava/lang/Object;)V

    const/16 v18, 0xb6

    const-string v19, "java/lang/String"

    const-string v20, "equals"

    const-string v21, "(Ljava/lang/Object;)Z"

    const/16 v22, 0x0

    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v22}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    aget-object v12, v2, v6

    invoke-virtual {v1, v7, v12}, LYT2;->n(ILTl2;)V

    invoke-virtual {v0, v1, v10}, LfG;->e(LYT2;Lv2;)V

    aget-object v10, v2, v6

    invoke-virtual {v1, v10}, LYT2;->o(LTl2;)V

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-virtual/range {v17 .. v22}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    add-int/2addr v6, v9

    add-int/lit8 v5, v5, 0x1

    const/16 v12, 0xb0

    goto :goto_f

    :cond_12
    iget-object v2, v0, LfG;->i:Ljava/lang/Class;

    if-eqz v2, :cond_13

    invoke-virtual {v0, v1, v2}, LfG;->g(LYT2;Ljava/lang/Class;)V

    goto :goto_10

    :cond_13
    const/16 v2, 0xb1

    invoke-virtual {v1, v2}, LYT2;->j(I)V

    :goto_10
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, LYT2;->u(II)V

    invoke-virtual {v1}, LYT2;->f()V

    goto :goto_11

    :cond_14
    const/16 v14, 0xc0

    :goto_11
    if-nez v11, :cond_19

    const/4 v2, 0x1

    const-string v3, "get"

    const-string v4, "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v8

    invoke-virtual/range {v1 .. v6}, LOj0;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;

    move-result-object v1

    invoke-virtual {v1}, LYT2;->e()V

    iget-object v2, v0, LfG;->b:[Lv2;

    array-length v2, v2

    invoke-static {v2}, LA;->f(I)[LTl2;

    move-result-object v2

    iget-object v3, v0, LfG;->b:[Lv2;

    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_12
    if-ge v5, v4, :cond_17

    aget-object v10, v3, v5

    const/16 v11, 0x19

    const/4 v12, 0x2

    invoke-virtual {v1, v11, v12}, LYT2;->E(II)V

    iget-object v11, v10, Lv2;->g:Ljava/lang/String;

    invoke-virtual {v1, v11}, LYT2;->p(Ljava/lang/Object;)V

    const/16 v16, 0xb6

    const-string v17, "java/lang/String"

    const-string v18, "equals"

    const-string v19, "(Ljava/lang/Object;)Z"

    const/16 v20, 0x0

    move-object v15, v1

    invoke-virtual/range {v15 .. v20}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    aget-object v11, v2, v6

    invoke-virtual {v1, v7, v11}, LYT2;->n(ILTl2;)V

    const/16 v11, 0x19

    invoke-virtual {v1, v11, v9}, LYT2;->E(II)V

    iget-object v12, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v1, v14, v12}, LYT2;->D(ILjava/lang/String;)V

    invoke-virtual {v10}, Lv2;->c()Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12}, LAb6;->m(Ljava/lang/Class;)LAb6;

    move-result-object v12

    invoke-virtual {v10}, Lv2;->e()Z

    move-result v15

    if-nez v15, :cond_16

    iget-object v15, v10, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez v15, :cond_15

    goto :goto_13

    :cond_15
    invoke-static {v15}, LAb6;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v19

    const/16 v16, 0xb6

    iget-object v15, v0, LfG;->g:Ljava/lang/String;

    iget-object v10, v10, Lv2;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x0

    move-object v10, v15

    move-object v15, v1

    move-object/from16 v17, v10

    invoke-virtual/range {v15 .. v20}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_14

    :cond_16
    :goto_13
    iget-object v15, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v10}, Lv2;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12}, LAb6;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v13, v15, v10, v7}, LYT2;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_14
    invoke-static {v1, v12}, LA;->a(LYT2;LAb6;)V

    const/16 v7, 0xb0

    invoke-virtual {v1, v7}, LYT2;->j(I)V

    aget-object v7, v2, v6

    invoke-virtual {v1, v7}, LYT2;->o(LTl2;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v15, v1

    invoke-virtual/range {v15 .. v20}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v5, v5, 0x1

    const/16 v7, 0x99

    goto/16 :goto_12

    :cond_17
    iget-object v2, v0, LfG;->i:Ljava/lang/Class;

    if-eqz v2, :cond_18

    invoke-virtual {v0, v1, v2}, LfG;->g(LYT2;Ljava/lang/Class;)V

    goto :goto_15

    :cond_18
    invoke-virtual {v1, v9}, LYT2;->j(I)V

    const/16 v2, 0xb0

    invoke-virtual {v1, v2}, LYT2;->j(I)V

    :goto_15
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, LYT2;->u(II)V

    invoke-virtual {v1}, LYT2;->f()V

    :cond_19
    const/4 v2, 0x1

    const-string v3, "newInstance"

    const-string v4, "()Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v8

    invoke-virtual/range {v1 .. v6}, LOj0;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;

    move-result-object v1

    invoke-virtual {v1}, LYT2;->e()V

    const/16 v2, 0xbb

    iget-object v3, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, LYT2;->D(ILjava/lang/String;)V

    const/16 v2, 0x59

    invoke-virtual {v1, v2}, LYT2;->j(I)V

    const/16 v11, 0xb7

    iget-object v12, v0, LfG;->g:Ljava/lang/String;

    const-string v13, "<init>"

    const-string v14, "()V"

    const/4 v15, 0x0

    move-object v10, v1

    invoke-virtual/range {v10 .. v15}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v2, 0xb0

    invoke-virtual {v1, v2}, LYT2;->j(I)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v9}, LYT2;->u(II)V

    invoke-virtual {v1}, LYT2;->f()V

    invoke-virtual {v8}, LOj0;->d()V

    invoke-virtual {v8}, LOj0;->t()[B

    move-result-object v1

    iget-object v2, v0, LfG;->c:Lq81;

    iget-object v3, v0, LfG;->e:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lq81;->a(Ljava/lang/String;[B)Ljava/lang/Class;

    move-result-object v1

    return-object v1
.end method

.method public final d(LYT2;IILTl2;)V
    .locals 4

    const/16 v0, 0x15

    invoke-virtual {p1, v0, p2}, LYT2;->E(II)V

    if-nez p3, :cond_0

    const/16 p2, 0x9a

    invoke-virtual {p1, p2, p4}, LYT2;->n(ILTl2;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    const/4 v0, 0x4

    const/16 v1, 0xa0

    if-ne p3, p2, :cond_1

    invoke-virtual {p1, v0}, LYT2;->j(I)V

    invoke-virtual {p1, v1, p4}, LYT2;->n(ILTl2;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    const/4 v2, 0x5

    if-ne p3, p2, :cond_2

    invoke-virtual {p1, v2}, LYT2;->j(I)V

    invoke-virtual {p1, v1, p4}, LYT2;->n(ILTl2;)V

    goto :goto_0

    :cond_2
    const/4 p2, 0x3

    const/4 v3, 0x6

    if-ne p3, p2, :cond_3

    invoke-virtual {p1, v3}, LYT2;->j(I)V

    invoke-virtual {p1, v1, p4}, LYT2;->n(ILTl2;)V

    goto :goto_0

    :cond_3
    if-ne p3, v0, :cond_4

    const/4 p2, 0x7

    invoke-virtual {p1, p2}, LYT2;->j(I)V

    invoke-virtual {p1, v1, p4}, LYT2;->n(ILTl2;)V

    goto :goto_0

    :cond_4
    if-ne p3, v2, :cond_5

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, LYT2;->j(I)V

    invoke-virtual {p1, v1, p4}, LYT2;->n(ILTl2;)V

    goto :goto_0

    :cond_5
    if-lt p3, v3, :cond_6

    const/16 p2, 0x10

    invoke-virtual {p1, p2, p3}, LYT2;->l(II)V

    invoke-virtual {p1, v1, p4}, LYT2;->n(ILTl2;)V

    :goto_0
    return-void

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "non supported negative values"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(LYT2;Lv2;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    const/16 v9, 0x19

    const/4 v10, 0x1

    invoke-virtual {v7, v9, v10}, LYT2;->E(II)V

    iget-object v1, v0, LfG;->g:Ljava/lang/String;

    const/16 v11, 0xc0

    invoke-virtual {v7, v11, v1}, LYT2;->D(ILjava/lang/String;)V

    const/4 v12, 0x3

    invoke-virtual {v7, v9, v12}, LYT2;->E(II)V

    invoke-virtual/range {p2 .. p2}, Lv2;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LAb6;->m(Ljava/lang/Class;)LAb6;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, Lv2;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LAb6;->g(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    iget-object v2, v0, LfG;->h:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LAb6;->g(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, LAb6;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0xb8

    const/4 v6, 0x0

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lv2;->d()Z

    move-result v2

    const/16 v15, 0x3a

    const/16 v3, 0xc6

    if-eqz v2, :cond_1

    new-instance v6, LTl2;

    invoke-direct {v6}, LTl2;-><init>()V

    invoke-virtual {v7, v3, v6}, LYT2;->n(ILTl2;)V

    invoke-virtual {v7, v9, v12}, LYT2;->E(II)V

    const/16 v2, 0xb6

    const-string v3, "java/lang/Object"

    const-string v4, "toString"

    const-string v5, "()Ljava/lang/String;"

    const/16 v16, 0x0

    move-object/from16 v1, p1

    move-object v11, v6

    move/from16 v6, v16

    invoke-virtual/range {v1 .. v6}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v2, 0xb8

    const-string v4, "valueOf"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "(Ljava/lang/String;)L"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move-object v3, v14

    invoke-virtual/range {v1 .. v6}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v15, v12}, LYT2;->E(II)V

    invoke-virtual {v7, v11}, LYT2;->o(LTl2;)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v7, v9, v10}, LYT2;->E(II)V

    iget-object v1, v0, LfG;->g:Ljava/lang/String;

    const/16 v2, 0xc0

    invoke-virtual {v7, v2, v1}, LYT2;->D(ILjava/lang/String;)V

    invoke-virtual {v7, v9, v12}, LYT2;->E(II)V

    invoke-virtual {v7, v2, v14}, LYT2;->D(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const-class v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v11, LTl2;

    invoke-direct {v11}, LTl2;-><init>()V

    invoke-virtual {v7, v3, v11}, LYT2;->n(ILTl2;)V

    invoke-virtual {v7, v9, v12}, LYT2;->E(II)V

    const/16 v2, 0xb6

    const-string v3, "java/lang/Object"

    const-string v4, "toString"

    const-string v5, "()Ljava/lang/String;"

    const/4 v6, 0x0

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v15, v12}, LYT2;->E(II)V

    invoke-virtual {v7, v11}, LYT2;->o(LTl2;)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, LYT2;->h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v7, v9, v10}, LYT2;->E(II)V

    iget-object v1, v0, LfG;->g:Ljava/lang/String;

    const/16 v2, 0xc0

    invoke-virtual {v7, v2, v1}, LYT2;->D(ILjava/lang/String;)V

    invoke-virtual {v7, v9, v12}, LYT2;->E(II)V

    invoke-virtual {v7, v2, v14}, LYT2;->D(ILjava/lang/String;)V

    goto :goto_0

    :cond_2
    const/16 v2, 0xc0

    invoke-virtual {v7, v2, v14}, LYT2;->D(ILjava/lang/String;)V

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lv2;->e()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, v8, Lv2;->b:Ljava/lang/reflect/Method;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v1}, LAb6;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0xb6

    iget-object v3, v0, LfG;->g:Ljava/lang/String;

    iget-object v1, v8, Lv2;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v1, v0, LfG;->g:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lv2;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13}, LAb6;->d()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb5

    invoke-virtual {v7, v4, v1, v2, v3}, LYT2;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    const/16 v1, 0xb1

    invoke-virtual {v7, v1}, LYT2;->j(I)V

    return-void
.end method

.method public final f(LYT2;Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYT2;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-static {p2}, LAb6;->g(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    const/16 v0, 0xbb

    invoke-virtual {p1, v0, v6}, LYT2;->D(ILjava/lang/String;)V

    const/16 v0, 0x59

    invoke-virtual {p1, v0}, LYT2;->j(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mapping "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LfG;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " failed to map field:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LYT2;->p(Ljava/lang/Object;)V

    const/16 v0, 0x15

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, LYT2;->E(II)V

    const/16 v1, 0xb8

    const-string v2, "java/lang/Integer"

    const-string v3, "toString"

    const-string v4, "(I)Ljava/lang/String;"

    const/4 v5, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, 0xb6

    const-string v2, "java/lang/String"

    const-string v3, "concat"

    const-string v4, "(Ljava/lang/String;)Ljava/lang/String;"

    invoke-virtual/range {v0 .. v5}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, 0xb7

    const-string v3, "<init>"

    const-string v4, "(Ljava/lang/String;)V"

    move-object v2, v6

    invoke-virtual/range {v0 .. v5}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0xbf

    invoke-virtual {p1, v0}, LYT2;->j(I)V

    return-void
.end method

.method public final g(LYT2;Ljava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYT2;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-static {p2}, LAb6;->g(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const/16 p2, 0xbb

    invoke-virtual {p1, p2, v2}, LYT2;->D(ILjava/lang/String;)V

    const/16 p2, 0x59

    invoke-virtual {p1, p2}, LYT2;->j(I)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "mapping "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LfG;->d:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " failed to map field:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LYT2;->p(Ljava/lang/Object;)V

    const/16 p2, 0x19

    const/4 v0, 0x2

    invoke-virtual {p1, p2, v0}, LYT2;->E(II)V

    const/16 v4, 0xb6

    const-string v5, "java/lang/String"

    const-string v6, "concat"

    const-string v7, "(Ljava/lang/String;)Ljava/lang/String;"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, 0xb7

    const-string v3, "<init>"

    const-string v4, "(Ljava/lang/String;)V"

    const/4 v5, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, LYT2;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 p2, 0xbf

    invoke-virtual {p1, p2}, LYT2;->j(I)V

    return-void
.end method
