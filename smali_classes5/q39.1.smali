.class public final synthetic Lq39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ly49;

.field public final synthetic c:LlO8;

.field public final synthetic d:LOe8;


# direct methods
.method public synthetic constructor <init>(Ly49;LlO8;LOe8;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq39;->b:Ly49;

    iput-object p2, p0, Lq39;->c:LlO8;

    iput-object p3, p0, Lq39;->d:LOe8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq39;->b:Ly49;

    iget-object v1, p0, Lq39;->c:LlO8;

    iget-object v2, p0, Lq39;->d:LOe8;

    invoke-virtual {v0, v1, v2}, Ly49;->e(LlO8;LOe8;)V

    return-void
.end method
