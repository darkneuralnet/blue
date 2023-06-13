.class public final LF0$b;
.super Ls0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0;->w0(Ljava/lang/String;LMs5;)LF0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "F0$b",
        "Ls0;",
        "",
        "value",
        "",
        "q",
        "Lkt5;",
        "c",
        "()Lkt5;",
        "serializersModule",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LF0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LMs5;


# direct methods
.method public constructor <init>(LF0;Ljava/lang/String;LMs5;)V
    .locals 0

    iput-object p1, p0, LF0$b;->a:LF0;

    iput-object p2, p0, LF0$b;->b:Ljava/lang/String;

    iput-object p3, p0, LF0$b;->c:LMs5;

    invoke-direct {p0}, Ls0;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lkt5;
    .locals 1

    iget-object v0, p0, LF0$b;->a:LF0;

    invoke-virtual {v0}, LF0;->d()Lbi2;

    move-result-object v0

    invoke-virtual {v0}, Lbi2;->f()Lkt5;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF0$b;->a:LF0;

    iget-object v1, p0, LF0$b;->b:Ljava/lang/String;

    new-instance v2, LKi2;

    const/4 v3, 0x0

    iget-object v4, p0, LF0$b;->c:LMs5;

    invoke-direct {v2, p1, v3, v4}, LKi2;-><init>(Ljava/lang/Object;ZLMs5;)V

    invoke-virtual {v0, v1, v2}, LF0;->y0(Ljava/lang/String;Lxi2;)V

    return-void
.end method
