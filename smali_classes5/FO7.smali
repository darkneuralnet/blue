.class public final LFO7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNN7;

.field public static volatile b:LNN7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LpO7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LpO7;-><init>(LcO7;)V

    sput-object v0, LFO7;->a:LNN7;

    sput-object v0, LFO7;->b:LNN7;

    return-void
.end method

.method public static a()LNN7;
    .locals 1

    sget-object v0, LFO7;->b:LNN7;

    return-object v0
.end method
