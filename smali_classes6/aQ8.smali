.class public final LaQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LEP8;

.field public static final b:LEP8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LaQ8;->c()LEP8;

    move-result-object v0

    sput-object v0, LaQ8;->a:LEP8;

    new-instance v0, LsP8;

    invoke-direct {v0}, LsP8;-><init>()V

    sput-object v0, LaQ8;->b:LEP8;

    return-void
.end method

.method public static a()LEP8;
    .locals 1

    sget-object v0, LaQ8;->a:LEP8;

    return-object v0
.end method

.method public static b()LEP8;
    .locals 1

    sget-object v0, LaQ8;->b:LEP8;

    return-object v0
.end method

.method public static c()LEP8;
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

    check-cast v0, LEP8;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
