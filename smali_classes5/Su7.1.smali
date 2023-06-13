.class public abstract LSu7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LSu7;

.field public static final b:LSu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LQu7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQu7;-><init>(LPu7;)V

    sput-object v0, LSu7;->a:LSu7;

    new-instance v0, LRu7;

    invoke-direct {v0, v1}, LRu7;-><init>(LPu7;)V

    sput-object v0, LSu7;->b:LSu7;

    return-void
.end method

.method public synthetic constructor <init>(LPu7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()LSu7;
    .locals 1

    sget-object v0, LSu7;->a:LSu7;

    return-object v0
.end method

.method public static e()LSu7;
    .locals 1

    sget-object v0, LSu7;->b:LSu7;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)Ljava/util/List;
.end method

.method public abstract b(Ljava/lang/Object;J)V
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
