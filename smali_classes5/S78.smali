.class public final LS78;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public C:Ljava/lang/reflect/Field;

.field public D:Ljava/lang/Object;

.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public final a:Li88;

.field public final b:[Ljava/lang/Object;

.field public c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:[I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, LS78;->q:I

    const/high16 v0, -0x80000000

    iput v0, p0, LS78;->r:I

    const/4 v0, 0x0

    iput v0, p0, LS78;->s:I

    iput v0, p0, LS78;->t:I

    iput v0, p0, LS78;->u:I

    iput v0, p0, LS78;->v:I

    iput v0, p0, LS78;->w:I

    iput-object p1, p0, LS78;->c:Ljava/lang/Class;

    new-instance p1, Li88;

    invoke-direct {p1, p2}, Li88;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LS78;->a:Li88;

    iput-object p3, p0, LS78;->b:[Ljava/lang/Object;

    invoke-virtual {p1}, Li88;->b()I

    move-result p2

    iput p2, p0, LS78;->d:I

    invoke-virtual {p1}, Li88;->b()I

    move-result p2

    iput p2, p0, LS78;->e:I

    const/4 p3, 0x0

    if-nez p2, :cond_0

    iput v0, p0, LS78;->f:I

    iput v0, p0, LS78;->g:I

    iput v0, p0, LS78;->h:I

    iput v0, p0, LS78;->i:I

    iput v0, p0, LS78;->j:I

    iput v0, p0, LS78;->l:I

    iput v0, p0, LS78;->k:I

    iput v0, p0, LS78;->m:I

    iput-object p3, p0, LS78;->n:[I

    return-void

    :cond_0
    invoke-virtual {p1}, Li88;->b()I

    move-result p2

    iput p2, p0, LS78;->f:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v0

    iput v0, p0, LS78;->g:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v1

    iput v1, p0, LS78;->h:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v1

    iput v1, p0, LS78;->i:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v1

    iput v1, p0, LS78;->l:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v1

    iput v1, p0, LS78;->k:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v1

    iput v1, p0, LS78;->j:I

    invoke-virtual {p1}, Li88;->b()I

    move-result v1

    iput v1, p0, LS78;->m:I

    invoke-virtual {p1}, Li88;->b()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-array p3, p1, [I

    :goto_0
    iput-object p3, p0, LS78;->n:[I

    shl-int/lit8 p1, p2, 0x1

    add-int/2addr p1, v0

    iput p1, p0, LS78;->o:I

    return-void
.end method

.method public static synthetic A(LS78;)I
    .locals 0

    iget p0, p0, LS78;->k:I

    return p0
.end method

.method public static synthetic b(LS78;)I
    .locals 0

    iget p0, p0, LS78;->d:I

    return p0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
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

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x28

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Field "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic d(LS78;)I
    .locals 0

    iget p0, p0, LS78;->h:I

    return p0
.end method

.method public static synthetic e(LS78;)I
    .locals 0

    iget p0, p0, LS78;->i:I

    return p0
.end method

.method public static synthetic j(LS78;)I
    .locals 0

    iget p0, p0, LS78;->e:I

    return p0
.end method

.method public static synthetic w(LS78;)I
    .locals 0

    iget p0, p0, LS78;->j:I

    return p0
.end method

.method public static synthetic x(LS78;)I
    .locals 0

    iget p0, p0, LS78;->m:I

    return p0
.end method

.method public static synthetic y(LS78;)[I
    .locals 0

    iget-object p0, p0, LS78;->n:[I

    return-object p0
.end method

.method public static synthetic z(LS78;)I
    .locals 0

    iget p0, p0, LS78;->l:I

    return p0
.end method


# virtual methods
.method public final a()Z
    .locals 6

    iget-object v0, p0, LS78;->a:Li88;

    invoke-virtual {v0}, Li88;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LS78;->a:Li88;

    invoke-virtual {v0}, Li88;->b()I

    move-result v0

    iput v0, p0, LS78;->x:I

    iget-object v0, p0, LS78;->a:Li88;

    invoke-virtual {v0}, Li88;->b()I

    move-result v0

    iput v0, p0, LS78;->y:I

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, LS78;->z:I

    iget v2, p0, LS78;->x:I

    iget v3, p0, LS78;->q:I

    if-ge v2, v3, :cond_1

    iput v2, p0, LS78;->q:I

    :cond_1
    iget v3, p0, LS78;->r:I

    if-le v2, v3, :cond_2

    iput v2, p0, LS78;->r:I

    :cond_2
    sget-object v2, LXQ7;->y0:LXQ7;

    invoke-virtual {v2}, LXQ7;->a()I

    move-result v3

    const/4 v4, 0x1

    if-ne v0, v3, :cond_3

    iget v0, p0, LS78;->s:I

    add-int/2addr v0, v4

    iput v0, p0, LS78;->s:I

    goto :goto_0

    :cond_3
    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->y:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-lt v0, v3, :cond_4

    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->x0:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-gt v0, v3, :cond_4

    iget v0, p0, LS78;->t:I

    add-int/2addr v0, v4

    iput v0, p0, LS78;->t:I

    :cond_4
    :goto_0
    iget v0, p0, LS78;->w:I

    add-int/2addr v0, v4

    iput v0, p0, LS78;->w:I

    iget v3, p0, LS78;->q:I

    iget v5, p0, LS78;->x:I

    invoke-static {v3, v5, v0}, Lc98;->s(III)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, LS78;->x:I

    add-int/2addr v0, v4

    iput v0, p0, LS78;->v:I

    iget v3, p0, LS78;->q:I

    sub-int/2addr v0, v3

    goto :goto_1

    :cond_5
    iget v0, p0, LS78;->u:I

    add-int/2addr v0, v4

    :goto_1
    iput v0, p0, LS78;->u:I

    iget v0, p0, LS78;->y:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    move v0, v4

    goto :goto_2

    :cond_6
    move v0, v1

    :goto_2
    if-eqz v0, :cond_7

    iget-object v0, p0, LS78;->n:[I

    iget v3, p0, LS78;->p:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, LS78;->p:I

    iget v5, p0, LS78;->x:I

    aput v5, v0, v3

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, LS78;->D:Ljava/lang/Object;

    iput-object v0, p0, LS78;->E:Ljava/lang/Object;

    iput-object v0, p0, LS78;->F:Ljava/lang/Object;

    invoke-virtual {p0}, LS78;->k()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, LS78;->a:Li88;

    invoke-virtual {v0}, Li88;->b()I

    move-result v0

    iput v0, p0, LS78;->A:I

    iget v0, p0, LS78;->z:I

    sget-object v1, LXQ7;->p:LXQ7;

    invoke-virtual {v1}, LXQ7;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-eq v0, v1, :cond_9

    iget v0, p0, LS78;->z:I

    sget-object v1, LXQ7;->x:LXQ7;

    invoke-virtual {v1}, LXQ7;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-ne v0, v1, :cond_8

    goto :goto_4

    :cond_8
    iget v0, p0, LS78;->z:I

    sget-object v1, LXQ7;->s:LXQ7;

    invoke-virtual {v1}, LXQ7;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-ne v0, v1, :cond_12

    invoke-virtual {p0}, LS78;->i()Z

    move-result v0

    if-eqz v0, :cond_12

    :goto_3
    invoke-virtual {p0}, LS78;->f()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LS78;->E:Ljava/lang/Object;

    goto/16 :goto_9

    :cond_9
    :goto_4
    invoke-virtual {p0}, LS78;->f()Ljava/lang/Object;

    move-result-object v0

    :goto_5
    iput-object v0, p0, LS78;->D:Ljava/lang/Object;

    goto/16 :goto_9

    :cond_a
    iget-object v0, p0, LS78;->c:Ljava/lang/Class;

    invoke-virtual {p0}, LS78;->f()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v0, v3}, LS78;->c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, LS78;->C:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, LS78;->o()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, LS78;->a:Li88;

    invoke-virtual {v0}, Li88;->b()I

    move-result v0

    iput v0, p0, LS78;->B:I

    :cond_b
    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->p:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-eq v0, v3, :cond_11

    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->x:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-ne v0, v3, :cond_c

    goto :goto_8

    :cond_c
    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->H:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-eq v0, v3, :cond_9

    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->x0:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-ne v0, v3, :cond_d

    goto :goto_4

    :cond_d
    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->s:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-eq v0, v3, :cond_10

    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->K:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-eq v0, v3, :cond_10

    iget v0, p0, LS78;->z:I

    sget-object v3, LXQ7;->s0:LXQ7;

    invoke-virtual {v3}, LXQ7;->a()I

    move-result v3

    if-ne v0, v3, :cond_e

    goto :goto_6

    :cond_e
    iget v0, p0, LS78;->z:I

    invoke-virtual {v2}, LXQ7;->a()I

    move-result v2

    if-ne v0, v2, :cond_12

    invoke-virtual {p0}, LS78;->f()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LS78;->F:Ljava/lang/Object;

    iget v0, p0, LS78;->y:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_f

    move v1, v4

    :cond_f
    if-eqz v1, :cond_12

    goto :goto_7

    :cond_10
    :goto_6
    invoke-virtual {p0}, LS78;->i()Z

    move-result v0

    if-eqz v0, :cond_12

    :goto_7
    goto/16 :goto_3

    :cond_11
    :goto_8
    iget-object v0, p0, LS78;->C:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_5

    :cond_12
    :goto_9
    return v4
.end method

.method public final f()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LS78;->b:[Ljava/lang/Object;

    iget v1, p0, LS78;->o:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LS78;->o:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LS78;->x:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LS78;->z:I

    return v0
.end method

.method public final i()Z
    .locals 2

    iget v0, p0, LS78;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 2

    iget v0, p0, LS78;->z:I

    sget-object v1, LXQ7;->y0:LXQ7;

    invoke-virtual {v1}, LXQ7;->a()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, LS78;->A:I

    shl-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LS78;->b:[Ljava/lang/Object;

    aget-object v1, v1, v0

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    return-object v1

    :cond_0
    iget-object v2, p0, LS78;->c:Ljava/lang/Class;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, LS78;->c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iget-object v2, p0, LS78;->b:[Ljava/lang/Object;

    aput-object v1, v2, v0

    return-object v1
.end method

.method public final m()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, LS78;->A:I

    shl-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LS78;->b:[Ljava/lang/Object;

    aget-object v1, v1, v0

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    return-object v1

    :cond_0
    iget-object v2, p0, LS78;->c:Ljava/lang/Class;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, LS78;->c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iget-object v2, p0, LS78;->b:[Ljava/lang/Object;

    aput-object v1, v2, v0

    return-object v1
.end method

.method public final n()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, LS78;->C:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final o()Z
    .locals 2

    invoke-virtual {p0}, LS78;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LS78;->z:I

    sget-object v1, LXQ7;->x:LXQ7;

    invoke-virtual {v1}, LXQ7;->a()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, LS78;->f:I

    shl-int/lit8 v0, v0, 0x1

    iget v1, p0, LS78;->B:I

    div-int/lit8 v1, v1, 0x20

    add-int/2addr v0, v1

    iget-object v1, p0, LS78;->b:[Ljava/lang/Object;

    aget-object v1, v1, v0

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    return-object v1

    :cond_0
    iget-object v2, p0, LS78;->c:Ljava/lang/Class;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, LS78;->c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iget-object v2, p0, LS78;->b:[Ljava/lang/Object;

    aput-object v1, v2, v0

    return-object v1
.end method

.method public final q()I
    .locals 1

    iget v0, p0, LS78;->B:I

    rem-int/lit8 v0, v0, 0x20

    return v0
.end method

.method public final r()Z
    .locals 1

    iget v0, p0, LS78;->y:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final s()Z
    .locals 1

    iget v0, p0, LS78;->y:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final t()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS78;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS78;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final v()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS78;->F:Ljava/lang/Object;

    return-object v0
.end method
