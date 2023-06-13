.class public final LaH6$a;
.super LEc2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaH6;->r(LEc2$d;LEc2$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEc2$a<",
        "TA;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "aH6$a",
        "LEc2$a;",
        "",
        "data",
        "",
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
.field public final synthetic a:LEc2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEc2$a<",
            "TB;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LaH6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LaH6<",
            "TK;TA;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEc2$a;LaH6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$a<",
            "TB;>;",
            "LaH6<",
            "TK;TA;TB;>;)V"
        }
    .end annotation

    iput-object p1, p0, LaH6$a;->a:LEc2$a;

    iput-object p2, p0, LaH6$a;->b:LaH6;

    invoke-direct {p0}, LEc2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TA;>;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LaH6$a;->a:LEc2$a;

    iget-object v1, p0, LaH6$a;->b:LaH6;

    invoke-virtual {v1, p1}, LaH6;->E(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LEc2$a;->a(Ljava/util/List;)V

    return-void
.end method
