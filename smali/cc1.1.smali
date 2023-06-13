.class public final synthetic Lcc1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1$f;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Lsb1;


# direct methods
.method public synthetic constructor <init>(LOb1$f;Ljava/util/concurrent/Executor;Lsb1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcc1;->b:LOb1$f;

    iput-object p2, p0, Lcc1;->c:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcc1;->d:Lsb1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcc1;->b:LOb1$f;

    iget-object v1, p0, Lcc1;->c:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcc1;->d:Lsb1;

    invoke-static {v0, v1, v2}, LOb1$f;->b(LOb1$f;Ljava/util/concurrent/Executor;Lsb1;)V

    return-void
.end method
