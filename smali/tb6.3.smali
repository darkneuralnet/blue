.class public final Ltb6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh81;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lh81<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ,\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0007\"\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0010\u001a\u0004\u0008\u0015\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Ltb6;",
        "T",
        "Lh81;",
        "Lvf;",
        "V",
        "Lwb6;",
        "converter",
        "Lwk6;",
        "f",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "a",
        "I",
        "getDurationMillis",
        "()I",
        "durationMillis",
        "b",
        "getDelay",
        "delay",
        "Lh91;",
        "c",
        "Lh91;",
        "getEasing",
        "()Lh91;",
        "easing",
        "<init>",
        "(IILh91;)V",
        "animation-core_release"
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

.field public final b:I

.field public final c:Lh91;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILh91;)V
    .locals 1

    const-string v0, "easing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ltb6;->a:I

    iput p2, p0, Ltb6;->b:I

    iput-object p3, p0, Ltb6;->c:Lh91;

    return-void
.end method

.method public synthetic constructor <init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/16 p1, 0x12c

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-static {}, Li91;->b()Lh91;

    move-result-object p3

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ltb6;-><init>(IILh91;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lwb6;)Llk6;
    .locals 0

    invoke-virtual {p0, p1}, Ltb6;->f(Lwb6;)Lwk6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lwb6;)Lok6;
    .locals 0

    invoke-virtual {p0, p1}, Ltb6;->f(Lwb6;)Lwk6;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ltb6;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ltb6;

    iget v0, p1, Ltb6;->a:I

    iget v2, p0, Ltb6;->a:I

    if-ne v0, v2, :cond_0

    iget v0, p1, Ltb6;->b:I

    iget v2, p0, Ltb6;->b:I

    if-ne v0, v2, :cond_0

    iget-object p1, p1, Ltb6;->c:Lh91;

    iget-object v0, p0, Ltb6;->c:Lh91;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f(Lwb6;)Lwk6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Lvf;",
            ">(",
            "Lwb6<",
            "TT;TV;>;)",
            "Lwk6<",
            "TV;>;"
        }
    .end annotation

    const-string v0, "converter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwk6;

    iget v0, p0, Ltb6;->a:I

    iget v1, p0, Ltb6;->b:I

    iget-object v2, p0, Ltb6;->c:Lh91;

    invoke-direct {p1, v0, v1, v2}, Lwk6;-><init>(IILh91;)V

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Ltb6;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltb6;->c:Lh91;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ltb6;->b:I

    add-int/2addr v0, v1

    return v0
.end method
