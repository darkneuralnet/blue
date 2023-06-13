.class public LDd1$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj1$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDd1$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luj1$d<",
        "LrV0<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LDd1$a;


# direct methods
.method public constructor <init>(LDd1$a;)V
    .locals 0

    iput-object p1, p0, LDd1$a$a;->a:LDd1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LrV0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrV0<",
            "*>;"
        }
    .end annotation

    new-instance v0, LrV0;

    iget-object v1, p0, LDd1$a$a;->a:LDd1$a;

    iget-object v2, v1, LDd1$a;->a:LrV0$e;

    iget-object v1, v1, LDd1$a;->b:LgY3;

    invoke-direct {v0, v2, v1}, LrV0;-><init>(LrV0$e;LgY3;)V

    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDd1$a$a;->a()LrV0;

    move-result-object v0

    return-object v0
.end method
