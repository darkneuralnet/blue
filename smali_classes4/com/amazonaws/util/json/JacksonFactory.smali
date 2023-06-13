.class final Lcom/amazonaws/util/json/JacksonFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amazonaws/util/json/AwsJsonFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazonaws/util/json/JacksonFactory$JacksonWriter;,
        Lcom/amazonaws/util/json/JacksonFactory$JacksonReader;
    }
.end annotation


# instance fields
.field private final factory:Lcom/fasterxml/jackson/core/JsonFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/util/json/JacksonFactory;->factory:Lcom/fasterxml/jackson/core/JsonFactory;

    return-void
.end method

.method public static synthetic access$000(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/amazonaws/util/json/AwsJsonToken;
    .locals 0

    invoke-static {p0}, Lcom/amazonaws/util/json/JacksonFactory;->convert(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/amazonaws/util/json/AwsJsonToken;

    move-result-object p0

    return-object p0
.end method

.method private static convert(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/amazonaws/util/json/AwsJsonToken;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Lcom/amazonaws/util/json/JacksonFactory$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->UNKNOWN:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->VALUE_STRING:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->VALUE_NULL:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->VALUE_NUMBER:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->VALUE_BOOLEAN:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->FIELD_NAME:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->END_OBJECT:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->BEGIN_OBJECT:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->END_ARRAY:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/amazonaws/util/json/AwsJsonToken;->BEGIN_ARRAY:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getJsonReader(Ljava/io/Reader;)Lcom/amazonaws/util/json/AwsJsonReader;
    .locals 2

    new-instance v0, Lcom/amazonaws/util/json/JacksonFactory$JacksonReader;

    iget-object v1, p0, Lcom/amazonaws/util/json/JacksonFactory;->factory:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0, v1, p1}, Lcom/amazonaws/util/json/JacksonFactory$JacksonReader;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;Ljava/io/Reader;)V

    return-object v0
.end method

.method public getJsonWriter(Ljava/io/Writer;)Lcom/amazonaws/util/json/AwsJsonWriter;
    .locals 2

    new-instance v0, Lcom/amazonaws/util/json/JacksonFactory$JacksonWriter;

    iget-object v1, p0, Lcom/amazonaws/util/json/JacksonFactory;->factory:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0, v1, p1}, Lcom/amazonaws/util/json/JacksonFactory$JacksonWriter;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;Ljava/io/Writer;)V

    return-object v0
.end method
