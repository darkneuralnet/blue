.class public final LPH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPH0$a$b;,
        LPH0$a$d;,
        LPH0$a$c;,
        LPH0$a$a;
    }
.end annotation


# instance fields
.field public final a:LPH0$a;

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTo0;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lrd5;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKZ;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lmp0;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAo0;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Luo0;",
            ">;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLo0;",
            ">;"
        }
    .end annotation
.end field

.field public m:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJo0;",
            ">;"
        }
    .end annotation
.end field

.field public n:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQo0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKZ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LPH0$a;->a:LPH0$a;

    invoke-virtual {p0, p1, p2, p3, p4}, LPH0$a;->b(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKZ;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKZ;LQH0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LPH0$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKZ;)V

    return-void
.end method


# virtual methods
.method public a(Lan0;)V
    .locals 0

    invoke-virtual {p0, p1}, LPH0$a;->c(Lan0;)Lan0;

    return-void
.end method

.method public final b(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKZ;)V
    .locals 2

    new-instance v0, LPH0$a$b;

    invoke-direct {v0, p1}, LPH0$a$b;-><init>(LlG2;)V

    iput-object v0, p0, LPH0$a;->b:LY94;

    new-instance v0, LPH0$a$d;

    invoke-direct {v0, p1}, LPH0$a$d;-><init>(LlG2;)V

    iput-object v0, p0, LPH0$a;->c:LY94;

    new-instance v0, LPH0$a$c;

    invoke-direct {v0, p1}, LPH0$a$c;-><init>(LlG2;)V

    iput-object v0, p0, LPH0$a;->d:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, LPH0$a;->e:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LPH0$a;->f:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LPH0$a;->g:LY94;

    iget-object p3, p0, LPH0$a;->f:LY94;

    invoke-static {p3, p2}, Lnp0;->a(LY94;LY94;)Lnp0;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, LPH0$a;->h:LY94;

    iget-object p3, p0, LPH0$a;->b:LY94;

    iget-object p4, p0, LPH0$a;->c:LY94;

    iget-object v0, p0, LPH0$a;->d:LY94;

    iget-object v1, p0, LPH0$a;->e:LY94;

    invoke-static {p3, p4, v0, v1, p2}, LIo0;->a(LY94;LY94;LY94;LY94;LY94;)LIo0;

    move-result-object p2

    iput-object p2, p0, LPH0$a;->i:LY94;

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, LPH0$a;->j:LY94;

    new-instance p2, LPH0$a$a;

    invoke-direct {p2, p1}, LPH0$a$a;-><init>(LlG2;)V

    iput-object p2, p0, LPH0$a;->k:LY94;

    invoke-static {p2}, LMo0;->a(LY94;)LMo0;

    move-result-object p1

    iput-object p1, p0, LPH0$a;->l:LY94;

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LPH0$a;->m:LY94;

    iget-object p2, p0, LPH0$a;->j:LY94;

    iget-object p3, p0, LPH0$a;->e:LY94;

    iget-object p4, p0, LPH0$a;->h:LY94;

    invoke-static {p2, p3, p4, p1}, LRo0;->a(LY94;LY94;LY94;LY94;)LRo0;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LPH0$a;->n:LY94;

    return-void
.end method

.method public final c(Lan0;)Lan0;
    .locals 1

    iget-object v0, p0, LPH0$a;->n:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNo0;

    invoke-static {p1, v0}, Lbn0;->b(Lan0;LNo0;)V

    return-object p1
.end method
