.class public interface abstract LH16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH16$a;,
        LH16$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0008`\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016J\u0016\u0010\u0005\u001a\u00020\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0004H\u0016R\u001d\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00f8\u0001\u0003\u0082\u0002\u0015\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "LH16;",
        "",
        "other",
        "c",
        "Lkotlin/Function0;",
        "b",
        "Lpm0;",
        "a",
        "()J",
        "color",
        "La30;",
        "d",
        "()La30;",
        "brush",
        "",
        "h",
        "()F",
        "alpha",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LH16$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LH16$a;->a:LH16$a;

    sput-object v0, LH16;->a:LH16$a;

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method

.method public b(Lkotlin/jvm/functions/Function0;)LH16;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "LH16;",
            ">;)",
            "LH16;"
        }
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LH16$b;->b:LH16$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LH16;

    :goto_0
    return-object p1
.end method

.method public c(LH16;)LH16;
    .locals 3

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lc30;

    if-eqz v0, :cond_0

    instance-of v1, p0, Lc30;

    if-eqz v1, :cond_0

    new-instance v0, Lc30;

    move-object v1, p1

    check-cast v1, Lc30;

    invoke-virtual {v1}, Lc30;->e()LLx5;

    move-result-object v1

    invoke-interface {p1}, LH16;->h()F

    move-result p1

    new-instance v2, LH16$c;

    invoke-direct {v2, p0}, LH16$c;-><init>(LH16;)V

    invoke-static {p1, v2}, La16;->a(FLkotlin/jvm/functions/Function0;)F

    move-result p1

    invoke-direct {v0, v1, p1}, Lc30;-><init>(LLx5;F)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    instance-of v1, p0, Lc30;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    instance-of v0, p0, Lc30;

    if-eqz v0, :cond_2

    move-object p1, p0

    goto :goto_0

    :cond_2
    new-instance v0, LH16$d;

    invoke-direct {v0, p0}, LH16$d;-><init>(LH16;)V

    invoke-interface {p1, v0}, LH16;->b(Lkotlin/jvm/functions/Function0;)LH16;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public abstract d()La30;
.end method

.method public abstract h()F
.end method
