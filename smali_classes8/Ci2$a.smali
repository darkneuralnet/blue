.class public final LCi2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMs5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCi2;->f(Lkotlin/jvm/functions/Function0;)LMs5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0011\u001a\u00020\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Ci2$a",
        "LMs5;",
        "",
        "index",
        "",
        "f",
        "name",
        "c",
        "",
        "",
        "g",
        "d",
        "",
        "i",
        "a",
        "Lkotlin/Lazy;",
        "()LMs5;",
        "original",
        "h",
        "()Ljava/lang/String;",
        "serialName",
        "LTs5;",
        "getKind",
        "()LTs5;",
        "kind",
        "e",
        "()I",
        "elementsCount",
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
.field public final a:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "LMs5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LCi2$a;->a:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final a()LMs5;
    .locals 1

    iget-object v0, p0, LCi2$a;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMs5;

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-static {p0}, LMs5$a;->c(LMs5;)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0, p1}, LMs5;->c(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public d(I)LMs5;
    .locals 1

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0, p1}, LMs5;->d(I)LMs5;

    move-result-object p1

    return-object p1
.end method

.method public e()I
    .locals 1

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0}, LMs5;->e()I

    move-result v0

    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0, p1}, LMs5;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0, p1}, LMs5;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LMs5$a;->a(LMs5;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getKind()LTs5;
    .locals 1

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0}, LMs5;->getKind()LTs5;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0}, LMs5;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i(I)Z
    .locals 1

    invoke-virtual {p0}, LCi2$a;->a()LMs5;

    move-result-object v0

    invoke-interface {v0, p1}, LMs5;->i(I)Z

    move-result p1

    return p1
.end method

.method public isInline()Z
    .locals 1

    invoke-static {p0}, LMs5$a;->b(LMs5;)Z

    move-result v0

    return v0
.end method
