.class public final LJq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnV5;
.implements LCZ0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJq$a;,
        LJq$c;,
        LJq$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003!\u0008\u000eB\u0017\u0012\u0006\u0010\u000c\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\u000c\u001a\u00020\u00018\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001b\u00a8\u0006\""
    }
    d2 = {
        "LJq;",
        "LnV5;",
        "LCZ0;",
        "",
        "enabled",
        "",
        "setWriteAheadLoggingEnabled",
        "close",
        "b",
        "LnV5;",
        "getDelegate",
        "()LnV5;",
        "delegate",
        "LIq;",
        "c",
        "LIq;",
        "autoCloser",
        "LJq$a;",
        "d",
        "LJq$a;",
        "autoClosingDb",
        "",
        "getDatabaseName",
        "()Ljava/lang/String;",
        "databaseName",
        "LmV5;",
        "d1",
        "()LmV5;",
        "writableDatabase",
        "V2",
        "readableDatabase",
        "<init>",
        "(LnV5;LIq;)V",
        "a",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:LnV5;

.field public final c:LIq;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final d:LJq$a;


# direct methods
.method public constructor <init>(LnV5;LIq;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJq;->b:LnV5;

    iput-object p2, p0, LJq;->c:LIq;

    invoke-virtual {p0}, LJq;->getDelegate()LnV5;

    move-result-object p1

    invoke-virtual {p2, p1}, LIq;->k(LnV5;)V

    new-instance p1, LJq$a;

    invoke-direct {p1, p2}, LJq$a;-><init>(LIq;)V

    iput-object p1, p0, LJq;->d:LJq$a;

    return-void
.end method


# virtual methods
.method public V2()LmV5;
    .locals 1

    iget-object v0, p0, LJq;->d:LJq$a;

    invoke-virtual {v0}, LJq$a;->a()V

    iget-object v0, p0, LJq;->d:LJq$a;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LJq;->d:LJq$a;

    invoke-virtual {v0}, LJq$a;->close()V

    return-void
.end method

.method public d1()LmV5;
    .locals 1

    iget-object v0, p0, LJq;->d:LJq$a;

    invoke-virtual {v0}, LJq$a;->a()V

    iget-object v0, p0, LJq;->d:LJq$a;

    return-object v0
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJq;->b:LnV5;

    invoke-interface {v0}, LnV5;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()LnV5;
    .locals 1

    iget-object v0, p0, LJq;->b:LnV5;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, LJq;->b:LnV5;

    invoke-interface {v0, p1}, LnV5;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
