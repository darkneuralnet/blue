.class public final Lwk2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwk2;->a(Lkotlin/jvm/functions/Function1;)Lvk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0007"
    }
    d2 = {
        "wk2$a",
        "Lvk2;",
        "Lik2;",
        "event",
        "Lek2;",
        "a",
        "(Landroid/view/KeyEvent;)Lek2;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lik2;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lik2;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwk2$a;->a:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)Lek2;
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwk2$a;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lik2;->a(Landroid/view/KeyEvent;)Lik2;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lmk2;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LZL2;->a:LZL2;

    invoke-virtual {p1}, LZL2;->x()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, Lek2;->q0:Lek2;

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lwk2$a;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lik2;->a(Landroid/view/KeyEvent;)Lik2;

    move-result-object v2

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LZL2;->a:LZL2;

    invoke-virtual {p1}, LZL2;->d()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LZL2;->n()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_2

    sget-object v1, Lek2;->s:Lek2;

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, LZL2;->u()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v1, Lek2;->t:Lek2;

    goto/16 :goto_1

    :cond_3
    invoke-virtual {p1}, LZL2;->v()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v1, Lek2;->u:Lek2;

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p1}, LZL2;->a()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v1, Lek2;->B:Lek2;

    goto/16 :goto_1

    :cond_5
    invoke-virtual {p1}, LZL2;->w()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v1, Lek2;->q0:Lek2;

    goto/16 :goto_1

    :cond_6
    invoke-virtual {p1}, LZL2;->x()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, Lek2;->p0:Lek2;

    goto/16 :goto_1

    :cond_7
    invoke-static {p1}, Lmk2;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_1

    :cond_8
    invoke-static {p1}, Lmk2;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LZL2;->a:LZL2;

    invoke-virtual {p1}, LZL2;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v1, Lek2;->C:Lek2;

    goto/16 :goto_1

    :cond_9
    invoke-virtual {p1}, LZL2;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v1, Lek2;->D:Lek2;

    goto/16 :goto_1

    :cond_a
    invoke-virtual {p1}, LZL2;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v1, Lek2;->E:Lek2;

    goto/16 :goto_1

    :cond_b
    invoke-virtual {p1}, LZL2;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v1, Lek2;->F:Lek2;

    goto/16 :goto_1

    :cond_c
    invoke-virtual {p1}, LZL2;->r()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v1, Lek2;->G:Lek2;

    goto/16 :goto_1

    :cond_d
    invoke-virtual {p1}, LZL2;->q()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v1, Lek2;->H:Lek2;

    goto/16 :goto_1

    :cond_e
    invoke-virtual {p1}, LZL2;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, Lek2;->S:Lek2;

    goto/16 :goto_1

    :cond_f
    invoke-virtual {p1}, LZL2;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v1, Lek2;->T:Lek2;

    goto/16 :goto_1

    :cond_10
    invoke-virtual {p1}, LZL2;->n()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, Lek2;->t:Lek2;

    goto/16 :goto_1

    :cond_11
    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LZL2;->a:LZL2;

    invoke-virtual {p1}, LZL2;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_12

    sget-object v1, Lek2;->c:Lek2;

    goto/16 :goto_1

    :cond_12
    invoke-virtual {p1}, LZL2;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_13

    sget-object v1, Lek2;->d:Lek2;

    goto/16 :goto_1

    :cond_13
    invoke-virtual {p1}, LZL2;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v1, Lek2;->m:Lek2;

    goto/16 :goto_1

    :cond_14
    invoke-virtual {p1}, LZL2;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object v1, Lek2;->n:Lek2;

    goto/16 :goto_1

    :cond_15
    invoke-virtual {p1}, LZL2;->r()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v1, Lek2;->o:Lek2;

    goto/16 :goto_1

    :cond_16
    invoke-virtual {p1}, LZL2;->q()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_17

    sget-object v1, Lek2;->p:Lek2;

    goto/16 :goto_1

    :cond_17
    invoke-virtual {p1}, LZL2;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v1, Lek2;->i:Lek2;

    goto/16 :goto_1

    :cond_18
    invoke-virtual {p1}, LZL2;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v1, Lek2;->j:Lek2;

    goto :goto_1

    :cond_19
    invoke-virtual {p1}, LZL2;->l()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1a

    sget-object v1, Lek2;->Y:Lek2;

    goto :goto_1

    :cond_1a
    invoke-virtual {p1}, LZL2;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1b

    sget-object v1, Lek2;->v:Lek2;

    goto :goto_1

    :cond_1b
    invoke-virtual {p1}, LZL2;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1c

    sget-object v1, Lek2;->w:Lek2;

    goto :goto_1

    :cond_1c
    invoke-virtual {p1}, LZL2;->s()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1d

    sget-object v1, Lek2;->t:Lek2;

    goto :goto_1

    :cond_1d
    invoke-virtual {p1}, LZL2;->f()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1e

    sget-object v1, Lek2;->u:Lek2;

    goto :goto_1

    :cond_1e
    invoke-virtual {p1}, LZL2;->e()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v1, Lek2;->s:Lek2;

    goto :goto_1

    :cond_1f
    invoke-virtual {p1}, LZL2;->t()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, Lek2;->Z:Lek2;

    :cond_20
    :goto_1
    return-object v1
.end method
