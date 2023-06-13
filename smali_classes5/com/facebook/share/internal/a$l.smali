.class public Lcom/facebook/share/internal/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Lcom/facebook/share/widget/LikeView$g;

.field public d:Lcom/facebook/share/internal/a$m;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/share/internal/a$l;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/share/internal/a$l;->c:Lcom/facebook/share/widget/LikeView$g;

    iput-object p3, p0, Lcom/facebook/share/internal/a$l;->d:Lcom/facebook/share/internal/a$m;

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
    iget-object v0, p0, Lcom/facebook/share/internal/a$l;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/share/internal/a$l;->c:Lcom/facebook/share/widget/LikeView$g;

    iget-object v2, p0, Lcom/facebook/share/internal/a$l;->d:Lcom/facebook/share/internal/a$m;

    invoke-static {v0, v1, v2}, Lcom/facebook/share/internal/a;->u(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
