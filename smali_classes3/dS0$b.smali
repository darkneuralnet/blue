.class public final LdS0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNF6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdS0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdS0$b$a;
    }
.end annotation


# instance fields
.field public final a:LdS0$b;

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LHy1;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lni;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYF6;",
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
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLF6;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVF6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lcom/uber/autodispose/ScopeProvider;Lni;LHy1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LdS0$b;->a:LdS0$b;

    invoke-virtual {p0, p1, p2, p3, p4}, LdS0$b;->b(LlG2;Lcom/uber/autodispose/ScopeProvider;Lni;LHy1;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lcom/uber/autodispose/ScopeProvider;Lni;LHy1;LeS0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LdS0$b;-><init>(LlG2;Lcom/uber/autodispose/ScopeProvider;Lni;LHy1;)V

    return-void
.end method


# virtual methods
.method public a(LNF6;)V
    .locals 0

    invoke-virtual {p0, p1}, LdS0$b;->c(LNF6;)LNF6;

    return-void
.end method

.method public final b(LlG2;Lcom/uber/autodispose/ScopeProvider;Lni;LHy1;)V
    .locals 0

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p4

    iput-object p4, p0, LdS0$b;->b:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, LdS0$b;->c:LY94;

    iget-object p4, p0, LdS0$b;->b:LY94;

    invoke-static {p4, p3}, LZF6;->a(LY94;LY94;)LZF6;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, LdS0$b;->d:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LdS0$b;->e:LY94;

    new-instance p2, LdS0$b$a;

    invoke-direct {p2, p1}, LdS0$b$a;-><init>(LlG2;)V

    iput-object p2, p0, LdS0$b;->f:LY94;

    invoke-static {p2}, LMF6;->a(LY94;)LMF6;

    move-result-object p1

    iput-object p1, p0, LdS0$b;->g:LY94;

    iget-object p2, p0, LdS0$b;->d:LY94;

    iget-object p3, p0, LdS0$b;->e:LY94;

    invoke-static {p2, p3, p1}, LWF6;->a(LY94;LY94;LY94;)LWF6;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LdS0$b;->h:LY94;

    return-void
.end method

.method public final c(LNF6;)LNF6;
    .locals 1

    iget-object v0, p0, LdS0$b;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQF6;

    invoke-static {p1, v0}, LOF6;->b(LNF6;LQF6;)V

    return-object p1
.end method
