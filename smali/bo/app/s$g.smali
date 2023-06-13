.class final Lbo/app/s$g;
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

.field final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbo/app/s;Lbo/app/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbo/app/s$g;->b:Lbo/app/s;

    iput-object p2, p0, Lbo/app/s$g;->c:Lbo/app/d;

    iput-object p3, p0, Lbo/app/s$g;->d:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lbo/app/s$g;->b:Lbo/app/s;

    invoke-static {v0}, Lbo/app/s;->b(Lbo/app/s;)Lbo/app/y;

    move-result-object v0

    iget-object v1, p0, Lbo/app/s$g;->c:Lbo/app/d;

    invoke-virtual {v1}, Lbo/app/d;->a()Lbo/app/x;

    move-result-object v1

    iget-object v2, p0, Lbo/app/s$g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbo/app/y;->a(Lbo/app/x;Ljava/lang/String;)LfA0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lbo/app/s$g;->b:Lbo/app/s;

    invoke-static {v1}, Lbo/app/s;->c(Lbo/app/s;)Lbo/app/g2;

    move-result-object v1

    const-class v2, LfA0;

    invoke-interface {v1, v0, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbo/app/s$g;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
