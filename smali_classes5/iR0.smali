.class public final LiR0;
.super Lja6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiR0$b;
    }
.end annotation


# instance fields
.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;

.field public e:LY94;

.field public f:LY94;

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LZg5;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lym5;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFG6;",
            ">;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LzY0;",
            ">;"
        }
    .end annotation
.end field

.field public l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lyf6;",
            ">;"
        }
    .end annotation
.end field

.field public m:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXC6;",
            ">;"
        }
    .end annotation
.end field

.field public n:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lia6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lja6;-><init>()V

    invoke-virtual {p0, p1}, LiR0;->d(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LiR0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LiR0;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static c()Lja6$a;
    .locals 2

    new-instance v0, LiR0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LiR0$b;-><init>(LiR0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()LQg1;
    .locals 1

    iget-object v0, p0, LiR0;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQg1;

    return-object v0
.end method

.method public b()Lia6;
    .locals 1

    iget-object v0, p0, LiR0;->n:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lia6;

    return-object v0
.end method

.method public final d(Landroid/content/Context;)V
    .locals 9

    invoke-static {}, LCh1;->a()LCh1;

    move-result-object v0

    invoke-static {v0}, LU51;->a(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, LiR0;->b:LY94;

    invoke-static {p1}, Lc52;->a(Ljava/lang/Object;)Lrj1;

    move-result-object p1

    iput-object p1, p0, LiR0;->c:LY94;

    invoke-static {}, Lk46;->a()Lk46;

    move-result-object v0

    invoke-static {}, Ll46;->a()Ll46;

    move-result-object v1

    invoke-static {p1, v0, v1}, LEE0;->a(LY94;LY94;LY94;)LEE0;

    move-result-object p1

    iput-object p1, p0, LiR0;->d:LY94;

    iget-object v0, p0, LiR0;->c:LY94;

    invoke-static {v0, p1}, LGT2;->a(LY94;LY94;)LGT2;

    move-result-object p1

    invoke-static {p1}, LU51;->a(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LiR0;->e:LY94;

    iget-object p1, p0, LiR0;->c:LY94;

    invoke-static {}, LTg1;->a()LTg1;

    move-result-object v0

    invoke-static {}, LVg1;->a()LVg1;

    move-result-object v1

    invoke-static {p1, v0, v1}, LSm5;->a(LY94;LY94;LY94;)LSm5;

    move-result-object p1

    iput-object p1, p0, LiR0;->f:LY94;

    iget-object p1, p0, LiR0;->c:LY94;

    invoke-static {p1}, LUg1;->a(LY94;)LUg1;

    move-result-object p1

    invoke-static {p1}, LU51;->a(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LiR0;->g:LY94;

    invoke-static {}, Lk46;->a()Lk46;

    move-result-object p1

    invoke-static {}, Ll46;->a()Ll46;

    move-result-object v0

    invoke-static {}, LWg1;->a()LWg1;

    move-result-object v1

    iget-object v2, p0, LiR0;->f:LY94;

    iget-object v3, p0, LiR0;->g:LY94;

    invoke-static {p1, v0, v1, v2, v3}, Lah5;->a(LY94;LY94;LY94;LY94;LY94;)Lah5;

    move-result-object p1

    invoke-static {p1}, LU51;->a(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LiR0;->h:LY94;

    invoke-static {}, Lk46;->a()Lk46;

    move-result-object p1

    invoke-static {p1}, LGm5;->b(LY94;)LGm5;

    move-result-object p1

    iput-object p1, p0, LiR0;->i:LY94;

    iget-object v0, p0, LiR0;->c:LY94;

    iget-object v1, p0, LiR0;->h:LY94;

    invoke-static {}, Ll46;->a()Ll46;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, LIm5;->a(LY94;LY94;LY94;LY94;)LIm5;

    move-result-object p1

    iput-object p1, p0, LiR0;->j:LY94;

    iget-object v0, p0, LiR0;->b:LY94;

    iget-object v1, p0, LiR0;->e:LY94;

    iget-object v2, p0, LiR0;->h:LY94;

    invoke-static {v0, v1, p1, v2, v2}, LAY0;->a(LY94;LY94;LY94;LY94;LY94;)LAY0;

    move-result-object p1

    iput-object p1, p0, LiR0;->k:LY94;

    iget-object v0, p0, LiR0;->c:LY94;

    iget-object v1, p0, LiR0;->e:LY94;

    iget-object v5, p0, LiR0;->h:LY94;

    iget-object v3, p0, LiR0;->j:LY94;

    iget-object v4, p0, LiR0;->b:LY94;

    invoke-static {}, Lk46;->a()Lk46;

    move-result-object v6

    invoke-static {}, Ll46;->a()Ll46;

    move-result-object v7

    iget-object v8, p0, LiR0;->h:LY94;

    move-object v2, v5

    invoke-static/range {v0 .. v8}, Lzf6;->a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lzf6;

    move-result-object p1

    iput-object p1, p0, LiR0;->l:LY94;

    iget-object p1, p0, LiR0;->b:LY94;

    iget-object v0, p0, LiR0;->h:LY94;

    iget-object v1, p0, LiR0;->j:LY94;

    invoke-static {p1, v0, v1, v0}, LYC6;->a(LY94;LY94;LY94;LY94;)LYC6;

    move-result-object p1

    iput-object p1, p0, LiR0;->m:LY94;

    invoke-static {}, Lk46;->a()Lk46;

    move-result-object p1

    invoke-static {}, Ll46;->a()Ll46;

    move-result-object v0

    iget-object v1, p0, LiR0;->k:LY94;

    iget-object v2, p0, LiR0;->l:LY94;

    iget-object v3, p0, LiR0;->m:LY94;

    invoke-static {p1, v0, v1, v2, v3}, Lka6;->a(LY94;LY94;LY94;LY94;LY94;)Lka6;

    move-result-object p1

    invoke-static {p1}, LU51;->a(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LiR0;->n:LY94;

    return-void
.end method
