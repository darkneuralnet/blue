.class public final LFX$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFX$e;->a(Ljava/util/concurrent/PriorityBlockingQueue;)LWX;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lci3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lci3;",
        "b",
        "()Lci3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LFX$e$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFX$e$a;

    invoke-direct {v0}, LFX$e$a;-><init>()V

    sput-object v0, LFX$e$a;->g:LFX$e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lci3;
    .locals 2

    new-instance v0, Lci3;

    sget-object v1, Lbi3;->c:Lbi3;

    invoke-direct {v0, v1}, Lci3;-><init>(Lbi3;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFX$e$a;->b()Lci3;

    move-result-object v0

    return-object v0
.end method
