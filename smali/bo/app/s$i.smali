.class final Lbo/app/s$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbo/app/s;->b(Lbo/app/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "a",
        "()V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field final synthetic b:Lbo/app/s;

.field final synthetic c:Lbo/app/d;


# direct methods
.method public constructor <init>(Lbo/app/s;Lbo/app/d;)V
    .locals 0

    iput-object p1, p0, Lbo/app/s$i;->b:Lbo/app/s;

    iput-object p2, p0, Lbo/app/s$i;->c:Lbo/app/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lbo/app/s$i;->b:Lbo/app/s;

    invoke-static {v0}, Lbo/app/s;->e(Lbo/app/s;)Lbo/app/g2;

    move-result-object v0

    new-instance v1, Lbo/app/n6;

    iget-object v2, p0, Lbo/app/s$i;->c:Lbo/app/d;

    invoke-virtual {v2}, Lbo/app/d;->g()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lbo/app/n6;-><init>(Ljava/util/List;)V

    const-class v2, Lbo/app/n6;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbo/app/s$i;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
