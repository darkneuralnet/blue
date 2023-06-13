.class public final synthetic LOk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRk5;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(LRk5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOk5;->b:LRk5;

    iput-boolean p2, p0, LOk5;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LOk5;->b:LRk5;

    iget-boolean v1, p0, LOk5;->c:Z

    invoke-static {v0, v1}, LRk5;->Rl(LRk5;Z)V

    return-void
.end method
