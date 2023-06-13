.class public final LTr5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTr5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LCe3;",
        "Ltf;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LCe3;",
        "it",
        "Ltf;",
        "a",
        "(J)Ltf;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LTr5$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LTr5$a;

    invoke-direct {v0}, LTr5$a;-><init>()V

    sput-object v0, LTr5$a;->g:LTr5$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Ltf;
    .locals 2

    invoke-static {p1, p2}, LGe3;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ltf;

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v1

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ltf;-><init>(FF)V

    goto :goto_0

    :cond_0
    invoke-static {}, LTr5;->c()Ltf;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LTr5$a;->a(J)Ltf;

    move-result-object p1

    return-object p1
.end method
