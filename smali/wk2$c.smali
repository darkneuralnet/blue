.class public final Lwk2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwk2;
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
        "wk2$c",
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
.field public final synthetic a:Lvk2;


# direct methods
.method public constructor <init>(Lvk2;)V
    .locals 0

    iput-object p1, p0, Lwk2$c;->a:Lvk2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)Lek2;
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmk2;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lmk2;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LZL2;->a:LZL2;

    invoke-virtual {v0}, LZL2;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lek2;->K:Lek2;

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, LZL2;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, Lek2;->P:Lek2;

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, LZL2;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, Lek2;->R:Lek2;

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v0}, LZL2;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, Lek2;->Q:Lek2;

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lmk2;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LZL2;->a:LZL2;

    invoke-virtual {v0}, LZL2;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v1, Lek2;->f:Lek2;

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, LZL2;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v1, Lek2;->e:Lek2;

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v0}, LZL2;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v1, Lek2;->h:Lek2;

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, LZL2;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v1, Lek2;->g:Lek2;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0}, LZL2;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v1, Lek2;->v:Lek2;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0}, LZL2;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v1, Lek2;->y:Lek2;

    goto :goto_0

    :cond_9
    invoke-virtual {v0}, LZL2;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v1, Lek2;->x:Lek2;

    goto :goto_0

    :cond_a
    invoke-virtual {v0}, LZL2;->b()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, Lek2;->X:Lek2;

    goto :goto_0

    :cond_b
    invoke-static {p1}, Lmk2;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LZL2;->a:LZL2;

    invoke-virtual {v0}, LZL2;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v1, Lek2;->I:Lek2;

    goto :goto_0

    :cond_c
    invoke-virtual {v0}, LZL2;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, Lek2;->J:Lek2;

    goto :goto_0

    :cond_d
    invoke-static {p1}, Lmk2;->d(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LZL2;->a:LZL2;

    invoke-virtual {v0}, LZL2;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v1, Lek2;->z:Lek2;

    goto :goto_0

    :cond_e
    invoke-virtual {v0}, LZL2;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LWj2;->n(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, Lek2;->A:Lek2;

    :cond_f
    :goto_0
    if-nez v1, :cond_10

    iget-object v0, p0, Lwk2$c;->a:Lvk2;

    invoke-interface {v0, p1}, Lvk2;->a(Landroid/view/KeyEvent;)Lek2;

    move-result-object v1

    :cond_10
    return-object v1
.end method
