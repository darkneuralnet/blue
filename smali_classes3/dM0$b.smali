.class public final LdM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwH2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdM0$b$b;,
        LdM0$b$d;,
        LdM0$b$c;,
        LdM0$b$a;
    }
.end annotation


# instance fields
.field public final a:LdM0$b;

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LwH2;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMH2;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LrH2;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWg6;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoF3;",
            ">;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LIH2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LwH2$c;LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LdM0$b;->a:LdM0$b;

    invoke-virtual {p0, p1, p2}, LdM0$b;->b(LwH2$c;LlG2;)V

    return-void
.end method

.method public synthetic constructor <init>(LwH2$c;LlG2;LeM0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LdM0$b;-><init>(LwH2$c;LlG2;)V

    return-void
.end method


# virtual methods
.method public a(LwH2;)V
    .locals 0

    invoke-virtual {p0, p1}, LdM0$b;->c(LwH2;)LwH2;

    return-void
.end method

.method public final b(LwH2$c;LlG2;)V
    .locals 7

    invoke-static {p1}, LRH2;->a(LwH2$c;)LRH2;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, LdM0$b;->b:LY94;

    invoke-static {p1}, LOH2;->b(LwH2$c;)LOH2;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, LdM0$b;->c:LY94;

    invoke-static {p1}, LQH2;->a(LwH2$c;)LQH2;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, LdM0$b;->d:LY94;

    iget-object v1, p0, LdM0$b;->c:LY94;

    invoke-static {v1, v0}, LNH2;->a(LY94;LY94;)LNH2;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, LdM0$b;->e:LY94;

    invoke-static {p1}, LPH2;->b(LwH2$c;)LPH2;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LdM0$b;->f:LY94;

    new-instance p1, LdM0$b$b;

    invoke-direct {p1, p2}, LdM0$b$b;-><init>(LlG2;)V

    iput-object p1, p0, LdM0$b;->g:LY94;

    new-instance p1, LdM0$b$d;

    invoke-direct {p1, p2}, LdM0$b$d;-><init>(LlG2;)V

    iput-object p1, p0, LdM0$b;->h:LY94;

    new-instance p1, LdM0$b$c;

    invoke-direct {p1, p2}, LdM0$b$c;-><init>(LlG2;)V

    iput-object p1, p0, LdM0$b;->i:LY94;

    new-instance v6, LdM0$b$a;

    invoke-direct {v6, p2}, LdM0$b$a;-><init>(LlG2;)V

    iput-object v6, p0, LdM0$b;->j:LY94;

    iget-object v0, p0, LdM0$b;->b:LY94;

    iget-object v1, p0, LdM0$b;->e:LY94;

    iget-object v2, p0, LdM0$b;->f:LY94;

    iget-object v3, p0, LdM0$b;->g:LY94;

    iget-object v4, p0, LdM0$b;->h:LY94;

    iget-object v5, p0, LdM0$b;->i:LY94;

    invoke-static/range {v0 .. v6}, LLH2;->a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LLH2;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LdM0$b;->k:LY94;

    return-void
.end method

.method public final c(LwH2;)LwH2;
    .locals 1

    iget-object v0, p0, LdM0$b;->k:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIH2;

    invoke-static {p1, v0}, LSH2;->b(LwH2;LIH2;)V

    return-object p1
.end method
