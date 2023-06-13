.class public LQ41$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:LQ41;


# direct methods
.method public constructor <init>(Landroid/os/Looper;LQ41;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, LQ41$a;->a:LQ41;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    sget-object v0, LiT3;->o:Landroid/os/Handler;

    new-instance v1, LQ41$a$a;

    invoke-direct {v1, p0, p1}, LQ41$a$a;-><init>(LQ41$a;Landroid/os/Message;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->t(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->s(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, LQ41$a;->a:LQ41;

    iget p1, p1, Landroid/os/Message;->arg1:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v0, v1}, LQ41;->m(Z)V

    goto :goto_0

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/net/NetworkInfo;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->r(Landroid/net/NetworkInfo;)V

    goto :goto_0

    :pswitch_5
    iget-object p1, p0, LQ41$a;->a:LQ41;

    invoke-virtual {p1}, LQ41;->n()V

    goto :goto_0

    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LWT;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1, v1}, LQ41;->q(LWT;Z)V

    goto :goto_0

    :pswitch_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LWT;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->u(LWT;)V

    goto :goto_0

    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LWT;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->p(LWT;)V

    goto :goto_0

    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lz2;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->o(Lz2;)V

    goto :goto_0

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lz2;

    iget-object v0, p0, LQ41$a;->a:LQ41;

    invoke-virtual {v0, p1}, LQ41;->v(Lz2;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
