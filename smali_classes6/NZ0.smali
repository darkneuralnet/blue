.class public final synthetic LNZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:LQZ0$b;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNZ0;->b:Ljava/util/concurrent/Callable;

    iput-object p2, p0, LNZ0;->c:LQZ0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LNZ0;->b:Ljava/util/concurrent/Callable;

    iget-object v1, p0, LNZ0;->c:LQZ0$b;

    invoke-static {v0, v1}, LPZ0;->l(Ljava/util/concurrent/Callable;LQZ0$b;)V

    return-void
.end method
