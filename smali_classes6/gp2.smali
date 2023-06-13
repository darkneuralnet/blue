.class public final Lgp2;
.super Lbk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgp2$b;
    }
.end annotation


# instance fields
.field public final a:LG94;


# direct methods
.method public constructor <init>(LG94;LMq5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0}, Lbk2;-><init>()V

    invoke-static {p1, p2}, Lgp2;->b(LG94;LMq5;)V

    iput-object p1, p0, Lgp2;->a:LG94;

    return-void
.end method

.method public static b(LG94;LMq5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    sget-object v0, Lgp2$a;->b:[I

    invoke-virtual {p0}, LG94;->d()Lhk2$c;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LMq5;->b(LMq5;)LMq5;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()LJE3;
    .locals 4

    new-instance v0, Lgp2$b;

    iget-object v1, p0, Lgp2;->a:LG94;

    invoke-virtual {v1}, LG94;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgp2;->a:LG94;

    invoke-virtual {v2}, LG94;->e()LeA3;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lgp2$b;-><init>(Ljava/lang/String;LeA3;Lgp2$a;)V

    return-object v0
.end method
