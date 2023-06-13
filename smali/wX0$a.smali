.class public final LwX0$a;
.super Landroidx/emoji2/text/c$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwX0;->c()LsP5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "wX0$a",
        "Landroidx/emoji2/text/c$f;",
        "",
        "b",
        "",
        "throwable",
        "a",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:LwX0;


# direct methods
.method public constructor <init>(LEX2;LwX0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "LwX0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LwX0$a;->a:LEX2;

    iput-object p2, p0, LwX0$a;->b:LwX0;

    invoke-direct {p0}, Landroidx/emoji2/text/c$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LwX0$a;->b:LwX0;

    invoke-static {}, Lza1;->a()LOY1;

    move-result-object v0

    invoke-static {p1, v0}, LwX0;->b(LwX0;LsP5;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, LwX0$a;->a:LEX2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LEX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LwX0$a;->b:LwX0;

    new-instance v1, LOY1;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LOY1;-><init>(Z)V

    invoke-static {v0, v1}, LwX0;->b(LwX0;LsP5;)V

    return-void
.end method
