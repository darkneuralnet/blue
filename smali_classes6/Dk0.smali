.class public final LDk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lcl5;",
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
            "Ldl5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lfl5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lhl5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Ldl5;",
            ">;",
            "LZ94<",
            "Lfl5;",
            ">;",
            "LZ94<",
            "Lhl5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDk0;->a:LZ94;

    iput-object p2, p0, LDk0;->b:LZ94;

    iput-object p3, p0, LDk0;->c:LZ94;

    iput-object p4, p0, LDk0;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)LDk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Ldl5;",
            ">;",
            "LZ94<",
            "Lfl5;",
            ">;",
            "LZ94<",
            "Lhl5;",
            ">;)",
            "LDk0;"
        }
    .end annotation

    new-instance v0, LDk0;

    invoke-direct {v0, p0, p1, p2, p3}, LDk0;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(ILZ94;LZ94;LZ94;)Lcl5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZ94<",
            "Ldl5;",
            ">;",
            "LZ94<",
            "Lfl5;",
            ">;",
            "LZ94<",
            "Lhl5;",
            ">;)",
            "Lcl5;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lgk0$c;->w(ILZ94;LZ94;LZ94;)Lcl5;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcl5;

    return-object p0
.end method


# virtual methods
.method public b()Lcl5;
    .locals 4

    iget-object v0, p0, LDk0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, LDk0;->b:LZ94;

    iget-object v2, p0, LDk0;->c:LZ94;

    iget-object v3, p0, LDk0;->d:LZ94;

    invoke-static {v0, v1, v2, v3}, LDk0;->c(ILZ94;LZ94;LZ94;)Lcl5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDk0;->b()Lcl5;

    move-result-object v0

    return-object v0
.end method
