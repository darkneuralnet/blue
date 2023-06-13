.class public final LrH3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
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
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrH3;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LrH3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "LrH3;"
        }
    .end annotation

    new-instance v0, LrH3;

    invoke-direct {v0, p0}, LrH3;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;LsH3;Le13;)LoH3;
    .locals 1

    new-instance v0, LoH3;

    invoke-direct {v0, p0, p1, p2}, LoH3;-><init>(LEa;LsH3;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(LsH3;Le13;)LoH3;
    .locals 1

    iget-object v0, p0, LrH3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0, p1, p2}, LrH3;->c(LEa;LsH3;Le13;)LoH3;

    move-result-object p1

    return-object p1
.end method
