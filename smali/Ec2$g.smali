.class public final LEc2$g;
.super LEc2$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEc2;->w(LEc2$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEc2$b<",
        "TValue;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00072\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Ec2$g",
        "LEc2$b;",
        "",
        "data",
        "",
        "position",
        "totalCount",
        "",
        "b",
        "a",
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
.field public final synthetic a:LWc0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWc0<",
            "LWS0$a<",
            "TValue;>;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LEc2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEc2<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LWc0;LEc2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "-",
            "LWS0$a<",
            "TValue;>;>;",
            "LEc2<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    iput-object p1, p0, LEc2$g;->a:LWc0;

    iput-object p2, p0, LEc2$g;->b:LEc2;

    invoke-direct {p0}, LEc2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LEc2$g;->a:LWc0;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, LWS0$a;

    iget-object v2, p0, LEc2$g;->b:LEc2;

    invoke-virtual {v2, p1}, LEc2;->q(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    iget-object v2, p0, LEc2$g;->b:LEc2;

    invoke-virtual {v2, p1}, LEc2;->p(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, LWS0$a;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/util/List;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;II)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LEc2$g;->a:LWc0;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, LWS0$a;

    iget-object v2, p0, LEc2$g;->b:LEc2;

    invoke-virtual {v2, p1}, LEc2;->q(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    iget-object v2, p0, LEc2$g;->b:LEc2;

    invoke-virtual {v2, p1}, LEc2;->p(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr p3, v2

    sub-int v7, p3, p2

    move-object v2, v1

    move-object v3, p1

    move v6, p2

    invoke-direct/range {v2 .. v7}, LWS0$a;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
