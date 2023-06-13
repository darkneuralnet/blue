.class public final LBA6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0002\u00a2\u0006\u0004\u0008#\u0010\u0008R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0004\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u0005\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR/\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00118F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0005\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R/\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00178F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0005\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u001f\u001a\u0004\u0008\u000b\u0010 \u00a8\u0006$"
    }
    d2 = {
        "LBA6;",
        "",
        "LVz6;",
        "<set-?>",
        "a",
        "LEX2;",
        "()LVz6;",
        "d",
        "(LVz6;)V",
        "content",
        "LNt2;",
        "b",
        "c",
        "()LNt2;",
        "e",
        "(LNt2;)V",
        "loadingState",
        "",
        "getPageTitle",
        "()Ljava/lang/String;",
        "g",
        "(Ljava/lang/String;)V",
        "pageTitle",
        "Landroid/graphics/Bitmap;",
        "getPageIcon",
        "()Landroid/graphics/Bitmap;",
        "f",
        "(Landroid/graphics/Bitmap;)V",
        "pageIcon",
        "LMM5;",
        "LpA6;",
        "LMM5;",
        "()LMM5;",
        "errorsForCurrentRequest",
        "webContent",
        "<init>",
        "web_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:LEX2;

.field public final b:LEX2;

.field public final c:LEX2;

.field public final d:LEX2;

.field public final e:LMM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMM5<",
            "LpA6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVz6;)V
    .locals 2

    const-string v0, "webContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LBA6;->a:LEX2;

    sget-object p1, LNt2$b;->a:LNt2$b;

    invoke-static {p1, v0, v1, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LBA6;->b:LEX2;

    invoke-static {v0, v0, v1, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LBA6;->c:LEX2;

    invoke-static {v0, v0, v1, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LBA6;->d:LEX2;

    invoke-static {}, LGM5;->d()LMM5;

    move-result-object p1

    iput-object p1, p0, LBA6;->e:LMM5;

    return-void
.end method


# virtual methods
.method public final a()LVz6;
    .locals 1

    iget-object v0, p0, LBA6;->a:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVz6;

    return-object v0
.end method

.method public final b()LMM5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMM5<",
            "LpA6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBA6;->e:LMM5;

    return-object v0
.end method

.method public final c()LNt2;
    .locals 1

    iget-object v0, p0, LBA6;->b:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNt2;

    return-object v0
.end method

.method public final d(LVz6;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBA6;->a:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(LNt2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBA6;->b:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, LBA6;->d:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LBA6;->c:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
