.class public final LMf9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LEf9;

.field public static final b:LEf9;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-string v0, "com.google.protobuf.MapFieldSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEf9;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, LMf9;->a:LEf9;

    new-instance v0, LEf9;

    invoke-direct {v0}, LEf9;-><init>()V

    sput-object v0, LMf9;->b:LEf9;

    return-void
.end method

.method public static a()LEf9;
    .locals 1

    sget-object v0, LMf9;->a:LEf9;

    return-object v0
.end method

.method public static b()LEf9;
    .locals 1

    sget-object v0, LMf9;->b:LEf9;

    return-object v0
.end method
