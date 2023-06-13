.class public final LI12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llf;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Llf<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B,\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001a\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J,\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0007\"\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u001f\u001a\u00020\u001a8\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\""
    }
    d2 = {
        "LI12;",
        "T",
        "Llf;",
        "Lvf;",
        "V",
        "Lwb6;",
        "converter",
        "Llk6;",
        "a",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Lh81;",
        "Lh81;",
        "getAnimation",
        "()Lh81;",
        "animation",
        "LeG4;",
        "b",
        "LeG4;",
        "getRepeatMode",
        "()LeG4;",
        "repeatMode",
        "LKO5;",
        "c",
        "J",
        "getInitialStartOffset-Rmkjzm4",
        "()J",
        "initialStartOffset",
        "<init>",
        "(Lh81;LeG4;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:I = 0x8


# instance fields
.field public final a:Lh81;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh81<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:LeG4;

.field public final c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lh81;LeG4;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh81<",
            "TT;>;",
            "LeG4;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI12;->a:Lh81;

    iput-object p2, p0, LI12;->b:LeG4;

    iput-wide p3, p0, LI12;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Lh81;LeG4;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LI12;-><init>(Lh81;LeG4;J)V

    return-void
.end method


# virtual methods
.method public a(Lwb6;)Llk6;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Lvf;",
            ">(",
            "Lwb6<",
            "TT;TV;>;)",
            "Llk6<",
            "TV;>;"
        }
    .end annotation

    const-string v0, "converter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsk6;

    iget-object v1, p0, LI12;->a:Lh81;

    invoke-interface {v1, p1}, Lh81;->a(Lwb6;)Lok6;

    move-result-object v2

    iget-object v3, p0, LI12;->b:LeG4;

    iget-wide v4, p0, LI12;->c:J

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lsk6;-><init>(Lok6;LeG4;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, LI12;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LI12;

    iget-object v0, p1, LI12;->a:Lh81;

    iget-object v2, p0, LI12;->a:Lh81;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, LI12;->b:LeG4;

    iget-object v2, p0, LI12;->b:LeG4;

    if-ne v0, v2, :cond_0

    iget-wide v2, p1, LI12;->c:J

    iget-wide v4, p0, LI12;->c:J

    invoke-static {v2, v3, v4, v5}, LKO5;->d(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LI12;->a:Lh81;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI12;->b:LeG4;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI12;->c:J

    invoke-static {v1, v2}, LKO5;->e(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
