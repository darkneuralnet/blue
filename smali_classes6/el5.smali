.class public final Lel5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Ldl5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lpd5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lu62;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LZk5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "Lu62;",
            ">;",
            "LZ94<",
            "LZk5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel5;->a:LZ94;

    iput-object p2, p0, Lel5;->b:LZ94;

    iput-object p3, p0, Lel5;->c:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;)Lel5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "Lu62;",
            ">;",
            "LZ94<",
            "LZk5;",
            ">;)",
            "Lel5;"
        }
    .end annotation

    new-instance v0, Lel5;

    invoke-direct {v0, p0, p1, p2}, Lel5;-><init>(LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lpd5;Lu62;LZk5;)Ldl5;
    .locals 1

    new-instance v0, Ldl5;

    invoke-direct {v0, p0, p1, p2}, Ldl5;-><init>(Lpd5;Lu62;LZk5;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldl5;
    .locals 3

    iget-object v0, p0, Lel5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpd5;

    iget-object v1, p0, Lel5;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu62;

    iget-object v2, p0, Lel5;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZk5;

    invoke-static {v0, v1, v2}, Lel5;->c(Lpd5;Lu62;LZk5;)Ldl5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lel5;->b()Ldl5;

    move-result-object v0

    return-object v0
.end method
