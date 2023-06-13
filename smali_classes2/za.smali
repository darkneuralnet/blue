.class public final Lza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya;


# instance fields
.field public final a:LAa;


# direct methods
.method public constructor <init>(LAa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza;->a:LAa;

    return-void
.end method

.method public static b(LAa;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAa;",
            ")",
            "LY94<",
            "Lya;",
            ">;"
        }
    .end annotation

    new-instance v0, Lza;

    invoke-direct {v0, p0}, Lza;-><init>(LAa;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Le13;LBa;)Lxa;
    .locals 1

    iget-object v0, p0, Lza;->a:LAa;

    invoke-virtual {v0, p1, p2}, LAa;->b(Le13;LBa;)Lxa;

    move-result-object p1

    return-object p1
.end method
