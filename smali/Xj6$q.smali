.class public final LXj6$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXj6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LxB5;",
        "Ltf;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LxB5;",
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
.field public static final g:LXj6$q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LXj6$q;

    invoke-direct {v0}, LXj6$q;-><init>()V

    sput-object v0, LXj6$q;->g:LXj6$q;

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

    new-instance v0, Ltf;

    invoke-static {p1, p2}, LxB5;->i(J)F

    move-result v1

    invoke-static {p1, p2}, LxB5;->g(J)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ltf;-><init>(FF)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LxB5;

    invoke-virtual {p1}, LxB5;->n()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LXj6$q;->a(J)Ltf;

    move-result-object p1

    return-object p1
.end method
