.class public final LVe7;
.super LV52$a;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV52$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LV52;
    .locals 4

    iget-object v0, p0, LVe7;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, LgQ7;

    iget-object v2, p0, LVe7;->b:Ljava/lang/Long;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, LgQ7;-><init>(Ljava/lang/String;Ljava/lang/Long;LtC7;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: nonce"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(J)LV52$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LVe7;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LV52$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LVe7;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null nonce"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
