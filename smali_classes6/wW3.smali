.class public final synthetic LwW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LxW3;

.field public final synthetic c:Lth1;


# direct methods
.method public synthetic constructor <init>(LxW3;Lth1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwW3;->b:LxW3;

    iput-object p2, p0, LwW3;->c:Lth1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LwW3;->b:LxW3;

    iget-object v1, p0, LwW3;->c:Lth1;

    invoke-static {v0, v1}, LxW3;->c(LxW3;Lth1;)LXh;

    move-result-object v0

    return-object v0
.end method
