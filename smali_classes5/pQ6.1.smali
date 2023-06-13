.class public final LpQ6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LmQ6;

.field public static volatile b:LmQ6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LoQ6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LoQ6;-><init>(LnQ6;)V

    sput-object v0, LpQ6;->a:LmQ6;

    sput-object v0, LpQ6;->b:LmQ6;

    return-void
.end method

.method public static a()LmQ6;
    .locals 1

    sget-object v0, LpQ6;->b:LmQ6;

    return-object v0
.end method
