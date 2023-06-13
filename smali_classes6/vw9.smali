.class public final Lvw9;
.super Lyx9;
.source "SourceFile"


# instance fields
.field public final g:LY98;

.field public final synthetic h:LFf7;


# direct methods
.method public constructor <init>(LFf7;Ljava/lang/String;ILY98;)V
    .locals 0

    iput-object p1, p0, Lvw9;->h:LFf7;

    invoke-direct {p0, p2, p3}, Lyx9;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lvw9;->g:LY98;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lvw9;->g:LY98;

    invoke-virtual {v0}, LY98;->C()I

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lvw9;->g:LY98;

    invoke-virtual {v0}, LY98;->P()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;Lpk8;JLpv7;Z)Z
    .locals 15

    move-object v0, p0

    invoke-static {}, LBc9;->b()Z

    iget-object v1, v0, Lvw9;->h:LFf7;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    move-result-object v1

    iget-object v2, v0, Lyx9;->a:Ljava/lang/String;

    sget-object v3, La98;->a0:LL88;

    invoke-virtual {v1, v2, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v1

    iget-object v2, v0, Lvw9;->g:LY98;

    invoke-virtual {v2}, LY98;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object/from16 v2, p6

    iget-wide v2, v2, Lpv7;->e:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p4

    :goto_0
    iget-object v4, v0, Lvw9;->h:LFf7;

    iget-object v4, v4, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->D()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    iget-object v4, v0, Lvw9;->h:LFf7;

    iget-object v4, v4, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->s()Lec8;

    move-result-object v4

    iget v6, v0, Lyx9;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, v0, Lvw9;->g:LY98;

    invoke-virtual {v7}, LY98;->Q()Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, v0, Lvw9;->g:LY98;

    invoke-virtual {v7}, LY98;->C()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_1
    move-object v7, v5

    :goto_1
    iget-object v8, v0, Lvw9;->h:LFf7;

    iget-object v8, v8, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->D()Lqb8;

    move-result-object v8

    iget-object v9, v0, Lvw9;->g:LY98;

    invoke-virtual {v9}, LY98;->H()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Evaluating filter. audience, filter, event"

    invoke-virtual {v4, v9, v6, v7, v8}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v0, Lvw9;->h:LFf7;

    iget-object v4, v4, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->s()Lec8;

    move-result-object v4

    iget-object v6, v0, Lvw9;->h:LFf7;

    iget-object v6, v6, LIR8;->b:LhV8;

    invoke-virtual {v6}, LhV8;->g0()LDV8;

    move-result-object v6

    iget-object v7, v0, Lvw9;->g:LY98;

    invoke-virtual {v6, v7}, LDV8;->E(LY98;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Filter definition"

    invoke-virtual {v4, v7, v6}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    iget-object v4, v0, Lvw9;->g:LY98;

    invoke-virtual {v4}, LY98;->Q()Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_2c

    iget-object v4, v0, Lvw9;->g:LY98;

    invoke-virtual {v4}, LY98;->C()I

    move-result v4

    const/16 v7, 0x100

    if-le v4, v7, :cond_3

    goto/16 :goto_f

    :cond_3
    iget-object v4, v0, Lvw9;->g:LY98;

    invoke-virtual {v4}, LY98;->M()Z

    move-result v4

    iget-object v7, v0, Lvw9;->g:LY98;

    invoke-virtual {v7}, LY98;->N()Z

    move-result v7

    iget-object v8, v0, Lvw9;->g:LY98;

    invoke-virtual {v8}, LY98;->O()Z

    move-result v8

    const/4 v9, 0x1

    if-nez v4, :cond_5

    if-nez v7, :cond_5

    if-eqz v8, :cond_4

    goto :goto_2

    :cond_4
    move v4, v6

    goto :goto_3

    :cond_5
    :goto_2
    move v4, v9

    :goto_3
    if-eqz p7, :cond_7

    if-nez v4, :cond_7

    iget-object v1, v0, Lvw9;->h:LFf7;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    iget v2, v0, Lyx9;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v0, Lvw9;->g:LY98;

    invoke-virtual {v3}, LY98;->Q()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Lvw9;->g:LY98;

    invoke-virtual {v3}, LY98;->C()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_6
    const-string v3, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {v1, v3, v2, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v9

    :cond_7
    iget-object v7, v0, Lvw9;->g:LY98;

    invoke-virtual/range {p3 .. p3}, Lpk8;->I()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, LY98;->P()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {v7}, LY98;->G()LVb8;

    move-result-object v10

    invoke-static {v2, v3, v10}, Lyx9;->h(JLVb8;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_8

    goto/16 :goto_a

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_9

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_a

    :cond_9
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v7}, LY98;->I()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LDa8;

    invoke-virtual {v10}, LDa8;->F()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_a

    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "null or empty param name in filter. event"

    invoke-virtual {v2, v7, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_a
    invoke-virtual {v10}, LDa8;->F()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    new-instance v3, Lso;

    invoke-direct {v3}, Lso;-><init>()V

    invoke-virtual/range {p3 .. p3}, Lpk8;->J()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_c
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpl8;

    invoke-virtual {v11}, Lpl8;->H()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-virtual {v11}, Lpl8;->X()Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-virtual {v11}, Lpl8;->H()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lpl8;->X()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-virtual {v11}, Lpl8;->E()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    goto :goto_6

    :cond_d
    move-object v11, v5

    :goto_6
    invoke-interface {v3, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_e
    invoke-virtual {v11}, Lpl8;->V()Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-virtual {v11}, Lpl8;->H()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lpl8;->V()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-virtual {v11}, Lpl8;->B()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    goto :goto_7

    :cond_f
    move-object v11, v5

    :goto_7
    invoke-interface {v3, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_10
    invoke-virtual {v11}, Lpl8;->Z()Z

    move-result v12

    if-eqz v12, :cond_11

    invoke-virtual {v11}, Lpl8;->H()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lpl8;->I()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v3, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_11
    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lvw9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {v11}, Lpl8;->H()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Unknown value for param. event, param"

    invoke-virtual {v2, v8, v3, v7}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_12
    invoke-virtual {v7}, LY98;->I()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LDa8;

    invoke-virtual {v7}, LDa8;->I()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-virtual {v7}, LDa8;->H()Z

    move-result v10

    if-eqz v10, :cond_14

    move v10, v9

    goto :goto_8

    :cond_14
    move v10, v6

    :goto_8
    invoke-virtual {v7}, LDa8;->F()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_15

    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "Event has empty param name. event"

    invoke-virtual {v2, v7, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_15
    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ljava/lang/Long;

    if-eqz v13, :cond_18

    invoke-virtual {v7}, LDa8;->J()Z

    move-result v13

    if-nez v13, :cond_16

    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lvw9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {v7, v11}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for long param. event, param"

    invoke-virtual {v2, v8, v3, v7}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_16
    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v7}, LDa8;->D()LVb8;

    move-result-object v7

    invoke-static {v11, v12, v7}, Lyx9;->h(JLVb8;)Ljava/lang/Boolean;

    move-result-object v7

    if-nez v7, :cond_17

    goto/16 :goto_a

    :cond_17
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-ne v7, v10, :cond_13

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_a

    :cond_18
    instance-of v13, v12, Ljava/lang/Double;

    if-eqz v13, :cond_1b

    invoke-virtual {v7}, LDa8;->J()Z

    move-result v13

    if-nez v13, :cond_19

    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lvw9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {v7, v11}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for double param. event, param"

    invoke-virtual {v2, v8, v3, v7}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_19
    check-cast v12, Ljava/lang/Double;

    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    invoke-virtual {v7}, LDa8;->D()LVb8;

    move-result-object v7

    invoke-static {v11, v12, v7}, Lyx9;->g(DLVb8;)Ljava/lang/Boolean;

    move-result-object v7

    if-nez v7, :cond_1a

    goto/16 :goto_a

    :cond_1a
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-ne v7, v10, :cond_13

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_a

    :cond_1b
    instance-of v13, v12, Ljava/lang/String;

    if-eqz v13, :cond_20

    invoke-virtual {v7}, LDa8;->M()Z

    move-result v13

    if-eqz v13, :cond_1c

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v7}, LDa8;->E()LId8;

    move-result-object v7

    iget-object v11, v0, Lvw9;->h:LFf7;

    iget-object v11, v11, Lns8;->a:LPn8;

    invoke-virtual {v11}, LPn8;->a()LFc8;

    move-result-object v11

    invoke-static {v12, v7, v11}, Lyx9;->f(Ljava/lang/String;LId8;LFc8;)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_9

    :cond_1c
    invoke-virtual {v7}, LDa8;->J()Z

    move-result v13

    if-eqz v13, :cond_1f

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, LDV8;->N(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_1e

    invoke-virtual {v7}, LDa8;->D()LVb8;

    move-result-object v7

    invoke-static {v12, v7}, Lyx9;->i(Ljava/lang/String;LVb8;)Ljava/lang/Boolean;

    move-result-object v7

    :goto_9
    if-nez v7, :cond_1d

    goto/16 :goto_a

    :cond_1d
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-ne v7, v10, :cond_13

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_a

    :cond_1e
    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lvw9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {v7, v11}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Invalid param value for number filter. event, param"

    invoke-virtual {v2, v8, v3, v7}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1f
    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lvw9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {v7, v11}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No filter for String param. event, param"

    invoke-virtual {v2, v8, v3, v7}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_20
    if-nez v12, :cond_21

    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, Lvw9;->h:LFf7;

    iget-object v5, v5, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->D()Lqb8;

    move-result-object v5

    invoke-virtual {v5, v11}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "Missing param for filter. event, param"

    invoke-virtual {v2, v7, v3, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_21
    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    iget-object v3, v0, Lvw9;->h:LFf7;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v8}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lvw9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {v7, v11}, Lqb8;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Unknown param type. event, param"

    invoke-virtual {v2, v8, v3, v7}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_22
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_a
    iget-object v2, v0, Lvw9;->h:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    if-nez v5, :cond_23

    const-string v3, "null"

    goto :goto_b

    :cond_23
    move-object v3, v5

    :goto_b
    const-string v7, "Event filter result"

    invoke-virtual {v2, v7, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v5, :cond_24

    return v6

    :cond_24
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, v0, Lyx9;->c:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_25

    return v9

    :cond_25
    iput-object v2, v0, Lyx9;->d:Ljava/lang/Boolean;

    if-eqz v4, :cond_2b

    invoke-virtual/range {p3 .. p3}, Lpk8;->V()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-virtual/range {p3 .. p3}, Lpk8;->E()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, v0, Lvw9;->g:LY98;

    invoke-virtual {v3}, LY98;->N()Z

    move-result v3

    if-eqz v3, :cond_28

    if-eqz v1, :cond_27

    iget-object v1, v0, Lvw9;->g:LY98;

    invoke-virtual {v1}, LY98;->P()Z

    move-result v1

    if-nez v1, :cond_26

    goto :goto_c

    :cond_26
    move-object/from16 v2, p1

    :cond_27
    :goto_c
    iput-object v2, v0, Lyx9;->f:Ljava/lang/Long;

    goto :goto_e

    :cond_28
    if-eqz v1, :cond_2a

    iget-object v1, v0, Lvw9;->g:LY98;

    invoke-virtual {v1}, LY98;->P()Z

    move-result v1

    if-nez v1, :cond_29

    goto :goto_d

    :cond_29
    move-object/from16 v2, p2

    :cond_2a
    :goto_d
    iput-object v2, v0, Lyx9;->e:Ljava/lang/Long;

    :cond_2b
    :goto_e
    return v9

    :cond_2c
    :goto_f
    iget-object v1, v0, Lvw9;->h:LFf7;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->t()Lec8;

    move-result-object v1

    iget-object v2, v0, Lyx9;->a:Ljava/lang/String;

    invoke-static {v2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Lvw9;->g:LY98;

    invoke-virtual {v3}, LY98;->Q()Z

    move-result v3

    if-eqz v3, :cond_2d

    iget-object v3, v0, Lvw9;->g:LY98;

    invoke-virtual {v3}, LY98;->C()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_2d
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid event filter ID. appId, id"

    invoke-virtual {v1, v4, v2, v3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v6
.end method
