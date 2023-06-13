.class public final LCk1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLk1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCk1;->a(LCk1$b;LCk1$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "Ck1$c",
        "LLk1$a;",
        "",
        "a",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LCk1$a;

.field public final synthetic b:LCk1$b;


# direct methods
.method public constructor <init>(LCk1$a;LCk1$b;)V
    .locals 0

    iput-object p1, p0, LCk1$c;->a:LCk1$a;

    iput-object p2, p0, LCk1$c;->b:LCk1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LCk1$c;->a:LCk1$a;

    iget-object v1, p0, LCk1$c;->b:LCk1$b;

    invoke-static {v1}, LCk1;->g(LCk1$b;)Z

    move-result v1

    invoke-interface {v0, v1}, LCk1$a;->a(Z)V

    return-void
.end method
