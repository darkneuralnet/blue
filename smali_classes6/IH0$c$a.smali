.class public LIH0$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ94;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIH0$c;->m(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZ94<",
        "LC21$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LIH0$c;


# direct methods
.method public constructor <init>(LIH0$c;)V
    .locals 0

    iput-object p1, p0, LIH0$c$a;->a:LIH0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LC21$a;
    .locals 3

    new-instance v0, LIH0$f;

    iget-object v1, p0, LIH0$c$a;->a:LIH0$c;

    invoke-static {v1}, LIH0$c;->f(LIH0$c;)LIH0$c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LIH0$f;-><init>(LIH0$c;LIH0$a;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIH0$c$a;->a()LC21$a;

    move-result-object v0

    return-object v0
.end method
