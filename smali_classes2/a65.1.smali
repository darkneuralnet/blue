.class public final La65;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
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
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La65;->a:LY94;

    return-void
.end method

.method public static a(LY94;)La65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;)",
            "La65;"
        }
    .end annotation

    new-instance v0, La65;

    invoke-direct {v0, p0}, La65;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LYR4;Lb65;)LX55;
    .locals 1

    new-instance v0, LX55;

    invoke-direct {v0, p0, p1}, LX55;-><init>(LYR4;Lb65;)V

    return-object v0
.end method


# virtual methods
.method public b(Lb65;)LX55;
    .locals 1

    iget-object v0, p0, La65;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {v0, p1}, La65;->c(LYR4;Lb65;)LX55;

    move-result-object p1

    return-object p1
.end method
