.class public abstract LbB5;
.super Lv1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LbB5$b;,
        LbB5$c;,
        LbB5$d;
    }
.end annotation


# static fields
.field public static final a:[LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LSd6<",
            "*>;"
        }
    .end annotation
.end field

.field public static final b:[Ljava/lang/String;

.field public static final c:[Lae6;

.field public static final d:[Ljava/lang/String;

.field public static final e:[Lae6;

.field public static final f:LbB5$c;

.field public static final g:LbB5$b;

.field public static final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LSd6<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x1b

    new-array v0, v0, [LSd6;

    sget-object v1, Lie6;->e:LSd6;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lie6;->E:LSd6;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lie6;->f:LSd6;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v1, 0x3

    sget-object v5, Lie6;->t:LSd6;

    aput-object v5, v0, v1

    const/4 v1, 0x4

    sget-object v5, Lie6;->v:LSd6;

    aput-object v5, v0, v1

    const/4 v1, 0x5

    sget-object v5, Lie6;->F:LSd6;

    aput-object v5, v0, v1

    const/4 v1, 0x6

    sget-object v5, Lie6;->A:LSd6;

    aput-object v5, v0, v1

    const/4 v1, 0x7

    sget-object v5, Lie6;->o:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x8

    sget-object v5, Lie6;->r:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x9

    sget-object v5, Lie6;->H:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0xa

    sget-object v5, Lie6;->g:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0xb

    sget-object v5, Lie6;->C:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0xc

    sget-object v5, Lie6;->D:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0xd

    sget-object v5, Lie6;->i:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0xe

    sget-object v5, Lie6;->j:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0xf

    sget-object v5, Lie6;->p:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x10

    sget-object v5, Lie6;->w:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x11

    sget-object v5, Lie6;->q:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x12

    sget-object v5, Lie6;->m:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x13

    sget-object v5, Lie6;->k:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x14

    sget-object v5, Lie6;->x:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x15

    sget-object v5, Lie6;->G:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x16

    sget-object v5, Lie6;->n:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x17

    sget-object v5, Lie6;->z:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x18

    sget-object v5, Lie6;->u:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x19

    sget-object v5, Lie6;->s:LSd6;

    aput-object v5, v0, v1

    const/16 v1, 0x1a

    sget-object v5, Lie6;->y:LSd6;

    aput-object v5, v0, v1

    sput-object v0, LbB5;->a:[LSd6;

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v0

    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, LXA5;

    invoke-direct {v1}, LXA5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-array v1, v2, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, LbB5;->b:[Ljava/lang/String;

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v0

    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, LYA5;

    invoke-direct {v1}, LYA5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-array v1, v2, [Lae6;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lae6;

    sput-object v0, LbB5;->c:[Lae6;

    invoke-static {}, LUG;->values()[LUG;

    move-result-object v0

    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, LZA5;

    invoke-direct {v1}, LZA5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-array v1, v2, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, LbB5;->d:[Ljava/lang/String;

    invoke-static {}, LUG;->values()[LUG;

    move-result-object v0

    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, LaB5;

    invoke-direct {v1}, LaB5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-array v1, v2, [Lae6;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lae6;

    sput-object v0, LbB5;->e:[Lae6;

    new-instance v0, LbB5$c;

    invoke-direct {v0}, LbB5$c;-><init>()V

    sput-object v0, LbB5;->f:LbB5$c;

    new-instance v0, LbB5$b;

    invoke-direct {v0}, LbB5$b;-><init>()V

    sput-object v0, LbB5;->g:LbB5$b;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LbB5;->h:Ljava/util/Map;

    move v0, v2

    :goto_0
    sget-object v1, LbB5;->a:[LSd6;

    array-length v5, v1

    if-ge v0, v5, :cond_4

    aget-object v1, v1, v0

    instance-of v5, v1, LyE;

    if-eqz v5, :cond_0

    move-object v5, v1

    check-cast v5, LyE;

    goto :goto_1

    :cond_0
    move-object v5, v1

    check-cast v5, LV9;

    :goto_1
    invoke-virtual {v5}, Lu1;->a()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LbB5;->f:LbB5$c;

    invoke-virtual {v6, v1, v5}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-static {v5}, LbB5;->m(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v6, LbB5;->g:LbB5$b;

    invoke-virtual {v6, v1, v5}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    :cond_1
    move v6, v2

    :goto_2
    sget-object v7, LbB5;->b:[Ljava/lang/String;

    array-length v8, v7

    if-ge v6, v8, :cond_3

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v8

    aget-object v8, v8, v6

    invoke-interface {v1, v8}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v8

    sget-object v9, LbB5;->f:LbB5$c;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v11, v7, v6

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    const-string v10, "\u00b5"

    aget-object v7, v7, v6

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "\u03bc"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v8, v7}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v7, LbB5;->g:LbB5$b;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "micro"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, LbB5;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_4
    sget-object v0, LbB5;->g:LbB5$b;

    sget-object v1, Lie6;->l:LSd6;

    const-string v5, "g"

    invoke-virtual {v0, v1, v5}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v0, LbB5;->f:LbB5$c;

    invoke-virtual {v0, v1, v5}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v0

    array-length v1, v0

    move v6, v2

    :goto_3
    if-ge v6, v1, :cond_7

    aget-object v7, v0, v6

    sget-object v8, LbB5$a;->c:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    if-eq v8, v3, :cond_6

    if-eq v8, v4, :cond_5

    sget-object v8, LbB5;->g:LbB5$b;

    sget-object v9, Lie6;->l:LSd6;

    invoke-interface {v9, v7}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, LaU2;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v10, v11}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v8, LbB5;->f:LbB5$c;

    invoke-interface {v9, v7}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, LaU2;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v9, v7}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    sget-object v8, LbB5;->f:LbB5$c;

    sget-object v9, Lie6;->l:LSd6;

    invoke-interface {v9, v7}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, LaU2;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v9, v7}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v7, LbB5;->g:LbB5$b;

    sget-object v8, Lie6;->U:LSd6;

    invoke-static {v8}, LaU2;->c(LSd6;)LSd6;

    move-result-object v8

    const-string v9, "microg"

    invoke-virtual {v7, v8, v9}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    sget-object v7, LbB5;->f:LbB5$c;

    sget-object v8, Lie6;->h:LSd6;

    const-string v9, "kg"

    invoke-virtual {v7, v8, v9}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v7, LbB5;->g:LbB5$b;

    invoke-virtual {v7, v8, v9}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_3

    :cond_7
    sget-object v0, LbB5;->f:LbB5$c;

    sget-object v1, Lie6;->l:LSd6;

    invoke-static {v1}, LaU2;->c(LSd6;)LSd6;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, LaU2;->q:LaU2;

    invoke-virtual {v6}, LaU2;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v3, LbB5;->h:Ljava/util/Map;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, LaU2;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, LaU2;->c(LSd6;)LSd6;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, LaU2;->c(LSd6;)LSd6;

    move-result-object v4

    const-string v5, "\u03bcg"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, LaU2;->c(LSd6;)LSd6;

    move-result-object v1

    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lie6;->w:LSd6;

    const-string v3, "Ohm"

    invoke-virtual {v0, v1, v3}, LbB5$c;->o(LSd6;Ljava/lang/String;)V

    sget-object v0, LbB5;->g:LbB5$b;

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    move v0, v2

    :goto_5
    sget-object v1, LbB5;->b:[Ljava/lang/String;

    array-length v4, v1

    if-ge v0, v4, :cond_8

    sget-object v4, LbB5;->f:LbB5$c;

    sget-object v5, Lie6;->w:LSd6;

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v6

    aget-object v6, v6, v0

    invoke-interface {v5, v6}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v8, v1, v0

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, LbB5$c;->o(LSd6;Ljava/lang/String;)V

    sget-object v4, LbB5;->g:LbB5$b;

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v6

    aget-object v6, v6, v0

    invoke-interface {v5, v6}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v1, v1, v0

    invoke-static {v1}, LbB5;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_8
    sget-object v0, LbB5;->f:LbB5$c;

    sget-object v1, Lie6;->B:LSd6;

    const-string v3, "\u2103"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    const-string v4, "\u00b0C"

    invoke-virtual {v0, v1, v4}, LbB5$c;->o(LSd6;Ljava/lang/String;)V

    sget-object v0, LbB5;->g:LbB5$b;

    const-string v5, "Celsius"

    invoke-virtual {v0, v1, v5}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    move v0, v2

    :goto_6
    sget-object v1, LbB5;->b:[Ljava/lang/String;

    array-length v6, v1

    if-ge v0, v6, :cond_9

    sget-object v6, LbB5;->f:LbB5$c;

    sget-object v7, Lie6;->B:LSd6;

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v8

    aget-object v8, v8, v0

    invoke-interface {v7, v8}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v10, v1, v0

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v8

    aget-object v8, v8, v0

    invoke-interface {v7, v8}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v10, v1, v0

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, LbB5$c;->o(LSd6;Ljava/lang/String;)V

    sget-object v6, LbB5;->g:LbB5$b;

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v8

    aget-object v8, v8, v0

    invoke-interface {v7, v8}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v1, v1, v0

    invoke-static {v1}, LbB5;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v7, v1}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_9
    sget-object v0, LbB5;->f:LbB5$c;

    sget-object v1, Lie6;->N:LSd6;

    const-string v3, "%"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->i:LSd6;

    const-string v3, "m"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v4, LbB5;->g:LbB5$b;

    invoke-virtual {v4, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->k:LSd6;

    const-string v3, "s"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-virtual {v4, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->O:LSd6;

    const-string v3, "min"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->P:LSd6;

    const-string v3, "h"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->Q:LSd6;

    const-string v3, "day"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    const-string v3, "d"

    invoke-virtual {v0, v1, v3}, LbB5$c;->o(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->R:LSd6;

    const-string v3, "week"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->S:LSd6;

    const-string v3, "year"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    const-string v3, "days365"

    invoke-virtual {v0, v1, v3}, LbB5$c;->o(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->M:LSd6;

    const-string v3, "km/h"

    invoke-virtual {v4, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->L:LSd6;

    const-string v3, "\u33a5"

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    const-string v3, "m3"

    invoke-virtual {v4, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->U:LSd6;

    const-string v3, "l"

    invoke-virtual {v4, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-static {}, LaU2;->values()[LaU2;

    move-result-object v0

    array-length v1, v0

    :goto_7
    if-ge v2, v1, :cond_b

    aget-object v4, v0, v2

    sget-object v5, LaU2;->q:LaU2;

    if-ne v4, v5, :cond_a

    sget-object v5, LbB5;->g:LbB5$b;

    sget-object v6, Lie6;->U:LSd6;

    invoke-static {v6}, LaU2;->c(LSd6;)LSd6;

    move-result-object v6

    const-string v7, "microL"

    invoke-virtual {v5, v6, v7}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    goto :goto_8

    :cond_a
    sget-object v5, LbB5;->g:LbB5$b;

    sget-object v6, Lie6;->U:LSd6;

    invoke-interface {v6, v4}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4}, LWZ3;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "L"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    :goto_8
    sget-object v5, LbB5;->f:LbB5$c;

    sget-object v6, Lie6;->U:LSd6;

    invoke-interface {v6, v4}, LSd6;->e(LWZ3;)LSd6;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4}, LWZ3;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_b
    sget-object v0, LbB5;->f:LbB5$c;

    sget-object v1, Lie6;->p:LSd6;

    const-string v2, "N"

    invoke-virtual {v0, v1, v2}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v3, LbB5;->g:LbB5$b;

    invoke-virtual {v3, v1, v2}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lie6;->m:LSd6;

    const-string v2, "rad"

    invoke-virtual {v0, v1, v2}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    sget-object v1, Lu1;->d:LSd6;

    const-string v2, "one"

    invoke-virtual {v0, v1, v2}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, LbB5$c;->n(LSd6;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv1;-><init>()V

    return-void
.end method

.method public static synthetic d()[Lae6;
    .locals 1

    sget-object v0, LbB5;->c:[Lae6;

    return-object v0
.end method

.method public static synthetic e()[Ljava/lang/String;
    .locals 1

    sget-object v0, LbB5;->b:[Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic f()[Lae6;
    .locals 1

    sget-object v0, LbB5;->e:[Lae6;

    return-object v0
.end method

.method public static synthetic g()[Ljava/lang/String;
    .locals 1

    sget-object v0, LbB5;->d:[Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic h()LbB5$c;
    .locals 1

    sget-object v0, LbB5;->f:LbB5$c;

    return-object v0
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "\u00b5"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "micro"

    :cond_0
    return-object p0
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "\u03a9"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Ohm"

    :cond_0
    return-object p0
.end method

.method public static k()LbB5;
    .locals 1

    sget-object v0, LbB5$d;->b:LbB5$d;

    invoke-static {v0}, LbB5;->l(LbB5$d;)LbB5;

    move-result-object v0

    return-object v0
.end method

.method public static l(LbB5$d;)LbB5;
    .locals 1

    sget-object v0, LbB5$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    sget-object p0, LbB5;->f:LbB5$c;

    return-object p0

    :cond_0
    sget-object p0, LbB5;->g:LbB5$b;

    return-object p0
.end method

.method public static m(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7f

    if-le v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public abstract n(LSd6;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method
