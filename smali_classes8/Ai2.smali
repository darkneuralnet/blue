.class public final LAi2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "LAi2;",
        "",
        "",
        "index",
        "",
        "c",
        "(I)V",
        "d",
        "()I",
        "LMs5;",
        "descriptor",
        "",
        "e",
        "Lia1;",
        "a",
        "Lia1;",
        "origin",
        "<set-?>",
        "b",
        "Z",
        "()Z",
        "isUnmarkedNull",
        "<init>",
        "(LMs5;)V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lia1;

.field public b:Z


# direct methods
.method public constructor <init>(LMs5;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lia1;

    new-instance v1, LAi2$a;

    invoke-direct {v1, p0}, LAi2$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1}, Lia1;-><init>(LMs5;Lkotlin/jvm/functions/Function2;)V

    iput-object v0, p0, LAi2;->a:Lia1;

    return-void
.end method

.method public static final synthetic a(LAi2;LMs5;I)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, LAi2;->e(LMs5;I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LAi2;->b:Z

    return v0
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, LAi2;->a:Lia1;

    invoke-virtual {v0, p1}, Lia1;->a(I)V

    return-void
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LAi2;->a:Lia1;

    invoke-virtual {v0}, Lia1;->d()I

    move-result v0

    return v0
.end method

.method public final e(LMs5;I)Z
    .locals 1

    invoke-interface {p1, p2}, LMs5;->i(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LMs5;->d(I)LMs5;

    move-result-object p1

    invoke-interface {p1}, LMs5;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LAi2;->b:Z

    return p1
.end method
