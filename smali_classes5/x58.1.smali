.class public final Lx58;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LT48;

.field public static final b:LT48;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lx58;->c()LT48;

    move-result-object v0

    sput-object v0, Lx58;->a:LT48;

    new-instance v0, Lcom/google/android/gms/internal/clearcut/g;

    invoke-direct {v0}, Lcom/google/android/gms/internal/clearcut/g;-><init>()V

    sput-object v0, Lx58;->b:LT48;

    return-void
.end method

.method public static a()LT48;
    .locals 1

    sget-object v0, Lx58;->a:LT48;

    return-object v0
.end method

.method public static b()LT48;
    .locals 1

    sget-object v0, Lx58;->b:LT48;

    return-object v0
.end method

.method public static c()LT48;
    .locals 3

    :try_start_0
    const-string v0, "com.google.protobuf.NewInstanceSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT48;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
