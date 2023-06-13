.class public final LXj6$g;
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
        "LA52;",
        "Ltf;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LA52;",
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
.field public static final g:LXj6$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LXj6$g;

    invoke-direct {v0}, LXj6$g;-><init>()V

    sput-object v0, LXj6$g;->g:LXj6$g;

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

    invoke-static {p1, p2}, LA52;->j(J)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1, p2}, LA52;->k(J)I

    move-result p1

    int-to-float p1, p1

    invoke-direct {v0, v1, p1}, Ltf;-><init>(FF)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LA52;

    invoke-virtual {p1}, LA52;->n()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LXj6$g;->a(J)Ltf;

    move-result-object p1

    return-object p1
.end method
