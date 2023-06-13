.class public abstract Loj2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LKj2<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Loj2;",
        "",
        "T",
        "LKj2;",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lrb1;Ljava/lang/Object;)V",
        "LGV0;",
        "decoder",
        "deserialize",
        "(LGV0;)Ljava/lang/Object;",
        "Lxi2;",
        "element",
        "transformDeserialize",
        "transformSerialize",
        "tSerializer",
        "LKj2;",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "descriptor",
        "<init>",
        "(LKj2;)V",
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
.field private final tSerializer:LKj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKj2<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LKj2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKj2<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "tSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loj2;->tSerializer:LKj2;

    return-void
.end method


# virtual methods
.method public final deserialize(LGV0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGV0;",
            ")TT;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->d(LGV0;)Lsi2;

    move-result-object p1

    invoke-interface {p1}, Lsi2;->v()Lxi2;

    move-result-object v0

    invoke-interface {p1}, Lsi2;->d()Lbi2;

    move-result-object p1

    iget-object v1, p0, Loj2;->tSerializer:LKj2;

    invoke-virtual {p0, v0}, Loj2;->transformDeserialize(Lxi2;)Lxi2;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lbi2;->a(LE01;Lxi2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    iget-object v0, p0, Loj2;->tSerializer:LKj2;

    invoke-interface {v0}, LKj2;->getDescriptor()LMs5;

    move-result-object v0

    return-object v0
.end method

.method public final serialize(Lrb1;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrb1;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->e(Lrb1;)LDi2;

    move-result-object p1

    invoke-interface {p1}, LDi2;->d()Lbi2;

    move-result-object v0

    iget-object v1, p0, Loj2;->tSerializer:LKj2;

    invoke-static {v0, p2, v1}, Lna6;->c(Lbi2;Ljava/lang/Object;Let5;)Lxi2;

    move-result-object p2

    invoke-virtual {p0, p2}, Loj2;->transformSerialize(Lxi2;)Lxi2;

    move-result-object p2

    invoke-interface {p1, p2}, LDi2;->m(Lxi2;)V

    return-void
.end method

.method public transformDeserialize(Lxi2;)Lxi2;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public transformSerialize(Lxi2;)Lxi2;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
