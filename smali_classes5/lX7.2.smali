.class public abstract LlX7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LlX7;

.field public static final b:LlX7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOY7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOY7;-><init>(LAX7;)V

    sput-object v0, LlX7;->a:LlX7;

    new-instance v0, LdZ7;

    invoke-direct {v0, v1}, LdZ7;-><init>(LAX7;)V

    sput-object v0, LlX7;->b:LlX7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LAX7;)V
    .locals 0

    invoke-direct {p0}, LlX7;-><init>()V

    return-void
.end method

.method public static c()LlX7;
    .locals 1

    sget-object v0, LlX7;->a:LlX7;

    return-object v0
.end method

.method public static d()LlX7;
    .locals 1

    sget-object v0, LlX7;->b:LlX7;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation
.end method
