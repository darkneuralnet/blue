.class public final LSh2$b;
.super LPh2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "LSh2$b;",
        "LPh2;",
        "",
        "cause",
        "",
        "P",
        "LSh2;",
        "f",
        "LSh2;",
        "parent",
        "LSh2$c;",
        "g",
        "LSh2$c;",
        "state",
        "LKi0;",
        "h",
        "LKi0;",
        "child",
        "",
        "i",
        "Ljava/lang/Object;",
        "proposedUpdate",
        "<init>",
        "(LSh2;LSh2$c;LKi0;Ljava/lang/Object;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final f:LSh2;

.field public final g:LSh2$c;

.field public final h:LKi0;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LSh2;LSh2$c;LKi0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LPh2;-><init>()V

    iput-object p1, p0, LSh2$b;->f:LSh2;

    iput-object p2, p0, LSh2$b;->g:LSh2$c;

    iput-object p3, p0, LSh2$b;->h:LKi0;

    iput-object p4, p0, LSh2$b;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public P(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, LSh2$b;->f:LSh2;

    iget-object v0, p0, LSh2$b;->g:LSh2$c;

    iget-object v1, p0, LSh2$b;->h:LKi0;

    iget-object v2, p0, LSh2$b;->i:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, LSh2;->T(LSh2;LSh2$c;LKi0;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LSh2$b;->P(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
