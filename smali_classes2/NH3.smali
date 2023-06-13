.class public final LNH3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNH3;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LNH3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;)",
            "LNH3;"
        }
    .end annotation

    new-instance v0, LNH3;

    invoke-direct {v0, p0}, LNH3;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LTq4;LOH3;)LKH3;
    .locals 1

    new-instance v0, LKH3;

    invoke-direct {v0, p0, p1}, LKH3;-><init>(LTq4;LOH3;)V

    return-object v0
.end method


# virtual methods
.method public b(LOH3;)LKH3;
    .locals 1

    iget-object v0, p0, LNH3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {v0, p1}, LNH3;->c(LTq4;LOH3;)LKH3;

    move-result-object p1

    return-object p1
.end method
