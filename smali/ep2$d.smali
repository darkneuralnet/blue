.class public final Lep2$d;
.super LZD3$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep2;-><init>(LZC0;LZD3$d;LfE3;LSC0;LSC0;Lep2$b;Lep2$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "ep2$d",
        "LZD3$e;",
        "Lpt2;",
        "type",
        "Lot2;",
        "state",
        "",
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
.field public final synthetic d:Lep2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lep2<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lep2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep2<",
            "TK;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lep2$d;->d:Lep2;

    invoke-direct {p0}, LZD3$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lpt2;Lot2;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lep2$d;->d:Lep2;

    invoke-virtual {v0}, Lep2;->g()Lep2$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lep2$b;->j(Lpt2;Lot2;)V

    return-void
.end method
