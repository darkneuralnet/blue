.class public final Lis5$c;
.super LgV2$c;
.source "SourceFile"

# interfaces
.implements Lgs5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis5;->b(LCb5;Lkotlin/jvm/functions/Function1;)Lis5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "is5$c",
        "Lgs5;",
        "LgV2$c;",
        "Lbs5;",
        "l",
        "Lbs5;",
        "H",
        "()Lbs5;",
        "semanticsConfiguration",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final l:Lbs5;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lss5;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LgV2$c;-><init>()V

    new-instance v0, Lbs5;

    invoke-direct {v0}, Lbs5;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbs5;->w(Z)V

    invoke-virtual {v0, v1}, Lbs5;->v(Z)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lis5$c;->l:Lbs5;

    return-void
.end method


# virtual methods
.method public H()Lbs5;
    .locals 1

    iget-object v0, p0, Lis5$c;->l:Lbs5;

    return-object v0
.end method
