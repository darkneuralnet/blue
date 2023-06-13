.class public final LXj6$p;
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
        "Luf;",
        "LOs4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Luf;",
        "it",
        "LOs4;",
        "a",
        "(Luf;)LOs4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LXj6$p;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LXj6$p;

    invoke-direct {v0}, LXj6$p;-><init>()V

    sput-object v0, LXj6$p;->g:LXj6$p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Luf;)LOs4;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOs4;

    invoke-virtual {p1}, Luf;->f()F

    move-result v1

    invoke-virtual {p1}, Luf;->g()F

    move-result v2

    invoke-virtual {p1}, Luf;->h()F

    move-result v3

    invoke-virtual {p1}, Luf;->i()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, LOs4;-><init>(FFFF)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luf;

    invoke-virtual {p0, p1}, LXj6$p;->a(Luf;)LOs4;

    move-result-object p1

    return-object p1
.end method
