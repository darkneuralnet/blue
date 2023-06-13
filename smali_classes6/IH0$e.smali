.class public final LIH0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgy0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public A:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LqW1;",
            ">;"
        }
    .end annotation
.end field

.field public B:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ls41;",
            ">;"
        }
    .end annotation
.end field

.field public C:LZ94;

.field public final a:Ljava/lang/Boolean;

.field public final b:LIH0$c;

.field public final c:LIH0$g;

.field public final d:LIH0$e;

.field public e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LkX;",
            ">;"
        }
    .end annotation
.end field

.field public f:LZ94;

.field public g:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lve5;",
            ">;"
        }
    .end annotation
.end field

.field public h:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lry0;",
            ">;"
        }
    .end annotation
.end field

.field public i:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation
.end field

.field public j:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LPx2;",
            ">;"
        }
    .end annotation
.end field

.field public k:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LK46;",
            ">;"
        }
    .end annotation
.end field

.field public l:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LL46;",
            ">;"
        }
    .end annotation
.end field

.field public m:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LSr4;",
            ">;"
        }
    .end annotation
.end field

.field public n:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lfi3;",
            ">;"
        }
    .end annotation
.end field

.field public o:LZ94;

.field public p:LZ94;

.field public q:LZ94;

.field public r:LZ94;

.field public s:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lle5;",
            ">;"
        }
    .end annotation
.end field

.field public t:LZ94;

.field public u:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LEC2;",
            ">;"
        }
    .end annotation
.end field

.field public v:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public w:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LtW1;",
            ">;"
        }
    .end annotation
.end field

.field public x:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LUx2;",
            ">;"
        }
    .end annotation
.end field

.field public y:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LV36;",
            ">;"
        }
    .end annotation
.end field

.field public z:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LsW1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LIH0$c;LIH0$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LK46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LIH0$e;->d:LIH0$e;

    iput-object p1, p0, LIH0$e;->b:LIH0$c;

    iput-object p2, p0, LIH0$e;->c:LIH0$g;

    iput-object p3, p0, LIH0$e;->a:Ljava/lang/Boolean;

    invoke-virtual {p0, p3, p4, p5}, LIH0$e;->f(Ljava/lang/Boolean;Ljava/lang/Boolean;LK46;)V

    return-void
.end method

