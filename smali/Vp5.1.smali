.class public final LVp5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LlD3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0008\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR$\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000f\u001a\u0004\u0008\u0003\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\t\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u0018\u0010\u001cR$\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001b\"\u0004\u0008\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "LVp5;",
        "LlD3;",
        "",
        "b",
        "I",
        "d",
        "()I",
        "semanticsNodeId",
        "",
        "c",
        "Ljava/util/List;",
        "getAllScopes",
        "()Ljava/util/List;",
        "allScopes",
        "",
        "Ljava/lang/Float;",
        "()Ljava/lang/Float;",
        "g",
        "(Ljava/lang/Float;)V",
        "oldXValue",
        "e",
        "h",
        "oldYValue",
        "LQp5;",
        "f",
        "LQp5;",
        "a",
        "()LQp5;",
        "(LQp5;)V",
        "horizontalScrollAxisRange",
        "i",
        "verticalScrollAxisRange",
        "",
        "L",
        "()Z",
        "isValidOwnerScope",
        "<init>",
        "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LQp5;LQp5;)V",
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
.field public final b:I

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LVp5;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Float;

.field public e:Ljava/lang/Float;

.field public f:LQp5;

.field public g:LQp5;


# direct methods
.method public constructor <init>(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LQp5;LQp5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LVp5;",
            ">;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "LQp5;",
            "LQp5;",
            ")V"
        }
    .end annotation

    const-string v0, "allScopes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LVp5;->b:I

    iput-object p2, p0, LVp5;->c:Ljava/util/List;

    iput-object p3, p0, LVp5;->d:Ljava/lang/Float;

    iput-object p4, p0, LVp5;->e:Ljava/lang/Float;

    iput-object p5, p0, LVp5;->f:LQp5;

    iput-object p6, p0, LVp5;->g:LQp5;

    return-void
.end method


# virtual methods
.method public L()Z
    .locals 1

    iget-object v0, p0, LVp5;->c:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final a()LQp5;
    .locals 1

    iget-object v0, p0, LVp5;->f:LQp5;

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LVp5;->d:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LVp5;->e:Ljava/lang/Float;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LVp5;->b:I

    return v0
.end method

.method public final e()LQp5;
    .locals 1

    iget-object v0, p0, LVp5;->g:LQp5;

    return-object v0
.end method

.method public final f(LQp5;)V
    .locals 0

    iput-object p1, p0, LVp5;->f:LQp5;

    return-void
.end method

.method public final g(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, LVp5;->d:Ljava/lang/Float;

    return-void
.end method

.method public final h(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, LVp5;->e:Ljava/lang/Float;

    return-void
.end method

.method public final i(LQp5;)V
    .locals 0

    iput-object p1, p0, LVp5;->g:LQp5;

    return-void
.end method
