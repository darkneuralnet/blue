.class public final LCk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Luk5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lvk5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lxk5;",
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
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Lvk5;",
            ">;",
            "LZ94<",
            "Lxk5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCk0;->a:LZ94;

    iput-object p2, p0, LCk0;->b:LZ94;

    iput-object p3, p0, LCk0;->c:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;)LCk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Lvk5;",
            ">;",
            "LZ94<",
            "Lxk5;",
            ">;)",
            "LCk0;"
        }
    .end annotation

    new-instance v0, LCk0;

    invoke-direct {v0, p0, p1, p2}, LCk0;-><init>(LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(ILZ94;LZ94;)Luk5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZ94<",
            "Lvk5;",
            ">;",
            "LZ94<",
            "Lxk5;",
            ">;)",
            "Luk5;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lgk0$c;->v(ILZ94;LZ94;)Luk5;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Luk5;

    return-object p0
.end method


# virtual methods
.method public b()Luk5;
    .locals 3

    iget-object v0, p0, LCk0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, LCk0;->b:LZ94;

    iget-object v2, p0, LCk0;->c:LZ94;

    invoke-static {v0, v1, v2}, LCk0;->c(ILZ94;LZ94;)Luk5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LCk0;->b()Luk5;

    move-result-object v0

    return-object v0
.end method
