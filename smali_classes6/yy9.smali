.class public final Lyy9;
.super Lyx9;
.source "SourceFile"


# instance fields
.field public final g:Lvc8;

.field public final synthetic h:LFf7;


# direct methods
.method public constructor <init>(LFf7;Ljava/lang/String;ILvc8;)V
    .locals 0

    iput-object p1, p0, Lyy9;->h:LFf7;

    invoke-direct {p0, p2, p3}, Lyx9;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lyy9;->g:Lvc8;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lyy9;->g:Lvc8;

    invoke-virtual {v0}, Lvc8;->B()I

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;LKp8;Z)Z
    .locals 10

    invoke-static {}, LBc9;->b()Z

    iget-object v0, p0, Lyy9;->h:LFf7;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    iget-object v1, p0, Lyx9;->a:Ljava/lang/String;

    sget-object v2, La98;->Y:LL88;

    invoke-virtual {v0, v1, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    iget-object v1, p0, Lyy9;->g:Lvc8;

    invoke-virtual {v1}, Lvc8;->H()Z

    move-result v1

    iget-object v2, p0, Lyy9;->g:Lvc8;

    invoke-virtual {v2}, Lvc8;->I()Z

    move-result v2

    iget-object v3, p0, Lyy9;->g:Lvc8;

    invoke-virtual {v3}, Lvc8;->J()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v5

    :goto_1
    const/4 v2, 0x0

    if-eqz p4, :cond_3

    if-nez v1, :cond_3

    iget-object p1, p0, Lyy9;->h:LFf7;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    iget p2, p0, Lyx9;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p3, p0, Lyy9;->g:Lvc8;

    invoke-virtual {p3}, Lvc8;->K()Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lyy9;->g:Lvc8;

    invoke-virtual {p3}, Lvc8;->B()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_2
    const-string p3, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {p1, p3, p2, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v5

    :cond_3
    iget-object v6, p0, Lyy9;->g:Lvc8;

    invoke-virtual {v6}, Lvc8;->C()LDa8;

    move-result-object v6

    invoke-virtual {v6}, LDa8;->H()Z

    move-result v7

    invoke-virtual {p3}, LKp8;->S()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v6}, LDa8;->J()Z

    move-result v8

    if-nez v8, :cond_4

    iget-object v6, p0, Lyy9;->h:LFf7;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    iget-object v7, p0, Lyy9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {p3}, LKp8;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for long property. property"

    invoke-virtual {v6, v8, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_4
    invoke-virtual {p3}, LKp8;->C()J

    move-result-wide v8

    invoke-virtual {v6}, LDa8;->D()LVb8;

    move-result-object v2

    invoke-static {v8, v9, v2}, Lyx9;->h(JLVb8;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v7}, Lyx9;->j(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_2

    :cond_5
    invoke-virtual {p3}, LKp8;->R()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {v6}, LDa8;->J()Z

    move-result v8

    if-nez v8, :cond_6

    iget-object v6, p0, Lyy9;->h:LFf7;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    iget-object v7, p0, Lyy9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {p3}, LKp8;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for double property. property"

    invoke-virtual {v6, v8, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p3}, LKp8;->B()D

    move-result-wide v8

    invoke-virtual {v6}, LDa8;->D()LVb8;

    move-result-object v2

    invoke-static {v8, v9, v2}, Lyx9;->g(DLVb8;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v7}, Lyx9;->j(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_2

    :cond_7
    invoke-virtual {p3}, LKp8;->U()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v6}, LDa8;->M()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v6}, LDa8;->J()Z

    move-result v8

    if-nez v8, :cond_8

    iget-object v6, p0, Lyy9;->h:LFf7;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    iget-object v7, p0, Lyy9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {p3}, LKp8;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No string or number filter defined. property"

    invoke-virtual {v6, v8, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_8
    invoke-virtual {p3}, LKp8;->H()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LDV8;->N(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {p3}, LKp8;->H()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, LDa8;->D()LVb8;

    move-result-object v6

    invoke-static {v2, v6}, Lyx9;->i(Ljava/lang/String;LVb8;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v7}, Lyx9;->j(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_2

    :cond_9
    iget-object v6, p0, Lyy9;->h:LFf7;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    iget-object v7, p0, Lyy9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {p3}, LKp8;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p3}, LKp8;->H()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Invalid user property value for Numeric number filter. property, value"

    invoke-virtual {v6, v9, v7, v8}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_a
    invoke-virtual {p3}, LKp8;->H()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, LDa8;->E()LId8;

    move-result-object v6

    iget-object v8, p0, Lyy9;->h:LFf7;

    iget-object v8, v8, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->a()LFc8;

    move-result-object v8

    invoke-static {v2, v6, v8}, Lyx9;->f(Ljava/lang/String;LId8;LFc8;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v7}, Lyx9;->j(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_2

    :cond_b
    iget-object v6, p0, Lyy9;->h:LFf7;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    iget-object v7, p0, Lyy9;->h:LFf7;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->D()Lqb8;

    move-result-object v7

    invoke-virtual {p3}, LKp8;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "User property has no value, property"

    invoke-virtual {v6, v8, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    iget-object v6, p0, Lyy9;->h:LFf7;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->s()Lec8;

    move-result-object v6

    if-nez v2, :cond_c

    const-string v7, "null"

    goto :goto_3

    :cond_c
    move-object v7, v2

    :goto_3
    const-string v8, "Property filter result"

    invoke-virtual {v6, v8, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v2, :cond_d

    return v4

    :cond_d
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v4, p0, Lyx9;->c:Ljava/lang/Boolean;

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_4

    :cond_e
    return v5

    :cond_f
    :goto_4
    if-eqz p4, :cond_10

    iget-object p4, p0, Lyy9;->g:Lvc8;

    invoke-virtual {p4}, Lvc8;->H()Z

    move-result p4

    if-eqz p4, :cond_11

    :cond_10
    iput-object v2, p0, Lyx9;->d:Ljava/lang/Boolean;

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_15

    if-eqz v1, :cond_15

    invoke-virtual {p3}, LKp8;->T()Z

    move-result p4

    if-eqz p4, :cond_15

    invoke-virtual {p3}, LKp8;->D()J

    move-result-wide p3

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_12
    if-eqz v0, :cond_13

    iget-object p1, p0, Lyy9;->g:Lvc8;

    invoke-virtual {p1}, Lvc8;->H()Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lyy9;->g:Lvc8;

    invoke-virtual {p1}, Lvc8;->I()Z

    move-result p1

    if-nez p1, :cond_13

    if-eqz p2, :cond_13

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_13
    iget-object p1, p0, Lyy9;->g:Lvc8;

    invoke-virtual {p1}, Lvc8;->I()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lyx9;->f:Ljava/lang/Long;

    goto :goto_5

    :cond_14
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lyx9;->e:Ljava/lang/Long;

    :cond_15
    :goto_5
    return v5
.end method
