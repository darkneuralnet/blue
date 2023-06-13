.class public final Ldq5$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWp5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq5$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "dq5$c$b",
        "LWp5;",
        "",
        "pixels",
        "a",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Ldq5;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldq5;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq5;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "LCe3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq5$c$b;->a:Ldq5;

    iput-object p2, p0, Ldq5$c$b;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 4

    iget-object v0, p0, Ldq5$c$b;->a:Ldq5;

    iget-object v1, p0, Ldq5$c$b;->b:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, p1}, Ldq5;->q(F)J

    move-result-wide v2

    invoke-static {v2, v3}, LCe3;->d(J)LCe3;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ldq5;->p(J)F

    move-result p1

    return p1
.end method
