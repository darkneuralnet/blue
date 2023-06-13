.class public final LbH6$b;
.super LYD3$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbH6;->t(LYD3$d;LYD3$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYD3$a<",
        "TK;TA;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\'\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "bH6$b",
        "LYD3$a;",
        "",
        "data",
        "adjacentPageKey",
        "",
        "a",
        "(Ljava/util/List;Ljava/lang/Object;)V",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:LYD3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYD3$a<",
            "TK;TB;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LbH6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbH6<",
            "TK;TA;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYD3$a;LbH6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$a<",
            "TK;TB;>;",
            "LbH6<",
            "TK;TA;TB;>;)V"
        }
    .end annotation

    iput-object p1, p0, LbH6$b;->a:LYD3$a;

    iput-object p2, p0, LbH6$b;->b:LbH6;

    invoke-direct {p0}, LYD3$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TA;>;TK;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LbH6$b;->a:LYD3$a;

    sget-object v1, LWS0;->e:LWS0$b;

    iget-object v2, p0, LbH6$b;->b:LbH6;

    invoke-static {v2}, LbH6;->D(LbH6;)LxA1;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, LWS0$b;->a(LxA1;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LYD3$a;->a(Ljava/util/List;Ljava/lang/Object;)V

    return-void
.end method
