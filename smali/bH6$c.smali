.class public final LbH6$c;
.super LYD3$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbH6;->v(LYD3$c;LYD3$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYD3$b<",
        "TK;TA;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "bH6$c",
        "LYD3$b;",
        "",
        "data",
        "",
        "position",
        "totalCount",
        "previousPageKey",
        "nextPageKey",
        "",
        "a",
        "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V",
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
.field public final synthetic a:LbH6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbH6<",
            "TK;TA;TB;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LYD3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYD3$b<",
            "TK;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LbH6;LYD3$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LbH6<",
            "TK;TA;TB;>;",
            "LYD3$b<",
            "TK;TB;>;)V"
        }
    .end annotation

    iput-object p1, p0, LbH6$c;->a:LbH6;

    iput-object p2, p0, LbH6$c;->b:LYD3$b;

    invoke-direct {p0}, LYD3$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TA;>;IITK;TK;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LWS0;->e:LWS0$b;

    iget-object v1, p0, LbH6$c;->a:LbH6;

    invoke-static {v1}, LbH6;->D(LbH6;)LxA1;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LWS0$b;->a(LxA1;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iget-object v2, p0, LbH6$c;->b:LYD3$b;

    move v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v7}, LYD3$b;->a(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
