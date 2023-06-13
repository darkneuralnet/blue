.class public final LEm2$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEm2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LEm2$b$a;",
        "LyO2;",
        "",
        "c",
        "",
        "LL9;",
        "",
        "a",
        "Ljava/util/Map;",
        "d",
        "()Ljava/util/Map;",
        "alignmentLines",
        "getWidth",
        "()I",
        "width",
        "getHeight",
        "height",
        "<init>",
        "(LEm2$b;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LL9;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:LEm2$b;


# direct methods
.method public constructor <init>(LEm2$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LEm2$b$a;->b:LEm2$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LEm2$b$a;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 7

    sget-object v0, LOU3$a;->a:LOU3$a$a;

    iget-object v1, p0, LEm2$b$a;->b:LEm2$b;

    iget-object v1, v1, LEm2$b;->q:LEm2;

    invoke-virtual {v1}, LEm2;->X2()LH83;

    move-result-object v1

    invoke-virtual {v1}, LH83;->d2()LTC2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LOU3$a;->n(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "LL9;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LEm2$b$a;->a:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LEm2$b$a;->b:LEm2$b;

    iget-object v0, v0, LEm2$b;->q:LEm2;

    invoke-virtual {v0}, LEm2;->X2()LH83;

    move-result-object v0

    invoke-virtual {v0}, LH83;->d2()LTC2;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, LTC2;->s1()LyO2;

    move-result-object v0

    invoke-interface {v0}, LyO2;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LEm2$b$a;->b:LEm2$b;

    iget-object v0, v0, LEm2$b;->q:LEm2;

    invoke-virtual {v0}, LEm2;->X2()LH83;

    move-result-object v0

    invoke-virtual {v0}, LH83;->d2()LTC2;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, LTC2;->s1()LyO2;

    move-result-object v0

    invoke-interface {v0}, LyO2;->getWidth()I

    move-result v0

    return v0
.end method
