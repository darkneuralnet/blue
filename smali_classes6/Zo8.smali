.class public final LZo8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LZo8;->e:Lcs8;

    iput-object p2, p0, LZo8;->b:Ljava/lang/String;

    iput-object p3, p0, LZo8;->c:Ljava/lang/String;

    iput-object p4, p0, LZo8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LZo8;->e:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    invoke-virtual {v0}, LhV8;->b()V

    iget-object v0, p0, LZo8;->e:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    invoke-virtual {v0}, LhV8;->W()Ltq7;

    move-result-object v0

    iget-object v1, p0, LZo8;->b:Ljava/lang/String;

    iget-object v2, p0, LZo8;->c:Ljava/lang/String;

    iget-object v3, p0, LZo8;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Ltq7;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
