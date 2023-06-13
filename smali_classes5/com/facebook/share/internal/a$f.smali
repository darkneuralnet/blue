.class public final Lcom/facebook/share/internal/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a;->R(Lcom/facebook/share/internal/a$m;Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/share/internal/a$m;

.field public final synthetic c:Lcom/facebook/share/internal/a;

.field public final synthetic d:Lcom/facebook/FacebookException;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a$m;Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$f;->b:Lcom/facebook/share/internal/a$m;

    iput-object p2, p0, Lcom/facebook/share/internal/a$f;->c:Lcom/facebook/share/internal/a;

    iput-object p3, p0, Lcom/facebook/share/internal/a$f;->d:Lcom/facebook/FacebookException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/share/internal/a$f;->b:Lcom/facebook/share/internal/a$m;

    iget-object v1, p0, Lcom/facebook/share/internal/a$f;->c:Lcom/facebook/share/internal/a;

    iget-object v2, p0, Lcom/facebook/share/internal/a$f;->d:Lcom/facebook/FacebookException;

    invoke-interface {v0, v1, v2}, Lcom/facebook/share/internal/a$m;->a(Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
