.class public final synthetic Lz39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ly49;

.field public final synthetic c:LlO8;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:J

.field public final synthetic f:LOe8;


# direct methods
.method public synthetic constructor <init>(Ly49;LlO8;Ljava/lang/Object;JLOe8;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz39;->b:Ly49;

    iput-object p2, p0, Lz39;->c:LlO8;

    iput-object p3, p0, Lz39;->d:Ljava/lang/Object;

    iput-wide p4, p0, Lz39;->e:J

    iput-object p6, p0, Lz39;->f:LOe8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lz39;->b:Ly49;

    iget-object v1, p0, Lz39;->c:LlO8;

    iget-object v2, p0, Lz39;->d:Ljava/lang/Object;

    iget-wide v3, p0, Lz39;->e:J

    iget-object v5, p0, Lz39;->f:LOe8;

    invoke-virtual/range {v0 .. v5}, Ly49;->f(LlO8;Ljava/lang/Object;JLOe8;)V

    return-void
.end method
