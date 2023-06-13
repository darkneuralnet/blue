.class public final LMe$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe;->c(ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGB5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LG52;",
        "LG52;",
        "LjO5<",
        "LG52;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LG52;",
        "<anonymous parameter 0>",
        "<anonymous parameter 1>",
        "LjO5;",
        "a",
        "(JJ)LjO5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LMe$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LMe$e;

    invoke-direct {v0}, LMe$e;-><init>()V

    sput-object v0, LMe$e;->g:LMe$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JJ)LjO5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "LjO5<",
            "LG52;",
            ">;"
        }
    .end annotation

    sget-object p1, LG52;->b:LG52$a;

    invoke-static {p1}, LDu6;->d(LG52$a;)J

    move-result-wide p1

    invoke-static {p1, p2}, LG52;->b(J)LG52;

    move-result-object p1

    const/4 p2, 0x3

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static {p4, p4, p1, p2, p3}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LG52;

    invoke-virtual {p1}, LG52;->j()J

    move-result-wide v0

    check-cast p2, LG52;

    invoke-virtual {p2}, LG52;->j()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, LMe$e;->a(JJ)LjO5;

    move-result-object p1

    return-object p1
.end method
