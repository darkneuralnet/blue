.class public Lcom/facebook/share/internal/a$v;
.super Lcom/facebook/share/internal/a$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "v"
.end annotation


# instance fields
.field public f:Ljava/lang/String;

.field public final synthetic g:Lcom/facebook/share/internal/a;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a;Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/facebook/share/internal/a$v;->g:Lcom/facebook/share/internal/a;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lcom/facebook/share/internal/a$k;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    iput-object p2, p0, Lcom/facebook/share/internal/a$v;->f:Ljava/lang/String;

    new-instance p1, Lcom/facebook/GraphRequest;

    invoke-static {}, Lcom/facebook/AccessToken;->c()Lcom/facebook/AccessToken;

    move-result-object v1

    sget-object v2, LFN1;->d:LFN1;

    invoke-direct {p1, v1, p2, v0, v2}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;LFN1;)V

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/a$k;->f(Lcom/facebook/GraphRequest;)V

    return-void
.end method


# virtual methods
.method public d(Lcom/facebook/FacebookRequestError;)V
    .locals 5

    sget-object v0, LSx2;->b:LSx2;

    invoke-static {}, Lcom/facebook/share/internal/a;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/share/internal/a$v;->f:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string v3, "Error unliking object with unlike token \'%s\' : %s"

    invoke-static {v0, v1, v3, v2}, LFx2;->h(LSx2;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/facebook/share/internal/a$v;->g:Lcom/facebook/share/internal/a;

    const-string v1, "publish_unlike"

    invoke-static {v0, v1, p1}, Lcom/facebook/share/internal/a;->r(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    return-void
.end method

.method public e(LWD1;)V
    .locals 0

    return-void
.end method
