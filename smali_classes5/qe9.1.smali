.class public final synthetic Lqe9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LSe9;

.field public final synthetic c:LmW8;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lqf9;


# direct methods
.method public synthetic constructor <init>(LSe9;Lqf9;LmW8;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe9;->b:LSe9;

    iput-object p2, p0, Lqe9;->e:Lqf9;

    iput-object p3, p0, Lqe9;->c:LmW8;

    iput-object p4, p0, Lqe9;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lqe9;->b:LSe9;

    iget-object v1, p0, Lqe9;->e:Lqf9;

    iget-object v2, p0, Lqe9;->c:LmW8;

    iget-object v3, p0, Lqe9;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, LSe9;->b(Lqf9;LmW8;Ljava/lang/String;)V

    return-void
.end method
