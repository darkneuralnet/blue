.class public final LAa;
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

    iput-object p1, p0, LAa;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LAa;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "LAa;"
        }
    .end annotation

    new-instance v0, LAa;

    invoke-direct {v0, p0}, LAa;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;Le13;LBa;)Lxa;
    .locals 1

    new-instance v0, Lxa;

    invoke-direct {v0, p0, p1, p2}, Lxa;-><init>(LEa;Le13;LBa;)V

    return-object v0
.end method


# virtual methods
.method public b(Le13;LBa;)Lxa;
    .locals 1

    iget-object v0, p0, LAa;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0, p1, p2}, LAa;->c(LEa;Le13;LBa;)Lxa;

    move-result-object p1

    return-object p1
.end method
