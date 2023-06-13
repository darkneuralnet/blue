.class public final Lbo2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lao2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbo2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R \u0010\u000e\u001a\u00020\n8\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0005\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019\"\u0004\u0008\u001d\u0010\u001b\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006!"
    }
    d2 = {
        "Lbo2$b;",
        "Lao2$a;",
        "",
        "cancel",
        "",
        "a",
        "I",
        "c",
        "()I",
        "index",
        "Lkz0;",
        "b",
        "J",
        "()J",
        "constraints",
        "LZS5$a;",
        "LZS5$a;",
        "e",
        "()LZS5$a;",
        "f",
        "(LZS5$a;)V",
        "precomposeHandle",
        "",
        "d",
        "Z",
        "()Z",
        "setCanceled",
        "(Z)V",
        "canceled",
        "setMeasured",
        "measured",
        "<init>",
        "(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
.field public final a:I

.field public final b:J

.field public c:LZS5$a;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbo2$b;->a:I

    iput-wide p2, p0, Lbo2$b;->b:J

    return-void
.end method

.method public synthetic constructor <init>(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lbo2$b;-><init>(IJ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lbo2$b;->d:Z

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lbo2$b;->b:J

    return-wide v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lbo2$b;->a:I

    return v0
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lbo2$b;->d:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbo2$b;->d:Z

    iget-object v0, p0, Lbo2$b;->c:LZS5$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LZS5$a;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lbo2$b;->c:LZS5$a;

    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lbo2$b;->e:Z

    return v0
.end method

.method public final e()LZS5$a;
    .locals 1

    iget-object v0, p0, Lbo2$b;->c:LZS5$a;

    return-object v0
.end method

.method public final f(LZS5$a;)V
    .locals 0

    iput-object p1, p0, Lbo2$b;->c:LZS5$a;

    return-void
.end method
