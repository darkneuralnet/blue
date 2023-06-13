.class public final LWS0$c$b;
.super LWS0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWS0$c;->f(LxA1;)LWS0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LWS0$c<",
        "TKey;TToValue;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "WS0$c$b",
        "LWS0$c;",
        "LWS0;",
        "d",
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
.field public final synthetic a:LWS0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWS0$c<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LxA1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxA1<",
            "Ljava/util/List<",
            "TValue;>;",
            "Ljava/util/List<",
            "TToValue;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LWS0$c;LxA1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWS0$c<",
            "TKey;TValue;>;",
            "LxA1<",
            "Ljava/util/List<",
            "TValue;>;",
            "Ljava/util/List<",
            "TToValue;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LWS0$c$b;->a:LWS0$c;

    iput-object p2, p0, LWS0$c$b;->b:LxA1;

    invoke-direct {p0}, LWS0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d()LWS0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LWS0<",
            "TKey;TToValue;>;"
        }
    .end annotation

    iget-object v0, p0, LWS0$c$b;->a:LWS0$c;

    invoke-virtual {v0}, LWS0$c;->d()LWS0;

    move-result-object v0

    iget-object v1, p0, LWS0$c$b;->b:LxA1;

    invoke-virtual {v0, v1}, LWS0;->mapByPage(LxA1;)LWS0;

    move-result-object v0

    return-object v0
.end method
