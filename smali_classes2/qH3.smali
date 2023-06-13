.class public final LqH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LpH3;


# instance fields
.field public final a:LrH3;


# direct methods
.method public constructor <init>(LrH3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqH3;->a:LrH3;

    return-void
.end method

.method public static b(LrH3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrH3;",
            ")",
            "LY94<",
            "LpH3;",
            ">;"
        }
    .end annotation

    new-instance v0, LqH3;

    invoke-direct {v0, p0}, LqH3;-><init>(LrH3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LsH3;Le13;)LoH3;
    .locals 1

    iget-object v0, p0, LqH3;->a:LrH3;

    invoke-virtual {v0, p1, p2}, LrH3;->b(LsH3;Le13;)LoH3;

    move-result-object p1

    return-object p1
.end method
