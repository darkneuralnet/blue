.class public Lcom/facebook/share/internal/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVD1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a;->J(Lcom/facebook/share/internal/a$w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/internal/a$o;

.field public final synthetic b:Lcom/facebook/share/internal/a$q;

.field public final synthetic c:Lcom/facebook/share/internal/a$w;

.field public final synthetic d:Lcom/facebook/share/internal/a;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a;Lcom/facebook/share/internal/a$o;Lcom/facebook/share/internal/a$q;Lcom/facebook/share/internal/a$w;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    iput-object p2, p0, Lcom/facebook/share/internal/a$b;->a:Lcom/facebook/share/internal/a$o;

    iput-object p3, p0, Lcom/facebook/share/internal/a$b;->b:Lcom/facebook/share/internal/a$q;

    iput-object p4, p0, Lcom/facebook/share/internal/a$b;->c:Lcom/facebook/share/internal/a$w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LVD1;)V
    .locals 4

    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    iget-object v0, p0, Lcom/facebook/share/internal/a$b;->a:Lcom/facebook/share/internal/a$o;

    iget-object v0, v0, Lcom/facebook/share/internal/a$o;->f:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->i(Lcom/facebook/share/internal/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    invoke-static {p1}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyi6;->R(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    iget-object v0, p0, Lcom/facebook/share/internal/a$b;->b:Lcom/facebook/share/internal/a$q;

    iget-object v0, v0, Lcom/facebook/share/internal/a$q;->f:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->i(Lcom/facebook/share/internal/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    iget-object v0, p0, Lcom/facebook/share/internal/a$b;->b:Lcom/facebook/share/internal/a$q;

    iget-boolean v0, v0, Lcom/facebook/share/internal/a$q;->g:Z

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->q(Lcom/facebook/share/internal/a;Z)Z

    :cond_0
    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    invoke-static {p1}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyi6;->R(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, LSx2;->g:LSx2;

    invoke-static {}, Lcom/facebook/share/internal/a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    invoke-static {v2}, Lcom/facebook/share/internal/a;->p(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Unable to verify the FB id for \'%s\'. Verify that it is a valid FB object or page"

    invoke-static {p1, v0, v2, v1}, LFx2;->h(LSx2;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->d:Lcom/facebook/share/internal/a;

    iget-object v0, p0, Lcom/facebook/share/internal/a$b;->b:Lcom/facebook/share/internal/a$q;

    invoke-virtual {v0}, Lcom/facebook/share/internal/a$k;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/internal/a$b;->b:Lcom/facebook/share/internal/a$q;

    invoke-virtual {v0}, Lcom/facebook/share/internal/a$k;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/share/internal/a$b;->a:Lcom/facebook/share/internal/a$o;

    invoke-virtual {v0}, Lcom/facebook/share/internal/a$k;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    :goto_0
    const-string v1, "get_verified_id"

    invoke-static {p1, v1, v0}, Lcom/facebook/share/internal/a;->r(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    :cond_2
    iget-object p1, p0, Lcom/facebook/share/internal/a$b;->c:Lcom/facebook/share/internal/a$w;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lcom/facebook/share/internal/a$w;->onComplete()V

    :cond_3
    return-void
.end method
