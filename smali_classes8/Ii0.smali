.class public final LIi0;
.super LAh2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u00068\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LIi0;",
        "LAh2;",
        "",
        "cause",
        "",
        "P",
        "LXc0;",
        "f",
        "LXc0;",
        "child",
        "<init>",
        "(LXc0;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final f:LXc0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LXc0<",
            "*>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LXc0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXc0<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, LAh2;-><init>()V

    iput-object p1, p0, LIi0;->f:LXc0;

    return-void
.end method


# virtual methods
.method public P(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LIi0;->f:LXc0;

    invoke-virtual {p0}, LPh2;->Q()LSh2;

    move-result-object v0

    invoke-virtual {p1, v0}, LXc0;->p(Lzh2;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LXc0;->D(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LIi0;->P(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
