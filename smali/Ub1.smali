.class public final synthetic LUb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1$d;

.field public final synthetic c:LZd3$a;

.field public final synthetic d:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(LOb1$d;LZd3$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUb1;->b:LOb1$d;

    iput-object p2, p0, LUb1;->c:LZd3$a;

    iput-object p3, p0, LUb1;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LUb1;->b:LOb1$d;

    iget-object v1, p0, LUb1;->c:LZd3$a;

    iget-object v2, p0, LUb1;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, LOb1$d;->f(LOb1$d;LZd3$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method
