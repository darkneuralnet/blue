.class public Lcom/facebook/share/internal/a$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a$k;->f(Lcom/facebook/GraphRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/internal/a$k;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a$k;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$k$a;->a:Lcom/facebook/share/internal/a$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LWD1;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/share/internal/a$k$a;->a:Lcom/facebook/share/internal/a$k;

    invoke-virtual {p1}, LWD1;->b()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/share/internal/a$k;->d:Lcom/facebook/FacebookRequestError;

    iget-object v0, p0, Lcom/facebook/share/internal/a$k$a;->a:Lcom/facebook/share/internal/a$k;

    iget-object v1, v0, Lcom/facebook/share/internal/a$k;->d:Lcom/facebook/FacebookRequestError;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/a$k;->d(Lcom/facebook/FacebookRequestError;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/share/internal/a$k;->e(LWD1;)V

    :goto_0
    return-void
.end method
