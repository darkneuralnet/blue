.class public final LSj6;
.super Lg0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg0<",
        "LVi6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0008\u0010\u000b\u001a\u00020\u0006H\u0014J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u000c\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002\u00a8\u0006\u0014"
    }
    d2 = {
        "LSj6;",
        "Lg0;",
        "LVi6;",
        "",
        "index",
        "instance",
        "",
        "o",
        "n",
        "count",
        "b",
        "k",
        "from",
        "to",
        "e",
        "LgE1;",
        "m",
        "root",
        "<init>",
        "(LVi6;)V",
        "ui_release"
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
        "SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LVi6;)V
    .locals 1

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg0;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 1

    invoke-virtual {p0}, Lg0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVi6;

    invoke-virtual {p0, v0}, LSj6;->m(LVi6;)LgE1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LgE1;->j(II)V

    return-void
.end method

.method public e(III)V
    .locals 1

    invoke-virtual {p0}, Lg0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVi6;

    invoke-virtual {p0, v0}, LSj6;->m(LVi6;)LgE1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LgE1;->i(III)V

    return-void
.end method

.method public bridge synthetic f(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, LVi6;

    invoke-virtual {p0, p1, p2}, LSj6;->o(ILVi6;)V

    return-void
.end method

.method public bridge synthetic g(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, LVi6;

    invoke-virtual {p0, p1, p2}, LSj6;->n(ILVi6;)V

    return-void
.end method

.method public k()V
    .locals 3

    invoke-virtual {p0}, Lg0;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVi6;

    invoke-virtual {p0, v0}, LSj6;->m(LVi6;)LgE1;

    move-result-object v0

    invoke-virtual {v0}, LgE1;->f()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, LgE1;->j(II)V

    return-void
.end method

.method public final m(LVi6;)LgE1;
    .locals 1

    instance-of v0, p1, LgE1;

    if-eqz v0, :cond_0

    check-cast p1, LgE1;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot only insert VNode into Group"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(ILVi6;)V
    .locals 0

    const-string p1, "instance"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public o(ILVi6;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVi6;

    invoke-virtual {p0, v0}, LSj6;->m(LVi6;)LgE1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LgE1;->h(ILVi6;)V

    return-void
.end method
