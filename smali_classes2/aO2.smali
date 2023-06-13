.class public final LaO2;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "LRN2<",
        "TS;>;S::",
        "LAN2;",
        ">",
        "LOr6;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0018\u0000*\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00010\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u000f\u0012\u0006\u0010\u000c\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u0007\u001a\u00020\u0006H\u0014R\u0017\u0010\u000c\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "LaO2;",
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "LOr6;",
        "",
        "onCleared",
        "a",
        "LRN2;",
        "e",
        "()LRN2;",
        "viewModel",
        "<init>",
        "(LRN2;)V",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:LRN2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TVM;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRN2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVM;)V"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, LaO2;->a:LRN2;

    return-void
.end method


# virtual methods
.method public final e()LRN2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TVM;"
        }
    .end annotation

    iget-object v0, p0, LaO2;->a:LRN2;

    return-object v0
.end method

.method public onCleared()V
    .locals 1

    invoke-super {p0}, LOr6;->onCleared()V

    iget-object v0, p0, LaO2;->a:LRN2;

    invoke-virtual {v0}, LRN2;->onCleared()V

    return-void
.end method
