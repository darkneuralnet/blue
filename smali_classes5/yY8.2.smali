.class public abstract LyY8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LyY8;

.field public static final b:LyY8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LMX8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LMX8;-><init>(LCX8;)V

    sput-object v0, LyY8;->a:LyY8;

    new-instance v0, LgY8;

    invoke-direct {v0, v1}, LgY8;-><init>(LWX8;)V

    sput-object v0, LyY8;->b:LyY8;

    return-void
.end method

.method public synthetic constructor <init>(LpY8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LyY8;
    .locals 1

    sget-object v0, LyY8;->a:LyY8;

    return-object v0
.end method

.method public static d()LyY8;
    .locals 1

    sget-object v0, LyY8;->b:LyY8;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
