.class public final LId6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LId6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0008B\u0011\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0008\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002J\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0008\u0010\u000c\u001a\u00020\u0006H\u0002R\u0017\u0010\u0011\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LId6;",
        "",
        "LF16;",
        "value",
        "",
        "now",
        "",
        "e",
        "a",
        "b",
        "g",
        "c",
        "d",
        "",
        "I",
        "getMaxStoredCharacters",
        "()I",
        "maxStoredCharacters",
        "LId6$a;",
        "LId6$a;",
        "undoStack",
        "redoStack",
        "storedCharacters",
        "Ljava/lang/Long;",
        "lastSnapshot",
        "",
        "f",
        "Z",
        "forceNextSnapshot",
        "<init>",
        "(I)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:I

.field public b:LId6$a;

.field public c:LId6$a;

.field public d:I

.field public e:Ljava/lang/Long;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, LId6;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LId6;->a:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x186a0

    :cond_0
    invoke-direct {p0, p1}, LId6;-><init>(I)V

    return-void
.end method

.method public static synthetic f(LId6;LF16;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, LKd6;->a()J

    move-result-wide p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LId6;->e(LF16;J)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LId6;->f:Z

    return-void
.end method

.method public final b(LF16;)V
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LId6;->f:Z

    iget-object v0, p0, LId6;->b:LId6$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LId6$a;->b()LF16;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, LId6;->b:LId6$a;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LId6$a;->b()LF16;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LF16;->h()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LId6;->b:LId6$a;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p1}, LId6$a;->d(LF16;)V

    :goto_2
    return-void

    :cond_4
    iget-object v0, p0, LId6;->b:LId6$a;

    new-instance v2, LId6$a;

    invoke-direct {v2, v0, p1}, LId6$a;-><init>(LId6$a;LF16;)V

    iput-object v2, p0, LId6;->b:LId6$a;

    iput-object v1, p0, LId6;->c:LId6$a;

    iget v0, p0, LId6;->d:I

    invoke-virtual {p1}, LF16;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LId6;->d:I

    iget p1, p0, LId6;->a:I

    if-le v0, p1, :cond_5

    invoke-virtual {p0}, LId6;->d()V

    :cond_5
    return-void
.end method

.method public final c()LF16;
    .locals 4

    iget-object v0, p0, LId6;->c:LId6$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LId6$a;->a()LId6$a;

    move-result-object v1

    iput-object v1, p0, LId6;->c:LId6$a;

    invoke-virtual {v0}, LId6$a;->b()LF16;

    move-result-object v1

    iget-object v2, p0, LId6;->b:LId6$a;

    new-instance v3, LId6$a;

    invoke-direct {v3, v2, v1}, LId6$a;-><init>(LId6$a;LF16;)V

    iput-object v3, p0, LId6;->b:LId6$a;

    iget v1, p0, LId6;->d:I

    invoke-virtual {v0}, LId6$a;->b()LF16;

    move-result-object v2

    invoke-virtual {v2}, LF16;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, p0, LId6;->d:I

    invoke-virtual {v0}, LId6$a;->b()LF16;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LId6;->b:LId6$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LId6$a;->a()LId6$a;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_1

    return-void

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LId6$a;->a()LId6$a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LId6$a;->a()LId6$a;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {v0}, LId6$a;->a()LId6$a;

    move-result-object v0

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v1}, LId6$a;->c(LId6$a;)V

    :goto_3
    return-void
.end method

.method public final e(LF16;J)V
    .locals 4

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LId6;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LId6;->e:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {}, LJd6;->a()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    :cond_1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LId6;->e:Ljava/lang/Long;

    invoke-virtual {p0, p1}, LId6;->b(LF16;)V

    :cond_2
    return-void
.end method

.method public final g()LF16;
    .locals 4

    iget-object v0, p0, LId6;->b:LId6$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LId6$a;->a()LId6$a;

    move-result-object v2

    if-eqz v2, :cond_0

    iput-object v2, p0, LId6;->b:LId6$a;

    iget v1, p0, LId6;->d:I

    invoke-virtual {v0}, LId6$a;->b()LF16;

    move-result-object v3

    invoke-virtual {v3}, LF16;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v1, v3

    iput v1, p0, LId6;->d:I

    invoke-virtual {v0}, LId6$a;->b()LF16;

    move-result-object v0

    iget-object v1, p0, LId6;->c:LId6$a;

    new-instance v3, LId6$a;

    invoke-direct {v3, v1, v0}, LId6$a;-><init>(LId6$a;LF16;)V

    iput-object v3, p0, LId6;->c:LId6$a;

    invoke-virtual {v2}, LId6$a;->b()LF16;

    move-result-object v0

    move-object v1, v0

    :cond_0
    return-object v1
.end method
