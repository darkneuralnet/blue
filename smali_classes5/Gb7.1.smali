.class public abstract LGb7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LGb7;

.field public static final b:LGb7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LCb7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LCb7;-><init>(LBb7;)V

    sput-object v0, LGb7;->a:LGb7;

    new-instance v0, LEb7;

    invoke-direct {v0, v1}, LEb7;-><init>(LDb7;)V

    sput-object v0, LGb7;->b:LGb7;

    return-void
.end method

.method public synthetic constructor <init>(LFb7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LGb7;
    .locals 1

    sget-object v0, LGb7;->a:LGb7;

    return-object v0
.end method

.method public static d()LGb7;
    .locals 1

    sget-object v0, LGb7;->b:LGb7;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
