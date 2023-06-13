.class public final LRt0;
.super LFt0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LRt0;",
        "LFt0;",
        "",
        "b",
        "p",
        "c",
        "o",
        "Lbi2;",
        "Lbi2;",
        "json",
        "",
        "d",
        "I",
        "level",
        "LDj2;",
        "writer",
        "<init>",
        "(LDj2;Lbi2;)V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"
    }
.end annotation


# instance fields
.field public final c:Lbi2;

.field public d:I


# direct methods
.method public constructor <init>(LDj2;Lbi2;)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LFt0;-><init>(LDj2;)V

    iput-object p2, p0, LRt0;->c:Lbi2;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LFt0;->n(Z)V

    iget v1, p0, LRt0;->d:I

    add-int/2addr v1, v0

    iput v1, p0, LRt0;->d:I

    return-void
.end method

.method public c()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LFt0;->n(Z)V

    const-string v1, "\n"

    invoke-virtual {p0, v1}, LFt0;->j(Ljava/lang/String;)V

    iget v1, p0, LRt0;->d:I

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, LRt0;->c:Lbi2;

    invoke-virtual {v2}, Lbi2;->e()Lji2;

    move-result-object v2

    invoke-virtual {v2}, Lji2;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, LFt0;->j(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o()V
    .locals 1

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, LFt0;->e(C)V

    return-void
.end method

.method public p()V
    .locals 1

    iget v0, p0, LRt0;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LRt0;->d:I

    return-void
.end method
