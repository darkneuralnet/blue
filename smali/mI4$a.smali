.class public LmI4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmI4;->finish(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:LmI4;


# direct methods
.method public constructor <init>(LmI4;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, LmI4$a;->d:LmI4;

    iput-object p2, p0, LmI4$a;->b:Ljava/lang/String;

    iput-wide p3, p0, LmI4$a;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, LmI4$a;->d:LmI4;

    invoke-static {v0}, LmI4;->access$000(LmI4;)LNu6$a;

    move-result-object v0

    iget-object v1, p0, LmI4$a;->b:Ljava/lang/String;

    iget-wide v2, p0, LmI4$a;->c:J

    invoke-virtual {v0, v1, v2, v3}, LNu6$a;->a(Ljava/lang/String;J)V

    iget-object v0, p0, LmI4$a;->d:LmI4;

    invoke-static {v0}, LmI4;->access$000(LmI4;)LNu6$a;

    move-result-object v0

    iget-object v1, p0, LmI4$a;->d:LmI4;

    invoke-virtual {v1}, LmI4;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LNu6$a;->b(Ljava/lang/String;)V

    return-void
.end method
