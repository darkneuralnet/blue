.class public Lyo6;
.super LrN3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LrN3<",
        "Lyo6;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LrN3;-><init>()V

    const-string v0, "venmoAccount"

    iput-object v0, p0, Lyo6;->g:Ljava/lang/String;

    const-string v0, "nonce"

    iput-object v0, p0, Lyo6;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "nonce"

    iget-object v1, p0, Lyo6;->i:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "venmoAccount"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "venmo_accounts"

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "VenmoAccount"

    return-object v0
.end method

.method public l(Ljava/lang/String;)Lyo6;
    .locals 0

    iput-object p1, p0, Lyo6;->i:Ljava/lang/String;

    return-object p0
.end method
