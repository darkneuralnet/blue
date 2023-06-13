.class public final LFo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ-\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u001a\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "LFo2;",
        "",
        "Luc2;",
        "index",
        "",
        "mainAxisSpacing",
        "Lkz0;",
        "constraints",
        "Lyn2;",
        "a",
        "(IIJ)Lyn2;",
        "Lon2;",
        "Lon2;",
        "itemProvider",
        "LVn2;",
        "b",
        "LVn2;",
        "measureScope",
        "c",
        "I",
        "defaultMainAxisSpacing",
        "LBO2;",
        "d",
        "LBO2;",
        "measuredItemFactory",
        "",
        "()Ljava/util/Map;",
        "keyToIndexMap",
        "<init>",
        "(Lon2;LVn2;ILBO2;)V",
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
.field public final a:Lon2;

.field public final b:LVn2;

.field public final c:I

.field public final d:LBO2;


# direct methods
.method public constructor <init>(Lon2;LVn2;ILBO2;)V
    .locals 1

    const-string v0, "itemProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measureScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measuredItemFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFo2;->a:Lon2;

    iput-object p2, p0, LFo2;->b:LVn2;

    iput p3, p0, LFo2;->c:I

    iput-object p4, p0, LFo2;->d:LBO2;

    return-void
.end method

.method public static synthetic b(LFo2;IIJILjava/lang/Object;)Lyn2;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    iget p2, p0, LFo2;->c:I

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LFo2;->a(IIJ)Lyn2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IIJ)Lyn2;
    .locals 7

    iget-object v0, p0, LFo2;->a:Lon2;

    invoke-interface {v0, p1}, LRn2;->c(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p0, LFo2;->b:LVn2;

    invoke-interface {v0, p1, p3, p4}, LVn2;->M(IJ)Ljava/util/List;

    move-result-object v6

    invoke-static {p3, p4}, Lkz0;->l(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, Lkz0;->p(J)I

    move-result p3

    :goto_0
    move v4, p3

    goto :goto_1

    :cond_0
    invoke-static {p3, p4}, Lkz0;->k(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3, p4}, Lkz0;->o(J)I

    move-result p3

    goto :goto_0

    :goto_1
    iget-object v1, p0, LFo2;->d:LBO2;

    move v2, p1

    move v5, p2

    invoke-interface/range {v1 .. v6}, LBO2;->a(ILjava/lang/Object;IILjava/util/List;)Lyn2;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LFo2;->a:Lon2;

    invoke-interface {v0}, LRn2;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
