.class public final synthetic LuW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LxW3;

.field public final synthetic c:LkB1;


# direct methods
.method public synthetic constructor <init>(LxW3;LkB1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuW3;->b:LxW3;

    iput-object p2, p0, LuW3;->c:LkB1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LuW3;->b:LxW3;

    iget-object v1, p0, LuW3;->c:LkB1;

    invoke-static {v0, v1}, LxW3;->b(LxW3;LkB1;)LlB1;

    move-result-object v0

    return-object v0
.end method
