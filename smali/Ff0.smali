.class public final LFf0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/text/SimpleDateFormat;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, LFf0;->a:Ljava/text/SimpleDateFormat;

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/adyen/checkout/core/exception/NoConstructorException;

    invoke-direct {v0}, Lcom/adyen/checkout/core/exception/NoConstructorException;-><init>()V

    throw v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/adyen/checkout/cse/exception/EncryptionException;
        }
    .end annotation

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "binValue"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "generationtime"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1}, LqB1;->c(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p0, LNk0;

    invoke-direct {p0, p1}, LNk0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LNk0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/adyen/checkout/cse/exception/EncryptionException;

    const-string v0, "Failed to created encrypted JSON data."

    invoke-direct {p1, v0, p0}, Lcom/adyen/checkout/cse/exception/EncryptionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static b(LLd6;Ljava/lang/String;)Lcom/adyen/checkout/cse/EncryptedCard;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/adyen/checkout/cse/exception/EncryptionException;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, LLd6;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "number"

    invoke-virtual {p0}, LLd6;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p1}, LqB1;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, LLd6;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LLd6;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v2, "expiryMonth"

    invoke-virtual {p0}, LLd6;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, p1}, LqB1;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "expiryYear"

    invoke-virtual {p0}, LLd6;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, p1}, LqB1;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LLd6;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, LLd6;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    move-object v2, v1

    move-object v3, v2

    :goto_1
    invoke-virtual {p0}, LLd6;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v1, "cvc"

    invoke-virtual {p0}, LLd6;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, p1}, LqB1;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    new-instance p0, Lcom/adyen/checkout/cse/EncryptedCard;

    invoke-direct {p0, v0, v2, v3, v1}, Lcom/adyen/checkout/cse/EncryptedCard;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_3
    new-instance p0, Lcom/adyen/checkout/cse/exception/EncryptionException;

    const-string p1, "Both expiryMonth and expiryYear need to be set for encryption."

    invoke-direct {p0, p1, v1}, Lcom/adyen/checkout/cse/exception/EncryptionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
    :try_end_0
    .catch Lcom/adyen/checkout/cse/exception/EncryptionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    :goto_2
    new-instance p1, Lcom/adyen/checkout/cse/exception/EncryptionException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "No message."

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-direct {p1, v0, p0}, Lcom/adyen/checkout/cse/exception/EncryptionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
