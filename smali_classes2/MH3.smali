.class public final LMH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLH3;


# instance fields
.field public final a:LNH3;


# direct methods
.method public constructor <init>(LNH3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMH3;->a:LNH3;

    return-void
.end method

.method public static b(LNH3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNH3;",
            ")",
            "LY94<",
            "LLH3;",
            ">;"
        }
    .end annotation

    new-instance v0, LMH3;

    invoke-direct {v0, p0}, LMH3;-><init>(LNH3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LOH3;)LKH3;
    .locals 1

    iget-object v0, p0, LMH3;->a:LNH3;

    invoke-virtual {v0, p1}, LNH3;->b(LOH3;)LKH3;

    move-result-object p1

    return-object p1
.end method
