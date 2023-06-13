.class public final Lv62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lu62;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LGk5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LZ92;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LGk5;",
            ">;",
            "LZ94<",
            "LZ92;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv62;->a:LZ94;

    iput-object p2, p0, Lv62;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lv62;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LGk5;",
            ">;",
            "LZ94<",
            "LZ92;",
            ">;)",
            "Lv62;"
        }
    .end annotation

    new-instance v0, Lv62;

    invoke-direct {v0, p0, p1}, Lv62;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(LGk5;LZ92;)Lu62;
    .locals 1

    new-instance v0, Lu62;

    invoke-direct {v0, p0, p1}, Lu62;-><init>(LGk5;LZ92;)V

    return-object v0
.end method


# virtual methods
.method public b()Lu62;
    .locals 2

    iget-object v0, p0, Lv62;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGk5;

    iget-object v1, p0, Lv62;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ92;

    invoke-static {v0, v1}, Lv62;->c(LGk5;LZ92;)Lu62;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv62;->b()Lu62;

    move-result-object v0

    return-object v0
.end method
