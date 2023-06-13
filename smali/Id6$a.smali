.class public final LId6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LId6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\"\u0004\u0008\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LId6$a;",
        "",
        "a",
        "LId6$a;",
        "()LId6$a;",
        "c",
        "(LId6$a;)V",
        "next",
        "LF16;",
        "b",
        "LF16;",
        "()LF16;",
        "d",
        "(LF16;)V",
        "value",
        "<init>",
        "(LId6$a;LF16;)V",
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
.field public a:LId6$a;

.field public b:LF16;


# direct methods
.method public constructor <init>(LId6$a;LF16;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LId6$a;->a:LId6$a;

    iput-object p2, p0, LId6$a;->b:LF16;

    return-void
.end method


# virtual methods
.method public final a()LId6$a;
    .locals 1

    iget-object v0, p0, LId6$a;->a:LId6$a;

    return-object v0
.end method

.method public final b()LF16;
    .locals 1

    iget-object v0, p0, LId6$a;->b:LF16;

    return-object v0
.end method

.method public final c(LId6$a;)V
    .locals 0

    iput-object p1, p0, LId6$a;->a:LId6$a;

    return-void
.end method

.method public final d(LF16;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LId6$a;->b:LF16;

    return-void
.end method
