.class public final LxF5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwF5;


# instance fields
.field public final a:LvF5;


# direct methods
.method public constructor <init>(LvF5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxF5;->a:LvF5;

    return-void
.end method

.method public static b(LvF5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvF5;",
            ")",
            "LY94<",
            "LwF5;",
            ">;"
        }
    .end annotation

    new-instance v0, LxF5;

    invoke-direct {v0, p0}, LxF5;-><init>(LvF5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LZC0;LsE5;Z)LuF5;
    .locals 1

    iget-object v0, p0, LxF5;->a:LvF5;

    invoke-virtual {v0, p1, p2, p3}, LvF5;->b(LZC0;LsE5;Z)LuF5;

    move-result-object p1

    return-object p1
.end method
