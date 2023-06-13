.class public final synthetic LI39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ly49;

.field public final synthetic c:LlO8;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lz59;


# direct methods
.method public synthetic constructor <init>(Ly49;Lz59;LlO8;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI39;->b:Ly49;

    iput-object p2, p0, LI39;->e:Lz59;

    iput-object p3, p0, LI39;->c:LlO8;

    iput-object p4, p0, LI39;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LI39;->b:Ly49;

    iget-object v1, p0, LI39;->e:Lz59;

    iget-object v2, p0, LI39;->c:LlO8;

    iget-object v3, p0, LI39;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Ly49;->d(Lz59;LlO8;Ljava/lang/String;)V

    return-void
.end method
