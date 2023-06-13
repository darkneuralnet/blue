.class public final Lvo6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\n\u001a\u00020\t\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u000c\u001a\u00020\u0006R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000eR+\u0010\u0015\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u000b\"\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0018"
    }
    d2 = {
        "Lvo6;",
        "",
        "",
        "timeMillis",
        "LCe3;",
        "position",
        "",
        "a",
        "(JJ)V",
        "Lro6;",
        "b",
        "()J",
        "d",
        "Luo6;",
        "Luo6;",
        "xVelocityTracker",
        "yVelocityTracker",
        "c",
        "J",
        "e",
        "(J)V",
        "currentPointerPositionAccumulator",
        "<init>",
        "()V",
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
.field public final a:Luo6;

.field public final b:Luo6;

.field public c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Luo6;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3, v2}, Luo6;-><init>(ZLuo6$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lvo6;->a:Luo6;

    new-instance v0, Luo6;

    invoke-direct {v0, v1, v2, v3, v2}, Luo6;-><init>(ZLuo6$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lvo6;->b:Luo6;

    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lvo6;->c:J

    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    iget-object v0, p0, Lvo6;->a:Luo6;

    invoke-static {p3, p4}, LCe3;->o(J)F

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Luo6;->a(JF)V

    iget-object v0, p0, Lvo6;->b:Luo6;

    invoke-static {p3, p4}, LCe3;->p(J)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Luo6;->a(JF)V

    return-void
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Lvo6;->a:Luo6;

    invoke-virtual {v0}, Luo6;->c()F

    move-result v0

    iget-object v1, p0, Lvo6;->b:Luo6;

    invoke-virtual {v1}, Luo6;->c()F

    move-result v1

    invoke-static {v0, v1}, Lso6;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lvo6;->c:J

    return-wide v0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lvo6;->a:Luo6;

    invoke-virtual {v0}, Luo6;->d()V

    iget-object v0, p0, Lvo6;->b:Luo6;

    invoke-virtual {v0}, Luo6;->d()V

    return-void
.end method

.method public final e(J)V
    .locals 0

    iput-wide p1, p0, Lvo6;->c:J

    return-void
.end method
