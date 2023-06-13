.class public abstract LHN7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LHN7;

.field public static final b:LHN7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LlO7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LlO7;-><init>(LsN7;)V

    sput-object v0, LHN7;->a:LHN7;

    new-instance v0, LWN7;

    invoke-direct {v0, v1}, LWN7;-><init>(LsN7;)V

    sput-object v0, LHN7;->b:LHN7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LsN7;)V
    .locals 0

    invoke-direct {p0}, LHN7;-><init>()V

    return-void
.end method

.method public static c()LHN7;
    .locals 1

    sget-object v0, LHN7;->a:LHN7;

    return-object v0
.end method

.method public static d()LHN7;
    .locals 1

    sget-object v0, LHN7;->b:LHN7;

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
