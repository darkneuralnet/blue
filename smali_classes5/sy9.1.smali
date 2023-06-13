.class public final Lsy9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lqx9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lsy9;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lsy9;->a:Ljava/util/logging/Logger;

    new-instance v0, Lqx9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqx9;-><init>(Lrw9;)V

    sput-object v0, Lsy9;->b:Lqx9;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
