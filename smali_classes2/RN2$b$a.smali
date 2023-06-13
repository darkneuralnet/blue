.class public final LRN2$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRN2$b;-><init>(LRN2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LxN2<",
        "TS;>;",
        "LsN2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LAN2;",
        "S",
        "LxN2;",
        "it",
        "LsN2;",
        "a",
        "(LxN2;)LsN2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:LRN2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRN2<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRN2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRN2<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, LRN2$b$a;->g:LRN2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LxN2;)LsN2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxN2<",
            "TS;>;)",
            "LsN2;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LRN2$b$a;->g:LRN2;

    invoke-virtual {p1}, LRN2;->getConfig()LSN2;

    move-result-object p1

    iget-object v0, p0, LRN2$b$a;->g:LRN2;

    invoke-virtual {p1, v0}, LSN2;->e(LRN2;)LsN2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LxN2;

    invoke-virtual {p0, p1}, LRN2$b$a;->a(LxN2;)LsN2;

    move-result-object p1

    return-object p1
.end method
