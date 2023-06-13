.class public final Lda9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lda9;


# instance fields
.field public final a:Lpk9;

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lda9;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lda9;-><init>(Z)V

    sput-object v0, Lda9;->c:Lda9;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laj9;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Laj9;-><init>(I)V

    iput-object v0, p0, Lda9;->a:Lpk9;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    new-instance p1, Laj9;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Laj9;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda9;->a:Lpk9;

    invoke-virtual {p0}, Lda9;->h()V

    invoke-virtual {p0}, Lda9;->h()V

    return-void
.end method

.method public static a(LW99;Ljava/lang/Object;)I
    .locals 7

    invoke-interface {p0}, LW99;->zzb()Lfn9;

    move-result-object v0

    invoke-interface {p0}, LW99;->zza()I

    invoke-interface {p0}, LW99;->zze()Z

    invoke-interface {p0}, LW99;->zzd()Z

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const v2, 0xc0b2142

    invoke-static {v2}, LZ79;->c(I)I

    move-result v2

    sget-object v3, Lfn9;->l:Lfn9;

    if-ne v0, v3, :cond_0

    move-object v3, v1

    check-cast v3, Lpg9;

    invoke-static {v3}, Lkc9;->i(Lpg9;)Z

    add-int/2addr v2, v2

    :cond_0
    sget-object v3, Lln9;->c:Lln9;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x4

    const/16 v5, 0x8

    packed-switch v3, :pswitch_data_0

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    add-long v5, v3, v3

    const/16 v1, 0x3f

    shr-long/2addr v3, v1

    xor-long/2addr v3, v5

    invoke-static {v3, v4}, LZ79;->e(J)I

    move-result v4

    goto/16 :goto_2

    :pswitch_1
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int v3, v1, v1

    shr-int/lit8 v1, v1, 0x1f

    xor-int/2addr v1, v3

    invoke-static {v1}, LZ79;->d(I)I

    move-result v4

    goto/16 :goto_2

    :pswitch_2
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    goto/16 :goto_1

    :pswitch_3
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    goto/16 :goto_2

    :pswitch_4
    instance-of v3, v1, LIb9;

    if-eqz v3, :cond_1

    check-cast v1, LIb9;

    invoke-interface {v1}, LIb9;->zza()I

    move-result v1

    invoke-static {v1}, LZ79;->E(I)I

    move-result v4

    goto/16 :goto_2

    :cond_1
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, LZ79;->E(I)I

    move-result v4

    goto/16 :goto_2

    :pswitch_5
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, LZ79;->d(I)I

    move-result v4

    goto/16 :goto_2

    :pswitch_6
    instance-of v3, v1, LT69;

    if-eqz v3, :cond_2

    check-cast v1, LT69;

    invoke-static {v1}, LZ79;->B(LT69;)I

    move-result v4

    goto/16 :goto_2

    :cond_2
    check-cast v1, [B

    invoke-static {v1}, LZ79;->A([B)I

    move-result v4

    goto/16 :goto_2

    :pswitch_7
    instance-of v3, v1, LKc9;

    if-eqz v3, :cond_3

    check-cast v1, LKc9;

    invoke-static {v1}, LZ79;->F(LRc9;)I

    move-result v4

    goto :goto_2

    :cond_3
    check-cast v1, Lpg9;

    invoke-static {v1}, LZ79;->G(Lpg9;)I

    move-result v4

    goto :goto_2

    :pswitch_8
    check-cast v1, Lpg9;

    invoke-static {v1}, LZ79;->D(Lpg9;)I

    move-result v4

    goto :goto_2

    :pswitch_9
    instance-of v3, v1, LT69;

    if-eqz v3, :cond_4

    check-cast v1, LT69;

    invoke-static {v1}, LZ79;->B(LT69;)I

    move-result v4

    goto :goto_2

    :cond_4
    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LZ79;->b(Ljava/lang/String;)I

    move-result v4

    goto :goto_2

    :pswitch_a
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    const/4 v4, 0x1

    goto :goto_2

    :pswitch_b
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    goto :goto_2

    :pswitch_c
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    goto :goto_1

    :pswitch_d
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, LZ79;->E(I)I

    move-result v4

    goto :goto_2

    :pswitch_e
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, LZ79;->e(J)I

    move-result v4

    goto :goto_2

    :pswitch_f
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, LZ79;->e(J)I

    move-result v4

    goto :goto_2

    :pswitch_10
    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    goto :goto_2

    :pswitch_11
    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    :goto_1
    move v4, v5

    :goto_2
    add-int/2addr v2, v4

    add-int/2addr p1, v2

    goto/16 :goto_0

    :cond_5
    return p1

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

.method public static d()Lda9;
    .locals 1

    sget-object v0, Lda9;->c:Lda9;

    return-object v0
.end method

.method public static n(Ljava/util/Map$Entry;)Z
    .locals 3

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW99;

    invoke-interface {v0}, LW99;->zzc()Lln9;

    move-result-object v1

    sget-object v2, Lln9;->k:Lln9;

    if-ne v1, v2, :cond_3

    invoke-interface {v0}, LW99;->zze()Z

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lwg9;

    if-eqz v1, :cond_1

    check-cast v0, Lwg9;

    invoke-interface {v0}, Lwg9;->zzv()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    instance-of v0, v0, LKc9;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong object type used with protocol message reflection."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static final o(Ljava/util/Map$Entry;)I
    .locals 3

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW99;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0}, LW99;->zzc()Lln9;

    move-result-object v1

    sget-object v2, Lln9;->k:Lln9;

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, LW99;->zze()Z

    :cond_0
    invoke-static {v0, p0}, Lda9;->a(LW99;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final p(LW99;Ljava/lang/Object;)V
    .locals 4

    invoke-interface {p0}, LW99;->zzb()Lfn9;

    move-result-object v0

    invoke-static {p1}, Lkc9;->e(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lfn9;->c:Lfn9;

    sget-object v1, Lln9;->c:Lln9;

    invoke-virtual {v0}, Lfn9;->a()Lln9;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    instance-of v0, p1, Lpg9;

    if-nez v0, :cond_0

    instance-of v0, p1, LKc9;

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    instance-of v0, p1, LIb9;

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_2
    instance-of v0, p1, LT69;

    if-nez v0, :cond_0

    instance-of v0, p1, [B

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_3
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_0

    :pswitch_5
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_0

    :pswitch_6
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_0

    :pswitch_7
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_0

    :pswitch_8
    instance-of v0, p1, Ljava/lang/Integer;

    :goto_0
    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    :goto_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p0}, LW99;->zza()I

    const v2, 0xc0b2142

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, LW99;->zzb()Lfn9;

    move-result-object p0

    invoke-virtual {p0}, Lfn9;->a()Lln9;

    move-result-object p0

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v1, p1

    const-string p0, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final b()I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lda9;->a:Lpk9;

    invoke-virtual {v2}, Lpk9;->b()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lda9;->a:Lpk9;

    invoke-virtual {v2, v0}, Lpk9;->g(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lda9;->o(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lda9;->a:Lpk9;

    invoke-virtual {v0}, Lpk9;->c()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lda9;->o(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    return v1
.end method

.method public final c()Lda9;
    .locals 4

    new-instance v0, Lda9;

    invoke-direct {v0}, Lda9;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lda9;->a:Lpk9;

    invoke-virtual {v2}, Lpk9;->b()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lda9;->a:Lpk9;

    invoke-virtual {v2, v1}, Lpk9;->g(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LW99;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lda9;->j(LW99;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lda9;->a:Lpk9;

    invoke-virtual {v1}, Lpk9;->c()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LW99;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lda9;->j(LW99;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lda9;->c()Lda9;

    move-result-object v0

    return-object v0
.end method

.method public final e(LW99;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lda9;->a:Lpk9;

    invoke-virtual {v0, p1}, Lpk9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LKc9;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, LKc9;

    const/4 p1, 0x0

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lda9;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lda9;

    iget-object v0, p0, Lda9;->a:Lpk9;

    iget-object p1, p1, Lda9;->a:Lpk9;

    invoke-virtual {v0, p1}, Lpk9;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lda9;->a:Lpk9;

    invoke-virtual {v0}, Lpk9;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final g(LW99;Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1, p2}, Lda9;->p(LW99;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lda9;->e(LW99;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lda9;->a:Lpk9;

    invoke-virtual {v1, p1, v0}, Lpk9;->e(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    check-cast v0, Ljava/util/List;

    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, Lda9;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lda9;->a:Lpk9;

    invoke-virtual {v0}, Lpk9;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lda9;->b:Z

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lda9;->a:Lpk9;

    invoke-virtual {v0}, Lpk9;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i(Lda9;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lda9;->a:Lpk9;

    invoke-virtual {v1}, Lpk9;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p1, Lda9;->a:Lpk9;

    invoke-virtual {v1, v0}, Lpk9;->g(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-virtual {p0, v1}, Lda9;->m(Ljava/util/Map$Entry;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lda9;->a:Lpk9;

    invoke-virtual {p1}, Lpk9;->c()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lda9;->m(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final j(LW99;Ljava/lang/Object;)V
    .locals 3

    invoke-interface {p1}, LW99;->zze()Z

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2}, Lda9;->p(LW99;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lda9;->a:Lpk9;

    invoke-virtual {p2, p1, v0}, Lpk9;->e(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lda9;->b:Z

    return v0
.end method

.method public final l()Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lda9;->a:Lpk9;

    invoke-virtual {v2}, Lpk9;->b()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lda9;->a:Lpk9;

    invoke-virtual {v2, v1}, Lpk9;->g(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lda9;->n(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lda9;->a:Lpk9;

    invoke-virtual {v1}, Lpk9;->c()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lda9;->n(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final m(Ljava/util/Map$Entry;)V
    .locals 7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW99;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LKc9;

    if-nez v1, :cond_4

    invoke-interface {v0}, LW99;->zze()Z

    invoke-virtual {p0, v0}, Lda9;->e(LW99;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    instance-of v4, v2, Lbh9;

    if-eqz v4, :cond_1

    check-cast v2, Lbh9;

    invoke-interface {v2}, Lbh9;->zzc()Lbh9;

    move-result-object v2

    goto :goto_1

    :cond_1
    instance-of v4, v2, [B

    if-eqz v4, :cond_2

    check-cast v2, [B

    array-length v4, v2

    new-array v5, v4, [B

    const/4 v6, 0x0

    invoke-static {v2, v6, v5, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v2, v5

    :cond_2
    :goto_1
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lda9;->a:Lpk9;

    invoke-virtual {p1, v0, v1}, Lpk9;->e(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    check-cast p1, LKc9;

    const/4 p1, 0x0

    throw p1
.end method
