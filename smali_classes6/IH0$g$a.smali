.class public LIH0$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ94;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIH0$g;->j(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZ94<",
        "Lgy0$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LIH0$g;


# direct methods
.method public constructor <init>(LIH0$g;)V
    .locals 0

    iput-object p1, p0, LIH0$g$a;->a:LIH0$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lgy0$a;
    .locals 4

    new-instance v0, LIH0$d;

    iget-object v1, p0, LIH0$g$a;->a:LIH0$g;

    invoke-static {v1}, LIH0$g;->f(LIH0$g;)LIH0$c;

    move-result-object v1

    iget-object v2, p0, LIH0$g$a;->a:LIH0$g;

    invoke-static {v2}, LIH0$g;->g(LIH0$g;)LIH0$g;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LIH0$d;-><init>(LIH0$c;LIH0$g;LIH0$a;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIH0$g$a;->a()Lgy0$a;

    move-result-object v0

    return-object v0
.end method