.method public synthetic constructor <init>(LIH0$c;LIH0$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LK46;LIH0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LIH0$e;-><init>(LIH0$c;LIH0$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LK46;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lyy0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-static {v0}, LMv5;->c(I)LMv5;

    move-result-object v0

    iget-object v1, p0, LIH0$e;->r:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy0;

    invoke-virtual {v0, v1}, LMv5;->a(Ljava/lang/Object;)LMv5;

    move-result-object v0

    iget-object v1, p0, LIH0$e;->C:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy0;

    invoke-virtual {v0, v1}, LMv5;->a(Ljava/lang/Object;)LMv5;

    move-result-object v0

    iget-object v1, p0, LIH0$e;->h:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy0;

    invoke-virtual {v0, v1}, LMv5;->a(Ljava/lang/Object;)LMv5;

    move-result-object v0

    invoke-virtual {v0}, LMv5;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b()Lve5;
    .locals 1

    iget-object v0, p0, LIH0$e;->g:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lve5;

    return-object v0
.end method

.method public c()Lke5;
    .locals 1

    iget-object v0, p0, LIH0$e;->s:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lke5;

    return-object v0
.end method

.method public d()Lay0;
    .locals 8

    iget-object v0, p0, LIH0$e;->c:LIH0$g;

    invoke-static {v0}, LIH0$g;->d(LIH0$g;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p0}, LIH0$e;->e()LtU;

    move-result-object v2

    iget-object v0, p0, LIH0$e;->g:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lve5;

    iget-object v0, p0, LIH0$e;->e:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LkX;

    iget-object v0, p0, LIH0$e;->c:LIH0$g;

    invoke-static {v0}, LIH0$g;->e(LIH0$g;)LL46;

    move-result-object v5

    iget-object v0, p0, LIH0$e;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v0, p0, LIH0$e;->c:LIH0$g;

    invoke-static {v0}, LIH0$g;->c(LIH0$g;)LZ94;

    move-result-object v0

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lxy0;

    invoke-static/range {v1 .. v7}, Lby0;->a(Landroid/bluetooth/BluetoothDevice;LtU;Lve5;LkX;LL46;ZLxy0;)Lay0;

    move-result-object v0

    return-object v0
.end method

.method public final e()LtU;
    .locals 2

    new-instance v0, LtU;

    iget-object v1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {v1}, LIH0$c;->h(LIH0$c;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LtU;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final f(Ljava/lang/Boolean;Ljava/lang/Boolean;LK46;)V
    .locals 11

    invoke-static {}, LlX;->a()LlX;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->e:LZ94;

    iget-object p1, p0, LIH0$e;->c:LIH0$g;

    invoke-static {p1}, LIH0$g;->h(LIH0$g;)LZ94;

    move-result-object p1

    iget-object v0, p0, LIH0$e;->b:LIH0$c;

    invoke-static {v0}, LIH0$c;->i(LIH0$c;)LZ94;

    move-result-object v0

    iget-object v1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {v1}, LIH0$c;->j(LIH0$c;)LZ94;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lx41;->a(LZ94;LZ94;LZ94;)Lx41;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->f:LZ94;

    iget-object p1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {p1}, LIH0$c;->k(LIH0$c;)LZ94;

    move-result-object p1

    iget-object v0, p0, LIH0$e;->e:LZ94;

    iget-object v1, p0, LIH0$e;->f:LZ94;

    invoke-static {}, LtY2;->a()LtY2;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lwe5;->a(LZ94;LZ94;LZ94;LZ94;)Lwe5;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->g:LZ94;

    iget-object p1, p0, LIH0$e;->c:LIH0$g;

    invoke-static {p1}, LIH0$g;->h(LIH0$g;)LZ94;

    move-result-object p1

    iget-object v0, p0, LIH0$e;->f:LZ94;

    iget-object v1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {v1}, LIH0$c;->l(LIH0$c;)LZ94;

    move-result-object v1

    iget-object v2, p0, LIH0$e;->b:LIH0$c;

    invoke-static {v2}, LIH0$c;->a(LIH0$c;)LZ94;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lsy0;->a(LZ94;LZ94;LZ94;LZ94;)Lsy0;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->h:LZ94;

    iget-object p1, p0, LIH0$e;->e:LZ94;

    invoke-static {p1}, Lky0;->a(LZ94;)Lky0;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->i:LZ94;

    invoke-static {}, Lly0;->a()Lly0;

    move-result-object p1

    invoke-static {p1}, LQx2;->a(LZ94;)LQx2;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->j:LZ94;

    invoke-static {p3}, Le52;->a(Ljava/lang/Object;)Ltj1;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->k:LZ94;

    invoke-static {}, Lmk0;->a()Lmk0;

    move-result-object p1

    iget-object p3, p0, LIH0$e;->k:LZ94;

    invoke-static {p1, p3}, Lny0;->a(LZ94;LZ94;)Lny0;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->l:LZ94;

    iget-object p3, p0, LIH0$e;->g:LZ94;

    iget-object v0, p0, LIH0$e;->i:LZ94;

    invoke-static {p3, v0, p1}, LTr4;->a(LZ94;LZ94;LZ94;)LTr4;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->m:LZ94;

    iget-object v0, p0, LIH0$e;->g:LZ94;

    iget-object v1, p0, LIH0$e;->i:LZ94;

    iget-object v2, p0, LIH0$e;->j:LZ94;

    iget-object v3, p0, LIH0$e;->l:LZ94;

    iget-object p1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {p1}, LIH0$c;->a(LIH0$c;)LZ94;

    move-result-object v4

    invoke-static {}, Lmk0;->a()Lmk0;

    move-result-object v5

    iget-object v6, p0, LIH0$e;->m:LZ94;

    invoke-static/range {v0 .. v6}, Lgi3;->a(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)Lgi3;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->n:LZ94;

    iget-object p3, p0, LIH0$e;->h:LZ94;

    iget-object v0, p0, LIH0$e;->i:LZ94;

    invoke-static {p3, v0, p1}, LTt5;->a(LZ94;LZ94;LZ94;)LTt5;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->o:LZ94;

    iget-object p1, p0, LIH0$e;->h:LZ94;

    iget-object p3, p0, LIH0$e;->n:LZ94;

    invoke-static {p1, p3}, LB01;->a(LZ94;LZ94;)LB01;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->p:LZ94;

    invoke-static {}, Lsk0;->a()Lsk0;

    move-result-object v0

    invoke-static {}, Lrk0;->a()Lrk0;

    move-result-object v1

    invoke-static {}, Lqk0;->a()Lqk0;

    move-result-object v2

    iget-object v3, p0, LIH0$e;->i:LZ94;

    iget-object v4, p0, LIH0$e;->g:LZ94;

    iget-object v5, p0, LIH0$e;->p:LZ94;

    invoke-static/range {v0 .. v5}, Lba3;->a(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)Lba3;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->q:LZ94;

    iget-object p1, p0, LIH0$e;->g:LZ94;

    invoke-static {}, Ljy0;->a()Ljy0;

    move-result-object p3

    invoke-static {p1, p3}, LrW2;->a(LZ94;LZ94;)LrW2;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->r:LZ94;

    new-instance p1, LzZ0;

    invoke-direct {p1}, LzZ0;-><init>()V

    iput-object p1, p0, LIH0$e;->s:LZ94;

    invoke-static {}, Liy0;->a()Liy0;

    move-result-object p3

    invoke-static {p1, p3}, LmW2;->a(LZ94;LZ94;)LmW2;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->t:LZ94;

    iget-object p3, p0, LIH0$e;->h:LZ94;

    iget-object v0, p0, LIH0$e;->s:LZ94;

    iget-object v1, p0, LIH0$e;->n:LZ94;

    invoke-static {p3, p1, v0, v1}, LFC2;->a(LZ94;LZ94;LZ94;LZ94;)LFC2;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->u:LZ94;

    invoke-static {p2}, Le52;->a(Ljava/lang/Object;)Ltj1;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->v:LZ94;

    invoke-static {}, Lly0;->a()Lly0;

    move-result-object p1

    invoke-static {p1}, LuW1;->a(LZ94;)LuW1;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->w:LZ94;

    invoke-static {p1}, LVx2;->a(LZ94;)LVx2;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->x:LZ94;

    iget-object p1, p0, LIH0$e;->w:LZ94;

    invoke-static {p1}, LW36;->a(LZ94;)LW36;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->y:LZ94;

    iget-object p2, p0, LIH0$e;->v:LZ94;

    iget-object p3, p0, LIH0$e;->x:LZ94;

    invoke-static {p2, p3, p1}, Lmy0;->a(LZ94;LZ94;LZ94;)Lmy0;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->z:LZ94;

    invoke-static {p1}, LrW1;->a(LZ94;)LrW1;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->A:LZ94;

    iget-object p1, p0, LIH0$e;->s:LZ94;

    iget-object v0, p0, LIH0$e;->h:LZ94;

    iget-object v1, p0, LIH0$e;->g:LZ94;

    iget-object v2, p0, LIH0$e;->i:LZ94;

    iget-object v3, p0, LIH0$e;->o:LZ94;

    iget-object v4, p0, LIH0$e;->q:LZ94;

    iget-object v5, p0, LIH0$e;->r:LZ94;

    iget-object v6, p0, LIH0$e;->p:LZ94;

    iget-object v7, p0, LIH0$e;->n:LZ94;

    iget-object v8, p0, LIH0$e;->u:LZ94;

    iget-object p2, p0, LIH0$e;->b:LIH0$c;

    invoke-static {p2}, LIH0$c;->a(LIH0$c;)LZ94;

    move-result-object v9

    iget-object v10, p0, LIH0$e;->A:LZ94;

    invoke-static/range {v0 .. v10}, Lme5;->a(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)Lme5;

    move-result-object p2

    invoke-static {p2}, LW51;->b(LZ94;)LZ94;

    move-result-object p2

    invoke-static {p1, p2}, LzZ0;->a(LZ94;LZ94;)V

    iget-object v0, p0, LIH0$e;->g:LZ94;

    iget-object v1, p0, LIH0$e;->e:LZ94;

    iget-object p1, p0, LIH0$e;->c:LIH0$g;

    invoke-static {p1}, LIH0$g;->h(LIH0$g;)LZ94;

    move-result-object v2

    iget-object p1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {p1}, LIH0$c;->b(LIH0$c;)LZ94;

    move-result-object v3

    iget-object p1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {p1}, LIH0$c;->a(LIH0$c;)LZ94;

    move-result-object v4

    iget-object p1, p0, LIH0$e;->c:LIH0$g;

    invoke-static {p1}, LIH0$g;->b(LIH0$g;)LZ94;

    move-result-object v5

    iget-object p1, p0, LIH0$e;->c:LIH0$g;

    invoke-static {p1}, LIH0$g;->c(LIH0$g;)LZ94;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lt41;->a(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)Lt41;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->B:LZ94;

    iget-object p1, p0, LIH0$e;->b:LIH0$c;

    invoke-static {p1}, LIH0$c;->c(LIH0$c;)LZ94;

    move-result-object p1

    iget-object p2, p0, LIH0$e;->B:LZ94;

    invoke-static {p1, p2}, Lr41;->a(LZ94;LZ94;)Lr41;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$e;->C:LZ94;

    return-void
.end method
