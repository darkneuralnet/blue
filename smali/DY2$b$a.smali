.class public final LDY2$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDY2$b;->g(LAY2;Z)V
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
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LDY2$b;

.field public final synthetic h:LAY2;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(LDY2$b;LAY2;Z)V
    .locals 0

    iput-object p1, p0, LDY2$b$a;->g:LDY2$b;

    iput-object p2, p0, LDY2$b$a;->h:LAY2;

    iput-boolean p3, p0, LDY2$b$a;->i:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDY2$b$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, LDY2$b$a;->g:LDY2$b;

    iget-object v1, p0, LDY2$b$a;->h:LAY2;

    iget-boolean v2, p0, LDY2$b$a;->i:Z

    invoke-static {v0, v1, v2}, LDY2$b;->l(LDY2$b;LAY2;Z)V

    return-void
.end method
