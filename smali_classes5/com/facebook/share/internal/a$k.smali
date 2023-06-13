.class public abstract Lcom/facebook/share/internal/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/internal/a$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "k"
.end annotation


# instance fields
.field public a:Lcom/facebook/GraphRequest;

.field public b:Ljava/lang/String;

.field public c:Lcom/facebook/share/widget/LikeView$g;

.field public d:Lcom/facebook/FacebookRequestError;

.field public final synthetic e:Lcom/facebook/share/internal/a;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$k;->e:Lcom/facebook/share/internal/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/share/internal/a$k;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/share/internal/a$k;->c:Lcom/facebook/share/widget/LikeView$g;

    return-void
.end method


# virtual methods
.method public c(LVD1;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/internal/a$k;->a:Lcom/facebook/GraphRequest;

    invoke-virtual {p1, v0}, LVD1;->b(Lcom/facebook/GraphRequest;)Z

    return-void
.end method

.method public abstract d(Lcom/facebook/FacebookRequestError;)V
.end method

.method public abstract e(LWD1;)V
.end method

.method public f(Lcom/facebook/GraphRequest;)V
    .locals 1

    iput-object p1, p0, Lcom/facebook/share/internal/a$k;->a:Lcom/facebook/GraphRequest;

    invoke-static {}, Lcom/facebook/a;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/GraphRequest;->F(Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/share/internal/a$k$a;

    invoke-direct {v0, p0}, Lcom/facebook/share/internal/a$k$a;-><init>(Lcom/facebook/share/internal/a$k;)V

    invoke-virtual {p1, v0}, Lcom/facebook/GraphRequest;->z(Lcom/facebook/GraphRequest$b;)V

    return-void
.end method

.method public getError()Lcom/facebook/FacebookRequestError;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/internal/a$k;->d:Lcom/facebook/FacebookRequestError;

    return-object v0
.end method
