.class public final synthetic LMZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LPZ0;

.field public final synthetic c:Ljava/util/concurrent/Callable;

.field public final synthetic d:LQZ0$b;


# direct methods
.method public synthetic constructor <init>(LPZ0;Ljava/util/concurrent/Callable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMZ0;->b:LPZ0;

    iput-object p2, p0, LMZ0;->c:Ljava/util/concurrent/Callable;

    iput-object p3, p0, LMZ0;->d:LQZ0$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LMZ0;->b:LPZ0;

    iget-object v1, p0, LMZ0;->c:Ljava/util/concurrent/Callable;

    iget-object v2, p0, LMZ0;->d:LQZ0$b;

    invoke-static {v0, v1, v2}, LPZ0;->d(LPZ0;Ljava/util/concurrent/Callable;LQZ0$b;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
