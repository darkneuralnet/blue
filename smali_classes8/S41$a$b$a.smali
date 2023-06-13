.class public final LS41$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS41$a$b;->a(Lkotlin/jvm/functions/Function1;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LS41$a;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(LS41$a;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, LS41$a$b$a;->b:LS41$a;

    iput-object p2, p0, LS41$a$b$a;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LS41$a$b$a;->b:LS41$a;

    invoke-static {v0}, LS41$a;->g(LS41$a;)LFh0;

    move-result-object v0

    iget-object v1, p0, LS41$a$b$a;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
