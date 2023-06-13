.class public LJG6$f;
.super Lbf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJG6;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbf1<",
        "LHG6;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LJG6;


# direct methods
.method public constructor <init>(LJG6;LEb5;)V
    .locals 0

    iput-object p1, p0, LJG6$f;->d:LJG6;

    invoke-direct {p0, p2}, Lbf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LHG6;

    invoke-virtual {p0, p1, p2}, LJG6$f;->m(LqV5;LHG6;)V

    return-void
.end method

.method public m(LqV5;LHG6;)V
    .locals 11

    iget-object v0, p2, LHG6;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, LPG6;->a:LPG6;

    iget-object v0, p2, LHG6;->b:LUC6$a;

    invoke-static {v0}, LPG6;->j(LUC6$a;)I

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    iget-object v0, p2, LHG6;->c:Ljava/lang/String;

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    iget-object v0, p2, LHG6;->d:Ljava/lang/String;

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p2, LHG6;->e:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->l(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->X0(I[B)V

    :goto_3
    iget-object v0, p2, LHG6;->f:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->l(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->X0(I[B)V

    :goto_4
    const/4 v0, 0x7

    iget-wide v1, p2, LHG6;->g:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    const/16 v0, 0x8

    iget-wide v1, p2, LHG6;->h:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    const/16 v0, 0x9

    iget-wide v1, p2, LHG6;->i:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    iget v0, p2, LHG6;->k:I

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    iget-object v0, p2, LHG6;->l:Lgw;

    invoke-static {v0}, LPG6;->a(Lgw;)I

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    const/16 v0, 0xc

    iget-wide v1, p2, LHG6;->m:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    const/16 v0, 0xd

    iget-wide v1, p2, LHG6;->n:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    const/16 v0, 0xe

    iget-wide v1, p2, LHG6;->o:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    const/16 v0, 0xf

    iget-wide v1, p2, LHG6;->p:J

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    iget-boolean v0, p2, LHG6;->q:Z

    const/16 v1, 0x10

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    iget-object v0, p2, LHG6;->r:LXy3;

    invoke-static {v0}, LPG6;->h(LXy3;)I

    move-result v0

    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, LHG6;->g()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, LHG6;->f()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    iget-object v0, p2, LHG6;->j:Llz0;

    const/16 v1, 0x1a

    const/16 v2, 0x19

    const/16 v3, 0x18

    const/16 v4, 0x17

    const/16 v5, 0x16

    const/16 v6, 0x15

    const/16 v7, 0x14

    const/16 v8, 0x1b

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Llz0;->d()LS73;

    move-result-object v9

    invoke-static {v9}, LPG6;->g(LS73;)I

    move-result v9

    int-to-long v9, v9

    invoke-interface {p1, v7, v9, v10}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->g()Z

    move-result v7

    int-to-long v9, v7

    invoke-interface {p1, v6, v9, v10}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->h()Z

    move-result v6

    int-to-long v6, v6

    invoke-interface {p1, v5, v6, v7}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->f()Z

    move-result v5

    int-to-long v5, v5

    invoke-interface {p1, v4, v5, v6}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->i()Z

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v3, v4, v5}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->b()J

    move-result-wide v3

    invoke-interface {p1, v2, v3, v4}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->a()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {v0}, Llz0;->c()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, LPG6;->i(Ljava/util/Set;)[B

    move-result-object v0

    if-nez v0, :cond_5

    invoke-interface {p1, v8}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v8, v0}, LoV5;->X0(I[B)V

    goto :goto_5

    :cond_6
    invoke-interface {p1, v7}, LoV5;->m1(I)V

    invoke-interface {p1, v6}, LoV5;->m1(I)V

    invoke-interface {p1, v5}, LoV5;->m1(I)V

    invoke-interface {p1, v4}, LoV5;->m1(I)V

    invoke-interface {p1, v3}, LoV5;->m1(I)V

    invoke-interface {p1, v2}, LoV5;->m1(I)V

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    invoke-interface {p1, v8}, LoV5;->m1(I)V

    :goto_5
    iget-object p2, p2, LHG6;->a:Ljava/lang/String;

    const/16 v0, 0x1c

    if-nez p2, :cond_7

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_6

    :cond_7
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    return-void
.end method
