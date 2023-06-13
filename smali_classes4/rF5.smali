.class public final LrF5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LqF5;


# instance fields
.field public final a:LsF5;


# direct methods
.method public constructor <init>(LsF5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrF5;->a:LsF5;

    return-void
.end method

.method public static b(LsF5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsF5;",
            ")",
            "LY94<",
            "LqF5;",
            ">;"
        }
    .end annotation

    new-instance v0, LrF5;

    invoke-direct {v0, p0}, LrF5;-><init>(LsF5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LZC0;)LpF5;
    .locals 1

    iget-object v0, p0, LrF5;->a:LsF5;

    invoke-virtual {v0, p1}, LsF5;->b(LZC0;)LpF5;

    move-result-object p1

    return-object p1
.end method
